# MapWnd

This file documents the responsibilities and members of `MapWnd`.

## Meta

- Source: [MapWnd.java](../../../src/haven/MapWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the map window.

## Nested Types

### ExportWindow

- Description: TODO

### FindMark

- Description: TODO

### ImportWindow

- Description: TODO

### Item

- Description: TODO

### ListMarker

- Description: TODO

### MarkButton

- Description: TODO

### MarkerConfig

- Description: TODO

### MarkerList

- Description: TODO

### MarkerObjs

- Description: TODO

### MarkerType

- Description: TODO

### PMarkerType

- Description: TODO

### PlaceMarker

- Description: TODO

### SMarkerType

- Description: TODO

### Toolbox

- Description: TODO

### View

- Description: TODO

### ViewFrame

- Description: TODO

## Members

### Constants

#### `public static final Resource markcurs = Resource.local().loadwait("gfx/hud/curs/flag")`

- Description: TODO

#### `public static final KeyBinding kb_home = KeyBinding.get("mapwnd/home", KeyMatch.forcode(KeyEvent.VK_HOME, 0))`

- Description: TODO

#### `public static final KeyBinding kb_mark = KeyBinding.get("mapwnd/mark", KeyMatch.nil)`

- Description: TODO

#### `public static final KeyBinding kb_hmark = KeyBinding.get("mapwnd/hmark", KeyMatch.forchar('M', KeyMatch.C))`

- Description: TODO

#### `public static final KeyBinding kb_compact = KeyBinding.get("mapwnd/compact", KeyMatch.forchar('A', KeyMatch.M))`

- Description: TODO

#### `public static final KeyBinding kb_prov = KeyBinding.get("mapwnd/prov", KeyMatch.nil)`

- Description: TODO

#### `private static final int btnw = UI.scale(95)`

- Description: TODO

#### `public static final int iconsz = UI.scale(20)`

- Description: TODO

#### `private static final HashedSet<MarkerType> types = new HashedSet<>(Hash.eq)`

- Description: TODO

#### `public static final MarkerConfig showall = new MarkerConfig()`

- Description: TODO

#### `public static final MarkerConfig hideall = new MarkerConfig().showsel(true)`

- Description: TODO

#### `public static final Indir<Resource> flag = Resource.local().load("gfx/hud/mmap/markobj")`

- Description: TODO

### Fields

#### `public final MapFile file`

- Description: TODO

#### `public final MiniMap view`

- Description: TODO

#### `public final MapView mv`

- Description: TODO

#### `public final Toolbox tool`

- Description: TODO

#### `public final Collection<String> overlays = new java.util.concurrent.CopyOnWriteArraySet<>()`

- Description: TODO

#### `public MarkerConfig markcfg = MarkerConfig.showall, cmarkers = null`

- Description: TODO

#### `public MarkerConfig markcfg = MarkerConfig.showall, cmarkers = null`

- Description: TODO

#### `private final Locator player`

- Description: TODO

#### `private final Widget toolbar`

- Description: TODO

#### `private final Frame viewf`

- Description: TODO

#### `private final MarkerObjs mvmarks = new MarkerObjs(this)`

- Description: TODO

#### `private GroupSelector colsel`

- Description: TODO

#### `private CheckBox onmapbtn`

- Description: TODO

#### `private Button mremove`

- Description: TODO

#### `private Predicate<Marker> mflt = pmarkers`

- Description: TODO

#### `private Comparator<ListMarker> mcmp = namecmp`

- Description: TODO

#### `private List<ListMarker> markers = Collections.emptyList()`

- Description: TODO

#### `private int markerseq = -1`

- Description: TODO

#### `private Marker mrefocus = null`

- Description: TODO

#### `private int olalpha = 64`

- Description: TODO

#### `private final Collection<Runnable> deferred = new LinkedList<>()`

- Description: TODO

#### `private final static Predicate<Marker> pmarkers = (m -> m instanceof PMarker)`

- Description: TODO

#### `private final static Predicate<Marker> smarkers = (m -> m instanceof SMarker)`

- Description: TODO

#### `private final static Comparator<ListMarker> namecmp = ((a, b) -> a.mark.nm.compareTo(b.mark.nm))`

- Description: TODO

#### `private final static Comparator<ListMarker> typecmp = Comparator.comparing((ListMarker lm) -> lm.type).thenComparing(namecmp)`

- Description: TODO

#### `Coord sc = Coord.z`

- Description: TODO

#### `private UI.Grab drag`

- Description: TODO

#### `private Coord dragc`

- Description: TODO

#### `public final MarkerList list`

- Description: TODO

#### `private final Frame listf`

- Description: TODO

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`

- Description: TODO

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`

- Description: TODO

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`

- Description: TODO

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`

- Description: TODO

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`

- Description: TODO

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`

- Description: TODO

#### `private TextEntry namesel`

- Description: TODO

#### `private UI.Grab grab = null`

- Description: TODO

#### `public final Color col`

- Description: TODO

#### `private Tex icon = null`

- Description: TODO

#### `private Resource.Saved spec`

- Description: TODO

#### `private Tex icon = null`

- Description: TODO

#### `public Set<MarkerType> sel = Collections.emptySet()`

- Description: TODO

#### `public boolean showsel = false`

- Description: TODO

#### `public final Marker mark`

- Description: TODO

#### `public MarkerType type`

- Description: TODO

#### `public final ListMarker lm`

- Description: TODO

#### `public final MapWnd mm`

- Description: TODO

#### `private final Map<PMarker, Pair<Gob, RenderTree.Slot>> dcurrent = new HashMap<>()`

- Description: TODO

#### `private Collection<PMarker> acurrent = Collections.emptyList()`

- Description: TODO

#### `private Location curloc = null`

- Description: TODO

#### `private boolean loading = true`

- Description: TODO

#### `private Area area = null`

- Description: TODO

#### `private int markerseq = -1`

- Description: TODO

#### `private Thread th`

- Description: TODO

#### `private volatile String prog = "Exporting map..."`

- Description: TODO

#### `private Thread th`

- Description: TODO

#### `private volatile String prog = "Initializing"`

- Description: TODO

#### `private double sprog = -1`

- Description: TODO

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`

- Description: TODO

### Methods

#### `public MapWnd(MapFile file, MapView mv, Coord sz, String title)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `public void toggleol(String tag, boolean a)`

- Description: TODO

#### `ViewFrame()`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `private Toolbox()`

- Description: TODO

#### `public void resize(int h)`

- Description: TODO

#### `View(MapFile file)`

- Description: TODO

#### `public void drawgrid(GOut g, Coord ul, DisplayGrid disp)`

- Description: TODO

#### `public boolean filter(DisplayMarker mark)`

- Description: TODO

#### `public boolean clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`

- Description: TODO

#### `public boolean clickicon(DisplayIcon icon, Location loc, int button, boolean press)`

- Description: TODO

#### `public boolean clickloc(Location loc, int button, boolean press)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private MarkButton()`

- Description: TODO

#### `public boolean state()`

- Description: TODO

#### `public void click()`

- Description: TODO

#### `public void mark(Location loc, boolean onmap)`

- Description: TODO

#### `private boolean ungrab()`

- Description: TODO

#### `private FindMark(MapView mv, Coord c)`

- Description: TODO

#### `protected void hit(Coord pc, Coord2d mc)`

- Description: TODO

#### `public PlaceMarker(Coord c)`

- Description: TODO

#### `public PlaceMarker(PlaceMarker from, Coord c)`

- Description: TODO

#### `public PlaceMarker derive(Coord c)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean getcurs(CursorQuery ev)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public abstract Tex icon()`

- Description: TODO

#### `public static MarkerType of(Marker mark)`

- Description: TODO

#### `public int compareTo(MarkerType that)`

- Description: TODO

#### `public PMarkerType(Color col)`

- Description: TODO

#### `public Tex icon()`

- Description: TODO

#### `public boolean equals(PMarkerType that)`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public int compareTo(PMarkerType that)`

- Description: TODO

#### `public int compareTo(MarkerType that)`

- Description: TODO

#### `public SMarkerType(Resource.Saved spec)`

- Description: TODO

#### `public Tex icon()`

- Description: TODO

#### `public boolean equals(SMarkerType that)`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public int compareTo(SMarkerType that)`

- Description: TODO

#### `public int compareTo(MarkerType that)`

- Description: TODO

#### `public MarkerConfig()`

- Description: TODO

#### `public MarkerConfig(MarkerConfig from)`

- Description: TODO

#### `public MarkerConfig showsel(boolean showsel)`

- Description: TODO

#### `public MarkerConfig add(MarkerType type)`

- Description: TODO

#### `public MarkerConfig remove(MarkerType type)`

- Description: TODO

#### `public MarkerConfig toggle(MarkerType type)`

- Description: TODO

#### `public boolean filter(MarkerType type)`

- Description: TODO

#### `public boolean filter(Marker mark)`

- Description: TODO

#### `public boolean equals(MarkerConfig that)`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public ListMarker(Marker mark)`

- Description: TODO

#### `public MarkerList(Coord sz)`

- Description: TODO

#### `public List<ListMarker> allitems()`

- Description: TODO

#### `public boolean searchmatch(ListMarker lm, String txt)`

- Description: TODO

#### `public Item(Coord sz, ListMarker lm)`

- Description: TODO

#### `protected BufferedImage img()`

- Description: TODO

#### `protected String text()`

- Description: TODO

#### `protected boolean valid(String text)`

- Description: TODO

#### `protected void drawicon(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public Widget makeitem(ListMarker lm, int idx, Coord sz)`

- Description: TODO

#### `private void toggletype(MarkerType type)`

- Description: TODO

#### `public void change(ListMarker lm)`

- Description: TODO

#### `public void change2(ListMarker lm)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `private boolean compact()`

- Description: TODO

#### `public void compact(boolean a)`

- Description: TODO

#### `public void recenter()`

- Description: TODO

#### `public void focus(Marker m)`

- Description: TODO

#### `protected Deco makedeco()`

- Description: TODO

#### `public MarkerObjs(MapWnd mm)`

- Description: TODO

#### `private void updatepos()`

- Description: TODO

#### `private void updateobjs()`

- Description: TODO

#### `public TickList.Ticking ticker()`

- Description: TODO

#### `public void autotick(double dt)`

- Description: TODO

#### `public void autogtick(Render out)`

- Description: TODO

#### `void remove()`

- Description: TODO

#### `public void markobj(long gobid, UID oid, Indir<Resource> resid, byte[] data, String nm)`

- Description: TODO

#### `public ExportWindow()`

- Description: TODO

#### `public void run(Thread th)`

- Description: TODO

#### `public void cdraw(GOut g)`

- Description: TODO

#### `public void cancel()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void grid(int cs, int ns, int cg, int ng)`

- Description: TODO

#### `public void mark(int cm, int nm)`

- Description: TODO

#### `public ImportWindow()`

- Description: TODO

#### `public void run(Thread th)`

- Description: TODO

#### `public void cdraw(GOut g)`

- Description: TODO

#### `public void cancel()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void prog(String prog)`

- Description: TODO

#### `public void sprog(double sprog)`

- Description: TODO

#### `public void exportmap(Path path)`

- Description: TODO

#### `public void importmap(Path path)`

- Description: TODO

#### `public void exportmap()`

- Description: TODO

#### `public void importmap()`

- Description: TODO

#### `public Map<String, Console.Command> findcmds()`

- Description: TODO
