---
source: [BaseFileCache.java](../../../../src/haven/BaseFileCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# BaseFileCache

Stores cached resources on disk under a stable base directory.

## Members

### Constants

#### `private static final Map<URI, BaseFileCache> current = new CacheMap<>()`
- Role: Caches active file caches.
- Description: Reuses one `BaseFileCache` per cache URI.
- Value: `new CacheMap<>()`

### Fields

#### `public final URI id`
- Role: Stores the cache URI.
- Description: Identifies which logical cache this instance represents.

#### `private final Path base`
- Role: Stores the cache root.
- Description: Points to the on-disk directory that backs this cache.

### Methods

#### `public static Path findroot()`
- Role: Finds a cache root.
- Description: Selects a writable local directory for resource cache storage.

#### `public static Path findbase(URI id) throws IOException`
- Role: Resolves a cache base directory.
- Description: Allocates or reuses the filesystem directory associated with one cache URI.

#### `public BaseFileCache(URI id) throws IOException`
- Role: Opens a cache instance.
- Description: Resolves the on-disk root for the supplied cache URI.

#### `public static BaseFileCache get(URI id) throws IOException`
- Role: Returns a cache instance.
- Description: Reuses or creates the cache object for the given URI.

#### `private static URI mkurn(String id)`
- Role: Builds a cache URN.
- Description: Converts a string cache name into the internal URN form.

#### `public static BaseFileCache get(String id) throws IOException`
- Role: Returns a cache instance.
- Description: Reuses or creates the cache object for the given string identifier.

#### `public static BaseFileCache create()`
- Role: Creates the default cache.
- Description: Chooses the active cache base from the current runtime context.

#### `private String mangle(String el)`
- Role: Sanitizes a path component.
- Description: Converts a resource path component into a filesystem-safe name.

#### `private Path forres(String nm)`
- Role: Resolves a cached file path.
- Description: Converts a resource name into the backing file-system path.

#### `public InputStream fetch(String name) throws IOException`
- Role: Opens a cached file for reading.
- Description: Returns an input stream for the cached resource file.

#### `public OutputStream store(String name) throws IOException`
- Role: Opens a cached file for writing.
- Description: Writes to a temporary file and moves it into place on close.

#### `public void remove(String name) throws IOException`
- Role: Deletes a cached file.
- Description: Removes the cached resource file for the given name.

#### `public String toString()`
- Role: Returns the cache label.
- Description: Formats the filesystem root used by this cache.