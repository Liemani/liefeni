---
source: [ResData.java](../../../src/haven/ResData.java)
created: 2026-06-13
updated: 2026-06-14
---

# ResData

Represents the res data Haven component.

## Members

### Constants

### Fields

#### `public Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public MessageBuf sdt`
- Role: Holds the sdt state.
- Description: Backs the cached state for this file.

### Methods

#### `public ResData(Indir<Resource> res, Message sdt)`
- Role: Creates a new ResData instance.
- Description: Constructs the instance and initializes its default state.

#### `public ResData clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static List<ResData> wrap(List<? extends Indir<Resource>> in)`
- Role: Performs wrap.
- Description: Supports the wrap operation used by the surrounding class.

#### `public static ResData[] wrap(Indir<Resource>[] in)`
- Role: Performs wrap.
- Description: Supports the wrap operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
