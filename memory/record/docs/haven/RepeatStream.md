---
source: [RepeatStream.java](../../../../src/haven/RepeatStream.java)
created: 2026-06-13
updated: 2026-06-14
---

# RepeatStream

Reopens a new input stream whenever the current stream reaches EOF.

## Nested Types

### Repeater

- Role: Supplies replacement streams.
- Description: Creates the next `InputStream` instance when the current one runs dry.

## Members

### Constants

### Fields

#### `private final Repeater rep`
- Role: Stores the repeater callback.
- Description: Supplies the next stream whenever the current one ends.

#### `private InputStream cur`
- Role: Stores the current stream.
- Description: Tracks the active input stream being consumed.

### Methods

#### `public InputStream cons()`
- Role: Supplies a stream.
- Description: Returns the next stream instance from the repeater.

#### `public RepeatStream(Repeater rep)`
- Role: Wraps a repeater.
- Description: Creates a stream wrapper that can reopen new sources on EOF.

#### `public int read(byte[] b, int off, int len) throws IOException`
- Role: Reads buffered bytes.
- Description: Continues reading from replacement streams until data becomes available or the repeater stops.

#### `public int read() throws IOException`
- Role: Reads one byte.
- Description: Continues reading from replacement streams until one byte is available or the repeater stops.

#### `public void close() throws IOException`
- Role: Closes the current stream.
- Description: Closes the active stream and clears the wrapper state.