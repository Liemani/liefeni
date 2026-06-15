# WaypointDbExecutor

This file documents the responsibilities and members of `WaypointDbExecutor`.

## Meta

- Source: [WaypointDbExecutor.java](../../../../../src/lmi/waypoint/persistence/WaypointDbExecutor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Serializes waypoint DB work onto the dedicated worker thread.

## Nested Types

### Task

- Description: TODO

## Members

### Constants

#### `private static final Object lock = new Object()`

- Description: TODO

#### `private static final BlockingQueue<Task<?>> queue = new LinkedBlockingQueue<>()`

- Description: TODO

### Fields

#### `private static Thread thread`

- Description: TODO

#### `private static boolean initialized`

- Description: TODO

#### `private static Connection connection`

- Description: TODO

#### `private final WaypointRequest<R> request`

- Description: TODO

#### `private final WaypointResultHandler<R> handler`

- Description: TODO

### Methods

#### `private WaypointDbExecutor()`

- Description: TODO

#### `public static void init()`

- Description: TODO

#### `public static <R extends WaypointResult> void submitRead(`

- Description: TODO

#### `public static <R extends WaypointResult> void submitWrite(`

- Description: TODO

#### `public static void clear()`

- Description: TODO

#### `private static void runLoop()`

- Description: TODO

#### `private static Connection connection() throws Exception`

- Description: TODO

#### `private static void closeConnection()`

- Description: TODO

#### `private Task(WaypointRequest<R> request, WaypointResultHandler<R> handler)`

- Description: TODO

#### `private void execute(Connection conn)`

- Description: TODO
