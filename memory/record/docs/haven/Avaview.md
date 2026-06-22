---
source: [Avaview.java](../../../../src/haven/Avaview.java)
created: 2026-06-13
updated: 2026-06-14
---

# Avaview

Renders an avatar preview from a live gob or decoded avatar description.

## Nested Types

### $_

- Role: Builds the `av` widget instance from the resource system.
- Description: Converts widget arguments into an `Avaview` and wraps it in a `ProxyFrame` when needed.

### AvaOwner

- Role: Supplies owner-context access for the composited avatar.
- Description: Resolves `Avaview`, `Glob`, `Session`, and `Resource.Resolver` lookups for the avatar renderer.

## Members

### Constants

#### `public static final Tex missing = Resource.loadtex("gfx/hud/equip/missing")`
- Role: Loads the fallback avatar image.
- Description: Displayed when no avatar image is available.
- Value: `Resource.loadtex("gfx/hud/equip/missing")`

#### `public static final Coord dasz = missing.sz()`
- Role: Stores the default avatar widget size.
- Description: Reuses the fallback image size when no custom size is provided.
- Value: `missing.sz()`

#### `private static final OwnerContext.ClassResolver<Avaview> ctxr = new OwnerContext.ClassResolver<Avaview>()`
- Role: Resolves owner-context services for avatar rendering.
- Description: Maps `Avaview`, `Glob`, `Session`, and `Resource.Resolver` lookups.
- Value: `new OwnerContext.ClassResolver<Avaview>()`

### Fields

#### `public FColor clearcolor = FColor.BLACK`
- Role: Stores the background clear color.
- Description: Used when no avatar image or 3D view is drawn.

#### `public long avagob`
- Role: Stores the avatar gob id to display.
- Description: When set, the widget follows that gob's avatar data.

#### `public Desc avadesc`
- Role: Stores a standalone avatar description.
- Description: Used when rendering from decoded avatar data instead of a live gob.

#### `public Resource.Resolver resmap = null`
- Role: Stores the resource resolver for avatar data.
- Description: Used to resolve external resources when rendering a standalone description.

#### `private Composited comp`
- Role: Stores the composited avatar skeleton state.
- Description: Rebuilt when the underlying gob or descriptor changes.

#### `private RenderTree.Slot compslot`
- Role: Stores the render-tree slot for the avatar model.
- Description: Used to add or remove the avatar from the render tree.

#### `private List<Composited.MD> cmod = null`
- Role: Stores the current model modifications.
- Description: Cached so the avatar only re-applies changes when they differ.

#### `private List<Composited.ED> cequ = null`
- Role: Stores the current equipment changes.
- Description: Cached so the avatar only re-applies equipment when needed.

#### `private final String camnm`
- Role: Stores the bone-offset camera name.
- Description: Used to locate the camera anchor in the avatar skeleton.

#### `private Collection<ResData> nposes = null, lposes = null`
- Role: Stores the pending and last pose collections.
- Description: Keeps the active pose set and the previous one for interpolation.

#### `private Collection<ResData> nposes = null, lposes = null`
- Role: Stores the pending and last pose collections.
- Description: Keeps the active pose set and the previous one for interpolation.

#### `private boolean nposesold`
- Role: Tracks the nposesold flag.
- Description: Marks whether the legacy pose set is active.

#### `private final AvaOwner avaowner = new AvaOwner()`
- Role: Provides owner-context access for the avatar renderer.
- Description: Supplies skeleton and resource services to `Composited`.

#### `private Indir<Resource> lbase = null`
- Role: Stores the current skeleton base resource.
- Description: Reused until the avatar's skeleton base changes.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates an avatar view widget.
- Description: Parses the widget arguments and wraps the view in a `ProxyFrame` when needed.

#### `public Avaview(Coord sz, long avagob, String camnm)`
- Role: Creates an avatar preview of the requested size.
- Description: Sets up the default light and outline state for avatar rendering.

#### `protected void makeproj()`
- Role: Builds the avatar projection.
- Description: Uses a fixed frustum tuned for the preview widget.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Receives server updates for avatar state and poses.

#### `public void pop(Desc ava, Resource.Resolver resmap)`
- Role: Applies avatar description updates.
- Description: Applies a new avatar description and resolver.

#### `public void pop(Desc ava)`
- Role: Applies avatar description updates.
- Description: Applies a new avatar description.

#### `public void chposes(Collection<ResData> poses, boolean interp)`
- Role: Changes the active pose set.
- Description: Replaces the current pose set and optionally interpolates.

#### `private void updposes()`
- Role: Updates the active pose set.
- Description: Rebuilds the pose list and updates the rendered avatar.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Builds the random seed used for avatar appearance.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Returns owner-context services for the avatar renderer.

#### `public Collection<Location.Chain> getloc()`
- Role: Returns the avatar location.
- Description: Returns the composited avatar render location.

#### `public double getv()`
- Role: Returns the v.
- Description: Returns the v.

#### `private void initcomp(Composite gc)`
- Role: Initializes the composited avatar model.
- Description: Builds the composited avatar from the game character.

#### `private static Camera makecam(Resource base, Composited comp, String camnm)`
- Role: Creates the avatar camera.
- Description: Builds the camera used to render the avatar model.

#### `private Composite getgcomp()`
- Role: Returns the global composited avatar model.
- Description: Returns the shared composite used for this avatar.

#### `private static List<MD> copy1(List<MD> in)`
- Role: Clones the model modification list.
- Description: Copies each `MD` entry so the avatar can mutate them independently.

#### `private static List<ED> copy2(List<ED> in)`
- Role: Clones the equipment change list.
- Description: Copies each `ED` entry so the avatar can mutate them independently.

#### `public void updcomp()`
- Role: Updates the composited avatar model.
- Description: Updates the current object state.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `protected FColor clearcolor()`
- Role: Clears the color.
- Description: Clears the color.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Avaview content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.
