---
source: [HackSocket.java](../../../../src/haven/HackSocket.java)
created: 2026-06-13
updated: 2026-06-14
---

# HackSocket

Represents the hack socket Haven component.

## Nested Types

### HackInputStream

- Role: Wraps the socket input stream with interrupt handling.
- Description: InputStream adapter that cooperates with thread interruption.

### HackOutputStream

- Role: Wraps the socket output stream with interrupt handling.
- Description: OutputStream adapter that cooperates with thread interruption.

### InterruptAction

- Role: Records the current thread interrupt state.
- Description: Per-thread runnable used to restore or clear interruption during socket operations.

## Members

### Constants

### Fields

#### `private InputStream in = null`
- Role: Caches the in value.
- Description: Caches the `in` value for reuse.

#### `private OutputStream out = null`
- Role: Caches the out value.
- Description: Caches the `out` value for reuse.

#### `private ThreadLocal<InterruptAction> ia = new ThreadLocal<InterruptAction>()`
- Role: Implements the ia operation.
- Description: Implements the private thread local<interrupt action> ia = new thread local<interrupt action>() operation.

#### `private boolean interrupted`
- Role: Tracks the interrupted flag.
- Description: Caches the `interrupted` value for reuse.

#### `private InputStream bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `private OutputStream bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

### Methods

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private void hook()`
- Role: Handles the hook path.
- Description: Implements the hook operation.

#### `private void release() throws ClosedByInterruptException`
- Role: Handles the release workflow.
- Description: Implements the release operation.

#### `public void connect(SocketAddress address, int timeout) throws IOException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.

#### `public void connect(SocketAddress address) throws IOException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.

#### `private HackInputStream(InputStream bk)`
- Role: Handles the hack input stream path.
- Description: Implements the hack input stream operation.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public int read(byte[] buf) throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public int read(byte[] buf, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `private HackOutputStream(OutputStream bk)`
- Role: Handles the hack output stream path.
- Description: Implements the hack output stream operation.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public void flush() throws IOException`
- Role: Handles the flush workflow.
- Description: Implements the flush operation.

#### `public void write(int b) throws IOException`
- Role: Writes the target data.
- Description: Implements the write operation.

#### `public void write(byte[] buf) throws IOException`
- Role: Writes the target data.
- Description: Implements the write operation.

#### `public void write(byte[] buf, int off, int len) throws IOException`
- Role: Writes the target data.
- Description: Implements the write operation.

#### `public InputStream getInputStream() throws IOException`
- Role: Returns the input stream.
- Description: Returns the input stream.

#### `public OutputStream getOutputStream() throws IOException`
- Role: Returns the output stream.
- Description: Returns the output stream.