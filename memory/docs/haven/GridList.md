# GridList

This file documents the responsibilities and members of `GridList`.

## Meta

- Source: [GridList.java](../../../src/haven/GridList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the grid list Haven component.

## Nested Types

### Group

- Role: Represents group within GridList.
- Description: Describes the nested group type used by the enclosing class.

## Members

### Constants

#### `public static final Text.Furnace dcatf = new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 18).aa(true), Window.ctex), 2, 1, new Color(96, 48, 0))`
- Role: Defines the shared dcatf constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Text.Furnace catf`
- Role: Stores the catf value.
- Description: Backs the cached state for this file.

#### `public final Scrollbar sb`
- Role: Holds the sb state.
- Description: Backs the cached state for this file.

#### `public T sel = null`
- Role: Holds the sel state.
- Description: Backs the cached state for this file.

#### `public int gmarg = 10`
- Role: Stores the gmarg value.
- Description: Backs the cached state for this file.

#### `private final List<Group> groups = new ArrayList<>()`
- Role: Caches groups entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Coord itemsz, marg`
- Role: Stores the marg value.
- Description: Backs the cached state for this file.

#### `public final Coord itemsz, marg`
- Role: Stores the marg value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public List<T> items`
- Role: Caches items entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int sy, ey`
- Role: Stores the ey value.
- Description: Backs the cached state for this file.

#### `private int sy, ey`
- Role: Stores the ey value.
- Description: Backs the cached state for this file.

#### `private Text rname`
- Role: Stores the rname value.
- Description: Backs the cached state for this file.

#### `public java.util.function.Function<T, Object> itemtooltip = null`
- Role: Holds the itemtooltip state.
- Description: Backs the cached state for this file.

### Methods

#### `public Group(Coord itemsz, Coord marg, String name, List<T> items)`
- Role: Performs group.
- Description: Supports the group operation used by the surrounding class.

#### `public void update(List<T> items)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Text rname()`
- Role: Performs rname.
- Description: Supports the rname operation used by the surrounding class.

#### `public GridList(Coord sz)`
- Role: Creates a new GridList instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `protected void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `protected void drawsel(GOut g)`
- Role: Performs drawsel.
- Description: Supports the drawsel operation used by the surrounding class.

#### `protected abstract void drawitem(GOut g, T item)`
- Role: Performs drawitem.
- Description: Supports the drawitem operation used by the surrounding class.

#### `private static int adjx(int col, int iw, int rw, int ww)`
- Role: Performs adjx.
- Description: Supports the adjx operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public T itemat(Coord c)`
- Role: Performs itemat.
- Description: Supports the itemat operation used by the surrounding class.

#### `public void change(T item)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `protected void itemclick(T item, int button)`
- Role: Performs itemclick.
- Description: Supports the itemclick operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.
