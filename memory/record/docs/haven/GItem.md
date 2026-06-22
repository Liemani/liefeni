---
source: [GItem.java](../../../../src/haven/GItem.java)
created: 2026-06-13
updated: 2026-06-14
---

# GItem

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
- Role: Caches the combine value.
- Description: Caches the `combine` value for reuse.
- Value: `info ->`

#### `private static final OwnerContext.ClassResolver<GItem> ctxr = new OwnerContext.ClassResolver<GItem>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<g item> ctxr = new owner context.class resolver<g item>() operation.
- Value: `new OwnerContext.ClassResolver<GItem>()`

#### `public static final Coord hovermarg = UI.scale(12, 12)`
- Role: Implements the hovermarg operation.
- Description: Implements the scale operation.
- Value: `UI.scale(12, 12)`

#### `public static final Tex bg = Window.bg`
- Role: Caches the bg value.
- Description: Caches the `bg` value for reuse.
- Value: `Window.bg`

#### `public static final IBox box = Window.wbox`
- Role: Caches the box value.
- Description: Caches the `box` value for reuse.
- Value: `Window.wbox`

#### `public static final Coord overlap = UI.scale(2, 2)`
- Role: Implements the overlap operation.
- Description: Implements the scale operation.
- Value: `UI.scale(2, 2)`

### Fields

#### `public Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public MessageBuf sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

#### `public int meter = 0`
- Role: Caches the meter value.
- Description: Caches the `meter` value for reuse.

#### `public int num = -1`
- Role: Caches the num value.
- Description: Caches the `num` value for reuse.

#### `public Widget contents = null`
- Role: Caches the contents value.
- Description: Caches the `contents` value for reuse.

#### `public String contentsnm = null`
- Role: Caches the contentsnm value.
- Description: Caches the `contentsnm` value for reuse.

#### `public Object contentsid = null`
- Role: Caches the contentsid value.
- Description: Caches the `contentsid` value for reuse.

#### `public ContentsWindow contentswnd = null`
- Role: Caches the contentswnd value.
- Description: Caches the `contentswnd` value for reuse.

#### `public int infoseq`
- Role: Caches the infoseq value.
- Description: Caches the `infoseq` value for reuse.

#### `private Widget hovering`
- Role: Caches the hovering value.
- Description: Tracks whether the cursor is still hovering.

#### `private boolean hoverset`
- Role: Tracks the hoverset flag.
- Description: Caches the `hoverset` value for reuse.

#### `private GSprite spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `private ItemInfo.Raw rawinfo`
- Role: Caches the rawinfo value.
- Description: Caches the `rawinfo` value for reuse.

#### `private List<ItemInfo> info = Collections.emptyList()`
- Role: Implements the info operation.
- Description: Implements the empty list operation.

#### `public final OverlayInfo<T> inf`
- Role: Caches the inf value.
- Description: Caches the `inf` value for reuse.

#### `public final T data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private final int num`
- Role: Caches the num value.
- Description: Caches the `num` value for reuse.

#### `private Random rnd = null`
- Role: Caches the rnd value.
- Description: Caches the `rnd` value for reuse.

#### `private int lastcontseq`
- Role: Caches the last contseq.
- Description: Caches the last contseq value.

#### `private List<Pair<GItem, Integer>> lastcontinfo = null`
- Role: Caches the last continfo.
- Description: Caches the last continfo value.

#### `public Area ca`
- Role: Caches the ca value.
- Description: Caches the `ca` value for reuse.

#### `private UI.Grab dm = null`
- Role: Caches the dm value.
- Description: Caches the `dm` value for reuse.

#### `private Coord doff`
- Role: Caches the doff value.
- Description: Caches the `doff` value for reuse.

#### `public final GItem cont`
- Role: Caches the cont value.
- Description: Caches the `cont` value for reuse.

#### `public final Widget inv`
- Role: Caches the inv value.
- Description: Caches the `inv` value for reuse.

#### `private final Object id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private Coord psz = null`
- Role: Caches the psz value.
- Description: Caches the `psz` value for reuse.

#### `private String st`
- Role: Caches the st value.
- Description: Caches the `st` value for reuse.

#### `private boolean hovering`
- Role: Tracks the hovering flag.
- Description: Tracks whether the cursor is still hovering.

#### `private Coord lc = null`
- Role: Caches the lc value.
- Description: Caches the `lc` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Pipe.Op rstate()`
- Role: Handles the rstate path.
- Description: Implements the rstate operation.

#### `public Color olcol()`
- Role: Handles the olcol path.
- Description: Implements the olcol operation.

#### `public default Pipe.Op rstate()`
- Role: Handles the rstate path.
- Description: Implements the rstate operation.

#### `public T overlay()`
- Role: Handles the overlay path.
- Description: Implements the overlay operation.

#### `public void drawoverlay(GOut g, T data)`
- Role: Handles the drawoverlay path.
- Description: Draws the overlay.

#### `public InfoOverlay(OverlayInfo<T> inf)`
- Role: Handles the info overlay path.
- Description: Implements the info overlay operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GItem content.

#### `public static <S> InfoOverlay<S> create(OverlayInfo<S> inf)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public int itemnum()`
- Role: Handles the itemnum path.
- Description: Implements the itemnum operation.

#### `public default Color numcolor()`
- Role: Handles the numcolor path.
- Description: Implements the numcolor operation.

#### `public default Tex overlay()`
- Role: Handles the overlay path.
- Description: Implements the overlay operation.

#### `public default void drawoverlay(GOut g, Tex tex)`
- Role: Handles the drawoverlay path.
- Description: Draws the overlay.

#### `public static BufferedImage numrender(int num, Color col)`
- Role: Handles the numrender path.
- Description: Implements the numrender operation.

#### `public double meter()`
- Role: Handles the meter path.
- Description: Implements the meter operation.

#### `public Amount(Owner owner, int num)`
- Role: Handles the amount path.
- Description: Implements the amount operation.

#### `public int itemnum()`
- Role: Handles the itemnum path.
- Description: Implements the itemnum operation.

#### `public GItem(Indir<Resource> res, Message sdt)`
- Role: Creates a new GItem instance.
- Description: Constructs the GItem instance from the supplied inputs.

#### `public GItem(Indir<Resource> res)`
- Role: Creates a new GItem instance.
- Description: Constructs the GItem instance from the supplied inputs.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public GSprite spr()`
- Role: Handles the spr path.
- Description: Implements the spr operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public Resource resource()`
- Role: Handles the resource path.
- Description: Implements the resource operation.

#### `public GSprite sprite()`
- Role: Handles the sprite path.
- Description: Implements the sprite operation.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public void propagate(List<ItemInfo> buf, ItemInfo.Owner outer)`
- Role: Handles the propagate path.
- Description: Implements the propagate operation.

#### `private void updcontinfo()`
- Role: Handles the updcontinfo path.
- Description: Implements the updcontinfo operation.

#### `private void addcontinfo(List<ItemInfo> buf)`
- Role: Handles the addcontinfo path.
- Description: Adds the continfo.

#### `private Widget contparent()`
- Role: Handles the contparent path.
- Description: Implements the contparent operation.

#### `public void destroy()`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.

#### `public void hovering(Widget hovering)`
- Role: Handles the hovering path.
- Description: Implements the hovering operation.

#### `public void iresize(Coord isz)`
- Role: Handles the iresize path.
- Description: Implements the iresize operation.

#### `public Area contarea()`
- Role: Handles the contarea path.
- Description: Implements the contarea operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GItem content.

#### `public boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public ContentsWindow(GItem cont, Widget inv)`
- Role: Handles the contents window path.
- Description: Implements the contents window operation.

#### `private void chstate(String nst)`
- Role: Handles the chstate path.
- Description: Implements the chstate operation.

#### `private void ckhover()`
- Role: Handles the ckhover path.
- Description: Implements the ckhover operation.

#### `private void ckunhover()`
- Role: Handles the ckunhover path.
- Description: Implements the ckunhover operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.

#### `public void cdestroy(Widget w)`
- Role: Handles the cdestroy path.
- Description: Implements the cdestroy operation.

#### `public boolean mousehover(MouseHoverEvent ev, boolean on)`
- Role: Handles the mousehover path.
- Description: Updates hover state and tooltip selection for minimap content.

#### `public void wndshow(boolean show)`
- Role: Handles the wndshow path.
- Description: Implements the wndshow operation.

#### `public void describe()`
- Role: Handles the describe path.
- Description: Implements the describe operation.

#### `public String resourceName()`
- Role: Handles the resource name path.
- Description: Implements the resource name operation.

#### `public boolean isResourceNameEndsWith(String suffix)`
- Role: Checks whether the resource name ends with.
- Description: Returns whether the condition is satisfied.

#### `public boolean isString()`
- Role: Checks whether the string.
- Description: Returns whether the condition is satisfied.

#### `public void transfer()`
- Role: Handles the transfer path.
- Description: Implements the transfer operation.