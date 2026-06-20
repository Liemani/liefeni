---
source: [BaseFileCache.java](../../../src/haven/BaseFileCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# BaseFileCache

Represents the base file cache Haven component.

## Members

### Constants

#### `private static final Map<URI, BaseFileCache> current = new CacheMap<>()`
- Role: Defines the shared current constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final URI id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `private final Path base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

### Methods

#### `public static Path findroot()`
- Role: Performs findroot.
- Description: Supports the findroot operation used by the surrounding class.

#### `public static Path findbase(URI id) throws IOException`
- Role: Handles the findbase workflow.
- Description: Supports the findbase operation used by the surrounding class.

#### `public BaseFileCache(URI id) throws IOException`
- Role: Creates a new BaseFileCache instance.
- Description: Constructs the instance and initializes its default state.

#### `public static BaseFileCache get(URI id) throws IOException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `private static URI mkurn(String id)`
- Role: Performs mkurn.
- Description: Supports the mkurn operation used by the surrounding class.

#### `public static BaseFileCache get(String id) throws IOException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `public static BaseFileCache create()`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private String mangle(String el)`
- Role: Performs mangle.
- Description: Supports the mangle operation used by the surrounding class.

#### `private Path forres(String nm)`
- Role: Performs forres.
- Description: Supports the forres operation used by the surrounding class.

#### `public InputStream fetch(String name) throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public OutputStream store(String name) throws IOException`
- Role: Handles the store workflow.
- Description: Supports the store operation used by the surrounding class.

#### `public void remove(String name) throws IOException`
- Role: Handles the remove workflow.
- Description: Supports the remove operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
