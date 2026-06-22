---
source: [MenuSearch.java](../../../../src/haven/MenuSearch.java)
created: 2026-06-13
updated: 2026-06-14
---

# MenuSearch

Represents the menu search Haven component.

## Nested Types

### Result

- Role: Represents one menu search result.
- Description: Result row that binds a paginated menu button to its searchable label state.

### Results

- Role: Renders the result list.
- Description: Scrollable list widget that displays menu-search matches and selection state.

## Members

### Constants

#### `private static final Text.Foundry elf = CharWnd.attrf`
- Role: Caches the elf value.
- Description: Caches the `elf` value for reuse.
- Value: `CharWnd.attrf`

#### `private static final int elh = elf.height() + UI.scale(2)`
- Role: Implements the elh operation.
- Description: Implements the scale operation.
- Value: `elf.height() + UI.scale(2)`

### Fields

#### `public final MenuGrid menu`
- Role: Caches the menu value.
- Description: Caches the `menu` value for reuse.

#### `public final Results rls`
- Role: Caches the rls value.
- Description: Caches the `rls` value for reuse.

#### `public final TextEntry sbox`
- Role: Caches the sbox value.
- Description: Caches the `sbox` value for reuse.

#### `private Pagina root`
- Role: Caches the root value.
- Description: Keeps the root event so acceptance can be reported back.

#### `private List<Result> cur = Collections.emptyList()`
- Role: Implements the cur operation.
- Description: Implements the empty list operation.

#### `private List<Result> filtered = Collections.emptyList()`
- Role: Implements the filtered operation.
- Description: Implements the empty list operation.

#### `private boolean recons = false`
- Role: Tracks the recons flag.
- Description: Caches the `recons` value for reuse.

#### `public final PagButton btn`
- Role: Caches the btn value.
- Description: Caches the `btn` value for reuse.

### Methods

#### `private Result(PagButton btn)`
- Role: Handles the result path.
- Description: Implements the result operation.

#### `private Results(Coord sz)`
- Role: Handles the results path.
- Description: Implements the results operation.

#### `protected List<Result> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Widget makeitem(Result el, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public MenuSearch(MenuGrid menu)`
- Role: Creates a new MenuSearch instance.
- Description: Constructs the MenuSearch instance from the supplied inputs.

#### `private void refilter()`
- Role: Handles the refilter path.
- Description: Implements the refilter operation.

#### `private void updlist()`
- Role: Handles the updlist path.
- Description: Implements the updlist operation.

#### `public void setroot(Pagina nr)`
- Role: Handles the setroot path.
- Description: Updates the root.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.