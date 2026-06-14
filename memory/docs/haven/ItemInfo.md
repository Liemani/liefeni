# ItemInfo

## Meta

- Source: [ItemInfo.java](../../../src/haven/ItemInfo.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Holds item information and tooltips.

## Code Members

### Member Index

#### Fields

- [owner](#member-1)
- [nil](#member-5)
- [data](#member-6)
- [time](#member-7)
- [owner](#member-12)
- [cmp](#member-13)
- [width](#member-14)
- [tips](#member-15)
- [itab](#member-16)
- [str](#member-29)
- [str](#member-32)
- [doc](#member-41)
- [sub](#member-47)
- [ch](#member-48)
- [from](#member-60)
- [data](#member-61)
- [forinfo](#member-62)
- [save](#member-63)

#### Methods

- [public List<ItemInfo> info();](#member-2)
- [public Resource resource();](#member-3)
- [public GSprite sprite();](#member-4)
- [Raw(Object[] data, double time)](#member-8)
- [Raw(Object[] data)](#member-9)
- [public ItemInfo build(Owner owner, Raw raw, Object... args);](#member-10)
- [FactMaker()](#member-11)
- [Layout(Owner owner)](#member-17)
- [public T make(Owner owner);](#member-18)
- [intern(TipID<T> id)](#member-19)
- [add(Tip tip)](#member-20)
- [render()](#member-21)
- [Tip(Owner owner)](#member-22)
- [tipimg()](#member-23)
- [tipimg(int w)](#member-24)
- [shortvar()](#member-25)
- [prepare(Layout l)](#member-26)
- [layout(Layout l)](#member-27)
- [order()](#member-28)
- [AdHoc(Owner owner, String str)](#member-30)
- [tipimg()](#member-31)
- [Name(Owner owner, Text str)](#member-33)
- [Name(Owner owner, String str)](#member-34)
- [tipimg()](#member-35)
- [order()](#member-36)
- [shortvar()](#member-37)
- [public String name();](#member-38)
- [get(Owner owner)](#member-39)
- [build(Owner owner, Raw raw, Object... args)](#member-40)
- [Pagina(Owner owner, RichText.Document doc)](#member-42)
- [Pagina(Owner owner, String str)](#member-43)
- [tipimg(int w)](#member-44)
- [layout(Layout l)](#member-45)
- [order()](#member-46)
- [Contents(Owner owner, List<ItemInfo> sub)](#member-49)
- [tipimg()](#member-50)
- [shortvar()](#member-51)
- [catimgs(int margin, BufferedImage... imgs)](#member-52)
- [catimgsh(int margin, BufferedImage... imgs)](#member-53)
- [longtip(List<ItemInfo> info)](#member-54)
- [shorttip(List<ItemInfo> info)](#member-55)
- [find(Class<T> cl, List<ItemInfo> il)](#member-56)
- [buildinfo(Owner owner, Raw raw)](#member-57)
- [buildinfo(Owner owner, Object[] rawinfo)](#member-58)
- [dump(Object arg)](#member-59)
- [AttrCache(Supplier<List<ItemInfo>> from, Function<List<ItemInfo>, Supplier<R>> data)](#member-64)
- [get()](#member-65)
- [map1(Class<I> icl, Function<I, Supplier<R>> data)](#member-66)
- [map1s(Class<I> icl, Function<I, R> data)](#member-67)
- [public List<ItemInfo> info();](#member-68)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `owner`

- Description: TODO

<a id="member-5"></a>
##### `nil`

- Description: TODO

<a id="member-6"></a>
##### `data`

- Description: TODO

<a id="member-7"></a>
##### `time`

- Description: TODO

<a id="member-12"></a>
##### `owner`

- Description: TODO

<a id="member-13"></a>
##### `cmp`

- Description: TODO

<a id="member-14"></a>
##### `width`

- Description: TODO

<a id="member-15"></a>
##### `tips`

- Description: TODO

<a id="member-16"></a>
##### `itab`

- Description: TODO

<a id="member-29"></a>
##### `str`

- Description: TODO

<a id="member-32"></a>
##### `str`

- Description: TODO

<a id="member-41"></a>
##### `doc`

- Description: TODO

<a id="member-47"></a>
##### `sub`

- Description: TODO

<a id="member-48"></a>
##### `ch`

- Description: TODO

<a id="member-60"></a>
##### `from`

- Description: TODO

<a id="member-61"></a>
##### `data`

- Description: TODO

<a id="member-62"></a>
##### `forinfo`

- Description: TODO

<a id="member-63"></a>
##### `save`

- Description: TODO

#### Methods

<a id="member-2"></a>
##### `public List<ItemInfo> info();`

- Description: TODO

<a id="member-3"></a>
##### `public Resource resource();`

- Description: TODO

<a id="member-4"></a>
##### `public GSprite sprite();`

- Description: TODO

<a id="member-8"></a>
##### `Raw(Object[] data, double time)`

- Description: TODO

<a id="member-9"></a>
##### `Raw(Object[] data)`

- Description: TODO

<a id="member-10"></a>
##### `public ItemInfo build(Owner owner, Raw raw, Object... args);`

- Description: TODO

<a id="member-11"></a>
##### `FactMaker()`

- Description: TODO

<a id="member-17"></a>
##### `Layout(Owner owner)`

- Description: TODO

<a id="member-18"></a>
##### `public T make(Owner owner);`

- Description: TODO

<a id="member-19"></a>
##### `intern(TipID<T> id)`

- Description: TODO

<a id="member-20"></a>
##### `add(Tip tip)`

- Description: TODO

<a id="member-21"></a>
##### `render()`

- Description: TODO

<a id="member-22"></a>
##### `Tip(Owner owner)`

- Description: TODO

<a id="member-23"></a>
##### `tipimg()`

- Description: TODO

<a id="member-24"></a>
##### `tipimg(int w)`

- Description: TODO

<a id="member-25"></a>
##### `shortvar()`

- Description: TODO

<a id="member-26"></a>
##### `prepare(Layout l)`

- Description: TODO

<a id="member-27"></a>
##### `layout(Layout l)`

- Description: TODO

<a id="member-28"></a>
##### `order()`

- Description: TODO

<a id="member-30"></a>
##### `AdHoc(Owner owner, String str)`

- Description: TODO

<a id="member-31"></a>
##### `tipimg()`

- Description: TODO

<a id="member-33"></a>
##### `Name(Owner owner, Text str)`

- Description: TODO

<a id="member-34"></a>
##### `Name(Owner owner, String str)`

- Description: TODO

<a id="member-35"></a>
##### `tipimg()`

- Description: TODO

<a id="member-36"></a>
##### `order()`

- Description: TODO

<a id="member-37"></a>
##### `shortvar()`

- Description: TODO

<a id="member-38"></a>
##### `public String name();`

- Description: TODO

<a id="member-39"></a>
##### `get(Owner owner)`

- Description: TODO

<a id="member-40"></a>
##### `build(Owner owner, Raw raw, Object... args)`

- Description: TODO

<a id="member-42"></a>
##### `Pagina(Owner owner, RichText.Document doc)`

- Description: TODO

<a id="member-43"></a>
##### `Pagina(Owner owner, String str)`

- Description: TODO

<a id="member-44"></a>
##### `tipimg(int w)`

- Description: TODO

<a id="member-45"></a>
##### `layout(Layout l)`

- Description: TODO

<a id="member-46"></a>
##### `order()`

- Description: TODO

<a id="member-49"></a>
##### `Contents(Owner owner, List<ItemInfo> sub)`

- Description: TODO

<a id="member-50"></a>
##### `tipimg()`

- Description: TODO

<a id="member-51"></a>
##### `shortvar()`

- Description: TODO

<a id="member-52"></a>
##### `catimgs(int margin, BufferedImage... imgs)`

- Description: TODO

<a id="member-53"></a>
##### `catimgsh(int margin, BufferedImage... imgs)`

- Description: TODO

<a id="member-54"></a>
##### `longtip(List<ItemInfo> info)`

- Description: TODO

<a id="member-55"></a>
##### `shorttip(List<ItemInfo> info)`

- Description: TODO

<a id="member-56"></a>
##### `find(Class<T> cl, List<ItemInfo> il)`

- Description: TODO

<a id="member-57"></a>
##### `buildinfo(Owner owner, Raw raw)`

- Description: TODO

<a id="member-58"></a>
##### `buildinfo(Owner owner, Object[] rawinfo)`

- Description: TODO

<a id="member-59"></a>
##### `dump(Object arg)`

- Description: TODO

<a id="member-64"></a>
##### `AttrCache(Supplier<List<ItemInfo>> from, Function<List<ItemInfo>, Supplier<R>> data)`

- Description: TODO

<a id="member-65"></a>
##### `get()`

- Description: TODO

<a id="member-66"></a>
##### `map1(Class<I> icl, Function<I, Supplier<R>> data)`

- Description: TODO

<a id="member-67"></a>
##### `map1s(Class<I> icl, Function<I, R> data)`

- Description: TODO

<a id="member-68"></a>
##### `public List<ItemInfo> info();`

- Description: TODO
