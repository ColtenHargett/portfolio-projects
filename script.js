function setYear() {
  const y = document.getElementById("year");
  if (y) y.textContent = String(new Date().getFullYear());
}

function clamp(v, a, b) { return Math.max(a, Math.min(b, v)); }

function mobileMenu() {
  const btn = document.getElementById("menuBtn");
  const menu = document.getElementById("mobileMenu");
  if (!btn || !menu) return;

  btn.addEventListener("click", () => {
    const open = menu.hasAttribute("hidden");
    if (open) menu.removeAttribute("hidden");
    else menu.setAttribute("hidden", "");
    btn.setAttribute("aria-expanded", String(open));
  });

  menu.addEventListener("click", (e) => {
    const t = e.target;
    if (t && t.classList && t.classList.contains("m-link")) {
      menu.setAttribute("hidden", "");
      btn.setAttribute("aria-expanded", "false");
    }
  });
}

function spotlight() {
  const el = document.getElementById("spotlight");
  if (!el) return;

  let raf = 0;
  window.addEventListener("mousemove", (e) => {
    if (raf) return;
    raf = requestAnimationFrame(() => {
      const x = (e.clientX / window.innerWidth) * 100;
      const y = (e.clientY / window.innerHeight) * 100;
      el.style.setProperty("--x", `${x}%`);
      el.style.setProperty("--y", `${y}%`);
      raf = 0;
    });
  });
}

function topProgress() {
  const bar = document.getElementById("topProgress");
  if (!bar) return;

  function tick() {
    const scrollTop = window.scrollY || document.documentElement.scrollTop;
    const docH = document.documentElement.scrollHeight - window.innerHeight;
    const p = docH > 0 ? clamp(scrollTop / docH, 0, 1) : 0;
    bar.style.width = `${Math.round(p * 100)}%`;
  }

  window.addEventListener("scroll", tick, { passive: true });
  window.addEventListener("resize", tick);
  tick();
}

function revealOnScroll() {
  const items = Array.from(document.querySelectorAll(".reveal"));
  if (!items.length) return;

  const io = new IntersectionObserver((entries) => {
    for (const ent of entries) {
      if (ent.isIntersecting) {
        ent.target.classList.add("in");
        io.unobserve(ent.target);
      }
    }
  }, { threshold: 0.12 });

  items.forEach(n => io.observe(n));
}

function orbMotion() {
  const orb = document.getElementById("orb");
  if (!orb) return;

  const reduce = window.matchMedia("(prefers-reduced-motion: reduce)").matches;
  if (reduce) return;

  let raf = 0;

  window.addEventListener("mousemove", (e) => {
    if (raf) return;
    raf = requestAnimationFrame(() => {
      const r = orb.getBoundingClientRect();
      const cx = r.left + r.width / 2;
      const cy = r.top + r.height / 2;

      const dx = clamp((e.clientX - cx) / r.width, -0.65, 0.65);
      const dy = clamp((e.clientY - cy) / r.height, -0.65, 0.65);

      const rx = (-dy * 14).toFixed(2);
      const ry = (dx * 16).toFixed(2);
      orb.style.transform = `rotateX(${rx}deg) rotateY(${ry}deg) translateY(-2px)`;

      const mx = ((dx + 0.65) / 1.3) * 100;
      const my = ((dy + 0.65) / 1.3) * 100;
      orb.style.setProperty("--mx", `${mx}%`);
      orb.style.setProperty("--my", `${my}%`);

      raf = 0;
    });
  });

  window.addEventListener("mouseleave", () => {
    orb.style.transform = "";
  });
}

function tiltCards() {
  const cards = document.querySelectorAll(".tilt");
  if (!cards.length) return;

  const reduce = window.matchMedia("(prefers-reduced-motion: reduce)").matches;
  if (reduce) return;

  function onMove(e) {
    const card = e.currentTarget;
    const r = card.getBoundingClientRect();
    const x = (e.clientX - r.left) / r.width;
    const y = (e.clientY - r.top) / r.height;
    const rx = (0.5 - y) * 6;
    const ry = (x - 0.5) * 8;
    card.style.transform = `rotateX(${rx}deg) rotateY(${ry}deg) translateY(-2px)`;
  }

  function onLeave(e) {
    e.currentTarget.style.transform = "";
  }

  cards.forEach(c => {
    c.addEventListener("mousemove", onMove);
    c.addEventListener("mouseleave", onLeave);
  });
}

function magneticButtons() {
  const els = document.querySelectorAll(".mag");
  if (!els.length) return;

  const reduce = window.matchMedia("(prefers-reduced-motion: reduce)").matches;
  if (reduce) return;

  els.forEach(el => {
    let raf = 0;
    el.addEventListener("mousemove", (e) => {
      if (raf) return;
      raf = requestAnimationFrame(() => {
        const r = el.getBoundingClientRect();
        const x = e.clientX - (r.left + r.width / 2);
        const y = e.clientY - (r.top + r.height / 2);
        const mx = (x / r.width) * 10;
        const my = (y / r.height) * 10;
        el.style.transform = `translate(${mx}px, ${my}px)`;
        raf = 0;
      });
    });
    el.addEventListener("mouseleave", () => {
      el.style.transform = "";
    });
  });
}

/**
 * Fix: Approach cycling early
 * Gate updates until the steps container is actually visible.
 */
function storyScroll() {
  const stepsWrap = document.getElementById("storySteps");
  const steps = Array.from(document.querySelectorAll("#storySteps .step"));
  const bar = document.getElementById("progressBar");
  const kicker = document.getElementById("stageKicker");
  const title = document.getElementById("stageTitle");
  const body = document.getElementById("stageBody");
  const stage = document.getElementById("storyStage");

  if (!stepsWrap || !steps.length || !bar || !kicker || !title || !body || !stage) return;

  let allowed = false;

  // First: allow updates only when the steps wrapper is visible
  const gate = new IntersectionObserver((entries) => {
    for (const ent of entries) {
      if (ent.target === stepsWrap) {
        allowed = ent.isIntersecting;
      }
    }
  }, { threshold: 0.15 });

  gate.observe(stepsWrap);

  // Second: update based on the most visible step, but only when allowed === true
  const io = new IntersectionObserver((entries) => {
    if (!allowed) return;

    let best = null;
    for (const ent of entries) {
      if (!ent.isIntersecting) continue;
      if (!best || ent.intersectionRatio > best.intersectionRatio) best = ent;
    }
    if (!best) return;

    const el = best.target;

    kicker.textContent = el.dataset.kicker || "Approach";
    title.textContent = el.dataset.title || "—";
    body.textContent = el.dataset.body || "—";

    const idx = steps.indexOf(el);
    const pct = Math.round(((idx + 1) / steps.length) * 100);
    bar.style.width = `${pct}%`;

    stage.animate(
      [{ transform: "translateY(0px)" }, { transform: "translateY(-2px)" }, { transform: "translateY(0px)" }],
      { duration: 300, easing: "ease-out" }
    );
  }, { threshold: [0.30, 0.50, 0.70] });

  steps.forEach(s => io.observe(s));
}

/**
 * Folder behavior:
 * - smooth open/close animation (details height)
 * - open folder if URL hash matches
 */
function folderUX() {
  const folders = Array.from(document.querySelectorAll("details.folder"));
  if (!folders.length) return;

  // smooth animation for <details>
  folders.forEach((d) => {
    const summary = d.querySelector("summary");
    const body = d.querySelector(".folder-body");
    if (!summary || !body) return;

    d.style.overflow = "hidden";

    summary.addEventListener("click", (e) => {
      // Let the default toggle happen, then animate
      const willOpen = !d.open;

      // If opening, set explicit height: summary + body
      // If closing, set explicit height: summary only
      requestAnimationFrame(() => {
        const startH = d.getBoundingClientRect().height;

        if (willOpen) {
          d.open = true; // ensure open so body has height
          const endH = summary.getBoundingClientRect().height + body.getBoundingClientRect().height;
          d.animate(
            [{ height: `${startH}px` }, { height: `${endH}px` }],
            { duration: 260, easing: "ease-out" }
          ).onfinish = () => { d.style.height = ""; };
        } else {
          const endH = summary.getBoundingClientRect().height;
          d.animate(
            [{ height: `${startH}px` }, { height: `${endH}px` }],
            { duration: 220, easing: "ease-out" }
          ).onfinish = () => {
            d.open = false;
            d.style.height = "";
          };

          // prevent instant close so animation can run
          e.preventDefault();
        }
      });
    });
  });

  // Open folder via hash
  function openFromHash() {
    const id = location.hash.replace("#", "");
    if (!id) return;
    const el = document.getElementById(id);
    if (el && el.tagName === "DETAILS") {
      el.open = true;
      el.scrollIntoView({ behavior: "smooth", block: "start" });
    }
  }

  window.addEventListener("hashchange", openFromHash);
  openFromHash();
}

document.addEventListener("DOMContentLoaded", () => {
  setYear();
  mobileMenu();
  spotlight();
  topProgress();
  revealOnScroll();
  orbMotion();
  tiltCards();
  magneticButtons();
  storyScroll();
  folderUX();
});
