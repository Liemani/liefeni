---
created: 2026-06-16
related_template: "[index.md](index.md)"
---

# Index Schema

## Role

Index documents provide a short role description and useful navigation links.

## Relationships

- An index may link to any document type that is useful for the navigation role.

## Frontmatter Fields

### created (required)

Meaning:

- Creation date.

Applicability:

- Use for every index document.

Format:

- `YYYY-MM-DD`

## Body Sections

### <Group> (repeatable)

Behavior:

- Start with a short role description, then group links when that helps readability.
- Choose section names that fit the navigation purpose.
- Link directly to the source documents.
- Mix document types when that makes the grouping useful.

## Conventions

- Start with role, then navigation.
- Group when it improves readability.
- Do not treat an index as a substitute for the source documents.
- Add links only when the grouping is useful.
- Avoid hardcoded object-type buckets.

## Notes

- Index documents are navigation objects with optional grouping.
