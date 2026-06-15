# BufferBGL

This file documents the responsibilities and members of `BufferBGL`.

## Meta

- Source: [BufferBGL.java](../../../../../src/haven/render/gl/BufferBGL.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides buffered GL command access.

## Nested Types

### Profile

- Description: TODO

## Members

### Constants

#### `public static final boolean DEBUG = false`

- Description: TODO

#### `public static final BufferBGL empty = new BufferBGL(0)`

- Description: TODO

### Fields

#### `private static Profile curprof = null`

- Description: TODO

#### `private Command[] list`

- Description: TODO

#### `private int n = 0`

- Description: TODO

#### `private double stime`

- Description: TODO

#### `private int n`

- Description: TODO

#### `private Command[] cmds = new Command[128]`

- Description: TODO

#### `private double[] times = new double[128]`

- Description: TODO

#### `public final Request start = gl ->`

- Description: TODO

#### `public final Request stop = gl ->`

- Description: TODO

### Methods

#### `public BufferBGL(int c)`

- Description: TODO

#### `public BufferBGL()`

- Description: TODO

#### `public void run(GL gl)`

- Description: TODO

#### `public void abort()`

- Description: TODO

#### `protected void add(Command cmd)`

- Description: TODO

#### `public BufferBGL trim()`

- Description: TODO

#### `protected Iterable<Command> dump()`

- Description: TODO

#### `private void register(Command cmd)`

- Description: TODO

#### `public void dump(PrintStream out)`

- Description: TODO

#### `public Request dump(Path out)`

- Description: TODO
