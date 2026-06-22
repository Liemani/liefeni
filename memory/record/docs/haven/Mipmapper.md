---
source: [Mipmapper.java](../../../../src/haven/Mipmapper.java)
created: 2026-06-13
updated: 2026-06-14
---

# Mipmapper

Represents the mipmapper Haven component.

## Nested Types

### Mipmapper3

- Role: Extends the mipmap generator with 3-channel output support.
- Description: Abstract mipmapper variant that can produce either 3-channel or 4-channel results.

## Members

### Constants

#### `public static final Mipmapper3 avg = new Mipmapper3()`
- Role: Implements the avg operation.
- Description: Implements the mipmapper3 operation.
- Value: `new Mipmapper3()`

#### `public static final Mipmapper rnd = new Mipmapper()`
- Role: Implements the rnd operation.
- Description: Implements the mipmapper operation.
- Value: `new Mipmapper()`

#### `public static final Mipmapper cnt = new Mipmapper()`
- Role: Implements the cnt operation.
- Description: Implements the mipmapper operation.
- Value: `new Mipmapper()`

#### `public static final Mipmapper dav = new Mipmapper()`
- Role: Implements the dav operation.
- Description: Implements the mipmapper operation.
- Value: `new Mipmapper()`

#### `public static final Mipmapper lanczos = new Mipmapper()`
- Role: Implements the lanczos operation.
- Description: Implements the mipmapper operation.
- Value: `new Mipmapper()`

### Fields

### Methods

#### `public abstract byte[] gen4(Coord dim, byte[] data, VectorFormat fmt)`
- Role: Handles the gen4 path.
- Description: Implements the gen4 operation.

#### `public abstract byte[] gen3(Coord dim, byte[] data, VectorFormat fmt)`
- Role: Handles the gen3 path.
- Description: Implements the gen3 operation.

#### `public static Coord nextsz(Coord dim)`
- Role: Handles the nextsz path.
- Description: Implements the nextsz operation.