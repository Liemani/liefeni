# GameUI

This file documents the responsibilities and members of `GameUI`.

## Meta

- Source: [GameUI.java](../../../src/haven/GameUI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Owns the main in-game UI state.

## Nested Types

### $_

- Role: Represents $ within GameUI.
- Description: Describes the nested $  type used by the enclosing class.

### Anim

- Role: Represents anim within GameUI.
- Description: Describes the nested anim type used by the enclosing class.

### Belt

- Role: Represents belt within GameUI.
- Description: Describes the nested belt type used by the enclosing class.

### BeltSlot

- Role: Represents belt slot within GameUI.
- Description: Describes the nested belt slot type used by the enclosing class.

### CornerMap

- Role: Represents corner map within GameUI.
- Description: Describes the nested corner map type used by the enclosing class.

### DraggedItem

- Role: Represents dragged item within GameUI.
- Description: Describes the nested dragged item type used by the enclosing class.

### FKeyBelt

- Role: Represents fkey belt within GameUI.
- Description: Describes the nested fkey belt type used by the enclosing class.

### GobTrans

- Role: Represents gob trans within GameUI.
- Description: Describes the nested gob trans type used by the enclosing class.

### Hidepanel

- Role: Represents hidepanel within GameUI.
- Description: Describes the nested hidepanel type used by the enclosing class.

### Hidewnd

- Role: Represents hidewnd within GameUI.
- Description: Describes the nested hidewnd type used by the enclosing class.

### LogMessage

- Role: Represents log message within GameUI.
- Description: Describes the nested log message type used by the enclosing class.

### MainMenu

- Role: Represents main menu within GameUI.
- Description: Describes the nested main menu type used by the enclosing class.

### MapMenu

- Role: Represents map menu within GameUI.
- Description: Describes the nested map menu type used by the enclosing class.

### MenuButton

- Role: Represents menu button within GameUI.
- Description: Describes the nested menu button type used by the enclosing class.

### MenuCheckBox

- Role: Represents menu check box within GameUI.
- Description: Describes the nested menu check box type used by the enclosing class.

### NKeyBelt

- Role: Represents nkey belt within GameUI.
- Description: Describes the nested nkey belt type used by the enclosing class.

### PagBeltSlot

- Role: Represents pag belt slot within GameUI.
- Description: Describes the nested pag belt slot type used by the enclosing class.

### Progress

- Role: Represents progress within GameUI.
- Description: Describes the nested progress type used by the enclosing class.

### ResBeltSlot

- Role: Represents res belt slot within GameUI.
- Description: Describes the nested res belt slot type used by the enclosing class.

### TButton

- Role: Represents tbutton within GameUI.
- Description: Describes the nested tbutton type used by the enclosing class.

### Zergwnd

- Role: Represents zergwnd within GameUI.
- Description: Describes the nested zergwnd type used by the enclosing class.

## Members

### Constants

#### `private static final int blpw = UI.scale(142), brpw = UI.scale(142)`
- Role: Defines the shared blpw constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int blpw = UI.scale(142), brpw = UI.scale(142)`
- Role: Defines the shared blpw constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<ResBeltSlot> beltctxr = new OwnerContext.ClassResolver<ResBeltSlot>()`
- Role: Defines the shared beltctxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_srch = KeyBinding.get("scm-srch", KeyMatch.forchar('Z', KeyMatch.C))`
- Role: Defines the shared kb srch constant.
- Description: Shared constant used by the rest of the class.

#### `public static final double time = 0.1`
- Role: Defines the shared time constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Resource.Anim progt = Resource.local().loadwait("gfx/hud/prog").layer(Resource.animc)`
- Role: Defines the shared progt constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int fitmarg = UI.scale(100)`
- Role: Defines the shared fitmarg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_inv = KeyBinding.get("inv", KeyMatch.forcode(KeyEvent.VK_TAB, 0))`
- Role: Defines the shared kb inv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_equ = KeyBinding.get("equ", KeyMatch.forchar('E', KeyMatch.C))`
- Role: Defines the shared kb equ constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_chr = KeyBinding.get("chr", KeyMatch.forchar('T', KeyMatch.C))`
- Role: Defines the shared kb chr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_bud = KeyBinding.get("bud", KeyMatch.forchar('B', KeyMatch.C))`
- Role: Defines the shared kb bud constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_opt = KeyBinding.get("opt", KeyMatch.forchar('O', KeyMatch.C))`
- Role: Defines the shared kb opt constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex menubg = Resource.loadtex("gfx/hud/rbtn-bg")`
- Role: Defines the shared menubg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_map = KeyBinding.get("map", KeyMatch.forchar('A', KeyMatch.C))`
- Role: Defines the shared kb map constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_claim = KeyBinding.get("ol-claim", KeyMatch.nil)`
- Role: Defines the shared kb claim constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_vil = KeyBinding.get("ol-vil", KeyMatch.nil)`
- Role: Defines the shared kb vil constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_rlm = KeyBinding.get("ol-rlm", KeyMatch.nil)`
- Role: Defines the shared kb rlm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_ico = KeyBinding.get("map-icons", KeyMatch.nil)`
- Role: Defines the shared kb ico constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex mapmenubg = Resource.loadtex("gfx/hud/lbtn-bg")`
- Role: Defines the shared mapmenubg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_shoot = KeyBinding.get("screenshot", KeyMatch.forchar('S', KeyMatch.M))`
- Role: Defines the shared kb shoot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_chat = KeyBinding.get("chat-toggle", KeyMatch.forchar('C', KeyMatch.C))`
- Role: Defines the shared kb chat constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_hide = KeyBinding.get("ui-toggle", KeyMatch.nil)`
- Role: Defines the shared kb hide constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_logout = KeyBinding.get("logout", KeyMatch.nil)`
- Role: Defines the shared kb logout constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_switchchr = KeyBinding.get("logout-cs", KeyMatch.nil)`
- Role: Defines the shared kb switchchr constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex nkeybg = Resource.loadtex("gfx/hud/hb-main")`
- Role: Defines the shared nkeybg constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final String chrid, genus`
- Role: Stores the genus value.
- Description: Backs the cached state for this file.

#### `public final String chrid, genus`
- Role: Stores the genus value.
- Description: Backs the cached state for this file.

#### `public final long plid`
- Role: Stores the plid value.
- Description: Backs the cached state for this file.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Holds the menupanel state.
- Description: Backs the cached state for this file.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Holds the menupanel state.
- Description: Backs the cached state for this file.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Holds the menupanel state.
- Description: Backs the cached state for this file.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Holds the menupanel state.
- Description: Backs the cached state for this file.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Holds the menupanel state.
- Description: Backs the cached state for this file.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Holds the menupanel state.
- Description: Backs the cached state for this file.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Holds the menupanel state.
- Description: Backs the cached state for this file.

#### `public Widget portrait`
- Role: Stores the portrait value.
- Description: Backs the cached state for this file.

#### `public MenuGrid menu`
- Role: Stores the menu value.
- Description: Backs the cached state for this file.

#### `public MapView map`
- Role: Stores the map value.
- Description: Backs the cached state for this file.

#### `public GobIcon.Settings iconconf`
- Role: Stores the iconconf value.
- Description: Backs the cached state for this file.

#### `public MiniMap mmap`
- Role: Caches mmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Fightview fv`
- Role: Holds the fv state.
- Description: Backs the cached state for this file.

#### `private List<Widget> meters = new LinkedList<Widget>()`
- Role: Caches meters entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Text lastmsg`
- Role: Stores the lastmsg value.
- Description: Backs the cached state for this file.

#### `private double msgtime`
- Role: Stores the msgtime value.
- Description: Backs the cached state for this file.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Holds the iconwnd state.
- Description: Backs the cached state for this file.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Holds the iconwnd state.
- Description: Backs the cached state for this file.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Holds the iconwnd state.
- Description: Backs the cached state for this file.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Holds the iconwnd state.
- Description: Backs the cached state for this file.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Holds the iconwnd state.
- Description: Backs the cached state for this file.

#### `private Coord makewndc = Utils.getprefc("makewndc", new Coord(400, 200))`
- Role: Stores the makewndc value.
- Description: Backs the cached state for this file.

#### `public Inventory maininv`
- Role: Holds the maininv state.
- Description: Backs the cached state for this file.

#### `public CharWnd chrwdg`
- Role: Stores the chrwdg value.
- Description: Backs the cached state for this file.

#### `public MapWnd mapfile`
- Role: Holds the mapfile state.
- Description: Backs the cached state for this file.

#### `private Widget qqview`
- Role: Stores the qqview value.
- Description: Backs the cached state for this file.

#### `public BuddyWnd buddies`
- Role: Holds the buddies state.
- Description: Backs the cached state for this file.

#### `private final Zergwnd zerg`
- Role: Holds the zerg state.
- Description: Backs the cached state for this file.

#### `public final Collection<Polity> polities = new ArrayList<Polity>()`
- Role: Caches polities entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public HelpWnd help`
- Role: Holds the help state.
- Description: Backs the cached state for this file.

#### `public OptWnd opts`
- Role: Holds the opts state.
- Description: Backs the cached state for this file.

#### `public Collection<DraggedItem> hand = new LinkedList<DraggedItem>()`
- Role: Caches hand entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public WItem vhand`
- Role: Holds the vhand state.
- Description: Backs the cached state for this file.

#### `public ChatUI chat`
- Role: Stores the chat value.
- Description: Backs the cached state for this file.

#### `public ChatUI.Channel syslog`
- Role: Stores the syslog value.
- Description: Backs the cached state for this file.

#### `public Progress prog = null`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

#### `private boolean afk = false`
- Role: Tracks the afk flag.
- Description: Supports the afk operation used by the surrounding class.

#### `public BeltSlot[] belt = new BeltSlot[144]`
- Role: Holds the belt state.
- Description: Backs the cached state for this file.

#### `public Belt beltwdg`
- Role: Holds the beltwdg state.
- Description: Backs the cached state for this file.

#### `public final Map<Integer, String> polowners = new HashMap<Integer, String>()`
- Role: Caches polowners entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Bufflist buffs`
- Role: Holds the buffs state.
- Description: Backs the cached state for this file.

#### `public final int idx`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `public final ResData rdt`
- Role: Holds the rdt state.
- Description: Backs the cached state for this file.

#### `private GSprite spr = null`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `public final MenuGrid.Pagina pag`
- Role: Stores the pag value.
- Description: Backs the cached state for this file.

#### `private final Coord minimapc`
- Role: Stores the minimapc value.
- Description: Backs the cached state for this file.

#### `private final Coord menugridc`
- Role: Stores the menugridc value.
- Description: Backs the cached state for this file.

#### `private final IButton[] fold_br = new IButton[4]`
- Role: Holds the fold br state.
- Description: Backs the cached state for this file.

#### `private final IButton[] fold_bl = new IButton[4]`
- Role: Holds the fold bl state.
- Description: Backs the cached state for this file.

#### `public final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Coord g`
- Role: Stores the g value.
- Description: Backs the cached state for this file.

#### `public final Indir<Coord> base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `public boolean tvis`
- Role: Tracks the tvis flag.
- Description: Supports the tvis operation used by the surrounding class.

#### `private double cur`
- Role: Stores the cur value.
- Description: Backs the cached state for this file.

#### `Tabs tabs = new Tabs(Coord.z, Coord.z, this)`
- Role: Holds the tabs state.
- Description: Backs the cached state for this file.

#### `final TButton kin, pol, pol2`
- Role: Holds the pol2 state.
- Description: Backs the cached state for this file.

#### `final TButton kin, pol, pol2`
- Role: Holds the pol2 state.
- Description: Backs the cached state for this file.

#### `final TButton kin, pol, pol2`
- Role: Holds the pol2 state.
- Description: Backs the cached state for this file.

#### `Tabs.Tab tab = null`
- Role: Holds the tab state.
- Description: Backs the cached state for this file.

#### `final Tex inv`
- Role: Stores the inv value.
- Description: Backs the cached state for this file.

#### `final GItem item`
- Role: Holds the item state.
- Description: Backs the cached state for this file.

#### `final Coord dc`
- Role: Stores the dc value.
- Description: Backs the cached state for this file.

#### `private final BMap<String, Window> wndids = new HashBMap<String, Window>()`
- Role: Caches wndids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final MapView map`
- Role: Stores the map value.
- Description: Backs the cached state for this file.

#### `public final long gobid`
- Role: Stores the gobid value.
- Description: Backs the cached state for this file.

#### `public final Window wnd`
- Role: Holds the wnd state.
- Description: Backs the cached state for this file.

#### `private Coord oc`
- Role: Stores the oc value.
- Description: Backs the cached state for this file.

#### `public double prog`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

#### `private TexI curi`
- Role: Stores the curi value.
- Description: Backs the cached state for this file.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Caches cmdmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Coord lastsavegrid = null`
- Role: Stores the lastsavegrid value.
- Description: Backs the cached state for this file.

#### `private int lastsaveseq = -1`
- Role: Stores the lastsaveseq value.
- Description: Backs the cached state for this file.

#### `private double lastwndsave = 0`
- Role: Stores the lastwndsave value.
- Description: Backs the cached state for this file.

#### `private int uimode = 1`
- Role: Stores the uimode value.
- Description: Backs the cached state for this file.

#### `public final int beltkeys[] =`
- Role: Stores the game ui state.
- Description: Backs the cached state for this file.

#### `public int curbelt = 0`
- Role: Stores the curbelt value.
- Description: Backs the cached state for this file.

#### `public int curbelt = 0`
- Role: Stores the curbelt value.
- Description: Backs the cached state for this file.

#### `final Coord pagoff = UI.scale(new Coord(5, 25))`
- Role: Stores the pagoff value.
- Description: Backs the cached state for this file.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Caches cmdmap entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public BeltSlot(int idx)`
- Role: Performs belt slot.
- Description: Supports the belt slot operation used by the surrounding class.

#### `public abstract void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public abstract void use(MenuGrid.Interaction iact)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public ResBeltSlot(int idx, ResData rdt)`
- Role: Performs res belt slot.
- Description: Supports the res belt slot operation used by the surrounding class.

#### `public GSprite spr()`
- Role: Performs spr.
- Description: Supports the spr operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void use(MenuGrid.Interaction iact)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `private GameUI wdg()`
- Role: Performs wdg.
- Description: Supports the wdg operation used by the surrounding class.

#### `public PagBeltSlot(int idx, MenuGrid.Pagina pag)`
- Role: Performs pag belt slot.
- Description: Supports the pag belt slot operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void use(MenuGrid.Interaction iact)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public static MenuGrid.Pagina resolve(MenuGrid scm, Indir<Resource> resid)`
- Role: Resolves the target value.
- Description: Supports the resolve operation used by the surrounding class.

#### `public BeltSlot mkbeltslot(int idx, ResData rdt)`
- Role: Performs mkbeltslot.
- Description: Supports the mkbeltslot operation used by the surrounding class.

#### `public Belt(Coord sz)`
- Role: Performs belt.
- Description: Supports the belt operation used by the surrounding class.

#### `public void act(int idx, MenuGrid.Interaction iact)`
- Role: Performs act.
- Description: Supports the act operation used by the surrounding class.

#### `public void keyact(int slot)`
- Role: Performs keyact.
- Description: Supports the keyact operation used by the surrounding class.

#### `public abstract int beltslot(Coord c)`
- Role: Performs beltslot.
- Description: Supports the beltslot operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean drop(Coord c, Coord ul)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public boolean iteminteract(Coord c, Coord ul)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.

#### `public boolean dropthing(Coord c, Object thing)`
- Role: Performs dropthing.
- Description: Supports the dropthing operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public GameUI(String chrid, long plid, String genus)`
- Role: Creates a new GameUI instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void attached()`
- Role: Performs attached.
- Description: Supports the attached operation used by the surrounding class.

#### `private void menubuttons(Widget bg)`
- Role: Performs menubuttons.
- Description: Supports the menubuttons operation used by the surrounding class.

#### `private void updfold(boolean reset)`
- Role: Performs updfold.
- Description: Supports the updfold operation used by the surrounding class.

#### `private void foldbuttons()`
- Role: Performs foldbuttons.
- Description: Supports the foldbuttons operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public Hidepanel(String id, Indir<Coord> base, Coord g)`
- Role: Performs hidepanel.
- Description: Supports the hidepanel operation used by the surrounding class.

#### `public <T extends Widget> T add(T child)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord base()`
- Role: Performs base.
- Description: Supports the base operation used by the surrounding class.

#### `public void move(double a)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void move()`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void presize()`
- Role: Performs presize.
- Description: Supports the presize operation used by the surrounding class.

#### `public void cresize(Widget ch)`
- Role: Performs cresize.
- Description: Supports the cresize operation used by the surrounding class.

#### `public boolean mshow(final boolean vis)`
- Role: Performs mshow.
- Description: Supports the mshow operation used by the surrounding class.

#### `public boolean mshow()`
- Role: Performs mshow.
- Description: Supports the mshow operation used by the surrounding class.

#### `public boolean cshow(boolean vis)`
- Role: Performs cshow.
- Description: Supports the cshow operation used by the surrounding class.

#### `public void cdestroy(Widget w)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public Hidewnd(Coord sz, String cap, boolean lg)`
- Role: Performs hidewnd.
- Description: Supports the hidewnd operation used by the surrounding class.

#### `public Hidewnd(Coord sz, String cap)`
- Role: Performs hidewnd.
- Description: Supports the hidewnd operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `TButton(String nm, boolean g)`
- Role: Handles the tbutton workflow.
- Description: Supports the tbutton operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `Zergwnd()`
- Role: Handles the zergwnd workflow.
- Description: Supports the zergwnd operation used by the surrounding class.

#### `private void repack()`
- Role: Performs repack.
- Description: Supports the repack operation used by the surrounding class.

#### `Tabs.Tab ntab(Widget ch, TButton btn)`
- Role: Performs ntab.
- Description: Supports the ntab operation used by the surrounding class.

#### `void dtab(TButton btn)`
- Role: Performs dtab.
- Description: Supports the dtab operation used by the surrounding class.

#### `void addpol(Polity p)`
- Role: Performs addpol.
- Description: Supports the addpol operation used by the surrounding class.

#### `DraggedItem(GItem item, Coord dc)`
- Role: Handles the dragged item workflow.
- Description: Supports the dragged item operation used by the surrounding class.

#### `private void updhand()`
- Role: Performs updhand.
- Description: Supports the updhand operation used by the surrounding class.

#### `private String mapfilename()`
- Role: Performs mapfilename.
- Description: Supports the mapfilename operation used by the surrounding class.

#### `public Coord optplacement(Widget child, Coord org)`
- Role: Performs optplacement.
- Description: Supports the optplacement operation used by the surrounding class.

#### `private void savewndpos()`
- Role: Performs savewndpos.
- Description: Supports the savewndpos operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public GobTrans(MapView map, long gobid)`
- Role: Performs gob trans.
- Description: Supports the gob trans operation used by the surrounding class.

#### `private Coord oc()`
- Role: Performs oc.
- Description: Supports the oc operation used by the surrounding class.

#### `public Anim(Window wnd, boolean hide, Anim from)`
- Role: Performs anim.
- Description: Supports the anim operation used by the surrounding class.

#### `public void draw(GOut g, Tex tex)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Anim show(Window wnd, Anim hide)`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public Anim hide(Window wnd, Anim show)`
- Role: Performs hide.
- Description: Supports the hide operation used by the surrounding class.

#### `public void cdestroy(Widget w)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public Progress(double prog)`
- Role: Performs progress.
- Description: Supports the progress operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void set(double prog)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private String iconconfname()`
- Role: Performs iconconfname.
- Description: Supports the iconconfname operation used by the surrounding class.

#### `private GobIcon.Settings loadiconconf()`
- Role: Performs loadiconconf.
- Description: Supports the loadiconconf operation used by the surrounding class.

#### `public CornerMap(Coord sz, MapFile file)`
- Role: Performs corner map.
- Description: Supports the corner map operation used by the surrounding class.

#### `public boolean dragp(int button)`
- Role: Performs dragp.
- Description: Supports the dragp operation used by the surrounding class.

#### `public boolean clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`
- Role: Performs clickmarker.
- Description: Supports the clickmarker operation used by the surrounding class.

#### `public boolean clickicon(DisplayIcon icon, Location loc, int button, boolean press)`
- Role: Performs clickicon.
- Description: Supports the clickicon operation used by the surrounding class.

#### `public boolean clickloc(Location loc, int button, boolean press)`
- Role: Performs clickloc.
- Description: Supports the clickloc operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `protected boolean allowzoomout()`
- Role: Performs allowzoomout.
- Description: Supports the allowzoomout operation used by the surrounding class.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.

#### `private void mapfiletick()`
- Role: Performs mapfiletick.
- Description: Supports the mapfiletick operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `private Coord fitwdg(Widget wdg, Coord c)`
- Role: Performs fitwdg.
- Description: Supports the fitwdg operation used by the surrounding class.

#### `private void fitwdg(Widget wdg)`
- Role: Performs fitwdg.
- Description: Supports the fitwdg operation used by the surrounding class.

#### `private boolean wndstate(Window wnd)`
- Role: Performs wndstate.
- Description: Supports the wndstate operation used by the surrounding class.

#### `private void togglewnd(Window wnd)`
- Role: Performs togglewnd.
- Description: Supports the togglewnd operation used by the surrounding class.

#### `MenuButton(String base, KeyBinding gkey, String tooltip)`
- Role: Handles the menu button workflow.
- Description: Supports the menu button operation used by the surrounding class.

#### `MenuCheckBox(String base, KeyBinding gkey, String tooltip)`
- Role: Handles the menu check box workflow.
- Description: Supports the menu check box operation used by the surrounding class.

#### `public MainMenu()`
- Role: Performs main menu.
- Description: Supports the main menu operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private void toggleol(String tag, boolean a)`
- Role: Performs toggleol.
- Description: Supports the toggleol operation used by the surrounding class.

#### `public MapMenu()`
- Role: Performs map menu.
- Description: Supports the map menu operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.

#### `public void toggleui(int mode)`
- Role: Performs toggleui.
- Description: Supports the toggleui operation used by the surrounding class.

#### `public void resetui()`
- Role: Performs resetui.
- Description: Supports the resetui operation used by the surrounding class.

#### `public void toggleui()`
- Role: Performs toggleui.
- Description: Supports the toggleui operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void presize()`
- Role: Performs presize.
- Description: Supports the presize operation used by the surrounding class.

#### `public ChatUI.Channel.Message logmessage()`
- Role: Performs logmessage.
- Description: Supports the logmessage operation used by the surrounding class.

#### `public boolean msg(UI.Notice msg)`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.

#### `public void error(String msg)`
- Role: Displays an error message.
- Description: Supports the error operation used by the surrounding class.

#### `public void act(String... args)`
- Role: Performs act.
- Description: Supports the act operation used by the surrounding class.

#### `public void act(int mods, Coord mc, Gob gob, String... args)`
- Role: Performs act.
- Description: Supports the act operation used by the surrounding class.

#### `public FKeyBelt()`
- Role: Performs fkey belt.
- Description: Supports the fkey belt operation used by the surrounding class.

#### `private Coord beltc(int i)`
- Role: Performs beltc.
- Description: Supports the beltc operation used by the surrounding class.

#### `public int beltslot(Coord c)`
- Role: Performs beltslot.
- Description: Supports the beltslot operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.

#### `public NKeyBelt()`
- Role: Performs nkey belt.
- Description: Supports the nkey belt operation used by the surrounding class.

#### `private Coord beltc(int i)`
- Role: Performs beltc.
- Description: Supports the beltc operation used by the surrounding class.

#### `public int beltslot(Coord c)`
- Role: Performs beltslot.
- Description: Supports the beltslot operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.

#### `public void alert(String msg)`
- Role: Performs alert.
- Description: Supports the alert operation used by the surrounding class.

#### `public void print(String msg, Color col)`
- Role: Performs print.
- Description: Supports the print operation used by the surrounding class.

#### `public void print(String msg)`
- Role: Performs print.
- Description: Supports the print operation used by the surrounding class.
