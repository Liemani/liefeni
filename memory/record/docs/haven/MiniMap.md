---
source: [MiniMap.java](../../../../src/haven/MiniMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# MiniMap

Renders the current map segment, markers, and location-specific icon overlays.

## Nested Types

### CachedImage

- Role: Caches one rendered minimap image.
- Description: Stores the map image together with the parameters used to build it used by this component.

### DisplayGrid

- Role: Represents one visible minimap grid.
- Description: Holds the segment/grid pair and the rendered grid image.

### DisplayIcon

- Role: Represents one icon rendered on the minimap.
- Description: Displayed icon, world position, and draw-depth state for one minimap icon.

### DisplayMarker

- Role: Represents one displayed marker on the minimap.
- Description: Stores marker identity, icon state, and cached render data.

### Flag

- Role: Renders a placed-marker flag icon.
- Description: Builds the marker icon texture and name display for placed markers.

### Location

- Role: Stores one minimap location pair.
- Description: Combines one map segment with the tile coordinate inside that segment.

### Locator

- Role: Resolves the current minimap location from runtime state.
- Description: Uses runtime state to resolve the active minimap location.

### MapLocator

- Role: Resolves the location from the current `MapView`.
- Description: Uses the current `MapView` coordinate and map file to resolve the active location.

### MarkerID

- Role: Stores marker attribute state on a gob.
- Description: Tracks the marker id attached to a gob.

### MarkerIcon

- Role: Resolves and caches one marker's icon.
- Description: Loads the correct gob-icon implementation for placed or server markers.

### Markers

- Role: Manages all markers shown in the minimap.
- Description: Marker manager for all minimap overlays.

### Scale2D

- Role: Scales minimap coordinates into screen coordinates.
- Description: Applies the current UI scale to render operations.

### SessionLocator

- Role: Resolves the location from the current session grids.
- Description: Matches loaded `MCache.Grid` objects to map-file grid info.

### SpecLocator

- Role: Resolves a location from an explicit segment and tile coordinate.
- Description: Returns the exact `MapFile` location described by the stored values.

## Members

### Constants

#### `public static final Tex bg = Resource.loadtex("gfx/hud/mmap/ptex")`
- Role: Defines the bg constant.
- Description: Background texture for the minimap frame chrome.
- Value: `Resource.loadtex("gfx/hud/mmap/ptex")`

#### `public static final Tex nomap = Resource.loadtex("gfx/hud/mmap/nomap")`
- Role: Defines the nomap constant.
- Description: Placeholder texture shown when no map image is available.
- Value: `Resource.loadtex("gfx/hud/mmap/nomap")`

#### `public static final Tex plp = ((TexI)Resource.loadtex("gfx/hud/mmap/plp")).filter(Texture.Filter.LINEAR)`
- Role: Defines the plp constant.
- Description: Player-position pulse texture used for the minimap marker effect.
- Value: `((TexI)Resource.loadtex("gfx/hud/mmap/plp")).filter(Texture.Filter.LINEAR)`

#### `private static final OwnerContext.ClassResolver<MarkerIcon> ctxr = new OwnerContext.ClassResolver<MarkerIcon>()`
- Role: Defines the ctxr constant.
- Description: Owner-context resolver used to expose minimap marker dependencies.
- Value: `new OwnerContext.ClassResolver<MarkerIcon>()`

#### `public static final Color notifcol = new Color(255, 128, 0, 255)`
- Role: Defines the notifcol constant.
- Description: Orange tint used when a minimap icon is flashing.
- Value: `new Color(255, 128, 0, 255)`

#### `public static final Resource res = Resource.local().loadwait("gfx/hud/mmap/flag")`
- Role: Defines the res constant.
- Description: Resource bundle used to build the placed-marker flag icon.
- Value: `Resource.local().loadwait("gfx/hud/mmap/flag")`

#### `public static final Resource.Image fg = res.flayer(Resource.imgc, 0)`
- Role: Defines the fg constant.
- Description: Foreground image layer of the placed-marker flag icon.
- Value: `res.flayer(Resource.imgc, 0)`

#### `public static final Resource.Image bg = res.flayer(Resource.imgc, 1)`
- Role: Defines the bg constant.
- Description: Background image layer of the placed-marker flag icon.
- Value: `res.flayer(Resource.imgc, 1)`

#### `public static final Coord cc = UI.scale(res.flayer(Resource.negc).cc)`
- Role: Defines the cc constant.
- Description: Screen-space anchor point used when drawing the placed-marker flag icon.
- Value: `UI.scale(res.flayer(Resource.negc).cc)`

### Fields

#### `public final MapFile file`
- Role: Stores the map file.
- Description: Map file used to resolve grid and segment data.

#### `public Markers markers = new Markers(this)`
- Role: Stores minimap markers.
- Description: Marker manager for all minimap overlays.

#### `public Location curloc`
- Role: Stores the current location.
- Description: Location resolved from the current runtime state.

#### `public Location sessloc`
- Role: Stores the session location.
- Description: Location resolved from loaded session grids.

#### `public GobIcon.Settings iconconf`
- Role: Holds the gob icon settings used to choose minimap markers.
- Description: Holds the gob icon settings used to choose minimap markers.

#### `public List<DisplayIcon> icons = Collections.emptyList()`
- Role: Stores rendered icons.
- Description: Cached list of icons currently displayed on the minimap.

#### `protected Locator setloc`
- Role: Stores the active location resolver.
- Description: Strategy used to choose the active minimap location.

#### `protected boolean follow`
- Role: Tracks follow mode.
- Description: Whether the minimap follows the current player.

#### `protected int zoomlevel = 0, maglevel = 1 << Utils.clip((int)Math.round(Math.log(UI.scale(1.0)) / Math.log(2)), 0, 3)`
- Role: Implements the zoomlevel operation.
- Description: Implements the log operation.

#### `protected int zoomlevel = 0, maglevel = 1 << Utils.clip((int)Math.round(Math.log(UI.scale(1.0)) / Math.log(2)), 0, 3)`
- Role: Implements the zoomlevel operation.
- Description: Implements the log operation.

#### `protected DisplayGrid[] display =`
- Role: Holds the visible grid slices currently rendered on the minimap.
- Description: Holds the visible grid slices currently rendered on the minimap.

#### `protected Area dgext, dtext`
- Role: Caches the dtext value.
- Description: Caches the `dtext` value for reuse.

#### `protected Area dgext, dtext`
- Role: Caches the dtext value.
- Description: Caches the `dtext` value for reuse.

#### `protected Segment dseg`
- Role: Caches the dseg value.
- Description: Caches the `dseg` value for reuse.

#### `protected int dlvl, dmag`
- Role: Caches the dmag value.
- Description: Caches the `dmag` value for reuse.

#### `protected int dlvl, dmag`
- Role: Caches the dmag value.
- Description: Caches the `dmag` value for reuse.

#### `protected Location dloc`
- Role: Caches the last minimap location used for rendering.
- Description: Caches the last minimap location used for rendering.

#### `public final Segment seg`
- Role: Caches the seg value.
- Description: Caches the `seg` value for reuse.

#### `public final Coord tc`
- Role: Caches the tc value.
- Description: Caches the `tc` value for reuse.

#### `public final Session sess`
- Role: Caches the sess value.
- Description: Caches the `sess` value for reuse.

#### `private MCache.Grid lastgrid = null`
- Role: Last loaded grid used when rebuilding the minimap.
- Description: Cached grid used to validate the session locator result.

#### `private Location lastloc`
- Role: Caches the last resolved minimap location.
- Description: Caches the last resolved minimap location.

#### `public final MapView mv`
- Role: Caches the mv value.
- Description: Caches the `mv` value for reuse.

#### `public final long seg`
- Role: Caches the seg value.
- Description: Caches the `seg` value for reuse.

#### `public final Coord tc`
- Role: Caches the tc value.
- Description: Caches the `tc` value for reuse.

#### `public final Markers o`
- Role: Caches the o value.
- Description: Caches the `o` value for reuse.

#### `public final Marker m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

#### `private final Loader loader`
- Role: Caches the loader value.
- Description: Caches the `loader` value for reuse.

#### `private Loader.Future<GobIcon.Icon> load`
- Role: Caches the load value.
- Description: Caches the `load` value for reuse.

#### `private GobIcon.Icon icon`
- Role: Caches the icon value.
- Description: Caches the `icon` value for reuse.

#### `private int lseq, iseq`
- Role: Caches the iseq value.
- Description: Caches the `iseq` value for reuse.

#### `private int lseq, iseq`
- Role: Caches the iseq value.
- Description: Caches the `iseq` value for reuse.

#### `private List<ItemInfo> info = null`
- Role: Cached item info used when building icon details.
- Description: Cached item info used when building icon details.

#### `public final MiniMap mm`
- Role: Back-reference to the owning MiniMap instance.
- Description: Back-reference to the owning MiniMap instance.

#### `public int seq`
- Role: Caches the seq value.
- Description: Caches the `seq` value for reuse.

#### `private final Map<Marker, MarkerIcon> icons = new HashMap<>()`
- Role: Rendered icons currently visible on the minimap.
- Description: Marker icon cache keyed by marker identity.

#### `private volatile int mseq = -1`
- Role: Caches the mseq value.
- Description: Caches the `mseq` value for reuse.

#### `private volatile Future<?> updater = null`
- Role: Caches the updater value.
- Description: Caches the `updater` value for reuse.

#### `private boolean loading`
- Role: Tracks whether loading is enabled.
- Description: Whether a background refresh is currently running.

#### `private Locator sesslocator`
- Role: Caches the sesslocator value.
- Description: Caches the `sesslocator` value for reuse.

#### `public final Coord cc`
- Role: Caches the cc value.
- Description: Caches the `cc` value for reuse.

#### `public final float f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `public final GobIcon attr`
- Role: Caches the attr value.
- Description: Caches the `attr` value for reuse.

#### `public final Gob gob`
- Role: Caches the gob value.
- Description: Caches the `gob` value for reuse.

#### `public final GobIcon.Icon icon`
- Role: Caches the icon value.
- Description: Caches the `icon` value for reuse.

#### `public final GobIcon.Setting conf`
- Role: Caches the conf value.
- Description: Caches the `conf` value for reuse.

#### `public Coord2d rc = null`
- Role: Caches the rc value.
- Description: Caches the `rc` value for reuse.

#### `public Coord sc = null`
- Role: Caches the sc value.
- Description: Caches the `sc` value for reuse.

#### `public double ang = 0.0`
- Role: Caches the ang value.
- Description: Caches the `ang` value for reuse.

#### `public int z`
- Role: Caches the z value.
- Description: Caches the `z` value for reuse.

#### `public double stime, ntime`
- Role: Caches the ntime value.
- Description: Caches the `ntime` value for reuse.

#### `public double stime, ntime`
- Role: Caches the ntime value.
- Description: Caches the `ntime` value for reuse.

#### `public boolean notify`
- Role: Tracks whether notify is enabled.
- Description: Whether this marker should notify the player.

#### `private Consumer<UI> snotify`
- Role: Caches the snotify value.
- Description: Caches the `snotify` value for reuse.

#### `private boolean markchecked`
- Role: Tracks whether markchecked is enabled.
- Description: Whether marker matching has already been checked.

#### `public final Marker mark`
- Role: Caches the mark value.
- Description: Caches the `mark` value for reuse.

#### `public final Color col`
- Role: Caches the col value.
- Description: Caches the `col` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final MiniMap mm`
- Role: Back-reference to the owning MiniMap instance.
- Description: Back-reference to the owning MiniMap instance.

#### `public final Marker m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

#### `public Coord sc = null`
- Role: Caches the sc value.
- Description: Caches the `sc` value for reuse.

#### `private int tseq = -1`
- Role: Caches the tseq value.
- Description: Caches the `tseq` value for reuse.

#### `private BufferedImage tooltip = null`
- Role: Caches the tooltip value.
- Description: Caches the `tooltip` value for reuse.

#### `public final MiniMap mm`
- Role: Back-reference to the owning MiniMap instance.
- Description: Back-reference to the owning MiniMap instance.

#### `public final MapFile file`
- Role: Caches the file value.
- Description: Caches the `file` value for reuse.

#### `public final Segment seg`
- Role: Caches the seg value.
- Description: Caches the `seg` value for reuse.

#### `public final Coord sc`
- Role: Caches the sc value.
- Description: Caches the `sc` value for reuse.

#### `public final Area mapext`
- Role: Caches the mapext value.
- Description: Caches the `mapext` value for reuse.

#### `public final Indir<? extends DataGrid> gref`
- Role: Caches the gref value.
- Description: Caches the `gref` value for reuse.

#### `public Coord dc`
- Role: Caches the dc value.
- Description: Caches the `dc` value for reuse.

#### `private Tex img = null`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `private Defer.Future<Tex> nextimg = null`
- Role: Caches the nextimg value.
- Description: Caches the `nextimg` value for reuse.

#### `final Function<DataGrid, Defer.Future<Tex>> src`
- Role: Caches the src value.
- Description: Carries the source drag widget.

#### `DataGrid cgrid`
- Role: Caches the cgrid value.
- Description: Caches the `cgrid` value for reuse.

#### `Defer.Future<Tex> next`
- Role: Caches the next value.
- Description: Caches the `next` value for reuse.

#### `Tex img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `private CachedImage img_c`
- Role: Caches the img c value.
- Description: Caches the `img_c` value for reuse.

#### `private Map<String, CachedImage> olimg_c = new HashMap<>()`
- Role: Cached overlays rendered for a specific map tag.
- Description: Cached overlay images keyed by overlay tag.

#### `private Collection<DisplayMarker> markers = Collections.emptyList()`
- Role: Cached display markers for the current map state.
- Description: Current set of display markers used by the minimap renderer.

#### `private int markerseq = -1`
- Role: Caches the markerseq value.
- Description: Caches the `markerseq` value for reuse.

#### `private UI.Grab drag`
- Role: Caches the drag value.
- Description: Caches the `drag` value for reuse.

#### `private boolean dragging`
- Role: Tracks whether dragging is enabled.
- Description: Handles the dragging operation for this class.

#### `private Coord dsc, dmc`
- Role: Caches the dmc value.
- Description: Caches the `dmc` value for reuse.

#### `private Coord dsc, dmc`
- Role: Caches the dmc value.
- Description: Caches the `dmc` value for reuse.

#### `private Location dsloc`
- Role: Caches the dsloc value.
- Description: Caches the `dsloc` value for reuse.

#### `private DisplayIcon dsicon`
- Role: Caches the dsicon value.
- Description: Caches the `dsicon` value for reuse.

#### `private DisplayMarker dsmark`
- Role: Caches the dsmark value.
- Description: Caches the `dsmark` value for reuse.

#### `private String lasttname = null`
- Role: Caches the last tname.
- Description: Caches the last tname value.

#### `private Object lastobjid = null`
- Role: Caches the last objid.
- Description: Caches the last objid value.

#### `private Tex lasttip = null`
- Role: Caches the last tip.
- Description: Caches the last tip value.

### Methods

#### `public MiniMap(Coord sz, MapFile file)`
- Role: Creates a new MiniMap instance.
- Description: Constructs the MiniMap instance from the supplied inputs.

#### `public MiniMap(MapFile file)`
- Role: Creates a new MiniMap instance.
- Description: Constructs the MiniMap instance from the supplied inputs.

#### `protected void attached()`
- Role: Implements the attached operation.
- Description: Implements the attached operation.

#### `public Location(Segment seg, Coord tc)`
- Role: Implements the location operation.
- Description: Implements the location operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this MiniMap for debugging and logging.

#### `Location locate(MapFile file) throws Loading`
- Role: Handles the locate workflow.
- Description: Handles the locate operation for this class.

#### `public SessionLocator(Session sess)`
- Role: Implements the session locator operation.
- Description: Implements the session locator operation.

#### `public Location locate(MapFile file)`
- Role: Resolves a location from the current client state.
- Description: Resolves a location from the current client state.

#### `public MapLocator(MapView mv)`
- Role: Implements the map locator operation.
- Description: Implements the map locator operation.

#### `public Location locate(MapFile file)`
- Role: Resolves a location from the current client state.
- Description: Resolves a location from the current client state.

#### `public SpecLocator(long seg, Coord tc)`
- Role: Implements the spec locator operation.
- Description: Implements the spec locator operation.

#### `public Location locate(MapFile file)`
- Role: Resolves a location from the current client state.
- Description: Resolves a location from the current client state.

#### `public MarkerIcon(Markers o, Marker m)`
- Role: Implements the marker icon operation.
- Description: Implements the marker icon operation.

#### `public <T> T context(Class<T> cl)`
- Role: Resolves owner context for marker icons.
- Description: Resolves the requested owner-context value for this marker icon.

#### `private GobIcon.Icon create()`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private void ckload()`
- Role: Implements the ckload operation.
- Description: Implements the ckload operation.

#### `private void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public GobIcon.Icon icon()`
- Role: Implements the icon operation.
- Description: Implements the icon operation.

#### `public String name()`
- Role: Implements the name operation.
- Description: Implements the name operation.

#### `public List<ItemInfo> info()`
- Role: Implements the info operation.
- Description: Implements the info operation.

#### `private Markers(MiniMap mm)`
- Role: Implements the markers operation.
- Description: Implements the markers operation.

#### `private void update0()`
- Role: Updates the 0.
- Description: Updates the 0.

#### `private void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public MarkerIcon get(Marker m)`
- Role: Returns the cached get.
- Description: Returns the cached get.

#### `public Collection<? extends MarkerIcon> known()`
- Role: Implements the known operation.
- Description: Implements the known operation.

#### `public void center(Location loc)`
- Role: Updates the current center location.
- Description: Updates the current center location.

#### `public Location resolve(Locator loc)`
- Role: Resolves the target value.
- Description: Handles the resolve operation for this class.

#### `public Coord xlate(Location loc)`
- Role: Implements the xlate operation.
- Description: Implements the xlate operation.

#### `public Location xlate(Coord sc)`
- Role: Implements the xlate operation.
- Description: Implements the xlate operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void center(Locator loc)`
- Role: Updates the current center location.
- Description: Updates the current center location.

#### `public void follow(Locator loc)`
- Role: Sets follow mode around the requested locator.
- Description: Sets follow mode around the requested locator.

#### `public Scale2D(Coord cc, float f)`
- Role: Implements the scale2 d operation.
- Description: Implements the scale2 d operation.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public DisplayIcon(GobIcon attr, GobIcon.Setting conf)`
- Role: Implements the display icon operation.
- Description: Implements the display icon operation.

#### `public void update(Coord2d rc, double ang)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void dispupdate()`
- Role: Implements the dispupdate operation.
- Description: Implements the dispupdate operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the MiniMap content.

#### `public boolean force()`
- Role: Implements the force operation.
- Description: Implements the force operation.

#### `public MarkerID(Gob gob, Marker mark)`
- Role: Implements the marker id operation.
- Description: Implements the marker id operation.

#### `public static Gob find(OCache oc, Marker mark)`
- Role: Implements the find operation.
- Description: Finds the requested data.

#### `public Flag(OwnerContext owner, Color col, String name)`
- Role: Implements the flag operation.
- Description: Implements the flag operation.

#### `public String name()`
- Role: Implements the name operation.
- Description: Implements the name operation.

#### `public BufferedImage image()`
- Role: Implements the image operation.
- Description: Implements the image operation.

#### `public void draw(GOut g, Coord c)`
- Role: Draws the current content.
- Description: Draws the MiniMap content.

#### `public boolean checkhit(Coord c)`
- Role: Implements the checkhit operation.
- Description: Implements the checkhit operation.

#### `public Object[] id()`
- Role: Implements the id operation.
- Description: Implements the id operation.

#### `public DisplayMarker(MiniMap mm, Marker marker)`
- Role: Implements the display marker operation.
- Description: Implements the display marker operation.

#### `public GobIcon.Icon icon()`
- Role: Implements the icon operation.
- Description: Implements the icon operation.

#### `public void dispupdate()`
- Role: Implements the dispupdate operation.
- Description: Implements the dispupdate operation.

#### `public void draw(GOut g, Coord c)`
- Role: Draws the current content.
- Description: Draws the MiniMap content.

#### `public BufferedImage tooltip()`
- Role: Returns the tooltip for the given cursor position.
- Description: Returns the cached tooltip image for the marker, rebuilding it when the marker info changes.

#### `public DisplayGrid(MiniMap mm, Segment seg, Coord sc, int lvl, Indir<? extends DataGrid> gref)`
- Role: Implements the display grid operation.
- Description: Implements the display grid operation.

#### `CachedImage(Function<DataGrid, Defer.Future<Tex>> src)`
- Role: Handles the cached image workflow.
- Description: Handles the cached image operation for this class.

#### `public Tex get()`
- Role: Returns the cached get.
- Description: Returns the cached get.

#### `public Tex img()`
- Role: Implements the img operation.
- Description: Implements the img operation.

#### `public Tex olimg(String tag)`
- Role: Implements the olimg operation.
- Description: Implements the olimg operation.

#### `public Collection<DisplayMarker> markers(boolean remark)`
- Role: Implements the markers operation.
- Description: Implements the markers operation.

#### `private Coord l2dscale(Coord c)`
- Role: Implements the l2dscale operation.
- Description: Implements the l2dscale operation.

#### `private Coord d2lscale(Coord c)`
- Role: Implements the d2lscale operation.
- Description: Implements the d2lscale operation.

#### `public Coord st2c(Coord tc)`
- Role: Implements the st2c operation.
- Description: Implements the st2c operation.

#### `public Coord p2c(Coord2d pc)`
- Role: Implements the p2c operation.
- Description: Implements the p2c operation.

#### `private void redisplay(Location loc)`
- Role: Implements the redisplay operation.
- Description: Implements the redisplay operation.

#### `public void drawgrid(GOut g, Coord ul, DisplayGrid disp)`
- Role: Draws one rendered grid slice.
- Description: Draws one rendered grid slice.

#### `public void drawmap(GOut g)`
- Role: Draws every visible grid slice.
- Description: Draws every visible grid slice.

#### `public void drawmarkers(GOut g)`
- Role: Draws marker icons that fall inside the visible area.
- Description: Draws marker icons that fall inside the visible area.

#### `public List<DisplayIcon> findicons(Collection<? extends DisplayIcon> prev)`
- Role: Finds the icons.
- Description: Finds the icons.

#### `public void drawicons(GOut g)`
- Role: Draws gob icons that should be shown on the minimap.
- Description: Draws gob icons that should be shown on the minimap.

#### `public void remparty()`
- Role: Implements the remparty operation.
- Description: Implements the remparty operation.

#### `public void drawparty(GOut g)`
- Role: Draws party member markers on the minimap.
- Description: Draws party member markers on the minimap.

#### `public void drawparts(GOut g)`
- Role: Draws the combined minimap layers in order.
- Description: Draws the combined minimap layers in order.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the MiniMap content.

#### `private static boolean hascomplete(DisplayGrid[] disp, Area dext, Coord c)`
- Role: Returns whether the complete is present.
- Description: Returns whether the complete is present.

#### `protected boolean allowzoomout()`
- Role: Implements the allowzoomout operation.
- Description: Implements the allowzoomout operation.

#### `public DisplayIcon iconat(Coord c)`
- Role: Implements the iconat operation.
- Description: Implements the iconat operation.

#### `public DisplayGrid gridat(Coord sc)`
- Role: Implements the gridat operation.
- Description: Implements the gridat operation.

#### `public DisplayMarker findmarker(Marker rm)`
- Role: Finds the marker.
- Description: Finds the marker.

#### `public DisplayMarker markerat(Coord tc)`
- Role: Implements the markerat operation.
- Description: Implements the markerat operation.

#### `public void markobjs()`
- Role: Marks visible gobs in the map file when their marker data is missing or stale.
- Description: Marks visible gobs in the map file when their marker data is missing or stale.

#### `public boolean filter(DisplayIcon icon)`
- Role: Implements the filter operation.
- Description: Implements the filter operation.

#### `public boolean filter(DisplayMarker marker)`
- Role: Implements the filter operation.
- Description: Implements the filter operation.

#### `public boolean clickloc(Location loc, int button, boolean press)`
- Role: Handles loc interaction.
- Description: Handles loc interaction.

#### `public boolean clickicon(DisplayIcon icon, Location loc, int button, boolean press)`
- Role: Handles icon interaction.
- Description: Handles icon interaction.

#### `public boolean clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`
- Role: Handles marker interaction.
- Description: Handles marker interaction.

#### `public boolean dragp(int button)`
- Role: Implements the dragp operation.
- Description: Implements the dragp operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Handles the mousedown operation for this class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Updates drag state while the mouse moves across the minimap.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Finishes a drag or click interaction on the minimap.
- Description: Finishes a drag or click interaction on the minimap.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Zooms or pans the minimap in response to the mouse wheel.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`
- Role: Updates hover state and tooltip selection for minimap content.
- Description: Updates hover state and tooltip selection for minimap content.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Resolves the terrain and object tooltip under the current cursor position.

#### `public void mvclick(MapView mv, Coord mc, Location loc, Gob gob, int button)`
- Role: Implements the mvclick operation.
- Description: Implements the mvclick operation.