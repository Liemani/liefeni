---
source: [OverlayRegistry.java](../../../../src/lmi/draw/OverlayRegistry.java)
created: 2026-06-13
updated: 2026-06-14
---

# OverlayRegistry

Tracks available overlay implementations.

## Members

### Constants

#### `private static final ArrayList<MapOverlay> overlays = new ArrayList<>()`
- Role: Defines the shared overlays constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `private OverlayRegistry()`
- Role: Creates a new OverlayRegistry instance.
- Description: Constructs the instance and initializes its default state.

#### `public static synchronized void register(MapOverlay overlay)`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `public static synchronized void unregister(MapOverlay overlay)`
- Role: Performs unregister.
- Description: Supports the unregister operation used by the surrounding class.

#### `public static synchronized List<MapOverlay> overlays()`
- Role: Performs overlays.
- Description: Supports the overlays operation used by the surrounding class.
