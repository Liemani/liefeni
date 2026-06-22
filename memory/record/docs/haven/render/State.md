---
source: [State.java](../../../../../src/haven/render/State.java)
created: 2026-06-13
updated: 2026-06-14
---

# State

Defines the state render pipeline component.

## Nested Types

### Instancable

- Role: Describes instanced state binding.
- Description: Creates state values for per-instance rendering.

### Instancer

- Role: Builds instanced state values.
- Description: Produces the per-instance state object for a slot.

### Slot

- Role: Identifies one render state slot.
- Description: Defines where a state lives and how it is indexed.

### Slots

- Role: Stores the global slot registry.
- Description: Tracks all declared state slots in creation order.

### StandAlone

- Role: Describes a standalone render state.
- Description: Provides a state slot that can be applied directly.

### Type

- Role: Groups state by binding class.
- Description: Classifies slots by when and how they participate in rendering.

## Members

### Constants

#### `public static final ShaderMacro mkinstanced = prog ->`
- Role: Builds the instanced-state shader helper.
- Description: Shared macro that wires up instance-state support.
- Value: `prog ->`

### Fields

#### `static Slots slots = new Slots(new Slot<?>[0])`
- Role: Implements the slots operation.
- Description: Implements the slots operation.

#### `public final Type type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Class<T> scl`
- Role: Caches the scl value.
- Description: Caches the `scl` value for reuse.

#### `private int depid = -1`
- Role: Caches the depid value.
- Description: Caches the `depid` value for reuse.

#### `public Instancable<T> instanced`
- Role: Caches the instanced value.
- Description: Caches the `instanced` value for reuse.

#### `public final Slot<?>[] idlist`
- Role: Caches the idlist value.
- Description: Caches the `idlist` value for reuse.

#### `public final Pipe.Op nil = p -> p.put(this, null)`
- Role: Implements the nil operation.
- Description: Implements the put operation.

#### `public final Slot<StandAlone> slot`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

### Methods

#### `public Slots(Slot<?>[] idlist)`
- Role: Stores the slot registry.
- Description: Captures the current global slot list.

#### `public Slot(Type type, Class<T> scl)`
- Role: Creates one render-state slot.
- Description: Registers the slot type and backing state class.

#### `public Slot<T> instanced(Instancable<T> inst)`
- Role: Attaches instanced state.
- Description: Links a slot to its instanced state provider.

#### `public static Slot<?> byid(int id)`
- Role: Looks up a slot by id.
- Description: Returns the slot registered for the given numeric id.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this State for debugging and logging.

#### `public static int numslots()`
- Role: Returns the number of slots.
- Description: Reports how many render-state slots exist globally.

#### `public T inststate(T uinst, InstanceBatch batch)`
- Role: Builds the instance state value.
- Description: Resolves the per-instance value for this slot.

#### `public static <S extends State> Instancer<S> dummy()`
- Role: Returns a no-op instancer.
- Description: Provides a default instancer for states that need no instance data.

#### `public Instancer<T> instid(T uinst)`
- Role: Returns the slot instancer.
- Description: Exposes the instanced-state provider for this slot.

#### `public static <S extends State> Instancable<S> dummy()`
- Role: Returns a no-op instancable.
- Description: Provides a default instancable for states that need no instance data.

#### `public abstract ShaderMacro shader()`
- Role: Returns the shader macro.
- Description: Exposes the macro needed to register this state.

#### `public StandAlone(Slot.Type type)`
- Role: Builds a standalone state slot.
- Description: Creates a slot that can be applied without an enclosing state class.

#### `public void apply(Pipe p)`
- Role: Applies state to a pipe.
- Description: Writes this state instance into the current render pipe.