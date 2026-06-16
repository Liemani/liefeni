# RepeatStream

This file documents the responsibilities and members of `RepeatStream`.

## Meta

- Source: [RepeatStream.java](../../../src/haven/RepeatStream.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the repeat stream Haven component.

## Nested Types

### Repeater

- Role: Represents repeater within RepeatStream.
- Description: Describes the nested repeater type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final Repeater rep`
- Role: Holds the rep state.
- Description: Backs the cached state for this file.

#### `private InputStream cur`
- Role: Holds the cur state.
- Description: Backs the cached state for this file.

### Methods

#### `public InputStream cons()`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public RepeatStream(Repeater rep)`
- Role: Creates a new RepeatStream instance.
- Description: Constructs the instance and initializes its default state.

#### `public int read(byte[] b, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.
