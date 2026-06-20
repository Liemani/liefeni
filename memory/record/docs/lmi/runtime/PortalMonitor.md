---
source: [PortalMonitor.java](../../../../src/lmi/runtime/PortalMonitor.java)
created: 2026-06-13
updated: 2026-06-14
---

# PortalMonitor

Monitors portal-related runtime events.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Defines the shared lock constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static long enteredGeneration = 0L`
- Role: Stores the entered generation value.
- Description: Backs the cached state for this file.

### Methods

#### `private PortalMonitor()`
- Role: Creates a new PortalMonitor instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public static long generation()`
- Role: Performs generation.
- Description: Supports the generation operation used by the surrounding class.

#### `public static void waitNextEnter(long previousGeneration)`
- Role: Performs wait next enter.
- Description: Supports the wait next enter operation used by the surrounding class.

#### `public static void notifyDidEnterPortal()`
- Role: Performs notify did enter portal.
- Description: Supports the notify did enter portal operation used by the surrounding class.
