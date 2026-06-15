# ModSprite

This file documents the responsibilities and members of `ModSprite`.

## Meta

- Source: [ModSprite.java](../../../src/haven/ModSprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a modified sprite wrapper.

## Nested Types

### $res

- Description: TODO

### Animation

- Description: TODO

### Cons

- Description: TODO

### Meshes

- Description: TODO

### Mod

- Description: TODO

### ModMaker

- Description: TODO

### Part

- Description: TODO

### Poser

- Description: TODO

### RMod

- Description: TODO

### RenderLinks

- Description: TODO

### ResData

- Description: TODO

### SMod

- Description: TODO

### Ticker

- Description: TODO

## Members

### Constants

#### `public static final Collection<RMod> rmods = new ArrayList<>()`

- Description: TODO

#### `private static final ThreadLocal<Cons> curcons = new ThreadLocal<Cons>()`

- Description: TODO

#### `private static final RenderTree.Node[] noparts =`

- Description: TODO

#### `private static final Ticker[] notickers =`

- Description: TODO

#### `private static final EquipTarget[] noeqtgts =`

- Description: TODO

#### `private static final Mod[] nomods =`

- Description: TODO

#### `public static final Factory fact = new Factory()`

- Description: TODO

#### `private static final Map<Resource, ResData> rdcache = new WeakHashMap<>()`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<ModSprite> ctxr = new OwnerContext.ClassResolver<ModSprite>()`

- Description: TODO

#### `public static final float ipollen = 0.3f`

- Description: TODO

#### `private static final Map<Skeleton.ResPose, PoseMod> initids = new HashMap<>()`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<Poser> ctxr = new OwnerContext.ClassResolver<Poser>()`

- Description: TODO

### Fields

#### `public final Gob gob`

- Description: TODO

#### `public int flags = 0`

- Description: TODO

#### `protected final ResData resdata`

- Description: TODO

#### `protected final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`

- Description: TODO

#### `protected ArrayList<Mod> imods = null`

- Description: TODO

#### `protected RenderTree.Node[] parts = noparts`

- Description: TODO

#### `protected Ticker[] tickers = notickers`

- Description: TODO

#### `protected EquipTarget[] eqtgts = noeqtgts`

- Description: TODO

#### `private Mod[] omods = nomods`

- Description: TODO

#### `private int lastupd`

- Description: TODO

#### `public RenderTree.Node obj`

- Description: TODO

#### `public LinkedList<NodeWrap> wraps = new LinkedList<>()`

- Description: TODO

#### `public LinkedList<Pipe.Op> state = new LinkedList<>()`

- Description: TODO

#### `public LinkedList<Supplier<? extends Pipe.Op>> dynstate = new LinkedList<>()`

- Description: TODO

#### `public Collection<Resource.Metadata> info = new ArrayList<>()`

- Description: TODO

#### `public Collection<Mod> mods = new ArrayList<>()`

- Description: TODO

#### `public Collection<Part> parts = new ArrayList<>()`

- Description: TODO

#### `public Collection<Ticker> tickers = new ArrayList<>()`

- Description: TODO

#### `public Collection<EquipTarget> eqtgts = new ArrayList<>()`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `public final Collection<Mod> mods = new ArrayList<>()`

- Description: TODO

#### `public final Collection<SMod> smods = new ArrayList<>()`

- Description: TODO

#### `public final FastMesh.MeshRes[] meshes`

- Description: TODO

#### `public final ModSprite main`

- Description: TODO

#### `public final RenderLink.Res[] rlinks`

- Description: TODO

#### `public final RenderTree.Node[] parts`

- Description: TODO

#### `public final MeshAnim.Res[] descs`

- Description: TODO

#### `public MeshAnim.Animation[] anims =`

- Description: TODO

#### `private Map<MeshAnim.Res, MeshAnim.Animation> ids = Collections.emptyMap()`

- Description: TODO

#### `rigid = new BaseColor(FColor.GREEN),`

- Description: TODO

#### `morphed = new BaseColor(FColor.RED),`

- Description: TODO

#### `unboned = new BaseColor(FColor.YELLOW)`

- Description: TODO

#### `public static boolean bonedb = false`

- Description: TODO

#### `public final ModSprite spr`

- Description: TODO

#### `public final Skeleton skel`

- Description: TODO

#### `public final Pose pose`

- Description: TODO

#### `public final Skeleton.ResPose[] descs`

- Description: TODO

#### `public PoseMod[] mods =`

- Description: TODO

#### `private Map<Skeleton.ResPose, PoseMod> ids = initids`

- Description: TODO

#### `private boolean stat = false`

- Description: TODO

#### `private Pose oldpose`

- Description: TODO

#### `private float ipold`

- Description: TODO

### Methods

#### `public void operate(ModSprite spr)`

- Description: TODO

#### `public void operate(Cons cons)`

- Description: TODO

#### `public default int order()`

- Description: TODO

#### `public default void age()`

- Description: TODO

#### `public default boolean decdata(Message sdt)`

- Description: TODO

#### `public static Mod of(Consumer<Cons> mod, int order)`

- Description: TODO

#### `public default boolean tick(double dt)`

- Description: TODO

#### `public default void gtick(Render g)`

- Description: TODO

#### `public Part(RenderTree.Node obj, NodeWrap... wraps)`

- Description: TODO

#### `public void unwrap()`

- Description: TODO

#### `public RenderTree.Node make()`

- Description: TODO

#### `public Map<?, ?> info()`

- Description: TODO

#### `public ModSprite spr()`

- Description: TODO

#### `public void add(Mod mod)`

- Description: TODO

#### `public void add(Part part)`

- Description: TODO

#### `public void process()`

- Description: TODO

#### `public RenderTree.Node[] parts()`

- Description: TODO

#### `public ResData(Resource res)`

- Description: TODO

#### `public ModMaker()`

- Description: TODO

#### `public void operate(ResData dat)`

- Description: TODO

#### `protected ResData resdata(Resource res)`

- Description: TODO

#### `public static int decflags(Message sdt)`

- Description: TODO

#### `protected void decdata(Message sdt)`

- Description: TODO

#### `protected ModSprite(boolean dummy, Owner owner, Resource res)`

- Description: TODO

#### `public ModSprite(Owner owner, Resource res)`

- Description: TODO

#### `public ModSprite(Owner owner, Resource res, int flags)`

- Description: TODO

#### `public ModSprite(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `protected void init()`

- Description: TODO

#### `public void imod(Mod mod)`

- Description: TODO

#### `public <T> T imod(Class<T> cl)`

- Description: TODO

#### `protected Cons cons()`

- Description: TODO

#### `public static Cons curcons()`

- Description: TODO

#### `protected void modifiers(Cons cons)`

- Description: TODO

#### `protected void update()`

- Description: TODO

#### `public void update(Message sdt)`

- Description: TODO

#### `protected void omods(Collection<Mod> buf, Gob gob)`

- Description: TODO

#### `private Mod[] getomods()`

- Description: TODO

#### `private void attrupdate()`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `private void parts(RenderTree.Slot slot)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Meshes(FastMesh.MeshRes[] meshes)`

- Description: TODO

#### `public void operate(Cons cons)`

- Description: TODO

#### `public void operate(ResData dat)`

- Description: TODO

#### `public RenderLinks(ModSprite spr, RenderLink.Res[] rlinks)`

- Description: TODO

#### `public void operate(Cons cons)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public int order()`

- Description: TODO

#### `public void operate(ResData dat)`

- Description: TODO

#### `public Animation(MeshAnim.Res[] descs)`

- Description: TODO

#### `public void operate(Cons cons)`

- Description: TODO

#### `public boolean tick(double ddt)`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `public int order()`

- Description: TODO

#### `public void operate(ResData dat)`

- Description: TODO

#### `public Poser(ModSprite spr, Skeleton skel, Skeleton.ResPose[] descs)`

- Description: TODO

#### `private void rebuild()`

- Description: TODO

#### `public void operate(Cons cons)`

- Description: TODO

#### `public boolean tick(double ddt)`

- Description: TODO

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Collection<Location.Chain> getloc()`

- Description: TODO

#### `public double getv()`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `public int order()`

- Description: TODO

#### `public void operate(ResData dat)`

- Description: TODO
