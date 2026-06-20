---
created: 2026-06-16
related_template: "[schema.md](schema.md)"
---

# Schema Schema

## Role

Schema documents define how object templates should be written and interpreted.

## Relationships

- `schema.md` is the reusable template for schema documents.
- Object-specific schema files describe the fields and body sections of their related templates.
- Protocols may reference schema-defined fields when describing state transitions.

## Frontmatter Fields

### created (required)

Meaning:

- Creation date.

Applicability:

- Use for schema documents that need creation traceability.

Format:

- `YYYY-MM-DD`

### related_template (required)

Meaning:

- The template this schema describes.

Applicability:

- Use on schema documents tied to a specific template.

Format:

- Relative link to the related template file.

### status (optional)

Meaning:

- Lifecycle state of the schema document.

Applicability:

- Use when the schema itself needs to track review or maturity.

Allowed values:

- `Draft`
- `Stable`
- `Deprecated`

## Body Sections

### Role (required)

Behavior:

- Describe the responsibility of the related template.

### Relationships (required)

Behavior:

- Describe how the schema relates to related templates, protocols, or other objects.

### Frontmatter Fields (required)

Behavior:

- Define the frontmatter fields that belong to the related template.
- Keep the definitions explicit and object-specific.

### Body Sections (required)

Behavior:

- Define the markdown body sections that belong to the related template.
- Describe how each section should be used.

### Conventions (optional)

Behavior:

- State writing conventions that make the schema easier to use consistently.

### Notes (optional)

Behavior:

- Record additional considerations, cautions, or implementation notes.

## Conventions

- Keep the schema specific to the related template.
- Do not treat this file as inherited defaults for every object.
- `created`, `related_template`, and `status` are common schema-document fields, not automatic object fields.

## Notes

- Schema documents are templates for writing schema documents.
