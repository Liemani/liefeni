---
source: [Buff.java](../../../../src/haven/Buff.java)
created: 2026-06-13
updated: 2026-06-14
---

# Buff

Represents the buff Haven component.

## Nested Types

### $_

- Role: Represents $ within Buff.
- Description: Describes the nested $  type used by the enclosing class.

### AMeterInfo

- Role: Represents ameter info within Buff.
- Description: Describes the nested ameter info type used by the enclosing class.

### AMeterTip

- Role: Represents ameter tip within Buff.
- Description: Describes the nested ameter tip type used by the enclosing class.

## Members

### Constants

#### `public static final Text.Foundry nfnd = new Text.Foundry(Text.dfont, 10)`
- Role: Implements the nfnd operation.
- Description: Implements the foundry operation.
- Value: `new Text.Foundry(Text.dfont, 10)`

#### `public static final Tex frame = Resource.loadtex("gfx/hud/buffs/frame")`
- Role: Implements the frame operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/buffs/frame")`

#### `public static final Tex cframe = Resource.loadtex("gfx/hud/buffs/cframe")`
- Role: Implements the cframe operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/buffs/cframe")`

#### `public static final Tex ameter = Resource.loadtex("gfx/hud/buffs/cframe-m")`
- Role: Implements the ameter operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/buffs/cframe-m")`

#### `public static final Coord imgoff = UI.scale(3, 3)`
- Role: Implements the imgoff operation.
- Description: Implements the scale operation.
- Value: `UI.scale(3, 3)`

#### `public static final int ameterx1 = UI.scale(3), ameterx2 = UI.scale(35); /* XXX: Detect? */`
- Role: Implements the ameterx1 operation.
- Description: Implements the scale operation.
- Value: `UI.scale(3), ameterx2 = UI.scale(35); /* XXX: Detect? */`

#### `public static final int ameterx1 = UI.scale(3), ameterx2 = UI.scale(35); /* XXX: Detect? */`
- Role: Implements the ameterx1 operation.
- Description: Implements the scale operation.
- Value: `UI.scale(3), ameterx2 = UI.scale(35); /* XXX: Detect? */`

#### `public static final int textw = UI.scale(200)`
- Role: Implements the textw operation.
- Description: Implements the scale operation.
- Value: `UI.scale(200)`

#### `private static final OwnerContext.ClassResolver<Buff> ctxr = new OwnerContext.ClassResolver<Buff>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<buff> ctxr = new owner context.class resolver<buff>() operation.
- Value: `new OwnerContext.ClassResolver<Buff>()`

### Fields

#### `public Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `protected int a = 255`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `protected boolean dest = false`
- Role: Tracks the dest flag.
- Description: Caches the `dest` value for reuse.

#### `private ItemInfo.Raw rawinfo = null`
- Role: Caches the rawinfo value.
- Description: Caches the `rawinfo` value for reuse.

#### `private List<ItemInfo> info = Collections.emptyList()`
- Role: Implements the info operation.
- Description: Implements the empty list operation.

#### `private final AttrCache<Double> ameteri = new AttrCache<>(this::info, AttrCache.map1(AMeterInfo.class, minf -> minf::ameter))`
- Role: Implements the ameteri operation.
- Description: Implements the map1 operation.

#### `private final AttrCache<Tex> nmeteri = new AttrCache<>(this::info, AttrCache.map1s(GItem.NumberInfo.class, ninf -> new TexI(GItem.NumberInfo.numrender(ninf.itemnum(), ninf.numcolor()))))`
- Role: Implements the nmeteri operation.
- Description: Implements the numcolor operation.

#### `private final AttrCache<Double> cmeteri = new AttrCache<>(this::info, AttrCache.map1(GItem.MeterInfo.class, minf -> minf::meter))`
- Role: Implements the cmeteri operation.
- Description: Implements the map1 operation.

#### `private double hoverstart`
- Role: Caches the hoverstart value.
- Description: Caches the `hoverstart` value for reuse.

#### `private Tex shorttip, longtip`
- Role: Caches the longtip value.
- Description: Caches the `longtip` value for reuse.

#### `private Tex shorttip, longtip`
- Role: Caches the longtip value.
- Description: Caches the `longtip` value for reuse.

#### `private List<ItemInfo> ttinfo = null`
- Role: Caches the ttinfo value.
- Description: Caches the `ttinfo` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Buff(Indir<Resource> res)`
- Role: Creates a new Buff instance.
- Description: Constructs the Buff instance from the supplied inputs.

#### `public Resource resource()`
- Role: Handles the resource path.
- Description: Implements the resource operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public double ameter()`
- Role: Handles the ameter path.
- Description: Implements the ameter operation.

#### `public AMeterTip(Owner owner)`
- Role: Handles the ameter tip path.
- Description: Implements the a meter tip operation.

#### `public void layout(Layout l)`
- Role: Handles the layout path.
- Description: Lays out parts on wrapped lines and aligns their baselines.

#### `public int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `public Tip shortvar()`
- Role: Handles the shortvar path.
- Description: Implements the shortvar operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Buff content.

#### `private BufferedImage shorttip()`
- Role: Handles the shorttip path.
- Description: Implements the shorttip operation.

#### `private BufferedImage longtip()`
- Role: Handles the longtip path.
- Description: Implements the longtip operation.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public void reqdestroy()`
- Role: Handles the reqdestroy path.
- Description: Implements the reqdestroy operation.

#### `public void move(Coord c, double off)`
- Role: Moves the current state.
- Description: Implements the move operation.

#### `public void move(Coord c)`
- Role: Moves the current state.
- Description: Implements the move operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.