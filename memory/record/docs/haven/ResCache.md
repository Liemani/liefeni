---
source: [ResCache.java](../../../../src/haven/ResCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# ResCache

Defines a read/write cache interface for resources.

## Members

### Constants

#### `public static final Config.Variable<java.net.URI> cachebase = Config.Variable.propu("haven.cachebase", "")`
- Role: Stores the cache base configuration.
- Description: Configurable URI used when selecting the active cache root.
- Value: `Config.Variable.propu("haven.cachebase", "")`

### Fields

#### `public static ResCache global = StupidJavaCodeContainer.makeglobal()`
- Role: Stores the global cache.
- Description: Shared cache instance used by default resource loading.

#### `public final ResCache pri, sec[]`
- Role: Stores cache layers.
- Description: Primary cache followed by fallback caches.

#### `public final ResCache pri, sec[]`
- Role: Caches the sec[] value.
- Description: Caches the `sec[]` value for reuse.

### Methods

#### `public OutputStream store(String name) throws IOException`
- Role: Writes a resource entry.
- Description: Opens an output stream for persisting a named resource.

#### `public InputStream fetch(String name) throws IOException`
- Role: Reads a resource entry.
- Description: Opens an input stream for a named cached resource.

#### `private static ResCache makeglobal()`
- Role: Chooses the default cache.
- Description: Returns the cache used as the global resource cache.

#### `public OutputStream store(final String name)`
- Role: Stores test output.
- Description: Prints the byte count when a test resource is closed.

#### `public InputStream fetch(String name) throws IOException`
- Role: Rejects test fetches.
- Description: Always fails because the test cache only supports writes.

#### `public Fallback(ResCache pri, ResCache... sec)`
- Role: Builds a fallback cache chain.
- Description: Uses the primary cache first and falls back to secondary caches on misses.

#### `public InputStream fetch(String name) throws IOException`
- Role: Reads through fallback caches.
- Description: Tries the primary cache first, then each secondary cache in order.

#### `public OutputStream store(String name) throws IOException`
- Role: Stores through the primary cache.
- Description: Always writes to the primary cache layer.

#### `public String toString()`
- Role: Returns the cache description.
- Description: Formats the fallback chain for debugging.