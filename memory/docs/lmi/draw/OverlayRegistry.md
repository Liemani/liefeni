# OverlayRegistry

This file documents the responsibilities and members of `OverlayRegistry`.

## Meta

- Source: [OverlayRegistry.java](../../../../src/lmi/draw/OverlayRegistry.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Registers overlay renderers and keeps overlay lookup organized.

## Members

### Constants

#### `private static final ArrayList<MapOverlay> overlays = new ArrayList<>()`

- Description: TODO

### Fields

### Methods

#### `private OverlayRegistry()`

- Description: TODO

#### `public static synchronized void register(MapOverlay overlay)`

- Description: TODO

#### `public static synchronized void unregister(MapOverlay overlay)`

- Description: TODO

#### `public static synchronized List<MapOverlay> overlays()`

- Description: TODO
