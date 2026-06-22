---
source: [CharSelector.java](../../../../../src/haven/test/CharSelector.java)
created: 2026-06-13
updated: 2026-06-14
---

# CharSelector

Provides a Haven test helper for char selector.

## Members

### Constants

### Fields

#### `Runnable cb`
- Role: Caches the cb value.
- Description: Caches the `cb` value for reuse.

#### `String chr`
- Role: Caches the chr value.
- Description: Caches the `chr` value for reuse.

#### `Charlist chrlist`
- Role: Caches the chrlist value.
- Description: Caches the `chrlist` value for reuse.

### Methods

#### `public CharSelector(TestClient c, String chr, Runnable cb)`
- Role: Creates a new CharSelector instance.
- Description: Constructs the CharSelector instance from the supplied inputs.

#### `public void check()`
- Role: Handles the check path.
- Description: Implements the check operation.

#### `public void newwdg(int id, Widget w, Object... args)`
- Role: Handles the newwdg path.
- Description: Implements the newwdg operation.

#### `public void dstwdg(int id, Widget w)`
- Role: Handles the dstwdg path.
- Description: Implements the dstwdg operation.

#### `public void uimsg(int id, Widget w, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void succeed()`
- Role: Handles the succeed path.
- Description: Implements the succeed operation.