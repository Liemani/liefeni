# MapOverlay

This file documents the responsibilities and members of `MapOverlay`.

## Meta

- Source: [MapOverlay.java](../../../../src/lmi/draw/MapOverlay.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Description: Supports the draw operation used by the surrounding class.
