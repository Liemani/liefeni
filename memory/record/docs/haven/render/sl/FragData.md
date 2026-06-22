---
source: [FragData.java](../../../../../../src/haven/render/sl/FragData.java)
created: 2026-06-13
updated: 2026-06-20
---

# FragData

Represents fragment-output data that is registered through post-processing.

## Nested Types

### Def
Fragment-output declaration node used to register the data in fragment context.

#### Members

##### Methods

#### `public void process(PostProc proc)`
- Role: Declares no extra post-processing behavior.
- Description: The enclosing `FragData` registration is handled by the post-process pass.

#### `public Object ppid()`
- Role: Returns the fragment-data post-processing id.
- Description: Matches the `fragdata` post-process pass.

#### `private FragData var()`
- Role: Returns the enclosing fragment data object.
- Description: Used by the post-process pass to recover the registered variable.

#### `public void output(Output out)`
- Role: Emits the fragment-output declaration.
- Description: Writes an `out` declaration in fragment context.

## Members

### Constants

#### `private static final Object defid = new PostProc.AutoID("fragdata", 15000)`
- Role: Defines the fragment-data post-process id.
- Description: Used to collect fragment outputs into `prog.fragdata`.

### Fields

#### `public final Function<Pipe, Object> value`
- Role: Supplies the runtime value.
- Description: Read from the current render pipe.

#### `public final Collection<State.Slot<?>> deps`
- Role: Lists state dependencies.
- Description: Used to track which render states affect the output.

#### `public boolean primary = false`
- Role: Marks the primary fragment-output slot.
- Description: Only one fragment data entry can claim the primary slot.

### Methods

#### `public FragData(Type type, Symbol name, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Builds a named fragment-output datum.
- Description: Stores the value supplier and dependency slots.

#### `public FragData(Type type, String infix, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Builds a shared-name fragment-output datum.
- Description: Uses a shared symbol prefix.

#### `public FragData(Type type, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Builds an auto-named fragment-output datum.
- Description: Uses a generated shared symbol.

#### `public FragData primary()`
- Role: Marks this entry as the primary slot.
- Description: Ensures only one primary fragment output exists.

#### `public String toString()`
- Role: Returns a debug description.
- Description: Shows type, name, and dependencies.

#### `public void use(Context ctx)`
- Role: Registers the fragment-output declaration.
- Description: Adds the declaration to the context when missing.