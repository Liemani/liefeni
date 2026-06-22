---
source: [SSearchBox.java](../../../../src/haven/SSearchBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# SSearchBox

Adds incremental text search behavior to a scrollable list box.

## Members

### Constants

### Fields

#### `public String searching = null`
- Role: Stores the active search text.
- Description: Null when search mode is off.

#### `private List<I> filtered = null`
- Role: Stores the filtered item list.
- Description: Holds the current search results while search mode is active.

#### `private Text info`
- Role: Stores the search result summary text.
- Description: Rendered as the `matches/total` overlay while searching.

### Methods

#### `protected abstract List<? extends I> allitems()`
- Role: Returns the complete item list.
- Description: Implemented by subclasses to supply all searchable items.

#### `protected abstract boolean searchmatch(I item, String text)`
- Role: Tests whether one item matches the search text.
- Description: Implemented by subclasses with their own matching rules.

#### `protected List<? extends I> items()`
- Role: Returns the active item list.
- Description: Switches between the full list and the filtered search results.

#### `public SSearchBox(Coord sz, int itemh, int marg)`
- Role: Creates a searchable list box.
- Description: Configures the list size and item height, then enables focus.

#### `public SSearchBox(Coord sz, int itemh)`
- Role: Creates a searchable list box with no margin.
- Description: Convenience constructor that defaults the margin to zero.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Handles keyboard input for the search box.

#### `private void updinfo()`
- Role: Rebuilds the search summary text.
- Description: Shows the active query and result counts.

#### `public void search(String text)`
- Role: Filters the list by search text.
- Description: Recomputes results, preserves selection when possible, and updates the overlay text.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Renders the search box, filtered items, and info text.

#### `public void stopsearch()`
- Role: Clears the active search.
- Description: Restores the full item list and drops the summary overlay.

#### `public void lostfocus()`
- Role: Ends search mode when focus leaves the widget.
- Description: Search is always canceled on focus loss.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Handles item selection and click focus inside the search box.
