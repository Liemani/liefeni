---
source: [Type.java](../../../../../../src/haven/render/sl/Type.java)
created: 2026-06-13
updated: 2026-06-20
---

# Type

Represents a shader-language type name and hooks for context-dependent registration.

## Nested Types

### Simple
Plain GLSL type name.

#### Members

##### Fields

#### `private final String name`
- Role: Stores the GLSL spelling.
- Description: Returned unchanged for the type name.

##### Methods

#### `private Simple(String name)`
- Role: Builds a simple type wrapper.
- Description: Stores the literal GLSL type name.

#### `public String name(Context ctx)`
- Role: Returns the GLSL spelling.
- Description: Simple types do not depend on context.

#### `public String toString()`
- Role: Returns a debug string.
- Description: Shows the literal type name.

### Sampler
Sampler type wrapper built on top of `Simple`.

#### Members

##### Methods

#### `private Sampler(String name)`
- Role: Builds a sampler type wrapper.
- Description: Reuses the plain type implementation with a sampler name.

## Members

### Constants

#### `public static final Type VOID = new Simple("void")`
- Role: GLSL `void`.
- Value: `new Simple("void")`

#### `public static final Type INT = new Simple("int")`
- Role: GLSL `int`.
- Value: `new Simple("int")`

#### `public static final Type UINT = new Simple("uint")`
- Role: GLSL `uint`.
- Value: `new Simple("uint")`

#### `public static final Type FLOAT = new Simple("float")`
- Role: GLSL `float`.
- Value: `new Simple("float")`

#### `public static final Type VEC2 = new Simple("vec2")`
- Role: GLSL `vec2`.
- Value: `new Simple("vec2")`

#### `public static final Type VEC3 = new Simple("vec3")`
- Role: GLSL `vec3`.
- Value: `new Simple("vec3")`

#### `public static final Type VEC4 = new Simple("vec4")`
- Role: GLSL `vec4`.
- Value: `new Simple("vec4")`

#### `public static final Type MAT3 = new Simple("mat3")`
- Role: GLSL `mat3`.
- Value: `new Simple("mat3")`

#### `public static final Type MAT4 = new Simple("mat4")`
- Role: GLSL `mat4`.
- Value: `new Simple("mat4")`

### Methods

#### `public abstract String name(Context ctx)`
- Role: Returns the GLSL spelling of the type in the current context.

#### `public void use(Context ctx)`
- Role: Gives the type a chance to register context dependencies.