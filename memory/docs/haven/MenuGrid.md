# MenuGrid

This file documents the responsibilities and members of `MenuGrid`.

## Meta

- Source: [MenuGrid.java](../../../src/haven/MenuGrid.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the in-game menu grid and its pages.

## Nested Types

### $_

- Role: Represents $ within MenuGrid.
- Description: Describes the nested $  type used by the enclosing class.

### FactMaker

- Role: Represents fact maker within MenuGrid.
- Description: Describes the nested fact maker type used by the enclosing class.

### Factory

- Role: Represents factory within MenuGrid.
- Description: Describes the nested factory type used by the enclosing class.

### Interaction

- Role: Represents interaction within MenuGrid.
- Description: Describes the nested interaction type used by the enclosing class.

### PagButton

- Role: Represents pag button within MenuGrid.
- Description: Describes the nested pag button type used by the enclosing class.

### Pagina

- Role: Represents pagina within MenuGrid.
- Description: Describes the nested pagina type used by the enclosing class.

## Members

### Constants

#### `public static final Text.Foundry keyfnd = new Text.Foundry(Text.sans.deriveFont(Font.BOLD), 10)`
- Role: Defines the shared keyfnd constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<PagButton> ctxr = new OwnerContext.ClassResolver<PagButton>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_root = KeyBinding.get("scm-root", KeyMatch.forcode(KeyEvent.VK_ESCAPE, 0))`
- Role: Defines the shared kb root constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_back = KeyBinding.get("scm-back", KeyMatch.forcode(KeyEvent.VK_BACK_SPACE, 0))`
- Role: Defines the shared kb back constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_next = KeyBinding.get("scm-next", KeyMatch.forchar('N', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.S))`
- Role: Defines the shared kb next constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final static Tex bg = Inventory.invsq`
- Role: Stores the bg value.
- Description: Backs the cached state for this file.

#### `public final static Coord bgsz = Inventory.sqsz`
- Role: Stores the bgsz value.
- Description: Backs the cached state for this file.

#### `public final static RichText.Foundry ttfnd = new RichText.Foundry(TextAttribute.FAMILY, "SansSerif", TextAttribute.SIZE, UI.scale(10f))`
- Role: Stores the ttfnd value.
- Description: Backs the cached state for this file.

#### `private static Coord gsz = new Coord(4, 4)`
- Role: Stores the gsz value.
- Description: Backs the cached state for this file.

#### `public final Set<Pagina> paginae = new HashSet<Pagina>()`
- Role: Caches paginae entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Pagina cur`
- Role: Holds the cur state.
- Description: Backs the cached state for this file.

#### `private final Map<Object, Pagina> pmap = new CacheMap<>(CacheMap.RefType.WEAK)`
- Role: Caches pmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Pagina dragging`
- Role: Holds the dragging state.
- Description: Backs the cached state for this file.

#### `private Collection<PagButton> curbtns = Collections.emptyList()`
- Role: Caches curbtns entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private PagButton pressed, layout[][] = new PagButton[gsz.x][gsz.y]`
- Role: Holds the menu grid state.
- Description: Backs the cached state for this file.

#### `private PagButton pressed, layout[][] = new PagButton[gsz.x][gsz.y]`
- Role: Holds the menu grid state.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

#### `private int curoff = 0`
- Role: Stores the curoff value.
- Description: Backs the cached state for this file.

#### `private boolean recons = true, showkeys = false`
- Role: Tracks the recons flag.
- Description: Supports the recons operation used by the surrounding class.

#### `private boolean recons = true, showkeys = false`
- Role: Tracks the recons flag.
- Description: Supports the recons operation used by the surrounding class.

#### `private double fstart`
- Role: Stores the fstart value.
- Description: Backs the cached state for this file.

#### `public final MenuGrid scm`
- Role: Stores the scm value.
- Description: Backs the cached state for this file.

#### `public final Object id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public byte[] sdt = null`
- Role: Stores the sdt value.
- Description: Backs the cached state for this file.

#### `public int anew, tnew`
- Role: Stores the tnew value.
- Description: Backs the cached state for this file.

#### `public int anew, tnew`
- Role: Stores the tnew value.
- Description: Backs the cached state for this file.

#### `public Object[] rawinfo =`
- Role: Holds the menu grid state.
- Description: Backs the cached state for this file.

#### `private PagButton button = null`
- Role: Holds the button state.
- Description: Backs the cached state for this file.

#### `public final int btn, modflags`
- Role: Stores the modflags value.
- Description: Backs the cached state for this file.

#### `public final int btn, modflags`
- Role: Stores the modflags value.
- Description: Backs the cached state for this file.

#### `public final Coord2d mc`
- Role: Stores the mc value.
- Description: Backs the cached state for this file.

#### `public final ClickData click`
- Role: Holds the click state.
- Description: Backs the cached state for this file.

#### `public final Pagina pag`
- Role: Holds the pag state.
- Description: Backs the cached state for this file.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final KeyBinding bind`
- Role: Holds the bind state.
- Description: Backs the cached state for this file.

#### `private GSprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `private AButton act`
- Role: Holds the act state.
- Description: Backs the cached state for this file.

#### `private Pagina parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

#### `public final AttrCache<Pipe.Op> rstate = new AttrCache<>(this::info, info ->`
- Role: Caches rstate entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final AttrCache<GItem.InfoOverlay<?>[]> ols = new AttrCache<>(this::info, info ->`
- Role: Caches ols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final AttrCache<Double> meter = new AttrCache<>(this::info, AttrCache.map1(GItem.MeterInfo.class, minf -> minf::meter))`
- Role: Caches meter entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Tex keyrend = null`
- Role: Stores the keyrend value.
- Description: Backs the cached state for this file.

#### `private boolean haskeyrend = false`
- Role: Tracks the haskeyrend flag.
- Description: Supports the haskeyrend operation used by the surrounding class.

#### `private List<ItemInfo> info = null`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final PagButton next = new PagButton(new Pagina(this, null, Resource.local().loadwait("gfx/hud/sc-next").indir()))`
- Role: Holds the next state.
- Description: Backs the cached state for this file.

#### `public final PagButton bk = new PagButton(new Pagina(this, null, Resource.local().loadwait("gfx/hud/sc-back").indir()))`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `private PagButton curttp = null`
- Role: Holds the curttp state.
- Description: Backs the cached state for this file.

#### `private boolean curttl = false`
- Role: Tracks the curttl flag.
- Description: Supports the curttl operation used by the surrounding class.

#### `private Tex curtt = null`
- Role: Stores the curtt value.
- Description: Backs the cached state for this file.

#### `private double hoverstart`
- Role: Stores the hoverstart value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Pagina(MenuGrid scm, Object id, Indir<Resource> res)`
- Role: Performs pagina.
- Description: Supports the pagina operation used by the surrounding class.

#### `public Resource res()`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `public Message data()`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `private void invalidate()`
- Role: Performs invalidate.
- Description: Supports the invalidate operation used by the surrounding class.

#### `public PagButton button()`
- Role: Performs button.
- Description: Supports the button operation used by the surrounding class.

#### `public Pagina parent()`
- Role: Performs parent.
- Description: Supports the parent operation used by the surrounding class.

#### `public Interaction(int btn, int modflags, Coord2d mc, ClickData click)`
- Role: Performs interaction.
- Description: Supports the interaction operation used by the surrounding class.

#### `public Interaction(int btn, int modflags)`
- Role: Performs interaction.
- Description: Supports the interaction operation used by the surrounding class.

#### `public Interaction()`
- Role: Performs interaction.
- Description: Supports the interaction operation used by the surrounding class.

#### `public PagButton(Pagina pag)`
- Role: Performs pag button.
- Description: Supports the pag button operation used by the surrounding class.

#### `public AButton act()`
- Role: Performs act.
- Description: Supports the act operation used by the surrounding class.

#### `public Pagina parent()`
- Role: Performs parent.
- Description: Supports the parent operation used by the surrounding class.

#### `public GSprite spr()`
- Role: Performs spr.
- Description: Supports the spr operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public KeyMatch hotkey()`
- Role: Performs hotkey.
- Description: Supports the hotkey operation used by the surrounding class.

#### `public KeyBinding binding()`
- Role: Performs binding.
- Description: Supports the binding operation used by the surrounding class.

#### `public void use(Interaction iact)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public BufferedImage img()`
- Role: Performs img.
- Description: Supports the img operation used by the surrounding class.

#### `public void drawmain(GOut g, GSprite spr)`
- Role: Performs drawmain.
- Description: Supports the drawmain operation used by the surrounding class.

#### `public void draw(GOut g, GSprite spr)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public String sortkey()`
- Role: Performs sortkey.
- Description: Supports the sortkey operation used by the surrounding class.

#### `private char bindchr(KeyMatch key)`
- Role: Performs bindchr.
- Description: Supports the bindchr operation used by the surrounding class.

#### `public Tex keyrend()`
- Role: Performs keyrend.
- Description: Supports the keyrend operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public BufferedImage rendertt(boolean withpg)`
- Role: Performs rendertt.
- Description: Supports the rendertt operation used by the surrounding class.

#### `public FactMaker()`
- Role: Performs fact maker.
- Description: Supports the fact maker operation used by the surrounding class.

#### `public PagButton make(Pagina info)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public Pagina paginafor(Indir<Resource> res)`
- Role: Performs paginafor.
- Description: Supports the paginafor operation used by the surrounding class.

#### `public Pagina paginafor(Object id, Indir<Resource> res)`
- Role: Performs paginafor.
- Description: Supports the paginafor operation used by the surrounding class.

#### `private boolean cons(Pagina p, Collection<PagButton> buf)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `private void announce(Pagina pag)`
- Role: Performs announce.
- Description: Supports the announce operation used by the surrounding class.

#### `public MenuGrid()`
- Role: Creates a new MenuGrid instance.
- Description: Constructs the instance and initializes its default state.

#### `private void updlayout()`
- Role: Performs updlayout.
- Description: Supports the updlayout operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `private PagButton bhit(Coord c)`
- Role: Performs bhit.
- Description: Supports the bhit operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public void change(Pagina dst)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public void use(PagButton r, Interaction iact, boolean reset)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.

#### `public KeyBinding getbinding(Coord cc)`
- Role: Performs getbinding.
- Description: Supports the getbinding operation used by the surrounding class.
