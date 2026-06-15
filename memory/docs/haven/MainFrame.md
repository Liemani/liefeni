# MainFrame

This file documents the responsibilities and members of `MainFrame`.

## Meta

- Source: [MainFrame.java](../../../src/haven/MainFrame.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Hosts the main client window.

## Nested Types

### ConnectionError

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<Boolean> initfullscreen = Config.Variable.propb("haven.fullscreen", false)`

- Description: TODO

#### `public static final Config.Variable<String> renderer = Config.Variable.prop("haven.renderer", "jogl")`

- Description: TODO

#### `public static final Config.Variable<Boolean> status = Config.Variable.propb("haven.status", false)`

- Description: TODO

#### `public static final Config.Variable<Boolean> nopreload = Config.Variable.propb("haven.nopreload", false)`

- Description: TODO

#### `public static final Config.Variable<Path> loadwaited = Config.Variable.propp("haven.loadwaited", "")`

- Description: TODO

#### `public static final Config.Variable<Path> allused = Config.Variable.propp("haven.allused", "")`

- Description: TODO

### Fields

#### `final UIPanel p`

- Description: TODO

#### `private final ThreadGroup g`

- Description: TODO

#### `private Thread mt`

- Description: TODO

#### `boolean fullscreen`

- Description: TODO

#### `DisplayMode fsmode = null, prefs = null`

- Description: TODO

#### `DisplayMode fsmode = null, prefs = null`

- Description: TODO

#### `Coord prefssz = null`

- Description: TODO

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`

- Description: TODO

### Methods

#### `public static void initlocale()`

- Description: TODO

#### `public static void initawt()`

- Description: TODO

#### `DisplayMode findmode(int w, int h)`

- Description: TODO

#### `public void setfs()`

- Description: TODO

#### `public void setwnd()`

- Description: TODO

#### `public Map<String, Console.Command> findcmds()`

- Description: TODO

#### `private void seticon()`

- Description: TODO

#### `private UIPanel renderer()`

- Description: TODO

#### `public MainFrame(Coord isz)`

- Description: TODO

#### `private void savewndstate()`

- Description: TODO

#### `public ConnectionError(String mesg)`

- Description: TODO

#### `public static Session connect(Object[] args)`

- Description: TODO

#### `private void uiloop() throws InterruptedException`

- Description: TODO

#### `private void run(UI.Runner task)`

- Description: TODO

#### `public static void setupres()`

- Description: TODO

#### `public static void resdump()`

- Description: TODO

#### `private static void javabughack() throws InterruptedException`

- Description: TODO

#### `public static void status(String state)`

- Description: TODO

#### `private static void main2(String[] args)`

- Description: TODO

#### `public static void main(final String[] args)`

- Description: TODO

#### `private static void dumplist(Collection<Resource> list, Path fn)`

- Description: TODO
