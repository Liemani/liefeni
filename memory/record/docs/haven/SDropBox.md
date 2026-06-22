---
source: [SDropBox.java](../../../../src/haven/SDropBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# SDropBox

Represents the sdrop box Haven component.

## Nested Types

### Item

- Role: Represents item within SDropBox.
- Description: Describes the nested item type used by the enclosing class.

### SDropList

- Role: Represents sdrop list within SDropBox.
- Description: Describes the nested sdrop list type used by the enclosing class.

## Members

### Constants

#### `public static final Tex dropimg = Resource.loadtex("gfx/hud/drop")`
- Role: Implements the dropimg operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/drop")`

### Fields

#### `public final int listh,itemh`
- Role: Stores the sdrop box state.
- Description: Caches the `itemh` value for reuse.

#### `public final int listh,itemh`
- Role: Stores the sdrop box state.
- Description: Caches the `itemh` value for reuse.

#### `protected final ACheckBox drop`
- Role: Caches the drop value.
- Description: Caches the `drop` value for reuse.

#### `private SDropList dl`
- Role: Caches the dl value.
- Description: Caches the `dl` value for reuse.

#### `private W curitem`
- Role: Caches the curitem value.
- Description: Caches the `curitem` value for reuse.

#### `private UI.Grab grab = null`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

### Methods

#### `protected SDropList()`
- Role: Handles the sdrop list path.
- Description: Implements the s drop list operation.

#### `private Item(I item, W child)`
- Role: Handles the item path.
- Description: Implements the item operation.

#### `protected List<? extends I> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Widget makeitem(I item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public void add()`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `protected void attached()`
- Role: Handles the attached path.
- Description: Implements the attached operation.

#### `public void destroy()`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.

#### `public void change(I item)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `protected void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `protected void drawslot(GOut g, I item, int idx, Area area)`
- Role: Handles the drawslot path.
- Description: Draws the slot.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `protected boolean unselect(int btn)`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `public SDropBox(int w, int listh, int itemh)`
- Role: Creates a new SDropBox instance.
- Description: Constructs the SDropBox instance from the supplied inputs.

#### `protected ACheckBox makedrop()`
- Role: Handles the makedrop path.
- Description: Implements the makedrop operation.

#### `public void change(I item)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public void drop(boolean st)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `protected void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `protected void ldrawbg(GOut g, Area area)`
- Role: Handles the ldrawbg path.
- Description: Implements the ldrawbg operation.

#### `protected void ldrawbg(GOut g, I item, int idx, Area area)`
- Role: Handles the ldrawbg path.
- Description: Implements the ldrawbg operation.

#### `protected void ldrawsel(GOut g, I item, int idx, Area area)`
- Role: Handles the ldrawsel path.
- Description: Implements the ldrawsel operation.

#### `protected void ldrawslot(GOut g, I item, int idx, Area area)`
- Role: Handles the ldrawslot path.
- Description: Implements the ldrawslot operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the SDropBox content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public static <I> SDropBox<I, Widget> of(int w, int listh, int itemh, List<? extends I> items, BiFunction<? super I, ? super Coord, ? extends Widget> render, Consumer<? super I> change)`
- Role: Builds a SDropBox value from the supplied components.
- Description: Builds a SDropBox value from the supplied components.