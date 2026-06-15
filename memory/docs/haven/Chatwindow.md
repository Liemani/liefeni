# Chatwindow

This file documents the responsibilities and members of `Chatwindow`.

## Meta

- Source: [Chatwindow.java](../../../src/haven/Chatwindow.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a chat window widget.

## Nested Types

### $_

- Description: TODO

## Members

### Constants

#### `private static final PrintWriter stdout = new PrintWriter(System.out)`

- Description: TODO

### Fields

#### `public final TextEntry in`

- Description: TODO

#### `public final Textlog out`

- Description: TODO

#### `private boolean stdio`

- Description: TODO

#### `private Thread reader`

- Description: TODO

#### `private final StringBuilder readbuf = new StringBuilder()`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Chatwindow(Coord sz)`

- Description: TODO

#### `private void stdin()`

- Description: TODO

#### `public void stdio(boolean on)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO
