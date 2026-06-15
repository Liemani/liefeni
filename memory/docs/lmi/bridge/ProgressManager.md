# ProgressManager

This file documents the responsibilities and members of `ProgressManager`.

## Meta

- Source: [ProgressManager.java](../../../../src/lmi/bridge/ProgressManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Tracks a `GameUI.Progress` widget and waits for it to appear and disappear around blocking actions.

## Members

### Constants

### Fields

#### `private static haven.GameUI.Progress _widget = null`

- Description: TODO

### Methods

#### `public static void setWidget(haven.GameUI.Progress widget)`

- Description: TODO

#### `public static void waitProgress()`

- Description: TODO

#### `private static boolean _isProgressing()`

- Description: TODO

#### `private static void _waitProgressAdded()`

- Description: TODO

#### `private static void waitProgressDestroyed()`

- Description: TODO
