---
source: [LWJGLPanel.java](../../../../src/haven/LWJGLPanel.java)
created: 2026-06-13
updated: 2026-06-14
---

# LWJGLPanel

Hosts the LWJGL-backed rendering canvas, GL context, and render loop.

## Members

### Constants

#### `private static final int[][] glversions =`
- Role: Lists preferred OpenGL versions.
- Description: Tried in descending order until a compatible context is created.
- Value: ``

#### `private static final boolean dumpbgl = true`
- Role: Enables BGL debug dumps.
- Description: Prints detailed backend errors when GL calls fail.
- Value: `true`

### Fields

#### `private LWJGLEnvironment env = null`
- Role: Stores the active LWJGL render environment.
- Description: Set once the GL context is initialized and reused for render-loop work.

#### `private boolean aswap`
- Role: Tracks the applied swap interval.
- Description: Used to avoid redundant vsync state changes.

#### `private Area shape`
- Role: Stores the current drawable area.
- Description: Updated whenever the canvas is reshaped.

#### `private Pipe base, wnd`
- Role: Stores the base and window render pipes.
- Description: `base` holds the default clear state and `wnd` adds viewport transforms.

#### `private Pipe base, wnd`
- Role: Stores the base and window render pipes.
- Description: `base` holds the default clear state and `wnd` adds viewport transforms.

#### `private final Loop main = new Loop(this)`
- Role: Owns the main client loop.
- Description: Drives UI updates and render scheduling from the AWT thread.

#### `private final haven.error.ErrorHandler errh = haven.error.ErrorHandler.find()`
- Role: Stores the global error handler.
- Description: Used to publish GL capabilities and backend diagnostics.

#### `private Robot awtrobot`
- Role: Caches the AWT robot used for cursor warping.
- Description: Created lazily when the client needs to reposition the mouse.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Stores the console commands exposed by the panel.
- Description: Currently used for renderer diagnostics.

### Methods

#### `public LWJGLPanel()`
- Role: Creates the LWJGL-backed panel and base pipe.
- Description: Initializes the default clear state and prepares the client loop before the GL context exists.

#### `public void initGL()`
- Role: Initializes the GL swap state.
- Description: Applies the initial vsync setting after the context is created.

#### `public void paintGL()`
- Role: Paints one OpenGL frame.
- Description: Present for canvas integration; the render thread does the actual work.

#### `protected ContextData createContext() throws AWTException`
- Role: Creates the GL context.
- Description: Tries preferred OpenGL versions before falling back to the default capabilities.

#### `private void setenv(LWJGLEnvironment env)`
- Role: Installs the active render environment.
- Description: Also publishes GL capability information to the error handler.

#### `public GLEnvironment env()`
- Role: Returns the active GL environment.
- Description: Exposes the current LWJGL-backed render environment.

#### `public Area shape()`
- Role: Returns the current panel shape.
- Description: Reports the last known drawable area.

#### `public Pipe basestate()`
- Role: Returns the base render pipe.
- Description: Exposes the window render state used for drawing.

#### `private boolean iswap()`
- Role: Checks whether vsync is enabled.
- Description: Reads the user preference that controls buffer swapping.

#### `public void glswap(GL gl)`
- Role: Swaps the GL buffers after rendering.
- Description: Updates the swap interval when needed and then presents the frame.

#### `private void reshape(Area shape)`
- Role: Rebuilds the window pipe after resize.
- Description: Updates the viewport and orthographic transform for the new shape.

#### `private void initgl()`
- Role: Performs low-level GL initialization.
- Description: Applies the initial swap interval to the current canvas.

#### `private void awtrun(Runnable task) throws InterruptedException`
- Role: Runs a task on the AWT thread.
- Description: Uses `EventQueue.invokeAndWait` so rendering work can safely touch AWT state.

#### `private void glrun(Runnable task) throws InterruptedException`
- Role: Runs a task inside the GL context.
- Description: Marshals work through the AWT thread and then into the canvas context.

#### `private void renderloop()`
- Role: Drives frame rendering and context maintenance.
- Description: Owns the render thread, shape updates, and GL backend processing.

#### `public void run()`
- Role: Runs the panel event loop and render loop.
- Description: Starts the render thread, waits for the environment, and then runs the main client loop.

#### `public UI newui(UI.Runner fun)`
- Role: Creates and attaches the panel UI root.
- Description: Builds the UI object through the main loop so input and rendering stay tied to this canvas.

#### `public void background(boolean bg)`
- Role: Toggles background mode.
- Description: Forwards the state into the client loop.

#### `public void setmousepos(Coord c)`
- Role: Warps the mouse cursor to a panel coordinate.
- Description: Uses an AWT robot so the client can reposition the cursor programmatically.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Finds the cmds.
