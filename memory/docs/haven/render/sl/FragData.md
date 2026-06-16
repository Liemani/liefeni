# FragData

This file documents the responsibilities and members of `FragData`.

## Meta

- Source: [FragData.java](../../../../../src/haven/render/sl/FragData.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the frag data shader-language AST node.

## Nested Types

### Def

- Role: Represents def within FragData.
- Description: Describes the nested def type used by the enclosing class.

## Members

### Constants

#### `private static final Object defid = new PostProc.AutoID("fragdata", 15000)`
- Role: Defines the shared defid constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Function<Pipe, Object> value`
- Role: Holds the value state.
- Description: Backs the cached state for this file.

#### `public final Collection<State.Slot<?>> deps`
- Role: Caches deps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public boolean primary = false`
- Role: Tracks the primary flag.
- Description: Supports the primary operation used by the surrounding class.

### Methods

#### `public FragData(Type type, Symbol name, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Creates a new FragData instance.
- Description: Constructs the instance and initializes its default state.

#### `public FragData(Type type, String infix, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Creates a new FragData instance.
- Description: Constructs the instance and initializes its default state.

#### `public FragData(Type type, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Creates a new FragData instance.
- Description: Constructs the instance and initializes its default state.

#### `public FragData primary()`
- Role: Performs primary.
- Description: Supports the primary operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void process(PostProc proc)`
- Role: Performs process.
- Description: Supports the process operation used by the surrounding class.

#### `public Object ppid()`
- Role: Performs ppid.
- Description: Supports the ppid operation used by the surrounding class.

#### `private FragData var()`
- Role: Performs var.
- Description: Supports the var operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public void use(Context ctx)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.
