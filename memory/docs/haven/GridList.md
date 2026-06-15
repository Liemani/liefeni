# GridList

This file documents the responsibilities and members of `GridList`.

## Meta

- Source: [GridList.java](../../../src/haven/GridList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a grid-style list widget.

## Nested Types

### Group

- Description: TODO

## Members

### Constants

#### `public static final Text.Furnace dcatf = new BlurFurn(new TexFurn(new Text.Foundry(Text.fraktur, 18).aa(true), Window.ctex), 2, 1, new Color(96, 48, 0))`

- Description: TODO

### Fields

#### `public final Text.Furnace catf`

- Description: TODO

#### `public final Scrollbar sb`

- Description: TODO

#### `public T sel = null`

- Description: TODO

#### `public int gmarg = 10`

- Description: TODO

#### `private final List<Group> groups = new ArrayList<>()`

- Description: TODO

#### `public final Coord itemsz, marg`

- Description: TODO

#### `public final Coord itemsz, marg`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public List<T> items`

- Description: TODO

#### `private int sy, ey`

- Description: TODO

#### `private int sy, ey`

- Description: TODO

#### `private Text rname`

- Description: TODO

#### `public java.util.function.Function<T, Object> itemtooltip = null`

- Description: TODO

### Methods

#### `public Group(Coord itemsz, Coord marg, String name, List<T> items)`

- Description: TODO

#### `public void update(List<T> items)`

- Description: TODO

#### `public Text rname()`

- Description: TODO

#### `public GridList(Coord sz)`

- Description: TODO

#### `protected void update()`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `protected void drawbg(GOut g)`

- Description: TODO

#### `protected void drawsel(GOut g)`

- Description: TODO

#### `protected abstract void drawitem(GOut g, T item)`

- Description: TODO

#### `private static int adjx(int col, int iw, int rw, int ww)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public T itemat(Coord c)`

- Description: TODO

#### `public void change(T item)`

- Description: TODO

#### `protected void itemclick(T item, int button)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO
