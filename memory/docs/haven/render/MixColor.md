# MixColor

This file documents the responsibilities and members of `MixColor`.

## Meta

- Source: [MixColor.java](../../../../src/haven/render/MixColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a mixed color state.

## Members

### Constants

#### `public static final Slot<MixColor> slot = new Slot<>(Slot.Type.DRAW, MixColor.class)`

- Description: TODO

#### `public static final InstancedUniform u_color = new InstancedUniform.Vec4("mixcolor", p -> p.get(slot).color, slot)`

- Description: TODO

#### `public static final AutoVarying transfer = new AutoVarying(Type.VEC4)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

#### `private static final Instancer<MixColor> instancer = new Instancer<MixColor>()`

- Description: TODO

### Fields

#### `public final float[] color`

- Description: TODO

### Methods

#### `public MixColor(float[] color)`

- Description: TODO

#### `public MixColor(FColor color)`

- Description: TODO

#### `public MixColor(float r, float g, float b, float a)`

- Description: TODO

#### `public MixColor(Color color)`

- Description: TODO

#### `public MixColor(int r, int g, int b, int a)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public InstancedAttribute[] attribs()`

- Description: TODO
