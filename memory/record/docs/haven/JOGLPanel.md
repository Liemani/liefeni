---
source: [JOGLPanel.java](../../../../src/haven/JOGLPanel.java)
created: 2026-06-13
updated: 2026-06-14
---

# JOGLPanel

Represents the joglpanel Haven component.

## Nested Types

### ProfileException

- Role: Signals JOGL profile-debug failures.
- Description: Wraps an error raised while profiling the OpenGL panel lifecycle.

## Members

### Constants

#### `private static final boolean dumpbgl = true`
- Role: Caches the dumpbgl value.
- Description: Caches the `dumpbgl` value for reuse.
- Value: `true`

### Fields

#### `public boolean aswap`
- Role: Tracks the aswap flag.
- Description: Caches the `aswap` value for reuse.

#### `private JOGLEnvironment env = null`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `private Area shape`
- Role: Caches the shape value.
- Description: Caches the `shape` value for reuse.

#### `private Pipe base, wnd`
- Role: Caches the wnd value.
- Description: Caches the `wnd` value for reuse.

#### `private Pipe base, wnd`
- Role: Caches the wnd value.
- Description: Caches the `wnd` value for reuse.

#### `private final Loop main = new Loop(this)`
- Role: Implements the main operation.
- Description: Implements the loop operation.

#### `public final String availability`
- Role: Caches the availability value.
- Description: Caches the `availability` value for reuse.

#### `private final haven.error.ErrorHandler errh = haven.error.ErrorHandler.find()`
- Role: Implements the errh operation.
- Description: Finds the requested data.

#### `private Robot awtrobot`
- Role: Caches the awtrobot value.
- Description: Caches the `awtrobot` value for reuse.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Implements the cmdmap operation.
- Description: Implements the private map<string, console.command> cmdmap = new tree map<string, console.command>() operation.

### Methods

#### `public ProfileException(Throwable cause)`
- Role: Handles the profile exception path.
- Description: Implements the profile exception operation.

#### `private static GLCapabilities mkcaps()`
- Role: Handles the mkcaps path.
- Description: Implements the mkcaps operation.

#### `public JOGLPanel()`
- Role: Creates a new JOGLPanel instance.
- Description: Constructs the JOGLPanel instance from the supplied inputs.

#### `private boolean iswap()`
- Role: Handles the iswap path.
- Description: Returns whether the wap is true.

#### `private void initgl(GL gl)`
- Role: Handles the initgl path.
- Description: Implements the initgl operation.

#### `private void setenv(JOGLEnvironment env)`
- Role: Handles the setenv path.
- Description: Updates the env.

#### `private void redraw(GL gl)`
- Role: Handles the redraw path.
- Description: Implements the redraw operation.

#### `public GLEnvironment env()`
- Role: Handles the env path.
- Description: Implements the env operation.

#### `public Area shape()`
- Role: Handles the shape path.
- Description: Implements the shape operation.

#### `public Pipe basestate()`
- Role: Handles the basestate path.
- Description: Implements the basestate operation.

#### `public void glswap(haven.render.gl.GL gl)`
- Role: Handles the glswap path.
- Description: Implements the glswap operation.

#### `private void uglyjoglhack() throws InterruptedException`
- Role: Handles the uglyjoglhack workflow.
- Description: Implements the uglyjoglhack operation.

#### `private void renderloop()`
- Role: Handles the renderloop path.
- Description: Renders the loop.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public UI newui(UI.Runner fun)`
- Role: Handles the newui path.
- Description: Implements the newui operation.

#### `public void background(boolean bg)`
- Role: Handles the background path.
- Description: Implements the background operation.

#### `public void setmousepos(Coord c)`
- Role: Handles the setmousepos path.
- Description: Updates the mousepos.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Finds the cmds.