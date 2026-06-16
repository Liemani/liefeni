# PostProc

This file documents the responsibilities and members of `PostProc`.

## Meta

- Source: [PostProc.java](../../../../../src/haven/render/sl/PostProc.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the post proc shader-language AST node.

## Nested Types

### AutoID

- Role: Represents auto id within PostProc.
- Description: Describes the nested auto id type used by the enclosing class.

### AutoMacro

- Role: Represents auto macro within PostProc.
- Description: Describes the nested auto macro type used by the enclosing class.

### ProcExpression

- Role: Represents proc expression within PostProc.
- Description: Describes the nested proc expression type used by the enclosing class.

### Processed

- Role: Represents processed within PostProc.
- Description: Describes the nested processed type used by the enclosing class.

## Members

### Constants

#### `public static final AutoID misc = new AutoID("misc", 0)`
- Role: Defines the shared misc constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Object id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `public final Context ctx`
- Role: Stores the ctx value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final int order`
- Role: Stores the order value.
- Description: Backs the cached state for this file.

#### `public final Object id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `protected Expression exp = null`
- Role: Holds the exp state.
- Description: Backs the cached state for this file.

### Methods

#### `public void process(PostProc proc)`
- Role: Performs process.
- Description: Supports the process operation used by the surrounding class.

#### `public Object ppid()`
- Role: Performs ppid.
- Description: Supports the ppid operation used by the surrounding class.

#### `public AutoID(String name, int order)`
- Role: Performs auto id.
- Description: Supports the auto id operation used by the surrounding class.

#### `public AutoID(int order)`
- Role: Performs auto id.
- Description: Supports the auto id operation used by the surrounding class.

#### `public void proc(Context ctx)`
- Role: Performs proc.
- Description: Supports the proc operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public PostProc(Object id, Context ctx)`
- Role: Creates a new PostProc instance.
- Description: Constructs the instance and initializes its default state.

#### `public PostProc(Object id)`
- Role: Creates a new PostProc instance.
- Description: Constructs the instance and initializes its default state.

#### `public PostProc()`
- Role: Creates a new PostProc instance.
- Description: Constructs the instance and initializes its default state.

#### `public void el(Element el)`
- Role: Performs el.
- Description: Supports the el operation used by the surrounding class.

#### `public static void autoproc(Context ctx)`
- Role: Performs autoproc.
- Description: Supports the autoproc operation used by the surrounding class.

#### `public ProcExpression(Object id)`
- Role: Performs proc expression.
- Description: Supports the proc expression operation used by the surrounding class.

#### `public Object ppid()`
- Role: Performs ppid.
- Description: Supports the ppid operation used by the surrounding class.

#### `public AutoMacro(Object id)`
- Role: Performs auto macro.
- Description: Supports the auto macro operation used by the surrounding class.

#### `protected abstract Expression expand(Context ctx)`
- Role: Performs expand.
- Description: Supports the expand operation used by the surrounding class.

#### `protected Expression expand0(PostProc proc)`
- Role: Performs expand0.
- Description: Supports the expand0 operation used by the surrounding class.

#### `public void process(PostProc proc)`
- Role: Performs process.
- Description: Supports the process operation used by the surrounding class.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
