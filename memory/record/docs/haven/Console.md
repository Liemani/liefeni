---
source: [Console.java](../../../../src/haven/Console.java)
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
- Role: Implements the scommands operation.
- Description: Implements the private static final map<string, command> scommands = new tree map<string, command>() operation.
- Value: `new TreeMap<String, Command>()`

### Fields

#### `private final Map<String, Command> commands = new TreeMap<String, Command>()`
- Role: Implements the commands operation.
- Description: Implements the private final map<string, command> commands = new tree map<string, command>() operation.

#### `private final Collection<Directory> dirs = new LinkedList<Directory>()`
- Role: Implements the dirs operation.
- Description: Implements the private final collection<directory> dirs = new linked list<directory>() operation.

#### `private final ThreadLocal<Host> host = new ThreadLocal<>()`
- Role: Implements the host operation.
- Description: Implements the private final thread local<host> host = new thread local<>() operation.

#### `public PrintWriter out`
- Role: Caches the out value.
- Description: Caches the `out` value for reuse.

### Methods

#### `public void run(Console cons, String[] args) throws Exception`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public Map<String, Command> findcmds()`
- Role: Returns the available console commands.
- Description: Finds the cmds.

#### `public static void setscmd(String name, Command cmd)`
- Role: Handles the setscmd path.
- Description: Updates the scmd.

#### `public void setcmd(String name, Command cmd)`
- Role: Handles the setcmd path.
- Description: Updates the cmd.

#### `public Map<String, Command> findcmds()`
- Role: Returns the available console commands.
- Description: Finds the cmds.

#### `public void add(Directory dir)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Command findcmd(String name)`
- Role: Handles the findcmd path.
- Description: Finds the cmd.

#### `public void run(Host host, String[] args) throws Exception`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void run(Host host, String cmdl) throws Exception`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public Host host()`
- Role: Handles the host path.
- Description: Implements the host operation.

#### `public void clearout()`
- Role: Handles the clearout path.
- Description: Clears the out.