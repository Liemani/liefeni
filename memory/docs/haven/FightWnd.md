# FightWnd

This file documents the responsibilities and members of `FightWnd`.

## Meta

- Source: [FightWnd.java](../../../src/haven/FightWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the fight window.

## Nested Types

### $_

- Description: TODO

### Action

- Description: TODO

### Actions

- Description: TODO

### BView

- Description: TODO

### Item

- Description: TODO

### Savelist

- Description: TODO

## Members

### Constants

#### `private static final OwnerContext.ClassResolver<FightWnd> actxr = new OwnerContext.ClassResolver<FightWnd>()`

- Description: TODO

#### `public static final Text.Foundry namef = new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true)`

- Description: TODO

#### `public static final String[] keys =`

- Description: TODO

### Fields

#### `public final int nsave`

- Description: TODO

#### `public int maxact`

- Description: TODO

#### `public final Actions actlist`

- Description: TODO

#### `public final Savelist savelist`

- Description: TODO

#### `public List<Action> acts = new ArrayList<Action>()`

- Description: TODO

#### `public final Action[] order`

- Description: TODO

#### `public int usesave`

- Description: TODO

#### `private final Text[] saves`

- Description: TODO

#### `private final ImageInfoBox info`

- Description: TODO

#### `private final Label count`

- Description: TODO

#### `private final Map<Indir<Resource>, Object[]> actrawinfo = new HashMap<>()`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `private final int id`

- Description: TODO

#### `public int a, u`

- Description: TODO

#### `public int a, u`

- Description: TODO

#### `private String name`

- Description: TODO

#### `private List<ItemInfo> info = null`

- Description: TODO

#### `private Tex icon = null`

- Description: TODO

#### `private boolean loading = false`

- Description: TODO

#### `private Action drag = null`

- Description: TODO

#### `private UI.Grab grab`

- Description: TODO

#### `public final Action item`

- Description: TODO

#### `private final Label use`

- Description: TODO

#### `private int u = -1, a = -1`

- Description: TODO

#### `private int u = -1, a = -1`

- Description: TODO

#### `private UI.Grab grab`

- Description: TODO

#### `private Coord dp`

- Description: TODO

#### `private UI.Grab grab`

- Description: TODO

#### `private Action drag`

- Description: TODO

#### `private Coord dp`

- Description: TODO

#### `private final Coord[] animoff = new Coord[order.length]`

- Description: TODO

#### `private final double[] animpr = new double[order.length]`

- Description: TODO

#### `private boolean anim = false`

- Description: TODO

#### `final Tex[] keys = new Tex[10]`

- Description: TODO

#### `private final List<Integer> items = Utils.range(nsave)`

- Description: TODO

#### `public final int n`

- Description: TODO

#### `private Text.Line redit = null`

- Description: TODO

#### `private ReadLine ed`

- Description: TODO

#### `private double focusstart`

- Description: TODO

#### `private Coord lc = null`

- Description: TODO

#### `private double lt = 0`

- Description: TODO

#### `private Text unused = new Text.Foundry(attrf.font.deriveFont(java.awt.Font.ITALIC)).aa(true).render("Unused save")`

- Description: TODO

### Methods

#### `public Action(Indir<Resource> res, int id, int a, int u)`

- Description: TODO

#### `public String rendertext()`

- Description: TODO

#### `private void a(int a)`

- Description: TODO

#### `private void u(int u)`

- Description: TODO

#### `public Resource resource()`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public BufferedImage rendericon()`

- Description: TODO

#### `public Tex icon()`

- Description: TODO

#### `public BufferedImage renderinfo(int width)`

- Description: TODO

#### `private void recount()`

- Description: TODO

#### `public Actions(Coord sz)`

- Description: TODO

#### `protected List<Action> items()`

- Description: TODO

#### `protected Widget makeitem(Action act, int idx, Coord sz)`

- Description: TODO

#### `public Item(Coord sz, Action act)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public boolean setu(int u)`

- Description: TODO

#### `public boolean drop(Coord cc, Coord ul)`

- Description: TODO

#### `public boolean iteminteract(Coord cc, Coord ul)`

- Description: TODO

#### `public void change(Action act)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void drag(Action act)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public int findorder(Action a)`

- Description: TODO

#### `private BView()`

- Description: TODO

#### `private Coord itemc(int i)`

- Description: TODO

#### `private int citem(Coord c)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `private void animate(int s, Coord off)`

- Description: TODO

#### `public boolean dropthing(Coord c, Object thing)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public Savelist(Coord sz)`

- Description: TODO

#### `protected List<Integer> items()`

- Description: TODO

#### `protected Widget makeitem(Integer n, int idx, Coord sz)`

- Description: TODO

#### `public Item(Coord sz, int n)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void done(ReadLine buf)`

- Description: TODO

#### `public void changed(ReadLine buf)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public void load(int n)`

- Description: TODO

#### `public void save(int n)`

- Description: TODO

#### `public void use(int n)`

- Description: TODO

#### `public FightWnd(int nsave, int nact, int max)`

- Description: TODO

#### `public Action findact(int resid)`

- Description: TODO

#### `public void uimsg(String nm, Object... args)`

- Description: TODO
