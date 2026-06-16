# GLEnvironment

This file documents the responsibilities and members of `GLEnvironment`.

## Meta

- Source: [GLEnvironment.java](../../../../../src/haven/render/gl/GLEnvironment.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for glenvironment.

## Nested Types

### Caps

- Role: Represents caps within GLEnvironment.
- Description: Describes the nested caps type used by the enclosing class.

### DebugMessage

- Role: Represents debug message within GLEnvironment.
- Description: Describes the nested debug message type used by the enclosing class.

### HardwareException

- Role: Represents hardware exception within GLEnvironment.
- Description: Describes the nested hardware exception type used by the enclosing class.

### MemStats

- Role: Represents mem stats within GLEnvironment.
- Description: Describes the nested mem stats type used by the enclosing class.

### SavedProg

- Role: Represents saved prog within GLEnvironment.
- Description: Describes the nested saved prog type used by the enclosing class.

### Sequence

- Role: Represents sequence within GLEnvironment.
- Description: Describes the nested sequence type used by the enclosing class.

### TempData

- Role: Represents temp data within GLEnvironment.
- Description: Describes the nested temp data type used by the enclosing class.

## Members

### Constants

#### `public static final boolean debuglog = false, labels = false`
- Role: Defines the shared debuglog constant.
- Description: Shared constant used by the rest of the class.

#### `public static final boolean debuglog = false, labels = false`
- Role: Defines the shared debuglog constant.
- Description: Shared constant used by the rest of the class.

#### `private static final java.util.regex.Pattern slvp = java.util.regex.Pattern.compile("^(\\d+)\\.(\\d+)")`
- Role: Defines the shared slvp constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Caps caps`
- Role: Holds the caps state.
- Description: Backs the cached state for this file.

#### `public int nilfbo_id = 0, nilfbo_db = 0`
- Role: Stores the nilfbo id value.
- Description: Backs the cached state for this file.

#### `public int nilfbo_id = 0, nilfbo_db = 0`
- Role: Stores the nilfbo id value.
- Description: Backs the cached state for this file.

#### `final Object drawmon = new Object()`
- Role: Holds the drawmon state.
- Description: Backs the cached state for this file.

#### `final Object prepmon = new Object()`
- Role: Holds the prepmon state.
- Description: Backs the cached state for this file.

#### `final Collection<GLObject> disposed = new LinkedList<>()`
- Role: Caches disposed entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final List<GLQuery> queries = new LinkedList<>(); // Synchronized on drawmon`
- Role: Caches queries entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Queue<Runnable> callbacks = new LinkedList<>()`
- Role: Caches callbacks entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Thread cbthread = null`
- Role: Holds the cbthread state.
- Description: Backs the cached state for this file.

#### `final Queue<GLRender> submitted = new LinkedList<>()`
- Role: Caches submitted entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Area wnd`
- Role: Holds the wnd state.
- Description: Backs the cached state for this file.

#### `private GLRender prep = null`
- Role: Holds the prep state.
- Description: Backs the cached state for this file.

#### `private Applier curstate = new Applier(this)`
- Role: Holds the curstate state.
- Description: Backs the cached state for this file.

#### `private boolean invalid = false`
- Role: Tracks whether invalid is valid.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final Caps caps`
- Role: Holds the caps state.
- Description: Backs the cached state for this file.

#### `public final String vendor, version, renderer`
- Role: Stores the renderer value.
- Description: Backs the cached state for this file.

#### `public final String vendor, version, renderer`
- Role: Stores the renderer value.
- Description: Backs the cached state for this file.

#### `public final String vendor, version, renderer`
- Role: Stores the renderer value.
- Description: Backs the cached state for this file.

#### `public final int major, minor, glslver`
- Role: Stores the glslver value.
- Description: Backs the cached state for this file.

#### `public final int major, minor, glslver`
- Role: Stores the glslver value.
- Description: Backs the cached state for this file.

#### `public final int major, minor, glslver`
- Role: Stores the glslver value.
- Description: Backs the cached state for this file.

#### `public final Collection<String> exts`
- Role: Caches exts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int maxtargets`
- Role: Stores the maxtargets value.
- Description: Backs the cached state for this file.

#### `public final float anisotropy`
- Role: Stores the anisotropy value.
- Description: Backs the cached state for this file.

#### `public final float linemin, linemax`
- Role: Stores the linemax value.
- Description: Backs the cached state for this file.

#### `public final float linemin, linemax`
- Role: Stores the linemax value.
- Description: Backs the cached state for this file.

#### `final int[] stats_obj = new int[MemStats.values().length]`
- Role: Stores the stats obj value.
- Description: Backs the cached state for this file.

#### `final long[] stats_mem = new long[MemStats.values().length]`
- Role: Stores the stats mem value.
- Description: Backs the cached state for this file.

#### `public final int src, type, id, sev`
- Role: Stores the sev value.
- Description: Backs the cached state for this file.

#### `public final int src, type, id, sev`
- Role: Stores the sev value.
- Description: Backs the cached state for this file.

#### `public final int src, type, id, sev`
- Role: Stores the sev value.
- Description: Backs the cached state for this file.

#### `public final int src, type, id, sev`
- Role: Stores the sev value.
- Description: Backs the cached state for this file.

#### `public final String msg`
- Role: Stores the msg value.
- Description: Backs the cached state for this file.

#### `private final Supplier<T> bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `private T d = null`
- Role: Holds the d state.
- Description: Backs the cached state for this file.

#### `public final Supplier<GLVertexArray> tempvao = new TempData<>(() -> new GLVertexArray(this))`
- Role: Caches tempvao entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Supplier<GLBuffer> tempvertex = new TempData<>(() -> new GLBuffer(this))`
- Role: Stores the tempvertex value.
- Description: Backs the cached state for this file.

#### `public final Supplier<GLBuffer> tempindex = new TempData<>(() -> new GLBuffer(this))`
- Role: Stores the tempindex value.
- Description: Backs the cached state for this file.

#### `final int hash`
- Role: Stores the hash value.
- Description: Backs the cached state for this file.

#### `final ShaderMacro[] shaders`
- Role: Holds the shaders state.
- Description: Backs the cached state for this file.

#### `final GLProgram prog`
- Role: Holds the prog state.
- Description: Backs the cached state for this file.

#### `SavedProg next`
- Role: Holds the next state.
- Description: Backs the cached state for this file.

#### `boolean used = true`
- Role: Tracks the used flag.
- Description: Supports the used operation used by the surrounding class.

#### `private final Object pmon = new Object()`
- Role: Holds the pmon state.
- Description: Backs the cached state for this file.

#### `private SavedProg[] ptab = new SavedProg[32]`
- Role: Holds the ptab state.
- Description: Backs the cached state for this file.

#### `private int nprog = 0`
- Role: Stores the nprog value.
- Description: Backs the cached state for this file.

#### `private double lastpclean = Utils.rtime()`
- Role: Stores the lastpclean value.
- Description: Backs the cached state for this file.

#### `private final Object seqmon = new Object()`
- Role: Holds the seqmon state.
- Description: Backs the cached state for this file.

#### `private boolean[] sequse = new boolean[16]`
- Role: Tracks the sequse flag.
- Description: Supports the sequse operation used by the surrounding class.

#### `private int seqhead = 1, seqtail = seqhead`
- Role: Stores the seqhead value.
- Description: Backs the cached state for this file.

#### `private int seqhead = 1, seqtail = seqhead`
- Role: Stores the seqhead value.
- Description: Backs the cached state for this file.

#### `public final int no`
- Role: Stores the no value.
- Description: Backs the cached state for this file.

#### `private final Runnable clean`
- Role: Holds the clean state.
- Description: Backs the cached state for this file.

#### `private final String desc`
- Role: Stores the desc value.
- Description: Backs the cached state for this file.

#### `private volatile boolean cleaned = false`
- Role: Tracks the cleaned flag.
- Description: Supports the cleaned operation used by the surrounding class.

### Methods

#### `public HardwareException(String msg, Caps caps)`
- Role: Performs hardware exception.
- Description: Supports the hardware exception operation used by the surrounding class.

#### `public static int glgeti(GL gl, int param)`
- Role: Performs glgeti.
- Description: Supports the glgeti operation used by the surrounding class.

#### `public static int glcondi(GL gl, int param, int def)`
- Role: Performs glcondi.
- Description: Supports the glcondi operation used by the surrounding class.

#### `public static float glgetf(GL gl, int param)`
- Role: Performs glgetf.
- Description: Supports the glgetf operation used by the surrounding class.

#### `public static String glconds(GL gl, int param)`
- Role: Performs glconds.
- Description: Supports the glconds operation used by the surrounding class.

#### `public Caps(GL gl)`
- Role: Performs caps.
- Description: Supports the caps operation used by the surrounding class.

#### `public void checkreq()`
- Role: Performs checkreq.
- Description: Supports the checkreq operation used by the surrounding class.

#### `public String vendor()`
- Role: Performs vendor.
- Description: Supports the vendor operation used by the surrounding class.

#### `public String driver()`
- Role: Performs driver.
- Description: Supports the driver operation used by the surrounding class.

#### `public String device()`
- Role: Performs device.
- Description: Supports the device operation used by the surrounding class.

#### `protected abstract Caps mkcaps(GL initgl)`
- Role: Performs mkcaps.
- Description: Supports the mkcaps operation used by the surrounding class.

#### `public GLEnvironment(GL initgl, Area wnd)`
- Role: Creates a new GLEnvironment instance.
- Description: Constructs the instance and initializes its default state.

#### `private void initialize(GL gl)`
- Role: Performs initialize.
- Description: Supports the initialize operation used by the surrounding class.

#### `public GLRender render()`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public GLDrawList drawlist()`
- Role: Performs drawlist.
- Description: Supports the drawlist operation used by the surrounding class.

#### `public void reshape(Area wnd)`
- Role: Performs reshape.
- Description: Supports the reshape operation used by the surrounding class.

#### `public Area shape()`
- Role: Performs shape.
- Description: Supports the shape operation used by the surrounding class.

#### `private void ckcbt()`
- Role: Performs ckcbt.
- Description: Supports the ckcbt operation used by the surrounding class.

#### `private void cbloop()`
- Role: Performs cbloop.
- Description: Supports the cbloop operation used by the surrounding class.

#### `void callback(Runnable cb)`
- Role: Performs callback.
- Description: Supports the callback operation used by the surrounding class.

#### `public void synccallbacks() throws InterruptedException`
- Role: Handles the synccallbacks workflow.
- Description: Supports the synccallbacks operation used by the surrounding class.

#### `private void checkqueries(GL gl)`
- Role: Performs checkqueries.
- Description: Supports the checkqueries operation used by the surrounding class.

#### `public DebugMessage(int src, int type, int id, int sev, String msg)`
- Role: Performs debug message.
- Description: Supports the debug message operation used by the surrounding class.

#### `private List<DebugMessage> getdebuglog(GL gl)`
- Role: Performs getdebuglog.
- Description: Supports the getdebuglog operation used by the surrounding class.

#### `private void checkdebuglog(GL gl)`
- Role: Performs checkdebuglog.
- Description: Supports the checkdebuglog operation used by the surrounding class.

#### `public void process(GL gl)`
- Role: Performs process.
- Description: Supports the process operation used by the surrounding class.

#### `public void finish(GL gl) throws InterruptedException`
- Role: Handles the finish workflow.
- Description: Supports the finish operation used by the surrounding class.

#### `public void submit(Render cmd)`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `public void submitwait() throws InterruptedException`
- Role: Handles the submitwait workflow.
- Description: Supports the submitwait operation used by the surrounding class.

#### `private BufferBGL disposeall()`
- Role: Performs disposeall.
- Description: Supports the disposeall operation used by the surrounding class.

#### `public abstract SysBuffer malloc(int sz)`
- Role: Performs malloc.
- Description: Supports the malloc operation used by the surrounding class.

#### `public abstract SysBuffer subsume(ByteBuffer data, int sz)`
- Role: Performs subsume.
- Description: Supports the subsume operation used by the surrounding class.

#### `public FillBuffer fillbuf(DataBuffer tgt, int from, int to)`
- Role: Performs fillbuf.
- Description: Supports the fillbuf operation used by the surrounding class.

#### `public FillBuffer fillbuf(DataBuffer target)`
- Role: Performs fillbuf.
- Description: Supports the fillbuf operation used by the surrounding class.

#### `GLRender prepare()`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `void prepare(GLObject obj)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `void prepare(BGL.Request req)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `void prepare(Consumer<GLRender> func)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `Disposable prepare(Model.Indices buf)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `Disposable prepare(VertexArray.Buffer buf)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLVertexArray prepare(Model mod, GLProgram prog)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.Tex2D prepare(Texture2D tex)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.Tex2D prepare(Texture2D.Sampler2D smp)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.Tex3D prepare(Texture3D tex)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.Tex3D prepare(Texture3D.Sampler3D smp)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.Tex2DArray prepare(Texture2DArray tex)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.Tex2DArray prepare(Texture2DArray.Sampler2DArray smp)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.Tex2DMS prepare(Texture2DMS tex)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.Tex2DMS prepare(Texture2DMS.Sampler2DMS smp)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.TexCube prepare(TextureCube tex)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `GLTexture.TexCube prepare(TextureCube.SamplerCube smp)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `Object prepuval(Object val)`
- Role: Performs prepuval.
- Description: Supports the prepuval operation used by the surrounding class.

#### `Object prepfval(Object val)`
- Role: Performs prepfval.
- Description: Supports the prepfval operation used by the surrounding class.

#### `public TempData(Supplier<T> bk)`
- Role: Performs temp data.
- Description: Supports the temp data operation used by the surrounding class.

#### `public T get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `SavedProg(int hash, ShaderMacro[] shaders, GLProgram prog)`
- Role: Handles the saved prog workflow.
- Description: Supports the saved prog operation used by the surrounding class.

#### `private SavedProg findprog(int hash, ShaderMacro[] shaders)`
- Role: Performs findprog.
- Description: Supports the findprog operation used by the surrounding class.

#### `private void rehash(int nlen)`
- Role: Performs rehash.
- Description: Supports the rehash operation used by the surrounding class.

#### `private void putprog(int hash, ShaderMacro[] shaders, GLProgram prog)`
- Role: Performs putprog.
- Description: Supports the putprog operation used by the surrounding class.

#### `public GLProgram getprog(int hash, ShaderMacro[] shaders)`
- Role: Performs getprog.
- Description: Supports the getprog operation used by the surrounding class.

#### `private void cleanprogs()`
- Role: Performs cleanprogs.
- Description: Supports the cleanprogs operation used by the surrounding class.

#### `public Object progdump()`
- Role: Performs progdump.
- Description: Supports the progdump operation used by the surrounding class.

#### `public boolean compatible(DrawList ob)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.

#### `public boolean compatible(Texture ob)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.

#### `public boolean compatible(DataBuffer ob)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.

#### `public void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `private void seqresize(int nsz)`
- Role: Performs seqresize.
- Description: Supports the seqresize operation used by the surrounding class.

#### `int seqreg()`
- Role: Performs seqreg.
- Description: Supports the seqreg operation used by the surrounding class.

#### `void sequnreg(int seq)`
- Role: Performs sequnreg.
- Description: Supports the sequnreg operation used by the surrounding class.

#### `int dispseq()`
- Role: Performs dispseq.
- Description: Supports the dispseq operation used by the surrounding class.

#### `Sequence(Object owner)`
- Role: Handles the sequence workflow.
- Description: Supports the sequence operation used by the surrounding class.

#### `private void disposed()`
- Role: Performs disposed.
- Description: Supports the disposed operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public int numprogs()`
- Role: Performs numprogs.
- Description: Supports the numprogs operation used by the surrounding class.

#### `public Caps caps()`
- Role: Performs caps.
- Description: Supports the caps operation used by the surrounding class.

#### `public String memstats()`
- Role: Performs memstats.
- Description: Supports the memstats operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
