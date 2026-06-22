---
source: [Equipory.java](../../../../src/haven/Equipory.java)
created: 2026-06-13
updated: 2026-06-14
---

# Equipory

Represents the equipory Haven component.

## Nested Types

### $_

- Role: Registers the equipment window widget resource.
- Description: Factory that creates an Equipory widget for the requested gob.

### SlotInfo

- Role: Reports item slot usage.
- Description: Interface for item info entries that expose how many equipment slots they occupy.

## Members

### Constants

#### `private static final Resource.Image bgi = Resource.loadrimg("gfx/hud/equip/bg")`
- Role: Implements the bgi operation.
- Description: Implements the loadrimg operation.
- Value: `Resource.loadrimg("gfx/hud/equip/bg")`

#### `private static final int yo = Inventory.sqsz.y, sh = 11`
- Role: Caches the yo value.
- Description: Caches the `yo` value for reuse.
- Value: `Inventory.sqsz.y, sh = 11`

#### `private static final int yo = Inventory.sqsz.y, sh = 11`
- Role: Caches the yo value.
- Description: Caches the `yo` value for reuse.
- Value: `Inventory.sqsz.y, sh = 11`

#### `private static final Tex bg = new TexI(PUtils.uiscale(bgi.img, Coord.of((sh * yo * bgi.sz.x) / bgi.sz.y, sh * yo)))`
- Role: Implements the bg operation.
- Description: Implements the of operation.
- Value: `new TexI(PUtils.uiscale(bgi.img, Coord.of((sh * yo * bgi.sz.x) / bgi.sz.y, sh * yo)))`

#### `private static final int rx = invsq.sz().x + bg.sz().x`
- Role: Implements the rx operation.
- Description: Implements the sz operation.
- Value: `invsq.sz().x + bg.sz().x`

#### `public static final Coord bgc = new Coord(invsq.sz().x, 0)`
- Role: Implements the bgc operation.
- Description: Implements the sz operation.
- Value: `new Coord(invsq.sz().x, 0)`

#### `public static final Coord ecoords[] =`
- Role: Caches the ecoords[] value.
- Description: Caches the `ecoords[]` value for reuse.
- Value: ``

#### `public static final Tex[] ebgs = new Tex[ecoords.length]`
- Role: Caches the ebgs value.
- Description: Caches the `ebgs` value for reuse.
- Value: `new Tex[ecoords.length]`

#### `public static final Text[] etts = new Text[ecoords.length]`
- Role: Caches the etts value.
- Description: Caches the `etts` value for reuse.
- Value: `new Text[ecoords.length]`

### Fields

#### `static Coord isz`
- Role: Caches the isz value.
- Description: Caches the `isz` value for reuse.

#### `Map<GItem, Collection<WItem>> wmap = new HashMap<>()`
- Role: Implements the wmap operation.
- Description: Implements the map<g item, collection<w item>> wmap = new hash map<>() operation.

#### `private final Avaview ava`
- Role: Caches the ava value.
- Description: Caches the `ava` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public Equipory(long gobid)`
- Role: Creates a new Equipory instance.
- Description: Constructs the Equipory instance from the supplied inputs.

#### `public int slots()`
- Role: Handles the slots path.
- Description: Implements the slots operation.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public void cdestroy(Widget w)`
- Role: Handles the cdestroy path.
- Description: Implements the cdestroy operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public int epat(Coord c)`
- Role: Handles the epat path.
- Description: Implements the epat operation.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `public void drawslots(GOut g)`
- Role: Handles the drawslots path.
- Description: Draws the slots.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Equipory content.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Handles the iteminteract path.
- Description: Implements the iteminteract operation.