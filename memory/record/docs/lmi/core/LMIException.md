---
source: [LMIException.java](../../../../../src/lmi/core/LMIException.java)
created: 2026-06-13
updated: 2026-06-14
---

# LMIException

Represents an LMI-specific runtime error.

## Members

### Constants

### Fields

#### `public ExceptionReason reason`
- Role: Caches the reason value.
- Description: Caches the `reason` value for reuse.

### Methods

#### `public LMIException(ExceptionReason reason)`
- Role: Creates a new LMIException instance.
- Description: Constructs the LMIException instance from the supplied inputs.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this LMIException for debugging and logging.