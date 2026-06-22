---
source: [MapViewBridge.java](../../../../../src/lmi/bridge/MapViewBridge.java)
created: 2026-06-20
updated: 2026-06-20
---

# MapViewBridge

Stores the current Haven `MapView` reference so LMI code can read or clear it without depending on AppContext.

## Members

### Fields

#### `private static MapView mapView`
- Role: Stores the current MapView reference.
- Description: Holds the active Haven `MapView` instance that LMI bridge code reads from during world interaction.

### Methods

#### `private MapViewBridge()`
- Role: Prevents instantiation.
- Description: This class is a static holder only.

#### `public static void setMapView(MapView val)`
- Role: Stores the current MapView reference.
- Description: Called when Haven creates or replaces the active `MapView`.

#### `public static void clear()`
- Role: Clears the stored MapView reference.
- Description: Called when the world leaves or the bridge is reset.

#### `public static MapView mapView()`
- Role: Returns the current MapView reference.
- Description: Lets LMI code inspect the active Haven `MapView` when it exists.