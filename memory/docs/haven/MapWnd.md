# MapWnd

This file documents the responsibilities and members of `MapWnd`.

## Meta

- Source: [MapWnd.java](../../../src/haven/MapWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the map wnd Haven component.

## Nested Types

### ExportWindow

- Role: Represents export window within MapWnd.
- Description: Describes the nested export window type used by the enclosing class.

### FindMark

- Role: Represents find mark within MapWnd.
- Description: Describes the nested find mark type used by the enclosing class.

### ImportWindow

- Role: Represents import window within MapWnd.
- Description: Describes the nested import window type used by the enclosing class.

### Item

- Role: Represents item within MapWnd.
- Description: Describes the nested item type used by the enclosing class.

### ListMarker

- Role: Represents list marker within MapWnd.
- Description: Describes the nested list marker type used by the enclosing class.

### MarkButton

- Role: Represents mark button within MapWnd.
- Description: Describes the nested mark button type used by the enclosing class.

### MarkerConfig

- Role: Represents marker config within MapWnd.
- Description: Describes the nested marker config type used by the enclosing class.

### MarkerList

- Role: Represents marker list within MapWnd.
- Description: Describes the nested marker list type used by the enclosing class.

### MarkerObjs

- Role: Represents marker objs within MapWnd.
- Description: Describes the nested marker objs type used by the enclosing class.

### MarkerType

- Role: Represents marker type within MapWnd.
- Description: Describes the nested marker type type used by the enclosing class.

### PMarkerType

- Role: Represents pmarker type within MapWnd.
- Description: Describes the nested pmarker type type used by the enclosing class.

### PlaceMarker

- Role: Represents place marker within MapWnd.
- Description: Describes the nested place marker type used by the enclosing class.

### SMarkerType

- Role: Represents smarker type within MapWnd.
- Description: Describes the nested smarker type type used by the enclosing class.

### Toolbox

- Role: Represents toolbox within MapWnd.
- Description: Describes the nested toolbox type used by the enclosing class.

### View

- Role: Represents view within MapWnd.
- Description: Describes the nested view type used by the enclosing class.

### ViewFrame

- Role: Represents view frame within MapWnd.
- Description: Describes the nested view frame type used by the enclosing class.

## Members

### Constants

#### `public static final Resource markcurs = Resource.local().loadwait("gfx/hud/curs/flag")`
- Role: Defines the shared markcurs constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_home = KeyBinding.get("mapwnd/home", KeyMatch.forcode(KeyEvent.VK_HOME, 0))`
- Role: Defines the shared kb home constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_mark = KeyBinding.get("mapwnd/mark", KeyMatch.nil)`
- Role: Defines the shared kb mark constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_hmark = KeyBinding.get("mapwnd/hmark", KeyMatch.forchar('M', KeyMatch.C))`
- Role: Defines the shared kb hmark constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_compact = KeyBinding.get("mapwnd/compact", KeyMatch.forchar('A', KeyMatch.M))`
- Role: Defines the shared kb compact constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_prov = KeyBinding.get("mapwnd/prov", KeyMatch.nil)`
- Role: Defines the shared kb prov constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int btnw = UI.scale(95)`
- Role: Defines the shared btnw constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int iconsz = UI.scale(20)`
- Role: Defines the shared iconsz constant.
- Description: Shared constant used by the rest of the class.

#### `private static final HashedSet<MarkerType> types = new HashedSet<>(Hash.eq)`
- Role: Defines the shared types constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MarkerConfig showall = new MarkerConfig()`
- Role: Defines the shared showall constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MarkerConfig hideall = new MarkerConfig().showsel(true)`
- Role: Defines the shared hideall constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Indir<Resource> flag = Resource.local().load("gfx/hud/mmap/markobj")`
- Role: Defines the shared flag constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final MapFile file`
- Role: Stores the file value.
- Description: Backs the cached state for this file.

#### `public final MiniMap view`
- Role: Caches view entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final MapView mv`
- Role: Stores the mv value.
- Description: Backs the cached state for this file.

#### `public final Toolbox tool`
- Role: Holds the tool state.
- Description: Backs the cached state for this file.

#### `public final Collection<String> overlays = new java.util.concurrent.CopyOnWriteArraySet<>()`
- Role: Caches overlays entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public MarkerConfig markcfg = MarkerConfig.showall, cmarkers = null`
- Role: Holds the markcfg state.
- Description: Backs the cached state for this file.

#### `public MarkerConfig markcfg = MarkerConfig.showall, cmarkers = null`
- Role: Holds the markcfg state.
- Description: Backs the cached state for this file.

#### `private final Locator player`
- Role: Holds the player state.
- Description: Backs the cached state for this file.

#### `private final Widget toolbar`
- Role: Stores the toolbar value.
- Description: Backs the cached state for this file.

#### `private final Frame viewf`
- Role: Holds the viewf state.
- Description: Backs the cached state for this file.

#### `private final MarkerObjs mvmarks = new MarkerObjs(this)`
- Role: Holds the mvmarks state.
- Description: Backs the cached state for this file.

#### `private GroupSelector colsel`
- Role: Holds the colsel state.
- Description: Backs the cached state for this file.

#### `private CheckBox onmapbtn`
- Role: Holds the onmapbtn state.
- Description: Backs the cached state for this file.

#### `private Button mremove`
- Role: Holds the mremove state.
- Description: Backs the cached state for this file.

#### `private Predicate<Marker> mflt = pmarkers`
- Role: Holds the mflt state.
- Description: Backs the cached state for this file.

#### `private Comparator<ListMarker> mcmp = namecmp`
- Role: Holds the mcmp state.
- Description: Backs the cached state for this file.

#### `private List<ListMarker> markers = Collections.emptyList()`
- Role: Caches markers entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int markerseq = -1`
- Role: Stores the markerseq value.
- Description: Backs the cached state for this file.

#### `private Marker mrefocus = null`
- Role: Holds the mrefocus state.
- Description: Backs the cached state for this file.

#### `private int olalpha = 64`
- Role: Stores the olalpha value.
- Description: Backs the cached state for this file.

#### `private final Collection<Runnable> deferred = new LinkedList<>()`
- Role: Caches deferred entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final static Predicate<Marker> pmarkers = (m -> m instanceof PMarker)`
- Role: Holds the pmarkers state.
- Description: Backs the cached state for this file.

#### `private final static Predicate<Marker> smarkers = (m -> m instanceof SMarker)`
- Role: Holds the smarkers state.
- Description: Backs the cached state for this file.

#### `private final static Comparator<ListMarker> namecmp = ((a, b) -> a.mark.nm.compareTo(b.mark.nm))`
- Role: Holds the namecmp state.
- Description: Backs the cached state for this file.

#### `private final static Comparator<ListMarker> typecmp = Comparator.comparing((ListMarker lm) -> lm.type).thenComparing(namecmp)`
- Role: Holds the typecmp state.
- Description: Backs the cached state for this file.

#### `Coord sc = Coord.z`
- Role: Stores the sc value.
- Description: Backs the cached state for this file.

#### `private UI.Grab drag`
- Role: Stores the drag value.
- Description: Backs the cached state for this file.

#### `private Coord dragc`
- Role: Stores the dragc value.
- Description: Backs the cached state for this file.

#### `public final MarkerList list`
- Role: Caches list entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Frame listf`
- Role: Holds the listf state.
- Description: Backs the cached state for this file.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Holds the mibtn state.
- Description: Backs the cached state for this file.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Holds the mibtn state.
- Description: Backs the cached state for this file.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Holds the mibtn state.
- Description: Backs the cached state for this file.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Holds the mibtn state.
- Description: Backs the cached state for this file.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Holds the mibtn state.
- Description: Backs the cached state for this file.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Holds the mibtn state.
- Description: Backs the cached state for this file.

#### `private TextEntry namesel`
- Role: Stores the namesel value.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab = null`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

#### `public final Color col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

#### `private Tex icon = null`
- Role: Stores the icon value.
- Description: Backs the cached state for this file.

#### `private Resource.Saved spec`
- Role: Stores the spec value.
- Description: Backs the cached state for this file.

#### `private Tex icon = null`
- Role: Stores the icon value.
- Description: Backs the cached state for this file.

#### `public Set<MarkerType> sel = Collections.emptySet()`
- Role: Caches sel entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public boolean showsel = false`
- Role: Tracks the showsel flag.
- Description: Supports the showsel operation used by the surrounding class.

#### `public final Marker mark`
- Role: Holds the mark state.
- Description: Backs the cached state for this file.

#### `public MarkerType type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final ListMarker lm`
- Role: Holds the lm state.
- Description: Backs the cached state for this file.

#### `public final MapWnd mm`
- Role: Holds the mm state.
- Description: Backs the cached state for this file.

#### `private final Map<PMarker, Pair<Gob, RenderTree.Slot>> dcurrent = new HashMap<>()`
- Role: Caches dcurrent entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Collection<PMarker> acurrent = Collections.emptyList()`
- Role: Caches acurrent entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Location curloc = null`
- Role: Holds the curloc state.
- Description: Backs the cached state for this file.

#### `private boolean loading = true`
- Role: Tracks the loading flag.
- Description: Supports the loading operation used by the surrounding class.

#### `private Area area = null`
- Role: Holds the area state.
- Description: Backs the cached state for this file.

#### `private int markerseq = -1`
- Role: Stores the markerseq value.
- Description: Backs the cached state for this file.

#### `private Thread th`
- Role: Holds the th state.
- Description: Backs the cached state for this file.

#### `private volatile String prog = "Exporting map..."`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

#### `private Thread th`
- Role: Holds the th state.
- Description: Backs the cached state for this file.

#### `private volatile String prog = "Initializing"`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

#### `private double sprog = -1`
- Role: Stores the sprog value.
- Description: Backs the cached state for this file.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Caches cmdmap entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public MapWnd(MapFile file, MapView mv, Coord sz, String title)`
- Role: Creates a new MapWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void toggleol(String tag, boolean a)`
- Role: Performs toggleol.
- Description: Supports the toggleol operation used by the surrounding class.

#### `ViewFrame()`
- Role: Handles the view frame workflow.
- Description: Supports the view frame operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `private Toolbox()`
- Role: Performs toolbox.
- Description: Supports the toolbox operation used by the surrounding class.

#### `public void resize(int h)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `View(MapFile file)`
- Role: Handles the view workflow.
- Description: Supports the view operation used by the surrounding class.

#### `public void drawgrid(GOut g, Coord ul, DisplayGrid disp)`
- Role: Performs drawgrid.
- Description: Supports the drawgrid operation used by the surrounding class.

#### `public boolean filter(DisplayMarker mark)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public boolean clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`
- Role: Performs clickmarker.
- Description: Supports the clickmarker operation used by the surrounding class.

#### `public boolean clickicon(DisplayIcon icon, Location loc, int button, boolean press)`
- Role: Performs clickicon.
- Description: Supports the clickicon operation used by the surrounding class.

#### `public boolean clickloc(Location loc, int button, boolean press)`
- Role: Performs clickloc.
- Description: Supports the clickloc operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private MarkButton()`
- Role: Performs mark button.
- Description: Supports the mark button operation used by the surrounding class.

#### `public boolean state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public void mark(Location loc, boolean onmap)`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `private boolean ungrab()`
- Role: Performs ungrab.
- Description: Supports the ungrab operation used by the surrounding class.

#### `private FindMark(MapView mv, Coord c)`
- Role: Performs find mark.
- Description: Supports the find mark operation used by the surrounding class.

#### `protected void hit(Coord pc, Coord2d mc)`
- Role: Performs hit.
- Description: Supports the hit operation used by the surrounding class.

#### `public PlaceMarker(Coord c)`
- Role: Performs place marker.
- Description: Supports the place marker operation used by the surrounding class.

#### `public PlaceMarker(PlaceMarker from, Coord c)`
- Role: Performs place marker.
- Description: Supports the place marker operation used by the surrounding class.

#### `public PlaceMarker derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean getcurs(CursorQuery ev)`
- Role: Returns the current cursor state.
- Description: Exposes the requested value without mutating state.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public abstract Tex icon()`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public static MarkerType of(Marker mark)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public int compareTo(MarkerType that)`
- Role: Performs compare to.
- Description: Supports the compare to operation used by the surrounding class.

#### `public PMarkerType(Color col)`
- Role: Performs pmarker type.
- Description: Supports the pmarker type operation used by the surrounding class.

#### `public Tex icon()`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public boolean equals(PMarkerType that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public int compareTo(PMarkerType that)`
- Role: Performs compare to.
- Description: Supports the compare to operation used by the surrounding class.

#### `public int compareTo(MarkerType that)`
- Role: Performs compare to.
- Description: Supports the compare to operation used by the surrounding class.

#### `public SMarkerType(Resource.Saved spec)`
- Role: Performs smarker type.
- Description: Supports the smarker type operation used by the surrounding class.

#### `public Tex icon()`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public boolean equals(SMarkerType that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public int compareTo(SMarkerType that)`
- Role: Performs compare to.
- Description: Supports the compare to operation used by the surrounding class.

#### `public int compareTo(MarkerType that)`
- Role: Performs compare to.
- Description: Supports the compare to operation used by the surrounding class.

#### `public MarkerConfig()`
- Role: Performs marker config.
- Description: Supports the marker config operation used by the surrounding class.

#### `public MarkerConfig(MarkerConfig from)`
- Role: Performs marker config.
- Description: Supports the marker config operation used by the surrounding class.

#### `public MarkerConfig showsel(boolean showsel)`
- Role: Performs showsel.
- Description: Supports the showsel operation used by the surrounding class.

#### `public MarkerConfig add(MarkerType type)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public MarkerConfig remove(MarkerType type)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public MarkerConfig toggle(MarkerType type)`
- Role: Performs toggle.
- Description: Supports the toggle operation used by the surrounding class.

#### `public boolean filter(MarkerType type)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public boolean filter(Marker mark)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public boolean equals(MarkerConfig that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public ListMarker(Marker mark)`
- Role: Performs list marker.
- Description: Supports the list marker operation used by the surrounding class.

#### `public MarkerList(Coord sz)`
- Role: Performs marker list.
- Description: Supports the marker list operation used by the surrounding class.

#### `public List<ListMarker> allitems()`
- Role: Performs allitems.
- Description: Supports the allitems operation used by the surrounding class.

#### `public boolean searchmatch(ListMarker lm, String txt)`
- Role: Performs searchmatch.
- Description: Supports the searchmatch operation used by the surrounding class.

#### `public Item(Coord sz, ListMarker lm)`
- Role: Performs item.
- Description: Supports the item operation used by the surrounding class.

#### `protected BufferedImage img()`
- Role: Performs img.
- Description: Supports the img operation used by the surrounding class.

#### `protected String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `protected boolean valid(String text)`
- Role: Performs valid.
- Description: Supports the valid operation used by the surrounding class.

#### `protected void drawicon(GOut g)`
- Role: Performs drawicon.
- Description: Supports the drawicon operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public Widget makeitem(ListMarker lm, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `private void toggletype(MarkerType type)`
- Role: Performs toggletype.
- Description: Supports the toggletype operation used by the surrounding class.

#### `public void change(ListMarker lm)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public void change2(ListMarker lm)`
- Role: Performs change2.
- Description: Supports the change2 operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `private boolean compact()`
- Role: Performs compact.
- Description: Supports the compact operation used by the surrounding class.

#### `public void compact(boolean a)`
- Role: Performs compact.
- Description: Supports the compact operation used by the surrounding class.

#### `public void recenter()`
- Role: Performs recenter.
- Description: Supports the recenter operation used by the surrounding class.

#### `public void focus(Marker m)`
- Role: Performs focus.
- Description: Supports the focus operation used by the surrounding class.

#### `protected Deco makedeco()`
- Role: Performs makedeco.
- Description: Supports the makedeco operation used by the surrounding class.

#### `public MarkerObjs(MapWnd mm)`
- Role: Performs marker objs.
- Description: Supports the marker objs operation used by the surrounding class.

#### `private void updatepos()`
- Role: Performs updatepos.
- Description: Supports the updatepos operation used by the surrounding class.

#### `private void updateobjs()`
- Role: Performs updateobjs.
- Description: Supports the updateobjs operation used by the surrounding class.

#### `public TickList.Ticking ticker()`
- Role: Performs ticker.
- Description: Supports the ticker operation used by the surrounding class.

#### `public void autotick(double dt)`
- Role: Performs autotick.
- Description: Supports the autotick operation used by the surrounding class.

#### `public void autogtick(Render out)`
- Role: Performs autogtick.
- Description: Supports the autogtick operation used by the surrounding class.

#### `void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void markobj(long gobid, UID oid, Indir<Resource> resid, byte[] data, String nm)`
- Role: Performs markobj.
- Description: Supports the markobj operation used by the surrounding class.

#### `public ExportWindow()`
- Role: Performs export window.
- Description: Supports the export window operation used by the surrounding class.

#### `public void run(Thread th)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void cdraw(GOut g)`
- Role: Performs cdraw.
- Description: Supports the cdraw operation used by the surrounding class.

#### `public void cancel()`
- Role: Performs cancel.
- Description: Supports the cancel operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void grid(int cs, int ns, int cg, int ng)`
- Role: Performs grid.
- Description: Supports the grid operation used by the surrounding class.

#### `public void mark(int cm, int nm)`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `public ImportWindow()`
- Role: Performs import window.
- Description: Supports the import window operation used by the surrounding class.

#### `public void run(Thread th)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void cdraw(GOut g)`
- Role: Performs cdraw.
- Description: Supports the cdraw operation used by the surrounding class.

#### `public void cancel()`
- Role: Performs cancel.
- Description: Supports the cancel operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void prog(String prog)`
- Role: Performs prog.
- Description: Supports the prog operation used by the surrounding class.

#### `public void sprog(double sprog)`
- Role: Performs sprog.
- Description: Supports the sprog operation used by the surrounding class.

#### `public void exportmap(Path path)`
- Role: Performs exportmap.
- Description: Supports the exportmap operation used by the surrounding class.

#### `public void importmap(Path path)`
- Role: Performs importmap.
- Description: Supports the importmap operation used by the surrounding class.

#### `public void exportmap()`
- Role: Performs exportmap.
- Description: Supports the exportmap operation used by the surrounding class.

#### `public void importmap()`
- Role: Performs importmap.
- Description: Supports the importmap operation used by the surrounding class.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.
