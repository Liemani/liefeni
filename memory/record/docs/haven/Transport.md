---
source: [Transport.java](../../../src/haven/Transport.java)
created: 2026-06-13
updated: 2026-06-14
---

# Transport

Represents the transport Haven component.

## Members

### Constants

### Fields

#### `public final Writer out`
- Role: Holds the out state.
- Description: Backs the cached state for this file.

#### `private final double epoch`
- Role: Stores the epoch value.
- Description: Backs the cached state for this file.

#### `public final BufferedReader in`
- Role: Stores the in value.
- Description: Backs the cached state for this file.

#### `private final Collection<Callback> cbs = new ArrayList<>()`
- Role: Caches cbs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean closed = false`
- Role: Tracks whether closed is closed.
- Description: Boolean flag used to guard the surrounding lifecycle state.

### Methods

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public void queuemsg(PMessage pmsg)`
- Role: Performs queuemsg.
- Description: Supports the queuemsg operation used by the surrounding class.

#### `public void send(PMessage msg)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `public Transport add(Callback cb)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public default void closed()`
- Role: Performs closed.
- Description: Supports the closed operation used by the surrounding class.

#### `public default void handle(PMessage msg)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public default void handle(OCache.ObjDelta delta)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public default void mapdata(Message msg)`
- Role: Performs mapdata.
- Description: Supports the mapdata operation used by the surrounding class.

#### `public Recorder(Writer out)`
- Role: Performs recorder.
- Description: Supports the recorder operation used by the surrounding class.

#### `private void printf(String format, Object... args)`
- Role: Performs printf.
- Description: Supports the printf operation used by the surrounding class.

#### `public void closed()`
- Role: Performs closed.
- Description: Supports the closed operation used by the surrounding class.

#### `public void handle(PMessage msg)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public void handle(OCache.ObjDelta msg)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public void mapdata(Message msg)`
- Role: Performs mapdata.
- Description: Supports the mapdata operation used by the surrounding class.

#### `public Playback(Reader in)`
- Role: Performs playback.
- Description: Supports the playback operation used by the surrounding class.

#### `public Playback add(Callback cb)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public void queuemsg(PMessage pmsg)`
- Role: Performs queuemsg.
- Description: Supports the queuemsg operation used by the surrounding class.

#### `public void send(PMessage msg)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `private String[] split(String text)`
- Role: Performs split.
- Description: Supports the split operation used by the surrounding class.

#### `private void play()`
- Role: Performs play.
- Description: Supports the play operation used by the surrounding class.

#### `public void start()`
- Role: Starts the current workflow.
- Description: Supports the start operation used by the surrounding class.
