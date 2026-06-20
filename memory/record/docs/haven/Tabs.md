---
source: [Tabs.java](../../../src/haven/Tabs.java)
created: 2026-06-13
updated: 2026-06-14
---

# Tabs

Represents the tabs Haven component.

## Nested Types

### Tab

- Role: Represents tab within Tabs.
- Description: Describes the nested tab type used by the enclosing class.

### TabButton

- Role: Represents tab button within Tabs.
- Description: Describes the nested tab button type used by the enclosing class.

## Members

### Constants

### Fields

#### `public Widget parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public Coord c, sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public Coord c, sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public Tab curtab = null`
- Role: Holds the curtab state.
- Description: Backs the cached state for this file.

#### `public Collection<Tab> tabs = new LinkedList<Tab>()`
- Role: Caches tabs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public TabButton btn`
- Role: Holds the btn state.
- Description: Backs the cached state for this file.

#### `public final Tab tab`
- Role: Holds the tab state.
- Description: Backs the cached state for this file.

### Methods

#### `public Tabs(Coord c, Coord sz, Widget parent)`
- Role: Creates a new Tabs instance.
- Description: Constructs the instance and initializes its default state.

#### `public Tab()`
- Role: Performs tab.
- Description: Supports the tab operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void showtab()`
- Role: Performs showtab.
- Description: Supports the showtab operation used by the surrounding class.

#### `public Tab add()`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public TabButton(int w, String text, Tab tab)`
- Role: Performs tab button.
- Description: Supports the tab button operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public void showtab(Tab tab)`
- Role: Performs showtab.
- Description: Supports the showtab operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public Coord contentsz()`
- Role: Performs contentsz.
- Description: Supports the contentsz operation used by the surrounding class.

#### `public void pack()`
- Role: Performs pack.
- Description: Supports the pack operation used by the surrounding class.

#### `public void indpack()`
- Role: Performs indpack.
- Description: Supports the indpack operation used by the surrounding class.

#### `public void changed(Tab from, Tab to)`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.
