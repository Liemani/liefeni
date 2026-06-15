# PeekReader

This file documents the responsibilities and members of `PeekReader`.

## Meta

- Source: [PeekReader.java](../../../src/haven/PeekReader.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a reader with peek support.

## Members

### Constants

### Fields

#### `private final Reader back`

- Description: TODO

#### `private boolean p = false`

- Description: TODO

#### `private int la`

- Description: TODO

### Methods

#### `public PeekReader(Reader back)`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO

#### `public int read() throws IOException`

- Description: TODO

#### `public int read(char[] b, int off, int len) throws IOException`

- Description: TODO

#### `public boolean ready() throws IOException`

- Description: TODO

#### `protected boolean whitespace(char c)`

- Description: TODO

#### `public int peek(boolean skipws) throws IOException`

- Description: TODO

#### `public int peek() throws IOException`

- Description: TODO
