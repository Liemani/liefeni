# ItemInfo

This file documents the responsibilities and members of `ItemInfo`.

## Meta

- Source: [ItemInfo.java](../../../src/haven/ItemInfo.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Holds item information and tooltips.

## Nested Types

### AdHoc

- Description: TODO

### AttrCache

- Description: TODO

### Contents

- Description: TODO

### Default

- Description: TODO

### Dynamic

- Description: TODO

### FactMaker

- Description: TODO

### InfoFactory

- Description: TODO

### InfoTip

- Description: TODO

### Layout

- Description: TODO

### Name

- Description: TODO

### Owner

- Description: TODO

### Pagina

- Description: TODO

### Raw

- Description: TODO

### ResOwner

- Description: TODO

### SpriteOwner

- Description: TODO

### Tip

- Description: TODO

### TipID

- Description: TODO

## Members

### Constants

#### `public static final Raw nil = new Raw(new Object[0], 0)`

- Description: TODO

#### `private static final Text.Line ch = Text.render("Contents:")`

- Description: TODO

### Fields

#### `public final Owner owner`

- Description: TODO

#### `public final Object[] data`

- Description: TODO

#### `public final double time`

- Description: TODO

#### `public final Owner owner`

- Description: TODO

#### `public final CompImage cmp = new CompImage()`

- Description: TODO

#### `public int width = 0`

- Description: TODO

#### `private final List<Tip> tips = new ArrayList<>()`

- Description: TODO

#### `private final Map<TipID, Tip> itab = new HashMap<>()`

- Description: TODO

#### `public final Text str`

- Description: TODO

#### `public final Text str`

- Description: TODO

#### `public final RichText.Document doc`

- Description: TODO

#### `public final List<ItemInfo> sub`

- Description: TODO

#### `private final Supplier<List<ItemInfo>> from`

- Description: TODO

#### `private final Function<List<ItemInfo>, Supplier<R>> data`

- Description: TODO

#### `private List<ItemInfo> forinfo = null`

- Description: TODO

#### `private Supplier<R> save`

- Description: TODO

### Methods

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public Resource resource()`

- Description: TODO

#### `public GSprite sprite()`

- Description: TODO

#### `public Raw(Object[] data, double time)`

- Description: TODO

#### `public Raw(Object[] data)`

- Description: TODO

#### `public ItemInfo build(Owner owner, Raw raw, Object... args)`

- Description: TODO

#### `public FactMaker()`

- Description: TODO

#### `public ItemInfo(Owner owner)`

- Description: TODO

#### `public Layout(Owner owner)`

- Description: TODO

#### `public T make(Owner owner)`

- Description: TODO

#### `public <T extends Tip> T intern(TipID<T> id)`

- Description: TODO

#### `public void add(Tip tip)`

- Description: TODO

#### `public BufferedImage render()`

- Description: TODO

#### `public Tip(Owner owner)`

- Description: TODO

#### `public BufferedImage tipimg()`

- Description: TODO

#### `public BufferedImage tipimg(int w)`

- Description: TODO

#### `public Tip shortvar()`

- Description: TODO

#### `public void prepare(Layout l)`

- Description: TODO

#### `public void layout(Layout l)`

- Description: TODO

#### `public int order()`

- Description: TODO

#### `public AdHoc(Owner owner, String str)`

- Description: TODO

#### `public BufferedImage tipimg()`

- Description: TODO

#### `public Name(Owner owner, Text str)`

- Description: TODO

#### `public Name(Owner owner, String str)`

- Description: TODO

#### `public BufferedImage tipimg()`

- Description: TODO

#### `public int order()`

- Description: TODO

#### `public Tip shortvar()`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public static String get(Owner owner)`

- Description: TODO

#### `public ItemInfo build(Owner owner, Raw raw, Object... args)`

- Description: TODO

#### `public Pagina(Owner owner, RichText.Document doc)`

- Description: TODO

#### `public Pagina(Owner owner, String str)`

- Description: TODO

#### `public BufferedImage tipimg(int w)`

- Description: TODO

#### `public void layout(Layout l)`

- Description: TODO

#### `public int order()`

- Description: TODO

#### `public Contents(Owner owner, List<ItemInfo> sub)`

- Description: TODO

#### `public BufferedImage tipimg()`

- Description: TODO

#### `public Tip shortvar()`

- Description: TODO

#### `public static BufferedImage catimgs(int margin, BufferedImage... imgs)`

- Description: TODO

#### `public static BufferedImage catimgsh(int margin, BufferedImage... imgs)`

- Description: TODO

#### `public static BufferedImage longtip(List<ItemInfo> info)`

- Description: TODO

#### `public static BufferedImage shorttip(List<ItemInfo> info)`

- Description: TODO

#### `public static <T> T find(Class<T> cl, List<ItemInfo> il)`

- Description: TODO

#### `public static List<ItemInfo> buildinfo(Owner owner, Raw raw)`

- Description: TODO

#### `public static List<ItemInfo> buildinfo(Owner owner, Object[] rawinfo)`

- Description: TODO

#### `private static String dump(Object arg)`

- Description: TODO

#### `public AttrCache(Supplier<List<ItemInfo>> from, Function<List<ItemInfo>, Supplier<R>> data)`

- Description: TODO

#### `public R get()`

- Description: TODO

#### `public static <I, R> Function<List<ItemInfo>, Supplier<R>> map1(Class<I> icl, Function<I, Supplier<R>> data)`

- Description: TODO

#### `public static <I, R> Function<List<ItemInfo>, Supplier<R>> map1s(Class<I> icl, Function<I, R> data)`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO
