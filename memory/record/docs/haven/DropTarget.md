---
source: [DropTarget.java](../../../../src/haven/DropTarget.java)
created: 2026-06-13
updated: 2026-06-14
---

# DropTarget

Represents the drop target Haven component.

## Members

### Constants

### Fields

#### `public final Object thing`
- Role: Caches the thing value.
- Description: Carries the object being dragged or hovered during drop-target dispatch.

#### `public final Hover root`
- Role: Caches the root value.
- Description: Keeps the root hover event so acceptance can be reported back to the original dispatch.

#### `public boolean hovering`
- Role: Tracks the hovering flag.
- Description: Tracks whether the cursor is still hovering during drop dispatch.

#### `public DropTarget tgt`
- Role: Caches the tgt value.
- Description: Stores the target widget that accepted the hover event.

### Methods

#### `public default boolean dropthing(Coord cc, Object thing)`
- Role: Handles the dropthing path.
- Description: Dispatches a drop event at the given coordinate and object.

#### `public default boolean drophover(Coord cc, boolean hovering, Object thing)`
- Role: Handles the drophover path.
- Description: Dispatches a hover event and accepts it when the target claims the hover.

#### `public default boolean dropthing(Drop ev)`
- Role: Handles the dropthing path.
- Description: Reuses the event coordinate and object to dispatch a drop.

#### `public default boolean drophover(Hover ev)`
- Role: Handles the drophover path.
- Description: Reuses the hover event state to dispatch a drop-hover pass.

#### `public DropEvent(Coord c, Object thing)`
- Role: Captures a drop event.
- Description: Captures the drop coordinates together with the dragged object.

#### `public DropEvent(DropEvent from, Coord c)`
- Role: Clones a drop event for child dispatch.
- Description: Reuses the dragged object while moving the event to a child widget.

#### `public Drop(Coord c, Object thing)`
- Role: Dispatches a drop event.
- Description: Creates a dispatchable drop event for the target widget.

#### `public Drop(Drop from, Coord c)`
- Role: Clones a drop event for child dispatch.
- Description: Reuses the parent drop event while shifting to child coordinates.

#### `public Drop derive(Coord c)`
- Role: Handles the derive path.
- Description: Clones the drop event at a new widget-local coordinate.

#### `protected boolean shandle(Widget w)`
- Role: Handles the shandle path.
- Description: Lets widgets that implement `DropTarget` consume the drop event.

#### `public Hover(Coord c, Object thing)`
- Role: Handles the hover path.
- Description: Creates a hover event with the cursor initially marked as inside.

#### `public Hover(Hover from, Coord c)`
- Role: Handles the hover path.
- Description: Reuses the root hover event while shifting to child coordinates.

#### `public Hover derive(Coord c)`
- Role: Handles the derive path.
- Description: Clones the hover event at a new widget-local coordinate.

#### `public Hover hovering(boolean h)`
- Role: Handles the hovering path.
- Description: Updates whether the hover should still be treated as inside.

#### `public boolean accept(DropTarget tgt)`
- Role: Handles the accept path.
- Description: Records the widget that accepted the hover target.

#### `protected boolean propagation(Widget from)`
- Role: Handles the propagation path.
- Description: Propagates hover state through child widgets before the parent sees it.

#### `protected boolean shandle(Widget w)`
- Role: Handles the shandle path.
- Description: Lets a matching widget consume the event.

#### `public static boolean dropthing(Widget wdg, Coord c, Object thing)`
- Role: Handles the dropthing path.
- Description: Dispatches a drop event through the widget tree.

#### `public static boolean drophover(Widget wdg, Coord c, Object thing)`
- Role: Handles the drophover path.
- Description: Dispatches a hover event through the widget tree and reports whether it was accepted.
