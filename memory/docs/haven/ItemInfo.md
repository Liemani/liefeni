# ItemInfo

This file documents the responsibilities and members of `ItemInfo`.

## Meta

- Source: [ItemInfo.java](../../../src/haven/ItemInfo.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the item info Haven component.

## Nested Types

### AdHoc

- Role: Represents ad hoc within ItemInfo.
- Description: Describes the nested ad hoc type used by the enclosing class.

### AttrCache

- Role: Represents attr cache within ItemInfo.
- Description: Describes the nested attr cache type used by the enclosing class.

### Contents

- Role: Represents contents within ItemInfo.
- Description: Describes the nested contents type used by the enclosing class.

### Default

- Role: Represents default within ItemInfo.
- Description: Describes the nested default type used by the enclosing class.

### Dynamic

- Role: Represents dynamic within ItemInfo.
- Description: Describes the nested dynamic type used by the enclosing class.

### FactMaker

- Role: Represents fact maker within ItemInfo.
- Description: Describes the nested fact maker type used by the enclosing class.

### InfoFactory

- Role: Represents info factory within ItemInfo.
- Description: Describes the nested info factory type used by the enclosing class.

### InfoTip

- Role: Represents info tip within ItemInfo.
- Description: Describes the nested info tip type used by the enclosing class.

### Layout

- Role: Represents layout within ItemInfo.
- Description: Describes the nested layout type used by the enclosing class.

### Name

- Role: Represents name within ItemInfo.
- Description: Describes the nested name type used by the enclosing class.

### Owner

- Role: Represents owner within ItemInfo.
- Description: Describes the nested owner type used by the enclosing class.

### Pagina

- Role: Represents pagina within ItemInfo.
- Description: Describes the nested pagina type used by the enclosing class.

### Raw

- Role: Represents raw within ItemInfo.
- Description: Describes the nested raw type used by the enclosing class.

### ResOwner

- Role: Represents res owner within ItemInfo.
- Description: Describes the nested res owner type used by the enclosing class.

### SpriteOwner

- Role: Represents sprite owner within ItemInfo.
- Description: Describes the nested sprite owner type used by the enclosing class.

### Tip

- Role: Represents tip within ItemInfo.
- Description: Describes the nested tip type used by the enclosing class.

### TipID

- Role: Represents tip id within ItemInfo.
- Description: Describes the nested tip id type used by the enclosing class.

## Members

### Constants

#### `public static final Raw nil = new Raw(new Object[0], 0)`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Text.Line ch = Text.render("Contents:")`
- Role: Defines the shared ch constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Owner owner`
- Role: Holds the owner state.
- Description: Backs the cached state for this file.

#### `public final Object[] data`
- Role: Holds the data state.
- Description: Backs the cached state for this file.

#### `public final double time`
- Role: Stores the time value.
- Description: Backs the cached state for this file.

#### `public final Owner owner`
- Role: Holds the owner state.
- Description: Backs the cached state for this file.

#### `public final CompImage cmp = new CompImage()`
- Role: Stores the cmp value.
- Description: Backs the cached state for this file.

#### `public int width = 0`
- Role: Stores the width value.
- Description: Backs the cached state for this file.

#### `private final List<Tip> tips = new ArrayList<>()`
- Role: Caches tips entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<TipID, Tip> itab = new HashMap<>()`
- Role: Caches itab entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Text str`
- Role: Stores the str value.
- Description: Backs the cached state for this file.

#### `public final Text str`
- Role: Stores the str value.
- Description: Backs the cached state for this file.

#### `public final RichText.Document doc`
- Role: Stores the doc value.
- Description: Backs the cached state for this file.

#### `public final List<ItemInfo> sub`
- Role: Caches sub entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Supplier<List<ItemInfo>> from`
- Role: Caches from entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Function<List<ItemInfo>, Supplier<R>> data`
- Role: Caches data entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<ItemInfo> forinfo = null`
- Role: Caches forinfo entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Supplier<R> save`
- Role: Holds the save state.
- Description: Backs the cached state for this file.

### Methods

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public Resource resource()`
- Role: Performs resource.
- Description: Supports the resource operation used by the surrounding class.

#### `public GSprite sprite()`
- Role: Performs sprite.
- Description: Supports the sprite operation used by the surrounding class.

#### `public Raw(Object[] data, double time)`
- Role: Performs raw.
- Description: Supports the raw operation used by the surrounding class.

#### `public Raw(Object[] data)`
- Role: Performs raw.
- Description: Supports the raw operation used by the surrounding class.

#### `public ItemInfo build(Owner owner, Raw raw, Object... args)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public FactMaker()`
- Role: Performs fact maker.
- Description: Supports the fact maker operation used by the surrounding class.

#### `public ItemInfo(Owner owner)`
- Role: Creates a new ItemInfo instance.
- Description: Constructs the instance and initializes its default state.

#### `public Layout(Owner owner)`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.

#### `public T make(Owner owner)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public <T extends Tip> T intern(TipID<T> id)`
- Role: Performs intern.
- Description: Supports the intern operation used by the surrounding class.

#### `public void add(Tip tip)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public BufferedImage render()`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public Tip(Owner owner)`
- Role: Performs tip.
- Description: Supports the tip operation used by the surrounding class.

#### `public BufferedImage tipimg()`
- Role: Performs tipimg.
- Description: Supports the tipimg operation used by the surrounding class.

#### `public BufferedImage tipimg(int w)`
- Role: Performs tipimg.
- Description: Supports the tipimg operation used by the surrounding class.

#### `public Tip shortvar()`
- Role: Performs shortvar.
- Description: Supports the shortvar operation used by the surrounding class.

#### `public void prepare(Layout l)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `public void layout(Layout l)`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public AdHoc(Owner owner, String str)`
- Role: Performs ad hoc.
- Description: Supports the ad hoc operation used by the surrounding class.

#### `public BufferedImage tipimg()`
- Role: Performs tipimg.
- Description: Supports the tipimg operation used by the surrounding class.

#### `public Name(Owner owner, Text str)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public Name(Owner owner, String str)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public BufferedImage tipimg()`
- Role: Performs tipimg.
- Description: Supports the tipimg operation used by the surrounding class.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public Tip shortvar()`
- Role: Performs shortvar.
- Description: Supports the shortvar operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public static String get(Owner owner)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public ItemInfo build(Owner owner, Raw raw, Object... args)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public Pagina(Owner owner, RichText.Document doc)`
- Role: Performs pagina.
- Description: Supports the pagina operation used by the surrounding class.

#### `public Pagina(Owner owner, String str)`
- Role: Performs pagina.
- Description: Supports the pagina operation used by the surrounding class.

#### `public BufferedImage tipimg(int w)`
- Role: Performs tipimg.
- Description: Supports the tipimg operation used by the surrounding class.

#### `public void layout(Layout l)`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public Contents(Owner owner, List<ItemInfo> sub)`
- Role: Performs contents.
- Description: Supports the contents operation used by the surrounding class.

#### `public BufferedImage tipimg()`
- Role: Performs tipimg.
- Description: Supports the tipimg operation used by the surrounding class.

#### `public Tip shortvar()`
- Role: Performs shortvar.
- Description: Supports the shortvar operation used by the surrounding class.

#### `public static BufferedImage catimgs(int margin, BufferedImage... imgs)`
- Role: Performs catimgs.
- Description: Supports the catimgs operation used by the surrounding class.

#### `public static BufferedImage catimgsh(int margin, BufferedImage... imgs)`
- Role: Performs catimgsh.
- Description: Supports the catimgsh operation used by the surrounding class.

#### `public static BufferedImage longtip(List<ItemInfo> info)`
- Role: Performs longtip.
- Description: Supports the longtip operation used by the surrounding class.

#### `public static BufferedImage shorttip(List<ItemInfo> info)`
- Role: Performs shorttip.
- Description: Supports the shorttip operation used by the surrounding class.

#### `public static <T> T find(Class<T> cl, List<ItemInfo> il)`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `public static List<ItemInfo> buildinfo(Owner owner, Raw raw)`
- Role: Performs buildinfo.
- Description: Supports the buildinfo operation used by the surrounding class.

#### `public static List<ItemInfo> buildinfo(Owner owner, Object[] rawinfo)`
- Role: Performs buildinfo.
- Description: Supports the buildinfo operation used by the surrounding class.

#### `private static String dump(Object arg)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public AttrCache(Supplier<List<ItemInfo>> from, Function<List<ItemInfo>, Supplier<R>> data)`
- Role: Performs attr cache.
- Description: Supports the attr cache operation used by the surrounding class.

#### `public R get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static <I, R> Function<List<ItemInfo>, Supplier<R>> map1(Class<I> icl, Function<I, Supplier<R>> data)`
- Role: Performs map1.
- Description: Supports the map1 operation used by the surrounding class.

#### `public static <I, R> Function<List<ItemInfo>, Supplier<R>> map1s(Class<I> icl, Function<I, R> data)`
- Role: Performs map1s.
- Description: Supports the map1s operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.
