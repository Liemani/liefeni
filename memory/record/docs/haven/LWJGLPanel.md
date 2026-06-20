---
source: [LWJGLPanel.java](../../../src/haven/LWJGLPanel.java)
created: 2026-06-13
updated: 2026-06-14
---

# LWJGLPanel

Represents the lwjglpanel Haven component.

## Members

### Constants

#### `private static final int[][] glversions =`
- Role: Defines the shared lwjglpanel constant.
- Description: Shared constant used by the rest of the class.

#### `private static final boolean dumpbgl = true`
- Role: Defines the shared dumpbgl constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private LWJGLEnvironment env = null`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `private boolean aswap`
- Role: Tracks the aswap flag.
- Description: Supports the aswap operation used by the surrounding class.

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

#### `public LWJGLPanel()`
- Role: Creates a new LWJGLPanel instance.
- Description: Constructs the instance and initializes its default state.

#### `public void initGL()`
- Role: Initializes the gl.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public void paintGL()`
- Role: Performs paint gl.
- Description: Supports the paint gl operation used by the surrounding class.

#### `protected ContextData createContext() throws AWTException`
- Role: Handles the create context workflow.
- Description: Supports the create context operation used by the surrounding class.

#### `private void setenv(LWJGLEnvironment env)`
- Role: Performs setenv.
- Description: Supports the setenv operation used by the surrounding class.

#### `public GLEnvironment env()`
- Role: Performs env.
- Description: Supports the env operation used by the surrounding class.

#### `public Area shape()`
- Role: Performs shape.
- Description: Supports the shape operation used by the surrounding class.

#### `public Pipe basestate()`
- Role: Performs basestate.
- Description: Supports the basestate operation used by the surrounding class.

#### `private boolean iswap()`
- Role: Performs iswap.
- Description: Supports the iswap operation used by the surrounding class.

#### `public void glswap(GL gl)`
- Role: Performs glswap.
- Description: Supports the glswap operation used by the surrounding class.

#### `private void reshape(Area shape)`
- Role: Performs reshape.
- Description: Supports the reshape operation used by the surrounding class.

#### `private void initgl()`
- Role: Performs initgl.
- Description: Supports the initgl operation used by the surrounding class.

#### `private void awtrun(Runnable task) throws InterruptedException`
- Role: Handles the awtrun workflow.
- Description: Supports the awtrun operation used by the surrounding class.

#### `private void glrun(Runnable task) throws InterruptedException`
- Role: Handles the glrun workflow.
- Description: Supports the glrun operation used by the surrounding class.

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
