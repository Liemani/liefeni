# InstanceBatch

This file documents the responsibilities and members of `InstanceBatch`.

## Meta

- Source: [InstanceBatch.java](../../../../src/haven/render/InstanceBatch.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an instance batch.

## Members

### Constants

### Fields

#### `public final InstanceBatch bat`

- Description: TODO

#### `public final Input[] fmt`

- Description: TODO

#### `private int bufsz, minupd = -1, maxupd = -1`

- Description: TODO

#### `private int bufsz, minupd = -1, maxupd = -1`

- Description: TODO

#### `private int bufsz, minupd = -1, maxupd = -1`

- Description: TODO

#### `private VertexArray.Buffer buf = null`

- Description: TODO

#### `private Environment curenv`

- Description: TODO

### Methods

#### `public State.Slot<?>[] batchstates()`

- Description: TODO

#### `public <T extends State> T batchstate(State.Slot<T> slot)`

- Description: TODO

#### `public int instances()`

- Description: TODO

#### `public Pipe inststate(int inst)`

- Description: TODO

#### `public void instupdate()`

- Description: TODO

#### `public <T extends State> void update(State.Slot<? super T> slot, T state)`

- Description: TODO

#### `public void iupdate(int idx)`

- Description: TODO

#### `public void itrim(int max)`

- Description: TODO

#### `public void commit(Render g)`

- Description: TODO

#### `public InstancedAttribute[] attribs()`

- Description: TODO

#### `public AttributeData(InstanceBatch bat)`

- Description: TODO

#### `public FillBuffer fill(VertexArray.Buffer dst, Environment env, int from, int to)`

- Description: TODO

#### `public int stride()`

- Description: TODO

#### `public VertexArray.Buffer buf()`

- Description: TODO

#### `public void commit(Render g)`

- Description: TODO

#### `public boolean iupdate(int idx)`

- Description: TODO

#### `public boolean itrim(int idx)`

- Description: TODO

#### `public void dispose()`

- Description: TODO
