---
source: [NewsFeed.java](../../../../src/haven/NewsFeed.java)
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
- Role: Implements the feed operation.
- Description: Implements the var operation.
- Value: `Config.Services.var("newsfeed", "")`

#### `public static final DateTimeFormatter timefmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")`
- Role: Implements the timefmt operation.
- Description: Implements the of pattern operation.
- Value: `DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")`

#### `public static final String ATOM = "http://www.w3.org/2005/Atom"`
- Role: Caches the atom value.
- Description: Caches the `ATOM` value for reuse.
- Value: `"http://www.w3.org/2005/Atom"`

#### `public static final Resource hand = Resource.local().loadwait("gfx/hud/curs/hand")`
- Role: Implements the hand operation.
- Description: Implements the loadwait operation.
- Value: `Resource.local().loadwait("gfx/hud/curs/hand")`

#### `public static final Coord size = UI.scale(300, 35)`
- Role: Implements the size operation.
- Description: Implements the scale operation.
- Value: `UI.scale(300, 35)`

#### `public static final DocumentBuilderFactory cpconf = DocumentBuilderFactory.newInstance()`
- Role: Implements the cpconf operation.
- Description: Implements the new instance operation.
- Value: `DocumentBuilderFactory.newInstance()`

### Fields

#### `private final Filtered entries`
- Role: Caches the entries value.
- Description: Caches the `entries` value for reuse.

#### `public final NewsFeed list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `public final Entry entry`
- Role: Caches the entry value.
- Description: Caches the `entry` value for reuse.

#### `public final Element data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private DocumentFragment contents = null`
- Role: Caches the contents value.
- Description: Caches the `contents` value for reuse.

#### `public final List<Entry> unseen = new ArrayList<>()`
- Role: Implements the unseen operation.
- Description: Implements the public final list<entry> unseen = new array list<>() operation.

#### `public final List<Entry> seen = new ArrayList<>()`
- Role: Implements the seen operation.
- Description: Implements the public final list<entry> seen = new array list<>() operation.

### Methods

#### `public NewsFeed(int h, Filtered entries)`
- Role: Creates a new NewsFeed instance.
- Description: Constructs the NewsFeed instance from the supplied inputs.

#### `public List<Entry> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `public Widget makeitem(Entry ent, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public LinkText(int w, NewsFeed list, Entry entry)`
- Role: Handles the link text path.
- Description: Implements the link text operation.

#### `public String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public boolean getcurs(CursorQuery ev)`
- Role: Returns the current cursor state.
- Description: Returns the curs.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public Display(NewsFeed list, Entry ent)`
- Role: Handles the display path.
- Description: Implements the display operation.

#### `public static Iterable<Element> els(Element el, String ns, String tag)`
- Role: Handles the els path.
- Description: Implements the els operation.

#### `public static Element el(Element el, String ns, String tag)`
- Role: Handles the el path.
- Description: Implements the el operation.

#### `public Entry(Element data)`
- Role: Handles the entry path.
- Description: Implements the entry operation.

#### `public String id()`
- Role: Handles the id path.
- Description: Implements the id operation.

#### `public URI href()`
- Role: Handles the href path.
- Description: Implements the href operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public Instant time()`
- Role: Handles the time path.
- Description: Implements the time operation.

#### `public DocumentFragment contents()`
- Role: Handles the contents path.
- Description: Implements the contents operation.

#### `public Filtered(List<Entry> fetched)`
- Role: Handles the filtered path.
- Description: Implements the filtered operation.

#### `public Filtered see(Collection<Entry> add)`
- Role: Handles the see path.
- Description: Implements the see operation.

#### `public Filtered save()`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public static List<Entry> fetch() throws IOException`
- Role: Fetches the target value.
- Description: Opens the requested cached resource for reading.

#### `public static void main(String... args) throws IOException`
- Role: Handles the main workflow.
- Description: Runs the client entry point.