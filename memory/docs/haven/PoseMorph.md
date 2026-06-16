# PoseMorph

This file documents the responsibilities and members of `PoseMorph`.

## Meta

- Source: [PoseMorph.java](../../../src/haven/PoseMorph.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the pose morph Haven component.

## Nested Types

### $Res

- Role: Represents $res within PoseMorph.
- Description: Describes the nested $res type used by the enclosing class.

### BoneData

- Role: Represents bone data within PoseMorph.
- Description: Describes the nested bone data type used by the enclosing class.

### Morphed

- Role: Represents morphed within PoseMorph.
- Description: Describes the nested morphed type used by the enclosing class.

### Old$Res

- Role: Represents old$res within PoseMorph.
- Description: Describes the nested old$res type used by the enclosing class.

### Shader

- Role: Represents shader within PoseMorph.
- Description: Describes the nested shader type used by the enclosing class.

### WeightData

- Role: Represents weight data within PoseMorph.
- Description: Describes the nested weight data type used by the enclosing class.

## Members

### Constants

#### `public static final State.Slot<Morphed> slot = new State.Slot<>(State.Slot.Type.GEOM, Morphed.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute vba = new Attribute(IVEC4, "vba")`
- Role: Defines the shared vba constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute vbw = new Attribute(VEC4, "vbw")`
- Role: Defines the shared vbw constant.
- Description: Shared constant used by the rest of the class.

#### `private static final WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Defines the shared interned constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Pose pose`
- Role: Holds the pose state.
- Description: Backs the cached state for this file.

#### `private final int[] bperm`
- Role: Stores the bperm value.
- Description: Backs the cached state for this file.

#### `private Morphed last`
- Role: Holds the last state.
- Description: Backs the cached state for this file.

#### `private int lastseq`
- Role: Stores the lastseq value.
- Description: Backs the cached state for this file.

#### `final int nb`
- Role: Stores the nb value.
- Description: Backs the cached state for this file.

#### `final Uniform bo`
- Role: Holds the bo state.
- Description: Backs the cached state for this file.

#### `final Function skanp, skand`
- Role: Holds the skand state.
- Description: Backs the cached state for this file.

#### `final Function skanp, skand`
- Role: Holds the skand state.
- Description: Backs the cached state for this file.

#### `public final float[][] offs`
- Role: Stores the offs value.
- Description: Backs the cached state for this file.

#### `private final ShaderMacro shader`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `public final String[] names`
- Role: Stores the names value.
- Description: Backs the cached state for this file.

### Methods

#### `private static int[] mkperm(Skeleton skel, BoneData bd)`
- Role: Performs mkperm.
- Description: Supports the mkperm operation used by the surrounding class.

#### `public PoseMorph(Pose pose, FastMesh mesh)`
- Role: Creates a new PoseMorph instance.
- Description: Constructs the instance and initializes its default state.

#### `public static boolean boned(FastMesh mesh)`
- Role: Performs boned.
- Description: Supports the boned operation used by the surrounding class.

#### `public static String boneidp(FastMesh mesh)`
- Role: Performs boneidp.
- Description: Supports the boneidp operation used by the surrounding class.

#### `public Morphed state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `Shader(int nb)`
- Role: Handles the shader workflow.
- Description: Supports the shader operation used by the surrounding class.

#### `Function skan(boolean pos)`
- Role: Performs skan.
- Description: Supports the skan operation used by the surrounding class.

#### `public void morph(ValBlock.Value val, MeshMorph.MorphType type, VertexContext vctx)`
- Role: Performs morph.
- Description: Supports the morph operation used by the surrounding class.

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static Shader get(int nb)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Morphed(float[][] offs)`
- Role: Performs morphed.
- Description: Supports the morphed operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public BoneData(int apv, IntBuffer data, String[] names)`
- Role: Performs bone data.
- Description: Supports the bone data operation used by the surrounding class.

#### `public WeightData(int apv, FloatBuffer data)`
- Role: Performs weight data.
- Description: Supports the weight data operation used by the surrounding class.

#### `private static void read(Collection<VertexBuf.AttribData> dst, Message buf, int nv, int mba, NumberFormat fmt)`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public static void sortweights(FloatBuffer bw, IntBuffer ba, int mba)`
- Role: Performs sortweights.
- Description: Supports the sortweights operation used by the surrounding class.

#### `public static void normweights(FloatBuffer bw, IntBuffer ba, int mba)`
- Role: Performs normweights.
- Description: Supports the normweights operation used by the surrounding class.
