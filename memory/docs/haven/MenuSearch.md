# MenuSearch

This file documents the responsibilities and members of `MenuSearch`.

## Meta

- Source: [MenuSearch.java](../../../src/haven/MenuSearch.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the menu search Haven component.

## Nested Types

### Result

- Role: Represents result within MenuSearch.
- Description: Describes the nested result type used by the enclosing class.

### Results

- Role: Represents results within MenuSearch.
- Description: Describes the nested results type used by the enclosing class.

## Members

### Constants

#### `private static final Text.Foundry elf = CharWnd.attrf`
- Role: Defines the shared elf constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int elh = elf.height() + UI.scale(2)`
- Role: Defines the shared elh constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final MenuGrid menu`
- Role: Stores the menu value.
- Description: Backs the cached state for this file.

#### `public final Results rls`
- Role: Holds the rls state.
- Description: Backs the cached state for this file.

#### `public final TextEntry sbox`
- Role: Stores the sbox value.
- Description: Backs the cached state for this file.

#### `private Pagina root`
- Role: Holds the root state.
- Description: Backs the cached state for this file.

#### `private List<Result> cur = Collections.emptyList()`
- Role: Caches cur entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<Result> filtered = Collections.emptyList()`
- Role: Caches filtered entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean recons = false`
- Role: Tracks the recons flag.
- Description: Supports the recons operation used by the surrounding class.

#### `public final PagButton btn`
- Role: Holds the btn state.
- Description: Backs the cached state for this file.

### Methods

#### `private Result(PagButton btn)`
- Role: Performs result.
- Description: Supports the result operation used by the surrounding class.

#### `private Results(Coord sz)`
- Role: Performs results.
- Description: Supports the results operation used by the surrounding class.

#### `protected List<Result> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Widget makeitem(Result el, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public MenuSearch(MenuGrid menu)`
- Role: Creates a new MenuSearch instance.
- Description: Constructs the instance and initializes its default state.

#### `private void refilter()`
- Role: Performs refilter.
- Description: Supports the refilter operation used by the surrounding class.

#### `private void updlist()`
- Role: Performs updlist.
- Description: Supports the updlist operation used by the surrounding class.

#### `public void setroot(Pagina nr)`
- Role: Performs setroot.
- Description: Supports the setroot operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.
