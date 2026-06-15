# PoseMorph

This file documents the responsibilities and members of `PoseMorph`.

## Meta

- Source: [PoseMorph.java](../../../src/haven/PoseMorph.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents pose morphing support.

## Nested Types

### $Res

- Description: TODO

### BoneData

- Description: TODO

### Morphed

- Description: TODO

### Old$Res

- Description: TODO

### Shader

- Description: TODO

### WeightData

- Description: TODO

## Members

### Constants

#### `public static final State.Slot<Morphed> slot = new State.Slot<>(State.Slot.Type.GEOM, Morphed.class)`

- Description: TODO

#### `public static final Attribute vba = new Attribute(IVEC4, "vba")`

- Description: TODO

#### `public static final Attribute vbw = new Attribute(VEC4, "vbw")`

- Description: TODO

#### `private static final WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`

- Description: TODO

### Fields

#### `public final Pose pose`

- Description: TODO

#### `private final int[] bperm`

- Description: TODO

#### `private Morphed last`

- Description: TODO

#### `private int lastseq`

- Description: TODO

#### `final int nb`

- Description: TODO

#### `final Uniform bo`

- Description: TODO

#### `final Function skanp, skand`

- Description: TODO

#### `final Function skanp, skand`

- Description: TODO

#### `public final float[][] offs`

- Description: TODO

#### `private final ShaderMacro shader`

- Description: TODO

#### `public final String[] names`

- Description: TODO

### Methods

#### `private static int[] mkperm(Skeleton skel, BoneData bd)`

- Description: TODO

#### `public PoseMorph(Pose pose, FastMesh mesh)`

- Description: TODO

#### `public static boolean boned(FastMesh mesh)`

- Description: TODO

#### `public static String boneidp(FastMesh mesh)`

- Description: TODO

#### `public Morphed state()`

- Description: TODO

#### `Shader(int nb)`

- Description: TODO

#### `Function skan(boolean pos)`

- Description: TODO

#### `public void morph(ValBlock.Value val, MeshMorph.MorphType type, VertexContext vctx)`

- Description: TODO

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public static Shader get(int nb)`

- Description: TODO

#### `public Morphed(float[][] offs)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public BoneData(int apv, IntBuffer data, String[] names)`

- Description: TODO

#### `public WeightData(int apv, FloatBuffer data)`

- Description: TODO

#### `private static void read(Collection<VertexBuf.AttribData> dst, Message buf, int nv, int mba, NumberFormat fmt)`

- Description: TODO

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

#### `public void cons(Collection<VertexBuf.AttribData> dst, Resource res, Message buf, int nv)`

- Description: TODO

#### `public static void sortweights(FloatBuffer bw, IntBuffer ba, int mba)`

- Description: TODO

#### `public static void normweights(FloatBuffer bw, IntBuffer ba, int mba)`

- Description: TODO
