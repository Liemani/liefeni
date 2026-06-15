# Ortho2D

This file documents the responsibilities and members of `Ortho2D`.

## Meta

- Source: [Ortho2D.java](../../../../src/haven/render/Ortho2D.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an orthographic 2D projection.

## Members

### Constants

#### `public static final Attribute pos = new Attribute(VEC2, "opos2d").primary()`

- Description: TODO

#### `private static final Uniform kv = new Uniform(VEC2, "k2d", p -> ((Ortho2D)p.get(States.vxf)).k, States.vxf)`

- Description: TODO

#### `private static final Uniform mv = new Uniform(VEC2, "m2d", p -> ((Ortho2D)p.get(States.vxf)).m, States.vxf)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `public final float l, u, r, b`

- Description: TODO

#### `public final float l, u, r, b`

- Description: TODO

#### `public final float l, u, r, b`

- Description: TODO

#### `public final float l, u, r, b`

- Description: TODO

#### `private final float[] k, m`

- Description: TODO

#### `private final float[] k, m`

- Description: TODO

### Methods

#### `public Ortho2D(float l, float u, float r, float b)`

- Description: TODO

#### `public Ortho2D(Area area)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO
