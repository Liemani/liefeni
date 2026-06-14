# RetryingInputStream

## Meta

- Source: [RetryingInputStream.java](../../../src/haven/RetryingInputStream.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Retries input stream reads.

## Code Members

### Member Index

#### Fields

- [cur](#member-1)
- [eof](#member-2)
- [fatal](#member-3)
- [pos](#member-4)
- [retries](#member-5)
- [lasterr](#member-6)
- [suppressed](#member-7)
- [sleep](#member-10)

#### Methods

- [protected InputStream create() throws IOException](#member-8)
- [protected InputStream create(long pos) throws IOException](#member-9)
- [protected void retry(int retries, IOException lasterr) throws IOException](#member-11)
- [private InputStream get() throws IOException](#member-12)
- [private void failed(IOException err) throws IOException](#member-13)
- [public void check() throws IOException](#member-14)
- [public long skip(long len) throws IOException](#member-15)
- [public int read(byte[] buf, int off, int len) throws IOException](#member-16)
- [public int read() throws IOException](#member-17)
- [public void close() throws IOException](#member-18)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `cur`

- Description: TODO

<a id="member-2"></a>
##### `eof`

- Description: TODO

<a id="member-3"></a>
##### `fatal`

- Description: TODO

<a id="member-4"></a>
##### `pos`

- Description: TODO

<a id="member-5"></a>
##### `retries`

- Description: TODO

<a id="member-6"></a>
##### `lasterr`

- Description: TODO

<a id="member-7"></a>
##### `suppressed`

- Description: TODO

<a id="member-10"></a>
##### `sleep`

- Description: TODO

#### Methods

<a id="member-8"></a>
##### `protected InputStream create() throws IOException`

- Description: TODO

<a id="member-9"></a>
##### `protected InputStream create(long pos) throws IOException`

- Description: TODO

<a id="member-11"></a>
##### `protected void retry(int retries, IOException lasterr) throws IOException`

- Description: TODO

<a id="member-12"></a>
##### `private InputStream get() throws IOException`

- Description: TODO

<a id="member-13"></a>
##### `private void failed(IOException err) throws IOException`

- Description: TODO

<a id="member-14"></a>
##### `public void check() throws IOException`

- Description: TODO

<a id="member-15"></a>
##### `public long skip(long len) throws IOException`

- Description: TODO

<a id="member-16"></a>
##### `public int read(byte[] buf, int off, int len) throws IOException`

- Description: TODO

<a id="member-17"></a>
##### `public int read() throws IOException`

- Description: TODO

<a id="member-18"></a>
##### `public void close() throws IOException`

- Description: TODO
