---
source: [BAttrWnd.java](../../../../src/haven/BAttrWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# BAttrWnd

Represents the battr wnd Haven component.

## Nested Types

### $_

- Role: Builds the `battr` widget from the resource system.
- Description: Creates a new `BAttrWnd` bound to the current `Glob`.

### Attr

- Role: Renders one base attribute row.
- Description: Shows the attribute icon, localized name, and current value with level-up highlighting.

### Constipations

- Role: Renders the satiation list and highlights food-related tooltips.
- Description: Maintains the ordered food satiation entries and draws hover emphasis for matching food types.

### El

- Role: Stores one satiation entry.
- Description: Keeps the resource reference and satiation fraction for a single food type.

### Event

- Role: Describes one food event resource layer.
- Description: Parses the layer color, name, and ordering from the `foodev` resource layer.

### FoodMeter

- Role: Renders the food event point bar.
- Description: Draws the current food composition, tooltip, and trigger animation state.

### GlutMeter

- Role: Renders the hunger bar.
- Description: Displays current glut, lost glut, and food efficacy with tooltip text.

### Item

- Role: Renders one satiation list row.
- Description: Keeps the row widgets in sync with the backing `Constipations.El`.

### ItemIcon

- Role: Renders the icon and title for a satiation entry.
- Description: Uses the resource image and item name from the backing `ItemSpec`.

### Reordered

- Role: Presents a sorted view over a backing list.
- Description: Reorders the source list with a comparator without copying the elements.

## Members

### Constants

#### `public static final PUtils.Convolution tflt = new PUtils.Hanning(1)`
- Role: Implements the tflt operation.
- Description: Implements the hanning operation.
- Value: `new PUtils.Hanning(1)`

#### `public static final Color hilit = new Color(255, 255, 0, 48)`
- Role: Implements the hilit operation.
- Description: Implements the color operation.
- Value: `new Color(255, 255, 0, 48)`

#### `public static final Color buffed = new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`
- Role: Implements the buffed operation.
- Description: Implements the color operation.
- Value: `new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`

#### `public static final Color buffed = new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`
- Role: Implements the buffed operation.
- Description: Implements the color operation.
- Value: `new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`

#### `public static final Color buffed = new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`
- Role: Implements the buffed operation.
- Description: Implements the color operation.
- Value: `new Color(160, 255, 160), full = new Color(250, 230, 64), none = new Color(250, 19, 43)`

#### `public static final Comparator<El> ecmp = (a, b) ->`
- Role: Implements the ecmp operation.
- Description: Implements the public static final comparator<el> ecmp = (a, b) -> operation.
- Value: `(a, b) ->`

#### `public static final Tex frame = Resource.loadtex("gfx/hud/chr/foodm")`
- Role: Implements the frame operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chr/foodm")`

#### `public static final Coord marg = new Coord(5, 5), trmg = new Coord(10, 10)`
- Role: Implements the marg operation.
- Description: Implements the coord operation.
- Value: `new Coord(5, 5), trmg = new Coord(10, 10)`

#### `public static final Coord marg = new Coord(5, 5), trmg = new Coord(10, 10)`
- Role: Implements the marg operation.
- Description: Implements the coord operation.
- Value: `new Coord(5, 5), trmg = new Coord(10, 10)`

#### `public static final Comparator<El> dcmp = new Comparator<El>()`
- Role: Implements the dcmp operation.
- Description: Implements the public static final comparator<el> dcmp = new comparator<el>() operation.
- Value: `new Comparator<El>()`

#### `public static final Tex frame = Resource.loadtex("gfx/hud/chr/glutm")`
- Role: Implements the frame operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chr/glutm")`

#### `public static final Coord marg = new Coord(5, 5)`
- Role: Implements the marg operation.
- Description: Implements the coord operation.
- Value: `new Coord(5, 5)`

### Fields

#### `public final List<Attr> attrs`
- Role: Caches the attrs value.
- Description: Caches the `attrs` value for reuse.

#### `public final FoodMeter feps`
- Role: Caches the feps value.
- Description: Caches the `feps` value for reuse.

#### `public final Constipations cons`
- Role: Caches the cons value.
- Description: Caches the `cons` value for reuse.

#### `public final GlutMeter glut`
- Role: Caches the glut value.
- Description: Caches the `glut` value for reuse.

#### `public final Text rnm`
- Role: Caches the rnm value.
- Description: Caches the `rnm` value for reuse.

#### `public final Tex img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `public final Color bg`
- Role: Caches the bg value.
- Description: Caches the `bg` value for reuse.

#### `private double lvlt = 0.0`
- Role: Caches the lvlt value.
- Description: Caches the `lvlt` value for reuse.

#### `private Text ct`
- Role: Caches the ct value.
- Description: Caches the `ct` value for reuse.

#### `private int cbv = -1, ccv = -1`
- Role: Caches the cbv value.
- Description: Caches the `cbv` value for reuse.

#### `private int cbv = -1, ccv = -1`
- Role: Caches the cbv value.
- Description: Caches the `cbv` value for reuse.

#### `public final List<El> els = new ArrayList<El>()`
- Role: Implements the els operation.
- Description: Implements the public final list<el> els = new array list<el>() operation.

#### `public final ResData t`
- Role: Caches the t value.
- Description: Caches the `t` value for reuse.

#### `public double a`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `private boolean hl`
- Role: Tracks the hl flag.
- Description: Caches the `hl` value for reuse.

#### `private final List<T> back`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `private final Comparator<? super T> cmp`
- Role: Caches the cmp value.
- Description: Caches the `cmp` value for reuse.

#### `private Integer[] order =`
- Role: Caches the order value.
- Description: Caches the `order` value for reuse.

#### `private final Reordered<El> oels = new Reordered<>(els, ecmp)`
- Role: Implements the oels operation.
- Description: Implements the private final reordered<el> oels = new reordered<>(els, ecmp) operation.

#### `public final ItemSpec spec`
- Role: Caches the spec value.
- Description: Caches the `spec` value for reuse.

#### `public final El el`
- Role: Caches the el value.
- Description: Caches the `el` value for reuse.

#### `private Widget nm, a`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `private Widget nm, a`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `private double da = Double.NaN`
- Role: Caches the da value.
- Description: Caches the `da` value for reuse.

#### `private ItemInfo.InfoTip lasttip = null`
- Role: Caches the last tip.
- Description: Caches the last tip value.

#### `public double cap`
- Role: Caches the cap value.
- Description: Caches the `cap` value for reuse.

#### `public List<El> els = new LinkedList<El>()`
- Role: Implements the els operation.
- Description: Implements the public list<el> els = new linked list<el>() operation.

#### `private List<El> enew = null, etr = null`
- Role: Caches the enew value.
- Description: Caches the `enew` value for reuse.

#### `private List<El> enew = null, etr = null`
- Role: Caches the enew value.
- Description: Caches the `enew` value for reuse.

#### `private Indir<Resource> trev = null`
- Role: Caches the trev value.
- Description: Caches the `trev` value for reuse.

#### `private Tex trol`
- Role: Caches the trol value.
- Description: Caches the `trol` value for reuse.

#### `private double trtm = 0`
- Role: Caches the trtm value.
- Description: Caches the `trtm` value for reuse.

#### `public final Color col`
- Role: Caches the col value.
- Description: Caches the `col` value for reuse.

#### `public final String nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `public final int sort`
- Role: Caches the sort value.
- Description: Caches the `sort` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public double a`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `private Event ev = null`
- Role: Caches the ev value.
- Description: Caches the `ev` value for reuse.

#### `private Tex rtip = null`
- Role: Caches the rtip value.
- Description: Caches the `rtip` value for reuse.

#### `public Color fg = Color.BLACK, bg = Color.BLACK`
- Role: Caches the fg value.
- Description: Caches the `fg` value for reuse.

#### `public Color fg = Color.BLACK, bg = Color.BLACK`
- Role: Caches the fg value.
- Description: Caches the `fg` value for reuse.

#### `public double glut, lglut, gmod`
- Role: Caches the gmod value.
- Description: Caches the `gmod` value for reuse.

#### `public double glut, lglut, gmod`
- Role: Caches the gmod value.
- Description: Caches the `gmod` value for reuse.

#### `public double glut, lglut, gmod`
- Role: Caches the gmod value.
- Description: Caches the `gmod` value for reuse.

#### `public String lbl`
- Role: Caches the lbl value.
- Description: Caches the `lbl` value for reuse.

#### `private Tex rtip = null`
- Role: Caches the rtip value.
- Description: Caches the `rtip` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private Attr(Glob glob, String attr, Color bg)`
- Role: Handles the attr path.
- Description: Implements the attr operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the BAttrWnd content.

#### `public void lvlup()`
- Role: Handles the lvlup path.
- Description: Implements the lvlup operation.

#### `public El(ResData t, double a)`
- Role: Handles the el path.
- Description: Implements the el operation.

#### `public void update(double a)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public Constipations(Coord sz)`
- Role: Handles the constipations path.
- Description: Implements the constipations operation.

#### `public Reordered(List<T> back, Comparator<? super T> cmp)`
- Role: Handles the reordered path.
- Description: Implements the reordered operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public T get(int i)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `protected List<El> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Widget makeitem(El el, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public ItemIcon(Coord sz, ItemSpec spec)`
- Role: Handles the item icon path.
- Description: Implements the item icon operation.

#### `protected BufferedImage img()`
- Role: Handles the img path.
- Description: Implements the img operation.

#### `protected String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `protected PUtils.Convolution filter()`
- Role: Handles the filter path.
- Description: Implements the filter operation.

#### `public Item(Coord sz, El el)`
- Role: Handles the item path.
- Description: Implements the item operation.

#### `private void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the BAttrWnd content.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the BAttrWnd content.

#### `protected void drawslot(GOut g, El el, int idx, Area area)`
- Role: Handles the drawslot path.
- Description: Draws the slot.

#### `public boolean unselect(int button)`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `public void update(ResData t, double a)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public Event(Resource res, Message buf)`
- Role: Handles the event path.
- Description: Implements the event operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public El(Indir<Resource> res, double a)`
- Role: Handles the el path.
- Description: Implements the el operation.

#### `public Event ev()`
- Role: Handles the ev path.
- Description: Implements the ev operation.

#### `public FoodMeter()`
- Role: Handles the food meter path.
- Description: Implements the food meter operation.

#### `private BufferedImage mktrol(List<El> els, Indir<Resource> trev)`
- Role: Handles the mktrol path.
- Description: Implements the mktrol operation.

#### `private void drawels(GOut g, List<El> els, int alpha)`
- Role: Handles the drawels path.
- Description: Draws the els.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the BAttrWnd content.

#### `public void update(Object... args)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void trig(Indir<Resource> ev)`
- Role: Handles the trig path.
- Description: Implements the trig operation.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public GlutMeter()`
- Role: Handles the glut meter path.
- Description: Implements the glut meter operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the BAttrWnd content.

#### `public void update(Object... args)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public BAttrWnd(Glob glob)`
- Role: Creates a new BAttrWnd instance.
- Description: Constructs the BAttrWnd instance from the supplied inputs.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.