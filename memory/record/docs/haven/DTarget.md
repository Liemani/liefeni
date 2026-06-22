---
source: [DTarget.java](../../../../src/haven/DTarget.java)
created: 2026-06-13
updated: 2026-06-14
---

# DTarget

Represents the dtarget Haven component.

## Members

### Constants

### Fields

#### `public final ItemDrag src`
- Role: Caches the src value.
- Description: Carries the source drag widget that started the item interaction.

#### `public final ItemEvent root`
- Role: Caches the root value.
- Description: Keeps the root item event so acceptance can be reported back.

#### `public boolean handled`
- Role: Tracks the handled flag.
- Description: Tracks whether a drop or interaction was consumed.

### Methods

#### `public default boolean drop(Coord cc, Coord ul)`
- Role: Handles the drop path.
- Description: Dispatches a drop event using the widget-local and source-local coordinates.

#### `public default boolean iteminteract(Coord cc, Coord ul)`
- Role: Handles the iteminteract path.
- Description: Dispatches an item interaction event using the widget-local and source-local coordinates.

#### `public default boolean drop(Drop ev)`
- Role: Handles the drop path.
- Description: Reuses the event coordinate to dispatch a drop.

#### `public default boolean iteminteract(Interact ev)`
- Role: Handles the iteminteract path.
- Description: Reuses the event coordinate to dispatch an item interaction.

#### `public ItemEvent(Coord c, ItemDrag src)`
- Role: Captures an item drag event.
- Description: Captures the item drag event at the current coordinate.

#### `public ItemEvent(ItemEvent from, Coord c)`
- Role: Clones an item drag event for child dispatch.
- Description: Reuses the source drag widget while moving the event to a child widget.

#### `public Drop(Coord c, ItemDrag src)`
- Role: Dispatches a drop event.
- Description: Creates a dispatchable drop event for item targets.

#### `public Drop(Drop from, Coord c)`
- Role: Clones a drop event for child dispatch.
- Description: Reuses the parent drop event while shifting to child coordinates.

#### `public Drop derive(Coord c)`
- Role: Handles the derive path.
- Description: Clones the drop event at a new widget-local coordinate.

#### `protected boolean shandle(Widget w)`
- Role: Handles the shandle path.
- Description: Lets widgets other than the source drag consume the drop event.

#### `public Interact(Coord c, ItemDrag src)`
- Role: Handles the interact path.
- Description: Creates a dispatchable item-interaction event.

#### `public Interact(Interact from, Coord c)`
- Role: Handles the interact path.
- Description: Reuses the source drag widget while moving the event to a child widget.

#### `public Interact derive(Coord c)`
- Role: Handles the derive path.
- Description: Clones the interaction event at a new widget-local coordinate.

#### `protected boolean shandle(Widget w)`
- Role: Handles the shandle path.
- Description: Lets widgets other than the source drag consume the interaction event.
