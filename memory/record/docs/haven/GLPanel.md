---
source: [GLPanel.java](../../../../src/haven/GLPanel.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLPanel

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
- Description: Caches the `gldebug` value for reuse.

#### `public final GLPanel p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `public final CPUProfile uprof = new CPUProfile(300), rprof = new CPUProfile(300)`
- Role: Implements the uprof operation.
- Description: Implements the cpu profile operation.

#### `public final CPUProfile uprof = new CPUProfile(300), rprof = new CPUProfile(300)`
- Role: Implements the uprof operation.
- Description: Implements the cpu profile operation.

#### `public final GPUProfile gprof = new GPUProfile(300)`
- Role: Implements the gprof operation.
- Description: Implements the gpu profile operation.

#### `protected boolean bgmode = false`
- Role: Tracks the bgmode flag.
- Description: Caches the `bgmode` value for reuse.

#### `protected int fps`
- Role: Caches the fps value.
- Description: Caches the `fps` value for reuse.

#### `protected double framelag`
- Role: Caches the framelag value.
- Description: Caches the `framelag` value for reuse.

#### `protected volatile int frameno`
- Role: Caches the frameno value.
- Description: Caches the `frameno` value for reuse.

#### `protected double uidle = 0.0, ridle = 0.0`
- Role: Caches the uidle value.
- Description: Caches the `uidle` value for reuse.

#### `protected double uidle = 0.0, ridle = 0.0`
- Role: Caches the uidle value.
- Description: Caches the `uidle` value for reuse.

#### `protected long lastrcycle = 0, ridletime = 0`
- Role: Caches the last rcycle.
- Description: Caches the last rcycle value.

#### `protected long lastrcycle = 0, ridletime = 0`
- Role: Caches the last rcycle.
- Description: Caches the last rcycle value.

#### `protected UI lockedui, ui`
- Role: Caches the active Haven UI instance.
- Description: Caches the active Haven UI instance.

#### `protected UI lockedui, ui`
- Role: Caches the active Haven UI instance.
- Description: Caches the active Haven UI instance.

#### `private final Dispatcher ed`
- Role: Caches the ed value.
- Description: Caches the `ed` value for reuse.

#### `private final Object uilock = new Object()`
- Role: Implements the uilock operation.
- Description: Implements the object operation.

#### `final double ttime`
- Role: Caches the ttime value.
- Description: Caches the `ttime` value for reuse.

#### `final CPUProfile prof`
- Role: Caches the prof value.
- Description: Caches the `prof` value for reuse.

#### `ProfileCycle prev`
- Role: Caches the prev value.
- Description: Caches the `prev` value for reuse.

#### `CPUProfile.Frame frame`
- Role: Caches the frame value.
- Description: Caches the `frame` value for reuse.

#### `Profile.Part curp`
- Role: Caches the curp value.
- Description: Caches the `curp` value for reuse.

#### `final ProfileCycle prof`
- Role: Caches the prof value.
- Description: Caches the `prof` value for reuse.

#### `final String label`
- Role: Caches the label value.
- Description: Caches the `label` value for reuse.

#### `private Object prevtooltip = null`
- Role: Caches the prevtooltip value.
- Description: Caches the `prevtooltip` value for reuse.

#### `private Indir<Tex> prevtooltex = null`
- Role: Caches the prevtooltex value.
- Description: Caches the `prevtooltex` value for reuse.

#### `private Disposable freetooltex = null`
- Role: Caches the freetooltex value.
- Description: Caches the `freetooltex` value for reuse.

#### `private String cursmode = defaultcurs()`
- Role: Implements the cursmode operation.
- Description: Implements the defaultcurs operation.

#### `private Object lastcursor = null`
- Role: Caches the last cursor.
- Description: Caches the last cursor value.

#### `private Coord curshotspot = Coord.z`
- Role: Caches the curshotspot value.
- Description: Caches the `curshotspot` value for reuse.

#### `private long prevfree = 0, framealloc = 0`
- Role: Caches the prevfree value.
- Description: Caches the `prevfree` value for reuse.

#### `private long prevfree = 0, framealloc = 0`
- Role: Caches the prevfree value.
- Description: Caches the `prevfree` value for reuse.

#### `private StreamOut streamout = null`
- Role: Caches the streamout value.
- Description: Caches the `streamout` value for reuse.

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`
- Role: Implements the cmdmap operation.
- Description: Implements the private map<string, console.command> cmdmap = new tree map<string, console.command>() operation.

### Methods

#### `public GLEnvironment env()`
- Role: Handles the env path.
- Description: Implements the env operation.

#### `public Area shape()`
- Role: Handles the shape path.
- Description: Implements the shape operation.

#### `public Pipe basestate()`
- Role: Handles the basestate path.
- Description: Implements the basestate operation.

#### `public void glswap(GL gl)`
- Role: Handles the glswap path.
- Description: Implements the glswap operation.

#### `public Loop(GLPanel p)`
- Role: Handles the loop path.
- Description: Implements the loop operation.

#### `private double framedur()`
- Role: Handles the framedur path.
- Description: Implements the framedur operation.

#### `BufferSwap(double ttime)`
- Role: Handles the buffer swap workflow.
- Description: Implements the buffer swap operation.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `ProfileCycle(CPUProfile prof, ProfileCycle prev, GLRender out)`
- Role: Handles the profile cycle workflow.
- Description: Implements the profile cycle operation.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `ProfilePart(ProfileCycle prof, String label)`
- Role: Handles the profile part workflow.
- Description: Implements the profile part operation.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private void drawtooltip(UI ui, GOut g)`
- Role: Handles the drawtooltip path.
- Description: Draws the tooltip.

#### `private static String defaultcurs()`
- Role: Handles the defaultcurs path.
- Description: Implements the defaultcurs operation.

#### `private void drawcursor(UI ui, GOut g)`
- Role: Handles the drawcursor path.
- Description: Draws the cursor.

#### `private void drawstats(UI ui, GOut g, GLRender buf)`
- Role: Handles the drawstats path.
- Description: Draws the stats.

#### `private void display(UI ui, GLRender buf)`
- Role: Handles the display path.
- Description: Implements the display operation.

#### `public void run() throws InterruptedException`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public UI newui(UI.Runner fun)`
- Role: Handles the newui path.
- Description: Implements the newui operation.

#### `public Map<String, Console.Command> findcmds()`
- Role: Returns the available console commands.
- Description: Finds the cmds.