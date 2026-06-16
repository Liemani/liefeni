# SslChannel

This file documents the responsibilities and members of `SslChannel`.

## Meta

- Source: [SslChannel.java](../../../src/haven/SslChannel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the ssl channel Haven component.

## Members

### Constants

#### `private static final ByteBuffer empty = ByteBuffer.allocate(0)`
- Role: Defines the shared empty constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final ByteChannel bk`
- Role: Stores the bk value.
- Description: Backs the cached state for this file.

#### `public final SSLEngine ssl`
- Role: Holds the ssl state.
- Description: Backs the cached state for this file.

#### `private ByteBuffer inbuf = null, outbuf = null`
- Role: Stores the inbuf value.
- Description: Backs the cached state for this file.

#### `private ByteBuffer inbuf = null, outbuf = null`
- Role: Stores the inbuf value.
- Description: Backs the cached state for this file.

#### `private ByteBuffer readbuf = ByteBuffer.allocate(512)`
- Role: Stores the readbuf value.
- Description: Backs the cached state for this file.

#### `private boolean haveshook = false`
- Role: Tracks the haveshook flag.
- Description: Supports the haveshook operation used by the surrounding class.

### Methods

#### `private static SSLContext defctx()`
- Role: Performs defctx.
- Description: Supports the defctx operation used by the surrounding class.

#### `private void initssl()`
- Role: Performs initssl.
- Description: Supports the initssl operation used by the surrounding class.

#### `public SslChannel(ByteChannel bk, SSLEngine ssl)`
- Role: Creates a new SslChannel instance.
- Description: Constructs the instance and initializes its default state.

#### `public SslChannel(ByteChannel bk, SSLContext ctx)`
- Role: Creates a new SslChannel instance.
- Description: Constructs the instance and initializes its default state.

#### `public SslChannel(ByteChannel bk, SSLContext ctx, String host, int port)`
- Role: Creates a new SslChannel instance.
- Description: Constructs the instance and initializes its default state.

#### `public SslChannel(ByteChannel bk)`
- Role: Creates a new SslChannel instance.
- Description: Constructs the instance and initializes its default state.

#### `private void tasks()`
- Role: Performs tasks.
- Description: Supports the tasks operation used by the surrounding class.

#### `private void checkshake() throws IOException`
- Role: Handles the checkshake workflow.
- Description: Supports the checkshake operation used by the surrounding class.

#### `private SSLEngineResult fill() throws IOException`
- Role: Handles the fill workflow.
- Description: Supports the fill operation used by the surrounding class.

#### `public void handshake() throws IOException`
- Role: Handles the handshake workflow.
- Description: Supports the handshake operation used by the surrounding class.

#### `public int read(ByteBuffer dst) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int write(ByteBuffer src, boolean ac) throws IOException`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public int write(ByteBuffer src) throws IOException`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public boolean isOpen()`
- Role: Checks whether the open.
- Description: Returns a boolean result for the described condition.

#### `public SSLSession session()`
- Role: Performs session.
- Description: Supports the session operation used by the surrounding class.

#### `public void checkname(String host) throws IOException`
- Role: Handles the checkname workflow.
- Description: Supports the checkname operation used by the surrounding class.
