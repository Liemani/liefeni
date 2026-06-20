---
source: [NewsFeed.java](../../../src/haven/NewsFeed.java)
created: 2026-06-13
updated: 2026-06-14
---

# NewsFeed

Represents the news feed Haven component.

## Nested Types

### Display

- Role: Represents display within NewsFeed.
- Description: Describes the nested display type used by the enclosing class.

### Entry

- Role: Represents entry within NewsFeed.
- Description: Describes the nested entry type used by the enclosing class.

### Filtered

- Role: Represents filtered within NewsFeed.
- Description: Describes the nested filtered type used by the enclosing class.

### LinkText

- Role: Represents link text within NewsFeed.
- Description: Describes the nested link text type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<URI> feed = Config.Services.var("newsfeed", "")`
- Role: Defines the shared feed constant.
- Description: Shared constant used by the rest of the class.

#### `public static final DateTimeFormatter timefmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")`
- Role: Defines the shared timefmt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final String ATOM = "http://www.w3.org/2005/Atom"`
- Role: Defines the shared atom constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Resource hand = Resource.local().loadwait("gfx/hud/curs/hand")`
- Role: Defines the shared hand constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord size = UI.scale(300, 35)`
- Role: Defines the shared size constant.
- Description: Shared constant used by the rest of the class.

#### `public static final DocumentBuilderFactory cpconf = DocumentBuilderFactory.newInstance()`
- Role: Defines the shared cpconf constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Filtered entries`
- Role: Holds the entries state.
- Description: Backs the cached state for this file.

#### `public final NewsFeed list`
- Role: Holds the list state.
- Description: Backs the cached state for this file.

#### `public final Entry entry`
- Role: Holds the entry state.
- Description: Backs the cached state for this file.

#### `public final Element data`
- Role: Holds the data state.
- Description: Backs the cached state for this file.

#### `private DocumentFragment contents = null`
- Role: Holds the contents state.
- Description: Backs the cached state for this file.

#### `public final List<Entry> unseen = new ArrayList<>()`
- Role: Caches unseen entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final List<Entry> seen = new ArrayList<>()`
- Role: Caches seen entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public NewsFeed(int h, Filtered entries)`
- Role: Creates a new NewsFeed instance.
- Description: Constructs the instance and initializes its default state.

#### `public List<Entry> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `public Widget makeitem(Entry ent, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public LinkText(int w, NewsFeed list, Entry entry)`
- Role: Performs link text.
- Description: Supports the link text operation used by the surrounding class.

#### `public String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public boolean getcurs(CursorQuery ev)`
- Role: Returns the current cursor state.
- Description: Exposes the requested value without mutating state.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public Display(NewsFeed list, Entry ent)`
- Role: Performs display.
- Description: Supports the display operation used by the surrounding class.

#### `public static Iterable<Element> els(Element el, String ns, String tag)`
- Role: Performs els.
- Description: Supports the els operation used by the surrounding class.

#### `public static Element el(Element el, String ns, String tag)`
- Role: Performs el.
- Description: Supports the el operation used by the surrounding class.

#### `public Entry(Element data)`
- Role: Performs entry.
- Description: Supports the entry operation used by the surrounding class.

#### `public String id()`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public URI href()`
- Role: Performs href.
- Description: Supports the href operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public Instant time()`
- Role: Performs time.
- Description: Supports the time operation used by the surrounding class.

#### `public DocumentFragment contents()`
- Role: Performs contents.
- Description: Supports the contents operation used by the surrounding class.

#### `public Filtered(List<Entry> fetched)`
- Role: Performs filtered.
- Description: Supports the filtered operation used by the surrounding class.

#### `public Filtered see(Collection<Entry> add)`
- Role: Performs see.
- Description: Supports the see operation used by the surrounding class.

#### `public Filtered save()`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public static List<Entry> fetch() throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public static void main(String... args) throws IOException`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
