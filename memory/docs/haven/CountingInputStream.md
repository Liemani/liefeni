# CountingInputStream

This file documents the responsibilities and members of `CountingInputStream`.

## Meta

- Source: [CountingInputStream.java](../../../src/haven/CountingInputStream.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the counting input stream Haven component.

## Members

### Constants

### Fields

#### `public final InputStream bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public long pos = 0`
- Role: Stores the pos value.
- Description: Backs the cached state for this file.

### Methods

#### `public CountingInputStream(InputStream bk)`
- Role: Creates a new CountingInputStream instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void update(long num)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public long skip(long len) throws IOException`
- Role: Handles the skip workflow.
- Description: Supports the skip operation used by the surrounding class.

#### `public int read(byte[] buf, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.
