---
source: [FightWnd.java](../../../../src/haven/FightWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# FightWnd

Represents the fight wnd Haven component.

## Nested Types

### $_

- Role: Registers the fight window widget resource.
- Description: Factory that creates the fight window widget.

### Action

- Role: Models one combat action entry.
- Description: Holds action state, resource references, use counts, and rendering helpers for the action list.

### Actions

- Role: Renders the action list.
- Description: Scrollable list widget that manages action ordering, dragging, and per-action controls.

### BView

- Role: Renders the battle view pane.
- Description: Widget that displays combat state and handles battle-view interactions.

### Item

- Role: Renders one action row.
- Description: Row widget that shows the action icon, use counter, controls, and drag behavior.

### Savelist

- Role: Renders the saved-action list.
- Description: Scrollable list widget for saved combat action slots.

## Members

### Constants

#### `private static final OwnerContext.ClassResolver<FightWnd> actxr = new OwnerContext.ClassResolver<FightWnd>()`
- Role: Implements the actxr operation.
- Description: Implements the private static final owner context.class resolver<fight wnd> actxr = new owner context.class resolver<fight wnd>() operation.
- Value: `new OwnerContext.ClassResolver<FightWnd>()`

#### `public static final Text.Foundry namef = new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true)`
- Role: Implements the namef operation.
- Description: Implements the aa operation.
- Value: `new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true)`

#### `public static final String[] keys =`
- Role: Caches the keys value.
- Description: Caches the `keys` value for reuse.
- Value: ``

### Fields

#### `public final int nsave`
- Role: Caches the nsave value.
- Description: Caches the `nsave` value for reuse.

#### `public int maxact`
- Role: Caches the maxact value.
- Description: Caches the `maxact` value for reuse.

#### `public final Actions actlist`
- Role: Caches the actlist value.
- Description: Caches the `actlist` value for reuse.

#### `public final Savelist savelist`
- Role: Caches the savelist value.
- Description: Caches the `savelist` value for reuse.

#### `public List<Action> acts = new ArrayList<Action>()`
- Role: Implements the acts operation.
- Description: Implements the public list<action> acts = new array list<action>() operation.

#### `public final Action[] order`
- Role: Caches the order value.
- Description: Caches the `order` value for reuse.

#### `public int usesave`
- Role: Caches the usesave value.
- Description: Caches the `usesave` value for reuse.

#### `private final Text[] saves`
- Role: Caches the saves value.
- Description: Caches the `saves` value for reuse.

#### `private final ImageInfoBox info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `private final Label count`
- Role: Caches the count value.
- Description: Caches the `count` value for reuse.

#### `private final Map<Indir<Resource>, Object[]> actrawinfo = new HashMap<>()`
- Role: Implements the actrawinfo operation.
- Description: Implements the private final map<indir<resource>, object[]> actrawinfo = new hash map<>() operation.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `private final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public int a, u`
- Role: Caches the u value.
- Description: Caches the `u` value for reuse.

#### `public int a, u`
- Role: Caches the u value.
- Description: Caches the `u` value for reuse.

#### `private String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `private List<ItemInfo> info = null`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `private Tex icon = null`
- Role: Caches the icon value.
- Description: Caches the `icon` value for reuse.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Tracks whether  is currently loading.

#### `private Action drag = null`
- Role: Caches the drag value.
- Description: Caches the `drag` value for reuse.

#### `private UI.Grab grab`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

#### `public final Action item`
- Role: Caches the item value.
- Description: Caches the `item` value for reuse.

#### `private final Label use`
- Role: Caches the use value.
- Description: Caches the `use` value for reuse.

#### `private int u = -1, a = -1`
- Role: Caches the u value.
- Description: Caches the `u` value for reuse.

#### `private int u = -1, a = -1`
- Role: Caches the u value.
- Description: Caches the `u` value for reuse.

#### `private UI.Grab grab`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

#### `private Coord dp`
- Role: Caches the dp value.
- Description: Caches the `dp` value for reuse.

#### `private UI.Grab grab`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

#### `private Action drag`
- Role: Caches the drag value.
- Description: Caches the `drag` value for reuse.

#### `private Coord dp`
- Role: Caches the dp value.
- Description: Caches the `dp` value for reuse.

#### `private final Coord[] animoff = new Coord[order.length]`
- Role: Caches the animoff value.
- Description: Caches the `animoff` value for reuse.

#### `private final double[] animpr = new double[order.length]`
- Role: Caches the animpr value.
- Description: Caches the `animpr` value for reuse.

#### `private boolean anim = false`
- Role: Tracks the anim flag.
- Description: Caches the `anim` value for reuse.

#### `final Tex[] keys = new Tex[10]`
- Role: Caches the keys value.
- Description: Caches the `keys` value for reuse.

#### `private final List<Integer> items = Utils.range(nsave)`
- Role: Implements the items operation.
- Description: Implements the range operation.

#### `public final int n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private Text.Line redit = null`
- Role: Caches the redit value.
- Description: Caches the `redit` value for reuse.

#### `private ReadLine ed`
- Role: Caches the ed value.
- Description: Caches the `ed` value for reuse.

#### `private double focusstart`
- Role: Caches the focusstart value.
- Description: Caches the `focusstart` value for reuse.

#### `private Coord lc = null`
- Role: Caches the lc value.
- Description: Caches the `lc` value for reuse.

#### `private double lt = 0`
- Role: Caches the lt value.
- Description: Caches the `lt` value for reuse.

#### `private Text unused = new Text.Foundry(attrf.font.deriveFont(java.awt.Font.ITALIC)).aa(true).render("Unused save")`
- Role: Implements the unused operation.
- Description: Renders the current state into an image or image-like object.

### Methods

#### `public Action(Indir<Resource> res, int id, int a, int u)`
- Role: Handles the action path.
- Description: Implements the action operation.

#### `public String rendertext()`
- Role: Handles the rendertext path.
- Description: Renders the text.

#### `private void a(int a)`
- Role: Returns the local player facing angle.
- Description: Returns the local player heading in radians.

#### `private void u(int u)`
- Role: Handles the u path.
- Description: Implements the u operation.

#### `public Resource resource()`
- Role: Handles the resource path.
- Description: Implements the resource operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public BufferedImage rendericon()`
- Role: Handles the rendericon path.
- Description: Renders the icon.

#### `public Tex icon()`
- Role: Handles the icon path.
- Description: Implements the icon operation.

#### `public BufferedImage renderinfo(int width)`
- Role: Handles the renderinfo path.
- Description: Renders the info.

#### `private void recount()`
- Role: Handles the recount path.
- Description: Implements the recount operation.

#### `public Actions(Coord sz)`
- Role: Handles the actions path.
- Description: Implements the actions operation.

#### `protected List<Action> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Widget makeitem(Action act, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public Item(Coord sz, Action act)`
- Role: Handles the item path.
- Description: Implements the item operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public boolean setu(int u)`
- Role: Handles the setu path.
- Description: Updates the u.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Handles the iteminteract path.
- Description: Implements the iteminteract operation.

#### `public void change(Action act)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the FightWnd content.

#### `public void drag(Action act)`
- Role: Handles the drag path.
- Description: Implements the drag operation.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public int findorder(Action a)`
- Role: Handles the findorder path.
- Description: Finds the order.

#### `private BView()`
- Role: Handles the bview path.
- Description: Implements the b view operation.

#### `private Coord itemc(int i)`
- Role: Handles the itemc path.
- Description: Implements the itemc operation.

#### `private int citem(Coord c)`
- Role: Handles the citem path.
- Description: Implements the citem operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the FightWnd content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `private void animate(int s, Coord off)`
- Role: Handles the animate path.
- Description: Implements the animate operation.

#### `public boolean dropthing(Coord c, Object thing)`
- Role: Handles the dropthing path.
- Description: Dispatches a drop event through the widget tree.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public Savelist(Coord sz)`
- Role: Handles the savelist path.
- Description: Implements the savelist operation.

#### `protected List<Integer> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Widget makeitem(Integer n, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public Item(Coord sz, int n)`
- Role: Handles the item path.
- Description: Implements the item operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the FightWnd content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void done(ReadLine buf)`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public void changed(ReadLine buf)`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

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
- Role: Handles the use path.
- Description: Implements the use operation.

#### `public FightWnd(int nsave, int nact, int max)`
- Role: Creates a new FightWnd instance.
- Description: Constructs the FightWnd instance from the supplied inputs.

#### `public Action findact(int resid)`
- Role: Handles the findact path.
- Description: Finds the act.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.