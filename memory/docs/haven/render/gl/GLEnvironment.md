# GLEnvironment

This file documents the responsibilities and members of `GLEnvironment`.

## Meta

- Source: [GLEnvironment.java](../../../../../src/haven/render/gl/GLEnvironment.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a GL environment.

## Nested Types

### Caps

- Description: TODO

### DebugMessage

- Description: TODO

### HardwareException

- Description: TODO

### MemStats

- Description: TODO

### SavedProg

- Description: TODO

### Sequence

- Description: TODO

### TempData

- Description: TODO

## Members

### Constants

#### `public static final boolean debuglog = false, labels = false`

- Description: TODO

#### `public static final boolean debuglog = false, labels = false`

- Description: TODO

#### `private static final java.util.regex.Pattern slvp = java.util.regex.Pattern.compile("^(\\d+)\\.(\\d+)")`

- Description: TODO

### Fields

#### `public final Caps caps`

- Description: TODO

#### `public int nilfbo_id = 0, nilfbo_db = 0`

- Description: TODO

#### `public int nilfbo_id = 0, nilfbo_db = 0`

- Description: TODO

#### `final Object drawmon = new Object()`

- Description: TODO

#### `final Object prepmon = new Object()`

- Description: TODO

#### `final Collection<GLObject> disposed = new LinkedList<>()`

- Description: TODO

#### `final List<GLQuery> queries = new LinkedList<>(); // Synchronized on drawmon`

- Description: TODO

#### `final Queue<Runnable> callbacks = new LinkedList<>()`

- Description: TODO

#### `Thread cbthread = null`

- Description: TODO

#### `final Queue<GLRender> submitted = new LinkedList<>()`

- Description: TODO

#### `Area wnd`

- Description: TODO

#### `private GLRender prep = null`

- Description: TODO

#### `private Applier curstate = new Applier(this)`

- Description: TODO

#### `private boolean invalid = false`

- Description: TODO

#### `public final Caps caps`

- Description: TODO

#### `public final String vendor, version, renderer`

- Description: TODO

#### `public final String vendor, version, renderer`

- Description: TODO

#### `public final String vendor, version, renderer`

- Description: TODO

#### `public final int major, minor, glslver`

- Description: TODO

#### `public final int major, minor, glslver`

- Description: TODO

#### `public final int major, minor, glslver`

- Description: TODO

#### `public final Collection<String> exts`

- Description: TODO

#### `public final int maxtargets`

- Description: TODO

#### `public final float anisotropy`

- Description: TODO

#### `public final float linemin, linemax`

- Description: TODO

#### `public final float linemin, linemax`

- Description: TODO

#### `final int[] stats_obj = new int[MemStats.values().length]`

- Description: TODO

#### `final long[] stats_mem = new long[MemStats.values().length]`

- Description: TODO

#### `public final int src, type, id, sev`

- Description: TODO

#### `public final int src, type, id, sev`

- Description: TODO

#### `public final int src, type, id, sev`

- Description: TODO

#### `public final int src, type, id, sev`

- Description: TODO

#### `public final String msg`

- Description: TODO

#### `private final Supplier<T> bk`

- Description: TODO

#### `private T d = null`

- Description: TODO

#### `public final Supplier<GLVertexArray> tempvao = new TempData<>(() -> new GLVertexArray(this))`

- Description: TODO

#### `public final Supplier<GLBuffer> tempvertex = new TempData<>(() -> new GLBuffer(this))`

- Description: TODO

#### `public final Supplier<GLBuffer> tempindex = new TempData<>(() -> new GLBuffer(this))`

- Description: TODO

#### `final int hash`

- Description: TODO

#### `final ShaderMacro[] shaders`

- Description: TODO

#### `final GLProgram prog`

- Description: TODO

#### `SavedProg next`

- Description: TODO

#### `boolean used = true`

- Description: TODO

#### `private final Object pmon = new Object()`

- Description: TODO

#### `private SavedProg[] ptab = new SavedProg[32]`

- Description: TODO

#### `private int nprog = 0`

- Description: TODO

#### `private double lastpclean = Utils.rtime()`

- Description: TODO

#### `private final Object seqmon = new Object()`

- Description: TODO

#### `private boolean[] sequse = new boolean[16]`

- Description: TODO

#### `private int seqhead = 1, seqtail = seqhead`

- Description: TODO

#### `private int seqhead = 1, seqtail = seqhead`

- Description: TODO

#### `public final int no`

- Description: TODO

#### `private final Runnable clean`

- Description: TODO

#### `private final String desc`

- Description: TODO

#### `private volatile boolean cleaned = false`

- Description: TODO

### Methods

#### `public HardwareException(String msg, Caps caps)`

- Description: TODO

#### `public static int glgeti(GL gl, int param)`

- Description: TODO

#### `public static int glcondi(GL gl, int param, int def)`

- Description: TODO

#### `public static float glgetf(GL gl, int param)`

- Description: TODO

#### `public static String glconds(GL gl, int param)`

- Description: TODO

#### `public Caps(GL gl)`

- Description: TODO

#### `public void checkreq()`

- Description: TODO

#### `public String vendor()`

- Description: TODO

#### `public String driver()`

- Description: TODO

#### `public String device()`

- Description: TODO

#### `protected abstract Caps mkcaps(GL initgl)`

- Description: TODO

#### `public GLEnvironment(GL initgl, Area wnd)`

- Description: TODO

#### `private void initialize(GL gl)`

- Description: TODO

#### `public GLRender render()`

- Description: TODO

#### `public GLDrawList drawlist()`

- Description: TODO

#### `public void reshape(Area wnd)`

- Description: TODO

#### `public Area shape()`

- Description: TODO

#### `private void ckcbt()`

- Description: TODO

#### `private void cbloop()`

- Description: TODO

#### `void callback(Runnable cb)`

- Description: TODO

#### `public void synccallbacks() throws InterruptedException`

- Description: TODO

#### `private void checkqueries(GL gl)`

- Description: TODO

#### `public DebugMessage(int src, int type, int id, int sev, String msg)`

- Description: TODO

#### `private List<DebugMessage> getdebuglog(GL gl)`

- Description: TODO

#### `private void checkdebuglog(GL gl)`

- Description: TODO

#### `public void process(GL gl)`

- Description: TODO

#### `public void finish(GL gl) throws InterruptedException`

- Description: TODO

#### `public void submit(Render cmd)`

- Description: TODO

#### `public void submitwait() throws InterruptedException`

- Description: TODO

#### `private BufferBGL disposeall()`

- Description: TODO

#### `public abstract SysBuffer malloc(int sz)`

- Description: TODO

#### `public abstract SysBuffer subsume(ByteBuffer data, int sz)`

- Description: TODO

#### `public FillBuffer fillbuf(DataBuffer tgt, int from, int to)`

- Description: TODO

#### `public FillBuffer fillbuf(DataBuffer target)`

- Description: TODO

#### `GLRender prepare()`

- Description: TODO

#### `void prepare(GLObject obj)`

- Description: TODO

#### `void prepare(BGL.Request req)`

- Description: TODO

#### `void prepare(Consumer<GLRender> func)`

- Description: TODO

#### `Disposable prepare(Model.Indices buf)`

- Description: TODO

#### `Disposable prepare(VertexArray.Buffer buf)`

- Description: TODO

#### `GLVertexArray prepare(Model mod, GLProgram prog)`

- Description: TODO

#### `GLTexture.Tex2D prepare(Texture2D tex)`

- Description: TODO

#### `GLTexture.Tex2D prepare(Texture2D.Sampler2D smp)`

- Description: TODO

#### `GLTexture.Tex3D prepare(Texture3D tex)`

- Description: TODO

#### `GLTexture.Tex3D prepare(Texture3D.Sampler3D smp)`

- Description: TODO

#### `GLTexture.Tex2DArray prepare(Texture2DArray tex)`

- Description: TODO

#### `GLTexture.Tex2DArray prepare(Texture2DArray.Sampler2DArray smp)`

- Description: TODO

#### `GLTexture.Tex2DMS prepare(Texture2DMS tex)`

- Description: TODO

#### `GLTexture.Tex2DMS prepare(Texture2DMS.Sampler2DMS smp)`

- Description: TODO

#### `GLTexture.TexCube prepare(TextureCube tex)`

- Description: TODO

#### `GLTexture.TexCube prepare(TextureCube.SamplerCube smp)`

- Description: TODO

#### `Object prepuval(Object val)`

- Description: TODO

#### `Object prepfval(Object val)`

- Description: TODO

#### `public TempData(Supplier<T> bk)`

- Description: TODO

#### `public T get()`

- Description: TODO

#### `SavedProg(int hash, ShaderMacro[] shaders, GLProgram prog)`

- Description: TODO

#### `private SavedProg findprog(int hash, ShaderMacro[] shaders)`

- Description: TODO

#### `private void rehash(int nlen)`

- Description: TODO

#### `private void putprog(int hash, ShaderMacro[] shaders, GLProgram prog)`

- Description: TODO

#### `public GLProgram getprog(int hash, ShaderMacro[] shaders)`

- Description: TODO

#### `private void cleanprogs()`

- Description: TODO

#### `public Object progdump()`

- Description: TODO

#### `public boolean compatible(DrawList ob)`

- Description: TODO

#### `public boolean compatible(Texture ob)`

- Description: TODO

#### `public boolean compatible(DataBuffer ob)`

- Description: TODO

#### `public void clean()`

- Description: TODO

#### `private void seqresize(int nsz)`

- Description: TODO

#### `int seqreg()`

- Description: TODO

#### `void sequnreg(int seq)`

- Description: TODO

#### `int dispseq()`

- Description: TODO

#### `Sequence(Object owner)`

- Description: TODO

#### `private void disposed()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public int numprogs()`

- Description: TODO

#### `public Caps caps()`

- Description: TODO

#### `public String memstats()`

- Description: TODO

#### `public void dispose()`

- Description: TODO
