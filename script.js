const PROJECTS = [
  {
    title: "Intelligent Course Planner",
    short: "A planning tool that helps map requirements into a clean, usable graduation path.",
    details:
      "Built a lightweight planner that converts program requirements into a structured plan, emphasizing clarity and real-world usability.",
    tags: ["Python", "Data", "Automation"],
    bullets: [
      "Transforms requirement rules into a structured plan",
      "Designed for quick edits and clear output",
      "Built to be extendable for different programs"
    ],
    links: [
      // Keep private: use type "request" instead of repo/demo
      { type: "request", label: "Code available on request", href: "mailto:coltenhargett@gmail.com?subject=Code%20Request" }
    ],
    featured: true
  },
  {
    title: "Market Tracker Prototype",
    short: "Tracks symbols and surfaces changes with a clean, minimal interface.",
    details:
      "A small prototype focused on reliable data fetching, defensive parsing, and simple summaries.",
    tags: ["Python", "APIs"],
    bullets: [
      "Reliable fetching and parsing pipeline",
      "Clear summaries built for quick scanning",
      "Designed for future AI-assisted insights"
    ],
    links: [
      { type: "request", label: "Code available on request", href: "mailto:coltenhargett@gmail.com?subject=Code%20Request" }
    ]
  },
  {
    title: "Modern Web Showcase",
    short: "A minimalist site template optimized for readability and polish.",
    details:
      "A clean, responsive layout with filtering and a focused visual style (inspired by editorial/photo-essay design).",
    tags: ["HTML", "CSS", "JavaScript"],
    bullets: [
      "Fast, responsive layout",
      "Project filtering + search",
      "Subtle motion and modal details"
    ],
    links: [
      // Example demo link. Replace or remove.
      { type: "demo", label: "Live", href: "#" }
    ]
  }
];

// Utilities
function uniq(arr) {
  return [...new Set(arr)];
}

function el(tag, className, text) {
  const node = document.createElement(tag);
  if (className) node.className = className;
  if (typeof text === "string") node.textContent = text;
  return node;
}

// Modal
const modal = {
  backdrop: null,
  root: null,
  title: null,
  desc: null,
  tags: null,
  bullets: null,
  actions: null,
  closeBtn: null
};

function openModal(project) {
  modal.title.textContent = project.title;
  modal.desc.textContent = project.details || project.short;

  modal.tags.innerHTML = "";
  (project.tags || []).forEach(t => modal.tags.appendChild(el("span", "tag", t)));

  modal.bullets.innerHTML = "";
  (project.bullets || []).forEach(b => {
    const li = document.createElement("li");
    li.textContent = b;
    modal.bullets.appendChild(li);
  });

  modal.actions.innerHTML = "";
  (project.links || []).forEach(l => {
    const a = el("a", "link", l.label);
    a.href = l.href;
    if (l.type === "demo" || l.type === "repo") {
      a.target = "_blank";
      a.rel = "noreferrer";
    }
    modal.actions.appendChild(a);
  });

  modal.backdrop.hidden = false;
  modal.root.hidden = false;
  document.body.style.overflow = "hidden";
}

function closeModal() {
  modal.backdrop.hidden = true;
  modal.root.hidden = true;
  document.body.style.overflow = "";
}

// Render
function renderProjects(list) {
  const grid = document.getElementById("projectGrid");
  grid.innerHTML = "";

  if (!list.length) {
    grid.appendChild(el("p", "muted", "No projects match your search."));
    return;
  }

  for (const p of list) {
    const card = el("article", "card");
    const body = el("div", "card-body");

    const title = el("h3", null, p.title);
    const desc = el("p", null, p.short);

    const tagWrap = el("div", "card-tags");
    (p.tags || []).slice(0, 4).forEach(t => tagWrap.appendChild(el("span", "tag", t)));

    const footer = el("div", "card-footer");
    const links = el("div", "links");

    // Small "Details" button that opens modal (doesn't expose code)
    const detailsBtn = el("button", "link muted-link", "Details");
    detailsBtn.type = "button";
    detailsBtn.addEventListener("click", () => openModal(p));
    links.appendChild(detailsBtn);

    // Optional quick link (demo/repo/request)
    const primary = (p.links || [])[0];
    if (primary) {
      const a = el("a", "link", primary.label);
      a.href = primary.href;
      if (primary.type === "demo" || primary.type === "repo") {
        a.target = "_blank";
        a.rel = "noreferrer";
      }
      links.appendChild(a);
    }

    footer.appendChild(links);

    body.appendChild(title);
    body.appendChild(desc);
    body.appendChild(tagWrap);
    body.appendChild(footer);

    card.appendChild(body);
    grid.appendChild(card);
  }
}

function setupFilters() {
  const search = document.getElementById("projectSearch");
  const filter = document.getElementById("tagFilter");

  const allTags = uniq(PROJECTS.flatMap(p => p.tags || [])).sort((a, b) => a.localeCompare(b));
  allTags.forEach(t => {
    const opt = document.createElement("option");
    opt.value = t;
    opt.textContent = t;
    filter.appendChild(opt);
  });

  function apply() {
    const q = search.value.trim().toLowerCase();
    const tag = filter.value;

    const filtered = PROJECTS.filter(p => {
      const matchesQuery =
        !q ||
        p.title.toLowerCase().includes(q) ||
        (p.short || "").toLowerCase().includes(q) ||
        (p.details || "").toLowerCase().includes(q) ||
        (p.tags || []).some(t => t.toLowerCase().includes(q));

      const matchesTag = tag === "all" || (p.tags || []).includes(tag);
      return matchesQuery && matchesTag;
    });

    renderProjects(filtered);
  }

  search.addEventListener("input", apply);
  filter.addEventListener("change", apply);
  apply();
}

function setupNav() {
  const toggle = document.getElementById("navToggle");
  const menu = document.getElementById("navMenu");
  if (!toggle || !menu) return;

  toggle.addEventListener("click", () => {
    const isOpen = menu.classList.toggle("open");
    toggle.setAttribute("aria-expanded", String(isOpen));
  });

  menu.addEventListener("click", (e) => {
    const t = e.target;
    if (t && t.tagName === "A") {
      menu.classList.remove("open");
      toggle.setAttribute("aria-expanded", "false");
    }
  });
}

function setupModal() {
  modal.backdrop = document.getElementById("modalBackdrop");
  modal.root = document.getElementById("modal");
  modal.title = document.getElementById("modalTitle");
  modal.desc = document.getElementById("modalDesc");
  modal.tags = document.getElementById("modalTags");
  modal.bullets = document.getElementById("modalBullets");
  modal.actions = document.getElementById("modalActions");
  modal.closeBtn = document.getElementById("modalClose");

  modal.backdrop.addEventListener("click", closeModal);
  modal.closeBtn.addEventListener("click", closeModal);

  document.addEventListener("keydown", (e) => {
    if (e.key === "Escape" && !modal.root.hidden) closeModal();
  });
}

function setupFeatured() {
  const featured = PROJECTS.find(p => p.featured) || PROJECTS[0];
  if (!featured) return;

  const text = document.getElementById("featuredText");
  const tags = document.getElementById("featuredTags");
  const link = document.getElementById("featuredLink");

  text.textContent = featured.short;

  tags.innerHTML = "";
  (featured.tags || []).slice(0, 3).forEach(t => tags.appendChild(el("span", "tag", t)));

  link.href = "#projects";
}

function init() {
  document.getElementById("year").textContent = String(new Date().getFullYear());
  setupNav();
  setupModal();
  setupFeatured();
  setupFilters();
}

document.addEventListener("DOMContentLoaded", init);
