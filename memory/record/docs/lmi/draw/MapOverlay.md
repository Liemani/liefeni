---
source: [MapOverlay.java](../../../../../src/lmi/draw/MapOverlay.java)
created: 2026-06-13
updated: 2026-06-14
---

# MapOverlay

Draws map-related overlay content.

## Members

### Constants

### Fields

### Methods

#### `default boolean visible()`
- Role: Returns whether the widget is visible.
- Description: Controls whether the overlay participates in rendering.

#### `default int zOrder()`
- Role: Returns the z order.
- Description: Controls draw ordering relative to other overlays.

#### `void draw(MapView mapView, GOut g)`
- Role: Renders the draw.
- Description: Draws overlay content on top of the current map view.