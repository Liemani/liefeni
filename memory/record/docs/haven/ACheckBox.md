---
source: [ACheckBox.java](../../../src/haven/ACheckBox.java)
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
- Description: Supports the a operation used by the surrounding class.

#### `public Supplier<Boolean> state = () -> this.a`
- Role: Tracks the state flag.
- Description: Supports the state operation used by the surrounding class.

#### `public Consumer<Boolean> changed = a ->`
- Role: Tracks whether changed is changed.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public Consumer<Boolean> set = a ->`
- Role: Tracks the set flag.
- Description: Supports the set operation used by the surrounding class.

#### `public Runnable click = () -> set(!state())`
- Role: Holds the click state.
- Description: Backs the cached state for this file.

### Methods

#### `public ACheckBox()`
- Role: Creates a new ACheckBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public ACheckBox(Coord sz)`
- Role: Creates a new ACheckBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public ACheckBox state(Supplier<Boolean> state)`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public boolean state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public ACheckBox changed(Consumer<Boolean> changed)`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public void changed(boolean val)`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public ACheckBox set(Consumer<Boolean> set)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void set(boolean a)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public ACheckBox click(Runnable click)`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public boolean gkeytype(GlobKeyEvent ev)`
- Role: Performs gkeytype.
- Description: Supports the gkeytype operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
