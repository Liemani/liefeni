# StreamOut

This file documents the responsibilities and members of `StreamOut`.

## Meta

- Source: [StreamOut.java](../../../src/haven/StreamOut.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the stream out Haven component.

## Members

### Constants

#### `public static final Config.Variable<Path> path = Config.Variable.propp("haven.streamout", "")`
- Role: Defines the shared path constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Double> rate = Config.Variable.propf("haven.streamrate", null)`
- Role: Defines the shared rate constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final WritableByteChannel out`
- Role: Stores the out value.
- Description: Backs the cached state for this file.

#### `public final Coord sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private final Queue<ByteBuffer> free = new LinkedList<>()`
- Role: Caches free entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private ByteBuffer obuf = null`
- Role: Stores the obuf value.
- Description: Backs the cached state for this file.

#### `private Thread ot = null`
- Role: Holds the ot state.
- Description: Backs the cached state for this file.

#### `private boolean running = true`
- Role: Tracks the running flag.
- Description: Supports the running operation used by the surrounding class.

### Methods

#### `public StreamOut(Coord sz, WritableByteChannel out)`
- Role: Creates a new StreamOut instance.
- Description: Constructs the instance and initializes its default state.

#### `public StreamOut(Coord sz, Path out) throws IOException`
- Role: Creates a new StreamOut instance.
- Description: Constructs the instance and initializes its default state.

#### `private void writeframe(ByteBuffer data)`
- Role: Performs writeframe.
- Description: Supports the writeframe operation used by the surrounding class.

#### `private void uoutput()`
- Role: Performs uoutput.
- Description: Supports the uoutput operation used by the surrounding class.

#### `private void routput(double rate)`
- Role: Performs routput.
- Description: Supports the routput operation used by the surrounding class.

#### `private void output()`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `private void fin(ByteBuffer buf)`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public void accept(Render g, Pipe state)`
- Role: Performs accept.
- Description: Supports the accept operation used by the surrounding class.

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.
