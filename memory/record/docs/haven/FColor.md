---
source: [FColor.java](../../../../src/haven/FColor.java)
created: 2026-06-13
updated: 2026-06-14
---

# FColor

Represents an RGBA color in linear float space.

## Members

### Constants

#### `public static final FColor BLACK = new FColor(0, 0, 0)`
- Role: Defines opaque black.
- Description: Zeroes the RGB channels and uses the default alpha.
- Value: `new FColor(0, 0, 0)`

#### `public static final FColor WHITE = new FColor(1, 1, 1)`
- Role: Defines opaque white.
- Description: Sets all RGB channels to full intensity.
- Value: `new FColor(1, 1, 1)`

#### `public static final FColor RED = new FColor(1, 0, 0)`
- Role: Defines opaque red.
- Description: Uses full red with no green or blue.
- Value: `new FColor(1, 0, 0)`

#### `public static final FColor GREEN = new FColor(0, 1, 0)`
- Role: Defines opaque green.
- Description: Uses full green with no red or blue.
- Value: `new FColor(0, 1, 0)`

#### `public static final FColor BLUE = new FColor(0, 0, 1)`
- Role: Defines opaque blue.
- Description: Uses full blue with no red or green.
- Value: `new FColor(0, 0, 1)`

#### `public static final FColor YELLOW = new FColor(1, 1, 0)`
- Role: Defines opaque yellow.
- Description: Combines full red and green.
- Value: `new FColor(1, 1, 0)`

#### `public static final FColor MAGENTA = new FColor(1, 0, 1)`
- Role: Defines opaque magenta.
- Description: Combines full red and blue.
- Value: `new FColor(1, 0, 1)`

#### `public static final FColor CYAN = new FColor(0, 1, 1)`
- Role: Defines opaque cyan.
- Description: Combines full green and blue.
- Value: `new FColor(0, 1, 1)`

#### `public static final FColor BLACK_T = new FColor(0, 0, 0, 0)`
- Role: Defines transparent black.
- Description: Zeroes all channels, including alpha.
- Value: `new FColor(0, 0, 0, 0)`

#### `public static final FColor WHITE_T = new FColor(1, 1, 1, 0)`
- Role: Defines transparent white.
- Description: Sets RGB to full intensity while alpha stays zero.
- Value: `new FColor(1, 1, 1, 0)`

### Fields

#### `public final float r, g, b, a`
- Role: Stores the color components.
- Description: Holds linear RGBA values.

#### `public final float r, g, b, a`
- Role: Stores the color components.
- Description: Holds linear RGBA values.

#### `public final float r, g, b, a`
- Role: Stores the color components.
- Description: Holds linear RGBA values.

#### `public final float r, g, b, a`
- Role: Stores the color components.
- Description: Holds linear RGBA values.

### Methods

#### `public FColor(float r, float g, float b, float a)`
- Role: Creates a color from explicit components.
- Description: Stores the supplied linear RGBA values.

#### `public FColor(float r, float g, float b)`
- Role: Creates an opaque color from RGB components.
- Description: Uses alpha 1.0.

#### `public FColor(Color c, float f)`
- Role: Converts an AWT color into float space.
- Description: Uses the supplied alpha factor while converting RGB channels.

#### `public FColor(Color c)`
- Role: Converts an AWT color into float space.
- Description: Uses the AWT alpha channel as the float alpha.

#### `public float[] to3a()`
- Role: Returns the RGB components as an array.
- Description: Serializes the color without alpha.

#### `public float[] to4a()`
- Role: Returns the RGBA components as an array.
- Description: Serializes the color including alpha.

#### `public FColor mul(FColor that)`
- Role: Multiplies two colors component-wise.
- Description: Useful for tinting or masking one color by another.

#### `public FColor mul(float v)`
- Role: Scales the color uniformly.
- Description: Multiplies every channel by the same factor.

#### `public FColor blend(FColor that)`
- Role: Blends two colors using the other color's alpha.
- Description: Produces the usual source-over mix.

#### `public FColor blend(FColor that, float B)`
- Role: Blends two colors using an explicit mix factor.
- Description: Interpolates between this color and `that`.

#### `public FColor preblend(FColor that)`
- Role: Preblends one color over another.
- Description: Applies source-over blending using pre-multiplied alpha semantics.

#### `public int hashCode()`
- Role: Returns the color hash code.
- Description: Hashes the four float channels.

#### `public boolean equals(Object o)`
- Role: Compares two colors.
- Description: Returns true when all four channels match.

#### `public String toString()`
- Role: Formats the color for debugging.
- Description: Returns a textual RGBA representation.

#### `public FColor lin2srgb()`
- Role: Converts to sRGB space.
- Description: Applies the standard linear-to-sRGB transfer curve.

#### `public FColor srgb2lin()`
- Role: Converts to linear space.
- Description: Applies the standard sRGB-to-linear transfer curve.

#### `public FColor lin2srgbf()`
- Role: Converts to sRGB space with float precision.
- Description: Uses the floating-point transfer helper for each channel.

#### `public FColor srgb2linf()`
- Role: Converts to linear space with float precision.
- Description: Uses the floating-point transfer helper for each channel.
