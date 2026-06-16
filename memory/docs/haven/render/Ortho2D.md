# Ortho2D

This file documents the responsibilities and members of `Ortho2D`.

## Meta

- Source: [Ortho2D.java](../../../../src/haven/render/Ortho2D.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the ortho2 d render pipeline component.

## Members

### Constants

#### `public static final Attribute pos = new Attribute(VEC2, "opos2d").primary()`
- Role: Defines the shared pos constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform kv = new Uniform(VEC2, "k2d", p -> ((Ortho2D)p.get(States.vxf)).k, States.vxf)`
- Role: Defines the shared kv constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform mv = new Uniform(VEC2, "m2d", p -> ((Ortho2D)p.get(States.vxf)).m, States.vxf)`
- Role: Defines the shared mv constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final float l, u, r, b`
- Role: Stores the b value.
- Description: Backs the cached state for this file.

#### `public final float l, u, r, b`
- Role: Stores the b value.
- Description: Backs the cached state for this file.

#### `public final float l, u, r, b`
- Role: Stores the b value.
- Description: Backs the cached state for this file.

#### `public final float l, u, r, b`
- Role: Stores the b value.
- Description: Backs the cached state for this file.

#### `private final float[] k, m`
- Role: Stores the m value.
- Description: Backs the cached state for this file.

#### `private final float[] k, m`
- Role: Stores the m value.
- Description: Backs the cached state for this file.

### Methods

#### `public Ortho2D(float l, float u, float r, float b)`
- Role: Creates a new Ortho2D instance.
- Description: Constructs the instance and initializes its default state.

#### `public Ortho2D(Area area)`
- Role: Creates a new Ortho2D instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
