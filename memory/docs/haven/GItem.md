# GItem

This file documents the responsibilities and members of `GItem`.

## Meta

- Source: [GItem.java](../../../src/haven/GItem.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a game item widget or object.

## Nested Types

### $_

- Description: TODO

### Amount

- Description: TODO

### ColorInfo

- Description: TODO

### ContentsInfo

- Description: TODO

### ContentsWindow

- Description: TODO

### HoverDeco

- Description: TODO

### InfoOverlay

- Description: TODO

### MeterInfo

- Description: TODO

### NumberInfo

- Description: TODO

### OverlayInfo

- Description: TODO

### RStateInfo

- Description: TODO

## Members

### Constants

#### `public static final Function<List<ItemInfo>, Supplier<Pipe.Op>> combine = info ->`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<GItem> ctxr = new OwnerContext.ClassResolver<GItem>()`

- Description: TODO

#### `public static final Coord hovermarg = UI.scale(12, 12)`

- Description: TODO

#### `public static final Tex bg = Window.bg`

- Description: TODO

#### `public static final IBox box = Window.wbox`

- Description: TODO

#### `public static final Coord overlap = UI.scale(2, 2)`

- Description: TODO

### Fields

#### `public Indir<Resource> res`

- Description: TODO

#### `public MessageBuf sdt`

- Description: TODO

#### `public int meter = 0`

- Description: TODO

#### `public int num = -1`

- Description: TODO

#### `public Widget contents = null`

- Description: TODO

#### `public String contentsnm = null`

- Description: TODO

#### `public Object contentsid = null`

- Description: TODO

#### `public ContentsWindow contentswnd = null`

- Description: TODO

#### `public int infoseq`

- Description: TODO

#### `private Widget hovering`

- Description: TODO

#### `private boolean hoverset`

- Description: TODO

#### `private GSprite spr`

- Description: TODO

#### `private ItemInfo.Raw rawinfo`

- Description: TODO

#### `private List<ItemInfo> info = Collections.emptyList()`

- Description: TODO

#### `public final OverlayInfo<T> inf`

- Description: TODO

#### `public final T data`

- Description: TODO

#### `private final int num`

- Description: TODO

#### `private Random rnd = null`

- Description: TODO

#### `private int lastcontseq`

- Description: TODO

#### `private List<Pair<GItem, Integer>> lastcontinfo = null`

- Description: TODO

#### `public Area ca`

- Description: TODO

#### `private UI.Grab dm = null`

- Description: TODO

#### `private Coord doff`

- Description: TODO

#### `public final GItem cont`

- Description: TODO

#### `public final Widget inv`

- Description: TODO

#### `private final Object id`

- Description: TODO

#### `private Coord psz = null`

- Description: TODO

#### `private String st`

- Description: TODO

#### `private boolean hovering`

- Description: TODO

#### `private Coord lc = null`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Pipe.Op rstate()`

- Description: TODO

#### `public Color olcol()`

- Description: TODO

#### `public default Pipe.Op rstate()`

- Description: TODO

#### `public T overlay()`

- Description: TODO

#### `public void drawoverlay(GOut g, T data)`

- Description: TODO

#### `public InfoOverlay(OverlayInfo<T> inf)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public static <S> InfoOverlay<S> create(OverlayInfo<S> inf)`

- Description: TODO

#### `public int itemnum()`

- Description: TODO

#### `public default Color numcolor()`

- Description: TODO

#### `public default Tex overlay()`

- Description: TODO

#### `public default void drawoverlay(GOut g, Tex tex)`

- Description: TODO

#### `public static BufferedImage numrender(int num, Color col)`

- Description: TODO

#### `public double meter()`

- Description: TODO

#### `public Amount(Owner owner, int num)`

- Description: TODO

#### `public int itemnum()`

- Description: TODO

#### `public GItem(Indir<Resource> res, Message sdt)`

- Description: TODO

#### `public GItem(Indir<Resource> res)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public GSprite spr()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public Resource resource()`

- Description: TODO

#### `public GSprite sprite()`

- Description: TODO

#### `public void uimsg(String name, Object... args)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public void propagate(List<ItemInfo> buf, ItemInfo.Owner outer)`

- Description: TODO

#### `private void updcontinfo()`

- Description: TODO

#### `private void addcontinfo(List<ItemInfo> buf)`

- Description: TODO

#### `private Widget contparent()`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `public void hovering(Widget hovering)`

- Description: TODO

#### `public void iresize(Coord isz)`

- Description: TODO

#### `public Area contarea()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean checkhit(Coord c)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public ContentsWindow(GItem cont, Widget inv)`

- Description: TODO

#### `private void chstate(String nst)`

- Description: TODO

#### `private void ckhover()`

- Description: TODO

#### `private void ckunhover()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public void cdestroy(Widget w)`

- Description: TODO

#### `public boolean mousehover(MouseHoverEvent ev, boolean on)`

- Description: TODO

#### `public void wndshow(boolean show)`

- Description: TODO

#### `public void describe()`

- Description: TODO

#### `public String resourceName()`

- Description: TODO

#### `public boolean isResourceNameEndsWith(String suffix)`

- Description: TODO

#### `public boolean isString()`

- Description: TODO

#### `public void transfer()`

- Description: TODO
