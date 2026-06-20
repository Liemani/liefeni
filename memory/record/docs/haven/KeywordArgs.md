---
source: [KeywordArgs.java](../../../src/haven/KeywordArgs.java)
created: 2026-06-13
updated: 2026-06-14
---

# KeywordArgs

Represents the keyword args Haven component.

## Nested Types

### FormatException

- Role: Represents format exception within KeywordArgs.
- Description: Describes the nested format exception type used by the enclosing class.

### MissingArgumentException

- Role: Represents missing argument exception within KeywordArgs.
- Description: Describes the nested missing argument exception type used by the enclosing class.

### Parser

- Role: Represents parser within KeywordArgs.
- Description: Describes the nested parser type used by the enclosing class.

## Members

### Constants

#### `public static final Map<Character, Parser> formats = new HashMap<>()`
- Role: Defines the shared formats constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Map<String, Object> parsed = new HashMap<>()`
- Role: Caches parsed entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Object[] argv`
- Role: Holds the argv state.
- Description: Backs the cached state for this file.

#### `public final Resource.Pool respool`
- Role: Stores the respool value.
- Description: Backs the cached state for this file.

#### `public final Object[] argv`
- Role: Holds the argv state.
- Description: Backs the cached state for this file.

#### `public final int p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final Object[] argv`
- Role: Holds the argv state.
- Description: Backs the cached state for this file.

### Methods

#### `public KeywordArgs(Object[] argv, Map<Character, Parser> extrafmt, Resource.Pool respool, String... pos)`
- Role: Creates a new KeywordArgs instance.
- Description: Constructs the instance and initializes its default state.

#### `public KeywordArgs(Object[] argv, Resource.Pool respool, String... pos)`
- Role: Creates a new KeywordArgs instance.
- Description: Constructs the instance and initializes its default state.

#### `public KeywordArgs(Object[] argv, Map<Character, Parser> extrafmt, String... pos)`
- Role: Creates a new KeywordArgs instance.
- Description: Constructs the instance and initializes its default state.

#### `public KeywordArgs(Object[] argv, String... pos)`
- Role: Creates a new KeywordArgs instance.
- Description: Constructs the instance and initializes its default state.

#### `public FormatException(String name, KeywordArgs buf, int p)`
- Role: Performs format exception.
- Description: Supports the format exception operation used by the surrounding class.

#### `public Pair<Object, Integer> parse(KeywordArgs args, String spec, int a)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `protected int parse(String spec, Map<Character, Parser> extra, int a)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public boolean has(String nm)`
- Role: Performs has.
- Description: Supports the has operation used by the surrounding class.

#### `public Object get(String nm, Object def)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public MissingArgumentException(String name, Object[] argv)`
- Role: Performs missing argument exception.
- Description: Supports the missing argument exception operation used by the surrounding class.

#### `public Object get(String nm)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Optional<Object> oget(String nm)`
- Role: Performs oget.
- Description: Supports the oget operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
