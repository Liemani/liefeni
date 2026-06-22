---
source: [Tabs.java](../../../../src/haven/Tabs.java)
created: 2026-06-13
updated: 2026-06-14
---

# Tabs

Represents the tabs Haven component.

## Nested Types

### Tab

- Role: Hosts one tab page.
- Description: Tab widget that is shown or hidden by the parent Tabs controller.

### TabButton

- Role: Switches to one tab page.
- Description: Button that activates the associated tab when clicked.

## Members

### Constants

### Fields

#### `public Widget parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `public Coord c, sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `public Coord c, sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `public Tab curtab = null`
- Role: Caches the curtab value.
- Description: Caches the `curtab` value for reuse.

#### `public Collection<Tab> tabs = new LinkedList<Tab>()`
- Role: Implements the tabs operation.
- Description: Implements the public collection<tab> tabs = new linked list<tab>() operation.

#### `public TabButton btn`
- Role: Caches the btn value.
- Description: Caches the `btn` value for reuse.

#### `public final Tab tab`
- Role: Caches the tab value.
- Description: Caches the `tab` value for reuse.

### Methods

#### `public Tabs(Coord c, Coord sz, Widget parent)`
- Role: Creates a new Tabs instance.
- Description: Constructs the Tabs instance from the supplied inputs.

#### `public Tab()`
- Role: Handles the tab path.
- Description: Implements the tab operation.

#### `public void destroy()`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.

#### `public void showtab()`
- Role: Handles the showtab path.
- Description: Implements the showtab operation.

#### `public Tab add()`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public TabButton(int w, String text, Tab tab)`
- Role: Handles the tab button path.
- Description: Implements the tab button operation.

#### `public void click()`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `public void showtab(Tab tab)`
- Role: Handles the showtab path.
- Description: Implements the showtab operation.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public Coord contentsz()`
- Role: Handles the contentsz path.
- Description: Implements the contentsz operation.

#### `public void pack()`
- Role: Handles the pack path.
- Description: Implements the pack operation.

#### `public void indpack()`
- Role: Handles the indpack path.
- Description: Implements the indpack operation.

#### `public void changed(Tab from, Tab to)`
- Role: Handles the changed path.
- Description: Implements the changed operation.