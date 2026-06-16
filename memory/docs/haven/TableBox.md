# TableBox

This file documents the responsibilities and members of `TableBox`.

## Meta

- Source: [TableBox.java](../../../src/haven/TableBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the table box Haven component.

## Nested Types

### ColSpec

- Role: Represents col spec within TableBox.
- Description: Describes the nested col spec type used by the enclosing class.

### Column

- Role: Represents column within TableBox.
- Description: Describes the nested column type used by the enclosing class.

### HeadFactory

- Role: Represents head factory within TableBox.
- Description: Describes the nested head factory type used by the enclosing class.

### IHeading

- Role: Represents iheading within TableBox.
- Description: Describes the nested iheading type used by the enclosing class.

### MainList

- Role: Represents main list within TableBox.
- Description: Describes the nested main list type used by the enclosing class.

### Row

- Role: Represents row within TableBox.
- Description: Describes the nested row type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final List<Column<I>> cols`
- Role: Caches cols entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final MainList main`
- Role: Caches main entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final TableBox<I> tbl`
- Role: Holds the tbl state.
- Description: Backs the cached state for this file.

#### `public final ColSpec<? super I> spec`
- Role: Holds the spec state.
- Description: Backs the cached state for this file.

#### `public Widget head`
- Role: Stores the head value.
- Description: Backs the cached state for this file.

#### `public int x, w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `public int x, w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `public Collection<BiConsumer<GOut, Column<? super I>>> drawcb = new ArrayList<>()`
- Role: Caches drawcb entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean hovering`
- Role: Tracks the hovering flag.
- Description: Supports the hovering operation used by the surrounding class.

### Methods

#### `public TableBox(Coord sz)`
- Role: Creates a new TableBox instance.
- Description: Constructs the instance and initializes its default state.

#### `protected abstract List<? extends I> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected abstract List<ColSpec<? super I>> spec()`
- Role: Performs spec.
- Description: Supports the spec operation used by the surrounding class.

#### `protected abstract int itemh()`
- Role: Performs itemh.
- Description: Supports the itemh operation used by the surrounding class.

#### `protected int headh()`
- Role: Performs headh.
- Description: Supports the headh operation used by the surrounding class.

#### `protected int colmarg()`
- Role: Performs colmarg.
- Description: Supports the colmarg operation used by the surrounding class.

#### `protected int rowmarg()`
- Role: Performs rowmarg.
- Description: Supports the rowmarg operation used by the surrounding class.

#### `protected MainList makelist(Coord sz)`
- Role: Performs makelist.
- Description: Supports the makelist operation used by the surrounding class.

#### `protected Row makeitem(I item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public Widget heading(Column<? extends I> col, Coord sz)`
- Role: Performs heading.
- Description: Supports the heading operation used by the surrounding class.

#### `public static <T> HeadFactory<T> of(Tex heading)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public int fixw()`
- Role: Performs fixw.
- Description: Supports the fixw operation used by the surrounding class.

#### `public double flexw()`
- Role: Performs flexw.
- Description: Supports the flexw operation used by the surrounding class.

#### `public double align()`
- Role: Performs align.
- Description: Supports the align operation used by the surrounding class.

#### `public double halign()`
- Role: Performs halign.
- Description: Supports the halign operation used by the surrounding class.

#### `public abstract Widget heading(Column<? extends I> col, Coord sz)`
- Role: Performs heading.
- Description: Supports the heading operation used by the surrounding class.

#### `public abstract Widget makecell(I item, int idx, Coord sz)`
- Role: Performs makecell.
- Description: Supports the makecell operation used by the surrounding class.

#### `public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign,`
- Role: Handles the of workflow.
- Description: Supports the of operation used by the surrounding class.

#### `public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign, Tex heading,`
- Role: Handles the of workflow.
- Description: Supports the of operation used by the surrounding class.

#### `protected Column(TableBox<I> tbl, ColSpec<? super I> spec)`
- Role: Performs column.
- Description: Supports the column operation used by the surrounding class.

#### `protected Row(I item, int idx, Coord sz)`
- Role: Performs row.
- Description: Supports the row operation used by the surrounding class.

#### `protected MainList(Coord sz)`
- Role: Performs main list.
- Description: Supports the main list operation used by the surrounding class.

#### `public List<? extends I> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `public Row makeitem(I item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `protected boolean unselect(int button)`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `protected boolean unselect(int button)`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `private void widths()`
- Role: Performs widths.
- Description: Supports the widths operation used by the surrounding class.

#### `protected void drawgrid(GOut g)`
- Role: Performs drawgrid.
- Description: Supports the drawgrid operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public IHeading(Column<?> col, Coord sz)`
- Role: Performs iheading.
- Description: Supports the iheading operation used by the surrounding class.

#### `protected abstract boolean click(MouseDownEvent ev)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `private void col(GOut g, Column<?> col)`
- Role: Performs col.
- Description: Supports the col operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`
- Role: Performs mousehover.
- Description: Supports the mousehover operation used by the surrounding class.

#### `public static <T> HeadFactory<T> wrap(HeadFactory<T> bk, Function<Column<? extends T>, Predicate<? super MouseDownEvent>> clickf)`
- Role: Performs wrap.
- Description: Supports the wrap operation used by the surrounding class.
