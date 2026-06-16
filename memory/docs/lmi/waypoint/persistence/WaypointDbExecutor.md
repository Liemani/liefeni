# WaypointDbExecutor

This file documents the responsibilities and members of `WaypointDbExecutor`.

## Meta

- Source: [WaypointDbExecutor.java](../../../../../src/lmi/waypoint/persistence/WaypointDbExecutor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Serializes waypoint database work onto a dedicated executor thread.

## Nested Types

### Task
### Task
- Role: Represents the task helper used by WaypointDbExecutor.

- Role: Wraps one queued waypoint database task.
- Description: Describes the nested task type used by the enclosing class.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Defines the shared lock constant.
- Description: Shared constant used by the rest of the class.

#### `private static final BlockingQueue<Task<?>> queue = new LinkedBlockingQueue<>()`
- Role: Defines the shared queue constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static Thread thread`
- Role: Coordinates asynchronous waypoint db executor work.
- Description: Supports the thread operation used by the surrounding class.

#### `private static boolean initialized`
- Role: Tracks whether initialized is initialized.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static Connection connection`
- Role: Holds the connection state.
- Description: Backs the cached state for this file.

#### `private final WaypointRequest<R> request`
- Role: Stores the request value.
- Description: Backs the cached state for this file.

#### `private final WaypointResultHandler<R> handler`
- Role: Coordinates asynchronous waypoint db executor work.
- Description: Supports the handler operation used by the surrounding class.

### Methods

#### `private WaypointDbExecutor()`
- Role: Creates a new WaypointDbExecutor instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public static <R extends WaypointResult> void submitRead(`
- Role: Handles the submit read workflow.
- Description: Supports the submit read operation used by the surrounding class.

#### `public static <R extends WaypointResult> void submitWrite(`
- Role: Handles the submit write workflow.
- Description: Supports the submit write operation used by the surrounding class.

#### `public static void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `private static void runLoop()`
- Role: Runs the loop.
- Description: Supports the run loop operation used by the surrounding class.

#### `private static Connection connection() throws Exception`
- Role: Handles the connection workflow.
- Description: Supports the connection operation used by the surrounding class.

#### `private static void closeConnection()`
- Role: Closes the connection.
- Description: Supports the close connection operation used by the surrounding class.

#### `private Task(WaypointRequest<R> request, WaypointResultHandler<R> handler)`
- Role: Performs task.
- Description: Supports the task operation used by the surrounding class.

#### `private void execute(Connection conn)`
- Role: Executes the operation.
- Description: Supports the execute operation used by the surrounding class.
