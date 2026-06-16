# Makewindow

This file documents the responsibilities and members of `Makewindow`.

## Meta

- Source: [Makewindow.java](../../../src/haven/Makewindow.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the makewindow Haven component.

## Nested Types

### $_

- Role: Represents $ within Makewindow.
- Description: Describes the nested $  type used by the enclosing class.

### Input

- Role: Represents input within Makewindow.
- Description: Describes the nested input type used by the enclosing class.

### Optional

- Role: Represents optional within Makewindow.
- Description: Describes the nested optional type used by the enclosing class.

### Spec

- Role: Represents spec within Makewindow.
- Description: Describes the nested spec type used by the enclosing class.

### SpecTip

- Role: Represents spec tip within Makewindow.
- Description: Describes the nested spec tip type used by the enclosing class.

### SpecWidget

- Role: Represents spec widget within Makewindow.
- Description: Describes the nested spec widget type used by the enclosing class.

## Members

### Constants

#### `public static final Text qmodl = Text.render("Quality:")`
- Role: Defines the shared qmodl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text tooll = Text.render("Tools:")`
- Role: Defines the shared tooll constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord boff = UI.scale(new Coord(7, 9))`
- Role: Defines the shared boff constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<Makewindow> ctxr = new OwnerContext.ClassResolver<Makewindow>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_make = KeyBinding.get("make/one", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, 0))`
- Role: Defines the shared kb make constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_makeall = KeyBinding.get("make/all", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, KeyMatch.C))`
- Role: Defines the shared kb makeall constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord qmodsz = UI.scale(20, 20)`
- Role: Defines the shared qmodsz constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Indir<Resource>, Tex> qmicons = new WeakHashMap<>()`
- Role: Defines the shared qmicons constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text text = RichText.render("$i`
- Role: Defines the shared text constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public String rcpnm`
- Role: Stores the rcpnm value.
- Description: Backs the cached state for this file.

#### `public List<Input> inputs = Collections.emptyList()`
- Role: Caches inputs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<SpecWidget> outputs = Collections.emptyList()`
- Role: Caches outputs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<Indir<Resource>> qmod = Collections.emptyList()`
- Role: Caches qmod entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<Indir<Resource>> tools = new ArrayList<>();`
- Role: Caches tools entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final int xoff = UI.scale(45), qmy = UI.scale(38), outy = UI.scale(65)`
- Role: Stores the xoff value.
- Description: Backs the cached state for this file.

#### `private final int xoff = UI.scale(45), qmy = UI.scale(38), outy = UI.scale(65)`
- Role: Stores the xoff value.
- Description: Backs the cached state for this file.

#### `private final int xoff = UI.scale(45), qmy = UI.scale(38), outy = UI.scale(65)`
- Role: Stores the xoff value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public MessageBuf sdt`
- Role: Holds the sdt state.
- Description: Backs the cached state for this file.

#### `public int num`
- Role: Stores the num value.
- Description: Backs the cached state for this file.

#### `private GSprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `private Object[] rawinfo`
- Role: Holds the rawinfo state.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int opt = 0`
- Role: Stores the opt value.
- Description: Backs the cached state for this file.

#### `private final List<ItemInfo> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final TexI tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `private Random rnd = null`
- Role: Holds the rnd state.
- Description: Backs the cached state for this file.

#### `public final Spec spec`
- Role: Holds the spec state.
- Description: Backs the cached state for this file.

#### `public final boolean opt`
- Role: Tracks the opt flag.
- Description: Supports the opt operation used by the surrounding class.

#### `public Tex num`
- Role: Stores the num value.
- Description: Backs the cached state for this file.

#### `public final ItemInfo.AttrCache<Pipe.Op> rstate = new ItemInfo.AttrCache<>(this::info, GItem.RStateInfo.combine)`
- Role: Caches rstate entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private double hoverstart`
- Role: Stores the hoverstart value.
- Description: Backs the cached state for this file.

#### `Object stip, ltip`
- Role: Holds the ltip state.
- Description: Backs the cached state for this file.

#### `Object stip, ltip`
- Role: Holds the ltip state.
- Description: Backs the cached state for this file.

#### `public final int idx`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `public int using = 0`
- Role: Stores the using value.
- Description: Backs the cached state for this file.

#### `private List<MenuGrid.Pagina> rpag = null`
- Role: Caches rpag entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Coord cc = null`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `private int qmx, toolx`
- Role: Stores the toolx value.
- Description: Backs the cached state for this file.

#### `private int qmx, toolx`
- Role: Stores the toolx value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Spec(Indir<Resource> res, Message sdt, int num, Object[] info)`
- Role: Performs spec.
- Description: Supports the spec operation used by the surrounding class.

#### `public GSprite sprite()`
- Role: Performs sprite.
- Description: Supports the sprite operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean opt()`
- Role: Performs opt.
- Description: Supports the opt operation used by the surrounding class.

#### `public SpecTip(List<ItemInfo> info, BufferedImage img)`
- Role: Performs spec tip.
- Description: Supports the spec tip operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public Tex get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public SpecTip shorttip()`
- Role: Performs shorttip.
- Description: Supports the shorttip operation used by the surrounding class.

#### `public SpecTip longtip()`
- Role: Performs longtip.
- Description: Supports the longtip operation used by the surrounding class.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public Resource resource()`
- Role: Performs resource.
- Description: Supports the resource operation used by the surrounding class.

#### `public Makewindow(String rcpnm)`
- Role: Creates a new Makewindow instance.
- Description: Constructs the instance and initializes its default state.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `private static Tex qmicon(Indir<Resource> qm)`
- Role: Performs qmicon.
- Description: Supports the qmicon operation used by the surrounding class.

#### `public SpecWidget(Spec spec)`
- Role: Performs spec widget.
- Description: Supports the spec widget operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `public void drawicon(GOut g)`
- Role: Performs drawicon.
- Description: Supports the drawicon operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public Input(Spec spec, int idx)`
- Role: Performs input.
- Description: Supports the input operation used by the surrounding class.

#### `public void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void recipes(List<MenuGrid.Pagina> pag)`
- Role: Performs recipes.
- Description: Supports the recipes operation used by the surrounding class.

#### `public void using(int a)`
- Role: Performs using.
- Description: Supports the using operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Object tooltip(Coord mc, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public Optional(Owner owner)`
- Role: Performs optional.
- Description: Supports the optional operation used by the surrounding class.

#### `public BufferedImage tipimg()`
- Role: Performs tipimg.
- Description: Supports the tipimg operation used by the surrounding class.

#### `public Tip shortvar()`
- Role: Performs shortvar.
- Description: Supports the shortvar operation used by the surrounding class.
