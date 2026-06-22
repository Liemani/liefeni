---
source: [InstanceBatch.java](../../../../../src/haven/render/InstanceBatch.java)
created: 2026-06-13
updated: 2026-06-14
---

# InstanceBatch

Defines the instance batch render pipeline component.

## Members

### Constants

### Fields

#### `public final InstanceBatch bat`
- Role: Owns the backing batch.
- Description: Refers to the batch instance that provides instancing data.

#### `public final Input[] fmt`
- Role: Describes the instance input layout.
- Description: Lists the vertex-array inputs needed for per-instance attributes.

#### `private int bufsz, minupd = -1, maxupd = -1`
- Role: Tracks the update range.
- Description: Records the active upload window inside the instance buffer.

#### `private int bufsz, minupd = -1, maxupd = -1`
- Role: Caches the minupd value.
- Description: Caches the `minupd` value for reuse.

#### `private int bufsz, minupd = -1, maxupd = -1`
- Role: Caches the minupd value.
- Description: Caches the `minupd` value for reuse.

#### `private VertexArray.Buffer buf = null`
- Role: Caches the uploaded instance buffer.
- Description: Reuses the vertex-array buffer backing the current batch.

#### `private Environment curenv`
- Role: Remembers the last environment.
- Description: Keeps the environment used to validate buffer compatibility.

### Methods

#### `public State.Slot<?>[] batchstates()`
- Role: Handles the batchstates path.
- Description: Implements the batchstates operation.

#### `public <T extends State> T batchstate(State.Slot<T> slot)`
- Role: Handles the batchstate path.
- Description: Implements the batchstate operation.

#### `public int instances()`
- Role: Handles the instances path.
- Description: Implements the instances operation.

#### `public Pipe inststate(int inst)`
- Role: Handles the inststate path.
- Description: Implements the inststate operation.

#### `public void instupdate()`
- Role: Handles the instupdate path.
- Description: Implements the instupdate operation.

#### `public <T extends State> void update(State.Slot<? super T> slot, T state)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void iupdate(int idx)`
- Role: Handles the iupdate path.
- Description: Implements the iupdate operation.

#### `public void itrim(int max)`
- Role: Handles the itrim path.
- Description: Implements the itrim operation.

#### `public void commit(Render g)`
- Role: Handles the commit path.
- Description: Implements the commit operation.

#### `public InstancedAttribute[] attribs()`
- Role: Handles the attribs path.
- Description: Implements the attribs operation.

#### `public AttributeData(InstanceBatch bat)`
- Role: Handles the attribute data path.
- Description: Implements the attribute data operation.

#### `public FillBuffer fill(VertexArray.Buffer dst, Environment env, int from, int to)`
- Role: Handles the fill path.
- Description: Implements the fill operation.

#### `public int stride()`
- Role: Handles the stride path.
- Description: Implements the stride operation.

#### `public VertexArray.Buffer buf()`
- Role: Handles the buffer path.
- Description: Implements the buf operation.

#### `public void commit(Render g)`
- Role: Handles the commit path.
- Description: Implements the commit operation.

#### `public boolean iupdate(int idx)`
- Role: Handles the iupdate path.
- Description: Implements the iupdate operation.

#### `public boolean itrim(int idx)`
- Role: Handles the itrim path.
- Description: Implements the itrim operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.