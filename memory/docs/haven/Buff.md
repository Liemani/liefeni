# Buff

This file documents the responsibilities and members of `Buff`.

## Meta

- Source: [Buff.java](../../../src/haven/Buff.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a buff or status effect widget or data type.

## Nested Types

### $_

- Description: TODO

### AMeterInfo

- Description: TODO

### AMeterTip

- Description: TODO

## Members

### Constants

#### `public static final Text.Foundry nfnd = new Text.Foundry(Text.dfont, 10)`

- Description: TODO

#### `public static final Tex frame = Resource.loadtex("gfx/hud/buffs/frame")`

- Description: TODO

#### `public static final Tex cframe = Resource.loadtex("gfx/hud/buffs/cframe")`

- Description: TODO

#### `public static final Tex ameter = Resource.loadtex("gfx/hud/buffs/cframe-m")`

- Description: TODO

#### `public static final Coord imgoff = UI.scale(3, 3)`

- Description: TODO

#### `public static final int ameterx1 = UI.scale(3), ameterx2 = UI.scale(35); /* XXX: Detect? */`

- Description: TODO

#### `public static final int ameterx1 = UI.scale(3), ameterx2 = UI.scale(35); /* XXX: Detect? */`

- Description: TODO

#### `public static final int textw = UI.scale(200)`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<Buff> ctxr = new OwnerContext.ClassResolver<Buff>()`

- Description: TODO

### Fields

#### `public Indir<Resource> res`

- Description: TODO

#### `protected int a = 255`

- Description: TODO

#### `protected boolean dest = false`

- Description: TODO

#### `private ItemInfo.Raw rawinfo = null`

- Description: TODO

#### `private List<ItemInfo> info = Collections.emptyList()`

- Description: TODO

#### `private final AttrCache<Double> ameteri = new AttrCache<>(this::info, AttrCache.map1(AMeterInfo.class, minf -> minf::ameter))`

- Description: TODO

#### `private final AttrCache<Tex> nmeteri = new AttrCache<>(this::info, AttrCache.map1s(GItem.NumberInfo.class, ninf -> new TexI(GItem.NumberInfo.numrender(ninf.itemnum(), ninf.numcolor()))))`

- Description: TODO

#### `private final AttrCache<Double> cmeteri = new AttrCache<>(this::info, AttrCache.map1(GItem.MeterInfo.class, minf -> minf::meter))`

- Description: TODO

#### `private double hoverstart`

- Description: TODO

#### `private Tex shorttip, longtip`

- Description: TODO

#### `private Tex shorttip, longtip`

- Description: TODO

#### `private List<ItemInfo> ttinfo = null`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Buff(Indir<Resource> res)`

- Description: TODO

#### `public Resource resource()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public double ameter()`

- Description: TODO

#### `public AMeterTip(Owner owner)`

- Description: TODO

#### `public void layout(Layout l)`

- Description: TODO

#### `public int order()`

- Description: TODO

#### `public Tip shortvar()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private BufferedImage shorttip()`

- Description: TODO

#### `private BufferedImage longtip()`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public void reqdestroy()`

- Description: TODO

#### `public void move(Coord c, double off)`

- Description: TODO

#### `public void move(Coord c)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO
