# TexMS

This file documents the responsibilities and members of `TexMS`.

## Meta

- Source: [TexMS.java](../../../src/haven/TexMS.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the tex ms Haven component.

## Nested Types

### Draw

- Role: Represents draw within TexMS.
- Description: Describes the nested draw type used by the enclosing class.

### Resolve

- Role: Represents resolve within TexMS.
- Description: Describes the nested resolve type used by the enclosing class.

## Members

### Constants

#### `public static final Attribute texc = new Attribute(VEC2, "mstexc")`
- Role: Defines the shared texc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final VertexArray.Layout fmt = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`
- Role: Defines the shared fmt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying texcoord = new AutoVarying(VEC2, "s_mstex")`
- Role: Defines the shared texcoord constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform mstex = new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).data, RUtils.adhoc)`
- Role: Defines the shared mstex constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Integer, Resolve> shaders = new HashMap<>()`
- Role: Defines the shared shaders constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Sampler2DMS data`
- Role: Holds the data state.
- Description: Backs the cached state for this file.

#### `public final int samples`
- Role: Stores the samples value.
- Description: Backs the cached state for this file.

#### `public final Sampler2DMS data`
- Role: Holds the data state.
- Description: Backs the cached state for this file.

#### `private Draw st = null`
- Role: Holds the st state.
- Description: Backs the cached state for this file.

### Methods

#### `public TexMS(Sampler2DMS data)`
- Role: Creates a new TexMS instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `private Resolve(int samples)`
- Role: Performs resolve.
- Description: Supports the resolve operation used by the surrounding class.

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public static Resolve get(int samples)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Draw(Sampler2DMS data)`
- Role: Performs draw.
- Description: Supports the draw operation used by the surrounding class.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.
