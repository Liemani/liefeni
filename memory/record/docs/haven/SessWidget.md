---
source: [SessWidget.java](../../../../src/haven/SessWidget.java)
created: 2026-06-13
updated: 2026-06-14
---

# SessWidget

Represents the sess widget Haven component.

## Nested Types

### $_

- Role: Registers the `sess` widget factory.
- Description: Creates a session widget from the address, port, cookie, and extra arguments.

### Result

- Role: Holds the outcome of the connection attempt.
- Description: Stores either the connected `Session` or the `SessionError` returned by `Session.connect(...)`.

## Members

### Constants

### Fields

#### `private final Defer.Future<Result> conn`
- Role: Tracks the pending connection attempt.
- Description: Completes with either a connected session or a connection error.

#### `private boolean rep = false`
- Role: Tracks whether the connection result has been reported.
- Description: Prevents duplicate error handling or duplicate widget replacement.

#### `final Session sess`
- Role: Stores the established session.
- Description: Non-null when the connection succeeded.

#### `final Connection.SessionError error`
- Role: Stores the connection error.
- Description: Non-null when the session attempt failed.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates a session-connection widget.
- Description: Starts the connection flow and returns the widget used while it is pending.

#### `Result(Session sess, Connection.SessionError error)`
- Role: Wraps the connection result.
- Description: Stores either the success session or the failure object.

#### `public SessWidget(final String addr, final int port, Session.User acct, boolean encrypt, final byte[] cookie, final Object... args)`
- Role: Starts the session connection widget.
- Description: Kicks off the asynchronous session connect attempt.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void destroy()`
- Role: Tears down the session widget.
- Description: Cancels pending work and releases the widget state.
