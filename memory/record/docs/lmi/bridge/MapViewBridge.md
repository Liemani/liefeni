---
source: [MapView.java](../../../../src/haven/MapView.java)
created: 2026-06-13
updated: 2026-06-14
---

# MapViewBridge

Adapts Haven `MapView` state and callbacks into LMI bridge helpers.

## Members

### Constants

#### `private static final Map<String, Class<? extends Camera>> camtypes = new HashMap<String, Class<? extends Camera>>()`
- Role: Defines the shared camtypes constant.
- Description: Shared constant used by the rest of the class.

#### `private static final float maxang = (float)(Math.PI / 2 - 0.1)`
- Role: Defines the shared maxang constant.
- Description: Shared constant used by the rest of the class.

#### `private static final float mindist = 50.0f`
- Role: Defines the shared mindist constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Material gridmat = new Material(new BaseColor(255, 255, 255, 48), States.maskdepth, new MapMesh.OLOrder(null),`
- Role: Defines the shared gridmat constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform amblight_idx = new Uniform(Type.INT, p ->`
- Role: Defines the shared amblight idx constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pipe.Op clickbasic = Pipe.Op.compose(new States.Depthtest(States.Depthtest.Test.LE),`
- Role: Defines the shared clickbasic constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int MAXID = 0xffffff`
- Role: Defines the shared maxid constant.
- Description: Shared constant used by the rest of the class.

#### `static final int idx_bas = 0, idx_idp = 1, idx_back = 2`
- Role: Defines the shared idx bas constant.
- Description: Shared constant used by the rest of the class.

#### `static final int idx_bas = 0, idx_idp = 1, idx_back = 2`
- Role: Defines the shared idx bas constant.
- Description: Shared constant used by the rest of the class.

#### `static final int idx_bas = 0, idx_idp = 1, idx_back = 2`
- Role: Defines the shared idx bas constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Text.Furnace polownertf = new PUtils.BlurFurn(new Text.Foundry(Text.serif, 30).aa(true), 3, 1, Color.BLACK)`
- Role: Defines the shared polownertf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_grid = KeyBinding.get("grid", KeyMatch.forchar('G', KeyMatch.C))`
- Role: Defines the shared kb grid constant.
- Description: Shared constant used by the rest of the class.

#### `public static final OverlayInfo selol = new OverlayInfo()`
- Role: Defines the shared selol constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public static boolean clickdb = false`
- Role: Tracks the clickdb flag.
- Description: Supports the clickdb operation used by the surrounding class.

#### `public long plgob = -1`
- Role: Stores the plgob value.
- Description: Backs the cached state for this file.

#### `public Coord2d cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `private final Glob glob`
- Role: Stores the glob value.
- Description: Backs the cached state for this file.

#### `private int view = 2`
- Role: Stores the view value.
- Description: Backs the cached state for this file.

#### `private Collection<Delayed> delayed = new LinkedList<Delayed>()`
- Role: Caches delayed entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Collection<Delayed> delayed2 = new LinkedList<Delayed>()`
- Role: Caches delayed2 entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Camera camera = restorecam()`
- Role: Holds the camera state.
- Description: Backs the cached state for this file.

#### `private Loader.Future<Plob> placing = null`
- Role: Holds the placing state.
- Description: Backs the cached state for this file.

#### `private Grabber grab`
- Role: Holds the grab state.
- Description: Backs the cached state for this file.

#### `private Selector selection`
- Role: Holds the selection state.
- Description: Backs the cached state for this file.

#### `private Coord3f camoff = new Coord3f(Coord3f.o)`
- Role: Stores the camoff value.
- Description: Backs the cached state for this file.

#### `public double shake = 0.0`
- Role: Stores the shake value.
- Description: Backs the cached state for this file.

#### `public static double plobpgran = Utils.getprefd("plobpgran", 8)`
- Role: Stores the plobpgran value.
- Description: Backs the cached state for this file.

#### `public static double plobagran = Utils.getprefd("plobagran", 12)`
- Role: Stores the plobagran value.
- Description: Backs the cached state for this file.

#### `protected haven.render.Camera view = new haven.render.Camera(Matrix4f.identity())`
- Role: Holds the view state.
- Description: Backs the cached state for this file.

#### `protected Projection proj = new Projection(Matrix4f.identity())`
- Role: Holds the proj state.
- Description: Backs the cached state for this file.

#### `private final float fr = 0.0f, h = 10.0f`
- Role: Stores the fr value.
- Description: Backs the cached state for this file.

#### `private final float fr = 0.0f, h = 10.0f`
- Role: Stores the fr value.
- Description: Backs the cached state for this file.

#### `private float ca, cd`
- Role: Stores the cd value.
- Description: Backs the cached state for this file.

#### `private float ca, cd`
- Role: Stores the cd value.
- Description: Backs the cached state for this file.

#### `private Coord3f curc = null`
- Role: Stores the curc value.
- Description: Backs the cached state for this file.

#### `private float elev, telev`
- Role: Stores the telev value.
- Description: Backs the cached state for this file.

#### `private float elev, telev`
- Role: Stores the telev value.
- Description: Backs the cached state for this file.

#### `private float angl, tangl`
- Role: Stores the tangl value.
- Description: Backs the cached state for this file.

#### `private float angl, tangl`
- Role: Stores the tangl value.
- Description: Backs the cached state for this file.

#### `private Coord dragorig = null`
- Role: Stores the dragorig value.
- Description: Backs the cached state for this file.

#### `private float anglorig`
- Role: Stores the anglorig value.
- Description: Backs the cached state for this file.

#### `private double f0 = 0.2, f1 = 0.5, f2 = 0.9`
- Role: Stores the f0 value.
- Description: Backs the cached state for this file.

#### `private double f0 = 0.2, f1 = 0.5, f2 = 0.9`
- Role: Stores the f0 value.
- Description: Backs the cached state for this file.

#### `private double f0 = 0.2, f1 = 0.5, f2 = 0.9`
- Role: Stores the f0 value.
- Description: Backs the cached state for this file.

#### `private double fl = Math.sqrt(2)`
- Role: Stores the fl value.
- Description: Backs the cached state for this file.

#### `private double fa = ((fl * (f1 - f0)) - (f2 - f0)) / (fl - 2)`
- Role: Stores the fa value.
- Description: Backs the cached state for this file.

#### `private double fb = ((f2 - f0) - (2 * (f1 - f0))) / (fl - 2)`
- Role: Stores the fb value.
- Description: Backs the cached state for this file.

#### `private float dist = 50.0f`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

#### `private float elev = (float)Math.PI / 4.0f`
- Role: Stores the elev value.
- Description: Backs the cached state for this file.

#### `private float angl = 0.0f`
- Role: Stores the angl value.
- Description: Backs the cached state for this file.

#### `private Coord dragorig = null`
- Role: Stores the dragorig value.
- Description: Backs the cached state for this file.

#### `private float elevorig, anglorig`
- Role: Stores the anglorig value.
- Description: Backs the cached state for this file.

#### `private float elevorig, anglorig`
- Role: Stores the anglorig value.
- Description: Backs the cached state for this file.

#### `private float dist = 50.0f, tdist = dist`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

#### `private float dist = 50.0f, tdist = dist`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

#### `private float elev = (float)Math.PI / 4.0f, telev = elev`
- Role: Stores the elev value.
- Description: Backs the cached state for this file.

#### `private float elev = (float)Math.PI / 4.0f, telev = elev`
- Role: Stores the elev value.
- Description: Backs the cached state for this file.

#### `private float angl = 0.0f, tangl = angl`
- Role: Stores the angl value.
- Description: Backs the cached state for this file.

#### `private float angl = 0.0f, tangl = angl`
- Role: Stores the angl value.
- Description: Backs the cached state for this file.

#### `private Coord dragorig = null`
- Role: Stores the dragorig value.
- Description: Backs the cached state for this file.

#### `private float elevorig, anglorig`
- Role: Stores the anglorig value.
- Description: Backs the cached state for this file.

#### `private float elevorig, anglorig`
- Role: Stores the anglorig value.
- Description: Backs the cached state for this file.

#### `private final float pi2 = (float)(Math.PI * 2)`
- Role: Stores the pi2 value.
- Description: Backs the cached state for this file.

#### `private Coord3f cc = null`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `public boolean exact = true`
- Role: Tracks the exact flag.
- Description: Supports the exact operation used by the surrounding class.

#### `protected float dfield = (float)(100 * Math.sqrt(2))`
- Role: Stores the dfield value.
- Description: Backs the cached state for this file.

#### `protected float dist = 500.0f`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

#### `protected float elev = (float)Math.PI / 6.0f`
- Role: Stores the elev value.
- Description: Backs the cached state for this file.

#### `protected float angl = -(float)Math.PI / 4.0f`
- Role: Stores the angl value.
- Description: Backs the cached state for this file.

#### `protected float field = dfield`
- Role: Stores the field value.
- Description: Backs the cached state for this file.

#### `private Coord dragorig = null`
- Role: Stores the dragorig value.
- Description: Backs the cached state for this file.

#### `private float anglorig`
- Role: Stores the anglorig value.
- Description: Backs the cached state for this file.

#### `protected Coord3f cc, jc`
- Role: Stores the jc value.
- Description: Backs the cached state for this file.

#### `protected Coord3f cc, jc`
- Role: Stores the jc value.
- Description: Backs the cached state for this file.

#### `public static KeyBinding kb_camleft = KeyBinding.get("cam-left", KeyMatch.forcode(KeyEvent.VK_LEFT, 0))`
- Role: Holds the kb camleft state.
- Description: Backs the cached state for this file.

#### `public static KeyBinding kb_camright = KeyBinding.get("cam-right", KeyMatch.forcode(KeyEvent.VK_RIGHT, 0))`
- Role: Holds the kb camright state.
- Description: Backs the cached state for this file.

#### `public static KeyBinding kb_camin = KeyBinding.get("cam-in", KeyMatch.forcode(KeyEvent.VK_UP, 0))`
- Role: Holds the kb camin state.
- Description: Backs the cached state for this file.

#### `public static KeyBinding kb_camout = KeyBinding.get("cam-out", KeyMatch.forcode(KeyEvent.VK_DOWN, 0))`
- Role: Holds the kb camout state.
- Description: Backs the cached state for this file.

#### `public static KeyBinding kb_camreset = KeyBinding.get("cam-reset", KeyMatch.forcode(KeyEvent.VK_HOME, 0))`
- Role: Holds the kb camreset state.
- Description: Backs the cached state for this file.

#### `private Coord dragorig = null`
- Role: Stores the dragorig value.
- Description: Backs the cached state for this file.

#### `private float anglorig`
- Role: Stores the anglorig value.
- Description: Backs the cached state for this file.

#### `private float tangl = angl`
- Role: Stores the tangl value.
- Description: Backs the cached state for this file.

#### `private float tfield = field`
- Role: Stores the tfield value.
- Description: Backs the cached state for this file.

#### `private boolean isometric = true`
- Role: Tracks the isometric flag.
- Description: Supports the isometric operation used by the surrounding class.

#### `private final float pi2 = (float)(Math.PI * 2)`
- Role: Stores the pi2 value.
- Description: Backs the cached state for this file.

#### `private double tf = 1.0`
- Role: Stores the tf value.
- Description: Backs the cached state for this file.

#### `private final Gobs gobs`
- Role: Stores the gobs value.
- Description: Backs the cached state for this file.

#### `final OCache oc = glob.oc`
- Role: Caches oc entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Map<Gob, Loader.Future<?>> adding = new HashMap<>()`
- Role: Caches adding entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Map<Gob, RenderTree.Slot> current = new HashMap<>()`
- Role: Caches current entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `RenderTree.Slot slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

#### `final MCache map = glob.map`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Area area`
- Role: Holds the area state.
- Description: Backs the cached state for this file.

#### `Loading lastload = new Loading("Initializing map...")`
- Role: Holds the lastload state.
- Description: Backs the cached state for this file.

#### `final Map<Coord, Pair<T, RenderTree.Slot>> cuts = new HashMap<>()`
- Role: Caches cuts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final boolean position`
- Role: Tracks the position flag.
- Description: Supports the position operation used by the surrounding class.

#### `Loading lastload = new Loading("Initializing map...")`
- Role: Holds the lastload state.
- Description: Backs the cached state for this file.

#### `public final Terrain terrain`
- Role: Holds the terrain state.
- Description: Backs the cached state for this file.

#### `final Grid main = new Grid<MapMesh>()`
- Role: Stores the main value.
- Description: Backs the cached state for this file.

#### `final Grid flavobjs = new Grid<RenderTree.Node>(false)`
- Role: Stores the flavobjs value.
- Description: Backs the cached state for this file.

#### `final OverlayInfo id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `int rc = 0`
- Role: Stores the rc value.
- Description: Backs the cached state for this file.

#### `boolean used`
- Role: Tracks the used flag.
- Description: Supports the used operation used by the surrounding class.

#### `final Grid base = new Grid<RenderTree.Node>()`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `final Grid outl = new Grid<RenderTree.Node>()`
- Role: Stores the outl value.
- Description: Backs the cached state for this file.

#### `private final Map<String, Integer> oltags = new HashMap<>()`
- Role: Caches oltags entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<OverlayInfo, Overlay> ols = new HashMap<>()`
- Role: Caches ols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Grid grid = new Grid<RenderTree.Node>()`
- Role: Stores the grid value.
- Description: Backs the cached state for this file.

#### `GridLines gridlines = null`
- Role: Stores the gridlines value.
- Description: Backs the cached state for this file.

#### `final MapMesh cut`
- Role: Holds the cut state.
- Description: Backs the cached state for this file.

#### `private final ClickMap clickmap`
- Role: Caches clickmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Grid grid = new Grid<MapMesh>()`
- Role: Stores the grid value.
- Description: Backs the cached state for this file.

#### `private Coord3f smapcc = null`
- Role: Stores the smapcc value.
- Description: Backs the cached state for this file.

#### `private ShadowMap.ShadowList slist = null`
- Role: Caches slist entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private ShadowMap smap = null`
- Role: Caches smap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private double lsmch = 0`
- Role: Stores the lsmch value.
- Description: Backs the cached state for this file.

#### `public DirLight amblight = null`
- Role: Holds the amblight state.
- Description: Backs the cached state for this file.

#### `private RenderTree.Slot s_amblight = null`
- Role: Holds the s amblight state.
- Description: Backs the cached state for this file.

#### `public final GSettings gprefs`
- Role: Holds the gprefs state.
- Description: Backs the cached state for this file.

#### `private final Lighting.LightGrid zgrid`
- Role: Stores the zgrid value.
- Description: Backs the cached state for this file.

#### `private final int maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private LightCompiler lighting`
- Role: Holds the lighting state.
- Description: Backs the cached state for this file.

#### `private final Map<RenderTree.Node, RenderTree.Slot> rweather = new HashMap<>()`
- Role: Caches rweather entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final RenderList.Adapter master`
- Role: Caches master entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final boolean doinst`
- Role: Tracks the doinst flag.
- Description: Supports the doinst operation used by the surrounding class.

#### `private final ProxyPipe basic = new ProxyPipe()`
- Role: Holds the basic state.
- Description: Backs the cached state for this file.

#### `private final Map<Slot<? extends Rendered>, Clickslot> slots = new HashMap<>()`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Integer, Clickslot> idmap = new HashMap<>()`
- Role: Caches idmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private DefPipe curbasic = null`
- Role: Holds the curbasic state.
- Description: Backs the cached state for this file.

#### `private RenderList<Rendered> back`
- Role: Caches back entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private DrawList draw`
- Role: Caches draw entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private InstanceList instancer`
- Role: Caches instancer entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int nextid = 1`
- Role: Stores the nextid value.
- Description: Backs the cached state for this file.

#### `public final Slot<? extends Rendered> bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `final Pipe idp`
- Role: Holds the idp state.
- Description: Backs the cached state for this file.

#### `private GroupPipe state`
- Role: Holds the state state.
- Description: Backs the cached state for this file.

#### `final GroupPipe back`
- Role: Holds the back state.
- Description: Backs the cached state for this file.

#### `private final RenderTree clmaptree = new RenderTree()`
- Role: Holds the clmaptree state.
- Description: Backs the cached state for this file.

#### `private final Clicklist clmaplist = new Clicklist(clmaptree, false)`
- Role: Holds the clmaplist state.
- Description: Backs the cached state for this file.

#### `private final Clicklist clobjlist = new Clicklist(tree, true)`
- Role: Holds the clobjlist state.
- Description: Backs the cached state for this file.

#### `private FragID<Texture.Image<Texture2D>> clickid`
- Role: Stores the clickid value.
- Description: Backs the cached state for this file.

#### `private ClickLocation<Texture.Image<Texture2D>> clickloc`
- Role: Stores the clickloc value.
- Description: Backs the cached state for this file.

#### `private DepthBuffer<Texture.Image<Texture2D>> clickdepth`
- Role: Stores the clickdepth value.
- Description: Backs the cached state for this file.

#### `private Pipe.Op curclickbasic`
- Role: Holds the curclickbasic state.
- Description: Backs the cached state for this file.

#### `private static int gobclfuzz = 3`
- Role: Stores the gobclfuzz value.
- Description: Backs the cached state for this file.

#### `Text text; double tm`
- Role: Stores the tm value.
- Description: Backs the cached state for this file.

#### `Text text; double tm`
- Role: Stores the tm value.
- Description: Backs the cached state for this file.

#### `private final Map<Integer, PolText> polowners = new HashMap<Integer, PolText>()`
- Role: Caches polowners entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Loading camload = null, lastload = null`
- Role: Holds the camload state.
- Description: Backs the cached state for this file.

#### `private Loading camload = null, lastload = null`
- Role: Holds the camload state.
- Description: Backs the cached state for this file.

#### `private double initload = -2`
- Role: Stores the initload value.
- Description: Backs the cached state for this file.

#### `private boolean initdraw = false`
- Role: Tracks the initdraw flag.
- Description: Supports the initdraw operation used by the surrounding class.

#### `boolean freerot = false`
- Role: Tracks the freerot flag.
- Description: Supports the freerot operation used by the surrounding class.

#### `public PlobAdjust adjust = new StdPlace()`
- Role: Holds the adjust state.
- Description: Backs the cached state for this file.

#### `Coord lastmc = null`
- Role: Stores the lastmc value.
- Description: Backs the cached state for this file.

#### `RenderTree.Slot slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

#### `int modflags`
- Role: Stores the modflags value.
- Description: Backs the cached state for this file.

#### `private Collection<String> olflash = null`
- Role: Caches olflash entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private double olftimer`
- Role: Stores the olftimer value.
- Description: Backs the cached state for this file.

#### `private final Coord pc`
- Role: Stores the pc value.
- Description: Backs the cached state for this file.

#### `private final Coord pc`
- Role: Stores the pc value.
- Description: Backs the cached state for this file.

#### `private Coord2d mapcl`
- Role: Stores the mapcl value.
- Description: Backs the cached state for this file.

#### `private ClickData objcl`
- Role: Holds the objcl state.
- Description: Backs the cached state for this file.

#### `private int dfl = 0`
- Role: Stores the dfl value.
- Description: Backs the cached state for this file.

#### `int clickb`
- Role: Stores the clickb value.
- Description: Backs the cached state for this file.

#### `private UI.Grab camdrag = null`
- Role: Stores the camdrag value.
- Description: Backs the cached state for this file.

#### `private final Grabber bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public boolean mv = false`
- Role: Tracks the mv flag.
- Description: Supports the mv operation used by the surrounding class.

#### `public final Coord max`
- Role: Stores the max value.
- Description: Backs the cached state for this file.

#### `public Coord sc`
- Role: Stores the sc value.
- Description: Backs the cached state for this file.

#### `public int modflags`
- Role: Stores the modflags value.
- Description: Backs the cached state for this file.

#### `private MCache.RectOverlay ol`
- Role: Caches ol entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private UI.Grab mgrab`
- Role: Stores the mgrab value.
- Description: Backs the cached state for this file.

#### `private Text tt`
- Role: Stores the tt value.
- Description: Backs the cached state for this file.

#### `final GrabXL xl = new GrabXL(this)`
- Role: Holds the xl state.
- Description: Backs the cached state for this file.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Caches cmdmap entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public void run(GOut g)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `boolean mmousedown(Coord mc, int button)`
- Role: Performs mmousedown.
- Description: Supports the mmousedown operation used by the surrounding class.

#### `boolean mmouseup(Coord mc, int button)`
- Role: Performs mmouseup.
- Description: Supports the mmouseup operation used by the surrounding class.

#### `boolean mmousewheel(Coord mc, int amount)`
- Role: Performs mmousewheel.
- Description: Supports the mmousewheel operation used by the surrounding class.

#### `void mmousemove(Coord mc)`
- Role: Performs mmousemove.
- Description: Supports the mmousemove operation used by the surrounding class.

#### `public Camera()`
- Role: Performs camera.
- Description: Supports the camera operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public boolean click(Coord sc)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public void drag(Coord sc)`
- Role: Performs drag.
- Description: Supports the drag operation used by the surrounding class.

#### `public void release()`
- Role: Performs release.
- Description: Supports the release operation used by the surrounding class.

#### `public boolean wheel(MouseWheelEvent ev)`
- Role: Performs wheel.
- Description: Supports the wheel operation used by the surrounding class.

#### `public void resized()`
- Role: Performs resized.
- Description: Supports the resized operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public abstract float angle()`
- Role: Performs angle.
- Description: Supports the angle operation used by the surrounding class.

#### `public abstract void tick(double dt)`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.

#### `public FollowCam()`
- Role: Performs follow cam.
- Description: Supports the follow cam operation used by the surrounding class.

#### `public void resized()`
- Role: Performs resized.
- Description: Supports the resized operation used by the surrounding class.

#### `public boolean click(Coord c)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public void drag(Coord c)`
- Role: Performs drag.
- Description: Supports the drag operation used by the surrounding class.

#### `private float field(float elev)`
- Role: Performs field.
- Description: Supports the field operation used by the surrounding class.

#### `private float dist(float elev)`
- Role: Performs dist.
- Description: Supports the dist operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public float angle()`
- Role: Performs angle.
- Description: Supports the angle operation used by the surrounding class.

#### `public boolean wheel(MouseWheelEvent ev)`
- Role: Performs wheel.
- Description: Supports the wheel operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public float angle()`
- Role: Performs angle.
- Description: Supports the angle operation used by the surrounding class.

#### `public boolean click(Coord c)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public void drag(Coord c)`
- Role: Performs drag.
- Description: Supports the drag operation used by the surrounding class.

#### `public boolean wheel(MouseWheelEvent ev)`
- Role: Performs wheel.
- Description: Supports the wheel operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public float angle()`
- Role: Performs angle.
- Description: Supports the angle operation used by the surrounding class.

#### `public boolean click(Coord c)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public void drag(Coord c)`
- Role: Performs drag.
- Description: Supports the drag operation used by the surrounding class.

#### `public boolean wheel(MouseWheelEvent ev)`
- Role: Performs wheel.
- Description: Supports the wheel operation used by the surrounding class.

#### `public void tick2(double dt)`
- Role: Advances the tick2 over time.
- Description: Supports the tick2 operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public float angle()`
- Role: Performs angle.
- Description: Supports the angle operation used by the surrounding class.

#### `public boolean click(Coord c)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public void drag(Coord c)`
- Role: Performs drag.
- Description: Supports the drag operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.

#### `public SOrthoCam(String... args)`
- Role: Performs sortho cam.
- Description: Supports the sortho cam operation used by the surrounding class.

#### `public void tick2(double dt)`
- Role: Advances the tick2 over time.
- Description: Supports the tick2 operation used by the surrounding class.

#### `public boolean click(Coord c)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public void drag(Coord c)`
- Role: Performs drag.
- Description: Supports the drag operation used by the surrounding class.

#### `public void release()`
- Role: Performs release.
- Description: Supports the release operation used by the surrounding class.

#### `private void chfield(float nf)`
- Role: Performs chfield.
- Description: Supports the chfield operation used by the surrounding class.

#### `public boolean wheel(MouseWheelEvent ev)`
- Role: Performs wheel.
- Description: Supports the wheel operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public MapView(Coord sz, Glob glob, Coord2d cc, long plgob)`
- Role: Performs map view.
- Description: Supports the map view operation used by the surrounding class.

#### `protected void envdispose()`
- Role: Performs envdispose.
- Description: Supports the envdispose operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public boolean visol(String tag)`
- Role: Performs visol.
- Description: Supports the visol operation used by the surrounding class.

#### `public void enol(String tag)`
- Role: Performs enol.
- Description: Supports the enol operation used by the surrounding class.

#### `public void disol(String tag)`
- Role: Performs disol.
- Description: Supports the disol operation used by the surrounding class.

#### `private void addgob(Gob ob)`
- Role: Performs addgob.
- Description: Supports the addgob operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public void added(Gob ob)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(Gob ob)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public Loading loading()`
- Role: Coordinates loading persistence or lookup.
- Description: Supports the loading operation used by the surrounding class.

#### `Grid(boolean position)`
- Role: Handles the grid workflow.
- Description: Supports the grid operation used by the surrounding class.

#### `Grid()`
- Role: Handles the grid workflow.
- Description: Supports the grid operation used by the surrounding class.

#### `abstract T getcut(Coord cc)`
- Role: Performs getcut.
- Description: Supports the getcut operation used by the surrounding class.

#### `RenderTree.Node produce(T cut)`
- Role: Performs produce.
- Description: Supports the produce operation used by the surrounding class.

#### `void tick()`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `void tick()`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public Loading loading()`
- Role: Coordinates loading persistence or lookup.
- Description: Supports the loading operation used by the surrounding class.

#### `private Terrain()`
- Role: Performs terrain.
- Description: Supports the terrain operation used by the surrounding class.

#### `void tick()`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public Loading loading()`
- Role: Coordinates loading persistence or lookup.
- Description: Supports the loading operation used by the surrounding class.

#### `private Overlay(OverlayInfo id)`
- Role: Performs overlay.
- Description: Supports the overlay operation used by the surrounding class.

#### `void tick()`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public Loading loading()`
- Role: Coordinates loading persistence or lookup.
- Description: Supports the loading operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `private void oltick()`
- Role: Performs oltick.
- Description: Supports the oltick operation used by the surrounding class.

#### `private GridLines()`
- Role: Performs grid lines.
- Description: Supports the grid lines operation used by the surrounding class.

#### `void tick()`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void showgrid(boolean show)`
- Role: Performs showgrid.
- Description: Supports the showgrid operation used by the surrounding class.

#### `MapClick(MapMesh cut)`
- Role: Handles the map click workflow.
- Description: Supports the map click operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `void tick()`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public Loading loading()`
- Role: Coordinates loading persistence or lookup.
- Description: Supports the loading operation used by the surrounding class.

#### `public String camstats()`
- Role: Performs camstats.
- Description: Supports the camstats operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.

#### `private void updsmap(DirLight light)`
- Role: Performs updsmap.
- Description: Supports the updsmap operation used by the surrounding class.

#### `private void drawsmap(Render out)`
- Role: Renders the drawsmap.
- Description: Supports the drawsmap operation used by the surrounding class.

#### `private void amblight()`
- Role: Performs amblight.
- Description: Supports the amblight operation used by the surrounding class.

#### `public LightCompiler(GSettings gprefs)`
- Role: Performs light compiler.
- Description: Supports the light compiler operation used by the surrounding class.

#### `public boolean valid(GSettings prefs)`
- Role: Performs valid.
- Description: Supports the valid operation used by the surrounding class.

#### `public Pipe.Op compile(Object[][] params, Projection proj)`
- Role: Performs compile.
- Description: Supports the compile operation used by the surrounding class.

#### `protected void lights()`
- Role: Performs lights.
- Description: Supports the lights operation used by the surrounding class.

#### `private void updweather()`
- Role: Performs updweather.
- Description: Supports the updweather operation used by the surrounding class.

#### `public RenderTree.Slot drawadd(RenderTree.Node extra)`
- Role: Renders the drawadd.
- Description: Supports the drawadd operation used by the surrounding class.

#### `public Gob player()`
- Role: Performs player.
- Description: Supports the player operation used by the surrounding class.

#### `public Coord3f getcc()`
- Role: Performs getcc.
- Description: Supports the getcc operation used by the surrounding class.

#### `public Clickslot(Slot<? extends Rendered> bk, int id)`
- Role: Performs clickslot.
- Description: Supports the clickslot operation used by the surrounding class.

#### `public Rendered obj()`
- Role: Performs obj.
- Description: Supports the obj operation used by the surrounding class.

#### `public GroupPipe state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `IDState(GroupPipe back)`
- Role: Handles the idstate workflow.
- Description: Supports the idstate operation used by the surrounding class.

#### `public Pipe group(int idx)`
- Role: Performs group.
- Description: Supports the group operation used by the surrounding class.

#### `public int gstate(int id)`
- Role: Performs gstate.
- Description: Supports the gstate operation used by the surrounding class.

#### `public int nstates()`
- Role: Performs nstates.
- Description: Supports the nstates operation used by the surrounding class.

#### `public Clicklist(RenderList.Adapter master, boolean doinst)`
- Role: Performs clicklist.
- Description: Supports the clicklist operation used by the surrounding class.

#### `public void add(Slot<? extends Rendered> slot)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Slot<? extends Rendered> slot)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void update(Slot<? extends Rendered> slot)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void update(Pipe group, int[] statemask)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Locked lock()`
- Role: Performs lock.
- Description: Supports the lock operation used by the surrounding class.

#### `public Iterable<? extends Slot<?>> slots()`
- Role: Performs slots.
- Description: Supports the slots operation used by the surrounding class.

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(RenderList<?> list)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void basic(Pipe.Op st)`
- Role: Performs basic.
- Description: Supports the basic operation used by the surrounding class.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public void draw(Render out)`
- Role: Renders the draw.
- Description: Supports the draw operation used by the surrounding class.

#### `public void get(Render out, Coord c, Consumer<ClickData> cb)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void fuzzyget(Render out, Coord c, int rad, Consumer<ClickData> cb)`
- Role: Performs fuzzyget.
- Description: Supports the fuzzyget operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.

#### `private Pipe.Op clickbasic(Coord sz)`
- Role: Performs clickbasic.
- Description: Supports the clickbasic operation used by the surrounding class.

#### `private void checkmapclick(Render out, Pipe.Op basic, Coord c, Consumer<Coord2d> cb)`
- Role: Performs checkmapclick.
- Description: Supports the checkmapclick operation used by the surrounding class.

#### `private void checkgobclick(Render out, Pipe.Op basic, Coord c, Consumer<ClickData> cb)`
- Role: Performs checkgobclick.
- Description: Supports the checkgobclick operation used by the surrounding class.

#### `public void delay(Delayed d)`
- Role: Performs delay.
- Description: Supports the delay operation used by the surrounding class.

#### `public void delay2(Delayed d)`
- Role: Performs delay2.
- Description: Supports the delay2 operation used by the surrounding class.

#### `protected void undelay(Collection<Delayed> list, GOut g)`
- Role: Performs undelay.
- Description: Supports the undelay operation used by the surrounding class.

#### `PolText(Text text, double tm)`
- Role: Handles the pol text workflow.
- Description: Supports the pol text operation used by the surrounding class.

#### `public void setpoltext(int id, String text)`
- Role: Performs setpoltext.
- Description: Supports the setpoltext operation used by the surrounding class.

#### `private void poldraw(GOut g)`
- Role: Performs poldraw.
- Description: Supports the poldraw operation used by the surrounding class.

#### `private void drawarrow(GOut g, double a)`
- Role: Renders the drawarrow.
- Description: Supports the drawarrow operation used by the surrounding class.

#### `public HomoCoord4f clipxf(Coord3f mc, boolean doclip)`
- Role: Performs clipxf.
- Description: Supports the clipxf operation used by the surrounding class.

#### `public Coord3f screenxf(Coord3f mc)`
- Role: Performs screenxf.
- Description: Supports the screenxf operation used by the surrounding class.

#### `public Coord3f screenxf(Coord2d mc)`
- Role: Performs screenxf.
- Description: Supports the screenxf operation used by the surrounding class.

#### `public double screenangle(Coord2d mc, boolean clip)`
- Role: Performs screenangle.
- Description: Supports the screenangle operation used by the surrounding class.

#### `private void partydraw(GOut g)`
- Role: Performs partydraw.
- Description: Supports the partydraw operation used by the surrounding class.

#### `protected void maindraw(Render out)`
- Role: Performs maindraw.
- Description: Supports the maindraw operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Renders the draw.
- Description: Supports the draw operation used by the surrounding class.

#### `private void checkload()`
- Role: Performs checkload.
- Description: Supports the checkload operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the tick over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void adjust(Plob plob, Coord pc, Coord2d mc, int modflags)`
- Role: Performs adjust.
- Description: Supports the adjust operation used by the surrounding class.

#### `public default boolean rotate(Plob plob, MouseWheelEvent data, int modflags)`
- Role: Performs rotate.
- Description: Supports the rotate operation used by the surrounding class.

#### `@Deprecated public default boolean rotate(Plob plob, int amount, int modflags)`
- Role: Performs rotate.
- Description: Supports the rotate operation used by the surrounding class.

#### `public void adjust(Plob plob, Coord pc, Coord2d mc, int modflags)`
- Role: Performs adjust.
- Description: Supports the adjust operation used by the surrounding class.

#### `public boolean rotate(Plob plob, MouseWheelEvent data, int modflags)`
- Role: Performs rotate.
- Description: Supports the rotate operation used by the surrounding class.

#### `private Plob(Indir<Resource> res, Message sdt)`
- Role: Performs plob.
- Description: Supports the plob operation used by the surrounding class.

#### `public MapView mv()`
- Role: Performs mv.
- Description: Supports the mv operation used by the surrounding class.

#### `public void move(Coord2d c, double a)`
- Role: Performs move.
- Description: Supports the move operation used by the surrounding class.

#### `public void move(Coord2d c)`
- Role: Performs move.
- Description: Supports the move operation used by the surrounding class.

#### `public void move(double a)`
- Role: Performs move.
- Description: Supports the move operation used by the surrounding class.

#### `void place()`
- Role: Performs place.
- Description: Supports the place operation used by the surrounding class.

#### `Adjust(Coord c, int modflags)`
- Role: Handles the adjust workflow.
- Description: Supports the adjust operation used by the surrounding class.

#### `public void hit(Coord pc, Coord2d mc)`
- Role: Performs hit.
- Description: Supports the hit operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private void unflashol()`
- Role: Performs unflashol.
- Description: Supports the unflashol operation used by the surrounding class.

#### `private void flashol(Collection<String> ols, double tm)`
- Role: Performs flashol.
- Description: Supports the flashol operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public Maptest(Coord c)`
- Role: Performs maptest.
- Description: Supports the maptest operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `protected abstract void hit(Coord pc, Coord2d mc)`
- Role: Performs hit.
- Description: Supports the hit operation used by the surrounding class.

#### `protected void nohit(Coord pc)`
- Role: Performs nohit.
- Description: Supports the nohit operation used by the surrounding class.

#### `public Hittest(Coord c)`
- Role: Performs hittest.
- Description: Supports the hittest operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void ckdone(int fl)`
- Role: Performs ckdone.
- Description: Supports the ckdone operation used by the surrounding class.

#### `protected abstract void hit(Coord pc, Coord2d mc, ClickData inf)`
- Role: Performs hit.
- Description: Supports the hit operation used by the surrounding class.

#### `protected void nohit(Coord pc)`
- Role: Performs nohit.
- Description: Supports the nohit operation used by the surrounding class.

#### `private Click(Coord c, int b)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `protected void hit(Coord pc, Coord2d mc, ClickData inf)`
- Role: Performs hit.
- Description: Supports the hit operation used by the surrounding class.

#### `public void grab(Grabber grab)`
- Role: Performs grab.
- Description: Supports the grab operation used by the surrounding class.

#### `public void release(Grabber grab)`
- Role: Performs release.
- Description: Supports the release operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public boolean drop(final Coord cc, Coord ul)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public GrabXL(Grabber bk)`
- Role: Performs grab xl.
- Description: Supports the grab xl operation used by the surrounding class.

#### `public boolean mmousedown(Coord cc, final int button)`
- Role: Performs mmousedown.
- Description: Supports the mmousedown operation used by the surrounding class.

#### `public boolean mmouseup(Coord cc, final int button)`
- Role: Performs mmouseup.
- Description: Supports the mmouseup operation used by the surrounding class.

#### `public boolean mmousewheel(Coord cc, final int amount)`
- Role: Performs mmousewheel.
- Description: Supports the mmousewheel operation used by the surrounding class.

#### `public void mmousemove(Coord cc)`
- Role: Performs mmousemove.
- Description: Supports the mmousemove operation used by the surrounding class.

#### `public Selector(Coord max)`
- Role: Performs selector.
- Description: Supports the selector operation used by the surrounding class.

#### `public boolean mmousedown(Coord mc, int button)`
- Role: Performs mmousedown.
- Description: Supports the mmousedown operation used by the surrounding class.

#### `public Coord getec(Coord mc)`
- Role: Performs getec.
- Description: Supports the getec operation used by the surrounding class.

#### `public boolean mmouseup(Coord mc, int button)`
- Role: Performs mmouseup.
- Description: Supports the mmouseup operation used by the surrounding class.

#### `public boolean mmousewheel(Coord mc, int amount)`
- Role: Performs mmousewheel.
- Description: Supports the mmousewheel operation used by the surrounding class.

#### `public void mmousemove(Coord mc)`
- Role: Performs mmousemove.
- Description: Supports the mmousemove operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `private Camera makecam(Class<? extends Camera> ct, String... args)`
- Role: Creates the avatar camera.
- Description: Constructs the avatar camera from the supplied inputs.

#### `private Camera restorecam()`
- Role: Performs restorecam.
- Description: Supports the restorecam operation used by the surrounding class.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.

#### `public void newSelector()`
- Role: Performs new selector.
- Description: Supports the new selector operation used by the surrounding class.

#### `public void destroySelector()`
- Role: Performs destroy selector.
- Description: Supports the destroy selector operation used by the surrounding class.

#### `public boolean isPlanningObject()`
- Role: Checks whether the planning object.
- Description: Returns a boolean result for the described condition.

#### `public void waitPlanObject() throws InterruptedException`
- Role: Handles the wait plan object workflow.
- Description: Supports the wait plan object operation used by the surrounding class.
