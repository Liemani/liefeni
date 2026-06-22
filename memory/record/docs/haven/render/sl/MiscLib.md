---
source: [MiscLib.java](../../../../../../src/haven/render/sl/MiscLib.java)
created: 2026-06-13
updated: 2026-06-14
---

# MiscLib

Represents the misc lib shader-language AST node.

## Members

### Constants

#### `public static final Function vqrot = new Function.Def(VEC3)`
- Role: Defines the shared `vqrot` helper.
- Description: Built-in vector/quaternion rotation helper.
- Value: `new Function.Def(VEC3)`

#### `public static final Function colblend = new Function.Def(VEC4)`
- Role: Defines the shared `colblend` helper.
- Description: Built-in color blend helper.
- Value: `new Function.Def(VEC4)`

#### `public static final Function olblend = new Function.Def(VEC4)`
- Role: Defines the shared `olblend` helper.
- Description: Built-in overlay blend helper.
- Value: `new Function.Def(VEC4)`

#### `public static final Function cpblend = new Function.Def(VEC4)`
- Role: Defines the shared `cpblend` helper.
- Description: Built-in composition blend helper.
- Value: `new Function.Def(VEC4)`

#### `public static final Function rgb2hsv = new Function.Def(VEC3, "rgb2hsv")`
- Role: Defines the shared `rgb2hsv` helper.
- Description: Built-in RGB to HSV conversion helper.
- Value: `new Function.Def(VEC3, "rgb2hsv")`

#### `public static final Function hsv2rgb = new Function.Def(VEC3, "hsv2rgb")`
- Role: Defines the shared `hsv2rgb` helper.
- Description: Built-in HSV to RGB conversion helper.
- Value: `new Function.Def(VEC3, "hsv2rgb")`

#### `public static final Function lin2srgb = new Function.Def(VEC4, "lin2srgb")`
- Role: Defines the shared `lin2srgb` helper.
- Description: Built-in linear-to-sRGB conversion helper.
- Value: `new Function.Def(VEC4, "lin2srgb")`

#### `public static final Function srgb2lin = new Function.Def(VEC4, "srgb2lin")`
- Role: Defines the shared `srgb2lin` helper.
- Description: Built-in sRGB-to-linear conversion helper.
- Value: `new Function.Def(VEC4, "srgb2lin")`

### Fields

### Methods

#### `public static float[] rotasq(Coord3f axis, float angle)`
- Role: Builds a rotation quaternion.
- Description: Converts an axis-angle pair into a quaternion array.