---
source: [Widget.java](../../../../src/haven/Widget.java)
created: 2026-06-13
updated: 2026-06-20
---

# Widget

Base class for Haven UI widgets. It owns the widget tree, focus, event dispatch, widget factories, and standard input handling.

## Nested Types

### Widget creation and registration
- `RName`, `Factory`, `FactMaker`
- Role: Register widget factories and load widget types by resource name or direct factory lookup.

### Layout helpers
- `$Cont`, `$CCont`, `$FCont`, `$ACont`, `AlignPanel`
- Role: Create the standard container widgets used by UI resources.

### Event model
- `Event`, `TickEvent`, `GTickEvent`, `MessageEvent`, `PointerEvent`, `Mouse*`, `KbdEvent`, `FocusChangeEvent`, `QueryEvent`
- Role: Represent the widget event hierarchy used for input, drawing, focus, and tooltip queries.

### Lookup helpers
- `Handler`, `HandlerMaker`, `MessageHandler`, `CursorQuery`, `TooltipQuery`, `GlobKeyEvent`, `KeyDownEvent`, `KeyUpEvent`
- Role: Bridge widget behavior to runtime handlers and global key processing.

## Members

### Constants

#### `public static final KeyMatch key_act = KeyMatch.forcode(KeyEvent.VK_ENTER, 0)`
- Role: Standard activate key.
- Value: `KeyMatch.forcode(KeyEvent.VK_ENTER, 0)`

#### `public static final KeyMatch key_esc = KeyMatch.forcode(KeyEvent.VK_ESCAPE, 0)`
- Role: Standard cancel key.
- Value: `KeyMatch.forcode(KeyEvent.VK_ESCAPE, 0)`

#### `public static final KeyMatch key_tab = KeyMatch.forcode(KeyEvent.VK_TAB, 0)`
- Role: Standard focus traversal key.
- Value: `KeyMatch.forcode(KeyEvent.VK_TAB, 0)`

#### `public static final Resource defcurs = Resource.local().loadwait("gfx/hud/curs/arw")`
- Role: Default widget cursor.
- Value: `Resource.local().loadwait("gfx/hud/curs/arw")`

#### `private static final Map<Integer, Integer> gkeys = Utils.<Integer, Integer>map().`
- Role: Maps global key codes to widget-specific handlers.
- Description: Populated at class initialization.

#### `public static final OwnerContext.ClassResolver<Widget> wdgctx = new OwnerContext.ClassResolver<Widget>()`
- Role: Resolves widget-owned context lookups.
- Value: `new OwnerContext.ClassResolver<Widget>()`

### Fields

#### `public UI ui`
- Role: Stores the owning UI instance.

#### `public Coord c, sz`
- Role: Store widget position and size.

#### `public int z`
- Role: Stores the widget stacking order.

#### `public Widget next, prev, child, lchild, parent`
- Role: Link the widget into the tree and sibling list.

#### `public boolean focustab, focusctl, hasfocus, visible`
- Role: Track focus and visibility state.

#### `public boolean canfocus, autofocus, canactivate, cancancel`
- Role: Control focus and activation behavior.

#### `public Widget focused`
- Role: Stores the currently focused child.

#### `public Indir<Resource> cursor`
- Role: Stores the widget cursor resource.

#### `public Object tooltip`
- Role: Stores the current tooltip payload.

#### `public KeyMatch gkey`
- Role: Stores the global key binding for this widget.

#### `public KeyBinding kb_gkey`
- Role: Stores the key binding metadata for the widget.

### Methods

#### `public static void initnames()`
- Role: Discovers widget factories and registers named widget types.

#### `public static Factory gettype3(String name)` / `gettype2(String name)` / `gettype(String name)`
- Role: Resolve a widget factory by name or resource reference.

#### `public Widget(Coord sz)` / `public Widget()` / `public Widget(UI ui, Coord c, Coord sz)`
- Role: Create a widget with optional UI attachment.

#### `public <T extends Widget> T add(T child)` / `add(...)` / `adda(...)`
- Role: Add a child widget and position it.

#### `public void addchild(Widget child, Object... args)`
- Role: Hook for resource-driven widget creation.

#### `public void link()` / `linkfirst()` / `unlink()`
- Role: Manage widget tree linkage.

#### `public void dispose()` / `rdispose()` / `remove()` / `destroy()`
- Role: Tear down widget state and detach children.

#### `public void setfocus(Widget w)` / `setcanfocus(boolean canfocus)` / `setfocusctl(boolean focusctl)` / `setfocustab(boolean focustab)`
- Role: Control focus behavior.

#### `public void uimsg(String msg, Object... args)` / `wdgmsg(...)`
- Role: Dispatch widget messages.

#### `public void tick(double dt)` / `tick(TickEvent ev)` / `gtick(haven.render.Render out)` / `gtick(GTickEvent ev)`
- Role: Advance widget state and rendering hooks.

#### `public void draw(GOut g)` / `draw(GOut g, boolean strict)`
- Role: Draw the widget tree.

#### `public boolean handle(Event ev)`
- Role: Route one event through the widget and its handlers.

#### `public boolean mousedown(MouseDownEvent ev)` / `mouseup(...)` / `mousewheel(...)` / `mousemove(...)` / `mousehover(...)`
- Role: Provide default pointer handling hooks.

