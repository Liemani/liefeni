---
source: [FileCache.java](../../../../src/haven/FileCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# FileCache

Stores resources as files under a chosen cache directory.

## Members

### Constants

### Fields

#### `private final Path base`
- Role: Stores the cache root.
- Description: Points to the filesystem base used for cached files.

### Methods

#### `public FileCache(Path base)`
- Role: Opens a file cache.
- Description: Binds the cache to the supplied filesystem root.

#### `public static FileCache foruser()`
- Role: Finds the user cache directory.
- Description: Locates or creates the writable cache root under the user home directory.

#### `private Path forres(String nm)`
- Role: Resolves a cache file path.
- Description: Converts a resource name into the file path inside the cache root.

#### `public OutputStream store(String name) throws IOException`
- Role: Writes a cached file.
- Description: Writes through a temporary file and moves it into place on close.

#### `public InputStream fetch(String name) throws IOException`
- Role: Reads a cached file.
- Description: Opens the cached file for the requested resource name.

#### `public String toString()`
- Role: Returns the cache label.
- Description: Formats the backing directory for debugging.