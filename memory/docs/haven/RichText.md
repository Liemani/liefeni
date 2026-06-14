# RichText

## Meta

- Source: [RichText.java](../../../src/haven/RichText.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Parses and renders rich text.

## Code Members

### Member Index

#### Constants

- [IMAGESRC](#member-1)

#### Fields

- [std](#member-2)
- [stdf](#member-3)
- [parts](#member-4)
- [frc](#member-5)
- [next](#member-8)
- [x](#member-9)
- [y](#member-10)
- [rs](#member-11)
- [legacy](#member-24)
- [img](#member-25)
- [h](#member-26)
- [lh](#member-27)
- [bh](#member-28)
- [attrs](#member-29)
- [imgscale](#member-30)
- [sz](#member-31)
- [attrs](#member-41)
- [lm](#member-42)
- [str](#member-47)
- [start](#member-48)
- [end](#member-49)
- [tm](#member-50)
- [tl](#member-51)
- [text](#member-74)
- [attrs](#member-75)
- [defattrs](#member-81)
- [in](#member-84)
- [aa](#member-100)
- [parser](#member-101)
- [rs](#member-102)

#### Methods

- [RState(FontRenderContext frc)](#member-6)
- [FormatException(String msg)](#member-7)
- [append(Part p)](#member-12)
- [prepare(RState rs)](#member-13)
- [width()](#member-14)
- [height()](#member-15)
- [baseline()](#member-16)
- [render(Graphics2D g)](#member-17)
- [split(int w)](#member-18)
- [public Image get(String[] args, int[] ap);](#member-19)
- [chain(ImageSource... srcs)](#member-20)
- [id(String id, Supplier<? extends Image> img)](#member-21)
- [res(Resource res)](#member-22)
- [res(Resource.Pool pool)](#member-23)
- [Image(BufferedImage img)](#member-32)
- [Image(Resource.Image img)](#member-33)
- [Image(Resource res, int id)](#member-34)
- [lm()](#member-35)
- [prepare(RState rs)](#member-36)
- [width()](#member-37)
- [height()](#member-38)
- [baseline()](#member-39)
- [render(Graphics2D g)](#member-40)
- [Newline(Map<? extends Attribute, ?> attrs)](#member-43)
- [lm()](#member-44)
- [height()](#member-45)
- [baseline()](#member-46)
- [TextPart(AttributedString str, int start, int end)](#member-52)
- [TextPart(String str, Map<? extends Attribute, ?> attrs)](#member-53)
- [TextPart(String str)](#member-54)
- [ti()](#member-55)
- [append(Part p)](#member-56)
- [tm()](#member-57)
- [tl()](#member-58)
- [advance(int from, int to)](#member-59)
- [width()](#member-60)
- [height()](#member-61)
- [baseline()](#member-62)
- [split2(int e1, int s2)](#member-63)
- [split(int w)](#member-64)
- [render(Graphics2D g)](#member-65)
- [charat(float x, float y)](#member-66)
- [charat(Coord c)](#member-67)
- [partat(Coord c)](#member-68)
- [attrat(Coord c)](#member-69)
- [attrat(Coord c, Attribute attr)](#member-70)
- [fillattrs2(Map<? extends Attribute, ?> def, Object... attrs)](#member-71)
- [fillattrs(Object... attrs)](#member-72)
- [mergeattrs(Map<? extends Attribute, ?>... parts)](#member-73)
- [Document(String text, Map<? extends Attribute, ?> attrs)](#member-76)
- [Document(String text, Object... attrs)](#member-77)
- [Document(String text)](#member-78)
- [respag(Indir<Resource> res)](#member-79)
- [fixattrs(Map<? extends Attribute, ?> attrs)](#member-80)
- [Parser(Map<? extends Attribute, ?> defattrs)](#member-82)
- [Parser(Object... attrs)](#member-83)
- [PState(PeekReader in)](#member-85)
- [namechar(char c)](#member-86)
- [protected String name(PeekReader in) throws IOException](#member-87)
- [a2col(String[] args)](#member-88)
- [protected Part tag(PState s, String tn, String[] args, Map<? extends Attribute, ?> attrs) throws IOException](#member-89)
- [protected Part tag(PState s, Map<? extends Attribute, ?> attrs) throws IOException](#member-90)
- [protected Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException](#member-91)
- [protected Part text(PState s, Map<? extends Attribute, ?> attrs) throws IOException](#member-92)
- [protected Part parse(PState s, Map<? extends Attribute, ?> attrs) throws IOException](#member-93)
- [public Part parse(Reader in, Map<? extends Attribute, ?> extra) throws IOException](#member-94)
- [public Part parse(Reader in) throws IOException](#member-95)
- [parse(String text, Map<? extends Attribute, ?> extra)](#member-96)
- [parse(String text)](#member-97)
- [quote(String in)](#member-98)
- [col2a(Color col)](#member-99)
- [Foundry(Parser parser)](#member-103)
- [Foundry(Map<? extends Attribute, ?> defattrs)](#member-104)
- [Foundry(Object... attrs)](#member-105)
- [xlate(Font f, Color defcol)](#member-106)
- [Foundry(Font f, Color defcol)](#member-107)
- [derive(Map<? extends Attribute, ?> extra)](#member-108)
- [derive(Object... extra)](#member-109)
- [aa(boolean aa)](#member-110)
- [private static void aline/* Hurrhurr, pun intended*/(List<Part> line, int y)](#member-111)
- [layout(Part fp, int w)](#member-112)
- [bounds(Part fp)](#member-113)
- [render(Document doc, int width)](#member-114)
- [render(String text, int width, Map<? extends Attribute, ?> extra)](#member-115)
- [render(String text, int width, Object... extra)](#member-116)
- [render(String text)](#member-117)
- [render(Document doc, int width)](#member-118)
- [render(String text, int width, Object... extra)](#member-119)
- [public static void main(String[] args) throws Exception](#member-120)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `IMAGESRC`

- Description: TODO

#### Fields

<a id="member-2"></a>
##### `std`

- Description: TODO

<a id="member-3"></a>
##### `stdf`

- Description: TODO

<a id="member-4"></a>
##### `parts`

- Description: TODO

<a id="member-5"></a>
##### `frc`

- Description: TODO

<a id="member-8"></a>
##### `next`

- Description: TODO

<a id="member-9"></a>
##### `x`

- Description: TODO

<a id="member-10"></a>
##### `y`

- Description: TODO

<a id="member-11"></a>
##### `rs`

- Description: TODO

<a id="member-24"></a>
##### `legacy`

- Description: TODO

<a id="member-25"></a>
##### `img`

- Description: TODO

<a id="member-26"></a>
##### `h`

- Description: TODO

<a id="member-27"></a>
##### `lh`

- Description: TODO

<a id="member-28"></a>
##### `bh`

- Description: TODO

<a id="member-29"></a>
##### `attrs`

- Description: TODO

<a id="member-30"></a>
##### `imgscale`

- Description: TODO

<a id="member-31"></a>
##### `sz`

- Description: TODO

<a id="member-41"></a>
##### `attrs`

- Description: TODO

<a id="member-42"></a>
##### `lm`

- Description: TODO

<a id="member-47"></a>
##### `str`

- Description: TODO

<a id="member-48"></a>
##### `start`

- Description: TODO

<a id="member-49"></a>
##### `end`

- Description: TODO

<a id="member-50"></a>
##### `tm`

- Description: TODO

<a id="member-51"></a>
##### `tl`

- Description: TODO

<a id="member-74"></a>
##### `text`

- Description: TODO

<a id="member-75"></a>
##### `attrs`

- Description: TODO

<a id="member-81"></a>
##### `defattrs`

- Description: TODO

<a id="member-84"></a>
##### `in`

- Description: TODO

<a id="member-100"></a>
##### `aa`

- Description: TODO

<a id="member-101"></a>
##### `parser`

- Description: TODO

<a id="member-102"></a>
##### `rs`

- Description: TODO

#### Methods

<a id="member-6"></a>
##### `RState(FontRenderContext frc)`

- Description: TODO

<a id="member-7"></a>
##### `FormatException(String msg)`

- Description: TODO

<a id="member-12"></a>
##### `append(Part p)`

- Description: TODO

<a id="member-13"></a>
##### `prepare(RState rs)`

- Description: TODO

<a id="member-14"></a>
##### `width()`

- Description: TODO

<a id="member-15"></a>
##### `height()`

- Description: TODO

<a id="member-16"></a>
##### `baseline()`

- Description: TODO

<a id="member-17"></a>
##### `render(Graphics2D g)`

- Description: TODO

<a id="member-18"></a>
##### `split(int w)`

- Description: TODO

<a id="member-19"></a>
##### `public Image get(String[] args, int[] ap);`

- Description: TODO

<a id="member-20"></a>
##### `chain(ImageSource... srcs)`

- Description: TODO

<a id="member-21"></a>
##### `id(String id, Supplier<? extends Image> img)`

- Description: TODO

<a id="member-22"></a>
##### `res(Resource res)`

- Description: TODO

<a id="member-23"></a>
##### `res(Resource.Pool pool)`

- Description: TODO

<a id="member-32"></a>
##### `Image(BufferedImage img)`

- Description: TODO

<a id="member-33"></a>
##### `Image(Resource.Image img)`

- Description: TODO

<a id="member-34"></a>
##### `Image(Resource res, int id)`

- Description: TODO

<a id="member-35"></a>
##### `lm()`

- Description: TODO

<a id="member-36"></a>
##### `prepare(RState rs)`

- Description: TODO

<a id="member-37"></a>
##### `width()`

- Description: TODO

<a id="member-38"></a>
##### `height()`

- Description: TODO

<a id="member-39"></a>
##### `baseline()`

- Description: TODO

<a id="member-40"></a>
##### `render(Graphics2D g)`

- Description: TODO

<a id="member-43"></a>
##### `Newline(Map<? extends Attribute, ?> attrs)`

- Description: TODO

<a id="member-44"></a>
##### `lm()`

- Description: TODO

<a id="member-45"></a>
##### `height()`

- Description: TODO

<a id="member-46"></a>
##### `baseline()`

- Description: TODO

<a id="member-52"></a>
##### `TextPart(AttributedString str, int start, int end)`

- Description: TODO

<a id="member-53"></a>
##### `TextPart(String str, Map<? extends Attribute, ?> attrs)`

- Description: TODO

<a id="member-54"></a>
##### `TextPart(String str)`

- Description: TODO

<a id="member-55"></a>
##### `ti()`

- Description: TODO

<a id="member-56"></a>
##### `append(Part p)`

- Description: TODO

<a id="member-57"></a>
##### `tm()`

- Description: TODO

<a id="member-58"></a>
##### `tl()`

- Description: TODO

<a id="member-59"></a>
##### `advance(int from, int to)`

- Description: TODO

<a id="member-60"></a>
##### `width()`

- Description: TODO

<a id="member-61"></a>
##### `height()`

- Description: TODO

<a id="member-62"></a>
##### `baseline()`

- Description: TODO

<a id="member-63"></a>
##### `split2(int e1, int s2)`

- Description: TODO

<a id="member-64"></a>
##### `split(int w)`

- Description: TODO

<a id="member-65"></a>
##### `render(Graphics2D g)`

- Description: TODO

<a id="member-66"></a>
##### `charat(float x, float y)`

- Description: TODO

<a id="member-67"></a>
##### `charat(Coord c)`

- Description: TODO

<a id="member-68"></a>
##### `partat(Coord c)`

- Description: TODO

<a id="member-69"></a>
##### `attrat(Coord c)`

- Description: TODO

<a id="member-70"></a>
##### `attrat(Coord c, Attribute attr)`

- Description: TODO

<a id="member-71"></a>
##### `fillattrs2(Map<? extends Attribute, ?> def, Object... attrs)`

- Description: TODO

<a id="member-72"></a>
##### `fillattrs(Object... attrs)`

- Description: TODO

<a id="member-73"></a>
##### `mergeattrs(Map<? extends Attribute, ?>... parts)`

- Description: TODO

<a id="member-76"></a>
##### `Document(String text, Map<? extends Attribute, ?> attrs)`

- Description: TODO

<a id="member-77"></a>
##### `Document(String text, Object... attrs)`

- Description: TODO

<a id="member-78"></a>
##### `Document(String text)`

- Description: TODO

<a id="member-79"></a>
##### `respag(Indir<Resource> res)`

- Description: TODO

<a id="member-80"></a>
##### `fixattrs(Map<? extends Attribute, ?> attrs)`

- Description: TODO

<a id="member-82"></a>
##### `Parser(Map<? extends Attribute, ?> defattrs)`

- Description: TODO

<a id="member-83"></a>
##### `Parser(Object... attrs)`

- Description: TODO

<a id="member-85"></a>
##### `PState(PeekReader in)`

- Description: TODO

<a id="member-86"></a>
##### `namechar(char c)`

- Description: TODO

<a id="member-87"></a>
##### `protected String name(PeekReader in) throws IOException`

- Description: TODO

<a id="member-88"></a>
##### `a2col(String[] args)`

- Description: TODO

<a id="member-89"></a>
##### `protected Part tag(PState s, String tn, String[] args, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

<a id="member-90"></a>
##### `protected Part tag(PState s, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

<a id="member-91"></a>
##### `protected Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

<a id="member-92"></a>
##### `protected Part text(PState s, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

<a id="member-93"></a>
##### `protected Part parse(PState s, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

<a id="member-94"></a>
##### `public Part parse(Reader in, Map<? extends Attribute, ?> extra) throws IOException`

- Description: TODO

<a id="member-95"></a>
##### `public Part parse(Reader in) throws IOException`

- Description: TODO

<a id="member-96"></a>
##### `parse(String text, Map<? extends Attribute, ?> extra)`

- Description: TODO

<a id="member-97"></a>
##### `parse(String text)`

- Description: TODO

<a id="member-98"></a>
##### `quote(String in)`

- Description: TODO

<a id="member-99"></a>
##### `col2a(Color col)`

- Description: TODO

<a id="member-103"></a>
##### `Foundry(Parser parser)`

- Description: TODO

<a id="member-104"></a>
##### `Foundry(Map<? extends Attribute, ?> defattrs)`

- Description: TODO

<a id="member-105"></a>
##### `Foundry(Object... attrs)`

- Description: TODO

<a id="member-106"></a>
##### `xlate(Font f, Color defcol)`

- Description: TODO

<a id="member-107"></a>
##### `Foundry(Font f, Color defcol)`

- Description: TODO

<a id="member-108"></a>
##### `derive(Map<? extends Attribute, ?> extra)`

- Description: TODO

<a id="member-109"></a>
##### `derive(Object... extra)`

- Description: TODO

<a id="member-110"></a>
##### `aa(boolean aa)`

- Description: TODO

<a id="member-111"></a>
##### `private static void aline/* Hurrhurr, pun intended*/(List<Part> line, int y)`

- Description: TODO

<a id="member-112"></a>
##### `layout(Part fp, int w)`

- Description: TODO

<a id="member-113"></a>
##### `bounds(Part fp)`

- Description: TODO

<a id="member-114"></a>
##### `render(Document doc, int width)`

- Description: TODO

<a id="member-115"></a>
##### `render(String text, int width, Map<? extends Attribute, ?> extra)`

- Description: TODO

<a id="member-116"></a>
##### `render(String text, int width, Object... extra)`

- Description: TODO

<a id="member-117"></a>
##### `render(String text)`

- Description: TODO

<a id="member-118"></a>
##### `render(Document doc, int width)`

- Description: TODO

<a id="member-119"></a>
##### `render(String text, int width, Object... extra)`

- Description: TODO

<a id="member-120"></a>
##### `public static void main(String[] args) throws Exception`

- Description: TODO
