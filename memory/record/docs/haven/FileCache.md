---
source: [FileCache.java](../../../src/haven/FileCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# FileCache

Represents the file cache Haven component.

## Members

### Constants

### Fields

#### `private final Path base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

### Methods

#### `public FileCache(Path base)`
- Role: Creates a new FileCache instance.
- Description: Constructs the instance and initializes its default state.

#### `public static FileCache foruser()`
- Role: Performs foruser.
- Description: Supports the foruser operation used by the surrounding class.

#### `private Path forres(String nm)`
- Role: Performs forres.
- Description: Supports the forres operation used by the surrounding class.

#### `public OutputStream store(String name) throws IOException`
- Role: Handles the store workflow.
- Description: Supports the store operation used by the surrounding class.

#### `public InputStream fetch(String name) throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
