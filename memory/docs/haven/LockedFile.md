# LockedFile

This file documents the responsibilities and members of `LockedFile`.

## Meta

- Source: [LockedFile.java](../../../src/haven/LockedFile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a locked file resource.

## Members

### Constants

### Fields

#### `public FileChannel f`

- Description: TODO

#### `public FileLock l`

- Description: TODO

### Methods

#### `private LockedFile(FileChannel f, FileLock l)`

- Description: TODO

#### `public void release() throws IOException`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO

#### `public static LockedFile lock(Path path, long pos, long len, boolean shared) throws IOException`

- Description: TODO

#### `public static LockedFile lock(Path path) throws IOException`

- Description: TODO
