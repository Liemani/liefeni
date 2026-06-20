---
source: [AgentManager.java](../../../../src/lmi/runtime/AgentManager.java)
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
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `private static PrintWriter out()`
- Role: Performs out.
- Description: Supports the out operation used by the surrounding class.

#### `public static void run(String[] args)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private static void handleAgentOption(String[] args)`
- Role: Handles the agent option.
- Description: Supports the handle agent option operation used by the surrounding class.

#### `private static void handleDriveOption(String[] args)`
- Role: Handles the drive option.
- Description: Supports the handle drive option operation used by the surrounding class.

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
- Description: Exposes the requested value without mutating state.

#### `public static boolean isRunning()`
- Role: Checks whether the running.
- Description: Returns a boolean result for the described condition.

#### `public static void interrupt()`
- Role: Performs interrupt.
- Description: Supports the interrupt operation used by the surrounding class.
