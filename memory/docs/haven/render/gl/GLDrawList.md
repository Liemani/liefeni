# GLDrawList

This file documents the responsibilities and members of `GLDrawList`.

## Meta

- Source: [GLDrawList.java](../../../../../src/haven/render/gl/GLDrawList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a GL draw list.

## Nested Types

### DepSetting

- Description: TODO

### DrawSlot

- Description: TODO

### FrameSetting

- Description: TODO

### PipeSetting

- Description: TODO

### ProgramMismatchException

- Description: TODO

### Setting

- Description: TODO

### SettingKey

- Description: TODO

### SlotRender

- Description: TODO

### UniformSetting

- Description: TODO

### VaoSetting

- Description: TODO

## Members

### Constants

#### `public static final int idx_vao = 0`

- Description: TODO

#### `public static final int idx_fbo = 1`

- Description: TODO

#### `public static final int idx_pst = 2`

- Description: TODO

#### `public static final int idx_uni = idx_pst + GLPipeState.all.length`

- Description: TODO

#### `private static final Comparator<DrawSlot> order = new Comparator<DrawSlot>()`

- Description: TODO

### Fields

#### `public final GLEnvironment env`

- Description: TODO

#### `public Object desc`

- Description: TODO

#### `private final Map<SettingKey, DepSetting> settings = new HashMap<>()`

- Description: TODO

#### `private final Map<Slot<? extends Rendered>, DrawSlot> slotmap = new IdentityHashMap<>()`

- Description: TODO

#### `private final Map<Pipe, Object> psettings = new IdentityHashMap<>()`

- Description: TODO

#### `private final Map<Pipe, Object> orderidx = new IdentityHashMap<>()`

- Description: TODO

#### `private final GLDoubleBuffer settingbuf = new GLDoubleBuffer()`

- Description: TODO

#### `private DrawSlot root = null`

- Description: TODO

#### `private boolean disposed = false`

- Description: TODO

#### `private static AtomicLong uniqid = new AtomicLong()`

- Description: TODO

#### `final long sortid`

- Description: TODO

#### `DrawSlot tp, tl, tr`

- Description: TODO

#### `DrawSlot tp, tl, tr`

- Description: TODO

#### `DrawSlot tp, tl, tr`

- Description: TODO

#### `int th = 0`

- Description: TODO

#### `int tsubsize = 0; /* Not critical, only used for debugging purposes. */`

- Description: TODO

#### `final Slot<? extends Rendered> bk`

- Description: TODO

#### `final GLProgram prog`

- Description: TODO

#### `final Setting[] settings`

- Description: TODO

#### `BufferBGL compiled, main`

- Description: TODO

#### `BufferBGL compiled, main`

- Description: TODO

#### `Rendered.Order gorder`

- Description: TODO

#### `final Pipe ordersrc`

- Description: TODO

#### `private volatile boolean disposed = false`

- Description: TODO

#### `final GLProgram prog`

- Description: TODO

#### `final Object vid`

- Description: TODO

#### `final Pipe depid_1`

- Description: TODO

#### `final Pipe[] depid_v`

- Description: TODO

#### `final GLDoubleBuffer.Buffered gl = settingbuf.new Buffered()`

- Description: TODO

#### `final SettingKey key`

- Description: TODO

#### `int rc = 0`

- Description: TODO

#### `private int depmask_1 = -1`

- Description: TODO

#### `private int[] depmask_v = null`

- Description: TODO

#### `final GLProgram prog`

- Description: TODO

#### `final GLPipeState<T> setting`

- Description: TODO

#### `final GLProgram prog`

- Description: TODO

#### `final Uniform var`

- Description: TODO

#### `GLObject vref`

- Description: TODO

#### `final VaoBindState st`

- Description: TODO

#### `private final Map<Pair<GLVertexArray, GLBuffer>, VaoSetting> vaos = new CacheMap<>(CacheMap.RefType.WEAK)`

- Description: TODO

#### `private final VaoSetting vao_nil = getvao(null, null)`

- Description: TODO

#### `final DrawSlot slot`

- Description: TODO

#### `private boolean done`

- Description: TODO

#### `public final GLProgram.Dump got, expected`

- Description: TODO

#### `public final GLProgram.Dump got, expected`

- Description: TODO

#### `public final Object pdump`

- Description: TODO

#### `private final Disposable lck = Finalizer.leakcheck(this)`

- Description: TODO

### Methods

#### `private static int btheight(DrawSlot s)`

- Description: TODO

#### `private static int btsubsize(DrawSlot s)`

- Description: TODO

#### `private static void setp(DrawSlot s, DrawSlot p)`

- Description: TODO

#### `DrawSlot first()`

- Description: TODO

#### `DrawSlot prev()`

- Description: TODO

#### `DrawSlot next()`

- Description: TODO

#### `private int setheight()`

- Description: TODO

#### `private void bbtrl()`

- Description: TODO

#### `private void bbtrr()`

- Description: TODO

#### `private void insert(DrawSlot child)`

- Description: TODO

#### `private void tinsert()`

- Description: TODO

#### `private void tremove()`

- Description: TODO

#### `private GLProgram progfor(Slot<? extends Rendered> sl)`

- Description: TODO

#### `private void getsettings()`

- Description: TODO

#### `private void glupdate(DrawSlot prev)`

- Description: TODO

#### `private void orderreg()`

- Description: TODO

#### `private void orderunreg()`

- Description: TODO

#### `void orderupdate()`

- Description: TODO

#### `DrawSlot(Slot<? extends Rendered> bk)`

- Description: TODO

#### `void insert()`

- Description: TODO

#### `void remove()`

- Description: TODO

#### `void dispose()`

- Description: TODO

#### `SettingKey(GLProgram prog, Object vid, Pipe... depid)`

- Description: TODO

#### `public int ndeps()`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `private static Pipe nidx(GroupPipe st, int idx)`

- Description: TODO

#### `static Pipe[] makedepid(GroupPipe state, Collection<State.Slot<?>> deps)`

- Description: TODO

#### `abstract void compile(BGL gl)`

- Description: TODO

#### `void update()`

- Description: TODO

#### `void put()`

- Description: TODO

#### `DepSetting(SettingKey key)`

- Description: TODO

#### `abstract State.Slot[] depslots()`

- Description: TODO

#### `void ckupdate(int[] mask)`

- Description: TODO

#### `Pipe compstate()`

- Description: TODO

#### `void put()`

- Description: TODO

#### `void del()`

- Description: TODO

#### `private void delsettingp(DepSetting set, Pipe dp)`

- Description: TODO

#### `private void delsetting(DepSetting set)`

- Description: TODO

#### `private void addsettingp(DepSetting set, Pipe dp)`

- Description: TODO

#### `private void addsetting(DepSetting set)`

- Description: TODO

#### `private static State.Slot[] progfslots(GLProgram prog)`

- Description: TODO

#### `FrameSetting(SettingKey key)`

- Description: TODO

#### `void compile(BGL gl)`

- Description: TODO

#### `State.Slot[] depslots()`

- Description: TODO

#### `DepSetting getframe(GLProgram prog, GroupPipe state)`

- Description: TODO

#### `PipeSetting(SettingKey key, GLPipeState<T> setting)`

- Description: TODO

#### `void compile(BGL gl)`

- Description: TODO

#### `State.Slot[] depslots()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `DepSetting getpipest(GLPipeState<?> pst, GroupPipe state)`

- Description: TODO

#### `UniformSetting(SettingKey key)`

- Description: TODO

#### `void compile(BGL gl)`

- Description: TODO

#### `State.Slot[] depslots()`

- Description: TODO

#### `void del()`

- Description: TODO

#### `DepSetting getuniform(GLProgram prog, Uniform var, GroupPipe state)`

- Description: TODO

#### `VaoSetting(GLVertexArray vao, GLBuffer ebo)`

- Description: TODO

#### `void compile(BGL gl)`

- Description: TODO

#### `void put()`

- Description: TODO

#### `private VaoSetting getvao(GLVertexArray vao, GLBuffer ebo)`

- Description: TODO

#### `SlotRender(DrawSlot slot)`

- Description: TODO

#### `public Environment env()`

- Description: TODO

#### `public void draw(Pipe st, Model mod)`

- Description: TODO

#### `public void submit(Render sub)`

- Description: TODO

#### `public void clear(Pipe pipe, FragData buf, FColor val)`

- Description: TODO

#### `public void clear(Pipe pipe, double val)`

- Description: TODO

#### `public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`

- Description: TODO

#### `public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dst, Consumer<ByteBuffer> callback)`

- Description: TODO

#### `public void timestamp(Consumer<Long> callback)`

- Description: TODO

#### `public void fence(Runnable callback)`

- Description: TODO

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to)`

- Description: TODO

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> data)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `private void verify(DrawSlot t)`

- Description: TODO

#### `private void verify()`

- Description: TODO

#### `public GLDrawList(GLEnvironment env)`

- Description: TODO

#### `public ProgramMismatchException(GLProgram got, GLProgram expected)`

- Description: TODO

#### `public void draw(Render r)`

- Description: TODO

#### `public void add(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void remove(Slot<? extends Rendered> slot)`

- Description: TODO

#### `public void update(Slot<? extends Rendered> slot)`

- Description: TODO

#### `private void orderupdate(Pipe group)`

- Description: TODO

#### `public void update(Pipe group, int[] mask)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `void treedump(java.io.PrintWriter out, DrawSlot slot)`

- Description: TODO

#### `String treedump(DrawSlot root)`

- Description: TODO

#### `String treedump()`

- Description: TODO

#### `public String stats()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public GLDrawList desc(Object desc)`

- Description: TODO
