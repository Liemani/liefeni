---
created: 2026-06-18
status: Draft
related_template: "[wiki.md](wiki.md)"
---

# Wiki Schema

Wiki documents hold project context, background, and supporting explanation.

## Frontmatter Fields

### created (required)

Meaning:

- Creation date.

Format:

- `YYYY-MM-DD`

### status (optional)

Meaning:

- Lifecycle state of the document.

Allowed values:

- `Draft`
- `Stable`
- `Deprecated`

## Body Sections

### Context (required)

Behavior:

- Describe the background or frame the reader needs.

### Notes (required)

Behavior:

- Capture the details that help preserve context.

## Conventions

- Keep wiki content explanatory, not procedural.
- Prefer useful context over exhaustive detail.
