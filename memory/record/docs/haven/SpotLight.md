---
source: [SpotLight.java](../../../../src/haven/SpotLight.java)
created: 2026-06-13
updated: 2026-06-14
---

# SpotLight

Represents the spot light Haven component.

## Members

### Constants

#### `private static final float[] defdir =`
- Role: Caches the defdir value.
- Description: Caches the `defdir` value for reuse.
- Value: ``

### Fields

#### `public float[] dir`
- Role: Caches the dir value.
- Description: Caches the `dir` value for reuse.

#### `public float exp, cut`
- Role: Caches the cut value.
- Description: Caches the `cut` value for reuse.

#### `public float exp, cut`
- Role: Caches the cut value.
- Description: Caches the `cut` value for reuse.

### Methods

#### `public SpotLight(FColor col, Coord3f pos, Coord3f dir, float exp)`
- Role: Creates a new SpotLight instance.
- Description: Constructs the SpotLight instance from the supplied inputs.

#### `public SpotLight(Color col, Coord3f pos, Coord3f dir, float exp)`
- Role: Creates a new SpotLight instance.
- Description: Constructs the SpotLight instance from the supplied inputs.

#### `public SpotLight(FColor amb, FColor dif, FColor spc, Coord3f pos, Coord3f dir, float exp)`
- Role: Creates a new SpotLight instance.
- Description: Constructs the SpotLight instance from the supplied inputs.

#### `public SpotLight(Color amb, Color dif, Color spc, Coord3f pos, Coord3f dir, float exp)`
- Role: Creates a new SpotLight instance.
- Description: Constructs the SpotLight instance from the supplied inputs.