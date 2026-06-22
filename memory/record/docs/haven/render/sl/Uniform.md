---
source: [Uniform.java](../../../../../../src/haven/render/sl/Uniform.java)
created: 2026-06-13
updated: 2026-06-20
---

# Uniform

Represents a shader uniform whose value is resolved from the current render pipe.

## Nested Types

### Data<T>
Pairs a value supplier with the render slots that it depends on.

#### Members

##### Fields

#### `public final Function<Pipe, T> value`
- Role: Stores the value supplier.
- Description: Used when populating the uniform at render time.

#### `public final State.Slot<?>[] deps`
- Role: Stores the dependency slots.
- Description: Used to track which render states affect the value.

##### Methods

#### `public Data(Function<Pipe, T> value, State.Slot<?>... deps)`
- Role: Builds a uniform-data record.
- Description: Stores the supplier and its dependency list.

## Members

### Fields

#### `public final Function<Pipe, Object> value`
- Role: Supplies the runtime uniform value.
- Description: Read from the current render pipe.

#### `public final Collection<State.Slot<?>> deps`
- Role: Lists render-state dependencies.
- Description: Used to declare which states affect the value.

### Methods

#### `public Uniform(Type type, Symbol name, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Creates a named uniform.
- Description: Stores the value supplier and dependency slots.

#### `public Uniform(Type type, String infix, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Creates a shared-name uniform using a string infix.
- Description: Builds a shared symbol name from the infix.

#### `public Uniform(Type type, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Creates an auto-named shared uniform.
- Description: Uses a generated shared symbol name.

#### `public void use(Context ctx)`
- Role: Registers the uniform in the shader context.
- Description: Adds the uniform definition and required extensions.

#### `public String toString()`
- Role: Returns a debug description.
- Description: Shows type, name, and dependency slots.