---
source: [ResDrawable.java](../../../../src/haven/ResDrawable.java)
created: 2026-06-13
updated: 2026-06-14
---

# ResDrawable

Represents the res drawable Haven component.

## Nested Types

### $cres

- Role: Applies resource-delta updates to gob drawables.
- Description: Delta decoder that installs or updates a ResDrawable from the object cache.

## Members

### Constants

#### `private static final ClassResolver<ResDrawable> ctxr = new ClassResolver<ResDrawable>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final class resolver<res drawable> ctxr = new class resolver<res drawable>() operation.
- Value: `new ClassResolver<ResDrawable>()`

### Fields

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Resource rres`
- Role: Caches the rres value.
- Description: Caches the `rres` value for reuse.

#### `public final Sprite spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `MessageBuf sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

### Methods

#### `public ResDrawable(Gob gob, Indir<Resource> res, Message sdt, boolean old)`
- Role: Creates a new ResDrawable instance.
- Description: Constructs the ResDrawable instance from the supplied inputs.

#### `public ResDrawable(Gob gob, Indir<Resource> res, Message sdt)`
- Role: Creates a new ResDrawable instance.
- Description: Constructs the ResDrawable instance from the supplied inputs.

#### `public ResDrawable(Gob gob, Resource res)`
- Role: Creates a new ResDrawable instance.
- Description: Constructs the ResDrawable instance from the supplied inputs.

#### `public void ctick(double dt)`
- Role: Advances the client-thread state.
- Description: Advances the client-thread state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Gob.Placer placer()`
- Role: Returns the gob placer.
- Description: Exposes the placer used when positioning the gob.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public byte[] sdt()`
- Role: Returns the serialized sprite payload bytes.
- Description: Returns the serialized sprite payload bytes.