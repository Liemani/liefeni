---
source: [ItemDrag.java](../../../src/haven/ItemDrag.java)
created: 2026-06-13
updated: 2026-06-14
---

# ItemDrag

Represents the item drag Haven component.

## Members

### Constants

### Fields

#### `public Coord doff`
- Role: Stores the doff value.
- Description: Backs the cached state for this file.

### Methods

#### `public ItemDrag(Coord dc, GItem item)`
- Role: Creates a new ItemDrag instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void drawmain(GOut g, GSprite spr)`
- Role: Performs drawmain.
- Description: Supports the drawmain operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.
