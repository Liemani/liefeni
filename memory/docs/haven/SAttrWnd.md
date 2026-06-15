# SAttrWnd

This file documents the responsibilities and members of `SAttrWnd`.

## Meta

- Source: [SAttrWnd.java](../../../src/haven/SAttrWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a skill or stat attribute window.

## Nested Types

### $_

- Description: TODO

### SAttr

- Description: TODO

### StudyInfo

- Description: TODO

## Members

### Constants

### Fields

#### `public final Collection<SAttr> attrs`

- Description: TODO

#### `private final Coord studyc`

- Description: TODO

#### `private CharWnd chr`

- Description: TODO

#### `private int scost`

- Description: TODO

#### `public final Text rnm`

- Description: TODO

#### `public final Tex img`

- Description: TODO

#### `public final Color bg`

- Description: TODO

#### `public int tbv, cost`

- Description: TODO

#### `public int tbv, cost`

- Description: TODO

#### `private final IButton add, sub`

- Description: TODO

#### `private final IButton add, sub`

- Description: TODO

#### `private Text ct`

- Description: TODO

#### `private int cbv, ccv`

- Description: TODO

#### `private int cbv, ccv`

- Description: TODO

#### `public final Widget study`

- Description: TODO

#### `public int texp, tw, tenc`

- Description: TODO

#### `public int texp, tw, tenc`

- Description: TODO

#### `public int texp, tw, tenc`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `private SAttr(Glob glob, String attr, Color bg)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private void updcost()`

- Description: TODO

#### `public void adj(int a)`

- Description: TODO

#### `public void reset()`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public RLabel<?> explabel()`

- Description: TODO

#### `public RLabel<?> enclabel()`

- Description: TODO

#### `protected void attached()`

- Description: TODO

#### `private StudyInfo(Coord sz, Widget study)`

- Description: TODO

#### `private void upd()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `private void buy()`

- Description: TODO

#### `private void reset()`

- Description: TODO

#### `public SAttrWnd(Glob glob)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO
