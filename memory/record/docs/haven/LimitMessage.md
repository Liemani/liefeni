---
source: [LimitMessage.java](../../../src/haven/LimitMessage.java)
created: 2026-06-13
updated: 2026-06-14
---

# LimitMessage

Represents the limit message Haven component.

## Members

### Constants

### Fields

#### `private final Message bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `private int left`
- Role: Stores the left value.
- Description: Backs the cached state for this file.

#### `private final boolean eoferror`
- Role: Tracks the eoferror flag.
- Description: Supports the eoferror operation used by the surrounding class.

### Methods

#### `public LimitMessage(Message bk, int left, boolean eoferror)`
- Role: Creates a new LimitMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public LimitMessage(Message bk, int left)`
- Role: Creates a new LimitMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean underflow(int hint)`
- Role: Performs underflow.
- Description: Supports the underflow operation used by the surrounding class.

#### `public void overflow(int min)`
- Role: Performs overflow.
- Description: Supports the overflow operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
