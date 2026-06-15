# FrameConfig

This file documents the responsibilities and members of `FrameConfig`.

## Meta

- Source: [FrameConfig.java](../../../../src/haven/render/FrameConfig.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents frame configuration.

## Members

### Constants

#### `public static final Slot<FrameConfig> slot = new Slot<>(Slot.Type.SYS, FrameConfig.class)`

- Description: TODO

#### `public static final Uniform u_numsamples = new Uniform(Type.INT, "numsamples", p -> p.get(slot).samples, slot)`

- Description: TODO

#### `public static final Uniform u_screensize = new Uniform(Type.VEC2, "screensize", p -> p.get(slot).sz, slot)`

- Description: TODO

#### `public static final Uniform u_pixelpitch = new Uniform(Type.VEC2, "pixelpitch", p ->`

- Description: TODO

### Fields

#### `public final Coord sz`

- Description: TODO

#### `public final int samples`

- Description: TODO

### Methods

#### `public FrameConfig(Coord sz, int samples)`

- Description: TODO

#### `public FrameConfig(Coord sz)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO
