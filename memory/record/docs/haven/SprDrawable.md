---
source: [SprDrawable.java](../../../src/haven/SprDrawable.java)
created: 2026-06-13
updated: 2026-06-14
---

# SprDrawable

Represents the spr drawable Haven component.

## Members

### Constants

#### `private static final ClassResolver<SprDrawable> ctxr = new ClassResolver<SprDrawable>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Sprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

### Methods

#### `public SprDrawable(Gob gob, Sprite.Mill<?> mk)`
- Role: Creates a new SprDrawable instance.
- Description: Constructs the instance and initializes its default state.

#### `public SprDrawable(Gob gob, Sprite spr)`
- Role: Creates a new SprDrawable instance.
- Description: Constructs the instance and initializes its default state.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void ctick(double dt)`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public static <S extends Sprite> S apply(Gob gob, Sprite.Mill<S> mk)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.
