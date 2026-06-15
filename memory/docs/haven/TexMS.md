# TexMS

This file documents the responsibilities and members of `TexMS`.

## Meta

- Source: [TexMS.java](../../../src/haven/TexMS.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a multisampled texture.

## Nested Types

### Draw

- Description: TODO

### Resolve

- Description: TODO

## Members

### Constants

#### `public static final Attribute texc = new Attribute(VEC2, "mstexc")`

- Description: TODO

#### `public static final VertexArray.Layout fmt = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`

- Description: TODO

#### `public static final AutoVarying texcoord = new AutoVarying(VEC2, "s_mstex")`

- Description: TODO

#### `public static final Uniform mstex = new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).data, RUtils.adhoc)`

- Description: TODO

#### `private static final Map<Integer, Resolve> shaders = new HashMap<>()`

- Description: TODO

### Fields

#### `public final Sampler2DMS data`

- Description: TODO

#### `public final int samples`

- Description: TODO

#### `public final Sampler2DMS data`

- Description: TODO

#### `private Draw st = null`

- Description: TODO

### Methods

#### `public TexMS(Sampler2DMS data)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `private Resolve(int samples)`

- Description: TODO

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `public static Resolve get(int samples)`

- Description: TODO

#### `public Draw(Sampler2DMS data)`

- Description: TODO

#### `public void render(GOut g, float[] gc, float[] tc)`

- Description: TODO
