# Makewindow

This file documents the responsibilities and members of `Makewindow`.

## Meta

- Source: [Makewindow.java](../../../src/haven/Makewindow.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the crafting/make window.

## Nested Types

### $_

- Description: TODO

### Input

- Description: TODO

### Optional

- Description: TODO

### Spec

- Description: TODO

### SpecTip

- Description: TODO

### SpecWidget

- Description: TODO

## Members

### Constants

#### `public static final Text qmodl = Text.render("Quality:")`

- Description: TODO

#### `public static final Text tooll = Text.render("Tools:")`

- Description: TODO

#### `public static final Coord boff = UI.scale(new Coord(7, 9))`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<Makewindow> ctxr = new OwnerContext.ClassResolver<Makewindow>()`

- Description: TODO

#### `public static final KeyBinding kb_make = KeyBinding.get("make/one", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, 0))`

- Description: TODO

#### `public static final KeyBinding kb_makeall = KeyBinding.get("make/all", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, KeyMatch.C))`

- Description: TODO

#### `public static final Coord qmodsz = UI.scale(20, 20)`

- Description: TODO

#### `private static final Map<Indir<Resource>, Tex> qmicons = new WeakHashMap<>()`

- Description: TODO

#### `public static final Text text = RichText.render("$i`

- Description: TODO

### Fields

#### `public String rcpnm`

- Description: TODO

#### `public List<Input> inputs = Collections.emptyList()`

- Description: TODO

#### `public List<SpecWidget> outputs = Collections.emptyList()`

- Description: TODO

#### `public List<Indir<Resource>> qmod = Collections.emptyList()`

- Description: TODO

#### `public List<Indir<Resource>> tools = new ArrayList<>();`

- Description: TODO

#### `private final int xoff = UI.scale(45), qmy = UI.scale(38), outy = UI.scale(65)`

- Description: TODO

#### `private final int xoff = UI.scale(45), qmy = UI.scale(38), outy = UI.scale(65)`

- Description: TODO

#### `private final int xoff = UI.scale(45), qmy = UI.scale(38), outy = UI.scale(65)`

- Description: TODO

#### `public Indir<Resource> res`

- Description: TODO

#### `public MessageBuf sdt`

- Description: TODO

#### `public int num`

- Description: TODO

#### `private GSprite spr`

- Description: TODO

#### `private Object[] rawinfo`

- Description: TODO

#### `private List<ItemInfo> info`

- Description: TODO

#### `private int opt = 0`

- Description: TODO

#### `private final List<ItemInfo> info`

- Description: TODO

#### `private final TexI tex`

- Description: TODO

#### `private Random rnd = null`

- Description: TODO

#### `public final Spec spec`

- Description: TODO

#### `public final boolean opt`

- Description: TODO

#### `public Tex num`

- Description: TODO

#### `public final ItemInfo.AttrCache<Pipe.Op> rstate = new ItemInfo.AttrCache<>(this::info, GItem.RStateInfo.combine)`

- Description: TODO

#### `private double hoverstart`

- Description: TODO

#### `Object stip, ltip`

- Description: TODO

#### `Object stip, ltip`

- Description: TODO

#### `public final int idx`

- Description: TODO

#### `public int using = 0`

- Description: TODO

#### `private List<MenuGrid.Pagina> rpag = null`

- Description: TODO

#### `private Coord cc = null`

- Description: TODO

#### `private int qmx, toolx`

- Description: TODO

#### `private int qmx, toolx`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Spec(Indir<Resource> res, Message sdt, int num, Object[] info)`

- Description: TODO

#### `public GSprite sprite()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean opt()`

- Description: TODO

#### `public SpecTip(List<ItemInfo> info, BufferedImage img)`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public Tex get()`

- Description: TODO

#### `public SpecTip shorttip()`

- Description: TODO

#### `public SpecTip longtip()`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public Resource resource()`

- Description: TODO

#### `public Makewindow(String rcpnm)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `private static Tex qmicon(Indir<Resource> qm)`

- Description: TODO

#### `public SpecWidget(Spec spec)`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public void drawbg(GOut g)`

- Description: TODO

#### `public void drawicon(GOut g)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public Input(Spec spec, int idx)`

- Description: TODO

#### `public void drawbg(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void recipes(List<MenuGrid.Pagina> pag)`

- Description: TODO

#### `public void using(int a)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public Object tooltip(Coord mc, Widget prev)`

- Description: TODO

#### `public Optional(Owner owner)`

- Description: TODO

#### `public BufferedImage tipimg()`

- Description: TODO

#### `public Tip shortvar()`

- Description: TODO
