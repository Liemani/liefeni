---
source: [DataBuffer.java](../../../../../src/haven/render/DataBuffer.java)
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
- Role: Reports buffer size.
- Description: Returns the logical size of the buffer.

#### `public FillBuffer fill(T buf, Environment env)`
- Role: Creates a fill buffer.
- Description: Opens a writable view on the buffer for the given environment.

#### `public default void done()`
- Role: Finalizes buffer filling.
- Description: Completes the fill operation after the staged data has been written.

#### `public static Filler<DataBuffer> of(ByteBuffer data)`
- Role: Wraps byte-buffer data.
- Description: Builds a filler that copies the provided byte buffer.

#### `public static Filler<DataBuffer> of(ShortBuffer data)`
- Role: Wraps short-buffer data.
- Description: Builds a filler that copies the provided short buffer.

#### `public static Filler<DataBuffer> of(IntBuffer data)`
- Role: Wraps int-buffer data.
- Description: Builds a filler that copies the provided int buffer.

#### `public static Filler<DataBuffer> of(FloatBuffer data)`
- Role: Wraps float-buffer data.
- Description: Builds a filler that copies the provided float buffer.

#### `public static Filler<DataBuffer> of(byte[] data)`
- Role: Wraps byte-array data.
- Description: Builds a filler that copies the provided byte array.

#### `public static Filler<DataBuffer> of(short[] data)`
- Role: Wraps short-array data.
- Description: Builds a filler that copies the provided short array.

#### `public static Filler<DataBuffer> of(int[] data)`
- Role: Wraps int-array data.
- Description: Builds a filler that copies the provided int array.

#### `public static Filler<DataBuffer> of(float[] data)`
- Role: Wraps float-array data.
- Description: Builds a filler that copies the provided float array.

#### `public static Filler<DataBuffer> zero()`
- Role: Builds a zero filler.
- Description: Creates a filler that clears the buffer contents.

#### `public FillBuffer fill(T buf, Environment env, int from, int to)`
- Role: Creates a ranged fill buffer.
- Description: Opens a writable view for a subrange of the buffer.

#### `public default FillBuffer fill(T buf, Environment env)`
- Role: Creates a full fill buffer.
- Description: Opens a writable view covering the entire buffer.