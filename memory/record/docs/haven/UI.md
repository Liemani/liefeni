---
source: [UI.java](../../../src/haven/UI.java)
created: 2026-06-13
updated: 2026-06-14
---

# UI

Owns the active client UI tree and event dispatch.

## Nested Types

### AddWidget

- Role: Represents add widget within UI.
- Description: Describes the nested add widget type used by the enclosing class.

### AfterDraw

- Role: Represents after draw within UI.
- Description: Describes the nested after draw type used by the enclosing class.

### Command

- Role: Represents command within UI.
- Description: Describes the nested command type used by the enclosing class.

### CommandException

- Role: Represents command exception within UI.
- Description: Describes the nested command exception type used by the enclosing class.

### CommandQueue

- Role: Represents command queue within UI.
- Description: Describes the nested command queue type used by the enclosing class.

### Context

- Role: Represents context within UI.
- Description: Describes the nested context type used by the enclosing class.

### Cursor

- Role: Represents cursor within UI.
- Description: Describes the nested cursor type used by the enclosing class.

### DstWidget

- Role: Represents dst widget within UI.
- Description: Describes the nested dst widget type used by the enclosing class.

### ErrorMessage

- Role: Represents error message within UI.
- Description: Describes the nested error message type used by the enclosing class.

### Grab

- Role: Represents grab within UI.
- Description: Describes the nested grab type used by the enclosing class.

### InfoMessage

- Role: Represents info message within UI.
- Description: Describes the nested info message type used by the enclosing class.

### NewWidget

- Role: Represents new widget within UI.
- Description: Describes the nested new widget type used by the enclosing class.

### Notice

- Role: Represents notice within UI.
- Description: Describes the nested notice type used by the enclosing class.

### NoticeEvent

- Role: Represents notice event within UI.
- Description: Describes the nested notice event type used by the enclosing class.

### PointerGrab

- Role: Represents pointer grab within UI.
- Description: Describes the nested pointer grab type used by the enclosing class.

### Receiver

- Role: Represents receiver within UI.
- Description: Describes the nested receiver type used by the enclosing class.

### Runner

- Role: Represents runner within UI.
- Description: Describes the nested runner type used by the enclosing class.

### SimpleMessage

- Role: Represents simple message within UI.
- Description: Describes the nested simple message type used by the enclosing class.

### UIException

- Role: Represents uiexception within UI.
- Description: Describes the nested uiexception type used by the enclosing class.

### UIWarning

- Role: Represents uiwarning within UI.
- Description: Describes the nested uiwarning type used by the enclosing class.

### UiMessage

- Role: Represents ui message within UI.
- Description: Describes the nested ui message type used by the enclosing class.

### WidgetConsole

- Role: Represents widget console within UI.
- Description: Describes the nested widget console type used by the enclosing class.

### WidgetGrab

- Role: Represents widget grab within UI.
- Description: Describes the nested widget grab type used by the enclosing class.

## Members

### Constants

#### `private static final double scalef`
- Role: Defines the shared scalef constant.
- Description: Shared constant used by the rest of the class.

#### `private static final java.util.concurrent.atomic.AtomicInteger nextid = new java.util.concurrent.atomic.AtomicInteger(0)`
- Role: Defines the shared nextid constant.
- Description: Shared constant used by the rest of the class.

#### `private static final boolean cmdjitter = false`
- Role: Defines the shared cmdjitter constant.
- Description: Shared constant used by the rest of the class.

#### `private static final boolean cmddump = false`
- Role: Defines the shared cmddump constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Audio.Clip nosfx = () -> null`
- Role: Defines the shared nosfx constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color color = new Color(192, 0, 0)`
- Role: Defines the shared color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Audio.Clip sfx = Audio.resclip(Resource.local().loadwait("sfx/error"))`
- Role: Defines the shared sfx constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Audio.Clip sfx = Audio.resclip(Resource.local().loadwait("sfx/msg"))`
- Role: Defines the shared sfx constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Double> uiscale = Config.Variable.propf("haven.uiscale", null)`
- Role: Defines the shared uiscale constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`
- Role: Stores the mod shift value.
- Description: Backs the cached state for this file.

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`
- Role: Stores the mod shift value.
- Description: Backs the cached state for this file.

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`
- Role: Stores the mod shift value.
- Description: Backs the cached state for this file.

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`
- Role: Stores the mod shift value.
- Description: Backs the cached state for this file.

#### `public RootWidget root`
- Role: Stores the root value.
- Description: Backs the cached state for this file.

#### `private final List<Grab> grabs = new CopyOnWriteArrayList<Grab>()`
- Role: Caches grabs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Integer, Widget> widgets = new TreeMap<Integer, Widget>()`
- Role: Caches widgets entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Widget, Integer> rwidgets = new HashMap<Widget, Integer>()`
- Role: Caches rwidgets entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Environment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `Receiver rcvr`
- Role: Holds the rcvr state.
- Description: Backs the cached state for this file.

#### `public Coord mc = Coord.z, lcc = Coord.z`
- Role: Stores the mc value.
- Description: Backs the cached state for this file.

#### `public Coord mc = Coord.z, lcc = Coord.z`
- Role: Stores the mc value.
- Description: Backs the cached state for this file.

#### `public Session sess`
- Role: Stores the sess value.
- Description: Backs the cached state for this file.

#### `public boolean modshift, modctrl, modmeta, modsuper`
- Role: Tracks the modsuper flag.
- Description: Supports the modsuper operation used by the surrounding class.

#### `public boolean modshift, modctrl, modmeta, modsuper`
- Role: Tracks the modsuper flag.
- Description: Supports the modsuper operation used by the surrounding class.

#### `public boolean modshift, modctrl, modmeta, modsuper`
- Role: Tracks the modsuper flag.
- Description: Supports the modsuper operation used by the surrounding class.

#### `public boolean modshift, modctrl, modmeta, modsuper`
- Role: Tracks the modsuper flag.
- Description: Supports the modsuper operation used by the surrounding class.

#### `public Object lasttip`
- Role: Holds the lasttip state.
- Description: Backs the cached state for this file.

#### `public double lastevent, lasttick`
- Role: Stores the lasttick value.
- Description: Backs the cached state for this file.

#### `public double lastevent, lasttick`
- Role: Stores the lasttick value.
- Description: Backs the cached state for this file.

#### `public Widget mouseon`
- Role: Stores the mouseon value.
- Description: Backs the cached state for this file.

#### `public Console cons = new WidgetConsole()`
- Role: Holds the cons state.
- Description: Backs the cached state for this file.

#### `private Collection<AfterDraw> afterdraws = new LinkedList<AfterDraw>()`
- Role: Caches afterdraws entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Context uictx`
- Role: Stores the uictx value.
- Description: Backs the cached state for this file.

#### `public GSettings gprefs = GSettings.load(true)`
- Role: Holds the gprefs state.
- Description: Backs the cached state for this file.

#### `private boolean gprefsdirty = false`
- Role: Tracks whether gprefsdirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final ActAudio.Root audio = new ActAudio.Root()`
- Role: Stores the audio value.
- Description: Backs the cached state for this file.

#### `public final Loader loader`
- Role: Holds the loader state.
- Description: Backs the cached state for this file.

#### `public final CommandQueue queue = new CommandQueue()`
- Role: Caches queue entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Runner back`
- Role: Holds the back state.
- Description: Backs the cached state for this file.

#### `public String mname`
- Role: Stores the mname value.
- Description: Backs the cached state for this file.

#### `public Object[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `public String mname`
- Role: Stores the mname value.
- Description: Backs the cached state for this file.

#### `public Object[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `public final int id = nextid.getAndIncrement()`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Collection<Integer> deps = new ArrayList<>()`
- Role: Caches deps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<Integer> bars = new ArrayList<>()`
- Role: Caches bars entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<Command> next = new ArrayList<>()`
- Role: Caches next entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<Command> wait = new ArrayList<>()`
- Role: Caches wait entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Runnable action`
- Role: Holds the action state.
- Description: Backs the cached state for this file.

#### `public final Command cmd`
- Role: Holds the cmd state.
- Description: Backs the cached state for this file.

#### `private final Map<Integer, Command> score = new HashMap<>()`
- Role: Caches score entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int inflight = 0`
- Role: Stores the inflight value.
- Description: Backs the cached state for this file.

#### `private Collection<Integer> or_deps = null, or_bars = null`
- Role: Caches or deps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Collection<Integer> or_deps = null, or_bars = null`
- Role: Caches or deps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final String typenm`
- Role: Stores the typenm value.
- Description: Backs the cached state for this file.

#### `public final Object[] cargs`
- Role: Holds the cargs state.
- Description: Backs the cached state for this file.

#### `private transient Widget.Factory type`
- Role: Stores the type value.
- Description: Backs the cached state for this file.

#### `private transient Widget wdg = null`
- Role: Stores the wdg value.
- Description: Backs the cached state for this file.

#### `private final MultiMap<Integer, Integer> shadowchildren = new HashMultiMap<>()`
- Role: Caches shadowchildren entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Integer, Integer> shadowparents = new HashMap<>()`
- Role: Caches shadowparents entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int id, parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public final int id, parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public final Object[] pargs`
- Role: Holds the pargs state.
- Description: Backs the cached state for this file.

#### `public final Widget owner`
- Role: Stores the owner value.
- Description: Backs the cached state for this file.

#### `public final Class<E> etype`
- Role: Holds the etype state.
- Description: Backs the cached state for this file.

#### `public final EventHandler<? super E> handler`
- Role: Stores the handler value.
- Description: Backs the cached state for this file.

#### `public final Widget wdg`
- Role: Stores the wdg value.
- Description: Backs the cached state for this file.

#### `public final Widget wdg`
- Role: Stores the wdg value.
- Description: Backs the cached state for this file.

#### `public final EventHandler<? super E> bk`
- Role: Stores the bk value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final String msg`
- Role: Stores the msg value.
- Description: Backs the cached state for this file.

#### `public final Object[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `public String msg`
- Role: Stores the msg value.
- Description: Backs the cached state for this file.

#### `public Color color`
- Role: Stores the color value.
- Description: Backs the cached state for this file.

#### `public Audio.Clip sfx`
- Role: Stores the sfx value.
- Description: Backs the cached state for this file.

#### `public final Notice msg`
- Role: Holds the msg state.
- Description: Backs the cached state for this file.

#### `private Widget prevtt = null`
- Role: Stores the prevtt value.
- Description: Backs the cached state for this file.

#### `public final Map<Audio.Clip, Double> lastmsgsfx = new HashMap<>()`
- Role: Caches lastmsgsfx entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private static double maxscale = -1`
- Role: Stores the maxscale value.
- Description: Backs the cached state for this file.

### Methods

#### `public void rcvmsg(int widget, String msg, Object... args)`
- Role: Performs rcvmsg.
- Description: Supports the rcvmsg operation used by the surrounding class.

#### `public Runner run(UI ui) throws InterruptedException`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public default void init(UI ui)`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public default String title()`
- Role: Performs title.
- Description: Supports the title operation used by the surrounding class.

#### `public Proxy(Runner back)`
- Role: Performs proxy.
- Description: Supports the proxy operation used by the surrounding class.

#### `public Runner run(UI ui) throws InterruptedException`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void init(UI ui)`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public String title()`
- Role: Performs title.
- Description: Supports the title operation used by the surrounding class.

#### `void setmousepos(Coord c)`
- Role: Performs setmousepos.
- Description: Supports the setmousepos operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void setgprefs(GSettings prefs)`
- Role: Performs setgprefs.
- Description: Supports the setgprefs operation used by the surrounding class.

#### `private void findcmds(Map<String, Command> map, Widget wdg)`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.

#### `public Map<String, Command> findcmds()`
- Role: Returns the available console commands.
- Description: Exposes the requested value without mutating state.

#### `public UIException(String message, String mname, Object... args)`
- Role: Performs uiexception.
- Description: Supports the uiexception operation used by the surrounding class.

#### `public void printStackTrace(java.io.PrintStream out)`
- Role: Logs the stack trace.
- Description: Logs the stack trace for diagnostics and debugging.

#### `public UIWarning(String message, String mname, Object... args)`
- Role: Performs uiwarning.
- Description: Supports the uiwarning operation used by the surrounding class.

#### `public UI(Context uictx, Coord sz, Runner fun)`
- Role: Creates a new UI instance.
- Description: Constructs the instance and initializes its default state.

#### `public Command(Runnable action)`
- Role: Performs command.
- Description: Supports the command operation used by the surrounding class.

#### `public Command dep(int id, boolean bar)`
- Role: Performs dep.
- Description: Supports the dep operation used by the surrounding class.

#### `private String fl(String id, Collection<?> l)`
- Role: Performs fl.
- Description: Supports the fl operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public CommandException(Command cmd, Throwable cause)`
- Role: Performs command exception.
- Description: Supports the command exception operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `private CommandQueue()`
- Role: Performs command queue.
- Description: Supports the command queue operation used by the surrounding class.

#### `private void run(Command cmd)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void execute(Command cmd)`
- Role: Executes the operation.
- Description: Supports the execute operation used by the surrounding class.

#### `public void submit(Command cmd)`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `public void finish(Command cmd)`
- Role: Performs finish.
- Description: Supports the finish operation used by the surrounding class.

#### `public void drain()`
- Role: Performs drain.
- Description: Supports the drain operation used by the surrounding class.

#### `public void setreceiver(Receiver rcvr)`
- Role: Performs setreceiver.
- Description: Supports the setreceiver operation used by the surrounding class.

#### `public void bind(Widget w, int id)`
- Role: Performs bind.
- Description: Supports the bind operation used by the surrounding class.

#### `public Widget getwidget(int id)`
- Role: Performs getwidget.
- Description: Supports the getwidget operation used by the surrounding class.

#### `public int widgetid(Widget wdg)`
- Role: Performs widgetid.
- Description: Supports the widgetid operation used by the surrounding class.

#### `public void drawafter(AfterDraw ad)`
- Role: Performs drawafter.
- Description: Supports the drawafter operation used by the surrounding class.

#### `public void tick()`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render out)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private void submitcmd(Command cmd)`
- Role: Performs submitcmd.
- Description: Supports the submitcmd operation used by the surrounding class.

#### `private NewWidget(int id, Widget.Factory type, Object... cargs)`
- Role: Performs new widget.
- Description: Supports the new widget operation used by the surrounding class.

#### `private NewWidget(int id, String type, Object... cargs)`
- Role: Performs new widget.
- Description: Supports the new widget operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void newwidget(int id, Widget.Factory type, Object... cargs)`
- Role: Performs newwidget.
- Description: Supports the newwidget operation used by the surrounding class.

#### `public void newwidget(int id, String type, Object... cargs) throws InterruptedException`
- Role: Handles the newwidget workflow.
- Description: Supports the newwidget operation used by the surrounding class.

#### `private AddWidget(int id, int parent, Object... pargs)`
- Role: Performs add widget.
- Description: Supports the add widget operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void addwidget(int id, int parent, Object... pargs)`
- Role: Performs addwidget.
- Description: Supports the addwidget operation used by the surrounding class.

#### `public void wdgbarrier(Collection<Integer> deps, Collection<Integer> bars)`
- Role: Performs wdgbarrier.
- Description: Supports the wdgbarrier operation used by the surrounding class.

#### `public void newwidgetp(int id, Widget.Factory type, int parent, Object[] pargs, Object... cargs)`
- Role: Performs newwidgetp.
- Description: Supports the newwidgetp operation used by the surrounding class.

#### `public void newwidgetp(int id, String type, int parent, Object[] pargs, Object... cargs) throws InterruptedException`
- Role: Handles the newwidgetp workflow.
- Description: Supports the newwidgetp operation used by the surrounding class.

#### `private Grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)`
- Role: Performs grab.
- Description: Supports the grab operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `private boolean check(Event ev)`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public <E extends Event> Grab<E> grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)`
- Role: Performs grab.
- Description: Supports the grab operation used by the surrounding class.

#### `public WidgetGrab(Widget wdg)`
- Role: Performs widget grab.
- Description: Supports the widget grab operation used by the surrounding class.

#### `public boolean handle(Event ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public PointerGrab(Widget wdg, EventHandler<? super E> bk)`
- Role: Performs pointer grab.
- Description: Supports the pointer grab operation used by the surrounding class.

#### `public boolean handle(E ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public Grab grabmouse(Widget wdg)`
- Role: Performs grabmouse.
- Description: Supports the grabmouse operation used by the surrounding class.

#### `public Grab grabkeys(Widget wdg)`
- Role: Performs grabkeys.
- Description: Supports the grabkeys operation used by the surrounding class.

#### `private void removeid(Widget wdg)`
- Role: Performs removeid.
- Description: Supports the removeid operation used by the surrounding class.

#### `public void removed(Widget wdg)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public void destroy(Widget wdg)`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public boolean dispatch(Widget to, Event ev)`
- Role: Performs dispatch.
- Description: Supports the dispatch operation used by the surrounding class.

#### `public <E extends Event> E dispatchq(Widget to, E ev)`
- Role: Performs dispatchq.
- Description: Supports the dispatchq operation used by the surrounding class.

#### `private DstWidget(int id)`
- Role: Performs dst widget.
- Description: Supports the dst widget operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void destroy(int id)`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `private UiMessage(int id, String msg, Object[] args)`
- Role: Performs ui message.
- Description: Supports the ui message operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void uimsg(int id, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public String message()`
- Role: Performs message.
- Description: Supports the message operation used by the surrounding class.

#### `public default Color color()`
- Role: Performs color.
- Description: Supports the color operation used by the surrounding class.

#### `public default Audio.Clip sfx()`
- Role: Performs sfx.
- Description: Supports the sfx operation used by the surrounding class.

#### `public default boolean handle(Widget w)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public default boolean handler(Widget w)`
- Role: Performs handler.
- Description: Supports the handler operation used by the surrounding class.

#### `public default boolean msg(Notice msg)`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.

#### `public default boolean msg(NoticeEvent ev)`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.

#### `public FactMaker()`
- Role: Performs fact maker.
- Description: Supports the fact maker operation used by the surrounding class.

#### `public Notice format(OwnerContext owner, Object... args)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `public SimpleMessage(String msg, Color color, Audio.Clip sfx)`
- Role: Performs simple message.
- Description: Supports the simple message operation used by the surrounding class.

#### `public SimpleMessage(String msg)`
- Role: Performs simple message.
- Description: Supports the simple message operation used by the surrounding class.

#### `public String message()`
- Role: Performs message.
- Description: Supports the message operation used by the surrounding class.

#### `public Color color()`
- Role: Performs color.
- Description: Supports the color operation used by the surrounding class.

#### `public Audio.Clip sfx()`
- Role: Performs sfx.
- Description: Supports the sfx operation used by the surrounding class.

#### `protected Color defcolor()`
- Role: Performs defcolor.
- Description: Supports the defcolor operation used by the surrounding class.

#### `protected Audio.Clip defsfx()`
- Role: Performs defsfx.
- Description: Supports the defsfx operation used by the surrounding class.

#### `public ErrorMessage(String msg)`
- Role: Performs error message.
- Description: Supports the error message operation used by the surrounding class.

#### `protected Color defcolor()`
- Role: Performs defcolor.
- Description: Supports the defcolor operation used by the surrounding class.

#### `protected Audio.Clip defsfx()`
- Role: Performs defsfx.
- Description: Supports the defsfx operation used by the surrounding class.

#### `public InfoMessage(String msg)`
- Role: Performs info message.
- Description: Supports the info message operation used by the surrounding class.

#### `public InfoMessage(String msg, Color color, Audio.Clip sfx)`
- Role: Performs info message.
- Description: Supports the info message operation used by the surrounding class.

#### `protected Audio.Clip defsfx()`
- Role: Performs defsfx.
- Description: Supports the defsfx operation used by the surrounding class.

#### `public NoticeEvent(Notice msg)`
- Role: Performs notice event.
- Description: Supports the notice event operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public void msg(Notice msg)`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.

#### `public void msg(String msg, Color color, Audio.Clip sfx)`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.

#### `public void error(String msg)`
- Role: Displays an error message.
- Description: Supports the error operation used by the surrounding class.

#### `public void msg(String msg)`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.

#### `private void setmods(InputEvent ev)`
- Role: Performs setmods.
- Description: Supports the setmods operation used by the surrounding class.

#### `private Grab[] c(Collection<Grab> g)`
- Role: Performs c.
- Description: Supports the c operation used by the surrounding class.

#### `public void keydown(KeyEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public void keyup(KeyEvent ev)`
- Role: Performs keyup.
- Description: Supports the keyup operation used by the surrounding class.

#### `public void mousedown(MouseEvent ev, Coord c, int button)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mouseup(MouseEvent ev, Coord c, int button)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public void mousemove(MouseEvent ev, Coord c)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public void mousehover(Coord c)`
- Role: Performs mousehover.
- Description: Supports the mousehover operation used by the surrounding class.

#### `public void setmousepos(Coord c)`
- Role: Performs setmousepos.
- Description: Supports the setmousepos operation used by the surrounding class.

#### `public void mousewheel(MouseEvent ev, Coord c, int ia, double sa)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public Object getcurs(Coord c)`
- Role: Returns the current cursor state.
- Description: Exposes the requested value without mutating state.

#### `public Object tooltip(Coord c)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public static int modflags(InputEvent ev)`
- Role: Performs modflags.
- Description: Supports the modflags operation used by the surrounding class.

#### `public int modflags()`
- Role: Performs modflags.
- Description: Supports the modflags operation used by the surrounding class.

#### `public Environment getenv()`
- Role: Performs getenv.
- Description: Supports the getenv operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void sfx(Audio.CS clip)`
- Role: Performs sfx.
- Description: Supports the sfx operation used by the surrounding class.

#### `public void sfx(Audio.Clip clip)`
- Role: Performs sfx.
- Description: Supports the sfx operation used by the surrounding class.

#### `public void sfx(Resource clip)`
- Role: Performs sfx.
- Description: Supports the sfx operation used by the surrounding class.

#### `public void sfxrl(Audio.Clip clip)`
- Role: Performs sfxrl.
- Description: Supports the sfxrl operation used by the surrounding class.

#### `public Resource.Pool pool()`
- Role: Performs pool.
- Description: Supports the pool operation used by the surrounding class.

#### `public static double scale(double v)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static float scale(float v)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static int scale(int v)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static int rscale(double v)`
- Role: Performs rscale.
- Description: Supports the rscale operation used by the surrounding class.

#### `public static Coord scale(Coord v)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static Coord scale(int x, int y)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static Coord rscale(double x, double y)`
- Role: Performs rscale.
- Description: Supports the rscale operation used by the surrounding class.

#### `public static Coord2d scale(Coord2d v)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `static public Font scale(Font f, float size)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static <T extends Tex> ScaledTex<T> scale(T tex)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static <T extends Tex> ScaledTex<T> scale(ScaledTex<T> tex)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static double unscale(double v)`
- Role: Performs unscale.
- Description: Supports the unscale operation used by the surrounding class.

#### `public static float unscale(float v)`
- Role: Performs unscale.
- Description: Supports the unscale operation used by the surrounding class.

#### `public static int unscale(int v)`
- Role: Performs unscale.
- Description: Supports the unscale operation used by the surrounding class.

#### `public static Coord unscale(Coord v)`
- Role: Performs unscale.
- Description: Supports the unscale operation used by the surrounding class.

#### `public static double maxscale()`
- Role: Performs maxscale.
- Description: Supports the maxscale operation used by the surrounding class.

#### `private static double loadscale()`
- Role: Performs loadscale.
- Description: Supports the loadscale operation used by the surrounding class.
