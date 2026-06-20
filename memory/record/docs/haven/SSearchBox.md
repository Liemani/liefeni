---
source: [SSearchBox.java](../../../src/haven/SSearchBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# SSearchBox

Represents the ssearch box Haven component.

## Members

### Constants

### Fields

#### `public String searching = null`
- Role: Stores the searching value.
- Description: Backs the cached state for this file.

#### `private List<I> filtered = null`
- Role: Caches filtered entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Text info`
- Role: Stores the info value.
- Description: Backs the cached state for this file.

### Methods

#### `protected abstract List<? extends I> allitems()`
- Role: Performs allitems.
- Description: Supports the allitems operation used by the surrounding class.

#### `protected abstract boolean searchmatch(I item, String text)`
- Role: Performs searchmatch.
- Description: Supports the searchmatch operation used by the surrounding class.

#### `protected List<? extends I> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `public SSearchBox(Coord sz, int itemh, int marg)`
- Role: Creates a new SSearchBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public SSearchBox(Coord sz, int itemh)`
- Role: Creates a new SSearchBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `private void updinfo()`
- Role: Performs updinfo.
- Description: Supports the updinfo operation used by the surrounding class.

#### `public void search(String text)`
- Role: Performs search.
- Description: Supports the search operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void stopsearch()`
- Role: Performs stopsearch.
- Description: Supports the stopsearch operation used by the surrounding class.

#### `public void lostfocus()`
- Role: Performs lostfocus.
- Description: Supports the lostfocus operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.
