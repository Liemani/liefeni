# JOGLPanel

This file documents the responsibilities and members of `JOGLPanel`.

## Meta

- Source: [JOGLPanel.java](../../../src/haven/JOGLPanel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Hosts the JOGL-backed UI panel.

## Nested Types

### ProfileException

- Description: TODO

## Members

### Constants

#### `private static final boolean dumpbgl = true`

- Description: TODO

### Fields

#### `public boolean aswap`

- Description: TODO

#### `private JOGLEnvironment env = null`

- Description: TODO

#### `private Area shape`

- Description: TODO

#### `private Pipe base, wnd`

- Description: TODO

#### `private Pipe base, wnd`

- Description: TODO

#### `private final Loop main = new Loop(this)`

- Description: TODO

#### `public final String availability`

- Description: TODO

#### `private final haven.error.ErrorHandler errh = haven.error.ErrorHandler.find()`

- Description: TODO

#### `private Robot awtrobot`

- Description: TODO

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`

- Description: TODO

### Methods

#### `public ProfileException(Throwable cause)`

- Description: TODO

#### `private static GLCapabilities mkcaps()`

- Description: TODO

#### `public JOGLPanel()`

- Description: TODO

#### `private boolean iswap()`

- Description: TODO

#### `private void initgl(GL gl)`

- Description: TODO

#### `private void setenv(JOGLEnvironment env)`

- Description: TODO

#### `private void redraw(GL gl)`

- Description: TODO

#### `public GLEnvironment env()`

- Description: TODO

#### `public Area shape()`

- Description: TODO

#### `public Pipe basestate()`

- Description: TODO

#### `public void glswap(haven.render.gl.GL gl)`

- Description: TODO

#### `private void uglyjoglhack() throws InterruptedException`

- Description: TODO

#### `private void renderloop()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public UI newui(UI.Runner fun)`

- Description: TODO

#### `public void background(boolean bg)`

- Description: TODO

#### `public void setmousepos(Coord c)`

- Description: TODO

#### `public Map<String, Console.Command> findcmds()`

- Description: TODO
