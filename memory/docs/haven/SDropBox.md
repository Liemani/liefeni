# SDropBox

This file documents the responsibilities and members of `SDropBox`.

## Meta

- Source: [SDropBox.java](../../../src/haven/SDropBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Role: Defines the shared dropimg constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int listh,itemh`
- Role: Stores the sdrop box state.
- Description: Backs the cached state for this file.

#### `public final int listh,itemh`
- Role: Stores the sdrop box state.
- Description: Backs the cached state for this file.

#### `protected final ACheckBox drop`
- Role: Holds the drop state.
- Description: Backs the cached state for this file.

#### `private SDropList dl`
- Role: Caches dl entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private W curitem`
- Role: Holds the curitem state.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab = null`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

### Methods

#### `protected SDropList()`
- Role: Performs sdrop list.
- Description: Supports the sdrop list operation used by the surrounding class.

#### `private Item(I item, W child)`
- Role: Performs item.
- Description: Supports the item operation used by the surrounding class.

#### `protected List<? extends I> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Widget makeitem(I item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public void add()`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `protected void attached()`
- Role: Performs attached.
- Description: Supports the attached operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void change(I item)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `protected void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `protected void drawslot(GOut g, I item, int idx, Area area)`
- Role: Performs drawslot.
- Description: Supports the drawslot operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `protected boolean unselect(int btn)`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `public SDropBox(int w, int listh, int itemh)`
- Role: Creates a new SDropBox instance.
- Description: Constructs the instance and initializes its default state.

#### `protected ACheckBox makedrop()`
- Role: Performs makedrop.
- Description: Supports the makedrop operation used by the surrounding class.

#### `public void change(I item)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public void drop(boolean st)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `protected void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `protected void ldrawbg(GOut g, Area area)`
- Role: Performs ldrawbg.
- Description: Supports the ldrawbg operation used by the surrounding class.

#### `protected void ldrawbg(GOut g, I item, int idx, Area area)`
- Role: Performs ldrawbg.
- Description: Supports the ldrawbg operation used by the surrounding class.

#### `protected void ldrawsel(GOut g, I item, int idx, Area area)`
- Role: Performs ldrawsel.
- Description: Supports the ldrawsel operation used by the surrounding class.

#### `protected void ldrawslot(GOut g, I item, int idx, Area area)`
- Role: Performs ldrawslot.
- Description: Supports the ldrawslot operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public static <I> SDropBox<I, Widget> of(int w, int listh, int itemh, List<? extends I> items, BiFunction<? super I, ? super Coord, ? extends Widget> render, Consumer<? super I> change)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.
