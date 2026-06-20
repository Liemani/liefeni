---
source: [Profwnd.java](../../../src/haven/Profwnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# Profwnd

Represents the profwnd Haven component.

## Members

### Constants

### Fields

#### `private final Profile prof`
- Role: Stores the prof value.
- Description: Backs the cached state for this file.

#### `private final boolean live`
- Role: Tracks the live flag.
- Description: Supports the live operation used by the surrounding class.

### Methods

#### `public Profwnd(Profile prof, String title, boolean live)`
- Role: Creates a new Profwnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public Profwnd(Profile prof, String title)`
- Role: Creates a new Profwnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public void reqclose()`
- Role: Performs reqclose.
- Description: Supports the reqclose operation used by the surrounding class.

#### `private void capture()`
- Role: Performs capture.
- Description: Supports the capture operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.
