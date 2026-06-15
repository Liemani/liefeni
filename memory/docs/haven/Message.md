# Message

This file documents the responsibilities and members of `Message`.

## Meta

- Source: [Message.java](../../../src/haven/Message.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a protocol or UI message.

## Nested Types

### BinError

- Description: TODO

### EOF

- Description: TODO

### FormatError

- Description: TODO

## Members

### Constants

#### `public static final int T_END = 0`

- Description: TODO

#### `public static final int T_INT = 1`

- Description: TODO

#### `public static final int T_STR = 2`

- Description: TODO

#### `public static final int T_COORD = 3`

- Description: TODO

#### `public static final int T_UINT8 = 4`

- Description: TODO

#### `public static final int T_UINT16 = 5`

- Description: TODO

#### `public static final int T_COLOR = 6`

- Description: TODO

#### `public static final int T_FCOLOR = 7`

- Description: TODO

#### `public static final int T_TTOL = 8`

- Description: TODO

#### `public static final int T_INT8 = 9`

- Description: TODO

#### `public static final int T_INT16 = 10`

- Description: TODO

#### `public static final int T_NIL = 12`

- Description: TODO

#### `public static final int T_UID = 13`

- Description: TODO

#### `public static final int T_BYTES = 14`

- Description: TODO

#### `public static final int T_FLOAT32 = 15`

- Description: TODO

#### `public static final int T_FLOAT64 = 16`

- Description: TODO

#### `public static final int T_FCOORD32 = 18`

- Description: TODO

#### `public static final int T_FCOORD64 = 19`

- Description: TODO

#### `public static final int T_FLOAT8 = 21`

- Description: TODO

#### `public static final int T_FLOAT16 = 22`

- Description: TODO

#### `public static final int T_SNORM8 = 23`

- Description: TODO

#### `public static final int T_UNORM8 = 24`

- Description: TODO

#### `public static final int T_MNORM8 = 25`

- Description: TODO

#### `public static final int T_SNORM16 = 26`

- Description: TODO

#### `public static final int T_UNORM16 = 27`

- Description: TODO

#### `public static final int T_MNORM16 = 28`

- Description: TODO

#### `public static final int T_SNORM32 = 29`

- Description: TODO

#### `public static final int T_UNORM32 = 30`

- Description: TODO

#### `public static final int T_MNORM32 = 31`

- Description: TODO

#### `public static final int T_MAP = 32`

- Description: TODO

#### `public static final int T_LONG = 33`

- Description: TODO

#### `public static final int T_RESSPEC = 34`

- Description: TODO

#### `public static final int T_RESID = 35`

- Description: TODO

#### `public static final Message nil = new Message()`

- Description: TODO

### Fields

#### `private final static byte[] empty = new byte[0]`

- Description: TODO

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`

- Description: TODO

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`

- Description: TODO

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`

- Description: TODO

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`

- Description: TODO

#### `public byte[] rbuf = empty, wbuf = empty`

- Description: TODO

#### `public byte[] rbuf = empty, wbuf = empty`

- Description: TODO

#### `public Message msg`

- Description: TODO

### Methods

#### `public BinError(String message)`

- Description: TODO

#### `public BinError(String message, Throwable cause)`

- Description: TODO

#### `public BinError(Throwable cause)`

- Description: TODO

#### `public BinError msg(Message msg)`

- Description: TODO

#### `public EOF(String message)`

- Description: TODO

#### `public FormatError(String message)`

- Description: TODO

#### `public FormatError(String message, Throwable cause)`

- Description: TODO

#### `public abstract boolean underflow(int hint)`

- Description: TODO

#### `private void rensure(int len)`

- Description: TODO

#### `private int rget(int len)`

- Description: TODO

#### `public boolean eom()`

- Description: TODO

#### `public int int8()`

- Description: TODO

#### `public int uint8()`

- Description: TODO

#### `public int int16()`

- Description: TODO

#### `public int uint16()`

- Description: TODO

#### `public int int32()`

- Description: TODO

#### `public long uint32()`

- Description: TODO

#### `public long int64()`

- Description: TODO

#### `public UID uniqid()`

- Description: TODO

#### `public String string()`

- Description: TODO

#### `public void skip(int n)`

- Description: TODO

#### `public void skip()`

- Description: TODO

#### `public byte[] bytes(int n)`

- Description: TODO

#### `public byte[] bytes()`

- Description: TODO

#### `public void bytes(byte[] b, int off, int len)`

- Description: TODO

#### `public void bytes(byte[] b)`

- Description: TODO

#### `public Coord coord()`

- Description: TODO

#### `public Color color()`

- Description: TODO

#### `public FColor fcolor()`

- Description: TODO

#### `public float float8()`

- Description: TODO

#### `public float float16()`

- Description: TODO

#### `public float float32()`

- Description: TODO

#### `public double float64()`

- Description: TODO

#### `public double cpfloat()`

- Description: TODO

#### `public float snorm8()`

- Description: TODO

#### `public float unorm8()`

- Description: TODO

#### `public float mnorm8()`

- Description: TODO

#### `public float snorm16()`

- Description: TODO

#### `public float unorm16()`

- Description: TODO

#### `public float mnorm16()`

- Description: TODO

#### `public double snorm32()`

- Description: TODO

#### `public double unorm32()`

- Description: TODO

#### `public double mnorm32()`

- Description: TODO

#### `public Object tto0(int type, Function<Object, ? extends Object> mapper)`

- Description: TODO

#### `public Object tto(int type, Function<Object, ? extends Object> mapper)`

- Description: TODO

#### `public Object tto(int type)`

- Description: TODO

#### `public Object tto(Function<Object, ? extends Object> mapper)`

- Description: TODO

#### `public Object tto()`

- Description: TODO

#### `public Object[] list(Function<Object, ? extends Object> mapper)`

- Description: TODO

#### `public Object[] list()`

- Description: TODO

#### `public Map<Object, Object> map(Function<Object, ? extends Object> mapper)`

- Description: TODO

#### `public Map<Object, Object> map()`

- Description: TODO

#### `public abstract void overflow(int min)`

- Description: TODO

#### `private void wensure(int len)`

- Description: TODO

#### `private int wget(int len)`

- Description: TODO

#### `public Message addbytes(byte[] src, int off, int len)`

- Description: TODO

#### `public Message addbytes(byte[] src)`

- Description: TODO

#### `public Message addint8(byte num)`

- Description: TODO

#### `public Message adduint8(int num)`

- Description: TODO

#### `public Message addint16(short num)`

- Description: TODO

#### `public Message adduint16(int num)`

- Description: TODO

#### `public Message addint32(int num)`

- Description: TODO

#### `public Message adduint32(long num)`

- Description: TODO

#### `public Message addint64(long num)`

- Description: TODO

#### `public Message adduniqid(UID uid)`

- Description: TODO

#### `public Message addstring2(String str)`

- Description: TODO

#### `public Message addstring(String str)`

- Description: TODO

#### `public Message addcoord(Coord c)`

- Description: TODO

#### `public Message addcolor(Color color)`

- Description: TODO

#### `public Message addfloat8(float num)`

- Description: TODO

#### `public Message addfloat16(float num)`

- Description: TODO

#### `public Message addfloat32(float num)`

- Description: TODO

#### `public Message addfloat64(double num)`

- Description: TODO

#### `public Message addfcolor(FColor color)`

- Description: TODO

#### `public Message addtto(Object o)`

- Description: TODO

#### `public Message addlist(Object... args)`

- Description: TODO

#### `public Message addmap(Map<?, ?> map)`

- Description: TODO
