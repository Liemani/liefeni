---
source: [CommandHandler.java](../../../../src/lmi/lifecycle/CommandHandler.java)
created: 2026-06-13
updated: 2026-06-14
---

# CommandHandler

Dispatches lifecycle commands into the runtime.

## Nested Types

### ACommand
### ACommand
- Role: Represents the acommand helper used by CommandHandler.

- Role: Wraps one lifecycle command definition.
- Description: Describes the nested acommand type used by the enclosing class.

## Members

### Constants

### Fields

### Methods

#### `public static void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public void run(Console cons, String[] args) throws Exception`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.
