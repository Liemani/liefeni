# SSearchBox

This file documents the responsibilities and members of `SSearchBox`.

## Meta

- Source: [SSearchBox.java](../../../src/haven/SSearchBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a styled search box widget.

## Members

### Constants

### Fields

#### `public String searching = null`

- Description: TODO

#### `private List<I> filtered = null`

- Description: TODO

#### `private Text info`

- Description: TODO

### Methods

#### `protected abstract List<? extends I> allitems()`

- Description: TODO

#### `protected abstract boolean searchmatch(I item, String text)`

- Description: TODO

#### `protected List<? extends I> items()`

- Description: TODO

#### `public SSearchBox(Coord sz, int itemh, int marg)`

- Description: TODO

#### `public SSearchBox(Coord sz, int itemh)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `private void updinfo()`

- Description: TODO

#### `public void search(String text)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void stopsearch()`

- Description: TODO

#### `public void lostfocus()`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO
