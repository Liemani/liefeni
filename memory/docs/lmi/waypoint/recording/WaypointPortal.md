# WaypointPortal

This file documents the responsibilities and members of `WaypointPortal`.

## Meta

- Source: [WaypointPortal.java](../../../../../src/lmi/waypoint/recording/WaypointPortal.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a waypoint portal candidate.

## Members

### Constants

#### `private static final Map<String, List<String>> counterpartMap = new HashMap<>()`
- Role: Defines the shared counterpart map constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `private WaypointPortal()`
- Role: Creates a new WaypointPortal instance.
- Description: Constructs the instance and initializes its default state.

#### `public static List<String> counterpartResnames(String resname)`
- Role: Performs counterpart resnames.
- Description: Supports the counterpart resnames operation used by the surrounding class.

#### `public static boolean isPortalResname(String resname)`
- Role: Checks whether the portal resname.
- Description: Returns a boolean result for the described condition.

#### `private static void pair(String a, String b)`
- Role: Performs pair.
- Description: Supports the pair operation used by the surrounding class.

#### `private static List<String> counterpart(String resname)`
- Role: Performs counterpart.
- Description: Supports the counterpart operation used by the surrounding class.
