---
source: [SessWidget.java](../../../src/haven/SessWidget.java)
created: 2026-06-13
updated: 2026-06-14
---

# SessWidget

Represents the sess widget Haven component.

## Nested Types

### $_

- Role: Represents $ within SessWidget.
- Description: Describes the nested $  type used by the enclosing class.

### Result

- Role: Represents result within SessWidget.
- Description: Describes the nested result type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final Defer.Future<Result> conn`
- Role: Holds the conn state.
- Description: Backs the cached state for this file.

#### `private boolean rep = false`
- Role: Tracks the rep flag.
- Description: Supports the rep operation used by the surrounding class.

#### `final Session sess`
- Role: Stores the sess value.
- Description: Backs the cached state for this file.

#### `final Connection.SessionError error`
- Role: Stores the error value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `Result(Session sess, Connection.SessionError error)`
- Role: Handles the result workflow.
- Description: Supports the result operation used by the surrounding class.

#### `public SessWidget(final String addr, final int port, Session.User acct, boolean encrypt, final byte[] cookie, final Object... args)`
- Role: Creates a new SessWidget instance.
- Description: Constructs the instance and initializes its default state.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.
