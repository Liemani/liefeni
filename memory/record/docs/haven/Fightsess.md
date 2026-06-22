---
source: [Fightsess.java](../../../../src/haven/Fightsess.java)
created: 2026-06-13
updated: 2026-06-14
---

# Fightsess

Represents the fightsess Haven component.

## Nested Types

### $_

- Role: Registers the `fsess` widget factory.
- Description: Creates a fight session widget for the number of combat actions sent by the server.

### Action

- Role: Stores one combat action slot.
- Description: Tracks the action resource and its cooldown timing.

### Effect

- Role: Attaches a combat sprite effect to a map gob.
- Description: Keeps the created sprite and render-tree slot while the effect remains active.

### Release

- Role: Removes a combat effect after the animation is complete.
- Description: Runs the clean-up callback that detaches the temporary effect sprite.

## Members

### Constants

#### `private static final Coord off = new Coord(UI.scale(32), UI.scale(32))`
- Role: Implements the off operation.
- Description: Implements the scale operation.
- Value: `new Coord(UI.scale(32), UI.scale(32))`

#### `public static final Tex cdframe = Resource.loadtex("gfx/hud/combat/cool")`
- Role: Implements the cdframe operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/combat/cool")`

#### `public static final Tex actframe = Buff.frame`
- Role: Caches the actframe value.
- Description: Caches the `actframe` value for reuse.
- Value: `Buff.frame`

#### `public static final Coord actframeo = Buff.imgoff`
- Role: Caches the actframeo value.
- Description: Caches the `actframeo` value for reuse.
- Value: `Buff.imgoff`

#### `public static final Tex indframe = Resource.loadtex("gfx/hud/combat/indframe")`
- Role: Implements the indframe operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/combat/indframe")`

#### `public static final Coord indframeo = (indframe.sz().sub(off)).div(2)`
- Role: Implements the indframeo operation.
- Description: Implements the div operation.
- Value: `(indframe.sz().sub(off)).div(2)`

#### `public static final Tex indbframe = Resource.loadtex("gfx/hud/combat/indbframe")`
- Role: Implements the indbframe operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/combat/indbframe")`

#### `public static final Coord indbframeo = (indframe.sz().sub(off)).div(2)`
- Role: Implements the indbframeo operation.
- Description: Implements the div operation.
- Value: `(indframe.sz().sub(off)).div(2)`

#### `public static final Tex useframe = Resource.loadtex("gfx/hud/combat/lastframe")`
- Role: Implements the useframe operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/combat/lastframe")`

#### `public static final Coord useframeo = (useframe.sz().sub(off)).div(2)`
- Role: Implements the useframeo operation.
- Description: Implements the div operation.
- Value: `(useframe.sz().sub(off)).div(2)`

#### `public static final int actpitch = UI.scale(50)`
- Role: Implements the actpitch operation.
- Description: Implements the scale operation.
- Value: `UI.scale(50)`

#### `private static final Resource tgtfx = Resource.local().loadwait("gfx/hud/combat/trgtarw")`
- Role: Implements the tgtfx operation.
- Description: Implements the loadwait operation.
- Value: `Resource.local().loadwait("gfx/hud/combat/trgtarw")`

#### `private static final Text.Furnace ipf = new PUtils.BlurFurn(new Text.Foundry(Text.serif, 18, new Color(128, 128, 255)).aa(true), 1, 1, new Color(48, 48, 96))`
- Role: Implements the ipf operation.
- Description: Implements the color operation.
- Value: `new PUtils.BlurFurn(new Text.Foundry(Text.serif, 18, new Color(128, 128, 255)).aa(true), 1, 1, new Color(48, 48, 96))`

#### `private static final Coord cmc = UI.scale(new Coord(0, 67))`
- Role: Implements the cmc operation.
- Description: Implements the coord operation.
- Value: `UI.scale(new Coord(0, 67))`

#### `private static final Coord usec1 = UI.scale(new Coord(-65, 67))`
- Role: Implements the usec1 operation.
- Description: Implements the coord operation.
- Value: `UI.scale(new Coord(-65, 67))`

#### `private static final Coord usec2 = UI.scale(new Coord(65, 67))`
- Role: Implements the usec2 operation.
- Description: Implements the coord operation.
- Value: `UI.scale(new Coord(65, 67))`

#### `public static final String[] keytips =`
- Role: Caches the keytips value.
- Description: Caches the `keytips` value for reuse.
- Value: ``

#### `public static final KeyBinding[] kb_acts =`
- Role: Caches the kb acts value.
- Description: Caches the `kb_acts` value for reuse.
- Value: ``

#### `public static final KeyBinding kb_relcycle = KeyBinding.get("fgt-cycle", KeyMatch.forcode(KeyEvent.VK_TAB, KeyMatch.C), KeyMatch.S)`
- Role: Implements the kb relcycle operation.
- Description: Implements the forcode operation.
- Value: `KeyBinding.get("fgt-cycle", KeyMatch.forcode(KeyEvent.VK_TAB, KeyMatch.C), KeyMatch.S)`

### Fields

#### `public final Action[] actions`
- Role: Caches the actions value.
- Description: Caches the `actions` value for reuse.

#### `public int use = -1, useb = -1`
- Role: Caches the use value.
- Description: Caches the `use` value for reuse.

#### `public int use = -1, useb = -1`
- Role: Caches the use value.
- Description: Caches the `use` value for reuse.

#### `public Coord pcc`
- Role: Caches the pcc value.
- Description: Caches the `pcc` value for reuse.

#### `public int pho`
- Role: Caches the pho value.
- Description: Caches the `pho` value for reuse.

#### `private Fightview fv`
- Role: Caches the fv value.
- Description: Caches the `fv` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public double cs, ct`
- Role: Caches the ct value.
- Description: Caches the `ct` value for reuse.

#### `public double cs, ct`
- Role: Caches the ct value.
- Description: Caches the `ct` value for reuse.

#### `Sprite spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `RenderTree.Slot slot`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

#### `boolean used = true`
- Role: Tracks the used flag.
- Description: Caches the `used` value for reuse.

#### `private final Collection<Effect> curfx = new ArrayList<>()`
- Role: Implements the curfx operation.
- Description: Implements the private final collection<effect> curfx = new array list<>() operation.

#### `private final Indir<Text> ip = Utils.transform(() -> fv.current.ip , v -> ipf.render("IP: " + v))`
- Role: Implements the ip operation.
- Description: Renders the current state into an image or image-like object.

#### `private final Indir<Text> oip = Utils.transform(() -> fv.current.oip, v -> ipf.render("IP: " + v))`
- Role: Implements the oip operation.
- Description: Renders the current state into an image or image-like object.

#### `private Indir<Resource> lastact1 = null, lastact2 = null`
- Role: Caches the last act1.
- Description: Caches the last act1 value.

#### `private Indir<Resource> lastact1 = null, lastact2 = null`
- Role: Caches the last act1.
- Description: Caches the last act1 value.

#### `private Text lastacttip1 = null, lastacttip2 = null`
- Role: Caches the last acttip1.
- Description: Caches the last acttip1 value.

#### `private Text lastacttip1 = null, lastacttip2 = null`
- Role: Caches the last acttip1.
- Description: Caches the last acttip1 value.

#### `private Effect curtgtfx`
- Role: Caches the curtgtfx value.
- Description: Caches the `curtgtfx` value for reuse.

#### `private Widget prevtt = null`
- Role: Caches the prevtt value.
- Description: Caches the `prevtt` value for reuse.

#### `private Text acttip = null`
- Role: Caches the acttip value.
- Description: Caches the `acttip` value for reuse.

#### `final int n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private UI.Grab holdgrab = null`
- Role: Caches the holdgrab value.
- Description: Caches the `holdgrab` value for reuse.

#### `private int held = -1`
- Role: Caches the held value.
- Description: Caches the `held` value for reuse.

### Methods

#### `public Action(Indir<Resource> res)`
- Role: Handles the action path.
- Description: Implements the action operation.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Fightsess(int nact)`
- Role: Creates a new Fightsess instance.
- Description: Constructs the Fightsess instance from the supplied inputs.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void presize()`
- Role: Handles the presize path.
- Description: Implements the presize operation.

#### `private void updatepos()`
- Role: Handles the updatepos path.
- Description: Updates the pos.

#### `Effect(Sprite spr)`
- Role: Handles the effect workflow.
- Description: Implements the effect operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `private Effect fxon(long gobid, Resource fx, Effect cur)`
- Role: Handles the fxon path.
- Description: Implements the fxon operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void destroy()`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.

#### `private static Coord actc(int i)`
- Role: Handles the actc path.
- Description: Implements the actc operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Fightsess content.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `Release(int n)`
- Role: Handles the release workflow.
- Description: Implements the release operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Implements the globtype operation.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public boolean keyup(KeyUpEvent ev)`
- Role: Handles the keyup path.
- Description: Implements the keyup operation.