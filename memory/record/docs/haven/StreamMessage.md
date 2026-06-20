---
source: [StreamMessage.java](../../../src/haven/StreamMessage.java)
created: 2026-06-13
updated: 2026-06-14
---

# StreamMessage

Represents the stream message Haven component.

## Nested Types

### IOError

- Role: Represents ioerror within StreamMessage.
- Description: Describes the nested ioerror type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final InputStream bkin`
- Role: Holds the bkin state.
- Description: Backs the cached state for this file.

#### `private final OutputStream bkou`
- Role: Holds the bkou state.
- Description: Backs the cached state for this file.

#### `private int behind = 0`
- Role: Stores the behind value.
- Description: Backs the cached state for this file.

### Methods

#### `public StreamMessage(InputStream in, OutputStream out)`
- Role: Creates a new StreamMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public StreamMessage(InputStream in)`
- Role: Creates a new StreamMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public StreamMessage(OutputStream out)`
- Role: Creates a new StreamMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public IOError(Throwable cause)`
- Role: Performs ioerror.
- Description: Supports the ioerror operation used by the surrounding class.

#### `public boolean underflow(int hint)`
- Role: Performs underflow.
- Description: Supports the underflow operation used by the surrounding class.

#### `public int tell()`
- Role: Performs tell.
- Description: Supports the tell operation used by the surrounding class.

#### `public void flush()`
- Role: Performs flush.
- Description: Supports the flush operation used by the surrounding class.

#### `public void overflow(int min)`
- Role: Performs overflow.
- Description: Supports the overflow operation used by the surrounding class.

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.
