# TexPal

This file documents the responsibilities and members of `TexPal`.

## Meta

- Source: [TexPal.java](../../../../src/haven/resutil/TexPal.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides resource helper logic for tex pal.

## Nested Types

### $res

- Role: Represents $res within TexPal.
- Description: Describes the nested $res type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<TexPal> slot = new Slot<TexPal>(Slot.Type.DRAW, TexPal.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform ctex = new Uniform(SAMPLER2D, p -> p.get(slot).tex.img, slot)`
- Role: Defines the shared ctex constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final TexRender tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

### Methods

#### `public TexPal(TexRender tex)`
- Role: Creates a new TexPal instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.
