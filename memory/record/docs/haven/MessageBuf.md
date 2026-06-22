---
source: [MessageBuf.java](../../../../src/haven/MessageBuf.java)
created: 2026-06-13
updated: 2026-06-14
---

# MessageBuf

Represents a mutable binary message buffer.

## Members

### Constants

#### `public static final MessageBuf nil = new MessageBuf()`
- Role: Implements the nil operation.
- Description: Implements the message buf operation.
- Value: `new MessageBuf()`

### Fields

#### `private final int oh`
- Role: Caches the oh value.
- Description: Caches the `oh` value for reuse.

### Methods

#### `public MessageBuf(byte[] blob, int off, int len)`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the MessageBuf instance from the supplied inputs.

#### `public MessageBuf(byte[] blob)`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the MessageBuf instance from the supplied inputs.

#### `public MessageBuf()`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the MessageBuf instance from the supplied inputs.

#### `public MessageBuf(Message from, int len)`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the MessageBuf instance from the supplied inputs.

#### `public MessageBuf(Message from)`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the MessageBuf instance from the supplied inputs.

#### `public boolean underflow(int hint)`
- Role: Handles the underflow path.
- Description: Implements the underflow operation.

#### `public void overflow(int min)`
- Role: Handles the overflow path.
- Description: Implements the overflow operation.

#### `public boolean equals(Object o2)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public int rem()`
- Role: Handles the rem path.
- Description: Implements the rem operation.

#### `public void rewind()`
- Role: Handles the rewind path.
- Description: Implements the rewind operation.

#### `public MessageBuf clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public byte[] fin()`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `public void fin(byte[] buf, int off)`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `public void fin(java.nio.ByteBuffer buf)`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this MessageBuf for debugging and logging.