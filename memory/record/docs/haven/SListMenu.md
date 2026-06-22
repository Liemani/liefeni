---
source: [SListMenu.java](../../../../src/haven/SListMenu.java)
created: 2026-06-13
updated: 2026-06-14
---

# SListMenu

Represents the slist menu Haven component.

## Nested Types

### Action

- Role: Wraps a list-menu action callback.
- Description: Stores the action label and click handler for one menu item.

### IconMenu

- Role: Displays list items with icons.
- Description: Renders icon-based entries in the list-menu layout.

### InnerList

- Role: Hosts the scrollable list contents.
- Description: Manages the shared item layout and selection area.

### Item

- Role: Renders one list-menu item.
- Description: Draws the item label and forwards activation clicks.

### TextMenu

- Role: Displays list items as text-only entries.
- Description: Renders plain text menu entries without icon imagery.

## Members

### Constants

#### `public static final Text.Foundry bigf = CharWnd.attrf`
- Role: Caches the bigf value.
- Description: Caches the `bigf` value for reuse.
- Value: `CharWnd.attrf`

#### `public static final Text.Foundry smallf = new Text.Foundry(Text.fraktur, 14).aa(true)`
- Role: Implements the smallf operation.
- Description: Implements the aa operation.
- Value: `new Text.Foundry(Text.fraktur, 14).aa(true)`

#### `public static final Tex bg = Window.bg`
- Role: Caches the bg value.
- Description: Caches the `bg` value for reuse.
- Value: `Window.bg`

#### `public static final IBox obox = Window.wbox`
- Role: Caches the obox value.
- Description: Caches the `obox` value for reuse.
- Value: `Window.wbox`

### Fields

#### `public final InnerList box`
- Role: Caches the box value.
- Description: Caches the `box` value for reuse.

#### `public boolean grab = true`
- Role: Tracks the grab flag.
- Description: Caches the `grab` value for reuse.

#### `private UI.Grab mg, kg`
- Role: Caches the kg value.
- Description: Caches the `kg` value for reuse.

#### `private UI.Grab mg, kg`
- Role: Caches the kg value.
- Description: Caches the `kg` value for reuse.

#### `private Coord mc = Coord.of(-1, -1)`
- Role: Implements the mc operation.
- Description: Implements the of operation.

#### `private boolean inited = false`
- Role: Tracks the inited flag.
- Description: Caches the `inited` value for reuse.

#### `public final Text.Foundry fnd`
- Role: Caches the fnd value.
- Description: Caches the `fnd` value for reuse.

#### `public final Text.Foundry fnd`
- Role: Caches the fnd value.
- Description: Caches the `fnd` value for reuse.

### Methods

#### `protected abstract List<? extends I> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected abstract W makeitem(I item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `protected abstract void choice(I item)`
- Role: Handles the choice path.
- Description: Implements the choice operation.

#### `public SListMenu(Coord sz, int itemh)`
- Role: Creates a new SListMenu instance.
- Description: Constructs the SListMenu instance from the supplied inputs.

#### `private Item(I item, W child)`
- Role: Handles the item path.
- Description: Implements the item operation.

#### `private InnerList(Coord sz, int itemh)`
- Role: Handles the inner list path.
- Description: Implements the inner list operation.

#### `protected List<? extends I> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Item makeitem(I item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public void change(I item)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `protected void drawbg(GOut g, I item, int idx, Area area)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `private void aresize(Coord f, Coord t)`
- Role: Handles the aresize path.
- Description: Implements the aresize operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the SListMenu content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void destroy()`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.

#### `public SListMenu<I, W> addat(Widget wdg, Coord c)`
- Role: Handles the addat path.
- Description: Adds the at.

#### `public SListMenu nograb()`
- Role: Handles the nograb path.
- Description: Implements the nograb operation.

#### `public TextMenu(Coord sz, Text.Foundry fnd)`
- Role: Handles the text menu path.
- Description: Implements the text menu operation.

#### `public TextMenu(Coord sz)`
- Role: Handles the text menu path.
- Description: Implements the text menu operation.

#### `protected abstract String nameof(I item)`
- Role: Handles the nameof path.
- Description: Implements the nameof operation.

#### `protected Widget makeitem(I item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public static <I> SListMenu<I, Widget> of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action, Runnable cancel)`
- Role: Builds a SListMenu value from the supplied components.
- Description: Builds a SListMenu value from the supplied components.

#### `public static <I> SListMenu<I, Widget> of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action)`
- Role: Builds a SListMenu value from the supplied components.
- Description: Builds a SListMenu value from the supplied components.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public static Action of(String name, Runnable fun)`
- Role: Builds a SListMenu value from the supplied components.
- Description: Builds a SListMenu value from the supplied components.

#### `public static SListMenu<Action, Widget> of(Coord sz, Text.Foundry fnd, List<? extends Action> actions, Runnable cancel)`
- Role: Builds a SListMenu value from the supplied components.
- Description: Builds a SListMenu value from the supplied components.

#### `public static SListMenu<Action, Widget> of(Coord sz, Text.Foundry fnd, List<? extends Action> actions)`
- Role: Builds a SListMenu value from the supplied components.
- Description: Builds a SListMenu value from the supplied components.

#### `public IconMenu(Coord sz, Text.Foundry fnd)`
- Role: Handles the icon menu path.
- Description: Implements the icon menu operation.

#### `public IconMenu(Coord sz)`
- Role: Handles the icon menu path.
- Description: Implements the icon menu operation.

#### `protected abstract String nameof(I item)`
- Role: Handles the nameof path.
- Description: Implements the nameof operation.

#### `protected abstract BufferedImage iconof(I item)`
- Role: Handles the iconof path.
- Description: Implements the iconof operation.

#### `protected Widget makeitem(I item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public static <I> SListMenu<I, Widget> of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action, Runnable cancel)`
- Role: Builds a SListMenu value from the supplied components.
- Description: Builds a SListMenu value from the supplied components.

#### `public static <I> SListMenu<I, Widget> of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action)`
- Role: Builds a SListMenu value from the supplied components.
- Description: Builds a SListMenu value from the supplied components.