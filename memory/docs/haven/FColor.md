# FColor

This file documents the responsibilities and members of `FColor`.

## Meta

- Source: [FColor.java](../../../src/haven/FColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the fcolor Haven component.

## Members

### Constants

#### `public static final FColor BLACK = new FColor(0, 0, 0)`
- Role: Defines the shared black constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor WHITE = new FColor(1, 1, 1)`
- Role: Defines the shared white constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor RED = new FColor(1, 0, 0)`
- Role: Defines the shared red constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor GREEN = new FColor(0, 1, 0)`
- Role: Defines the shared green constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor BLUE = new FColor(0, 0, 1)`
- Role: Defines the shared blue constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor YELLOW = new FColor(1, 1, 0)`
- Role: Defines the shared yellow constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor MAGENTA = new FColor(1, 0, 1)`
- Role: Defines the shared magenta constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor CYAN = new FColor(0, 1, 1)`
- Role: Defines the shared cyan constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor BLACK_T = new FColor(0, 0, 0, 0)`
- Role: Defines the shared black t constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor WHITE_T = new FColor(1, 1, 1, 0)`
- Role: Defines the shared white t constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final float r, g, b, a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `public final float r, g, b, a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `public final float r, g, b, a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `public final float r, g, b, a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

### Methods

#### `public FColor(float r, float g, float b, float a)`
- Role: Creates a new FColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public FColor(float r, float g, float b)`
- Role: Creates a new FColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public FColor(Color c, float f)`
- Role: Creates a new FColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public FColor(Color c)`
- Role: Creates a new FColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public float[] to3a()`
- Role: Performs to3a.
- Description: Supports the to3a operation used by the surrounding class.

#### `public float[] to4a()`
- Role: Performs to4a.
- Description: Supports the to4a operation used by the surrounding class.

#### `public FColor mul(FColor that)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public FColor mul(float v)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public FColor blend(FColor that)`
- Role: Performs blend.
- Description: Supports the blend operation used by the surrounding class.

#### `public FColor blend(FColor that, float B)`
- Role: Performs blend.
- Description: Supports the blend operation used by the surrounding class.

#### `public FColor preblend(FColor that)`
- Role: Performs preblend.
- Description: Supports the preblend operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public FColor lin2srgb()`
- Role: Performs lin2srgb.
- Description: Supports the lin2srgb operation used by the surrounding class.

#### `public FColor srgb2lin()`
- Role: Performs srgb2lin.
- Description: Supports the srgb2lin operation used by the surrounding class.

#### `public FColor lin2srgbf()`
- Role: Performs lin2srgbf.
- Description: Supports the lin2srgbf operation used by the surrounding class.

#### `public FColor srgb2linf()`
- Role: Performs srgb2linf.
- Description: Supports the srgb2linf operation used by the surrounding class.
