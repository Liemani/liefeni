# PointSize

This file documents the responsibilities and members of `PointSize`.

## Meta

- Source: [PointSize.java](../../../../src/haven/render/PointSize.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents point size state.

## Members

### Constants

#### `public static final Slot<State> slot = new Slot<>(Slot.Type.GEOM, State.class)`

- Description: TODO

#### `public static final Uniform u_ptsz = new Uniform(Type.FLOAT, "pointsize", p -> ((PointSize)p.get(slot)).sz, slot)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `public final float sz`

- Description: TODO

### Methods

#### `public PointSize(float sz)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO
