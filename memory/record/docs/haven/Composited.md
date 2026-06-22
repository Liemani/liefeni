---
source: [Composited.java](../../../../src/haven/Composited.java)
created: 2026-06-13
updated: 2026-06-14
---

# Composited

Represents the composited Haven component.

## Nested Types

### CompositeClick

- Role: Represents composite click within Composited.
- Description: Describes the nested composite click type used by the enclosing class.

### Desc

- Role: Represents desc within Composited.
- Description: Describes the nested desc type used by the enclosing class.

### ED

- Role: Represents ed within Composited.
- Description: Describes the nested ed type used by the enclosing class.

### Equipped

- Role: Represents equipped within Composited.
- Description: Describes the nested equipped type used by the enclosing class.

### Layer

- Role: Represents layer within Composited.
- Description: Describes the nested layer type used by the enclosing class.

### MD

- Role: Represents md within Composited.
- Description: Describes the nested md type used by the enclosing class.

### ModOrder

- Role: Represents mod order within Composited.
- Description: Describes the nested mod order type used by the enclosing class.

### Model

- Role: Represents model within Composited.
- Description: Describes the nested model type used by the enclosing class.

### Poses

- Role: Represents poses within Composited.
- Description: Describes the nested poses type used by the enclosing class.

## Members

### Constants

#### `private static final Comparator<ModOrder> cmp = new Comparator<ModOrder>()`
- Role: Implements the cmp operation.
- Description: Implements the private static final comparator<mod order> cmp = new comparator<mod order>() operation.
- Value: `new Comparator<ModOrder>()`

#### `private static final OwnerContext.ClassResolver<Equipped> eqctxr = new OwnerContext.ClassResolver<Equipped>()`
- Role: Implements the eqctxr operation.
- Description: Implements the private static final owner context.class resolver<equipped> eqctxr = new owner context.class resolver<equipped>() operation.
- Value: `new OwnerContext.ClassResolver<Equipped>()`

#### `public static final Pipe.Op prep = p ->`
- Role: Caches the prep value.
- Description: Caches the `prep` value for reuse.
- Value: `p ->`

### Fields

#### `public final Skeleton skel`
- Role: Caches the skel value.
- Description: Caches the `skel` value for reuse.

#### `public final Pose pose`
- Role: Caches the pose value.
- Description: Caches the `pose` value for reuse.

#### `public final OwnerContext eqowner`
- Role: Caches the eqowner value.
- Description: Caches the `eqowner` value for reuse.

#### `public Collection<Model> mod = new ArrayList<Model>()`
- Role: Implements the mod operation.
- Description: Implements the public collection<model> mod = new array list<model>() operation.

#### `public Collection<Equipped> equ = new ArrayList<Equipped>()`
- Role: Implements the equ operation.
- Description: Implements the public collection<equipped> equ = new array list<equipped>() operation.

#### `public Poses poses = new Poses()`
- Role: Implements the poses operation.
- Description: Implements the poses operation.

#### `public List<MD> cmod = new LinkedList<MD>()`
- Role: Implements the cmod operation.
- Description: Implements the public list<md> cmod = new linked list<md>() operation.

#### `public List<ED> cequ = new LinkedList<ED>()`
- Role: Implements the cequ operation.
- Description: Implements the public list<ed> cequ = new linked list<ed>() operation.

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Implements the slots operation.
- Description: Implements the private final collection<render tree.slot> slots = new array list<>(1) operation.

#### `public final PoseMod[] mods`
- Role: Caches the mods value.
- Description: Caches the `mods` value for reuse.

#### `Pose old`
- Role: Caches the old value.
- Description: Caches the `old` value for reuse.

#### `float ipold = 0.0f, ipol = 0.0f`
- Role: Caches the ipold value.
- Description: Caches the `ipold` value for reuse.

#### `float ipold = 0.0f, ipol = 0.0f`
- Role: Caches the ipold value.
- Description: Caches the `ipold` value for reuse.

#### `public float limit = -1.0f`
- Role: Caches the limit value.
- Description: Caches the `limit` value for reuse.

#### `public boolean stat, ldone`
- Role: Tracks the ldone flag.
- Description: Caches the `ldone` value for reuse.

#### `public boolean stat, ldone`
- Role: Tracks the ldone flag.
- Description: Caches the `ldone` value for reuse.

#### `private Random srnd = new Random()`
- Role: Implements the srnd operation.
- Description: Implements the random operation.

#### `private float rsmod = (srnd.nextFloat() * 0.1f) + 0.95f`
- Role: Implements the rsmod operation.
- Description: Implements the next float operation.

#### `public final int z1, z2`
- Role: Caches the z2 value.
- Description: Caches the `z2` value for reuse.

#### `public final int z1, z2`
- Role: Caches the z2 value.
- Description: Caches the `z2` value for reuse.

#### `public final FastMesh m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

#### `public final PoseMorph morph`
- Role: Caches the morph value.
- Description: Caches the `morph` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Implements the slots operation.
- Description: Implements the private final collection<render tree.slot> slots = new array list<>(1) operation.

#### `private int z = 0, lz = 0`
- Role: Caches the z value.
- Description: Caches the `z` value for reuse.

#### `private int z = 0, lz = 0`
- Role: Caches the z value.
- Description: Caches the `z` value for reuse.

#### `public final Material mat`
- Role: Caches the mat value.
- Description: Caches the `mat` value for reuse.

#### `public final ModOrder order`
- Role: Caches the order value.
- Description: Caches the `order` value for reuse.

#### `public final List<Layer> lay = new ArrayList<Layer>()`
- Role: Implements the lay operation.
- Description: Implements the public final list<layer> lay = new array list<layer>() operation.

#### `public final Sprite spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `private final RUtils.StateNode<Sprite> n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `public final ED desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public Indir<Resource> mod`
- Role: Caches the mod value.
- Description: Caches the `mod` value for reuse.

#### `public List<ResData> tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public int id = -1`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private Model real`
- Role: Caches the real value.
- Description: Caches the `real` value for reuse.

#### `public int t, id = -1`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public int t, id = -1`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public String at`
- Role: Caches the at value.
- Description: Caches the `at` value for reuse.

#### `public ResData res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public Coord3f off`
- Role: Caches the off value.
- Description: Caches the `off` value for reuse.

#### `private Equipped real`
- Role: Caches the real value.
- Description: Caches the `real` value for reuse.

#### `public Indir<Resource> base`
- Role: Caches the base value.
- Description: Caches the `base` value for reuse.

#### `public List<MD> mod = new ArrayList<>()`
- Role: Implements the mod operation.
- Description: Implements the public list<md> mod = new array list<>() operation.

#### `public List<ED> equ = new ArrayList<>()`
- Role: Implements the equ operation.
- Description: Implements the public list<ed> equ = new array list<>() operation.

#### `private final Material.Owner matowner = new Material.Owner()`
- Role: Implements the matowner operation.
- Description: Implements the owner operation.

#### `public final Gob.GobClick gi`
- Role: Caches the gi value.
- Description: Caches the `gi` value for reuse.

### Methods

#### `public Poses()`
- Role: Handles the poses path.
- Description: Implements the poses operation.

#### `public Poses(List<? extends PoseMod> mods)`
- Role: Handles the poses path.
- Description: Implements the poses operation.

#### `private void rebuild()`
- Role: Handles the rebuild path.
- Description: Implements the rebuild operation.

#### `public void set(float ipol)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void tick(float dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `protected void done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public Composited(Skeleton skel, OwnerContext eqowner)`
- Role: Creates a new Composited instance.
- Description: Constructs the Composited instance from the supplied inputs.

#### `public Composited(Skeleton skel)`
- Role: Creates a new Composited instance.
- Description: Constructs the Composited instance from the supplied inputs.

#### `public ModOrder(int z1, int z2)`
- Role: Handles the mod order path.
- Description: Implements the mod order operation.

#### `public int mainorder()`
- Role: Handles the mainorder path.
- Description: Implements the mainorder operation.

#### `public Comparator<ModOrder> comparator()`
- Role: Handles the comparator path.
- Description: Implements the comparator operation.

#### `private Layer(Material mat, int z1, int z2)`
- Role: Handles the layer path.
- Description: Implements the layer operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `private Model(FastMesh m, int id)`
- Role: Handles the model path.
- Description: Implements the model operation.

#### `private void addlay(Material mat)`
- Role: Handles the addlay path.
- Description: Adds the lay.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public TickList.Ticking ticker()`
- Role: Handles the ticker path.
- Description: Advances the er state.

#### `public void autotick(double dt)`
- Role: Handles the autotick path.
- Description: Implements the autotick operation.

#### `private Equipped(ED ed)`
- Role: Handles the equipped path.
- Description: Implements the equipped operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Composited comp()`
- Role: Handles the comp path.
- Description: Implements the comp operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Composited for debugging and logging.

#### `public MD(Indir<Resource> mod, List<ResData> tex)`
- Role: Handles the md path.
- Description: Implements the md operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public MD clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Composited for debugging and logging.

#### `public ED(int t, String at, ResData res, Coord3f off)`
- Role: Handles the ed path.
- Description: Implements the ed operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals2(Object o)`
- Role: Handles the equals2 path.
- Description: Implements the equals2 operation.

#### `public ED clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Composited for debugging and logging.

#### `public Desc()`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public Desc(Indir<Resource> base)`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public static Desc decode(Resource.Resolver sess, Object[] args)`
- Role: Handles the decode path.
- Description: Implements the decode operation.

#### `public Desc clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Composited for debugging and logging.

#### `private Collection<Model> nmod(Collection<MD> nmod)`
- Role: Handles the nmod path.
- Description: Implements the nmod operation.

#### `private Collection<Equipped> nequ(List<ED> nequ)`
- Role: Handles the nequ path.
- Description: Implements the nequ operation.

#### `public CompositeClick(Gob.GobClick gi)`
- Role: Handles the composite click path.
- Description: Implements the composite click operation.

#### `public Object[] clickargs(ClickData cd)`
- Role: Handles the clickargs path.
- Description: Handles args interaction.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Composited for debugging and logging.

#### `private void parts(RenderTree.Slot slot)`
- Role: Handles the parts path.
- Description: Implements the parts operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Composited content.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void chmod(List<MD> mod)`
- Role: Handles the chmod path.
- Description: Implements the chmod operation.

#### `public void chequ(List<ED> equ)`
- Role: Handles the chequ path.
- Description: Implements the chequ operation.