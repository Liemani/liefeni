---
source: [SprDrawable.java](../../../../src/haven/SprDrawable.java)
created: 2026-06-13
updated: 2026-06-14
---

# SprDrawable

Represents the spr drawable Haven component.

## Members

### Constants

#### `private static final ClassResolver<SprDrawable> ctxr = new ClassResolver<SprDrawable>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final class resolver<spr drawable> ctxr = new class resolver<spr drawable>() operation.
- Value: `new ClassResolver<SprDrawable>()`

### Fields

#### `public final Sprite spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

### Methods

#### `public SprDrawable(Gob gob, Sprite.Mill<?> mk)`
- Role: Creates a new SprDrawable instance.
- Description: Constructs the SprDrawable instance from the supplied inputs.

#### `public SprDrawable(Gob gob, Sprite spr)`
- Role: Creates a new SprDrawable instance.
- Description: Constructs the SprDrawable instance from the supplied inputs.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void ctick(double dt)`
- Role: Advances the client-thread state.
- Description: Advances the client-thread state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public static <S extends Sprite> S apply(Gob gob, Sprite.Mill<S> mk)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.