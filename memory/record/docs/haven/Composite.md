---
source: [Composite.java](../../../src/haven/Composite.java)
created: 2026-06-13
updated: 2026-06-14
---

# Composite

Represents the composite Haven component.

## Nested Types

### $cmpequ

- Role: Represents $cmpequ within Composite.
- Description: Describes the nested $cmpequ type used by the enclosing class.

### $cmpmod

- Role: Represents $cmpmod within Composite.
- Description: Describes the nested $cmpmod type used by the enclosing class.

### $cmppose

- Role: Represents $cmppose within Composite.
- Description: Describes the nested $cmppose type used by the enclosing class.

### $composite

- Role: Represents $composite within Composite.
- Description: Describes the nested $composite type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final static float ipollen = 0.2f`
- Role: Stores the ipollen value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `public final Resource baseres`
- Role: Stores the baseres value.
- Description: Backs the cached state for this file.

#### `public final Composited comp`
- Role: Holds the comp state.
- Description: Backs the cached state for this file.

#### `public int pseq = -1`
- Role: Stores the pseq value.
- Description: Backs the cached state for this file.

#### `public List<MD> nmod`
- Role: Caches nmod entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<ED> nequ`
- Role: Caches nequ entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Collection<ResData> nposes = null, tposes = null`
- Role: Caches nposes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Collection<ResData> nposes = null, tposes = null`
- Role: Caches nposes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean nposesold, retainequ = false`
- Role: Tracks the retainequ flag.
- Description: Supports the retainequ operation used by the surrounding class.

#### `private boolean nposesold, retainequ = false`
- Role: Tracks the retainequ flag.
- Description: Supports the retainequ operation used by the surrounding class.

#### `private float tptime`
- Role: Stores the tptime value.
- Description: Backs the cached state for this file.

#### `private WrapMode tpmode`
- Role: Holds the tpmode state.
- Description: Backs the cached state for this file.

#### `public String[] poseResNames = null`
- Role: Stores the pose res names value.
- Description: Backs the cached state for this file.

### Methods

#### `public Composite(Gob gob, Indir<Resource> base)`
- Role: Creates a new Composite instance.
- Description: Constructs the instance and initializes its default state.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public static List<PoseMod> loadposes(Collection<ResData> rl, Skeleton.ModOwner owner, Skeleton skel, boolean old)`
- Role: Performs loadposes.
- Description: Supports the loadposes operation used by the surrounding class.

#### `private List<PoseMod> loadposes(Collection<ResData> rl, Skeleton skel, boolean old)`
- Role: Performs loadposes.
- Description: Supports the loadposes operation used by the surrounding class.

#### `private List<PoseMod> loadposes(Collection<ResData> rl, Skeleton skel, WrapMode mode)`
- Role: Performs loadposes.
- Description: Supports the loadposes operation used by the surrounding class.

#### `private void updequ()`
- Role: Performs updequ.
- Description: Supports the updequ operation used by the surrounding class.

#### `public void ctick(double dt)`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.

#### `public void chposes(Collection<ResData> poses, boolean interp)`
- Role: Changes the active pose set.
- Description: Supports the chposes operation used by the surrounding class.

#### `public void tposes(Collection<ResData> poses, WrapMode mode, float time)`
- Role: Performs tposes.
- Description: Supports the tposes operation used by the surrounding class.

#### `public void chmod(List<MD> mod)`
- Role: Performs chmod.
- Description: Supports the chmod operation used by the surrounding class.

#### `public void chequ(List<ED> equ)`
- Role: Performs chequ.
- Description: Supports the chequ operation used by the surrounding class.

#### `public Object staticp()`
- Role: Performs staticp.
- Description: Supports the staticp operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String baseResName()`
- Role: Performs base res name.
- Description: Supports the base res name operation used by the surrounding class.

#### `public Stream<String> equResNames()`
- Role: Performs equ res names.
- Description: Supports the equ res names operation used by the surrounding class.

#### `public Stream<String> modResNames()`
- Role: Performs mod res names.
- Description: Supports the mod res names operation used by the surrounding class.

#### `public Stream<String> poseResNames()`
- Role: Performs pose res names.
- Description: Supports the pose res names operation used by the surrounding class.

#### `private void _setPoseResNames(Collection<ResData> resDatas)`
- Role: Performs  set pose res names.
- Description: Supports the set pose res names operation used by the surrounding class.

#### `private String _safeGetRes(Indir<Resource> res)`
- Role: Performs  safe get res.
- Description: Supports the safe get res operation used by the surrounding class.
