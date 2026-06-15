# StreamOut

This file documents the responsibilities and members of `StreamOut`.

## Meta

- Source: [StreamOut.java](../../../src/haven/StreamOut.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Writes stream content out.

## Members

### Constants

#### `public static final Config.Variable<Path> path = Config.Variable.propp("haven.streamout", "")`

- Description: TODO

#### `public static final Config.Variable<Double> rate = Config.Variable.propf("haven.streamrate", null)`

- Description: TODO

### Fields

#### `public final WritableByteChannel out`

- Description: TODO

#### `public final Coord sz`

- Description: TODO

#### `private final Queue<ByteBuffer> free = new LinkedList<>()`

- Description: TODO

#### `private ByteBuffer obuf = null`

- Description: TODO

#### `private Thread ot = null`

- Description: TODO

#### `private boolean running = true`

- Description: TODO

### Methods

#### `public StreamOut(Coord sz, WritableByteChannel out)`

- Description: TODO

#### `public StreamOut(Coord sz, Path out) throws IOException`

- Description: TODO

#### `private void writeframe(ByteBuffer data)`

- Description: TODO

#### `private void uoutput()`

- Description: TODO

#### `private void routput(double rate)`

- Description: TODO

#### `private void output()`

- Description: TODO

#### `private void fin(ByteBuffer buf)`

- Description: TODO

#### `public void accept(Render g, Pipe state)`

- Description: TODO

#### `public void close()`

- Description: TODO
