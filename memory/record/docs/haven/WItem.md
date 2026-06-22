---
source: [WItem.java](../../../../src/haven/WItem.java)
created: 2026-06-13
updated: 2026-06-14
---

# WItem

Represents the witem Haven component.

## Nested Types

### ItemTip

- Role: Wraps an item tooltip image.
- Description: Tooltip adapter that memoizes the rendered item-info image for a GItem.

### LongTip

- Role: Renders the long item tooltip.
- Description: Tooltip variant that uses the full item-info rendering after the hover delay.

### ShortTip

- Role: Renders the short item tooltip.
- Description: Tooltip variant that uses the compact item-info rendering before the hover delay expires.

## Members

### Constants

#### `public static final Resource missing = Resource.local().loadwait("gfx/invobjs/missing")`
- Role: Implements the missing operation.
- Description: Implements the loadwait operation.
- Value: `Resource.local().loadwait("gfx/invobjs/missing")`

### Fields

#### `public final GItem item`
- Role: Caches the item value.
- Description: Caches the `item` value for reuse.

#### `private Resource cspr = null`
- Role: Caches the cspr value.
- Description: Caches the `cspr` value for reuse.

#### `private Message csdt = Message.nil`
- Role: Caches the csdt value.
- Description: Caches the `csdt` value for reuse.

#### `private final List<ItemInfo> info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `private final TexI tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `private double hoverstart`
- Role: Caches the hoverstart value.
- Description: Caches the `hoverstart` value for reuse.

#### `private ItemTip shorttip = null, longtip = null`
- Role: Caches the shorttip value.
- Description: Caches the `shorttip` value for reuse.

#### `private ItemTip shorttip = null, longtip = null`
- Role: Caches the shorttip value.
- Description: Caches the `shorttip` value for reuse.

#### `private List<ItemInfo> ttinfo = null`
- Role: Caches the ttinfo value.
- Description: Caches the `ttinfo` value for reuse.

#### `public final AttrCache<Pipe.Op> rstate = new AttrCache<>(this::info, GItem.RStateInfo.combine)`
- Role: Implements the rstate operation.
- Description: Implements the public final attr cache<pipe.op> rstate = new attr cache<>(this::info, g item.r state info.combine) operation.

#### `public final AttrCache<GItem.InfoOverlay<?>[]> itemols = new AttrCache<>(this::info, info ->`
- Role: Implements the itemols operation.
- Description: Implements the public final attr cache<g item.info overlay<?>[]> itemols = new attr cache<>(this::info, info -> operation.

#### `public final AttrCache<Double> itemmeter = new AttrCache<>(this::info, AttrCache.map1(GItem.MeterInfo.class, minf -> minf::meter))`
- Role: Implements the itemmeter operation.
- Description: Implements the map1 operation.

#### `private GSprite lspr = null`
- Role: Caches the lspr value.
- Description: Caches the `lspr` value for reuse.

#### `private Widget lcont = null`
- Role: Caches the lcont value.
- Description: Caches the `lcont` value for reuse.

### Methods

#### `public WItem(GItem item)`
- Role: Creates a new WItem instance.
- Description: Constructs the WItem instance from the supplied inputs.

#### `public void drawmain(GOut g, GSprite spr)`
- Role: Handles the drawmain path.
- Description: Draws the main.

#### `public ItemTip(List<ItemInfo> info, BufferedImage img)`
- Role: Handles the item tip path.
- Description: Implements the item tip operation.

#### `public GItem item()`
- Role: Handles the item path.
- Description: Implements the item operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public Tex get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public ShortTip(List<ItemInfo> info)`
- Role: Handles the short tip path.
- Description: Implements the short tip operation.

#### `public LongTip(List<ItemInfo> info)`
- Role: Handles the long tip path.
- Description: Implements the long tip operation.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `private List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `private Widget contparent()`
- Role: Handles the contparent path.
- Description: Implements the contparent operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the WItem content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Handles the iteminteract path.
- Description: Implements the iteminteract operation.

#### `public boolean mousehover(MouseHoverEvent ev, boolean on)`
- Role: Handles the mousehover path.
- Description: Updates hover state and tooltip selection for minimap content.