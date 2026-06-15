# StreamMessage

This file documents the responsibilities and members of `StreamMessage`.

## Meta

- Source: [StreamMessage.java](../../../src/haven/StreamMessage.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a stream message.

## Nested Types

### IOError

- Description: TODO

## Members

### Constants

### Fields

#### `private final InputStream bkin`

- Description: TODO

#### `private final OutputStream bkou`

- Description: TODO

#### `private int behind = 0`

- Description: TODO

### Methods

#### `public StreamMessage(InputStream in, OutputStream out)`

- Description: TODO

#### `public StreamMessage(InputStream in)`

- Description: TODO

#### `public StreamMessage(OutputStream out)`

- Description: TODO

#### `public IOError(Throwable cause)`

- Description: TODO

#### `public boolean underflow(int hint)`

- Description: TODO

#### `public int tell()`

- Description: TODO

#### `public void flush()`

- Description: TODO

#### `public void overflow(int min)`

- Description: TODO

#### `public void close()`

- Description: TODO
