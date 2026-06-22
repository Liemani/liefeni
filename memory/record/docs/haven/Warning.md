---
source: [Warning.java](../../../../src/haven/Warning.java)
created: 2026-06-13
updated: 2026-06-14
---

# Warning

Represents the warning Haven component.

## Members

### Constants

#### `public static final int DEBUG = 0`
- Role: Caches the debug value.
- Description: Caches the `DEBUG` value for reuse.
- Value: `0`

#### `public static final int ERROR = 5`
- Role: Caches the error value.
- Description: Caches the `ERROR` value for reuse.
- Value: `5`

#### `public static final int CRITICAL = 10`
- Role: Caches the critical value.
- Description: Caches the `CRITICAL` value for reuse.
- Value: `10`

#### `private static final int LOGSIZE = 10`
- Role: Caches the logsize value.
- Description: Caches the `LOGSIZE` value for reuse.
- Value: `10`

### Fields

#### `public final double ctime = Utils.rtime()`
- Role: Implements the ctime operation.
- Description: Implements the rtime operation.

#### `public int level = DEBUG`
- Role: Caches the level value.
- Description: Caches the `level` value for reuse.

#### `public boolean trace = false, ctrace = true`
- Role: Tracks the trace flag.
- Description: Caches the `trace` value for reuse.

#### `public boolean trace = false, ctrace = true`
- Role: Tracks the trace flag.
- Description: Caches the `trace` value for reuse.

#### `private static LinkedList<Warning> log = null`
- Role: Caches the log value.
- Description: Caches the `log` value for reuse.

### Methods

#### `public Warning(Throwable cause, String message)`
- Role: Creates a new Warning instance.
- Description: Constructs the Warning instance from the supplied inputs.

#### `public Warning(String message)`
- Role: Creates a new Warning instance.
- Description: Constructs the Warning instance from the supplied inputs.

#### `public Warning(String message, Object... args)`
- Role: Creates a new Warning instance.
- Description: Constructs the Warning instance from the supplied inputs.

#### `public Warning(Throwable cause)`
- Role: Creates a new Warning instance.
- Description: Constructs the Warning instance from the supplied inputs.

#### `public Warning level(int level)`
- Role: Handles the level path.
- Description: Implements the level operation.

#### `public Warning trace(boolean trace)`
- Role: Handles the trace path.
- Description: Implements the trace operation.

#### `public Warning ctrace(boolean ctrace)`
- Role: Handles the ctrace path.
- Description: Implements the ctrace operation.

#### `public void report(PrintStream out, String head)`
- Role: Handles the report path.
- Description: Implements the report operation.

#### `public void issue()`
- Role: Handles the issue path.
- Description: Returns whether the sue is true.

#### `public static void warn(int level, String fmt, Object... args)`
- Role: Handles the warn path.
- Description: Implements the warn operation.

#### `public static void warn(String fmt, Object... args)`
- Role: Handles the warn path.
- Description: Implements the warn operation.