# SListWidget

## Meta

- Source: [SListWidget.java](../../../src/haven/SListWidget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a styled list widget base.

## Code Members

### Member Index

#### Fields

- [sel](#member-1)
- [list](#member-6)
- [item](#member-7)
- [text](#member-16)
- [img](#member-31)
- [text](#member-33)
- [res](#member-38)

#### Methods

- [protected abstract List<? extends I> items();](#member-2)
- [protected abstract W makeitem(I item, int idx, Coord sz);](#member-3)
- [public W makeitem(I item, int idx, Coord sz);](#member-4)
- [change(I item)](#member-5)
- [ItemWidget(SListWidget<I, ?> list, Coord sz, I item)](#member-8)
- [mousedown(MouseDownEvent ev)](#member-9)
- [TextItem(Coord sz)](#member-10)
- [TextItem(int w)](#member-11)
- [protected abstract String text();](#member-12)
- [margin()](#member-13)
- [foundry()](#member-14)
- [valid(String text)](#member-15)
- [drawtext(GOut g)](#member-17)
- [draw(GOut g)](#member-18)
- [dispose()](#member-19)
- [invalidate()](#member-20)
- [of(Coord sz, Text.Forge fnd, Supplier<String> text)](#member-21)
- [of(Coord sz, Supplier<String> text)](#member-22)
- [IconText(Coord sz)](#member-23)
- [IconText(int w)](#member-24)
- [protected abstract BufferedImage img();](#member-25)
- [protected abstract String text();](#member-26)
- [margin()](#member-27)
- [foundry()](#member-28)
- [valid(String text)](#member-29)
- [filter()](#member-30)
- [drawicon(GOut g)](#member-32)
- [drawtext(GOut g)](#member-34)
- [draw(GOut g)](#member-35)
- [dispose()](#member-36)
- [invalidate()](#member-37)
- [FromRes(Coord sz, Indir<Resource> res)](#member-39)
- [img()](#member-40)
- [text()](#member-41)
- [of(Coord sz, Indir<Resource> res)](#member-42)
- [of(Coord sz, Supplier<BufferedImage> img, Supplier<String> text)](#member-43)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `sel`

- Description: TODO

<a id="member-6"></a>
##### `list`

- Description: TODO

<a id="member-7"></a>
##### `item`

- Description: TODO

<a id="member-16"></a>
##### `text`

- Description: TODO

<a id="member-31"></a>
##### `img`

- Description: TODO

<a id="member-33"></a>
##### `text`

- Description: TODO

<a id="member-38"></a>
##### `res`

- Description: TODO

#### Methods

<a id="member-2"></a>
##### `protected abstract List<? extends I> items();`

- Description: TODO

<a id="member-3"></a>
##### `protected abstract W makeitem(I item, int idx, Coord sz);`

- Description: TODO

<a id="member-4"></a>
##### `public W makeitem(I item, int idx, Coord sz);`

- Description: TODO

<a id="member-5"></a>
##### `change(I item)`

- Description: TODO

<a id="member-8"></a>
##### `ItemWidget(SListWidget<I, ?> list, Coord sz, I item)`

- Description: TODO

<a id="member-9"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-10"></a>
##### `TextItem(Coord sz)`

- Description: TODO

<a id="member-11"></a>
##### `TextItem(int w)`

- Description: TODO

<a id="member-12"></a>
##### `protected abstract String text();`

- Description: TODO

<a id="member-13"></a>
##### `margin()`

- Description: TODO

<a id="member-14"></a>
##### `foundry()`

- Description: TODO

<a id="member-15"></a>
##### `valid(String text)`

- Description: TODO

<a id="member-17"></a>
##### `drawtext(GOut g)`

- Description: TODO

<a id="member-18"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-19"></a>
##### `dispose()`

- Description: TODO

<a id="member-20"></a>
##### `invalidate()`

- Description: TODO

<a id="member-21"></a>
##### `of(Coord sz, Text.Forge fnd, Supplier<String> text)`

- Description: TODO

<a id="member-22"></a>
##### `of(Coord sz, Supplier<String> text)`

- Description: TODO

<a id="member-23"></a>
##### `IconText(Coord sz)`

- Description: TODO

<a id="member-24"></a>
##### `IconText(int w)`

- Description: TODO

<a id="member-25"></a>
##### `protected abstract BufferedImage img();`

- Description: TODO

<a id="member-26"></a>
##### `protected abstract String text();`

- Description: TODO

<a id="member-27"></a>
##### `margin()`

- Description: TODO

<a id="member-28"></a>
##### `foundry()`

- Description: TODO

<a id="member-29"></a>
##### `valid(String text)`

- Description: TODO

<a id="member-30"></a>
##### `filter()`

- Description: TODO

<a id="member-32"></a>
##### `drawicon(GOut g)`

- Description: TODO

<a id="member-34"></a>
##### `drawtext(GOut g)`

- Description: TODO

<a id="member-35"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-36"></a>
##### `dispose()`

- Description: TODO

<a id="member-37"></a>
##### `invalidate()`

- Description: TODO

<a id="member-39"></a>
##### `FromRes(Coord sz, Indir<Resource> res)`

- Description: TODO

<a id="member-40"></a>
##### `img()`

- Description: TODO

<a id="member-41"></a>
##### `text()`

- Description: TODO

<a id="member-42"></a>
##### `of(Coord sz, Indir<Resource> res)`

- Description: TODO

<a id="member-43"></a>
##### `of(Coord sz, Supplier<BufferedImage> img, Supplier<String> text)`

- Description: TODO
