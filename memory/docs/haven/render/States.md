# States

This file documents the responsibilities and members of `States`.

## Meta

- Source: [States.java](../../../../src/haven/render/States.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the states render pipeline component.

## Nested Types

### Builtin

- Role: Represents builtin within States.
- Description: Describes the nested builtin type used by the enclosing class.

### DepthBias

- Role: Represents depth bias within States.
- Description: Describes the nested depth bias type used by the enclosing class.

### Depthtest

- Role: Represents depthtest within States.
- Description: Describes the nested depthtest type used by the enclosing class.

### Facecull

- Role: Represents facecull within States.
- Description: Describes the nested facecull type used by the enclosing class.

### LineWidth

- Role: Represents line width within States.
- Description: Describes the nested line width type used by the enclosing class.

### Mode

- Role: Represents mode within States.
- Description: Describes the nested mode type used by the enclosing class.

### Scissor

- Role: Represents scissor within States.
- Description: Describes the nested scissor type used by the enclosing class.

### Test

- Role: Represents test within States.
- Description: Describes the nested test type used by the enclosing class.

### Viewport

- Role: Represents viewport within States.
- Description: Describes the nested viewport type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<State> vxf = new Slot<State>(Slot.Type.SYS, State.class)`
- Role: Defines the shared vxf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<Viewport> viewport = new Slot<Viewport>(Slot.Type.SYS, Viewport.class)`
- Role: Defines the shared viewport constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<Scissor> scissor = new Slot<Scissor>(Slot.Type.SYS, Scissor.class)`
- Role: Defines the shared scissor constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<Facecull> facecull = new Slot<Facecull>(Slot.Type.GEOM, Facecull.class)`
- Role: Defines the shared facecull constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<Depthtest> depthtest = new Slot<Depthtest>(Slot.Type.GEOM, Depthtest.class)`
- Role: Defines the shared depthtest constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pipe.Op none = p ->`
- Role: Defines the shared none constant.
- Description: Shared constant used by the rest of the class.

#### `public static final State.StandAlone maskdepth = new State.StandAlone(Slot.Type.GEOM)`
- Role: Defines the shared maskdepth constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<LineWidth> linewidth = new Slot<LineWidth>(Slot.Type.GEOM, LineWidth.class)`
- Role: Defines the shared linewidth constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<DepthBias> depthbias = new Slot<DepthBias>(Slot.Type.GEOM, DepthBias.class)`
- Role: Defines the shared depthbias constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Area area`
- Role: Holds the area state.
- Description: Backs the cached state for this file.

#### `public final Area area`
- Role: Holds the area state.
- Description: Backs the cached state for this file.

#### `public final Mode mode`
- Role: Holds the mode state.
- Description: Backs the cached state for this file.

#### `public final Test test`
- Role: Holds the test state.
- Description: Backs the cached state for this file.

#### `public final float w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `public final float factor, units`
- Role: Stores the units value.
- Description: Backs the cached state for this file.

#### `public final float factor, units`
- Role: Stores the units value.
- Description: Backs the cached state for this file.

### Methods

#### `private States()`
- Role: Creates a new States instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public Viewport(Area area)`
- Role: Performs viewport.
- Description: Supports the viewport operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Scissor(Area area)`
- Role: Performs scissor.
- Description: Supports the scissor operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Facecull(Mode mode)`
- Role: Performs facecull.
- Description: Supports the facecull operation used by the surrounding class.

#### `public Facecull()`
- Role: Performs facecull.
- Description: Supports the facecull operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Depthtest(Test test)`
- Role: Performs depthtest.
- Description: Supports the depthtest operation used by the surrounding class.

#### `public Depthtest()`
- Role: Performs depthtest.
- Description: Supports the depthtest operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public LineWidth(float w)`
- Role: Performs line width.
- Description: Supports the line width operation used by the surrounding class.

#### `public LineWidth(double w)`
- Role: Performs line width.
- Description: Supports the line width operation used by the surrounding class.

#### `public LineWidth(int w)`
- Role: Performs line width.
- Description: Supports the line width operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public DepthBias(float factor, float units)`
- Role: Performs depth bias.
- Description: Supports the depth bias operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
