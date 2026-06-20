---
source: [BufferBGL.java](../../../../../src/haven/render/gl/BufferBGL.java)
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
- Role: Defines the shared debug constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BufferBGL empty = new BufferBGL(0)`
- Role: Defines the shared empty constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static Profile curprof = null`
- Role: Stores the curprof value.
- Description: Backs the cached state for this file.

#### `private Command[] list`
- Role: Holds the list state.
- Description: Backs the cached state for this file.

#### `private int n = 0`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private double stime`
- Role: Stores the stime value.
- Description: Backs the cached state for this file.

#### `private int n`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private Command[] cmds = new Command[128]`
- Role: Holds the cmds state.
- Description: Backs the cached state for this file.

#### `private double[] times = new double[128]`
- Role: Stores the times value.
- Description: Backs the cached state for this file.

#### `public final Request start = gl ->`
- Role: Holds the start state.
- Description: Backs the cached state for this file.

#### `public final Request stop = gl ->`
- Role: Holds the stop state.
- Description: Backs the cached state for this file.

### Methods

#### `public BufferBGL(int c)`
- Role: Creates a new BufferBGL instance.
- Description: Constructs the instance and initializes its default state.

#### `public BufferBGL()`
- Role: Creates a new BufferBGL instance.
- Description: Constructs the instance and initializes its default state.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void abort()`
- Role: Performs abort.
- Description: Supports the abort operation used by the surrounding class.

#### `protected void add(Command cmd)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public BufferBGL trim()`
- Role: Performs trim.
- Description: Supports the trim operation used by the surrounding class.

#### `protected Iterable<Command> dump()`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `private void register(Command cmd)`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `public void dump(PrintStream out)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public Request dump(Path out)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.
