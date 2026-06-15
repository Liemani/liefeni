# Scrollport

This file documents the responsibilities and members of `Scrollport`.

## Meta

- Source: [Scrollport.java](../../../src/haven/Scrollport.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a scrollable viewport.

## Nested Types

### $_

- Description: TODO

### Scrollcont

- Description: TODO

## Members

### Constants

### Fields

#### `public final Scrollbar bar`

- Description: TODO

#### `public final Scrollcont cont`

- Description: TODO

#### `public int sy = 0`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Scrollport(Coord sz)`

- Description: TODO

#### `public Scrollcont(Coord sz)`

- Description: TODO

#### `public void update()`

- Description: TODO

#### `public <T extends Widget> T add(T child)`

- Description: TODO

#### `public Coord xlate(Coord c, boolean in)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public void resize(Coord nsz)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO
