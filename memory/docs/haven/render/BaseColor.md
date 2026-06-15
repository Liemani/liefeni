# BaseColor

This file documents the responsibilities and members of `BaseColor`.

## Meta

- Source: [BaseColor.java](../../../../src/haven/render/BaseColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a base color state.

## Members

### Constants

#### `public static final Slot<BaseColor> slot = new Slot<>(Slot.Type.DRAW, BaseColor.class)`

- Description: TODO

#### `public static final Uniform u_color = new Uniform(VEC4, "basecolor", p -> p.get(slot).color, slot)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `public final FColor color`

- Description: TODO

### Methods

#### `public BaseColor(FColor color)`

- Description: TODO

#### `public BaseColor(float r, float g, float b, float a)`

- Description: TODO

#### `public BaseColor(Color color)`

- Description: TODO

#### `public BaseColor(int r, int g, int b, int a)`

- Description: TODO

#### `public Color color()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public String toString()`

- Description: TODO
