# Chatwindow

This file documents the responsibilities and members of `Chatwindow`.

## Meta

- Source: [Chatwindow.java](../../../src/haven/Chatwindow.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the chatwindow Haven component.

## Nested Types

### $_

- Role: Represents $ within Chatwindow.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `private static final PrintWriter stdout = new PrintWriter(System.out)`
- Role: Defines the shared stdout constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final TextEntry in`
- Role: Stores the in value.
- Description: Backs the cached state for this file.

#### `public final Textlog out`
- Role: Stores the out value.
- Description: Backs the cached state for this file.

#### `private boolean stdio`
- Role: Tracks the stdio flag.
- Description: Supports the stdio operation used by the surrounding class.

#### `private Thread reader`
- Role: Holds the reader state.
- Description: Backs the cached state for this file.

#### `private final StringBuilder readbuf = new StringBuilder()`
- Role: Stores the readbuf value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Chatwindow(Coord sz)`
- Role: Creates a new Chatwindow instance.
- Description: Constructs the instance and initializes its default state.

#### `private void stdin()`
- Role: Performs stdin.
- Description: Supports the stdin operation used by the surrounding class.

#### `public void stdio(boolean on)`
- Role: Performs stdio.
- Description: Supports the stdio operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.
