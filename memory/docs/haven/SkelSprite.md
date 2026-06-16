# SkelSprite

This file documents the responsibilities and members of `SkelSprite`.

## Meta

- Source: [SkelSprite.java](../../../src/haven/SkelSprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the skel sprite Haven component.

## Members

### Constants

#### `public static final float ipollen = 0.3f`
- Role: Defines the shared ipollen constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Factory fact = new Factory()`
- Role: Defines the shared fact constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<SkelSprite> ctxr = new OwnerContext.ClassResolver<SkelSprite>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<MeshAnim.Res, MeshAnim.Animation> nomaids = new HashMap<>()`
- Role: Defines the shared nomaids constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Skeleton.ResPose, PoseMod> initmodids = new HashMap<>()`
- Role: Defines the shared initmodids constant.
- Description: Shared constant used by the rest of the class.

### Fields

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

#### `public final Skeleton skel`
- Role: Holds the skel state.
- Description: Backs the cached state for this file.

#### `public final Pose pose`
- Role: Holds the pose state.
- Description: Backs the cached state for this file.

#### `public PoseMod[] mods = new PoseMod[0]`
- Role: Holds the mods state.
- Description: Backs the cached state for this file.

#### `public MeshAnim.Animation[] manims = new MeshAnim.Animation[0]`
- Role: Holds the manims state.
- Description: Backs the cached state for this file.

#### `public int curfl`
- Role: Stores the curfl value.
- Description: Backs the cached state for this file.

#### `protected final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Pose oldpose`
- Role: Holds the oldpose state.
- Description: Backs the cached state for this file.

#### `private float ipold`
- Role: Stores the ipold value.
- Description: Backs the cached state for this file.

#### `private boolean stat = true`
- Role: Tracks the stat flag.
- Description: Supports the stat operation used by the surrounding class.

#### `private RenderTree.Node[] parts`
- Role: Stores the parts value.
- Description: Backs the cached state for this file.

#### `private Collection<Runnable> tickparts = Collections.emptyList()`
- Role: Caches tickparts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Collection<Consumer<Render>> gtickparts = Collections.emptyList()`
- Role: Caches gtickparts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Map<MeshAnim.Res, MeshAnim.Animation> maids = nomaids`
- Role: Caches maids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Map<Skeleton.ResPose, PoseMod> modids = initmodids`
- Role: Caches modids entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public SkelSprite(Owner owner, Resource res, int fl)`
- Role: Creates a new SkelSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public SkelSprite(Owner owner, Resource res)`
- Role: Creates a new SkelSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public SkelSprite(Owner owner, Resource res, Message sdt)`
- Role: Creates a new SkelSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `private void parts(RenderTree.Slot slot)`
- Role: Performs parts.
- Description: Supports the parts operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Exposes the requested value without mutating state.

#### `public double getv()`
- Role: Returns the avatar value.
- Description: Exposes the requested value without mutating state.

#### `protected RenderTree.Node animwrap(Pipe.Op.Wrapping wrap, Collection<Runnable> tbuf, Collection<Consumer<Render>> gbuf)`
- Role: Performs animwrap.
- Description: Supports the animwrap operation used by the surrounding class.

#### `public void iparts(int mask, Collection<RenderTree.Node> rbuf, Collection<Runnable> tbuf, Collection<Consumer<Render>> gbuf)`
- Role: Performs iparts.
- Description: Supports the iparts operation used by the surrounding class.

#### `private void chparts(int mask)`
- Role: Performs chparts.
- Description: Supports the chparts operation used by the surrounding class.

#### `private void rebuild()`
- Role: Performs rebuild.
- Description: Supports the rebuild operation used by the surrounding class.

#### `private void chmanims(int mask)`
- Role: Performs chmanims.
- Description: Supports the chmanims operation used by the surrounding class.

#### `private void chposes(int mask)`
- Role: Changes the active pose set.
- Description: Supports the chposes operation used by the surrounding class.

#### `public void update(int fl)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void update(Message sdt)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public boolean tick(double ddt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.
