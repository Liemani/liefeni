# Equipory

This file documents the responsibilities and members of `Equipory`.

## Meta

- Source: [Equipory.java](../../../src/haven/Equipory.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the equipory Haven component.

## Nested Types

### $_

- Role: Represents $ within Equipory.
- Description: Describes the nested $  type used by the enclosing class.

### SlotInfo

- Role: Represents slot info within Equipory.
- Description: Describes the nested slot info type used by the enclosing class.

## Members

### Constants

#### `private static final Resource.Image bgi = Resource.loadrimg("gfx/hud/equip/bg")`
- Role: Defines the shared bgi constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int yo = Inventory.sqsz.y, sh = 11`
- Role: Defines the shared yo constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int yo = Inventory.sqsz.y, sh = 11`
- Role: Defines the shared yo constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex bg = new TexI(PUtils.uiscale(bgi.img, Coord.of((sh * yo * bgi.sz.x) / bgi.sz.y, sh * yo)))`
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int rx = invsq.sz().x + bg.sz().x`
- Role: Defines the shared rx constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord bgc = new Coord(invsq.sz().x, 0)`
- Role: Defines the shared bgc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord ecoords[] =`
- Role: Defines the shared equipory constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex[] ebgs = new Tex[ecoords.length]`
- Role: Defines the shared ebgs constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text[] etts = new Text[ecoords.length]`
- Role: Defines the shared etts constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `static Coord isz`
- Role: Stores the isz value.
- Description: Backs the cached state for this file.

#### `Map<GItem, Collection<WItem>> wmap = new HashMap<>()`
- Role: Caches wmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Avaview ava`
- Role: Holds the ava state.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public Equipory(long gobid)`
- Role: Creates a new Equipory instance.
- Description: Constructs the instance and initializes its default state.

#### `public int slots()`
- Role: Performs slots.
- Description: Supports the slots operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void cdestroy(Widget w)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public int epat(Coord c)`
- Role: Performs epat.
- Description: Supports the epat operation used by the surrounding class.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public void drawslots(GOut g)`
- Role: Performs drawslots.
- Description: Supports the drawslots operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.
