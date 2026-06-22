---
source: [Window.java](../../../../src/haven/Window.java)
created: 2026-06-13
updated: 2026-06-14
---

# Window

Represents the window Haven component.

## Nested Types

### $_

- Role: Registers the window widget resource.
- Description: Factory that creates a Window widget from size, caption, and large-window arguments.

### Animation

- Role: Marks a window animation.
- Description: Animation contract used by Window transitions and decoration effects.

### Deco

- Role: Represents one window decoration.
- Description: Base class for window frame implementations.

### DefaultDeco

- Role: Provides the default window decoration.
- Description: Draggable window frame with caption bar, close button, and optional resize behavior.

### DragDeco

- Role: Enables dragging through the decoration.
- Description: Decoration variant that forwards mouse drags to the owning window.

### FadeAnim

- Role: Fades a window in or out.
- Description: Animation implementation that interpolates window opacity over time.

### NilAnim

- Role: Represents a no-op window animation.
- Description: Animation implementation that performs no transition work.

### NormAnim

- Role: Represents a normalized window animation.
- Description: Base animation helper for the standard window transition path.

### Transition

- Role: Bridges one animation state to another.
- Description: Generic transition contract used by window animation state machines.

## Members

### Constants

#### `public static final Pipe.Op bgblend = FragColor.blend.nil`
- Role: Caches the bgblend value.
- Description: Caches the `bgblend` value for reuse.
- Value: `FragColor.blend.nil`

#### `public static final Pipe.Op cblend = FragColor.blend(new BlendMode(BlendMode.Function.ADD, BlendMode.Factor.SRC_ALPHA, BlendMode.Factor.INV_SRC_ALPHA,`
- Role: Implements the cblend operation.
- Description: Implements the blend mode operation.
- Value: `FragColor.blend(new BlendMode(BlendMode.Function.ADD, BlendMode.Factor.SRC_ALPHA, BlendMode.Factor.INV_SRC_ALPHA,`

#### `public static final Tex bg = Resource.loadtex("gfx/hud/wnd/lg/bg")`
- Role: Implements the bg operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/bg")`

#### `public static final Tex bgl = Resource.loadtex("gfx/hud/wnd/lg/bgl")`
- Role: Implements the bgl operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/bgl")`

#### `public static final Tex bgr = Resource.loadtex("gfx/hud/wnd/lg/bgr")`
- Role: Implements the bgr operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/bgr")`

#### `public static final Tex cl = Resource.loadtex("gfx/hud/wnd/lg/cl")`
- Role: Implements the cl operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/cl")`

#### `public static final TexI cm = new TexI(Resource.loadsimg("gfx/hud/wnd/lg/cm"))`
- Role: Implements the cm operation.
- Description: Implements the loadsimg operation.
- Value: `new TexI(Resource.loadsimg("gfx/hud/wnd/lg/cm"))`

#### `public static final Tex cr = Resource.loadtex("gfx/hud/wnd/lg/cr")`
- Role: Implements the cr operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/cr")`

#### `public static final Tex tm = Resource.loadtex("gfx/hud/wnd/lg/tm")`
- Role: Implements the tm operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/tm")`

#### `public static final Tex tr = Resource.loadtex("gfx/hud/wnd/lg/tr")`
- Role: Implements the tr operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/tr")`

#### `public static final Tex lm = Resource.loadtex("gfx/hud/wnd/lg/lm")`
- Role: Implements the lm operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/lm")`

#### `public static final Tex lb = Resource.loadtex("gfx/hud/wnd/lg/lb")`
- Role: Implements the lb operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/lb")`

#### `public static final Tex rm = Resource.loadtex("gfx/hud/wnd/lg/rm")`
- Role: Implements the rm operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/rm")`

#### `public static final Tex bl = Resource.loadtex("gfx/hud/wnd/lg/bl")`
- Role: Implements the bl operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/bl")`

#### `public static final Tex bm = Resource.loadtex("gfx/hud/wnd/lg/bm")`
- Role: Implements the bm operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/bm")`

#### `public static final Tex br = Resource.loadtex("gfx/hud/wnd/lg/br")`
- Role: Implements the br operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/lg/br")`

#### `public static final Tex sizer = Resource.loadtex("gfx/hud/wnd/sizer")`
- Role: Implements the sizer operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/wnd/sizer")`

#### `public static final Coord tlm = UI.scale(18, 30)`
- Role: Implements the tlm operation.
- Description: Implements the scale operation.
- Value: `UI.scale(18, 30)`

#### `public static final Coord brm = UI.scale(13, 22)`
- Role: Implements the brm operation.
- Description: Implements the scale operation.
- Value: `UI.scale(13, 22)`

#### `public static final Coord cpo = UI.rscale(36, 16.4)`
- Role: Implements the cpo operation.
- Description: Implements the rscale operation.
- Value: `UI.rscale(36, 16.4)`

#### `public static final int capo = 7, capio = 2`
- Role: Caches the capo value.
- Description: Caches the `capo` value for reuse.
- Value: `7, capio = 2`

#### `public static final int capo = 7, capio = 2`
- Role: Caches the capo value.
- Description: Caches the `capo` value for reuse.
- Value: `7, capio = 2`

#### `public static final Coord dlmrgn = UI.scale(23, 14)`
- Role: Implements the dlmrgn operation.
- Description: Implements the scale operation.
- Value: `UI.scale(23, 14)`

#### `public static final Coord dsmrgn = UI.scale(9, 9)`
- Role: Implements the dsmrgn operation.
- Description: Implements the scale operation.
- Value: `UI.scale(9, 9)`

#### `public static final BufferedImage ctex = Resource.loadsimg("gfx/hud/fonttex")`
- Role: Implements the ctex operation.
- Description: Implements the loadsimg operation.
- Value: `Resource.loadsimg("gfx/hud/fonttex")`

#### `@Deprecated public static final Text.Furnace cf = DefaultDeco.cf`
- Role: Caches the cf value.
- Description: Caches the `cf` value for reuse.
- Value: `DefaultDeco.cf`

#### `@Deprecated public static final Text.Furnace ncf = DefaultDeco.ncf`
- Role: Caches the ncf value.
- Description: Caches the `ncf` value for reuse.
- Value: `DefaultDeco.ncf`

#### `public static final IBox wbox = new IBox.Scaled("gfx/hud/wnd", "tl", "tr", "bl", "br", "extvl", "extvr", "extht", "exthb")`
- Role: Implements the wbox operation.
- Description: Implements the scaled operation.
- Value: `new IBox.Scaled("gfx/hud/wnd", "tl", "tr", "bl", "br", "extvl", "extvr", "extht", "exthb")`

#### `private static final BufferedImage[] cbtni = new BufferedImage[]`
- Role: Caches the cbtni value.
- Description: Caches the `cbtni` value for reuse.
- Value: `new BufferedImage[]`

#### `public static final Text.Forge cf = new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 15).aa(true), ctex),`
- Role: Implements the cf operation.
- Description: Implements the aa operation.
- Value: `new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 15).aa(true), ctex),`

#### `public static final Text.Forge ncf = new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 15).aa(true), ctex),`
- Role: Implements the ncf operation.
- Description: Implements the aa operation.
- Value: `new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 15).aa(true), ctex),`

#### `public static final Transition<?, ?> niltrans = new Transition<Animation, Animation>()`
- Role: Implements the niltrans operation.
- Description: Implements the public static final transition<?, ?> niltrans = new transition<animation, animation>() operation.
- Value: `new Transition<Animation, Animation>()`

#### `public static final double minfac = 0.1`
- Role: Caches the minfac value.
- Description: Caches the `minfac` value for reuse.
- Value: `0.1`

#### `public static final double time = 0.1`
- Role: Caches the time value.
- Description: Caches the `time` value for reuse.
- Value: `0.1`

#### `public static final Transition<?, ?> trans = new Transition<FadeAnim, FadeAnim>()`
- Role: Implements the trans operation.
- Description: Implements the public static final transition<?, ?> trans = new transition<fade anim, fade anim>() operation.
- Value: `new Transition<FadeAnim, FadeAnim>()`

### Fields

#### `public Deco deco`
- Role: Caches the deco value.
- Description: Caches the `deco` value for reuse.

#### `public String cap`
- Role: Caches the cap value.
- Description: Caches the `cap` value for reuse.

#### `public TexRaw gbuf = null`
- Role: Caches the gbuf value.
- Description: Caches the `gbuf` value for reuse.

#### `private FragColor gout`
- Role: Caches the gout value.
- Description: Caches the `gout` value for reuse.

#### `private Pipe.Op gbasic`
- Role: Caches the gbasic value.
- Description: Caches the `gbasic` value for reuse.

#### `private UI.Grab dm = null`
- Role: Caches the dm value.
- Description: Caches the `dm` value for reuse.

#### `private Coord doff`
- Role: Caches the doff value.
- Description: Caches the `doff` value for reuse.

#### `public boolean large = false`
- Role: Tracks the large flag.
- Description: Caches the `large` value for reuse.

#### `public final boolean lg`
- Role: Tracks the lg flag.
- Description: Caches the `lg` value for reuse.

#### `public final IButton cbtn`
- Role: Caches the cbtn value.
- Description: Caches the `cbtn` value for reuse.

#### `public boolean dragsize, cfocus`
- Role: Tracks the cfocus flag.
- Description: Caches the `cfocus` value for reuse.

#### `public boolean dragsize, cfocus`
- Role: Tracks the cfocus flag.
- Description: Caches the `cfocus` value for reuse.

#### `public Area aa, ca`
- Role: Caches the ca value.
- Description: Caches the `ca` value for reuse.

#### `public Area aa, ca`
- Role: Caches the ca value.
- Description: Caches the `ca` value for reuse.

#### `public Coord cptl = Coord.z, cpsz = Coord.z`
- Role: Caches the cptl value.
- Description: Caches the `cptl` value for reuse.

#### `public Coord cptl = Coord.z, cpsz = Coord.z`
- Role: Caches the cptl value.
- Description: Caches the `cptl` value for reuse.

#### `public int cmw`
- Role: Caches the cmw value.
- Description: Caches the `cmw` value for reuse.

#### `public Text cap = null`
- Role: Caches the cap value.
- Description: Caches the `cap` value for reuse.

#### `private UI.Grab szdrag`
- Role: Caches the szdrag value.
- Description: Caches the `szdrag` value for reuse.

#### `private Coord szdragc`
- Role: Caches the szdragc value.
- Description: Caches the `szdragc` value for reuse.

#### `private Transition<?, ?> trans = null`
- Role: Caches the trans value.
- Description: Caches the `trans` value for reuse.

#### `private Animation anim = null`
- Role: Caches the anim value.
- Description: Caches the `anim` value for reuse.

#### `private String animst = null`
- Role: Caches the animst value.
- Description: Caches the `animst` value for reuse.

#### `public final double s`
- Role: Caches the s value.
- Description: Caches the `s` value for reuse.

#### `public final boolean rev`
- Role: Tracks the rev flag.
- Description: Caches the `rev` value for reuse.

#### `public double a = 0.0, na = 0.0`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `public double a = 0.0, na = 0.0`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private Window(Coord sz, String cap, boolean lg, Deco deco, boolean defdeco)`
- Role: Creates a new Window instance.
- Description: Constructs the Window instance from the supplied inputs.

#### `public Window(Coord sz, String cap, boolean lg, Deco deco)`
- Role: Creates a new Window instance.
- Description: Constructs the Window instance from the supplied inputs.

#### `public Window(Coord sz, String cap, boolean lg)`
- Role: Creates a new Window instance.
- Description: Constructs the Window instance from the supplied inputs.

#### `public Window(Coord sz, String cap)`
- Role: Creates a new Window instance.
- Description: Constructs the Window instance from the supplied inputs.

#### `protected Deco makedeco()`
- Role: Handles the makedeco path.
- Description: Implements the makedeco operation.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void chcap(String cap)`
- Role: Handles the chcap path.
- Description: Implements the chcap operation.

#### `public void chdeco(Deco deco)`
- Role: Handles the chdeco path.
- Description: Implements the chdeco operation.

#### `public Deco()`
- Role: Handles the deco path.
- Description: Implements the deco operation.

#### `public abstract void iresize(Coord isz)`
- Role: Handles the iresize path.
- Description: Implements the iresize operation.

#### `public abstract Area contarea()`
- Role: Handles the contarea path.
- Description: Implements the contarea operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public DefaultDeco(boolean lg)`
- Role: Handles the default deco path.
- Description: Implements the default deco operation.

#### `public DefaultDeco()`
- Role: Handles the default deco path.
- Description: Implements the default deco operation.

#### `public DefaultDeco dragsize(boolean v)`
- Role: Handles the dragsize path.
- Description: Implements the dragsize operation.

#### `public void iresize(Coord isz)`
- Role: Handles the iresize path.
- Description: Implements the iresize operation.

#### `public Area contarea()`
- Role: Handles the contarea path.
- Description: Implements the contarea operation.

#### `protected void cdraw(GOut g)`
- Role: Handles the cdraw path.
- Description: Implements the cdraw operation.

#### `protected void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `protected void drawframe(GOut g)`
- Role: Handles the drawframe path.
- Description: Draws the frame.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Window content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.

#### `public void cdraw(GOut g)`
- Role: Handles the cdraw path.
- Description: Implements the cdraw operation.

#### `public Pipe.Op gbasic()`
- Role: Handles the gbasic path.
- Description: Implements the gbasic operation.

#### `protected void drawbuf(GOut g)`
- Role: Handles the drawbuf path.
- Description: Draws the buf.

#### `protected void drawfin(GOut g, Tex buf)`
- Role: Handles the drawfin path.
- Description: Draws the fin.

#### `public void draw(GOut og)`
- Role: Draws the current content.
- Description: Draws the Window content.

#### `public Coord contentsz()`
- Role: Handles the contentsz path.
- Description: Implements the contentsz operation.

#### `public Area ca()`
- Role: Handles the ca path.
- Description: Implements the ca operation.

#### `public Coord csz()`
- Role: Handles the csz path.
- Description: Implements the csz operation.

#### `private void resize2(Coord sz)`
- Role: Handles the resize2 path.
- Description: Implements the resize2 operation.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public Coord xlate(Coord c, boolean in)`
- Role: Handles the xlate path.
- Description: Implements the xlate operation.

#### `public void drag(Coord off)`
- Role: Handles the drag path.
- Description: Implements the drag operation.

#### `public boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean handle(Event ev)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public void reqclose()`
- Role: Handles the reqclose path.
- Description: Implements the reqclose operation.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g, Tex tex)`
- Role: Draws the current content.
- Description: Draws the Window content.

#### `public S show(Window wnd, H hiding)`
- Role: Handles the show path.
- Description: Implements the show operation.

#### `public H hide(Window wnd, S showing)`
- Role: Handles the hide path.
- Description: Implements the hide operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `private <H extends Animation> Animation show0(Transition<?, H> trans, Animation h)`
- Role: Handles the show0 path.
- Description: Implements the show0 operation.

#### `private <S extends Animation> Animation hide0(Transition<S, ?> trans, Animation s)`
- Role: Handles the hide0 path.
- Description: Implements the hide0 operation.

#### `public void settrans(Transition<?, ?> trans)`
- Role: Handles the settrans path.
- Description: Updates the trans.

#### `public boolean visible()`
- Role: Returns whether the widget is visible.
- Description: Controls whether the overlay participates in rendering.

#### `private void initanim()`
- Role: Handles the initanim path.
- Description: Implements the initanim operation.

#### `public void show()`
- Role: Handles the show path.
- Description: Implements the show operation.

#### `public void hide()`
- Role: Handles the hide path.
- Description: Implements the hide operation.

#### `public void reqdestroy()`
- Role: Handles the reqdestroy path.
- Description: Implements the reqdestroy operation.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g, Tex tex)`
- Role: Draws the current content.
- Description: Draws the Window content.

#### `public NormAnim(double t, double fromn, boolean rev)`
- Role: Handles the norm anim path.
- Description: Implements the norm anim operation.

#### `public NormAnim(double t, NormAnim from, boolean rev)`
- Role: Handles the norm anim path.
- Description: Implements the norm anim operation.

#### `public NormAnim(double t)`
- Role: Handles the norm anim path.
- Description: Implements the norm anim operation.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void stick(double a)`
- Role: Handles the stick path.
- Description: Implements the stick operation.

#### `public FadeAnim(boolean hide, FadeAnim from)`
- Role: Handles the fade anim path.
- Description: Implements the fade anim operation.

#### `public void draw(GOut g, Tex tex)`
- Role: Draws the current content.
- Description: Draws the Window content.

#### `protected Transition<?, ?> deftrans()`
- Role: Handles the deftrans path.
- Description: Implements the deftrans operation.

#### `public static void main(String[] args)`
- Role: Handles the main path.
- Description: Runs the client entry point.

#### `public boolean isTitle(String text)`
- Role: Checks whether the title.
- Description: Returns whether the condition is satisfied.