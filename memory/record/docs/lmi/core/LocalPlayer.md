---
source: [LocalPlayer.java](../../../../../src/lmi/core/LocalPlayer.java)
created: 2026-06-13
updated: 2026-06-20
---

# LocalPlayer

Provides convenience accessors for the current player's Gob, movement state, grid location, and common UI meters.

## Members

### Methods

#### `public static Gob gob()`
- Role: Returns the current local player gob.
- Description: Reads the active player Gob through `MapViewBridge`; returns `null` when no `MapView` is active.

#### `public static Coord position()`
- Role: Returns the local player world position.
- Description: Returns the player's current `Gob.position()` in world coordinates. This assumes `gob()` is available.

#### `public static double a()`
- Role: Returns the local player facing angle.
- Description: Reads the heading angle from the active player Gob.

#### `public static double velocity()`
- Role: Returns the local player velocity.
- Description: Reads the current movement velocity from the active player Gob.

#### `public static boolean hasPose(String poseName)`
- Role: Checks whether the local player has a pose.
- Description: Delegates to the active player Gob pose set.

#### `public static MCache.Grid currentGrid()`
- Role: Returns the Haven grid containing the local player.
- Description: Resolves the player's world position through `GlobBridge.gridAtWorld(Coord2d)` and returns the current grid, or `null` when the player or world is unavailable.

#### `private static java.util.List<haven.LayerMeter.Meter> _requireMeterValues(haven.IMeter meterWidget)`
- Role: Extracts meter values from a meter widget.
- Description: Shared helper that throws when the expected meter widget is missing.

#### `public static double hardHitPoint()`
- Role: Implements the hard hit point operation.
- Description: Implements the hard hit point operation.

#### `public static double softHitPoint()`
- Role: Implements the soft hit point operation.
- Description: Implements the soft hit point operation.

#### `public static double stamina()`
- Role: Implements the stamina operation.
- Description: Implements the stamina operation.

#### `public static double energy()`
- Role: Implements the energy operation.
- Description: Implements the energy operation.

#### `public static double distance(Gob gob)`
- Role: Returns the distance to another Gob.
- Description: Measures distance from the current player Gob to the supplied Gob.

#### `public static double distance(Coord coord)`
- Role: Returns the distance to a coordinate.
- Description: Measures distance from the current player Gob to the supplied coordinate.

#### `private static boolean _isCursorChanged(String cursor)`
- Role: Checks whether the cursor changed.
- Description: Tests the current cursor resource suffix against the requested cursor name.

#### `private static void _sendClickMessage(Coord coord)`
- Role: Sends a click message.
- Description: Routes a click through the shared interaction helper.

#### `private static void _sendCancelActionMessage()`
- Role: Sends a cancel action message.
- Description: Emits the right-click cancel interaction at the current player position.