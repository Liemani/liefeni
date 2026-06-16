# LockedFile

This file documents the responsibilities and members of `LockedFile`.

## Meta

- Source: [LockedFile.java](../../../src/haven/LockedFile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the locked file Haven component.

## Members

### Constants

### Fields

#### `public FileChannel f`
- Role: Stores the f value.
- Description: Backs the cached state for this file.

#### `public FileLock l`
- Role: Stores the l value.
- Description: Backs the cached state for this file.

### Methods

#### `private LockedFile(FileChannel f, FileLock l)`
- Role: Creates a new LockedFile instance.
- Description: Constructs the instance and initializes its default state.

#### `public void release() throws IOException`
- Role: Handles the release workflow.
- Description: Supports the release operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public static LockedFile lock(Path path, long pos, long len, boolean shared) throws IOException`
- Role: Handles the lock workflow.
- Description: Supports the lock operation used by the surrounding class.

#### `public static LockedFile lock(Path path) throws IOException`
- Role: Handles the lock workflow.
- Description: Supports the lock operation used by the surrounding class.
