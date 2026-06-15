# TableBox

This file documents the responsibilities and members of `TableBox`.

## Meta

- Source: [TableBox.java](../../../src/haven/TableBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a table-style box widget.

## Nested Types

### ColSpec

- Description: TODO

### Column

- Description: TODO

### HeadFactory

- Description: TODO

### IHeading

- Description: TODO

### MainList

- Description: TODO

### Row

- Description: TODO

## Members

### Constants

### Fields

#### `public final List<Column<I>> cols`

- Description: TODO

#### `public final MainList main`

- Description: TODO

#### `public final TableBox<I> tbl`

- Description: TODO

#### `public final ColSpec<? super I> spec`

- Description: TODO

#### `public Widget head`

- Description: TODO

#### `public int x, w`

- Description: TODO

#### `public int x, w`

- Description: TODO

#### `public Collection<BiConsumer<GOut, Column<? super I>>> drawcb = new ArrayList<>()`

- Description: TODO

#### `private boolean hovering`

- Description: TODO

### Methods

#### `public TableBox(Coord sz)`

- Description: TODO

#### `protected abstract List<? extends I> items()`

- Description: TODO

#### `protected abstract List<ColSpec<? super I>> spec()`

- Description: TODO

#### `protected abstract int itemh()`

- Description: TODO

#### `protected int headh()`

- Description: TODO

#### `protected int colmarg()`

- Description: TODO

#### `protected int rowmarg()`

- Description: TODO

#### `protected MainList makelist(Coord sz)`

- Description: TODO

#### `protected Row makeitem(I item, int idx, Coord sz)`

- Description: TODO

#### `public Widget heading(Column<? extends I> col, Coord sz)`

- Description: TODO

#### `public static <T> HeadFactory<T> of(Tex heading)`

- Description: TODO

#### `public int fixw()`

- Description: TODO

#### `public double flexw()`

- Description: TODO

#### `public double align()`

- Description: TODO

#### `public double halign()`

- Description: TODO

#### `public abstract Widget heading(Column<? extends I> col, Coord sz)`

- Description: TODO

#### `public abstract Widget makecell(I item, int idx, Coord sz)`

- Description: TODO

#### `public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign,`

- Description: TODO

#### `public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign, Tex heading,`

- Description: TODO

#### `protected Column(TableBox<I> tbl, ColSpec<? super I> spec)`

- Description: TODO

#### `protected Row(I item, int idx, Coord sz)`

- Description: TODO

#### `protected MainList(Coord sz)`

- Description: TODO

#### `public List<? extends I> items()`

- Description: TODO

#### `public Row makeitem(I item, int idx, Coord sz)`

- Description: TODO

#### `protected boolean unselect(int button)`

- Description: TODO

#### `protected boolean unselect(int button)`

- Description: TODO

#### `private void widths()`

- Description: TODO

#### `protected void drawgrid(GOut g)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public IHeading(Column<?> col, Coord sz)`

- Description: TODO

#### `protected abstract boolean click(MouseDownEvent ev)`

- Description: TODO

#### `private void col(GOut g, Column<?> col)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

#### `public static <T> HeadFactory<T> wrap(HeadFactory<T> bk, Function<Column<? extends T>, Predicate<? super MouseDownEvent>> clickf)`

- Description: TODO
