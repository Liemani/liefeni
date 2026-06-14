# WaypointDbExecutor

## Meta

- Source: [WaypointDbExecutor.java](../../../../../src/lmi/waypoint/persistence/WaypointDbExecutor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Serializes waypoint DB work onto the dedicated worker thread.

## Code Members

### Member Index

#### Fields

- [lock](#member-1)
- [queue](#member-2)
- [thread](#member-3)
- [initialized](#member-4)
- [connection](#member-5)
- [request](#member-13)
- [handler](#member-14)

#### Methods

- [init()](#member-6)
- [public static <R extends WaypointResult> void submitRead(](#member-7)
- [public static <R extends WaypointResult> void submitWrite(](#member-8)
- [clear()](#member-9)
- [runLoop()](#member-10)
- [private static Connection connection() throws Exception](#member-11)
- [closeConnection()](#member-12)
- [Task(WaypointRequest<R> request, WaypointResultHandler<R> handler)](#member-15)
- [execute(Connection conn)](#member-16)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `lock`

- Description: TODO

<a id="member-2"></a>
##### `queue`

- Description: TODO

<a id="member-3"></a>
##### `thread`

- Description: TODO

<a id="member-4"></a>
##### `initialized`

- Description: TODO

<a id="member-5"></a>
##### `connection`

- Description: TODO

<a id="member-13"></a>
##### `request`

- Description: TODO

<a id="member-14"></a>
##### `handler`

- Description: TODO

#### Methods

<a id="member-6"></a>
##### `init()`

- Description: TODO

<a id="member-7"></a>
##### `public static <R extends WaypointResult> void submitRead(`

- Description: TODO

<a id="member-8"></a>
##### `public static <R extends WaypointResult> void submitWrite(`

- Description: TODO

<a id="member-9"></a>
##### `clear()`

- Description: TODO

<a id="member-10"></a>
##### `runLoop()`

- Description: TODO

<a id="member-11"></a>
##### `private static Connection connection() throws Exception`

- Description: TODO

<a id="member-12"></a>
##### `closeConnection()`

- Description: TODO

<a id="member-15"></a>
##### `Task(WaypointRequest<R> request, WaypointResultHandler<R> handler)`

- Description: TODO

<a id="member-16"></a>
##### `execute(Connection conn)`

- Description: TODO
