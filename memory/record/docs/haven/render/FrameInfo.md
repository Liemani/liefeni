---
source: [FrameInfo.java](../../../../../src/haven/render/FrameInfo.java)
created: 2026-06-13
updated: 2026-06-14
---

# FrameInfo

Defines the frame info render pipeline component.

## Members

### Constants

#### `public static final Slot<FrameInfo> slot = new Slot<>(Slot.Type.SYS, FrameInfo.class)`
- Role: Publishes frame timing state.
- Description: Shared slot used to carry per-frame timing into the render pipe.
- Value: `new Slot<>(Slot.Type.SYS, FrameInfo.class)`

#### `public static final Uniform u_time = new Uniform(Type.FLOAT, "time", p ->`
- Role: Publishes the frame time uniform.
- Description: Exposes the current frame time to shader code.
- Value: `new Uniform(Type.FLOAT, "time", p ->`

### Fields

#### `public final double time`
- Role: Caches the time value.
- Description: Caches the `time` value for reuse.

### Methods

#### `public FrameInfo(double time)`
- Role: Stores one frame timestamp.
- Description: Wraps the current frame time as a render state object.

#### `public FrameInfo()`
- Role: Creates a new FrameInfo instance.
- Description: Constructs the FrameInfo instance from the supplied inputs.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public static Expression time()`
- Role: Reads the frame time expression.
- Description: Returns the shader expression bound to frame time.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this FrameInfo for debugging and logging.