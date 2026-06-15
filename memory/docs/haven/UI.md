# UI

This file documents the responsibilities and members of `UI`.

## Meta

- Source: [UI.java](../../../src/haven/UI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates the client UI event loop.

## Nested Types

### AddWidget

- Description: TODO

### AfterDraw

- Description: TODO

### Command

- Description: TODO

### CommandException

- Description: TODO

### CommandQueue

- Description: TODO

### Context

- Description: TODO

### Cursor

- Description: TODO

### DstWidget

- Description: TODO

### ErrorMessage

- Description: TODO

### Grab

- Description: TODO

### InfoMessage

- Description: TODO

### NewWidget

- Description: TODO

### Notice

- Description: TODO

### NoticeEvent

- Description: TODO

### PointerGrab

- Description: TODO

### Receiver

- Description: TODO

### Runner

- Description: TODO

### SimpleMessage

- Description: TODO

### UIException

- Description: TODO

### UIWarning

- Description: TODO

### UiMessage

- Description: TODO

### WidgetConsole

- Description: TODO

### WidgetGrab

- Description: TODO

## Members

### Constants

#### `private static final double scalef`

- Description: TODO

#### `private static final java.util.concurrent.atomic.AtomicInteger nextid = new java.util.concurrent.atomic.AtomicInteger(0)`

- Description: TODO

#### `private static final boolean cmdjitter = false`

- Description: TODO

#### `private static final boolean cmddump = false`

- Description: TODO

#### `public static final Audio.Clip nosfx = () -> null`

- Description: TODO

#### `public static final Color color = new Color(192, 0, 0)`

- Description: TODO

#### `public static final Audio.Clip sfx = Audio.resclip(Resource.local().loadwait("sfx/error"))`

- Description: TODO

#### `public static final Audio.Clip sfx = Audio.resclip(Resource.local().loadwait("sfx/msg"))`

- Description: TODO

#### `public static final Config.Variable<Double> uiscale = Config.Variable.propf("haven.uiscale", null)`

- Description: TODO

### Fields

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`

- Description: TODO

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`

- Description: TODO

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`

- Description: TODO

#### `public static int MOD_SHIFT = KeyMatch.S, MOD_CTRL = KeyMatch.C, MOD_META = KeyMatch.M, MOD_SUPER = KeyMatch.SUPER`

- Description: TODO

#### `public RootWidget root`

- Description: TODO

#### `private final List<Grab> grabs = new CopyOnWriteArrayList<Grab>()`

- Description: TODO

#### `private final Map<Integer, Widget> widgets = new TreeMap<Integer, Widget>()`

- Description: TODO

#### `private final Map<Widget, Integer> rwidgets = new HashMap<Widget, Integer>()`

- Description: TODO

#### `Environment env`

- Description: TODO

#### `Receiver rcvr`

- Description: TODO

#### `public Coord mc = Coord.z, lcc = Coord.z`

- Description: TODO

#### `public Coord mc = Coord.z, lcc = Coord.z`

- Description: TODO

#### `public Session sess`

- Description: TODO

#### `public boolean modshift, modctrl, modmeta, modsuper`

- Description: TODO

#### `public boolean modshift, modctrl, modmeta, modsuper`

- Description: TODO

#### `public boolean modshift, modctrl, modmeta, modsuper`

- Description: TODO

#### `public boolean modshift, modctrl, modmeta, modsuper`

- Description: TODO

#### `public Object lasttip`

- Description: TODO

#### `public double lastevent, lasttick`

- Description: TODO

#### `public double lastevent, lasttick`

- Description: TODO

#### `public Widget mouseon`

- Description: TODO

#### `public Console cons = new WidgetConsole()`

- Description: TODO

#### `private Collection<AfterDraw> afterdraws = new LinkedList<AfterDraw>()`

- Description: TODO

#### `private final Context uictx`

- Description: TODO

#### `public GSettings gprefs = GSettings.load(true)`

- Description: TODO

#### `private boolean gprefsdirty = false`

- Description: TODO

#### `public final ActAudio.Root audio = new ActAudio.Root()`

- Description: TODO

#### `public final Loader loader`

- Description: TODO

#### `public final CommandQueue queue = new CommandQueue()`

- Description: TODO

#### `public final Runner back`

- Description: TODO

#### `public String mname`

- Description: TODO

#### `public Object[] args`

- Description: TODO

#### `public String mname`

- Description: TODO

#### `public Object[] args`

- Description: TODO

#### `public final int id = nextid.getAndIncrement()`

- Description: TODO

#### `public final Collection<Integer> deps = new ArrayList<>()`

- Description: TODO

#### `public final Collection<Integer> bars = new ArrayList<>()`

- Description: TODO

#### `public final Collection<Command> next = new ArrayList<>()`

- Description: TODO

#### `public final Collection<Command> wait = new ArrayList<>()`

- Description: TODO

#### `public final Runnable action`

- Description: TODO

#### `public final Command cmd`

- Description: TODO

#### `private final Map<Integer, Command> score = new HashMap<>()`

- Description: TODO

#### `private int inflight = 0`

- Description: TODO

#### `private Collection<Integer> or_deps = null, or_bars = null`

- Description: TODO

#### `private Collection<Integer> or_deps = null, or_bars = null`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final String typenm`

- Description: TODO

#### `public final Object[] cargs`

- Description: TODO

#### `private transient Widget.Factory type`

- Description: TODO

#### `private transient Widget wdg = null`

- Description: TODO

#### `private final MultiMap<Integer, Integer> shadowchildren = new HashMultiMap<>()`

- Description: TODO

#### `private final Map<Integer, Integer> shadowparents = new HashMap<>()`

- Description: TODO

#### `public final int id, parent`

- Description: TODO

#### `public final int id, parent`

- Description: TODO

#### `public final Object[] pargs`

- Description: TODO

#### `public final Widget owner`

- Description: TODO

#### `public final Class<E> etype`

- Description: TODO

#### `public final EventHandler<? super E> handler`

- Description: TODO

#### `public final Widget wdg`

- Description: TODO

#### `public final Widget wdg`

- Description: TODO

#### `public final EventHandler<? super E> bk`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final String msg`

- Description: TODO

#### `public final Object[] args`

- Description: TODO

#### `public String msg`

- Description: TODO

#### `public Color color`

- Description: TODO

#### `public Audio.Clip sfx`

- Description: TODO

#### `public final Notice msg`

- Description: TODO

#### `private Widget prevtt = null`

- Description: TODO

#### `public final Map<Audio.Clip, Double> lastmsgsfx = new HashMap<>()`

- Description: TODO

#### `private static double maxscale = -1`

- Description: TODO

### Methods

#### `public void rcvmsg(int widget, String msg, Object... args)`

- Description: TODO

#### `public Runner run(UI ui) throws InterruptedException`

- Description: TODO

#### `public default void init(UI ui)`

- Description: TODO

#### `public default String title()`

- Description: TODO

#### `public Proxy(Runner back)`

- Description: TODO

#### `public Runner run(UI ui) throws InterruptedException`

- Description: TODO

#### `public void init(UI ui)`

- Description: TODO

#### `public String title()`

- Description: TODO

#### `void setmousepos(Coord c)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void setgprefs(GSettings prefs)`

- Description: TODO

#### `private void findcmds(Map<String, Command> map, Widget wdg)`

- Description: TODO

#### `public Map<String, Command> findcmds()`

- Description: TODO

#### `public UIException(String message, String mname, Object... args)`

- Description: TODO

#### `public void printStackTrace(java.io.PrintStream out)`

- Description: TODO

#### `public UIWarning(String message, String mname, Object... args)`

- Description: TODO

#### `public UI(Context uictx, Coord sz, Runner fun)`

- Description: TODO

#### `public Command(Runnable action)`

- Description: TODO

#### `public Command dep(int id, boolean bar)`

- Description: TODO

#### `private String fl(String id, Collection<?> l)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public CommandException(Command cmd, Throwable cause)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `private CommandQueue()`

- Description: TODO

#### `private void run(Command cmd)`

- Description: TODO

#### `private void execute(Command cmd)`

- Description: TODO

#### `public void submit(Command cmd)`

- Description: TODO

#### `public void finish(Command cmd)`

- Description: TODO

#### `public void drain()`

- Description: TODO

#### `public void setreceiver(Receiver rcvr)`

- Description: TODO

#### `public void bind(Widget w, int id)`

- Description: TODO

#### `public Widget getwidget(int id)`

- Description: TODO

#### `public int widgetid(Widget wdg)`

- Description: TODO

#### `public void drawafter(AfterDraw ad)`

- Description: TODO

#### `public void tick()`

- Description: TODO

#### `public void gtick(Render out)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private void submitcmd(Command cmd)`

- Description: TODO

#### `private NewWidget(int id, Widget.Factory type, Object... cargs)`

- Description: TODO

#### `private NewWidget(int id, String type, Object... cargs)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void newwidget(int id, Widget.Factory type, Object... cargs)`

- Description: TODO

#### `public void newwidget(int id, String type, Object... cargs) throws InterruptedException`

- Description: TODO

#### `private AddWidget(int id, int parent, Object... pargs)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void addwidget(int id, int parent, Object... pargs)`

- Description: TODO

#### `public void wdgbarrier(Collection<Integer> deps, Collection<Integer> bars)`

- Description: TODO

#### `public void newwidgetp(int id, Widget.Factory type, int parent, Object[] pargs, Object... cargs)`

- Description: TODO

#### `public void newwidgetp(int id, String type, int parent, Object[] pargs, Object... cargs) throws InterruptedException`

- Description: TODO

#### `private Grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `private boolean check(Event ev)`

- Description: TODO

#### `public <E extends Event> Grab<E> grab(Widget owner, Class<E> etype, EventHandler<? super E> handler)`

- Description: TODO

#### `public WidgetGrab(Widget wdg)`

- Description: TODO

#### `public boolean handle(Event ev)`

- Description: TODO

#### `public PointerGrab(Widget wdg, EventHandler<? super E> bk)`

- Description: TODO

#### `public boolean handle(E ev)`

- Description: TODO

#### `public Grab grabmouse(Widget wdg)`

- Description: TODO

#### `public Grab grabkeys(Widget wdg)`

- Description: TODO

#### `private void removeid(Widget wdg)`

- Description: TODO

#### `public void removed(Widget wdg)`

- Description: TODO

#### `public void destroy(Widget wdg)`

- Description: TODO

#### `public boolean dispatch(Widget to, Event ev)`

- Description: TODO

#### `public <E extends Event> E dispatchq(Widget to, E ev)`

- Description: TODO

#### `private DstWidget(int id)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void destroy(int id)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `private UiMessage(int id, String msg, Object[] args)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void uimsg(int id, String msg, Object... args)`

- Description: TODO

#### `public String message()`

- Description: TODO

#### `public default Color color()`

- Description: TODO

#### `public default Audio.Clip sfx()`

- Description: TODO

#### `public default boolean handle(Widget w)`

- Description: TODO

#### `public default boolean handler(Widget w)`

- Description: TODO

#### `public default boolean msg(Notice msg)`

- Description: TODO

#### `public default boolean msg(NoticeEvent ev)`

- Description: TODO

#### `public FactMaker()`

- Description: TODO

#### `public Notice format(OwnerContext owner, Object... args)`

- Description: TODO

#### `public SimpleMessage(String msg, Color color, Audio.Clip sfx)`

- Description: TODO

#### `public SimpleMessage(String msg)`

- Description: TODO

#### `public String message()`

- Description: TODO

#### `public Color color()`

- Description: TODO

#### `public Audio.Clip sfx()`

- Description: TODO

#### `protected Color defcolor()`

- Description: TODO

#### `protected Audio.Clip defsfx()`

- Description: TODO

#### `public ErrorMessage(String msg)`

- Description: TODO

#### `protected Color defcolor()`

- Description: TODO

#### `protected Audio.Clip defsfx()`

- Description: TODO

#### `public InfoMessage(String msg)`

- Description: TODO

#### `public InfoMessage(String msg, Color color, Audio.Clip sfx)`

- Description: TODO

#### `protected Audio.Clip defsfx()`

- Description: TODO

#### `public NoticeEvent(Notice msg)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public void msg(Notice msg)`

- Description: TODO

#### `public void msg(String msg, Color color, Audio.Clip sfx)`

- Description: TODO

#### `public void error(String msg)`

- Description: TODO

#### `public void msg(String msg)`

- Description: TODO

#### `private void setmods(InputEvent ev)`

- Description: TODO

#### `private Grab[] c(Collection<Grab> g)`

- Description: TODO

#### `public void keydown(KeyEvent ev)`

- Description: TODO

#### `public void keyup(KeyEvent ev)`

- Description: TODO

#### `public void mousedown(MouseEvent ev, Coord c, int button)`

- Description: TODO

#### `public void mouseup(MouseEvent ev, Coord c, int button)`

- Description: TODO

#### `public void mousemove(MouseEvent ev, Coord c)`

- Description: TODO

#### `public void mousehover(Coord c)`

- Description: TODO

#### `public void setmousepos(Coord c)`

- Description: TODO

#### `public void mousewheel(MouseEvent ev, Coord c, int ia, double sa)`

- Description: TODO

#### `public Object getcurs(Coord c)`

- Description: TODO

#### `public Object tooltip(Coord c)`

- Description: TODO

#### `public static int modflags(InputEvent ev)`

- Description: TODO

#### `public int modflags()`

- Description: TODO

#### `public Environment getenv()`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `public void sfx(Audio.CS clip)`

- Description: TODO

#### `public void sfx(Audio.Clip clip)`

- Description: TODO

#### `public void sfx(Resource clip)`

- Description: TODO

#### `public void sfxrl(Audio.Clip clip)`

- Description: TODO

#### `public Resource.Pool pool()`

- Description: TODO

#### `public static double scale(double v)`

- Description: TODO

#### `public static float scale(float v)`

- Description: TODO

#### `public static int scale(int v)`

- Description: TODO

#### `public static int rscale(double v)`

- Description: TODO

#### `public static Coord scale(Coord v)`

- Description: TODO

#### `public static Coord scale(int x, int y)`

- Description: TODO

#### `public static Coord rscale(double x, double y)`

- Description: TODO

#### `public static Coord2d scale(Coord2d v)`

- Description: TODO

#### `static public Font scale(Font f, float size)`

- Description: TODO

#### `public static <T extends Tex> ScaledTex<T> scale(T tex)`

- Description: TODO

#### `public static <T extends Tex> ScaledTex<T> scale(ScaledTex<T> tex)`

- Description: TODO

#### `public static double unscale(double v)`

- Description: TODO

#### `public static float unscale(float v)`

- Description: TODO

#### `public static int unscale(int v)`

- Description: TODO

#### `public static Coord unscale(Coord v)`

- Description: TODO

#### `public static double maxscale()`

- Description: TODO

#### `private static double loadscale()`

- Description: TODO
