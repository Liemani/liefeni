---
source: [Window.java](../../../src/haven/Window.java)
created: 2026-06-13
updated: 2026-06-14
---

# Window

Represents the window Haven component.

## Nested Types

### $_

- Role: Represents $ within Window.
- Description: Describes the nested $  type used by the enclosing class.

### Animation

- Role: Represents animation within Window.
- Description: Describes the nested animation type used by the enclosing class.

### Deco

- Role: Represents deco within Window.
- Description: Describes the nested deco type used by the enclosing class.

### DefaultDeco

- Role: Represents default deco within Window.
- Description: Describes the nested default deco type used by the enclosing class.

### DragDeco

- Role: Represents drag deco within Window.
- Description: Describes the nested drag deco type used by the enclosing class.

### FadeAnim

- Role: Represents fade anim within Window.
- Description: Describes the nested fade anim type used by the enclosing class.

### NilAnim

- Role: Represents nil anim within Window.
- Description: Describes the nested nil anim type used by the enclosing class.

### NormAnim

- Role: Represents norm anim within Window.
- Description: Describes the nested norm anim type used by the enclosing class.

### Transition

- Role: Represents transition within Window.
- Description: Describes the nested transition type used by the enclosing class.

## Members

### Constants

#### `public static final Pipe.Op bgblend = FragColor.blend.nil`
- Role: Defines the shared bgblend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pipe.Op cblend = FragColor.blend(new BlendMode(BlendMode.Function.ADD, BlendMode.Factor.SRC_ALPHA, BlendMode.Factor.INV_SRC_ALPHA,`
- Role: Defines the shared cblend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex bg = Resource.loadtex("gfx/hud/wnd/lg/bg")`
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex bgl = Resource.loadtex("gfx/hud/wnd/lg/bgl")`
- Role: Defines the shared bgl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex bgr = Resource.loadtex("gfx/hud/wnd/lg/bgr")`
- Role: Defines the shared bgr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex cl = Resource.loadtex("gfx/hud/wnd/lg/cl")`
- Role: Defines the shared cl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final TexI cm = new TexI(Resource.loadsimg("gfx/hud/wnd/lg/cm"))`
- Role: Defines the shared cm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex cr = Resource.loadtex("gfx/hud/wnd/lg/cr")`
- Role: Defines the shared cr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex tm = Resource.loadtex("gfx/hud/wnd/lg/tm")`
- Role: Defines the shared tm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex tr = Resource.loadtex("gfx/hud/wnd/lg/tr")`
- Role: Defines the shared tr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex lm = Resource.loadtex("gfx/hud/wnd/lg/lm")`
- Role: Defines the shared lm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex lb = Resource.loadtex("gfx/hud/wnd/lg/lb")`
- Role: Defines the shared lb constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex rm = Resource.loadtex("gfx/hud/wnd/lg/rm")`
- Role: Defines the shared rm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex bl = Resource.loadtex("gfx/hud/wnd/lg/bl")`
- Role: Defines the shared bl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex bm = Resource.loadtex("gfx/hud/wnd/lg/bm")`
- Role: Defines the shared bm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex br = Resource.loadtex("gfx/hud/wnd/lg/br")`
- Role: Defines the shared br constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex sizer = Resource.loadtex("gfx/hud/wnd/sizer")`
- Role: Defines the shared sizer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord tlm = UI.scale(18, 30)`
- Role: Defines the shared tlm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord brm = UI.scale(13, 22)`
- Role: Defines the shared brm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord cpo = UI.rscale(36, 16.4)`
- Role: Defines the shared cpo constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int capo = 7, capio = 2`
- Role: Defines the shared capo constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int capo = 7, capio = 2`
- Role: Defines the shared capo constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord dlmrgn = UI.scale(23, 14)`
- Role: Defines the shared dlmrgn constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord dsmrgn = UI.scale(9, 9)`
- Role: Defines the shared dsmrgn constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BufferedImage ctex = Resource.loadsimg("gfx/hud/fonttex")`
- Role: Defines the shared ctex constant.
- Description: Shared constant used by the rest of the class.

#### `@Deprecated public static final Text.Furnace cf = DefaultDeco.cf`
- Role: Defines the shared cf constant.
- Description: Shared constant used by the rest of the class.

#### `@Deprecated public static final Text.Furnace ncf = DefaultDeco.ncf`
- Role: Defines the shared ncf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final IBox wbox = new IBox.Scaled("gfx/hud/wnd", "tl", "tr", "bl", "br", "extvl", "extvr", "extht", "exthb")`
- Role: Defines the shared wbox constant.
- Description: Shared constant used by the rest of the class.

#### `private static final BufferedImage[] cbtni = new BufferedImage[]`
- Role: Defines the shared cbtni constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Forge cf = new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 15).aa(true), ctex),`
- Role: Defines the shared cf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Forge ncf = new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 15).aa(true), ctex),`
- Role: Defines the shared ncf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Transition<?, ?> niltrans = new Transition<Animation, Animation>()`
- Role: Defines the shared niltrans constant.
- Description: Shared constant used by the rest of the class.

#### `public static final double minfac = 0.1`
- Role: Defines the shared minfac constant.
- Description: Shared constant used by the rest of the class.

#### `public static final double time = 0.1`
- Role: Defines the shared time constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Transition<?, ?> trans = new Transition<FadeAnim, FadeAnim>()`
- Role: Defines the shared trans constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Deco deco`
- Role: Holds the deco state.
- Description: Backs the cached state for this file.

#### `public String cap`
- Role: Stores the cap value.
- Description: Backs the cached state for this file.

#### `public TexRaw gbuf = null`
- Role: Stores the gbuf value.
- Description: Backs the cached state for this file.

#### `private FragColor gout`
- Role: Stores the gout value.
- Description: Backs the cached state for this file.

#### `private Pipe.Op gbasic`
- Role: Holds the gbasic state.
- Description: Backs the cached state for this file.

#### `private UI.Grab dm = null`
- Role: Stores the dm value.
- Description: Backs the cached state for this file.

#### `private Coord doff`
- Role: Stores the doff value.
- Description: Backs the cached state for this file.

#### `public boolean large = false`
- Role: Tracks the large flag.
- Description: Supports the large operation used by the surrounding class.

#### `public final boolean lg`
- Role: Tracks the lg flag.
- Description: Supports the lg operation used by the surrounding class.

#### `public final IButton cbtn`
- Role: Holds the cbtn state.
- Description: Backs the cached state for this file.

#### `public boolean dragsize, cfocus`
- Role: Tracks the cfocus flag.
- Description: Supports the cfocus operation used by the surrounding class.

#### `public boolean dragsize, cfocus`
- Role: Tracks the cfocus flag.
- Description: Supports the cfocus operation used by the surrounding class.

#### `public Area aa, ca`
- Role: Holds the ca state.
- Description: Backs the cached state for this file.

#### `public Area aa, ca`
- Role: Holds the ca state.
- Description: Backs the cached state for this file.

#### `public Coord cptl = Coord.z, cpsz = Coord.z`
- Role: Stores the cptl value.
- Description: Backs the cached state for this file.

#### `public Coord cptl = Coord.z, cpsz = Coord.z`
- Role: Stores the cptl value.
- Description: Backs the cached state for this file.

#### `public int cmw`
- Role: Stores the cmw value.
- Description: Backs the cached state for this file.

#### `public Text cap = null`
- Role: Stores the cap value.
- Description: Backs the cached state for this file.

#### `private UI.Grab szdrag`
- Role: Stores the szdrag value.
- Description: Backs the cached state for this file.

#### `private Coord szdragc`
- Role: Stores the szdragc value.
- Description: Backs the cached state for this file.

#### `private Transition<?, ?> trans = null`
- Role: Holds the trans state.
- Description: Backs the cached state for this file.

#### `private Animation anim = null`
- Role: Holds the anim state.
- Description: Backs the cached state for this file.

#### `private String animst = null`
- Role: Stores the animst value.
- Description: Backs the cached state for this file.

#### `public final double s`
- Role: Stores the s value.
- Description: Backs the cached state for this file.

#### `public final boolean rev`
- Role: Tracks the rev flag.
- Description: Supports the rev operation used by the surrounding class.

#### `public double a = 0.0, na = 0.0`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `public double a = 0.0, na = 0.0`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private Window(Coord sz, String cap, boolean lg, Deco deco, boolean defdeco)`
- Role: Creates a new Window instance.
- Description: Constructs the instance and initializes its default state.

#### `public Window(Coord sz, String cap, boolean lg, Deco deco)`
- Role: Creates a new Window instance.
- Description: Constructs the instance and initializes its default state.

#### `public Window(Coord sz, String cap, boolean lg)`
- Role: Creates a new Window instance.
- Description: Constructs the instance and initializes its default state.

#### `public Window(Coord sz, String cap)`
- Role: Creates a new Window instance.
- Description: Constructs the instance and initializes its default state.

#### `protected Deco makedeco()`
- Role: Performs makedeco.
- Description: Supports the makedeco operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void chcap(String cap)`
- Role: Performs chcap.
- Description: Supports the chcap operation used by the surrounding class.

#### `public void chdeco(Deco deco)`
- Role: Performs chdeco.
- Description: Supports the chdeco operation used by the surrounding class.

#### `public Deco()`
- Role: Performs deco.
- Description: Supports the deco operation used by the surrounding class.

#### `public abstract void iresize(Coord isz)`
- Role: Performs iresize.
- Description: Supports the iresize operation used by the surrounding class.

#### `public abstract Area contarea()`
- Role: Performs contarea.
- Description: Supports the contarea operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public DefaultDeco(boolean lg)`
- Role: Performs default deco.
- Description: Supports the default deco operation used by the surrounding class.

#### `public DefaultDeco()`
- Role: Performs default deco.
- Description: Supports the default deco operation used by the surrounding class.

#### `public DefaultDeco dragsize(boolean v)`
- Role: Performs dragsize.
- Description: Supports the dragsize operation used by the surrounding class.

#### `public void iresize(Coord isz)`
- Role: Performs iresize.
- Description: Supports the iresize operation used by the surrounding class.

#### `public Area contarea()`
- Role: Performs contarea.
- Description: Supports the contarea operation used by the surrounding class.

#### `protected void cdraw(GOut g)`
- Role: Performs cdraw.
- Description: Supports the cdraw operation used by the surrounding class.

#### `protected void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `protected void drawframe(GOut g)`
- Role: Performs drawframe.
- Description: Supports the drawframe operation used by the surrounding class.

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

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public void cdraw(GOut g)`
- Role: Performs cdraw.
- Description: Supports the cdraw operation used by the surrounding class.

#### `public Pipe.Op gbasic()`
- Role: Performs gbasic.
- Description: Supports the gbasic operation used by the surrounding class.

#### `protected void drawbuf(GOut g)`
- Role: Performs drawbuf.
- Description: Supports the drawbuf operation used by the surrounding class.

#### `protected void drawfin(GOut g, Tex buf)`
- Role: Performs drawfin.
- Description: Supports the drawfin operation used by the surrounding class.

#### `public void draw(GOut og)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Coord contentsz()`
- Role: Performs contentsz.
- Description: Supports the contentsz operation used by the surrounding class.

#### `public Area ca()`
- Role: Performs ca.
- Description: Supports the ca operation used by the surrounding class.

#### `public Coord csz()`
- Role: Performs csz.
- Description: Supports the csz operation used by the surrounding class.

#### `private void resize2(Coord sz)`
- Role: Performs resize2.
- Description: Supports the resize2 operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public Coord xlate(Coord c, boolean in)`
- Role: Performs xlate.
- Description: Supports the xlate operation used by the surrounding class.

#### `public void drag(Coord off)`
- Role: Performs drag.
- Description: Supports the drag operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean handle(Event ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public void reqclose()`
- Role: Performs reqclose.
- Description: Supports the reqclose operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g, Tex tex)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public S show(Window wnd, H hiding)`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public H hide(Window wnd, S showing)`
- Role: Performs hide.
- Description: Supports the hide operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `private <H extends Animation> Animation show0(Transition<?, H> trans, Animation h)`
- Role: Performs show0.
- Description: Supports the show0 operation used by the surrounding class.

#### `private <S extends Animation> Animation hide0(Transition<S, ?> trans, Animation s)`
- Role: Performs hide0.
- Description: Supports the hide0 operation used by the surrounding class.

#### `public void settrans(Transition<?, ?> trans)`
- Role: Performs settrans.
- Description: Supports the settrans operation used by the surrounding class.

#### `public boolean visible()`
- Role: Returns whether the widget is visible.
- Description: Controls whether the overlay participates in rendering.

#### `private void initanim()`
- Role: Performs initanim.
- Description: Supports the initanim operation used by the surrounding class.

#### `public void show()`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public void hide()`
- Role: Performs hide.
- Description: Supports the hide operation used by the surrounding class.

#### `public void reqdestroy()`
- Role: Performs reqdestroy.
- Description: Supports the reqdestroy operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g, Tex tex)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public NormAnim(double t, double fromn, boolean rev)`
- Role: Performs norm anim.
- Description: Supports the norm anim operation used by the surrounding class.

#### `public NormAnim(double t, NormAnim from, boolean rev)`
- Role: Performs norm anim.
- Description: Supports the norm anim operation used by the surrounding class.

#### `public NormAnim(double t)`
- Role: Performs norm anim.
- Description: Supports the norm anim operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void stick(double a)`
- Role: Performs stick.
- Description: Supports the stick operation used by the surrounding class.

#### `public FadeAnim(boolean hide, FadeAnim from)`
- Role: Performs fade anim.
- Description: Supports the fade anim operation used by the surrounding class.

#### `public void draw(GOut g, Tex tex)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `protected Transition<?, ?> deftrans()`
- Role: Performs deftrans.
- Description: Supports the deftrans operation used by the surrounding class.

#### `public static void main(String[] args)`
- Role: Performs main.
- Description: Supports the main operation used by the surrounding class.

#### `public boolean isTitle(String text)`
- Role: Checks whether the title.
- Description: Returns a boolean result for the described condition.
