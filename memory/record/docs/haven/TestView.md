---
source: [TestView.java](../../../../src/haven/TestView.java)
created: 2026-06-13
updated: 2026-06-14
---

# TestView

Represents the test view Haven component.

## Nested Types

### Quad

- Role: Represents quad within TestView.
- Description: Describes the nested quad type used by the enclosing class.

## Members

### Constants

#### `static final FastMesh borkamesh = Resource.remote().loadwait("gfx/test/borka").layer(FastMesh.MeshRes.class).m`
- Role: Implements the borkamesh operation.
- Description: Implements the layer operation.
- Value: `Resource.remote().loadwait("gfx/test/borka").layer(FastMesh.MeshRes.class).m`

#### `static final Material borkamat = Resource.remote().loadwait("gfx/test/borka").layer(Material.Res.class).get()`
- Role: Implements the borkamat operation.
- Description: Returns the get value.
- Value: `Resource.remote().loadwait("gfx/test/borka").layer(Material.Res.class).get()`

#### `public static final Model data`
#### `public static final Model data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

### Fields

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`
- Role: Implements the dist operation.
- Description: Implements the float dist = 15, e = (float)math.pi * 3 / 2, a = (float)math.pi / 2, rot = 0 operation.

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`
- Role: Implements the dist operation.
- Description: Implements the float dist = 15, e = (float)math.pi * 3 / 2, a = (float)math.pi / 2, rot = 0 operation.

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`
- Role: Implements the dist operation.
- Description: Implements the float dist = 15, e = (float)math.pi * 3 / 2, a = (float)math.pi / 2, rot = 0 operation.

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`
- Role: Implements the dist operation.
- Description: Implements the float dist = 15, e = (float)math.pi * 3 / 2, a = (float)math.pi / 2, rot = 0 operation.

#### `final RenderTree.Slot[] borka =`
- Role: Caches the borka value.
- Description: Caches the `borka` value for reuse.

#### `final Light.PhongLight light = new Light.PhongLight(true, FColor.BLACK, FColor.WHITE, FColor.BLACK, FColor.BLACK, 0)`
- Role: Implements the light operation.
- Description: Implements the phong light operation.

### Methods

#### `public TestView(Coord sz)`
- Role: Creates a new TestView instance.
- Description: Constructs the TestView instance from the supplied inputs.

#### `public void draw(Pipe state, Render out)`
- Role: Draws the current content.
- Description: Draws the TestView content.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `private void setcam()`
- Role: Handles the setcam path.
- Description: Updates the cam.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `protected FColor clearcolor()`
- Role: Clears the color.
- Description: Clears the color.