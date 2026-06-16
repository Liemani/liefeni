# Composited

This file documents the responsibilities and members of `Composited`.

## Meta

- Source: [Composited.java](../../../src/haven/Composited.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Role: Defines the shared cmp constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<Equipped> eqctxr = new OwnerContext.ClassResolver<Equipped>()`
- Role: Defines the shared eqctxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pipe.Op prep = p ->`
- Role: Defines the shared prep constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Skeleton skel`
- Role: Holds the skel state.
- Description: Backs the cached state for this file.

#### `public final Pose pose`
- Role: Holds the pose state.
- Description: Backs the cached state for this file.

#### `public final OwnerContext eqowner`
- Role: Stores the eqowner value.
- Description: Backs the cached state for this file.

#### `public Collection<Model> mod = new ArrayList<Model>()`
- Role: Caches mod entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Collection<Equipped> equ = new ArrayList<Equipped>()`
- Role: Caches equ entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Poses poses = new Poses()`
- Role: Holds the poses state.
- Description: Backs the cached state for this file.

#### `public List<MD> cmod = new LinkedList<MD>()`
- Role: Caches cmod entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<ED> cequ = new LinkedList<ED>()`
- Role: Caches cequ entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final PoseMod[] mods`
- Role: Holds the mods state.
- Description: Backs the cached state for this file.

#### `Pose old`
- Role: Holds the old state.
- Description: Backs the cached state for this file.

#### `float ipold = 0.0f, ipol = 0.0f`
- Role: Stores the ipold value.
- Description: Backs the cached state for this file.

#### `float ipold = 0.0f, ipol = 0.0f`
- Role: Stores the ipold value.
- Description: Backs the cached state for this file.

#### `public float limit = -1.0f`
- Role: Stores the limit value.
- Description: Backs the cached state for this file.

#### `public boolean stat, ldone`
- Role: Tracks the ldone flag.
- Description: Supports the ldone operation used by the surrounding class.

#### `public boolean stat, ldone`
- Role: Tracks the ldone flag.
- Description: Supports the ldone operation used by the surrounding class.

#### `private Random srnd = new Random()`
- Role: Holds the srnd state.
- Description: Backs the cached state for this file.

#### `private float rsmod = (srnd.nextFloat() * 0.1f) + 0.95f`
- Role: Stores the rsmod value.
- Description: Backs the cached state for this file.

#### `public final int z1, z2`
- Role: Stores the z2 value.
- Description: Backs the cached state for this file.

#### `public final int z1, z2`
- Role: Stores the z2 value.
- Description: Backs the cached state for this file.

#### `public final FastMesh m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `public final PoseMorph morph`
- Role: Holds the morph state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int z = 0, lz = 0`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `private int z = 0, lz = 0`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public final Material mat`
- Role: Holds the mat state.
- Description: Backs the cached state for this file.

#### `public final ModOrder order`
- Role: Holds the order state.
- Description: Backs the cached state for this file.

#### `public final List<Layer> lay = new ArrayList<Layer>()`
- Role: Caches lay entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Sprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `private final RUtils.StateNode<Sprite> n`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `public final ED desc`
- Role: Holds the desc state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> mod`
- Role: Stores the mod value.
- Description: Backs the cached state for this file.

#### `public List<ResData> tex`
- Role: Caches tex entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int id = -1`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private Model real`
- Role: Holds the real state.
- Description: Backs the cached state for this file.

#### `public int t, id = -1`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public int t, id = -1`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public String at`
- Role: Stores the at value.
- Description: Backs the cached state for this file.

#### `public ResData res`
- Role: Holds the res state.
- Description: Backs the cached state for this file.

#### `public Coord3f off`
- Role: Stores the off value.
- Description: Backs the cached state for this file.

#### `private Equipped real`
- Role: Stores the real value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `public List<MD> mod = new ArrayList<>()`
- Role: Caches mod entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<ED> equ = new ArrayList<>()`
- Role: Caches equ entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Material.Owner matowner = new Material.Owner()`
- Role: Holds the matowner state.
- Description: Backs the cached state for this file.

#### `public final Gob.GobClick gi`
- Role: Stores the gi value.
- Description: Backs the cached state for this file.

### Methods

#### `public Poses()`
- Role: Performs poses.
- Description: Supports the poses operation used by the surrounding class.

#### `public Poses(List<? extends PoseMod> mods)`
- Role: Performs poses.
- Description: Supports the poses operation used by the surrounding class.

#### `private void rebuild()`
- Role: Performs rebuild.
- Description: Supports the rebuild operation used by the surrounding class.

#### `public void set(float ipol)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void tick(float dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `protected void done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public Composited(Skeleton skel, OwnerContext eqowner)`
- Role: Creates a new Composited instance.
- Description: Constructs the instance and initializes its default state.

#### `public Composited(Skeleton skel)`
- Role: Creates a new Composited instance.
- Description: Constructs the instance and initializes its default state.

#### `public ModOrder(int z1, int z2)`
- Role: Performs mod order.
- Description: Supports the mod order operation used by the surrounding class.

#### `public int mainorder()`
- Role: Performs mainorder.
- Description: Supports the mainorder operation used by the surrounding class.

#### `public Comparator<ModOrder> comparator()`
- Role: Performs comparator.
- Description: Supports the comparator operation used by the surrounding class.

#### `private Layer(Material mat, int z1, int z2)`
- Role: Performs layer.
- Description: Supports the layer operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `private Model(FastMesh m, int id)`
- Role: Performs model.
- Description: Supports the model operation used by the surrounding class.

#### `private void addlay(Material mat)`
- Role: Performs addlay.
- Description: Supports the addlay operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public TickList.Ticking ticker()`
- Role: Performs ticker.
- Description: Supports the ticker operation used by the surrounding class.

#### `public void autotick(double dt)`
- Role: Performs autotick.
- Description: Supports the autotick operation used by the surrounding class.

#### `private Equipped(ED ed)`
- Role: Performs equipped.
- Description: Supports the equipped operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Composited comp()`
- Role: Performs comp.
- Description: Supports the comp operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public MD(Indir<Resource> mod, List<ResData> tex)`
- Role: Performs md.
- Description: Supports the md operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public MD clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public ED(int t, String at, ResData res, Coord3f off)`
- Role: Performs ed.
- Description: Supports the ed operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals2(Object o)`
- Role: Performs equals2.
- Description: Supports the equals2 operation used by the surrounding class.

#### `public ED clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public Desc(Indir<Resource> base)`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public static Desc decode(Resource.Resolver sess, Object[] args)`
- Role: Performs decode.
- Description: Supports the decode operation used by the surrounding class.

#### `public Desc clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private Collection<Model> nmod(Collection<MD> nmod)`
- Role: Performs nmod.
- Description: Supports the nmod operation used by the surrounding class.

#### `private Collection<Equipped> nequ(List<ED> nequ)`
- Role: Performs nequ.
- Description: Supports the nequ operation used by the surrounding class.

#### `public CompositeClick(Gob.GobClick gi)`
- Role: Performs composite click.
- Description: Supports the composite click operation used by the surrounding class.

#### `public Object[] clickargs(ClickData cd)`
- Role: Performs clickargs.
- Description: Supports the clickargs operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private void parts(RenderTree.Slot slot)`
- Role: Performs parts.
- Description: Supports the parts operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void chmod(List<MD> mod)`
- Role: Performs chmod.
- Description: Supports the chmod operation used by the surrounding class.

#### `public void chequ(List<ED> equ)`
- Role: Performs chequ.
- Description: Supports the chequ operation used by the surrounding class.
