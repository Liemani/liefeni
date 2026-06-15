# RetryingInputStream

This file documents the responsibilities and members of `RetryingInputStream`.

## Meta

- Source: [RetryingInputStream.java](../../../src/haven/RetryingInputStream.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Retries input stream reads.

## Members

### Constants

#### `private static final double[] sleep =`

- Description: TODO

### Fields

#### `private InputStream cur`

- Description: TODO

#### `private boolean eof, fatal`

- Description: TODO

#### `private boolean eof, fatal`

- Description: TODO

#### `private long pos`

- Description: TODO

#### `private int retries`

- Description: TODO

#### `private IOException lasterr`

- Description: TODO

#### `private Collection<Throwable> suppressed = new ArrayList<>()`

- Description: TODO

### Methods

#### `protected InputStream create() throws IOException`

- Description: TODO

#### `protected InputStream create(long pos) throws IOException`

- Description: TODO

#### `protected void retry(int retries, IOException lasterr) throws IOException`

- Description: TODO

#### `private InputStream get() throws IOException`

- Description: TODO

#### `private void failed(IOException err) throws IOException`

- Description: TODO

#### `public void check() throws IOException`

- Description: TODO

#### `public long skip(long len) throws IOException`

- Description: TODO

#### `public int read(byte[] buf, int off, int len) throws IOException`

- Description: TODO

#### `public int read() throws IOException`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO
