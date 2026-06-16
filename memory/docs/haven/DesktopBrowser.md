# DesktopBrowser

This file documents the responsibilities and members of `DesktopBrowser`.

## Meta

- Source: [DesktopBrowser.java](../../../src/haven/DesktopBrowser.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the desktop browser Haven component.

## Members

### Constants

### Fields

#### `private final Desktop desktop`
- Role: Holds the desktop state.
- Description: Backs the cached state for this file.

### Methods

#### `private DesktopBrowser(Desktop desktop)`
- Role: Creates a new DesktopBrowser instance.
- Description: Constructs the instance and initializes its default state.

#### `public static DesktopBrowser create()`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void show(URL url)`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.
