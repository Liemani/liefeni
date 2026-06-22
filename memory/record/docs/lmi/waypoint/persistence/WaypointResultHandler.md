---
source: [WaypointResultHandler.java](../../../../../../src/lmi/waypoint/persistence/WaypointResultHandler.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointResultHandler

Provides waypoint persistence support for waypoint result handler.

## Members

### Constants

### Fields

### Methods

#### `void onSuccess(R result)`
- Role: Receives a successful waypoint DB result.
- Description: Handles the result after the executor finishes without error.

#### `void onFailure(Exception error)`
- Role: Receives a failed waypoint DB result.
- Description: Handles the exception raised by the executor thread.