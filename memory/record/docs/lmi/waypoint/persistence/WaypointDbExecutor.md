---
source: [WaypointDbExecutor.java](../../../../../../src/lmi/waypoint/persistence/WaypointDbExecutor.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointDbExecutor

Serializes waypoint database work onto a dedicated executor thread.

## Nested Types

### Task
- Role: Wraps one queued waypoint database request.
- Description: Stores one request and its result handler for execution on the DB thread.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Implements the lock operation.
- Description: Implements the object operation.

#### `private static final BlockingQueue<Task<?>> queue = new LinkedBlockingQueue<>()`
- Role: Implements the queue operation.
- Description: Implements the private static final blocking queue<task<?>> queue = new linked blocking queue<>() operation.

### Fields

#### `private static Thread thread`
- Role: Coordinates asynchronous waypoint db executor work.
- Description: Runs the single background thread that owns the JDBC connection.

#### `private static boolean initialized`
- Role: Tracks whether initialized is initialized.
- Description: Marks whether the single executor thread has already been started.

#### `private static Connection connection`
- Role: Owns the JDBC connection for the executor thread.
- Description: Owns the JDBC connection for the executor thread.

#### `private final WaypointRequest<R> request`
- Role: Stores the queued waypoint database request.
- Description: Stores the queued waypoint database request.

#### `private final WaypointResultHandler<R> handler`
- Role: Coordinates asynchronous waypoint db executor work.
- Description: Receives the success or failure callback for the queued request.

### Methods

#### `private WaypointDbExecutor()`
- Role: Creates a new WaypointDbExecutor instance.
- Description: Prevents direct instantiation of the executor singleton.

#### `public static void init()`
- Role: Initializes the executor.
- Description: Starts the single DB executor thread lazily.

#### `public static <R extends WaypointResult> void submitRead(`
- Role: Submits a read request.
- Description: Enqueues a read request for the executor thread after ensuring initialization.

#### `public static <R extends WaypointResult> void submitWrite(`
- Role: Submits a write request.
- Description: Enqueues a write request for the executor thread after ensuring initialization.

#### `public static void clear()`
- Role: Clears queued work.
- Description: Drops queued tasks and clears the sync manager state.

#### `private static void runLoop()`
- Role: Runs the executor loop.
- Description: Pulls queued tasks and executes them on the DB owner thread.

#### `private static Connection connection() throws Exception`
- Role: Returns the executor connection.
- Description: Lazily opens the executor-owned JDBC connection and initializes the waypoint schema.

#### `private static void closeConnection()`
- Role: Closes the executor connection.
- Description: Closes the executor-owned JDBC connection if it is open.

#### `private Task(WaypointRequest<R> request, WaypointResultHandler<R> handler)`
- Role: Builds a queued DB task.
- Description: Stores one request and its completion handler.

#### `private void execute(Connection conn)`
- Role: Executes a queued DB task.
- Description: Runs the request and posts the callback result back through the sync manager.