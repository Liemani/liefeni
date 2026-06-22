---
source: [TestClient.java](../../../../../src/haven/test/TestClient.java)
created: 2026-06-13
updated: 2026-06-14
---

# TestClient

Provides a Haven test helper for test client.

## Nested Types

### TestUI

- Role: Represents test ui within TestClient.
- Description: Describes the nested test ui type used by the enclosing class.

## Members

### Constants

### Fields

#### `public Session sess`
- Role: Caches the sess value.
- Description: Caches the `sess` value for reuse.

#### `public InetSocketAddress addr`
- Role: Caches the addr value.
- Description: Caches the `addr` value for reuse.

#### `public String user`
- Role: Caches the user value.
- Description: Caches the `user` value for reuse.

#### `public byte[] cookie`
- Role: Caches the cookie value.
- Description: Caches the `cookie` value for reuse.

#### `public ThreadGroup tg`
- Role: Caches the tg value.
- Description: Caches the `tg` value for reuse.

#### `public Thread me`
- Role: Caches the me value.
- Description: Caches the `me` value for reuse.

#### `public UI ui`
- Role: Caches the active Haven UI instance.
- Description: Caches the active Haven UI instance.

#### `public boolean loop = false`
- Role: Tracks the loop flag.
- Description: Caches the `loop` value for reuse.

#### `public Collection<Robot> robots = new HashSet<Robot>()`
- Role: Implements the robots operation.
- Description: Implements the public collection<robot> robots = new hash set<robot>() operation.

#### `private static Object errsync = new Object()`
- Role: Implements the errsync operation.
- Description: Implements the object operation.

### Methods

#### `public TestClient(String user)`
- Role: Creates a new TestClient instance.
- Description: Constructs the TestClient instance from the supplied inputs.

#### `public void connect() throws InterruptedException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.

#### `public void addbot(Robot bot)`
- Role: Handles the addbot path.
- Description: Adds the bot.

#### `public void rembot(Robot bot)`
- Role: Handles the rembot path.
- Description: Implements the rembot operation.

#### `public void setmousepos(Coord c)`
- Role: Handles the setmousepos path.
- Description: Updates the mousepos.

#### `public TestUI(Coord sz, Session sess)`
- Role: Handles the test UI path.
- Description: Implements the test ui operation.

#### `public void newwidgetp(int id, String type, int parent, Object[] pargs, Object... cargs) throws InterruptedException`
- Role: Handles the newwidgetp workflow.
- Description: Implements the newwidgetp operation.

#### `public void destroy(Widget w)`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.

#### `public void uimsg(int id, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void start()`
- Role: Starts the current workflow.
- Description: Implements the start operation.

#### `public void stop()`
- Role: Stops the current workflow.
- Description: Implements the stop operation.

#### `public boolean alive()`
- Role: Handles the alive path.
- Description: Implements the alive operation.

#### `public void join()`
- Role: Handles the join path.
- Description: Implements the join operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this TestClient for debugging and logging.