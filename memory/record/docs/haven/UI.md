---
source: [UI.java](../../../../src/haven/UI.java)
created: 2026-06-13
updated: 2026-06-14
---

# UI

Owns the active client UI tree and event dispatch.

## Nested Types

### AddWidget

- Role: Queues widget attachment work.
- Description: Command that adds a widget on the UI thread.

### AfterDraw

- Role: Runs work after the frame is drawn.
- Description: Callback executed after rendering completes for a UI tick.

### Command

- Role: Represents one queued UI command.
- Description: Work item executed by the UI command queue.

### CommandException

- Role: Signals a UI command failure.
- Description: Runtime exception raised when a queued UI command fails.

### CommandQueue

- Role: Runs queued UI commands.
- Description: Background runner that drains the UI command queue.

### Context

- Role: Provides UI-related context lookup.
- Description: Base context contract used for widget and session object resolution.

### Cursor

- Role: Tracks cursor state.
- Description: Cursor wrapper used for pointer state and cursor image management.

### DstWidget

- Role: Targets a widget for UI messages.
- Description: Destination widget reference used by queued UI operations.

### ErrorMessage

- Role: Represents a UI error notice.
- Description: Message wrapper used to surface errors to the player.

### Grab

- Role: Tracks a temporary UI grab.
- Description: Base class for input grabs such as mouse and pointer capture.

### InfoMessage

- Role: Represents a UI info notice.
- Description: Message wrapper used to surface informational notices.

### NewWidget

- Role: Creates a widget on the UI thread.
- Description: Command that instantiates and attaches a widget.

### Notice

- Role: Represents a queued notice message.
- Description: Notice record used by the UI notification system.

### NoticeEvent

- Role: Dispatches a UI notice.
- Description: Event object that carries a notice to handlers.

### PointerGrab

- Role: Captures pointer input.
- Description: Grab type used for pointer-specific input capture.

### Receiver

- Role: Receives UI messages.
- Description: Handler contract for inbound UI message dispatch.

### Runner

- Role: Runs deferred UI work.
- Description: Runnable wrapper executed on the UI thread.

### SimpleMessage

- Role: Represents a plain UI message.
- Description: Simple message wrapper without extra payload behavior.

### UIException

- Role: Signals a UI failure.
- Description: Runtime exception raised from UI lifecycle and command handling.

### UIWarning

- Role: Signals a non-fatal UI warning.
- Description: Warning wrapper used for recoverable UI problems.

### UiMessage

- Role: Represents a queued UI message.
- Description: Message record delivered through the UI message queue.

### WidgetConsole

- Role: Exposes the widget console.
- Description: Console directory that routes commands to widgets.

### WidgetGrab

- Role: Captures widget input.
- Description: Grab type that forwards events to a specific widget.

## Members

### Constants

#### `private static final double scalef`
#### `private static final double scalef`
- Role: Defines the scalef constant.
- Description: Scale factor applied to UI layout and coordinate conversion.

#### `private static final java.util.concurrent.atomic.AtomicInteger nextid = new java.util.concurrent.atomic.AtomicInteger(0)`
- Role: Defines the nextid constant.
- Description: Monotonically increasing identifier source for queued commands.
- Value: `new java.util.concurrent.atomic.AtomicInteger(0)`

#### `private static final boolean cmdjitter = false`
- Role: Defines the cmdjitter constant.
- Description: Debug flag that controls UI command queue diagnostics.
- Value: `false`

#### `private static final boolean cmddump = false`
- Role: Defines the cmddump constant.
- Description: Debug flag that controls UI command queue diagnostics.
- Value: `false`

#### `public static final Audio.Clip nosfx = () -> null`
- Role: Defines the nosfx constant.
- Description: No-op sound clip used when UI feedback has no audio.
- Value: `() -> null`

#### `public static final Color color = new Color(192, 0, 0)`
- Role: Defines the color constant.
- Description: Color used for error-style UI notices.
- Value: `new Color(192, 0, 0)`

#### `public static final Audio.Clip sfx = Audio.resclip(Resource.local().loadwait("sfx/error"))`
- Role: Defines the sfx constant.
- Description: Sound clip used for UI notices.
- Value: `Audio.resclip(Resource.local().loadwait("sfx/error"))`

#### `public static final Audio.Clip sfx = Audio.resclip(Resource.local().loadwait("sfx/msg"))`
- Role: Defines the sfx constant.
- Description: Sound clip used for UI notices.
- Value: `Audio.resclip(Resource.local().loadwait("sfx/msg"))`

#### `public static final Config.Variable<Double> uiscale = Config.Variable.propf("haven.uiscale", null)`
- Role: Defines the uiscale constant.
- Description: Persistent UI scale preference read from configuration.
- Value: `Config.Variable.propf("haven.uiscale", null)`

### Fields

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`
- Role: Caches the mod shift value.
- Description: Caches the `MOD_SHIFT` value for reuse.

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`
- Role: Caches the mod shift value.
- Description: Caches the `MOD_SHIFT` value for reuse.

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`
- Role: Caches the mod shift value.
- Description: Caches the `MOD_SHIFT` value for reuse.

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`
- Role: Caches the mod shift value.
- Description: Caches the `MOD_SHIFT` value for reuse.

#### `public RootWidget root`
- Role: Caches the root value.
- Description: Keeps the root event so acceptance can be reported back.

#### `private final List<Grab> grabs = new CopyOnWriteArrayList<Grab>()`
- Role: Active input grabs currently registered with the UI.
- Description: Active input grabs currently registered with the UI.

#### `private final Map<Integer, Widget> widgets = new TreeMap<Integer, Widget>()`
- Role: Widget table indexed by runtime id.
- Description: Widget table indexed by runtime id.

#### `private final Map<Widget, Integer> rwidgets = new HashMap<Widget, Integer>()`
- Role: Reverse lookup from widget instance to widget id.
- Description: Reverse lookup from widget instance to widget id.

#### `Environment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `Receiver rcvr`
- Role: Caches the rcvr value.
- Description: Caches the `rcvr` value for reuse.

#### `public Coord mc = Coord.z, lcc = Coord.z`
- Role: Caches the mc value.
- Description: Caches the `mc` value for reuse.

#### `public Coord mc = Coord.z, lcc = Coord.z`
- Role: Caches the mc value.
- Description: Caches the `mc` value for reuse.

#### `public Session sess`
- Role: Caches the sess value.
- Description: Caches the `sess` value for reuse.

#### `public boolean modshift, modctrl, modmeta, modsuper`
- Role: Tracks whether modsuper is enabled.
- Description: Super modifier state mirrored from input events.

#### `public boolean modshift, modctrl, modmeta, modsuper`
- Role: Tracks whether modsuper is enabled.
- Description: Super modifier state mirrored from input events.

#### `public boolean modshift, modctrl, modmeta, modsuper`
- Role: Tracks whether modsuper is enabled.
- Description: Super modifier state mirrored from input events.

#### `public boolean modshift, modctrl, modmeta, modsuper`
- Role: Tracks whether modsuper is enabled.
- Description: Super modifier state mirrored from input events.

#### `public Object lasttip`
- Role: Caches the last tip.
- Description: Caches the last tip value.

#### `public double lastevent, lasttick`
- Role: Caches the last tick.
- Description: Caches the last tick value.

#### `public double lastevent, lasttick`
- Role: Caches the last tick.
- Description: Caches the last tick value.

#### `public Widget mouseon`
- Role: Caches the mouseon value.
- Description: Caches the `mouseon` value for reuse.

#### `public Console cons = new WidgetConsole()`
- Role: Implements the cons operation.
- Description: Implements the widget console operation.

#### `private Collection<AfterDraw> afterdraws = new LinkedList<AfterDraw>()`
- Role: Callbacks scheduled to run after a draw pass.
- Description: Callbacks scheduled to run after a draw pass.

#### `private final Context uictx`
- Role: Caches the uictx value.
- Description: Caches the `uictx` value for reuse.

#### `public GSettings gprefs = GSettings.load(true)`
- Role: Implements the gprefs operation.
- Description: Loads the requested data.

#### `private boolean gprefsdirty = false`
- Role: Tracks whether gprefsdirty is dirty.
- Description: Marks preferences as needing persistence.

#### `public final ActAudio.Root audio = new ActAudio.Root()`
- Role: Implements the audio operation.
- Description: Implements the root operation.

#### `public final Loader loader`
- Role: Caches the loader value.
- Description: Caches the `loader` value for reuse.

#### `public final CommandQueue queue = new CommandQueue()`
- Role: UI command queue used for deferred work.
- Description: Command queue used for deferred UI work.

#### `public final Runner back`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `public String mname`
- Role: Caches the mname value.
- Description: Caches the `mname` value for reuse.

#### `public Object[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

#### `public String mname`
- Role: Caches the mname value.
- Description: Caches the `mname` value for reuse.

#### `public Object[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

#### `public final int id = nextid.getAndIncrement()`
- Role: Implements the id operation.
- Description: Implements the get and increment operation.

#### `public final Collection<Integer> deps = new ArrayList<>()`
- Role: Command ids that must complete before this command runs.
- Description: Command ids that must complete before this command runs.

#### `public final Collection<Integer> bars = new ArrayList<>()`
- Role: Command ids that act as hard barriers.
- Description: Command ids that act as hard barriers.

#### `public final Collection<Command> next = new ArrayList<>()`
- Role: Commands scheduled to run after this one completes.
- Description: Commands scheduled to run after this one completes.

#### `public final Collection<Command> wait = new ArrayList<>()`
- Role: Commands currently waiting on this command.
- Description: Commands currently waiting on this command.

#### `public final Runnable action`
- Role: Caches the action value.
- Description: Caches the `action` value for reuse.

#### `public final Command cmd`
- Role: Caches the cmd value.
- Description: Caches the `cmd` value for reuse.

#### `private final Map<Integer, Command> score = new HashMap<>()`
- Role: Dependency ranking table used by the queue runner.
- Description: Dependency ranking table used by the queue runner.

#### `private int inflight = 0`
- Role: Caches the inflight value.
- Description: Caches the `inflight` value for reuse.

#### `private Collection<Integer> or_deps = null, or_bars = null`
- Role: Alternate dependency set used while resolving queue prerequisites.
- Description: Alternate dependency set used while resolving UI command prerequisites.

#### `private Collection<Integer> or_deps = null, or_bars = null`
- Role: Alternate dependency set used while resolving queue prerequisites.
- Description: Alternate dependency set used while resolving UI command prerequisites.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final String typenm`
- Role: Caches the typenm value.
- Description: Caches the `typenm` value for reuse.

#### `public final Object[] cargs`
- Role: Caches the cargs value.
- Description: Caches the `cargs` value for reuse.

#### `private transient Widget.Factory type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

#### `private transient Widget wdg = null`
- Role: Caches the wdg value.
- Description: Caches the `wdg` value for reuse.

#### `private final MultiMap<Integer, Integer> shadowchildren = new HashMultiMap<>()`
- Role: Pending child widgets grouped by parent id while attaching widgets.
- Description: Pending child-to-parent attachment map used until both widget ids are known.

#### `private final Map<Integer, Integer> shadowparents = new HashMap<>()`
- Role: Parent widget id for each pending child while attaching widgets.
- Description: Pending parent-to-child attachment map used until both widget ids are known.

#### `public final int id, parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `public final int id, parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `public final Object[] pargs`
- Role: Caches the pargs value.
- Description: Caches the `pargs` value for reuse.

#### `public final Widget owner`
- Role: Caches the owner value.
- Description: Caches the `owner` value for reuse.

#### `public final Class<E> etype`
- Role: Caches the etype value.
- Description: Caches the `etype` value for reuse.

#### `public final EventHandler<? super E> handler`
- Role: Receives the completion callback for the queued request.
- Description: Receives the completion callback for the queued request.

#### `public final Widget wdg`
- Role: Caches the wdg value.
- Description: Caches the `wdg` value for reuse.

#### `public final Widget wdg`
- Role: Caches the wdg value.
- Description: Caches the `wdg` value for reuse.

#### `public final EventHandler<? super E> bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final String msg`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.

#### `public final Object[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

#### `public String msg`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.

#### `public Color color`
- Role: Caches the color value.
- Description: Caches the `color` value for reuse.

#### `public Audio.Clip sfx`
- Role: Caches the sfx value.
- Description: Caches the `sfx` value for reuse.

#### `public final Notice msg`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.

#### `private Widget prevtt = null`
- Role: Caches the prevtt value.
- Description: Caches the `prevtt` value for reuse.

#### `public final Map<Audio.Clip, Double> lastmsgsfx = new HashMap<>()`
- Role: Most recent play time for each message sound clip.
- Description: Last play time per message sound clip to avoid repeating the same notice too quickly.

#### `private static double maxscale = -1`
- Role: Caches the maxscale value.
- Description: Caches the `maxscale` value for reuse.

### Methods

#### `public void rcvmsg(int widget, String msg, Object... args)`
- Role: Queues an inbound widget message.
- Description: Enqueues a widget message for the UI command queue.

#### `public Runner run(UI ui) throws InterruptedException`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public default void init(UI ui)`
- Role: Initializes a receiver.
- Description: Called when a receiver is attached to a UI instance.

#### `public default String title()`
- Role: Returns a title string.
- Description: Returns the title associated with this receiver.

#### `public Proxy(Runner back)`
- Role: Wraps another UI runner.
- Description: Wraps another runner and forwards UI lifecycle calls.

#### `public Runner run(UI ui) throws InterruptedException`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void init(UI ui)`
- Role: Initializes the wrapped receiver.
- Description: Initialises the wrapped receiver chain against the active UI instance.

#### `public String title()`
- Role: Returns a title string.
- Description: Returns the title associated with this receiver.

#### `void setmousepos(Coord c)`
- Role: Updates the mouse position.
- Description: Updates the cursor position shared with widget code.

#### `public void draw(GOut g)`
- Role: Draws the UI tree.
- Description: Draws the root widget and any queued after-draw callbacks.

#### `public void setgprefs(GSettings prefs)`
- Role: Sets global preferences.
- Description: Stores the global preference object used for later saves.

#### `private void findcmds(Map<String, Command> map, Widget wdg)`
- Role: Returns the available console commands.
- Description: Recursively collects console commands from the widget tree.

#### `public Map<String, Command> findcmds()`
- Role: Returns the available console commands.
- Description: Returns the full widget-console command map.

#### `public UIException(String message, String mname, Object... args)`
- Role: Represents a UI command failure.
- Description: Builds the exception that carries widget command context.

#### `public void printStackTrace(java.io.PrintStream out)`
- Role: Logs the stack trace.
- Description: Prints the stack trace together with the message context.

#### `public UIWarning(String message, String mname, Object... args)`
- Role: Represents a UI warning.
- Description: Builds a non-fatal warning with widget context.

#### `public UI(Context uictx, Coord sz, Runner fun)`
- Role: Creates a new UI instance.
- Description: Initializes the UI with the provided context, size, and runner.

#### `public Command(Runnable action)`
- Role: Wraps a UI command.
- Description: Captures one runnable action together with its dependency metadata.

#### `public Command dep(int id, boolean bar)`
- Role: Adds a dependency edge.
- Description: Marks a widget id as a dependency or barrier for this command.

#### `private String fl(String id, Collection<?> l)`
- Role: Formats a command field.
- Description: Formats a collection field for debugging output.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this UI for debugging and logging.

#### `public CommandException(Command cmd, Throwable cause)`
- Role: Wraps a command failure.
- Description: Wraps a command failure with the failing command context.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Returns the message.

#### `private CommandQueue()`
- Role: Owns the UI command scheduler.
- Description: Initializes the dependency-aware UI command scheduler.

#### `private void run(Command cmd)`
- Role: Runs one queued command.
- Description: Executes the runnable and translates failures into command exceptions.

#### `private void execute(Command cmd)`
- Role: Dispatches one queued command.
- Description: Defers command execution onto the loader thread.

#### `public void submit(Command cmd)`
- Role: Submits a queued command.
- Description: Registers dependencies and starts the command when it is ready.

#### `public void finish(Command cmd)`
- Role: Finishes a queued command.
- Description: Releases dependent commands and clears matching barrier state.

#### `public void drain()`
- Role: Waits for queued commands.
- Description: Blocks until the command queue becomes idle.

#### `public void setreceiver(Receiver rcvr)`
- Role: Stores the message receiver.
- Description: Replaces the current UI message receiver.

#### `public void bind(Widget w, int id)`
- Role: Registers a widget id.
- Description: Stores forward and reverse widget lookup entries.

#### `public Widget getwidget(int id)`
- Role: Resolves a widget by id.
- Description: Returns the widget registered for the given id.

#### `public int widgetid(Widget wdg)`
- Role: Resolves a widget id.
- Description: Returns the id registered for the given widget, or -1.

#### `public void drawafter(AfterDraw ad)`
- Role: Schedules an after-draw callback.
- Description: Adds a callback that will run after the next UI draw.

#### `public void tick()`
- Role: Advances the UI state.
- Description: Updates time, dispatches tick events, and flushes dirty preferences.

#### `public void gtick(Render out)`
- Role: Advances the render state.
- Description: Dispatches the graphics tick event to the widget tree.

#### `public void draw(GOut g)`
- Role: Draws the UI tree.
- Description: Draws the root widget and any queued after-draw callbacks.

#### `private void submitcmd(Command cmd)`
- Role: Submits a command with overrides.
- Description: Applies queued barrier overrides and sends the command to the scheduler.

#### `private NewWidget(int id, Widget.Factory type, Object... cargs)`
- Role: Builds a new widget command.
- Description: Stores the factory-based widget creation request.

#### `private NewWidget(int id, String type, Object... cargs)`
- Role: Builds a new widget command.
- Description: Stores the named widget creation request.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this UI for debugging and logging.

#### `public void newwidget(int id, Widget.Factory type, Object... cargs)`
- Role: Implements the newwidget operation.
- Description: Implements the newwidget operation.

#### `public void newwidget(int id, String type, Object... cargs) throws InterruptedException`
- Role: Handles the newwidget workflow.
- Description: Queues creation of a widget by factory name.

#### `private AddWidget(int id, int parent, Object... pargs)`
- Role: Implements the add widget operation.
- Description: Implements the add widget operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this UI for debugging and logging.

#### `public void addwidget(int id, int parent, Object... pargs)`
- Role: Adds the widget.
- Description: Adds the widget.

#### `public void wdgbarrier(Collection<Integer> deps, Collection<Integer> bars)`
- Role: Implements the wdgbarrier operation.
- Description: Implements the wdgbarrier operation.

#### `public void newwidgetp(int id, Widget.Factory type, int parent, Object[] pargs, Object... cargs)`
- Role: Implements the newwidgetp operation.
- Description: Implements the newwidgetp operation.

#### `public void newwidgetp(int id, String type, int parent, Object[] pargs, Object... cargs) throws InterruptedException`
- Role: Handles the newwidgetp workflow.
- Description: Queues named widget creation and parent attachment together.

#### `private Grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)`
- Role: Implements the grab operation.
- Description: Implements the grab operation.

#### `public void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes this grab from the active grab stack.

#### `private boolean check(Event ev)`
- Role: Implements the check operation.
- Description: Implements the check operation.

#### `public <E extends Event> Grab<E> grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)`
- Role: Implements the grab operation.
- Description: Implements the grab operation.

#### `public WidgetGrab(Widget wdg)`
- Role: Implements the widget grab operation.
- Description: Implements the widget grab operation.

#### `public boolean handle(Event ev)`
- Role: Implements the handle operation.
- Description: Implements the handle operation.

#### `public PointerGrab(Widget wdg, EventHandler<? super E> bk)`
- Role: Implements the pointer grab operation.
- Description: Implements the pointer grab operation.

#### `public boolean handle(E ev)`
- Role: Implements the handle operation.
- Description: Implements the handle operation.

#### `public Grab grabmouse(Widget wdg)`
- Role: Implements the grabmouse operation.
- Description: Implements the grabmouse operation.

#### `public Grab grabkeys(Widget wdg)`
- Role: Implements the grabkeys operation.
- Description: Implements the grabkeys operation.

#### `private void removeid(Widget wdg)`
- Role: Removes the matching element instance.
- Description: Deletes a widget and all descendants from the lookup tables.

#### `public void removed(Widget wdg)`
- Role: Removes the d.
- Description: Removes the d.

#### `public void destroy(Widget wdg)`
- Role: Implements the destroy operation.
- Description: Implements the destroy operation.

#### `public boolean dispatch(Widget to, Event ev)`
- Role: Implements the dispatch operation.
- Description: Implements the dispatch operation.

#### `public <E extends Event> E dispatchq(Widget to, E ev)`
- Role: Implements the dispatchq operation.
- Description: Implements the dispatchq operation.

#### `private DstWidget(int id)`
- Role: Implements the dst widget operation.
- Description: Implements the dst widget operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this UI for debugging and logging.

#### `public void destroy(int id)`
- Role: Implements the destroy operation.
- Description: Implements the destroy operation.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Implements the wdgmsg operation.
- Description: Sends a widget message through the UI message path.

#### `private UiMessage(int id, String msg, Object[] args)`
- Role: Implements the ui message operation.
- Description: Implements the ui message operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this UI for debugging and logging.

#### `public void uimsg(int id, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Hooks the inbound message and schedules widget dispatch.

#### `public String message()`
- Role: Implements the message operation.
- Description: Implements the message operation.

#### `public default Color color()`
- Role: Implements the color operation.
- Description: Implements the color operation.

#### `public default Audio.Clip sfx()`
- Role: Implements the sfx operation.
- Description: Implements the sfx operation.

#### `public default boolean handle(Widget w)`
- Role: Implements the handle operation.
- Description: Implements the handle operation.

#### `public default boolean handler(Widget w)`
- Role: Implements the handler operation.
- Description: Implements the handler operation.

#### `public default boolean msg(Notice msg)`
- Role: Displays an in-game message.
- Description: Lets a notice handler consume the notice directly.

#### `public default boolean msg(NoticeEvent ev)`
- Role: Displays an in-game message.
- Description: Lets a notice handler consume the propagated notice event.

#### `public FactMaker()`
- Role: Implements the fact maker operation.
- Description: Implements the fact maker operation.

#### `public Notice format(OwnerContext owner, Object... args)`
- Role: Implements the format operation.
- Description: Implements the format operation.

#### `public SimpleMessage(String msg, Color color, Audio.Clip sfx)`
- Role: Implements the simple message operation.
- Description: Implements the simple message operation.

#### `public SimpleMessage(String msg)`
- Role: Implements the simple message operation.
- Description: Implements the simple message operation.

#### `public String message()`
- Role: Implements the message operation.
- Description: Implements the message operation.

#### `public Color color()`
- Role: Implements the color operation.
- Description: Implements the color operation.

#### `public Audio.Clip sfx()`
- Role: Implements the sfx operation.
- Description: Implements the sfx operation.

#### `protected Color defcolor()`
- Role: Implements the defcolor operation.
- Description: Implements the defcolor operation.

#### `protected Audio.Clip defsfx()`
- Role: Implements the defsfx operation.
- Description: Implements the defsfx operation.

#### `public ErrorMessage(String msg)`
- Role: Implements the error message operation.
- Description: Implements the error message operation.

#### `protected Color defcolor()`
- Role: Implements the defcolor operation.
- Description: Implements the defcolor operation.

#### `protected Audio.Clip defsfx()`
- Role: Implements the defsfx operation.
- Description: Implements the defsfx operation.

#### `public InfoMessage(String msg)`
- Role: Implements the info message operation.
- Description: Implements the info message operation.

#### `public InfoMessage(String msg, Color color, Audio.Clip sfx)`
- Role: Implements the info message operation.
- Description: Implements the info message operation.

#### `protected Audio.Clip defsfx()`
- Role: Implements the defsfx operation.
- Description: Implements the defsfx operation.

#### `public NoticeEvent(Notice msg)`
- Role: Broadcasts a UI notice.
- Description: Propagates a notice through the widget tree.

#### `protected boolean propagation(Widget from)`
- Role: Implements the propagation operation.
- Description: Propagates hover state into child widgets.

#### `protected boolean shandle(Widget w)`
- Role: Implements the shandle operation.
- Description: Lets a matching widget consume the event.

#### `public void msg(Notice msg)`
- Role: Displays an in-game message.
- Description: Sends a notice event to the root widget tree.

#### `public void msg(String msg, Color color, Audio.Clip sfx)`
- Role: Displays an in-game message.
- Description: Wraps text, color, and sound into a SimpleMessage.

#### `public void error(String msg)`
- Role: Displays an error message.
- Description: Wraps text in an ErrorMessage and broadcasts it.

#### `public void msg(String msg)`
- Role: Displays an in-game message.
- Description: Wraps text in an InfoMessage and broadcasts it.

#### `private void setmods(InputEvent ev)`
- Role: Updates the mods.
- Description: Updates the mods.

#### `private Grab[] c(Collection<Grab> g)`
- Role: Implements the c operation.
- Description: Implements the c operation.

#### `public void keydown(KeyEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Updates modifiers, runs hooks, and dispatches key-down input.

#### `public void keyup(KeyEvent ev)`
- Role: Implements the keyup operation.
- Description: Implements the keyup operation.

#### `public void mousedown(MouseEvent ev, Coord c, int button)`
- Role: Handles mouse-down input.
- Description: Caches mouse position and dispatches mouse-down input.

#### `public void mouseup(MouseEvent ev, Coord c, int button)`
- Role: Finishes a drag or click interaction on the minimap.
- Description: Finishes a drag or click interaction on the minimap.

#### `public void mousemove(MouseEvent ev, Coord c)`
- Role: Updates drag state while the mouse moves across the minimap.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public void mousehover(Coord c)`
- Role: Updates hover state and tooltip selection for minimap content.
- Description: Updates hover state and tooltip selection for minimap content.

#### `public void setmousepos(Coord c)`
- Role: Updates the mousepos.
- Description: Updates the mousepos.

#### `public void mousewheel(MouseEvent ev, Coord c, int ia, double sa)`
- Role: Zooms or pans the minimap in response to the mouse wheel.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public Object getcurs(Coord c)`
- Role: Returns the current cursor state.
- Description: Queries the widget tree for the cursor override at a point.

#### `public Object tooltip(Coord c)`
- Role: Returns the tooltip for the given cursor position.
- Description: Queries the widget tree for the current tooltip widget.

#### `public static int modflags(InputEvent ev)`
- Role: Implements the modflags operation.
- Description: Implements the modflags operation.

#### `public int modflags()`
- Role: Implements the modflags operation.
- Description: Implements the modflags operation.

#### `public Environment getenv()`
- Role: Returns the env.
- Description: Returns the env.

#### `public void destroy()`
- Role: Implements the destroy operation.
- Description: Implements the destroy operation.

#### `public void sfx(Audio.CS clip)`
- Role: Implements the sfx operation.
- Description: Implements the sfx operation.

#### `public void sfx(Audio.Clip clip)`
- Role: Implements the sfx operation.
- Description: Implements the sfx operation.

#### `public void sfx(Resource clip)`
- Role: Implements the sfx operation.
- Description: Implements the sfx operation.

#### `public void sfxrl(Audio.Clip clip)`
- Role: Implements the sfxrl operation.
- Description: Implements the sfxrl operation.

#### `public Resource.Pool pool()`
- Role: Implements the pool operation.
- Description: Implements the pool operation.

#### `public static double scale(double v)`
- Role: Implements the scale operation.
- Description: Implements the scale operation.

#### `public static float scale(float v)`
- Role: Implements the scale operation.
- Description: Implements the scale operation.

#### `public static int scale(int v)`
- Role: Implements the scale operation.
- Description: Implements the scale operation.

#### `public static int rscale(double v)`
- Role: Implements the rscale operation.
- Description: Implements the rscale operation.

#### `public static Coord scale(Coord v)`
- Role: Implements the scale operation.
- Description: Implements the scale operation.

#### `public static Coord scale(int x, int y)`
- Role: Implements the scale operation.
- Description: Implements the scale operation.

#### `public static Coord rscale(double x, double y)`
- Role: Implements the rscale operation.
- Description: Implements the rscale operation.

#### `public static Coord2d scale(Coord2d v)`
- Role: Implements the scale operation.
- Description: Implements the scale operation.

#### `static public Font scale(Font f, float size)`
- Role: Implements the scale operation.
- Description: Implements the scale operation.

#### `public static <T extends Tex> ScaledTex<T> scale(T tex)`
- Role: Implements the scale operation.
- Description: Implements the scale operation.

#### `public static <T extends Tex> ScaledTex<T> scale(ScaledTex<T> tex)`
- Role: Implements the scale operation.
- Description: Implements the scale operation.

#### `public static double unscale(double v)`
- Role: Implements the unscale operation.
- Description: Implements the unscale operation.

#### `public static float unscale(float v)`
- Role: Implements the unscale operation.
- Description: Implements the unscale operation.

#### `public static int unscale(int v)`
- Role: Implements the unscale operation.
- Description: Implements the unscale operation.

#### `public static Coord unscale(Coord v)`
- Role: Implements the unscale operation.
- Description: Implements the unscale operation.

#### `public static double maxscale()`
- Role: Implements the maxscale operation.
- Description: Implements the maxscale operation.

#### `private static double loadscale()`
- Role: Loads the scale.
- Description: Loads the scale.