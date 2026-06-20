---
source: [Fightview.java](../../../src/haven/Fightview.java)
created: 2026-06-13
updated: 2026-06-14
---

# Fightview

Represents the fightview Haven component.

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
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int height = 5`
- Role: Defines the shared height constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ymarg = UI.scale(5)`
- Role: Defines the shared ymarg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int width = UI.scale(175)`
- Role: Defines the shared width constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord avasz = Coord.of(bg.sz().y - UI.scale(6))`
- Role: Defines the shared avasz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord cavac = new Coord(width - Avaview.dasz.x - UI.scale(10), UI.scale(10))`
- Role: Defines the shared cavac constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord cgivec = new Coord(cavac.x - UI.scale(35), cavac.y)`
- Role: Defines the shared cgivec constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord cpursc = new Coord(cavac.x - UI.scale(75), cgivec.y + UI.scale(35))`
- Role: Defines the shared cpursc constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final LinkedList<Relation> lsrel = new LinkedList<Relation>()`
- Role: Caches lsrel entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Bufflist buffs = add(new Bufflist())`
- Role: Holds the buffs state.
- Description: Backs the cached state for this file.

#### `public final Map<Long, Widget> obinfo = new HashMap<>()`
- Role: Caches obinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Rellist lsdisp`
- Role: Holds the lsdisp state.
- Description: Backs the cached state for this file.

#### `public Relation current = null`
- Role: Holds the current state.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> blk, batk, iatk`
- Role: Stores the iatk value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> blk, batk, iatk`
- Role: Stores the iatk value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> blk, batk, iatk`
- Role: Stores the iatk value.
- Description: Backs the cached state for this file.

#### `public double atkcs, atkct`
- Role: Stores the atkct value.
- Description: Backs the cached state for this file.

#### `public double atkcs, atkct`
- Role: Stores the atkct value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> lastact = null`
- Role: Stores the lastact value.
- Description: Backs the cached state for this file.

#### `public double lastuse = 0`
- Role: Stores the lastuse value.
- Description: Backs the cached state for this file.

#### `public Mainrel curdisp`
- Role: Holds the curdisp state.
- Description: Backs the cached state for this file.

#### `private List<Relation> nonmain = Collections.emptyList()`
- Role: Caches nonmain entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final long gobid`
- Role: Stores the gobid value.
- Description: Backs the cached state for this file.

#### `public final Bufflist buffs = add(new Bufflist())`
- Role: Holds the buffs state.
- Description: Backs the cached state for this file.

#### `public final Bufflist relbuffs = add(new Bufflist())`
- Role: Holds the relbuffs state.
- Description: Backs the cached state for this file.

#### `public int gst, ip, oip`
- Role: Stores the oip value.
- Description: Backs the cached state for this file.

#### `public int gst, ip, oip`
- Role: Stores the oip value.
- Description: Backs the cached state for this file.

#### `public int gst, ip, oip`
- Role: Stores the oip value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> lastact = null`
- Role: Stores the lastact value.
- Description: Backs the cached state for this file.

#### `public double lastuse = 0`
- Role: Stores the lastuse value.
- Description: Backs the cached state for this file.

#### `public boolean invalid = false`
- Role: Tracks whether invalid is valid.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final Relation rel`
- Role: Holds the rel state.
- Description: Backs the cached state for this file.

#### `public final Avaview ava`
- Role: Holds the ava state.
- Description: Backs the cached state for this file.

#### `public final GiveButton give`
- Role: Holds the give state.
- Description: Backs the cached state for this file.

#### `public final Button purs`
- Role: Holds the purs state.
- Description: Backs the cached state for this file.

#### `public final Relation rel`
- Role: Holds the rel state.
- Description: Backs the cached state for this file.

#### `public final Avaview ava`
- Role: Holds the ava state.
- Description: Backs the cached state for this file.

#### `public final GiveButton give`
- Role: Holds the give state.
- Description: Backs the cached state for this file.

#### `public final Button purs`
- Role: Holds the purs state.
- Description: Backs the cached state for this file.

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

### Methods

#### `public Relation(long gobid)`
- Role: Performs relation.
- Description: Supports the relation operation used by the surrounding class.

#### `public void give(int state)`
- Role: Performs give.
- Description: Supports the give operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void use(Indir<Resource> act)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public Relbox(Relation rel)`
- Role: Performs relbox.
- Description: Supports the relbox operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public Rellist(int h)`
- Role: Performs rellist.
- Description: Supports the rellist operation used by the surrounding class.

#### `protected List<Relation> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Relbox makeitem(Relation rel, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `protected void drawslot(GOut g, Relation item, int idx, Area area)`
- Role: Performs drawslot.
- Description: Supports the drawslot operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `protected boolean unselect(int button)`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `public Mainrel(Relation rel)`
- Role: Performs mainrel.
- Description: Supports the mainrel operation used by the surrounding class.

#### `private void lpack()`
- Role: Performs lpack.
- Description: Supports the lpack operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public void use(Indir<Resource> act)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Fightview()`
- Role: Creates a new Fightview instance.
- Description: Constructs the instance and initializes its default state.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public Widget obinfo(long gobid, boolean creat)`
- Role: Performs obinfo.
- Description: Supports the obinfo operation used by the surrounding class.

#### `public <T extends Widget> T obinfo(long gobid, Class<T> cl, boolean creat)`
- Role: Performs obinfo.
- Description: Supports the obinfo operation used by the surrounding class.

#### `public default int prio()`
- Role: Performs prio.
- Description: Supports the prio operation used by the surrounding class.

#### `public default Coord2d grav()`
- Role: Performs grav.
- Description: Supports the grav operation used by the surrounding class.

#### `private void layout()`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.

#### `private void updrel()`
- Role: Performs updrel.
- Description: Supports the updrel operation used by the surrounding class.

#### `private void setcur(Relation rel)`
- Role: Performs setcur.
- Description: Supports the setcur operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public Notfound(long id)`
- Role: Performs notfound.
- Description: Supports the notfound operation used by the surrounding class.

#### `private Relation getrel(long gobid)`
- Role: Performs getrel.
- Description: Supports the getrel operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
