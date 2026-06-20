---
created: 2026-06-20
related_template: "[doc.md](doc.md)"
status: Draft
---

# Doc Schema

## Role

Doc documents describe one source file in terms of responsibility, nested types, and member-level meaning.

## Relationships

- A doc document maps to one `src/.../*.java` source file.
- Directory-level navigation is handled by `index` documents, not by this schema.

## Frontmatter Fields

### source (required)

Meaning:

- The source file this document describes.

Format:

- Markdown link to a file under `src/...`

### created (required)

Meaning:

- Creation date of the document.

Format:

- `YYYY-MM-DD`

### updated (required)

Meaning:

- Last revision date of the document.

Format:

- `YYYY-MM-DD`

## Body Sections

### File Title (required)

Behavior:

- Use the source type name as the H1 title.

### Role (required)

Behavior:

- Explain the file's responsibility in one short paragraph.

### Nested Types (optional)

Behavior:

- Describe nested types only when the source file actually defines them.
- Give each nested type a short role and brief explanation.

### Members (required)

Behavior:

- Group members by `Constants`, `Fields`, and `Methods`.
- Describe each member with its signature, role, and description.
- Skip empty groups only when the source file truly has no members in that category.

## Conventions

- Keep the source link stable and direct.
- Use exact member signatures as they appear in code.
- Write role first, then explanation.
- Do not invent members or nested types that do not exist in source.

## Notes

- This schema applies to file-level docs only.
