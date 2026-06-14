# GobIcon

## Meta

- Source: [GobIcon.java](../../../src/haven/GobIcon.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Handles gob icon metadata and display settings.

## Code Members

### Member Index

#### Fields

- [size](#member-1)
- [filter](#member-2)
- [res](#member-3)
- [sdt](#member-4)
- [icon](#member-5)
- [nilid](#member-6)
- [owner](#member-7)
- [res](#member-8)
- [cache](#member-21)
- [img](#member-22)
- [tex](#member-23)
- [cc](#member-24)
- [rot](#member-25)
- [ao](#member-26)
- [z](#member-27)
- [img](#member-30)
- [gob](#member-31)
- [factory](#member-39)
- [lastnotifs](#member-44)
- [id](#member-46)
- [icon](#member-47)
- [from](#member-48)
- [res](#member-49)
- [show](#member-50)
- [defshow](#member-51)
- [notify](#member-52)
- [resns](#member-53)
- [filens](#member-54)
- [mark](#member-55)
- [markset](#member-56)
- [res](#member-57)
- [sub](#member-58)
- [lres](#member-67)
- [sig](#member-71)
- [ui](#member-72)
- [filename](#member-73)
- [settings](#member-74)
- [tag](#member-75)
- [notify](#member-76)
- [res](#member-79)
- [data](#member-80)
- [loading](#member-85)
- [load](#member-86)
- [defaults](#member-87)
- [resolve](#member-88)
- [save](#member-89)
- [adv](#member-90)
- [tag](#member-91)
- [advbuf](#member-92)
- [cached](#member-93)
- [r](#member-94)
- [next](#member-95)
- [nset](#member-96)
- [ctxr](#member-101)
- [saveagain](#member-109)
- [saving](#member-110)
- [name](#member-114)
- [res](#member-115)
- [wav](#member-116)
- [nil](#member-122)
- [other](#member-123)
- [builtin](#member-124)
- [conf](#member-125)
- [cont](#member-126)
- [list](#member-127)
- [setbox](#member-128)
- [conf](#member-129)
- [name](#member-130)
- [id](#member-131)
- [elf](#member-134)
- [elh](#member-135)
- [ordered](#member-136)
- [cur](#member-137)
- [conf](#member-146)
- [nb](#member-147)
- [items](#member-149)

#### Methods

- [Icon(OwnerContext owner, Resource res)](#member-9)
- [public abstract String name();](#member-10)
- [public abstract BufferedImage image();](#member-11)
- [public abstract void draw(GOut g, Coord cc);](#member-12)
- [public abstract boolean checkhit(Coord c);](#member-13)
- [info(ItemInfo.Owner owner)](#member-14)
- [id()](#member-15)
- [z()](#member-16)
- [markable()](#member-17)
- [hover(Coord c, boolean hovering)](#member-18)
- [public Icon create(OwnerContext owner, Resource res, Message sdt);](#member-19)
- [public Collection<? extends Icon> enumerate(OwnerContext owner, Resource res, Message sdt);](#member-20)
- [Image(Resource res)](#member-28)
- [get(Resource res)](#member-29)
- [ImageIcon(OwnerContext owner, Resource res, Image img)](#member-32)
- [name()](#member-33)
- [image()](#member-34)
- [draw(GOut g, Coord cc)](#member-35)
- [checkhit(Coord c)](#member-36)
- [z()](#member-37)
- [markable()](#member-38)
- [getfac(Resource res)](#member-40)
- [icon()](#member-41)
- [resnotif(String nm)](#member-42)
- [wavnotif(Path path)](#member-43)
- [notiflimit(Consumer<UI> bk, Object id)](#member-45)
- [ID(String res, Object[] sub)](#member-59)
- [hashCode()](#member-60)
- [equals(ID that)](#member-61)
- [equals(Object x)](#member-62)
- [Setting(Resource.Saved res, Object[] id, Icon icon, Settings.ResID from)](#member-63)
- [Setting(Resource.Saved res, Object[] id)](#member-64)
- [Setting(Icon icon, Settings.ResID from)](#member-65)
- [notification()](#member-66)
- [resource()](#member-68)
- [getmarkablep()](#member-69)
- [getmarkp()](#member-70)
- [Settings(UI ui, String filename)](#member-77)
- [get(Icon icon)](#member-78)
- [ResID(Resource.Saved res, byte[] data)](#member-81)
- [hashCode()](#member-82)
- [equals(ResID that)](#member-83)
- [equals(Object x)](#member-84)
- [Loader(boolean cached)](#member-97)
- [merge(Setting set, Setting conf)](#member-98)
- [run()](#member-99)
- [submit()](#member-100)
- [context(Class<T> cl)](#member-102)
- [receive(Object[] args)](#member-103)
- [encodeset(Map<Object, Object> buf, Setting set)](#member-104)
- [save(Message dst)](#member-105)
- [parseset(Setting set, Map<Object, Object> data)](#member-106)
- [load(Message blob)](#member-107)
- [save()](#member-108)
- [dsave0()](#member-111)
- [dsave()](#member-112)
- [public static Settings load(UI ui, String name) throws IOException](#member-113)
- [NotificationSetting(String name, String res, Path wav)](#member-117)
- [NotificationSetting(String name, String res)](#member-118)
- [NotificationSetting(String name, Path wav)](#member-119)
- [NotificationSetting(Path wav)](#member-120)
- [act(Setting conf)](#member-121)
- [ListIcon(Setting conf)](#member-132)
- [andsave(Consumer<T> main)](#member-133)
- [IconList(Coord sz)](#member-138)
- [IconLine(Coord sz, ListIcon icon)](#member-139)
- [searchmatch(ListIcon icon, String text)](#member-140)
- [allitems()](#member-141)
- [makeitem(ListIcon icon, int idx, Coord sz)](#member-142)
- [tick(double dt)](#member-143)
- [keydown(KeyDownEvent ev)](#member-144)
- [change(ListIcon icon)](#member-145)
- [IconSettings(int w, Setting conf)](#member-148)
- [NotifBox(int w)](#member-150)
- [items()](#member-151)
- [makeitem(NotificationSetting item, int idx, Coord sz)](#member-152)
- [selectwav()](#member-153)
- [change(NotificationSetting item)](#member-154)
- [play()](#member-155)
- [SettingsWindow(Settings conf)](#member-156)
- [apply(Gob g, OCache.AttrDelta msg)](#member-157)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `size`

- Description: TODO

<a id="member-2"></a>
##### `filter`

- Description: TODO

<a id="member-3"></a>
##### `res`

- Description: TODO

<a id="member-4"></a>
##### `sdt`

- Description: TODO

<a id="member-5"></a>
##### `icon`

- Description: TODO

<a id="member-6"></a>
##### `nilid`

- Description: TODO

<a id="member-7"></a>
##### `owner`

- Description: TODO

<a id="member-8"></a>
##### `res`

- Description: TODO

<a id="member-21"></a>
##### `cache`

- Description: TODO

<a id="member-22"></a>
##### `img`

- Description: TODO

<a id="member-23"></a>
##### `tex`

- Description: TODO

<a id="member-24"></a>
##### `cc`

- Description: TODO

<a id="member-25"></a>
##### `rot`

- Description: TODO

<a id="member-26"></a>
##### `ao`

- Description: TODO

<a id="member-27"></a>
##### `z`

- Description: TODO

<a id="member-30"></a>
##### `img`

- Description: TODO

<a id="member-31"></a>
##### `gob`

- Description: TODO

<a id="member-39"></a>
##### `factory`

- Description: TODO

<a id="member-44"></a>
##### `lastnotifs`

- Description: TODO

<a id="member-46"></a>
##### `id`

- Description: TODO

<a id="member-47"></a>
##### `icon`

- Description: TODO

<a id="member-48"></a>
##### `from`

- Description: TODO

<a id="member-49"></a>
##### `res`

- Description: TODO

<a id="member-50"></a>
##### `show`

- Description: TODO

<a id="member-51"></a>
##### `defshow`

- Description: TODO

<a id="member-52"></a>
##### `notify`

- Description: TODO

<a id="member-53"></a>
##### `resns`

- Description: TODO

<a id="member-54"></a>
##### `filens`

- Description: TODO

<a id="member-55"></a>
##### `mark`

- Description: TODO

<a id="member-56"></a>
##### `markset`

- Description: TODO

<a id="member-57"></a>
##### `res`

- Description: TODO

<a id="member-58"></a>
##### `sub`

- Description: TODO

<a id="member-67"></a>
##### `lres`

- Description: TODO

<a id="member-71"></a>
##### `sig`

- Description: TODO

<a id="member-72"></a>
##### `ui`

- Description: TODO

<a id="member-73"></a>
##### `filename`

- Description: TODO

<a id="member-74"></a>
##### `settings`

- Description: TODO

<a id="member-75"></a>
##### `tag`

- Description: TODO

<a id="member-76"></a>
##### `notify`

- Description: TODO

<a id="member-79"></a>
##### `res`

- Description: TODO

<a id="member-80"></a>
##### `data`

- Description: TODO

<a id="member-85"></a>
##### `loading`

- Description: TODO

<a id="member-86"></a>
##### `load`

- Description: TODO

<a id="member-87"></a>
##### `defaults`

- Description: TODO

<a id="member-88"></a>
##### `resolve`

- Description: TODO

<a id="member-89"></a>
##### `save`

- Description: TODO

<a id="member-90"></a>
##### `adv`

- Description: TODO

<a id="member-91"></a>
##### `tag`

- Description: TODO

<a id="member-92"></a>
##### `advbuf`

- Description: TODO

<a id="member-93"></a>
##### `cached`

- Description: TODO

<a id="member-94"></a>
##### `r`

- Description: TODO

<a id="member-95"></a>
##### `next`

- Description: TODO

<a id="member-96"></a>
##### `nset`

- Description: TODO

<a id="member-101"></a>
##### `ctxr`

- Description: TODO

<a id="member-109"></a>
##### `saveagain`

- Description: TODO

<a id="member-110"></a>
##### `saving`

- Description: TODO

<a id="member-114"></a>
##### `name`

- Description: TODO

<a id="member-115"></a>
##### `res`

- Description: TODO

<a id="member-116"></a>
##### `wav`

- Description: TODO

<a id="member-122"></a>
##### `nil`

- Description: TODO

<a id="member-123"></a>
##### `other`

- Description: TODO

<a id="member-124"></a>
##### `builtin`

- Description: TODO

<a id="member-125"></a>
##### `conf`

- Description: TODO

<a id="member-126"></a>
##### `cont`

- Description: TODO

<a id="member-127"></a>
##### `list`

- Description: TODO

<a id="member-128"></a>
##### `setbox`

- Description: TODO

<a id="member-129"></a>
##### `conf`

- Description: TODO

<a id="member-130"></a>
##### `name`

- Description: TODO

<a id="member-131"></a>
##### `id`

- Description: TODO

<a id="member-134"></a>
##### `elf`

- Description: TODO

<a id="member-135"></a>
##### `elh`

- Description: TODO

<a id="member-136"></a>
##### `ordered`

- Description: TODO

<a id="member-137"></a>
##### `cur`

- Description: TODO

<a id="member-146"></a>
##### `conf`

- Description: TODO

<a id="member-147"></a>
##### `nb`

- Description: TODO

<a id="member-149"></a>
##### `items`

- Description: TODO

#### Methods

<a id="member-9"></a>
##### `Icon(OwnerContext owner, Resource res)`

- Description: TODO

<a id="member-10"></a>
##### `public abstract String name();`

- Description: TODO

<a id="member-11"></a>
##### `public abstract BufferedImage image();`

- Description: TODO

<a id="member-12"></a>
##### `public abstract void draw(GOut g, Coord cc);`

- Description: TODO

<a id="member-13"></a>
##### `public abstract boolean checkhit(Coord c);`

- Description: TODO

<a id="member-14"></a>
##### `info(ItemInfo.Owner owner)`

- Description: TODO

<a id="member-15"></a>
##### `id()`

- Description: TODO

<a id="member-16"></a>
##### `z()`

- Description: TODO

<a id="member-17"></a>
##### `markable()`

- Description: TODO

<a id="member-18"></a>
##### `hover(Coord c, boolean hovering)`

- Description: TODO

<a id="member-19"></a>
##### `public Icon create(OwnerContext owner, Resource res, Message sdt);`

- Description: TODO

<a id="member-20"></a>
##### `public Collection<? extends Icon> enumerate(OwnerContext owner, Resource res, Message sdt);`

- Description: TODO

<a id="member-28"></a>
##### `Image(Resource res)`

- Description: TODO

<a id="member-29"></a>
##### `get(Resource res)`

- Description: TODO

<a id="member-32"></a>
##### `ImageIcon(OwnerContext owner, Resource res, Image img)`

- Description: TODO

<a id="member-33"></a>
##### `name()`

- Description: TODO

<a id="member-34"></a>
##### `image()`

- Description: TODO

<a id="member-35"></a>
##### `draw(GOut g, Coord cc)`

- Description: TODO

<a id="member-36"></a>
##### `checkhit(Coord c)`

- Description: TODO

<a id="member-37"></a>
##### `z()`

- Description: TODO

<a id="member-38"></a>
##### `markable()`

- Description: TODO

<a id="member-40"></a>
##### `getfac(Resource res)`

- Description: TODO

<a id="member-41"></a>
##### `icon()`

- Description: TODO

<a id="member-42"></a>
##### `resnotif(String nm)`

- Description: TODO

<a id="member-43"></a>
##### `wavnotif(Path path)`

- Description: TODO

<a id="member-45"></a>
##### `notiflimit(Consumer<UI> bk, Object id)`

- Description: TODO

<a id="member-59"></a>
##### `ID(String res, Object[] sub)`

- Description: TODO

<a id="member-60"></a>
##### `hashCode()`

- Description: TODO

<a id="member-61"></a>
##### `equals(ID that)`

- Description: TODO

<a id="member-62"></a>
##### `equals(Object x)`

- Description: TODO

<a id="member-63"></a>
##### `Setting(Resource.Saved res, Object[] id, Icon icon, Settings.ResID from)`

- Description: TODO

<a id="member-64"></a>
##### `Setting(Resource.Saved res, Object[] id)`

- Description: TODO

<a id="member-65"></a>
##### `Setting(Icon icon, Settings.ResID from)`

- Description: TODO

<a id="member-66"></a>
##### `notification()`

- Description: TODO

<a id="member-68"></a>
##### `resource()`

- Description: TODO

<a id="member-69"></a>
##### `getmarkablep()`

- Description: TODO

<a id="member-70"></a>
##### `getmarkp()`

- Description: TODO

<a id="member-77"></a>
##### `Settings(UI ui, String filename)`

- Description: TODO

<a id="member-78"></a>
##### `get(Icon icon)`

- Description: TODO

<a id="member-81"></a>
##### `ResID(Resource.Saved res, byte[] data)`

- Description: TODO

<a id="member-82"></a>
##### `hashCode()`

- Description: TODO

<a id="member-83"></a>
##### `equals(ResID that)`

- Description: TODO

<a id="member-84"></a>
##### `equals(Object x)`

- Description: TODO

<a id="member-97"></a>
##### `Loader(boolean cached)`

- Description: TODO

<a id="member-98"></a>
##### `merge(Setting set, Setting conf)`

- Description: TODO

<a id="member-99"></a>
##### `run()`

- Description: TODO

<a id="member-100"></a>
##### `submit()`

- Description: TODO

<a id="member-102"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-103"></a>
##### `receive(Object[] args)`

- Description: TODO

<a id="member-104"></a>
##### `encodeset(Map<Object, Object> buf, Setting set)`

- Description: TODO

<a id="member-105"></a>
##### `save(Message dst)`

- Description: TODO

<a id="member-106"></a>
##### `parseset(Setting set, Map<Object, Object> data)`

- Description: TODO

<a id="member-107"></a>
##### `load(Message blob)`

- Description: TODO

<a id="member-108"></a>
##### `save()`

- Description: TODO

<a id="member-111"></a>
##### `dsave0()`

- Description: TODO

<a id="member-112"></a>
##### `dsave()`

- Description: TODO

<a id="member-113"></a>
##### `public static Settings load(UI ui, String name) throws IOException`

- Description: TODO

<a id="member-117"></a>
##### `NotificationSetting(String name, String res, Path wav)`

- Description: TODO

<a id="member-118"></a>
##### `NotificationSetting(String name, String res)`

- Description: TODO

<a id="member-119"></a>
##### `NotificationSetting(String name, Path wav)`

- Description: TODO

<a id="member-120"></a>
##### `NotificationSetting(Path wav)`

- Description: TODO

<a id="member-121"></a>
##### `act(Setting conf)`

- Description: TODO

<a id="member-132"></a>
##### `ListIcon(Setting conf)`

- Description: TODO

<a id="member-133"></a>
##### `andsave(Consumer<T> main)`

- Description: TODO

<a id="member-138"></a>
##### `IconList(Coord sz)`

- Description: TODO

<a id="member-139"></a>
##### `IconLine(Coord sz, ListIcon icon)`

- Description: TODO

<a id="member-140"></a>
##### `searchmatch(ListIcon icon, String text)`

- Description: TODO

<a id="member-141"></a>
##### `allitems()`

- Description: TODO

<a id="member-142"></a>
##### `makeitem(ListIcon icon, int idx, Coord sz)`

- Description: TODO

<a id="member-143"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-144"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-145"></a>
##### `change(ListIcon icon)`

- Description: TODO

<a id="member-148"></a>
##### `IconSettings(int w, Setting conf)`

- Description: TODO

<a id="member-150"></a>
##### `NotifBox(int w)`

- Description: TODO

<a id="member-151"></a>
##### `items()`

- Description: TODO

<a id="member-152"></a>
##### `makeitem(NotificationSetting item, int idx, Coord sz)`

- Description: TODO

<a id="member-153"></a>
##### `selectwav()`

- Description: TODO

<a id="member-154"></a>
##### `change(NotificationSetting item)`

- Description: TODO

<a id="member-155"></a>
##### `play()`

- Description: TODO

<a id="member-156"></a>
##### `SettingsWindow(Settings conf)`

- Description: TODO

<a id="member-157"></a>
##### `apply(Gob g, OCache.AttrDelta msg)`

- Description: TODO
