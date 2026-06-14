# TableBox

## Meta

- Source: [TableBox.java](../../../src/haven/TableBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays a table-style box widget.

## Code Members

### Member Index

#### Fields

- [cols](#member-1)
- [main](#member-2)
- [tbl](#member-21)
- [spec](#member-22)
- [head](#member-23)
- [x](#member-24)
- [w](#member-25)
- [drawcb](#member-26)
- [hovering](#member-37)

#### Methods

- [protected abstract List<? extends I> items();](#member-3)
- [protected abstract List<ColSpec<? super I>> spec();](#member-4)
- [protected abstract int itemh();](#member-5)
- [headh()](#member-6)
- [colmarg()](#member-7)
- [rowmarg()](#member-8)
- [makelist(Coord sz)](#member-9)
- [makeitem(I item, int idx, Coord sz)](#member-10)
- [public Widget heading(Column<? extends I> col, Coord sz);](#member-11)
- [of(Tex heading)](#member-12)
- [fixw()](#member-13)
- [flexw()](#member-14)
- [align()](#member-15)
- [halign()](#member-16)
- [public abstract Widget heading(Column<? extends I> col, Coord sz);](#member-17)
- [public abstract Widget makecell(I item, int idx, Coord sz);](#member-18)
- [public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign,](#member-19)
- [public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign, Tex heading,](#member-20)
- [Column(TableBox<I> tbl, ColSpec<? super I> spec)](#member-27)
- [Row(I item, int idx, Coord sz)](#member-28)
- [MainList(Coord sz)](#member-29)
- [items()](#member-30)
- [makeitem(I item, int idx, Coord sz)](#member-31)
- [unselect(int button)](#member-32)
- [unselect(int button)](#member-33)
- [widths()](#member-34)
- [drawgrid(GOut g)](#member-35)
- [draw(GOut g)](#member-36)
- [IHeading(Column<?> col, Coord sz)](#member-38)
- [protected abstract boolean click(MouseDownEvent ev);](#member-39)
- [col(GOut g, Column<?> col)](#member-40)
- [mousedown(MouseDownEvent ev)](#member-41)
- [mousehover(MouseHoverEvent ev, boolean hovering)](#member-42)
- [wrap(HeadFactory<T> bk, Function<Column<? extends T>, Predicate<? super MouseDownEvent>> clickf)](#member-43)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `cols`

- Description: TODO

<a id="member-2"></a>
##### `main`

- Description: TODO

<a id="member-21"></a>
##### `tbl`

- Description: TODO

<a id="member-22"></a>
##### `spec`

- Description: TODO

<a id="member-23"></a>
##### `head`

- Description: TODO

<a id="member-24"></a>
##### `x`

- Description: TODO

<a id="member-25"></a>
##### `w`

- Description: TODO

<a id="member-26"></a>
##### `drawcb`

- Description: TODO

<a id="member-37"></a>
##### `hovering`

- Description: TODO

#### Methods

<a id="member-3"></a>
##### `protected abstract List<? extends I> items();`

- Description: TODO

<a id="member-4"></a>
##### `protected abstract List<ColSpec<? super I>> spec();`

- Description: TODO

<a id="member-5"></a>
##### `protected abstract int itemh();`

- Description: TODO

<a id="member-6"></a>
##### `headh()`

- Description: TODO

<a id="member-7"></a>
##### `colmarg()`

- Description: TODO

<a id="member-8"></a>
##### `rowmarg()`

- Description: TODO

<a id="member-9"></a>
##### `makelist(Coord sz)`

- Description: TODO

<a id="member-10"></a>
##### `makeitem(I item, int idx, Coord sz)`

- Description: TODO

<a id="member-11"></a>
##### `public Widget heading(Column<? extends I> col, Coord sz);`

- Description: TODO

<a id="member-12"></a>
##### `of(Tex heading)`

- Description: TODO

<a id="member-13"></a>
##### `fixw()`

- Description: TODO

<a id="member-14"></a>
##### `flexw()`

- Description: TODO

<a id="member-15"></a>
##### `align()`

- Description: TODO

<a id="member-16"></a>
##### `halign()`

- Description: TODO

<a id="member-17"></a>
##### `public abstract Widget heading(Column<? extends I> col, Coord sz);`

- Description: TODO

<a id="member-18"></a>
##### `public abstract Widget makecell(I item, int idx, Coord sz);`

- Description: TODO

<a id="member-19"></a>
##### `public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign,`

- Description: TODO

<a id="member-20"></a>
##### `public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign, Tex heading,`

- Description: TODO

<a id="member-27"></a>
##### `Column(TableBox<I> tbl, ColSpec<? super I> spec)`

- Description: TODO

<a id="member-28"></a>
##### `Row(I item, int idx, Coord sz)`

- Description: TODO

<a id="member-29"></a>
##### `MainList(Coord sz)`

- Description: TODO

<a id="member-30"></a>
##### `items()`

- Description: TODO

<a id="member-31"></a>
##### `makeitem(I item, int idx, Coord sz)`

- Description: TODO

<a id="member-32"></a>
##### `unselect(int button)`

- Description: TODO

<a id="member-33"></a>
##### `unselect(int button)`

- Description: TODO

<a id="member-34"></a>
##### `widths()`

- Description: TODO

<a id="member-35"></a>
##### `drawgrid(GOut g)`

- Description: TODO

<a id="member-36"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-38"></a>
##### `IHeading(Column<?> col, Coord sz)`

- Description: TODO

<a id="member-39"></a>
##### `protected abstract boolean click(MouseDownEvent ev);`

- Description: TODO

<a id="member-40"></a>
##### `col(GOut g, Column<?> col)`

- Description: TODO

<a id="member-41"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-42"></a>
##### `mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

<a id="member-43"></a>
##### `wrap(HeadFactory<T> bk, Function<Column<? extends T>, Predicate<? super MouseDownEvent>> clickf)`

- Description: TODO
