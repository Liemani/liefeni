---
source: [Console.java](../../../src/haven/Console.java)
created: 2026-06-13
updated: 2026-06-14
---

# Console

Represents the console Haven component.

## Nested Types

### Command

- Role: Represents command within Console.
- Description: Describes the nested command type used by the enclosing class.

### Directory

- Role: Represents directory within Console.
- Description: Describes the nested directory type used by the enclosing class.

### Host

- Role: Represents host within Console.
- Description: Describes the nested host type used by the enclosing class.

## Members

### Constants

#### `private static final Map<String, Command> scommands = new TreeMap<String, Command>()`
- Role: Defines the shared scommands constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Map<String, Command> commands = new TreeMap<String, Command>()`
- Role: Caches commands entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Directory> dirs = new LinkedList<Directory>()`
- Role: Caches dirs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final ThreadLocal<Host> host = new ThreadLocal<>()`
- Role: Holds the host state.
- Description: Backs the cached state for this file.

#### `public PrintWriter out`
- Role: Stores the out value.
- Description: Backs the cached state for this file.

### Methods

#### `public void run(Console cons, String[] args) throws Exception`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public Map<String, Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.

#### `public static void setscmd(String name, Command cmd)`
- Role: Performs setscmd.
- Description: Supports the setscmd operation used by the surrounding class.

#### `public void setcmd(String name, Command cmd)`
- Role: Performs setcmd.
- Description: Supports the setcmd operation used by the surrounding class.

#### `public Map<String, Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.

#### `public void add(Directory dir)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Command findcmd(String name)`
- Role: Performs findcmd.
- Description: Supports the findcmd operation used by the surrounding class.

#### `public void run(Host host, String[] args) throws Exception`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void run(Host host, String cmdl) throws Exception`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public Host host()`
- Role: Performs host.
- Description: Supports the host operation used by the surrounding class.

#### `public void clearout()`
- Role: Performs clearout.
- Description: Supports the clearout operation used by the surrounding class.
