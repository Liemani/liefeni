# TexPal

This file documents the responsibilities and members of `TexPal`.

## Meta

- Source: [TexPal.java](../../../../src/haven/resutil/TexPal.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a texture palette helper.

## Nested Types

### $res

- Description: TODO

## Members

### Constants

#### `public static final Slot<TexPal> slot = new Slot<TexPal>(Slot.Type.DRAW, TexPal.class)`

- Description: TODO

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex.img, slot)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `public final TexRender tex`

- Description: TODO

### Methods

#### `public TexPal(TexRender tex)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO
