# GItem

This file documents the responsibilities and members of `GItem`.

## Meta

- Source: [GItem.java](../../../src/haven/GItem.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the gitem Haven component.

## Nested Types

### $_

- Role: Represents $ within GItem.
- Description: Describes the nested $  type used by the enclosing class.

### Amount

- Role: Represents amount within GItem.
- Description: Describes the nested amount type used by the enclosing class.

### ColorInfo

- Role: Represents color info within GItem.
- Description: Describes the nested color info type used by the enclosing class.

### ContentsInfo

- Role: Represents contents info within GItem.
- Description: Describes the nested contents info type used by the enclosing class.

### ContentsWindow

- Role: Represents contents window within GItem.
- Description: Describes the nested contents window type used by the enclosing class.

### HoverDeco

- Role: Represents hover deco within GItem.
- Description: Describes the nested hover deco type used by the enclosing class.

### InfoOverlay

- Role: Represents info overlay within GItem.
- Description: Describes the nested info overlay type used by the enclosing class.

### MeterInfo

- Role: Represents meter info within GItem.
- Description: Describes the nested meter info type used by the enclosing class.

### NumberInfo

- Role: Represents number info within GItem.
- Description: Describes the nested number info type used by the enclosing class.

### OverlayInfo

- Role: Represents overlay info within GItem.
- Description: Describes the nested overlay info type used by the enclosing class.

### RStateInfo

- Role: Represents rstate info within GItem.
- Description: Describes the nested rstate info type used by the enclosing class.

## Members

### Constants

#### `public static final Function<List<ItemInfo>, Supplier<Pipe.Op>> combine = info ->`
- Role: Defines the shared combine constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<GItem> ctxr = new OwnerContext.ClassResolver<GItem>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord hovermarg = UI.scale(12, 12)`
- Role: Defines the shared hovermarg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex bg = Window.bg`
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final IBox box = Window.wbox`
- Role: Defines the shared box constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord overlap = UI.scale(2, 2)`
- Role: Defines the shared overlap constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public MessageBuf sdt`
- Role: Holds the sdt state.
- Description: Backs the cached state for this file.

#### `public int meter = 0`
- Role: Stores the meter value.
- Description: Backs the cached state for this file.

#### `public int num = -1`
- Role: Stores the num value.
- Description: Backs the cached state for this file.

#### `public Widget contents = null`
- Role: Stores the contents value.
- Description: Backs the cached state for this file.

#### `public String contentsnm = null`
- Role: Stores the contentsnm value.
- Description: Backs the cached state for this file.

#### `public Object contentsid = null`
- Role: Holds the contentsid state.
- Description: Backs the cached state for this file.

#### `public ContentsWindow contentswnd = null`
- Role: Holds the contentswnd state.
- Description: Backs the cached state for this file.

#### `public int infoseq`
- Role: Stores the infoseq value.
- Description: Backs the cached state for this file.

#### `private Widget hovering`
- Role: Stores the hovering value.
- Description: Backs the cached state for this file.

#### `private boolean hoverset`
- Role: Tracks the hoverset flag.
- Description: Supports the hoverset operation used by the surrounding class.

#### `private GSprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `private ItemInfo.Raw rawinfo`
- Role: Holds the rawinfo state.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> info = Collections.emptyList()`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final OverlayInfo<T> inf`
- Role: Stores the inf value.
- Description: Backs the cached state for this file.

#### `public final T data`
- Role: Holds the data state.
- Description: Backs the cached state for this file.

#### `private final int num`
- Role: Stores the num value.
- Description: Backs the cached state for this file.

#### `private Random rnd = null`
- Role: Holds the rnd state.
- Description: Backs the cached state for this file.

#### `private int lastcontseq`
- Role: Stores the lastcontseq value.
- Description: Backs the cached state for this file.

#### `private List<Pair<GItem, Integer>> lastcontinfo = null`
- Role: Caches lastcontinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Area ca`
- Role: Holds the ca state.
- Description: Backs the cached state for this file.

#### `private UI.Grab dm = null`
- Role: Stores the dm value.
- Description: Backs the cached state for this file.

#### `private Coord doff`
- Role: Stores the doff value.
- Description: Backs the cached state for this file.

#### `public final GItem cont`
- Role: Holds the cont state.
- Description: Backs the cached state for this file.

#### `public final Widget inv`
- Role: Stores the inv value.
- Description: Backs the cached state for this file.

#### `private final Object id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `private Coord psz = null`
- Role: Stores the psz value.
- Description: Backs the cached state for this file.

#### `private String st`
- Role: Stores the st value.
- Description: Backs the cached state for this file.

#### `private boolean hovering`
- Role: Tracks the hovering flag.
- Description: Supports the hovering operation used by the surrounding class.

#### `private Coord lc = null`
- Role: Stores the lc value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Pipe.Op rstate()`
- Role: Performs rstate.
- Description: Supports the rstate operation used by the surrounding class.

#### `public Color olcol()`
- Role: Performs olcol.
- Description: Supports the olcol operation used by the surrounding class.

#### `public default Pipe.Op rstate()`
- Role: Performs rstate.
- Description: Supports the rstate operation used by the surrounding class.

#### `public T overlay()`
- Role: Performs overlay.
- Description: Supports the overlay operation used by the surrounding class.

#### `public void drawoverlay(GOut g, T data)`
- Role: Performs drawoverlay.
- Description: Supports the drawoverlay operation used by the surrounding class.

#### `public InfoOverlay(OverlayInfo<T> inf)`
- Role: Performs info overlay.
- Description: Supports the info overlay operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public static <S> InfoOverlay<S> create(OverlayInfo<S> inf)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public int itemnum()`
- Role: Performs itemnum.
- Description: Supports the itemnum operation used by the surrounding class.

#### `public default Color numcolor()`
- Role: Performs numcolor.
- Description: Supports the numcolor operation used by the surrounding class.

#### `public default Tex overlay()`
- Role: Performs overlay.
- Description: Supports the overlay operation used by the surrounding class.

#### `public default void drawoverlay(GOut g, Tex tex)`
- Role: Performs drawoverlay.
- Description: Supports the drawoverlay operation used by the surrounding class.

#### `public static BufferedImage numrender(int num, Color col)`
- Role: Performs numrender.
- Description: Supports the numrender operation used by the surrounding class.

#### `public double meter()`
- Role: Performs meter.
- Description: Supports the meter operation used by the surrounding class.

#### `public Amount(Owner owner, int num)`
- Role: Performs amount.
- Description: Supports the amount operation used by the surrounding class.

#### `public int itemnum()`
- Role: Performs itemnum.
- Description: Supports the itemnum operation used by the surrounding class.

#### `public GItem(Indir<Resource> res, Message sdt)`
- Role: Creates a new GItem instance.
- Description: Constructs the instance and initializes its default state.

#### `public GItem(Indir<Resource> res)`
- Role: Creates a new GItem instance.
- Description: Constructs the instance and initializes its default state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public GSprite spr()`
- Role: Performs spr.
- Description: Supports the spr operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public Resource resource()`
- Role: Performs resource.
- Description: Supports the resource operation used by the surrounding class.

#### `public GSprite sprite()`
- Role: Performs sprite.
- Description: Supports the sprite operation used by the surrounding class.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void propagate(List<ItemInfo> buf, ItemInfo.Owner outer)`
- Role: Performs propagate.
- Description: Supports the propagate operation used by the surrounding class.

#### `private void updcontinfo()`
- Role: Performs updcontinfo.
- Description: Supports the updcontinfo operation used by the surrounding class.

#### `private void addcontinfo(List<ItemInfo> buf)`
- Role: Performs addcontinfo.
- Description: Supports the addcontinfo operation used by the surrounding class.

#### `private Widget contparent()`
- Role: Performs contparent.
- Description: Supports the contparent operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void hovering(Widget hovering)`
- Role: Performs hovering.
- Description: Supports the hovering operation used by the surrounding class.

#### `public void iresize(Coord isz)`
- Role: Performs iresize.
- Description: Supports the iresize operation used by the surrounding class.

#### `public Area contarea()`
- Role: Performs contarea.
- Description: Supports the contarea operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public ContentsWindow(GItem cont, Widget inv)`
- Role: Performs contents window.
- Description: Supports the contents window operation used by the surrounding class.

#### `private void chstate(String nst)`
- Role: Performs chstate.
- Description: Supports the chstate operation used by the surrounding class.

#### `private void ckhover()`
- Role: Performs ckhover.
- Description: Supports the ckhover operation used by the surrounding class.

#### `private void ckunhover()`
- Role: Performs ckunhover.
- Description: Supports the ckunhover operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public void cdestroy(Widget w)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public boolean mousehover(MouseHoverEvent ev, boolean on)`
- Role: Performs mousehover.
- Description: Supports the mousehover operation used by the surrounding class.

#### `public void wndshow(boolean show)`
- Role: Performs wndshow.
- Description: Supports the wndshow operation used by the surrounding class.

#### `public void describe()`
- Role: Performs describe.
- Description: Supports the describe operation used by the surrounding class.

#### `public String resourceName()`
- Role: Performs resource name.
- Description: Supports the resource name operation used by the surrounding class.

#### `public boolean isResourceNameEndsWith(String suffix)`
- Role: Checks whether the resource name ends with.
- Description: Returns a boolean result for the described condition.

#### `public boolean isString()`
- Role: Checks whether the string.
- Description: Returns a boolean result for the described condition.

#### `public void transfer()`
- Role: Performs transfer.
- Description: Supports the transfer operation used by the surrounding class.
