# ZMessage

This file documents the responsibilities and members of `ZMessage`.

## Meta

- Source: [ZMessage.java](../../../src/haven/ZMessage.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a z-order or layered message.

## Members

### Constants

### Fields

#### `private transient Inflater zi = null`

- Description: TODO

#### `private transient Deflater zo = null`

- Description: TODO

#### `private boolean eof`

- Description: TODO

#### `private final transient Message bk`

- Description: TODO

### Methods

#### `public ZMessage(Message from)`

- Description: TODO

#### `public boolean underflow(int hint)`

- Description: TODO

#### `private void flush(boolean sync, boolean finish)`

- Description: TODO

#### `public void flush()`

- Description: TODO

#### `public void overflow(int min)`

- Description: TODO

#### `public void finish()`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO
