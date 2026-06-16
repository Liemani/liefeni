# DepthBuffer

This file documents the responsibilities and members of `DepthBuffer`.

## Meta

- Source: [DepthBuffer.java](../../../../src/haven/render/DepthBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the depth buffer render pipeline component.

## Members

### Constants

#### `public static final Slot<DepthBuffer> slot = new Slot<>(Slot.Type.SYS, DepthBuffer.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Object defdepth = new Object()`
- Role: Defines the shared defdepth constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final T image`
- Role: Holds the image state.
- Description: Backs the cached state for this file.

### Methods

#### `public DepthBuffer(T image)`
- Role: Creates a new DepthBuffer instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
