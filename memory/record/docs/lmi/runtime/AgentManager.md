---
source: [AgentManager.java](../../../../../src/lmi/runtime/AgentManager.java)
created: 2026-06-13
updated: 2026-06-14
---

# AgentManager

Coordinates agent registration and execution.

## Members

### Constants

### Fields

### Methods

#### `public static void init()`
- Role: Initializes the agent runtime entry point.
- Description: Prepares command parsing and shared output wiring.

#### `private static PrintWriter out()`
- Role: Returns the output writer used by agent logging.
- Description: Lazily resolves the writer used for help and status output.

#### `public static void run(String[] args)`
- Role: Runs the job.
- Description: Parses agent arguments and dispatches the requested command.

#### `private static void handleAgentOption(String[] args)`
- Role: Handles the agent option.
- Description: Processes the top-level `agent` command branch.

#### `private static void handleDriveOption(String[] args)`
- Role: Handles the drive option.
- Description: Processes the `drive` command branch for scripted execution.

#### `private static void printMainHelp()`
- Role: Logs the main help.
- Description: Logs the main help for diagnostics and debugging.

#### `private static void printOptionHelp(String opt)`
- Role: Logs the option help.
- Description: Logs the option help for diagnostics and debugging.

#### `private static void printJobHelp(Class<? extends Job> jobClass)`
- Role: Logs the job help.
- Description: Logs the job help for diagnostics and debugging.

#### `public static Map<String, Class<? extends Job>> getJobMap()`
- Role: Returns the job map.
- Description: Returns the job map.

#### `public static boolean isRunning()`
- Role: Checks whether the running.
- Description: Returns whether the condition is satisfied.

#### `public static void interrupt()`
- Role: Handles the interrupt path.
- Description: Stops the currently running agent command if one is active.