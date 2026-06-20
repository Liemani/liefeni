---
source: [DesktopBrowser.java](../../../src/haven/DesktopBrowser.java)
created: 2026-06-13
updated: 2026-06-14
---

# DesktopBrowser

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
