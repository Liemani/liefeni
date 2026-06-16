# JOGLPanel

This file documents the responsibilities and members of `JOGLPanel`.

## Meta

- Source: [JOGLPanel.java](../../../src/haven/JOGLPanel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the joglpanel Haven component.

## Nested Types

### ProfileException

- Role: Represents profile exception within JOGLPanel.
- Description: Describes the nested profile exception type used by the enclosing class.

## Members

### Constants

#### `private static final boolean dumpbgl = true`
- Role: Defines the shared dumpbgl constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public boolean aswap`
- Role: Tracks the aswap flag.
- Description: Supports the aswap operation used by the surrounding class.

#### `private JOGLEnvironment env = null`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `private Area shape`
- Role: Holds the shape state.
- Description: Backs the cached state for this file.

#### `private Pipe base, wnd`
- Role: Holds the wnd state.
- Description: Backs the cached state for this file.

#### `private Pipe base, wnd`
- Role: Holds the wnd state.
- Description: Backs the cached state for this file.

#### `private final Loop main = new Loop(this)`
- Role: Holds the main state.
- Description: Backs the cached state for this file.

#### `public final String availability`
- Role: Stores the availability value.
- Description: Backs the cached state for this file.

#### `private final haven.error.ErrorHandler errh = haven.error.ErrorHandler.find()`
- Role: Stores the errh value.
- Description: Backs the cached state for this file.

#### `private Robot awtrobot`
- Role: Holds the awtrobot state.
- Description: Backs the cached state for this file.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Caches cmdmap entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public ProfileException(Throwable cause)`
- Role: Performs profile exception.
- Description: Supports the profile exception operation used by the surrounding class.

#### `private static GLCapabilities mkcaps()`
- Role: Performs mkcaps.
- Description: Supports the mkcaps operation used by the surrounding class.

#### `public JOGLPanel()`
- Role: Creates a new JOGLPanel instance.
- Description: Constructs the instance and initializes its default state.

#### `private boolean iswap()`
- Role: Performs iswap.
- Description: Supports the iswap operation used by the surrounding class.

#### `private void initgl(GL gl)`
- Role: Performs initgl.
- Description: Supports the initgl operation used by the surrounding class.

#### `private void setenv(JOGLEnvironment env)`
- Role: Performs setenv.
- Description: Supports the setenv operation used by the surrounding class.

#### `private void redraw(GL gl)`
- Role: Performs redraw.
- Description: Supports the redraw operation used by the surrounding class.

#### `public GLEnvironment env()`
- Role: Performs env.
- Description: Supports the env operation used by the surrounding class.

#### `public Area shape()`
- Role: Performs shape.
- Description: Supports the shape operation used by the surrounding class.

#### `public Pipe basestate()`
- Role: Performs basestate.
- Description: Supports the basestate operation used by the surrounding class.

#### `public void glswap(haven.render.gl.GL gl)`
- Role: Performs glswap.
- Description: Supports the glswap operation used by the surrounding class.

#### `private void uglyjoglhack() throws InterruptedException`
- Role: Handles the uglyjoglhack workflow.
- Description: Supports the uglyjoglhack operation used by the surrounding class.

#### `private void renderloop()`
- Role: Performs renderloop.
- Description: Supports the renderloop operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public UI newui(UI.Runner fun)`
- Role: Performs newui.
- Description: Supports the newui operation used by the surrounding class.

#### `public void background(boolean bg)`
- Role: Performs background.
- Description: Supports the background operation used by the surrounding class.

#### `public void setmousepos(Coord c)`
- Role: Performs setmousepos.
- Description: Supports the setmousepos operation used by the surrounding class.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.
