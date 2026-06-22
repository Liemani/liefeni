---
source: [DepthBuffer.java](../../../../../src/haven/render/DepthBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# DepthBuffer

Defines the depth buffer render pipeline component.

## Members

### Constants

#### `public static final Slot<DepthBuffer> slot = new Slot<>(Slot.Type.SYS, DepthBuffer.class)`
- Role: Publishes depth-buffer state.
- Description: Shared slot used to expose the active depth buffer to the pipe.
- Value: `new Slot<>(Slot.Type.SYS, DepthBuffer.class)`

#### `public static final Object defdepth = new Object()`
- Role: Marks the default depth buffer state.
- Description: Shared sentinel used when no explicit depth buffer is present.
- Value: `new Object()`

### Fields

#### `public final T image`
- Role: Caches the image value.
- Description: Caches the `image` value for reuse.

### Methods

#### `public DepthBuffer(T image)`
- Role: Stores one depth buffer image.
- Description: Wraps the underlying depth texture or render target.

#### `public ShaderMacro shader()`
- Role: Builds the depth shader.
- Description: Returns the shader macro that reads depth data from the current state.

#### `public void apply(Pipe p)`
- Role: Applies depth-buffer state.
- Description: Writes the active depth buffer into the current pipe.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this DepthBuffer for debugging and logging.