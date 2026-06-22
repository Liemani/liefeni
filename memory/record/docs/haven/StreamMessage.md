---
source: [StreamMessage.java](../../../../src/haven/StreamMessage.java)
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
- Role: Caches the bkin value.
- Description: Caches the `bkin` value for reuse.

#### `private final OutputStream bkou`
- Role: Caches the bkou value.
- Description: Caches the `bkou` value for reuse.

#### `private int behind = 0`
- Role: Caches the behind value.
- Description: Caches the `behind` value for reuse.

### Methods

#### `public StreamMessage(InputStream in, OutputStream out)`
- Role: Creates a new StreamMessage instance.
- Description: Constructs the StreamMessage instance from the supplied inputs.

#### `public StreamMessage(InputStream in)`
- Role: Creates a new StreamMessage instance.
- Description: Constructs the StreamMessage instance from the supplied inputs.

#### `public StreamMessage(OutputStream out)`
- Role: Creates a new StreamMessage instance.
- Description: Constructs the StreamMessage instance from the supplied inputs.

#### `public IOError(Throwable cause)`
- Role: Handles the ioerror path.
- Description: Implements the io error operation.

#### `public boolean underflow(int hint)`
- Role: Handles the underflow path.
- Description: Implements the underflow operation.

#### `public int tell()`
- Role: Handles the tell path.
- Description: Implements the tell operation.

#### `public void flush()`
- Role: Handles the flush path.
- Description: Implements the flush operation.

#### `public void overflow(int min)`
- Role: Handles the overflow path.
- Description: Implements the overflow operation.

#### `public void close()`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.