---
source: [MapView.java](../../../../src/haven/MapView.java)
created: 2026-06-13
updated: 2026-06-20
---

# MapView

Renders the player map view, owns camera state, handles map interaction, and exposes the current player position to LMI.

## Nested Types

### `Delayed`, `Grabber`
- Role: Define deferred draw callbacks and mouse-grab handlers used by the map view.

### `Camera` and camera implementations
- Role: Provide follow, simple, free, ortho, and S-ortho map camera behavior.

### `Gobs`, `MapRaster`, `Terrain`, `Overlay`, `GridLines`, `ClickMap`
- Role: Build the render-tree pieces for gobs, terrain, overlays, grid lines, and click picking.

### `Plob`, `PlobAdjust`, `StdPlace`, `Maptest`, `Hittest`, `Click`
- Role: Support placement, map tests, and click interaction.

## Members

### Constants

#### `public static boolean clickdb = false`
- Role: Enables click-debug logging.

#### `private static final Map<String, Class<? extends Camera>> camtypes = new HashMap<String, Class<? extends Camera>>()`
- Role: Registers camera types by name.
- Value: `new HashMap<String, Class<? extends Camera>>()`

#### `private static final float maxang = (float)(Math.PI / 2 - 0.1)`
- Role: Caps the follow camera zoom angle.
- Value: `(float)(Math.PI / 2 - 0.1)`

#### `private static final float mindist = 50.0f`
- Role: Prevents the camera from zooming too close.
- Value: `50.0f`

#### `private static final Material gridmat = new Material(new BaseColor(255, 255, 255, 48), States.maskdepth, new MapMesh.OLOrder(null),`
- Role: Draws the grid overlay material.
- Value: `new Material(new BaseColor(255, 255, 255, 48), States.maskdepth, new MapMesh.OLOrder(null),`

#### `public static final Uniform amblight_idx = new Uniform(Type.INT, p ->`
- Role: Exposes the ambient-light render index.
- Value: `new Uniform(Type.INT, p ->`

#### `public static final Pipe.Op clickbasic = Pipe.Op.compose(new States.Depthtest(States.Depthtest.Test.LE),`
- Role: Builds the picking render pipeline for clicks.
- Value: `Pipe.Op.compose(new States.Depthtest(States.Depthtest.Test.LE),`

#### `private static final int MAXID = 0xffffff`
- Role: Defines the max click-picking id.
- Value: `0xffffff`

#### `static final int idx_bas = 0, idx_idp = 1, idx_back = 2`
- Role: Defines click-buffer layer indices.
- Value: `0, idx_idp = 1, idx_back = 2`

#### `private static final Text.Furnace polownertf = new PUtils.BlurFurn(new Text.Foundry(Text.serif, 30).aa(true), 3, 1, Color.BLACK)`
- Role: Renders political owner labels.
- Value: `new PUtils.BlurFurn(new Text.Foundry(Text.serif, 30).aa(true), 3, 1, Color.BLACK)`

#### `public static final KeyBinding kb_grid = KeyBinding.get("grid", KeyMatch.forchar('G', KeyMatch.C))`
- Role: Toggles the grid overlay.
- Value: `KeyBinding.get("grid", KeyMatch.forchar('G', KeyMatch.C))`

#### `public static final OverlayInfo selol = new OverlayInfo()`
- Role: Stores selection overlay metadata.
- Value: `new OverlayInfo()`

### Fields

#### `public long plgob = -1`
- Role: Stores the player gob id tracked by the map view.

#### `public Coord2d cc`
- Role: Stores the current center coordinate.

#### `private final Glob glob`
- Role: Caches the glob value.

#### `private int view = 2`
- Role: Stores the active view mode.

#### `private Collection<Delayed> delayed = new LinkedList<Delayed>()`
- Role: Stores deferred draw callbacks for the current frame.

#### `private Collection<Delayed> delayed2 = new LinkedList<Delayed>()`
- Role: Stores the second deferred draw callback queue.

#### `public Camera camera = restorecam()`
- Role: Stores the active map camera.

#### `private Loader.Future<Plob> placing = null`
- Role: Tracks the current placement operation.

#### `private Grabber grab`
- Role: Tracks the active mouse grabber.

#### `private Selector selection`
- Role: Tracks the current selection helper.

#### `private Coord3f camoff = new Coord3f(Coord3f.o)`
- Role: Stores the camera offset.

#### `public double shake = 0.0`
- Role: Stores the current camera shake amount.

### Methods

#### `public MapView(Coord sz, Glob glob, Coord2d cc, long plgob)`
- Role: Creates the map view for the active world state and player position.

#### `public Gob player()`
- Role: Returns the current player gob.

#### `public Coord3f getcc()`
- Role: Returns the current camera-space center coordinate.

#### `public void draw(GOut g)`
- Role: Draws the map and overlays for the current frame.

#### `public void tick(double dt)`
- Role: Advances camera and interaction state.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles map-related UI messages.

#### `public void showgrid(boolean show)`
- Role: Toggles the grid overlay.

#### `public void delay(Delayed d)` / `public void delay2(Delayed d)`
- Role: Queue deferred draw work.

#### `public void setpoltext(int id, String text)`
- Role: Updates player-owner labels.

#### `public String stats()`
- Role: Returns debug stats for the current camera and map state.

#### `public boolean mousedown(MouseDownEvent ev)` / `public void mousemove(MouseMoveEvent ev)` / `public boolean mouseup(MouseUpEvent ev)`
- Role: Handle map interaction and click picking.

