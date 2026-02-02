{\rtf1\ansi\ansicpg1252\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 const projects = [\
  \{\
    title: "Project Name",\
    description: "One sentence: what it does and why it matters.",\
    tags: ["Python", "RAG", "ChromaDB"],\
    repo: "https://github.com/your-username/project-repo",\
    demo: "https://your-username.github.io/project-demo",\
    featured: true\
  \},\
  \{\
    title: "Another Project",\
    description: "Short description focused on impact and what you built.",\
    tags: ["Java", "CLI"],\
    repo: "https://github.com/your-username/another-repo",\
    demo: "",\
    featured: false\
  \},\
  \{\
    title: "Website / App",\
    description: "What problem it solves, tools used, and a small outcome.",\
    tags: ["HTML", "CSS", "JavaScript"],\
    repo: "https://github.com/your-username/site-repo",\
    demo: "https://your-username.github.io/site-repo/",\
    featured: false\
  \}\
];\
\
function uniq(arr) \{\
  return [...new Set(arr)];\
\}\
\
function renderProjects(list) \{\
  const grid = document.getElementById("projectGrid");\
  grid.innerHTML = "";\
\
  if (list.length === 0) \{\
    const empty = document.createElement("div");\
    empty.className = "muted";\
    empty.textContent = "No projects match your search.";\
    grid.appendChild(empty);\
    return;\
  \}\
\
  for (const p of list) \{\
    const card = document.createElement("article");\
    card.className = "card";\
\
    const body = document.createElement("div");\
    body.className = "card-body";\
\
    const h3 = document.createElement("h3");\
    h3.textContent = p.title;\
\
    const desc = document.createElement("p");\
    desc.textContent = p.description;\
\
    const pills = document.createElement("div");\
    pills.className = "pills";\
\
    for (const t of p.tags) \{\
      const tag = document.createElement("span");\
      tag.className = "tag";\
      tag.textContent = t;\
      pills.appendChild(tag);\
    \}\
\
    const footer = document.createElement("div");\
    footer.className = "card-footer";\
\
    const links = document.createElement("div");\
    links.className = "links";\
\
    if (p.repo) \{\
      const a = document.createElement("a");\
      a.className = "link";\
      a.href = p.repo;\
      a.target = "_blank";\
      a.rel = "noreferrer";\
      a.textContent = "Repo";\
      links.appendChild(a);\
    \}\
\
    if (p.demo) \{\
      const a = document.createElement("a");\
      a.className = "link";\
      a.href = p.demo;\
      a.target = "_blank";\
      a.rel = "noreferrer";\
      a.textContent = "Live";\
      links.appendChild(a);\
    \}\
\
    footer.appendChild(links);\
\
    body.appendChild(h3);\
    body.appendChild(desc);\
    body.appendChild(pills);\
    body.appendChild(footer);\
\
    card.appendChild(body);\
    grid.appendChild(card);\
  \}\
\}\
\
function setupFilters() \{\
  const search = document.getElementById("projectSearch");\
  const filter = document.getElementById("tagFilter");\
\
  const allTags = uniq(projects.flatMap(p => p.tags)).sort((a, b) => a.localeCompare(b));\
  for (const t of allTags) \{\
    const opt = document.createElement("option");\
    opt.value = t;\
    opt.textContent = t;\
    filter.appendChild(opt);\
  \}\
\
  function apply() \{\
    const q = search.value.trim().toLowerCase();\
    const tag = filter.value;\
\
    const filtered = projects.filter(p => \{\
      const matchesQuery =\
        !q ||\
        p.title.toLowerCase().includes(q) ||\
        p.description.toLowerCase().includes(q) ||\
        p.tags.some(t => t.toLowerCase().includes(q));\
\
      const matchesTag = tag === "all" || p.tags.includes(tag);\
      return matchesQuery && matchesTag;\
    \});\
\
    renderProjects(filtered);\
  \}\
\
  search.addEventListener("input", apply);\
  filter.addEventListener("change", apply);\
\
  apply();\
\}\
\
function setupNav() \{\
  const toggle = document.getElementById("navToggle");\
  const menu = document.getElementById("navMenu");\
  if (!toggle || !menu) return;\
\
  toggle.addEventListener("click", () => \{\
    const isOpen = menu.classList.toggle("open");\
    toggle.setAttribute("aria-expanded", String(isOpen));\
  \});\
\
  // Close menu after clicking a link (mobile)\
  menu.addEventListener("click", (e) => \{\
    const target = e.target;\
    if (target && target.tagName === "A") \{\
      menu.classList.remove("open");\
      toggle.setAttribute("aria-expanded", "false");\
    \}\
  \});\
\}\
\
function setupContactForm() \{\
  const form = document.getElementById("contactForm");\
  if (!form) return;\
\
  form.addEventListener("submit", (e) => \{\
    e.preventDefault();\
    const data = new FormData(form);\
    const name = String(data.get("name") || "").trim();\
    const email = String(data.get("email") || "").trim();\
    const message = String(data.get("message") || "").trim();\
\
    const subject = encodeURIComponent(`Portfolio message from $\{name\}`);\
    const body = encodeURIComponent(`Name: $\{name\}\\nEmail: $\{email\}\\n\\n$\{message\}`);\
    window.location.href = `mailto:you@email.com?subject=$\{subject\}&body=$\{body\}`;\
  \});\
\}\
\
function init() \{\
  document.getElementById("year").textContent = String(new Date().getFullYear());\
  setupNav();\
  setupFilters();\
  setupContactForm();\
\}\
\
document.addEventListener("DOMContentLoaded", init);}