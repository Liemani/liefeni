---
source: [MessageInputStream.java](../../../../src/haven/MessageInputStream.java)
created: 2026-06-13
updated: 2026-06-14
---

# MessageInputStream

Represents the message input stream Haven component.

## Members

### Constants

### Fields

#### `private final Message bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

### Methods

#### `public MessageInputStream(Message from)`
- Role: Creates a new MessageInputStream instance.
- Description: Constructs the MessageInputStream instance from the supplied inputs.

#### `public int read()`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public int read(byte[] buf, int off, int len)`
- Role: Reads the target data.
- Description: Implements the read operation.