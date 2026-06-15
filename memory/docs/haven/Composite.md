# Composite

This file documents the responsibilities and members of `Composite`.

## Meta

- Source: [Composite.java](../../../src/haven/Composite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a composite game object or UI helper.

## Nested Types

### $cmpequ

- Description: TODO

### $cmpmod

- Description: TODO

### $cmppose

- Description: TODO

### $composite

- Description: TODO

## Members

### Constants

### Fields

#### `public final static float ipollen = 0.2f`

- Description: TODO

#### `public final Indir<Resource> base`

- Description: TODO

#### `public final Resource baseres`

- Description: TODO

#### `public final Composited comp`

- Description: TODO

#### `public int pseq = -1`

- Description: TODO

#### `public List<MD> nmod`

- Description: TODO

#### `public List<ED> nequ`

- Description: TODO

#### `private Collection<ResData> nposes = null, tposes = null`

- Description: TODO

#### `private Collection<ResData> nposes = null, tposes = null`

- Description: TODO

#### `private boolean nposesold, retainequ = false`

- Description: TODO

#### `private boolean nposesold, retainequ = false`

- Description: TODO

#### `private float tptime`

- Description: TODO

#### `private WrapMode tpmode`

- Description: TODO

#### `public String[] poseResNames = null`

- Description: TODO

### Methods

#### `public Composite(Gob gob, Indir<Resource> base)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public static List<PoseMod> loadposes(Collection<ResData> rl, Skeleton.ModOwner owner, Skeleton skel, boolean old)`

- Description: TODO

#### `private List<PoseMod> loadposes(Collection<ResData> rl, Skeleton skel, boolean old)`

- Description: TODO

#### `private List<PoseMod> loadposes(Collection<ResData> rl, Skeleton skel, WrapMode mode)`

- Description: TODO

#### `private void updequ()`

- Description: TODO

#### `public void ctick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public Supplier<Pipe.Op> eqpoint(String nm, Message dat)`

- Description: TODO

#### `public void chposes(Collection<ResData> poses, boolean interp)`

- Description: TODO

#### `public void tposes(Collection<ResData> poses, WrapMode mode, float time)`

- Description: TODO

#### `public void chmod(List<MD> mod)`

- Description: TODO

#### `public void chequ(List<ED> equ)`

- Description: TODO

#### `public Object staticp()`

- Description: TODO

#### `public void apply(Gob g, OCache.AttrDelta msg)`

- Description: TODO

#### `public void apply(Gob g, OCache.AttrDelta msg)`

- Description: TODO

#### `public void apply(Gob g, OCache.AttrDelta msg)`

- Description: TODO

#### `public void apply(Gob g, OCache.AttrDelta msg)`

- Description: TODO

#### `public String baseResName()`

- Description: TODO

#### `public Stream<String> equResNames()`

- Description: TODO

#### `public Stream<String> modResNames()`

- Description: TODO

#### `public Stream<String> poseResNames()`

- Description: TODO

#### `private void _setPoseResNames(Collection<ResData> resDatas)`

- Description: TODO

#### `private String _safeGetRes(Indir<Resource> res)`

- Description: TODO
