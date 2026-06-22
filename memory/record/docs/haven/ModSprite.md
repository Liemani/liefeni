---
source: [ModSprite.java](../../../../src/haven/ModSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# ModSprite

Represents the mod sprite Haven component.

## Nested Types

### $res

- Role: Represents $res within ModSprite.
- Description: Describes the nested $res type used by the enclosing class.

### Animation

- Role: Represents animation within ModSprite.
- Description: Describes the nested animation type used by the enclosing class.

### Cons

- Role: Represents cons within ModSprite.
- Description: Describes the nested cons type used by the enclosing class.

### Meshes

- Role: Represents meshes within ModSprite.
- Description: Describes the nested meshes type used by the enclosing class.

### Mod

- Role: Represents mod within ModSprite.
- Description: Describes the nested mod type used by the enclosing class.

### ModMaker

- Role: Represents mod maker within ModSprite.
- Description: Describes the nested mod maker type used by the enclosing class.

### Part

- Role: Represents part within ModSprite.
- Description: Describes the nested part type used by the enclosing class.

### Poser

- Role: Represents poser within ModSprite.
- Description: Describes the nested poser type used by the enclosing class.

### RMod

- Role: Represents rmod within ModSprite.
- Description: Describes the nested rmod type used by the enclosing class.

### RenderLinks

- Role: Represents render links within ModSprite.
- Description: Describes the nested render links type used by the enclosing class.

### ResData

- Role: Represents res data within ModSprite.
- Description: Describes the nested res data type used by the enclosing class.

### SMod

- Role: Represents smod within ModSprite.
- Description: Describes the nested smod type used by the enclosing class.

### Ticker

- Role: Represents ticker within ModSprite.
- Description: Describes the nested ticker type used by the enclosing class.

## Members

### Constants

#### `public static final Collection<RMod> rmods = new ArrayList<>()`
- Role: Implements the rmods operation.
- Description: Implements the public static final collection<r mod> rmods = new array list<>() operation.
- Value: `new ArrayList<>()`

#### `private static final ThreadLocal<Cons> curcons = new ThreadLocal<Cons>()`
- Role: Implements the curcons operation.
- Description: Implements the private static final thread local<cons> curcons = new thread local<cons>() operation.
- Value: `new ThreadLocal<Cons>()`

#### `private static final RenderTree.Node[] noparts =`
- Role: Caches the noparts value.
- Description: Caches the `noparts` value for reuse.
- Value: ``

#### `private static final Ticker[] notickers =`
- Role: Caches the notickers value.
- Description: Caches the `notickers` value for reuse.
- Value: ``

#### `private static final EquipTarget[] noeqtgts =`
- Role: Caches the noeqtgts value.
- Description: Caches the `noeqtgts` value for reuse.
- Value: ``

#### `private static final Mod[] nomods =`
- Role: Caches the nomods value.
- Description: Caches the `nomods` value for reuse.
- Value: ``

#### `public static final Factory fact = new Factory()`
- Role: Implements the fact operation.
- Description: Implements the factory operation.
- Value: `new Factory()`

#### `private static final Map<Resource, ResData> rdcache = new WeakHashMap<>()`
- Role: Implements the rdcache operation.
- Description: Implements the private static final map<resource, res data> rdcache = new weak hash map<>() operation.
- Value: `new WeakHashMap<>()`

#### `private static final OwnerContext.ClassResolver<ModSprite> ctxr = new OwnerContext.ClassResolver<ModSprite>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<mod sprite> ctxr = new owner context.class resolver<mod sprite>() operation.
- Value: `new OwnerContext.ClassResolver<ModSprite>()`

#### `public static final float ipollen = 0.3f`
- Role: Caches the ipollen value.
- Description: Caches the `ipollen` value for reuse.
- Value: `0.3f`

#### `private static final Map<Skeleton.ResPose, PoseMod> initids = new HashMap<>()`
- Role: Implements the initids operation.
- Description: Implements the private static final map<skeleton.res pose, pose mod> initids = new hash map<>() operation.
- Value: `new HashMap<>()`

#### `private static final OwnerContext.ClassResolver<Poser> ctxr = new OwnerContext.ClassResolver<Poser>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<poser> ctxr = new owner context.class resolver<poser>() operation.
- Value: `new OwnerContext.ClassResolver<Poser>()`

### Fields

#### `public final Gob gob`
- Role: Caches the gob value.
- Description: Caches the `gob` value for reuse.

#### `public int flags = 0`
- Role: Caches the flags value.
- Description: Caches the `flags` value for reuse.

#### `protected final ResData resdata`
- Role: Caches the resdata value.
- Description: Caches the `resdata` value for reuse.

#### `protected final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Implements the slots operation.
- Description: Implements the protected final collection<render tree.slot> slots = new array list<>(1) operation.

#### `protected ArrayList<Mod> imods = null`
- Role: Caches the imods value.
- Description: Caches the `imods` value for reuse.

#### `protected RenderTree.Node[] parts = noparts`
- Role: Caches the parts value.
- Description: Caches the `parts` value for reuse.

#### `protected Ticker[] tickers = notickers`
- Role: Caches the tickers value.
- Description: Caches the `tickers` value for reuse.

#### `protected EquipTarget[] eqtgts = noeqtgts`
- Role: Caches the eqtgts value.
- Description: Caches the `eqtgts` value for reuse.

#### `private Mod[] omods = nomods`
- Role: Caches the omods value.
- Description: Caches the `omods` value for reuse.

#### `private int lastupd`
- Role: Caches the last upd.
- Description: Caches the last upd value.

#### `public RenderTree.Node obj`
- Role: Caches the obj value.
- Description: Caches the `obj` value for reuse.

#### `public LinkedList<NodeWrap> wraps = new LinkedList<>()`
- Role: Implements the wraps operation.
- Description: Implements the public linked list<node wrap> wraps = new linked list<>() operation.

#### `public LinkedList<Pipe.Op> state = new LinkedList<>()`
- Role: Implements the state operation.
- Description: Implements the public linked list<pipe.op> state = new linked list<>() operation.

#### `public LinkedList<Supplier<? extends Pipe.Op>> dynstate = new LinkedList<>()`
- Role: Implements the dynstate operation.
- Description: Implements the public linked list<supplier<? extends pipe.op>> dynstate = new linked list<>() operation.

#### `public Collection<Resource.Metadata> info = new ArrayList<>()`
- Role: Implements the info operation.
- Description: Implements the public collection<resource.metadata> info = new array list<>() operation.

#### `public Collection<Mod> mods = new ArrayList<>()`
- Role: Implements the mods operation.
- Description: Implements the public collection<mod> mods = new array list<>() operation.

#### `public Collection<Part> parts = new ArrayList<>()`
- Role: Implements the parts operation.
- Description: Implements the public collection<part> parts = new array list<>() operation.

#### `public Collection<Ticker> tickers = new ArrayList<>()`
- Role: Advances the ers state.
- Description: Advances the ers state.

#### `public Collection<EquipTarget> eqtgts = new ArrayList<>()`
- Role: Implements the eqtgts operation.
- Description: Implements the public collection<equip target> eqtgts = new array list<>() operation.

#### `public final Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Collection<Mod> mods = new ArrayList<>()`
- Role: Implements the mods operation.
- Description: Implements the public final collection<mod> mods = new array list<>() operation.

#### `public final Collection<SMod> smods = new ArrayList<>()`
- Role: Implements the smods operation.
- Description: Implements the public final collection<s mod> smods = new array list<>() operation.

#### `public final FastMesh.MeshRes[] meshes`
- Role: Caches the meshes value.
- Description: Caches the `meshes` value for reuse.

#### `public final ModSprite main`
- Role: Caches the main value.
- Description: Caches the `main` value for reuse.

#### `public final RenderLink.Res[] rlinks`
- Role: Caches the rlinks value.
- Description: Caches the `rlinks` value for reuse.

#### `public final RenderTree.Node[] parts`
- Role: Caches the parts value.
- Description: Caches the `parts` value for reuse.

#### `public final MeshAnim.Res[] descs`
- Role: Caches the descs value.
- Description: Caches the `descs` value for reuse.

#### `public MeshAnim.Animation[] anims =`
- Role: Caches the anims value.
- Description: Caches the `anims` value for reuse.

#### `private Map<MeshAnim.Res, MeshAnim.Animation> ids = Collections.emptyMap()`
- Role: Implements the ids operation.
- Description: Implements the empty map operation.

#### `rigid = new BaseColor(FColor.GREEN),`
- Role: Implements the rigid operation.
- Description: Implements the base color operation.

#### `morphed = new BaseColor(FColor.RED),`
- Role: Implements the morphed operation.
- Description: Implements the base color operation.

#### `unboned = new BaseColor(FColor.YELLOW)`
- Role: Implements the unboned operation.
- Description: Implements the base color operation.

#### `public static boolean bonedb = false`
- Role: Tracks the bonedb flag.
- Description: Caches the `bonedb` value for reuse.

#### `public final ModSprite spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `public final Skeleton skel`
- Role: Caches the skel value.
- Description: Caches the `skel` value for reuse.

#### `public final Pose pose`
- Role: Caches the pose value.
- Description: Caches the `pose` value for reuse.

#### `public final Skeleton.ResPose[] descs`
- Role: Caches the descs value.
- Description: Caches the `descs` value for reuse.

#### `public PoseMod[] mods =`
- Role: Caches the mods value.
- Description: Caches the `mods` value for reuse.

#### `private Map<Skeleton.ResPose, PoseMod> ids = initids`
- Role: Caches the ids value.
- Description: Caches the `ids` value for reuse.

#### `private boolean stat = false`
- Role: Tracks the stat flag.
- Description: Caches the `stat` value for reuse.

#### `private Pose oldpose`
- Role: Caches the oldpose value.
- Description: Caches the `oldpose` value for reuse.

#### `private float ipold`
- Role: Caches the ipold value.
- Description: Caches the `ipold` value for reuse.

### Methods

#### `public void operate(ModSprite spr)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `public void operate(Cons cons)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `public default int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `public default void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public default boolean decdata(Message sdt)`
- Role: Handles the decdata path.
- Description: Implements the decdata operation.

#### `public static Mod of(Consumer<Cons> mod, int order)`
- Role: Builds a ModSprite value from the supplied components.
- Description: Builds a ModSprite value from the supplied components.

#### `public default boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public default void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Part(RenderTree.Node obj, NodeWrap... wraps)`
- Role: Handles the part path.
- Description: Implements the part operation.

#### `public void unwrap()`
- Role: Handles the unwrap path.
- Description: Implements the unwrap operation.

#### `public RenderTree.Node make()`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public Map<?, ?> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public ModSprite spr()`
- Role: Handles the spr path.
- Description: Implements the spr operation.

#### `public void add(Mod mod)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void add(Part part)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void process()`
- Role: Handles the process path.
- Description: Implements the process operation.

#### `public RenderTree.Node[] parts()`
- Role: Handles the parts path.
- Description: Implements the parts operation.

#### `public ResData(Resource res)`
- Role: Handles the resource data path.
- Description: Implements the res data operation.

#### `public ModMaker()`
- Role: Handles the mod maker path.
- Description: Implements the mod maker operation.

#### `public void operate(ResData dat)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `protected ResData resdata(Resource res)`
- Role: Handles the resdata path.
- Description: Implements the resdata operation.

#### `public static int decflags(Message sdt)`
- Role: Handles the decflags path.
- Description: Implements the decflags operation.

#### `protected void decdata(Message sdt)`
- Role: Handles the decdata path.
- Description: Implements the decdata operation.

#### `protected ModSprite(boolean dummy, Owner owner, Resource res)`
- Role: Creates a new ModSprite instance.
- Description: Constructs the ModSprite instance from the supplied inputs.

#### `public ModSprite(Owner owner, Resource res)`
- Role: Creates a new ModSprite instance.
- Description: Constructs the ModSprite instance from the supplied inputs.

#### `public ModSprite(Owner owner, Resource res, int flags)`
- Role: Creates a new ModSprite instance.
- Description: Constructs the ModSprite instance from the supplied inputs.

#### `public ModSprite(Owner owner, Resource res, Message sdt)`
- Role: Creates a new ModSprite instance.
- Description: Constructs the ModSprite instance from the supplied inputs.

#### `protected void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public void imod(Mod mod)`
- Role: Handles the imod path.
- Description: Implements the imod operation.

#### `public <T> T imod(Class<T> cl)`
- Role: Handles the imod path.
- Description: Implements the imod operation.

#### `protected Cons cons()`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public static Cons curcons()`
- Role: Handles the curcons path.
- Description: Implements the curcons operation.

#### `protected void modifiers(Cons cons)`
- Role: Handles the modifiers path.
- Description: Implements the modifiers operation.

#### `protected void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void update(Message sdt)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `protected void omods(Collection<Mod> buf, Gob gob)`
- Role: Handles the omods path.
- Description: Implements the omods operation.

#### `private Mod[] getomods()`
- Role: Handles the getomods path.
- Description: Returns the omods.

#### `private void attrupdate()`
- Role: Handles the attrupdate path.
- Description: Implements the attrupdate operation.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `private void parts(RenderTree.Slot slot)`
- Role: Handles the parts path.
- Description: Implements the parts operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this ModSprite for debugging and logging.

#### `public Meshes(FastMesh.MeshRes[] meshes)`
- Role: Handles the meshes path.
- Description: Implements the meshes operation.

#### `public void operate(Cons cons)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `public void operate(ResData dat)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `public RenderLinks(ModSprite spr, RenderLink.Res[] rlinks)`
- Role: Handles the render links path.
- Description: Implements the render links operation.

#### `public void operate(Cons cons)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `public void operate(ResData dat)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `public Animation(MeshAnim.Res[] descs)`
- Role: Handles the animation path.
- Description: Implements the animation operation.

#### `public void operate(Cons cons)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `public boolean tick(double ddt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `public void operate(ResData dat)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `public Poser(ModSprite spr, Skeleton skel, Skeleton.ResPose[] descs)`
- Role: Handles the poser path.
- Description: Implements the poser operation.

#### `private void rebuild()`
- Role: Handles the rebuild path.
- Description: Implements the rebuild operation.

#### `public void operate(Cons cons)`
- Role: Handles the operate path.
- Description: Implements the operate operation.

#### `public boolean tick(double ddt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Returns the loc.

#### `public double getv()`
- Role: Returns the v.
- Description: Returns the v.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `public void operate(ResData dat)`
- Role: Handles the operate path.
- Description: Implements the operate operation.