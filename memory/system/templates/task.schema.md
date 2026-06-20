---
created: 2026-06-16
status: Draft
related_template: "[task.md](task.md)"
---

# Task Schema

## Role

The task is the main execution container in the system.

## Relationships

- `idea` can become a task via `promote_idea_to_task`.
- `decision` can be linked when work leads to a stable choice.

## Frontmatter Fields

### status (required)

Meaning:

- Current state of the task.

Allowed values:

- `Backlog`
- `Now`
- `Done`
- `Canceled`

### created (required)

Meaning:

- Creation date.

Format:

`YYYY-MM-DD`

### canceled (optional)

Meaning:

- Cancellation date.

Condition:

- Only when `status = Canceled`

Format:

`YYYY-MM-DD`

### completed (optional)

Meaning:

- Completion date.

Condition:

- Only when `status = Done`

Format:

`YYYY-MM-DD`

### related_decisions (optional)

Meaning:

- Markdown links to decisions influenced by this task.

Condition:

- When the task leads to or depends on a decision.

Format:

- `"[Decision Title](../decisions/decision_file.md)"`

## Body Sections

### Checklist (required)

Behavior:

- Represent executable actions.
- Progress through checklist states.
- Include a date on each item.

Allowed states:

- `[ ]`
- `[~]`
- `[x]`
- `[-]`

Checklist items should include dates.

### Notes (optional)

Behavior:

- Record extra context, constraints, or reminders.
- Keep it separate from executable checklist items.

## Conventions

- Keep the task narrow enough to execute.
- Put actual execution items in `Checklist`.
- Include dates in checklist items.
