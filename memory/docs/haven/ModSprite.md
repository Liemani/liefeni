# ModSprite

This file documents the responsibilities and members of `ModSprite`.

## Meta

- Source: [ModSprite.java](../../../src/haven/ModSprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Role: Defines the shared rmods constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ThreadLocal<Cons> curcons = new ThreadLocal<Cons>()`
- Role: Defines the shared curcons constant.
- Description: Shared constant used by the rest of the class.

#### `private static final RenderTree.Node[] noparts =`
- Role: Defines the shared mod sprite constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Ticker[] notickers =`
- Role: Defines the shared mod sprite constant.
- Description: Shared constant used by the rest of the class.

#### `private static final EquipTarget[] noeqtgts =`
- Role: Defines the shared mod sprite constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Mod[] nomods =`
- Role: Defines the shared mod sprite constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Factory fact = new Factory()`
- Role: Defines the shared fact constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Resource, ResData> rdcache = new WeakHashMap<>()`
- Role: Defines the shared rdcache constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<ModSprite> ctxr = new OwnerContext.ClassResolver<ModSprite>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final float ipollen = 0.3f`
- Role: Defines the shared ipollen constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Skeleton.ResPose, PoseMod> initids = new HashMap<>()`
- Role: Defines the shared initids constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<Poser> ctxr = new OwnerContext.ClassResolver<Poser>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Gob gob`
- Role: Stores the gob value.
- Description: Backs the cached state for this file.

#### `public int flags = 0`
- Role: Stores the flags value.
- Description: Backs the cached state for this file.

#### `protected final ResData resdata`
- Role: Holds the resdata state.
- Description: Backs the cached state for this file.

#### `protected final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected ArrayList<Mod> imods = null`
- Role: Caches imods entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected RenderTree.Node[] parts = noparts`
- Role: Stores the parts value.
- Description: Backs the cached state for this file.

#### `protected Ticker[] tickers = notickers`
- Role: Holds the tickers state.
- Description: Backs the cached state for this file.

#### `protected EquipTarget[] eqtgts = noeqtgts`
- Role: Stores the eqtgts value.
- Description: Backs the cached state for this file.

#### `private Mod[] omods = nomods`
- Role: Holds the omods state.
- Description: Backs the cached state for this file.

#### `private int lastupd`
- Role: Stores the lastupd value.
- Description: Backs the cached state for this file.

#### `public RenderTree.Node obj`
- Role: Stores the obj value.
- Description: Backs the cached state for this file.

#### `public LinkedList<NodeWrap> wraps = new LinkedList<>()`
- Role: Caches wraps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public LinkedList<Pipe.Op> state = new LinkedList<>()`
- Role: Caches state entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public LinkedList<Supplier<? extends Pipe.Op>> dynstate = new LinkedList<>()`
- Role: Caches dynstate entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Collection<Resource.Metadata> info = new ArrayList<>()`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Collection<Mod> mods = new ArrayList<>()`
- Role: Caches mods entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Collection<Part> parts = new ArrayList<>()`
- Role: Caches parts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Collection<Ticker> tickers = new ArrayList<>()`
- Role: Caches tickers entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Collection<EquipTarget> eqtgts = new ArrayList<>()`
- Role: Caches eqtgts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Collection<Mod> mods = new ArrayList<>()`
- Role: Caches mods entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<SMod> smods = new ArrayList<>()`
- Role: Caches smods entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final FastMesh.MeshRes[] meshes`
- Role: Holds the meshes state.
- Description: Backs the cached state for this file.

#### `public final ModSprite main`
- Role: Holds the main state.
- Description: Backs the cached state for this file.

#### `public final RenderLink.Res[] rlinks`
- Role: Holds the rlinks state.
- Description: Backs the cached state for this file.

#### `public final RenderTree.Node[] parts`
- Role: Stores the parts value.
- Description: Backs the cached state for this file.

#### `public final MeshAnim.Res[] descs`
- Role: Holds the descs state.
- Description: Backs the cached state for this file.

#### `public MeshAnim.Animation[] anims =`
- Role: Holds the mod sprite state.
- Description: Backs the cached state for this file.

#### `private Map<MeshAnim.Res, MeshAnim.Animation> ids = Collections.emptyMap()`
- Role: Caches ids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `rigid = new BaseColor(FColor.GREEN),`
- Role: Holds the base color state.
- Description: Backs the cached state for this file.

#### `morphed = new BaseColor(FColor.RED),`
- Role: Holds the base color state.
- Description: Backs the cached state for this file.

#### `unboned = new BaseColor(FColor.YELLOW)`
- Role: Holds the base color state.
- Description: Backs the cached state for this file.

#### `public static boolean bonedb = false`
- Role: Tracks the bonedb flag.
- Description: Supports the bonedb operation used by the surrounding class.

#### `public final ModSprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `public final Skeleton skel`
- Role: Holds the skel state.
- Description: Backs the cached state for this file.

#### `public final Pose pose`
- Role: Holds the pose state.
- Description: Backs the cached state for this file.

#### `public final Skeleton.ResPose[] descs`
- Role: Holds the descs state.
- Description: Backs the cached state for this file.

#### `public PoseMod[] mods =`
- Role: Holds the mod sprite state.
- Description: Backs the cached state for this file.

#### `private Map<Skeleton.ResPose, PoseMod> ids = initids`
- Role: Caches ids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean stat = false`
- Role: Tracks the stat flag.
- Description: Supports the stat operation used by the surrounding class.

#### `private Pose oldpose`
- Role: Holds the oldpose state.
- Description: Backs the cached state for this file.

#### `private float ipold`
- Role: Stores the ipold value.
- Description: Backs the cached state for this file.

### Methods

#### `public void operate(ModSprite spr)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `public void operate(Cons cons)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `public default int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public default void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public default boolean decdata(Message sdt)`
- Role: Performs decdata.
- Description: Supports the decdata operation used by the surrounding class.

#### `public static Mod of(Consumer<Cons> mod, int order)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public default boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public default void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Part(RenderTree.Node obj, NodeWrap... wraps)`
- Role: Performs part.
- Description: Supports the part operation used by the surrounding class.

#### `public void unwrap()`
- Role: Performs unwrap.
- Description: Supports the unwrap operation used by the surrounding class.

#### `public RenderTree.Node make()`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public Map<?, ?> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public ModSprite spr()`
- Role: Performs spr.
- Description: Supports the spr operation used by the surrounding class.

#### `public void add(Mod mod)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void add(Part part)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void process()`
- Role: Performs process.
- Description: Supports the process operation used by the surrounding class.

#### `public RenderTree.Node[] parts()`
- Role: Performs parts.
- Description: Supports the parts operation used by the surrounding class.

#### `public ResData(Resource res)`
- Role: Performs res data.
- Description: Supports the res data operation used by the surrounding class.

#### `public ModMaker()`
- Role: Performs mod maker.
- Description: Supports the mod maker operation used by the surrounding class.

#### `public void operate(ResData dat)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `protected ResData resdata(Resource res)`
- Role: Performs resdata.
- Description: Supports the resdata operation used by the surrounding class.

#### `public static int decflags(Message sdt)`
- Role: Performs decflags.
- Description: Supports the decflags operation used by the surrounding class.

#### `protected void decdata(Message sdt)`
- Role: Performs decdata.
- Description: Supports the decdata operation used by the surrounding class.

#### `protected ModSprite(boolean dummy, Owner owner, Resource res)`
- Role: Creates a new ModSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public ModSprite(Owner owner, Resource res)`
- Role: Creates a new ModSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public ModSprite(Owner owner, Resource res, int flags)`
- Role: Creates a new ModSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public ModSprite(Owner owner, Resource res, Message sdt)`
- Role: Creates a new ModSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public void imod(Mod mod)`
- Role: Performs imod.
- Description: Supports the imod operation used by the surrounding class.

#### `public <T> T imod(Class<T> cl)`
- Role: Performs imod.
- Description: Supports the imod operation used by the surrounding class.

#### `protected Cons cons()`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public static Cons curcons()`
- Role: Performs curcons.
- Description: Supports the curcons operation used by the surrounding class.

#### `protected void modifiers(Cons cons)`
- Role: Performs modifiers.
- Description: Supports the modifiers operation used by the surrounding class.

#### `protected void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void update(Message sdt)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `protected void omods(Collection<Mod> buf, Gob gob)`
- Role: Performs omods.
- Description: Supports the omods operation used by the surrounding class.

#### `private Mod[] getomods()`
- Role: Performs getomods.
- Description: Supports the getomods operation used by the surrounding class.

#### `private void attrupdate()`
- Role: Performs attrupdate.
- Description: Supports the attrupdate operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `private void parts(RenderTree.Slot slot)`
- Role: Performs parts.
- Description: Supports the parts operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Meshes(FastMesh.MeshRes[] meshes)`
- Role: Performs meshes.
- Description: Supports the meshes operation used by the surrounding class.

#### `public void operate(Cons cons)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `public void operate(ResData dat)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `public RenderLinks(ModSprite spr, RenderLink.Res[] rlinks)`
- Role: Performs render links.
- Description: Supports the render links operation used by the surrounding class.

#### `public void operate(Cons cons)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public void operate(ResData dat)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `public Animation(MeshAnim.Res[] descs)`
- Role: Performs animation.
- Description: Supports the animation operation used by the surrounding class.

#### `public void operate(Cons cons)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `public boolean tick(double ddt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public void operate(ResData dat)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `public Poser(ModSprite spr, Skeleton skel, Skeleton.ResPose[] descs)`
- Role: Performs poser.
- Description: Supports the poser operation used by the surrounding class.

#### `private void rebuild()`
- Role: Performs rebuild.
- Description: Supports the rebuild operation used by the surrounding class.

#### `public void operate(Cons cons)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.

#### `public boolean tick(double ddt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Exposes the requested value without mutating state.

#### `public double getv()`
- Role: Returns the avatar value.
- Description: Exposes the requested value without mutating state.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public void operate(ResData dat)`
- Role: Performs operate.
- Description: Supports the operate operation used by the surrounding class.
