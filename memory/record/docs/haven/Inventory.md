---
source: [Inventory.java](../../../../src/haven/Inventory.java)
created: 2026-06-13
updated: 2026-06-14
---

# Inventory

Represents the inventory Haven component.

## Nested Types

### $_

- Role: Registers the `inv` widget factory.
- Description: Creates an inventory widget from size arguments.

## Members

### Constants

#### `public static final Coord sqsz = UI.scale(new Coord(32, 32)).add(1, 1)`
- Role: Implements the sqsz operation.
- Description: Adds the supplied value.
- Value: `UI.scale(new Coord(32, 32)).add(1, 1)`

#### `public static final Tex invsq`
#### `public static final Tex invsq`
- Role: Caches the invsq value.
- Description: Caches the `invsq` value for reuse.

### Fields

#### `public boolean dropul = true`
- Role: Tracks the dropul flag.
- Description: Caches the `dropul` value for reuse.

#### `public Coord isz`
- Role: Caches the isz value.
- Description: Caches the `isz` value for reuse.

#### `public boolean[] sqmask = null`
- Role: Tracks the sqmask flag.
- Description: Caches the `sqmask` value for reuse.

#### `Map<GItem, WItem> wmap = new HashMap<GItem, WItem>()`
- Role: Implements the wmap operation.
- Description: Implements the map<g item, w item> wmap = new hash map<g item, w item>() operation.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Inventory content.

#### `public Inventory(Coord sz)`
- Role: Creates a new Inventory instance.
- Description: Constructs the Inventory instance from the supplied inputs.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public void cdestroy(Widget w)`
- Role: Handles the cdestroy path.
- Description: Implements the cdestroy operation.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Handles the iteminteract path.
- Description: Implements the iteminteract operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.