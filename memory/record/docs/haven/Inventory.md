---
source: [Inventory.java](../../../src/haven/Inventory.java)
created: 2026-06-13
updated: 2026-06-14
---

# Inventory

Represents the inventory Haven component.

## Nested Types

### $_

- Role: Represents $ within Inventory.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final Coord sqsz = UI.scale(new Coord(32, 32)).add(1, 1)`
- Role: Defines the shared sqsz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex invsq`
- Role: Defines the shared invsq constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public boolean dropul = true`
- Role: Tracks the dropul flag.
- Description: Supports the dropul operation used by the surrounding class.

#### `public Coord isz`
- Role: Stores the isz value.
- Description: Backs the cached state for this file.

#### `public boolean[] sqmask = null`
- Role: Tracks the sqmask flag.
- Description: Supports the sqmask operation used by the surrounding class.

#### `Map<GItem, WItem> wmap = new HashMap<GItem, WItem>()`
- Role: Caches wmap entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Inventory(Coord sz)`
- Role: Creates a new Inventory instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void cdestroy(Widget w)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
