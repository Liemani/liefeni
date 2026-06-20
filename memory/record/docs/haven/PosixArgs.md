---
source: [PosixArgs.java](../../../src/haven/PosixArgs.java)
created: 2026-06-13
updated: 2026-06-14
---

# PosixArgs

Represents the posix args Haven component.

## Nested Types

### Arg

- Role: Represents arg within PosixArgs.
- Description: Describes the nested arg type used by the enclosing class.

## Members

### Constants

### Fields

#### `private List<Arg> parsed`
- Role: Caches parsed entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public String[] rest`
- Role: Stores the rest value.
- Description: Backs the cached state for this file.

#### `public String arg = null`
- Role: Stores the arg value.
- Description: Backs the cached state for this file.

#### `private char ch`
- Role: Stores the ch value.
- Description: Backs the cached state for this file.

#### `private String arg`
- Role: Stores the arg value.
- Description: Backs the cached state for this file.

### Methods

#### `private Arg(char ch, String arg)`
- Role: Performs arg.
- Description: Supports the arg operation used by the surrounding class.

#### `private PosixArgs()`
- Role: Creates a new PosixArgs instance.
- Description: Constructs the instance and initializes its default state.

#### `public static PosixArgs getopt(String[] argv, int start, String desc)`
- Role: Performs getopt.
- Description: Supports the getopt operation used by the surrounding class.

#### `public static PosixArgs getopt(String[] argv, String desc)`
- Role: Performs getopt.
- Description: Supports the getopt operation used by the surrounding class.

#### `public Iterable<Character> parsed()`
- Role: Performs parsed.
- Description: Supports the parsed operation used by the surrounding class.
