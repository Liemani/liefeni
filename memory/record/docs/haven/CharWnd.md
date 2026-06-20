---
source: [CharWnd.java](../../../src/haven/CharWnd.java)
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
- Role: Defines the shared ifnd constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Furnace catf = new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 25).aa(true), Window.ctex), UI.scale(3), UI.scale(2), new Color(96, 48, 0))`
- Role: Defines the shared catf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Furnace failf = new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 25).aa(true), Resource.loadimg("gfx/hud/fontred")), UI.scale(3), UI.scale(2), new Color(96, 48, 0))`
- Role: Defines the shared failf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry attrf = new Text.Foundry(Text.fraktur.deriveFont((float)Math.floor(UI.scale(18.0)))).aa(true)`
- Role: Defines the shared attrf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PUtils.Convolution iconfilter = new PUtils.Lanczos(3)`
- Role: Defines the shared iconfilter constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int attrw = BAttrWnd.FoodMeter.frame.sz().x - wbox.bisz().x`
- Role: Defines the shared attrw constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color debuff = new Color(255, 128, 128)`
- Role: Defines the shared debuff constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color buff = new Color(128, 255, 128)`
- Role: Defines the shared buff constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color tbuff = new Color(128, 128, 255)`
- Role: Defines the shared tbuff constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`
- Role: Defines the shared every constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`
- Role: Defines the shared every constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int width = UI.scale(255)`
- Role: Defines the shared width constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int height = UI.scale(260)`
- Role: Defines the shared height constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<AttrWdg> ctxr = new OwnerContext.ClassResolver<AttrWdg>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public BAttrWnd battr`
- Role: Holds the battr state.
- Description: Backs the cached state for this file.

#### `public SAttrWnd sattr`
- Role: Holds the sattr state.
- Description: Backs the cached state for this file.

#### `public SkillWnd skill`
- Role: Holds the skill state.
- Description: Backs the cached state for this file.

#### `public FightWnd fight`
- Role: Holds the fight state.
- Description: Backs the cached state for this file.

#### `public WoundWnd wound`
- Role: Holds the wound state.
- Description: Backs the cached state for this file.

#### `public QuestWnd quest`
- Role: Holds the quest state.
- Description: Backs the cached state for this file.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Holds the questtab state.
- Description: Backs the cached state for this file.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Holds the questtab state.
- Description: Backs the cached state for this file.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Holds the questtab state.
- Description: Backs the cached state for this file.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Holds the questtab state.
- Description: Backs the cached state for this file.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Holds the questtab state.
- Description: Backs the cached state for this file.

#### `public final Tabs.Tab battrtab, sattrtab, skilltab, fighttab, woundtab, questtab`
- Role: Holds the questtab state.
- Description: Backs the cached state for this file.

#### `public int exp, enc`
- Role: Stores the enc value.
- Description: Backs the cached state for this file.

#### `public int exp, enc`
- Role: Stores the enc value.
- Description: Backs the cached state for this file.

#### `public final Class<? extends Widget> tcl`
- Role: Stores the tcl value.
- Description: Backs the cached state for this file.

#### `public final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private Widget tab = null`
- Role: Stores the tab value.
- Description: Backs the cached state for this file.

#### `private final Supplier<V> val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `private final Function<V, String> fmt`
- Role: Stores the fmt value.
- Description: Backs the cached state for this file.

#### `private final Function<V, Color> col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

#### `private Coord oc`
- Role: Stores the oc value.
- Description: Backs the cached state for this file.

#### `private Color lc`
- Role: Stores the lc value.
- Description: Backs the cached state for this file.

#### `private V lv`
- Role: Holds the lv state.
- Description: Backs the cached state for this file.

#### `private Tex img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `private Indir<Tex> loading`
- Role: Stores the loading value.
- Description: Backs the cached state for this file.

#### `private final Scrollbar sb`
- Role: Holds the sb state.
- Description: Backs the cached state for this file.

#### `public final String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public final Glob.CAttr attr`
- Role: Stores the attr value.
- Description: Backs the cached state for this file.

#### `private ItemInfo.Raw rinfo = null`
- Role: Holds the rinfo state.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> binfo = null`
- Role: Caches binfo entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<ItemInfo> tipinfo`
- Role: Caches tipinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Tex tipimg = null`
- Role: Stores the tipimg value.
- Description: Backs the cached state for this file.

### Methods

#### `public TabProxy(Class<? extends Widget> tcl, String id)`
- Role: Performs tab proxy.
- Description: Supports the tab proxy operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public <T> T getchild(Class<T> cl)`
- Role: Performs getchild.
- Description: Supports the getchild operation used by the surrounding class.

#### `private RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col, V ival)`
- Role: Performs rlabel.
- Description: Supports the rlabel operation used by the surrounding class.

#### `public RLabel(Supplier<V> val, Function<V, String> fmt, Function<V, Color> col)`
- Role: Performs rlabel.
- Description: Supports the rlabel operation used by the surrounding class.

#### `public RLabel(Supplier<V> val, Function<V, String> fmt, Color col)`
- Role: Performs rlabel.
- Description: Supports the rlabel operation used by the surrounding class.

#### `private void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `protected void attached()`
- Role: Performs attached.
- Description: Supports the attached operation used by the surrounding class.

#### `public void settext(String text)`
- Role: Performs settext.
- Description: Supports the settext operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public static RichText.ImageSource resimg(Resource res)`
- Role: Performs resimg.
- Description: Supports the resimg operation used by the surrounding class.

#### `public static RichText.Document resdoc(Resource res, String text)`
- Role: Performs resdoc.
- Description: Supports the resdoc operation used by the surrounding class.

#### `public LoadingTextBox(Coord sz, String text, RichText.Foundry fnd)`
- Role: Performs loading text box.
- Description: Supports the loading text box operation used by the surrounding class.

#### `public LoadingTextBox(Coord sz, String text, Object... attrs)`
- Role: Performs loading text box.
- Description: Supports the loading text box operation used by the surrounding class.

#### `public ImageInfoBox(Coord sz)`
- Role: Performs image info box.
- Description: Supports the image info box operation used by the surrounding class.

#### `public void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `public Coord marg()`
- Role: Performs marg.
- Description: Supports the marg operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void set(Tex img)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void set(Indir<Tex> loading)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void draw(BufferedImage img, Graphics g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public static BufferedImage render(BufferedImage base, List<ItemInfo> info)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public AttrWdg(Coord sz, Glob glob, String attr)`
- Role: Performs attr wdg.
- Description: Supports the attr wdg operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static <T extends Widget> T settip(T wdg, String resnm)`
- Role: Performs settip.
- Description: Supports the settip operation used by the surrounding class.

#### `public CharWnd(Glob glob)`
- Role: Creates a new CharWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
