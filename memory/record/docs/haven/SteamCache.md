---
source: [SteamCache.java](../../../src/haven/SteamCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# SteamCache

Represents the steam cache Haven component.

## Members

### Constants

### Fields

#### `private final Steam api`
- Role: Holds the api state.
- Description: Backs the cached state for this file.

#### `private final String prefix`
- Role: Stores the prefix value.
- Description: Backs the cached state for this file.

### Methods

#### `public SteamCache(Steam api)`
- Role: Creates a new SteamCache instance.
- Description: Constructs the instance and initializes its default state.

#### `public InputStream fetch(String name) throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public OutputStream store(String name) throws IOException`
- Role: Handles the store workflow.
- Description: Supports the store operation used by the surrounding class.
