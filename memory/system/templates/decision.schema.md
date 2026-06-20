---
created: 2026-06-16
status: Draft
related_template: "[decision.md](decision.md)"
---

# Decision Schema

## Role

Decisions capture the stable outcome of reasoning so later work can follow the chosen direction.

## Frontmatter Fields

### created (required)

Meaning:

- Creation date.

Format:

`YYYY-MM-DD`

## Body Sections

### 결정 (required)

Behavior:

- State what was decided.
- Keep the decision separate from the reasoning.

### 이유 (required)

Behavior:

- Record the evidence, reasoning, or comparison that led to the decision.
- Keep it separate from the decision itself.

### 영향 (optional)

Behavior:

- Describe what changes because of this decision.
- Record downstream consequences or constraints.

## Conventions

- State the decision plainly in the `결정` section.
- Keep the reason and impact separate from the decision itself.

## Notes

- Do not turn this into a generic analysis note.
