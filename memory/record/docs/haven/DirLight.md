---
source: [DirLight.java](../../../../src/haven/DirLight.java)
created: 2026-06-13
updated: 2026-06-14
---

# DirLight

Represents the dir light Haven component.

## Members

### Constants

### Fields

#### `public float[] dir`
- Role: Caches the dir value.
- Description: Caches the `dir` value for reuse.

### Methods

#### `public DirLight(FColor col, Coord3f dir)`
- Role: Creates a new DirLight instance.
- Description: Constructs the DirLight instance from the supplied inputs.

#### `public DirLight(Color col, Coord3f dir)`
- Role: Creates a new DirLight instance.
- Description: Constructs the DirLight instance from the supplied inputs.

#### `public DirLight(FColor amb, FColor dif, FColor spc, Coord3f dir)`
- Role: Creates a new DirLight instance.
- Description: Constructs the DirLight instance from the supplied inputs.

#### `public DirLight(Color amb, Color dif, Color spc, Coord3f dir)`
- Role: Creates a new DirLight instance.
- Description: Constructs the DirLight instance from the supplied inputs.

#### `public Object[] params(GroupPipe state)`
- Role: Handles the params path.
- Description: Implements the params operation.