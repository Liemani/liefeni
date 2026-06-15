# ConsoleHost

This file documents the responsibilities and members of `ConsoleHost`.

## Meta

- Source: [ConsoleHost.java](../../../src/haven/ConsoleHost.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Hosts console command execution.

## Members

### Constants

#### `public static final KeyBinding kb_histprev = KeyBinding.get("history/prev", KeyMatch.forcode(KeyEvent.VK_UP, 0))`

- Description: TODO

#### `public static final KeyBinding kb_histnext = KeyBinding.get("history/next", KeyMatch.forcode(KeyEvent.VK_DOWN, 0))`

- Description: TODO

### Fields

#### `public static Text.Foundry cmdfoundry = new Text.Foundry(Text.mono, 12, new java.awt.Color(245, 222, 179))`

- Description: TODO

#### `public ReadLine cmdline = null`

- Description: TODO

#### `private Text.Line cmdtext = null`

- Description: TODO

#### `private String cmdtextf = null`

- Description: TODO

#### `private List<String> history = new ArrayList<String>()`

- Description: TODO

#### `private int hpos = history.size()`

- Description: TODO

#### `private String hcurrent`

- Description: TODO

#### `private UI.Grab kg`

- Description: TODO

### Methods

#### `public void done(ReadLine buf)`

- Description: TODO

#### `private boolean cmdkey(KeyEvent ev)`

- Description: TODO

#### `public ConsoleHost(Coord sz)`

- Description: TODO

#### `public ConsoleHost()`

- Description: TODO

#### `public ConsoleHost(UI ui, Coord c, Coord sz)`

- Description: TODO

#### `public void drawcmd(GOut g, Coord c)`

- Description: TODO

#### `public void entercmd()`

- Description: TODO

#### `public void cancelcmd()`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public abstract void error(String msg)`

- Description: TODO
