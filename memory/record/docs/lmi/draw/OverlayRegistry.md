---
source: [OverlayRegistry.java](../../../../../src/lmi/draw/OverlayRegistry.java)
created: 2026-06-13
updated: 2026-06-14
---

# OverlayRegistry

Tracks available overlay implementations.

## Members

### Constants

#### `private static final ArrayList<MapOverlay> overlays = new ArrayList<>()`
- Role: Implements the overlays operation.
- Description: Implements the private static final array list<map overlay> overlays = new array list<>() operation.

### Fields

### Methods

#### `private OverlayRegistry()`
- Role: Creates a new OverlayRegistry instance.
- Description: Constructs the OverlayRegistry instance from the supplied inputs.

#### `public static synchronized void register(MapOverlay overlay)`
- Role: Handles the register path.
- Description: Adds a new overlay to the draw registry.

#### `public static synchronized void unregister(MapOverlay overlay)`
- Role: Handles the unregister path.
- Description: Removes an overlay from the draw registry.

#### `public static synchronized List<MapOverlay> overlays()`
- Role: Handles the overlays path.
- Description: Returns the overlays in draw order.