---
source: [ResData.java](../../../../src/haven/ResData.java)
created: 2026-06-13
updated: 2026-06-14
---

# ResData

Represents the res data Haven component.

## Members

### Constants

### Fields

#### `public Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public MessageBuf sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

### Methods

#### `public ResData(Indir<Resource> res, Message sdt)`
- Role: Creates a new ResData instance.
- Description: Constructs the ResData instance from the supplied inputs.

#### `public ResData clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static List<ResData> wrap(List<? extends Indir<Resource>> in)`
- Role: Handles the wrap path.
- Description: Implements the wrap operation.

#### `public static ResData[] wrap(Indir<Resource>[] in)`
- Role: Handles the wrap path.
- Description: Implements the wrap operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this ResData for debugging and logging.