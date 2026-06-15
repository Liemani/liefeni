# LWJGLPanel

This file documents the responsibilities and members of `LWJGLPanel`.

## Meta

- Source: [LWJGLPanel.java](../../../src/haven/LWJGLPanel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Hosts the LWJGL-backed UI panel.

## Members

### Constants

#### `private static final int[][] glversions =`

- Description: TODO

#### `private static final boolean dumpbgl = true`

- Description: TODO

### Fields

#### `private LWJGLEnvironment env = null`

- Description: TODO

#### `private boolean aswap`

- Description: TODO

#### `private Area shape`

- Description: TODO

#### `private Pipe base, wnd`

- Description: TODO

#### `private Pipe base, wnd`

- Description: TODO

#### `private final Loop main = new Loop(this)`

- Description: TODO

#### `private final haven.error.ErrorHandler errh = haven.error.ErrorHandler.find()`

- Description: TODO

#### `private Robot awtrobot`

- Description: TODO

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`

- Description: TODO

### Methods

#### `public LWJGLPanel()`

- Description: TODO

#### `public void initGL()`

- Description: TODO

#### `public void paintGL()`

- Description: TODO

#### `protected ContextData createContext() throws AWTException`

- Description: TODO

#### `private void setenv(LWJGLEnvironment env)`

- Description: TODO

#### `public GLEnvironment env()`

- Description: TODO

#### `public Area shape()`

- Description: TODO

#### `public Pipe basestate()`

- Description: TODO

#### `private boolean iswap()`

- Description: TODO

#### `public void glswap(GL gl)`

- Description: TODO

#### `private void reshape(Area shape)`

- Description: TODO

#### `private void initgl()`

- Description: TODO

#### `private void awtrun(Runnable task) throws InterruptedException`

- Description: TODO

#### `private void glrun(Runnable task) throws InterruptedException`

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
