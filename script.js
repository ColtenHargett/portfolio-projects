<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <meta name="color-scheme" content="dark" />
  <title>Colten Hargett | Portfolio</title>
  <meta name="description" content="Colten Hargett — programming & AI projects." />

  <!-- Use ./ for GitHub Pages reliability -->
  <link rel="stylesheet" href="./styles.css?v=1" />
</head>

<body>
  <a class="skip-link" href="#main">Skip to content</a>

  <header class="site-header">
    <div class="container header-inner">
      <a class="brand" href="#top" aria-label="Home">
        <span class="brand-mark" aria-hidden="true"></span>
        <span class="brand-text">Colten Hargett</span>
      </a>

      <nav class="nav" aria-label="Primary">
        <button class="nav-toggle" id="navToggle" aria-expanded="false" aria-controls="navMenu">
          Menu
        </button>
        <ul class="nav-menu" id="navMenu">
          <li><a href="#projects">Projects</a></li>
          <li><a href="#about">About</a></li>
          <li><a class="btn btn-small" href="#contact">Contact</a></li>
        </ul>
      </nav>
    </div>
  </header>

  <main id="main">
    <section class="hero" id="top">
      <div class="container hero-inner">
        <div class="hero-copy">
          <p class="eyebrow">Portfolio</p>
          <h1 class="headline">Programming and AI projects, built with care.</h1>
          <p class="subhead">
            A curated set of work across automation, data-driven tools, and lightweight intelligent systems.
          </p>

          <div class="hero-actions">
            <a class="btn" href="#projects">View projects</a>
            <a class="btn btn-ghost" href="#contact">Contact</a>
          </div>

          <div class="hero-meta">
            <a href="mailto:coltenhargett@gmail.com">coltenhargett@gmail.com</a>
            <span class="dot" aria-hidden="true"></span>
            <a href="https://www.linkedin.com/in/colten-hargett" target="_blank" rel="noreferrer">LinkedIn</a>
            <span class="dot" aria-hidden="true"></span>
            <a href="./resume.pdf" target="_blank" rel="noreferrer">Resume</a>
          </div>
        </div>

        <aside class="hero-card" aria-label="Featured project">
          <div class="hero-card-inner">
            <p class="card-title">Featured</p>
            <p class="card-text" id="featuredText">
              Add at least one project in script.js and I’ll feature it here automatically.
            </p>
            <div class="card-tags" id="featuredTags" aria-label="Featured tags"></div>
            <a class="card-link" id="featuredLink" href="#projects">See all projects →</a>
          </div>
        </aside>
      </div>
    </section>

    <section class="section" id="projects">
      <div class="container">
        <div class="section-head">
          <h2>Projects</h2>
          <p class="muted">
            You can keep code private and still show what you built: problem, approach, outcome.
          </p>
        </div>

        <div class="toolbar">
          <label class="search">
            <span class="sr-only">Search projects</span>
            <input id="projectSearch" type="search" placeholder="Search projects…" autocomplete="off" />
          </label>

          <label class="filter">
            <span class="sr-only">Filter by tag</span>
            <select id="tagFilter">
              <option value="all">All tags</option>
            </select>
          </label>
        </div>

        <div class="grid" id="projectGrid" aria-live="polite"></div>

        <p class="muted footnote">
          Tip: Want to protect coursework? Keep repos private and set “Code” to “Available on request.”
        </p>
      </div>
    </section>

    <section class="section" id="about">
      <div class="container">
        <div class="section-head">
          <h2>About</h2>
          <p class="muted">A short snapshot, focused on the work.</p>
        </div>

        <div class="about">
          <div class="about-card">
            <h3>Focus</h3>
            <p>
              I’m a Computer Science and Data Science student at Loyola University Maryland, and I like building software
              that feels clean, fast, and useful. I’m especially interested in AI-powered tools that solve real problems
              without feeling overcomplicated.  [oai_citation:1‡Colten Hargett Resume.pdf](sediment://file_00000000ff04722faab3238d3ce3e6c7)
            </p>
          </div>

          <div class="about-card">
            <h3>How I work</h3>
            <p>
              I value clarity: readable code, thoughtful UX, and projects that are easy to run and easy to understand.
              I prefer shipping something solid over adding features that don’t matter.
            </p>
          </div>

          <div class="about-card">
            <h3>Leadership</h3>
            <p>
              I’ve led teams in high-responsibility environments, training new staff, improving workflows, and handling
              real-world issues calmly and consistently.  [oai_citation:2‡Colten Hargett Resume.pdf](sediment://file_00000000ff04722faab3238d3ce3e6c7)
            </p>
          </div>
        </div>
      </div>
    </section>

    <section class="section" id="contact">
      <div class="container">
        <div class="section-head">
          <h2>Contact</h2>
          <p class="muted">Quickest way to reach me.</p>
        </div>

        <div class="contact">
          <div class="contact-card">
            <h3>Email</h3>
            <p class="muted">Send a note and I’ll respond as soon as I can.</p>
            <a class="btn" href="mailto:coltenhargett@gmail.com">coltenhargett@gmail.com</a>

            <div class="callout">
              <p class="callout-title">Optional</p>
              <p class="muted">
                If you want a real form (not mailto), I can wire this to Formspree/Netlify Forms.
              </p>
            </div>
          </div>

          <div class="contact-card">
            <h3>Links</h3>
            <ul class="link-list">
              <li><a href="https://www.linkedin.com/in/colten-hargett" target="_blank" rel="noreferrer">LinkedIn</a></li>
              <li><a href="./resume.pdf" target="_blank" rel="noreferrer">Resume</a></li>
              <li><a href="mailto:coltenhargett@gmail.com">coltenhargett@gmail.com</a></li>
            </ul>
          </div>
        </div>
      </div>
    </section>
  </main>

  <footer class="site-footer">
    <div class="container footer-inner">
      <p class="muted">© <span id="year"></span> Colten Hargett</p>
      <a class="muted" href="#top">Back to top</a>
    </div>
  </footer>

  <div class="modal-backdrop" id="modalBackdrop" hidden></div>
  <div class="modal" id="modal" role="dialog" aria-modal="true" aria-labelledby="modalTitle" hidden>
    <div class="modal-inner">
      <div class="modal-head">
        <h3 id="modalTitle">Project</h3>
        <button class="icon-btn" id="modalClose" aria-label="Close">×</button>
      </div>
      <p class="muted" id="modalDesc"></p>
      <div class="modal-tags" id="modalTags"></div>
      <ul class="modal-bullets" id="modalBullets"></ul>
      <div class="modal-actions" id="modalActions"></div>
    </div>
  </div>

  <script src="./script.js?v=1" defer></script>
</body>
</html>
