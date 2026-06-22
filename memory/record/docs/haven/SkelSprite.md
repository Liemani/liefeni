---
source: [SkelSprite.java](../../../../src/haven/SkelSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# SkelSprite

Represents the skel sprite Haven component.

## Members

### Constants

#### `public static final float ipollen = 0.3f`
- Role: Caches the ipollen value.
- Description: Caches the `ipollen` value for reuse.
- Value: `0.3f`

#### `public static final Factory fact = new Factory()`
- Role: Implements the fact operation.
- Description: Implements the factory operation.
- Value: `new Factory()`

#### `private static final OwnerContext.ClassResolver<SkelSprite> ctxr = new OwnerContext.ClassResolver<SkelSprite>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<skel sprite> ctxr = new owner context.class resolver<skel sprite>() operation.
- Value: `new OwnerContext.ClassResolver<SkelSprite>()`

#### `private static final Map<MeshAnim.Res, MeshAnim.Animation> nomaids = new HashMap<>()`
- Role: Implements the nomaids operation.
- Description: Implements the private static final map<mesh anim.res, mesh anim.animation> nomaids = new hash map<>() operation.
- Value: `new HashMap<>()`

#### `private static final Map<Skeleton.ResPose, PoseMod> initmodids = new HashMap<>()`
- Role: Implements the initmodids operation.
- Description: Implements the private static final map<skeleton.res pose, pose mod> initmodids = new hash map<>() operation.
- Value: `new HashMap<>()`

### Fields

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

#### `public final Skeleton skel`
- Role: Caches the skel value.
- Description: Caches the `skel` value for reuse.

#### `public final Pose pose`
- Role: Caches the pose value.
- Description: Caches the `pose` value for reuse.

#### `public PoseMod[] mods = new PoseMod[0]`
- Role: Caches the mods value.
- Description: Caches the `mods` value for reuse.

#### `public MeshAnim.Animation[] manims = new MeshAnim.Animation[0]`
- Role: Caches the manims value.
- Description: Caches the `manims` value for reuse.

#### `public int curfl`
- Role: Caches the curfl value.
- Description: Caches the `curfl` value for reuse.

#### `protected final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Implements the slots operation.
- Description: Implements the protected final collection<render tree.slot> slots = new array list<>(1) operation.

#### `private Pose oldpose`
- Role: Caches the oldpose value.
- Description: Caches the `oldpose` value for reuse.

#### `private float ipold`
- Role: Caches the ipold value.
- Description: Caches the `ipold` value for reuse.

#### `private boolean stat = true`
- Role: Tracks the stat flag.
- Description: Caches the `stat` value for reuse.

#### `private RenderTree.Node[] parts`
- Role: Caches the parts value.
- Description: Caches the `parts` value for reuse.

#### `private Collection<Runnable> tickparts = Collections.emptyList()`
- Role: Advances the parts state.
- Description: Advances the parts state.

#### `private Collection<Consumer<Render>> gtickparts = Collections.emptyList()`
- Role: Implements the gtickparts operation.
- Description: Implements the empty list operation.

#### `private Map<MeshAnim.Res, MeshAnim.Animation> maids = nomaids`
- Role: Caches the maids value.
- Description: Caches the `maids` value for reuse.

#### `private Map<Skeleton.ResPose, PoseMod> modids = initmodids`
- Role: Caches the modids value.
- Description: Caches the `modids` value for reuse.

### Methods

#### `public SkelSprite(Owner owner, Resource res, int fl)`
- Role: Creates a new SkelSprite instance.
- Description: Constructs the SkelSprite instance from the supplied inputs.

#### `public SkelSprite(Owner owner, Resource res)`
- Role: Creates a new SkelSprite instance.
- Description: Constructs the SkelSprite instance from the supplied inputs.

#### `public SkelSprite(Owner owner, Resource res, Message sdt)`
- Role: Creates a new SkelSprite instance.
- Description: Constructs the SkelSprite instance from the supplied inputs.

#### `private void parts(RenderTree.Slot slot)`
- Role: Handles the parts path.
- Description: Implements the parts operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Returns the loc.

#### `public double getv()`
- Role: Returns the v.
- Description: Returns the v.

#### `protected RenderTree.Node animwrap(Pipe.Op.Wrapping wrap, Collection<Runnable> tbuf, Collection<Consumer<Render>> gbuf)`
- Role: Handles the animwrap path.
- Description: Implements the animwrap operation.

#### `public void iparts(int mask, Collection<RenderTree.Node> rbuf, Collection<Runnable> tbuf, Collection<Consumer<Render>> gbuf)`
- Role: Handles the iparts path.
- Description: Implements the iparts operation.

#### `private void chparts(int mask)`
- Role: Handles the chparts path.
- Description: Implements the chparts operation.

#### `private void rebuild()`
- Role: Handles the rebuild path.
- Description: Implements the rebuild operation.

#### `private void chmanims(int mask)`
- Role: Handles the chmanims path.
- Description: Implements the chmanims operation.

#### `private void chposes(int mask)`
- Role: Changes the active pose set.
- Description: Implements the chposes operation.

#### `public void update(int fl)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void update(Message sdt)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public boolean tick(double ddt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.