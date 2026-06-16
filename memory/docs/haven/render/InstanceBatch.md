# InstanceBatch

This file documents the responsibilities and members of `InstanceBatch`.

## Meta

- Source: [InstanceBatch.java](../../../../src/haven/render/InstanceBatch.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the instance batch render pipeline component.

## Members

### Constants

### Fields

#### `public final InstanceBatch bat`
- Role: Holds the bat state.
- Description: Backs the cached state for this file.

#### `public final Input[] fmt`
- Role: Holds the fmt state.
- Description: Backs the cached state for this file.

#### `private int bufsz, minupd = -1, maxupd = -1`
- Role: Stores the minupd value.
- Description: Backs the cached state for this file.

#### `private int bufsz, minupd = -1, maxupd = -1`
- Role: Stores the minupd value.
- Description: Backs the cached state for this file.

#### `private int bufsz, minupd = -1, maxupd = -1`
- Role: Stores the minupd value.
- Description: Backs the cached state for this file.

#### `private VertexArray.Buffer buf = null`
- Role: Caches buf entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Environment curenv`
- Role: Holds the curenv state.
- Description: Backs the cached state for this file.

### Methods

#### `public State.Slot<?>[] batchstates()`
- Role: Performs batchstates.
- Description: Supports the batchstates operation used by the surrounding class.

#### `public <T extends State> T batchstate(State.Slot<T> slot)`
- Role: Performs batchstate.
- Description: Supports the batchstate operation used by the surrounding class.

#### `public int instances()`
- Role: Performs instances.
- Description: Supports the instances operation used by the surrounding class.

#### `public Pipe inststate(int inst)`
- Role: Performs inststate.
- Description: Supports the inststate operation used by the surrounding class.

#### `public void instupdate()`
- Role: Performs instupdate.
- Description: Supports the instupdate operation used by the surrounding class.

#### `public <T extends State> void update(State.Slot<? super T> slot, T state)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void iupdate(int idx)`
- Role: Performs iupdate.
- Description: Supports the iupdate operation used by the surrounding class.

#### `public void itrim(int max)`
- Role: Performs itrim.
- Description: Supports the itrim operation used by the surrounding class.

#### `public void commit(Render g)`
- Role: Performs commit.
- Description: Supports the commit operation used by the surrounding class.

#### `public InstancedAttribute[] attribs()`
- Role: Performs attribs.
- Description: Supports the attribs operation used by the surrounding class.

#### `public AttributeData(InstanceBatch bat)`
- Role: Performs attribute data.
- Description: Supports the attribute data operation used by the surrounding class.

#### `public FillBuffer fill(VertexArray.Buffer dst, Environment env, int from, int to)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public int stride()`
- Role: Performs stride.
- Description: Supports the stride operation used by the surrounding class.

#### `public VertexArray.Buffer buf()`
- Role: Performs buf.
- Description: Supports the buf operation used by the surrounding class.

#### `public void commit(Render g)`
- Role: Performs commit.
- Description: Supports the commit operation used by the surrounding class.

#### `public boolean iupdate(int idx)`
- Role: Performs iupdate.
- Description: Supports the iupdate operation used by the surrounding class.

#### `public boolean itrim(int idx)`
- Role: Performs itrim.
- Description: Supports the itrim operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
