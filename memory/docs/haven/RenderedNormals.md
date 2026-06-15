# RenderedNormals

This file documents the responsibilities and members of `RenderedNormals`.

## Meta

- Source: [RenderedNormals.java](../../../src/haven/RenderedNormals.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents rendered normal data.

## Nested Types

### $maskcol

- Description: TODO

### Canon

- Description: TODO

## Members

### Constants

#### `public static final Slot<RenderedNormals> slot = new Slot<>(Slot.Type.SYS, RenderedNormals.class)`

- Description: TODO

#### `public static final FragData fragnorm = new FragData(Type.VEC3, "fragnorm", p -> ((p.get(States.maskdepth.slot) == null) ? p.get(slot).img : null), slot, States.maskdepth.slot)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `public final Texture.Image<?> img`

- Description: TODO

#### `public Texture2D tex = null`

- Description: TODO

#### `private RenderedNormals state`

- Description: TODO

#### `private int refcount = 0`

- Description: TODO

#### `final Pipe.Op mask = p -> p.put(slot, null)`

- Description: TODO

### Methods

#### `public RenderedNormals(Texture.Image<?> img)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public void prerender(Render out)`

- Description: TODO

#### `public void postrender(Render out)`

- Description: TODO

#### `public static Canon get(Pipe state)`

- Description: TODO

#### `public static void put(Pipe state)`

- Description: TODO

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO
