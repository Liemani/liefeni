---
source: [PeekReader.java](../../../../src/haven/PeekReader.java)
created: 2026-06-13
updated: 2026-06-14
---

# PeekReader

Represents the peek reader Haven component.

## Members

### Constants

### Fields

#### `private final Reader back`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `private boolean p = false`
- Role: Tracks the p flag.
- Description: Caches the `p` value for reuse.

#### `private int la`
- Role: Caches the la value.
- Description: Caches the `la` value for reuse.

### Methods

#### `public PeekReader(Reader back)`
- Role: Creates a new PeekReader instance.
- Description: Constructs the PeekReader instance from the supplied inputs.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public int read(char[] b, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public boolean ready() throws IOException`
- Role: Handles the ready workflow.
- Description: Implements the ready operation.

#### `protected boolean whitespace(char c)`
- Role: Handles the whitespace path.
- Description: Implements the whitespace operation.

#### `public int peek(boolean skipws) throws IOException`
- Role: Handles the peek workflow.
- Description: Returns the highest-priority element without removing it.

#### `public int peek() throws IOException`
- Role: Handles the peek workflow.
- Description: Returns the highest-priority element without removing it.