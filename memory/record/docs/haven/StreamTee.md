---
source: [StreamTee.java](../../../../src/haven/StreamTee.java)
created: 2026-06-13
updated: 2026-06-14
---

# StreamTee

Copies bytes from one input stream into any number of attached output streams.

## Members

### Constants

### Fields

#### `private InputStream in`
- Role: Stores the source stream.
- Description: Supplies the bytes that are duplicated to the attached outputs.

#### `private List<OutputStream> forked = new LinkedList<OutputStream>()`
- Role: Stores attached sinks.
- Description: Holds the output streams that receive a copy of each byte read from the source.

#### `private boolean readeof = false`
- Role: Tracks EOF state.
- Description: Marks that the source stream has already returned end-of-file.

#### `private boolean ncwe = false; /* NCWE = No Close Without EOF */`
- Role: Tracks close semantics.
- Description: Delays closing forked outputs until EOF has been observed when enabled.

### Methods

#### `public StreamTee(InputStream in)`
- Role: Wraps a source stream.
- Description: Creates a tee around the supplied input stream.

#### `public int available() throws IOException`
- Role: Reports available bytes.
- Description: Delegates the availability check to the source stream.

#### `public void close() throws IOException`
- Role: Closes the tee.
- Description: Closes the source stream and, depending on EOF state, the attached outputs.

#### `public void setncwe()`
- Role: Enables deferred fork closing.
- Description: Prevents attached outputs from closing until EOF is reached.

#### `public void flush() throws IOException`
- Role: Flushes attached outputs.
- Description: Forwards flush to every attached output stream.

#### `public void mark(int limit)`
- Role: Forwards mark requests.
- Description: Delegates mark handling to the wrapped source stream.

#### `public boolean markSupported()`
- Role: Reports mark/reset support.
- Description: Delegates the capability check to the wrapped source stream.

#### `public int read() throws IOException`
- Role: Reads and tees one byte.
- Description: Copies the source byte into every attached output stream.

#### `public int read(byte[] buf, int off, int len) throws IOException`
- Role: Reads and tees a buffer slice.
- Description: Copies the source bytes into every attached output stream.

#### `public void reset() throws IOException`
- Role: Rejects reset.
- Description: Throws because the tee cannot rewind once bytes have been forwarded.

#### `public void attach(OutputStream s)`
- Role: Attaches a forked output.
- Description: Registers another output stream to receive duplicated bytes.
