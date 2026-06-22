---
source: [Profwnd.java](../../../../src/haven/Profwnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# Profwnd

Represents the profwnd Haven component.

## Members

### Constants

### Fields

#### `private final Profile prof`
- Role: Caches the prof value.
- Description: Caches the `prof` value for reuse.

#### `private final boolean live`
- Role: Tracks the live flag.
- Description: Caches the `live` value for reuse.

### Methods

#### `public Profwnd(Profile prof, String title, boolean live)`
- Role: Creates a new Profwnd instance.
- Description: Constructs the Profwnd instance from the supplied inputs.

#### `public Profwnd(Profile prof, String title)`
- Role: Creates a new Profwnd instance.
- Description: Constructs the Profwnd instance from the supplied inputs.

#### `public void reqclose()`
- Role: Handles the reqclose path.
- Description: Implements the reqclose operation.

#### `private void capture()`
- Role: Handles the capture path.
- Description: Implements the capture operation.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.