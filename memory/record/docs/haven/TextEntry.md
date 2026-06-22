---
source: [TextEntry.java](../../../../src/haven/TextEntry.java)
created: 2026-06-13
updated: 2026-06-14
---

# TextEntry

Represents the text entry Haven component.

## Nested Types

### $_

- Role: Represents $ within TextEntry.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final Color defcol = new Color(255, 205, 109), dirtycol = new Color(255, 232, 209)`
- Role: Implements the defcol operation.
- Description: Implements the color operation.
- Value: `new Color(255, 205, 109), dirtycol = new Color(255, 232, 209)`

#### `public static final Color defcol = new Color(255, 205, 109), dirtycol = new Color(255, 232, 209)`
- Role: Implements the defcol operation.
- Description: Implements the color operation.
- Value: `new Color(255, 205, 109), dirtycol = new Color(255, 232, 209)`

#### `public static final Color selcol = new Color(24, 80, 192)`
- Role: Implements the selcol operation.
- Description: Implements the color operation.
- Value: `new Color(24, 80, 192)`

#### `public static final Text.Foundry fnd = new Text.Foundry(Text.serif, 12).aa(true)`
- Role: Implements the fnd operation.
- Description: Implements the aa operation.
- Value: `new Text.Foundry(Text.serif, 12).aa(true)`

#### `public static final Tex lcap = Resource.loadtex("gfx/hud/text/l")`
- Role: Implements the lcap operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/text/l")`

#### `public static final Tex rcap = Resource.loadtex("gfx/hud/text/r")`
- Role: Implements the rcap operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/text/r")`

#### `public static final Tex mext = Resource.loadtex("gfx/hud/text/m")`
- Role: Implements the mext operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/text/m")`

#### `public static final Tex caret = Resource.loadtex("gfx/hud/text/caret")`
- Role: Implements the caret operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/text/caret")`

#### `public static final int toffx = lcap.sz().x`
- Role: Implements the toffx operation.
- Description: Implements the sz operation.
- Value: `lcap.sz().x`

#### `public static final Coord coff = UI.scale(new Coord(-2, 0))`
- Role: Implements the coff operation.
- Description: Implements the coord operation.
- Value: `UI.scale(new Coord(-2, 0))`

#### `public static final int wmarg = lcap.sz().x + rcap.sz().x + UI.scale(1)`
- Role: Implements the wmarg operation.
- Description: Implements the scale operation.
- Value: `lcap.sz().x + rcap.sz().x + UI.scale(1)`

### Fields

#### `public boolean dshow = false`
- Role: Tracks the dshow flag.
- Description: Caches the `dshow` value for reuse.

#### `public ReadLine buf`
- Role: Caches the buf value.
- Description: Caches the `buf` value for reuse.

#### `public int sx`
- Role: Caches the sx value.
- Description: Caches the `sx` value for reuse.

#### `public boolean pw = false`
- Role: Tracks the pw flag.
- Description: Caches the `pw` value for reuse.

#### `private boolean dirty = false`
- Role: Tracks whether dirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private double focusstart`
- Role: Caches the focusstart value.
- Description: Caches the `focusstart` value for reuse.

#### `private Text.Line tcache = null`
- Role: Caches tcache for reuse.
- Description: Keeps tcache cached for reuse.

#### `private UI.Grab d = null`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void settext(String text)`
- Role: Handles the settext path.
- Description: Updates the text.

#### `public void rsettext(String text)`
- Role: Handles the rsettext path.
- Description: Implements the rsettext operation.

#### `public void commit()`
- Role: Handles the commit path.
- Description: Implements the commit operation.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `protected String dtext()`
- Role: Handles the dtext path.
- Description: Implements the dtext operation.

#### `protected void redraw()`
- Role: Handles the redraw path.
- Description: Implements the redraw operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the TextEntry content.

#### `public TextEntry(int w, String deftext)`
- Role: Creates a new TextEntry instance.
- Description: Constructs the TextEntry instance from the supplied inputs.

#### `protected void changed()`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public void activate(String text)`
- Role: Handles the activate path.
- Description: Implements the activate operation.

#### `public void done(ReadLine buf)`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public void changed(ReadLine buf)`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public boolean gkeytype(GlobKeyEvent ev)`
- Role: Handles the gkeytype path.
- Description: Implements the gkeytype operation.

#### `public boolean keydown(KeyDownEvent e)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public void gotfocus()`
- Role: Handles the gotfocus path.
- Description: Implements the gotfocus operation.

#### `public void resize(int w)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public String text()`
- Role: Handles the text path.
- Description: Implements the text operation.