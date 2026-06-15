# States

This file documents the responsibilities and members of `States`.

## Meta

- Source: [States.java](../../../../src/haven/render/States.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Collects render states.

## Nested Types

### Builtin

- Description: TODO

### DepthBias

- Description: TODO

### Depthtest

- Description: TODO

### Facecull

- Description: TODO

### LineWidth

- Description: TODO

### Mode

- Description: TODO

### Scissor

- Description: TODO

### Test

- Description: TODO

### Viewport

- Description: TODO

## Members

### Constants

#### `public static final Slot<State> vxf = new Slot<State>(Slot.Type.SYS, State.class)`

- Description: TODO

#### `public static final Slot<Viewport> viewport = new Slot<Viewport>(Slot.Type.SYS, Viewport.class)`

- Description: TODO

#### `public static final Slot<Scissor> scissor = new Slot<Scissor>(Slot.Type.SYS, Scissor.class)`

- Description: TODO

#### `public static final Slot<Facecull> facecull = new Slot<Facecull>(Slot.Type.GEOM, Facecull.class)`

- Description: TODO

#### `public static final Slot<Depthtest> depthtest = new Slot<Depthtest>(Slot.Type.GEOM, Depthtest.class)`

- Description: TODO

#### `public static final Pipe.Op none = p ->`

- Description: TODO

#### `public static final State.StandAlone maskdepth = new State.StandAlone(Slot.Type.GEOM)`

- Description: TODO

#### `public static final Slot<LineWidth> linewidth = new Slot<LineWidth>(Slot.Type.GEOM, LineWidth.class)`

- Description: TODO

#### `public static final Slot<DepthBias> depthbias = new Slot<DepthBias>(Slot.Type.GEOM, DepthBias.class)`

- Description: TODO

### Fields

#### `public final Area area`

- Description: TODO

#### `public final Area area`

- Description: TODO

#### `public final Mode mode`

- Description: TODO

#### `public final Test test`

- Description: TODO

#### `public final float w`

- Description: TODO

#### `public final float factor, units`

- Description: TODO

#### `public final float factor, units`

- Description: TODO

### Methods

#### `private States()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public Viewport(Area area)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Scissor(Area area)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Facecull(Mode mode)`

- Description: TODO

#### `public Facecull()`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Depthtest(Test test)`

- Description: TODO

#### `public Depthtest()`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public LineWidth(float w)`

- Description: TODO

#### `public LineWidth(double w)`

- Description: TODO

#### `public LineWidth(int w)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public DepthBias(float factor, float units)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO
