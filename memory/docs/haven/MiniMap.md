# MiniMap

This file documents the responsibilities and members of `MiniMap`.

## Meta

- Source: [MiniMap.java](../../../src/haven/MiniMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the minimap.

## Nested Types

### CachedImage

- Description: TODO

### DisplayGrid

- Description: TODO

### DisplayIcon

- Description: TODO

### DisplayMarker

- Description: TODO

### Flag

- Description: TODO

### Location

- Description: TODO

### Locator

- Description: TODO

### MapLocator

- Description: TODO

### MarkerID

- Description: TODO

### MarkerIcon

- Description: TODO

### Markers

- Description: TODO

### Scale2D

- Description: TODO

### SessionLocator

- Description: TODO

### SpecLocator

- Description: TODO

## Members

### Constants

#### `public static final Tex bg = Resource.loadtex("gfx/hud/mmap/ptex")`

- Description: TODO

#### `public static final Tex nomap = Resource.loadtex("gfx/hud/mmap/nomap")`

- Description: TODO

#### `public static final Tex plp = ((TexI)Resource.loadtex("gfx/hud/mmap/plp")).filter(Texture.Filter.LINEAR)`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<MarkerIcon> ctxr = new OwnerContext.ClassResolver<MarkerIcon>()`

- Description: TODO

#### `public static final Color notifcol = new Color(255, 128, 0, 255)`

- Description: TODO

#### `public static final Resource res = Resource.local().loadwait("gfx/hud/mmap/flag")`

- Description: TODO

#### `public static final Resource.Image fg = res.flayer(Resource.imgc, 0)`

- Description: TODO

#### `public static final Resource.Image bg = res.flayer(Resource.imgc, 1)`

- Description: TODO

#### `public static final Coord cc = UI.scale(res.flayer(Resource.negc).cc)`

- Description: TODO

### Fields

#### `public final MapFile file`

- Description: TODO

#### `public Markers markers = new Markers(this)`

- Description: TODO

#### `public Location curloc`

- Description: TODO

#### `public Location sessloc`

- Description: TODO

#### `public GobIcon.Settings iconconf`

- Description: TODO

#### `public List<DisplayIcon> icons = Collections.emptyList()`

- Description: TODO

#### `protected Locator setloc`

- Description: TODO

#### `protected boolean follow`

- Description: TODO

#### `protected int zoomlevel = 0, maglevel = 1 << Utils.clip((int)Math.round(Math.log(UI.scale(1.0)) / Math.log(2)), 0, 3)`

- Description: TODO

#### `protected int zoomlevel = 0, maglevel = 1 << Utils.clip((int)Math.round(Math.log(UI.scale(1.0)) / Math.log(2)), 0, 3)`

- Description: TODO

#### `protected DisplayGrid[] display =`

- Description: TODO

#### `protected Area dgext, dtext`

- Description: TODO

#### `protected Area dgext, dtext`

- Description: TODO

#### `protected Segment dseg`

- Description: TODO

#### `protected int dlvl, dmag`

- Description: TODO

#### `protected int dlvl, dmag`

- Description: TODO

#### `protected Location dloc`

- Description: TODO

#### `public final Segment seg`

- Description: TODO

#### `public final Coord tc`

- Description: TODO

#### `public final Session sess`

- Description: TODO

#### `private MCache.Grid lastgrid = null`

- Description: TODO

#### `private Location lastloc`

- Description: TODO

#### `public final MapView mv`

- Description: TODO

#### `public final long seg`

- Description: TODO

#### `public final Coord tc`

- Description: TODO

#### `public final Markers o`

- Description: TODO

#### `public final Marker m`

- Description: TODO

#### `private final Loader loader`

- Description: TODO

#### `private Loader.Future<GobIcon.Icon> load`

- Description: TODO

#### `private GobIcon.Icon icon`

- Description: TODO

#### `private int lseq, iseq`

- Description: TODO

#### `private int lseq, iseq`

- Description: TODO

#### `private List<ItemInfo> info = null`

- Description: TODO

#### `public final MiniMap mm`

- Description: TODO

#### `public int seq`

- Description: TODO

#### `private final Map<Marker, MarkerIcon> icons = new HashMap<>()`

- Description: TODO

#### `private volatile int mseq = -1`

- Description: TODO

#### `private volatile Future<?> updater = null`

- Description: TODO

#### `private boolean loading`

- Description: TODO

#### `private Locator sesslocator`

- Description: TODO

#### `public final Coord cc`

- Description: TODO

#### `public final float f`

- Description: TODO

#### `public final GobIcon attr`

- Description: TODO

#### `public final Gob gob`

- Description: TODO

#### `public final GobIcon.Icon icon`

- Description: TODO

#### `public final GobIcon.Setting conf`

- Description: TODO

#### `public Coord2d rc = null`

- Description: TODO

#### `public Coord sc = null`

- Description: TODO

#### `public double ang = 0.0`

- Description: TODO

#### `public int z`

- Description: TODO

#### `public double stime, ntime`

- Description: TODO

#### `public double stime, ntime`

- Description: TODO

#### `public boolean notify`

- Description: TODO

#### `private Consumer<UI> snotify`

- Description: TODO

#### `private boolean markchecked`

- Description: TODO

#### `public final Marker mark`

- Description: TODO

#### `public final Color col`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final MiniMap mm`

- Description: TODO

#### `public final Marker m`

- Description: TODO

#### `public Coord sc = null`

- Description: TODO

#### `private int tseq = -1`

- Description: TODO

#### `private BufferedImage tooltip = null`

- Description: TODO

#### `public final MiniMap mm`

- Description: TODO

#### `public final MapFile file`

- Description: TODO

#### `public final Segment seg`

- Description: TODO

#### `public final Coord sc`

- Description: TODO

#### `public final Area mapext`

- Description: TODO

#### `public final Indir<? extends DataGrid> gref`

- Description: TODO

#### `public Coord dc`

- Description: TODO

#### `private Tex img = null`

- Description: TODO

#### `private Defer.Future<Tex> nextimg = null`

- Description: TODO

#### `final Function<DataGrid, Defer.Future<Tex>> src`

- Description: TODO

#### `DataGrid cgrid`

- Description: TODO

#### `Defer.Future<Tex> next`

- Description: TODO

#### `Tex img`

- Description: TODO

#### `private CachedImage img_c`

- Description: TODO

#### `private Map<String, CachedImage> olimg_c = new HashMap<>()`

- Description: TODO

#### `private Collection<DisplayMarker> markers = Collections.emptyList()`

- Description: TODO

#### `private int markerseq = -1`

- Description: TODO

#### `private UI.Grab drag`

- Description: TODO

#### `private boolean dragging`

- Description: TODO

#### `private Coord dsc, dmc`

- Description: TODO

#### `private Coord dsc, dmc`

- Description: TODO

#### `private Location dsloc`

- Description: TODO

#### `private DisplayIcon dsicon`

- Description: TODO

#### `private DisplayMarker dsmark`

- Description: TODO

#### `private String lasttname = null`

- Description: TODO

#### `private Object lastobjid = null`

- Description: TODO

#### `private Tex lasttip = null`

- Description: TODO

### Methods

#### `public MiniMap(Coord sz, MapFile file)`

- Description: TODO

#### `public MiniMap(MapFile file)`

- Description: TODO

#### `protected void attached()`

- Description: TODO

#### `public Location(Segment seg, Coord tc)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `Location locate(MapFile file) throws Loading`

- Description: TODO

#### `public SessionLocator(Session sess)`

- Description: TODO

#### `public Location locate(MapFile file)`

- Description: TODO

#### `public MapLocator(MapView mv)`

- Description: TODO

#### `public Location locate(MapFile file)`

- Description: TODO

#### `public SpecLocator(long seg, Coord tc)`

- Description: TODO

#### `public Location locate(MapFile file)`

- Description: TODO

#### `public MarkerIcon(Markers o, Marker m)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `private GobIcon.Icon create()`

- Description: TODO

#### `private void ckload()`

- Description: TODO

#### `private void update()`

- Description: TODO

#### `public GobIcon.Icon icon()`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `private Markers(MiniMap mm)`

- Description: TODO

#### `private void update0()`

- Description: TODO

#### `private void update()`

- Description: TODO

#### `public MarkerIcon get(Marker m)`

- Description: TODO

#### `public Collection<? extends MarkerIcon> known()`

- Description: TODO

#### `public void center(Location loc)`

- Description: TODO

#### `public Location resolve(Locator loc)`

- Description: TODO

#### `public Coord xlate(Location loc)`

- Description: TODO

#### `public Location xlate(Coord sc)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void center(Locator loc)`

- Description: TODO

#### `public void follow(Locator loc)`

- Description: TODO

#### `public Scale2D(Coord cc, float f)`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public DisplayIcon(GobIcon attr, GobIcon.Setting conf)`

- Description: TODO

#### `public void update(Coord2d rc, double ang)`

- Description: TODO

#### `public void dispupdate()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean force()`

- Description: TODO

#### `public MarkerID(Gob gob, Marker mark)`

- Description: TODO

#### `public static Gob find(OCache oc, Marker mark)`

- Description: TODO

#### `public Flag(OwnerContext owner, Color col, String name)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public BufferedImage image()`

- Description: TODO

#### `public void draw(GOut g, Coord c)`

- Description: TODO

#### `public boolean checkhit(Coord c)`

- Description: TODO

#### `public Object[] id()`

- Description: TODO

#### `public DisplayMarker(MiniMap mm, Marker marker)`

- Description: TODO

#### `public GobIcon.Icon icon()`

- Description: TODO

#### `public void dispupdate()`

- Description: TODO

#### `public void draw(GOut g, Coord c)`

- Description: TODO

#### `public BufferedImage tooltip()`

- Description: TODO

#### `public DisplayGrid(MiniMap mm, Segment seg, Coord sc, int lvl, Indir<? extends DataGrid> gref)`

- Description: TODO

#### `CachedImage(Function<DataGrid, Defer.Future<Tex>> src)`

- Description: TODO

#### `public Tex get()`

- Description: TODO

#### `public Tex img()`

- Description: TODO

#### `public Tex olimg(String tag)`

- Description: TODO

#### `public Collection<DisplayMarker> markers(boolean remark)`

- Description: TODO

#### `private Coord l2dscale(Coord c)`

- Description: TODO

#### `private Coord d2lscale(Coord c)`

- Description: TODO

#### `public Coord st2c(Coord tc)`

- Description: TODO

#### `public Coord p2c(Coord2d pc)`

- Description: TODO

#### `private void redisplay(Location loc)`

- Description: TODO

#### `public void drawgrid(GOut g, Coord ul, DisplayGrid disp)`

- Description: TODO

#### `public void drawmap(GOut g)`

- Description: TODO

#### `public void drawmarkers(GOut g)`

- Description: TODO

#### `public List<DisplayIcon> findicons(Collection<? extends DisplayIcon> prev)`

- Description: TODO

#### `public void drawicons(GOut g)`

- Description: TODO

#### `public void remparty()`

- Description: TODO

#### `public void drawparty(GOut g)`

- Description: TODO

#### `public void drawparts(GOut g)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private static boolean hascomplete(DisplayGrid[] disp, Area dext, Coord c)`

- Description: TODO

#### `protected boolean allowzoomout()`

- Description: TODO

#### `public DisplayIcon iconat(Coord c)`

- Description: TODO

#### `public DisplayGrid gridat(Coord sc)`

- Description: TODO

#### `public DisplayMarker findmarker(Marker rm)`

- Description: TODO

#### `public DisplayMarker markerat(Coord tc)`

- Description: TODO

#### `public void markobjs()`

- Description: TODO

#### `public boolean filter(DisplayIcon icon)`

- Description: TODO

#### `public boolean filter(DisplayMarker marker)`

- Description: TODO

#### `public boolean clickloc(Location loc, int button, boolean press)`

- Description: TODO

#### `public boolean clickicon(DisplayIcon icon, Location loc, int button, boolean press)`

- Description: TODO

#### `public boolean clickmarker(DisplayMarker mark, Location loc, int button, boolean press)`

- Description: TODO

#### `public boolean dragp(int button)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public void mvclick(MapView mv, Coord mc, Location loc, Gob gob, int button)`

- Description: TODO
