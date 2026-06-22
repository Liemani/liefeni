---
source: [Chatwindow.java](../../../../src/haven/Chatwindow.java)
created: 2026-06-13
updated: 2026-06-14
---

# Chatwindow

Represents the chatwindow Haven component.

## Nested Types

### $_

- Role: Represents $ within Chatwindow.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `private static final PrintWriter stdout = new PrintWriter(System.out)`
- Role: Implements the stdout operation.
- Description: Implements the print writer operation.
- Value: `new PrintWriter(System.out)`

### Fields

#### `public final TextEntry in`
- Role: Caches the in value.
- Description: Caches the `in` value for reuse.

#### `public final Textlog out`
- Role: Caches the out value.
- Description: Caches the `out` value for reuse.

#### `private boolean stdio`
- Role: Tracks the stdio flag.
- Description: Caches the `stdio` value for reuse.

#### `private Thread reader`
- Role: Caches the reader value.
- Description: Caches the `reader` value for reuse.

#### `private final StringBuilder readbuf = new StringBuilder()`
- Role: Implements the readbuf operation.
- Description: Implements the string builder operation.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Chatwindow(Coord sz)`
- Role: Creates a new Chatwindow instance.
- Description: Constructs the Chatwindow instance from the supplied inputs.

#### `private void stdin()`
- Role: Handles the stdin path.
- Description: Implements the stdin operation.

#### `public void stdio(boolean on)`
- Role: Handles the stdio path.
- Description: Implements the stdio operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.