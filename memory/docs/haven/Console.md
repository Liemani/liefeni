# Console

This file documents the responsibilities and members of `Console`.

## Meta

- Source: [Console.java](../../../src/haven/Console.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a console command surface.

## Nested Types

### Command

- Description: TODO

### Directory

- Description: TODO

### Host

- Description: TODO

## Members

### Constants

#### `private static final Map<String, Command> scommands = new TreeMap<String, Command>()`

- Description: TODO

### Fields

#### `private final Map<String, Command> commands = new TreeMap<String, Command>()`

- Description: TODO

#### `private final Collection<Directory> dirs = new LinkedList<Directory>()`

- Description: TODO

#### `private final ThreadLocal<Host> host = new ThreadLocal<>()`

- Description: TODO

#### `public PrintWriter out`

- Description: TODO

### Methods

#### `public void run(Console cons, String[] args) throws Exception`

- Description: TODO

#### `public Map<String, Command> findcmds()`

- Description: TODO

#### `public static void setscmd(String name, Command cmd)`

- Description: TODO

#### `public void setcmd(String name, Command cmd)`

- Description: TODO

#### `public Map<String, Command> findcmds()`

- Description: TODO

#### `public void add(Directory dir)`

- Description: TODO

#### `public Command findcmd(String name)`

- Description: TODO

#### `public void run(Host host, String[] args) throws Exception`

- Description: TODO

#### `public void run(Host host, String cmdl) throws Exception`

- Description: TODO

#### `public Host host()`

- Description: TODO

#### `public void clearout()`

- Description: TODO
