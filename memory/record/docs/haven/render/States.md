---
source: [States.java](../../../../../src/haven/render/States.java)
created: 2026-06-13
updated: 2026-06-14
---

# States

Defines the states render pipeline component.

## Nested Types

### Builtin

- Role: Defines one built-in render state.
- Description: Serves as the base type for state objects that write themselves into a pipe.

### DepthBias

- Role: Defines depth bias state.
- Description: Sets polygon offset values used while rendering depth-tested geometry.

### Depthtest

- Role: Defines depth test state.
- Description: Controls which depth comparison is used for a draw call.

### Facecull

- Role: Defines face culling state.
- Description: Controls which winding order is discarded during rendering.

### LineWidth

- Role: Defines line width state.
- Description: Carries the raster line width used for wireframe-like rendering.

### Mode

- Role: Defines a face-cull mode.
- Description: Enumerates how triangle orientation is interpreted during culling.

### Scissor

- Role: Defines scissor state.
- Description: Stores the clip rectangle applied to the current framebuffer.

### Test

- Role: Defines a depth test function.
- Description: Enumerates the comparison used for depth-buffer testing.

### Viewport

- Role: Defines viewport state.
- Description: Stores the framebuffer rectangle used for projection and scissor setup.

## Members

### Constants

#### `public static final Slot<State> vxf = new Slot<State>(Slot.Type.SYS, State.class)`
- Role: Implements the vxf operation.
- Description: Implements the public static final slot<state> vxf = new slot<state>(slot.type.sys, state.class) operation.
- Value: `new Slot<State>(Slot.Type.SYS, State.class)`

#### `public static final Slot<Viewport> viewport = new Slot<Viewport>(Slot.Type.SYS, Viewport.class)`
- Role: Implements the viewport operation.
- Description: Implements the public static final slot<viewport> viewport = new slot<viewport>(slot.type.sys, viewport.class) operation.
- Value: `new Slot<Viewport>(Slot.Type.SYS, Viewport.class)`

#### `public static final Slot<Scissor> scissor = new Slot<Scissor>(Slot.Type.SYS, Scissor.class)`
- Role: Implements the scissor operation.
- Description: Implements the public static final slot<scissor> scissor = new slot<scissor>(slot.type.sys, scissor.class) operation.
- Value: `new Slot<Scissor>(Slot.Type.SYS, Scissor.class)`

#### `public static final Slot<Facecull> facecull = new Slot<Facecull>(Slot.Type.GEOM, Facecull.class)`
- Role: Implements the facecull operation.
- Description: Implements the public static final slot<facecull> facecull = new slot<facecull>(slot.type.geom, facecull.class) operation.
- Value: `new Slot<Facecull>(Slot.Type.GEOM, Facecull.class)`

#### `public static final Slot<Depthtest> depthtest = new Slot<Depthtest>(Slot.Type.GEOM, Depthtest.class)`
- Role: Implements the depthtest operation.
- Description: Implements the public static final slot<depthtest> depthtest = new slot<depthtest>(slot.type.geom, depthtest.class) operation.
- Value: `new Slot<Depthtest>(Slot.Type.GEOM, Depthtest.class)`

#### `public static final Pipe.Op none = p ->`
- Role: Caches the none value.
- Description: Caches the `none` value for reuse.
- Value: `p ->`

#### `public static final State.StandAlone maskdepth = new State.StandAlone(Slot.Type.GEOM)`
- Role: Implements the maskdepth operation.
- Description: Implements the stand alone operation.
- Value: `new State.StandAlone(Slot.Type.GEOM)`

#### `public static final Slot<LineWidth> linewidth = new Slot<LineWidth>(Slot.Type.GEOM, LineWidth.class)`
- Role: Implements the linewidth operation.
- Description: Implements the public static final slot<line width> linewidth = new slot<line width>(slot.type.geom, line width.class) operation.
- Value: `new Slot<LineWidth>(Slot.Type.GEOM, LineWidth.class)`

#### `public static final Slot<DepthBias> depthbias = new Slot<DepthBias>(Slot.Type.GEOM, DepthBias.class)`
- Role: Implements the depthbias operation.
- Description: Implements the public static final slot<depth bias> depthbias = new slot<depth bias>(slot.type.geom, depth bias.class) operation.
- Value: `new Slot<DepthBias>(Slot.Type.GEOM, DepthBias.class)`

### Fields

#### `public final Area area`
- Role: Caches the area value.
- Description: Caches the `area` value for reuse.

#### `public final Area area`
- Role: Caches the area value.
- Description: Caches the `area` value for reuse.

#### `public final Mode mode`
- Role: Caches the mode value.
- Description: Caches the `mode` value for reuse.

#### `public final Test test`
- Role: Caches the test value.
- Description: Caches the `test` value for reuse.

#### `public final float w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `public final float factor, units`
- Role: Caches the units value.
- Description: Caches the `units` value for reuse.

#### `public final float factor, units`
- Role: Caches the units value.
- Description: Caches the `units` value for reuse.

### Methods

#### `private States()`
- Role: Creates a new States instance.
- Description: Constructs the States instance from the supplied inputs.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public Viewport(Area area)`
- Role: Handles the viewport path.
- Description: Implements the viewport operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this States for debugging and logging.

#### `public Scissor(Area area)`
- Role: Handles the scissor path.
- Description: Implements the scissor operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this States for debugging and logging.

#### `public Facecull(Mode mode)`
- Role: Handles the facecull path.
- Description: Implements the facecull operation.

#### `public Facecull()`
- Role: Handles the facecull path.
- Description: Implements the facecull operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this States for debugging and logging.

#### `public Depthtest(Test test)`
- Role: Handles the depthtest path.
- Description: Implements the depthtest operation.

#### `public Depthtest()`
- Role: Handles the depthtest path.
- Description: Implements the depthtest operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this States for debugging and logging.

#### `public LineWidth(float w)`
- Role: Handles the line width path.
- Description: Implements the line width operation.

#### `public LineWidth(double w)`
- Role: Handles the line width path.
- Description: Implements the line width operation.

#### `public LineWidth(int w)`
- Role: Handles the line width path.
- Description: Implements the line width operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this States for debugging and logging.

#### `public DepthBias(float factor, float units)`
- Role: Handles the depth texture bias path.
- Description: Implements the depth bias operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this States for debugging and logging.