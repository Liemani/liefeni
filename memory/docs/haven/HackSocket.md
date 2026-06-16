# HackSocket

This file documents the responsibilities and members of `HackSocket`.

## Meta

- Source: [HackSocket.java](../../../src/haven/HackSocket.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the hack socket Haven component.

## Nested Types

### HackInputStream

- Role: Represents hack input stream within HackSocket.
- Description: Describes the nested hack input stream type used by the enclosing class.

### HackOutputStream

- Role: Represents hack output stream within HackSocket.
- Description: Describes the nested hack output stream type used by the enclosing class.

### InterruptAction

- Role: Represents interrupt action within HackSocket.
- Description: Describes the nested interrupt action type used by the enclosing class.

## Members

### Constants

### Fields

#### `private InputStream in = null`
- Role: Holds the in state.
- Description: Backs the cached state for this file.

#### `private OutputStream out = null`
- Role: Holds the out state.
- Description: Backs the cached state for this file.

#### `private ThreadLocal<InterruptAction> ia = new ThreadLocal<InterruptAction>()`
- Role: Stores the ia value.
- Description: Backs the cached state for this file.

#### `private boolean interrupted`
- Role: Tracks the interrupted flag.
- Description: Supports the interrupted operation used by the surrounding class.

#### `private InputStream bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `private OutputStream bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

### Methods

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void hook()`
- Role: Performs hook.
- Description: Supports the hook operation used by the surrounding class.

#### `private void release() throws ClosedByInterruptException`
- Role: Handles the release workflow.
- Description: Supports the release operation used by the surrounding class.

#### `public void connect(SocketAddress address, int timeout) throws IOException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.

#### `public void connect(SocketAddress address) throws IOException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.

#### `private HackInputStream(InputStream bk)`
- Role: Performs hack input stream.
- Description: Supports the hack input stream operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int read(byte[] buf) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int read(byte[] buf, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `private HackOutputStream(OutputStream bk)`
- Role: Performs hack output stream.
- Description: Supports the hack output stream operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public void flush() throws IOException`
- Role: Handles the flush workflow.
- Description: Supports the flush operation used by the surrounding class.

#### `public void write(int b) throws IOException`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public void write(byte[] buf) throws IOException`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public void write(byte[] buf, int off, int len) throws IOException`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public InputStream getInputStream() throws IOException`
- Role: Returns the input stream value.
- Description: Exposes the requested value without mutating state.

#### `public OutputStream getOutputStream() throws IOException`
- Role: Returns the output stream value.
- Description: Exposes the requested value without mutating state.
