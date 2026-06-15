# RootWidget

This file documents the responsibilities and members of `RootWidget`.

## Meta

- Source: [RootWidget.java](../../../src/haven/RootWidget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the root widget tree.

## Members

### Constants

#### `public static final Text.Foundry msgfoundry = new Text.Foundry(Text.dfont, 14)`

- Description: TODO

### Fields

#### `public boolean modtip = false`

- Description: TODO

#### `Profile guprof, grprof, ggprof`

- Description: TODO

#### `Profile guprof, grprof, ggprof`

- Description: TODO

#### `Profile guprof, grprof, ggprof`

- Description: TODO

#### `private Text lastmsg`

- Description: TODO

#### `private double msgtime`

- Description: TODO

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`

- Description: TODO

### Methods

#### `public RootWidget(UI ui, Coord sz)`

- Description: TODO

#### `public boolean getcurs(CursorQuery ev)`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void msg(String msg, Color color)`

- Description: TODO

#### `public boolean msg(UI.Notice msg)`

- Description: TODO

#### `public void error(String msg)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public Map<String, Console.Command> findcmds()`

- Description: TODO
