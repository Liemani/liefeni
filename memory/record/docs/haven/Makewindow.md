---
source: [Makewindow.java](../../../../src/haven/Makewindow.java)
created: 2026-06-13
updated: 2026-06-14
---

# Makewindow

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
- Role: Implements the qmodl operation.
- Description: Renders the current state into an image or image-like object.
- Value: `Text.render("Quality:")`

#### `public static final Text tooll = Text.render("Tools:")`
- Role: Implements the tooll operation.
- Description: Renders the current state into an image or image-like object.
- Value: `Text.render("Tools:")`

#### `public static final Coord boff = UI.scale(new Coord(7, 9))`
- Role: Implements the boff operation.
- Description: Implements the coord operation.
- Value: `UI.scale(new Coord(7, 9))`

#### `private static final OwnerContext.ClassResolver<Makewindow> ctxr = new OwnerContext.ClassResolver<Makewindow>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<makewindow> ctxr = new owner context.class resolver<makewindow>() operation.
- Value: `new OwnerContext.ClassResolver<Makewindow>()`

#### `public static final KeyBinding kb_make = KeyBinding.get("make/one", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, 0))`
- Role: Implements the kb make operation.
- Description: Implements the forcode operation.
- Value: `KeyBinding.get("make/one", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, 0))`

#### `public static final KeyBinding kb_makeall = KeyBinding.get("make/all", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, KeyMatch.C))`
- Role: Implements the kb makeall operation.
- Description: Implements the forcode operation.
- Value: `KeyBinding.get("make/all", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, KeyMatch.C))`

#### `public static final Coord qmodsz = UI.scale(20, 20)`
- Role: Implements the qmodsz operation.
- Description: Implements the scale operation.
- Value: `UI.scale(20, 20)`

#### `private static final Map<Indir<Resource>, Tex> qmicons = new WeakHashMap<>()`
- Role: Implements the qmicons operation.
- Description: Implements the private static final map<indir<resource>, tex> qmicons = new weak hash map<>() operation.
- Value: `new WeakHashMap<>()`

#### `public static final Text text = RichText.render("$i`
- Role: Implements the text operation.
- Description: Renders the current state into an image or image-like object.
- Value: `RichText.render("$i`

### Fields

#### `public String rcpnm`
- Role: Caches the rcpnm value.
- Description: Caches the `rcpnm` value for reuse.

#### `public List<Input> inputs = Collections.emptyList()`
- Role: Implements the inputs operation.
- Description: Implements the empty list operation.

#### `public List<SpecWidget> outputs = Collections.emptyList()`
- Role: Implements the outputs operation.
- Description: Implements the empty list operation.

#### `public List<Indir<Resource>> qmod = Collections.emptyList()`
- Role: Implements the qmod operation.
- Description: Implements the empty list operation.

#### `public List<Indir<Resource>> tools = new ArrayList<>();`
- Role: Implements the tools operation.
- Description: Implements the public list<indir<resource>> tools = new array list<>(); operation.

#### `private final int xoff = UI.scale(45), qmy = UI.scale(38), outy = UI.scale(65)`
- Role: Implements the xoff operation.
- Description: Implements the scale operation.

#### `private final int xoff = UI.scale(45), qmy = UI.scale(38), outy = UI.scale(65)`
- Role: Implements the xoff operation.
- Description: Implements the scale operation.

#### `private final int xoff = UI.scale(45), qmy = UI.scale(38), outy = UI.scale(65)`
- Role: Implements the xoff operation.
- Description: Implements the scale operation.

#### `public Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public MessageBuf sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

#### `public int num`
- Role: Caches the num value.
- Description: Caches the `num` value for reuse.

#### `private GSprite spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `private Object[] rawinfo`
- Role: Caches the rawinfo value.
- Description: Caches the `rawinfo` value for reuse.

#### `private List<ItemInfo> info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `private int opt = 0`
- Role: Caches the opt value.
- Description: Caches the `opt` value for reuse.

#### `private final List<ItemInfo> info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `private final TexI tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `private Random rnd = null`
- Role: Caches the rnd value.
- Description: Caches the `rnd` value for reuse.

#### `public final Spec spec`
- Role: Caches the spec value.
- Description: Caches the `spec` value for reuse.

#### `public final boolean opt`
- Role: Tracks the opt flag.
- Description: Caches the `opt` value for reuse.

#### `public Tex num`
- Role: Caches the num value.
- Description: Caches the `num` value for reuse.

#### `public final ItemInfo.AttrCache<Pipe.Op> rstate = new ItemInfo.AttrCache<>(this::info, GItem.RStateInfo.combine)`
- Role: Implements the rstate operation.
- Description: Implements the public final item info.attr cache<pipe.op> rstate = new item info.attr cache<>(this::info, g item.r state info.combine) operation.

#### `private double hoverstart`
- Role: Caches the hoverstart value.
- Description: Caches the `hoverstart` value for reuse.

#### `Object stip, ltip`
- Role: Caches the ltip value.
- Description: Caches the `ltip` value for reuse.

#### `Object stip, ltip`
- Role: Caches the ltip value.
- Description: Caches the `ltip` value for reuse.

#### `public final int idx`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `public int using = 0`
- Role: Caches the using value.
- Description: Caches the `using` value for reuse.

#### `private List<MenuGrid.Pagina> rpag = null`
- Role: Caches the rpag value.
- Description: Caches the `rpag` value for reuse.

#### `private Coord cc = null`
- Role: Caches the cc value.
- Description: Caches the `cc` value for reuse.

#### `private int qmx, toolx`
- Role: Caches the toolx value.
- Description: Caches the `toolx` value for reuse.

#### `private int qmx, toolx`
- Role: Caches the toolx value.
- Description: Caches the `toolx` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Spec(Indir<Resource> res, Message sdt, int num, Object[] info)`
- Role: Handles the spec path.
- Description: Implements the spec operation.

#### `public GSprite sprite()`
- Role: Handles the sprite path.
- Description: Implements the sprite operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Makewindow content.

#### `public boolean opt()`
- Role: Handles the opt path.
- Description: Implements the opt operation.

#### `public SpecTip(List<ItemInfo> info, BufferedImage img)`
- Role: Handles the spec tip path.
- Description: Implements the spec tip operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public Tex get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public SpecTip shorttip()`
- Role: Handles the shorttip path.
- Description: Implements the shorttip operation.

#### `public SpecTip longtip()`
- Role: Handles the longtip path.
- Description: Implements the longtip operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public Resource resource()`
- Role: Handles the resource path.
- Description: Implements the resource operation.

#### `public Makewindow(String rcpnm)`
- Role: Creates a new Makewindow instance.
- Description: Constructs the Makewindow instance from the supplied inputs.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `private static Tex qmicon(Indir<Resource> qm)`
- Role: Handles the qmicon path.
- Description: Implements the qmicon operation.

#### `public SpecWidget(Spec spec)`
- Role: Handles the spec widget path.
- Description: Implements the spec widget operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `public void drawicon(GOut g)`
- Role: Handles the drawicon path.
- Description: Draws the icon.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Makewindow content.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public Input(Spec spec, int idx)`
- Role: Handles the input path.
- Description: Implements the input operation.

#### `public void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void recipes(List<MenuGrid.Pagina> pag)`
- Role: Handles the recipes path.
- Description: Implements the recipes operation.

#### `public void using(int a)`
- Role: Handles the using path.
- Description: Implements the using operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Makewindow content.

#### `public Object tooltip(Coord mc, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public Optional(Owner owner)`
- Role: Handles the optional path.
- Description: Implements the optional operation.

#### `public BufferedImage tipimg()`
- Role: Handles the tipimg path.
- Description: Implements the tipimg operation.

#### `public Tip shortvar()`
- Role: Handles the shortvar path.
- Description: Implements the shortvar operation.