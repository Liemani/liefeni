---
source: [Avaview.java](../../../src/haven/Avaview.java)
created: 2026-06-13
updated: 2026-06-14
---

# Avaview

Represents the avaview Haven component.

## Nested Types

### $_

- Role: Represents $ within Avaview.
- Description: Describes the nested $  type used by the enclosing class.

### AvaOwner

- Role: Represents ava owner within Avaview.
- Description: Describes the nested ava owner type used by the enclosing class.

## Members

### Constants

#### `public static final Tex missing = Resource.loadtex("gfx/hud/equip/missing")`
- Role: Defines the shared missing constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord dasz = missing.sz()`
- Role: Defines the shared dasz constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<Avaview> ctxr = new OwnerContext.ClassResolver<Avaview>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public FColor clearcolor = FColor.BLACK`
- Role: Stores the clearcolor value.
- Description: Backs the cached state for this file.

#### `public long avagob`
- Role: Stores the avagob value.
- Description: Backs the cached state for this file.

#### `public Desc avadesc`
- Role: Holds the avadesc state.
- Description: Backs the cached state for this file.

#### `public Resource.Resolver resmap = null`
- Role: Stores the resmap value.
- Description: Backs the cached state for this file.

#### `private Composited comp`
- Role: Holds the comp state.
- Description: Backs the cached state for this file.

#### `private RenderTree.Slot compslot`
- Role: Holds the compslot state.
- Description: Backs the cached state for this file.

#### `private List<Composited.MD> cmod = null`
- Role: Caches cmod entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<Composited.ED> cequ = null`
- Role: Caches cequ entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final String camnm`
- Role: Stores the camnm value.
- Description: Backs the cached state for this file.

#### `private Collection<ResData> nposes = null, lposes = null`
- Role: Caches nposes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Collection<ResData> nposes = null, lposes = null`
- Role: Caches nposes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean nposesold`
- Role: Tracks the nposesold flag.
- Description: Supports the nposesold operation used by the surrounding class.

#### `private final AvaOwner avaowner = new AvaOwner()`
- Role: Holds the avaowner state.
- Description: Backs the cached state for this file.

#### `private Indir<Resource> lbase = null`
- Role: Stores the lbase value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Avaview(Coord sz, long avagob, String camnm)`
- Role: Creates a new Avaview instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void makeproj()`
- Role: Performs makeproj.
- Description: Supports the makeproj operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void pop(Desc ava, Resource.Resolver resmap)`
- Role: Applies avatar description updates.
- Description: Supports the pop operation used by the surrounding class.

#### `public void pop(Desc ava)`
- Role: Applies avatar description updates.
- Description: Supports the pop operation used by the surrounding class.

#### `public void chposes(Collection<ResData> poses, boolean interp)`
- Role: Changes the active pose set.
- Description: Supports the chposes operation used by the surrounding class.

#### `private void updposes()`
- Role: Updates the active pose set.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Exposes the requested value without mutating state.

#### `public double getv()`
- Role: Returns the avatar value.
- Description: Exposes the requested value without mutating state.

#### `private void initcomp(Composite gc)`
- Role: Initializes the composited avatar model.
- Description: Mutates the owning object to keep runtime state in sync.

#### `private static Camera makecam(Resource base, Composited comp, String camnm)`
- Role: Creates the avatar camera.
- Description: Constructs the avatar camera from the supplied inputs.

#### `private Composite getgcomp()`
- Role: Returns the global composited avatar model.
- Description: Exposes the requested value without mutating state.

#### `private static List<MD> copy1(List<MD> in)`
- Role: Copies the first shader operand.
- Description: Supports the copy1 operation used by the surrounding class.

#### `private static List<ED> copy2(List<ED> in)`
- Role: Copies the second shader operand.
- Description: Supports the copy2 operation used by the surrounding class.

#### `public void updcomp()`
- Role: Updates the composited avatar model.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `protected FColor clearcolor()`
- Role: Returns the clear color value.
- Description: Exposes the requested value without mutating state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.
