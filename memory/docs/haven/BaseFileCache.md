# BaseFileCache

This file documents the responsibilities and members of `BaseFileCache`.

## Meta

- Source: [BaseFileCache.java](../../../src/haven/BaseFileCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides the base file cache implementation.

## Members

### Constants

#### `private static final Map<URI, BaseFileCache> current = new CacheMap<>()`

- Description: TODO

### Fields

#### `public final URI id`

- Description: TODO

#### `private final Path base`

- Description: TODO

### Methods

#### `public static Path findroot()`

- Description: TODO

#### `public static Path findbase(URI id) throws IOException`

- Description: TODO

#### `public BaseFileCache(URI id) throws IOException`

- Description: TODO

#### `public static BaseFileCache get(URI id) throws IOException`

- Description: TODO

#### `private static URI mkurn(String id)`

- Description: TODO

#### `public static BaseFileCache get(String id) throws IOException`

- Description: TODO

#### `public static BaseFileCache create()`

- Description: TODO

#### `private String mangle(String el)`

- Description: TODO

#### `private Path forres(String nm)`

- Description: TODO

#### `public InputStream fetch(String name) throws IOException`

- Description: TODO

#### `public OutputStream store(String name) throws IOException`

- Description: TODO

#### `public void remove(String name) throws IOException`

- Description: TODO

#### `public String toString()`

- Description: TODO
