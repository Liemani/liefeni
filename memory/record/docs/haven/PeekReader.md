---
source: [PeekReader.java](../../../src/haven/PeekReader.java)
created: 2026-06-13
updated: 2026-06-14
---

# PeekReader

Represents the peek reader Haven component.

## Members

### Constants

### Fields

#### `private final Reader back`
- Role: Holds the back state.
- Description: Backs the cached state for this file.

#### `private boolean p = false`
- Role: Tracks the p flag.
- Description: Supports the p operation used by the surrounding class.

#### `private int la`
- Role: Stores the la value.
- Description: Backs the cached state for this file.

### Methods

#### `public PeekReader(Reader back)`
- Role: Creates a new PeekReader instance.
- Description: Constructs the instance and initializes its default state.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int read(char[] b, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public boolean ready() throws IOException`
- Role: Handles the ready workflow.
- Description: Supports the ready operation used by the surrounding class.

#### `protected boolean whitespace(char c)`
- Role: Performs whitespace.
- Description: Supports the whitespace operation used by the surrounding class.

#### `public int peek(boolean skipws) throws IOException`
- Role: Handles the peek workflow.
- Description: Supports the peek operation used by the surrounding class.

#### `public int peek() throws IOException`
- Role: Handles the peek workflow.
- Description: Supports the peek operation used by the surrounding class.
