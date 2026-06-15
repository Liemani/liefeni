# MenuSearch

This file documents the responsibilities and members of `MenuSearch`.

## Meta

- Source: [MenuSearch.java](../../../src/haven/MenuSearch.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Supports menu search.

## Nested Types

### Result

- Description: TODO

### Results

- Description: TODO

## Members

### Constants

#### `private static final Text.Foundry elf = CharWnd.attrf`

- Description: TODO

#### `private static final int elh = elf.height() + UI.scale(2)`

- Description: TODO

### Fields

#### `public final MenuGrid menu`

- Description: TODO

#### `public final Results rls`

- Description: TODO

#### `public final TextEntry sbox`

- Description: TODO

#### `private Pagina root`

- Description: TODO

#### `private List<Result> cur = Collections.emptyList()`

- Description: TODO

#### `private List<Result> filtered = Collections.emptyList()`

- Description: TODO

#### `private boolean recons = false`

- Description: TODO

#### `public final PagButton btn`

- Description: TODO

### Methods

#### `private Result(PagButton btn)`

- Description: TODO

#### `private Results(Coord sz)`

- Description: TODO

#### `protected List<Result> items()`

- Description: TODO

#### `protected Widget makeitem(Result el, int idx, Coord sz)`

- Description: TODO

#### `public MenuSearch(MenuGrid menu)`

- Description: TODO

#### `private void refilter()`

- Description: TODO

#### `private void updlist()`

- Description: TODO

#### `public void setroot(Pagina nr)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO
