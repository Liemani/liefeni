---
source: [ZMessage.java](../../../../src/haven/ZMessage.java)
created: 2026-06-13
updated: 2026-06-14
---

# ZMessage

Represents the zmessage Haven component.

## Members

### Constants

### Fields

#### `private transient Inflater zi = null`
- Role: Caches the zi value.
- Description: Caches the `zi` value for reuse.

#### `private transient Deflater zo = null`
- Role: Caches the zo value.
- Description: Caches the `zo` value for reuse.

#### `private boolean eof`
- Role: Tracks the eof flag.
- Description: Caches the `eof` value for reuse.

#### `private final transient Message bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

### Methods

#### `public ZMessage(Message from)`
- Role: Creates a new ZMessage instance.
- Description: Constructs the ZMessage instance from the supplied inputs.

#### `public boolean underflow(int hint)`
- Role: Handles the underflow path.
- Description: Implements the underflow operation.

#### `private void flush(boolean sync, boolean finish)`
- Role: Handles the flush path.
- Description: Implements the flush operation.

#### `public void flush()`
- Role: Handles the flush path.
- Description: Implements the flush operation.

#### `public void overflow(int min)`
- Role: Handles the overflow path.
- Description: Implements the overflow operation.

#### `public void finish()`
- Role: Handles the finish path.
- Description: Implements the finish operation.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.