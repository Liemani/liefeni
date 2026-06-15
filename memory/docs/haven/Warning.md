# Warning

This file documents the responsibilities and members of `Warning`.

## Meta

- Source: [Warning.java](../../../src/haven/Warning.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a warning message.

## Members

### Constants

#### `public static final int DEBUG = 0`

- Description: TODO

#### `public static final int ERROR = 5`

- Description: TODO

#### `public static final int CRITICAL = 10`

- Description: TODO

#### `private static final int LOGSIZE = 10`

- Description: TODO

### Fields

#### `public final double ctime = Utils.rtime()`

- Description: TODO

#### `public int level = DEBUG`

- Description: TODO

#### `public boolean trace = false, ctrace = true`

- Description: TODO

#### `public boolean trace = false, ctrace = true`

- Description: TODO

#### `private static LinkedList<Warning> log = null`

- Description: TODO

### Methods

#### `public Warning(Throwable cause, String message)`

- Description: TODO

#### `public Warning(String message)`

- Description: TODO

#### `public Warning(String message, Object... args)`

- Description: TODO

#### `public Warning(Throwable cause)`

- Description: TODO

#### `public Warning level(int level)`

- Description: TODO

#### `public Warning trace(boolean trace)`

- Description: TODO

#### `public Warning ctrace(boolean ctrace)`

- Description: TODO

#### `public void report(PrintStream out, String head)`

- Description: TODO

#### `public void issue()`

- Description: TODO

#### `public static void warn(int level, String fmt, Object... args)`

- Description: TODO

#### `public static void warn(String fmt, Object... args)`

- Description: TODO
