---
source: [GLDrawList.java](../../../../../src/haven/render/gl/GLDrawList.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLDrawList

Provides GL backend support for gldraw list.

## Nested Types

### DepSetting

- Role: Represents dep setting within GLDrawList.
- Description: Describes the nested dep setting type used by the enclosing class.

### DrawSlot

- Role: Represents draw slot within GLDrawList.
- Description: Describes the nested draw slot type used by the enclosing class.

### FrameSetting

- Role: Represents frame setting within GLDrawList.
- Description: Describes the nested frame setting type used by the enclosing class.

### PipeSetting

- Role: Represents pipe setting within GLDrawList.
- Description: Describes the nested pipe setting type used by the enclosing class.

### ProgramMismatchException

- Role: Represents program mismatch exception within GLDrawList.
- Description: Describes the nested program mismatch exception type used by the enclosing class.

### Setting

- Role: Represents setting within GLDrawList.
- Description: Describes the nested setting type used by the enclosing class.

### SettingKey

- Role: Represents setting key within GLDrawList.
- Description: Describes the nested setting key type used by the enclosing class.

### SlotRender

- Role: Represents slot render within GLDrawList.
- Description: Describes the nested slot render type used by the enclosing class.

### UniformSetting

- Role: Represents uniform setting within GLDrawList.
- Description: Describes the nested uniform setting type used by the enclosing class.

### VaoSetting

- Role: Represents vao setting within GLDrawList.
- Description: Describes the nested vao setting type used by the enclosing class.

## Members

### Constants

#### `public static final int idx_vao = 0`
- Role: Defines the shared idx vao constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int idx_fbo = 1`
- Role: Defines the shared idx fbo constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int idx_pst = 2`
- Role: Defines the shared idx pst constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int idx_uni = idx_pst + GLPipeState.all.length`
- Role: Defines the shared idx uni constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Comparator<DrawSlot> order = new Comparator<DrawSlot>()`
- Role: Defines the shared order constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final GLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `public Object desc`
- Role: Holds the desc state.
- Description: Backs the cached state for this file.

#### `private final Map<SettingKey, DepSetting> settings = new HashMap<>()`
- Role: Caches settings entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Slot<? extends Rendered>, DrawSlot> slotmap = new IdentityHashMap<>()`
- Role: Caches slotmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Pipe, Object> psettings = new IdentityHashMap<>()`
- Role: Caches psettings entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Pipe, Object> orderidx = new IdentityHashMap<>()`
- Role: Caches orderidx entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final GLDoubleBuffer settingbuf = new GLDoubleBuffer()`
- Role: Stores the settingbuf value.
- Description: Backs the cached state for this file.

#### `private DrawSlot root = null`
- Role: Holds the root state.
- Description: Backs the cached state for this file.

#### `private boolean disposed = false`
- Role: Tracks the disposed flag.
- Description: Supports the disposed operation used by the surrounding class.

#### `private static AtomicLong uniqid = new AtomicLong()`
- Role: Stores the uniqid value.
- Description: Backs the cached state for this file.

#### `final long sortid`
- Role: Stores the sortid value.
- Description: Backs the cached state for this file.

#### `DrawSlot tp, tl, tr`
- Role: Holds the tr state.
- Description: Backs the cached state for this file.

#### `DrawSlot tp, tl, tr`
- Role: Holds the tr state.
- Description: Backs the cached state for this file.

#### `DrawSlot tp, tl, tr`
- Role: Holds the tr state.
- Description: Backs the cached state for this file.

#### `int th = 0`
- Role: Stores the th value.
- Description: Backs the cached state for this file.

#### `int tsubsize = 0; /* Not critical, only used for debugging purposes. */`
- Role: Stores the tsubsize value.
- Description: Backs the cached state for this file.

#### `final Slot<? extends Rendered> bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `final GLProgram prog`
- Role: Holds the prog state.
- Description: Backs the cached state for this file.

#### `final Setting[] settings`
- Role: Holds the settings state.
- Description: Backs the cached state for this file.

#### `BufferBGL compiled, main`
- Role: Stores the main value.
- Description: Backs the cached state for this file.

#### `BufferBGL compiled, main`
- Role: Stores the main value.
- Description: Backs the cached state for this file.

#### `Rendered.Order gorder`
- Role: Holds the gorder state.
- Description: Backs the cached state for this file.

#### `final Pipe ordersrc`
- Role: Holds the ordersrc state.
- Description: Backs the cached state for this file.

#### `private volatile boolean disposed = false`
- Role: Tracks the disposed flag.
- Description: Supports the disposed operation used by the surrounding class.

#### `final GLProgram prog`
- Role: Holds the prog state.
- Description: Backs the cached state for this file.

#### `final Object vid`
- Role: Holds the vid state.
- Description: Backs the cached state for this file.

#### `final Pipe depid_1`
- Role: Holds the depid 1 state.
- Description: Backs the cached state for this file.

#### `final Pipe[] depid_v`
- Role: Holds the depid v state.
- Description: Backs the cached state for this file.

#### `final GLDoubleBuffer.Buffered gl = settingbuf.new Buffered()`
- Role: Stores the gl value.
- Description: Backs the cached state for this file.

#### `final SettingKey key`
- Role: Holds the key state.
- Description: Backs the cached state for this file.

#### `int rc = 0`
- Role: Stores the rc value.
- Description: Backs the cached state for this file.

#### `private int depmask_1 = -1`
- Role: Stores the depmask 1 value.
- Description: Backs the cached state for this file.

#### `private int[] depmask_v = null`
- Role: Stores the depmask v value.
- Description: Backs the cached state for this file.

#### `final GLProgram prog`
- Role: Holds the prog state.
- Description: Backs the cached state for this file.

#### `final GLPipeState<T> setting`
- Role: Holds the setting state.
- Description: Backs the cached state for this file.

#### `final GLProgram prog`
- Role: Holds the prog state.
- Description: Backs the cached state for this file.

#### `final Uniform var`
- Role: Holds the var state.
- Description: Backs the cached state for this file.

#### `GLObject vref`
- Role: Stores the vref value.
- Description: Backs the cached state for this file.

#### `final VaoBindState st`
- Role: Holds the st state.
- Description: Backs the cached state for this file.

#### `private final Map<Pair<GLVertexArray, GLBuffer>, VaoSetting> vaos = new CacheMap<>(CacheMap.RefType.WEAK)`
- Role: Caches vaos entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final VaoSetting vao_nil = getvao(null, null)`
- Role: Holds the vao nil state.
- Description: Backs the cached state for this file.

#### `final DrawSlot slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

#### `private boolean done`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `public final GLProgram.Dump got, expected`
- Role: Holds the expected state.
- Description: Backs the cached state for this file.

#### `public final GLProgram.Dump got, expected`
- Role: Holds the expected state.
- Description: Backs the cached state for this file.

#### `public final Object pdump`
- Role: Holds the pdump state.
- Description: Backs the cached state for this file.

#### `private final Disposable lck = Finalizer.leakcheck(this)`
- Role: Holds the lck state.
- Description: Backs the cached state for this file.

### Methods

#### `private static int btheight(DrawSlot s)`
- Role: Performs btheight.
- Description: Supports the btheight operation used by the surrounding class.

#### `private static int btsubsize(DrawSlot s)`
- Role: Performs btsubsize.
- Description: Supports the btsubsize operation used by the surrounding class.

#### `private static void setp(DrawSlot s, DrawSlot p)`
- Role: Performs setp.
- Description: Supports the setp operation used by the surrounding class.

#### `DrawSlot first()`
- Role: Performs first.
- Description: Supports the first operation used by the surrounding class.

#### `DrawSlot prev()`
- Role: Performs prev.
- Description: Supports the prev operation used by the surrounding class.

#### `DrawSlot next()`
- Role: Performs next.
- Description: Supports the next operation used by the surrounding class.

#### `private int setheight()`
- Role: Performs setheight.
- Description: Supports the setheight operation used by the surrounding class.

#### `private void bbtrl()`
- Role: Performs bbtrl.
- Description: Supports the bbtrl operation used by the surrounding class.

#### `private void bbtrr()`
- Role: Performs bbtrr.
- Description: Supports the bbtrr operation used by the surrounding class.

#### `private void insert(DrawSlot child)`
- Role: Performs insert.
- Description: Supports the insert operation used by the surrounding class.

#### `private void tinsert()`
- Role: Performs tinsert.
- Description: Supports the tinsert operation used by the surrounding class.

#### `private void tremove()`
- Role: Performs tremove.
- Description: Supports the tremove operation used by the surrounding class.

#### `private GLProgram progfor(Slot<? extends Rendered> sl)`
- Role: Performs progfor.
- Description: Supports the progfor operation used by the surrounding class.

#### `private void getsettings()`
- Role: Performs getsettings.
- Description: Supports the getsettings operation used by the surrounding class.

#### `private void glupdate(DrawSlot prev)`
- Role: Performs glupdate.
- Description: Supports the glupdate operation used by the surrounding class.

#### `private void orderreg()`
- Role: Performs orderreg.
- Description: Supports the orderreg operation used by the surrounding class.

#### `private void orderunreg()`
- Role: Performs orderunreg.
- Description: Supports the orderunreg operation used by the surrounding class.

#### `void orderupdate()`
- Role: Performs orderupdate.
- Description: Supports the orderupdate operation used by the surrounding class.

#### `DrawSlot(Slot<? extends Rendered> bk)`
- Role: Handles the draw slot workflow.
- Description: Supports the draw slot operation used by the surrounding class.

#### `void insert()`
- Role: Performs insert.
- Description: Supports the insert operation used by the surrounding class.

#### `void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `SettingKey(GLProgram prog, Object vid, Pipe... depid)`
- Role: Handles the setting key workflow.
- Description: Supports the setting key operation used by the surrounding class.

#### `public int ndeps()`
- Role: Performs ndeps.
- Description: Supports the ndeps operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `private static Pipe nidx(GroupPipe st, int idx)`
- Role: Performs nidx.
- Description: Supports the nidx operation used by the surrounding class.

#### `static Pipe[] makedepid(GroupPipe state, Collection<State.Slot<?>> deps)`
- Role: Performs makedepid.
- Description: Supports the makedepid operation used by the surrounding class.

#### `abstract void compile(BGL gl)`
- Role: Performs compile.
- Description: Supports the compile operation used by the surrounding class.

#### `void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `void put()`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `DepSetting(SettingKey key)`
- Role: Handles the dep setting workflow.
- Description: Supports the dep setting operation used by the surrounding class.

#### `abstract State.Slot[] depslots()`
- Role: Performs depslots.
- Description: Supports the depslots operation used by the surrounding class.

#### `void ckupdate(int[] mask)`
- Role: Performs ckupdate.
- Description: Supports the ckupdate operation used by the surrounding class.

#### `Pipe compstate()`
- Role: Performs compstate.
- Description: Supports the compstate operation used by the surrounding class.

#### `void put()`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `void del()`
- Role: Performs del.
- Description: Supports the del operation used by the surrounding class.

#### `private void delsettingp(DepSetting set, Pipe dp)`
- Role: Performs delsettingp.
- Description: Supports the delsettingp operation used by the surrounding class.

#### `private void delsetting(DepSetting set)`
- Role: Performs delsetting.
- Description: Supports the delsetting operation used by the surrounding class.

#### `private void addsettingp(DepSetting set, Pipe dp)`
- Role: Performs addsettingp.
- Description: Supports the addsettingp operation used by the surrounding class.

#### `private void addsetting(DepSetting set)`
- Role: Performs addsetting.
- Description: Supports the addsetting operation used by the surrounding class.

#### `private static State.Slot[] progfslots(GLProgram prog)`
- Role: Performs progfslots.
- Description: Supports the progfslots operation used by the surrounding class.

#### `FrameSetting(SettingKey key)`
- Role: Handles the frame setting workflow.
- Description: Supports the frame setting operation used by the surrounding class.

#### `void compile(BGL gl)`
- Role: Performs compile.
- Description: Supports the compile operation used by the surrounding class.

#### `State.Slot[] depslots()`
- Role: Performs depslots.
- Description: Supports the depslots operation used by the surrounding class.

#### `DepSetting getframe(GLProgram prog, GroupPipe state)`
- Role: Performs getframe.
- Description: Supports the getframe operation used by the surrounding class.

#### `PipeSetting(SettingKey key, GLPipeState<T> setting)`
- Role: Handles the pipe setting workflow.
- Description: Supports the pipe setting operation used by the surrounding class.

#### `void compile(BGL gl)`
- Role: Performs compile.
- Description: Supports the compile operation used by the surrounding class.

#### `State.Slot[] depslots()`
- Role: Performs depslots.
- Description: Supports the depslots operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `DepSetting getpipest(GLPipeState<?> pst, GroupPipe state)`
- Role: Performs getpipest.
- Description: Supports the getpipest operation used by the surrounding class.

#### `UniformSetting(SettingKey key)`
- Role: Handles the uniform setting workflow.
- Description: Supports the uniform setting operation used by the surrounding class.

#### `void compile(BGL gl)`
- Role: Performs compile.
- Description: Supports the compile operation used by the surrounding class.

#### `State.Slot[] depslots()`
- Role: Performs depslots.
- Description: Supports the depslots operation used by the surrounding class.

#### `void del()`
- Role: Performs del.
- Description: Supports the del operation used by the surrounding class.

#### `DepSetting getuniform(GLProgram prog, Uniform var, GroupPipe state)`
- Role: Performs getuniform.
- Description: Supports the getuniform operation used by the surrounding class.

#### `VaoSetting(GLVertexArray vao, GLBuffer ebo)`
- Role: Handles the vao setting workflow.
- Description: Supports the vao setting operation used by the surrounding class.

#### `void compile(BGL gl)`
- Role: Performs compile.
- Description: Supports the compile operation used by the surrounding class.

#### `void put()`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `private VaoSetting getvao(GLVertexArray vao, GLBuffer ebo)`
- Role: Performs getvao.
- Description: Supports the getvao operation used by the surrounding class.

#### `SlotRender(DrawSlot slot)`
- Role: Handles the slot render workflow.
- Description: Supports the slot render operation used by the surrounding class.

#### `public Environment env()`
- Role: Performs env.
- Description: Supports the env operation used by the surrounding class.

#### `public void draw(Pipe st, Model mod)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void submit(Render sub)`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `public void clear(Pipe pipe, FragData buf, FColor val)`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public void clear(Pipe pipe, double val)`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`
- Role: Performs pget.
- Description: Supports the pget operation used by the surrounding class.

#### `public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dst, Consumer<ByteBuffer> callback)`
- Role: Performs pget.
- Description: Supports the pget operation used by the surrounding class.

#### `public void timestamp(Consumer<Long> callback)`
- Role: Performs timestamp.
- Description: Supports the timestamp operation used by the surrounding class.

#### `public void fence(Runnable callback)`
- Role: Performs fence.
- Description: Supports the fence operation used by the surrounding class.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> data)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `private void verify(DrawSlot t)`
- Role: Performs verify.
- Description: Supports the verify operation used by the surrounding class.

#### `private void verify()`
- Role: Performs verify.
- Description: Supports the verify operation used by the surrounding class.

#### `public GLDrawList(GLEnvironment env)`
- Role: Creates a new GLDrawList instance.
- Description: Constructs the instance and initializes its default state.

#### `public ProgramMismatchException(GLProgram got, GLProgram expected)`
- Role: Performs program mismatch exception.
- Description: Supports the program mismatch exception operation used by the surrounding class.

#### `public void draw(Render r)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void add(Slot<? extends Rendered> slot)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Slot<? extends Rendered> slot)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void update(Slot<? extends Rendered> slot)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `private void orderupdate(Pipe group)`
- Role: Performs orderupdate.
- Description: Supports the orderupdate operation used by the surrounding class.

#### `public void update(Pipe group, int[] mask)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `void treedump(java.io.PrintWriter out, DrawSlot slot)`
- Role: Performs treedump.
- Description: Supports the treedump operation used by the surrounding class.

#### `String treedump(DrawSlot root)`
- Role: Performs treedump.
- Description: Supports the treedump operation used by the surrounding class.

#### `String treedump()`
- Role: Performs treedump.
- Description: Supports the treedump operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public GLDrawList desc(Object desc)`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.
