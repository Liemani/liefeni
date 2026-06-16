# Message

This file documents the responsibilities and members of `Message`.

## Meta

- Source: [Message.java](../../../src/haven/Message.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a binary message buffer.

## Nested Types

### BinError

- Role: Represents bin error within Message.
- Description: Describes the nested bin error type used by the enclosing class.

### EOF

- Role: Represents eof within Message.
- Description: Describes the nested eof type used by the enclosing class.

### FormatError

- Role: Represents format error within Message.
- Description: Describes the nested format error type used by the enclosing class.

## Members

### Constants

#### `public static final int T_END = 0`
- Role: Defines the shared t end constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_INT = 1`
- Role: Defines the shared t int constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_STR = 2`
- Role: Defines the shared t str constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_COORD = 3`
- Role: Defines the shared t coord constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_UINT8 = 4`
- Role: Defines the shared t uint8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_UINT16 = 5`
- Role: Defines the shared t uint16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_COLOR = 6`
- Role: Defines the shared t color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_FCOLOR = 7`
- Role: Defines the shared t fcolor constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_TTOL = 8`
- Role: Defines the shared t ttol constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_INT8 = 9`
- Role: Defines the shared t int8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_INT16 = 10`
- Role: Defines the shared t int16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_NIL = 12`
- Role: Defines the shared t nil constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_UID = 13`
- Role: Defines the shared t uid constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_BYTES = 14`
- Role: Defines the shared t bytes constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_FLOAT32 = 15`
- Role: Defines the shared t float32 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_FLOAT64 = 16`
- Role: Defines the shared t float64 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_FCOORD32 = 18`
- Role: Defines the shared t fcoord32 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_FCOORD64 = 19`
- Role: Defines the shared t fcoord64 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_FLOAT8 = 21`
- Role: Defines the shared t float8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_FLOAT16 = 22`
- Role: Defines the shared t float16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_SNORM8 = 23`
- Role: Defines the shared t snorm8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_UNORM8 = 24`
- Role: Defines the shared t unorm8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_MNORM8 = 25`
- Role: Defines the shared t mnorm8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_SNORM16 = 26`
- Role: Defines the shared t snorm16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_UNORM16 = 27`
- Role: Defines the shared t unorm16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_MNORM16 = 28`
- Role: Defines the shared t mnorm16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_SNORM32 = 29`
- Role: Defines the shared t snorm32 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_UNORM32 = 30`
- Role: Defines the shared t unorm32 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_MNORM32 = 31`
- Role: Defines the shared t mnorm32 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_MAP = 32`
- Role: Defines the shared t map constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_LONG = 33`
- Role: Defines the shared t long constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_RESSPEC = 34`
- Role: Defines the shared t resspec constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int T_RESID = 35`
- Role: Defines the shared t resid constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Message nil = new Message()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final static byte[] empty = new byte[0]`
- Role: Stores the empty value.
- Description: Backs the cached state for this file.

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`
- Role: Stores the rh value.
- Description: Backs the cached state for this file.

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`
- Role: Stores the rh value.
- Description: Backs the cached state for this file.

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`
- Role: Stores the rh value.
- Description: Backs the cached state for this file.

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`
- Role: Stores the rh value.
- Description: Backs the cached state for this file.

#### `public byte[] rbuf = empty, wbuf = empty`
- Role: Stores the rbuf value.
- Description: Backs the cached state for this file.

#### `public byte[] rbuf = empty, wbuf = empty`
- Role: Stores the rbuf value.
- Description: Backs the cached state for this file.

#### `public Message msg`
- Role: Holds the msg state.
- Description: Backs the cached state for this file.

### Methods

#### `public BinError(String message)`
- Role: Performs bin error.
- Description: Supports the bin error operation used by the surrounding class.

#### `public BinError(String message, Throwable cause)`
- Role: Performs bin error.
- Description: Supports the bin error operation used by the surrounding class.

#### `public BinError(Throwable cause)`
- Role: Performs bin error.
- Description: Supports the bin error operation used by the surrounding class.

#### `public BinError msg(Message msg)`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.

#### `public EOF(String message)`
- Role: Performs eof.
- Description: Supports the eof operation used by the surrounding class.

#### `public FormatError(String message)`
- Role: Performs format error.
- Description: Supports the format error operation used by the surrounding class.

#### `public FormatError(String message, Throwable cause)`
- Role: Performs format error.
- Description: Supports the format error operation used by the surrounding class.

#### `public abstract boolean underflow(int hint)`
- Role: Performs underflow.
- Description: Supports the underflow operation used by the surrounding class.

#### `private void rensure(int len)`
- Role: Performs rensure.
- Description: Supports the rensure operation used by the surrounding class.

#### `private int rget(int len)`
- Role: Performs rget.
- Description: Supports the rget operation used by the surrounding class.

#### `public boolean eom()`
- Role: Performs eom.
- Description: Supports the eom operation used by the surrounding class.

#### `public int int8()`
- Role: Performs int8.
- Description: Supports the int8 operation used by the surrounding class.

#### `public int uint8()`
- Role: Performs uint8.
- Description: Supports the uint8 operation used by the surrounding class.

#### `public int int16()`
- Role: Performs int16.
- Description: Supports the int16 operation used by the surrounding class.

#### `public int uint16()`
- Role: Performs uint16.
- Description: Supports the uint16 operation used by the surrounding class.

#### `public int int32()`
- Role: Performs int32.
- Description: Supports the int32 operation used by the surrounding class.

#### `public long uint32()`
- Role: Performs uint32.
- Description: Supports the uint32 operation used by the surrounding class.

#### `public long int64()`
- Role: Performs int64.
- Description: Supports the int64 operation used by the surrounding class.

#### `public UID uniqid()`
- Role: Performs uniqid.
- Description: Supports the uniqid operation used by the surrounding class.

#### `public String string()`
- Role: Performs string.
- Description: Supports the string operation used by the surrounding class.

#### `public void skip(int n)`
- Role: Performs skip.
- Description: Supports the skip operation used by the surrounding class.

#### `public void skip()`
- Role: Performs skip.
- Description: Supports the skip operation used by the surrounding class.

#### `public byte[] bytes(int n)`
- Role: Performs bytes.
- Description: Supports the bytes operation used by the surrounding class.

#### `public byte[] bytes()`
- Role: Performs bytes.
- Description: Supports the bytes operation used by the surrounding class.

#### `public void bytes(byte[] b, int off, int len)`
- Role: Performs bytes.
- Description: Supports the bytes operation used by the surrounding class.

#### `public void bytes(byte[] b)`
- Role: Performs bytes.
- Description: Supports the bytes operation used by the surrounding class.

#### `public Coord coord()`
- Role: Performs coord.
- Description: Supports the coord operation used by the surrounding class.

#### `public Color color()`
- Role: Performs color.
- Description: Supports the color operation used by the surrounding class.

#### `public FColor fcolor()`
- Role: Performs fcolor.
- Description: Supports the fcolor operation used by the surrounding class.

#### `public float float8()`
- Role: Performs float8.
- Description: Supports the float8 operation used by the surrounding class.

#### `public float float16()`
- Role: Performs float16.
- Description: Supports the float16 operation used by the surrounding class.

#### `public float float32()`
- Role: Performs float32.
- Description: Supports the float32 operation used by the surrounding class.

#### `public double float64()`
- Role: Performs float64.
- Description: Supports the float64 operation used by the surrounding class.

#### `public double cpfloat()`
- Role: Performs cpfloat.
- Description: Supports the cpfloat operation used by the surrounding class.

#### `public float snorm8()`
- Role: Performs snorm8.
- Description: Supports the snorm8 operation used by the surrounding class.

#### `public float unorm8()`
- Role: Performs unorm8.
- Description: Supports the unorm8 operation used by the surrounding class.

#### `public float mnorm8()`
- Role: Performs mnorm8.
- Description: Supports the mnorm8 operation used by the surrounding class.

#### `public float snorm16()`
- Role: Performs snorm16.
- Description: Supports the snorm16 operation used by the surrounding class.

#### `public float unorm16()`
- Role: Performs unorm16.
- Description: Supports the unorm16 operation used by the surrounding class.

#### `public float mnorm16()`
- Role: Performs mnorm16.
- Description: Supports the mnorm16 operation used by the surrounding class.

#### `public double snorm32()`
- Role: Performs snorm32.
- Description: Supports the snorm32 operation used by the surrounding class.

#### `public double unorm32()`
- Role: Performs unorm32.
- Description: Supports the unorm32 operation used by the surrounding class.

#### `public double mnorm32()`
- Role: Performs mnorm32.
- Description: Supports the mnorm32 operation used by the surrounding class.

#### `public Object tto0(int type, Function<Object, ? extends Object> mapper)`
- Role: Performs tto0.
- Description: Supports the tto0 operation used by the surrounding class.

#### `public Object tto(int type, Function<Object, ? extends Object> mapper)`
- Role: Performs tto.
- Description: Supports the tto operation used by the surrounding class.

#### `public Object tto(int type)`
- Role: Performs tto.
- Description: Supports the tto operation used by the surrounding class.

#### `public Object tto(Function<Object, ? extends Object> mapper)`
- Role: Performs tto.
- Description: Supports the tto operation used by the surrounding class.

#### `public Object tto()`
- Role: Performs tto.
- Description: Supports the tto operation used by the surrounding class.

#### `public Object[] list(Function<Object, ? extends Object> mapper)`
- Role: Performs list.
- Description: Supports the list operation used by the surrounding class.

#### `public Object[] list()`
- Role: Performs list.
- Description: Supports the list operation used by the surrounding class.

#### `public Map<Object, Object> map(Function<Object, ? extends Object> mapper)`
- Role: Performs map.
- Description: Supports the map operation used by the surrounding class.

#### `public Map<Object, Object> map()`
- Role: Performs map.
- Description: Supports the map operation used by the surrounding class.

#### `public abstract void overflow(int min)`
- Role: Performs overflow.
- Description: Supports the overflow operation used by the surrounding class.

#### `private void wensure(int len)`
- Role: Performs wensure.
- Description: Supports the wensure operation used by the surrounding class.

#### `private int wget(int len)`
- Role: Performs wget.
- Description: Supports the wget operation used by the surrounding class.

#### `public Message addbytes(byte[] src, int off, int len)`
- Role: Performs addbytes.
- Description: Supports the addbytes operation used by the surrounding class.

#### `public Message addbytes(byte[] src)`
- Role: Performs addbytes.
- Description: Supports the addbytes operation used by the surrounding class.

#### `public Message addint8(byte num)`
- Role: Performs addint8.
- Description: Supports the addint8 operation used by the surrounding class.

#### `public Message adduint8(int num)`
- Role: Performs adduint8.
- Description: Supports the adduint8 operation used by the surrounding class.

#### `public Message addint16(short num)`
- Role: Performs addint16.
- Description: Supports the addint16 operation used by the surrounding class.

#### `public Message adduint16(int num)`
- Role: Performs adduint16.
- Description: Supports the adduint16 operation used by the surrounding class.

#### `public Message addint32(int num)`
- Role: Performs addint32.
- Description: Supports the addint32 operation used by the surrounding class.

#### `public Message adduint32(long num)`
- Role: Performs adduint32.
- Description: Supports the adduint32 operation used by the surrounding class.

#### `public Message addint64(long num)`
- Role: Performs addint64.
- Description: Supports the addint64 operation used by the surrounding class.

#### `public Message adduniqid(UID uid)`
- Role: Performs adduniqid.
- Description: Supports the adduniqid operation used by the surrounding class.

#### `public Message addstring2(String str)`
- Role: Performs addstring2.
- Description: Supports the addstring2 operation used by the surrounding class.

#### `public Message addstring(String str)`
- Role: Performs addstring.
- Description: Supports the addstring operation used by the surrounding class.

#### `public Message addcoord(Coord c)`
- Role: Performs addcoord.
- Description: Supports the addcoord operation used by the surrounding class.

#### `public Message addcolor(Color color)`
- Role: Performs addcolor.
- Description: Supports the addcolor operation used by the surrounding class.

#### `public Message addfloat8(float num)`
- Role: Performs addfloat8.
- Description: Supports the addfloat8 operation used by the surrounding class.

#### `public Message addfloat16(float num)`
- Role: Performs addfloat16.
- Description: Supports the addfloat16 operation used by the surrounding class.

#### `public Message addfloat32(float num)`
- Role: Performs addfloat32.
- Description: Supports the addfloat32 operation used by the surrounding class.

#### `public Message addfloat64(double num)`
- Role: Performs addfloat64.
- Description: Supports the addfloat64 operation used by the surrounding class.

#### `public Message addfcolor(FColor color)`
- Role: Performs addfcolor.
- Description: Supports the addfcolor operation used by the surrounding class.

#### `public Message addtto(Object o)`
- Role: Performs addtto.
- Description: Supports the addtto operation used by the surrounding class.

#### `public Message addlist(Object... args)`
- Role: Performs addlist.
- Description: Supports the addlist operation used by the surrounding class.

#### `public Message addmap(Map<?, ?> map)`
- Role: Performs addmap.
- Description: Supports the addmap operation used by the surrounding class.
