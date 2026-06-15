# ColorTex

This file documents the responsibilities and members of `ColorTex`.

## Meta

- Source: [ColorTex.java](../../../../src/haven/render/ColorTex.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a color texture.

## Members

### Constants

#### `public static final Slot<ColorTex> slot = new Slot<>(Slot.Type.DRAW, ColorTex.class)`

- Description: TODO

#### `public static final Attribute texc = Tex2D.texc`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `public final Texture2D.Sampler2D data`

- Description: TODO

### Methods

#### `public ColorTex(Texture2D.Sampler2D data)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO
