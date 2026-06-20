---
source: [Profdisp.java](../../../src/haven/Profdisp.java)
created: 2026-06-13
updated: 2026-06-14
---

# Profdisp

Represents the profdisp Haven component.

## Nested Types

### Buffer

- Role: Represents buffer within Profdisp.
- Description: Describes the nested buffer type used by the enclosing class.

## Members

### Constants

#### `public static final Resource.Image markimg = Resource.loadrimg("gfx/hud/arwmark")`
- Role: Defines the shared markimg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color[] cols = Utils.vgapal`
- Role: Defines the shared cols constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int h = UI.scale(80)`
- Role: Defines the shared h constant.
- Description: Shared constant used by the rest of the class.

#### `private static final String[] units =`
- Role: Defines the shared profdisp constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Profile prof`
- Role: Stores the prof value.
- Description: Backs the cached state for this file.

#### `public double mt = 0.05`
- Role: Stores the mt value.
- Description: Backs the cached state for this file.

#### `private double dscale = 0`
- Role: Stores the dscale value.
- Description: Backs the cached state for this file.

#### `private Tex sscl = null`
- Role: Stores the sscl value.
- Description: Backs the cached state for this file.

#### `private int[] mark = new int[0]`
- Role: Stores the mark value.
- Description: Backs the cached state for this file.

#### `public final Tex tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `private final Texture2D btex`
- Role: Stores the btex value.
- Description: Backs the cached state for this file.

#### `private Buffer display`
- Role: Stores the display value.
- Description: Backs the cached state for this file.

### Methods

#### `public Profdisp(Profile prof)`
- Role: Creates a new Profdisp instance.
- Description: Constructs the instance and initializes its default state.

#### `public Buffer()`
- Role: Performs buffer.
- Description: Supports the buffer operation used by the surrounding class.

#### `private void draw(ByteBuffer buf, double scale)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void update(Render r, double scale)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public String tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.
