# Resource

This file documents the responsibilities and members of `Resource`.

## Meta

- Source: [Resource.java](../../../src/haven/Resource.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Loads and manages client resources.

## Nested Types

### AButton

- Role: Represents abutton within Resource.
- Description: Describes the nested abutton type used by the enclosing class.

### Anim

- Role: Represents anim within Resource.
- Description: Describes the nested anim type used by the enclosing class.

### Audio

- Role: Represents audio within Resource.
- Description: Describes the nested audio type used by the enclosing class.

### BadResourceException

- Role: Represents bad resource exception within Resource.
- Description: Describes the nested bad resource exception type used by the enclosing class.

### BadVersionException

- Role: Represents bad version exception within Resource.
- Description: Describes the nested bad version exception type used by the enclosing class.

### CacheSource

- Role: Represents cache source within Resource.
- Description: Describes the nested cache source type used by the enclosing class.

### Code

- Role: Represents code within Resource.
- Description: Describes the nested code type used by the enclosing class.

### CodeEntry

- Role: Represents code entry within Resource.
- Description: Describes the nested code entry type used by the enclosing class.

### FileSource

- Role: Represents file source within Resource.
- Description: Describes the nested file source type used by the enclosing class.

### Font

- Role: Represents font within Resource.
- Description: Describes the nested font type used by the enclosing class.

### HttpSource

- Role: Represents http source within Resource.
- Description: Describes the nested http source type used by the enclosing class.

### IDLayer

- Role: Represents idlayer within Resource.
- Description: Describes the nested idlayer type used by the enclosing class.

### Image

- Role: Represents image within Resource.
- Description: Describes the nested image type used by the enclosing class.

### ImageReadException

- Role: Represents image read exception within Resource.
- Description: Describes the nested image read exception type used by the enclosing class.

### JarSource

- Role: Represents jar source within Resource.
- Description: Describes the nested jar source type used by the enclosing class.

### Layer

- Role: Represents layer within Resource.
- Description: Describes the nested layer type used by the enclosing class.

### LayerConstructor

- Role: Represents layer constructor within Resource.
- Description: Describes the nested layer constructor type used by the enclosing class.

### LayerFactory

- Role: Represents layer factory within Resource.
- Description: Describes the nested layer factory type used by the enclosing class.

### LayerName

- Role: Represents layer name within Resource.
- Description: Describes the nested layer name type used by the enclosing class.

### LibClassLoader

- Role: Represents lib class loader within Resource.
- Description: Describes the nested lib class loader type used by the enclosing class.

### LoadException

- Role: Represents load exception within Resource.
- Description: Describes the nested load exception type used by the enclosing class.

### LoadFailedException

- Role: Represents load failed exception within Resource.
- Description: Describes the nested load failed exception type used by the enclosing class.

### LoadWarning

- Role: Represents load warning within Resource.
- Description: Describes the nested load warning type used by the enclosing class.

### Loader

- Role: Represents loader within Resource.
- Description: Describes the nested loader type used by the enclosing class.

### Loading

- Role: Represents loading within Resource.
- Description: Describes the nested loading type used by the enclosing class.

### Metadata

- Role: Represents metadata within Resource.
- Description: Describes the nested metadata type used by the enclosing class.

### Music

- Role: Represents music within Resource.
- Description: Describes the nested music type used by the enclosing class.

### Named

- Role: Represents named within Resource.
- Description: Describes the nested named type used by the enclosing class.

### Neg

- Role: Represents neg within Resource.
- Description: Describes the nested neg type used by the enclosing class.

### NoSuchLayerException

- Role: Represents no such layer exception within Resource.
- Description: Describes the nested no such layer exception type used by the enclosing class.

### NoSuchResourceException

- Role: Represents no such resource exception within Resource.
- Description: Describes the nested no such resource exception type used by the enclosing class.

### Obstacle

- Role: Represents obstacle within Resource.
- Description: Describes the nested obstacle type used by the enclosing class.

### Pagina

- Role: Represents pagina within Resource.
- Description: Describes the nested pagina type used by the enclosing class.

### Pool

- Role: Represents pool within Resource.
- Description: Describes the nested pool type used by the enclosing class.

### PoolMapper

- Role: Represents pool mapper within Resource.
- Description: Describes the nested pool mapper type used by the enclosing class.

### Props

- Role: Represents props within Resource.
- Description: Describes the nested props type used by the enclosing class.

### PublishedCode

- Role: Represents published code within Resource.
- Description: Describes the nested published code type used by the enclosing class.

### Queued

- Role: Represents queued within Resource.
- Description: Describes the nested queued type used by the enclosing class.

### ResClassLoader

- Role: Represents res class loader within Resource.
- Description: Describes the nested res class loader type used by the enclosing class.

### ResSource

- Role: Represents res source within Resource.
- Description: Describes the nested res source type used by the enclosing class.

### Resolver

- Role: Represents resolver within Resource.
- Description: Describes the nested resolver type used by the enclosing class.

### ResourceClassNotFoundException

- Role: Represents resource class not found exception within Resource.
- Description: Describes the nested resource class not found exception type used by the enclosing class.

### Saved

- Role: Represents saved within Resource.
- Description: Describes the nested saved type used by the enclosing class.

### Spec

- Role: Represents spec within Resource.
- Description: Describes the nested spec type used by the enclosing class.

### TeeSource

- Role: Represents tee source within Resource.
- Description: Describes the nested tee source type used by the enclosing class.

### Tooltip

- Role: Represents tooltip within Resource.
- Description: Describes the nested tooltip type used by the enclosing class.

### UnknownFormatException

- Role: Represents unknown format exception within Resource.
- Description: Describes the nested unknown format exception type used by the enclosing class.

### Virtual

- Role: Represents virtual within Resource.
- Description: Describes the nested virtual type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<URI> resurl = Config.Variable.propu("haven.resurl", "")`
- Role: Defines the shared resurl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Path> resdir = Config.Variable.propp("haven.resdir", System.getenv("HAFEN_RESDIR"))`
- Role: Defines the shared resdir constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Collection<String> wintraps =`
- Role: Caches resource entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public static final boolean windows = System.getProperty("os.name", "").startsWith("Windows")`
- Role: Defines the shared windows constant.
- Description: Shared constant used by the rest of the class.

#### `private static final boolean[] winsafe`
- Role: Defines the shared winsafe constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Instancer<Object> simple = (cl, res, args) ->`
- Role: Defines the shared simple constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Map<PublishedCode, Instancer> instancers = new WeakHashMap<>()`
- Role: Defines the shared instancers constant.
- Description: Shared constant used by the rest of the class.

#### `public static final boolean OVERRIDE_ALL = false`
- Role: Defines the shared override all constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Pair<Class<?>, String>, Class<?>> builtinents = new HashMap<>()`
- Role: Defines the shared builtinents constant.
- Description: Shared constant used by the rest of the class.

#### `private static final byte[] RESOURCE_SIG = "Haven Resource 1".getBytes(Utils.ascii)`
- Role: Defines the shared resource sig constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static ResCache prscache`
- Role: Caches prscache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public static ThreadGroup loadergroup = null`
- Role: Holds the loadergroup state.
- Description: Backs the cached state for this file.

#### `private static Map<String, LayerFactory<?>> ltypes = new TreeMap<String, LayerFactory<?>>()`
- Role: Caches ltypes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public static Class<Image> imgc = Image.class`
- Role: Stores the imgc value.
- Description: Backs the cached state for this file.

#### `public static Class<Neg> negc = Neg.class`
- Role: Holds the negc state.
- Description: Backs the cached state for this file.

#### `public static Class<Props> props = Props.class`
- Role: Holds the props state.
- Description: Backs the cached state for this file.

#### `public static Class<Obstacle> obst = Obstacle.class`
- Role: Holds the obst state.
- Description: Backs the cached state for this file.

#### `public static Class<Anim> animc = Anim.class`
- Role: Holds the animc state.
- Description: Backs the cached state for this file.

#### `public static Class<Pagina> pagina = Pagina.class`
- Role: Holds the pagina state.
- Description: Backs the cached state for this file.

#### `public static Class<AButton> action = AButton.class`
- Role: Holds the action state.
- Description: Backs the cached state for this file.

#### `public static Class<Audio> audio = Audio.class`
- Role: Stores the audio value.
- Description: Backs the cached state for this file.

#### `public static Class<Tooltip> tooltip = Tooltip.class`
- Role: Holds the tooltip state.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public int ver`
- Role: Stores the ver value.
- Description: Backs the cached state for this file.

#### `public ResSource source`
- Role: Holds the source state.
- Description: Backs the cached state for this file.

#### `public final transient Pool pool`
- Role: Holds the pool state.
- Description: Backs the cached state for this file.

#### `protected Collection<Layer> layers = new LinkedList<Layer>()`
- Role: Caches layers entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean used = false`
- Role: Tracks the used flag.
- Description: Supports the used operation used by the surrounding class.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final int ver`
- Role: Stores the ver value.
- Description: Backs the cached state for this file.

#### `public final transient Pool pool`
- Role: Holds the pool state.
- Description: Backs the cached state for this file.

#### `public final transient Pool pool`
- Role: Holds the pool state.
- Description: Backs the cached state for this file.

#### `public int prio = 0`
- Role: Stores the prio value.
- Description: Backs the cached state for this file.

#### `private transient Indir<Resource> wver = null`
- Role: Stores the wver value.
- Description: Backs the cached state for this file.

#### `private Throwable verr = null`
- Role: Holds the verr state.
- Description: Backs the cached state for this file.

#### `private transient Resource loaded`
- Role: Stores the loaded value.
- Description: Backs the cached state for this file.

#### `public final R rr`
- Role: Holds the rr state.
- Description: Backs the cached state for this file.

#### `public final Resource.Resolver bk`
- Role: Stores the bk value.
- Description: Backs the cached state for this file.

#### `public final Map<Integer, ? extends Object> map`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public ResSource back`
- Role: Holds the back state.
- Description: Backs the cached state for this file.

#### `public final transient ResCache cache`
- Role: Caches cache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final String cachedesc`
- Role: Stores the cachedesc value.
- Description: Backs the cached state for this file.

#### `public final Path base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `public final String base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `public URI base`
- Role: Holds the base state.
- Description: Backs the cached state for this file.

#### `private final Pool.Queued res`
- Role: Holds the res state.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final int ver`
- Role: Stores the ver value.
- Description: Backs the cached state for this file.

#### `public final int curver`
- Role: Stores the curver value.
- Description: Backs the cached state for this file.

#### `public final String cursrc`
- Role: Stores the cursrc value.
- Description: Backs the cached state for this file.

#### `public int nloaders = 2`
- Role: Stores the nloaders value.
- Description: Backs the cached state for this file.

#### `private final Collection<Loader> loaders = new LinkedList<Loader>()`
- Role: Caches loaders entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final List<ResSource> sources = new LinkedList<ResSource>()`
- Role: Caches sources entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<String, Resource> cache = new CacheMap<String, Resource>()`
- Role: Caches cache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final PrioQueue<Queued> queue = new PrioQueue<Queued>()`
- Role: Caches queue entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<String, Queued> queued = new HashMap<String, Queued>()`
- Role: Caches queued entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Pool parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

#### `transient final Collection<Queued> rdep = new LinkedList<Queued>()`
- Role: Caches rdep entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Waitable.Queue wq = new Waitable.Queue()`
- Role: Caches wq entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `volatile int prio`
- Role: Stores the prio value.
- Description: Backs the cached state for this file.

#### `Queued awaiting`
- Role: Holds the awaiting state.
- Description: Backs the cached state for this file.

#### `volatile boolean done = false`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `LoadException error`
- Role: Holds the error state.
- Description: Backs the cached state for this file.

#### `boolean found = false`
- Role: Tracks the found flag.
- Description: Supports the found operation used by the surrounding class.

#### `private boolean added = false`
- Role: Tracks the added flag.
- Description: Supports the added operation used by the surrounding class.

#### `private final Set<Resource> loadwaited = new HashSet<Resource>()`
- Role: Caches loadwaited entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private static Pool _local = null`
- Role: Holds the local state.
- Description: Backs the cached state for this file.

#### `private static Pool _remote = null`
- Role: Holds the remote state.
- Description: Backs the cached state for this file.

#### `public Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public ResSource src`
- Role: Holds the src state.
- Description: Backs the cached state for this file.

#### `public LoadException prev`
- Role: Holds the prev state.
- Description: Backs the cached state for this file.

#### `public final String thing`
- Role: Stores the thing value.
- Description: Backs the cached state for this file.

#### `public final Object found`
- Role: Holds the found state.
- Description: Backs the cached state for this file.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Pool pool`
- Role: Holds the pool state.
- Description: Backs the cached state for this file.

#### `public final Class<T> cl`
- Role: Holds the cl state.
- Description: Backs the cached state for this file.

#### `private final Constructor<T> cons`
- Role: Holds the cons state.
- Description: Backs the cached state for this file.

#### `public final String[] supported = ImageIO.getReaderMIMETypes()`
- Role: Stores the supported value.
- Description: Backs the cached state for this file.

#### `public transient BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `private transient BufferedImage scaled`
- Role: Stores the scaled value.
- Description: Backs the cached state for this file.

#### `private transient Tex tex, rawtex`
- Role: Stores the rawtex value.
- Description: Backs the cached state for this file.

#### `private transient Tex tex, rawtex`
- Role: Stores the rawtex value.
- Description: Backs the cached state for this file.

#### `public final int z, subz`
- Role: Stores the subz value.
- Description: Backs the cached state for this file.

#### `public final int z, subz`
- Role: Stores the subz value.
- Description: Backs the cached state for this file.

#### `public final boolean nooff`
- Role: Tracks the nooff flag.
- Description: Supports the nooff operation used by the surrounding class.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Map<String, Object> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public float scale = 1`
- Role: Stores the scale value.
- Description: Backs the cached state for this file.

#### `public Coord sz, o, so, tsz, ssz, stsz`
- Role: Stores the stsz value.
- Description: Backs the cached state for this file.

#### `public Coord sz, o, so, tsz, ssz, stsz`
- Role: Stores the stsz value.
- Description: Backs the cached state for this file.

#### `public Coord sz, o, so, tsz, ssz, stsz`
- Role: Stores the stsz value.
- Description: Backs the cached state for this file.

#### `public Coord sz, o, so, tsz, ssz, stsz`
- Role: Stores the stsz value.
- Description: Backs the cached state for this file.

#### `public Coord sz, o, so, tsz, ssz, stsz`
- Role: Stores the stsz value.
- Description: Backs the cached state for this file.

#### `public Coord sz, o, so, tsz, ssz, stsz`
- Role: Stores the stsz value.
- Description: Backs the cached state for this file.

#### `public final String t`
- Role: Stores the t value.
- Description: Backs the cached state for this file.

#### `public Coord cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `public Coord[][] ep`
- Role: Stores the ep value.
- Description: Backs the cached state for this file.

#### `public final Map<String, Object> props = new HashMap<>()`
- Role: Caches props entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Coord2d[][] p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

#### `private int[] ids`
- Role: Stores the ids value.
- Description: Backs the cached state for this file.

#### `public int id, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public int id, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public Image[][] f`
- Role: Stores the f value.
- Description: Backs the cached state for this file.

#### `public final String text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final Named parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

#### `public final char hk`
- Role: Stores the hk value.
- Description: Backs the cached state for this file.

#### `public final String[] ad`
- Role: Stores the ad value.
- Description: Backs the cached state for this file.

#### `Class<? extends Instancer> instancer() default Instancer.class`
- Role: Holds the instancer state.
- Description: Backs the cached state for this file.

#### `public final Class<I> type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final Class<I> type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final Class<R> rtype`
- Role: Holds the rtype state.
- Description: Backs the cached state for this file.

#### `public final Class<?>[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `public final Function<Function<Object[], R>, I> maker`
- Role: Holds the maker state.
- Description: Backs the cached state for this file.

#### `public final Class<I> type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final Class<R> rtype`
- Role: Holds the rtype state.
- Description: Backs the cached state for this file.

#### `public final Class<?>[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `public final Function<Function<Object[], ? extends R>, I> maker`
- Role: Holds the maker state.
- Description: Backs the cached state for this file.

#### `public final Class<I> type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `private final Collection<Instancer<? extends I>> sub = new ArrayList<>()`
- Role: Caches sub entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `transient public final byte[] data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `public final CodeEntry entry`
- Role: Holds the entry state.
- Description: Backs the cached state for this file.

#### `private final ClassLoader[] classpath`
- Role: Holds the classpath state.
- Description: Backs the cached state for this file.

#### `public final String clname`
- Role: Stores the clname value.
- Description: Backs the cached state for this file.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `private final Map<String, Code> clmap = new HashMap<>()`
- Role: Caches clmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<String, String> pe = new HashMap<>()`
- Role: Caches pe entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<String, Object[]> pa = new HashMap<>()`
- Role: Caches pa entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Indir<Resource>> classpath = new ArrayList<>()`
- Role: Caches classpath entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `transient private ClassLoader loader`
- Role: Holds the loader state.
- Description: Backs the cached state for this file.

#### `transient private final Map<String, Class<?>> lpe = new HashMap<>()`
- Role: Caches lpe entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `transient private final Map<String, Object> ipe = new HashMap<>()`
- Role: Caches ipe entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `transient public byte[] coded`
- Role: Stores the coded value.
- Description: Backs the cached state for this file.

#### `public final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Map<String, Object> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public double bvol = 1.0`
- Role: Stores the bvol value.
- Description: Backs the cached state for this file.

#### `transient javax.sound.midi.Sequence seq`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `public transient final java.awt.Font font`
- Role: Holds the font state.
- Description: Backs the cached state for this file.

#### `private transient Named indir = null`
- Role: Holds the indir state.
- Description: Backs the cached state for this file.

### Methods

#### `public Named(String name, int ver)`
- Role: Performs named.
- Description: Supports the named operation used by the surrounding class.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Spec(Pool pool, String name, int ver)`
- Role: Performs spec.
- Description: Supports the spec operation used by the surrounding class.

#### `public Spec(Pool pool, String name)`
- Role: Performs spec.
- Description: Supports the spec operation used by the surrounding class.

#### `public Resource get(int prio)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Resource get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Saved(Pool pool, String name, int ver)`
- Role: Performs saved.
- Description: Supports the saved operation used by the surrounding class.

#### `public Resource get(int prio)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Resource get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public int savever()`
- Role: Performs savever.
- Description: Supports the savever operation used by the surrounding class.

#### `public Indir<Resource> getres(int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public default Indir<Resource> dynres(UID uid)`
- Role: Performs dynres.
- Description: Supports the dynres operation used by the surrounding class.

#### `public Descriptor(R rr)`
- Role: Performs descriptor.
- Description: Supports the descriptor operation used by the surrounding class.

#### `public Maybe<Indir<Resource>> opt(Object desc)`
- Role: Performs opt.
- Description: Supports the opt operation used by the surrounding class.

#### `public default PType<Indir<Resource>> desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public default Indir<Resource> getresv(Object desc)`
- Role: Performs getresv.
- Description: Supports the getresv operation used by the surrounding class.

#### `public ResourceMap(Resource.Resolver bk, Map<Integer, ? extends Object> map)`
- Role: Performs resource map.
- Description: Supports the resource map operation used by the surrounding class.

#### `public ResourceMap(Resource.Resolver bk, Message data)`
- Role: Performs resource map.
- Description: Supports the resource map operation used by the surrounding class.

#### `public ResourceMap(Resource.Resolver bk, Object[] args)`
- Role: Performs resource map.
- Description: Supports the resource map operation used by the surrounding class.

#### `public static Map<Integer, Integer> decode(Message sdt)`
- Role: Performs decode.
- Description: Supports the decode operation used by the surrounding class.

#### `public static Map<Integer, ? extends Object> decode(Object[] args)`
- Role: Performs decode.
- Description: Supports the decode operation used by the surrounding class.

#### `public Indir<Resource> getres(int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Indir<Resource> dynres(UID uid)`
- Role: Performs dynres.
- Description: Supports the dynres operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private Resource(Pool pool, String name, int ver)`
- Role: Creates a new Resource instance.
- Description: Constructs the instance and initializes its default state.

#### `public Virtual(Pool pool, String name, int ver)`
- Role: Performs virtual.
- Description: Supports the virtual operation used by the surrounding class.

#### `public void add(Layer layer)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public static void setcache(ResCache cache)`
- Role: Performs setcache.
- Description: Supports the setcache operation used by the surrounding class.

#### `public String basename()`
- Role: Performs basename.
- Description: Supports the basename operation used by the surrounding class.

#### `public InputStream get(String name) throws IOException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `public TeeSource(ResSource back)`
- Role: Performs tee source.
- Description: Supports the tee source operation used by the surrounding class.

#### `public InputStream get(String name) throws IOException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `public abstract OutputStream fork(String name) throws IOException`
- Role: Handles the fork workflow.
- Description: Supports the fork operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public CacheSource(ResCache cache)`
- Role: Performs cache source.
- Description: Supports the cache source operation used by the surrounding class.

#### `public InputStream get(String name) throws IOException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static boolean winsafechar(char c)`
- Role: Performs winsafechar.
- Description: Supports the winsafechar operation used by the surrounding class.

#### `public FileSource(Path base)`
- Role: Performs file source.
- Description: Supports the file source operation used by the surrounding class.

#### `private static String checkpart(String part, String whole) throws FileNotFoundException`
- Role: Handles the checkpart workflow.
- Description: Supports the checkpart operation used by the surrounding class.

#### `public InputStream get(String name) throws IOException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public JarSource(String base)`
- Role: Performs jar source.
- Description: Supports the jar source operation used by the surrounding class.

#### `public InputStream get(String name) throws FileNotFoundException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public HttpSource(URI base)`
- Role: Performs http source.
- Description: Supports the http source operation used by the surrounding class.

#### `private URI encodeuri(URI raw) throws IOException`
- Role: Handles the encodeuri workflow.
- Description: Supports the encodeuri operation used by the surrounding class.

#### `public InputStream get(String name) throws IOException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private Loading(Pool.Queued res)`
- Role: Performs loading.
- Description: Supports the loading operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public boolean boostprio(int prio)`
- Role: Performs boostprio.
- Description: Supports the boostprio operation used by the surrounding class.

#### `public BadResourceException(String name, int ver, String message, Throwable cause)`
- Role: Performs bad resource exception.
- Description: Supports the bad resource exception operation used by the surrounding class.

#### `public BadResourceException(String name, int ver, String message)`
- Role: Performs bad resource exception.
- Description: Supports the bad resource exception operation used by the surrounding class.

#### `public BadResourceException(String name, int ver, Throwable cause)`
- Role: Performs bad resource exception.
- Description: Supports the bad resource exception operation used by the surrounding class.

#### `public BadResourceException(String name, int ver)`
- Role: Performs bad resource exception.
- Description: Supports the bad resource exception operation used by the surrounding class.

#### `public LoadFailedException(String name, int ver, LoadException cause)`
- Role: Performs load failed exception.
- Description: Supports the load failed exception operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public NoSuchResourceException(String name, int ver, LoadException cause)`
- Role: Performs no such resource exception.
- Description: Supports the no such resource exception operation used by the surrounding class.

#### `public BadVersionException(String name, int ver, int curver, ResSource cursrc)`
- Role: Performs bad version exception.
- Description: Supports the bad version exception operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public Pool(Pool parent, ResSource... sources)`
- Role: Performs pool.
- Description: Supports the pool operation used by the surrounding class.

#### `public Pool(ResSource... sources)`
- Role: Performs pool.
- Description: Supports the pool operation used by the surrounding class.

#### `public void add(ResSource src)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `Queued(String name, int ver, int prio)`
- Role: Handles the queued workflow.
- Description: Supports the queued operation used by the surrounding class.

#### `public int priority()`
- Role: Performs priority.
- Description: Supports the priority operation used by the surrounding class.

#### `public void boostprio(int prio)`
- Role: Performs boostprio.
- Description: Supports the boostprio operation used by the surrounding class.

#### `public Resource get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private void done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `private void prior(Queued prior)`
- Role: Performs prior.
- Description: Supports the prior operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private void handle(Queued res)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public Named load(String name, int ver, int prio)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public Named load(String name, int ver)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public Named load(String name)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public Indir<Resource> dynres(long id)`
- Role: Performs dynres.
- Description: Supports the dynres operation used by the surrounding class.

#### `public Indir<Resource> dynres(UID id)`
- Role: Performs dynres.
- Description: Supports the dynres operation used by the surrounding class.

#### `private void ckld()`
- Role: Performs ckld.
- Description: Supports the ckld operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public int qdepth()`
- Role: Performs qdepth.
- Description: Supports the qdepth operation used by the surrounding class.

#### `public int numloaded()`
- Role: Performs numloaded.
- Description: Supports the numloaded operation used by the surrounding class.

#### `public Collection<Resource> cached()`
- Role: Performs cached.
- Description: Supports the cached operation used by the surrounding class.

#### `public Collection<Resource> used()`
- Role: Performs used.
- Description: Supports the used operation used by the surrounding class.

#### `public Collection<Resource> loadwaited()`
- Role: Performs loadwaited.
- Description: Supports the loadwaited operation used by the surrounding class.

#### `private Resource loadwaited(Resource res)`
- Role: Performs loadwaited.
- Description: Supports the loadwaited operation used by the surrounding class.

#### `public Resource loadwaitint(String name, int ver) throws InterruptedException`
- Role: Handles the loadwaitint workflow.
- Description: Supports the loadwaitint operation used by the surrounding class.

#### `public Resource loadwaitint(String name) throws InterruptedException`
- Role: Handles the loadwaitint workflow.
- Description: Supports the loadwaitint operation used by the surrounding class.

#### `public Resource loadwait(String name, int ver)`
- Role: Performs loadwait.
- Description: Supports the loadwait operation used by the surrounding class.

#### `public Resource loadwait(String name)`
- Role: Performs loadwait.
- Description: Supports the loadwait operation used by the surrounding class.

#### `public static Pool local()`
- Role: Performs local.
- Description: Supports the local operation used by the surrounding class.

#### `public static Pool remote()`
- Role: Performs remote.
- Description: Supports the remote operation used by the surrounding class.

#### `public static void addurl(URI uri)`
- Role: Performs addurl.
- Description: Supports the addurl operation used by the surrounding class.

#### `public LoadException(String msg, Resource res)`
- Role: Performs load exception.
- Description: Supports the load exception operation used by the surrounding class.

#### `public LoadException(String msg, Throwable cause, Resource res)`
- Role: Performs load exception.
- Description: Supports the load exception operation used by the surrounding class.

#### `public LoadException(Throwable cause, Resource res)`
- Role: Performs load exception.
- Description: Supports the load exception operation used by the surrounding class.

#### `public UnknownFormatException(Resource res, String thing, Object found)`
- Role: Performs unknown format exception.
- Description: Supports the unknown format exception operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public LoadWarning(Resource res, String msg)`
- Role: Performs load warning.
- Description: Supports the load warning operation used by the surrounding class.

#### `public LoadWarning(Resource res, String msg, Object... args)`
- Role: Performs load warning.
- Description: Supports the load warning operation used by the surrounding class.

#### `public static Coord cdec(Message buf)`
- Role: Performs cdec.
- Description: Supports the cdec operation used by the surrounding class.

#### `public PoolMapper(Pool pool)`
- Role: Performs pool mapper.
- Description: Supports the pool mapper operation used by the surrounding class.

#### `public Object apply(Object obj)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public abstract void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `protected Function<Object, Object> resmapper()`
- Role: Performs resmapper.
- Description: Supports the resmapper operation used by the surrounding class.

#### `public T cons(Resource res, Message buf)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public LayerConstructor(Class<T> cl)`
- Role: Performs layer constructor.
- Description: Supports the layer constructor operation used by the surrounding class.

#### `public T cons(Resource res, Message buf)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public static void addltype(String name, LayerFactory<?> cons)`
- Role: Performs addltype.
- Description: Supports the addltype operation used by the surrounding class.

#### `public static <T extends Layer> void addltype(String name, Class<T> cl)`
- Role: Performs addltype.
- Description: Supports the addltype operation used by the surrounding class.

#### `public String value()`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public Map<?, ?> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public T layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public ImageReadException()`
- Role: Performs image read exception.
- Description: Supports the image read exception operation used by the surrounding class.

#### `public static BufferedImage readimage(InputStream fp) throws IOException`
- Role: Handles the readimage workflow.
- Description: Supports the readimage operation used by the surrounding class.

#### `public Image(Message buf)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public BufferedImage scaled()`
- Role: Performs scaled.
- Description: Supports the scaled operation used by the surrounding class.

#### `public Tex rawtex()`
- Role: Performs rawtex.
- Description: Supports the rawtex operation used by the surrounding class.

#### `public Tex tex()`
- Role: Performs tex.
- Description: Supports the tex operation used by the surrounding class.

#### `public Integer layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public Map<String, Object> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Tooltip(Message buf)`
- Role: Performs tooltip.
- Description: Supports the tooltip operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Neg(Message buf)`
- Role: Performs neg.
- Description: Supports the neg operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Props(Message buf)`
- Role: Performs props.
- Description: Supports the props operation used by the surrounding class.

#### `public Object get(String nm)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Obstacle(Message buf)`
- Role: Performs obstacle.
- Description: Supports the obstacle operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public String layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public Anim(Message buf)`
- Role: Performs anim.
- Description: Supports the anim operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Pagina(Message buf)`
- Role: Performs pagina.
- Description: Supports the pagina operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public AButton(Message buf)`
- Role: Performs abutton.
- Description: Supports the abutton operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `Class<? extends Instancer> instancer() default Instancer.class`
- Role: Handles the instancer workflow.
- Description: Supports the instancer operation used by the surrounding class.

#### `public I make(Class<?> cl, Resource res, Object... args)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public static <T, U extends T> T stdmake(Class<T> type, Class<U> cl, Resource ires, Object[] args)`
- Role: Performs stdmake.
- Description: Supports the stdmake operation used by the surrounding class.

#### `public Direct(Class<I> type)`
- Role: Performs direct.
- Description: Supports the direct operation used by the surrounding class.

#### `public I make(Class<?> cl, Resource res, Object... args)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public StaticCall(Class<I> type, String name, Class<R> rtype, Class<?>[] args, Function<Function<Object[], R>, I> maker)`
- Role: Performs static call.
- Description: Supports the static call operation used by the surrounding class.

#### `public I make(Class <?> cl, Resource res, Object... args)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public Construct(Class<I> type, Class<R> rtype, Class<?>[] args, Function<Function<Object[], ? extends R>, I> maker)`
- Role: Performs construct.
- Description: Supports the construct operation used by the surrounding class.

#### `public I make(Class <?> cl, Resource res, Object... args)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public Chain(Class<I> type)`
- Role: Performs chain.
- Description: Supports the chain operation used by the surrounding class.

#### `public void add(Instancer<? extends I> el)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public I make(Class<?> cl, Resource res, Object... args)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public Class<?> type()`
- Role: Performs type.
- Description: Supports the type operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public Code(Message buf)`
- Role: Performs code.
- Description: Supports the code operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public ResClassLoader(ClassLoader parent, CodeEntry entry)`
- Role: Performs res class loader.
- Description: Supports the res class loader operation used by the surrounding class.

#### `public Code findcode(String name)`
- Role: Performs findcode.
- Description: Supports the findcode operation used by the surrounding class.

#### `public Class<?> findClass(String name) throws ClassNotFoundException`
- Role: Handles the find class workflow.
- Description: Supports the find class operation used by the surrounding class.

#### `public static FromResource getsource(Class<?> cl)`
- Role: Performs getsource.
- Description: Supports the getsource operation used by the surrounding class.

#### `public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException`
- Role: Handles the load class workflow.
- Description: Supports the load class operation used by the surrounding class.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public LibClassLoader(ClassLoader parent, Collection<ClassLoader> classpath)`
- Role: Performs lib class loader.
- Description: Supports the lib class loader operation used by the surrounding class.

#### `public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException`
- Role: Handles the load class workflow.
- Description: Supports the load class operation used by the surrounding class.

#### `public ResourceClassNotFoundException(String clname, Resource res)`
- Role: Performs resource class not found exception.
- Description: Supports the resource class not found exception operation used by the surrounding class.

#### `public CodeEntry(Message buf)`
- Role: Performs code entry.
- Description: Supports the code entry operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public ClassLoader loader()`
- Role: Performs loader.
- Description: Supports the loader operation used by the surrounding class.

#### `private Class<?> getentry(Class<?> cl, boolean fail)`
- Role: Performs getentry.
- Description: Supports the getentry operation used by the surrounding class.

#### `public <T> Class<? extends T> getcl(Class<T> cl, boolean fail)`
- Role: Performs getcl.
- Description: Supports the getcl operation used by the surrounding class.

#### `public <T> Class<? extends T> getcl(Class<T> cl)`
- Role: Performs getcl.
- Description: Supports the getcl operation used by the surrounding class.

#### `public <T> T get(Class<T> cl, boolean fail)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public <T> T get(Class<T> cl)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static Resource classres(final Class<?> cl)`
- Role: Performs classres.
- Description: Supports the classres operation used by the surrounding class.

#### `public <T> T getcode(Class<T> cl, boolean fail)`
- Role: Performs getcode.
- Description: Supports the getcode operation used by the surrounding class.

#### `public Audio(Message buf)`
- Role: Performs audio.
- Description: Supports the audio operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public haven.Audio.CS stream()`
- Role: Performs stream.
- Description: Supports the stream operation used by the surrounding class.

#### `public String layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public Map<String, Object> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public double bvol()`
- Role: Performs bvol.
- Description: Supports the bvol operation used by the surrounding class.

#### `public Music(Message buf)`
- Role: Performs music.
- Description: Supports the music operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Font(Message buf)`
- Role: Performs font.
- Description: Supports the font operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `private void readall(InputStream in, byte[] buf) throws IOException`
- Role: Handles the readall workflow.
- Description: Supports the readall operation used by the surrounding class.

#### `public <L extends Layer> Collection<L> layers(final Class<L> cl)`
- Role: Performs layers.
- Description: Supports the layers operation used by the surrounding class.

#### `public NoSuchLayerException(String message)`
- Role: Performs no such layer exception.
- Description: Supports the no such layer exception operation used by the surrounding class.

#### `public <L extends Layer> L layer(Class<L> cl)`
- Role: Performs layer.
- Description: Supports the layer operation used by the surrounding class.

#### `public <L extends Layer> L flayer(Class<L> cl)`
- Role: Performs flayer.
- Description: Supports the flayer operation used by the surrounding class.

#### `public <L> Collection<L> layers(Class<L> cl, Predicate<? super L> sel)`
- Role: Performs layers.
- Description: Supports the layers operation used by the surrounding class.

#### `public <L> L layer(Class<L> cl, Predicate<? super L> sel)`
- Role: Performs layer.
- Description: Supports the layer operation used by the surrounding class.

#### `public <L> L flayer(Class<L> cl, Predicate<? super L> sel)`
- Role: Performs flayer.
- Description: Supports the flayer operation used by the surrounding class.

#### `public <I, L extends IDLayer<I>> L layer(Class<L> cl, I id)`
- Role: Performs layer.
- Description: Supports the layer operation used by the surrounding class.

#### `public <I, L extends IDLayer<I>> L flayer(Class<L> cl, I id)`
- Role: Performs flayer.
- Description: Supports the flayer operation used by the surrounding class.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `private void load(Message in)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public Named indir()`
- Role: Performs indir.
- Description: Supports the indir operation used by the surrounding class.

#### `public static Image loadrimg(String name)`
- Role: Performs loadrimg.
- Description: Supports the loadrimg operation used by the surrounding class.

#### `public static BufferedImage loadimg(String name)`
- Role: Performs loadimg.
- Description: Supports the loadimg operation used by the surrounding class.

#### `public static BufferedImage loadsimg(String name)`
- Role: Performs loadsimg.
- Description: Supports the loadsimg operation used by the surrounding class.

#### `public static Tex loadtex(String name)`
- Role: Performs loadtex.
- Description: Supports the loadtex operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static void loadlist(Pool pool, InputStream list, int prio) throws IOException`
- Role: Handles the loadlist workflow.
- Description: Supports the loadlist operation used by the surrounding class.

#### `public static void dumplist(Collection<Resource> list, Writer dest)`
- Role: Performs dumplist.
- Description: Supports the dumplist operation used by the surrounding class.

#### `public static void updateloadlist(Path file, Path resdir) throws Exception`
- Role: Handles the updateloadlist workflow.
- Description: Supports the updateloadlist operation used by the surrounding class.

#### `private static void usage_getcode(PrintStream out)`
- Role: Performs usage getcode.
- Description: Supports the usage getcode operation used by the surrounding class.

#### `public static void cmd_getcode(String[] args)`
- Role: Performs cmd getcode.
- Description: Supports the cmd getcode operation used by the surrounding class.

#### `private static void usage_findupdates(PrintStream out)`
- Role: Performs usage findupdates.
- Description: Supports the usage findupdates operation used by the surrounding class.

#### `public static void cmd_findupdates(String[] args)`
- Role: Performs cmd findupdates.
- Description: Supports the cmd findupdates operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
