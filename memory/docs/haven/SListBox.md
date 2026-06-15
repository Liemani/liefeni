# SListBox

This file documents the responsibilities and members of `SListBox`.

## Meta

- Source: [SListBox.java](../../../src/haven/SListBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a styled list box widget.

## Members

### Constants

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`

- Description: TODO

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`

- Description: TODO

### Fields

#### `public final int itemh, marg`

- Description: TODO

#### `public final int itemh, marg`

- Description: TODO

#### `public final Scrollbar sb`

- Description: TODO

#### `private Map<I, W> curw = new IdentityHashMap<>()`

- Description: TODO

#### `private I[] curi`

- Description: TODO

#### `private int n = -1, h, curo = 0, itemw = 0`

- Description: TODO

#### `private int n = -1, h, curo = 0, itemw = 0`

- Description: TODO

#### `private int n = -1, h, curo = 0, itemw = 0`

- Description: TODO

#### `private int n = -1, h, curo = 0, itemw = 0`

- Description: TODO

#### `private int maxy = 0`

- Description: TODO

#### `private double cury = 0.0`

- Description: TODO

#### `private boolean reset = false`

- Description: TODO

### Methods

#### `public SListBox(Coord sz, int itemh, int marg)`

- Description: TODO

#### `public SListBox(Coord sz, int itemh)`

- Description: TODO

#### `protected boolean autoscroll()`

- Description: TODO

#### `public int scrollmin()`

- Description: TODO

#### `public int scrollmax()`

- Description: TODO

#### `public int scrollval()`

- Description: TODO

#### `public void scrollval(int val)`

- Description: TODO

#### `public void update()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public int totalh()`

- Description: TODO

#### `public void minimize()`

- Description: TODO

#### `public void reset()`

- Description: TODO

#### `public W getcur(I item)`

- Description: TODO

#### `protected void drawbg(GOut g)`

- Description: TODO

#### `protected void drawbg(GOut g, I item, int idx, Area area)`

- Description: TODO

#### `protected void drawsel(GOut g, I item, int idx, Area area)`

- Description: TODO

#### `protected void drawslot(GOut g, I item, int idx, Area area)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public int slotat(Coord c)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `protected boolean unselect(int button)`

- Description: TODO

#### `protected boolean slotclick(Coord c, int slot, int button)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public void display(int idx)`

- Description: TODO

#### `public void display(I item)`

- Description: TODO

#### `public void display()`

- Description: TODO
