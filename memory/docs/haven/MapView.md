# MapView

This file documents the responsibilities and members of `MapView`.

## Meta

- Source: [MapView.java](../../../src/haven/MapView.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the main in-world map view.

## Nested Types

### $_

- Description: TODO

### Adjust

- Description: TODO

### Camera

- Description: TODO

### Click

- Description: TODO

### ClickMap

- Description: TODO

### Clicklist

- Description: TODO

### Clickslot

- Description: TODO

### Delayed

- Description: TODO

### FollowCam

- Description: TODO

### FreeCam

- Description: TODO

### Gobs

- Description: TODO

### GrabXL

- Description: TODO

### Grabber

- Description: TODO

### Grid

- Description: TODO

### GridLines

- Description: TODO

### Hittest

- Description: TODO

### IDState

- Description: TODO

### LightCompiler

- Description: TODO

### MapClick

- Description: TODO

### MapRaster

- Description: TODO

### Maptest

- Description: TODO

### OrthoCam

- Description: TODO

### Overlay

- Description: TODO

### Plob

- Description: TODO

### PlobAdjust

- Description: TODO

### PolText

- Description: TODO

### SOrthoCam

- Description: TODO

### Selector

- Description: TODO

### SimpleCam

- Description: TODO

### StdPlace

- Description: TODO

### Terrain

- Description: TODO

## Members

### Constants

#### `private static final Map<String, Class<? extends Camera>> camtypes = new HashMap<String, Class<? extends Camera>>()`

- Description: TODO

#### `private static final float maxang = (float)(Math.PI / 2 - 0.1)`

- Description: TODO

#### `private static final float mindist = 50.0f`

- Description: TODO

#### `private static final Material gridmat = new Material(new BaseColor(255, 255, 255, 48), States.maskdepth, new MapMesh.OLOrder(null),`

- Description: TODO

#### `public static final Uniform amblight_idx = new Uniform(Type.INT, p ->`

- Description: TODO

#### `public static final Pipe.Op clickbasic = Pipe.Op.compose(new States.Depthtest(States.Depthtest.Test.LE),`

- Description: TODO

#### `private static final int MAXID = 0xffffff`

- Description: TODO

#### `static final int idx_bas = 0, idx_idp = 1, idx_back = 2`

- Description: TODO

#### `static final int idx_bas = 0, idx_idp = 1, idx_back = 2`

- Description: TODO

#### `static final int idx_bas = 0, idx_idp = 1, idx_back = 2`

- Description: TODO

#### `private static final Text.Furnace polownertf = new PUtils.BlurFurn(new Text.Foundry(Text.serif, 30).aa(true), 3, 1, Color.BLACK)`

- Description: TODO

#### `public static final KeyBinding kb_grid = KeyBinding.get("grid", KeyMatch.forchar('G', KeyMatch.C))`

- Description: TODO

#### `public static final OverlayInfo selol = new OverlayInfo()`

- Description: TODO

### Fields

#### `public static boolean clickdb = false`

- Description: TODO

#### `public long plgob = -1`

- Description: TODO

#### `public Coord2d cc`

- Description: TODO

#### `private final Glob glob`

- Description: TODO

#### `private int view = 2`

- Description: TODO

#### `private Collection<Delayed> delayed = new LinkedList<Delayed>()`

- Description: TODO

#### `private Collection<Delayed> delayed2 = new LinkedList<Delayed>()`

- Description: TODO

#### `public Camera camera = restorecam()`

- Description: TODO

#### `private Loader.Future<Plob> placing = null`

- Description: TODO

#### `private Grabber grab`

- Description: TODO

#### `private Selector selection`

- Description: TODO

#### `private Coord3f camoff = new Coord3f(Coord3f.o)`

- Description: TODO

#### `public double shake = 0.0`

- Description: TODO

#### `public static double plobpgran = Utils.getprefd("plobpgran", 8)`

- Description: TODO

#### `public static double plobagran = Utils.getprefd("plobagran", 12)`

- Description: TODO

#### `protected haven.render.Camera view = new haven.render.Camera(Matrix4f.identity())`

- Description: TODO

#### `protected Projection proj = new Projection(Matrix4f.identity())`

- Description: TODO

#### `private final float fr = 0.0f, h = 10.0f`

- Description: TODO

#### `private final float fr = 0.0f, h = 10.0f`

- Description: TODO

#### `private float ca, cd`

- Description: TODO

#### `private float ca, cd`

- Description: TODO

#### `private Coord3f curc = null`

- Description: TODO

#### `private float elev, telev`

- Description: TODO

#### `private float elev, telev`

- Description: TODO

#### `private float angl, tangl`

- Description: TODO

#### `private float angl, tangl`

- Description: TODO

#### `private Coord dragorig = null`

- Description: TODO

#### `private float anglorig`

- Description: TODO

#### `private double f0 = 0.2, f1 = 0.5, f2 = 0.9`

- Description: TODO

#### `private double f0 = 0.2, f1 = 0.5, f2 = 0.9`

- Description: TODO

#### `private double f0 = 0.2, f1 = 0.5, f2 = 0.9`

- Description: TODO

#### `private double fl = Math.sqrt(2)`

- Description: TODO

#### `private double fa = ((fl * (f1 - f0)) - (f2 - f0)) / (fl - 2)`

- Description: TODO

#### `private double fb = ((f2 - f0) - (2 * (f1 - f0))) / (fl - 2)`

- Description: TODO

#### `private float dist = 50.0f`

- Description: TODO

#### `private float elev = (float)Math.PI / 4.0f`

- Description: TODO

#### `private float angl = 0.0f`

- Description: TODO

#### `private Coord dragorig = null`

- Description: TODO

#### `private float elevorig, anglorig`

- Description: TODO

#### `private float elevorig, anglorig`

- Description: TODO

#### `private float dist = 50.0f, tdist = dist`

- Description: TODO

#### `private float dist = 50.0f, tdist = dist`

- Description: TODO

#### `private float elev = (float)Math.PI / 4.0f, telev = elev`

- Description: TODO

#### `private float elev = (float)Math.PI / 4.0f, telev = elev`

- Description: TODO

#### `private float angl = 0.0f, tangl = angl`

- Description: TODO

#### `private float angl = 0.0f, tangl = angl`

- Description: TODO

#### `private Coord dragorig = null`

- Description: TODO

#### `private float elevorig, anglorig`

- Description: TODO

#### `private float elevorig, anglorig`

- Description: TODO

#### `private final float pi2 = (float)(Math.PI * 2)`

- Description: TODO

#### `private Coord3f cc = null`

- Description: TODO

#### `public boolean exact = true`

- Description: TODO

#### `protected float dfield = (float)(100 * Math.sqrt(2))`

- Description: TODO

#### `protected float dist = 500.0f`

- Description: TODO

#### `protected float elev = (float)Math.PI / 6.0f`

- Description: TODO

#### `protected float angl = -(float)Math.PI / 4.0f`

- Description: TODO

#### `protected float field = dfield`

- Description: TODO

#### `private Coord dragorig = null`

- Description: TODO

#### `private float anglorig`

- Description: TODO

#### `protected Coord3f cc, jc`

- Description: TODO

#### `protected Coord3f cc, jc`

- Description: TODO

#### `public static KeyBinding kb_camleft = KeyBinding.get("cam-left", KeyMatch.forcode(KeyEvent.VK_LEFT, 0))`

- Description: TODO

#### `public static KeyBinding kb_camright = KeyBinding.get("cam-right", KeyMatch.forcode(KeyEvent.VK_RIGHT, 0))`

- Description: TODO

#### `public static KeyBinding kb_camin = KeyBinding.get("cam-in", KeyMatch.forcode(KeyEvent.VK_UP, 0))`

- Description: TODO

#### `public static KeyBinding kb_camout = KeyBinding.get("cam-out", KeyMatch.forcode(KeyEvent.VK_DOWN, 0))`

- Description: TODO

#### `public static KeyBinding kb_camreset = KeyBinding.get("cam-reset", KeyMatch.forcode(KeyEvent.VK_HOME, 0))`

- Description: TODO

#### `private Coord dragorig = null`

- Description: TODO

#### `private float anglorig`

- Description: TODO

#### `private float tangl = angl`

- Description: TODO

#### `private float tfield = field`

- Description: TODO

#### `private boolean isometric = true`

- Description: TODO

#### `private final float pi2 = (float)(Math.PI * 2)`

- Description: TODO

#### `private double tf = 1.0`

- Description: TODO

#### `private final Gobs gobs`

- Description: TODO

#### `final OCache oc = glob.oc`

- Description: TODO

#### `final Map<Gob, Loader.Future<?>> adding = new HashMap<>()`

- Description: TODO

#### `final Map<Gob, RenderTree.Slot> current = new HashMap<>()`

- Description: TODO

#### `RenderTree.Slot slot`

- Description: TODO

#### `final MCache map = glob.map`

- Description: TODO

#### `Area area`

- Description: TODO

#### `Loading lastload = new Loading("Initializing map...")`

- Description: TODO

#### `final Map<Coord, Pair<T, RenderTree.Slot>> cuts = new HashMap<>()`

- Description: TODO

#### `final boolean position`

- Description: TODO

#### `Loading lastload = new Loading("Initializing map...")`

- Description: TODO

#### `public final Terrain terrain`

- Description: TODO

#### `final Grid main = new Grid<MapMesh>()`

- Description: TODO

#### `final Grid flavobjs = new Grid<RenderTree.Node>(false)`

- Description: TODO

#### `final OverlayInfo id`

- Description: TODO

#### `int rc = 0`

- Description: TODO

#### `boolean used`

- Description: TODO

#### `final Grid base = new Grid<RenderTree.Node>()`

- Description: TODO

#### `final Grid outl = new Grid<RenderTree.Node>()`

- Description: TODO

#### `private final Map<String, Integer> oltags = new HashMap<>()`

- Description: TODO

#### `private final Map<OverlayInfo, Overlay> ols = new HashMap<>()`

- Description: TODO

#### `final Grid grid = new Grid<RenderTree.Node>()`

- Description: TODO

#### `GridLines gridlines = null`

- Description: TODO

#### `final MapMesh cut`

- Description: TODO

#### `private final ClickMap clickmap`

- Description: TODO

#### `final Grid grid = new Grid<MapMesh>()`

- Description: TODO

#### `private Coord3f smapcc = null`

- Description: TODO

#### `private ShadowMap.ShadowList slist = null`

- Description: TODO

#### `private ShadowMap smap = null`

- Description: TODO

#### `private double lsmch = 0`

- Description: TODO

#### `public DirLight amblight = null`

- Description: TODO

#### `private RenderTree.Slot s_amblight = null`

- Description: TODO

#### `public final GSettings gprefs`

- Description: TODO

#### `private final Lighting.LightGrid zgrid`

- Description: TODO

#### `private final int maxlights`

- Description: TODO

#### `private LightCompiler lighting`

- Description: TODO

#### `private final Map<RenderTree.Node, RenderTree.Slot> rweather = new HashMap<>()`

- Description: TODO

#### `private final RenderList.Adapter master`

- Description: TODO

#### `private final boolean doinst`

- Description: TODO

#### `private final ProxyPipe basic = new ProxyPipe()`

- Description: TODO

#### `private final Map<Slot<? extends Rendered>, Clickslot> slots = new HashMap<>()`

- Description: TODO

#### `private final Map<Integer, Clickslot> idmap = new HashMap<>()`

- Description: TODO

#### `private DefPipe curbasic = null`

- Description: TODO

#### `private RenderList<Rendered> back`

- Description: TODO

#### `private DrawList draw`

- Description: TODO

#### `private InstanceList instancer`

- Description: TODO

#### `private int nextid = 1`

- Description: TODO

#### `public final Slot<? extends Rendered> bk`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `final Pipe idp`

- Description: TODO

#### `private GroupPipe state`

- Description: TODO

#### `final GroupPipe back`

- Description: TODO

#### `private final RenderTree clmaptree = new RenderTree()`

- Description: TODO

#### `private final Clicklist clmaplist = new Clicklist(clmaptree, false)`

- Description: TODO

#### `private final Clicklist clobjlist = new Clicklist(tree, true)`

- Description: TODO

#### `private FragID<Texture.Image<Texture2D>> clickid`

- Description: TODO

#### `private ClickLocation<Texture.Image<Texture2D>> clickloc`

- Description: TODO

#### `private DepthBuffer<Texture.Image<Texture2D>> clickdepth`

- Description: TODO

#### `private Pipe.Op curclickbasic`

- Description: TODO

#### `private static int gobclfuzz = 3`

- Description: TODO

#### `Text text; double tm`

- Description: TODO

#### `Text text; double tm`

- Description: TODO

#### `private final Map<Integer, PolText> polowners = new HashMap<Integer, PolText>()`

- Description: TODO

#### `private Loading camload = null, lastload = null`

- Description: TODO

#### `private Loading camload = null, lastload = null`

- Description: TODO

#### `private double initload = -2`

- Description: TODO

#### `private boolean initdraw = false`

- Description: TODO

#### `boolean freerot = false`

- Description: TODO

#### `public PlobAdjust adjust = new StdPlace()`

- Description: TODO

#### `Coord lastmc = null`

- Description: TODO

#### `RenderTree.Slot slot`

- Description: TODO

#### `int modflags`

- Description: TODO

#### `private Collection<String> olflash = null`

- Description: TODO

#### `private double olftimer`

- Description: TODO

#### `private final Coord pc`

- Description: TODO

#### `private final Coord pc`

- Description: TODO

#### `private Coord2d mapcl`

- Description: TODO

#### `private ClickData objcl`

- Description: TODO

#### `private int dfl = 0`

- Description: TODO

#### `int clickb`

- Description: TODO

#### `private UI.Grab camdrag = null`

- Description: TODO

#### `private final Grabber bk`

- Description: TODO

#### `public boolean mv = false`

- Description: TODO

#### `public final Coord max`

- Description: TODO

#### `public Coord sc`

- Description: TODO

#### `public int modflags`

- Description: TODO

#### `private MCache.RectOverlay ol`

- Description: TODO

#### `private UI.Grab mgrab`

- Description: TODO

#### `private Text tt`

- Description: TODO

#### `final GrabXL xl = new GrabXL(this)`

- Description: TODO

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`

- Description: TODO

### Methods

#### `public void run(GOut g)`

- Description: TODO

#### `boolean mmousedown(Coord mc, int button)`

- Description: TODO

#### `boolean mmouseup(Coord mc, int button)`

- Description: TODO

#### `boolean mmousewheel(Coord mc, int amount)`

- Description: TODO

#### `void mmousemove(Coord mc)`

- Description: TODO

#### `public Camera()`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public boolean click(Coord sc)`

- Description: TODO

#### `public void drag(Coord sc)`

- Description: TODO

#### `public void release()`

- Description: TODO

#### `public boolean wheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void resized()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public abstract float angle()`

- Description: TODO

#### `public abstract void tick(double dt)`

- Description: TODO

#### `public String stats()`

- Description: TODO

#### `public FollowCam()`

- Description: TODO

#### `public void resized()`

- Description: TODO

#### `public boolean click(Coord c)`

- Description: TODO

#### `public void drag(Coord c)`

- Description: TODO

#### `private float field(float elev)`

- Description: TODO

#### `private float dist(float elev)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public float angle()`

- Description: TODO

#### `public boolean wheel(MouseWheelEvent ev)`

- Description: TODO

#### `public String stats()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public float angle()`

- Description: TODO

#### `public boolean click(Coord c)`

- Description: TODO

#### `public void drag(Coord c)`

- Description: TODO

#### `public boolean wheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public float angle()`

- Description: TODO

#### `public boolean click(Coord c)`

- Description: TODO

#### `public void drag(Coord c)`

- Description: TODO

#### `public boolean wheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void tick2(double dt)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public float angle()`

- Description: TODO

#### `public boolean click(Coord c)`

- Description: TODO

#### `public void drag(Coord c)`

- Description: TODO

#### `public String stats()`

- Description: TODO

#### `public SOrthoCam(String... args)`

- Description: TODO

#### `public void tick2(double dt)`

- Description: TODO

#### `public boolean click(Coord c)`

- Description: TODO

#### `public void drag(Coord c)`

- Description: TODO

#### `public void release()`

- Description: TODO

#### `private void chfield(float nf)`

- Description: TODO

#### `public boolean wheel(MouseWheelEvent ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public MapView(Coord sz, Glob glob, Coord2d cc, long plgob)`

- Description: TODO

#### `protected void envdispose()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public boolean visol(String tag)`

- Description: TODO

#### `public void enol(String tag)`

- Description: TODO

#### `public void disol(String tag)`

- Description: TODO

#### `private void addgob(Gob ob)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public void added(Gob ob)`

- Description: TODO

#### `public void removed(Gob ob)`

- Description: TODO

#### `public Loading loading()`

- Description: TODO

#### `Grid(boolean position)`

- Description: TODO

#### `Grid()`

- Description: TODO

#### `abstract T getcut(Coord cc)`

- Description: TODO

#### `RenderTree.Node produce(T cut)`

- Description: TODO

#### `void tick()`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `void tick()`

- Description: TODO

#### `public Loading loading()`

- Description: TODO

#### `private Terrain()`

- Description: TODO

#### `void tick()`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public Loading loading()`

- Description: TODO

#### `private Overlay(OverlayInfo id)`

- Description: TODO

#### `void tick()`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public Loading loading()`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `private void oltick()`

- Description: TODO

#### `private GridLines()`

- Description: TODO

#### `void tick()`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `public void showgrid(boolean show)`

- Description: TODO

#### `MapClick(MapMesh cut)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `void tick()`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public Loading loading()`

- Description: TODO

#### `public String camstats()`

- Description: TODO

#### `public String stats()`

- Description: TODO

#### `private void updsmap(DirLight light)`

- Description: TODO

#### `private void drawsmap(Render out)`

- Description: TODO

#### `private void amblight()`

- Description: TODO

#### `public LightCompiler(GSettings gprefs)`

- Description: TODO

#### `public boolean valid(GSettings prefs)`

- Description: TODO

#### `public Pipe.Op compile(Object[][] params, Projection proj)`

- Description: TODO

#### `protected void lights()`

- Description: TODO

#### `private void updweather()`

- Description: TODO

#### `public RenderTree.Slot drawadd(RenderTree.Node extra)`

- Description: TODO

#### `public Gob player()`

- Description: TODO

#### `public Coord3f getcc()`

- Description: TODO

#### `public Clickslot(Slot<? extends Rendered> bk, int id)`

- Description: TODO

#### `public Rendered obj()`

- Description: TODO

#### `public GroupPipe state()`

- Description: TODO

#### `IDState(GroupPipe back)`

- Description: TODO

#### `public Pipe group(int idx)`

- Description: TODO

#### `public int gstate(int id)`

- Description: TODO

#### `public int nstates()`

- Description: TODO

#### `public Clicklist(RenderList.Adapter master, boolean doinst)`

- Description: TODO

#### `public void add(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void remove(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void update(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void update(Pipe group, int[] statemask)`

- Description: TODO

#### `public Locked lock()`

- Description: TODO

#### `public Iterable<? extends Slot<?>> slots()`

- Description: TODO

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`

- Description: TODO

#### `public void remove(RenderList<?> list)`

- Description: TODO

#### `public void basic(Pipe.Op st)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `public void draw(Render out)`

- Description: TODO

#### `public void get(Render out, Coord c, Consumer<ClickData> cb)`

- Description: TODO

#### `public void fuzzyget(Render out, Coord c, int rad, Consumer<ClickData> cb)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public String stats()`

- Description: TODO

#### `private Pipe.Op clickbasic(Coord sz)`

- Description: TODO

#### `private void checkmapclick(Render out, Pipe.Op basic, Coord c, Consumer<Coord2d> cb)`

- Description: TODO

#### `private void checkgobclick(Render out, Pipe.Op basic, Coord c, Consumer<ClickData> cb)`

- Description: TODO

#### `public void delay(Delayed d)`

- Description: TODO

#### `public void delay2(Delayed d)`

- Description: TODO

#### `protected void undelay(Collection<Delayed> list, GOut g)`

- Description: TODO

#### `PolText(Text text, double tm)`

- Description: TODO

#### `public void setpoltext(int id, String text)`

- Description: TODO

#### `private void poldraw(GOut g)`

- Description: TODO

#### `private void drawarrow(GOut g, double a)`

- Description: TODO

#### `public HomoCoord4f clipxf(Coord3f mc, boolean doclip)`

- Description: TODO

#### `public Coord3f screenxf(Coord3f mc)`

- Description: TODO

#### `public Coord3f screenxf(Coord2d mc)`

- Description: TODO

#### `public double screenangle(Coord2d mc, boolean clip)`

- Description: TODO

#### `private void partydraw(GOut g)`

- Description: TODO

#### `protected void maindraw(Render out)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private void checkload()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public void adjust(Plob plob, Coord pc, Coord2d mc, int modflags)`

- Description: TODO

#### `public default boolean rotate(Plob plob, MouseWheelEvent data, int modflags)`

- Description: TODO

#### `@Deprecated public default boolean rotate(Plob plob, int amount, int modflags)`

- Description: TODO

#### `public void adjust(Plob plob, Coord pc, Coord2d mc, int modflags)`

- Description: TODO

#### `public boolean rotate(Plob plob, MouseWheelEvent data, int modflags)`

- Description: TODO

#### `private Plob(Indir<Resource> res, Message sdt)`

- Description: TODO

#### `public MapView mv()`

- Description: TODO

#### `public void move(Coord2d c, double a)`

- Description: TODO

#### `public void move(Coord2d c)`

- Description: TODO

#### `public void move(double a)`

- Description: TODO

#### `void place()`

- Description: TODO

#### `Adjust(Coord c, int modflags)`

- Description: TODO

#### `public void hit(Coord pc, Coord2d mc)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private void unflashol()`

- Description: TODO

#### `private void flashol(Collection<String> ols, double tm)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public Maptest(Coord c)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `protected abstract void hit(Coord pc, Coord2d mc)`

- Description: TODO

#### `protected void nohit(Coord pc)`

- Description: TODO

#### `public Hittest(Coord c)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `private void ckdone(int fl)`

- Description: TODO

#### `protected abstract void hit(Coord pc, Coord2d mc, ClickData inf)`

- Description: TODO

#### `protected void nohit(Coord pc)`

- Description: TODO

#### `private Click(Coord c, int b)`

- Description: TODO

#### `protected void hit(Coord pc, Coord2d mc, ClickData inf)`

- Description: TODO

#### `public void grab(Grabber grab)`

- Description: TODO

#### `public void release(Grabber grab)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public boolean drop(final Coord cc, Coord ul)`

- Description: TODO

#### `public boolean iteminteract(Coord cc, Coord ul)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public GrabXL(Grabber bk)`

- Description: TODO

#### `public boolean mmousedown(Coord cc, final int button)`

- Description: TODO

#### `public boolean mmouseup(Coord cc, final int button)`

- Description: TODO

#### `public boolean mmousewheel(Coord cc, final int amount)`

- Description: TODO

#### `public void mmousemove(Coord cc)`

- Description: TODO

#### `public Selector(Coord max)`

- Description: TODO

#### `public boolean mmousedown(Coord mc, int button)`

- Description: TODO

#### `public Coord getec(Coord mc)`

- Description: TODO

#### `public boolean mmouseup(Coord mc, int button)`

- Description: TODO

#### `public boolean mmousewheel(Coord mc, int amount)`

- Description: TODO

#### `public void mmousemove(Coord mc)`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `private Camera makecam(Class<? extends Camera> ct, String... args)`

- Description: TODO

#### `private Camera restorecam()`

- Description: TODO

#### `public Map<String, Console.Command> findcmds()`

- Description: TODO

#### `public void newSelector()`

- Description: TODO

#### `public void destroySelector()`

- Description: TODO

#### `public boolean isPlanningObject()`

- Description: TODO

#### `public void waitPlanObject() throws InterruptedException`

- Description: TODO
