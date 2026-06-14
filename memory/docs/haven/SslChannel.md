# SslChannel

## Meta

- Source: [SslChannel.java](../../../src/haven/SslChannel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Handles SSL channel communication.

## Code Members

### Member Index

#### Fields

- [bk](#member-1)
- [ssl](#member-2)
- [inbuf](#member-3)
- [outbuf](#member-4)
- [readbuf](#member-5)
- [haveshook](#member-6)
- [empty](#member-10)

#### Methods

- [defctx()](#member-7)
- [initssl()](#member-8)
- [tasks()](#member-9)
- [private void checkshake() throws IOException](#member-11)
- [private SSLEngineResult fill() throws IOException](#member-12)
- [public void handshake() throws IOException](#member-13)
- [public int read(ByteBuffer dst) throws IOException](#member-14)
- [public int write(ByteBuffer src, boolean ac) throws IOException](#member-15)
- [public int write(ByteBuffer src) throws IOException](#member-16)
- [public void close() throws IOException](#member-17)
- [isOpen()](#member-18)
- [session()](#member-19)
- [public void checkname(String host) throws IOException](#member-20)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `bk`

- Description: TODO

<a id="member-2"></a>
##### `ssl`

- Description: TODO

<a id="member-3"></a>
##### `inbuf`

- Description: TODO

<a id="member-4"></a>
##### `outbuf`

- Description: TODO

<a id="member-5"></a>
##### `readbuf`

- Description: TODO

<a id="member-6"></a>
##### `haveshook`

- Description: TODO

<a id="member-10"></a>
##### `empty`

- Description: TODO

#### Methods

<a id="member-7"></a>
##### `defctx()`

- Description: TODO

<a id="member-8"></a>
##### `initssl()`

- Description: TODO

<a id="member-9"></a>
##### `tasks()`

- Description: TODO

<a id="member-11"></a>
##### `private void checkshake() throws IOException`

- Description: TODO

<a id="member-12"></a>
##### `private SSLEngineResult fill() throws IOException`

- Description: TODO

<a id="member-13"></a>
##### `public void handshake() throws IOException`

- Description: TODO

<a id="member-14"></a>
##### `public int read(ByteBuffer dst) throws IOException`

- Description: TODO

<a id="member-15"></a>
##### `public int write(ByteBuffer src, boolean ac) throws IOException`

- Description: TODO

<a id="member-16"></a>
##### `public int write(ByteBuffer src) throws IOException`

- Description: TODO

<a id="member-17"></a>
##### `public void close() throws IOException`

- Description: TODO

<a id="member-18"></a>
##### `isOpen()`

- Description: TODO

<a id="member-19"></a>
##### `session()`

- Description: TODO

<a id="member-20"></a>
##### `public void checkname(String host) throws IOException`

- Description: TODO
