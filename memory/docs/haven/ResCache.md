# ResCache

This file documents the responsibilities and members of `ResCache`.

## Meta

- Source: [ResCache.java](../../../src/haven/ResCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Caches resources.

## Members

### Constants

#### `public static final Config.Variable<java.net.URI> cachebase = Config.Variable.propu("haven.cachebase", "")`

- Description: TODO

### Fields

#### `public static ResCache global = StupidJavaCodeContainer.makeglobal()`

- Description: TODO

#### `public final ResCache pri, sec[]`

- Description: TODO

#### `public final ResCache pri, sec[]`

- Description: TODO

### Methods

#### `public OutputStream store(String name) throws IOException`

- Description: TODO

#### `public InputStream fetch(String name) throws IOException`

- Description: TODO

#### `private static ResCache makeglobal()`

- Description: TODO

#### `public OutputStream store(final String name)`

- Description: TODO

#### `public InputStream fetch(String name) throws IOException`

- Description: TODO

#### `public Fallback(ResCache pri, ResCache... sec)`

- Description: TODO

#### `public InputStream fetch(String name) throws IOException`

- Description: TODO

#### `public OutputStream store(String name) throws IOException`

- Description: TODO

#### `public String toString()`

- Description: TODO
