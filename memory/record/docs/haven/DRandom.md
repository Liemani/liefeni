---
source: [DRandom.java](../../../src/haven/DRandom.java)
created: 2026-06-13
updated: 2026-06-14
---

# DRandom

Represents the drandom Haven component.

## Members

### Constants

### Fields

#### `private final Random rnd = new Random(0)`
- Role: Holds the rnd state.
- Description: Backs the cached state for this file.

#### `private final long seed`
- Role: Stores the seed value.
- Description: Backs the cached state for this file.

### Methods

#### `public DRandom()`
- Role: Creates a new DRandom instance.
- Description: Constructs the instance and initializes its default state.

#### `public DRandom(long seed)`
- Role: Creates a new DRandom instance.
- Description: Constructs the instance and initializes its default state.

#### `public DRandom(Random from)`
- Role: Creates a new DRandom instance.
- Description: Constructs the instance and initializes its default state.

#### `private Random seed(long a)`
- Role: Performs seed.
- Description: Supports the seed operation used by the surrounding class.

#### `private Random seed(long a, long b)`
- Role: Performs seed.
- Description: Supports the seed operation used by the surrounding class.

#### `private Random seed(long... a)`
- Role: Performs seed.
- Description: Supports the seed operation used by the surrounding class.

#### `public int randi(long a)`
- Role: Performs randi.
- Description: Supports the randi operation used by the surrounding class.

#### `public int randi(long a, long b)`
- Role: Performs randi.
- Description: Supports the randi operation used by the surrounding class.

#### `public int randi(long... a)`
- Role: Performs randi.
- Description: Supports the randi operation used by the surrounding class.

#### `public long randl(long a)`
- Role: Performs randl.
- Description: Supports the randl operation used by the surrounding class.

#### `public long randl(long a, long b)`
- Role: Performs randl.
- Description: Supports the randl operation used by the surrounding class.

#### `public long randl(long... a)`
- Role: Performs randl.
- Description: Supports the randl operation used by the surrounding class.

#### `public float randf(long a)`
- Role: Performs randf.
- Description: Supports the randf operation used by the surrounding class.

#### `public float randf(long a, long b)`
- Role: Performs randf.
- Description: Supports the randf operation used by the surrounding class.

#### `public float randf(long... a)`
- Role: Performs randf.
- Description: Supports the randf operation used by the surrounding class.

#### `public double randd(long a)`
- Role: Performs randd.
- Description: Supports the randd operation used by the surrounding class.

#### `public double randd(long a, long b)`
- Role: Performs randd.
- Description: Supports the randd operation used by the surrounding class.

#### `public double randd(long... a)`
- Role: Performs randd.
- Description: Supports the randd operation used by the surrounding class.
