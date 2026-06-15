# PackCont

This file documents the responsibilities and members of `PackCont`.

## Meta

- Source: [PackCont.java](../../../src/haven/PackCont.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides pack container support.

## Nested Types

### $linpack

- Description: TODO

### HPack

- Description: TODO

### LinPack

- Description: TODO

### VPack

- Description: TODO

## Members

### Constants

### Fields

#### `public boolean packpar`

- Description: TODO

#### `private boolean packed = false`

- Description: TODO

#### `public final List<Widget> order = new ArrayList<>()`

- Description: TODO

#### `public int margin = 0`

- Description: TODO

### Methods

#### `public PackCont()`

- Description: TODO

#### `public PackCont packpar(boolean packpar)`

- Description: TODO

#### `public <T extends Widget> T add(T child)`

- Description: TODO

#### `public void cdestroy(Widget ch)`

- Description: TODO

#### `public void cresize(Widget ch)`

- Description: TODO

#### `public void pack()`

- Description: TODO

#### `private void repack0()`

- Description: TODO

#### `protected abstract void repack()`

- Description: TODO

#### `public LinPack margin(int margin)`

- Description: TODO

#### `protected abstract Coord pad(int p)`

- Description: TODO

#### `public <T extends Widget> T last(T child, int pad)`

- Description: TODO

#### `public <T extends Widget> T insert(T child, int p, int pad)`

- Description: TODO

#### `public <T extends Widget> T after(T child, Widget after, int pad)`

- Description: TODO

#### `public <T extends Widget> T before(T child, Widget after, int pad)`

- Description: TODO

#### `public void cdestroy(Widget ch)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `protected Coord pad(int p)`

- Description: TODO

#### `protected void repack()`

- Description: TODO

#### `protected Coord pad(int p)`

- Description: TODO

#### `protected void repack()`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO
