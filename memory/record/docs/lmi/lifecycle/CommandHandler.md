---
source: [CommandHandler.java](../../../../../src/lmi/lifecycle/CommandHandler.java)
created: 2026-06-13
updated: 2026-06-14
---

# CommandHandler

Dispatches lifecycle commands into the runtime.

## Nested Types

### ACommand
- Role: Binds the `a` console command.
- Description: Forwards console arguments into `AgentManager.run(...)`.

## Members

### Constants

### Fields

### Methods

#### `public static void init()`
- Role: Registers the `a` console command.
- Description: Wires the console entry point into `AgentManager.run(...)`.

#### `public void run(Console cons, String[] args) throws Exception`
- Role: Runs the job.
- Description: Dispatches the parsed console command into the runtime.