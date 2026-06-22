---
source: [CharWnd.java](../../../../src/haven/CharWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# CharWnd

Represents the char wnd Haven component.

## Nested Types

### $_

- Role: Represents $ within CharWnd.
- Description: Describes the nested $  type used by the enclosing class.

### AttrWdg

- Role: Represents attr wdg within CharWnd.
- Description: Describes the nested attr wdg type used by the enclosing class.

### IconInfo

- Role: Represents icon info within CharWnd.
- Description: Describes the nested icon info type used by the enclosing class.

### ImageInfoBox

- Role: Represents image info box within CharWnd.
- Description: Describes the nested image info box type used by the enclosing class.

### LoadingTextBox

- Role: Represents loading text box within CharWnd.
- Description: Describes the nested loading text box type used by the enclosing class.

### RLabel

- Role: Represents rlabel within CharWnd.
- Description: Describes the nested rlabel type used by the enclosing class.

### TabProxy

- Role: Represents tab proxy within CharWnd.
- Description: Describes the nested tab proxy type used by the enclosing class.

## Members

### Constants

#### `public static final RichText.Foundry ifnd = new RichText.Foundry(RichText.IMAGESRC, RichText.ImageSource.legacy,`
- Role: Implements the ifnd operation.
- Description: Implements the foundry operation.
- Value: `new RichText.Foundry(RichText.IMAGESRC, RichText.ImageSource.legacy,`

#### `public static final Text.Furnace catf = new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 25).aa(true), Window.ctex), UI.scale(3), UI.scale(2), new Color(96, 48, 0))`
- Role: Implements the catf operation.
- Description: Implements the color operation.
- Value: `new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 25).aa(true), Window.ctex), UI.scale(3), UI.scale(2), new Color(96, 48, 0))`

#### `public static final Text.Furnace failf = new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 25).aa(true), Resource.loadimg("gfx/hud/fontred")), UI.scale(3), UI.scale(2), new Color(96, 48, 0))`
- Role: Implements the failf operation.
- Description: Implements the color operation.
- Value: `new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 25).aa(true), Resource.loadimg("gfx/hud/fontred")), UI.scale(3), UI.scale(2), new Color(96, 48, 0))`

#### `public static final Text.Foundry attrf = new Text.Foundry(Text.fraktur.deriveFont((float)Math.floor(UI.scale(18.0)))).aa(true)`
- Role: Implements the attrf operation.
- Description: Implements the aa operation.
- Value: `new Text.Foundry(Text.fraktur.deriveFont((float)Math.floor(UI.scale(18.0)))).aa(true)`

#### `public static final PUtils.Convolution iconfilter = new PUtils.Lanczos(3)`
- Role: Implements the iconfilter operation.
- Description: Implements the lanczos operation.
- Value: `new PUtils.Lanczos(3)`

#### `public static final int attrw = BAttrWnd.FoodMeter.frame.sz().x - wbox.bisz().x`
- Role: Implements the attrw operation.
- Description: Implements the bisz operation.
- Value: `BAttrWnd.FoodMeter.frame.sz().x - wbox.bisz().x`

#### `public static final Color debuff = new Color(255, 128, 128)`
- Role: Implements the debuff operation.
- Description: Implements the color operation.
- Value: `new Color(255, 128, 128)`

#### `public static final Color buff = new Color(128, 255, 128)`
- Role: Implements the buff operation.
- Description: Implements the color operation.
- Value: `new Color(128, 255, 128)`

#### `public static final Color tbuff = new Color(128, 128, 255)`
- Role: Implements the tbuff operation.
- Description: Implements the color operation.
- Value: `new Color(128, 128, 255)`

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`
- Role: Implements the every operation.
- Description: Implements the color operation.
- Value: `new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`
- Role: Implements the every operation.
- Description: Implements the color operation.
- Value: `new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`

#### `public static final int width = UI.scale(255)`
- Role: Implements the width operation.
- Description: Implements the scale operation.
- Value: `UI.scale(255)`

#### `public static final int height = UI.scale(260)`
- Role: Implements the height operation.
- Description: Implements the scale operation.
- Value: `UI.scale(260)`

#### `private static final OwnerContext.ClassResolver<AttrWdg> ctxr = new OwnerContext.ClassResolver<AttrWdg>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<attr wdg> ctxr = new owner context.class resolver<attr wdg>() operation.
- Value: `new OwnerContext.ClassResolver<AttrWdg>()`

### Fields

#### `public BAttrWnd battr`
- Role: Caches the battr value.
- Description: Caches the `battr` value for reuse.

#### `public SAttrWnd sattr`
- Role: Caches the sattr value.
- Description: Caches the `sattr` value for reuse.

#### `public SkillWnd skill`
- Role: Caches the skill value.
- Description: Caches the `skill` value for reuse.

#### `public FightWnd fight`
- Role: Caches the fight value.
- Description: Caches the `fight` value for reuse.

#### `public WoundWnd wound`
- Role: Caches the wound value.
- Description: Caches the `wound` value for reuse.

#### `public QuestWnd quest`
- Role: Caches the quest value.
- Description: Caches the `quest` value for reuse.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Caches the questtab value.
- Description: Caches the `questtab` value for reuse.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Caches the questtab value.
- Description: Caches the `questtab` value for reuse.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Caches the questtab value.
- Description: Caches the `questtab` value for reuse.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Caches the questtab value.
- Description: Caches the `questtab` value for reuse.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Caches the questtab value.
- Description: Caches the `questtab` value for reuse.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Caches the questtab value.
- Description: Caches the `questtab` value for reuse.

#### `public int exp, enc`
- Role: Caches the enc value.
- Description: Caches the `enc` value for reuse.

#### `public int exp, enc`
- Role: Caches the enc value.
- Description: Caches the `enc` value for reuse.

#### `public final Class<? extends Widget> tcl`
- Role: Caches the tcl value.
- Description: Caches the `tcl` value for reuse.

#### `public final String id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private Widget tab = null`
- Role: Caches the tab value.
- Description: Caches the `tab` value for reuse.

#### `private final Supplier<V> val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `private final Function<V, String> fmt`
- Role: Caches the fmt value.
- Description: Caches the `fmt` value for reuse.

#### `private final Function<V, Color> col`
- Role: Caches the col value.
- Description: Caches the `col` value for reuse.

#### `private Coord oc`
- Role: Caches the oc value.
- Description: Caches the `oc` value for reuse.

#### `private Color lc`
- Role: Caches the lc value.
- Description: Caches the `lc` value for reuse.

#### `private V lv`
- Role: Caches the lv value.
- Description: Caches the `lv` value for reuse.

#### `private Tex img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `private Indir<Tex> loading`
- Role: Tracks whether  is currently loading.
- Description: Tracks whether  is currently loading.

#### `private final Scrollbar sb`
- Role: Caches the sb value.
- Description: Caches the `sb` value for reuse.

#### `public final String nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `public final Glob.CAttr attr`
- Role: Caches the attr value.
- Description: Caches the `attr` value for reuse.

#### `private ItemInfo.Raw rinfo = null`
- Role: Caches the rinfo value.
- Description: Caches the `rinfo` value for reuse.

#### `private List<ItemInfo> binfo = null`
- Role: Caches the binfo value.
- Description: Caches the `binfo` value for reuse.

#### `private List<ItemInfo> tipinfo`
- Role: Caches the tipinfo value.
- Description: Caches the `tipinfo` value for reuse.

#### `private Tex tipimg = null`
- Role: Caches the tipimg value.
- Description: Caches the `tipimg` value for reuse.

### Methods

#### `public TabProxy(Class<? extends Widget> tcl, String id)`
- Role: Handles the tab proxy path.
- Description: Implements the tab proxy operation.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public <T> T getchild(Class<T> cl)`
- Role: Handles the getchild path.
- Description: Returns the child.

#### `private RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col, V ival)`
- Role: Handles the rlabel path.
- Description: Implements the r label operation.

#### `public RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col)`
- Role: Handles the rlabel path.
- Description: Implements the r label operation.

#### `public RLabel(Supplier<V> val, Function<V, String> fmt, Color col)`
- Role: Handles the rlabel path.
- Description: Implements the r label operation.

#### `private void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `protected void attached()`
- Role: Handles the attached path.
- Description: Implements the attached operation.

#### `public void settext(String text)`
- Role: Handles the settext path.
- Description: Updates the text.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public static RichText.ImageSource resimg(Resource res)`
- Role: Handles the resimg path.
- Description: Implements the resimg operation.

#### `public static RichText.Document resdoc(Resource res, String text)`
- Role: Handles the resdoc path.
- Description: Implements the resdoc operation.

#### `public LoadingTextBox(Coord sz, String text, RichText.Foundry fnd)`
- Role: Handles the loading text box path.
- Description: Implements the loading text box operation.

#### `public LoadingTextBox(Coord sz, String text, Object... attrs)`
- Role: Handles the loading text box path.
- Description: Implements the loading text box operation.

#### `public ImageInfoBox(Coord sz)`
- Role: Handles the image info box path.
- Description: Implements the image info box operation.

#### `public void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `public Coord marg()`
- Role: Handles the marg path.
- Description: Implements the marg operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the CharWnd content.

#### `public void set(Tex img)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void set(Indir<Tex> loading)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void draw(BufferedImage img, Graphics g)`
- Role: Draws the current content.
- Description: Draws the CharWnd content.

#### `public static BufferedImage render(BufferedImage base, List<ItemInfo> info)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public AttrWdg(Coord sz, Glob glob, String attr)`
- Role: Handles the attr widget path.
- Description: Implements the attr wdg operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static <T extends Widget> T settip(T wdg, String resnm)`
- Role: Handles the settip path.
- Description: Updates the tip.

#### `public CharWnd(Glob glob)`
- Role: Creates a new CharWnd instance.
- Description: Constructs the CharWnd instance from the supplied inputs.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.