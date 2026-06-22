---
source: [KeywordArgs.java](../../../../src/haven/KeywordArgs.java)
created: 2026-06-13
updated: 2026-06-14
---

# KeywordArgs

Represents the keyword args Haven component.

## Nested Types

### FormatException

- Role: Reports that an argument sequence does not match the expected format.
- Description: Carries the original argv and the failing parse position.

### MissingArgumentException

- Role: Reports that a required named argument is missing.
- Description: Captures the missing key together with the original argv.

### Parser

- Role: Parses one typed keyword-argument fragment.
- Description: Returns the parsed value together with the next argv index.

## Members

### Constants

#### `public static final Map<Character, Parser> formats = new HashMap<>()`
- Role: Implements the formats operation.
- Description: Implements the public static final map<character, parser> formats = new hash map<>() operation.
- Value: `new HashMap<>()`

### Fields

#### `public final Map<String, Object> parsed = new HashMap<>()`
- Role: Implements the parsed operation.
- Description: Implements the public final map<string, object> parsed = new hash map<>() operation.

#### `public final Object[] argv`
- Role: Caches the argv value.
- Description: Caches the `argv` value for reuse.

#### `public final Resource.Pool respool`
- Role: Caches the respool value.
- Description: Caches the `respool` value for reuse.

#### `public final Object[] argv`
- Role: Caches the argv value.
- Description: Caches the `argv` value for reuse.

#### `public final int p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final Object[] argv`
- Role: Caches the argv value.
- Description: Caches the `argv` value for reuse.

### Methods

#### `public KeywordArgs(Object[] argv, Map<Character, Parser> extrafmt, Resource.Pool respool, String... pos)`
- Role: Creates a new KeywordArgs instance.
- Description: Constructs the KeywordArgs instance from the supplied inputs.

#### `public KeywordArgs(Object[] argv, Resource.Pool respool, String... pos)`
- Role: Creates a new KeywordArgs instance.
- Description: Constructs the KeywordArgs instance from the supplied inputs.

#### `public KeywordArgs(Object[] argv, Map<Character, Parser> extrafmt, String... pos)`
- Role: Creates a new KeywordArgs instance.
- Description: Constructs the KeywordArgs instance from the supplied inputs.

#### `public KeywordArgs(Object[] argv, String... pos)`
- Role: Creates a new KeywordArgs instance.
- Description: Constructs the KeywordArgs instance from the supplied inputs.

#### `public FormatException(String name, KeywordArgs buf, int p)`
- Role: Handles the format exception path.
- Description: Implements the format exception operation.

#### `public Pair<Object, Integer> parse(KeywordArgs args, String spec, int a)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `protected int parse(String spec, Map<Character, Parser> extra, int a)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public boolean has(String nm)`
- Role: Handles the has path.
- Description: Checks the current has state.

#### `public Object get(String nm, Object def)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public MissingArgumentException(String name, Object[] argv)`
- Role: Handles the missing argument exception path.
- Description: Implements the missing argument exception operation.

#### `public Object get(String nm)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Optional<Object> oget(String nm)`
- Role: Handles the oget path.
- Description: Implements the oget operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this KeywordArgs for debugging and logging.