---
source: [ResDrawable.java](../../../src/haven/ResDrawable.java)
created: 2026-06-13
updated: 2026-06-14
---

# ResDrawable

Represents the res drawable Haven component.

## Nested Types

### $cres

- Role: Represents $cres within ResDrawable.
- Description: Describes the nested $cres type used by the enclosing class.

## Members

### Constants

#### `private static final ClassResolver<ResDrawable> ctxr = new ClassResolver<ResDrawable>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Resource rres`
- Role: Stores the rres value.
- Description: Backs the cached state for this file.

#### `public final Sprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `MessageBuf sdt`
- Role: Holds the sdt state.
- Description: Backs the cached state for this file.

### Methods

#### `public ResDrawable(Gob gob, Indir<Resource> res, Message sdt, boolean old)`
- Role: Creates a new ResDrawable instance.
- Description: Constructs the instance and initializes its default state.

#### `public ResDrawable(Gob gob, Indir<Resource> res, Message sdt)`
- Role: Creates a new ResDrawable instance.
- Description: Constructs the instance and initializes its default state.

#### `public ResDrawable(Gob gob, Resource res)`
- Role: Creates a new ResDrawable instance.
- Description: Constructs the instance and initializes its default state.

#### `public void ctick(double dt)`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Gob.Placer placer()`
- Role: Returns the gob placer.
- Description: Exposes the placer used when positioning the gob.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public byte[] sdt()`
- Role: Performs sdt.
- Description: Supports the sdt operation used by the surrounding class.
