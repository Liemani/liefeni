# ProgressManager

This file documents the responsibilities and members of `ProgressManager`.

## Meta

- Source: [ProgressManager.java](../../../../src/lmi/bridge/ProgressManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Tracks progress widgets and reports progress lifecycle changes to LMI.

## Members

### Constants

### Fields

#### `private static haven.GameUI.Progress _widget = null`
- Role: Stores the widget value.
- Description: Backs the cached state for this file.

### Methods

#### `public static void setWidget(haven.GameUI.Progress widget)`
- Role: Sets the widget.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void waitProgress()`
- Role: Performs wait progress.
- Description: Supports the wait progress operation used by the surrounding class.

#### `private static boolean _isProgressing()`
- Role: Performs  is progressing.
- Description: Supports the is progressing operation used by the surrounding class.

#### `private static void _waitProgressAdded()`
- Role: Performs  wait progress added.
- Description: Supports the wait progress added operation used by the surrounding class.

#### `private static void waitProgressDestroyed()`
- Role: Performs wait progress destroyed.
- Description: Supports the wait progress destroyed operation used by the surrounding class.
