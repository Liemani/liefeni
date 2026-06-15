# Window

This file documents the responsibilities and members of `Window`.

## Meta

- Source: [Window.java](../../../src/haven/Window.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a generic window widget.

## Nested Types

### $_

- Description: TODO

### Animation

- Description: TODO

### Deco

- Description: TODO

### DefaultDeco

- Description: TODO

### DragDeco

- Description: TODO

### FadeAnim

- Description: TODO

### NilAnim

- Description: TODO

### NormAnim

- Description: TODO

### Transition

- Description: TODO

## Members

### Constants

#### `public static final Pipe.Op bgblend = FragColor.blend.nil`

- Description: TODO

#### `public static final Pipe.Op cblend = FragColor.blend(new BlendMode(BlendMode.Function.ADD, BlendMode.Factor.SRC_ALPHA, BlendMode.Factor.INV_SRC_ALPHA,`

- Description: TODO

#### `public static final Tex bg = Resource.loadtex("gfx/hud/wnd/lg/bg")`

- Description: TODO

#### `public static final Tex bgl = Resource.loadtex("gfx/hud/wnd/lg/bgl")`

- Description: TODO

#### `public static final Tex bgr = Resource.loadtex("gfx/hud/wnd/lg/bgr")`

- Description: TODO

#### `public static final Tex cl = Resource.loadtex("gfx/hud/wnd/lg/cl")`

- Description: TODO

#### `public static final TexI cm = new TexI(Resource.loadsimg("gfx/hud/wnd/lg/cm"))`

- Description: TODO

#### `public static final Tex cr = Resource.loadtex("gfx/hud/wnd/lg/cr")`

- Description: TODO

#### `public static final Tex tm = Resource.loadtex("gfx/hud/wnd/lg/tm")`

- Description: TODO

#### `public static final Tex tr = Resource.loadtex("gfx/hud/wnd/lg/tr")`

- Description: TODO

#### `public static final Tex lm = Resource.loadtex("gfx/hud/wnd/lg/lm")`

- Description: TODO

#### `public static final Tex lb = Resource.loadtex("gfx/hud/wnd/lg/lb")`

- Description: TODO

#### `public static final Tex rm = Resource.loadtex("gfx/hud/wnd/lg/rm")`

- Description: TODO

#### `public static final Tex bl = Resource.loadtex("gfx/hud/wnd/lg/bl")`

- Description: TODO

#### `public static final Tex bm = Resource.loadtex("gfx/hud/wnd/lg/bm")`

- Description: TODO

#### `public static final Tex br = Resource.loadtex("gfx/hud/wnd/lg/br")`

- Description: TODO

#### `public static final Tex sizer = Resource.loadtex("gfx/hud/wnd/sizer")`

- Description: TODO

#### `public static final Coord tlm = UI.scale(18, 30)`

- Description: TODO

#### `public static final Coord brm = UI.scale(13, 22)`

- Description: TODO

#### `public static final Coord cpo = UI.rscale(36, 16.4)`

- Description: TODO

#### `public static final int capo = 7, capio = 2`

- Description: TODO

#### `public static final int capo = 7, capio = 2`

- Description: TODO

#### `public static final Coord dlmrgn = UI.scale(23, 14)`

- Description: TODO

#### `public static final Coord dsmrgn = UI.scale(9, 9)`

- Description: TODO

#### `public static final BufferedImage ctex = Resource.loadsimg("gfx/hud/fonttex")`

- Description: TODO

#### `@Deprecated public static final Text.Furnace cf = DefaultDeco.cf`

- Description: TODO

#### `@Deprecated public static final Text.Furnace ncf = DefaultDeco.ncf`

- Description: TODO

#### `public static final IBox wbox = new IBox.Scaled("gfx/hud/wnd", "tl", "tr", "bl", "br", "extvl", "extvr", "extht", "exthb")`

- Description: TODO

#### `private static final BufferedImage[] cbtni = new BufferedImage[]`

- Description: TODO

#### `public static final Text.Forge cf = new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 15).aa(true), ctex),`

- Description: TODO

#### `public static final Text.Forge ncf = new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 15).aa(true), ctex),`

- Description: TODO

#### `public static final Transition<?, ?> niltrans = new Transition<Animation, Animation>()`

- Description: TODO

#### `public static final double minfac = 0.1`

- Description: TODO

#### `public static final double time = 0.1`

- Description: TODO

#### `public static final Transition<?, ?> trans = new Transition<FadeAnim, FadeAnim>()`

- Description: TODO

### Fields

#### `public Deco deco`

- Description: TODO

#### `public String cap`

- Description: TODO

#### `public TexRaw gbuf = null`

- Description: TODO

#### `private FragColor gout`

- Description: TODO

#### `private Pipe.Op gbasic`

- Description: TODO

#### `private UI.Grab dm = null`

- Description: TODO

#### `private Coord doff`

- Description: TODO

#### `public boolean large = false`

- Description: TODO

#### `public final boolean lg`

- Description: TODO

#### `public final IButton cbtn`

- Description: TODO

#### `public boolean dragsize, cfocus`

- Description: TODO

#### `public boolean dragsize, cfocus`

- Description: TODO

#### `public Area aa, ca`

- Description: TODO

#### `public Area aa, ca`

- Description: TODO

#### `public Coord cptl = Coord.z, cpsz = Coord.z`

- Description: TODO

#### `public Coord cptl = Coord.z, cpsz = Coord.z`

- Description: TODO

#### `public int cmw`

- Description: TODO

#### `public Text cap = null`

- Description: TODO

#### `private UI.Grab szdrag`

- Description: TODO

#### `private Coord szdragc`

- Description: TODO

#### `private Transition<?, ?> trans = null`

- Description: TODO

#### `private Animation anim = null`

- Description: TODO

#### `private String animst = null`

- Description: TODO

#### `public final double s`

- Description: TODO

#### `public final boolean rev`

- Description: TODO

#### `public double a = 0.0, na = 0.0`

- Description: TODO

#### `public double a = 0.0, na = 0.0`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `private Window(Coord sz, String cap, boolean lg, Deco deco, boolean defdeco)`

- Description: TODO

#### `public Window(Coord sz, String cap, boolean lg, Deco deco)`

- Description: TODO

#### `public Window(Coord sz, String cap, boolean lg)`

- Description: TODO

#### `public Window(Coord sz, String cap)`

- Description: TODO

#### `protected Deco makedeco()`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public void chcap(String cap)`

- Description: TODO

#### `public void chdeco(Deco deco)`

- Description: TODO

#### `public Deco()`

- Description: TODO

#### `public abstract void iresize(Coord isz)`

- Description: TODO

#### `public abstract Area contarea()`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public DefaultDeco(boolean lg)`

- Description: TODO

#### `public DefaultDeco()`

- Description: TODO

#### `public DefaultDeco dragsize(boolean v)`

- Description: TODO

#### `public void iresize(Coord isz)`

- Description: TODO

#### `public Area contarea()`

- Description: TODO

#### `protected void cdraw(GOut g)`

- Description: TODO

#### `protected void drawbg(GOut g)`

- Description: TODO

#### `protected void drawframe(GOut g)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public boolean checkhit(Coord c)`

- Description: TODO

#### `public void cdraw(GOut g)`

- Description: TODO

#### `public Pipe.Op gbasic()`

- Description: TODO

#### `protected void drawbuf(GOut g)`

- Description: TODO

#### `protected void drawfin(GOut g, Tex buf)`

- Description: TODO

#### `public void draw(GOut og)`

- Description: TODO

#### `public Coord contentsz()`

- Description: TODO

#### `public Area ca()`

- Description: TODO

#### `public Coord csz()`

- Description: TODO

#### `private void resize2(Coord sz)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public Coord xlate(Coord c, boolean in)`

- Description: TODO

#### `public void drag(Coord off)`

- Description: TODO

#### `public boolean checkhit(Coord c)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean handle(Event ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public void reqclose()`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public void draw(GOut g, Tex tex)`

- Description: TODO

#### `public S show(Window wnd, H hiding)`

- Description: TODO

#### `public H hide(Window wnd, S showing)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `private <H extends Animation> Animation show0(Transition<?, H> trans, Animation h)`

- Description: TODO

#### `private <S extends Animation> Animation hide0(Transition<S, ?> trans, Animation s)`

- Description: TODO

#### `public void settrans(Transition<?, ?> trans)`

- Description: TODO

#### `public boolean visible()`

- Description: TODO

#### `private void initanim()`

- Description: TODO

#### `public void show()`

- Description: TODO

#### `public void hide()`

- Description: TODO

#### `public void reqdestroy()`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public void draw(GOut g, Tex tex)`

- Description: TODO

#### `public NormAnim(double t, double fromn, boolean rev)`

- Description: TODO

#### `public NormAnim(double t, NormAnim from, boolean rev)`

- Description: TODO

#### `public NormAnim(double t)`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public void stick(double a)`

- Description: TODO

#### `public FadeAnim(boolean hide, FadeAnim from)`

- Description: TODO

#### `public void draw(GOut g, Tex tex)`

- Description: TODO

#### `protected Transition<?, ?> deftrans()`

- Description: TODO

#### `public static void main(String[] args)`

- Description: TODO

#### `public boolean isTitle(String text)`

- Description: TODO
