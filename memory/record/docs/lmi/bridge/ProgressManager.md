---
source: [ProgressManager.java](../../../../../src/lmi/bridge/ProgressManager.java)
created: 2026-06-13
updated: 2026-06-14
---

# ProgressManager

Tracks progress widgets and reports progress lifecycle changes to LMI.

## Members

### Constants

### Fields

#### `private static haven.GameUI.Progress _widget = null`
- Role: Caches the widget value.
- Description: Caches the `_widget` value for reuse.

### Methods

#### `public static void setWidget(haven.GameUI.Progress widget)`
- Role: Sets the widget.
- Description: Stores the active progress widget for later lifecycle checks.

#### `public static void waitProgress()`
- Role: Handles the wait progress path.
- Description: Waits until Haven's progress widget is no longer active.

#### `private static boolean _isProgressing()`
- Role: Handles the is progressing path.
- Description: Checks whether the current progress widget is still alive.

#### `private static void _waitProgressAdded()`
- Role: Handles the wait progress added path.
- Description: Blocks until Haven creates the progress widget.

#### `private static void waitProgressDestroyed()`
- Role: Handles the wait progress destroyed path.
- Description: Blocks until Haven removes the progress widget.