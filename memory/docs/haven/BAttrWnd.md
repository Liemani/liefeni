# BAttrWnd

This file documents the responsibilities and members of `BAttrWnd`.

## Meta

- Source: [BAttrWnd.java](../../../src/haven/BAttrWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays body attribute information.

## Nested Types

### $_

- Description: TODO

### Attr

- Description: TODO

### Constipations

- Description: TODO

### El

- Description: TODO

### Event

- Description: TODO

### FoodMeter

- Description: TODO

### GlutMeter

- Description: TODO

### Item

- Description: TODO

### ItemIcon

- Description: TODO

### Reordered

- Description: TODO

## Members

### Constants

#### `public static final PUtils.Convolution tflt = new PUtils.Hanning(1)`

- Description: TODO

#### `public static final Color hilit = new Color(255, 255, 0, 48)`

- Description: TODO

#### `public static final Color buffed = new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`

- Description: TODO

#### `public static final Color buffed = new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`

- Description: TODO

#### `public static final Color buffed = new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`

- Description: TODO

#### `public static final Comparator<El> ecmp = (a, b) ->`

- Description: TODO

#### `public static final Tex frame = Resource.loadtex("gfx/hud/chr/foodm")`

- Description: TODO

#### `public static final Coord marg = new Coord(5, 5), trmg = new Coord(10, 10)`

- Description: TODO

#### `public static final Coord marg = new Coord(5, 5), trmg = new Coord(10, 10)`

- Description: TODO

#### `public static final Comparator<El> dcmp = new Comparator<El>()`

- Description: TODO

#### `public static final Tex frame = Resource.loadtex("gfx/hud/chr/glutm")`

- Description: TODO

#### `public static final Coord marg = new Coord(5, 5)`

- Description: TODO

### Fields

#### `public final List<Attr> attrs`

- Description: TODO

#### `public final FoodMeter feps`

- Description: TODO

#### `public final Constipations cons`

- Description: TODO

#### `public final GlutMeter glut`

- Description: TODO

#### `public final Text rnm`

- Description: TODO

#### `public final Tex img`

- Description: TODO

#### `public final Color bg`

- Description: TODO

#### `private double lvlt = 0.0`

- Description: TODO

#### `private Text ct`

- Description: TODO

#### `private int cbv = -1, ccv = -1`

- Description: TODO

#### `private int cbv = -1, ccv = -1`

- Description: TODO

#### `public final List<El> els = new ArrayList<El>()`

- Description: TODO

#### `public final ResData t`

- Description: TODO

#### `public double a`

- Description: TODO

#### `private boolean hl`

- Description: TODO

#### `private final List<T> back`

- Description: TODO

#### `private final Comparator<? super T> cmp`

- Description: TODO

#### `private Integer[] order =`

- Description: TODO

#### `private final Reordered<El> oels = new Reordered<>(els, ecmp)`

- Description: TODO

#### `public final ItemSpec spec`

- Description: TODO

#### `public final El el`

- Description: TODO

#### `private Widget nm, a`

- Description: TODO

#### `private Widget nm, a`

- Description: TODO

#### `private double da = Double.NaN`

- Description: TODO

#### `private ItemInfo.InfoTip lasttip = null`

- Description: TODO

#### `public double cap`

- Description: TODO

#### `public List<El> els = new LinkedList<El>()`

- Description: TODO

#### `private List<El> enew = null, etr = null`

- Description: TODO

#### `private List<El> enew = null, etr = null`

- Description: TODO

#### `private Indir<Resource> trev = null`

- Description: TODO

#### `private Tex trol`

- Description: TODO

#### `private double trtm = 0`

- Description: TODO

#### `public final Color col`

- Description: TODO

#### `public final String nm`

- Description: TODO

#### `public final int sort`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public double a`

- Description: TODO

#### `private Event ev = null`

- Description: TODO

#### `private Tex rtip = null`

- Description: TODO

#### `public Color fg = Color.BLACK, bg = Color.BLACK`

- Description: TODO

#### `public Color fg = Color.BLACK, bg = Color.BLACK`

- Description: TODO

#### `public double glut, lglut, gmod`

- Description: TODO

#### `public double glut, lglut, gmod`

- Description: TODO

#### `public double glut, lglut, gmod`

- Description: TODO

#### `public String lbl`

- Description: TODO

#### `private Tex rtip = null`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `private Attr(Glob glob, String attr, Color bg)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void lvlup()`

- Description: TODO

#### `public El(ResData t, double a)`

- Description: TODO

#### `public void update(double a)`

- Description: TODO

#### `public Constipations(Coord sz)`

- Description: TODO

#### `public Reordered(List<T> back, Comparator<? super T> cmp)`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public T get(int i)`

- Description: TODO

#### `public void update()`

- Description: TODO

#### `protected List<El> items()`

- Description: TODO

#### `protected Widget makeitem(El el, int idx, Coord sz)`

- Description: TODO

#### `public ItemIcon(Coord sz, ItemSpec spec)`

- Description: TODO

#### `protected BufferedImage img()`

- Description: TODO

#### `protected String text()`

- Description: TODO

#### `protected PUtils.Convolution filter()`

- Description: TODO

#### `public Item(Coord sz, El el)`

- Description: TODO

#### `private void update()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `protected void drawslot(GOut g, El el, int idx, Area area)`

- Description: TODO

#### `public boolean unselect(int button)`

- Description: TODO

#### `public void update(ResData t, double a)`

- Description: TODO

#### `public Event(Resource res, Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public El(Indir<Resource> res, double a)`

- Description: TODO

#### `public Event ev()`

- Description: TODO

#### `public FoodMeter()`

- Description: TODO

#### `private BufferedImage mktrol(List<El> els, Indir<Resource> trev)`

- Description: TODO

#### `private void drawels(GOut g, List<El> els, int alpha)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void update(Object... args)`

- Description: TODO

#### `public void trig(Indir<Resource> ev)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public GlutMeter()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void update(Object... args)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public BAttrWnd(Glob glob)`

- Description: TODO

#### `public void uimsg(String nm, Object... args)`

- Description: TODO
