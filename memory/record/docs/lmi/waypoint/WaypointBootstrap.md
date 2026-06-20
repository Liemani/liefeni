---
source: [WaypointBootstrap.java](../../../../src/lmi/waypoint/WaypointBootstrap.java)
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
- Description: Constructs the instance and initializes its default state.

#### `public static synchronized void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public static synchronized boolean initialized()`
- Role: Performs initialized.
- Description: Supports the initialized operation used by the surrounding class.
