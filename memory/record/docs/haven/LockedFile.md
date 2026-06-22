---
source: [LockedFile.java](../../../../src/haven/LockedFile.java)
created: 2026-06-13
updated: 2026-06-14
---

# LockedFile

Represents the locked file Haven component.

## Members

### Constants

### Fields

#### `public FileChannel f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `public FileLock l`
- Role: Caches the l value.
- Description: Caches the `l` value for reuse.

### Methods

#### `private LockedFile(FileChannel f, FileLock l)`
- Role: Creates a new LockedFile instance.
- Description: Constructs the LockedFile instance from the supplied inputs.

#### `public void release() throws IOException`
- Role: Handles the release workflow.
- Description: Implements the release operation.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public static LockedFile lock(Path path, long pos, long len, boolean shared) throws IOException`
- Role: Handles the lock workflow.
- Description: Implements the lock operation.

#### `public static LockedFile lock(Path path) throws IOException`
- Role: Handles the lock workflow.
- Description: Implements the lock operation.