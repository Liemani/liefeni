---
source: [StreamOut.java](../../../../src/haven/StreamOut.java)
created: 2026-06-13
updated: 2026-06-14
---

# StreamOut

Represents the stream out Haven component.

## Members

### Constants

#### `public static final Config.Variable<Path> path = Config.Variable.propp("haven.streamout", "")`
- Role: Implements the path operation.
- Description: Implements the propp operation.
- Value: `Config.Variable.propp("haven.streamout", "")`

#### `public static final Config.Variable<Double> rate = Config.Variable.propf("haven.streamrate", null)`
- Role: Implements the rate operation.
- Description: Implements the propf operation.
- Value: `Config.Variable.propf("haven.streamrate", null)`

### Fields

#### `public final WritableByteChannel out`
- Role: Caches the out value.
- Description: Caches the `out` value for reuse.

#### `public final Coord sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private final Queue<ByteBuffer> free = new LinkedList<>()`
- Role: Implements the free operation.
- Description: Implements the private final queue<byte buffer> free = new linked list<>() operation.

#### `private ByteBuffer obuf = null`
- Role: Caches the obuf value.
- Description: Caches the `obuf` value for reuse.

#### `private Thread ot = null`
- Role: Caches the ot value.
- Description: Caches the `ot` value for reuse.

#### `private boolean running = true`
- Role: Tracks the running flag.
- Description: Caches the `running` value for reuse.

### Methods

#### `public StreamOut(Coord sz, WritableByteChannel out)`
- Role: Creates a new StreamOut instance.
- Description: Constructs the StreamOut instance from the supplied inputs.

#### `public StreamOut(Coord sz, Path out) throws IOException`
- Role: Creates a new StreamOut instance.
- Description: Constructs the StreamOut instance from the supplied inputs.

#### `private void writeframe(ByteBuffer data)`
- Role: Handles the writeframe path.
- Description: Implements the writeframe operation.

#### `private void uoutput()`
- Role: Handles the uoutput path.
- Description: Implements the uoutput operation.

#### `private void routput(double rate)`
- Role: Handles the routput path.
- Description: Implements the routput operation.

#### `private void output()`
- Role: Handles the output path.
- Description: Implements the output operation.

#### `private void fin(ByteBuffer buf)`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `public void accept(Render g, Pipe state)`
- Role: Handles the accept path.
- Description: Records the widget that accepted the current event.

#### `public void close()`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.