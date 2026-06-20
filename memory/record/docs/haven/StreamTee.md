---
source: [StreamTee.java](../../../src/haven/StreamTee.java)
created: 2026-06-13
updated: 2026-06-14
---

# StreamTee

Represents the stream tee Haven component.

## Members

### Constants

### Fields

#### `private InputStream in`
- Role: Holds the in state.
- Description: Backs the cached state for this file.

#### `private List<OutputStream> forked = new LinkedList<OutputStream>()`
- Role: Caches forked entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean readeof = false`
- Role: Tracks the readeof flag.
- Description: Supports the readeof operation used by the surrounding class.

#### `private boolean ncwe = false; /* NCWE = No Close Without EOF */`
- Role: Tracks the ncwe flag.
- Description: Supports the ncwe operation used by the surrounding class.

### Methods

#### `public StreamTee(InputStream in)`
- Role: Creates a new StreamTee instance.
- Description: Constructs the instance and initializes its default state.

#### `public int available() throws IOException`
- Role: Handles the available workflow.
- Description: Supports the available operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public void setncwe()`
- Role: Performs setncwe.
- Description: Supports the setncwe operation used by the surrounding class.

#### `public void flush() throws IOException`
- Role: Handles the flush workflow.
- Description: Supports the flush operation used by the surrounding class.

#### `public void mark(int limit)`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `public boolean markSupported()`
- Role: Performs mark supported.
- Description: Supports the mark supported operation used by the surrounding class.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int read(byte[] buf, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public void reset() throws IOException`
- Role: Handles the reset workflow.
- Description: Supports the reset operation used by the surrounding class.

#### `public void attach(OutputStream s)`
- Role: Performs attach.
- Description: Supports the attach operation used by the surrounding class.
