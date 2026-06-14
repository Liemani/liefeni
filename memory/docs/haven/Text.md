# Text

## Meta

- Source: [Text.java](../../../src/haven/Text.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Builds and renders text.

## Code Members

### Member Index

#### Fields

- [serif](#member-1)
- [sans](#member-2)
- [mono](#member-3)
- [fraktur](#member-4)
- [dfont](#member-5)
- [std](#member-6)
- [img](#member-7)
- [text](#member-8)
- [tex](#member-9)
- [black](#member-10)
- [white](#member-11)
- [m](#member-16)
- [m](#member-28)
- [font](#member-29)
- [defcol](#member-30)
- [aa](#member-31)
- [wfnd](#member-32)
- [back](#member-47)
- [bk](#member-52)
- [fnd](#member-61)
- [cur](#member-62)
- [cv](#member-63)

#### Methods

- [Slug(String text, BufferedImage img)](#member-12)
- [public abstract int baseline();](#member-13)
- [public abstract int advance(int pos);](#member-14)
- [public abstract int charat(int x);](#member-15)
- [Line(String text, BufferedImage img, FontMetrics m)](#member-17)
- [base()](#member-18)
- [baseline()](#member-19)
- [advance(int pos)](#member-20)
- [charat(int x)](#member-21)
- [findspaces(String text)](#member-22)
- [public abstract Text render(String text);](#member-23)
- [renderf(String fmt, Object... args)](#member-24)
- [public abstract Slug render(String text);](#member-25)
- [public abstract int height();](#member-26)
- [public abstract Coord strsize(String text);](#member-27)
- [Foundry(Font f, Color defcol)](#member-33)
- [Foundry(Font f)](#member-34)
- [Foundry(Font font, int psz, Color defcol)](#member-35)
- [Foundry(Font font, int psz)](#member-36)
- [aa(boolean aa)](#member-37)
- [height()](#member-38)
- [strsize(String text)](#member-39)
- [renderwrap(String text, Color c, int width)](#member-40)
- [renderwrap(String text, int width)](#member-41)
- [render(String text, Color c)](#member-42)
- [render(String text)](#member-43)
- [ellipsize(String text, int w, String e)](#member-44)
- [ellipsize(String text, int w)](#member-45)
- [fontpxsz(Font font, int pxsz)](#member-46)
- [OffsetForge(Forge back)](#member-48)
- [protected abstract BufferedImage proc(Slug text);](#member-49)
- [protected abstract Coord tloff();](#member-50)
- [protected abstract Coord broff();](#member-51)
- [OSlug(Slug bk, BufferedImage img)](#member-53)
- [baseline()](#member-54)
- [advance(int pos)](#member-55)
- [charat(int x)](#member-56)
- [render(String text)](#member-57)
- [height()](#member-58)
- [strsize(String text)](#member-59)
- [of(Forge back, Coord tloff, Coord broff, Function<? super Slug, ? extends BufferedImage> prod)](#member-60)
- [UText(Furnace fnd)](#member-64)
- [render(String text)](#member-65)
- [text(T value)](#member-66)
- [protected abstract T value();](#member-67)
- [get()](#member-68)
- [tex()](#member-69)
- [forfield(Furnace fnd, final Object obj, String fn)](#member-70)
- [forfield(Object obj, String fn)](#member-71)
- [of(Furnace fnd, Supplier<? extends T> val, Function<? super T, String> fmt)](#member-72)
- [of(Furnace fnd, Supplier<T> val)](#member-73)
- [sz()](#member-74)
- [render(String text, Color c)](#member-75)
- [renderf(Color c, String text, Object... args)](#member-76)
- [render(String text)](#member-77)
- [tex()](#member-78)
- [dispose()](#member-79)
- [public static void main(String[] args) throws Exception](#member-80)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `serif`

- Description: TODO

<a id="member-2"></a>
##### `sans`

- Description: TODO

<a id="member-3"></a>
##### `mono`

- Description: TODO

<a id="member-4"></a>
##### `fraktur`

- Description: TODO

<a id="member-5"></a>
##### `dfont`

- Description: TODO

<a id="member-6"></a>
##### `std`

- Description: TODO

<a id="member-7"></a>
##### `img`

- Description: TODO

<a id="member-8"></a>
##### `text`

- Description: TODO

<a id="member-9"></a>
##### `tex`

- Description: TODO

<a id="member-10"></a>
##### `black`

- Description: TODO

<a id="member-11"></a>
##### `white`

- Description: TODO

<a id="member-16"></a>
##### `m`

- Description: TODO

<a id="member-28"></a>
##### `m`

- Description: TODO

<a id="member-29"></a>
##### `font`

- Description: TODO

<a id="member-30"></a>
##### `defcol`

- Description: TODO

<a id="member-31"></a>
##### `aa`

- Description: TODO

<a id="member-32"></a>
##### `wfnd`

- Description: TODO

<a id="member-47"></a>
##### `back`

- Description: TODO

<a id="member-52"></a>
##### `bk`

- Description: TODO

<a id="member-61"></a>
##### `fnd`

- Description: TODO

<a id="member-62"></a>
##### `cur`

- Description: TODO

<a id="member-63"></a>
##### `cv`

- Description: TODO

#### Methods

<a id="member-12"></a>
##### `Slug(String text, BufferedImage img)`

- Description: TODO

<a id="member-13"></a>
##### `public abstract int baseline();`

- Description: TODO

<a id="member-14"></a>
##### `public abstract int advance(int pos);`

- Description: TODO

<a id="member-15"></a>
##### `public abstract int charat(int x);`

- Description: TODO

<a id="member-17"></a>
##### `Line(String text, BufferedImage img, FontMetrics m)`

- Description: TODO

<a id="member-18"></a>
##### `base()`

- Description: TODO

<a id="member-19"></a>
##### `baseline()`

- Description: TODO

<a id="member-20"></a>
##### `advance(int pos)`

- Description: TODO

<a id="member-21"></a>
##### `charat(int x)`

- Description: TODO

<a id="member-22"></a>
##### `findspaces(String text)`

- Description: TODO

<a id="member-23"></a>
##### `public abstract Text render(String text);`

- Description: TODO

<a id="member-24"></a>
##### `renderf(String fmt, Object... args)`

- Description: TODO

<a id="member-25"></a>
##### `public abstract Slug render(String text);`

- Description: TODO

<a id="member-26"></a>
##### `public abstract int height();`

- Description: TODO

<a id="member-27"></a>
##### `public abstract Coord strsize(String text);`

- Description: TODO

<a id="member-33"></a>
##### `Foundry(Font f, Color defcol)`

- Description: TODO

<a id="member-34"></a>
##### `Foundry(Font f)`

- Description: TODO

<a id="member-35"></a>
##### `Foundry(Font font, int psz, Color defcol)`

- Description: TODO

<a id="member-36"></a>
##### `Foundry(Font font, int psz)`

- Description: TODO

<a id="member-37"></a>
##### `aa(boolean aa)`

- Description: TODO

<a id="member-38"></a>
##### `height()`

- Description: TODO

<a id="member-39"></a>
##### `strsize(String text)`

- Description: TODO

<a id="member-40"></a>
##### `renderwrap(String text, Color c, int width)`

- Description: TODO

<a id="member-41"></a>
##### `renderwrap(String text, int width)`

- Description: TODO

<a id="member-42"></a>
##### `render(String text, Color c)`

- Description: TODO

<a id="member-43"></a>
##### `render(String text)`

- Description: TODO

<a id="member-44"></a>
##### `ellipsize(String text, int w, String e)`

- Description: TODO

<a id="member-45"></a>
##### `ellipsize(String text, int w)`

- Description: TODO

<a id="member-46"></a>
##### `fontpxsz(Font font, int pxsz)`

- Description: TODO

<a id="member-48"></a>
##### `OffsetForge(Forge back)`

- Description: TODO

<a id="member-49"></a>
##### `protected abstract BufferedImage proc(Slug text);`

- Description: TODO

<a id="member-50"></a>
##### `protected abstract Coord tloff();`

- Description: TODO

<a id="member-51"></a>
##### `protected abstract Coord broff();`

- Description: TODO

<a id="member-53"></a>
##### `OSlug(Slug bk, BufferedImage img)`

- Description: TODO

<a id="member-54"></a>
##### `baseline()`

- Description: TODO

<a id="member-55"></a>
##### `advance(int pos)`

- Description: TODO

<a id="member-56"></a>
##### `charat(int x)`

- Description: TODO

<a id="member-57"></a>
##### `render(String text)`

- Description: TODO

<a id="member-58"></a>
##### `height()`

- Description: TODO

<a id="member-59"></a>
##### `strsize(String text)`

- Description: TODO

<a id="member-60"></a>
##### `of(Forge back, Coord tloff, Coord broff, Function<? super Slug, ? extends BufferedImage> prod)`

- Description: TODO

<a id="member-64"></a>
##### `UText(Furnace fnd)`

- Description: TODO

<a id="member-65"></a>
##### `render(String text)`

- Description: TODO

<a id="member-66"></a>
##### `text(T value)`

- Description: TODO

<a id="member-67"></a>
##### `protected abstract T value();`

- Description: TODO

<a id="member-68"></a>
##### `get()`

- Description: TODO

<a id="member-69"></a>
##### `tex()`

- Description: TODO

<a id="member-70"></a>
##### `forfield(Furnace fnd, final Object obj, String fn)`

- Description: TODO

<a id="member-71"></a>
##### `forfield(Object obj, String fn)`

- Description: TODO

<a id="member-72"></a>
##### `of(Furnace fnd, Supplier<? extends T> val, Function<? super T, String> fmt)`

- Description: TODO

<a id="member-73"></a>
##### `of(Furnace fnd, Supplier<T> val)`

- Description: TODO

<a id="member-74"></a>
##### `sz()`

- Description: TODO

<a id="member-75"></a>
##### `render(String text, Color c)`

- Description: TODO

<a id="member-76"></a>
##### `renderf(Color c, String text, Object... args)`

- Description: TODO

<a id="member-77"></a>
##### `render(String text)`

- Description: TODO

<a id="member-78"></a>
##### `tex()`

- Description: TODO

<a id="member-79"></a>
##### `dispose()`

- Description: TODO

<a id="member-80"></a>
##### `public static void main(String[] args) throws Exception`

- Description: TODO
