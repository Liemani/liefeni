# StreamTee

This file documents the responsibilities and members of `StreamTee`.

## Meta

- Source: [StreamTee.java](../../../src/haven/StreamTee.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Duplicates stream output.

## Members

### Constants

### Fields

#### `private InputStream in`

- Description: TODO

#### `private List<OutputStream> forked = new LinkedList<OutputStream>()`

- Description: TODO

#### `private boolean readeof = false`

- Description: TODO

#### `private boolean ncwe = false; /* NCWE = No Close Without EOF */`

- Description: TODO

### Methods

#### `public StreamTee(InputStream in)`

- Description: TODO

#### `public int available() throws IOException`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO

#### `public void setncwe()`

- Description: TODO

#### `public void flush() throws IOException`

- Description: TODO

#### `public void mark(int limit)`

- Description: TODO

#### `public boolean markSupported()`

- Description: TODO

#### `public int read() throws IOException`

- Description: TODO

#### `public int read(byte[] buf, int off, int len) throws IOException`

- Description: TODO

#### `public void reset() throws IOException`

- Description: TODO

#### `public void attach(OutputStream s)`

- Description: TODO
