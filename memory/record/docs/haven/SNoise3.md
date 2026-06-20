---
source: [SNoise3.java](../../../src/haven/SNoise3.java)
created: 2026-06-13
updated: 2026-06-14
---

# SNoise3

Represents the snoise3 Haven component.

## Members

### Constants

### Fields

#### `private final byte[] ptab = new byte[256]`
- Role: Stores the ptab value.
- Description: Backs the cached state for this file.

#### `private final double[][] gtab =`
- Role: Stores the snoise3 state.
- Description: Backs the cached state for this file.

### Methods

#### `public SNoise3(Random rnd)`
- Role: Creates a new SNoise3 instance.
- Description: Constructs the instance and initializes its default state.

#### `public SNoise3(long seed)`
- Role: Creates a new SNoise3 instance.
- Description: Constructs the instance and initializes its default state.

#### `public SNoise3()`
- Role: Creates a new SNoise3 instance.
- Description: Constructs the instance and initializes its default state.

#### `public double get(double r, double x, double y, double z)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public double getr(double lo, double hi, double r, double x, double y, double z)`
- Role: Performs getr.
- Description: Supports the getr operation used by the surrounding class.

#### `public int geti(int lo, int hi, double r, double x, double y, double z)`
- Role: Performs geti.
- Description: Supports the geti operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
