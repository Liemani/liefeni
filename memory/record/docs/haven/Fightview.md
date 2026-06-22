---
source: [Fightview.java](../../../../src/haven/Fightview.java)
created: 2026-06-13
updated: 2026-06-14
---

# Fightview

Manages the combat relation list and current fight controls.

## Nested Types

### $_

- Role: Represents $ within Fightview.
- Description: Describes the nested $  type used by the enclosing class.

### Mainrel

- Role: Represents mainrel within Fightview.
- Description: Describes the nested mainrel type used by the enclosing class.

### Notfound

- Role: Represents notfound within Fightview.
- Description: Describes the nested notfound type used by the enclosing class.

### ObInfo

- Role: Represents ob info within Fightview.
- Description: Describes the nested ob info type used by the enclosing class.

### Relation

- Role: Represents relation within Fightview.
- Description: Describes the nested relation type used by the enclosing class.

### Relbox

- Role: Represents relbox within Fightview.
- Description: Describes the nested relbox type used by the enclosing class.

### Rellist

- Role: Represents rellist within Fightview.
- Description: Describes the nested rellist type used by the enclosing class.

## Members

### Constants

#### `public static final Tex bg = Resource.loadtex("gfx/hud/bosq")`
- Role: Stores the fight-view background texture.
- Description: Loads the base panel texture used for relation rows.
- Value: `Resource.loadtex("gfx/hud/bosq")`

#### `public static final int height = 5`
- Role: Sets the visible relation count.
- Description: Controls how many relation rows fit in the list view.
- Value: `5`

#### `public static final int ymarg = UI.scale(5)`
- Role: Sets vertical spacing.
- Description: Provides the row gap used between relation entries.
- Value: `UI.scale(5)`

#### `public static final int width = UI.scale(175)`
- Role: Sets the fight-view width.
- Description: Controls the width of the combat panel.
- Value: `UI.scale(175)`

#### `public static final Coord avasz = Coord.of(bg.sz().y - UI.scale(6))`
- Role: Sizes the combat avatar area.
- Description: Sets the square avatar region inside the fight panel.
- Value: `Coord.of(bg.sz().y - UI.scale(6))`

#### `public static final Coord cavac = new Coord(width - Avaview.dasz.x - UI.scale(10), UI.scale(10))`
- Role: Positions the main avatar block.
- Description: Places the avatar panel inside the fight-view background.
- Value: `new Coord(width - Avaview.dasz.x - UI.scale(10), UI.scale(10))`

#### `public static final Coord cgivec = new Coord(cavac.x - UI.scale(35), cavac.y)`
- Role: Positions the give button.
- Description: Places the give action next to the avatar block.
- Value: `new Coord(cavac.x - UI.scale(35), cavac.y)`

#### `public static final Coord cpursc = new Coord(cavac.x - UI.scale(75), cgivec.y + UI.scale(35))`
- Role: Positions the pursue button.
- Description: Places the pursue action under the main avatar controls.
- Value: `new Coord(cavac.x - UI.scale(75), cgivec.y + UI.scale(35))`

### Fields

#### `public final LinkedList<Relation> lsrel = new LinkedList<Relation>()`
- Role: Stores all combat relations.
- Description: Keeps the current list of opponents or relations from the server.

#### `public final Bufflist buffs = add(new Bufflist())`
- Role: Hosts global combat buffs.
- Description: Keeps the shared buff list attached to the fight view.

#### `public final Map<Long, Widget> obinfo = new HashMap<>()`
- Role: Stores per-gob combat UI subtrees.
- Description: Keeps auxiliary widgets attached to each relation gob id.

#### `public final Rellist lsdisp`
- Role: Stores the scrollable relation list widget.
- Description: Renders the non-main combat relations.

#### `public Relation current = null`
- Role: Tracks the focused relation.
- Description: Points to the relation currently shown as the main opponent.

#### `public Indir<Resource> blk, batk, iatk`
- Role: Stores combat action resources.
- Description: Tracks block, basic attack, and interrupt attack resources.

#### `public Indir<Resource> blk, batk, iatk`
- Role: Caches the iatk value.
- Description: Caches the `iatk` value for reuse.

#### `public Indir<Resource> blk, batk, iatk`
- Role: Caches the iatk value.
- Description: Caches the `iatk` value for reuse.

#### `public double atkcs, atkct`
- Role: Tracks attack cooldown timing.
- Description: Stores the current and target attack cooldown values.

#### `public double atkcs, atkct`
- Role: Caches the atkct value.
- Description: Caches the `atkct` value for reuse.

#### `public Indir<Resource> lastact = null`
- Role: Stores the last combat action.
- Description: Remembers the most recent action resource used in combat.

#### `public double lastuse = 0`
- Role: Tracks the last action time.
- Description: Stores when the last combat action was used.

#### `public Mainrel curdisp`
- Role: Stores the displayed main relation widget.
- Description: Points to the relation currently shown in the main panel.

#### `private List<Relation> nonmain = Collections.emptyList()`
- Role: Implements the nonmain operation.
- Description: Implements the empty list operation.

#### `public final long gobid`
- Role: Caches the gobid value.
- Description: Caches the `gobid` value for reuse.

#### `public final Bufflist buffs = add(new Bufflist())`
- Role: Implements the buffs operation.
- Description: Implements the bufflist operation.

#### `public final Bufflist relbuffs = add(new Bufflist())`
- Role: Implements the relbuffs operation.
- Description: Implements the bufflist operation.

#### `public int gst, ip, oip`
- Role: Caches the oip value.
- Description: Caches the `oip` value for reuse.

#### `public int gst, ip, oip`
- Role: Caches the oip value.
- Description: Caches the `oip` value for reuse.

#### `public int gst, ip, oip`
- Role: Caches the oip value.
- Description: Caches the `oip` value for reuse.

#### `public Indir<Resource> lastact = null`
- Role: Caches the last act.
- Description: Caches the last act value.

#### `public double lastuse = 0`
- Role: Caches the last use.
- Description: Caches the last use value.

#### `public boolean invalid = false`
- Role: Tracks whether invalid is valid.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final Relation rel`
- Role: Caches the rel value.
- Description: Caches the `rel` value for reuse.

#### `public final Avaview ava`
- Role: Caches the ava value.
- Description: Caches the `ava` value for reuse.

#### `public final GiveButton give`
- Role: Caches the give value.
- Description: Caches the `give` value for reuse.

#### `public final Button purs`
- Role: Caches the purs value.
- Description: Caches the `purs` value for reuse.

#### `public final Relation rel`
- Role: Caches the rel value.
- Description: Caches the `rel` value for reuse.

#### `public final Avaview ava`
- Role: Caches the ava value.
- Description: Caches the `ava` value for reuse.

#### `public final GiveButton give`
- Role: Caches the give value.
- Description: Caches the `give` value for reuse.

#### `public final Button purs`
- Role: Caches the purs value.
- Description: Caches the `purs` value for reuse.

#### `public final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

### Methods

#### `public Relation(long gobid)`
- Role: Handles the relation path.
- Description: Implements the relation operation.

#### `public void give(int state)`
- Role: Handles the give path.
- Description: Implements the give operation.

#### `public void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void use(Indir<Resource> act)`
- Role: Handles the use path.
- Description: Implements the use operation.

#### `public Relbox(Relation rel)`
- Role: Handles the relbox path.
- Description: Implements the relbox operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Fightview content.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.

#### `public Rellist(int h)`
- Role: Handles the rellist path.
- Description: Implements the rellist operation.

#### `protected List<Relation> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Relbox makeitem(Relation rel, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `protected void drawslot(GOut g, Relation item, int idx, Area area)`
- Role: Handles the drawslot path.
- Description: Draws the slot.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `protected boolean unselect(int button)`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `public Mainrel(Relation rel)`
- Role: Handles the mainrel path.
- Description: Implements the mainrel operation.

#### `private void lpack()`
- Role: Handles the lpack path.
- Description: Implements the lpack operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Fightview content.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.

#### `public void use(Indir<Resource> act)`
- Role: Handles the use path.
- Description: Implements the use operation.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Fightview()`
- Role: Creates a new Fightview instance.
- Description: Constructs the Fightview instance from the supplied inputs.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public Widget obinfo(long gobid, boolean creat)`
- Role: Handles the obinfo path.
- Description: Implements the obinfo operation.

#### `public <T extends Widget> T obinfo(long gobid, Class<T> cl, boolean creat)`
- Role: Handles the obinfo path.
- Description: Implements the obinfo operation.

#### `public default int prio()`
- Role: Handles the prio path.
- Description: Implements the prio operation.

#### `public default Coord2d grav()`
- Role: Handles the grav path.
- Description: Implements the grav operation.

#### `private void layout()`
- Role: Handles the layout path.
- Description: Lays out parts on wrapped lines and aligns their baselines.

#### `private void updrel()`
- Role: Handles the updrel path.
- Description: Implements the updrel operation.

#### `private void setcur(Relation rel)`
- Role: Handles the setcur path.
- Description: Updates the cur.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public Notfound(long id)`
- Role: Handles the notfound path.
- Description: Implements the notfound operation.

#### `private Relation getrel(long gobid)`
- Role: Handles the getrel path.
- Description: Returns the rel.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.
