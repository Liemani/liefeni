# CountingInputStream

This file documents the responsibilities and members of `CountingInputStream`.

## Meta

- Source: [CountingInputStream.java](../../../src/haven/CountingInputStream.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Counts bytes while reading an input stream.

## Members

### Constants

### Fields

#### `public final InputStream bk`

- Description: TODO

#### `public long pos = 0`

- Description: TODO

### Methods

#### `public CountingInputStream(InputStream bk)`

- Description: TODO

#### `protected void update(long num)`

- Description: TODO

#### `public long skip(long len) throws IOException`

- Description: TODO

#### `public int read(byte[] buf, int off, int len) throws IOException`

- Description: TODO

#### `public int read() throws IOException`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO
