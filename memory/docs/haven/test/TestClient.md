# TestClient

This file documents the responsibilities and members of `TestClient`.

## Meta

- Source: [TestClient.java](../../../../src/haven/test/TestClient.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a Haven test helper for test client.

## Nested Types

### TestUI

- Role: Represents test ui within TestClient.
- Description: Describes the nested test ui type used by the enclosing class.

## Members

### Constants

### Fields

#### `public Session sess`
- Role: Stores the sess value.
- Description: Backs the cached state for this file.

#### `public InetSocketAddress addr`
- Role: Holds the addr state.
- Description: Backs the cached state for this file.

#### `public String user`
- Role: Stores the user value.
- Description: Backs the cached state for this file.

#### `public byte[] cookie`
- Role: Stores the cookie value.
- Description: Backs the cached state for this file.

#### `public ThreadGroup tg`
- Role: Holds the tg state.
- Description: Backs the cached state for this file.

#### `public Thread me`
- Role: Holds the me state.
- Description: Backs the cached state for this file.

#### `public UI ui`
- Role: Stores the UI value.
- Description: Backs the cached state for this file.

#### `public boolean loop = false`
- Role: Tracks the loop flag.
- Description: Supports the loop operation used by the surrounding class.

#### `public Collection<Robot> robots = new HashSet<Robot>()`
- Role: Caches robots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private static Object errsync = new Object()`
- Role: Holds the errsync state.
- Description: Backs the cached state for this file.

### Methods

#### `public TestClient(String user)`
- Role: Creates a new TestClient instance.
- Description: Constructs the instance and initializes its default state.

#### `public void connect() throws InterruptedException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.

#### `public void addbot(Robot bot)`
- Role: Performs addbot.
- Description: Supports the addbot operation used by the surrounding class.

#### `public void rembot(Robot bot)`
- Role: Performs rembot.
- Description: Supports the rembot operation used by the surrounding class.

#### `public void setmousepos(Coord c)`
- Role: Performs setmousepos.
- Description: Supports the setmousepos operation used by the surrounding class.

#### `public TestUI(Coord sz, Session sess)`
- Role: Performs test ui.
- Description: Supports the test ui operation used by the surrounding class.

#### `public void newwidgetp(int id, String type, int parent, Object[] pargs, Object... cargs) throws InterruptedException`
- Role: Handles the newwidgetp workflow.
- Description: Supports the newwidgetp operation used by the surrounding class.

#### `public void destroy(Widget w)`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void uimsg(int id, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void start()`
- Role: Starts the current workflow.
- Description: Supports the start operation used by the surrounding class.

#### `public void stop()`
- Role: Stops the current workflow.
- Description: Supports the stop operation used by the surrounding class.

#### `public boolean alive()`
- Role: Performs alive.
- Description: Supports the alive operation used by the surrounding class.

#### `public void join()`
- Role: Performs join.
- Description: Supports the join operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
