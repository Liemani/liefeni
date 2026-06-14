# InstanceBatch

## Meta

- Source: [InstanceBatch.java](../../../../src/haven/render/InstanceBatch.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents an instance batch.

## Code Members

### Member Index

#### Fields

- [bat](#member-11)
- [fmt](#member-12)
- [bufsz](#member-13)
- [minupd](#member-14)
- [maxupd](#member-15)
- [buf](#member-16)
- [curenv](#member-17)

#### Methods

- [public State.Slot<?>[] batchstates();](#member-1)
- [public <T extends State> T batchstate(State.Slot<T> slot);](#member-2)
- [public int instances();](#member-3)
- [public Pipe inststate(int inst);](#member-4)
- [public void instupdate();](#member-5)
- [public <T extends State> void update(State.Slot<? super T> slot, T state);](#member-6)
- [public void iupdate(int idx);](#member-7)
- [public void itrim(int max);](#member-8)
- [public void commit(Render g);](#member-9)
- [public InstancedAttribute[] attribs();](#member-10)
- [AttributeData(InstanceBatch bat)](#member-18)
- [fill(VertexArray.Buffer dst, Environment env, int from, int to)](#member-19)
- [stride()](#member-20)
- [buf()](#member-21)
- [commit(Render g)](#member-22)
- [iupdate(int idx)](#member-23)
- [itrim(int idx)](#member-24)
- [dispose()](#member-25)

### Member Reference

#### Fields

<a id="member-11"></a>
##### `bat`

- Description: TODO

<a id="member-12"></a>
##### `fmt`

- Description: TODO

<a id="member-13"></a>
##### `bufsz`

- Description: TODO

<a id="member-14"></a>
##### `minupd`

- Description: TODO

<a id="member-15"></a>
##### `maxupd`

- Description: TODO

<a id="member-16"></a>
##### `buf`

- Description: TODO

<a id="member-17"></a>
##### `curenv`

- Description: TODO

#### Methods

<a id="member-1"></a>
##### `public State.Slot<?>[] batchstates();`

- Description: TODO

<a id="member-2"></a>
##### `public <T extends State> T batchstate(State.Slot<T> slot);`

- Description: TODO

<a id="member-3"></a>
##### `public int instances();`

- Description: TODO

<a id="member-4"></a>
##### `public Pipe inststate(int inst);`

- Description: TODO

<a id="member-5"></a>
##### `public void instupdate();`

- Description: TODO

<a id="member-6"></a>
##### `public <T extends State> void update(State.Slot<? super T> slot, T state);`

- Description: TODO

<a id="member-7"></a>
##### `public void iupdate(int idx);`

- Description: TODO

<a id="member-8"></a>
##### `public void itrim(int max);`

- Description: TODO

<a id="member-9"></a>
##### `public void commit(Render g);`

- Description: TODO

<a id="member-10"></a>
##### `public InstancedAttribute[] attribs();`

- Description: TODO

<a id="member-18"></a>
##### `AttributeData(InstanceBatch bat)`

- Description: TODO

<a id="member-19"></a>
##### `fill(VertexArray.Buffer dst, Environment env, int from, int to)`

- Description: TODO

<a id="member-20"></a>
##### `stride()`

- Description: TODO

<a id="member-21"></a>
##### `buf()`

- Description: TODO

<a id="member-22"></a>
##### `commit(Render g)`

- Description: TODO

<a id="member-23"></a>
##### `iupdate(int idx)`

- Description: TODO

<a id="member-24"></a>
##### `itrim(int idx)`

- Description: TODO

<a id="member-25"></a>
##### `dispose()`

- Description: TODO
