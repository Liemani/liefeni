---
source: [Charlist.java](../../../src/haven/Charlist.java)
created: 2026-06-13
updated: 2026-06-14
---

# Charlist

Represents the charlist Haven component.

## Nested Types

### $_

- Role: Represents $ within Charlist.
- Description: Describes the nested $  type used by the enclosing class.

### Boxlist

- Role: Represents boxlist within Charlist.
- Description: Describes the nested boxlist type used by the enclosing class.

### Char

- Role: Represents char within Charlist.
- Description: Describes the nested char type used by the enclosing class.

### Charbox

- Role: Represents charbox within Charlist.
- Description: Describes the nested charbox type used by the enclosing class.

## Members

### Constants

#### `public static final Coord bsz = UI.scale(289, 96)`
- Role: Defines the shared bsz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Furnace nf = new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 20).aa(true), Window.ctex), UI.scale(2), UI.scale(2), Color.BLACK)`
- Role: Defines the shared nf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Furnace df = new PUtils.BlurFurn(Button.tf, UI.scale(2), UI.scale(2), Color.BLACK)`
- Role: Defines the shared df constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int margin = UI.scale(6)`
- Role: Defines the shared margin constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int btnw = UI.scale(100)`
- Role: Defines the shared btnw constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int height`
- Role: Stores the height value.
- Description: Backs the cached state for this file.

#### `public final IButton sau, sad`
- Role: Holds the sad state.
- Description: Backs the cached state for this file.

#### `public final IButton sau, sad`
- Role: Holds the sad state.
- Description: Backs the cached state for this file.

#### `public final List<Char> chars = new ArrayList<Char>()`
- Role: Caches chars entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Boxlist list`
- Role: Holds the list state.
- Description: Backs the cached state for this file.

#### `public Avaview avalink`
- Role: Holds the avalink state.
- Description: Backs the cached state for this file.

#### `private boolean dirty`
- Role: Tracks whether dirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private boolean showdisc`
- Role: Tracks the showdisc flag.
- Description: Supports the showdisc operation used by the surrounding class.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public String disc`
- Role: Stores the disc value.
- Description: Backs the cached state for this file.

#### `public Composited.Desc avadesc`
- Role: Holds the avadesc state.
- Description: Backs the cached state for this file.

#### `public Resource.Resolver avamap`
- Role: Stores the avamap value.
- Description: Backs the cached state for this file.

#### `public Collection<ResData> avaposes`
- Role: Caches avaposes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Char chr`
- Role: Stores the chr value.
- Description: Backs the cached state for this file.

#### `public final Avaview ava`
- Role: Holds the ava state.
- Description: Backs the cached state for this file.

#### `public final ILabel name, disc`
- Role: Stores the disc value.
- Description: Backs the cached state for this file.

#### `public final ILabel name, disc`
- Role: Stores the disc value.
- Description: Backs the cached state for this file.

#### `private int scrolltgt = -1`
- Role: Stores the scrolltgt value.
- Description: Backs the cached state for this file.

#### `private double scrollval = -1`
- Role: Stores the scrollval value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Charlist(int height)`
- Role: Creates a new Charlist instance.
- Description: Constructs the instance and initializes its default state.

#### `public Char(String name)`
- Role: Performs char.
- Description: Supports the char operation used by the surrounding class.

#### `public void ava(Composited.Desc desc, Resource.Resolver resmap, Collection<ResData> poses)`
- Role: Performs ava.
- Description: Supports the ava operation used by the surrounding class.

#### `public Charbox(Char chr)`
- Role: Performs charbox.
- Description: Supports the charbox operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public Boxlist(int h)`
- Role: Performs boxlist.
- Description: Supports the boxlist operation used by the surrounding class.

#### `protected List<Char> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Charbox makeitem(Char chr, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `protected void drawslot(GOut g, Char item, int idx, Area area)`
- Role: Performs drawslot.
- Description: Supports the drawslot operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `protected boolean unselect(int button)`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `protected boolean autoscroll()`
- Role: Performs autoscroll.
- Description: Supports the autoscroll operation used by the surrounding class.

#### `public void change(Char chr)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `private void checkdisc()`
- Role: Performs checkdisc.
- Description: Supports the checkdisc operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void scroll(int amount)`
- Role: Performs scroll.
- Description: Supports the scroll operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.
