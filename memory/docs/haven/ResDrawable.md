# ResDrawable

This file documents the responsibilities and members of `ResDrawable`.

## Meta

- Source: [ResDrawable.java](../../../src/haven/ResDrawable.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Binds a resource to drawable behavior.

## Nested Types

### $cres

- Description: TODO

## Members

### Constants

#### `private static final ClassResolver<ResDrawable> ctxr = new ClassResolver<ResDrawable>()`

- Description: TODO

### Fields

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final Resource rres`

- Description: TODO

#### `public final Sprite spr`

- Description: TODO

#### `MessageBuf sdt`

- Description: TODO

### Methods

#### `public ResDrawable(Gob gob, Indir<Resource> res, Message sdt, boolean old)`

- Description: TODO

#### `public ResDrawable(Gob gob, Indir<Resource> res, Message sdt)`

- Description: TODO

#### `public ResDrawable(Gob gob, Resource res)`

- Description: TODO

#### `public void ctick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public Gob.Placer placer()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`

- Description: TODO

#### `public void apply(Gob g, OCache.AttrDelta msg)`

- Description: TODO

#### `public byte[] sdt()`

- Description: TODO
