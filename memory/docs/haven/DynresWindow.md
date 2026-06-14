# DynresWindow

## Meta

- Source: [DynresWindow.java](../../../src/haven/DynresWindow.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays dynamic resource upload state.

## Code Members

### Member Index

#### Fields

- [service](#member-1)
- [itemsz](#member-2)
- [previews](#member-3)
- [pal](#member-4)
- [imgs](#member-5)
- [adder](#member-6)
- [pal](#member-11)
- [types](#member-12)
- [processing](#member-20)
- [menu](#member-21)
- [id](#member-37)
- [res](#member-38)
- [img](#member-39)
- [menu](#member-40)
- [tex](#member-43)
- [key](#member-55)
- [specs](#member-56)
- [view](#member-57)
- [vres](#member-58)
- [list](#member-59)
- [name](#member-63)
- [res](#member-64)
- [sdt](#member-65)
- [sdtoff](#member-66)
- [resmap](#member-67)
- [st](#member-68)
- [ctxr](#member-71)
- [bk](#member-72)
- [vres](#member-73)
- [spec](#member-80)
- [vres](#member-81)
- [spr](#member-82)
- [slot](#member-83)
- [field](#member-84)
- [elev](#member-85)
- [angl](#member-86)
- [tfield](#member-87)
- [telev](#member-88)
- [tangl](#member-89)
- [ctxr](#member-98)
- [dragstart](#member-103)
- [grab](#member-104)
- [dragelev](#member-105)
- [dragangl](#member-106)
- [img](#member-110)
- [tex](#member-111)
- [display](#member-112)
- [uploadbtn](#member-113)
- [upload](#member-114)
- [prog](#member-115)
- [data](#member-120)
- [off](#member-121)
- [resp](#member-122)

#### Methods

- [create(UI ui, Object[] args)](#member-7)
- [public static Map<String, Object> ttoresp(HttpURLConnection conn) throws IOException](#member-8)
- [auth(Session sess)](#member-9)
- [process(BufferedImage in)](#member-10)
- [PaletteCopy(Color[] pal)](#member-13)
- [img()](#member-14)
- [text()](#member-15)
- [getTransferDataFlavors()](#member-16)
- [isDataFlavorSupported(DataFlavor f)](#member-17)
- [getTransferData(DataFlavor f)](#member-18)
- [lostOwnership(Clipboard c, Transferable t)](#member-19)
- [Adder(Coord sz)](#member-22)
- [mktip()](#member-23)
- [draw(GOut g)](#member-24)
- [create(Supplier<BufferedImage> img)](#member-25)
- [tick(double dt)](#member-26)
- [open(File file)](#member-27)
- [open()](#member-28)
- [private BufferedImage getpaste(Clipboard c) throws IOException](#member-29)
- [paste()](#member-30)
- [mousedown(MouseDownEvent ev)](#member-31)
- [copypal()](#member-32)
- [mousehover(MouseHoverEvent ev, boolean hovering)](#member-33)
- [drophover(Coord c, boolean hovering, Object thing)](#member-34)
- [dropthing(Coord c, Object thing)](#member-35)
- [keydown(KeyDownEvent ev)](#member-36)
- [Image(Coord sz, UID id)](#member-41)
- [Image(UID id)](#member-42)
- [draw(GOut g)](#member-44)
- [craft(boolean master)](#member-45)
- [delete0()](#member-46)
- [delete()](#member-47)
- [copy()](#member-48)
- [getTransferDataFlavors()](#member-49)
- [isDataFlavorSupported(DataFlavor f)](#member-50)
- [getTransferData(DataFlavor f)](#member-51)
- [lostOwnership(Clipboard c, Transferable t)](#member-52)
- [mousehover(MouseHoverEvent ev, boolean hovering)](#member-53)
- [setinfo(int fields, float outline)](#member-54)
- [Preview(int minw, List<Spec> specs, TexL tex)](#member-60)
- [consres(TexL tex)](#member-61)
- [set(Spec spec)](#member-62)
- [Spec(Map<String, Object> spec)](#member-69)
- [fetch()](#member-70)
- [Owner(Sprite.Owner bk, Indir<Resource> vres)](#member-74)
- [getres(int id)](#member-75)
- [dynres(UID uid)](#member-76)
- [context(Class<T> cl)](#member-77)
- [mkrandoom()](#member-78)
- [create(Sprite.Owner owner, Indir<Resource> vres)](#member-79)
- [View(Coord sz, Spec spec, Indir<Resource> vres)](#member-90)
- [makeproj()](#member-91)
- [resize(Coord sz)](#member-92)
- [clearcolor()](#member-93)
- [getbounds(RenderTree.Node spr)](#member-94)
- [updatecam(double dt)](#member-95)
- [tick(double dt)](#member-96)
- [gtick(Render out)](#member-97)
- [context(Class<T> cl)](#member-99)
- [mkrandoom()](#member-100)
- [SuppressWarnings("deprecation") public Resource getres()](#member-101)
- [mousewheel(MouseWheelEvent ev)](#member-102)
- [mousedown(MouseDownEvent ev)](#member-107)
- [mouseup(MouseUpEvent ev)](#member-108)
- [mousemove(MouseMoveEvent ev)](#member-109)
- [PreviewWindow(BufferedImage img, List<Preview.Spec> previews)](#member-116)
- [Display(Coord sz)](#member-117)
- [draw(GOut g)](#member-118)
- [reqclose()](#member-119)
- [void prepare() throws IOException](#member-123)
- [void post() throws IOException](#member-124)
- [void handle() throws IOException](#member-125)
- [restore()](#member-126)
- [run()](#member-127)
- [prog()](#member-128)
- [text()](#member-129)
- [upload()](#member-130)
- [arrange()](#member-131)
- [find(UID id)](#member-132)
- [uimsg(String nm, Object... args)](#member-133)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `service`

- Description: TODO

<a id="member-2"></a>
##### `itemsz`

- Description: TODO

<a id="member-3"></a>
##### `previews`

- Description: TODO

<a id="member-4"></a>
##### `pal`

- Description: TODO

<a id="member-5"></a>
##### `imgs`

- Description: TODO

<a id="member-6"></a>
##### `adder`

- Description: TODO

<a id="member-11"></a>
##### `pal`

- Description: TODO

<a id="member-12"></a>
##### `types`

- Description: TODO

<a id="member-20"></a>
##### `processing`

- Description: TODO

<a id="member-21"></a>
##### `menu`

- Description: TODO

<a id="member-37"></a>
##### `id`

- Description: TODO

<a id="member-38"></a>
##### `res`

- Description: TODO

<a id="member-39"></a>
##### `img`

- Description: TODO

<a id="member-40"></a>
##### `menu`

- Description: TODO

<a id="member-43"></a>
##### `tex`

- Description: TODO

<a id="member-55"></a>
##### `key`

- Description: TODO

<a id="member-56"></a>
##### `specs`

- Description: TODO

<a id="member-57"></a>
##### `view`

- Description: TODO

<a id="member-58"></a>
##### `vres`

- Description: TODO

<a id="member-59"></a>
##### `list`

- Description: TODO

<a id="member-63"></a>
##### `name`

- Description: TODO

<a id="member-64"></a>
##### `res`

- Description: TODO

<a id="member-65"></a>
##### `sdt`

- Description: TODO

<a id="member-66"></a>
##### `sdtoff`

- Description: TODO

<a id="member-67"></a>
##### `resmap`

- Description: TODO

<a id="member-68"></a>
##### `st`

- Description: TODO

<a id="member-71"></a>
##### `ctxr`

- Description: TODO

<a id="member-72"></a>
##### `bk`

- Description: TODO

<a id="member-73"></a>
##### `vres`

- Description: TODO

<a id="member-80"></a>
##### `spec`

- Description: TODO

<a id="member-81"></a>
##### `vres`

- Description: TODO

<a id="member-82"></a>
##### `spr`

- Description: TODO

<a id="member-83"></a>
##### `slot`

- Description: TODO

<a id="member-84"></a>
##### `field`

- Description: TODO

<a id="member-85"></a>
##### `elev`

- Description: TODO

<a id="member-86"></a>
##### `angl`

- Description: TODO

<a id="member-87"></a>
##### `tfield`

- Description: TODO

<a id="member-88"></a>
##### `telev`

- Description: TODO

<a id="member-89"></a>
##### `tangl`

- Description: TODO

<a id="member-98"></a>
##### `ctxr`

- Description: TODO

<a id="member-103"></a>
##### `dragstart`

- Description: TODO

<a id="member-104"></a>
##### `grab`

- Description: TODO

<a id="member-105"></a>
##### `dragelev`

- Description: TODO

<a id="member-106"></a>
##### `dragangl`

- Description: TODO

<a id="member-110"></a>
##### `img`

- Description: TODO

<a id="member-111"></a>
##### `tex`

- Description: TODO

<a id="member-112"></a>
##### `display`

- Description: TODO

<a id="member-113"></a>
##### `uploadbtn`

- Description: TODO

<a id="member-114"></a>
##### `upload`

- Description: TODO

<a id="member-115"></a>
##### `prog`

- Description: TODO

<a id="member-120"></a>
##### `data`

- Description: TODO

<a id="member-121"></a>
##### `off`

- Description: TODO

<a id="member-122"></a>
##### `resp`

- Description: TODO

#### Methods

<a id="member-7"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-8"></a>
##### `public static Map<String, Object> ttoresp(HttpURLConnection conn) throws IOException`

- Description: TODO

<a id="member-9"></a>
##### `auth(Session sess)`

- Description: TODO

<a id="member-10"></a>
##### `process(BufferedImage in)`

- Description: TODO

<a id="member-13"></a>
##### `PaletteCopy(Color[] pal)`

- Description: TODO

<a id="member-14"></a>
##### `img()`

- Description: TODO

<a id="member-15"></a>
##### `text()`

- Description: TODO

<a id="member-16"></a>
##### `getTransferDataFlavors()`

- Description: TODO

<a id="member-17"></a>
##### `isDataFlavorSupported(DataFlavor f)`

- Description: TODO

<a id="member-18"></a>
##### `getTransferData(DataFlavor f)`

- Description: TODO

<a id="member-19"></a>
##### `lostOwnership(Clipboard c, Transferable t)`

- Description: TODO

<a id="member-22"></a>
##### `Adder(Coord sz)`

- Description: TODO

<a id="member-23"></a>
##### `mktip()`

- Description: TODO

<a id="member-24"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-25"></a>
##### `create(Supplier<BufferedImage> img)`

- Description: TODO

<a id="member-26"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-27"></a>
##### `open(File file)`

- Description: TODO

<a id="member-28"></a>
##### `open()`

- Description: TODO

<a id="member-29"></a>
##### `private BufferedImage getpaste(Clipboard c) throws IOException`

- Description: TODO

<a id="member-30"></a>
##### `paste()`

- Description: TODO

<a id="member-31"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-32"></a>
##### `copypal()`

- Description: TODO

<a id="member-33"></a>
##### `mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

<a id="member-34"></a>
##### `drophover(Coord c, boolean hovering, Object thing)`

- Description: TODO

<a id="member-35"></a>
##### `dropthing(Coord c, Object thing)`

- Description: TODO

<a id="member-36"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-41"></a>
##### `Image(Coord sz, UID id)`

- Description: TODO

<a id="member-42"></a>
##### `Image(UID id)`

- Description: TODO

<a id="member-44"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-45"></a>
##### `craft(boolean master)`

- Description: TODO

<a id="member-46"></a>
##### `delete0()`

- Description: TODO

<a id="member-47"></a>
##### `delete()`

- Description: TODO

<a id="member-48"></a>
##### `copy()`

- Description: TODO

<a id="member-49"></a>
##### `getTransferDataFlavors()`

- Description: TODO

<a id="member-50"></a>
##### `isDataFlavorSupported(DataFlavor f)`

- Description: TODO

<a id="member-51"></a>
##### `getTransferData(DataFlavor f)`

- Description: TODO

<a id="member-52"></a>
##### `lostOwnership(Clipboard c, Transferable t)`

- Description: TODO

<a id="member-53"></a>
##### `mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

<a id="member-54"></a>
##### `setinfo(int fields, float outline)`

- Description: TODO

<a id="member-60"></a>
##### `Preview(int minw, List<Spec> specs, TexL tex)`

- Description: TODO

<a id="member-61"></a>
##### `consres(TexL tex)`

- Description: TODO

<a id="member-62"></a>
##### `set(Spec spec)`

- Description: TODO

<a id="member-69"></a>
##### `Spec(Map<String, Object> spec)`

- Description: TODO

<a id="member-70"></a>
##### `fetch()`

- Description: TODO

<a id="member-74"></a>
##### `Owner(Sprite.Owner bk, Indir<Resource> vres)`

- Description: TODO

<a id="member-75"></a>
##### `getres(int id)`

- Description: TODO

<a id="member-76"></a>
##### `dynres(UID uid)`

- Description: TODO

<a id="member-77"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-78"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-79"></a>
##### `create(Sprite.Owner owner, Indir<Resource> vres)`

- Description: TODO

<a id="member-90"></a>
##### `View(Coord sz, Spec spec, Indir<Resource> vres)`

- Description: TODO

<a id="member-91"></a>
##### `makeproj()`

- Description: TODO

<a id="member-92"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-93"></a>
##### `clearcolor()`

- Description: TODO

<a id="member-94"></a>
##### `getbounds(RenderTree.Node spr)`

- Description: TODO

<a id="member-95"></a>
##### `updatecam(double dt)`

- Description: TODO

<a id="member-96"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-97"></a>
##### `gtick(Render out)`

- Description: TODO

<a id="member-99"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-100"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-101"></a>
##### `SuppressWarnings("deprecation") public Resource getres()`

- Description: TODO

<a id="member-102"></a>
##### `mousewheel(MouseWheelEvent ev)`

- Description: TODO

<a id="member-107"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-108"></a>
##### `mouseup(MouseUpEvent ev)`

- Description: TODO

<a id="member-109"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-116"></a>
##### `PreviewWindow(BufferedImage img, List<Preview.Spec> previews)`

- Description: TODO

<a id="member-117"></a>
##### `Display(Coord sz)`

- Description: TODO

<a id="member-118"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-119"></a>
##### `reqclose()`

- Description: TODO

<a id="member-123"></a>
##### `void prepare() throws IOException`

- Description: TODO

<a id="member-124"></a>
##### `void post() throws IOException`

- Description: TODO

<a id="member-125"></a>
##### `void handle() throws IOException`

- Description: TODO

<a id="member-126"></a>
##### `restore()`

- Description: TODO

<a id="member-127"></a>
##### `run()`

- Description: TODO

<a id="member-128"></a>
##### `prog()`

- Description: TODO

<a id="member-129"></a>
##### `text()`

- Description: TODO

<a id="member-130"></a>
##### `upload()`

- Description: TODO

<a id="member-131"></a>
##### `arrange()`

- Description: TODO

<a id="member-132"></a>
##### `find(UID id)`

- Description: TODO

<a id="member-133"></a>
##### `uimsg(String nm, Object... args)`

- Description: TODO
