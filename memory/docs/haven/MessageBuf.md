# MessageBuf

This file documents the responsibilities and members of `MessageBuf`.

## Meta

- Source: [MessageBuf.java](../../../src/haven/MessageBuf.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Buffers messages in memory.

## Members

### Constants

#### `public static final MessageBuf nil = new MessageBuf()`

- Description: TODO

### Fields

#### `private final int oh`

- Description: TODO

### Methods

#### `public MessageBuf(byte[] blob, int off, int len)`

- Description: TODO

#### `public MessageBuf(byte[] blob)`

- Description: TODO

#### `public MessageBuf()`

- Description: TODO

#### `public MessageBuf(Message from, int len)`

- Description: TODO

#### `public MessageBuf(Message from)`

- Description: TODO

#### `public boolean underflow(int hint)`

- Description: TODO

#### `public void overflow(int min)`

- Description: TODO

#### `public boolean equals(Object o2)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public int rem()`

- Description: TODO

#### `public void rewind()`

- Description: TODO

#### `public MessageBuf clone()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public byte[] fin()`

- Description: TODO

#### `public void fin(byte[] buf, int off)`

- Description: TODO

#### `public void fin(java.nio.ByteBuffer buf)`

- Description: TODO

#### `public String toString()`

- Description: TODO
