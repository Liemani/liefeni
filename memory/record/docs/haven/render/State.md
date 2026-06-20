---
source: [State.java](../../../../src/haven/render/State.java)
created: 2026-06-13
updated: 2026-06-14
---

# State

Defines the state render pipeline component.

## Nested Types

### Instancable

- Role: Represents instancable within State.
- Description: Describes the nested instancable type used by the enclosing class.

### Instancer

- Role: Represents instancer within State.
- Description: Describes the nested instancer type used by the enclosing class.

### Slot

- Role: Represents slot within State.
- Description: Describes the nested slot type used by the enclosing class.

### Slots

- Role: Represents slots within State.
- Description: Describes the nested slots type used by the enclosing class.

### StandAlone

- Role: Represents stand alone within State.
- Description: Describes the nested stand alone type used by the enclosing class.

### Type

- Role: Represents type within State.
- Description: Describes the nested type type used by the enclosing class.

## Members

### Constants

#### `public static final ShaderMacro mkinstanced = prog ->`
- Role: Defines the shared mkinstanced constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `static Slots slots = new Slots(new Slot<?>[0])`
- Role: Holds the slots state.
- Description: Backs the cached state for this file.

#### `public final Type type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Class<T> scl`
- Role: Holds the scl state.
- Description: Backs the cached state for this file.

#### `private int depid = -1`
- Role: Stores the depid value.
- Description: Backs the cached state for this file.

#### `public Instancable<T> instanced`
- Role: Holds the instanced state.
- Description: Backs the cached state for this file.

#### `public final Slot<?>[] idlist`
- Role: Holds the idlist state.
- Description: Backs the cached state for this file.

#### `public final Pipe.Op nil = p -> p.put(this, null)`
- Role: Holds the nil state.
- Description: Backs the cached state for this file.

#### `public final Slot<StandAlone> slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

### Methods

#### `public Slots(Slot<?>[] idlist)`
- Role: Performs slots.
- Description: Supports the slots operation used by the surrounding class.

#### `public Slot(Type type, Class<T> scl)`
- Role: Performs slot.
- Description: Supports the slot operation used by the surrounding class.

#### `public Slot<T> instanced(Instancable<T> inst)`
- Role: Performs instanced.
- Description: Supports the instanced operation used by the surrounding class.

#### `public static Slot<?> byid(int id)`
- Role: Performs byid.
- Description: Supports the byid operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static int numslots()`
- Role: Performs numslots.
- Description: Supports the numslots operation used by the surrounding class.

#### `public T inststate(T uinst, InstanceBatch batch)`
- Role: Performs inststate.
- Description: Supports the inststate operation used by the surrounding class.

#### `public static <S extends State> Instancer<S> dummy()`
- Role: Performs dummy.
- Description: Supports the dummy operation used by the surrounding class.

#### `public Instancer<T> instid(T uinst)`
- Role: Performs instid.
- Description: Supports the instid operation used by the surrounding class.

#### `public static <S extends State> Instancable<S> dummy()`
- Role: Performs dummy.
- Description: Supports the dummy operation used by the surrounding class.

#### `public abstract ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public StandAlone(Slot.Type type)`
- Role: Performs stand alone.
- Description: Supports the stand alone operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
