---
source: [PosLight.java](../../../../src/haven/PosLight.java)
created: 2026-06-13
updated: 2026-06-14
---

# PosLight

Represents the pos light Haven component.

## Members

### Constants

### Fields

#### `public float[] pos`
- Role: Caches the pos value.
- Description: Caches the `pos` value for reuse.

#### `public float ac = 1.0f, al = 0.0f, aq = 0.0f, at = 0.1f`
- Role: Caches the ac value.
- Description: Caches the `ac` value for reuse.

#### `public float ac = 1.0f, al = 0.0f, aq = 0.0f, at = 0.1f`
- Role: Caches the ac value.
- Description: Caches the `ac` value for reuse.

#### `public float ac = 1.0f, al = 0.0f, aq = 0.0f, at = 0.1f`
- Role: Caches the ac value.
- Description: Caches the `ac` value for reuse.

#### `public float ac = 1.0f, al = 0.0f, aq = 0.0f, at = 0.1f`
- Role: Caches the ac value.
- Description: Caches the `ac` value for reuse.

#### `public static float atoverride = 0`
- Role: Caches the atoverride value.
- Description: Caches the `atoverride` value for reuse.

### Methods

#### `public PosLight(FColor col, Coord3f pos)`
- Role: Creates a new PosLight instance.
- Description: Constructs the PosLight instance from the supplied inputs.

#### `public PosLight(Color col, Coord3f pos)`
- Role: Creates a new PosLight instance.
- Description: Constructs the PosLight instance from the supplied inputs.

#### `public PosLight(FColor amb, FColor dif, FColor spc, Coord3f pos)`
- Role: Creates a new PosLight instance.
- Description: Constructs the PosLight instance from the supplied inputs.

#### `public PosLight(Color amb, Color dif, Color spc, Coord3f pos)`
- Role: Creates a new PosLight instance.
- Description: Constructs the PosLight instance from the supplied inputs.

#### `public void move(Coord3f pos)`
- Role: Moves the current state.
- Description: Implements the move operation.

#### `public void att(float c, float l, float q)`
- Role: Handles the att path.
- Description: Implements the att operation.

#### `public Object[] params(GroupPipe state)`
- Role: Handles the params path.
- Description: Implements the params operation.