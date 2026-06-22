---
source: [ClickManager.java](../../../../../src/lmi/core/ClickManager.java)
created: 2026-06-13
updated: 2026-06-14
---

# ClickManager

Coordinates click-driven interaction handling.

## Members

### Constants

### Fields

#### `public static volatile boolean isGobClickMode`
- Role: Tracks the is gob click mode flag.
- Description: Caches the `isGobClickMode` value for reuse.

#### `public static volatile boolean isAreaSelectMode`
- Role: Tracks the is area select mode flag.
- Description: Caches the `isAreaSelectMode` value for reuse.

#### `private static haven.ClickData _clickData`
- Role: Caches the click data value.
- Description: Caches the `_clickData` value for reuse.

#### `private static Rect _selectedArea`
- Role: Caches the selected area value.
- Description: Caches the `_selectedArea` value for reuse.

### Methods

#### `public static void setClickData(haven.ClickData clickData)`
- Role: Sets the click data.
- Description: Updates the current object state.

#### `public static void setSelectedArea(Rect area)`
- Role: Sets the selected area.
- Description: Updates the current object state.

#### `public static void reset()`
- Role: Resets the stream if mark/reset is supported.
- Description: Resets the stream if mark/reset is supported.

#### `public static Gob getGob()`
- Role: Returns the gob.
- Description: Returns the gob.

#### `public static Rect getArea()`
- Role: Returns the area.
- Description: Returns the area.