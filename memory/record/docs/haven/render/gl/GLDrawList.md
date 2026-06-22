---
source: [GLDrawList.java](../../../../../../src/haven/render/gl/GLDrawList.java)
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
- Role: Caches the idx vao value.
- Description: Caches the `idx_vao` value for reuse.
- Value: `0`

#### `public static final int idx_fbo = 1`
- Role: Caches the idx fbo value.
- Description: Caches the `idx_fbo` value for reuse.
- Value: `1`

#### `public static final int idx_pst = 2`
- Role: Caches the idx pst value.
- Description: Caches the `idx_pst` value for reuse.
- Value: `2`

#### `public static final int idx_uni = idx_pst + GLPipeState.all.length`
- Role: Caches the idx uni value.
- Description: Caches the `idx_uni` value for reuse.
- Value: `idx_pst + GLPipeState.all.length`

#### `private static final Comparator<DrawSlot> order = new Comparator<DrawSlot>()`
- Role: Implements the order operation.
- Description: Implements the private static final comparator<draw slot> order = new comparator<draw slot>() operation.
- Value: `new Comparator<DrawSlot>()`

### Fields

#### `public final GLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `public Object desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `private final Map<SettingKey, DepSetting> settings = new HashMap<>()`
- Role: Updates the tings.
- Description: Updates the tings.

#### `private final Map<Slot<? extends Rendered>, DrawSlot> slotmap = new IdentityHashMap<>()`
- Role: Implements the slotmap operation.
- Description: Implements the private final map<slot<? extends rendered>, draw slot> slotmap = new identity hash map<>() operation.

#### `private final Map<Pipe, Object> psettings = new IdentityHashMap<>()`
- Role: Implements the psettings operation.
- Description: Implements the private final map<pipe, object> psettings = new identity hash map<>() operation.

#### `private final Map<Pipe, Object> orderidx = new IdentityHashMap<>()`
- Role: Implements the orderidx operation.
- Description: Implements the private final map<pipe, object> orderidx = new identity hash map<>() operation.

#### `private final GLDoubleBuffer settingbuf = new GLDoubleBuffer()`
- Role: Updates the tingbuf.
- Description: Updates the tingbuf.

#### `private DrawSlot root = null`
- Role: Caches the root value.
- Description: Keeps the root event so acceptance can be reported back.

#### `private boolean disposed = false`
- Role: Tracks the disposed flag.
- Description: Caches the `disposed` value for reuse.

#### `private static AtomicLong uniqid = new AtomicLong()`
- Role: Implements the uniqid operation.
- Description: Implements the atomic long operation.

#### `final long sortid`
- Role: Caches the sortid value.
- Description: Caches the `sortid` value for reuse.

#### `DrawSlot tp, tl, tr`
- Role: Caches the tr value.
- Description: Caches the `tr` value for reuse.

#### `DrawSlot tp, tl, tr`
- Role: Caches the tr value.
- Description: Caches the `tr` value for reuse.

#### `DrawSlot tp, tl, tr`
- Role: Caches the tr value.
- Description: Caches the `tr` value for reuse.

#### `int th = 0`
- Role: Caches the th value.
- Description: Caches the `th` value for reuse.

#### `int tsubsize = 0; /* Not critical, only used for debugging purposes. */`
- Role: Caches the tsubsize value.
- Description: Caches the `tsubsize` value for reuse.

#### `final Slot<? extends Rendered> bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `final GLProgram prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `final Setting[] settings`
- Role: Caches the settings value.
- Description: Caches the `settings` value for reuse.

#### `BufferBGL compiled, main`
- Role: Caches the main value.
- Description: Caches the `main` value for reuse.

#### `BufferBGL compiled, main`
- Role: Caches the main value.
- Description: Caches the `main` value for reuse.

#### `Rendered.Order gorder`
- Role: Caches the gorder value.
- Description: Caches the `gorder` value for reuse.

#### `final Pipe ordersrc`
- Role: Caches the ordersrc value.
- Description: Caches the `ordersrc` value for reuse.

#### `private volatile boolean disposed = false`
- Role: Tracks the disposed flag.
- Description: Caches the `disposed` value for reuse.

#### `final GLProgram prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `final Object vid`
- Role: Caches the vid value.
- Description: Caches the `vid` value for reuse.

#### `final Pipe depid_1`
- Role: Caches the depid 1 value.
- Description: Caches the `depid_1` value for reuse.

#### `final Pipe[] depid_v`
- Role: Caches the depid v value.
- Description: Caches the `depid_v` value for reuse.

#### `final GLDoubleBuffer.Buffered gl = settingbuf.new Buffered()`
- Role: Implements the gl operation.
- Description: Implements the buffered operation.

#### `final SettingKey key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `int rc = 0`
- Role: Caches the rc value.
- Description: Caches the `rc` value for reuse.

#### `private int depmask_1 = -1`
- Role: Caches the depmask 1 value.
- Description: Caches the `depmask_1` value for reuse.

#### `private int[] depmask_v = null`
- Role: Caches the depmask v value.
- Description: Caches the `depmask_v` value for reuse.

#### `final GLProgram prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `final GLPipeState<T> setting`
- Role: Caches the setting value.
- Description: Caches the `setting` value for reuse.

#### `final GLProgram prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `final Uniform var`
- Role: Caches the var value.
- Description: Caches the `var` value for reuse.

#### `GLObject vref`
- Role: Caches the vref value.
- Description: Caches the `vref` value for reuse.

#### `final VaoBindState st`
- Role: Caches the st value.
- Description: Caches the `st` value for reuse.

#### `private final Map<Pair<GLVertexArray, GLBuffer>, VaoSetting> vaos = new CacheMap<>(CacheMap.RefType.WEAK)`
- Role: Implements the vaos operation.
- Description: Implements the private final map<pair<gl vertex array, gl buffer>, vao setting> vaos = new cache map<>(cache map.ref type.weak) operation.

#### `private final VaoSetting vao_nil = getvao(null, null)`
- Role: Implements the vao nil operation.
- Description: Implements the getvao operation.

#### `final DrawSlot slot`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

#### `private boolean done`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

#### `public final GLProgram.Dump got, expected`
- Role: Caches the expected value.
- Description: Caches the `expected` value for reuse.

#### `public final GLProgram.Dump got, expected`
- Role: Caches the expected value.
- Description: Caches the `expected` value for reuse.

#### `public final Object pdump`
- Role: Caches the pdump value.
- Description: Caches the `pdump` value for reuse.

#### `private final Disposable lck = Finalizer.leakcheck(this)`
- Role: Implements the lck operation.
- Description: Implements the leakcheck operation.

### Methods

#### `private static int btheight(DrawSlot s)`
- Role: Handles the btheight path.
- Description: Implements the btheight operation.

#### `private static int btsubsize(DrawSlot s)`
- Role: Handles the btsubsize path.
- Description: Implements the btsubsize operation.

#### `private static void setp(DrawSlot s, DrawSlot p)`
- Role: Handles the setp path.
- Description: Updates the p.

#### `DrawSlot first()`
- Role: Handles the first path.
- Description: Implements the first operation.

#### `DrawSlot prev()`
- Role: Handles the prev path.
- Description: Implements the prev operation.

#### `DrawSlot next()`
- Role: Handles the next path.
- Description: Implements the next operation.

#### `private int setheight()`
- Role: Handles the setheight path.
- Description: Updates the height.

#### `private void bbtrl()`
- Role: Handles the bbtrl path.
- Description: Implements the bbtrl operation.

#### `private void bbtrr()`
- Role: Handles the bbtrr path.
- Description: Implements the bbtrr operation.

#### `private void insert(DrawSlot child)`
- Role: Handles the insert path.
- Description: Implements the insert operation.

#### `private void tinsert()`
- Role: Handles the tinsert path.
- Description: Implements the tinsert operation.

#### `private void tremove()`
- Role: Handles the tremove path.
- Description: Implements the tremove operation.

#### `private GLProgram progfor(Slot<? extends Rendered> sl)`
- Role: Handles the progfor path.
- Description: Implements the progfor operation.

#### `private void getsettings()`
- Role: Handles the getsettings path.
- Description: Returns the settings.

#### `private void glupdate(DrawSlot prev)`
- Role: Handles the glupdate path.
- Description: Implements the glupdate operation.

#### `private void orderreg()`
- Role: Handles the orderreg path.
- Description: Implements the orderreg operation.

#### `private void orderunreg()`
- Role: Handles the orderunreg path.
- Description: Implements the orderunreg operation.

#### `void orderupdate()`
- Role: Handles the orderupdate path.
- Description: Implements the orderupdate operation.

#### `DrawSlot(Slot<? extends Rendered> bk)`
- Role: Handles the draw slot workflow.
- Description: Implements the draw slot operation.

#### `void insert()`
- Role: Handles the insert path.
- Description: Implements the insert operation.

#### `void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `SettingKey(GLProgram prog, Object vid, Pipe... depid)`
- Role: Handles the setting key workflow.
- Description: Implements the setting key operation.

#### `public int ndeps()`
- Role: Handles the ndeps path.
- Description: Implements the ndeps operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `private static Pipe nidx(GroupPipe st, int idx)`
- Role: Handles the nidx path.
- Description: Implements the nidx operation.

#### `static Pipe[] makedepid(GroupPipe state, Collection<State.Slot<?>> deps)`
- Role: Handles the makedepid path.
- Description: Implements the makedepid operation.

#### `abstract void compile(BGL gl)`
- Role: Handles the compile path.
- Description: Implements the compile operation.

#### `void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `void put()`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `DepSetting(SettingKey key)`
- Role: Handles the dep setting workflow.
- Description: Implements the dep setting operation.

#### `abstract State.Slot[] depslots()`
- Role: Handles the depslots path.
- Description: Implements the depslots operation.

#### `void ckupdate(int[] mask)`
- Role: Handles the ckupdate path.
- Description: Implements the ckupdate operation.

#### `Pipe compstate()`
- Role: Handles the compstate path.
- Description: Implements the compstate operation.

#### `void put()`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `void del()`
- Role: Handles the del path.
- Description: Implements the del operation.

#### `private void delsettingp(DepSetting set, Pipe dp)`
- Role: Handles the delsettingp path.
- Description: Implements the delsettingp operation.

#### `private void delsetting(DepSetting set)`
- Role: Handles the delsetting path.
- Description: Implements the delsetting operation.

#### `private void addsettingp(DepSetting set, Pipe dp)`
- Role: Handles the addsettingp path.
- Description: Adds the settingp.

#### `private void addsetting(DepSetting set)`
- Role: Handles the addsetting path.
- Description: Adds the setting.

#### `private static State.Slot[] progfslots(GLProgram prog)`
- Role: Handles the progfslots path.
- Description: Implements the progfslots operation.

#### `FrameSetting(SettingKey key)`
- Role: Handles the frame setting workflow.
- Description: Implements the frame setting operation.

#### `void compile(BGL gl)`
- Role: Handles the compile path.
- Description: Implements the compile operation.

#### `State.Slot[] depslots()`
- Role: Handles the depslots path.
- Description: Implements the depslots operation.

#### `DepSetting getframe(GLProgram prog, GroupPipe state)`
- Role: Handles the getframe path.
- Description: Returns the frame.

#### `PipeSetting(SettingKey key, GLPipeState<T> setting)`
- Role: Handles the pipe setting workflow.
- Description: Implements the pipe setting operation.

#### `void compile(BGL gl)`
- Role: Handles the compile path.
- Description: Implements the compile operation.

#### `State.Slot[] depslots()`
- Role: Handles the depslots path.
- Description: Implements the depslots operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLDrawList for debugging and logging.

#### `DepSetting getpipest(GLPipeState<?> pst, GroupPipe state)`
- Role: Handles the getpipest path.
- Description: Returns the pipest.

#### `UniformSetting(SettingKey key)`
- Role: Handles the uniform setting workflow.
- Description: Implements the uniform setting operation.

#### `void compile(BGL gl)`
- Role: Handles the compile path.
- Description: Implements the compile operation.

#### `State.Slot[] depslots()`
- Role: Handles the depslots path.
- Description: Implements the depslots operation.

#### `void del()`
- Role: Handles the del path.
- Description: Implements the del operation.

#### `DepSetting getuniform(GLProgram prog, Uniform var, GroupPipe state)`
- Role: Handles the getuniform path.
- Description: Returns the uniform.

#### `VaoSetting(GLVertexArray vao, GLBuffer ebo)`
- Role: Handles the vao setting workflow.
- Description: Implements the vao setting operation.

#### `void compile(BGL gl)`
- Role: Handles the compile path.
- Description: Implements the compile operation.

#### `void put()`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `private VaoSetting getvao(GLVertexArray vao, GLBuffer ebo)`
- Role: Handles the getvao path.
- Description: Returns the vao.

#### `SlotRender(DrawSlot slot)`
- Role: Handles the slot render workflow.
- Description: Implements the slot render operation.

#### `public Environment env()`
- Role: Handles the env path.
- Description: Implements the env operation.

#### `public void draw(Pipe st, Model mod)`
- Role: Draws the current content.
- Description: Draws the GLDrawList content.

#### `public void submit(Render sub)`
- Role: Handles the submit path.
- Description: Implements the submit operation.

#### `public void clear(Pipe pipe, FragData buf, FColor val)`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public void clear(Pipe pipe, double val)`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`
- Role: Handles the pget path.
- Description: Implements the pget operation.

#### `public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dst, Consumer<ByteBuffer> callback)`
- Role: Handles the pget path.
- Description: Implements the pget operation.

#### `public void timestamp(Consumer<Long> callback)`
- Role: Handles the timestamp path.
- Description: Implements the timestamp operation.

#### `public void fence(Runnable callback)`
- Role: Handles the fence path.
- Description: Implements the fence operation.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> data)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `private void verify(DrawSlot t)`
- Role: Handles the verify path.
- Description: Implements the verify operation.

#### `private void verify()`
- Role: Handles the verify path.
- Description: Implements the verify operation.

#### `public GLDrawList(GLEnvironment env)`
- Role: Creates a new GLDrawList instance.
- Description: Constructs the GLDrawList instance from the supplied inputs.

#### `public ProgramMismatchException(GLProgram got, GLProgram expected)`
- Role: Handles the program mismatch exception path.
- Description: Implements the program mismatch exception operation.

#### `public void draw(Render r)`
- Role: Draws the current content.
- Description: Draws the GLDrawList content.

#### `public void add(Slot<? extends Rendered> slot)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(Slot<? extends Rendered> slot)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void update(Slot<? extends Rendered> slot)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `private void orderupdate(Pipe group)`
- Role: Handles the orderupdate path.
- Description: Implements the orderupdate operation.

#### `public void update(Pipe group, int[] mask)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `void treedump(java.io.PrintWriter out, DrawSlot slot)`
- Role: Handles the treedump path.
- Description: Implements the treedump operation.

#### `String treedump(DrawSlot root)`
- Role: Handles the treedump path.
- Description: Implements the treedump operation.

#### `String treedump()`
- Role: Handles the treedump path.
- Description: Implements the treedump operation.

#### `public String stats()`
- Role: Handles the stats path.
- Description: Implements the stats operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLDrawList for debugging and logging.

#### `public GLDrawList desc(Object desc)`
- Role: Handles the desc path.
- Description: Implements the desc operation.