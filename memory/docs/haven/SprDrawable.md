# SprDrawable

This file documents the responsibilities and members of `SprDrawable`.

## Meta

- Source: [SprDrawable.java](../../../src/haven/SprDrawable.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Binds sprite behavior to drawing.

## Members

### Constants

#### `private static final ClassResolver<SprDrawable> ctxr = new ClassResolver<SprDrawable>()`

- Description: TODO

### Fields

#### `public final Sprite spr`

- Description: TODO

### Methods

#### `public SprDrawable(Gob gob, Sprite.Mill<?> mk)`

- Description: TODO

#### `public SprDrawable(Gob gob, Sprite spr)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public void ctick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public static <S extends Sprite> S apply(Gob gob, Sprite.Mill<S> mk)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO
