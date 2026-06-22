---
source: [SListBox.java](../../../../src/haven/SListBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# SListBox

Represents the slist box Haven component.

## Members

### Constants

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`
- Role: Implements the every operation.
- Description: Implements the color operation.
- Value: `new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`
- Role: Implements the every operation.
- Description: Implements the color operation.
- Value: `new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`

### Fields

#### `public final int itemh, marg`
- Role: Caches the marg value.
- Description: Caches the `marg` value for reuse.

#### `public final int itemh, marg`
- Role: Caches the marg value.
- Description: Caches the `marg` value for reuse.

#### `public final Scrollbar sb`
- Role: Caches the sb value.
- Description: Caches the `sb` value for reuse.

#### `private Map<I, W> curw = new IdentityHashMap<>()`
- Role: Implements the curw operation.
- Description: Implements the private map<i, w> curw = new identity hash map<>() operation.

#### `private I[] curi`
- Role: Caches the curi value.
- Description: Caches the `curi` value for reuse.

#### `private int n = -1, h, curo = 0, itemw = 0`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private int n = -1, h, curo = 0, itemw = 0`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private int n = -1, h, curo = 0, itemw = 0`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private int n = -1, h, curo = 0, itemw = 0`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private int maxy = 0`
- Role: Caches the maxy value.
- Description: Caches the `maxy` value for reuse.

#### `private double cury = 0.0`
- Role: Caches the cury value.
- Description: Caches the `cury` value for reuse.

#### `private boolean reset = false`
- Role: Tracks the reset flag.
- Description: Resets the stream if mark/reset is supported.

### Methods

#### `public SListBox(Coord sz, int itemh, int marg)`
- Role: Creates a new SListBox instance.
- Description: Constructs the SListBox instance from the supplied inputs.

#### `public SListBox(Coord sz, int itemh)`
- Role: Creates a new SListBox instance.
- Description: Constructs the SListBox instance from the supplied inputs.

#### `protected boolean autoscroll()`
- Role: Handles the autoscroll path.
- Description: Implements the autoscroll operation.

#### `public int scrollmin()`
- Role: Handles the scrollmin path.
- Description: Implements the scrollmin operation.

#### `public int scrollmax()`
- Role: Handles the scrollmax path.
- Description: Implements the scrollmax operation.

#### `public int scrollval()`
- Role: Handles the scrollval path.
- Description: Implements the scrollval operation.

#### `public void scrollval(int val)`
- Role: Handles the scrollval path.
- Description: Implements the scrollval operation.

#### `public void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public int totalh()`
- Role: Handles the totalh path.
- Description: Implements the totalh operation.

#### `public void minimize()`
- Role: Handles the minimize path.
- Description: Implements the minimize operation.

#### `public void reset()`
- Role: Resets the stream if mark/reset is supported.
- Description: Resets the stream if mark/reset is supported.

#### `public W getcur(I item)`
- Role: Handles the getcur path.
- Description: Returns the cur.

#### `protected void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `protected void drawbg(GOut g, I item, int idx, Area area)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `protected void drawsel(GOut g, I item, int idx, Area area)`
- Role: Handles the drawsel path.
- Description: Draws the sel.

#### `protected void drawslot(GOut g, I item, int idx, Area area)`
- Role: Handles the drawslot path.
- Description: Draws the slot.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the SListBox content.

#### `public int slotat(Coord c)`
- Role: Handles the slotat path.
- Description: Implements the slotat operation.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `protected boolean unselect(int button)`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `protected boolean slotclick(Coord c, int slot, int button)`
- Role: Handles the slotclick path.
- Description: Implements the slotclick operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void display(int idx)`
- Role: Handles the display path.
- Description: Implements the display operation.

#### `public void display(I item)`
- Role: Handles the display path.
- Description: Implements the display operation.

#### `public void display()`
- Role: Handles the display path.
- Description: Implements the display operation.