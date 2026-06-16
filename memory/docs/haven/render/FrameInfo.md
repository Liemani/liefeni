# FrameInfo

This file documents the responsibilities and members of `FrameInfo`.

## Meta

- Source: [FrameInfo.java](../../../../src/haven/render/FrameInfo.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the frame info render pipeline component.

## Members

### Constants

#### `public static final Slot<FrameInfo> slot = new Slot<>(Slot.Type.SYS, FrameInfo.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform u_time = new Uniform(Type.FLOAT, "time", p ->`
- Role: Defines the shared u time constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final double time`
- Role: Stores the time value.
- Description: Backs the cached state for this file.

### Methods

#### `public FrameInfo(double time)`
- Role: Creates a new FrameInfo instance.
- Description: Constructs the instance and initializes its default state.

#### `public FrameInfo()`
- Role: Creates a new FrameInfo instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static Expression time()`
- Role: Performs time.
- Description: Supports the time operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
