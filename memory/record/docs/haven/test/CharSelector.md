---
source: [CharSelector.java](../../../../src/haven/test/CharSelector.java)
created: 2026-06-13
updated: 2026-06-14
---

# CharSelector

Provides a Haven test helper for char selector.

## Members

### Constants

### Fields

#### `Runnable cb`
- Role: Holds the cb state.
- Description: Backs the cached state for this file.

#### `String chr`
- Role: Stores the chr value.
- Description: Backs the cached state for this file.

#### `Charlist chrlist`
- Role: Stores the chrlist value.
- Description: Backs the cached state for this file.

### Methods

#### `public CharSelector(TestClient c, String chr, Runnable cb)`
- Role: Creates a new CharSelector instance.
- Description: Constructs the instance and initializes its default state.

#### `public void check()`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public void newwdg(int id, Widget w, Object... args)`
- Role: Performs newwdg.
- Description: Supports the newwdg operation used by the surrounding class.

#### `public void dstwdg(int id, Widget w)`
- Role: Performs dstwdg.
- Description: Supports the dstwdg operation used by the surrounding class.

#### `public void uimsg(int id, Widget w, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void succeed()`
- Role: Performs succeed.
- Description: Supports the succeed operation used by the surrounding class.
