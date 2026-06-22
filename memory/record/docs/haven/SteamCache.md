---
source: [SteamCache.java](../../../../src/haven/SteamCache.java)
created: 2026-06-13
updated: 2026-06-14
---

# SteamCache

Represents the steam cache Haven component.

## Members

### Constants

### Fields

#### `private final Steam api`
- Role: Caches the api value.
- Description: Caches the `api` value for reuse.

#### `private final String prefix`
- Role: Caches the prefix value.
- Description: Caches the `prefix` value for reuse.

### Methods

#### `public SteamCache(Steam api)`
- Role: Creates a new SteamCache instance.
- Description: Constructs the SteamCache instance from the supplied inputs.

#### `public InputStream fetch(String name) throws IOException`
- Role: Fetches the target value.
- Description: Opens the requested cached resource for reading.

#### `public OutputStream store(String name) throws IOException`
- Role: Handles the store workflow.
- Description: Opens the requested cached resource for writing.