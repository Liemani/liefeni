---
source: [PoseMorph.java](../../../../src/haven/PoseMorph.java)
created: 2026-06-13
updated: 2026-06-14
---

# PoseMorph

Represents the pose morph Haven component.

## Nested Types

### $Res

- Role: Registers the resource-published pose morph helper.
- Description: Builds a `PoseMorph` from a mesh resource.

### BoneData

- Role: Stores per-bone morph input data.
- Description: Keeps the apv buffer and named bone data for the mesh.

### Morphed

- Role: Marks geometry transformed by pose morphing.
- Description: Acts as the geometry render-state slot for morphed meshes.

### Old$Res

- Role: Supports the legacy pose-morph resource format.
- Description: Retains compatibility with older published resource data.

### Shader

- Role: Builds the morphing shader for a specific bone count.
- Description: Caches shader variants keyed by skeleton size.

### WeightData

- Role: Stores per-vertex morph weights.
- Description: Holds the apv buffer used to deform vertices by bone weights.

## Members

### Constants

#### `public static final State.Slot<Morphed> slot = new State.Slot<>(State.Slot.Type.GEOM, Morphed.class)`
- Role: Implements the slot operation.
- Description: Implements the public static final state.slot<morphed> slot = new state.slot<>(state.slot.type.geom, morphed.class) operation.
- Value: `new State.Slot<>(State.Slot.Type.GEOM, Morphed.class)`

#### `public static final Attribute vba = new Attribute(IVEC4, "vba")`
- Role: Implements the vba operation.
- Description: Implements the attribute operation.
- Value: `new Attribute(IVEC4, "vba")`

#### `public static final Attribute vbw = new Attribute(VEC4, "vbw")`
- Role: Implements the vbw operation.
- Description: Implements the attribute operation.
- Value: `new Attribute(VEC4, "vbw")`

#### `private static final WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Implements the interned operation.
- Description: Implements the private static final weak hashed set<shader> interned = new weak hashed set<>(hash.eq) operation.
- Value: `new WeakHashedSet<>(Hash.eq)`

### Fields

#### `public final Pose pose`
- Role: Caches the pose value.
- Description: Caches the `pose` value for reuse.

#### `private final int[] bperm`
- Role: Caches the bperm value.
- Description: Caches the `bperm` value for reuse.

#### `private Morphed last`
- Role: Caches the last .
- Description: Caches the last  value.

#### `private int lastseq`
- Role: Caches the last seq.
- Description: Caches the last seq value.

#### `final int nb`
- Role: Caches the nb value.
- Description: Caches the `nb` value for reuse.

#### `final Uniform bo`
- Role: Caches the bo value.
- Description: Caches the `bo` value for reuse.

#### `final Function skanp, skand`
- Role: Caches the skand value.
- Description: Caches the `skand` value for reuse.

#### `final Function skanp, skand`
- Role: Caches the skand value.
- Description: Caches the `skand` value for reuse.

#### `public final float[][] offs`
- Role: Caches the offs value.
- Description: Caches the `offs` value for reuse.

#### `private final ShaderMacro shader`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.

#### `public final String[] names`
- Role: Caches the names value.
- Description: Caches the `names` value for reuse.

### Methods

#### `private static int[] mkperm(Skeleton skel, BoneData bd)`
- Role: Handles the mkperm path.
- Description: Builds the bone permutation table for the mesh.

#### `public PoseMorph(Pose pose, FastMesh mesh)`
- Role: Creates a new PoseMorph instance.
- Description: Constructs the PoseMorph instance from the supplied inputs.

#### `public static boolean boned(FastMesh mesh)`
- Role: Handles the boned path.
- Description: Returns true when the mesh has pose-morph bone data.

#### `public static String boneidp(FastMesh mesh)`
- Role: Handles the boneidp path.
- Description: Returns the bone-id prefix for the mesh.

#### `public Morphed state()`
- Role: Handles the state path.
- Description: Returns the geometry state marker for this morph.

#### `Shader(int nb)`
- Role: Handles the shader workflow.
- Description: Builds a shader variant for the requested bone count.

#### `Function skan(boolean pos)`
- Role: Handles the skan path.
- Description: Returns the shader function for position or direction data.

#### `public void morph(ValBlock.Value val, MeshMorph.MorphType type, VertexContext vctx)`
- Role: Handles the morph path.
- Description: Writes the mesh morph values into the vertex context.

#### `public void modify(ProgramContext prog)`
- Role: Handles the modify path.
- Description: Injects the pose-morph shader state into the program context.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static Shader get(int nb)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Morphed(float[][] offs)`
- Role: Handles the morphed path.
- Description: Implements the morphed operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public BoneData(int apv, IntBuffer data, String[] names)`
- Role: Handles the bone data path.
- Description: Implements the bone data operation.

#### `public WeightData(int apv, FloatBuffer data)`
- Role: Handles the weight data path.
- Description: Implements the weight data operation.

#### `private static void read(Collection<VertexBuf.AttribData> dst, Message buf, int nv, int mba, NumberFormat fmt)`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public static void sortweights(FloatBuffer bw, IntBuffer ba, int mba)`
- Role: Handles the sortweights path.
- Description: Implements the sortweights operation.

#### `public static void normweights(FloatBuffer bw, IntBuffer ba, int mba)`
- Role: Handles the normweights path.
- Description: Implements the normweights operation.