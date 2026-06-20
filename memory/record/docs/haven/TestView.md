---
source: [TestView.java](../../../src/haven/TestView.java)
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
- Role: Defines the shared borkamesh constant.
- Description: Shared constant used by the rest of the class.

#### `static final Material borkamat = Resource.remote().loadwait("gfx/test/borka").layer(Material.Res.class).get()`
- Role: Defines the shared borkamat constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Model data`
- Role: Defines the shared data constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`
- Role: Stores the dist value.
- Description: Backs the cached state for this file.

#### `final RenderTree.Slot[] borka =`
- Role: Holds the test view state.
- Description: Backs the cached state for this file.

#### `final Light.PhongLight light = new Light.PhongLight(true, FColor.BLACK, FColor.WHITE, FColor.BLACK, FColor.BLACK, 0)`
- Role: Holds the light state.
- Description: Backs the cached state for this file.

### Methods

#### `public TestView(Coord sz)`
- Role: Creates a new TestView instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(Pipe state, Render out)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `private void setcam()`
- Role: Performs setcam.
- Description: Supports the setcam operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `protected FColor clearcolor()`
- Role: Returns the clear color value.
- Description: Exposes the requested value without mutating state.
