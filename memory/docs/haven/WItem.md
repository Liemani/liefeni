# WItem

This file documents the responsibilities and members of `WItem`.

## Meta

- Source: [WItem.java](../../../src/haven/WItem.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the witem Haven component.

## Nested Types

### ItemTip

- Role: Represents item tip within WItem.
- Description: Describes the nested item tip type used by the enclosing class.

### LongTip

- Role: Represents long tip within WItem.
- Description: Describes the nested long tip type used by the enclosing class.

### ShortTip

- Role: Represents short tip within WItem.
- Description: Describes the nested short tip type used by the enclosing class.

## Members

### Constants

#### `public static final Resource missing = Resource.local().loadwait("gfx/invobjs/missing")`
- Role: Defines the shared missing constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final GItem item`
- Role: Holds the item state.
- Description: Backs the cached state for this file.

#### `private Resource cspr = null`
- Role: Stores the cspr value.
- Description: Backs the cached state for this file.

#### `private Message csdt = Message.nil`
- Role: Holds the csdt state.
- Description: Backs the cached state for this file.

#### `private final List<ItemInfo> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final TexI tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `private double hoverstart`
- Role: Stores the hoverstart value.
- Description: Backs the cached state for this file.

#### `private ItemTip shorttip = null, longtip = null`
- Role: Holds the shorttip state.
- Description: Backs the cached state for this file.

#### `private ItemTip shorttip = null, longtip = null`
- Role: Holds the shorttip state.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> ttinfo = null`
- Role: Caches ttinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final AttrCache<Pipe.Op> rstate = new AttrCache<>(this::info, GItem.RStateInfo.combine)`
- Role: Caches rstate entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final AttrCache<GItem.InfoOverlay<?>[]> itemols = new AttrCache<>(this::info, info ->`
- Role: Caches itemols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final AttrCache<Double> itemmeter = new AttrCache<>(this::info, AttrCache.map1(GItem.MeterInfo.class, minf -> minf::meter))`
- Role: Caches itemmeter entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private GSprite lspr = null`
- Role: Holds the lspr state.
- Description: Backs the cached state for this file.

#### `private Widget lcont = null`
- Role: Stores the lcont value.
- Description: Backs the cached state for this file.

### Methods

#### `public WItem(GItem item)`
- Role: Creates a new WItem instance.
- Description: Constructs the instance and initializes its default state.

#### `public void drawmain(GOut g, GSprite spr)`
- Role: Performs drawmain.
- Description: Supports the drawmain operation used by the surrounding class.

#### `public ItemTip(List<ItemInfo> info, BufferedImage img)`
- Role: Performs item tip.
- Description: Supports the item tip operation used by the surrounding class.

#### `public GItem item()`
- Role: Performs item.
- Description: Supports the item operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public Tex get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public ShortTip(List<ItemInfo> info)`
- Role: Performs short tip.
- Description: Supports the short tip operation used by the surrounding class.

#### `public LongTip(List<ItemInfo> info)`
- Role: Performs long tip.
- Description: Supports the long tip operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `private List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `private Widget contparent()`
- Role: Performs contparent.
- Description: Supports the contparent operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.

#### `public boolean mousehover(MouseHoverEvent ev, boolean on)`
- Role: Performs mousehover.
- Description: Supports the mousehover operation used by the surrounding class.
