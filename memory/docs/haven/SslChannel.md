# SslChannel

This file documents the responsibilities and members of `SslChannel`.

## Meta

- Source: [SslChannel.java](../../../src/haven/SslChannel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles SSL channel communication.

## Members

### Constants

#### `private static final ByteBuffer empty = ByteBuffer.allocate(0)`

- Description: TODO

### Fields

#### `public final ByteChannel bk`

- Description: TODO

#### `public final SSLEngine ssl`

- Description: TODO

#### `private ByteBuffer inbuf = null, outbuf = null`

- Description: TODO

#### `private ByteBuffer inbuf = null, outbuf = null`

- Description: TODO

#### `private ByteBuffer readbuf = ByteBuffer.allocate(512)`

- Description: TODO

#### `private boolean haveshook = false`

- Description: TODO

### Methods

#### `private static SSLContext defctx()`

- Description: TODO

#### `private void initssl()`

- Description: TODO

#### `public SslChannel(ByteChannel bk, SSLEngine ssl)`

- Description: TODO

#### `public SslChannel(ByteChannel bk, SSLContext ctx)`

- Description: TODO

#### `public SslChannel(ByteChannel bk, SSLContext ctx, String host, int port)`

- Description: TODO

#### `public SslChannel(ByteChannel bk)`

- Description: TODO

#### `private void tasks()`

- Description: TODO

#### `private void checkshake() throws IOException`

- Description: TODO

#### `private SSLEngineResult fill() throws IOException`

- Description: TODO

#### `public void handshake() throws IOException`

- Description: TODO

#### `public int read(ByteBuffer dst) throws IOException`

- Description: TODO

#### `public int write(ByteBuffer src, boolean ac) throws IOException`

- Description: TODO

#### `public int write(ByteBuffer src) throws IOException`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO

#### `public boolean isOpen()`

- Description: TODO

#### `public SSLSession session()`

- Description: TODO

#### `public void checkname(String host) throws IOException`

- Description: TODO
