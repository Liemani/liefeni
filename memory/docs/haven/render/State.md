# State

This file documents the responsibilities and members of `State`.

## Meta

- Source: [State.java](../../../../src/haven/render/State.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a render state.

## Nested Types

### Instancable

- Description: TODO

### Instancer

- Description: TODO

### Slot

- Description: TODO

### Slots

- Description: TODO

### StandAlone

- Description: TODO

### Type

- Description: TODO

## Members

### Constants

#### `public static final ShaderMacro mkinstanced = prog ->`

- Description: TODO

### Fields

#### `static Slots slots = new Slots(new Slot<?>[0])`

- Description: TODO

#### `public final Type type`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final Class<T> scl`

- Description: TODO

#### `private int depid = -1`

- Description: TODO

#### `public Instancable<T> instanced`

- Description: TODO

#### `public final Slot<?>[] idlist`

- Description: TODO

#### `public final Pipe.Op nil = p -> p.put(this, null)`

- Description: TODO

#### `public final Slot<StandAlone> slot`

- Description: TODO

### Methods

#### `public Slots(Slot<?>[] idlist)`

- Description: TODO

#### `public Slot(Type type, Class<T> scl)`

- Description: TODO

#### `public Slot<T> instanced(Instancable<T> inst)`

- Description: TODO

#### `public static Slot<?> byid(int id)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public static int numslots()`

- Description: TODO

#### `public T inststate(T uinst, InstanceBatch batch)`

- Description: TODO

#### `public static <S extends State> Instancer<S> dummy()`

- Description: TODO

#### `public Instancer<T> instid(T uinst)`

- Description: TODO

#### `public static <S extends State> Instancable<S> dummy()`

- Description: TODO

#### `public abstract ShaderMacro shader()`

- Description: TODO

#### `public StandAlone(Slot.Type type)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO
