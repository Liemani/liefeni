---
source: [Ortho2D.java](../../../../../src/haven/render/Ortho2D.java)
created: 2026-06-13
updated: 2026-06-14
---

# Ortho2D

Applies a 2D orthographic projection to the render pipe.

## Members

### Constants

#### `public static final Attribute pos = new Attribute(VEC2, "opos2d").primary()`
- Role: Names the 2D orthographic position attribute.
- Description: Supplies 2D object-space positions to the vertex shader.
- Value: `new Attribute(VEC2, "opos2d").primary()`

#### `private static final Uniform kv = new Uniform(VEC2, "k2d", p -> ((Ortho2D)p.get(States.vxf)).k, States.vxf)`
- Role: Exposes the orthographic scale vector.
- Description: Converts world coordinates into clip-space scale.
- Value: `new Uniform(VEC2, "k2d", p -> ((Ortho2D)p.get(States.vxf)).k, States.vxf)`

#### `private static final Uniform mv = new Uniform(VEC2, "m2d", p -> ((Ortho2D)p.get(States.vxf)).m, States.vxf)`
- Role: Exposes the orthographic offset vector.
- Description: Converts world coordinates into clip-space translation.
- Value: `new Uniform(VEC2, "m2d", p -> ((Ortho2D)p.get(States.vxf)).m, States.vxf)`

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the orthographic transform shader hook.
- Description: Applies the 2D projection matrix in the vertex stage.
- Value: `prog ->`

### Fields

#### `public final float l, u, r, b`
- Role: Stores the left, top, right, and bottom bounds.
- Description: Defines the orthographic rectangle in 2D space.

#### `public final float l, u, r, b`
- Role: Caches the b value.
- Description: Caches the `b` value for reuse.

#### `public final float l, u, r, b`
- Role: Caches the b value.
- Description: Caches the `b` value for reuse.

#### `public final float l, u, r, b`
- Role: Caches the b value.
- Description: Caches the `b` value for reuse.

#### `private final float[] k, m`
- Role: Stores the orthographic scale and translation vectors.
- Description: Derived from the rectangle bounds and used by the shader.

#### `private final float[] k, m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

### Methods

#### `public Ortho2D(float l, float u, float r, float b)`
- Role: Creates a new Ortho2D instance.
- Description: Constructs the Ortho2D instance from the supplied inputs.

#### `public Ortho2D(Area area)`
- Role: Creates a new Ortho2D instance.
- Description: Constructs the Ortho2D instance from the supplied inputs.

#### `public ShaderMacro shader()`
- Role: Returns the orthographic shader macro.
- Description: Produces the vertex-stage transform for 2D rendering.

#### `public void apply(Pipe p)`
- Role: Installs the orthographic transform into the pipe.
- Description: Makes the 2D projection available to the current draw call.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Ortho2D for debugging and logging.
