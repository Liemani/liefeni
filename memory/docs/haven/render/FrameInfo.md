# FrameInfo

This file documents the responsibilities and members of `FrameInfo`.

## Meta

- Source: [FrameInfo.java](../../../../src/haven/render/FrameInfo.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents frame information.

## Members

### Constants

#### `public static final Slot<FrameInfo> slot = new Slot<>(Slot.Type.SYS, FrameInfo.class)`

- Description: TODO

#### `public static final Uniform u_time = new Uniform(Type.FLOAT, "time", p ->`

- Description: TODO

### Fields

#### `public final double time`

- Description: TODO

### Methods

#### `public FrameInfo(double time)`

- Description: TODO

#### `public FrameInfo()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public static Expression time()`

- Description: TODO

#### `public String toString()`

- Description: TODO
