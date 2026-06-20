---
source: [MessageInputStream.java](../../../src/haven/MessageInputStream.java)
created: 2026-06-13
updated: 2026-06-14
---

# MessageInputStream

Represents the message input stream Haven component.

## Members

### Constants

### Fields

#### `private final Message bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

### Methods

#### `public MessageInputStream(Message from)`
- Role: Creates a new MessageInputStream instance.
- Description: Constructs the instance and initializes its default state.

#### `public int read()`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int read(byte[] buf, int off, int len)`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.
