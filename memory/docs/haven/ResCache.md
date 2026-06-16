# ResCache

This file documents the responsibilities and members of `ResCache`.

## Meta

- Source: [ResCache.java](../../../src/haven/ResCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the res cache Haven component.

## Members

### Constants

#### `public static final Config.Variable<java.net.URI> cachebase = Config.Variable.propu("haven.cachebase", "")`
- Role: Defines the shared cachebase constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public static ResCache global = StupidJavaCodeContainer.makeglobal()`
- Role: Caches global entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final ResCache pri, sec[]`
- Role: Holds the res cache state.
- Description: Backs the cached state for this file.

#### `public final ResCache pri, sec[]`
- Role: Holds the res cache state.
- Description: Backs the cached state for this file.

### Methods

#### `public OutputStream store(String name) throws IOException`
- Role: Handles the store workflow.
- Description: Supports the store operation used by the surrounding class.

#### `public InputStream fetch(String name) throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `private static ResCache makeglobal()`
- Role: Performs makeglobal.
- Description: Supports the makeglobal operation used by the surrounding class.

#### `public OutputStream store(final String name)`
- Role: Performs store.
- Description: Supports the store operation used by the surrounding class.

#### `public InputStream fetch(String name) throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public Fallback(ResCache pri, ResCache... sec)`
- Role: Performs fallback.
- Description: Supports the fallback operation used by the surrounding class.

#### `public InputStream fetch(String name) throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public OutputStream store(String name) throws IOException`
- Role: Handles the store workflow.
- Description: Supports the store operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
