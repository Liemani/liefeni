# FrameConfig

This file documents the responsibilities and members of `FrameConfig`.

## Meta

- Source: [FrameConfig.java](../../../../src/haven/render/FrameConfig.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the frame config render pipeline component.

## Members

### Constants

#### `public static final Slot<FrameConfig> slot = new Slot<>(Slot.Type.SYS, FrameConfig.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform u_numsamples = new Uniform(Type.INT, "numsamples", p -> p.get(slot).samples, slot)`
- Role: Defines the shared u numsamples constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform u_screensize = new Uniform(Type.VEC2, "screensize", p -> p.get(slot).sz, slot)`
- Role: Defines the shared u screensize constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform u_pixelpitch = new Uniform(Type.VEC2, "pixelpitch", p ->`
- Role: Defines the shared u pixelpitch constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Coord sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public final int samples`
- Role: Stores the samples value.
- Description: Backs the cached state for this file.

### Methods

#### `public FrameConfig(Coord sz, int samples)`
- Role: Creates a new FrameConfig instance.
- Description: Constructs the instance and initializes its default state.

#### `public FrameConfig(Coord sz)`
- Role: Creates a new FrameConfig instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
