---
source: [MenuGrid.java](../../../../src/haven/MenuGrid.java)
created: 2026-06-13
updated: 2026-06-14
---

# MenuGrid

Represents the in-game menu grid and its pages.

## Nested Types

### $_

- Role: Registers the `scm` widget factory.
- Description: Creates a new `MenuGrid` instance when the resource system instantiates the widget.

### FactMaker

- Role: Resolves published page factories for menu-grid entries.
- Description: Chains direct, static, and constructor-based instancers for `PagButton.Factory`.

### Factory

- Role: Creates a `PagButton` from a `Pagina`.
- Description: Published code hook used by menu resources to customize page button creation.

### Interaction

- Role: Carries one menu-use input.
- Description: Stores the button, modifier flags, and optional map click context passed to a page use.

### PagButton

- Role: Adapts one `Pagina` into a clickable menu button.
- Description: Resolves sprite, tooltip, keybinding, overlays, and use behavior for the backing resource.

### Pagina

- Role: Holds one menu page record.
- Description: Tracks the page resource, id, serialized data, and cached button instance.

## Members

### Constants

#### `public static final Text.Foundry keyfnd = new Text.Foundry(Text.sans.deriveFont(Font.BOLD), 10)`
- Role: Implements the keyfnd operation.
- Description: Implements the derive font operation.
- Value: `new Text.Foundry(Text.sans.deriveFont(Font.BOLD), 10)`

#### `private static final OwnerContext.ClassResolver<PagButton> ctxr = new OwnerContext.ClassResolver<PagButton>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<pag button> ctxr = new owner context.class resolver<pag button>() operation.
- Value: `new OwnerContext.ClassResolver<PagButton>()`

#### `public static final KeyBinding kb_root = KeyBinding.get("scm-root", KeyMatch.forcode(KeyEvent.VK_ESCAPE, 0))`
- Role: Implements the kb root operation.
- Description: Implements the forcode operation.
- Value: `KeyBinding.get("scm-root", KeyMatch.forcode(KeyEvent.VK_ESCAPE, 0))`

#### `public static final KeyBinding kb_back = KeyBinding.get("scm-back", KeyMatch.forcode(KeyEvent.VK_BACK_SPACE, 0))`
- Role: Implements the kb back operation.
- Description: Implements the forcode operation.
- Value: `KeyBinding.get("scm-back", KeyMatch.forcode(KeyEvent.VK_BACK_SPACE, 0))`

#### `public static final KeyBinding kb_next = KeyBinding.get("scm-next", KeyMatch.forchar('N', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.S))`
- Role: Implements the kb next operation.
- Description: Implements the forchar operation.
- Value: `KeyBinding.get("scm-next", KeyMatch.forchar('N', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.S))`

### Fields

#### `public final static Tex bg = Inventory.invsq`
- Role: Caches the bg value.
- Description: Caches the `bg` value for reuse.

#### `public final static Coord bgsz = Inventory.sqsz`
- Role: Caches the bgsz value.
- Description: Caches the `bgsz` value for reuse.

#### `public final static RichText.Foundry ttfnd = new RichText.Foundry(TextAttribute.FAMILY, "SansSerif", TextAttribute.SIZE, UI.scale(10f))`
- Role: Implements the ttfnd operation.
- Description: Implements the scale operation.

#### `private static Coord gsz = new Coord(4, 4)`
- Role: Implements the gsz operation.
- Description: Implements the coord operation.

#### `public final Set<Pagina> paginae = new HashSet<Pagina>()`
- Role: Implements the paginae operation.
- Description: Implements the public final set<pagina> paginae = new hash set<pagina>() operation.

#### `public Pagina cur`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `private final Map<Object, Pagina> pmap = new CacheMap<>(CacheMap.RefType.WEAK)`
- Role: Implements the pmap operation.
- Description: Implements the private final map<object, pagina> pmap = new cache map<>(cache map.ref type.weak) operation.

#### `private Pagina dragging`
- Role: Caches the dragging value.
- Description: Caches the `dragging` value for reuse.

#### `private Collection<PagButton> curbtns = Collections.emptyList()`
- Role: Implements the curbtns operation.
- Description: Implements the empty list operation.

#### `private PagButton pressed, layout[][] = new PagButton[gsz.x][gsz.y]`
- Role: Caches the layout[][] value.
- Description: Caches the `layout[][]` value for reuse.

#### `private PagButton pressed, layout[][] = new PagButton[gsz.x][gsz.y]`
- Role: Caches the layout[][] value.
- Description: Caches the `layout[][]` value for reuse.

#### `private UI.Grab grab`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

#### `private int curoff = 0`
- Role: Caches the curoff value.
- Description: Caches the `curoff` value for reuse.

#### `private boolean recons = true, showkeys = false`
- Role: Tracks the recons flag.
- Description: Caches the `recons` value for reuse.

#### `private boolean recons = true, showkeys = false`
- Role: Tracks the recons flag.
- Description: Caches the `recons` value for reuse.

#### `private double fstart`
- Role: Caches the fstart value.
- Description: Caches the `fstart` value for reuse.

#### `public final MenuGrid scm`
- Role: Caches the scm value.
- Description: Caches the `scm` value for reuse.

#### `public final Object id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public byte[] sdt = null`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

#### `public int anew, tnew`
- Role: Caches the tnew value.
- Description: Caches the `tnew` value for reuse.

#### `public int anew, tnew`
- Role: Caches the tnew value.
- Description: Caches the `tnew` value for reuse.

#### `public Object[] rawinfo =`
- Role: Caches the rawinfo value.
- Description: Caches the `rawinfo` value for reuse.

#### `private PagButton button = null`
- Role: Caches the button value.
- Description: Caches the `button` value for reuse.

#### `public final int btn, modflags`
- Role: Caches the modflags value.
- Description: Caches the `modflags` value for reuse.

#### `public final int btn, modflags`
- Role: Caches the modflags value.
- Description: Caches the `modflags` value for reuse.

#### `public final Coord2d mc`
- Role: Caches the mc value.
- Description: Caches the `mc` value for reuse.

#### `public final ClickData click`
- Role: Caches the click value.
- Description: Caches the `click` value for reuse.

#### `public final Pagina pag`
- Role: Caches the pag value.
- Description: Caches the `pag` value for reuse.

#### `public final Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final KeyBinding bind`
- Role: Caches the bind value.
- Description: Caches the `bind` value for reuse.

#### `private GSprite spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `private AButton act`
- Role: Caches the act value.
- Description: Caches the `act` value for reuse.

#### `private Pagina parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `public final AttrCache<Pipe.Op> rstate = new AttrCache<>(this::info, info ->`
- Role: Implements the rstate operation.
- Description: Implements the public final attr cache<pipe.op> rstate = new attr cache<>(this::info, info -> operation.

#### `public final AttrCache<GItem.InfoOverlay<?>[]> ols = new AttrCache<>(this::info, info ->`
- Role: Implements the ols operation.
- Description: Implements the public final attr cache<g item.info overlay<?>[]> ols = new attr cache<>(this::info, info -> operation.

#### `public final AttrCache<Double> meter = new AttrCache<>(this::info, AttrCache.map1(GItem.MeterInfo.class, minf -> minf::meter))`
- Role: Implements the meter operation.
- Description: Implements the map1 operation.

#### `private Tex keyrend = null`
- Role: Caches the keyrend value.
- Description: Caches the `keyrend` value for reuse.

#### `private boolean haskeyrend = false`
- Role: Tracks the haskeyrend flag.
- Description: Caches the `haskeyrend` value for reuse.

#### `private List<ItemInfo> info = null`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `public final PagButton next = new PagButton(new Pagina(this, null, Resource.local().loadwait("gfx/hud/sc-next").indir()))`
- Role: Implements the next operation.
- Description: Implements the indir operation.

#### `public final PagButton bk = new PagButton(new Pagina(this, null, Resource.local().loadwait("gfx/hud/sc-back").indir()))`
- Role: Implements the bk operation.
- Description: Implements the indir operation.

#### `private PagButton curttp = null`
- Role: Caches the curttp value.
- Description: Caches the `curttp` value for reuse.

#### `private boolean curttl = false`
- Role: Tracks the curttl flag.
- Description: Caches the `curttl` value for reuse.

#### `private Tex curtt = null`
- Role: Caches the curtt value.
- Description: Caches the `curtt` value for reuse.

#### `private double hoverstart`
- Role: Caches the hoverstart value.
- Description: Caches the `hoverstart` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Pagina(MenuGrid scm, Object id, Indir<Resource> res)`
- Role: Handles the pagina path.
- Description: Implements the pagina operation.

#### `public Resource res()`
- Role: Handles the resource path.
- Description: Implements the res operation.

#### `public Message data()`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `private void invalidate()`
- Role: Handles the invalidate path.
- Description: Implements the invalidate operation.

#### `public PagButton button()`
- Role: Handles the button path.
- Description: Returns the first `Button` inside the active window, if any.

#### `public Pagina parent()`
- Role: Handles the parent path.
- Description: Implements the parent operation.

#### `public Interaction(int btn, int modflags, Coord2d mc, ClickData click)`
- Role: Handles the interaction path.
- Description: Implements the interaction operation.

#### `public Interaction(int btn, int modflags)`
- Role: Handles the interaction path.
- Description: Implements the interaction operation.

#### `public Interaction()`
- Role: Handles the interaction path.
- Description: Implements the interaction operation.

#### `public PagButton(Pagina pag)`
- Role: Handles the pag button path.
- Description: Implements the pag button operation.

#### `public AButton act()`
- Role: Handles the act path.
- Description: Implements the act operation.

#### `public Pagina parent()`
- Role: Handles the parent path.
- Description: Implements the parent operation.

#### `public GSprite spr()`
- Role: Handles the spr path.
- Description: Implements the spr operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public KeyMatch hotkey()`
- Role: Handles the hotkey path.
- Description: Implements the hotkey operation.

#### `public KeyBinding binding()`
- Role: Handles the binding path.
- Description: Implements the binding operation.

#### `public void use(Interaction iact)`
- Role: Handles the use path.
- Description: Implements the use operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public BufferedImage img()`
- Role: Handles the img path.
- Description: Implements the img operation.

#### `public void drawmain(GOut g, GSprite spr)`
- Role: Handles the drawmain path.
- Description: Draws the main.

#### `public void draw(GOut g, GSprite spr)`
- Role: Draws the current content.
- Description: Draws the MenuGrid content.

#### `public String sortkey()`
- Role: Handles the sortkey path.
- Description: Implements the sortkey operation.

#### `private char bindchr(KeyMatch key)`
- Role: Handles the bindchr path.
- Description: Implements the bindchr operation.

#### `public Tex keyrend()`
- Role: Handles the keyrend path.
- Description: Implements the keyrend operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public BufferedImage rendertt(boolean withpg)`
- Role: Handles the rendertt path.
- Description: Renders the tt.

#### `public FactMaker()`
- Role: Handles the fact maker path.
- Description: Implements the fact maker operation.

#### `public PagButton make(Pagina info)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public Pagina paginafor(Indir<Resource> res)`
- Role: Handles the paginafor path.
- Description: Implements the paginafor operation.

#### `public Pagina paginafor(Object id, Indir<Resource> res)`
- Role: Handles the paginafor path.
- Description: Implements the paginafor operation.

#### `private boolean cons(Pagina p, Collection<PagButton> buf)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `private void announce(Pagina pag)`
- Role: Handles the announce path.
- Description: Implements the announce operation.

#### `public MenuGrid()`
- Role: Creates a new MenuGrid instance.
- Description: Constructs the MenuGrid instance from the supplied inputs.

#### `private void updlayout()`
- Role: Handles the updlayout path.
- Description: Implements the updlayout operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the MenuGrid content.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `private PagButton bhit(Coord c)`
- Role: Handles the bhit path.
- Description: Implements the bhit operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public void change(Pagina dst)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public void use(PagButton r, Interaction iact, boolean reset)`
- Role: Handles the use path.
- Description: Implements the use operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Implements the globtype operation.

#### `public KeyBinding getbinding(Coord cc)`
- Role: Handles the getbinding path.
- Description: Returns the binding.