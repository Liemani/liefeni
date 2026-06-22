---
source: [RetryingInputStream.java](../../../../src/haven/RetryingInputStream.java)
created: 2026-06-13
updated: 2026-06-14
---

# RetryingInputStream

Represents the retrying input stream Haven component.

## Members

### Constants

#### `private static final double[] sleep =`
- Role: Caches the sleep value.
- Description: Caches the `sleep` value for reuse.
- Value: ``

### Fields

#### `private InputStream cur`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `private boolean eof, fatal`
- Role: Tracks the fatal flag.
- Description: Caches the `fatal` value for reuse.

#### `private boolean eof, fatal`
- Role: Tracks the fatal flag.
- Description: Caches the `fatal` value for reuse.

#### `private long pos`
- Role: Caches the pos value.
- Description: Caches the `pos` value for reuse.

#### `private int retries`
- Role: Caches the retries value.
- Description: Caches the `retries` value for reuse.

#### `private IOException lasterr`
- Role: Caches the last err.
- Description: Caches the last err value.

#### `private Collection<Throwable> suppressed = new ArrayList<>()`
- Role: Implements the suppressed operation.
- Description: Implements the private collection<throwable> suppressed = new array list<>() operation.

### Methods

#### `protected InputStream create() throws IOException`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected InputStream create(long pos) throws IOException`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void retry(int retries, IOException lasterr) throws IOException`
- Role: Handles the retry workflow.
- Description: Implements the retry operation.

#### `private InputStream get() throws IOException`
- Role: Returns the cached get.
- Description: Returns the cached get.

#### `private void failed(IOException err) throws IOException`
- Role: Handles the failed workflow.
- Description: Implements the failed operation.

#### `public void check() throws IOException`
- Role: Handles the check workflow.
- Description: Implements the check operation.

#### `public long skip(long len) throws IOException`
- Role: Handles the skip workflow.
- Description: Implements the skip operation.

#### `public int read(byte[] buf, int off, int len) throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public int read() throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.