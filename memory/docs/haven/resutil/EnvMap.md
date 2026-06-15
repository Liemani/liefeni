# EnvMap

This file documents the responsibilities and members of `EnvMap`.

## Meta

- Source: [EnvMap.java](../../../../src/haven/resutil/EnvMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an environment map helper.

## Nested Types

### $envref

- Description: TODO

## Members

### Constants

#### `public static final Slot<EnvMap> slot = new Slot<EnvMap>(Slot.Type.DRAW, EnvMap.class)`

- Description: TODO

#### `private static final Uniform csky = new Uniform(SAMPLERCUBE, p -> p.get(slot).sky, slot)`

- Description: TODO

#### `private static final Uniform ccol = new Uniform(VEC3, p -> p.get(slot).col, slot)`

- Description: TODO

#### `private static final Uniform icam = new Uniform(MAT3, p -> Homo3D.camxf(p).transpose().trim3(), Homo3D.cam)`

- Description: TODO

#### `private static final SamplerCube sky = WaterTile.sky`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `public final float[] col`

- Description: TODO

### Methods

#### `public EnvMap(Color col)`

- Description: TODO

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO
