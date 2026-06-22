---
source: [Attribute.java](../../../../../../src/haven/render/sl/Attribute.java)
created: 2026-06-13
updated: 2026-06-20
---

# Attribute

Represents a vertex attribute in shader language, with optional primary ordering for location 0.

## Members

### Fields

#### `public boolean primary = false`
- Role: Marks the primary vertex attribute.
- Description: Requests location 0 when the shader context assigns locations.

### Methods

#### `public Attribute(Type type, Symbol name)` / overloads
- Role: Creates a typed attribute.
- Description: Stores the attribute type and symbol for shader registration.

#### `public Attribute primary()`
- Role: Marks the attribute as primary.
- Description: Requests primary placement when attribute locations are assigned.

#### `public void use(Context ctx)`
- Role: Registers the attribute in a vertex context.
- Description: Adds the attribute to the current shader context.