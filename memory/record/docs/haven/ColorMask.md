---
source: [ColorMask.java](../../../../src/haven/ColorMask.java)
created: 2026-06-13
updated: 2026-06-14
---

# ColorMask

Applies a draw-time color mask that blends into the current fragment color.

## Members

### Constants

#### `public static final Slot<ColorMask> slot = new Slot<ColorMask>(Slot.Type.DRAW, ColorMask.class)`
- Role: Stores the active color mask in the draw state.
- Description: Lets the shader read the current blended color mask.
- Value: `new Slot<ColorMask>(Slot.Type.DRAW, ColorMask.class)`

#### `public static final Uniform ccol = new Uniform(VEC4, p -> p.get(slot).col, slot)`
- Role: Exposes the current mask color to the shader.
- Description: Reads the preblended color mask from the draw state.
- Value: `new Uniform(VEC4, p -> p.get(slot).col, slot)`

#### `private static final ShaderMacro sh = prog ->`
- Role: Installs the color-mask shader hook.
- Description: Blends the supplied color into the fragment output.
- Value: `prog ->`

### Fields

#### `private final FColor col`
- Role: Stores the mask color.
- Description: This is the color that gets blended into the current draw state.

### Methods

#### `public ColorMask(FColor col)`
- Role: Creates a new ColorMask instance.
- Description: Constructs the ColorMask instance from the supplied inputs.

#### `public ColorMask(Color col)`
- Role: Creates a new ColorMask instance.
- Description: Constructs the ColorMask instance from the supplied inputs.

#### `public ShaderMacro shader()`
- Role: Returns the color-mask shader macro.
- Description: Produces the blend hook used for fragment color masking.

#### `public void apply(Pipe buf)`
- Role: Applies the color mask to the draw pipe.
- Description: Preblends with any existing mask before storing the new state.
