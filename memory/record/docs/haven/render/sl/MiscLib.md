---
source: [MiscLib.java](../../../../../src/haven/render/sl/MiscLib.java)
created: 2026-06-13
updated: 2026-06-14
---

# MiscLib

Represents the misc lib shader-language AST node.

## Members

### Constants

#### `public static final Function vqrot = new Function.Def(VEC3)`
- Role: Defines the shared vqrot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Function colblend = new Function.Def(VEC4)`
- Role: Defines the shared colblend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Function olblend = new Function.Def(VEC4)`
- Role: Defines the shared olblend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Function cpblend = new Function.Def(VEC4)`
- Role: Defines the shared cpblend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Function rgb2hsv = new Function.Def(VEC3, "rgb2hsv")`
- Role: Defines the shared rgb2hsv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Function hsv2rgb = new Function.Def(VEC3, "hsv2rgb")`
- Role: Defines the shared hsv2rgb constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Function lin2srgb = new Function.Def(VEC4, "lin2srgb")`
- Role: Defines the shared lin2srgb constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Function srgb2lin = new Function.Def(VEC4, "srgb2lin")`
- Role: Defines the shared srgb2lin constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public static float[] rotasq(Coord3f axis, float angle)`
- Role: Performs rotasq.
- Description: Supports the rotasq operation used by the surrounding class.
