---
source: [GLEnvironment.java](../../../../../../src/haven/render/gl/GLEnvironment.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLEnvironment

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
- Role: Caches the debuglog value.
- Description: Caches the `debuglog` value for reuse.
- Value: `false, labels = false`

#### `public static final boolean debuglog = false, labels = false`
- Role: Caches the debuglog value.
- Description: Caches the `debuglog` value for reuse.
- Value: `false, labels = false`

#### `private static final java.util.regex.Pattern slvp = java.util.regex.Pattern.compile("^(\\d+)\\.(\\d+)")`
- Role: Implements the slvp operation.
- Description: Implements the compile operation.
- Value: `java.util.regex.Pattern.compile("^(\\d+)\\.(\\d+)")`

### Fields

#### `public final Caps caps`
- Role: Caches the caps value.
- Description: Caches the `caps` value for reuse.

#### `public int nilfbo_id = 0, nilfbo_db = 0`
- Role: Caches the nilfbo id value.
- Description: Caches the `nilfbo_id` value for reuse.

#### `public int nilfbo_id = 0, nilfbo_db = 0`
- Role: Caches the nilfbo id value.
- Description: Caches the `nilfbo_id` value for reuse.

#### `final Object drawmon = new Object()`
- Role: Draws the mon.
- Description: Draws the mon.

#### `final Object prepmon = new Object()`
- Role: Implements the prepmon operation.
- Description: Implements the object operation.

#### `final Collection<GLObject> disposed = new LinkedList<>()`
- Role: Implements the disposed operation.
- Description: Implements the final collection<gl object> disposed = new linked list<>() operation.

#### `final List<GLQuery> queries = new LinkedList<>(); // Synchronized on drawmon`
- Role: Implements the queries operation.
- Description: Implements the final list<gl query> queries = new linked list<>(); // synchronized on drawmon operation.

#### `final Queue<Runnable> callbacks = new LinkedList<>()`
- Role: Implements the callbacks operation.
- Description: Implements the final queue<runnable> callbacks = new linked list<>() operation.

#### `Thread cbthread = null`
- Role: Caches the cbthread value.
- Description: Caches the `cbthread` value for reuse.

#### `final Queue<GLRender> submitted = new LinkedList<>()`
- Role: Implements the submitted operation.
- Description: Implements the final queue<gl render> submitted = new linked list<>() operation.

#### `Area wnd`
- Role: Caches the wnd value.
- Description: Caches the `wnd` value for reuse.

#### `private GLRender prep = null`
- Role: Caches the prep value.
- Description: Caches the `prep` value for reuse.

#### `private Applier curstate = new Applier(this)`
- Role: Implements the curstate operation.
- Description: Implements the applier operation.

#### `private boolean invalid = false`
- Role: Tracks whether invalid is valid.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final Caps caps`
- Role: Caches the caps value.
- Description: Caches the `caps` value for reuse.

#### `public final String vendor, version, renderer`
- Role: Caches the renderer value.
- Description: Caches the `renderer` value for reuse.

#### `public final String vendor, version, renderer`
- Role: Caches the renderer value.
- Description: Caches the `renderer` value for reuse.

#### `public final String vendor, version, renderer`
- Role: Caches the renderer value.
- Description: Caches the `renderer` value for reuse.

#### `public final int major, minor, glslver`
- Role: Caches the glslver value.
- Description: Caches the `glslver` value for reuse.

#### `public final int major, minor, glslver`
- Role: Caches the glslver value.
- Description: Caches the `glslver` value for reuse.

#### `public final int major, minor, glslver`
- Role: Caches the glslver value.
- Description: Caches the `glslver` value for reuse.

#### `public final Collection<String> exts`
- Role: Caches the exts value.
- Description: Caches the `exts` value for reuse.

#### `public final int maxtargets`
- Role: Caches the maxtargets value.
- Description: Caches the `maxtargets` value for reuse.

#### `public final float anisotropy`
- Role: Caches the anisotropy value.
- Description: Caches the `anisotropy` value for reuse.

#### `public final float linemin, linemax`
- Role: Caches the linemax value.
- Description: Caches the `linemax` value for reuse.

#### `public final float linemin, linemax`
- Role: Caches the linemax value.
- Description: Caches the `linemax` value for reuse.

#### `final int[] stats_obj = new int[MemStats.values().length]`
- Role: Implements the stats obj operation.
- Description: Implements the values operation.

#### `final long[] stats_mem = new long[MemStats.values().length]`
- Role: Implements the stats mem operation.
- Description: Implements the values operation.

#### `public final int src, type, id, sev`
- Role: Caches the sev value.
- Description: Caches the `sev` value for reuse.

#### `public final int src, type, id, sev`
- Role: Caches the sev value.
- Description: Caches the `sev` value for reuse.

#### `public final int src, type, id, sev`
- Role: Caches the sev value.
- Description: Caches the `sev` value for reuse.

#### `public final int src, type, id, sev`
- Role: Caches the sev value.
- Description: Caches the `sev` value for reuse.

#### `public final String msg`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.

#### `private final Supplier<T> bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `private T d = null`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `public final Supplier<GLVertexArray> tempvao = new TempData<>(() -> new GLVertexArray(this))`
- Role: Implements the tempvao operation.
- Description: Implements the gl vertex array operation.

#### `public final Supplier<GLBuffer> tempvertex = new TempData<>(() -> new GLBuffer(this))`
- Role: Implements the tempvertex operation.
- Description: Implements the gl buffer operation.

#### `public final Supplier<GLBuffer> tempindex = new TempData<>(() -> new GLBuffer(this))`
- Role: Implements the tempindex operation.
- Description: Implements the gl buffer operation.

#### `final int hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

#### `final ShaderMacro[] shaders`
- Role: Caches the shaders value.
- Description: Caches the `shaders` value for reuse.

#### `final GLProgram prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `SavedProg next`
- Role: Caches the next value.
- Description: Caches the `next` value for reuse.

#### `boolean used = true`
- Role: Tracks the used flag.
- Description: Caches the `used` value for reuse.

#### `private final Object pmon = new Object()`
- Role: Implements the pmon operation.
- Description: Implements the object operation.

#### `private SavedProg[] ptab = new SavedProg[32]`
- Role: Caches the ptab value.
- Description: Caches the `ptab` value for reuse.

#### `private int nprog = 0`
- Role: Caches the nprog value.
- Description: Caches the `nprog` value for reuse.

#### `private double lastpclean = Utils.rtime()`
- Role: Implements the lastpclean operation.
- Description: Implements the rtime operation.

#### `private final Object seqmon = new Object()`
- Role: Implements the seqmon operation.
- Description: Implements the object operation.

#### `private boolean[] sequse = new boolean[16]`
- Role: Tracks the sequse flag.
- Description: Caches the `sequse` value for reuse.

#### `private int seqhead = 1, seqtail = seqhead`
- Role: Caches the seqhead value.
- Description: Caches the `seqhead` value for reuse.

#### `private int seqhead = 1, seqtail = seqhead`
- Role: Caches the seqhead value.
- Description: Caches the `seqhead` value for reuse.

#### `public final int no`
- Role: Caches the no value.
- Description: Caches the `no` value for reuse.

#### `private final Runnable clean`
- Role: Caches the clean value.
- Description: Caches the `clean` value for reuse.

#### `private final String desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `private volatile boolean cleaned = false`
- Role: Tracks the cleaned flag.
- Description: Caches the `cleaned` value for reuse.

### Methods

#### `public HardwareException(String msg, Caps caps)`
- Role: Handles the hardware exception path.
- Description: Implements the hardware exception operation.

#### `public static int glgeti(GL gl, int param)`
- Role: Handles the glgeti path.
- Description: Implements the glgeti operation.

#### `public static int glcondi(GL gl, int param, int def)`
- Role: Handles the glcondi path.
- Description: Implements the glcondi operation.

#### `public static float glgetf(GL gl, int param)`
- Role: Handles the glgetf path.
- Description: Implements the glgetf operation.

#### `public static String glconds(GL gl, int param)`
- Role: Handles the glconds path.
- Description: Implements the glconds operation.

#### `public Caps(GL gl)`
- Role: Handles the caps path.
- Description: Implements the caps operation.

#### `public void checkreq()`
- Role: Handles the checkreq path.
- Description: Implements the checkreq operation.

#### `public String vendor()`
- Role: Handles the vendor path.
- Description: Implements the vendor operation.

#### `public String driver()`
- Role: Handles the driver path.
- Description: Implements the driver operation.

#### `public String device()`
- Role: Handles the device path.
- Description: Implements the device operation.

#### `protected abstract Caps mkcaps(GL initgl)`
- Role: Handles the mkcaps path.
- Description: Implements the mkcaps operation.

#### `public GLEnvironment(GL initgl, Area wnd)`
- Role: Creates a new GLEnvironment instance.
- Description: Constructs the GLEnvironment instance from the supplied inputs.

#### `private void initialize(GL gl)`
- Role: Handles the initialize path.
- Description: Implements the initialize operation.

#### `public GLRender render()`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public GLDrawList drawlist()`
- Role: Handles the drawlist path.
- Description: Draws the list.

#### `public void reshape(Area wnd)`
- Role: Handles the reshape path.
- Description: Implements the reshape operation.

#### `public Area shape()`
- Role: Handles the shape path.
- Description: Implements the shape operation.

#### `private void ckcbt()`
- Role: Handles the ckcbt path.
- Description: Implements the ckcbt operation.

#### `private void cbloop()`
- Role: Handles the cbloop path.
- Description: Implements the cbloop operation.

#### `void callback(Runnable cb)`
- Role: Handles the callback path.
- Description: Implements the callback operation.

#### `public void synccallbacks() throws InterruptedException`
- Role: Handles the synccallbacks workflow.
- Description: Implements the synccallbacks operation.

#### `private void checkqueries(GL gl)`
- Role: Handles the checkqueries path.
- Description: Implements the checkqueries operation.

#### `public DebugMessage(int src, int type, int id, int sev, String msg)`
- Role: Handles the debug message path.
- Description: Implements the debug message operation.

#### `private List<DebugMessage> getdebuglog(GL gl)`
- Role: Handles the getdebuglog path.
- Description: Returns the debuglog.

#### `private void checkdebuglog(GL gl)`
- Role: Handles the checkdebuglog path.
- Description: Implements the checkdebuglog operation.

#### `public void process(GL gl)`
- Role: Handles the process path.
- Description: Implements the process operation.

#### `public void finish(GL gl) throws InterruptedException`
- Role: Handles the finish workflow.
- Description: Implements the finish operation.

#### `public void submit(Render cmd)`
- Role: Handles the submit path.
- Description: Implements the submit operation.

#### `public void submitwait() throws InterruptedException`
- Role: Handles the submitwait workflow.
- Description: Implements the submitwait operation.

#### `private BufferBGL disposeall()`
- Role: Handles the disposeall path.
- Description: Implements the disposeall operation.

#### `public abstract SysBuffer malloc(int sz)`
- Role: Handles the malloc path.
- Description: Implements the malloc operation.

#### `public abstract SysBuffer subsume(ByteBuffer data, int sz)`
- Role: Handles the subsume path.
- Description: Implements the subsume operation.

#### `public FillBuffer fillbuf(DataBuffer tgt, int from, int to)`
- Role: Handles the fillbuf path.
- Description: Implements the fillbuf operation.

#### `public FillBuffer fillbuf(DataBuffer target)`
- Role: Handles the fillbuf path.
- Description: Implements the fillbuf operation.

#### `GLRender prepare()`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `void prepare(GLObject obj)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `void prepare(BGL.Request req)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `void prepare(Consumer<GLRender> func)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `Disposable prepare(Model.Indices buf)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `Disposable prepare(VertexArray.Buffer buf)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLVertexArray prepare(Model mod, GLProgram prog)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.Tex2D prepare(Texture2D tex)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.Tex2D prepare(Texture2D.Sampler2D smp)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.Tex3D prepare(Texture3D tex)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.Tex3D prepare(Texture3D.Sampler3D smp)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.Tex2DArray prepare(Texture2DArray tex)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.Tex2DArray prepare(Texture2DArray.Sampler2DArray smp)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.Tex2DMS prepare(Texture2DMS tex)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.Tex2DMS prepare(Texture2DMS.Sampler2DMS smp)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.TexCube prepare(TextureCube tex)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `GLTexture.TexCube prepare(TextureCube.SamplerCube smp)`
- Role: Handles the prepare path.
- Description: Implements the prepare operation.

#### `Object prepuval(Object val)`
- Role: Handles the prepuval path.
- Description: Implements the prepuval operation.

#### `Object prepfval(Object val)`
- Role: Handles the prepfval path.
- Description: Implements the prepfval operation.

#### `public TempData(Supplier<T> bk)`
- Role: Handles the temp data path.
- Description: Implements the temp data operation.

#### `public T get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `SavedProg(int hash, ShaderMacro[] shaders, GLProgram prog)`
- Role: Handles the saved prog workflow.
- Description: Implements the saved prog operation.

#### `private SavedProg findprog(int hash, ShaderMacro[] shaders)`
- Role: Handles the findprog path.
- Description: Finds the prog.

#### `private void rehash(int nlen)`
- Role: Handles the rehash path.
- Description: Implements the rehash operation.

#### `private void putprog(int hash, ShaderMacro[] shaders, GLProgram prog)`
- Role: Handles the putprog path.
- Description: Implements the putprog operation.

#### `public GLProgram getprog(int hash, ShaderMacro[] shaders)`
- Role: Handles the getprog path.
- Description: Returns the prog.

#### `private void cleanprogs()`
- Role: Handles the cleanprogs path.
- Description: Implements the cleanprogs operation.

#### `public Object progdump()`
- Role: Handles the progdump path.
- Description: Implements the progdump operation.

#### `public boolean compatible(DrawList ob)`
- Role: Handles the compatible path.
- Description: Implements the compatible operation.

#### `public boolean compatible(Texture ob)`
- Role: Handles the compatible path.
- Description: Implements the compatible operation.

#### `public boolean compatible(DataBuffer ob)`
- Role: Handles the compatible path.
- Description: Implements the compatible operation.

#### `public void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `private void seqresize(int nsz)`
- Role: Handles the seqresize path.
- Description: Implements the seqresize operation.

#### `int seqreg()`
- Role: Handles the seqreg path.
- Description: Implements the seqreg operation.

#### `void sequnreg(int seq)`
- Role: Handles the sequnreg path.
- Description: Implements the sequnreg operation.

#### `int dispseq()`
- Role: Handles the dispseq path.
- Description: Implements the dispseq operation.

#### `Sequence(Object owner)`
- Role: Handles the sequence workflow.
- Description: Implements the sequence operation.

#### `private void disposed()`
- Role: Handles the disposed path.
- Description: Implements the disposed operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public int numprogs()`
- Role: Handles the numprogs path.
- Description: Implements the numprogs operation.

#### `public Caps caps()`
- Role: Handles the caps path.
- Description: Implements the caps operation.

#### `public String memstats()`
- Role: Handles the memstats path.
- Description: Implements the memstats operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.