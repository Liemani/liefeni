# Fightsess

This file documents the responsibilities and members of `Fightsess`.

## Meta

- Source: [Fightsess.java](../../../src/haven/Fightsess.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents fight session state.

## Nested Types

### $_

- Description: TODO

### Action

- Description: TODO

### Effect

- Description: TODO

### Release

- Description: TODO

## Members

### Constants

#### `private static final Coord off = new Coord(UI.scale(32), UI.scale(32))`

- Description: TODO

#### `public static final Tex cdframe = Resource.loadtex("gfx/hud/combat/cool")`

- Description: TODO

#### `public static final Tex actframe = Buff.frame`

- Description: TODO

#### `public static final Coord actframeo = Buff.imgoff`

- Description: TODO

#### `public static final Tex indframe = Resource.loadtex("gfx/hud/combat/indframe")`

- Description: TODO

#### `public static final Coord indframeo = (indframe.sz().sub(off)).div(2)`

- Description: TODO

#### `public static final Tex indbframe = Resource.loadtex("gfx/hud/combat/indbframe")`

- Description: TODO

#### `public static final Coord indbframeo = (indframe.sz().sub(off)).div(2)`

- Description: TODO

#### `public static final Tex useframe = Resource.loadtex("gfx/hud/combat/lastframe")`

- Description: TODO

#### `public static final Coord useframeo = (useframe.sz().sub(off)).div(2)`

- Description: TODO

#### `public static final int actpitch = UI.scale(50)`

- Description: TODO

#### `private static final Resource tgtfx = Resource.local().loadwait("gfx/hud/combat/trgtarw")`

- Description: TODO

#### `private static final Text.Furnace ipf = new PUtils.BlurFurn(new Text.Foundry(Text.serif, 18, new Color(128, 128, 255)).aa(true), 1, 1, new Color(48, 48, 96))`

- Description: TODO

#### `private static final Coord cmc = UI.scale(new Coord(0, 67))`

- Description: TODO

#### `private static final Coord usec1 = UI.scale(new Coord(-65, 67))`

- Description: TODO

#### `private static final Coord usec2 = UI.scale(new Coord(65, 67))`

- Description: TODO

#### `public static final String[] keytips =`

- Description: TODO

#### `public static final KeyBinding[] kb_acts =`

- Description: TODO

#### `public static final KeyBinding kb_relcycle = KeyBinding.get("fgt-cycle", KeyMatch.forcode(KeyEvent.VK_TAB, KeyMatch.C), KeyMatch.S)`

- Description: TODO

### Fields

#### `public final Action[] actions`

- Description: TODO

#### `public int use = -1, useb = -1`

- Description: TODO

#### `public int use = -1, useb = -1`

- Description: TODO

#### `public Coord pcc`

- Description: TODO

#### `public int pho`

- Description: TODO

#### `private Fightview fv`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public double cs, ct`

- Description: TODO

#### `public double cs, ct`

- Description: TODO

#### `Sprite spr`

- Description: TODO

#### `RenderTree.Slot slot`

- Description: TODO

#### `boolean used = true`

- Description: TODO

#### `private final Collection<Effect> curfx = new ArrayList<>()`

- Description: TODO

#### `private final Indir<Text> ip = Utils.transform(() -> fv.current.ip , v -> ipf.render("IP: " + v))`

- Description: TODO

#### `private final Indir<Text> oip = Utils.transform(() -> fv.current.oip, v -> ipf.render("IP: " + v))`

- Description: TODO

#### `private Indir<Resource> lastact1 = null, lastact2 = null`

- Description: TODO

#### `private Indir<Resource> lastact1 = null, lastact2 = null`

- Description: TODO

#### `private Text lastacttip1 = null, lastacttip2 = null`

- Description: TODO

#### `private Text lastacttip1 = null, lastacttip2 = null`

- Description: TODO

#### `private Effect curtgtfx`

- Description: TODO

#### `private Widget prevtt = null`

- Description: TODO

#### `private Text acttip = null`

- Description: TODO

#### `final int n`

- Description: TODO

#### `private UI.Grab holdgrab = null`

- Description: TODO

#### `private int held = -1`

- Description: TODO

### Methods

#### `public Action(Indir<Resource> res)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Fightsess(int nact)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public void presize()`

- Description: TODO

#### `private void updatepos()`

- Description: TODO

#### `Effect(Sprite spr)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `private Effect fxon(long gobid, Resource fx, Effect cur)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `private static Coord actc(int i)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `Release(int n)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public boolean keyup(KeyUpEvent ev)`

- Description: TODO
