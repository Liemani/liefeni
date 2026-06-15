# TestView

This file documents the responsibilities and members of `TestView`.

## Meta

- Source: [TestView.java](../../../src/haven/TestView.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a test rendering view.

## Nested Types

### Quad

- Description: TODO

## Members

### Constants

#### `static final FastMesh borkamesh = Resource.remote().loadwait("gfx/test/borka").layer(FastMesh.MeshRes.class).m`

- Description: TODO

#### `static final Material borkamat = Resource.remote().loadwait("gfx/test/borka").layer(Material.Res.class).get()`

- Description: TODO

#### `public static final Model data`

- Description: TODO

### Fields

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`

- Description: TODO

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`

- Description: TODO

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`

- Description: TODO

#### `float dist = 15, e = (float)Math.PI * 3 / 2, a = (float)Math.PI / 2, rot = 0`

- Description: TODO

#### `final RenderTree.Slot[] borka =`

- Description: TODO

#### `final Light.PhongLight light = new Light.PhongLight(true, FColor.BLACK, FColor.WHITE, FColor.BLACK, FColor.BLACK, 0)`

- Description: TODO

### Methods

#### `public TestView(Coord sz)`

- Description: TODO

#### `public void draw(Pipe state, Render out)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `private void setcam()`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `protected FColor clearcolor()`

- Description: TODO
