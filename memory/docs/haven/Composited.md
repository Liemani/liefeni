# Composited

This file documents the responsibilities and members of `Composited`.

## Meta

- Source: [Composited.java](../../../src/haven/Composited.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles composited render state and clicks.

## Nested Types

### CompositeClick

- Description: TODO

### Desc

- Description: TODO

### ED

- Description: TODO

### Equipped

- Description: TODO

### Layer

- Description: TODO

### MD

- Description: TODO

### ModOrder

- Description: TODO

### Model

- Description: TODO

### Poses

- Description: TODO

## Members

### Constants

#### `private static final Comparator<ModOrder> cmp = new Comparator<ModOrder>()`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<Equipped> eqctxr = new OwnerContext.ClassResolver<Equipped>()`

- Description: TODO

#### `public static final Pipe.Op prep = p ->`

- Description: TODO

### Fields

#### `public final Skeleton skel`

- Description: TODO

#### `public final Pose pose`

- Description: TODO

#### `public final OwnerContext eqowner`

- Description: TODO

#### `public Collection<Model> mod = new ArrayList<Model>()`

- Description: TODO

#### `public Collection<Equipped> equ = new ArrayList<Equipped>()`

- Description: TODO

#### `public Poses poses = new Poses()`

- Description: TODO

#### `public List<MD> cmod = new LinkedList<MD>()`

- Description: TODO

#### `public List<ED> cequ = new LinkedList<ED>()`

- Description: TODO

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`

- Description: TODO

#### `public final PoseMod[] mods`

- Description: TODO

#### `Pose old`

- Description: TODO

#### `float ipold = 0.0f, ipol = 0.0f`

- Description: TODO

#### `float ipold = 0.0f, ipol = 0.0f`

- Description: TODO

#### `public float limit = -1.0f`

- Description: TODO

#### `public boolean stat, ldone`

- Description: TODO

#### `public boolean stat, ldone`

- Description: TODO

#### `private Random srnd = new Random()`

- Description: TODO

#### `private float rsmod = (srnd.nextFloat() * 0.1f) + 0.95f`

- Description: TODO

#### `public final int z1, z2`

- Description: TODO

#### `public final int z1, z2`

- Description: TODO

#### `public final FastMesh m`

- Description: TODO

#### `public final PoseMorph morph`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`

- Description: TODO

#### `private int z = 0, lz = 0`

- Description: TODO

#### `private int z = 0, lz = 0`

- Description: TODO

#### `public final Material mat`

- Description: TODO

#### `public final ModOrder order`

- Description: TODO

#### `public final List<Layer> lay = new ArrayList<Layer>()`

- Description: TODO

#### `public final Sprite spr`

- Description: TODO

#### `private final RUtils.StateNode<Sprite> n`

- Description: TODO

#### `public final ED desc`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public Indir<Resource> mod`

- Description: TODO

#### `public List<ResData> tex`

- Description: TODO

#### `public int id = -1`

- Description: TODO

#### `private Model real`

- Description: TODO

#### `public int t, id = -1`

- Description: TODO

#### `public int t, id = -1`

- Description: TODO

#### `public String at`

- Description: TODO

#### `public ResData res`

- Description: TODO

#### `public Coord3f off`

- Description: TODO

#### `private Equipped real`

- Description: TODO

#### `public Indir<Resource> base`

- Description: TODO

#### `public List<MD> mod = new ArrayList<>()`

- Description: TODO

#### `public List<ED> equ = new ArrayList<>()`

- Description: TODO

#### `private final Material.Owner matowner = new Material.Owner()`

- Description: TODO

#### `public final Gob.GobClick gi`

- Description: TODO

### Methods

#### `public Poses()`

- Description: TODO

#### `public Poses(List<? extends PoseMod> mods)`

- Description: TODO

#### `private void rebuild()`

- Description: TODO

#### `public void set(float ipol)`

- Description: TODO

#### `public void tick(float dt)`

- Description: TODO

#### `protected void done()`

- Description: TODO

#### `public Composited(Skeleton skel, OwnerContext eqowner)`

- Description: TODO

#### `public Composited(Skeleton skel)`

- Description: TODO

#### `public ModOrder(int z1, int z2)`

- Description: TODO

#### `public int mainorder()`

- Description: TODO

#### `public Comparator<ModOrder> comparator()`

- Description: TODO

#### `private Layer(Material mat, int z1, int z2)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `private Model(FastMesh m, int id)`

- Description: TODO

#### `private void addlay(Material mat)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public TickList.Ticking ticker()`

- Description: TODO

#### `public void autotick(double dt)`

- Description: TODO

#### `private Equipped(ED ed)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public Composited comp()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public MD(Indir<Resource> mod, List<ResData> tex)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public MD clone()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public ED(int t, String at, ResData res, Coord3f off)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public boolean equals2(Object o)`

- Description: TODO

#### `public ED clone()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Desc()`

- Description: TODO

#### `public Desc(Indir<Resource> base)`

- Description: TODO

#### `public static Desc decode(Resource.Resolver sess, Object[] args)`

- Description: TODO

#### `public Desc clone()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private Collection<Model> nmod(Collection<MD> nmod)`

- Description: TODO

#### `private Collection<Equipped> nequ(List<ED> nequ)`

- Description: TODO

#### `public CompositeClick(Gob.GobClick gi)`

- Description: TODO

#### `public Object[] clickargs(ClickData cd)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private void parts(RenderTree.Slot slot)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public void chmod(List<MD> mod)`

- Description: TODO

#### `public void chequ(List<ED> equ)`

- Description: TODO
