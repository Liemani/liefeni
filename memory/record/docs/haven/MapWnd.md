---
source: [MapWnd.java](../../../../src/haven/MapWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# MapWnd

Manages the minimap, marker list, and marker placement flow.

## Nested Types

### ExportWindow

- Role: Handles map-marker export.
- Description: Presents the export workflow and writes the selected markers to a file.

### FindMark

- Role: Locates a marker by name or pattern.
- Description: Implements map-click hit testing against markers that can be found on the map.

### ImportWindow

- Role: Handles map-marker import.
- Description: Presents the import workflow and reads markers from a file.

### Item

- Role: Represents one marker list entry.
- Description: Draws the marker entry and forwards selection/highlight behavior.

### ListMarker

- Role: Stores one marker row shown in the list.
- Description: Keeps marker metadata together with its type for sorting and filtering.

### MarkButton

- Role: Toggles the marker placement mode.
- Description: Bridges the toolbar button to the marker creation flow.

### MarkerConfig

- Role: Describes how markers should be shown.
- Description: Encodes the marker visibility mode used by the window.

### MarkerList

- Role: Displays the current marker list.
- Description: Sorts and filters markers and renders the scrollable list widget.

### MarkerObjs

- Role: Renders markers directly on the world map.
- Description: Attaches marker icons to the map view render tree and keeps them ticking.

### MarkerType

- Role: Base type for map marker categories.
- Description: Provides common sorting and naming for placed and server markers.

### PMarkerType

- Role: Marker type for player-placed markers.
- Description: Represents markers created locally by the user.

### PlaceMarker

- Role: Handles the interactive placement of a map marker.
- Description: Collects mouse input and coordinates the placement widgets.

### SMarkerType

- Role: Marker type for server-defined markers.
- Description: Represents markers received from the server or map file.

### Toolbox

- Role: Hosts the marker-management controls.
- Description: Contains the filter buttons, marker list, and export/import actions.

### View

- Role: Renders the minimap content.
- Description: Draws the map image, markers, overlays, and selection state.

### ViewFrame

- Role: Frames and drags the minimap view.
- Description: Handles the outer frame, compact resize behavior, and pointer drag interactions.

## Members

### Constants

#### `public static final Resource markcurs = Resource.local().loadwait("gfx/hud/curs/flag")`
- Role: Stores the map-marker cursor resource.
- Description: Loads the flag cursor used while placing markers.
- Value: `Resource.local().loadwait("gfx/hud/curs/flag")`

#### `public static final KeyBinding kb_home = KeyBinding.get("mapwnd/home", KeyMatch.forcode(KeyEvent.VK_HOME, 0))`
- Role: Binds the follow-home shortcut.
- Description: Activates recentering on the player position.
- Value: `KeyBinding.get("mapwnd/home", KeyMatch.forcode(KeyEvent.VK_HOME, 0))`

#### `public static final KeyBinding kb_mark = KeyBinding.get("mapwnd/mark", KeyMatch.nil)`
- Role: Binds the marker-placement shortcut.
- Description: Starts marker placement mode without a modifier binding.
- Value: `KeyBinding.get("mapwnd/mark", KeyMatch.nil)`

#### `public static final KeyBinding kb_hmark = KeyBinding.get("mapwnd/hmark", KeyMatch.forchar('M', KeyMatch.C))`
- Role: Binds the marker-visibility shortcut.
- Description: Toggles the hidden-marker mode with the configured key chord.
- Value: `KeyBinding.get("mapwnd/hmark", KeyMatch.forchar('M', KeyMatch.C))`

#### `public static final KeyBinding kb_compact = KeyBinding.get("mapwnd/compact", KeyMatch.forchar('A', KeyMatch.M))`
- Role: Binds the compact-mode shortcut.
- Description: Toggles the compact map frame with the configured key chord.
- Value: `KeyBinding.get("mapwnd/compact", KeyMatch.forchar('A', KeyMatch.M))`

#### `public static final KeyBinding kb_prov = KeyBinding.get("mapwnd/prov", KeyMatch.nil)`
- Role: Binds the province-overlay shortcut.
- Description: Toggles province overlays without a modifier binding.
- Value: `KeyBinding.get("mapwnd/prov", KeyMatch.nil)`

#### `private static final int btnw = UI.scale(95)`
- Role: Sets the toolbar button width.
- Description: Controls the width of the marker filter and export buttons.
- Value: `UI.scale(95)`

#### `public static final int iconsz = UI.scale(20)`
- Role: Sets the marker icon size.
- Description: Controls the size used for marker icons in the list and on-map display.
- Value: `UI.scale(20)`

#### `private static final HashedSet<MarkerType> types = new HashedSet<>(Hash.eq)`
- Role: Tracks marker types that should be shown.
- Description: Keeps the active set of marker types used by the filter UI.
- Value: `new HashedSet<>(Hash.eq)`

#### `public static final MarkerConfig showall = new MarkerConfig()`
- Role: Defines the show-all marker filter.
- Description: Enables every marker type in the minimap.
- Value: `new MarkerConfig()`

#### `public static final MarkerConfig hideall = new MarkerConfig().showsel(true)`
- Role: Defines the hide-all marker filter.
- Description: Hides all markers except the selected set.
- Value: `new MarkerConfig().showsel(true)`

#### `public static final Indir<Resource> flag = Resource.local().load("gfx/hud/mmap/markobj")`
- Role: Stores the map-marker icon resource.
- Description: Loads the icon used for marker objects on the minimap.
- Value: `Resource.local().load("gfx/hud/mmap/markobj")`

### Fields

#### `public final MapFile file`
- Role: Stores the backing map file.
- Description: Supplies marker and overlay data to the map window.

#### `public final MiniMap view`
- Role: Stores the minimap view.
- Description: Renders the map image and overlay content.

#### `public final MapView mv`
- Role: Stores the world map view.
- Description: Provides the live map position used for marker placement.

#### `public final Toolbox tool`
- Role: Stores the toolbox widget.
- Description: Hosts marker list controls and export/import actions.

#### `public final Collection<String> overlays = new java.util.concurrent.CopyOnWriteArraySet<>()`
- Role: Tracks enabled overlay tags.
- Description: Holds the currently active map overlay identifiers.

#### `public MarkerConfig markcfg = MarkerConfig.showall, cmarkers = null`
- Role: Tracks the marker visibility mode.
- Description: Selects which marker groups are shown on the map.

#### `public MarkerConfig markcfg = MarkerConfig.showall, cmarkers = null`
- Role: Caches the markcfg value.
- Description: Caches the `markcfg` value for reuse.

#### `private final Locator player`
- Role: Stores the current player locator.
- Description: Resolves the player position for centering and follow behavior.

#### `private final Widget toolbar`
- Role: Stores the top toolbar widget.
- Description: Hosts the map window action buttons.

#### `private final Frame viewf`
- Role: Stores the framed map view.
- Description: Wraps the minimap view so it can be dragged and compacted.

#### `private final MarkerObjs mvmarks = new MarkerObjs(this)`
- Role: Implements the mvmarks operation.
- Description: Implements the marker objs operation.

#### `private GroupSelector colsel`
- Role: Caches the colsel value.
- Description: Caches the `colsel` value for reuse.

#### `private CheckBox onmapbtn`
- Role: Caches the onmapbtn value.
- Description: Caches the `onmapbtn` value for reuse.

#### `private Button mremove`
- Role: Caches the mremove value.
- Description: Caches the `mremove` value for reuse.

#### `private Predicate<Marker> mflt = pmarkers`
- Role: Caches the mflt value.
- Description: Caches the `mflt` value for reuse.

#### `private Comparator<ListMarker> mcmp = namecmp`
- Role: Caches the mcmp value.
- Description: Caches the `mcmp` value for reuse.

#### `private List<ListMarker> markers = Collections.emptyList()`
- Role: Implements the markers operation.
- Description: Implements the empty list operation.

#### `private int markerseq = -1`
- Role: Caches the markerseq value.
- Description: Caches the `markerseq` value for reuse.

#### `private Marker mrefocus = null`
- Role: Caches the mrefocus value.
- Description: Caches the `mrefocus` value for reuse.

#### `private int olalpha = 64`
- Role: Caches the olalpha value.
- Description: Caches the `olalpha` value for reuse.

#### `private final Collection<Runnable> deferred = new LinkedList<>()`
- Role: Implements the deferred operation.
- Description: Implements the private final collection<runnable> deferred = new linked list<>() operation.

#### `private final static Predicate<Marker> pmarkers = (m -> m instanceof PMarker)`
- Role: Implements the pmarkers operation.
- Description: Implements the private final static predicate<marker> pmarkers = (m -> m instanceof p marker) operation.

#### `private final static Predicate<Marker> smarkers = (m -> m instanceof SMarker)`
- Role: Implements the smarkers operation.
- Description: Implements the private final static predicate<marker> smarkers = (m -> m instanceof s marker) operation.

#### `private final static Comparator<ListMarker> namecmp = ((a, b) -> a.mark.nm.compareTo(b.mark.nm))`
- Role: Implements the namecmp operation.
- Description: Implements the compare to operation.

#### `private final static Comparator<ListMarker> typecmp = Comparator.comparing((ListMarker lm) -> lm.type).thenComparing(namecmp)`
- Role: Implements the typecmp operation.
- Description: Implements the then comparing operation.

#### `Coord sc = Coord.z`
- Role: Caches the sc value.
- Description: Caches the `sc` value for reuse.

#### `private UI.Grab drag`
- Role: Caches the drag value.
- Description: Caches the `drag` value for reuse.

#### `private Coord dragc`
- Role: Caches the dragc value.
- Description: Caches the `dragc` value for reuse.

#### `public final MarkerList list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `private final Frame listf`
- Role: Caches the listf value.
- Description: Caches the `listf` value for reuse.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Caches the mibtn value.
- Description: Caches the `mibtn` value for reuse.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Caches the mibtn value.
- Description: Caches the `mibtn` value for reuse.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Caches the mibtn value.
- Description: Caches the `mibtn` value for reuse.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Caches the mibtn value.
- Description: Caches the `mibtn` value for reuse.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Caches the mibtn value.
- Description: Caches the `mibtn` value for reuse.

#### `private final Button pmbtn, smbtn, nobtn, tobtn, mebtn, mibtn`
- Role: Caches the mibtn value.
- Description: Caches the `mibtn` value for reuse.

#### `private TextEntry namesel`
- Role: Caches the namesel value.
- Description: Caches the `namesel` value for reuse.

#### `private UI.Grab grab = null`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

#### `public final Color col`
- Role: Caches the col value.
- Description: Caches the `col` value for reuse.

#### `private Tex icon = null`
- Role: Caches the icon value.
- Description: Caches the `icon` value for reuse.

#### `private Resource.Saved spec`
- Role: Caches the spec value.
- Description: Caches the `spec` value for reuse.

#### `private Tex icon = null`
- Role: Caches the icon value.
- Description: Caches the `icon` value for reuse.

#### `public Set<MarkerType> sel = Collections.emptySet()`
- Role: Implements the sel operation.
- Description: Implements the empty set operation.

#### `public boolean showsel = false`
- Role: Tracks the showsel flag.
- Description: Caches the `showsel` value for reuse.

#### `public final Marker mark`
- Role: Caches the mark value.
- Description: Caches the `mark` value for reuse.

#### `public MarkerType type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

#### `public final ListMarker lm`
- Role: Caches the lm value.
- Description: Caches the `lm` value for reuse.

#### `public final MapWnd mm`
- Role: Caches the mm value.
- Description: Caches the `mm` value for reuse.

#### `private final Map<PMarker, Pair<Gob, RenderTree.Slot>> dcurrent = new HashMap<>()`
- Role: Implements the dcurrent operation.
- Description: Implements the private final map<p marker, pair<gob, render tree.slot>> dcurrent = new hash map<>() operation.

#### `private Collection<PMarker> acurrent = Collections.emptyList()`
- Role: Implements the acurrent operation.
- Description: Implements the empty list operation.

#### `private Location curloc = null`
- Role: Caches the current center location of the minimap.
- Description: Caches the current center location of the minimap.

#### `private boolean loading = true`
- Role: Tracks the loading flag.
- Description: Tracks whether  is currently loading.

#### `private Area area = null`
- Role: Caches the area value.
- Description: Caches the `area` value for reuse.

#### `private int markerseq = -1`
- Role: Caches the markerseq value.
- Description: Caches the `markerseq` value for reuse.

#### `private Thread th`
- Role: Caches the th value.
- Description: Caches the `th` value for reuse.

#### `private volatile String prog = "Exporting map..."`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `private Thread th`
- Role: Caches the th value.
- Description: Caches the `th` value for reuse.

#### `private volatile String prog = "Initializing"`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `private double sprog = -1`
- Role: Caches the sprog value.
- Description: Caches the `sprog` value for reuse.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Implements the cmdmap operation.
- Description: Implements the private map<string, console.command> cmdmap = new tree map<string, console.command>() operation.

### Methods

#### `public MapWnd(MapFile file, MapView mv, Coord sz, String title)`
- Role: Creates a new MapWnd instance.
- Description: Constructs the MapWnd instance from the supplied inputs.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void toggleol(String tag, boolean a)`
- Role: Handles the toggleol path.
- Description: Implements the toggleol operation.

#### `ViewFrame()`
- Role: Handles the view frame workflow.
- Description: Implements the view frame operation.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the MapWnd content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `private Toolbox()`
- Role: Handles the toolbox path.
- Description: Implements the toolbox operation.

#### `public void resize(int h)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `View(MapFile file)`
- Role: Handles the view workflow.
- Description: Implements the view operation.

#### `public void drawgrid(GOut g, Coord ul, DisplayGrid disp)`
- Role: Handles the drawgrid path.
- Description: Draws one rendered grid slice.

#### `public boolean filter(DisplayMarker mark)`
- Role: Handles the filter path.
- Description: Implements the filter operation.

#### `public boolean clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`
- Role: Handles the clickmarker path.
- Description: Handles marker interaction.

#### `public boolean clickicon(DisplayIcon icon, Location loc, int button, boolean press)`
- Role: Handles the clickicon path.
- Description: Handles icon interaction.

#### `public boolean clickloc(Location loc, int button, boolean press)`
- Role: Handles the clickloc path.
- Description: Handles loc interaction.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the MapWnd content.

#### `private MarkButton()`
- Role: Handles the mark button path.
- Description: Implements the mark button operation.

#### `public boolean state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public void click()`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `public void mark(Location loc, boolean onmap)`
- Role: Handles the mark path.
- Description: Implements the mark operation.

#### `private boolean ungrab()`
- Role: Handles the ungrab path.
- Description: Implements the ungrab operation.

#### `private FindMark(MapView mv, Coord c)`
- Role: Handles the find mark path.
- Description: Implements the find mark operation.

#### `protected void hit(Coord pc, Coord2d mc)`
- Role: Handles the hit path.
- Description: Implements the hit operation.

#### `public PlaceMarker(Coord c)`
- Role: Handles the place marker path.
- Description: Implements the place marker operation.

#### `public PlaceMarker(PlaceMarker from, Coord c)`
- Role: Handles the place marker path.
- Description: Implements the place marker operation.

#### `public PlaceMarker derive(Coord c)`
- Role: Handles the derive path.
- Description: Implements the derive operation.

#### `protected boolean shandle(Widget w)`
- Role: Handles the shandle path.
- Description: Lets a matching widget consume the event.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean getcurs(CursorQuery ev)`
- Role: Returns the current cursor state.
- Description: Returns the curs.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public abstract Tex icon()`
- Role: Handles the icon path.
- Description: Implements the icon operation.

#### `public static MarkerType of(Marker mark)`
- Role: Builds a MapWnd value from the supplied components.
- Description: Builds a MapWnd value from the supplied components.

#### `public int compareTo(MarkerType that)`
- Role: Handles the compare to path.
- Description: Implements the compare to operation.

#### `public PMarkerType(Color col)`
- Role: Handles the pmarker type path.
- Description: Implements the p marker type operation.

#### `public Tex icon()`
- Role: Handles the icon path.
- Description: Implements the icon operation.

#### `public boolean equals(PMarkerType that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public int compareTo(PMarkerType that)`
- Role: Handles the compare to path.
- Description: Implements the compare to operation.

#### `public int compareTo(MarkerType that)`
- Role: Handles the compare to path.
- Description: Implements the compare to operation.

#### `public SMarkerType(Resource.Saved spec)`
- Role: Handles the smarker type path.
- Description: Implements the s marker type operation.

#### `public Tex icon()`
- Role: Handles the icon path.
- Description: Implements the icon operation.

#### `public boolean equals(SMarkerType that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public int compareTo(SMarkerType that)`
- Role: Handles the compare to path.
- Description: Implements the compare to operation.

#### `public int compareTo(MarkerType that)`
- Role: Handles the compare to path.
- Description: Implements the compare to operation.

#### `public MarkerConfig()`
- Role: Handles the marker config path.
- Description: Implements the marker config operation.

#### `public MarkerConfig(MarkerConfig from)`
- Role: Handles the marker config path.
- Description: Implements the marker config operation.

#### `public MarkerConfig showsel(boolean showsel)`
- Role: Handles the showsel path.
- Description: Implements the showsel operation.

#### `public MarkerConfig add(MarkerType type)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public MarkerConfig remove(MarkerType type)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public MarkerConfig toggle(MarkerType type)`
- Role: Handles the toggle path.
- Description: Implements the toggle operation.

#### `public boolean filter(MarkerType type)`
- Role: Handles the filter path.
- Description: Implements the filter operation.

#### `public boolean filter(Marker mark)`
- Role: Handles the filter path.
- Description: Implements the filter operation.

#### `public boolean equals(MarkerConfig that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public ListMarker(Marker mark)`
- Role: Handles the list marker path.
- Description: Implements the list marker operation.

#### `public MarkerList(Coord sz)`
- Role: Handles the marker list path.
- Description: Implements the marker list operation.

#### `public List<ListMarker> allitems()`
- Role: Handles the allitems path.
- Description: Implements the allitems operation.

#### `public boolean searchmatch(ListMarker lm, String txt)`
- Role: Handles the searchmatch path.
- Description: Implements the searchmatch operation.

#### `public Item(Coord sz, ListMarker lm)`
- Role: Handles the item path.
- Description: Implements the item operation.

#### `protected BufferedImage img()`
- Role: Handles the img path.
- Description: Implements the img operation.

#### `protected String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `protected boolean valid(String text)`
- Role: Handles the valid path.
- Description: Implements the valid operation.

#### `protected void drawicon(GOut g)`
- Role: Handles the drawicon path.
- Description: Draws the icon.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public Widget makeitem(ListMarker lm, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `private void toggletype(MarkerType type)`
- Role: Handles the toggletype path.
- Description: Implements the toggletype operation.

#### `public void change(ListMarker lm)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public void change2(ListMarker lm)`
- Role: Handles the change2 path.
- Description: Implements the change2 operation.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `private boolean compact()`
- Role: Handles the compact path.
- Description: Implements the compact operation.

#### `public void compact(boolean a)`
- Role: Handles the compact path.
- Description: Implements the compact operation.

#### `public void recenter()`
- Role: Handles the recenter path.
- Description: Implements the recenter operation.

#### `public void focus(Marker m)`
- Role: Handles the focus path.
- Description: Implements the focus operation.

#### `protected Deco makedeco()`
- Role: Handles the makedeco path.
- Description: Implements the makedeco operation.

#### `public MarkerObjs(MapWnd mm)`
- Role: Handles the marker objs path.
- Description: Implements the marker objs operation.

#### `private void updatepos()`
- Role: Handles the updatepos path.
- Description: Updates the pos.

#### `private void updateobjs()`
- Role: Handles the updateobjs path.
- Description: Updates the objs.

#### `public TickList.Ticking ticker()`
- Role: Handles the ticker path.
- Description: Advances the er state.

#### `public void autotick(double dt)`
- Role: Handles the autotick path.
- Description: Implements the autotick operation.

#### `public void autogtick(Render out)`
- Role: Handles the autogtick path.
- Description: Implements the autogtick operation.

#### `void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void markobj(long gobid, UID oid, Indir<Resource> resid, byte[] data, String nm)`
- Role: Handles the markobj path.
- Description: Implements the markobj operation.

#### `public ExportWindow()`
- Role: Handles the export window path.
- Description: Implements the export window operation.

#### `public void run(Thread th)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void cdraw(GOut g)`
- Role: Handles the cdraw path.
- Description: Implements the cdraw operation.

#### `public void cancel()`
- Role: Cancels the current waiting registration.
- Description: Cancels the current waiting registration.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void grid(int cs, int ns, int cg, int ng)`
- Role: Handles the grid path.
- Description: Implements the grid operation.

#### `public void mark(int cm, int nm)`
- Role: Handles the mark path.
- Description: Implements the mark operation.

#### `public ImportWindow()`
- Role: Handles the import window path.
- Description: Implements the import window operation.

#### `public void run(Thread th)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void cdraw(GOut g)`
- Role: Handles the cdraw path.
- Description: Implements the cdraw operation.

#### `public void cancel()`
- Role: Cancels the current waiting registration.
- Description: Cancels the current waiting registration.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void prog(String prog)`
- Role: Handles the prog path.
- Description: Implements the prog operation.

#### `public void sprog(double sprog)`
- Role: Handles the sprog path.
- Description: Implements the sprog operation.

#### `public void exportmap(Path path)`
- Role: Handles the exportmap path.
- Description: Implements the exportmap operation.

#### `public void importmap(Path path)`
- Role: Handles the importmap path.
- Description: Implements the importmap operation.

#### `public void exportmap()`
- Role: Handles the exportmap path.
- Description: Implements the exportmap operation.

#### `public void importmap()`
- Role: Handles the importmap path.
- Description: Implements the importmap operation.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Finds the cmds.
