# Equipory

This file documents the responsibilities and members of `Equipory`.

## Meta

- Source: [Equipory.java](../../../src/haven/Equipory.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the equipment UI.

## Nested Types

### $_

- Description: TODO

### SlotInfo

- Description: TODO

## Members

### Constants

#### `private static final Resource.Image bgi = Resource.loadrimg("gfx/hud/equip/bg")`

- Description: TODO

#### `private static final int yo = Inventory.sqsz.y, sh = 11`

- Description: TODO

#### `private static final int yo = Inventory.sqsz.y, sh = 11`

- Description: TODO

#### `private static final Tex bg = new TexI(PUtils.uiscale(bgi.img, Coord.of((sh * yo * bgi.sz.x) / bgi.sz.y, sh * yo)))`

- Description: TODO

#### `private static final int rx = invsq.sz().x + bg.sz().x`

- Description: TODO

#### `public static final Coord bgc = new Coord(invsq.sz().x, 0)`

- Description: TODO

#### `public static final Coord ecoords[] =`

- Description: TODO

#### `public static final Tex[] ebgs = new Tex[ecoords.length]`

- Description: TODO

#### `public static final Text[] etts = new Text[ecoords.length]`

- Description: TODO

### Fields

#### `static Coord isz`

- Description: TODO

#### `Map<GItem, Collection<WItem>> wmap = new HashMap<>()`

- Description: TODO

#### `private final Avaview ava`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public Equipory(long gobid)`

- Description: TODO

#### `public int slots()`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public void cdestroy(Widget w)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public int epat(Coord c)`

- Description: TODO

#### `public boolean drop(Coord cc, Coord ul)`

- Description: TODO

#### `public void drawslots(GOut g)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean iteminteract(Coord cc, Coord ul)`

- Description: TODO
