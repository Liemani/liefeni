---
source: [ClickManager.java](../../../../src/lmi/core/ClickManager.java)
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
- Description: Supports the is gob click mode operation used by the surrounding class.

#### `public static volatile boolean isAreaSelectMode`
- Role: Tracks the is area select mode flag.
- Description: Supports the is area select mode operation used by the surrounding class.

#### `private static haven.ClickData _clickData`
- Role: Holds the click data state.
- Description: Backs the cached state for this file.

#### `private static Rect _selectedArea`
- Role: Stores the selected area value.
- Description: Backs the cached state for this file.

### Methods

#### `public static void setClickData(haven.ClickData clickData)`
- Role: Sets the click data.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setSelectedArea(Rect area)`
- Role: Sets the selected area.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void reset()`
- Role: Performs reset.
- Description: Supports the reset operation used by the surrounding class.

#### `public static Gob getGob()`
- Role: Returns the gob.
- Description: Exposes the requested value without mutating state.

#### `public static Rect getArea()`
- Role: Returns the area.
- Description: Exposes the requested value without mutating state.
