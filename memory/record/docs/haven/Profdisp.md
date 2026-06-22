---
source: [Profdisp.java](../../../../src/haven/Profdisp.java)
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
- Role: Implements the markimg operation.
- Description: Implements the loadrimg operation.
- Value: `Resource.loadrimg("gfx/hud/arwmark")`

#### `public static final Color[] cols = Utils.vgapal`
- Role: Caches the cols value.
- Description: Caches the `cols` value for reuse.
- Value: `Utils.vgapal`

#### `private static final int h = UI.scale(80)`
- Role: Implements the h operation.
- Description: Implements the scale operation.
- Value: `UI.scale(80)`

#### `private static final String[] units =`
- Role: Caches the units value.
- Description: Caches the `units` value for reuse.
- Value: ``

### Fields

#### `public final Profile prof`
- Role: Caches the prof value.
- Description: Caches the `prof` value for reuse.

#### `public double mt = 0.05`
- Role: Caches the mt value.
- Description: Caches the `mt` value for reuse.

#### `private double dscale = 0`
- Role: Caches the dscale value.
- Description: Caches the `dscale` value for reuse.

#### `private Tex sscl = null`
- Role: Caches the sscl value.
- Description: Caches the `sscl` value for reuse.

#### `private int[] mark = new int[0]`
- Role: Caches the mark value.
- Description: Caches the `mark` value for reuse.

#### `public final Tex tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `private final Texture2D btex`
- Role: Caches the btex value.
- Description: Caches the `btex` value for reuse.

#### `private Buffer display`
- Role: Holds the visible grid slices currently rendered on the minimap.
- Description: Holds the visible grid slices currently rendered on the minimap.

### Methods

#### `public Profdisp(Profile prof)`
- Role: Creates a new Profdisp instance.
- Description: Constructs the Profdisp instance from the supplied inputs.

#### `public Buffer()`
- Role: Handles the buffer path.
- Description: Implements the buffer operation.

#### `private void draw(ByteBuffer buf, double scale)`
- Role: Draws the current content.
- Description: Draws the Profdisp content.

#### `public void update(Render r, double scale)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Profdisp content.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public String tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.