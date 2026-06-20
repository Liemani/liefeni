---
source: [HashDirCache.java](../../../src/haven/HashDirCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# HashDirCache

Represents the hash dir cache Haven component.

## Nested Types

### CacheFile

- Role: Represents cache file within HashDirCache.
- Description: Describes the nested cache file type used by the enclosing class.

### Header

- Role: Represents header within HashDirCache.
- Description: Describes the nested header type used by the enclosing class.

## Members

### Constants

#### `private static final Map<URI, HashDirCache> current = new CacheMap<>()`
- Role: Defines the shared current constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Path, int[]> monitors = new HashMap<>()`
- Role: Defines the shared monitors constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Path base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `public final URI id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `private final long idhash`
- Role: Stores the idhash value.
- Description: Backs the cached state for this file.

#### `String cid, name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `String cid, name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `final Path p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

#### `final Header h`
- Role: Holds the h state.
- Description: Backs the cached state for this file.

#### `FileChannel f`
- Role: Stores the f value.
- Description: Backs the cached state for this file.

#### `private static boolean monwarned = false`
- Role: Tracks the monwarned flag.
- Description: Supports the monwarned operation used by the surrounding class.

### Methods

#### `public static Path findbase()`
- Role: Performs findbase.
- Description: Supports the findbase operation used by the surrounding class.

#### `private HashDirCache(URI id)`
- Role: Creates a new HashDirCache instance.
- Description: Constructs the instance and initializes its default state.

#### `public static HashDirCache get(URI id)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private static URI mkurn(String id)`
- Role: Performs mkurn.
- Description: Supports the mkurn operation used by the surrounding class.

#### `public static HashDirCache get(String id)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private long namehash(long h, String name)`
- Role: Performs namehash.
- Description: Supports the namehash operation used by the surrounding class.

#### `private Header readhead(DataInput fp) throws IOException`
- Role: Handles the readhead workflow.
- Description: Supports the readhead operation used by the surrounding class.

#### `private Header readhead(ReadableByteChannel ch) throws IOException`
- Role: Handles the readhead workflow.
- Description: Supports the readhead operation used by the surrounding class.

#### `private void writehead(DataOutput fp, String name) throws IOException`
- Role: Handles the writehead workflow.
- Description: Supports the writehead operation used by the surrounding class.

#### `private void writehead(WritableByteChannel ch, String name) throws IOException`
- Role: Handles the writehead workflow.
- Description: Supports the writehead operation used by the surrounding class.

#### `private static FileChannel open2(Path path, OpenOption... mode) throws IOException`
- Role: Handles the open2 workflow.
- Description: Supports the open2 operation used by the surrounding class.

#### `CacheFile(Path p, Header h, LockedFile lf) throws IOException`
- Role: Handles the cache file workflow.
- Description: Supports the cache file operation used by the surrounding class.

#### `FileChannel acquire()`
- Role: Performs acquire.
- Description: Supports the acquire operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `private CacheFile lookup(String name, boolean creat) throws IOException`
- Role: Handles the lookup workflow.
- Description: Supports the lookup operation used by the surrounding class.

#### `private static DirectoryStream.Filter<Path> fnfilter(java.util.function.Predicate<String> filter)`
- Role: Performs fnfilter.
- Description: Supports the fnfilter operation used by the surrounding class.

#### `private Iterator<String> list(boolean filter) throws IOException`
- Role: Handles the list workflow.
- Description: Supports the list operation used by the surrounding class.

#### `private Iterator<String> list() throws IOException`
- Role: Handles the list workflow.
- Description: Supports the list operation used by the surrounding class.

#### `public OutputStream store(String name) throws IOException`
- Role: Handles the store workflow.
- Description: Supports the store operation used by the surrounding class.

#### `public InputStream fetch(String name) throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public void remove(String name) throws IOException`
- Role: Handles the remove workflow.
- Description: Supports the remove operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static HashDirCache create()`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static void main(String[] args) throws IOException`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
