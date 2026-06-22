---
source: [Charlist.java](../../../../src/haven/Charlist.java)
created: 2026-06-13
updated: 2026-06-14
---

# Charlist

Represents the charlist Haven component.

## Nested Types

### $_

- Role: Registers the character list widget resource.
- Description: Factory that creates the character list window from the requested height.

### Boxlist

- Role: Renders the character list scroller.
- Description: Scrollable list widget that manages selection and avatar transfer for characters.

### Char

- Role: Stores one character entry.
- Description: Character record that keeps name, description, avatar data, and pose resource state.

### Charbox

- Role: Renders one character tile.
- Description: Widget that displays the avatar preview, name, description, and play button for a character.

## Members

### Constants

#### `public static final Coord bsz = UI.scale(289, 96)`
- Role: Implements the bsz operation.
- Description: Implements the scale operation.
- Value: `UI.scale(289, 96)`

#### `public static final Text.Furnace nf = new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 20).aa(true), Window.ctex), UI.scale(2), UI.scale(2), Color.BLACK)`
- Role: Implements the nf operation.
- Description: Implements the scale operation.
- Value: `new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 20).aa(true), Window.ctex), UI.scale(2), UI.scale(2), Color.BLACK)`

#### `public static final Text.Furnace df = new PUtils.BlurFurn(Button.tf, UI.scale(2), UI.scale(2), Color.BLACK)`
- Role: Implements the df operation.
- Description: Implements the scale operation.
- Value: `new PUtils.BlurFurn(Button.tf, UI.scale(2), UI.scale(2), Color.BLACK)`

#### `public static final int margin = UI.scale(6)`
- Role: Implements the margin operation.
- Description: Implements the scale operation.
- Value: `UI.scale(6)`

#### `public static final int btnw = UI.scale(100)`
- Role: Implements the btnw operation.
- Description: Implements the scale operation.
- Value: `UI.scale(100)`

### Fields

#### `public final int height`
- Role: Caches the height value.
- Description: Caches the `height` value for reuse.

#### `public final IButton sau, sad`
- Role: Caches the sad value.
- Description: Caches the `sad` value for reuse.

#### `public final IButton sau, sad`
- Role: Caches the sad value.
- Description: Caches the `sad` value for reuse.

#### `public final List<Char> chars = new ArrayList<Char>()`
- Role: Implements the chars operation.
- Description: Implements the public final list<char> chars = new array list<char>() operation.

#### `public final Boxlist list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `public Avaview avalink`
- Role: Caches the avalink value.
- Description: Caches the `avalink` value for reuse.

#### `private boolean dirty`
- Role: Tracks whether dirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private boolean showdisc`
- Role: Tracks the showdisc flag.
- Description: Caches the `showdisc` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public String disc`
- Role: Caches the disc value.
- Description: Caches the `disc` value for reuse.

#### `public Composited.Desc avadesc`
- Role: Caches the avadesc value.
- Description: Caches the `avadesc` value for reuse.

#### `public Resource.Resolver avamap`
- Role: Caches the avamap value.
- Description: Caches the `avamap` value for reuse.

#### `public Collection<ResData> avaposes`
- Role: Caches the avaposes value.
- Description: Caches the `avaposes` value for reuse.

#### `public final Char chr`
- Role: Caches the chr value.
- Description: Caches the `chr` value for reuse.

#### `public final Avaview ava`
- Role: Caches the ava value.
- Description: Caches the `ava` value for reuse.

#### `public final ILabel name, disc`
- Role: Caches the disc value.
- Description: Caches the `disc` value for reuse.

#### `public final ILabel name, disc`
- Role: Caches the disc value.
- Description: Caches the `disc` value for reuse.

#### `private int scrolltgt = -1`
- Role: Caches the scrolltgt value.
- Description: Caches the `scrolltgt` value for reuse.

#### `private double scrollval = -1`
- Role: Caches the scrollval value.
- Description: Caches the `scrollval` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Charlist(int height)`
- Role: Creates a new Charlist instance.
- Description: Constructs the Charlist instance from the supplied inputs.

#### `public Char(String name)`
- Role: Handles the char path.
- Description: Implements the char operation.

#### `public void ava(Composited.Desc desc, Resource.Resolver resmap, Collection<ResData> poses)`
- Role: Handles the ava path.
- Description: Implements the ava operation.

#### `public Charbox(Char chr)`
- Role: Handles the charbox path.
- Description: Implements the charbox operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Charlist content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public Boxlist(int h)`
- Role: Handles the boxlist path.
- Description: Implements the boxlist operation.

#### `protected List<Char> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Charbox makeitem(Char chr, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `protected void drawslot(GOut g, Char item, int idx, Area area)`
- Role: Handles the drawslot path.
- Description: Draws the slot.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `protected boolean unselect(int button)`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `protected boolean autoscroll()`
- Role: Handles the autoscroll path.
- Description: Implements the autoscroll operation.

#### `public void change(Char chr)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `private void checkdisc()`
- Role: Handles the checkdisc path.
- Description: Implements the checkdisc operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void scroll(int amount)`
- Role: Handles the scroll path.
- Description: Implements the scroll operation.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.