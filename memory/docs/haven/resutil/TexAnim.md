# TexAnim

This file documents the responsibilities and members of `TexAnim`.

## Meta

- Source: [TexAnim.java](../../../../src/haven/resutil/TexAnim.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides resource helper logic for tex anim.

## Nested Types

### $texrot

- Role: Represents $texrot within TexAnim.
- Description: Describes the nested $texrot type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<TexAnim> slot = new Slot<TexAnim>(Slot.Type.DRAW, TexAnim.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform cax = new Uniform(VEC2, p -> p.get(slot).ax, slot)`
- Role: Defines the shared cax constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Coord3f ax`
- Role: Stores the ax value.
- Description: Backs the cached state for this file.

### Methods

#### `public TexAnim(Coord3f ax)`
- Role: Creates a new TexAnim instance.
- Description: Constructs the instance and initializes its default state.

#### `public void cons(Material.Buffer buf,Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
