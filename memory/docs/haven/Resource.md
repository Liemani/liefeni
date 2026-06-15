# Resource

This file documents the responsibilities and members of `Resource`.

## Meta

- Source: [Resource.java](../../../src/haven/Resource.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a loaded resource.

## Nested Types

### AButton

- Description: TODO

### Anim

- Description: TODO

### Audio

- Description: TODO

### BadResourceException

- Description: TODO

### BadVersionException

- Description: TODO

### CacheSource

- Description: TODO

### Code

- Description: TODO

### CodeEntry

- Description: TODO

### FileSource

- Description: TODO

### Font

- Description: TODO

### HttpSource

- Description: TODO

### IDLayer

- Description: TODO

### Image

- Description: TODO

### ImageReadException

- Description: TODO

### JarSource

- Description: TODO

### Layer

- Description: TODO

### LayerConstructor

- Description: TODO

### LayerFactory

- Description: TODO

### LayerName

- Description: TODO

### LibClassLoader

- Description: TODO

### LoadException

- Description: TODO

### LoadFailedException

- Description: TODO

### LoadWarning

- Description: TODO

### Loader

- Description: TODO

### Loading

- Description: TODO

### Metadata

- Description: TODO

### Music

- Description: TODO

### Named

- Description: TODO

### Neg

- Description: TODO

### NoSuchLayerException

- Description: TODO

### NoSuchResourceException

- Description: TODO

### Obstacle

- Description: TODO

### Pagina

- Description: TODO

### Pool

- Description: TODO

### PoolMapper

- Description: TODO

### Props

- Description: TODO

### PublishedCode

- Description: TODO

### Queued

- Description: TODO

### ResClassLoader

- Description: TODO

### ResSource

- Description: TODO

### Resolver

- Description: TODO

### ResourceClassNotFoundException

- Description: TODO

### Saved

- Description: TODO

### Spec

- Description: TODO

### TeeSource

- Description: TODO

### Tooltip

- Description: TODO

### UnknownFormatException

- Description: TODO

### Virtual

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<URI> resurl = Config.Variable.propu("haven.resurl", "")`

- Description: TODO

#### `public static final Config.Variable<Path> resdir = Config.Variable.propp("haven.resdir", System.getenv("HAFEN_RESDIR"))`

- Description: TODO

#### `public static final Collection<String> wintraps =`

- Description: TODO

#### `public static final boolean windows = System.getProperty("os.name", "").startsWith("Windows")`

- Description: TODO

#### `private static final boolean[] winsafe`

- Description: TODO

#### `public static final Instancer<Object> simple = (cl, res, args) ->`

- Description: TODO

#### `public static final Map<PublishedCode, Instancer> instancers = new WeakHashMap<>()`

- Description: TODO

#### `public static final boolean OVERRIDE_ALL = false`

- Description: TODO

#### `private static final Map<Pair<Class<?>, String>, Class<?>> builtinents = new HashMap<>()`

- Description: TODO

#### `private static final byte[] RESOURCE_SIG = "Haven Resource 1".getBytes(Utils.ascii)`

- Description: TODO

### Fields

#### `private static ResCache prscache`

- Description: TODO

#### `public static ThreadGroup loadergroup = null`

- Description: TODO

#### `private static Map<String, LayerFactory<?>> ltypes = new TreeMap<String, LayerFactory<?>>()`

- Description: TODO

#### `public static Class<Image> imgc = Image.class`

- Description: TODO

#### `public static Class<Neg> negc = Neg.class`

- Description: TODO

#### `public static Class<Props> props = Props.class`

- Description: TODO

#### `public static Class<Obstacle> obst = Obstacle.class`

- Description: TODO

#### `public static Class<Anim> animc = Anim.class`

- Description: TODO

#### `public static Class<Pagina> pagina = Pagina.class`

- Description: TODO

#### `public static Class<AButton> action = AButton.class`

- Description: TODO

#### `public static Class<Audio> audio = Audio.class`

- Description: TODO

#### `public static Class<Tooltip> tooltip = Tooltip.class`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public int ver`

- Description: TODO

#### `public ResSource source`

- Description: TODO

#### `public final transient Pool pool`

- Description: TODO

#### `protected Collection<Layer> layers = new LinkedList<Layer>()`

- Description: TODO

#### `private boolean used = false`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final int ver`

- Description: TODO

#### `public final transient Pool pool`

- Description: TODO

#### `public final transient Pool pool`

- Description: TODO

#### `public int prio = 0`

- Description: TODO

#### `private transient Indir<Resource> wver = null`

- Description: TODO

#### `private Throwable verr = null`

- Description: TODO

#### `private transient Resource loaded`

- Description: TODO

#### `public final R rr`

- Description: TODO

#### `public final Resource.Resolver bk`

- Description: TODO

#### `public final Map<Integer, ? extends Object> map`

- Description: TODO

#### `public ResSource back`

- Description: TODO

#### `public final transient ResCache cache`

- Description: TODO

#### `public final String cachedesc`

- Description: TODO

#### `public final Path base`

- Description: TODO

#### `public final String base`

- Description: TODO

#### `public URI base`

- Description: TODO

#### `private final Pool.Queued res`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final int ver`

- Description: TODO

#### `public final int curver`

- Description: TODO

#### `public final String cursrc`

- Description: TODO

#### `public int nloaders = 2`

- Description: TODO

#### `private final Collection<Loader> loaders = new LinkedList<Loader>()`

- Description: TODO

#### `private final List<ResSource> sources = new LinkedList<ResSource>()`

- Description: TODO

#### `private final Map<String, Resource> cache = new CacheMap<String, Resource>()`

- Description: TODO

#### `private final PrioQueue<Queued> queue = new PrioQueue<Queued>()`

- Description: TODO

#### `private final Map<String, Queued> queued = new HashMap<String, Queued>()`

- Description: TODO

#### `private final Pool parent`

- Description: TODO

#### `transient final Collection<Queued> rdep = new LinkedList<Queued>()`

- Description: TODO

#### `final Waitable.Queue wq = new Waitable.Queue()`

- Description: TODO

#### `volatile int prio`

- Description: TODO

#### `Queued awaiting`

- Description: TODO

#### `volatile boolean done = false`

- Description: TODO

#### `Resource res`

- Description: TODO

#### `LoadException error`

- Description: TODO

#### `boolean found = false`

- Description: TODO

#### `private boolean added = false`

- Description: TODO

#### `private final Set<Resource> loadwaited = new HashSet<Resource>()`

- Description: TODO

#### `private static Pool _local = null`

- Description: TODO

#### `private static Pool _remote = null`

- Description: TODO

#### `public Resource res`

- Description: TODO

#### `public ResSource src`

- Description: TODO

#### `public LoadException prev`

- Description: TODO

#### `public final String thing`

- Description: TODO

#### `public final Object found`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `public final Pool pool`

- Description: TODO

#### `public final Class<T> cl`

- Description: TODO

#### `private final Constructor<T> cons`

- Description: TODO

#### `public final String[] supported = ImageIO.getReaderMIMETypes()`

- Description: TODO

#### `public transient BufferedImage img`

- Description: TODO

#### `private transient BufferedImage scaled`

- Description: TODO

#### `private transient Tex tex, rawtex`

- Description: TODO

#### `private transient Tex tex, rawtex`

- Description: TODO

#### `public final int z, subz`

- Description: TODO

#### `public final int z, subz`

- Description: TODO

#### `public final boolean nooff`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final Map<String, Object> info`

- Description: TODO

#### `public float scale = 1`

- Description: TODO

#### `public Coord sz, o, so, tsz, ssz, stsz`

- Description: TODO

#### `public Coord sz, o, so, tsz, ssz, stsz`

- Description: TODO

#### `public Coord sz, o, so, tsz, ssz, stsz`

- Description: TODO

#### `public Coord sz, o, so, tsz, ssz, stsz`

- Description: TODO

#### `public Coord sz, o, so, tsz, ssz, stsz`

- Description: TODO

#### `public Coord sz, o, so, tsz, ssz, stsz`

- Description: TODO

#### `public final String t`

- Description: TODO

#### `public Coord cc`

- Description: TODO

#### `public Coord[][] ep`

- Description: TODO

#### `public final Map<String, Object> props = new HashMap<>()`

- Description: TODO

#### `public final String id`

- Description: TODO

#### `public final Coord2d[][] p`

- Description: TODO

#### `private int[] ids`

- Description: TODO

#### `public int id, d`

- Description: TODO

#### `public int id, d`

- Description: TODO

#### `public Image[][] f`

- Description: TODO

#### `public final String text`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final Named parent`

- Description: TODO

#### `public final char hk`

- Description: TODO

#### `public final String[] ad`

- Description: TODO

#### `Class<? extends Instancer> instancer() default Instancer.class`

- Description: TODO

#### `public final Class<I> type`

- Description: TODO

#### `public final Class<I> type`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final Class<R> rtype`

- Description: TODO

#### `public final Class<?>[] args`

- Description: TODO

#### `public final Function<Function<Object[], R>, I> maker`

- Description: TODO

#### `public final Class<I> type`

- Description: TODO

#### `public final Class<R> rtype`

- Description: TODO

#### `public final Class<?>[] args`

- Description: TODO

#### `public final Function<Function<Object[], ? extends R>, I> maker`

- Description: TODO

#### `public final Class<I> type`

- Description: TODO

#### `private final Collection<Instancer<? extends I>> sub = new ArrayList<>()`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `transient public final byte[] data`

- Description: TODO

#### `public final CodeEntry entry`

- Description: TODO

#### `private final ClassLoader[] classpath`

- Description: TODO

#### `public final String clname`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `private final Map<String, Code> clmap = new HashMap<>()`

- Description: TODO

#### `private final Map<String, String> pe = new HashMap<>()`

- Description: TODO

#### `private final Map<String, Object[]> pa = new HashMap<>()`

- Description: TODO

#### `private final Collection<Indir<Resource>> classpath = new ArrayList<>()`

- Description: TODO

#### `transient private ClassLoader loader`

- Description: TODO

#### `transient private final Map<String, Class<?>> lpe = new HashMap<>()`

- Description: TODO

#### `transient private final Map<String, Object> ipe = new HashMap<>()`

- Description: TODO

#### `transient public byte[] coded`

- Description: TODO

#### `public final String id`

- Description: TODO

#### `public final Map<String, Object> info`

- Description: TODO

#### `public double bvol = 1.0`

- Description: TODO

#### `transient javax.sound.midi.Sequence seq`

- Description: TODO

#### `public transient final java.awt.Font font`

- Description: TODO

#### `private transient Named indir = null`

- Description: TODO

### Methods

#### `public Named(String name, int ver)`

- Description: TODO

#### `public boolean equals(Object other)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Spec(Pool pool, String name, int ver)`

- Description: TODO

#### `public Spec(Pool pool, String name)`

- Description: TODO

#### `public Resource get(int prio)`

- Description: TODO

#### `public Resource get()`

- Description: TODO

#### `public Saved(Pool pool, String name, int ver)`

- Description: TODO

#### `public Resource get(int prio)`

- Description: TODO

#### `public Resource get()`

- Description: TODO

#### `public int savever()`

- Description: TODO

#### `public Indir<Resource> getres(int id)`

- Description: TODO

#### `public default Indir<Resource> dynres(UID uid)`

- Description: TODO

#### `public Descriptor(R rr)`

- Description: TODO

#### `public Maybe<Indir<Resource>> opt(Object desc)`

- Description: TODO

#### `public default PType<Indir<Resource>> desc()`

- Description: TODO

#### `public default Indir<Resource> getresv(Object desc)`

- Description: TODO

#### `public ResourceMap(Resource.Resolver bk, Map<Integer, ? extends Object> map)`

- Description: TODO

#### `public ResourceMap(Resource.Resolver bk, Message data)`

- Description: TODO

#### `public ResourceMap(Resource.Resolver bk, Object[] args)`

- Description: TODO

#### `public static Map<Integer, Integer> decode(Message sdt)`

- Description: TODO

#### `public static Map<Integer, ? extends Object> decode(Object[] args)`

- Description: TODO

#### `public Indir<Resource> getres(int id)`

- Description: TODO

#### `public Indir<Resource> dynres(UID uid)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private Resource(Pool pool, String name, int ver)`

- Description: TODO

#### `public Virtual(Pool pool, String name, int ver)`

- Description: TODO

#### `public void add(Layer layer)`

- Description: TODO

#### `public static void setcache(ResCache cache)`

- Description: TODO

#### `public String basename()`

- Description: TODO

#### `public InputStream get(String name) throws IOException`

- Description: TODO

#### `public TeeSource(ResSource back)`

- Description: TODO

#### `public InputStream get(String name) throws IOException`

- Description: TODO

#### `public abstract OutputStream fork(String name) throws IOException`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public CacheSource(ResCache cache)`

- Description: TODO

#### `public InputStream get(String name) throws IOException`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public static boolean winsafechar(char c)`

- Description: TODO

#### `public FileSource(Path base)`

- Description: TODO

#### `private static String checkpart(String part, String whole) throws FileNotFoundException`

- Description: TODO

#### `public InputStream get(String name) throws IOException`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public JarSource(String base)`

- Description: TODO

#### `public InputStream get(String name) throws FileNotFoundException`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public HttpSource(URI base)`

- Description: TODO

#### `private URI encodeuri(URI raw) throws IOException`

- Description: TODO

#### `public InputStream get(String name) throws IOException`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private Loading(Pool.Queued res)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

#### `public boolean boostprio(int prio)`

- Description: TODO

#### `public BadResourceException(String name, int ver, String message, Throwable cause)`

- Description: TODO

#### `public BadResourceException(String name, int ver, String message)`

- Description: TODO

#### `public BadResourceException(String name, int ver, Throwable cause)`

- Description: TODO

#### `public BadResourceException(String name, int ver)`

- Description: TODO

#### `public LoadFailedException(String name, int ver, LoadException cause)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `public NoSuchResourceException(String name, int ver, LoadException cause)`

- Description: TODO

#### `public BadVersionException(String name, int ver, int curver, ResSource cursrc)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `public Pool(Pool parent, ResSource... sources)`

- Description: TODO

#### `public Pool(ResSource... sources)`

- Description: TODO

#### `public void add(ResSource src)`

- Description: TODO

#### `Queued(String name, int ver, int prio)`

- Description: TODO

#### `public int priority()`

- Description: TODO

#### `public void boostprio(int prio)`

- Description: TODO

#### `public Resource get()`

- Description: TODO

#### `private void done()`

- Description: TODO

#### `private void prior(Queued prior)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private void handle(Queued res)`

- Description: TODO

#### `public Named load(String name, int ver, int prio)`

- Description: TODO

#### `public Named load(String name, int ver)`

- Description: TODO

#### `public Named load(String name)`

- Description: TODO

#### `public Indir<Resource> dynres(long id)`

- Description: TODO

#### `public Indir<Resource> dynres(UID id)`

- Description: TODO

#### `private void ckld()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public int qdepth()`

- Description: TODO

#### `public int numloaded()`

- Description: TODO

#### `public Collection<Resource> cached()`

- Description: TODO

#### `public Collection<Resource> used()`

- Description: TODO

#### `public Collection<Resource> loadwaited()`

- Description: TODO

#### `private Resource loadwaited(Resource res)`

- Description: TODO

#### `public Resource loadwaitint(String name, int ver) throws InterruptedException`

- Description: TODO

#### `public Resource loadwaitint(String name) throws InterruptedException`

- Description: TODO

#### `public Resource loadwait(String name, int ver)`

- Description: TODO

#### `public Resource loadwait(String name)`

- Description: TODO

#### `public static Pool local()`

- Description: TODO

#### `public static Pool remote()`

- Description: TODO

#### `public static void addurl(URI uri)`

- Description: TODO

#### `public LoadException(String msg, Resource res)`

- Description: TODO

#### `public LoadException(String msg, Throwable cause, Resource res)`

- Description: TODO

#### `public LoadException(Throwable cause, Resource res)`

- Description: TODO

#### `public UnknownFormatException(Resource res, String thing, Object found)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `public LoadWarning(Resource res, String msg)`

- Description: TODO

#### `public LoadWarning(Resource res, String msg, Object... args)`

- Description: TODO

#### `public static Coord cdec(Message buf)`

- Description: TODO

#### `public PoolMapper(Pool pool)`

- Description: TODO

#### `public Object apply(Object obj)`

- Description: TODO

#### `public abstract void init()`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `protected Function<Object, Object> resmapper()`

- Description: TODO

#### `public T cons(Resource res, Message buf)`

- Description: TODO

#### `public LayerConstructor(Class<T> cl)`

- Description: TODO

#### `public T cons(Resource res, Message buf)`

- Description: TODO

#### `public static void addltype(String name, LayerFactory<?> cons)`

- Description: TODO

#### `public static <T extends Layer> void addltype(String name, Class<T> cl)`

- Description: TODO

#### `public String value()`

- Description: TODO

#### `public Map<?, ?> info()`

- Description: TODO

#### `public T layerid()`

- Description: TODO

#### `public ImageReadException()`

- Description: TODO

#### `public static BufferedImage readimage(InputStream fp) throws IOException`

- Description: TODO

#### `public Image(Message buf)`

- Description: TODO

#### `public BufferedImage scaled()`

- Description: TODO

#### `public Tex rawtex()`

- Description: TODO

#### `public Tex tex()`

- Description: TODO

#### `public Integer layerid()`

- Description: TODO

#### `public Map<String, Object> info()`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Tooltip(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Neg(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Props(Message buf)`

- Description: TODO

#### `public Object get(String nm)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Obstacle(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public String layerid()`

- Description: TODO

#### `public Anim(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Pagina(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public AButton(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `String name()`

- Description: TODO

#### `Class<? extends Instancer> instancer() default Instancer.class`

- Description: TODO

#### `public I make(Class<?> cl, Resource res, Object... args)`

- Description: TODO

#### `public static <T, U extends T> T stdmake(Class<T> type, Class<U> cl, Resource ires, Object[] args)`

- Description: TODO

#### `public Direct(Class<I> type)`

- Description: TODO

#### `public I make(Class<?> cl, Resource res, Object... args)`

- Description: TODO

#### `public StaticCall(Class<I> type, String name, Class<R> rtype, Class<?>[] args, Function<Function<Object[], R>, I> maker)`

- Description: TODO

#### `public I make(Class <?> cl, Resource res, Object... args)`

- Description: TODO

#### `public Construct(Class<I> type, Class<R> rtype, Class<?>[] args, Function<Function<Object[], ? extends R>, I> maker)`

- Description: TODO

#### `public I make(Class <?> cl, Resource res, Object... args)`

- Description: TODO

#### `public Chain(Class<I> type)`

- Description: TODO

#### `public void add(Instancer<? extends I> el)`

- Description: TODO

#### `public I make(Class<?> cl, Resource res, Object... args)`

- Description: TODO

#### `public Class<?> type()`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public Code(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public ResClassLoader(ClassLoader parent, CodeEntry entry)`

- Description: TODO

#### `public Code findcode(String name)`

- Description: TODO

#### `public Class<?> findClass(String name) throws ClassNotFoundException`

- Description: TODO

#### `public static FromResource getsource(Class<?> cl)`

- Description: TODO

#### `public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public LibClassLoader(ClassLoader parent, Collection<ClassLoader> classpath)`

- Description: TODO

#### `public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException`

- Description: TODO

#### `public ResourceClassNotFoundException(String clname, Resource res)`

- Description: TODO

#### `public CodeEntry(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public ClassLoader loader()`

- Description: TODO

#### `private Class<?> getentry(Class<?> cl, boolean fail)`

- Description: TODO

#### `public <T> Class<? extends T> getcl(Class<T> cl, boolean fail)`

- Description: TODO

#### `public <T> Class<? extends T> getcl(Class<T> cl)`

- Description: TODO

#### `public <T> T get(Class<T> cl, boolean fail)`

- Description: TODO

#### `public <T> T get(Class<T> cl)`

- Description: TODO

#### `public static Resource classres(final Class<?> cl)`

- Description: TODO

#### `public <T> T getcode(Class<T> cl, boolean fail)`

- Description: TODO

#### `public Audio(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public haven.Audio.CS stream()`

- Description: TODO

#### `public String layerid()`

- Description: TODO

#### `public Map<String, Object> info()`

- Description: TODO

#### `public double bvol()`

- Description: TODO

#### `public Music(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Font(Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `private void readall(InputStream in, byte[] buf) throws IOException`

- Description: TODO

#### `public <L extends Layer> Collection<L> layers(final Class<L> cl)`

- Description: TODO

#### `public NoSuchLayerException(String message)`

- Description: TODO

#### `public <L extends Layer> L layer(Class<L> cl)`

- Description: TODO

#### `public <L extends Layer> L flayer(Class<L> cl)`

- Description: TODO

#### `public <L> Collection<L> layers(Class<L> cl, Predicate<? super L> sel)`

- Description: TODO

#### `public <L> L layer(Class<L> cl, Predicate<? super L> sel)`

- Description: TODO

#### `public <L> L flayer(Class<L> cl, Predicate<? super L> sel)`

- Description: TODO

#### `public <I, L extends IDLayer<I>> L layer(Class<L> cl, I id)`

- Description: TODO

#### `public <I, L extends IDLayer<I>> L flayer(Class<L> cl, I id)`

- Description: TODO

#### `public boolean equals(Object other)`

- Description: TODO

#### `private void load(Message in)`

- Description: TODO

#### `public Named indir()`

- Description: TODO

#### `public static Image loadrimg(String name)`

- Description: TODO

#### `public static BufferedImage loadimg(String name)`

- Description: TODO

#### `public static BufferedImage loadsimg(String name)`

- Description: TODO

#### `public static Tex loadtex(String name)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public static void loadlist(Pool pool, InputStream list, int prio) throws IOException`

- Description: TODO

#### `public static void dumplist(Collection<Resource> list, Writer dest)`

- Description: TODO

#### `public static void updateloadlist(Path file, Path resdir) throws Exception`

- Description: TODO

#### `private static void usage_getcode(PrintStream out)`

- Description: TODO

#### `public static void cmd_getcode(String[] args)`

- Description: TODO

#### `private static void usage_findupdates(PrintStream out)`

- Description: TODO

#### `public static void cmd_findupdates(String[] args)`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO
