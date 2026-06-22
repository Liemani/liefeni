---
source: [GameUI.java](../../../../src/haven/GameUI.java)
created: 2026-06-13
updated: 2026-06-14
---

# GameUI

Owns the main in-game UI state.

## Nested Types

### $_

- Role: Registers the game UI widget resource.
- Description: Factory that creates the main in-game UI root.

### Anim

- Role: Animates a UI transition.
- Description: Window transition animation used by the game UI.

### Belt

- Role: Hosts one action belt.
- Description: Base widget for belt-style action rows.

### BeltSlot

- Role: Represents one belt slot.
- Description: Slot widget used by the action belt.

### CornerMap

- Role: Renders the corner minimap.
- Description: MiniMap variant anchored to the game UI corner.

### DraggedItem

- Role: Tracks a dragged inventory item.
- Description: Internal record for the item currently being dragged by the player.

### FKeyBelt

- Role: Hosts the function-key belt.
- Description: Belt widget for function-key mapped actions.

### GobTrans

- Role: Animates gob transitions.
- Description: Window transition used when gob-related UI content changes.

### Hidepanel

- Role: Hides a panel in the game UI.
- Description: Hidepanel container used to show or hide a game UI region.

### Hidewnd

- Role: Hides a window in the game UI.
- Description: Window wrapper used for collapsible UI subwindows.

### LogMessage

- Role: Represents one game log message.
- Description: Message record shown in the in-game text log.

### MainMenu

- Role: Hosts the main action menu.
- Description: Primary in-game menu widget.

### MapMenu

- Role: Hosts the map action menu.
- Description: Secondary menu widget for map-related actions.

### MenuButton

- Role: Renders one menu button.
- Description: Button used in the game UI menus.

### MenuCheckBox

- Role: Renders one menu checkbox.
- Description: Checkbox used in the game UI menus.

### NKeyBelt

- Role: Hosts the numbered-key belt.
- Description: Belt widget for number-key mapped actions.

### PagBeltSlot

- Role: Represents a pagina belt slot.
- Description: Belt slot widget that stores a pagina-bound action.

### Progress

- Role: Shows a game UI progress bar.
- Description: Progress widget embedded in the game UI.

### ResBeltSlot

- Role: Represents a resource belt slot.
- Description: Belt slot widget that stores a resource-bound action.

### TButton

- Role: Renders a toggle button.
- Description: Toggle button used by GameUI panels.

### Zergwnd

- Role: Hosts the zerg window.
- Description: Hidden game UI window used for the zerg-style panel group.

## Members

### Constants

#### `private static final int blpw = UI.scale(142), brpw = UI.scale(142)`
- Role: Defines the blpw constant.
- Description: Width reserved for the left and right belt panels.
- Value: `UI.scale(142), brpw = UI.scale(142)`

#### `private static final int blpw = UI.scale(142), brpw = UI.scale(142)`
- Role: Defines the blpw constant.
- Description: Width reserved for the left and right belt panels.
- Value: `UI.scale(142), brpw = UI.scale(142)`

#### `private static final OwnerContext.ClassResolver<ResBeltSlot> beltctxr = new OwnerContext.ClassResolver<ResBeltSlot>()`
- Role: Defines the beltctxr constant.
- Description: Owner-context resolver for resource belt slots.
- Value: `new OwnerContext.ClassResolver<ResBeltSlot>()`

#### `public static final KeyBinding kb_srch = KeyBinding.get("scm-srch", KeyMatch.forchar('Z', KeyMatch.C))`
- Role: Defines the kb srch constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("scm-srch", KeyMatch.forchar('Z', KeyMatch.C))`

#### `public static final double time = 0.1`
- Role: Defines the time constant.
- Description: Animation step duration used by game UI transitions.
- Value: `0.1`

#### `private static final Resource.Anim progt = Resource.local().loadwait("gfx/hud/prog").layer(Resource.animc)`
- Role: Defines the progt constant.
- Description: Animation resource that drives the progress widget.
- Value: `Resource.local().loadwait("gfx/hud/prog").layer(Resource.animc)`

#### `private static final int fitmarg = UI.scale(100)`
- Role: Defines the fitmarg constant.
- Description: Margin used when fitting windows into the visible game UI.
- Value: `UI.scale(100)`

#### `public static final KeyBinding kb_inv = KeyBinding.get("inv", KeyMatch.forcode(KeyEvent.VK_TAB, 0))`
- Role: Defines the kb inv constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("inv", KeyMatch.forcode(KeyEvent.VK_TAB, 0))`

#### `public static final KeyBinding kb_equ = KeyBinding.get("equ", KeyMatch.forchar('E', KeyMatch.C))`
- Role: Defines the kb equ constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("equ", KeyMatch.forchar('E', KeyMatch.C))`

#### `public static final KeyBinding kb_chr = KeyBinding.get("chr", KeyMatch.forchar('T', KeyMatch.C))`
- Role: Defines the kb chr constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("chr", KeyMatch.forchar('T', KeyMatch.C))`

#### `public static final KeyBinding kb_bud = KeyBinding.get("bud", KeyMatch.forchar('B', KeyMatch.C))`
- Role: Defines the kb bud constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("bud", KeyMatch.forchar('B', KeyMatch.C))`

#### `public static final KeyBinding kb_opt = KeyBinding.get("opt", KeyMatch.forchar('O', KeyMatch.C))`
- Role: Defines the kb opt constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("opt", KeyMatch.forchar('O', KeyMatch.C))`

#### `private static final Tex menubg = Resource.loadtex("gfx/hud/rbtn-bg")`
- Role: Defines the menubg constant.
- Description: Texture used by the UI component background or chrome.
- Value: `Resource.loadtex("gfx/hud/rbtn-bg")`

#### `public static final KeyBinding kb_map = KeyBinding.get("map", KeyMatch.forchar('A', KeyMatch.C))`
- Role: Defines the kb map constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("map", KeyMatch.forchar('A', KeyMatch.C))`

#### `public static final KeyBinding kb_claim = KeyBinding.get("ol-claim", KeyMatch.nil)`
- Role: Defines the kb claim constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("ol-claim", KeyMatch.nil)`

#### `public static final KeyBinding kb_vil = KeyBinding.get("ol-vil", KeyMatch.nil)`
- Role: Defines the kb vil constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("ol-vil", KeyMatch.nil)`

#### `public static final KeyBinding kb_rlm = KeyBinding.get("ol-rlm", KeyMatch.nil)`
- Role: Defines the kb rlm constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("ol-rlm", KeyMatch.nil)`

#### `public static final KeyBinding kb_ico = KeyBinding.get("map-icons", KeyMatch.nil)`
- Role: Defines the kb ico constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("map-icons", KeyMatch.nil)`

#### `private static final Tex mapmenubg = Resource.loadtex("gfx/hud/lbtn-bg")`
- Role: Defines the mapmenubg constant.
- Description: Texture used by the UI component background or chrome.
- Value: `Resource.loadtex("gfx/hud/lbtn-bg")`

#### `public static final KeyBinding kb_shoot = KeyBinding.get("screenshot", KeyMatch.forchar('S', KeyMatch.M))`
- Role: Defines the kb shoot constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("screenshot", KeyMatch.forchar('S', KeyMatch.M))`

#### `public static final KeyBinding kb_chat = KeyBinding.get("chat-toggle", KeyMatch.forchar('C', KeyMatch.C))`
- Role: Defines the kb chat constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("chat-toggle", KeyMatch.forchar('C', KeyMatch.C))`

#### `public static final KeyBinding kb_hide = KeyBinding.get("ui-toggle", KeyMatch.nil)`
- Role: Defines the kb hide constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("ui-toggle", KeyMatch.nil)`

#### `public static final KeyBinding kb_logout = KeyBinding.get("logout", KeyMatch.nil)`
- Role: Defines the kb logout constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("logout", KeyMatch.nil)`

#### `public static final KeyBinding kb_switchchr = KeyBinding.get("logout-cs", KeyMatch.nil)`
- Role: Defines the kb switchchr constant.
- Description: Keyboard shortcut binding used by the client UI.
- Value: `KeyBinding.get("logout-cs", KeyMatch.nil)`

#### `private static final Tex nkeybg = Resource.loadtex("gfx/hud/hb-main")`
- Role: Defines the nkeybg constant.
- Description: Texture used by the UI component background or chrome.
- Value: `Resource.loadtex("gfx/hud/hb-main")`

### Fields

#### `public final String chrid, genus`
- Role: Caches the genus value.
- Description: Caches the `genus` value for reuse.

#### `public final String chrid, genus`
- Role: Caches the genus value.
- Description: Caches the `genus` value for reuse.

#### `public final long plid`
- Role: Caches the plid value.
- Description: Caches the `plid` value for reuse.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Caches the menupanel value.
- Description: Caches the `menupanel` value for reuse.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Caches the menupanel value.
- Description: Caches the `menupanel` value for reuse.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Caches the menupanel value.
- Description: Caches the `menupanel` value for reuse.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Caches the menupanel value.
- Description: Caches the `menupanel` value for reuse.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Caches the menupanel value.
- Description: Caches the `menupanel` value for reuse.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Caches the menupanel value.
- Description: Caches the `menupanel` value for reuse.

#### `private final Hidepanel ulpanel, umpanel, urpanel, blpanel, mapmenupanel, brpanel, menupanel`
- Role: Caches the menupanel value.
- Description: Caches the `menupanel` value for reuse.

#### `public Widget portrait`
- Role: Caches the portrait value.
- Description: Caches the `portrait` value for reuse.

#### `public MenuGrid menu`
- Role: Caches the menu value.
- Description: Caches the `menu` value for reuse.

#### `public MapView map`
- Role: Caches the map value.
- Description: Caches the `map` value for reuse.

#### `public GobIcon.Settings iconconf`
- Role: Holds the gob icon settings used to choose minimap markers.
- Description: Holds the gob icon settings used to choose minimap markers.

#### `public MiniMap mmap`
- Role: Minimap widget attached to the game UI.
- Description: Minimap widget attached to the game UI.

#### `public Fightview fv`
- Role: Caches the fv value.
- Description: Caches the `fv` value for reuse.

#### `private List<Widget> meters = new LinkedList<Widget>()`
- Role: Meter widgets currently attached to the game UI.
- Description: Meter widgets currently attached to the game UI.

#### `private Text lastmsg`
- Role: Caches the last msg.
- Description: Caches the last msg value.

#### `private double msgtime`
- Role: Caches the msgtime value.
- Description: Caches the `msgtime` value for reuse.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Caches the iconwnd value.
- Description: Caches the `iconwnd` value for reuse.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Caches the iconwnd value.
- Description: Caches the `iconwnd` value for reuse.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Caches the iconwnd value.
- Description: Caches the `iconwnd` value for reuse.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Caches the iconwnd value.
- Description: Caches the `iconwnd` value for reuse.

#### `private Window invwnd, equwnd, makewnd, srchwnd, iconwnd`
- Role: Caches the iconwnd value.
- Description: Caches the `iconwnd` value for reuse.

#### `private Coord makewndc = Utils.getprefc("makewndc", new Coord(400, 200))`
- Role: Implements the makewndc operation.
- Description: Implements the coord operation.

#### `public Inventory maininv`
- Role: Caches the maininv value.
- Description: Caches the `maininv` value for reuse.

#### `public CharWnd chrwdg`
- Role: Caches the chrwdg value.
- Description: Caches the `chrwdg` value for reuse.

#### `public MapWnd mapfile`
- Role: Caches the mapfile value.
- Description: Caches the `mapfile` value for reuse.

#### `private Widget qqview`
- Role: Caches the qqview value.
- Description: Caches the `qqview` value for reuse.

#### `public BuddyWnd buddies`
- Role: Caches the buddies value.
- Description: Caches the `buddies` value for reuse.

#### `private final Zergwnd zerg`
- Role: Caches the zerg value.
- Description: Caches the `zerg` value for reuse.

#### `public final Collection<Polity> polities = new ArrayList<Polity>()`
- Role: List of polity entries shown in the social UI.
- Description: List of polity entries shown in the social UI.

#### `public HelpWnd help`
- Role: Caches the help value.
- Description: Caches the `help` value for reuse.

#### `public OptWnd opts`
- Role: Caches the opts value.
- Description: Caches the `opts` value for reuse.

#### `public Collection<DraggedItem> hand = new LinkedList<DraggedItem>()`
- Role: Dragged items currently held by the player.
- Description: Collection of dragged items currently in hand.

#### `public WItem vhand`
- Role: Caches the vhand value.
- Description: Caches the `vhand` value for reuse.

#### `public ChatUI chat`
- Role: Caches the chat value.
- Description: Caches the `chat` value for reuse.

#### `public ChatUI.Channel syslog`
- Role: Caches the syslog value.
- Description: Caches the `syslog` value for reuse.

#### `public Progress prog = null`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `private boolean afk = false`
- Role: Tracks whether afk is enabled.
- Description: Caches the `afk` value for reuse.

#### `public BeltSlot[] belt = new BeltSlot[144]`
- Role: Caches the belt value.
- Description: Caches the `belt` value for reuse.

#### `public Belt beltwdg`
- Role: Caches the beltwdg value.
- Description: Caches the `beltwdg` value for reuse.

#### `public final Map<Integer, String> polowners = new HashMap<Integer, String>()`
- Role: Lookup table from polity id to owner name.
- Description: Lookup table from polity id to owner name.

#### `public Bufflist buffs`
- Role: Caches the buffs value.
- Description: Caches the `buffs` value for reuse.

#### `public final int idx`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `public final ResData rdt`
- Role: Caches the rdt value.
- Description: Caches the `rdt` value for reuse.

#### `private GSprite spr = null`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `public final MenuGrid.Pagina pag`
- Role: Caches the pag value.
- Description: Caches the `pag` value for reuse.

#### `private final Coord minimapc`
- Role: Caches the minimapc value.
- Description: Caches the `minimapc` value for reuse.

#### `private final Coord menugridc`
- Role: Caches the menugridc value.
- Description: Caches the `menugridc` value for reuse.

#### `private final IButton[] fold_br = new IButton[4]`
- Role: Caches the fold br value.
- Description: Caches the `fold_br` value for reuse.

#### `private final IButton[] fold_bl = new IButton[4]`
- Role: Caches the fold bl value.
- Description: Caches the `fold_bl` value for reuse.

#### `public final String id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Coord g`
- Role: Caches the g value.
- Description: Caches the `g` value for reuse.

#### `public final Indir<Coord> base`
- Role: Caches the base value.
- Description: Caches the `base` value for reuse.

#### `public boolean tvis`
- Role: Tracks whether tvis is enabled.
- Description: Tracks whether the hide panel should be visible.

#### `private double cur`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `Tabs tabs = new Tabs(Coord.z, Coord.z, this)`
- Role: Implements the tabs operation.
- Description: Implements the tabs operation.

#### `final TButton kin, pol, pol2`
- Role: Caches the pol2 value.
- Description: Caches the `pol2` value for reuse.

#### `final TButton kin, pol, pol2`
- Role: Caches the pol2 value.
- Description: Caches the `pol2` value for reuse.

#### `final TButton kin, pol, pol2`
- Role: Caches the pol2 value.
- Description: Caches the `pol2` value for reuse.

#### `Tabs.Tab tab = null`
- Role: Caches the tab value.
- Description: Caches the `tab` value for reuse.

#### `final Tex inv`
- Role: Caches the inv value.
- Description: Caches the `inv` value for reuse.

#### `final GItem item`
- Role: Caches the item value.
- Description: Caches the `item` value for reuse.

#### `final Coord dc`
- Role: Caches the dc value.
- Description: Caches the `dc` value for reuse.

#### `private final BMap<String, Window> wndids = new HashBMap<String, Window>()`
- Role: Lookup table from window id to window instance.
- Description: Caches the window id or console command lookup table used by this UI.

#### `public final MapView map`
- Role: Caches the map value.
- Description: Caches the `map` value for reuse.

#### `public final long gobid`
- Role: Caches the gobid value.
- Description: Caches the `gobid` value for reuse.

#### `public final Window wnd`
- Role: Caches the wnd value.
- Description: Caches the `wnd` value for reuse.

#### `private Coord oc`
- Role: Caches the oc value.
- Description: Caches the `oc` value for reuse.

#### `public double prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `private TexI curi`
- Role: Caches the curi value.
- Description: Caches the `curi` value for reuse.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Lookup table from console command name to handler.
- Description: Caches the window id or console command lookup table used by this UI.

#### `private Coord lastsavegrid = null`
- Role: Caches the last savegrid.
- Description: Caches the last savegrid value.

#### `private int lastsaveseq = -1`
- Role: Caches the last saveseq.
- Description: Caches the last saveseq value.

#### `private double lastwndsave = 0`
- Role: Caches the last wndsave.
- Description: Caches the last wndsave value.

#### `private int uimode = 1`
- Role: Caches the uimode value.
- Description: Caches the `uimode` value for reuse.

#### `public final int beltkeys[] =`
- Role: Caches the beltkeys[] value.
- Description: Caches the `beltkeys[]` value for reuse.

#### `public int curbelt = 0`
- Role: Caches the curbelt value.
- Description: Caches the `curbelt` value for reuse.

#### `public int curbelt = 0`
- Role: Caches the curbelt value.
- Description: Caches the `curbelt` value for reuse.

#### `final Coord pagoff = UI.scale(new Coord(5, 25))`
- Role: Implements the pagoff operation.
- Description: Implements the coord operation.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Lookup table from console command name to handler.
- Description: Caches the window id or console command lookup table used by this UI.

### Methods

#### `public BeltSlot(int idx)`
- Role: Implements the belt slot operation.
- Description: Implements the belt slot operation.

#### `public abstract void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `public abstract void use(MenuGrid.Interaction iact)`
- Role: Implements the use operation.
- Description: Implements the use operation.

#### `public ResBeltSlot(int idx, ResData rdt)`
- Role: Implements the res belt slot operation.
- Description: Implements the res belt slot operation.

#### `public GSprite spr()`
- Role: Implements the spr operation.
- Description: Implements the spr operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `public void use(MenuGrid.Interaction iact)`
- Role: Implements the use operation.
- Description: Implements the use operation.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `private GameUI wdg()`
- Role: Implements the wdg operation.
- Description: Implements the wdg operation.

#### `public PagBeltSlot(int idx, MenuGrid.Pagina pag)`
- Role: Implements the pag belt slot operation.
- Description: Implements the pag belt slot operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `public void use(MenuGrid.Interaction iact)`
- Role: Implements the use operation.
- Description: Implements the use operation.

#### `public static MenuGrid.Pagina resolve(MenuGrid scm, Indir<Resource> resid)`
- Role: Resolves the target value.
- Description: Resolves the requested value from the current runtime state.

#### `public BeltSlot mkbeltslot(int idx, ResData rdt)`
- Role: Implements the mkbeltslot operation.
- Description: Implements the mkbeltslot operation.

#### `public Belt(Coord sz)`
- Role: Implements the belt operation.
- Description: Implements the belt operation.

#### `public void act(int idx, MenuGrid.Interaction iact)`
- Role: Implements the act operation.
- Description: Implements the act operation.

#### `public void keyact(int slot)`
- Role: Implements the keyact operation.
- Description: Implements the keyact operation.

#### `public abstract int beltslot(Coord c)`
- Role: Implements the beltslot operation.
- Description: Implements the beltslot operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean drop(Coord c, Coord ul)`
- Role: Implements the drop operation.
- Description: Implements the drop operation.

#### `public boolean iteminteract(Coord c, Coord ul)`
- Role: Implements the iteminteract operation.
- Description: Implements the iteminteract operation.

#### `public boolean dropthing(Coord c, Object thing)`
- Role: Implements the dropthing operation.
- Description: Dispatches a drop event through the widget tree.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public GameUI(String chrid, long plid, String genus)`
- Role: Creates a new GameUI instance.
- Description: Constructs the GameUI instance from the supplied inputs.

#### `protected void attached()`
- Role: Implements the attached operation.
- Description: Implements the attached operation.

#### `private void menubuttons(Widget bg)`
- Role: Implements the menubuttons operation.
- Description: Implements the menubuttons operation.

#### `private void updfold(boolean reset)`
- Role: Implements the updfold operation.
- Description: Implements the updfold operation.

#### `private void foldbuttons()`
- Role: Implements the foldbuttons operation.
- Description: Implements the foldbuttons operation.

#### `protected void added()`
- Role: Adds the ed.
- Description: Adds the ed.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public Hidepanel(String id, Indir<Coord> base, Coord g)`
- Role: Implements the hidepanel operation.
- Description: Implements the hidepanel operation.

#### `public <T extends Widget> T add(T child)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Coord base()`
- Role: Implements the base operation.
- Description: Implements the base operation.

#### `public void move(double a)`
- Role: Moves the current state.
- Description: Moves the hide panel to its anchored position.

#### `public void move()`
- Role: Moves the current state.
- Description: Moves the hide panel to its anchored position.

#### `public void presize()`
- Role: Implements the presize operation.
- Description: Implements the presize operation.

#### `public void cresize(Widget ch)`
- Role: Implements the cresize operation.
- Description: Implements the cresize operation.

#### `public boolean mshow(final boolean vis)`
- Role: Implements the mshow operation.
- Description: Implements the mshow operation.

#### `public boolean mshow()`
- Role: Implements the mshow operation.
- Description: Implements the mshow operation.

#### `public boolean cshow(boolean vis)`
- Role: Implements the cshow operation.
- Description: Implements the cshow operation.

#### `public void cdestroy(Widget w)`
- Role: Implements the cdestroy operation.
- Description: Implements the cdestroy operation.

#### `public Hidewnd(Coord sz, String cap, boolean lg)`
- Role: Implements the hidewnd operation.
- Description: Implements the hidewnd operation.

#### `public Hidewnd(Coord sz, String cap)`
- Role: Implements the hidewnd operation.
- Description: Implements the hidewnd operation.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Implements the wdgmsg operation.
- Description: Sends a widget message through the UI message path.

#### `TButton(String nm, boolean g)`
- Role: Handles the tbutton workflow.
- Description: Implements the t button operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `public void click()`
- Role: Handles click input for this widget.
- Description: Handles click input for this widget.

#### `Zergwnd()`
- Role: Handles the zergwnd workflow.
- Description: Implements the zergwnd operation.

#### `private void repack()`
- Role: Implements the repack operation.
- Description: Implements the repack operation.

#### `Tabs.Tab ntab(Widget ch, TButton btn)`
- Role: Implements the ntab operation.
- Description: Implements the ntab operation.

#### `void dtab(TButton btn)`
- Role: Implements the dtab operation.
- Description: Implements the dtab operation.

#### `void addpol(Polity p)`
- Role: Adds the pol.
- Description: Adds the pol.

#### `DraggedItem(GItem item, Coord dc)`
- Role: Handles the dragged item workflow.
- Description: Implements the dragged item operation.

#### `private void updhand()`
- Role: Implements the updhand operation.
- Description: Implements the updhand operation.

#### `private String mapfilename()`
- Role: Implements the mapfilename operation.
- Description: Implements the mapfilename operation.

#### `public Coord optplacement(Widget child, Coord org)`
- Role: Implements the optplacement operation.
- Description: Implements the optplacement operation.

#### `private void savewndpos()`
- Role: Saves the wndpos.
- Description: Saves the wndpos.

#### `public void addchild(Widget child, Object... args)`
- Role: Adds the child.
- Description: Adds the child.

#### `public GobTrans(MapView map, long gobid)`
- Role: Implements the gob trans operation.
- Description: Implements the gob trans operation.

#### `private Coord oc()`
- Role: Implements the oc operation.
- Description: Implements the oc operation.

#### `public Anim(Window wnd, boolean hide, Anim from)`
- Role: Implements the anim operation.
- Description: Implements the anim operation.

#### `public void draw(GOut g, Tex tex)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `public Anim show(Window wnd, Anim hide)`
- Role: Implements the show operation.
- Description: Implements the show operation.

#### `public Anim hide(Window wnd, Anim show)`
- Role: Implements the hide operation.
- Description: Implements the hide operation.

#### `public void cdestroy(Widget w)`
- Role: Implements the cdestroy operation.
- Description: Implements the cdestroy operation.

#### `public Progress(double prog)`
- Role: Implements the progress operation.
- Description: Implements the progress operation.

#### `public void destroy()`
- Role: Implements the destroy operation.
- Description: Implements the destroy operation.

#### `public void set(double prog)`
- Role: Updates the cached set.
- Description: Updates the cached set.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `public boolean checkhit(Coord c)`
- Role: Implements the checkhit operation.
- Description: Implements the checkhit operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `private String iconconfname()`
- Role: Implements the iconconfname operation.
- Description: Implements the iconconfname operation.

#### `private GobIcon.Settings loadiconconf()`
- Role: Loads the iconconf.
- Description: Loads the iconconf.

#### `public CornerMap(Coord sz, MapFile file)`
- Role: Implements the corner map operation.
- Description: Implements the corner map operation.

#### `public boolean dragp(int button)`
- Role: Implements the dragp operation.
- Description: Implements the dragp operation.

#### `public boolean clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`
- Role: Handles marker interaction.
- Description: Handles marker interaction.

#### `public boolean clickicon(DisplayIcon icon, Location loc, int button, boolean press)`
- Role: Handles icon interaction.
- Description: Handles icon interaction.

#### `public boolean clickloc(Location loc, int button, boolean press)`
- Role: Handles loc interaction.
- Description: Handles loc interaction.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `protected boolean allowzoomout()`
- Role: Implements the allowzoomout operation.
- Description: Implements the allowzoomout operation.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Finds the cmds.

#### `private void mapfiletick()`
- Role: Implements the mapfiletick operation.
- Description: Implements the mapfiletick operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Implements the wdgmsg operation.
- Description: Sends a widget message through the UI message path.

#### `private Coord fitwdg(Widget wdg, Coord c)`
- Role: Implements the fitwdg operation.
- Description: Implements the fitwdg operation.

#### `private void fitwdg(Widget wdg)`
- Role: Implements the fitwdg operation.
- Description: Implements the fitwdg operation.

#### `private boolean wndstate(Window wnd)`
- Role: Implements the wndstate operation.
- Description: Implements the wndstate operation.

#### `private void togglewnd(Window wnd)`
- Role: Implements the togglewnd operation.
- Description: Implements the togglewnd operation.

#### `MenuButton(String base, KeyBinding gkey, String tooltip)`
- Role: Handles the menu button workflow.
- Description: Implements the menu button operation.

#### `MenuCheckBox(String base, KeyBinding gkey, String tooltip)`
- Role: Handles the menu check box workflow.
- Description: Implements the menu check box operation.

#### `public MainMenu()`
- Role: Implements the main menu operation.
- Description: Implements the main menu operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `private void toggleol(String tag, boolean a)`
- Role: Implements the toggleol operation.
- Description: Implements the toggleol operation.

#### `public MapMenu()`
- Role: Implements the map menu operation.
- Description: Implements the map menu operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Implements the globtype operation.

#### `public void toggleui(int mode)`
- Role: Implements the toggleui operation.
- Description: Implements the toggleui operation.

#### `public void resetui()`
- Role: Resets the ui.
- Description: Resets the ui.

#### `public void toggleui()`
- Role: Implements the toggleui operation.
- Description: Implements the toggleui operation.

#### `public void resize(Coord sz)`
- Role: Implements the resize operation.
- Description: Implements the resize operation.

#### `public void presize()`
- Role: Implements the presize operation.
- Description: Implements the presize operation.

#### `public ChatUI.Channel.Message logmessage()`
- Role: Implements the logmessage operation.
- Description: Implements the logmessage operation.

#### `public boolean msg(UI.Notice msg)`
- Role: Displays an in-game message.
- Description: Implements the msg operation.

#### `public void error(String msg)`
- Role: Displays an error message.
- Description: Implements the error operation.

#### `public void act(String... args)`
- Role: Implements the act operation.
- Description: Implements the act operation.

#### `public void act(int mods, Coord mc, Gob gob, String... args)`
- Role: Implements the act operation.
- Description: Implements the act operation.

#### `public FKeyBelt()`
- Role: Implements the f key belt operation.
- Description: Implements the f key belt operation.

#### `private Coord beltc(int i)`
- Role: Implements the beltc operation.
- Description: Implements the beltc operation.

#### `public int beltslot(Coord c)`
- Role: Implements the beltslot operation.
- Description: Implements the beltslot operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Implements the globtype operation.

#### `public NKeyBelt()`
- Role: Implements the n key belt operation.
- Description: Implements the n key belt operation.

#### `private Coord beltc(int i)`
- Role: Implements the beltc operation.
- Description: Implements the beltc operation.

#### `public int beltslot(Coord c)`
- Role: Implements the beltslot operation.
- Description: Implements the beltslot operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GameUI content.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Implements the globtype operation.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Finds the cmds.

#### `public void alert(String msg)`
- Role: Implements the alert operation.
- Description: Implements the alert operation.

#### `public void print(String msg, Color col)`
- Role: Implements the print operation.
- Description: Implements the print operation.

#### `public void print(String msg)`
- Role: Implements the print operation.
- Description: Implements the print operation.