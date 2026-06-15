# SkelSprite

This file documents the responsibilities and members of `SkelSprite`.

## Meta

- Source: [SkelSprite.java](../../../src/haven/SkelSprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a skeletal sprite.

## Members

### Constants

#### `public static final float ipollen = 0.3f`

- Description: TODO

#### `public static final Factory fact = new Factory()`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<SkelSprite> ctxr = new OwnerContext.ClassResolver<SkelSprite>()`

- Description: TODO

#### `private static final Map<MeshAnim.Res, MeshAnim.Animation> nomaids = new HashMap<>()`

- Description: TODO

#### `private static final Map<Skeleton.ResPose, PoseMod> initmodids = new HashMap<>()`

- Description: TODO

### Fields

#### `rigid = new BaseColor(FColor.GREEN),`

- Description: TODO

#### `morphed = new BaseColor(FColor.RED),`

- Description: TODO

#### `unboned = new BaseColor(FColor.YELLOW)`

- Description: TODO

#### `public static boolean bonedb = false`

- Description: TODO

#### `public final Skeleton skel`

- Description: TODO

#### `public final Pose pose`

- Description: TODO

#### `public PoseMod[] mods = new PoseMod[0]`

- Description: TODO

#### `public MeshAnim.Animation[] manims = new MeshAnim.Animation[0]`

- Description: TODO

#### `public int curfl`

- Description: TODO

#### `protected final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`

- Description: TODO

#### `private Pose oldpose`

- Description: TODO

#### `private float ipold`

- Description: TODO

#### `private boolean stat = true`

- Description: TODO

#### `private RenderTree.Node[] parts`

- Description: TODO

#### `private Collection<Runnable> tickparts = Collections.emptyList()`

- Description: TODO

#### `private Collection<Consumer<Render>> gtickparts = Collections.emptyList()`

- Description: TODO

#### `private Map<MeshAnim.Res, MeshAnim.Animation> maids = nomaids`

- Description: TODO

#### `private Map<Skeleton.ResPose, PoseMod> modids = initmodids`

- Description: TODO

### Methods

#### `public SkelSprite(Owner owner, Resource res, int fl)`

- Description: TODO

#### `public SkelSprite(Owner owner, Resource res)`

- Description: TODO

#### `public SkelSprite(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `private void parts(RenderTree.Slot slot)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public Collection<Location.Chain> getloc()`

- Description: TODO

#### `public double getv()`

- Description: TODO

#### `protected RenderTree.Node animwrap(Pipe.Op.Wrapping wrap, Collection<Runnable> tbuf, Collection<Consumer<Render>> gbuf)`

- Description: TODO

#### `public void iparts(int mask, Collection<RenderTree.Node> rbuf, Collection<Runnable> tbuf, Collection<Consumer<Render>> gbuf)`

- Description: TODO

#### `private void chparts(int mask)`

- Description: TODO

#### `private void rebuild()`

- Description: TODO

#### `private void chmanims(int mask)`

- Description: TODO

#### `private void chposes(int mask)`

- Description: TODO

#### `public void update(int fl)`

- Description: TODO

#### `public void update()`

- Description: TODO

#### `public void update(Message sdt)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `public boolean tick(double ddt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`

- Description: TODO
