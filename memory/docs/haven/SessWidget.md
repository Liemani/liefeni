# SessWidget

This file documents the responsibilities and members of `SessWidget`.

## Meta

- Source: [SessWidget.java](../../../src/haven/SessWidget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a widget tied to session state.

## Nested Types

### $_

- Description: TODO

### Result

- Description: TODO

## Members

### Constants

### Fields

#### `private final Defer.Future<Result> conn`

- Description: TODO

#### `private boolean rep = false`

- Description: TODO

#### `final Session sess`

- Description: TODO

#### `final Connection.SessionError error`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `Result(Session sess, Connection.SessionError error)`

- Description: TODO

#### `public SessWidget(final String addr, final int port, Session.User acct, boolean encrypt, final byte[] cookie, final Object... args)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void uimsg(String name, Object... args)`

- Description: TODO

#### `public void destroy()`

- Description: TODO
