---
source: [HueMod.java](../../../../../src/haven/resutil/HueMod.java)
created: 2026-06-13
updated: 2026-06-20
---

# HueMod

Adjusts fragment color by shifting hue and scaling saturation around a target hue.

## Members

### Constants

#### `public static final Slot<HueMod> slot = new Slot<>(Slot.Type.DRAW, HueMod.class)`
- Role: Registers the hue-mod state for draw processing.
- Description: Stores the current hue adjustment in the render pipe.

#### `private static final Uniform cxf = new Uniform(VEC3, p ->`
- Role: Exposes hue parameters to the shader.
- Description: Packs target hue, hue modifier, and saturation modifier into one uniform.

#### `private static final Function apply = new Function.Def(VEC4)`
- Role: Defines the fragment color adjustment function.
- Description: Converts RGB to HSV, applies the hue shift, and converts back.

#### `private static final ShaderMacro shader = prog ->`
- Role: Installs the hue-modifying fragment step.
- Description: Modifies the output fragment color late in the pipeline.

### Fields

#### `final float tgthue, huemod, satmod`
- Role: Stores the hue target and adjustment factors.
- Description: `tgthue` is the pivot hue, `huemod` shifts the hue, and `satmod` scales saturation.

### Methods

#### `public HueMod(float tgthue, float huemod, float satmod)`
- Role: Builds a hue adjustment state.
- Description: Stores the three parameters used by the shader.

#### `public ShaderMacro shader()`
- Role: Returns the hue-modification shader.
- Description: Applies the color transform to fragment output.

#### `public void apply(Pipe buf)`
- Role: Installs the state into the draw pipe.
- Description: Makes the hue transform visible to later rendering.