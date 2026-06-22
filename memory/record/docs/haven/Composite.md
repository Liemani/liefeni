---
source: [Composite.java](../../../../src/haven/Composite.java)
created: 2026-06-13
updated: 2026-06-14
---

# Composite

Represents the composite Haven component.

## Nested Types

### $cmpequ

- Role: Registers the composite-equipment resource hook.
- Description: Creates the equipment delta resource handler for `Composite`.

### $cmpmod

- Role: Registers the composite-mod resource hook.
- Description: Creates the model-delta resource handler for `Composite`.

### $cmppose

- Role: Registers the composite-pose resource hook.
- Description: Creates the pose-delta resource handler for `Composite`.

### $composite

- Role: Registers the composite attribute delta hook.
- Description: Creates the `Composite` attribute handler from resource data.

## Members

### Constants

### Fields

#### `public final static float ipollen = 0.2f`
- Role: Caches the ipollen value.
- Description: Caches the `ipollen` value for reuse.

#### `public final Indir<Resource> base`
- Role: Caches the base value.
- Description: Caches the `base` value for reuse.

#### `public final Resource baseres`
- Role: Caches the baseres value.
- Description: Caches the `baseres` value for reuse.

#### `public final Composited comp`
- Role: Caches the comp value.
- Description: Caches the `comp` value for reuse.

#### `public int pseq = -1`
- Role: Caches the pseq value.
- Description: Caches the `pseq` value for reuse.

#### `public List<MD> nmod`
- Role: Caches the nmod value.
- Description: Caches the `nmod` value for reuse.

#### `public List<ED> nequ`
- Role: Caches the nequ value.
- Description: Caches the `nequ` value for reuse.

#### `private Collection<ResData> nposes = null, tposes = null`
- Role: Caches the nposes value.
- Description: Caches the `nposes` value for reuse.

#### `private Collection<ResData> nposes = null, tposes = null`
- Role: Caches the nposes value.
- Description: Caches the `nposes` value for reuse.

#### `private boolean nposesold, retainequ = false`
- Role: Tracks the retainequ flag.
- Description: Caches the `retainequ` value for reuse.

#### `private boolean nposesold, retainequ = false`
- Role: Tracks the retainequ flag.
- Description: Caches the `retainequ` value for reuse.

#### `private float tptime`
- Role: Caches the tptime value.
- Description: Caches the `tptime` value for reuse.

#### `private WrapMode tpmode`
- Role: Caches the tpmode value.
- Description: Caches the `tpmode` value for reuse.

#### `public String[] poseResNames = null`
- Role: Caches the pose res names value.
- Description: Caches the `poseResNames` value for reuse.

### Methods

#### `public Composite(Gob gob, Indir<Resource> base)`
- Role: Creates a new Composite instance.
- Description: Constructs the Composite instance from the supplied inputs.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public static List<PoseMod> loadposes(Collection<ResData> rl, Skeleton.ModOwner owner, Skeleton skel, boolean old)`
- Role: Handles the loadposes path.
- Description: Loads the poses.

#### `private List<PoseMod> loadposes(Collection<ResData> rl, Skeleton skel, boolean old)`
- Role: Handles the loadposes path.
- Description: Loads the poses.

#### `private List<PoseMod> loadposes(Collection<ResData> rl, Skeleton skel, WrapMode mode)`
- Role: Handles the loadposes path.
- Description: Loads the poses.

#### `private void updequ()`
- Role: Handles the updequ path.
- Description: Implements the updequ operation.

#### `public void ctick(double dt)`
- Role: Advances the client-thread state.
- Description: Advances the client-thread state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.

#### `public void chposes(Collection<ResData> poses, boolean interp)`
- Role: Changes the active pose set.
- Description: Implements the chposes operation.

#### `public void tposes(Collection<ResData> poses, WrapMode mode, float time)`
- Role: Handles the tposes path.
- Description: Implements the tposes operation.

#### `public void chmod(List<MD> mod)`
- Role: Handles the chmod path.
- Description: Implements the chmod operation.

#### `public void chequ(List<ED> equ)`
- Role: Handles the chequ path.
- Description: Implements the chequ operation.

#### `public Object staticp()`
- Role: Handles the staticp path.
- Description: Implements the staticp operation.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String baseResName()`
- Role: Handles the base resource name path.
- Description: Implements the base res name operation.

#### `public Stream<String> equResNames()`
- Role: Handles the equ resource names path.
- Description: Implements the equ res names operation.

#### `public Stream<String> modResNames()`
- Role: Handles the mod resource names path.
- Description: Implements the mod res names operation.

#### `public Stream<String> poseResNames()`
- Role: Handles the pose resource names path.
- Description: Implements the pose res names operation.

#### `private void _setPoseResNames(Collection<ResData> resDatas)`
- Role: Handles the set pose resource names path.
- Description: Implements the set pose res names operation.

#### `private String _safeGetRes(Indir<Resource> res)`
- Role: Handles the safe get resource path.
- Description: Implements the safe get res operation.