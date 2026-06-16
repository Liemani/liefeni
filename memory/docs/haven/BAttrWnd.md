# BAttrWnd

This file documents the responsibilities and members of `BAttrWnd`.

## Meta

- Source: [BAttrWnd.java](../../../src/haven/BAttrWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the battr wnd Haven component.

## Nested Types

### $_

- Role: Represents $ within BAttrWnd.
- Description: Describes the nested $  type used by the enclosing class.

### Attr

- Role: Represents attr within BAttrWnd.
- Description: Describes the nested attr type used by the enclosing class.

### Constipations

- Role: Represents constipations within BAttrWnd.
- Description: Describes the nested constipations type used by the enclosing class.

### El

- Role: Represents el within BAttrWnd.
- Description: Describes the nested el type used by the enclosing class.

### Event

- Role: Represents event within BAttrWnd.
- Description: Describes the nested event type used by the enclosing class.

### FoodMeter

- Role: Represents food meter within BAttrWnd.
- Description: Describes the nested food meter type used by the enclosing class.

### GlutMeter

- Role: Represents glut meter within BAttrWnd.
- Description: Describes the nested glut meter type used by the enclosing class.

### Item

- Role: Represents item within BAttrWnd.
- Description: Describes the nested item type used by the enclosing class.

### ItemIcon

- Role: Represents item icon within BAttrWnd.
- Description: Describes the nested item icon type used by the enclosing class.

### Reordered

- Role: Represents reordered within BAttrWnd.
- Description: Describes the nested reordered type used by the enclosing class.

## Members

### Constants

#### `public static final PUtils.Convolution tflt = new PUtils.Hanning(1)`
- Role: Defines the shared tflt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color hilit = new Color(255, 255, 0, 48)`
- Role: Defines the shared hilit constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color buffed = new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`
- Role: Defines the shared buffed constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color buffed = new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`
- Role: Defines the shared buffed constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color buffed = new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`
- Role: Defines the shared buffed constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Comparator<El> ecmp = (a, b) ->`
- Role: Defines the shared ecmp constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex frame = Resource.loadtex("gfx/hud/chr/foodm")`
- Role: Defines the shared frame constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord marg = new Coord(5, 5), trmg = new Coord(10, 10)`
- Role: Defines the shared marg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord marg = new Coord(5, 5), trmg = new Coord(10, 10)`
- Role: Defines the shared marg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Comparator<El> dcmp = new Comparator<El>()`
- Role: Defines the shared dcmp constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex frame = Resource.loadtex("gfx/hud/chr/glutm")`
- Role: Defines the shared frame constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord marg = new Coord(5, 5)`
- Role: Defines the shared marg constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final List<Attr> attrs`
- Role: Caches attrs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final FoodMeter feps`
- Role: Stores the feps value.
- Description: Backs the cached state for this file.

#### `public final Constipations cons`
- Role: Holds the cons state.
- Description: Backs the cached state for this file.

#### `public final GlutMeter glut`
- Role: Stores the glut value.
- Description: Backs the cached state for this file.

#### `public final Text rnm`
- Role: Stores the rnm value.
- Description: Backs the cached state for this file.

#### `public final Tex img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `public final Color bg`
- Role: Stores the bg value.
- Description: Backs the cached state for this file.

#### `private double lvlt = 0.0`
- Role: Stores the lvlt value.
- Description: Backs the cached state for this file.

#### `private Text ct`
- Role: Stores the ct value.
- Description: Backs the cached state for this file.

#### `private int cbv = -1, ccv = -1`
- Role: Stores the cbv value.
- Description: Backs the cached state for this file.

#### `private int cbv = -1, ccv = -1`
- Role: Stores the cbv value.
- Description: Backs the cached state for this file.

#### `public final List<El> els = new ArrayList<El>()`
- Role: Caches els entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final ResData t`
- Role: Holds the t state.
- Description: Backs the cached state for this file.

#### `public double a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `private boolean hl`
- Role: Tracks the hl flag.
- Description: Supports the hl operation used by the surrounding class.

#### `private final List<T> back`
- Role: Caches back entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Comparator<? super T> cmp`
- Role: Holds the cmp state.
- Description: Backs the cached state for this file.

#### `private Integer[] order =`
- Role: Holds the battr wnd state.
- Description: Backs the cached state for this file.

#### `private final Reordered<El> oels = new Reordered<>(els, ecmp)`
- Role: Holds the oels state.
- Description: Backs the cached state for this file.

#### `public final ItemSpec spec`
- Role: Holds the spec state.
- Description: Backs the cached state for this file.

#### `public final El el`
- Role: Holds the el state.
- Description: Backs the cached state for this file.

#### `private Widget nm, a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `private Widget nm, a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `private double da = Double.NaN`
- Role: Stores the da value.
- Description: Backs the cached state for this file.

#### `private ItemInfo.InfoTip lasttip = null`
- Role: Holds the lasttip state.
- Description: Backs the cached state for this file.

#### `public double cap`
- Role: Stores the cap value.
- Description: Backs the cached state for this file.

#### `public List<El> els = new LinkedList<El>()`
- Role: Caches els entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<El> enew = null, etr = null`
- Role: Caches enew entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<El> enew = null, etr = null`
- Role: Caches enew entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Indir<Resource> trev = null`
- Role: Stores the trev value.
- Description: Backs the cached state for this file.

#### `private Tex trol`
- Role: Stores the trol value.
- Description: Backs the cached state for this file.

#### `private double trtm = 0`
- Role: Stores the trtm value.
- Description: Backs the cached state for this file.

#### `public final Color col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

#### `public final String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public final int sort`
- Role: Stores the sort value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public double a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `private Event ev = null`
- Role: Holds the ev state.
- Description: Backs the cached state for this file.

#### `private Tex rtip = null`
- Role: Stores the rtip value.
- Description: Backs the cached state for this file.

#### `public Color fg = Color.BLACK, bg = Color.BLACK`
- Role: Stores the fg value.
- Description: Backs the cached state for this file.

#### `public Color fg = Color.BLACK, bg = Color.BLACK`
- Role: Stores the fg value.
- Description: Backs the cached state for this file.

#### `public double glut, lglut, gmod`
- Role: Stores the gmod value.
- Description: Backs the cached state for this file.

#### `public double glut, lglut, gmod`
- Role: Stores the gmod value.
- Description: Backs the cached state for this file.

#### `public double glut, lglut, gmod`
- Role: Stores the gmod value.
- Description: Backs the cached state for this file.

#### `public String lbl`
- Role: Stores the lbl value.
- Description: Backs the cached state for this file.

#### `private Tex rtip = null`
- Role: Stores the rtip value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private Attr(Glob glob, String attr, Color bg)`
- Role: Performs attr.
- Description: Supports the attr operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void lvlup()`
- Role: Performs lvlup.
- Description: Supports the lvlup operation used by the surrounding class.

#### `public El(ResData t, double a)`
- Role: Performs el.
- Description: Supports the el operation used by the surrounding class.

#### `public void update(double a)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Constipations(Coord sz)`
- Role: Performs constipations.
- Description: Supports the constipations operation used by the surrounding class.

#### `public Reordered(List<T> back, Comparator<? super T> cmp)`
- Role: Performs reordered.
- Description: Supports the reordered operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public T get(int i)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `protected List<El> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Widget makeitem(El el, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public ItemIcon(Coord sz, ItemSpec spec)`
- Role: Performs item icon.
- Description: Supports the item icon operation used by the surrounding class.

#### `protected BufferedImage img()`
- Role: Performs img.
- Description: Supports the img operation used by the surrounding class.

#### `protected String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `protected PUtils.Convolution filter()`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public Item(Coord sz, El el)`
- Role: Performs item.
- Description: Supports the item operation used by the surrounding class.

#### `private void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `protected void drawslot(GOut g, El el, int idx, Area area)`
- Role: Performs drawslot.
- Description: Supports the drawslot operation used by the surrounding class.

#### `public boolean unselect(int button)`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `public void update(ResData t, double a)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Event(Resource res, Message buf)`
- Role: Performs event.
- Description: Supports the event operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public El(Indir<Resource> res, double a)`
- Role: Performs el.
- Description: Supports the el operation used by the surrounding class.

#### `public Event ev()`
- Role: Performs ev.
- Description: Supports the ev operation used by the surrounding class.

#### `public FoodMeter()`
- Role: Performs food meter.
- Description: Supports the food meter operation used by the surrounding class.

#### `private BufferedImage mktrol(List<El> els, Indir<Resource> trev)`
- Role: Performs mktrol.
- Description: Supports the mktrol operation used by the surrounding class.

#### `private void drawels(GOut g, List<El> els, int alpha)`
- Role: Performs drawels.
- Description: Supports the drawels operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void update(Object... args)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void trig(Indir<Resource> ev)`
- Role: Performs trig.
- Description: Supports the trig operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public GlutMeter()`
- Role: Performs glut meter.
- Description: Supports the glut meter operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void update(Object... args)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public BAttrWnd(Glob glob)`
- Role: Creates a new BAttrWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
