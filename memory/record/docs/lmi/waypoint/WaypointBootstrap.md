---
source: [WaypointBootstrap.java](../../../../../src/lmi/waypoint/WaypointBootstrap.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointBootstrap

Bootstraps waypoint runtime wiring and startup state.

## Members

### Constants

### Fields

#### `private static boolean initialized`
- Role: Tracks whether initialized is initialized.
- Description: Boolean flag used to guard the surrounding lifecycle state.

### Methods

#### `private WaypointBootstrap()`
- Role: Creates a new WaypointBootstrap instance.
- Description: Constructs the WaypointBootstrap instance from the supplied inputs.

#### `public static synchronized void init()`
- Role: Initializes waypoint runtime wiring.
- Description: Prepares waypoint managers and persistence helpers once per process.

#### `public static synchronized boolean initialized()`
- Role: Returns whether waypoint bootstrap already ran.
- Description: Reports whether the waypoint runtime is ready.