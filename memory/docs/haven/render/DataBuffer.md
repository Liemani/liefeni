# DataBuffer

This file documents the responsibilities and members of `DataBuffer`.

## Meta

- Source: [DataBuffer.java](../../../../src/haven/render/DataBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a data buffer.

## Members

### Constants

### Fields

### Methods

#### `public int size()`

- Description: TODO

#### `public FillBuffer fill(T buf, Environment env)`

- Description: TODO

#### `public default void done()`

- Description: TODO

#### `public static Filler<DataBuffer> of(ByteBuffer data)`

- Description: TODO

#### `public static Filler<DataBuffer> of(ShortBuffer data)`

- Description: TODO

#### `public static Filler<DataBuffer> of(IntBuffer data)`

- Description: TODO

#### `public static Filler<DataBuffer> of(FloatBuffer data)`

- Description: TODO

#### `public static Filler<DataBuffer> of(byte[] data)`

- Description: TODO

#### `public static Filler<DataBuffer> of(short[] data)`

- Description: TODO

#### `public static Filler<DataBuffer> of(int[] data)`

- Description: TODO

#### `public static Filler<DataBuffer> of(float[] data)`

- Description: TODO

#### `public static Filler<DataBuffer> zero()`

- Description: TODO

#### `public FillBuffer fill(T buf, Environment env, int from, int to)`

- Description: TODO

#### `public default FillBuffer fill(T buf, Environment env)`

- Description: TODO
