---
source: [ACheckBox.java](../../../../src/haven/ACheckBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# ACheckBox

Represents the acheck box Haven component.

## Members

### Constants

### Fields

#### `public boolean a = false`
- Role: Tracks the a flag.
- Description: Caches the `a` value for reuse.

#### `public Supplier<Boolean> state = () -> this.a`
- Role: Tracks the state flag.
- Description: Implements the public supplier<boolean> state = () -> this.a operation.

#### `public Consumer<Boolean> changed = a ->`
- Role: Tracks whether changed is changed.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public Consumer<Boolean> set = a ->`
- Role: Tracks the set flag.
- Description: Caches the `set` value for reuse.

#### `public Runnable click = () -> set(!state())`
- Role: Handles click input for this widget.
- Description: Handles click input for this widget.

### Methods

#### `public ACheckBox()`
- Role: Creates a new ACheckBox instance.
- Description: Constructs the ACheckBox instance from the supplied inputs.

#### `public ACheckBox(Coord sz)`
- Role: Creates a new ACheckBox instance.
- Description: Constructs the ACheckBox instance from the supplied inputs.

#### `public ACheckBox state(Supplier<Boolean> state)`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public boolean state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public ACheckBox changed(Consumer<Boolean> changed)`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public void changed(boolean val)`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public ACheckBox set(Consumer<Boolean> set)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void set(boolean a)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public ACheckBox click(Runnable click)`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `public void click()`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `public boolean gkeytype(GlobKeyEvent ev)`
- Role: Handles the gkeytype path.
- Description: Implements the gkeytype operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.