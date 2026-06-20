---
source: [MiniMap.java](../../../src/haven/MiniMap.java)
created: 2026-06-13
updated: 2026-06-14
---

# MiniMap

Represents the mini map Haven component.

## Nested Types

### CachedImage

- Role: Represents cached image within MiniMap.
- Description: Describes the nested cached image type used by the enclosing class.

### DisplayGrid

- Role: Represents display grid within MiniMap.
- Description: Describes the nested display grid type used by the enclosing class.

### DisplayIcon

- Role: Represents display icon within MiniMap.
- Description: Describes the nested display icon type used by the enclosing class.

### DisplayMarker

- Role: Represents display marker within MiniMap.
- Description: Describes the nested display marker type used by the enclosing class.

### Flag

- Role: Represents flag within MiniMap.
- Description: Describes the nested flag type used by the enclosing class.

### Location

- Role: Represents location within MiniMap.
- Description: Describes the nested location type used by the enclosing class.

### Locator

- Role: Represents locator within MiniMap.
- Description: Describes the nested locator type used by the enclosing class.

### MapLocator

- Role: Represents map locator within MiniMap.
- Description: Describes the nested map locator type used by the enclosing class.

### MarkerID

- Role: Represents marker id within MiniMap.
- Description: Describes the nested marker id type used by the enclosing class.

### MarkerIcon

- Role: Represents marker icon within MiniMap.
- Description: Describes the nested marker icon type used by the enclosing class.

### Markers

- Role: Represents markers within MiniMap.
- Description: Describes the nested markers type used by the enclosing class.

### Scale2D

- Role: Represents scale2 d within MiniMap.
- Description: Describes the nested scale2 d type used by the enclosing class.

### SessionLocator

- Role: Represents session locator within MiniMap.
- Description: Describes the nested session locator type used by the enclosing class.

### SpecLocator

- Role: Represents spec locator within MiniMap.
- Description: Describes the nested spec locator type used by the enclosing class.

## Members

### Constants

#### `public static final Tex bg = Resource.loadtex("gfx/hud/mmap/ptex")`
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex nomap = Resource.loadtex("gfx/hud/mmap/nomap")`
- Role: Defines the shared nomap constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex plp = ((TexI)Resource.loadtex("gfx/hud/mmap/plp")).filter(Texture.Filter.LINEAR)`
- Role: Defines the shared plp constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<MarkerIcon> ctxr = new OwnerContext.ClassResolver<MarkerIcon>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color notifcol = new Color(255, 128, 0, 255)`
- Role: Defines the shared notifcol constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Resource res = Resource.local().loadwait("gfx/hud/mmap/flag")`
- Role: Defines the shared res constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Resource.Image fg = res.flayer(Resource.imgc, 0)`
- Role: Defines the shared fg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Resource.Image bg = res.flayer(Resource.imgc, 1)`
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord cc = UI.scale(res.flayer(Resource.negc).cc)`
- Role: Defines the shared cc constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final MapFile file`
- Role: Stores the file value.
- Description: Backs the cached state for this file.

#### `public Markers markers = new Markers(this)`
- Role: Holds the markers state.
- Description: Backs the cached state for this file.

#### `public Location curloc`
- Role: Holds the curloc state.
- Description: Backs the cached state for this file.

#### `public Location sessloc`
- Role: Holds the sessloc state.
- Description: Backs the cached state for this file.

#### `public GobIcon.Settings iconconf`
- Role: Stores the iconconf value.
- Description: Backs the cached state for this file.

#### `public List<DisplayIcon> icons = Collections.emptyList()`
- Role: Caches icons entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected Locator setloc`
- Role: Holds the setloc state.
- Description: Backs the cached state for this file.

#### `protected boolean follow`
- Role: Tracks the follow flag.
- Description: Supports the follow operation used by the surrounding class.

#### `protected int zoomlevel = 0, maglevel = 1 << Utils.clip((int)Math.round(Math.log(UI.scale(1.0)) / Math.log(2)), 0, 3)`
- Role: Stores the zoomlevel value.
- Description: Backs the cached state for this file.

#### `protected int zoomlevel = 0, maglevel = 1 << Utils.clip((int)Math.round(Math.log(UI.scale(1.0)) / Math.log(2)), 0, 3)`
- Role: Stores the zoomlevel value.
- Description: Backs the cached state for this file.

#### `protected DisplayGrid[] display =`
- Role: Holds the mini map state.
- Description: Backs the cached state for this file.

#### `protected Area dgext, dtext`
- Role: Holds the dtext state.
- Description: Backs the cached state for this file.

#### `protected Area dgext, dtext`
- Role: Holds the dtext state.
- Description: Backs the cached state for this file.

#### `protected Segment dseg`
- Role: Stores the dseg value.
- Description: Backs the cached state for this file.

#### `protected int dlvl, dmag`
- Role: Stores the dmag value.
- Description: Backs the cached state for this file.

#### `protected int dlvl, dmag`
- Role: Stores the dmag value.
- Description: Backs the cached state for this file.

#### `protected Location dloc`
- Role: Holds the dloc state.
- Description: Backs the cached state for this file.

#### `public final Segment seg`
- Role: Stores the seg value.
- Description: Backs the cached state for this file.

#### `public final Coord tc`
- Role: Stores the tc value.
- Description: Backs the cached state for this file.

#### `public final Session sess`
- Role: Stores the sess value.
- Description: Backs the cached state for this file.

#### `private MCache.Grid lastgrid = null`
- Role: Caches lastgrid entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Location lastloc`
- Role: Holds the lastloc state.
- Description: Backs the cached state for this file.

#### `public final MapView mv`
- Role: Stores the mv value.
- Description: Backs the cached state for this file.

#### `public final long seg`
- Role: Stores the seg value.
- Description: Backs the cached state for this file.

#### `public final Coord tc`
- Role: Stores the tc value.
- Description: Backs the cached state for this file.

#### `public final Markers o`
- Role: Holds the o state.
- Description: Backs the cached state for this file.

#### `public final Marker m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `private final Loader loader`
- Role: Holds the loader state.
- Description: Backs the cached state for this file.

#### `private Loader.Future<GobIcon.Icon> load`
- Role: Stores the load value.
- Description: Backs the cached state for this file.

#### `private GobIcon.Icon icon`
- Role: Stores the icon value.
- Description: Backs the cached state for this file.

#### `private int lseq, iseq`
- Role: Stores the iseq value.
- Description: Backs the cached state for this file.

#### `private int lseq, iseq`
- Role: Stores the iseq value.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> info = null`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final MiniMap mm`
- Role: Caches mm entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int seq`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `private final Map<Marker, MarkerIcon> icons = new HashMap<>()`
- Role: Caches icons entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private volatile int mseq = -1`
- Role: Stores the mseq value.
- Description: Backs the cached state for this file.

#### `private volatile Future<?> updater = null`
- Role: Holds the updater state.
- Description: Backs the cached state for this file.

#### `private boolean loading`
- Role: Tracks the loading flag.
- Description: Supports the loading operation used by the surrounding class.

#### `private Locator sesslocator`
- Role: Holds the sesslocator state.
- Description: Backs the cached state for this file.

#### `public final Coord cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `public final float f`
- Role: Stores the f value.
- Description: Backs the cached state for this file.

#### `public final GobIcon attr`
- Role: Stores the attr value.
- Description: Backs the cached state for this file.

#### `public final Gob gob`
- Role: Stores the gob value.
- Description: Backs the cached state for this file.

#### `public final GobIcon.Icon icon`
- Role: Stores the icon value.
- Description: Backs the cached state for this file.

#### `public final GobIcon.Setting conf`
- Role: Stores the conf value.
- Description: Backs the cached state for this file.

#### `public Coord2d rc = null`
- Role: Stores the rc value.
- Description: Backs the cached state for this file.

#### `public Coord sc = null`
- Role: Stores the sc value.
- Description: Backs the cached state for this file.

#### `public double ang = 0.0`
- Role: Stores the ang value.
- Description: Backs the cached state for this file.

#### `public int z`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public double stime, ntime`
- Role: Stores the ntime value.
- Description: Backs the cached state for this file.

#### `public double stime, ntime`
- Role: Stores the ntime value.
- Description: Backs the cached state for this file.

#### `public boolean notify`
- Role: Tracks the notify flag.
- Description: Supports the notify operation used by the surrounding class.

#### `private Consumer<UI> snotify`
- Role: Stores the snotify value.
- Description: Backs the cached state for this file.

#### `private boolean markchecked`
- Role: Tracks the markchecked flag.
- Description: Supports the markchecked operation used by the surrounding class.

#### `public final Marker mark`
- Role: Holds the mark state.
- Description: Backs the cached state for this file.

#### `public final Color col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final MiniMap mm`
- Role: Caches mm entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Marker m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `public Coord sc = null`
- Role: Stores the sc value.
- Description: Backs the cached state for this file.

#### `private int tseq = -1`
- Role: Stores the tseq value.
- Description: Backs the cached state for this file.

#### `private BufferedImage tooltip = null`
- Role: Stores the tooltip value.
- Description: Backs the cached state for this file.

#### `public final MiniMap mm`
- Role: Caches mm entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final MapFile file`
- Role: Stores the file value.
- Description: Backs the cached state for this file.

#### `public final Segment seg`
- Role: Stores the seg value.
- Description: Backs the cached state for this file.

#### `public final Coord sc`
- Role: Stores the sc value.
- Description: Backs the cached state for this file.

#### `public final Area mapext`
- Role: Holds the mapext state.
- Description: Backs the cached state for this file.

#### `public final Indir<? extends DataGrid> gref`
- Role: Stores the gref value.
- Description: Backs the cached state for this file.

#### `public Coord dc`
- Role: Stores the dc value.
- Description: Backs the cached state for this file.

#### `private Tex img = null`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `private Defer.Future<Tex> nextimg = null`
- Role: Stores the nextimg value.
- Description: Backs the cached state for this file.

#### `final Function<DataGrid, Defer.Future<Tex>> src`
- Role: Stores the src value.
- Description: Backs the cached state for this file.

#### `DataGrid cgrid`
- Role: Stores the cgrid value.
- Description: Backs the cached state for this file.

#### `Defer.Future<Tex> next`
- Role: Stores the next value.
- Description: Backs the cached state for this file.

#### `Tex img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `private CachedImage img_c`
- Role: Stores the img c value.
- Description: Backs the cached state for this file.

#### `private Map<String, CachedImage> olimg_c = new HashMap<>()`
- Role: Caches olimg c entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Collection<DisplayMarker> markers = Collections.emptyList()`
- Role: Caches markers entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int markerseq = -1`
- Role: Stores the markerseq value.
- Description: Backs the cached state for this file.

#### `private UI.Grab drag`
- Role: Stores the drag value.
- Description: Backs the cached state for this file.

#### `private boolean dragging`
- Role: Tracks the dragging flag.
- Description: Supports the dragging operation used by the surrounding class.

#### `private Coord dsc, dmc`
- Role: Stores the dmc value.
- Description: Backs the cached state for this file.

#### `private Coord dsc, dmc`
- Role: Stores the dmc value.
- Description: Backs the cached state for this file.

#### `private Location dsloc`
- Role: Holds the dsloc state.
- Description: Backs the cached state for this file.

#### `private DisplayIcon dsicon`
- Role: Holds the dsicon state.
- Description: Backs the cached state for this file.

#### `private DisplayMarker dsmark`
- Role: Holds the dsmark state.
- Description: Backs the cached state for this file.

#### `private String lasttname = null`
- Role: Stores the lasttname value.
- Description: Backs the cached state for this file.

#### `private Object lastobjid = null`
- Role: Holds the lastobjid state.
- Description: Backs the cached state for this file.

#### `private Tex lasttip = null`
- Role: Stores the lasttip value.
- Description: Backs the cached state for this file.

### Methods

#### `public MiniMap(Coord sz, MapFile file)`
- Role: Creates a new MiniMap instance.
- Description: Constructs the instance and initializes its default state.

#### `public MiniMap(MapFile file)`
- Role: Creates a new MiniMap instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void attached()`
- Role: Performs attached.
- Description: Supports the attached operation used by the surrounding class.

#### `public Location(Segment seg, Coord tc)`
- Role: Performs location.
- Description: Supports the location operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `Location locate(MapFile file) throws Loading`
- Role: Handles the locate workflow.
- Description: Supports the locate operation used by the surrounding class.

#### `public SessionLocator(Session sess)`
- Role: Performs session locator.
- Description: Supports the session locator operation used by the surrounding class.

#### `public Location locate(MapFile file)`
- Role: Performs locate.
- Description: Supports the locate operation used by the surrounding class.

#### `public MapLocator(MapView mv)`
- Role: Performs map locator.
- Description: Supports the map locator operation used by the surrounding class.

#### `public Location locate(MapFile file)`
- Role: Performs locate.
- Description: Supports the locate operation used by the surrounding class.

#### `public SpecLocator(long seg, Coord tc)`
- Role: Performs spec locator.
- Description: Supports the spec locator operation used by the surrounding class.

#### `public Location locate(MapFile file)`
- Role: Performs locate.
- Description: Supports the locate operation used by the surrounding class.

#### `public MarkerIcon(Markers o, Marker m)`
- Role: Performs marker icon.
- Description: Supports the marker icon operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `private GobIcon.Icon create()`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private void ckload()`
- Role: Performs ckload.
- Description: Supports the ckload operation used by the surrounding class.

#### `private void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public GobIcon.Icon icon()`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `private Markers(MiniMap mm)`
- Role: Performs markers.
- Description: Supports the markers operation used by the surrounding class.

#### `private void update0()`
- Role: Performs update0.
- Description: Supports the update0 operation used by the surrounding class.

#### `private void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public MarkerIcon get(Marker m)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Collection<? extends MarkerIcon> known()`
- Role: Performs known.
- Description: Supports the known operation used by the surrounding class.

#### `public void center(Location loc)`
- Role: Performs center.
- Description: Supports the center operation used by the surrounding class.

#### `public Location resolve(Locator loc)`
- Role: Resolves the target value.
- Description: Supports the resolve operation used by the surrounding class.

#### `public Coord xlate(Location loc)`
- Role: Performs xlate.
- Description: Supports the xlate operation used by the surrounding class.

#### `public Location xlate(Coord sc)`
- Role: Performs xlate.
- Description: Supports the xlate operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void center(Locator loc)`
- Role: Performs center.
- Description: Supports the center operation used by the surrounding class.

#### `public void follow(Locator loc)`
- Role: Performs follow.
- Description: Supports the follow operation used by the surrounding class.

#### `public Scale2D(Coord cc, float f)`
- Role: Performs scale2 d.
- Description: Supports the scale2 d operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public DisplayIcon(GobIcon attr, GobIcon.Setting conf)`
- Role: Performs display icon.
- Description: Supports the display icon operation used by the surrounding class.

#### `public void update(Coord2d rc, double ang)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void dispupdate()`
- Role: Performs dispupdate.
- Description: Supports the dispupdate operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean force()`
- Role: Performs force.
- Description: Supports the force operation used by the surrounding class.

#### `public MarkerID(Gob gob, Marker mark)`
- Role: Performs marker id.
- Description: Supports the marker id operation used by the surrounding class.

#### `public static Gob find(OCache oc, Marker mark)`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `public Flag(OwnerContext owner, Color col, String name)`
- Role: Performs flag.
- Description: Supports the flag operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public BufferedImage image()`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void draw(GOut g, Coord c)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public Object[] id()`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public DisplayMarker(MiniMap mm, Marker marker)`
- Role: Performs display marker.
- Description: Supports the display marker operation used by the surrounding class.

#### `public GobIcon.Icon icon()`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public void dispupdate()`
- Role: Performs dispupdate.
- Description: Supports the dispupdate operation used by the surrounding class.

#### `public void draw(GOut g, Coord c)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public BufferedImage tooltip()`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public DisplayGrid(MiniMap mm, Segment seg, Coord sc, int lvl, Indir<? extends DataGrid> gref)`
- Role: Performs display grid.
- Description: Supports the display grid operation used by the surrounding class.

#### `CachedImage(Function<DataGrid, Defer.Future<Tex>> src)`
- Role: Handles the cached image workflow.
- Description: Supports the cached image operation used by the surrounding class.

#### `public Tex get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Tex img()`
- Role: Performs img.
- Description: Supports the img operation used by the surrounding class.

#### `public Tex olimg(String tag)`
- Role: Performs olimg.
- Description: Supports the olimg operation used by the surrounding class.

#### `public Collection<DisplayMarker> markers(boolean remark)`
- Role: Performs markers.
- Description: Supports the markers operation used by the surrounding class.

#### `private Coord l2dscale(Coord c)`
- Role: Performs l2dscale.
- Description: Supports the l2dscale operation used by the surrounding class.

#### `private Coord d2lscale(Coord c)`
- Role: Performs d2lscale.
- Description: Supports the d2lscale operation used by the surrounding class.

#### `public Coord st2c(Coord tc)`
- Role: Performs st2c.
- Description: Supports the st2c operation used by the surrounding class.

#### `public Coord p2c(Coord2d pc)`
- Role: Performs p2c.
- Description: Supports the p2c operation used by the surrounding class.

#### `private void redisplay(Location loc)`
- Role: Performs redisplay.
- Description: Supports the redisplay operation used by the surrounding class.

#### `public void drawgrid(GOut g, Coord ul, DisplayGrid disp)`
- Role: Performs drawgrid.
- Description: Supports the drawgrid operation used by the surrounding class.

#### `public void drawmap(GOut g)`
- Role: Performs drawmap.
- Description: Supports the drawmap operation used by the surrounding class.

#### `public void drawmarkers(GOut g)`
- Role: Performs drawmarkers.
- Description: Supports the drawmarkers operation used by the surrounding class.

#### `public List<DisplayIcon> findicons(Collection<? extends DisplayIcon> prev)`
- Role: Performs findicons.
- Description: Supports the findicons operation used by the surrounding class.

#### `public void drawicons(GOut g)`
- Role: Performs drawicons.
- Description: Supports the drawicons operation used by the surrounding class.

#### `public void remparty()`
- Role: Performs remparty.
- Description: Supports the remparty operation used by the surrounding class.

#### `public void drawparty(GOut g)`
- Role: Performs drawparty.
- Description: Supports the drawparty operation used by the surrounding class.

#### `public void drawparts(GOut g)`
- Role: Performs drawparts.
- Description: Supports the drawparts operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private static boolean hascomplete(DisplayGrid[] disp, Area dext, Coord c)`
- Role: Performs hascomplete.
- Description: Supports the hascomplete operation used by the surrounding class.

#### `protected boolean allowzoomout()`
- Role: Performs allowzoomout.
- Description: Supports the allowzoomout operation used by the surrounding class.

#### `public DisplayIcon iconat(Coord c)`
- Role: Performs iconat.
- Description: Supports the iconat operation used by the surrounding class.

#### `public DisplayGrid gridat(Coord sc)`
- Role: Performs gridat.
- Description: Supports the gridat operation used by the surrounding class.

#### `public DisplayMarker findmarker(Marker rm)`
- Role: Performs findmarker.
- Description: Supports the findmarker operation used by the surrounding class.

#### `public DisplayMarker markerat(Coord tc)`
- Role: Performs markerat.
- Description: Supports the markerat operation used by the surrounding class.

#### `public void markobjs()`
- Role: Performs markobjs.
- Description: Supports the markobjs operation used by the surrounding class.

#### `public boolean filter(DisplayIcon icon)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public boolean filter(DisplayMarker marker)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public boolean clickloc(Location loc, int button, boolean press)`
- Role: Performs clickloc.
- Description: Supports the clickloc operation used by the surrounding class.

#### `public boolean clickicon(DisplayIcon icon, Location loc, int button, boolean press)`
- Role: Performs clickicon.
- Description: Supports the clickicon operation used by the surrounding class.

#### `public boolean clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`
- Role: Performs clickmarker.
- Description: Supports the clickmarker operation used by the surrounding class.

#### `public boolean dragp(int button)`
- Role: Performs dragp.
- Description: Supports the dragp operation used by the surrounding class.

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

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`
- Role: Performs mousehover.
- Description: Supports the mousehover operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public void mvclick(MapView mv, Coord mc, Location loc, Gob gob, int button)`
- Role: Performs mvclick.
- Description: Supports the mvclick operation used by the surrounding class.
