---
source: [CountingInputStream.java](../../../../src/haven/CountingInputStream.java)
created: 2026-06-13
updated: 2026-06-14
---

# CountingInputStream

Represents the counting input stream Haven component.

## Members

### Constants

### Fields

#### `public final InputStream bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public long pos = 0`
- Role: Caches the pos value.
- Description: Caches the `pos` value for reuse.

### Methods

#### `public CountingInputStream(InputStream bk)`
- Role: Creates a new CountingInputStream instance.
- Description: Constructs the CountingInputStream instance from the supplied inputs.

#### `protected void update(long num)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public long skip(long len) throws IOException`
- Role: Handles the skip workflow.
- Description: Implements the skip operation.

#### `public int read(byte[] buf, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.