# Transport

This file documents the responsibilities and members of `Transport`.

## Meta

- Source: [Transport.java](../../../src/haven/Transport.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents transport or movement state.

## Members

### Constants

### Fields

#### `public final Writer out`

- Description: TODO

#### `private final double epoch`

- Description: TODO

#### `public final BufferedReader in`

- Description: TODO

#### `private final Collection<Callback> cbs = new ArrayList<>()`

- Description: TODO

#### `private boolean closed = false`

- Description: TODO

### Methods

#### `public void close()`

- Description: TODO

#### `public void queuemsg(PMessage pmsg)`

- Description: TODO

#### `public void send(PMessage msg)`

- Description: TODO

#### `public Transport add(Callback cb)`

- Description: TODO

#### `public default void closed()`

- Description: TODO

#### `public default void handle(PMessage msg)`

- Description: TODO

#### `public default void handle(OCache.ObjDelta delta)`

- Description: TODO

#### `public default void mapdata(Message msg)`

- Description: TODO

#### `public Recorder(Writer out)`

- Description: TODO

#### `private void printf(String format, Object... args)`

- Description: TODO

#### `public void closed()`

- Description: TODO

#### `public void handle(PMessage msg)`

- Description: TODO

#### `public void handle(OCache.ObjDelta msg)`

- Description: TODO

#### `public void mapdata(Message msg)`

- Description: TODO

#### `public Playback(Reader in)`

- Description: TODO

#### `public Playback add(Callback cb)`

- Description: TODO

#### `public void close()`

- Description: TODO

#### `public void queuemsg(PMessage pmsg)`

- Description: TODO

#### `public void send(PMessage msg)`

- Description: TODO

#### `private String[] split(String text)`

- Description: TODO

#### `private void play()`

- Description: TODO

#### `public void start()`

- Description: TODO
