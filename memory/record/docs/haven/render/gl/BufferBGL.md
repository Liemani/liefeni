---
source: [BufferBGL.java](../../../../../../src/haven/render/gl/BufferBGL.java)
created: 2026-06-13
updated: 2026-06-14
---

# BufferBGL

Provides GL backend support for buffer bgl.

## Nested Types

### Profile

- Role: Represents profile within BufferBGL.
- Description: Describes the nested profile type used by the enclosing class.

## Members

### Constants

#### `public static final boolean DEBUG = false`
- Role: Caches the debug value.
- Description: Caches the `DEBUG` value for reuse.
- Value: `false`

#### `public static final BufferBGL empty = new BufferBGL(0)`
- Role: Implements the empty operation.
- Description: Implements the buffer bgl operation.
- Value: `new BufferBGL(0)`

### Fields

#### `private static Profile curprof = null`
- Role: Caches the curprof value.
- Description: Caches the `curprof` value for reuse.

#### `private Command[] list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `private int n = 0`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private double stime`
- Role: Caches the stime value.
- Description: Caches the `stime` value for reuse.

#### `private int n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private Command[] cmds = new Command[128]`
- Role: Caches the cmds value.
- Description: Caches the `cmds` value for reuse.

#### `private double[] times = new double[128]`
- Role: Caches the times value.
- Description: Caches the `times` value for reuse.

#### `public final Request start = gl ->`
- Role: Caches the start value.
- Description: Caches the `start` value for reuse.

#### `public final Request stop = gl ->`
- Role: Caches the stop value.
- Description: Caches the `stop` value for reuse.

### Methods

#### `public BufferBGL(int c)`
- Role: Creates a new BufferBGL instance.
- Description: Constructs the BufferBGL instance from the supplied inputs.

#### `public BufferBGL()`
- Role: Creates a new BufferBGL instance.
- Description: Constructs the BufferBGL instance from the supplied inputs.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void abort()`
- Role: Handles the abort path.
- Description: Implements the abort operation.

#### `protected void add(Command cmd)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public BufferBGL trim()`
- Role: Handles the trim path.
- Description: Implements the trim operation.

#### `protected Iterable<Command> dump()`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `private void register(Command cmd)`
- Role: Handles the register path.
- Description: Implements the register operation.

#### `public void dump(PrintStream out)`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public Request dump(Path out)`
- Role: Handles the dump path.
- Description: Implements the dump operation.