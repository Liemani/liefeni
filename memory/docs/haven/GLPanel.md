# GLPanel

This file documents the responsibilities and members of `GLPanel`.

## Meta

- Source: [GLPanel.java](../../../src/haven/GLPanel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the glpanel Haven component.

## Nested Types

### BufferSwap

- Role: Represents buffer swap within GLPanel.
- Description: Describes the nested buffer swap type used by the enclosing class.

### FrameCycle

- Role: Represents frame cycle within GLPanel.
- Description: Describes the nested frame cycle type used by the enclosing class.

### GLFinish

- Role: Represents glfinish within GLPanel.
- Description: Describes the nested glfinish type used by the enclosing class.

### ProfileCycle

- Role: Represents profile cycle within GLPanel.
- Description: Describes the nested profile cycle type used by the enclosing class.

### ProfilePart

- Role: Represents profile part within GLPanel.
- Description: Describes the nested profile part type used by the enclosing class.

## Members

### Constants

### Fields

#### `public static boolean gldebug = false`
- Role: Tracks the gldebug flag.
- Description: Supports the gldebug operation used by the surrounding class.

#### `public final GLPanel p`
- Role: Holds the p state.
- Description: Backs the cached state for this file.

#### `public final CPUProfile uprof = new CPUProfile(300), rprof = new CPUProfile(300)`
- Role: Stores the uprof value.
- Description: Backs the cached state for this file.

#### `public final CPUProfile uprof = new CPUProfile(300), rprof = new CPUProfile(300)`
- Role: Stores the uprof value.
- Description: Backs the cached state for this file.

#### `public final GPUProfile gprof = new GPUProfile(300)`
- Role: Stores the gprof value.
- Description: Backs the cached state for this file.

#### `protected boolean bgmode = false`
- Role: Tracks the bgmode flag.
- Description: Supports the bgmode operation used by the surrounding class.

#### `protected int fps`
- Role: Stores the fps value.
- Description: Backs the cached state for this file.

#### `protected double framelag`
- Role: Stores the framelag value.
- Description: Backs the cached state for this file.

#### `protected volatile int frameno`
- Role: Stores the frameno value.
- Description: Backs the cached state for this file.

#### `protected double uidle = 0.0, ridle = 0.0`
- Role: Stores the uidle value.
- Description: Backs the cached state for this file.

#### `protected double uidle = 0.0, ridle = 0.0`
- Role: Stores the uidle value.
- Description: Backs the cached state for this file.

#### `protected long lastrcycle = 0, ridletime = 0`
- Role: Stores the lastrcycle value.
- Description: Backs the cached state for this file.

#### `protected long lastrcycle = 0, ridletime = 0`
- Role: Stores the lastrcycle value.
- Description: Backs the cached state for this file.

#### `protected UI lockedui, ui`
- Role: Stores the UI value.
- Description: Backs the cached state for this file.

#### `protected UI lockedui, ui`
- Role: Stores the UI value.
- Description: Backs the cached state for this file.

#### `private final Dispatcher ed`
- Role: Holds the ed state.
- Description: Backs the cached state for this file.

#### `private final Object uilock = new Object()`
- Role: Holds the uilock state.
- Description: Backs the cached state for this file.

#### `final double ttime`
- Role: Stores the ttime value.
- Description: Backs the cached state for this file.

#### `final CPUProfile prof`
- Role: Stores the prof value.
- Description: Backs the cached state for this file.

#### `ProfileCycle prev`
- Role: Stores the prev value.
- Description: Backs the cached state for this file.

#### `CPUProfile.Frame frame`
- Role: Stores the frame value.
- Description: Backs the cached state for this file.

#### `Profile.Part curp`
- Role: Stores the curp value.
- Description: Backs the cached state for this file.

#### `final ProfileCycle prof`
- Role: Stores the prof value.
- Description: Backs the cached state for this file.

#### `final String label`
- Role: Stores the label value.
- Description: Backs the cached state for this file.

#### `private Object prevtooltip = null`
- Role: Holds the prevtooltip state.
- Description: Backs the cached state for this file.

#### `private Indir<Tex> prevtooltex = null`
- Role: Stores the prevtooltex value.
- Description: Backs the cached state for this file.

#### `private Disposable freetooltex = null`
- Role: Holds the freetooltex state.
- Description: Backs the cached state for this file.

#### `private String cursmode = defaultcurs()`
- Role: Stores the cursmode value.
- Description: Backs the cached state for this file.

#### `private Object lastcursor = null`
- Role: Holds the lastcursor state.
- Description: Backs the cached state for this file.

#### `private Coord curshotspot = Coord.z`
- Role: Stores the curshotspot value.
- Description: Backs the cached state for this file.

#### `private long prevfree = 0, framealloc = 0`
- Role: Stores the prevfree value.
- Description: Backs the cached state for this file.

#### `private long prevfree = 0, framealloc = 0`
- Role: Stores the prevfree value.
- Description: Backs the cached state for this file.

#### `private StreamOut streamout = null`
- Role: Holds the streamout state.
- Description: Backs the cached state for this file.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Caches cmdmap entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public GLEnvironment env()`
- Role: Performs env.
- Description: Supports the env operation used by the surrounding class.

#### `public Area shape()`
- Role: Performs shape.
- Description: Supports the shape operation used by the surrounding class.

#### `public Pipe basestate()`
- Role: Performs basestate.
- Description: Supports the basestate operation used by the surrounding class.

#### `public void glswap(GL gl)`
- Role: Performs glswap.
- Description: Supports the glswap operation used by the surrounding class.

#### `public Loop(GLPanel p)`
- Role: Performs loop.
- Description: Supports the loop operation used by the surrounding class.

#### `private double framedur()`
- Role: Performs framedur.
- Description: Supports the framedur operation used by the surrounding class.

#### `BufferSwap(double ttime)`
- Role: Handles the buffer swap workflow.
- Description: Supports the buffer swap operation used by the surrounding class.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `ProfileCycle(CPUProfile prof, ProfileCycle prev, GLRender out)`
- Role: Handles the profile cycle workflow.
- Description: Supports the profile cycle operation used by the surrounding class.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `ProfilePart(ProfileCycle prof, String label)`
- Role: Handles the profile part workflow.
- Description: Supports the profile part operation used by the surrounding class.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void drawtooltip(UI ui, GOut g)`
- Role: Performs drawtooltip.
- Description: Supports the drawtooltip operation used by the surrounding class.

#### `private static String defaultcurs()`
- Role: Performs defaultcurs.
- Description: Supports the defaultcurs operation used by the surrounding class.

#### `private void drawcursor(UI ui, GOut g)`
- Role: Performs drawcursor.
- Description: Supports the drawcursor operation used by the surrounding class.

#### `private void drawstats(UI ui, GOut g, GLRender buf)`
- Role: Performs drawstats.
- Description: Supports the drawstats operation used by the surrounding class.

#### `private void display(UI ui, GLRender buf)`
- Role: Performs display.
- Description: Supports the display operation used by the surrounding class.

#### `public void run() throws InterruptedException`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public UI newui(UI.Runner fun)`
- Role: Performs newui.
- Description: Supports the newui operation used by the surrounding class.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.
