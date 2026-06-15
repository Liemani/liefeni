# HashDirCache

This file documents the responsibilities and members of `HashDirCache`.

## Meta

- Source: [HashDirCache.java](../../../src/haven/HashDirCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Caches directories by hash.

## Nested Types

### CacheFile

- Description: TODO

### Header

- Description: TODO

## Members

### Constants

#### `private static final Map<URI, HashDirCache> current = new CacheMap<>()`

- Description: TODO

#### `private static final Map<Path, int[]> monitors = new HashMap<>()`

- Description: TODO

### Fields

#### `private final Path base`

- Description: TODO

#### `public final URI id`

- Description: TODO

#### `private final long idhash`

- Description: TODO

#### `String cid, name`

- Description: TODO

#### `String cid, name`

- Description: TODO

#### `final Path p`

- Description: TODO

#### `final Header h`

- Description: TODO

#### `FileChannel f`

- Description: TODO

#### `private static boolean monwarned = false`

- Description: TODO

### Methods

#### `public static Path findbase()`

- Description: TODO

#### `private HashDirCache(URI id)`

- Description: TODO

#### `public static HashDirCache get(URI id)`

- Description: TODO

#### `private static URI mkurn(String id)`

- Description: TODO

#### `public static HashDirCache get(String id)`

- Description: TODO

#### `private long namehash(long h, String name)`

- Description: TODO

#### `private Header readhead(DataInput fp) throws IOException`

- Description: TODO

#### `private Header readhead(ReadableByteChannel ch) throws IOException`

- Description: TODO

#### `private void writehead(DataOutput fp, String name) throws IOException`

- Description: TODO

#### `private void writehead(WritableByteChannel ch, String name) throws IOException`

- Description: TODO

#### `private static FileChannel open2(Path path, OpenOption... mode) throws IOException`

- Description: TODO

#### `CacheFile(Path p, Header h, LockedFile lf) throws IOException`

- Description: TODO

#### `FileChannel acquire()`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO

#### `private CacheFile lookup(String name, boolean creat) throws IOException`

- Description: TODO

#### `private static DirectoryStream.Filter<Path> fnfilter(java.util.function.Predicate<String> filter)`

- Description: TODO

#### `private Iterator<String> list(boolean filter) throws IOException`

- Description: TODO

#### `private Iterator<String> list() throws IOException`

- Description: TODO

#### `public OutputStream store(String name) throws IOException`

- Description: TODO

#### `public InputStream fetch(String name) throws IOException`

- Description: TODO

#### `public void remove(String name) throws IOException`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public static HashDirCache create()`

- Description: TODO

#### `public static void main(String[] args) throws IOException`

- Description: TODO
