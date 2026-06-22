---
source: [Defrag.java](../../../../src/haven/Defrag.java)
created: 2026-06-13
updated: 2026-06-14
---

# Defrag

Represents the defrag Haven component.

## Members

### Constants

### Fields

#### `byte[] blob`
- Role: Caches the blob value.
- Description: Caches the `blob` value for reuse.

#### `int len`
- Role: Caches the len value.
- Description: Caches the `len` value for reuse.

#### `long last = 0`
- Role: Caches the last .
- Description: Caches the last  value.

#### `final int[] ms1 = new int[20], ms2 = new int[20]`
- Role: Caches the ms1 value.
- Description: Caches the `ms1` value for reuse.

#### `final int[] ms1 = new int[20], ms2 = new int[20]`
- Role: Caches the ms1 value.
- Description: Caches the `ms1` value for reuse.

### Methods

#### `public Defrag(int len)`
- Role: Creates a new Defrag instance.
- Description: Constructs the Defrag instance from the supplied inputs.

#### `private void addm(int m1, int m2)`
- Role: Handles the addm path.
- Description: Adds the m.

#### `public void add(byte[] blob, int boff, int blen, int off)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void add(byte[] blob, int off)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public boolean done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public Message msg()`
- Role: Displays an in-game message.
- Description: Implements the msg operation.