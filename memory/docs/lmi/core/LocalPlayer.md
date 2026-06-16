# LocalPlayer

This file documents the responsibilities and members of `LocalPlayer`.

## Meta

- Source: [LocalPlayer.java](../../../../src/lmi/core/LocalPlayer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides cached access to the local player state.

## Members

### Constants

### Fields

### Methods

#### `public static Gob gob()`
- Role: Returns the current local player gob.
- Description: Provides the cached local player Gob when the current world state is available.

#### `public static Coord position()`
- Role: Returns the local player world position.
- Description: Returns the current world-space position of the local player.

#### `public static double a()`
- Role: Returns the local player facing angle.
- Description: Returns the local player heading in radians.

#### `public static double velocity()`
- Role: Returns the local player velocity.
- Description: Returns the local player movement speed.

#### `public static boolean hasPose(String poseName)`
- Role: Checks whether the local player has the named pose.
- Description: Checks the active pose set before driving pose-dependent behavior.

#### `public static MCache.Grid currentGrid()`
- Role: Returns the Haven grid containing the local player.
- Description: Returns the map grid that currently contains the local player.

#### `private static java.util.List<haven.LayerMeter.Meter> _requireMeterValues(haven.IMeter meterWidget)`
- Role: Extracts meter values from an IMeter widget.
- Description: Supports the require meter values operation used by the surrounding class.

#### `public static double hardHitPoint()`
- Role: Returns the current hard hit point value.
- Description: Reads the current hard-hit-point meter from the UI state.

#### `public static double softHitPoint()`
- Role: Returns the current soft hit point value.
- Description: Reads the current soft-hit-point meter from the UI state.

#### `public static double stamina()`
- Role: Returns the current stamina value.
- Description: Reads the current stamina meter from the UI state.

#### `public static double energy()`
- Role: Returns the current energy value.
- Description: Reads the current energy meter from the UI state.

#### `public static double distance(Gob gob)`
- Role: Returns the distance from the local player.
- Description: Measures the distance from the current local player position.

#### `public static double distance(Coord coord)`
- Role: Returns the distance from the local player.
- Description: Measures the distance from the current local player position.

#### `private static boolean _isCursorChanged(String cursor)`
- Role: Checks whether the cursor changed.
- Description: Returns a boolean result for the described condition.

#### `private static void _sendClickMessage(Coord coord)`
- Role: Sends a click message for the given coordinate.
- Description: Sends a click message for the given coordinate into the target Haven callback or UI message path.

#### `private static void _sendCancelActionMessage()`
- Role: Sends a cancel action message.
- Description: Sends a cancel action message into the target Haven callback or UI message path.
