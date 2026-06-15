# GameUI

This file documents the responsibilities and members of `GameUI`.

## Meta

- Source: [GameUI.java](../../../src/haven/GameUI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Composes the main in-game UI.

## Nested Types

### $_

- Description: TODO

### Anim

- Description: TODO

### Belt

- Description: TODO

### BeltSlot

- Description: TODO

### CornerMap

- Description: TODO

### DraggedItem

- Description: TODO

### FKeyBelt

- Description: TODO

### GobTrans

- Description: TODO

### Hidepanel

- Description: TODO

### Hidewnd

- Description: TODO

### LogMessage

- Description: TODO

### MainMenu

- Description: TODO

### MapMenu

- Description: TODO

### MenuButton

- Description: TODO

### MenuCheckBox

- Description: TODO

### NKeyBelt

- Description: TODO

### PagBeltSlot

- Description: TODO

### Progress

- Description: TODO

### ResBeltSlot

- Description: TODO

### TButton

- Description: TODO

### Zergwnd

- Description: TODO

## Members

### Constants

#### `private static final int blpw = UI.scale(142), brpw = UI.scale(142)`

- Description: TODO

#### `private static final int blpw = UI.scale(142), brpw = UI.scale(142)`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<ResBeltSlot> beltctxr = new OwnerContext.ClassResolver<ResBeltSlot>()`

- Description: TODO

#### `public static final KeyBinding kb_srch = KeyBinding.get("scm-srch", KeyMatch.forchar('Z', KeyMatch.C))`

- Description: TODO

#### `public static final double time = 0.1`

- Description: TODO

#### `private static final Resource.Anim progt = Resource.local().loadwait("gfx/hud/prog").layer(Resource.animc)`

- Description: TODO

#### `private static final int fitmarg = UI.scale(100)`

- Description: TODO

#### `public static final KeyBinding kb_inv = KeyBinding.get("inv", KeyMatch.forcode(KeyEvent.VK_TAB, 0))`

- Description: TODO

#### `public static final KeyBinding kb_equ = KeyBinding.get("equ", KeyMatch.forchar('E', KeyMatch.C))`

- Description: TODO

#### `public static final KeyBinding kb_chr = KeyBinding.get("chr", KeyMatch.forchar('T', KeyMatch.C))`

- Description: TODO

#### `public static final KeyBinding kb_bud = KeyBinding.get("bud", KeyMatch.forchar('B', KeyMatch.C))`

- Description: TODO

#### `public static final KeyBinding kb_opt = KeyBinding.get("opt", KeyMatch.forchar('O', KeyMatch.C))`

- Description: TODO

#### `private static final Tex menubg = Resource.loadtex("gfx/hud/rbtn-bg")`

- Description: TODO

#### `public static final KeyBinding kb_map = KeyBinding.get("map", KeyMatch.forchar('A', KeyMatch.C))`

- Description: TODO

#### `public static final KeyBinding kb_claim = KeyBinding.get("ol-claim", KeyMatch.nil)`

- Description: TODO

#### `public static final KeyBinding kb_vil = KeyBinding.get("ol-vil", KeyMatch.nil)`

- Description: TODO

#### `public static final KeyBinding kb_rlm = KeyBinding.get("ol-rlm", KeyMatch.nil)`

- Description: TODO

#### `public static final KeyBinding kb_ico = KeyBinding.get("map-icons", KeyMatch.nil)`

- Description: TODO

#### `private static final Tex mapmenubg = Resource.loadtex("gfx/hud/lbtn-bg")`

- Description: TODO

#### `public static final KeyBinding kb_shoot = KeyBinding.get("screenshot", KeyMatch.forchar('S', KeyMatch.M))`

- Description: TODO

#### `public static final KeyBinding kb_chat = KeyBinding.get("chat-toggle", KeyMatch.forchar('C', KeyMatch.C))`

- Description: TODO

#### `public static final KeyBinding kb_hide = KeyBinding.get("ui-toggle", KeyMatch.nil)`

- Description: TODO

#### `public static final KeyBinding kb_logout = KeyBinding.get("logout", KeyMatch.nil)`

- Description: TODO

#### `public static final KeyBinding kb_switchchr = KeyBinding.get("logout-cs", KeyMatch.nil)`

- Description: TODO

#### `private static final Tex nkeybg = Resource.loadtex("gfx/hud/hb-main")`

- Description: TODO

### Fields

#### `public final String chrid, genus`

- Description: TODO

#### `public final String chrid, genus`

- Description: TODO

#### `public final long plid`

- Description: TODO

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`

- Description: TODO

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`

- Description: TODO

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`

- Description: TODO

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`

- Description: TODO

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`

- Description: TODO

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`

- Description: TODO

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`

- Description: TODO

#### `public Widget portrait`

- Description: TODO

#### `public MenuGrid menu`

- Description: TODO

#### `public MapView map`

- Description: TODO

#### `public GobIcon.Settings iconconf`

- Description: TODO

#### `public MiniMap mmap`

- Description: TODO

#### `public Fightview fv`

- Description: TODO

#### `private List<Widget> meters = new LinkedList<Widget>()`

- Description: TODO

#### `private Text lastmsg`

- Description: TODO

#### `private double msgtime`

- Description: TODO

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`

- Description: TODO

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`

- Description: TODO

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`

- Description: TODO

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`

- Description: TODO

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`

- Description: TODO

#### `private Coord makewndc = Utils.getprefc("makewndc", new Coord(400, 200))`

- Description: TODO

#### `public Inventory maininv`

- Description: TODO

#### `public CharWnd chrwdg`

- Description: TODO

#### `public MapWnd mapfile`

- Description: TODO

#### `private Widget qqview`

- Description: TODO

#### `public BuddyWnd buddies`

- Description: TODO

#### `private final Zergwnd zerg`

- Description: TODO

#### `public final Collection<Polity> polities = new ArrayList<Polity>()`

- Description: TODO

#### `public HelpWnd help`

- Description: TODO

#### `public OptWnd opts`

- Description: TODO

#### `public Collection<DraggedItem> hand = new LinkedList<DraggedItem>()`

- Description: TODO

#### `public WItem vhand`

- Description: TODO

#### `public ChatUI chat`

- Description: TODO

#### `public ChatUI.Channel syslog`

- Description: TODO

#### `public Progress prog = null`

- Description: TODO

#### `private boolean afk = false`

- Description: TODO

#### `public BeltSlot[] belt = new BeltSlot[144]`

- Description: TODO

#### `public Belt beltwdg`

- Description: TODO

#### `public final Map<Integer, String> polowners = new HashMap<Integer, String>()`

- Description: TODO

#### `public Bufflist buffs`

- Description: TODO

#### `public final int idx`

- Description: TODO

#### `public final ResData rdt`

- Description: TODO

#### `private GSprite spr = null`

- Description: TODO

#### `public final MenuGrid.Pagina pag`

- Description: TODO

#### `private final Coord minimapc`

- Description: TODO

#### `private final Coord menugridc`

- Description: TODO

#### `private final IButton[] fold_br = new IButton[4]`

- Description: TODO

#### `private final IButton[] fold_bl = new IButton[4]`

- Description: TODO

#### `public final String id`

- Description: TODO

#### `public final Coord g`

- Description: TODO

#### `public final Indir<Coord> base`

- Description: TODO

#### `public boolean tvis`

- Description: TODO

#### `private double cur`

- Description: TODO

#### `Tabs tabs = new Tabs(Coord.z, Coord.z, this)`

- Description: TODO

#### `final TButton kin, pol, pol2`

- Description: TODO

#### `final TButton kin, pol, pol2`

- Description: TODO

#### `final TButton kin, pol, pol2`

- Description: TODO

#### `Tabs.Tab tab = null`

- Description: TODO

#### `final Tex inv`

- Description: TODO

#### `final GItem item`

- Description: TODO

#### `final Coord dc`

- Description: TODO

#### `private final BMap<String, Window> wndids = new HashBMap<String, Window>()`

- Description: TODO

#### `public final MapView map`

- Description: TODO

#### `public final long gobid`

- Description: TODO

#### `public final Window wnd`

- Description: TODO

#### `private Coord oc`

- Description: TODO

#### `public double prog`

- Description: TODO

#### `private TexI curi`

- Description: TODO

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`

- Description: TODO

#### `private Coord lastsavegrid = null`

- Description: TODO

#### `private int lastsaveseq = -1`

- Description: TODO

#### `private double lastwndsave = 0`

- Description: TODO

#### `private int uimode = 1`

- Description: TODO

#### `public final int beltkeys[] =`

- Description: TODO

#### `public int curbelt = 0`

- Description: TODO

#### `public int curbelt = 0`

- Description: TODO

#### `final Coord pagoff = UI.scale(new Coord(5, 25))`

- Description: TODO

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`

- Description: TODO

### Methods

#### `public BeltSlot(int idx)`

- Description: TODO

#### `public abstract void draw(GOut g)`

- Description: TODO

#### `public abstract void use(MenuGrid.Interaction iact)`

- Description: TODO

#### `public ResBeltSlot(int idx, ResData rdt)`

- Description: TODO

#### `public GSprite spr()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void use(MenuGrid.Interaction iact)`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `private GameUI wdg()`

- Description: TODO

#### `public PagBeltSlot(int idx, MenuGrid.Pagina pag)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void use(MenuGrid.Interaction iact)`

- Description: TODO

#### `public static MenuGrid.Pagina resolve(MenuGrid scm, Indir<Resource> resid)`

- Description: TODO

#### `public BeltSlot mkbeltslot(int idx, ResData rdt)`

- Description: TODO

#### `public Belt(Coord sz)`

- Description: TODO

#### `public void act(int idx, MenuGrid.Interaction iact)`

- Description: TODO

#### `public void keyact(int slot)`

- Description: TODO

#### `public abstract int beltslot(Coord c)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean drop(Coord c, Coord ul)`

- Description: TODO

#### `public boolean iteminteract(Coord c, Coord ul)`

- Description: TODO

#### `public boolean dropthing(Coord c, Object thing)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public GameUI(String chrid, long plid, String genus)`

- Description: TODO

#### `protected void attached()`

- Description: TODO

#### `private void menubuttons(Widget bg)`

- Description: TODO

#### `private void updfold(boolean reset)`

- Description: TODO

#### `private void foldbuttons()`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public Hidepanel(String id, Indir<Coord> base, Coord g)`

- Description: TODO

#### `public <T extends Widget> T add(T child)`

- Description: TODO

#### `public Coord base()`

- Description: TODO

#### `public void move(double a)`

- Description: TODO

#### `public void move()`

- Description: TODO

#### `public void presize()`

- Description: TODO

#### `public void cresize(Widget ch)`

- Description: TODO

#### `public boolean mshow(final boolean vis)`

- Description: TODO

#### `public boolean mshow()`

- Description: TODO

#### `public boolean cshow(boolean vis)`

- Description: TODO

#### `public void cdestroy(Widget w)`

- Description: TODO

#### `public Hidewnd(Coord sz, String cap, boolean lg)`

- Description: TODO

#### `public Hidewnd(Coord sz, String cap)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `TButton(String nm, boolean g)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void click()`

- Description: TODO

#### `Zergwnd()`

- Description: TODO

#### `private void repack()`

- Description: TODO

#### `Tabs.Tab ntab(Widget ch, TButton btn)`

- Description: TODO

#### `void dtab(TButton btn)`

- Description: TODO

#### `void addpol(Polity p)`

- Description: TODO

#### `DraggedItem(GItem item, Coord dc)`

- Description: TODO

#### `private void updhand()`

- Description: TODO

#### `private String mapfilename()`

- Description: TODO

#### `public Coord optplacement(Widget child, Coord org)`

- Description: TODO

#### `private void savewndpos()`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public GobTrans(MapView map, long gobid)`

- Description: TODO

#### `private Coord oc()`

- Description: TODO

#### `public Anim(Window wnd, boolean hide, Anim from)`

- Description: TODO

#### `public void draw(GOut g, Tex tex)`

- Description: TODO

#### `public Anim show(Window wnd, Anim hide)`

- Description: TODO

#### `public Anim hide(Window wnd, Anim show)`

- Description: TODO

#### `public void cdestroy(Widget w)`

- Description: TODO

#### `public Progress(double prog)`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `public void set(double prog)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean checkhit(Coord c)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private String iconconfname()`

- Description: TODO

#### `private GobIcon.Settings loadiconconf()`

- Description: TODO

#### `public CornerMap(Coord sz, MapFile file)`

- Description: TODO

#### `public boolean dragp(int button)`

- Description: TODO

#### `public boolean clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`

- Description: TODO

#### `public boolean clickicon(DisplayIcon icon, Location loc, int button, boolean press)`

- Description: TODO

#### `public boolean clickloc(Location loc, int button, boolean press)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `protected boolean allowzoomout()`

- Description: TODO

#### `public Map<String, Console.Command> findcmds()`

- Description: TODO

#### `private void mapfiletick()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `private Coord fitwdg(Widget wdg, Coord c)`

- Description: TODO

#### `private void fitwdg(Widget wdg)`

- Description: TODO

#### `private boolean wndstate(Window wnd)`

- Description: TODO

#### `private void togglewnd(Window wnd)`

- Description: TODO

#### `MenuButton(String base, KeyBinding gkey, String tooltip)`

- Description: TODO

#### `MenuCheckBox(String base, KeyBinding gkey, String tooltip)`

- Description: TODO

#### `public MainMenu()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private void toggleol(String tag, boolean a)`

- Description: TODO

#### `public MapMenu()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO

#### `public void toggleui(int mode)`

- Description: TODO

#### `public void resetui()`

- Description: TODO

#### `public void toggleui()`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public void presize()`

- Description: TODO

#### `public ChatUI.Channel.Message logmessage()`

- Description: TODO

#### `public boolean msg(UI.Notice msg)`

- Description: TODO

#### `public void error(String msg)`

- Description: TODO

#### `public void act(String... args)`

- Description: TODO

#### `public void act(int mods, Coord mc, Gob gob, String... args)`

- Description: TODO

#### `public FKeyBelt()`

- Description: TODO

#### `private Coord beltc(int i)`

- Description: TODO

#### `public int beltslot(Coord c)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO

#### `public NKeyBelt()`

- Description: TODO

#### `private Coord beltc(int i)`

- Description: TODO

#### `public int beltslot(Coord c)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO

#### `public Map<String, Console.Command> findcmds()`

- Description: TODO

#### `public void alert(String msg)`

- Description: TODO

#### `public void print(String msg, Color col)`

- Description: TODO

#### `public void print(String msg)`

- Description: TODO
