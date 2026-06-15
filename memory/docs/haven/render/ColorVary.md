# ColorVary

This file documents the responsibilities and members of `ColorVary`.

## Meta

- Source: [ColorVary.java](../../../../src/haven/render/ColorVary.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a varying color state.

## Members

### Constants

#### `public static final Slot<ColorVary> slot = new Slot<>(Slot.Type.DRAW, ColorVary.class)`

- Description: TODO

#### `public static final Attribute color = new Attribute(VEC4, "vcolor")`

- Description: TODO

#### `public static final ColorVary st = new ColorVary()`

- Description: TODO

#### `static final AutoVarying fcolor = new AutoVarying(VEC4)`

- Description: TODO

#### `static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

### Methods

#### `private ColorVary()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO
