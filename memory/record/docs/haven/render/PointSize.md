---
source: [PointSize.java](../../../../../src/haven/render/PointSize.java)
created: 2026-06-13
updated: 2026-06-14
---

# PointSize

Sets the shader point size for point-based geometry.

## Members

### Constants

#### `public static final Slot<State> slot = new Slot<>(Slot.Type.GEOM, State.class)`
- Role: Stores the active point-size state in the geometry pipe.
- Description: Lets the shader read the point size for the current draw.
- Value: `new Slot<>(Slot.Type.GEOM, State.class)`

#### `public static final Uniform u_ptsz = new Uniform(Type.FLOAT, "pointsize", p -> ((PointSize)p.get(slot)).sz, slot)`
- Role: Exposes the point size uniform.
- Description: Reads the point size from the current geometry state.
- Value: `new Uniform(Type.FLOAT, "pointsize", p -> ((PointSize)p.get(slot)).sz, slot)`

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the point-size shader hook.
- Description: Applies the size value to the vertex stage.
- Value: `prog ->`

### Fields

#### `public final float sz`
- Role: Stores the point size value.
- Description: This value is written into the shader uniform.

### Methods

#### `public PointSize(float sz)`
- Role: Creates a new PointSize instance.
- Description: Constructs the PointSize instance from the supplied inputs.

#### `public ShaderMacro shader()`
- Role: Returns the point-size shader macro.
- Description: Produces the shader hook that emits the configured point size.

#### `public void apply(Pipe p)`
- Role: Installs the point-size state into the pipe.
- Description: Makes the point size visible to downstream shader stages.
