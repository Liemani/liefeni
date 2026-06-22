---
source: [PosixArgs.java](../../../../src/haven/PosixArgs.java)
created: 2026-06-13
updated: 2026-06-14
---

# PosixArgs

Represents the posix args Haven component.

## Nested Types

### Arg

- Role: Stores one parsed POSIX argument.
- Description: Parsed option record that keeps the flag character and optional argument value.

## Members

### Constants

### Fields

#### `private List<Arg> parsed`
- Role: Caches the parsed value.
- Description: Caches the `parsed` value for reuse.

#### `public String[] rest`
- Role: Caches the rest value.
- Description: Caches the `rest` value for reuse.

#### `public String arg = null`
- Role: Caches the arg value.
- Description: Caches the `arg` value for reuse.

#### `private char ch`
- Role: Caches the ch value.
- Description: Caches the `ch` value for reuse.

#### `private String arg`
- Role: Caches the arg value.
- Description: Caches the `arg` value for reuse.

### Methods

#### `private Arg(char ch, String arg)`
- Role: Handles the arg path.
- Description: Implements the arg operation.

#### `private PosixArgs()`
- Role: Creates a new PosixArgs instance.
- Description: Constructs the PosixArgs instance from the supplied inputs.

#### `public static PosixArgs getopt(String[] argv, int start, String desc)`
- Role: Handles the getopt path.
- Description: Returns the opt.

#### `public static PosixArgs getopt(String[] argv, String desc)`
- Role: Handles the getopt path.
- Description: Returns the opt.

#### `public Iterable<Character> parsed()`
- Role: Handles the parsed path.
- Description: Implements the parsed operation.