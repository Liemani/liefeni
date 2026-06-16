# Buff

This file documents the responsibilities and members of `Buff`.

## Meta

- Source: [Buff.java](../../../src/haven/Buff.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Role: Defines the shared nfnd constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex frame = Resource.loadtex("gfx/hud/buffs/frame")`
- Role: Defines the shared frame constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex cframe = Resource.loadtex("gfx/hud/buffs/cframe")`
- Role: Defines the shared cframe constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex ameter = Resource.loadtex("gfx/hud/buffs/cframe-m")`
- Role: Defines the shared ameter constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord imgoff = UI.scale(3, 3)`
- Role: Defines the shared imgoff constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ameterx1 = UI.scale(3), ameterx2 = UI.scale(35); /* XXX: Detect? */`
- Role: Defines the shared ameterx1 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ameterx1 = UI.scale(3), ameterx2 = UI.scale(35); /* XXX: Detect? */`
- Role: Defines the shared ameterx1 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int textw = UI.scale(200)`
- Role: Defines the shared textw constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<Buff> ctxr = new OwnerContext.ClassResolver<Buff>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `protected int a = 255`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `protected boolean dest = false`
- Role: Tracks the dest flag.
- Description: Supports the dest operation used by the surrounding class.

#### `private ItemInfo.Raw rawinfo = null`
- Role: Holds the rawinfo state.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> info = Collections.emptyList()`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final AttrCache<Double> ameteri = new AttrCache<>(this::info, AttrCache.map1(AMeterInfo.class, minf -> minf::ameter))`
- Role: Caches ameteri entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final AttrCache<Tex> nmeteri = new AttrCache<>(this::info, AttrCache.map1s(GItem.NumberInfo.class, ninf -> new TexI(GItem.NumberInfo.numrender(ninf.itemnum(), ninf.numcolor()))))`
- Role: Caches nmeteri entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final AttrCache<Double> cmeteri = new AttrCache<>(this::info, AttrCache.map1(GItem.MeterInfo.class, minf -> minf::meter))`
- Role: Caches cmeteri entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private double hoverstart`
- Role: Stores the hoverstart value.
- Description: Backs the cached state for this file.

#### `private Tex shorttip, longtip`
- Role: Stores the longtip value.
- Description: Backs the cached state for this file.

#### `private Tex shorttip, longtip`
- Role: Stores the longtip value.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> ttinfo = null`
- Role: Caches ttinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Buff(Indir<Resource> res)`
- Role: Creates a new Buff instance.
- Description: Constructs the instance and initializes its default state.

#### `public Resource resource()`
- Role: Performs resource.
- Description: Supports the resource operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public double ameter()`
- Role: Performs ameter.
- Description: Supports the ameter operation used by the surrounding class.

#### `public AMeterTip(Owner owner)`
- Role: Performs ameter tip.
- Description: Supports the ameter tip operation used by the surrounding class.

#### `public void layout(Layout l)`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public Tip shortvar()`
- Role: Performs shortvar.
- Description: Supports the shortvar operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private BufferedImage shorttip()`
- Role: Performs shorttip.
- Description: Supports the shorttip operation used by the surrounding class.

#### `private BufferedImage longtip()`
- Role: Performs longtip.
- Description: Supports the longtip operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public void reqdestroy()`
- Role: Performs reqdestroy.
- Description: Supports the reqdestroy operation used by the surrounding class.

#### `public void move(Coord c, double off)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void move(Coord c)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.
