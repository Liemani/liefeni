---
source: [Fightsess.java](../../../src/haven/Fightsess.java)
created: 2026-06-13
updated: 2026-06-14
---

# Fightsess

Represents the fightsess Haven component.

## Nested Types

### $_

- Role: Represents $ within Fightsess.
- Description: Describes the nested $  type used by the enclosing class.

### Action

- Role: Represents action within Fightsess.
- Description: Describes the nested action type used by the enclosing class.

### Effect

- Role: Represents effect within Fightsess.
- Description: Describes the nested effect type used by the enclosing class.

### Release

- Role: Represents release within Fightsess.
- Description: Describes the nested release type used by the enclosing class.

## Members

### Constants

#### `private static final Coord off = new Coord(UI.scale(32), UI.scale(32))`
- Role: Defines the shared off constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex cdframe = Resource.loadtex("gfx/hud/combat/cool")`
- Role: Defines the shared cdframe constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex actframe = Buff.frame`
- Role: Defines the shared actframe constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord actframeo = Buff.imgoff`
- Role: Defines the shared actframeo constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex indframe = Resource.loadtex("gfx/hud/combat/indframe")`
- Role: Defines the shared indframe constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord indframeo = (indframe.sz().sub(off)).div(2)`
- Role: Defines the shared indframeo constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex indbframe = Resource.loadtex("gfx/hud/combat/indbframe")`
- Role: Defines the shared indbframe constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord indbframeo = (indframe.sz().sub(off)).div(2)`
- Role: Defines the shared indbframeo constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex useframe = Resource.loadtex("gfx/hud/combat/lastframe")`
- Role: Defines the shared useframe constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord useframeo = (useframe.sz().sub(off)).div(2)`
- Role: Defines the shared useframeo constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int actpitch = UI.scale(50)`
- Role: Defines the shared actpitch constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Resource tgtfx = Resource.local().loadwait("gfx/hud/combat/trgtarw")`
- Role: Defines the shared tgtfx constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Text.Furnace ipf = new PUtils.BlurFurn(new Text.Foundry(Text.serif, 18, new Color(128, 128, 255)).aa(true), 1, 1, new Color(48, 48, 96))`
- Role: Defines the shared ipf constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord cmc = UI.scale(new Coord(0, 67))`
- Role: Defines the shared cmc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord usec1 = UI.scale(new Coord(-65, 67))`
- Role: Defines the shared usec1 constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord usec2 = UI.scale(new Coord(65, 67))`
- Role: Defines the shared usec2 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final String[] keytips =`
- Role: Defines the shared fightsess constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding[] kb_acts =`
- Role: Defines the shared fightsess constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_relcycle = KeyBinding.get("fgt-cycle", KeyMatch.forcode(KeyEvent.VK_TAB, KeyMatch.C), KeyMatch.S)`
- Role: Defines the shared kb relcycle constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Action[] actions`
- Role: Holds the actions state.
- Description: Backs the cached state for this file.

#### `public int use = -1, useb = -1`
- Role: Stores the use value.
- Description: Backs the cached state for this file.

#### `public int use = -1, useb = -1`
- Role: Stores the use value.
- Description: Backs the cached state for this file.

#### `public Coord pcc`
- Role: Stores the pcc value.
- Description: Backs the cached state for this file.

#### `public int pho`
- Role: Stores the pho value.
- Description: Backs the cached state for this file.

#### `private Fightview fv`
- Role: Holds the fv state.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public double cs, ct`
- Role: Stores the ct value.
- Description: Backs the cached state for this file.

#### `public double cs, ct`
- Role: Stores the ct value.
- Description: Backs the cached state for this file.

#### `Sprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `RenderTree.Slot slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

#### `boolean used = true`
- Role: Tracks the used flag.
- Description: Supports the used operation used by the surrounding class.

#### `private final Collection<Effect> curfx = new ArrayList<>()`
- Role: Caches curfx entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Indir<Text> ip = Utils.transform(() -> fv.current.ip , v -> ipf.render("IP: " + v))`
- Role: Stores the ip value.
- Description: Backs the cached state for this file.

#### `private final Indir<Text> oip = Utils.transform(() -> fv.current.oip, v -> ipf.render("IP: " + v))`
- Role: Stores the oip value.
- Description: Backs the cached state for this file.

#### `private Indir<Resource> lastact1 = null, lastact2 = null`
- Role: Stores the lastact1 value.
- Description: Backs the cached state for this file.

#### `private Indir<Resource> lastact1 = null, lastact2 = null`
- Role: Stores the lastact1 value.
- Description: Backs the cached state for this file.

#### `private Text lastacttip1 = null, lastacttip2 = null`
- Role: Stores the lastacttip1 value.
- Description: Backs the cached state for this file.

#### `private Text lastacttip1 = null, lastacttip2 = null`
- Role: Stores the lastacttip1 value.
- Description: Backs the cached state for this file.

#### `private Effect curtgtfx`
- Role: Holds the curtgtfx state.
- Description: Backs the cached state for this file.

#### `private Widget prevtt = null`
- Role: Stores the prevtt value.
- Description: Backs the cached state for this file.

#### `private Text acttip = null`
- Role: Stores the acttip value.
- Description: Backs the cached state for this file.

#### `final int n`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private UI.Grab holdgrab = null`
- Role: Stores the holdgrab value.
- Description: Backs the cached state for this file.

#### `private int held = -1`
- Role: Stores the held value.
- Description: Backs the cached state for this file.

### Methods

#### `public Action(Indir<Resource> res)`
- Role: Performs action.
- Description: Supports the action operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Fightsess(int nact)`
- Role: Creates a new Fightsess instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void presize()`
- Role: Performs presize.
- Description: Supports the presize operation used by the surrounding class.

#### `private void updatepos()`
- Role: Performs updatepos.
- Description: Supports the updatepos operation used by the surrounding class.

#### `Effect(Sprite spr)`
- Role: Handles the effect workflow.
- Description: Supports the effect operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `private Effect fxon(long gobid, Resource fx, Effect cur)`
- Role: Performs fxon.
- Description: Supports the fxon operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `private static Coord actc(int i)`
- Role: Performs actc.
- Description: Supports the actc operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `Release(int n)`
- Role: Handles the release workflow.
- Description: Supports the release operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public boolean keyup(KeyUpEvent ev)`
- Role: Performs keyup.
- Description: Supports the keyup operation used by the surrounding class.
