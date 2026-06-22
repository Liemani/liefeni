---
source: [ItemDrag.java](../../../../src/haven/ItemDrag.java)
created: 2026-06-13
updated: 2026-06-14
---

# ItemDrag

Represents the item drag Haven component.

## Members

### Constants

### Fields

#### `public Coord doff`
- Role: Caches the doff value.
- Description: Caches the `doff` value for reuse.

### Methods

#### `public ItemDrag(Coord dc, GItem item)`
- Role: Creates a new ItemDrag instance.
- Description: Constructs the ItemDrag instance from the supplied inputs.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void drawmain(GOut g, GSprite spr)`
- Role: Handles the drawmain path.
- Description: Draws the main.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.