---
source: [SNoise3.java](../../../../src/haven/SNoise3.java)
created: 2026-06-13
updated: 2026-06-14
---

# SNoise3

Generates 3D simplex noise and range-mapped values from it.

## Members

### Constants

### Fields

#### `private final byte[] ptab = new byte[256]`
- Role: Stores the permutation table.
- Description: Holds the shuffled lookup table used by the noise function.

#### `private final double[][] gtab =`
- Role: Stores the gradient table.
- Description: Holds the fixed gradient vectors used to evaluate simplex corners.

### Methods

#### `public SNoise3(Random rnd)`
- Role: Seeds a noise generator.
- Description: Builds the permutation table from the supplied random source.

#### `public SNoise3(long seed)`
- Role: Seeds a noise generator from a long value.
- Description: Convenience constructor that initializes the generator from a numeric seed.

#### `public SNoise3()`
- Role: Creates an unseeded noise generator.
- Description: Convenience constructor that seeds the generator from a fresh random source.

#### `public double get(double r, double x, double y, double z)`
- Role: Evaluates simplex noise.
- Description: Returns a normalized 3D noise sample for the supplied radius and coordinates.

#### `public double getr(double lo, double hi, double r, double x, double y, double z)`
- Role: Maps noise to a numeric range.
- Description: Converts the normalized noise sample into a double within `[lo, hi]`.

#### `public int geti(int lo, int hi, double r, double x, double y, double z)`
- Role: Maps noise to an integer range.
- Description: Converts the normalized noise sample into an integer within `[lo, hi)`.

#### `public static void main(String[] args) throws Exception`
- Role: Renders a noise image.
- Description: Command-line entry point that writes a PNG visualization of the generated noise.