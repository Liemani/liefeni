---
source: [DRandom.java](../../../../src/haven/DRandom.java)
created: 2026-06-13
updated: 2026-06-14
---

# DRandom

Represents the drandom Haven component.

## Members

### Constants

### Fields

#### `private final Random rnd = new Random(0)`
- Role: Implements the rnd operation.
- Description: Implements the random operation.

#### `private final long seed`
- Role: Caches the seed value.
- Description: Caches the `seed` value for reuse.

### Methods

#### `public DRandom()`
- Role: Creates a new DRandom instance.
- Description: Constructs the DRandom instance from the supplied inputs.

#### `public DRandom(long seed)`
- Role: Creates a new DRandom instance.
- Description: Constructs the DRandom instance from the supplied inputs.

#### `public DRandom(Random from)`
- Role: Creates a new DRandom instance.
- Description: Constructs the DRandom instance from the supplied inputs.

#### `private Random seed(long a)`
- Role: Handles the seed path.
- Description: Implements the seed operation.

#### `private Random seed(long a, long b)`
- Role: Handles the seed path.
- Description: Implements the seed operation.

#### `private Random seed(long... a)`
- Role: Handles the seed path.
- Description: Implements the seed operation.

#### `public int randi(long a)`
- Role: Handles the randi path.
- Description: Implements the randi operation.

#### `public int randi(long a, long b)`
- Role: Handles the randi path.
- Description: Implements the randi operation.

#### `public int randi(long... a)`
- Role: Handles the randi path.
- Description: Implements the randi operation.

#### `public long randl(long a)`
- Role: Handles the randl path.
- Description: Implements the randl operation.

#### `public long randl(long a, long b)`
- Role: Handles the randl path.
- Description: Implements the randl operation.

#### `public long randl(long... a)`
- Role: Handles the randl path.
- Description: Implements the randl operation.

#### `public float randf(long a)`
- Role: Handles the randf path.
- Description: Implements the randf operation.

#### `public float randf(long a, long b)`
- Role: Handles the randf path.
- Description: Implements the randf operation.

#### `public float randf(long... a)`
- Role: Handles the randf path.
- Description: Implements the randf operation.

#### `public double randd(long a)`
- Role: Handles the randd path.
- Description: Implements the randd operation.

#### `public double randd(long a, long b)`
- Role: Handles the randd path.
- Description: Implements the randd operation.

#### `public double randd(long... a)`
- Role: Handles the randd path.
- Description: Implements the randd operation.