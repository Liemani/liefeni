# ColorMask

This file documents the responsibilities and members of `ColorMask`.

## Meta

- Source: [ColorMask.java](../../../src/haven/ColorMask.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a color mask helper.

## Members

### Constants

#### `public static final Slot<ColorMask> slot = new Slot<ColorMask>(Slot.Type.DRAW, ColorMask.class)`

- Description: TODO

#### `public static final Uniform ccol = new Uniform(VEC4, p -> p.get(slot).col, slot)`

- Description: TODO

#### `private static final ShaderMacro sh = prog ->`

- Description: TODO

### Fields

#### `private final FColor col`

- Description: TODO

### Methods

#### `public ColorMask(FColor col)`

- Description: TODO

#### `public ColorMask(Color col)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO
