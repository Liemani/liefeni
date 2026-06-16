# FightWnd

This file documents the responsibilities and members of `FightWnd`.

## Meta

- Source: [FightWnd.java](../../../src/haven/FightWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the fight wnd Haven component.

## Nested Types

### $_

- Role: Represents $ within FightWnd.
- Description: Describes the nested $  type used by the enclosing class.

### Action

- Role: Represents action within FightWnd.
- Description: Describes the nested action type used by the enclosing class.

### Actions

- Role: Represents actions within FightWnd.
- Description: Describes the nested actions type used by the enclosing class.

### BView

- Role: Represents bview within FightWnd.
- Description: Describes the nested bview type used by the enclosing class.

### Item

- Role: Represents item within FightWnd.
- Description: Describes the nested item type used by the enclosing class.

### Savelist

- Role: Represents savelist within FightWnd.
- Description: Describes the nested savelist type used by the enclosing class.

## Members

### Constants

#### `private static final OwnerContext.ClassResolver<FightWnd> actxr = new OwnerContext.ClassResolver<FightWnd>()`
- Role: Defines the shared actxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry namef = new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true)`
- Role: Defines the shared namef constant.
- Description: Shared constant used by the rest of the class.

#### `public static final String[] keys =`
- Role: Defines the shared fight wnd constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int nsave`
- Role: Stores the nsave value.
- Description: Backs the cached state for this file.

#### `public int maxact`
- Role: Stores the maxact value.
- Description: Backs the cached state for this file.

#### `public final Actions actlist`
- Role: Holds the actlist state.
- Description: Backs the cached state for this file.

#### `public final Savelist savelist`
- Role: Holds the savelist state.
- Description: Backs the cached state for this file.

#### `public List<Action> acts = new ArrayList<Action>()`
- Role: Caches acts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Action[] order`
- Role: Holds the order state.
- Description: Backs the cached state for this file.

#### `public int usesave`
- Role: Stores the usesave value.
- Description: Backs the cached state for this file.

#### `private final Text[] saves`
- Role: Stores the saves value.
- Description: Backs the cached state for this file.

#### `private final ImageInfoBox info`
- Role: Stores the info value.
- Description: Backs the cached state for this file.

#### `private final Label count`
- Role: Stores the count value.
- Description: Backs the cached state for this file.

#### `private final Map<Indir<Resource>, Object[]> actrawinfo = new HashMap<>()`
- Role: Caches actrawinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `private final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public int a, u`
- Role: Stores the u value.
- Description: Backs the cached state for this file.

#### `public int a, u`
- Role: Stores the u value.
- Description: Backs the cached state for this file.

#### `private String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> info = null`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Tex icon = null`
- Role: Stores the icon value.
- Description: Backs the cached state for this file.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Supports the loading operation used by the surrounding class.

#### `private Action drag = null`
- Role: Holds the drag state.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

#### `public final Action item`
- Role: Holds the item state.
- Description: Backs the cached state for this file.

#### `private final Label use`
- Role: Stores the use value.
- Description: Backs the cached state for this file.

#### `private int u = -1, a = -1`
- Role: Stores the u value.
- Description: Backs the cached state for this file.

#### `private int u = -1, a = -1`
- Role: Stores the u value.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

#### `private Coord dp`
- Role: Stores the dp value.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

#### `private Action drag`
- Role: Holds the drag state.
- Description: Backs the cached state for this file.

#### `private Coord dp`
- Role: Stores the dp value.
- Description: Backs the cached state for this file.

#### `private final Coord[] animoff = new Coord[order.length]`
- Role: Stores the animoff value.
- Description: Backs the cached state for this file.

#### `private final double[] animpr = new double[order.length]`
- Role: Stores the animpr value.
- Description: Backs the cached state for this file.

#### `private boolean anim = false`
- Role: Tracks the anim flag.
- Description: Supports the anim operation used by the surrounding class.

#### `final Tex[] keys = new Tex[10]`
- Role: Stores the keys value.
- Description: Backs the cached state for this file.

#### `private final List<Integer> items = Utils.range(nsave)`
- Role: Caches items entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int n`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private Text.Line redit = null`
- Role: Stores the redit value.
- Description: Backs the cached state for this file.

#### `private ReadLine ed`
- Role: Holds the ed state.
- Description: Backs the cached state for this file.

#### `private double focusstart`
- Role: Stores the focusstart value.
- Description: Backs the cached state for this file.

#### `private Coord lc = null`
- Role: Stores the lc value.
- Description: Backs the cached state for this file.

#### `private double lt = 0`
- Role: Stores the lt value.
- Description: Backs the cached state for this file.

#### `private Text unused = new Text.Foundry(attrf.font.deriveFont(java.awt.Font.ITALIC)).aa(true).render("Unused save")`
- Role: Stores the unused value.
- Description: Backs the cached state for this file.

### Methods

#### `public Action(Indir<Resource> res, int id, int a, int u)`
- Role: Performs action.
- Description: Supports the action operation used by the surrounding class.

#### `public String rendertext()`
- Role: Performs rendertext.
- Description: Supports the rendertext operation used by the surrounding class.

#### `private void a(int a)`
- Role: Returns the local player facing angle.
- Description: Returns the local player heading in radians.

#### `private void u(int u)`
- Role: Performs u.
- Description: Supports the u operation used by the surrounding class.

#### `public Resource resource()`
- Role: Performs resource.
- Description: Supports the resource operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public BufferedImage rendericon()`
- Role: Performs rendericon.
- Description: Supports the rendericon operation used by the surrounding class.

#### `public Tex icon()`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public BufferedImage renderinfo(int width)`
- Role: Performs renderinfo.
- Description: Supports the renderinfo operation used by the surrounding class.

#### `private void recount()`
- Role: Performs recount.
- Description: Supports the recount operation used by the surrounding class.

#### `public Actions(Coord sz)`
- Role: Performs actions.
- Description: Supports the actions operation used by the surrounding class.

#### `protected List<Action> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Widget makeitem(Action act, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public Item(Coord sz, Action act)`
- Role: Performs item.
- Description: Supports the item operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public boolean setu(int u)`
- Role: Performs setu.
- Description: Supports the setu operation used by the surrounding class.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.

#### `public void change(Action act)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void drag(Action act)`
- Role: Performs drag.
- Description: Supports the drag operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public int findorder(Action a)`
- Role: Performs findorder.
- Description: Supports the findorder operation used by the surrounding class.

#### `private BView()`
- Role: Performs bview.
- Description: Supports the bview operation used by the surrounding class.

#### `private Coord itemc(int i)`
- Role: Performs itemc.
- Description: Supports the itemc operation used by the surrounding class.

#### `private int citem(Coord c)`
- Role: Performs citem.
- Description: Supports the citem operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `private void animate(int s, Coord off)`
- Role: Performs animate.
- Description: Supports the animate operation used by the surrounding class.

#### `public boolean dropthing(Coord c, Object thing)`
- Role: Performs dropthing.
- Description: Supports the dropthing operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public Savelist(Coord sz)`
- Role: Performs savelist.
- Description: Supports the savelist operation used by the surrounding class.

#### `protected List<Integer> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Widget makeitem(Integer n, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public Item(Coord sz, int n)`
- Role: Performs item.
- Description: Supports the item operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void done(ReadLine buf)`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public void changed(ReadLine buf)`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void load(int n)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public void save(int n)`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public void use(int n)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public FightWnd(int nsave, int nact, int max)`
- Role: Creates a new FightWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public Action findact(int resid)`
- Role: Performs findact.
- Description: Supports the findact operation used by the surrounding class.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
