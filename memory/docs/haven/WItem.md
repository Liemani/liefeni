# WItem

This file documents the responsibilities and members of `WItem`.

## Meta

- Source: [WItem.java](../../../src/haven/WItem.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an inventory widget item.

## Nested Types

### ItemTip

- Description: TODO

### LongTip

- Description: TODO

### ShortTip

- Description: TODO

## Members

### Constants

#### `public static final Resource missing = Resource.local().loadwait("gfx/invobjs/missing")`

- Description: TODO

### Fields

#### `public final GItem item`

- Description: TODO

#### `private Resource cspr = null`

- Description: TODO

#### `private Message csdt = Message.nil`

- Description: TODO

#### `private final List<ItemInfo> info`

- Description: TODO

#### `private final TexI tex`

- Description: TODO

#### `private double hoverstart`

- Description: TODO

#### `private ItemTip shorttip = null, longtip = null`

- Description: TODO

#### `private ItemTip shorttip = null, longtip = null`

- Description: TODO

#### `private List<ItemInfo> ttinfo = null`

- Description: TODO

#### `public final AttrCache<Pipe.Op> rstate = new AttrCache<>(this::info, GItem.RStateInfo.combine)`

- Description: TODO

#### `public final AttrCache<GItem.InfoOverlay<?>[]> itemols = new AttrCache<>(this::info, info ->`

- Description: TODO

#### `public final AttrCache<Double> itemmeter = new AttrCache<>(this::info, AttrCache.map1(GItem.MeterInfo.class, minf -> minf::meter))`

- Description: TODO

#### `private GSprite lspr = null`

- Description: TODO

#### `private Widget lcont = null`

- Description: TODO

### Methods

#### `public WItem(GItem item)`

- Description: TODO

#### `public void drawmain(GOut g, GSprite spr)`

- Description: TODO

#### `public ItemTip(List<ItemInfo> info, BufferedImage img)`

- Description: TODO

#### `public GItem item()`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public Tex get()`

- Description: TODO

#### `public ShortTip(List<ItemInfo> info)`

- Description: TODO

#### `public LongTip(List<ItemInfo> info)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `private List<ItemInfo> info()`

- Description: TODO

#### `private Widget contparent()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean drop(Coord cc, Coord ul)`

- Description: TODO

#### `public boolean iteminteract(Coord cc, Coord ul)`

- Description: TODO

#### `public boolean mousehover(MouseHoverEvent ev, boolean on)`

- Description: TODO
