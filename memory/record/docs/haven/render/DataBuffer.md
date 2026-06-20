---
source: [DataBuffer.java](../../../../src/haven/render/DataBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# DataBuffer

Defines the data buffer render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public FillBuffer fill(T buf, Environment env)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public default void done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public static Filler<DataBuffer> of(ByteBuffer data)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Filler<DataBuffer> of(ShortBuffer data)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Filler<DataBuffer> of(IntBuffer data)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Filler<DataBuffer> of(FloatBuffer data)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Filler<DataBuffer> of(byte[] data)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Filler<DataBuffer> of(short[] data)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Filler<DataBuffer> of(int[] data)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Filler<DataBuffer> of(float[] data)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Filler<DataBuffer> zero()`
- Role: Performs zero.
- Description: Supports the zero operation used by the surrounding class.

#### `public FillBuffer fill(T buf, Environment env, int from, int to)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.

#### `public default FillBuffer fill(T buf, Environment env)`
- Role: Performs fill.
- Description: Supports the fill operation used by the surrounding class.
