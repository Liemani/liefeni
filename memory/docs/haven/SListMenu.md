# SListMenu

This file documents the responsibilities and members of `SListMenu`.

## Meta

- Source: [SListMenu.java](../../../src/haven/SListMenu.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the slist menu Haven component.

## Nested Types

### Action

- Role: Represents action within SListMenu.
- Description: Describes the nested action type used by the enclosing class.

### IconMenu

- Role: Represents icon menu within SListMenu.
- Description: Describes the nested icon menu type used by the enclosing class.

### InnerList

- Role: Represents inner list within SListMenu.
- Description: Describes the nested inner list type used by the enclosing class.

### Item

- Role: Represents item within SListMenu.
- Description: Describes the nested item type used by the enclosing class.

### TextMenu

- Role: Represents text menu within SListMenu.
- Description: Describes the nested text menu type used by the enclosing class.

## Members

### Constants

#### `public static final Text.Foundry bigf = CharWnd.attrf`
- Role: Defines the shared bigf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry smallf = new Text.Foundry(Text.fraktur, 14).aa(true)`
- Role: Defines the shared smallf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex bg = Window.bg`
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final IBox obox = Window.wbox`
- Role: Defines the shared obox constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final InnerList box`
- Role: Caches box entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public boolean grab = true`
- Role: Tracks the grab flag.
- Description: Supports the grab operation used by the surrounding class.

#### `private UI.Grab mg, kg`
- Role: Stores the kg value.
- Description: Backs the cached state for this file.

#### `private UI.Grab mg, kg`
- Role: Stores the kg value.
- Description: Backs the cached state for this file.

#### `private Coord mc = Coord.of(-1, -1)`
- Role: Stores the mc value.
- Description: Backs the cached state for this file.

#### `private boolean inited = false`
- Role: Tracks the inited flag.
- Description: Supports the inited operation used by the surrounding class.

#### `public final Text.Foundry fnd`
- Role: Stores the fnd value.
- Description: Backs the cached state for this file.

#### `public final Text.Foundry fnd`
- Role: Stores the fnd value.
- Description: Backs the cached state for this file.

### Methods

#### `protected abstract List<? extends I> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected abstract W makeitem(I item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `protected abstract void choice(I item)`
- Role: Performs choice.
- Description: Supports the choice operation used by the surrounding class.

#### `public SListMenu(Coord sz, int itemh)`
- Role: Creates a new SListMenu instance.
- Description: Constructs the instance and initializes its default state.

#### `private Item(I item, W child)`
- Role: Performs item.
- Description: Supports the item operation used by the surrounding class.

#### `private InnerList(Coord sz, int itemh)`
- Role: Performs inner list.
- Description: Supports the inner list operation used by the surrounding class.

#### `protected List<? extends I> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Item makeitem(I item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public void change(I item)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `protected void drawbg(GOut g, I item, int idx, Area area)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `private void aresize(Coord f, Coord t)`
- Role: Performs aresize.
- Description: Supports the aresize operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public SListMenu<I, W> addat(Widget wdg, Coord c)`
- Role: Performs addat.
- Description: Supports the addat operation used by the surrounding class.

#### `public SListMenu nograb()`
- Role: Performs nograb.
- Description: Supports the nograb operation used by the surrounding class.

#### `public TextMenu(Coord sz, Text.Foundry fnd)`
- Role: Performs text menu.
- Description: Supports the text menu operation used by the surrounding class.

#### `public TextMenu(Coord sz)`
- Role: Performs text menu.
- Description: Supports the text menu operation used by the surrounding class.

#### `protected abstract String nameof(I item)`
- Role: Performs nameof.
- Description: Supports the nameof operation used by the surrounding class.

#### `protected Widget makeitem(I item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public static <I> SListMenu<I, Widget> of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action, Runnable cancel)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static <I> SListMenu<I, Widget> of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public static Action of(String name, Runnable fun)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static SListMenu<Action, Widget> of(Coord sz, Text.Foundry fnd, List<? extends Action> actions, Runnable cancel)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static SListMenu<Action, Widget> of(Coord sz, Text.Foundry fnd, List<? extends Action> actions)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public IconMenu(Coord sz, Text.Foundry fnd)`
- Role: Performs icon menu.
- Description: Supports the icon menu operation used by the surrounding class.

#### `public IconMenu(Coord sz)`
- Role: Performs icon menu.
- Description: Supports the icon menu operation used by the surrounding class.

#### `protected abstract String nameof(I item)`
- Role: Performs nameof.
- Description: Supports the nameof operation used by the surrounding class.

#### `protected abstract BufferedImage iconof(I item)`
- Role: Performs iconof.
- Description: Supports the iconof operation used by the surrounding class.

#### `protected Widget makeitem(I item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public static <I> SListMenu<I, Widget> of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action, Runnable cancel)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static <I> SListMenu<I, Widget> of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.
