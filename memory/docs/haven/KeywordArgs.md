# KeywordArgs

This file documents the responsibilities and members of `KeywordArgs`.

## Meta

- Source: [KeywordArgs.java](../../../src/haven/KeywordArgs.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Stores keyword argument mappings.

## Nested Types

### FormatException

- Description: TODO

### MissingArgumentException

- Description: TODO

### Parser

- Description: TODO

## Members

### Constants

#### `public static final Map<Character, Parser> formats = new HashMap<>()`

- Description: TODO

### Fields

#### `public final Map<String, Object> parsed = new HashMap<>()`

- Description: TODO

#### `public final Object[] argv`

- Description: TODO

#### `public final Resource.Pool respool`

- Description: TODO

#### `public final Object[] argv`

- Description: TODO

#### `public final int p`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final Object[] argv`

- Description: TODO

### Methods

#### `public KeywordArgs(Object[] argv, Map<Character, Parser> extrafmt, Resource.Pool respool, String... pos)`

- Description: TODO

#### `public KeywordArgs(Object[] argv, Resource.Pool respool, String... pos)`

- Description: TODO

#### `public KeywordArgs(Object[] argv, Map<Character, Parser> extrafmt, String... pos)`

- Description: TODO

#### `public KeywordArgs(Object[] argv, String... pos)`

- Description: TODO

#### `public FormatException(String name, KeywordArgs buf, int p)`

- Description: TODO

#### `public Pair<Object, Integer> parse(KeywordArgs args, String spec, int a)`

- Description: TODO

#### `protected int parse(String spec, Map<Character, Parser> extra, int a)`

- Description: TODO

#### `public boolean has(String nm)`

- Description: TODO

#### `public Object get(String nm, Object def)`

- Description: TODO

#### `public MissingArgumentException(String name, Object[] argv)`

- Description: TODO

#### `public Object get(String nm)`

- Description: TODO

#### `public Optional<Object> oget(String nm)`

- Description: TODO

#### `public String toString()`

- Description: TODO
