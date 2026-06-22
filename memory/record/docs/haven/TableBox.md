---
source: [TableBox.java](../../../../src/haven/TableBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# TableBox

Represents the table box Haven component.

## Nested Types

### ColSpec

- Role: Describes one table column specification.
- Description: Column specification that defines width, alignment, heading, and cell factory behavior.

### Column

- Role: Stores runtime state for one table column.
- Description: Column metadata that tracks width, x position, heading widget, and draw callbacks.

### HeadFactory

- Role: Builds a heading widget for a column.
- Description: Functional interface used to create column header widgets.

### IHeading

- Role: Implements an interactive table heading.
- Description: Header widget base class that hooks column hover and click handling.

### MainList

- Role: Hosts the table rows.
- Description: SListBox wrapper that drives row creation and selection for the table body.

### Row

- Role: Renders one table row.
- Description: Row widget that lays out each cell according to the column specifications.

## Members

### Constants

### Fields

#### `public final List<Column<I>> cols`
- Role: Caches the cols value.
- Description: Caches the `cols` value for reuse.

#### `public final MainList main`
- Role: Caches the main value.
- Description: Caches the `main` value for reuse.

#### `public final TableBox<I> tbl`
- Role: Caches the tbl value.
- Description: Caches the `tbl` value for reuse.

#### `public final ColSpec<? super I> spec`
- Role: Caches the spec value.
- Description: Caches the `spec` value for reuse.

#### `public Widget head`
- Role: Caches the head value.
- Description: Caches the `head` value for reuse.

#### `public int x, w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `public int x, w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `public Collection<BiConsumer<GOut, Column<? super I>>> drawcb = new ArrayList<>()`
- Role: Draws the cb.
- Description: Draws the cb.

#### `private boolean hovering`
- Role: Tracks the hovering flag.
- Description: Tracks whether the cursor is still hovering.

### Methods

#### `public TableBox(Coord sz)`
- Role: Creates a new TableBox instance.
- Description: Constructs the TableBox instance from the supplied inputs.

#### `protected abstract List<? extends I> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected abstract List<ColSpec<? super I>> spec()`
- Role: Handles the spec path.
- Description: Implements the spec operation.

#### `protected abstract int itemh()`
- Role: Handles the itemh path.
- Description: Implements the itemh operation.

#### `protected int headh()`
- Role: Handles the headh path.
- Description: Implements the headh operation.

#### `protected int colmarg()`
- Role: Handles the colmarg path.
- Description: Implements the colmarg operation.

#### `protected int rowmarg()`
- Role: Handles the rowmarg path.
- Description: Implements the rowmarg operation.

#### `protected MainList makelist(Coord sz)`
- Role: Handles the makelist path.
- Description: Implements the makelist operation.

#### `protected Row makeitem(I item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public Widget heading(Column<? extends I> col, Coord sz)`
- Role: Handles the heading path.
- Description: Implements the heading operation.

#### `public static <T> HeadFactory<T> of(Tex heading)`
- Role: Builds a TableBox value from the supplied components.
- Description: Builds a TableBox value from the supplied components.

#### `public int fixw()`
- Role: Handles the fixw path.
- Description: Implements the fixw operation.

#### `public double flexw()`
- Role: Handles the flexw path.
- Description: Implements the flexw operation.

#### `public double align()`
- Role: Handles the align path.
- Description: Implements the align operation.

#### `public double halign()`
- Role: Handles the halign path.
- Description: Implements the halign operation.

#### `public abstract Widget heading(Column<? extends I> col, Coord sz)`
- Role: Handles the heading path.
- Description: Implements the heading operation.

#### `public abstract Widget makecell(I item, int idx, Coord sz)`
- Role: Handles the makecell path.
- Description: Implements the makecell operation.

#### `public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign,`
- Role: Handles the of workflow.
- Description: Builds a TableBox value from the supplied components.

#### `public static <T> ColSpec<T> of(int fixw, double flexw, double align, double halign, Tex heading,`
- Role: Handles the of workflow.
- Description: Builds a TableBox value from the supplied components.

#### `protected Column(TableBox<I> tbl, ColSpec<? super I> spec)`
- Role: Handles the column path.
- Description: Implements the column operation.

#### `protected Row(I item, int idx, Coord sz)`
- Role: Handles the row path.
- Description: Implements the row operation.

#### `protected MainList(Coord sz)`
- Role: Handles the main list path.
- Description: Implements the main list operation.

#### `public List<? extends I> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `public Row makeitem(I item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `protected boolean unselect(int button)`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `protected boolean unselect(int button)`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `private void widths()`
- Role: Handles the widths path.
- Description: Implements the widths operation.

#### `protected void drawgrid(GOut g)`
- Role: Handles the drawgrid path.
- Description: Draws one rendered grid slice.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the TableBox content.

#### `public IHeading(Column<?> col, Coord sz)`
- Role: Handles the iheading path.
- Description: Implements the i heading operation.

#### `protected abstract boolean click(MouseDownEvent ev)`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `private void col(GOut g, Column<?> col)`
- Role: Handles the col path.
- Description: Implements the col operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`
- Role: Handles the mousehover path.
- Description: Updates hover state and tooltip selection for minimap content.

#### `public static <T> HeadFactory<T> wrap(HeadFactory<T> bk, Function<Column<? extends T>, Predicate<? super MouseDownEvent>> clickf)`
- Role: Handles the wrap path.
- Description: Implements the wrap operation.