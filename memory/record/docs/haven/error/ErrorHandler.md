---
source: [ErrorHandler.java](../../../../../src/haven/error/ErrorHandler.java)
created: 2026-06-13
updated: 2026-06-14
---

# ErrorHandler

Handles Haven error reporting for error handler.

## Nested Types

### Reporter

- Role: Represents reporter within ErrorHandler.
- Description: Describes the nested reporter type used by the enclosing class.

## Members

### Constants

#### `private static final String[] sysprops =`
- Role: Caches the sysprops value.
- Description: Caches the `sysprops` value for reuse.
- Value: ``

### Fields

#### `private final URL errordest`
- Role: Caches the errordest value.
- Description: Caches the `errordest` value for reuse.

#### `private final ThreadGroup initial`
- Role: Caches the initial value.
- Description: Caches the `initial` value for reuse.

#### `private Map<String, Object> props = new HashMap<String, Object>()`
- Role: Implements the props operation.
- Description: Implements the private map<string, object> props = new hash map<string, object>() operation.

#### `private Reporter reporter`
- Role: Caches the reporter value.
- Description: Caches the `reporter` value for reuse.

#### `private Queue<Report> errors = new LinkedList<Report>()`
- Role: Implements the errors operation.
- Description: Implements the private queue<report> errors = new linked list<report>() operation.

#### `private ErrorStatus status`
- Role: Caches the status value.
- Description: Caches the `status` value for reuse.

### Methods

#### `public static ErrorHandler find()`
- Role: Handles the find path.
- Description: Finds the requested data.

#### `public static void setprop(String key, Object val)`
- Role: Handles the setprop path.
- Description: Updates the prop.

#### `public void lsetprop(String key, Object val)`
- Role: Handles the lsetprop path.
- Description: Implements the lsetprop operation.

#### `public Reporter(ErrorStatus status)`
- Role: Handles the reporter path.
- Description: Implements the reporter operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private void doreport(Report r) throws IOException`
- Role: Handles the doreport workflow.
- Description: Implements the doreport operation.

#### `public void report(Thread th, Throwable t)`
- Role: Handles the report path.
- Description: Implements the report operation.

#### `private void defprops()`
- Role: Handles the defprops path.
- Description: Implements the defprops operation.

#### `public ErrorHandler(ErrorStatus ui, URL errordest)`
- Role: Creates a new ErrorHandler instance.
- Description: Constructs the ErrorHandler instance from the supplied inputs.

#### `public ErrorHandler(URL errordest)`
- Role: Creates a new ErrorHandler instance.
- Description: Constructs the ErrorHandler instance from the supplied inputs.

#### `public void sethandler(ErrorStatus handler)`
- Role: Handles the sethandler path.
- Description: Updates the handler.

#### `public void uncaughtException(Thread t, Throwable e)`
- Role: Handles the uncaught exception path.
- Description: Implements the uncaught exception operation.