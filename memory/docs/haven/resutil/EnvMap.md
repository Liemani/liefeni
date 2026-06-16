# EnvMap

This file documents the responsibilities and members of `EnvMap`.

## Meta

- Source: [EnvMap.java](../../../../src/haven/resutil/EnvMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides resource helper logic for env map.

## Nested Types

### $envref

- Role: Represents $envref within EnvMap.
- Description: Describes the nested $envref type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<EnvMap> slot = new Slot<EnvMap>(Slot.Type.DRAW, EnvMap.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform csky = new Uniform(SAMPLERCUBE, p -> p.get(slot).sky, slot)`
- Role: Defines the shared csky constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform ccol = new Uniform(VEC3, p -> p.get(slot).col, slot)`
- Role: Defines the shared ccol constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform icam = new Uniform(MAT3, p -> Homo3D.camxf(p).transpose().trim3(), Homo3D.cam)`
- Role: Defines the shared icam constant.
- Description: Shared constant used by the rest of the class.

#### `private static final SamplerCube sky = WaterTile.sky`
- Role: Defines the shared sky constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final float[] col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

### Methods

#### `public EnvMap(Color col)`
- Role: Creates a new EnvMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
