---
source: [SListBox.java](../../../src/haven/SListBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# SListBox

Represents the slist box Haven component.

## Members

### Constants

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`
- Role: Defines the shared every constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color every = new Color(255, 255, 255, 16), other = new Color(255, 255, 255, 32)`
- Role: Defines the shared every constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int itemh, marg`
- Role: Stores the marg value.
- Description: Backs the cached state for this file.

#### `public final int itemh, marg`
- Role: Stores the marg value.
- Description: Backs the cached state for this file.

#### `public final Scrollbar sb`
- Role: Holds the sb state.
- Description: Backs the cached state for this file.

#### `private Map<I, W> curw = new IdentityHashMap<>()`
- Role: Caches curw entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private I[] curi`
- Role: Holds the curi state.
- Description: Backs the cached state for this file.

#### `private int n = -1, h, curo = 0, itemw = 0`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private int n = -1, h, curo = 0, itemw = 0`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private int n = -1, h, curo = 0, itemw = 0`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private int n = -1, h, curo = 0, itemw = 0`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private int maxy = 0`
- Role: Stores the maxy value.
- Description: Backs the cached state for this file.

#### `private double cury = 0.0`
- Role: Stores the cury value.
- Description: Backs the cached state for this file.

#### `private boolean reset = false`
- Role: Tracks the reset flag.
- Description: Supports the reset operation used by the surrounding class.

### Methods

#### `public SListBox(Coord sz, int itemh, int marg)`
- Role: Creates a new SListBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public SListBox(Coord sz, int itemh)`
- Role: Creates a new SListBox instance.
- Description: Constructs the instance and initializes its default state.

#### `protected boolean autoscroll()`
- Role: Performs autoscroll.
- Description: Supports the autoscroll operation used by the surrounding class.

#### `public int scrollmin()`
- Role: Performs scrollmin.
- Description: Supports the scrollmin operation used by the surrounding class.

#### `public int scrollmax()`
- Role: Performs scrollmax.
- Description: Supports the scrollmax operation used by the surrounding class.

#### `public int scrollval()`
- Role: Performs scrollval.
- Description: Supports the scrollval operation used by the surrounding class.

#### `public void scrollval(int val)`
- Role: Performs scrollval.
- Description: Supports the scrollval operation used by the surrounding class.

#### `public void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public int totalh()`
- Role: Performs totalh.
- Description: Supports the totalh operation used by the surrounding class.

#### `public void minimize()`
- Role: Performs minimize.
- Description: Supports the minimize operation used by the surrounding class.

#### `public void reset()`
- Role: Performs reset.
- Description: Supports the reset operation used by the surrounding class.

#### `public W getcur(I item)`
- Role: Performs getcur.
- Description: Supports the getcur operation used by the surrounding class.

#### `protected void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `protected void drawbg(GOut g, I item, int idx, Area area)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `protected void drawsel(GOut g, I item, int idx, Area area)`
- Role: Performs drawsel.
- Description: Supports the drawsel operation used by the surrounding class.

#### `protected void drawslot(GOut g, I item, int idx, Area area)`
- Role: Performs drawslot.
- Description: Supports the drawslot operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public int slotat(Coord c)`
- Role: Performs slotat.
- Description: Supports the slotat operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `protected boolean unselect(int button)`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `protected boolean slotclick(Coord c, int slot, int button)`
- Role: Performs slotclick.
- Description: Supports the slotclick operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void display(int idx)`
- Role: Performs display.
- Description: Supports the display operation used by the surrounding class.

#### `public void display(I item)`
- Role: Performs display.
- Description: Supports the display operation used by the surrounding class.

#### `public void display()`
- Role: Performs display.
- Description: Supports the display operation used by the surrounding class.
