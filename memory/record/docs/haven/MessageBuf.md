---
source: [MessageBuf.java](../../../src/haven/MessageBuf.java)
created: 2026-06-13
updated: 2026-06-14
---

# MessageBuf

Represents a mutable binary message buffer.

## Members

### Constants

#### `public static final MessageBuf nil = new MessageBuf()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final int oh`
- Role: Stores the oh value.
- Description: Backs the cached state for this file.

### Methods

#### `public MessageBuf(byte[] blob, int off, int len)`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the instance and initializes its default state.

#### `public MessageBuf(byte[] blob)`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the instance and initializes its default state.

#### `public MessageBuf()`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the instance and initializes its default state.

#### `public MessageBuf(Message from, int len)`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the instance and initializes its default state.

#### `public MessageBuf(Message from)`
- Role: Creates a new MessageBuf instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean underflow(int hint)`
- Role: Performs underflow.
- Description: Supports the underflow operation used by the surrounding class.

#### `public void overflow(int min)`
- Role: Performs overflow.
- Description: Supports the overflow operation used by the surrounding class.

#### `public boolean equals(Object o2)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public int rem()`
- Role: Performs rem.
- Description: Supports the rem operation used by the surrounding class.

#### `public void rewind()`
- Role: Performs rewind.
- Description: Supports the rewind operation used by the surrounding class.

#### `public MessageBuf clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public byte[] fin()`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public void fin(byte[] buf, int off)`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public void fin(java.nio.ByteBuffer buf)`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
