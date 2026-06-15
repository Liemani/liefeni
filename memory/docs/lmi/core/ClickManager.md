# ClickManager

This file documents the responsibilities and members of `ClickManager`.

## Meta

- Source: [ClickManager.java](../../../../src/lmi/core/ClickManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates subsystem state and routes work through the appropriate boundary.

## Members

### Constants

### Fields

#### `public static volatile boolean isGobClickMode`

- Description: TODO

#### `public static volatile boolean isAreaSelectMode`

- Description: TODO

#### `private static haven.ClickData _clickData`

- Description: TODO

#### `private static Rect _selectedArea`

- Description: TODO

### Methods

#### `public static void setClickData(haven.ClickData clickData)`

- Description: TODO

#### `public static void setSelectedArea(Rect area)`

- Description: TODO

#### `public static void reset()`

- Description: TODO

#### `public static Gob getGob()`

- Description: TODO

#### `public static Rect getArea()`

- Description: TODO
