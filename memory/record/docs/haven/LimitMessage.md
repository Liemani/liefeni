---
source: [LimitMessage.java](../../../../src/haven/LimitMessage.java)
created: 2026-06-13
updated: 2026-06-14
---

# LimitMessage

Represents the limit message Haven component.

## Members

### Constants

### Fields

#### `private final Message bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `private int left`
- Role: Caches the left value.
- Description: Caches the `left` value for reuse.

#### `private final boolean eoferror`
- Role: Tracks the eoferror flag.
- Description: Caches the `eoferror` value for reuse.

### Methods

#### `public LimitMessage(Message bk, int left, boolean eoferror)`
- Role: Creates a new LimitMessage instance.
- Description: Constructs the LimitMessage instance from the supplied inputs.

#### `public LimitMessage(Message bk, int left)`
- Role: Creates a new LimitMessage instance.
- Description: Constructs the LimitMessage instance from the supplied inputs.

#### `public boolean underflow(int hint)`
- Role: Handles the underflow path.
- Description: Implements the underflow operation.

#### `public void overflow(int min)`
- Role: Handles the overflow path.
- Description: Implements the overflow operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this LimitMessage for debugging and logging.