# Fightview

This file documents the responsibilities and members of `Fightview`.

## Meta

- Source: [Fightview.java](../../../src/haven/Fightview.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays fight view information.

## Nested Types

### $_

- Description: TODO

### Mainrel

- Description: TODO

### Notfound

- Description: TODO

### ObInfo

- Description: TODO

### Relation

- Description: TODO

### Relbox

- Description: TODO

### Rellist

- Description: TODO

## Members

### Constants

#### `public static final Tex bg = Resource.loadtex("gfx/hud/bosq")`

- Description: TODO

#### `public static final int height = 5`

- Description: TODO

#### `public static final int ymarg = UI.scale(5)`

- Description: TODO

#### `public static final int width = UI.scale(175)`

- Description: TODO

#### `public static final Coord avasz = Coord.of(bg.sz().y - UI.scale(6))`

- Description: TODO

#### `public static final Coord cavac = new Coord(width - Avaview.dasz.x - UI.scale(10), UI.scale(10))`

- Description: TODO

#### `public static final Coord cgivec = new Coord(cavac.x - UI.scale(35), cavac.y)`

- Description: TODO

#### `public static final Coord cpursc = new Coord(cavac.x - UI.scale(75), cgivec.y + UI.scale(35))`

- Description: TODO

### Fields

#### `public final LinkedList<Relation> lsrel = new LinkedList<Relation>()`

- Description: TODO

#### `public final Bufflist buffs = add(new Bufflist())`

- Description: TODO

#### `public final Map<Long, Widget> obinfo = new HashMap<>()`

- Description: TODO

#### `public final Rellist lsdisp`

- Description: TODO

#### `public Relation current = null`

- Description: TODO

#### `public Indir<Resource> blk, batk, iatk`

- Description: TODO

#### `public Indir<Resource> blk, batk, iatk`

- Description: TODO

#### `public Indir<Resource> blk, batk, iatk`

- Description: TODO

#### `public double atkcs, atkct`

- Description: TODO

#### `public double atkcs, atkct`

- Description: TODO

#### `public Indir<Resource> lastact = null`

- Description: TODO

#### `public double lastuse = 0`

- Description: TODO

#### `public Mainrel curdisp`

- Description: TODO

#### `private List<Relation> nonmain = Collections.emptyList()`

- Description: TODO

#### `public final long gobid`

- Description: TODO

#### `public final Bufflist buffs = add(new Bufflist())`

- Description: TODO

#### `public final Bufflist relbuffs = add(new Bufflist())`

- Description: TODO

#### `public int gst, ip, oip`

- Description: TODO

#### `public int gst, ip, oip`

- Description: TODO

#### `public int gst, ip, oip`

- Description: TODO

#### `public Indir<Resource> lastact = null`

- Description: TODO

#### `public double lastuse = 0`

- Description: TODO

#### `public boolean invalid = false`

- Description: TODO

#### `public final Relation rel`

- Description: TODO

#### `public final Avaview ava`

- Description: TODO

#### `public final GiveButton give`

- Description: TODO

#### `public final Button purs`

- Description: TODO

#### `public final Relation rel`

- Description: TODO

#### `public final Avaview ava`

- Description: TODO

#### `public final GiveButton give`

- Description: TODO

#### `public final Button purs`

- Description: TODO

#### `public final long id`

- Description: TODO

### Methods

#### `public Relation(long gobid)`

- Description: TODO

#### `public void give(int state)`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `public void use(Indir<Resource> act)`

- Description: TODO

#### `public Relbox(Relation rel)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public Rellist(int h)`

- Description: TODO

#### `protected List<Relation> items()`

- Description: TODO

#### `protected Relbox makeitem(Relation rel, int idx, Coord sz)`

- Description: TODO

#### `protected void drawslot(GOut g, Relation item, int idx, Area area)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `protected boolean unselect(int button)`

- Description: TODO

#### `public Mainrel(Relation rel)`

- Description: TODO

#### `private void lpack()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public void use(Indir<Resource> act)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Fightview()`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public Widget obinfo(long gobid, boolean creat)`

- Description: TODO

#### `public <T extends Widget> T obinfo(long gobid, Class<T> cl, boolean creat)`

- Description: TODO

#### `public default int prio()`

- Description: TODO

#### `public default Coord2d grav()`

- Description: TODO

#### `private void layout()`

- Description: TODO

#### `private void updrel()`

- Description: TODO

#### `private void setcur(Relation rel)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public Notfound(long id)`

- Description: TODO

#### `private Relation getrel(long gobid)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO
