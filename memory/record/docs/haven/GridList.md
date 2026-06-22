---
source: [GridList.java](../../../../src/haven/GridList.java)
created: 2026-06-13
updated: 2026-06-14
---

# GridList

Represents the grid list Haven component.

## Nested Types

### Group

- Role: Represents one visual group of grid-list items.
- Description: Holds the group name, item list, and layout metrics for grouped rendering.

## Members

### Constants

#### `public static final Text.Furnace dcatf = new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 18).aa(true), Window.ctex), 2, 1, new Color(96, 48, 0))`
- Role: Implements the dcatf operation.
- Description: Implements the color operation.
- Value: `new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 18).aa(true), Window.ctex), 2, 1, new Color(96, 48, 0))`

### Fields

#### `public final Text.Furnace catf`
- Role: Caches the catf value.
- Description: Caches the `catf` value for reuse.

#### `public final Scrollbar sb`
- Role: Caches the sb value.
- Description: Caches the `sb` value for reuse.

#### `public T sel = null`
- Role: Caches the sel value.
- Description: Caches the `sel` value for reuse.

#### `public int gmarg = 10`
- Role: Caches the gmarg value.
- Description: Caches the `gmarg` value for reuse.

#### `private final List<Group> groups = new ArrayList<>()`
- Role: Implements the groups operation.
- Description: Implements the private final list<group> groups = new array list<>() operation.

#### `public final Coord itemsz, marg`
- Role: Caches the marg value.
- Description: Caches the `marg` value for reuse.

#### `public final Coord itemsz, marg`
- Role: Caches the marg value.
- Description: Caches the `marg` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public List<T> items`
- Role: Caches the items value.
- Description: Caches the `items` value for reuse.

#### `private int sy, ey`
- Role: Caches the ey value.
- Description: Caches the `ey` value for reuse.

#### `private int sy, ey`
- Role: Caches the ey value.
- Description: Caches the `ey` value for reuse.

#### `private Text rname`
- Role: Caches the rname value.
- Description: Caches the `rname` value for reuse.

#### `public java.util.function.Function<T, Object> itemtooltip = null`
- Role: Caches the itemtooltip value.
- Description: Caches the `itemtooltip` value for reuse.

### Methods

#### `public Group(Coord itemsz, Coord marg, String name, List<T> items)`
- Role: Handles the group path.
- Description: Implements the group operation.

#### `public void update(List<T> items)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public Text rname()`
- Role: Handles the rname path.
- Description: Implements the rname operation.

#### `public GridList(Coord sz)`
- Role: Creates a new GridList instance.
- Description: Constructs the GridList instance from the supplied inputs.

#### `protected void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `protected void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `protected void drawsel(GOut g)`
- Role: Handles the drawsel path.
- Description: Draws the sel.

#### `protected abstract void drawitem(GOut g, T item)`
- Role: Handles the drawitem path.
- Description: Draws the item.

#### `private static int adjx(int col, int iw, int rw, int ww)`
- Role: Handles the adjx path.
- Description: Implements the adjx operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the GridList content.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public T itemat(Coord c)`
- Role: Handles the itemat path.
- Description: Implements the itemat operation.

#### `public void change(T item)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `protected void itemclick(T item, int button)`
- Role: Handles the itemclick path.
- Description: Implements the itemclick operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.