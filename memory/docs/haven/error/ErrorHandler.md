# ErrorHandler

This file documents the responsibilities and members of `ErrorHandler`.

## Meta

- Source: [ErrorHandler.java](../../../../src/haven/error/ErrorHandler.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles Haven error reporting for error handler.

## Nested Types

### Reporter

- Role: Represents reporter within ErrorHandler.
- Description: Describes the nested reporter type used by the enclosing class.

## Members

### Constants

#### `private static final String[] sysprops =`
- Role: Defines the shared error handler constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final URL errordest`
- Role: Holds the errordest state.
- Description: Backs the cached state for this file.

#### `private final ThreadGroup initial`
- Role: Holds the initial state.
- Description: Backs the cached state for this file.

#### `private Map<String, Object> props = new HashMap<String, Object>()`
- Role: Caches props entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Reporter reporter`
- Role: Holds the reporter state.
- Description: Backs the cached state for this file.

#### `private Queue<Report> errors = new LinkedList<Report>()`
- Role: Caches errors entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private ErrorStatus status`
- Role: Holds the status state.
- Description: Backs the cached state for this file.

### Methods

#### `public static ErrorHandler find()`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `public static void setprop(String key, Object val)`
- Role: Performs setprop.
- Description: Supports the setprop operation used by the surrounding class.

#### `public void lsetprop(String key, Object val)`
- Role: Performs lsetprop.
- Description: Supports the lsetprop operation used by the surrounding class.

#### `public Reporter(ErrorStatus status)`
- Role: Performs reporter.
- Description: Supports the reporter operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void doreport(Report r) throws IOException`
- Role: Handles the doreport workflow.
- Description: Supports the doreport operation used by the surrounding class.

#### `public void report(Thread th, Throwable t)`
- Role: Performs report.
- Description: Supports the report operation used by the surrounding class.

#### `private void defprops()`
- Role: Performs defprops.
- Description: Supports the defprops operation used by the surrounding class.

#### `public ErrorHandler(ErrorStatus ui, URL errordest)`
- Role: Creates a new ErrorHandler instance.
- Description: Constructs the instance and initializes its default state.

#### `public ErrorHandler(URL errordest)`
- Role: Creates a new ErrorHandler instance.
- Description: Constructs the instance and initializes its default state.

#### `public void sethandler(ErrorStatus handler)`
- Role: Performs sethandler.
- Description: Supports the sethandler operation used by the surrounding class.

#### `public void uncaughtException(Thread t, Throwable e)`
- Role: Performs uncaught exception.
- Description: Supports the uncaught exception operation used by the surrounding class.
