# ZMessage

This file documents the responsibilities and members of `ZMessage`.

## Meta

- Source: [ZMessage.java](../../../src/haven/ZMessage.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the zmessage Haven component.

## Members

### Constants

### Fields

#### `private transient Inflater zi = null`
- Role: Holds the zi state.
- Description: Backs the cached state for this file.

#### `private transient Deflater zo = null`
- Role: Holds the zo state.
- Description: Backs the cached state for this file.

#### `private boolean eof`
- Role: Tracks the eof flag.
- Description: Supports the eof operation used by the surrounding class.

#### `private final transient Message bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

### Methods

#### `public ZMessage(Message from)`
- Role: Creates a new ZMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean underflow(int hint)`
- Role: Performs underflow.
- Description: Supports the underflow operation used by the surrounding class.

#### `private void flush(boolean sync, boolean finish)`
- Role: Performs flush.
- Description: Supports the flush operation used by the surrounding class.

#### `public void flush()`
- Role: Performs flush.
- Description: Supports the flush operation used by the surrounding class.

#### `public void overflow(int min)`
- Role: Performs overflow.
- Description: Supports the overflow operation used by the surrounding class.

#### `public void finish()`
- Role: Performs finish.
- Description: Supports the finish operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.
