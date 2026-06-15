# CharWnd

This file documents the responsibilities and members of `CharWnd`.

## Meta

- Source: [CharWnd.java](../../../src/haven/CharWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the character window.

## Nested Types

### $_

- Description: TODO

### AttrWdg

- Description: TODO

### IconInfo

- Description: TODO

### ImageInfoBox

- Description: TODO

### LoadingTextBox

- Description: TODO

### RLabel

- Description: TODO

### TabProxy

- Description: TODO

## Members

### Constants

#### `public static final RichText.Foundry ifnd = new RichText.Foundry(RichText.IMAGESRC, RichText.ImageSource.legacy,`

- Description: TODO

#### `public static final Text.Furnace catf = new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 25).aa(true), Window.ctex), UI.scale(3), UI.scale(2), new Color(96, 48, 0))`

- Description: TODO

#### `public static final Text.Furnace failf = new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 25).aa(true), Resource.loadimg("gfx/hud/fontred")), UI.scale(3), UI.scale(2), new Color(96, 48, 0))`

- Description: TODO

#### `public static final Text.Foundry attrf = new Text.Foundry(Text.fraktur.deriveFont((float)Math.floor(UI.scale(18.0)))).aa(true)`

- Description: TODO

#### `public static final PUtils.Convolution iconfilter = new PUtils.Lanczos(3)`

- Description: TODO

#### `public static final int attrw = BAttrWnd.FoodMeter.frame.sz().x - wbox.bisz().x`

- Description: TODO

#### `public static final Color debuff = new Color(255, 128, 128)`

- Description: TODO

#### `public static final Color buff = new Color(128, 255, 128)`

- Description: TODO

#### `public static final Color tbuff = new Color(128, 128, 255)`

- Description: TODO

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`

- Description: TODO

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`

- Description: TODO

#### `public static final int width = UI.scale(255)`

- Description: TODO

#### `public static final int height = UI.scale(260)`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<AttrWdg> ctxr = new OwnerContext.ClassResolver<AttrWdg>()`

- Description: TODO

### Fields

#### `public BAttrWnd battr`

- Description: TODO

#### `public SAttrWnd sattr`

- Description: TODO

#### `public SkillWnd skill`

- Description: TODO

#### `public FightWnd fight`

- Description: TODO

#### `public WoundWnd wound`

- Description: TODO

#### `public QuestWnd quest`

- Description: TODO

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`

- Description: TODO

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`

- Description: TODO

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`

- Description: TODO

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`

- Description: TODO

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`

- Description: TODO

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`

- Description: TODO

#### `public int exp, enc`

- Description: TODO

#### `public int exp, enc`

- Description: TODO

#### `public final Class<? extends Widget> tcl`

- Description: TODO

#### `public final String id`

- Description: TODO

#### `private Widget tab = null`

- Description: TODO

#### `private final Supplier<V> val`

- Description: TODO

#### `private final Function<V, String> fmt`

- Description: TODO

#### `private final Function<V, Color> col`

- Description: TODO

#### `private Coord oc`

- Description: TODO

#### `private Color lc`

- Description: TODO

#### `private V lv`

- Description: TODO

#### `private Tex img`

- Description: TODO

#### `private Indir<Tex> loading`

- Description: TODO

#### `private final Scrollbar sb`

- Description: TODO

#### `public final String nm`

- Description: TODO

#### `public final Glob.CAttr attr`

- Description: TODO

#### `private ItemInfo.Raw rinfo = null`

- Description: TODO

#### `private List<ItemInfo> binfo = null`

- Description: TODO

#### `private List<ItemInfo> tipinfo`

- Description: TODO

#### `private Tex tipimg = null`

- Description: TODO

### Methods

#### `public TabProxy(Class<? extends Widget> tcl, String id)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public void uimsg(String nm, Object... args)`

- Description: TODO

#### `public <T> T getchild(Class<T> cl)`

- Description: TODO

#### `private RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col, V ival)`

- Description: TODO

#### `public RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col)`

- Description: TODO

#### `public RLabel(Supplier<V> val, Function<V, String> fmt, Color col)`

- Description: TODO

#### `private void update()`

- Description: TODO

#### `protected void attached()`

- Description: TODO

#### `public void settext(String text)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public static RichText.ImageSource resimg(Resource res)`

- Description: TODO

#### `public static RichText.Document resdoc(Resource res, String text)`

- Description: TODO

#### `public LoadingTextBox(Coord sz, String text, RichText.Foundry fnd)`

- Description: TODO

#### `public LoadingTextBox(Coord sz, String text, Object... attrs)`

- Description: TODO

#### `public ImageInfoBox(Coord sz)`

- Description: TODO

#### `public void drawbg(GOut g)`

- Description: TODO

#### `public Coord marg()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void set(Tex img)`

- Description: TODO

#### `public void set(Indir<Tex> loading)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public void draw(BufferedImage img, Graphics g)`

- Description: TODO

#### `public static BufferedImage render(BufferedImage base, List<ItemInfo> info)`

- Description: TODO

#### `public AttrWdg(Coord sz, Glob glob, String attr)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public static <T extends Widget> T settip(T wdg, String resnm)`

- Description: TODO

#### `public CharWnd(Glob glob)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public void uimsg(String nm, Object... args)`

- Description: TODO
