---
source: [PMessage.java](../../../../src/haven/PMessage.java)
created: 2026-06-13
updated: 2026-06-14
---

# PMessage

Represents the pmessage Haven component.

## Members

### Constants

### Fields

#### `public int type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

### Methods

#### `public PMessage(int type, byte[] blob, int off, int len)`
- Role: Creates a new PMessage instance.
- Description: Constructs the PMessage instance from the supplied inputs.

#### `public PMessage(int type, byte[] blob)`
- Role: Creates a new PMessage instance.
- Description: Constructs the PMessage instance from the supplied inputs.

#### `public PMessage(int type)`
- Role: Creates a new PMessage instance.
- Description: Constructs the PMessage instance from the supplied inputs.

#### `public PMessage(int type, Message msg, int len)`
- Role: Creates a new PMessage instance.
- Description: Constructs the PMessage instance from the supplied inputs.

#### `public PMessage(int type, Message msg)`
- Role: Creates a new PMessage instance.
- Description: Constructs the PMessage instance from the supplied inputs.

#### `public PMessage(PMessage msg)`
- Role: Creates a new PMessage instance.
- Description: Constructs the PMessage instance from the supplied inputs.

#### `public PMessage clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.