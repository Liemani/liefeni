# HackSocket

This file documents the responsibilities and members of `HackSocket`.

## Meta

- Source: [HackSocket.java](../../../src/haven/HackSocket.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a socket wrapper for client hacks or tweaks.

## Nested Types

### HackInputStream

- Description: TODO

### HackOutputStream

- Description: TODO

### InterruptAction

- Description: TODO

## Members

### Constants

### Fields

#### `private InputStream in = null`

- Description: TODO

#### `private OutputStream out = null`

- Description: TODO

#### `private ThreadLocal<InterruptAction> ia = new ThreadLocal<InterruptAction>()`

- Description: TODO

#### `private boolean interrupted`

- Description: TODO

#### `private InputStream bk`

- Description: TODO

#### `private OutputStream bk`

- Description: TODO

### Methods

#### `public void run()`

- Description: TODO

#### `private void hook()`

- Description: TODO

#### `private void release() throws ClosedByInterruptException`

- Description: TODO

#### `public void connect(SocketAddress address, int timeout) throws IOException`

- Description: TODO

#### `public void connect(SocketAddress address) throws IOException`

- Description: TODO

#### `private HackInputStream(InputStream bk)`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO

#### `public int read() throws IOException`

- Description: TODO

#### `public int read(byte[] buf) throws IOException`

- Description: TODO

#### `public int read(byte[] buf, int off, int len) throws IOException`

- Description: TODO

#### `private HackOutputStream(OutputStream bk)`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO

#### `public void flush() throws IOException`

- Description: TODO

#### `public void write(int b) throws IOException`

- Description: TODO

#### `public void write(byte[] buf) throws IOException`

- Description: TODO

#### `public void write(byte[] buf, int off, int len) throws IOException`

- Description: TODO

#### `public InputStream getInputStream() throws IOException`

- Description: TODO

#### `public OutputStream getOutputStream() throws IOException`

- Description: TODO
