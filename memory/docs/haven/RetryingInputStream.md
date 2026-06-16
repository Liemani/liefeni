# RetryingInputStream

This file documents the responsibilities and members of `RetryingInputStream`.

## Meta

- Source: [RetryingInputStream.java](../../../src/haven/RetryingInputStream.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the retrying input stream Haven component.

## Members

### Constants

#### `private static final double[] sleep =`
- Role: Defines the shared retrying input stream constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private InputStream cur`
- Role: Holds the cur state.
- Description: Backs the cached state for this file.

#### `private boolean eof, fatal`
- Role: Tracks the fatal flag.
- Description: Supports the fatal operation used by the surrounding class.

#### `private boolean eof, fatal`
- Role: Tracks the fatal flag.
- Description: Supports the fatal operation used by the surrounding class.

#### `private long pos`
- Role: Stores the pos value.
- Description: Backs the cached state for this file.

#### `private int retries`
- Role: Stores the retries value.
- Description: Backs the cached state for this file.

#### `private IOException lasterr`
- Role: Holds the lasterr state.
- Description: Backs the cached state for this file.

#### `private Collection<Throwable> suppressed = new ArrayList<>()`
- Role: Caches suppressed entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `protected InputStream create() throws IOException`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected InputStream create(long pos) throws IOException`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void retry(int retries, IOException lasterr) throws IOException`
- Role: Handles the retry workflow.
- Description: Supports the retry operation used by the surrounding class.

#### `private InputStream get() throws IOException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `private void failed(IOException err) throws IOException`
- Role: Handles the failed workflow.
- Description: Supports the failed operation used by the surrounding class.

#### `public void check() throws IOException`
- Role: Handles the check workflow.
- Description: Supports the check operation used by the surrounding class.

#### `public long skip(long len) throws IOException`
- Role: Handles the skip workflow.
- Description: Supports the skip operation used by the surrounding class.

#### `public int read(byte[] buf, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.
