---
source: [PortalMonitor.java](../../../../../src/lmi/runtime/PortalMonitor.java)
created: 2026-06-13
updated: 2026-06-14
---

# PortalMonitor

Monitors portal-related runtime events.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Implements the lock operation.
- Description: Implements the object operation.

### Fields

#### `private static long enteredGeneration = 0L`
- Role: Caches the entered generation value.
- Description: Caches the `enteredGeneration` value for reuse.

### Methods

#### `private PortalMonitor()`
- Role: Creates a new PortalMonitor instance.
- Description: Constructs the PortalMonitor instance from the supplied inputs.

#### `public static void clear()`
- Role: Clears waypoint manager state.
- Description: Resets the portal entry marker before the next transition.

#### `public static long generation()`
- Role: Returns the current portal generation counter.
- Description: Exposes the portal entry sequence number.

#### `public static void waitNextEnter(long previousGeneration)`
- Role: Blocks until the portal generation advances.
- Description: Waits for the next portal-entry event after the supplied generation.

#### `public static void notifyDidEnterPortal()`
- Role: Marks that Haven entered a portal.
- Description: Advances the portal generation and wakes waiting callers.