---
source: [HashDirCache.java](../../../../src/haven/HashDirCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# HashDirCache

Represents the hash dir cache Haven component.

## Nested Types

### CacheFile

- Role: Wraps one locked cache file.
- Description: Helper that owns the acquired file channel and associated header metadata.

### Header

- Role: Stores cache file header metadata.
- Description: Parsed header record that keeps the cache id and entry name.

## Members

### Constants

#### `private static final Map<URI, HashDirCache> current = new CacheMap<>()`
- Role: Implements the current operation.
- Description: Implements the private static final map<uri, hash dir cache> current = new cache map<>() operation.
- Value: `new CacheMap<>()`

#### `private static final Map<Path, int[]> monitors = new HashMap<>()`
- Role: Implements the monitors operation.
- Description: Implements the private static final map<path, int[]> monitors = new hash map<>() operation.
- Value: `new HashMap<>()`

### Fields

#### `private final Path base`
- Role: Caches the base value.
- Description: Caches the `base` value for reuse.

#### `public final URI id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private final long idhash`
- Role: Caches the idhash value.
- Description: Caches the `idhash` value for reuse.

#### `String cid, name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `String cid, name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `final Path p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `final Header h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `FileChannel f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `private static boolean monwarned = false`
- Role: Tracks the monwarned flag.
- Description: Caches the `monwarned` value for reuse.

### Methods

#### `public static Path findbase()`
- Role: Handles the findbase path.
- Description: Finds the base.

#### `private HashDirCache(URI id)`
- Role: Creates a new HashDirCache instance.
- Description: Constructs the HashDirCache instance from the supplied inputs.

#### `public static HashDirCache get(URI id)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `private static URI mkurn(String id)`
- Role: Handles the mkurn path.
- Description: Implements the mkurn operation.

#### `public static HashDirCache get(String id)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `private long namehash(long h, String name)`
- Role: Handles the namehash path.
- Description: Implements the namehash operation.

#### `private Header readhead(DataInput fp) throws IOException`
- Role: Handles the readhead workflow.
- Description: Implements the readhead operation.

#### `private Header readhead(ReadableByteChannel ch) throws IOException`
- Role: Handles the readhead workflow.
- Description: Implements the readhead operation.

#### `private void writehead(DataOutput fp, String name) throws IOException`
- Role: Handles the writehead workflow.
- Description: Implements the writehead operation.

#### `private void writehead(WritableByteChannel ch, String name) throws IOException`
- Role: Handles the writehead workflow.
- Description: Implements the writehead operation.

#### `private static FileChannel open2(Path path, OpenOption... mode) throws IOException`
- Role: Handles the open2 workflow.
- Description: Implements the open2 operation.

#### `CacheFile(Path p, Header h, LockedFile lf) throws IOException`
- Role: Handles the cache file workflow.
- Description: Implements the cache file operation.

#### `FileChannel acquire()`
- Role: Handles the acquire path.
- Description: Implements the acquire operation.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `private CacheFile lookup(String name, boolean creat) throws IOException`
- Role: Handles the lookup workflow.
- Description: Implements the lookup operation.

#### `private static DirectoryStream.Filter<Path> fnfilter(java.util.function.Predicate<String> filter)`
- Role: Handles the fnfilter path.
- Description: Implements the fnfilter operation.

#### `private Iterator<String> list(boolean filter) throws IOException`
- Role: Handles the list workflow.
- Description: Implements the list operation.

#### `private Iterator<String> list() throws IOException`
- Role: Handles the list workflow.
- Description: Implements the list operation.

#### `public OutputStream store(String name) throws IOException`
- Role: Handles the store workflow.
- Description: Opens the requested cached resource for writing.

#### `public InputStream fetch(String name) throws IOException`
- Role: Fetches the target value.
- Description: Opens the requested cached resource for reading.

#### `public void remove(String name) throws IOException`
- Role: Handles the remove workflow.
- Description: Removes the supplied value from the owning container.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this HashDirCache for debugging and logging.

#### `public static HashDirCache create()`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static void main(String[] args) throws IOException`
- Role: Handles the main workflow.
- Description: Runs the client entry point.