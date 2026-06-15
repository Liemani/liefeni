# TexAnim

This file documents the responsibilities and members of `TexAnim`.

## Meta

- Source: [TexAnim.java](../../../../src/haven/resutil/TexAnim.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents texture animation support.

## Nested Types

### $texrot

- Description: TODO

## Members

### Constants

#### `public static final Slot<TexAnim> slot = new Slot<TexAnim>(Slot.Type.DRAW, TexAnim.class)`

- Description: TODO

#### `private static final Uniform cax = new Uniform(VEC2, p -> p.get(slot).ax, slot)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `public final Coord3f ax`

- Description: TODO

### Methods

#### `public TexAnim(Coord3f ax)`

- Description: TODO

#### `public void cons(Material.Buffer buf,Object... args)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO
