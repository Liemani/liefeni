# PosixArgs

This file documents the responsibilities and members of `PosixArgs`.

## Meta

- Source: [PosixArgs.java](../../../src/haven/PosixArgs.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Parses POSIX-style arguments.

## Nested Types

### Arg

- Description: TODO

## Members

### Constants

### Fields

#### `private List<Arg> parsed`

- Description: TODO

#### `public String[] rest`

- Description: TODO

#### `public String arg = null`

- Description: TODO

#### `private char ch`

- Description: TODO

#### `private String arg`

- Description: TODO

### Methods

#### `private Arg(char ch, String arg)`

- Description: TODO

#### `private PosixArgs()`

- Description: TODO

#### `public static PosixArgs getopt(String[] argv, int start, String desc)`

- Description: TODO

#### `public static PosixArgs getopt(String[] argv, String desc)`

- Description: TODO

#### `public Iterable<Character> parsed()`

- Description: TODO
