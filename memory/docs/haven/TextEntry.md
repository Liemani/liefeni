# TextEntry

This file documents the responsibilities and members of `TextEntry`.

## Meta

- Source: [TextEntry.java](../../../src/haven/TextEntry.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the text entry Haven component.

## Nested Types

### $_

- Role: Represents $ within TextEntry.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final Color defcol = new Color(255, 205, 109), dirtycol = new Color(255, 232, 209)`
- Role: Defines the shared defcol constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color defcol = new Color(255, 205, 109), dirtycol = new Color(255, 232, 209)`
- Role: Defines the shared defcol constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color selcol = new Color(24, 80, 192)`
- Role: Defines the shared selcol constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry fnd = new Text.Foundry(Text.serif, 12).aa(true)`
- Role: Defines the shared fnd constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex lcap = Resource.loadtex("gfx/hud/text/l")`
- Role: Defines the shared lcap constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex rcap = Resource.loadtex("gfx/hud/text/r")`
- Role: Defines the shared rcap constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex mext = Resource.loadtex("gfx/hud/text/m")`
- Role: Defines the shared mext constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex caret = Resource.loadtex("gfx/hud/text/caret")`
- Role: Defines the shared caret constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int toffx = lcap.sz().x`
- Role: Defines the shared toffx constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord coff = UI.scale(new Coord(-2, 0))`
- Role: Defines the shared coff constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int wmarg = lcap.sz().x + rcap.sz().x + UI.scale(1)`
- Role: Defines the shared wmarg constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public boolean dshow = false`
- Role: Tracks the dshow flag.
- Description: Supports the dshow operation used by the surrounding class.

#### `public ReadLine buf`
- Role: Holds the buf state.
- Description: Backs the cached state for this file.

#### `public int sx`
- Role: Stores the sx value.
- Description: Backs the cached state for this file.

#### `public boolean pw = false`
- Role: Tracks the pw flag.
- Description: Supports the pw operation used by the surrounding class.

#### `private boolean dirty = false`
- Role: Tracks whether dirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private double focusstart`
- Role: Stores the focusstart value.
- Description: Backs the cached state for this file.

#### `private Text.Line tcache = null`
- Role: Stores the tcache value.
- Description: Backs the cached state for this file.

#### `private UI.Grab d = null`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void settext(String text)`
- Role: Performs settext.
- Description: Supports the settext operation used by the surrounding class.

#### `public void rsettext(String text)`
- Role: Performs rsettext.
- Description: Supports the rsettext operation used by the surrounding class.

#### `public void commit()`
- Role: Performs commit.
- Description: Supports the commit operation used by the surrounding class.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `protected String dtext()`
- Role: Performs dtext.
- Description: Supports the dtext operation used by the surrounding class.

#### `protected void redraw()`
- Role: Performs redraw.
- Description: Supports the redraw operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public TextEntry(int w, String deftext)`
- Role: Creates a new TextEntry instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void changed()`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public void activate(String text)`
- Role: Performs activate.
- Description: Supports the activate operation used by the surrounding class.

#### `public void done(ReadLine buf)`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public void changed(ReadLine buf)`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public boolean gkeytype(GlobKeyEvent ev)`
- Role: Performs gkeytype.
- Description: Supports the gkeytype operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent e)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public void gotfocus()`
- Role: Performs gotfocus.
- Description: Supports the gotfocus operation used by the surrounding class.

#### `public void resize(int w)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.
