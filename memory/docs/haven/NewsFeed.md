# NewsFeed

This file documents the responsibilities and members of `NewsFeed`.

## Meta

- Source: [NewsFeed.java](../../../src/haven/NewsFeed.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a news feed.

## Nested Types

### Display

- Description: TODO

### Entry

- Description: TODO

### Filtered

- Description: TODO

### LinkText

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<URI> feed = Config.Services.var("newsfeed", "")`

- Description: TODO

#### `public static final DateTimeFormatter timefmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")`

- Description: TODO

#### `public static final String ATOM = "http://www.w3.org/2005/Atom"`

- Description: TODO

#### `public static final Resource hand = Resource.local().loadwait("gfx/hud/curs/hand")`

- Description: TODO

#### `public static final Coord size = UI.scale(300, 35)`

- Description: TODO

#### `public static final DocumentBuilderFactory cpconf = DocumentBuilderFactory.newInstance()`

- Description: TODO

### Fields

#### `private final Filtered entries`

- Description: TODO

#### `public final NewsFeed list`

- Description: TODO

#### `public final Entry entry`

- Description: TODO

#### `public final Element data`

- Description: TODO

#### `private DocumentFragment contents = null`

- Description: TODO

#### `public final List<Entry> unseen = new ArrayList<>()`

- Description: TODO

#### `public final List<Entry> seen = new ArrayList<>()`

- Description: TODO

### Methods

#### `public NewsFeed(int h, Filtered entries)`

- Description: TODO

#### `public List<Entry> items()`

- Description: TODO

#### `public Widget makeitem(Entry ent, int idx, Coord sz)`

- Description: TODO

#### `public LinkText(int w, NewsFeed list, Entry entry)`

- Description: TODO

#### `public String text()`

- Description: TODO

#### `public boolean getcurs(CursorQuery ev)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public Display(NewsFeed list, Entry ent)`

- Description: TODO

#### `public static Iterable<Element> els(Element el, String ns, String tag)`

- Description: TODO

#### `public static Element el(Element el, String ns, String tag)`

- Description: TODO

#### `public Entry(Element data)`

- Description: TODO

#### `public String id()`

- Description: TODO

#### `public URI href()`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public Instant time()`

- Description: TODO

#### `public DocumentFragment contents()`

- Description: TODO

#### `public Filtered(List<Entry> fetched)`

- Description: TODO

#### `public Filtered see(Collection<Entry> add)`

- Description: TODO

#### `public Filtered save()`

- Description: TODO

#### `public static List<Entry> fetch() throws IOException`

- Description: TODO

#### `public static void main(String... args) throws IOException`

- Description: TODO
