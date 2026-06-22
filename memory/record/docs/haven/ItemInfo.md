---
source: [ItemInfo.java](../../../../src/haven/ItemInfo.java)
created: 2026-06-13
updated: 2026-06-14
---

# ItemInfo

Represents the item info Haven component.

## Nested Types

### AdHoc

- Role: Wraps ad hoc item-info data.
- Description: Holds item-info values assembled at runtime instead of from a published class.

### AttrCache

- Role: Caches parsed item-info attributes.
- Description: Recomputes derived values only when the item-info source changes.

### Contents

- Role: Wraps nested item-info contents.
- Description: Tip that renders a "Contents" section for child item-info entries.

### Default

- Role: Resolves the default item display name.
- Description: Published factory that builds a Name tip from the owner, resource, or sprite.

### Dynamic

- Role: Marks a dynamic display-name provider.
- Description: Interface for owners or sprites that can supply a runtime item name.

### FactMaker

- Role: Resolves item-info factories from published code.
- Description: Instancer chain that adapts published constructors and static builders into InfoFactory implementations.

### InfoFactory

- Role: Builds item-info records from raw payloads.
- Description: Factory interface used by published item-info code to construct ItemInfo instances.

### InfoTip

- Role: Base type for rendered item-info tips.
- Description: Abstract tip class used as the common base for item-info sections.

### Layout

- Role: Composes item-info tips into a final tooltip image.
- Description: Layout helper that orders tips, manages width, and renders the composed tooltip.

### Name

- Role: Renders the item name tip.
- Description: Tip that draws the primary item name, with optional dynamic fallback support.

### Owner

- Role: Supplies item-info context.
- Description: Base contract for item-info owners and context providers.

### Pagina

- Role: Renders the item pagina section.
- Description: Tip that renders the rich-text pagina associated with an item.

### Raw

- Role: Carries the raw item-info payload.
- Description: Immutable wrapper for the unparsed item-info data and its timestamp.

### ResOwner

- Role: Supplies the backing resource for item-info lookup.
- Description: Owner that can expose the resource used to derive item-info data.

### SpriteOwner

- Role: Supplies the backing sprite for item-info lookup.
- Description: Owner that can expose the sprite used to derive item-info data.

### Tip

- Role: Base class for concrete item-info tips.
- Description: Abstract item-info entry that can prepare, lay out, and render itself.

### TipID

- Role: Identifies interned tip entries.
- Description: Layout-local identifier used to deduplicate tip instances.

## Members

### Constants

#### `public static final Raw nil = new Raw(new Object[0], 0)`
- Role: Implements the nil operation.
- Description: Implements the raw operation.
- Value: `new Raw(new Object[0], 0)`

#### `private static final Text.Line ch = Text.render("Contents:")`
- Role: Implements the ch operation.
- Description: Renders the current state into an image or image-like object.
- Value: `Text.render("Contents:")`

### Fields

#### `public final Owner owner`
- Role: Caches the owner value.
- Description: Caches the `owner` value for reuse.

#### `public final Object[] data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `public final double time`
- Role: Caches the time value.
- Description: Caches the `time` value for reuse.

#### `public final Owner owner`
- Role: Caches the owner value.
- Description: Caches the `owner` value for reuse.

#### `public final CompImage cmp = new CompImage()`
- Role: Implements the cmp operation.
- Description: Implements the comp image operation.

#### `public int width = 0`
- Role: Caches the width value.
- Description: Caches the `width` value for reuse.

#### `private final List<Tip> tips = new ArrayList<>()`
- Role: Implements the tips operation.
- Description: Implements the private final list<tip> tips = new array list<>() operation.

#### `private final Map<TipID, Tip> itab = new HashMap<>()`
- Role: Implements the itab operation.
- Description: Implements the private final map<tip id, tip> itab = new hash map<>() operation.

#### `public final Text str`
- Role: Caches the str value.
- Description: Caches the `str` value for reuse.

#### `public final Text str`
- Role: Caches the str value.
- Description: Caches the `str` value for reuse.

#### `public final RichText.Document doc`
- Role: Caches the doc value.
- Description: Caches the `doc` value for reuse.

#### `public final List<ItemInfo> sub`
- Role: Caches the sub value.
- Description: Caches the `sub` value for reuse.

#### `private final Supplier<List<ItemInfo>> from`
- Role: Caches the from value.
- Description: Caches the `from` value for reuse.

#### `private final Function<List<ItemInfo>, Supplier<R>> data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private List<ItemInfo> forinfo = null`
- Role: Caches the forinfo value.
- Description: Caches the `forinfo` value for reuse.

#### `private Supplier<R> save`
- Role: Caches the save value.
- Description: Caches the `save` value for reuse.

### Methods

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public Resource resource()`
- Role: Handles the resource path.
- Description: Implements the resource operation.

#### `public GSprite sprite()`
- Role: Handles the sprite path.
- Description: Implements the sprite operation.

#### `public Raw(Object[] data, double time)`
- Role: Handles the raw path.
- Description: Implements the raw operation.

#### `public Raw(Object[] data)`
- Role: Handles the raw path.
- Description: Implements the raw operation.

#### `public ItemInfo build(Owner owner, Raw raw, Object... args)`
- Role: Handles the build path.
- Description: Implements the build operation.

#### `public FactMaker()`
- Role: Handles the fact maker path.
- Description: Implements the fact maker operation.

#### `public ItemInfo(Owner owner)`
- Role: Creates a new ItemInfo instance.
- Description: Constructs the ItemInfo instance from the supplied inputs.

#### `public Layout(Owner owner)`
- Role: Handles the layout path.
- Description: Implements the layout operation.

#### `public T make(Owner owner)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public <T extends Tip> T intern(TipID<T> id)`
- Role: Handles the intern path.
- Description: Implements the intern operation.

#### `public void add(Tip tip)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public BufferedImage render()`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public Tip(Owner owner)`
- Role: Handles the tip path.
- Description: Implements the tip operation.

#### `public BufferedImage tipimg()`
- Role: Handles the tipimg path.
- Description: Implements the tipimg operation.

#### `public BufferedImage tipimg(int w)`
- Role: Handles the tipimg path.
- Description: Implements the tipimg operation.

#### `public Tip shortvar()`
- Role: Handles the shortvar path.
- Description: Implements the shortvar operation.

#### `public void prepare(Layout l)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `public void layout(Layout l)`
- Role: Handles the layout path.
- Description: Lays out parts on wrapped lines and aligns their baselines.

#### `public int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `public AdHoc(Owner owner, String str)`
- Role: Handles the ad hoc path.
- Description: Implements the ad hoc operation.

#### `public BufferedImage tipimg()`
- Role: Handles the tipimg path.
- Description: Implements the tipimg operation.

#### `public Name(Owner owner, Text str)`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public Name(Owner owner, String str)`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public BufferedImage tipimg()`
- Role: Handles the tipimg path.
- Description: Implements the tipimg operation.

#### `public int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `public Tip shortvar()`
- Role: Handles the shortvar path.
- Description: Implements the shortvar operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public static String get(Owner owner)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public ItemInfo build(Owner owner, Raw raw, Object... args)`
- Role: Handles the build path.
- Description: Implements the build operation.

#### `public Pagina(Owner owner, RichText.Document doc)`
- Role: Handles the pagina path.
- Description: Implements the pagina operation.

#### `public Pagina(Owner owner, String str)`
- Role: Handles the pagina path.
- Description: Implements the pagina operation.

#### `public BufferedImage tipimg(int w)`
- Role: Handles the tipimg path.
- Description: Implements the tipimg operation.

#### `public void layout(Layout l)`
- Role: Handles the layout path.
- Description: Lays out parts on wrapped lines and aligns their baselines.

#### `public int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `public Contents(Owner owner, List<ItemInfo> sub)`
- Role: Handles the contents path.
- Description: Implements the contents operation.

#### `public BufferedImage tipimg()`
- Role: Handles the tipimg path.
- Description: Implements the tipimg operation.

#### `public Tip shortvar()`
- Role: Handles the shortvar path.
- Description: Implements the shortvar operation.

#### `public static BufferedImage catimgs(int margin, BufferedImage... imgs)`
- Role: Handles the catimgs path.
- Description: Implements the catimgs operation.

#### `public static BufferedImage catimgsh(int margin, BufferedImage... imgs)`
- Role: Handles the catimgsh path.
- Description: Implements the catimgsh operation.

#### `public static BufferedImage longtip(List<ItemInfo> info)`
- Role: Handles the longtip path.
- Description: Implements the longtip operation.

#### `public static BufferedImage shorttip(List<ItemInfo> info)`
- Role: Handles the shorttip path.
- Description: Implements the shorttip operation.

#### `public static <T> T find(Class<T> cl, List<ItemInfo> il)`
- Role: Handles the find path.
- Description: Finds the requested data.

#### `public static List<ItemInfo> buildinfo(Owner owner, Raw raw)`
- Role: Handles the buildinfo path.
- Description: Implements the buildinfo operation.

#### `public static List<ItemInfo> buildinfo(Owner owner, Object[] rawinfo)`
- Role: Handles the buildinfo path.
- Description: Implements the buildinfo operation.

#### `private static String dump(Object arg)`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public AttrCache(Supplier<List<ItemInfo>> from, Function<List<ItemInfo>, Supplier<R>> data)`
- Role: Handles the attr cache path.
- Description: Implements the attr cache operation.

#### `public R get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public static <I, R> Function<List<ItemInfo>, Supplier<R>> map1(Class<I> icl, Function<I, Supplier<R>> data)`
- Role: Handles the map1 path.
- Description: Implements the map1 operation.

#### `public static <I, R> Function<List<ItemInfo>, Supplier<R>> map1s(Class<I> icl, Function<I, R> data)`
- Role: Handles the map1s path.
- Description: Implements the map1s operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.