# GLPanel

This file documents the responsibilities and members of `GLPanel`.

## Meta

- Source: [GLPanel.java](../../../src/haven/GLPanel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Hosts the OpenGL-backed UI panel.

## Nested Types

### BufferSwap

- Description: TODO

### FrameCycle

- Description: TODO

### GLFinish

- Description: TODO

### ProfileCycle

- Description: TODO

### ProfilePart

- Description: TODO

## Members

### Constants

### Fields

#### `public static boolean gldebug = false`

- Description: TODO

#### `public final GLPanel p`

- Description: TODO

#### `public final CPUProfile uprof = new CPUProfile(300), rprof = new CPUProfile(300)`

- Description: TODO

#### `public final CPUProfile uprof = new CPUProfile(300), rprof = new CPUProfile(300)`

- Description: TODO

#### `public final GPUProfile gprof = new GPUProfile(300)`

- Description: TODO

#### `protected boolean bgmode = false`

- Description: TODO

#### `protected int fps`

- Description: TODO

#### `protected double framelag`

- Description: TODO

#### `protected volatile int frameno`

- Description: TODO

#### `protected double uidle = 0.0, ridle = 0.0`

- Description: TODO

#### `protected double uidle = 0.0, ridle = 0.0`

- Description: TODO

#### `protected long lastrcycle = 0, ridletime = 0`

- Description: TODO

#### `protected long lastrcycle = 0, ridletime = 0`

- Description: TODO

#### `protected UI lockedui, ui`

- Description: TODO

#### `protected UI lockedui, ui`

- Description: TODO

#### `private final Dispatcher ed`

- Description: TODO

#### `private final Object uilock = new Object()`

- Description: TODO

#### `final double ttime`

- Description: TODO

#### `final CPUProfile prof`

- Description: TODO

#### `ProfileCycle prev`

- Description: TODO

#### `CPUProfile.Frame frame`

- Description: TODO

#### `Profile.Part curp`

- Description: TODO

#### `final ProfileCycle prof`

- Description: TODO

#### `final String label`

- Description: TODO

#### `private Object prevtooltip = null`

- Description: TODO

#### `private Indir<Tex> prevtooltex = null`

- Description: TODO

#### `private Disposable freetooltex = null`

- Description: TODO

#### `private String cursmode = defaultcurs()`

- Description: TODO

#### `private Object lastcursor = null`

- Description: TODO

#### `private Coord curshotspot = Coord.z`

- Description: TODO

#### `private long prevfree = 0, framealloc = 0`

- Description: TODO

#### `private long prevfree = 0, framealloc = 0`

- Description: TODO

#### `private StreamOut streamout = null`

- Description: TODO

#### `private Map<String, Console.Command> cmdmap = new TreeMap<String, Console.Command>()`

- Description: TODO

### Methods

#### `public GLEnvironment env()`

- Description: TODO

#### `public Area shape()`

- Description: TODO

#### `public Pipe basestate()`

- Description: TODO

#### `public void glswap(GL gl)`

- Description: TODO

#### `public Loop(GLPanel p)`

- Description: TODO

#### `private double framedur()`

- Description: TODO

#### `BufferSwap(double ttime)`

- Description: TODO

#### `public void run(GL gl)`

- Description: TODO

#### `public void run(GL gl)`

- Description: TODO

#### `public void run(GL gl)`

- Description: TODO

#### `ProfileCycle(CPUProfile prof, ProfileCycle prev, GLRender out)`

- Description: TODO

#### `public void run(GL gl)`

- Description: TODO

#### `ProfilePart(ProfileCycle prof, String label)`

- Description: TODO

#### `public void run(GL gl)`

- Description: TODO

#### `private void drawtooltip(UI ui, GOut g)`

- Description: TODO

#### `private static String defaultcurs()`

- Description: TODO

#### `private void drawcursor(UI ui, GOut g)`

- Description: TODO

#### `private void drawstats(UI ui, GOut g, GLRender buf)`

- Description: TODO

#### `private void display(UI ui, GLRender buf)`

- Description: TODO

#### `public void run() throws InterruptedException`

- Description: TODO

#### `public UI newui(UI.Runner fun)`

- Description: TODO

#### `public Map<String, Console.Command> findcmds()`

- Description: TODO
