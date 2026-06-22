---
source: [FillBuffer.java](../../../../../src/haven/render/FillBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# FillBuffer

Defines the fill buffer render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public int size()`
- Role: Reports the writable range size.
- Description: Returns how many elements the fill buffer can cover.

#### `public boolean compatible(Environment env)`
- Role: Checks environment compatibility.
- Description: Tests whether the fill buffer can run on the provided environment.

#### `public ByteBuffer push()`
- Role: Opens the writable byte buffer.
- Description: Returns the native buffer view used for staging data uploads.

#### `public void pull(ByteBuffer buf)`
- Role: Commits staged bytes.
- Description: Copies the staged bytes back into the buffer owner.