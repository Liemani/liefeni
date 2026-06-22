---
source: [Transport.java](../../../../src/haven/Transport.java)
created: 2026-06-13
updated: 2026-06-14
---

# Transport

Represents the transport Haven component.

## Members

### Constants

### Fields

#### `public final Writer out`
- Role: Caches the out value.
- Description: Caches the `out` value for reuse.

#### `private final double epoch`
- Role: Caches the epoch value.
- Description: Caches the `epoch` value for reuse.

#### `public final BufferedReader in`
- Role: Caches the in value.
- Description: Caches the `in` value for reuse.

#### `private final Collection<Callback> cbs = new ArrayList<>()`
- Role: Implements the cbs operation.
- Description: Implements the private final collection<callback> cbs = new array list<>() operation.

#### `private boolean closed = false`
- Role: Tracks whether closed is closed.
- Description: Boolean flag used to guard the surrounding lifecycle state.

### Methods

#### `public void close()`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public void queuemsg(PMessage pmsg)`
- Role: Handles the queuemsg path.
- Description: Implements the queuemsg operation.

#### `public void send(PMessage msg)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `public Transport add(Callback cb)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public default void closed()`
- Role: Handles the closed path.
- Description: Implements the closed operation.

#### `public default void handle(PMessage msg)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public default void handle(OCache.ObjDelta delta)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public default void mapdata(Message msg)`
- Role: Handles the mapdata path.
- Description: Implements the mapdata operation.

#### `public Recorder(Writer out)`
- Role: Handles the recorder path.
- Description: Implements the recorder operation.

#### `private void printf(String format, Object... args)`
- Role: Handles the printf path.
- Description: Implements the printf operation.

#### `public void closed()`
- Role: Handles the closed path.
- Description: Implements the closed operation.

#### `public void handle(PMessage msg)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public void handle(OCache.ObjDelta msg)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public void mapdata(Message msg)`
- Role: Handles the mapdata path.
- Description: Implements the mapdata operation.

#### `public Playback(Reader in)`
- Role: Handles the playback path.
- Description: Implements the playback operation.

#### `public Playback add(Callback cb)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void close()`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public void queuemsg(PMessage pmsg)`
- Role: Handles the queuemsg path.
- Description: Implements the queuemsg operation.

#### `public void send(PMessage msg)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `private String[] split(String text)`
- Role: Handles the split path.
- Description: Implements the split operation.

#### `private void play()`
- Role: Handles the play path.
- Description: Implements the play operation.

#### `public void start()`
- Role: Starts the current workflow.
- Description: Implements the start operation.