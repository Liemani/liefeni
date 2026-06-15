# HueMod

This file documents the responsibilities and members of `HueMod`.

## Meta

- Source: [HueMod.java](../../../../src/haven/resutil/HueMod.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a hue modification helper.

## Members

### Constants

#### `public static final Slot<HueMod> slot = new Slot<>(Slot.Type.DRAW, HueMod.class)`

- Description: TODO

#### `private static final Uniform cxf = new Uniform(VEC3, p ->`

- Description: TODO

#### `private static final Function apply = new Function.Def(VEC4)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `final float tgthue, huemod, satmod`

- Description: TODO

#### `final float tgthue, huemod, satmod`

- Description: TODO

#### `final float tgthue, huemod, satmod`

- Description: TODO

### Methods

#### `public HueMod(float tgthue, float huemod, float satmod)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO
