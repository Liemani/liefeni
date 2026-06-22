---
source: [SslChannel.java](../../../../src/haven/SslChannel.java)
created: 2026-06-13
updated: 2026-06-14
---

# SslChannel

Represents the ssl channel Haven component.

## Members

### Constants

#### `private static final ByteBuffer empty = ByteBuffer.allocate(0)`
- Role: Implements the empty operation.
- Description: Implements the allocate operation.
- Value: `ByteBuffer.allocate(0)`

### Fields

#### `public final ByteChannel bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public final SSLEngine ssl`
- Role: Caches the ssl value.
- Description: Caches the `ssl` value for reuse.

#### `private ByteBuffer inbuf = null, outbuf = null`
- Role: Caches the inbuf value.
- Description: Caches the `inbuf` value for reuse.

#### `private ByteBuffer inbuf = null, outbuf = null`
- Role: Caches the inbuf value.
- Description: Caches the `inbuf` value for reuse.

#### `private ByteBuffer readbuf = ByteBuffer.allocate(512)`
- Role: Implements the readbuf operation.
- Description: Implements the allocate operation.

#### `private boolean haveshook = false`
- Role: Tracks the haveshook flag.
- Description: Caches the `haveshook` value for reuse.

### Methods

#### `private static SSLContext defctx()`
- Role: Handles the defctx path.
- Description: Implements the defctx operation.

#### `private void initssl()`
- Role: Handles the initssl path.
- Description: Implements the initssl operation.

#### `public SslChannel(ByteChannel bk, SSLEngine ssl)`
- Role: Creates a new SslChannel instance.
- Description: Constructs the SslChannel instance from the supplied inputs.

#### `public SslChannel(ByteChannel bk, SSLContext ctx)`
- Role: Creates a new SslChannel instance.
- Description: Constructs the SslChannel instance from the supplied inputs.

#### `public SslChannel(ByteChannel bk, SSLContext ctx, String host, int port)`
- Role: Creates a new SslChannel instance.
- Description: Constructs the SslChannel instance from the supplied inputs.

#### `public SslChannel(ByteChannel bk)`
- Role: Creates a new SslChannel instance.
- Description: Constructs the SslChannel instance from the supplied inputs.

#### `private void tasks()`
- Role: Handles the tasks path.
- Description: Implements the tasks operation.

#### `private void checkshake() throws IOException`
- Role: Handles the checkshake workflow.
- Description: Implements the checkshake operation.

#### `private SSLEngineResult fill() throws IOException`
- Role: Handles the fill workflow.
- Description: Implements the fill operation.

#### `public void handshake() throws IOException`
- Role: Handles the handshake workflow.
- Description: Implements the handshake operation.

#### `public int read(ByteBuffer dst) throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public int write(ByteBuffer src, boolean ac) throws IOException`
- Role: Writes the target data.
- Description: Implements the write operation.

#### `public int write(ByteBuffer src) throws IOException`
- Role: Writes the target data.
- Description: Implements the write operation.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public boolean isOpen()`
- Role: Checks whether the open.
- Description: Returns whether the condition is satisfied.

#### `public SSLSession session()`
- Role: Handles the session path.
- Description: Implements the session operation.

#### `public void checkname(String host) throws IOException`
- Role: Handles the checkname workflow.
- Description: Implements the checkname operation.