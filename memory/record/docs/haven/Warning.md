---
source: [Warning.java](../../../src/haven/Warning.java)
created: 2026-06-13
updated: 2026-06-14
---

# Warning

Represents the warning Haven component.

## Members

### Constants

#### `public static final int DEBUG = 0`
- Role: Defines the shared debug constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ERROR = 5`
- Role: Defines the shared error constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int CRITICAL = 10`
- Role: Defines the shared critical constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int LOGSIZE = 10`
- Role: Defines the shared logsize constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final double ctime = Utils.rtime()`
- Role: Stores the ctime value.
- Description: Backs the cached state for this file.

#### `public int level = DEBUG`
- Role: Stores the level value.
- Description: Backs the cached state for this file.

#### `public boolean trace = false, ctrace = true`
- Role: Tracks the trace flag.
- Description: Supports the trace operation used by the surrounding class.

#### `public boolean trace = false, ctrace = true`
- Role: Tracks the trace flag.
- Description: Supports the trace operation used by the surrounding class.

#### `private static LinkedList<Warning> log = null`
- Role: Caches log entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Warning(Throwable cause, String message)`
- Role: Creates a new Warning instance.
- Description: Constructs the instance and initializes its default state.

#### `public Warning(String message)`
- Role: Creates a new Warning instance.
- Description: Constructs the instance and initializes its default state.

#### `public Warning(String message, Object... args)`
- Role: Creates a new Warning instance.
- Description: Constructs the instance and initializes its default state.

#### `public Warning(Throwable cause)`
- Role: Creates a new Warning instance.
- Description: Constructs the instance and initializes its default state.

#### `public Warning level(int level)`
- Role: Performs level.
- Description: Supports the level operation used by the surrounding class.

#### `public Warning trace(boolean trace)`
- Role: Performs trace.
- Description: Supports the trace operation used by the surrounding class.

#### `public Warning ctrace(boolean ctrace)`
- Role: Performs ctrace.
- Description: Supports the ctrace operation used by the surrounding class.

#### `public void report(PrintStream out, String head)`
- Role: Performs report.
- Description: Supports the report operation used by the surrounding class.

#### `public void issue()`
- Role: Performs issue.
- Description: Supports the issue operation used by the surrounding class.

#### `public static void warn(int level, String fmt, Object... args)`
- Role: Performs warn.
- Description: Supports the warn operation used by the surrounding class.

#### `public static void warn(String fmt, Object... args)`
- Role: Performs warn.
- Description: Supports the warn operation used by the surrounding class.
