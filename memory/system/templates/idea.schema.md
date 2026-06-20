---
created: 2026-06-16
status: Draft
related_template: "[idea.md](idea.md)"
---

# Idea Schema

## Role

Ideas bridge early thought and later execution.

## Relationships

- `thought` can lead into an idea when an unstructured observation becomes more concrete.

## Frontmatter Fields

### status (required)

Meaning:

- Current state of the idea record.

Allowed values:

- `Open`
- `Promoted`
- `Dropped`

### created (required)

Meaning:

- Creation date.

Format:

`YYYY-MM-DD`

## Body Sections

### Notes (required)

Behavior:

- Record the idea itself.
- Keep enough context to judge whether it should become a task later.
- Do not force execution before it is ready.

## Conventions

- Keep the idea specific enough to discuss, but not forced into execution too early.
- Use a task only when the idea is ready to be worked on.
