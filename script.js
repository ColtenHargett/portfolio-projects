function setYear() {
  const y = document.getElementById("year");
  if (y) y.textContent = String(new Date().getFullYear());
}

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

function orbMotion() {
  const orb = document.getElementById("orb");
  if (!orb) return;

  const reduce = window.matchMedia("(prefers-reduced-motion: reduce)").matches;
  if (reduce) return;

  let raf = 0;

  function clamp(v, a, b) { return Math.max(a, Math.min(b, v)); }

  window.addEventListener("mousemove", (e) => {
    if (raf) return;
    raf = requestAnimationFrame(() => {
      const r = orb.getBoundingClientRect();
      const cx = r.left + r.width / 2;
      const cy = r.top + r.height / 2;

      const dx = clamp((e.clientX - cx) / r.width, -0.6, 0.6);
      const dy = clamp((e.clientY - cy) / r.height, -0.6, 0.6);

      // Orb tilt
      const rx = (-dy * 14).toFixed(2);
      const ry = (dx * 16).toFixed(2);
      orb.style.transform = `rotateX(${rx}deg) rotateY(${ry}deg) translateY(-2px)`;

      // Sheen position (CSS vars)
      const mx = ((dx + 0.6) / 1.2) * 100;
      const my = ((dy + 0.6) / 1.2) * 100;
      orb.style.setProperty("--mx", `${mx}%`);
      orb.style.setProperty("--my", `${my}%`);

      raf = 0;
    });
  });

  window.addEventListener("mouseleave", () => {
    orb.style.transform = "";
  });
}

function storyScroll() {
  const steps = Array.from(document.querySelectorAll("#storySteps .step"));
  const bar = document.getElementById("progressBar");
  const kicker = document.getElementById("stageKicker");
  const title = document.getElementById("stageTitle");
  const body = document.getElementById("stageBody");
  const stage = document.getElementById("storyStage");

  if (!steps.length || !bar || !kicker || !title || !body || !stage) return;

  const io = new IntersectionObserver((entries) => {
    // Find the most visible step
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

    // Subtle stage “pulse”
    stage.animate(
      [{ transform: "translateY(0px)" }, { transform: "translateY(-2px)" }, { transform: "translateY(0px)" }],
      { duration: 320, easing: "ease-out" }
    );

    // Progress
    const idx = steps.indexOf(el);
    const pct = Math.round(((idx + 1) / steps.length) * 100);
    bar.style.width = `${pct}%`;
  }, {
    threshold: [0.25, 0.5, 0.75]
  });

  steps.forEach(s => io.observe(s));
}

document.addEventListener("DOMContentLoaded", () => {
  setYear();
  mobileMenu();
  orbMotion();
  storyScroll();
});
