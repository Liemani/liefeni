# MenuGrid

This file documents the responsibilities and members of `MenuGrid`.

## Meta

- Source: [MenuGrid.java](../../../src/haven/MenuGrid.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the main menu grid.

## Nested Types

### $_

- Description: TODO

### FactMaker

- Description: TODO

### Factory

- Description: TODO

### Interaction

- Description: TODO

### PagButton

- Description: TODO

### Pagina

- Description: TODO

## Members

### Constants

#### `public static final Text.Foundry keyfnd = new Text.Foundry(Text.sans.deriveFont(Font.BOLD), 10)`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<PagButton> ctxr = new OwnerContext.ClassResolver<PagButton>()`

- Description: TODO

#### `public static final KeyBinding kb_root = KeyBinding.get("scm-root", KeyMatch.forcode(KeyEvent.VK_ESCAPE, 0))`

- Description: TODO

#### `public static final KeyBinding kb_back = KeyBinding.get("scm-back", KeyMatch.forcode(KeyEvent.VK_BACK_SPACE, 0))`

- Description: TODO

#### `public static final KeyBinding kb_next = KeyBinding.get("scm-next", KeyMatch.forchar('N', KeyMatch.S | KeyMatch.C | KeyMatch.M, KeyMatch.S))`

- Description: TODO

### Fields

#### `public final static Tex bg = Inventory.invsq`

- Description: TODO

#### `public final static Coord bgsz = Inventory.sqsz`

- Description: TODO

#### `public final static RichText.Foundry ttfnd = new RichText.Foundry(TextAttribute.FAMILY, "SansSerif", TextAttribute.SIZE, UI.scale(10f))`

- Description: TODO

#### `private static Coord gsz = new Coord(4, 4)`

- Description: TODO

#### `public final Set<Pagina> paginae = new HashSet<Pagina>()`

- Description: TODO

#### `public Pagina cur`

- Description: TODO

#### `private final Map<Object, Pagina> pmap = new CacheMap<>(CacheMap.RefType.WEAK)`

- Description: TODO

#### `private Pagina dragging`

- Description: TODO

#### `private Collection<PagButton> curbtns = Collections.emptyList()`

- Description: TODO

#### `private PagButton pressed, layout[][] = new PagButton[gsz.x][gsz.y]`

- Description: TODO

#### `private PagButton pressed, layout[][] = new PagButton[gsz.x][gsz.y]`

- Description: TODO

#### `private UI.Grab grab`

- Description: TODO

#### `private int curoff = 0`

- Description: TODO

#### `private boolean recons = true, showkeys = false`

- Description: TODO

#### `private boolean recons = true, showkeys = false`

- Description: TODO

#### `private double fstart`

- Description: TODO

#### `public final MenuGrid scm`

- Description: TODO

#### `public final Object id`

- Description: TODO

#### `public Indir<Resource> res`

- Description: TODO

#### `public byte[] sdt = null`

- Description: TODO

#### `public int anew, tnew`

- Description: TODO

#### `public int anew, tnew`

- Description: TODO

#### `public Object[] rawinfo =`

- Description: TODO

#### `private PagButton button = null`

- Description: TODO

#### `public final int btn, modflags`

- Description: TODO

#### `public final int btn, modflags`

- Description: TODO

#### `public final Coord2d mc`

- Description: TODO

#### `public final ClickData click`

- Description: TODO

#### `public final Pagina pag`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `public final KeyBinding bind`

- Description: TODO

#### `private GSprite spr`

- Description: TODO

#### `private AButton act`

- Description: TODO

#### `private Pagina parent`

- Description: TODO

#### `public final AttrCache<Pipe.Op> rstate = new AttrCache<>(this::info, info ->`

- Description: TODO

#### `public final AttrCache<GItem.InfoOverlay<?>[]> ols = new AttrCache<>(this::info, info ->`

- Description: TODO

#### `public final AttrCache<Double> meter = new AttrCache<>(this::info, AttrCache.map1(GItem.MeterInfo.class, minf -> minf::meter))`

- Description: TODO

#### `private Tex keyrend = null`

- Description: TODO

#### `private boolean haskeyrend = false`

- Description: TODO

#### `private List<ItemInfo> info = null`

- Description: TODO

#### `public final PagButton next = new PagButton(new Pagina(this, null, Resource.local().loadwait("gfx/hud/sc-next").indir()))`

- Description: TODO

#### `public final PagButton bk = new PagButton(new Pagina(this, null, Resource.local().loadwait("gfx/hud/sc-back").indir()))`

- Description: TODO

#### `private PagButton curttp = null`

- Description: TODO

#### `private boolean curttl = false`

- Description: TODO

#### `private Tex curtt = null`

- Description: TODO

#### `private double hoverstart`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Pagina(MenuGrid scm, Object id, Indir<Resource> res)`

- Description: TODO

#### `public Resource res()`

- Description: TODO

#### `public Message data()`

- Description: TODO

#### `private void invalidate()`

- Description: TODO

#### `public PagButton button()`

- Description: TODO

#### `public Pagina parent()`

- Description: TODO

#### `public Interaction(int btn, int modflags, Coord2d mc, ClickData click)`

- Description: TODO

#### `public Interaction(int btn, int modflags)`

- Description: TODO

#### `public Interaction()`

- Description: TODO

#### `public PagButton(Pagina pag)`

- Description: TODO

#### `public AButton act()`

- Description: TODO

#### `public Pagina parent()`

- Description: TODO

#### `public GSprite spr()`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public KeyMatch hotkey()`

- Description: TODO

#### `public KeyBinding binding()`

- Description: TODO

#### `public void use(Interaction iact)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public BufferedImage img()`

- Description: TODO

#### `public void drawmain(GOut g, GSprite spr)`

- Description: TODO

#### `public void draw(GOut g, GSprite spr)`

- Description: TODO

#### `public String sortkey()`

- Description: TODO

#### `private char bindchr(KeyMatch key)`

- Description: TODO

#### `public Tex keyrend()`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public BufferedImage rendertt(boolean withpg)`

- Description: TODO

#### `public FactMaker()`

- Description: TODO

#### `public PagButton make(Pagina info)`

- Description: TODO

#### `public Pagina paginafor(Indir<Resource> res)`

- Description: TODO

#### `public Pagina paginafor(Object id, Indir<Resource> res)`

- Description: TODO

#### `private boolean cons(Pagina p, Collection<PagButton> buf)`

- Description: TODO

#### `private void announce(Pagina pag)`

- Description: TODO

#### `public MenuGrid()`

- Description: TODO

#### `private void updlayout()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `private PagButton bhit(Coord c)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public void change(Pagina dst)`

- Description: TODO

#### `public void use(PagButton r, Interaction iact, boolean reset)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO

#### `public KeyBinding getbinding(Coord cc)`

- Description: TODO
