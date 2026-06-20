---
source: [Mipmapper.java](../../../src/haven/Mipmapper.java)
created: 2026-06-13
updated: 2026-06-14
---

# Mipmapper

Represents the mipmapper Haven component.

## Nested Types

### Mipmapper3

- Role: Represents mipmapper3 within Mipmapper.
- Description: Describes the nested mipmapper3 type used by the enclosing class.

## Members

### Constants

#### `public static final Mipmapper3 avg = new Mipmapper3()`
- Role: Defines the shared avg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Mipmapper rnd = new Mipmapper()`
- Role: Defines the shared rnd constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Mipmapper cnt = new Mipmapper()`
- Role: Defines the shared cnt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Mipmapper dav = new Mipmapper()`
- Role: Defines the shared dav constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Mipmapper lanczos = new Mipmapper()`
- Role: Defines the shared lanczos constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public abstract byte[] gen4(Coord dim, byte[] data, VectorFormat fmt)`
- Role: Performs gen4.
- Description: Supports the gen4 operation used by the surrounding class.

#### `public abstract byte[] gen3(Coord dim, byte[] data, VectorFormat fmt)`
- Role: Performs gen3.
- Description: Supports the gen3 operation used by the surrounding class.

#### `public static Coord nextsz(Coord dim)`
- Role: Performs nextsz.
- Description: Supports the nextsz operation used by the surrounding class.
