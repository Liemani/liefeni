---
source: [Message.java](../../../../src/haven/Message.java)
created: 2026-06-13
updated: 2026-06-14
---

# Message

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
- Role: Caches the t end value.
- Description: Caches the `T_END` value for reuse.
- Value: `0`

#### `public static final int T_INT = 1`
- Role: Caches the t int value.
- Description: Caches the `T_INT` value for reuse.
- Value: `1`

#### `public static final int T_STR = 2`
- Role: Caches the t str value.
- Description: Caches the `T_STR` value for reuse.
- Value: `2`

#### `public static final int T_COORD = 3`
- Role: Caches the t coord value.
- Description: Caches the `T_COORD` value for reuse.
- Value: `3`

#### `public static final int T_UINT8 = 4`
- Role: Caches the t uint8 value.
- Description: Caches the `T_UINT8` value for reuse.
- Value: `4`

#### `public static final int T_UINT16 = 5`
- Role: Caches the t uint16 value.
- Description: Caches the `T_UINT16` value for reuse.
- Value: `5`

#### `public static final int T_COLOR = 6`
- Role: Caches the t color value.
- Description: Caches the `T_COLOR` value for reuse.
- Value: `6`

#### `public static final int T_FCOLOR = 7`
- Role: Caches the t fcolor value.
- Description: Caches the `T_FCOLOR` value for reuse.
- Value: `7`

#### `public static final int T_TTOL = 8`
- Role: Caches the t ttol value.
- Description: Caches the `T_TTOL` value for reuse.
- Value: `8`

#### `public static final int T_INT8 = 9`
- Role: Caches the t int8 value.
- Description: Caches the `T_INT8` value for reuse.
- Value: `9`

#### `public static final int T_INT16 = 10`
- Role: Caches the t int16 value.
- Description: Caches the `T_INT16` value for reuse.
- Value: `10`

#### `public static final int T_NIL = 12`
- Role: Caches the t nil value.
- Description: Caches the `T_NIL` value for reuse.
- Value: `12`

#### `public static final int T_UID = 13`
- Role: Caches the t uid value.
- Description: Caches the `T_UID` value for reuse.
- Value: `13`

#### `public static final int T_BYTES = 14`
- Role: Caches the t bytes value.
- Description: Caches the `T_BYTES` value for reuse.
- Value: `14`

#### `public static final int T_FLOAT32 = 15`
- Role: Caches the t float32 value.
- Description: Caches the `T_FLOAT32` value for reuse.
- Value: `15`

#### `public static final int T_FLOAT64 = 16`
- Role: Caches the t float64 value.
- Description: Caches the `T_FLOAT64` value for reuse.
- Value: `16`

#### `public static final int T_FCOORD32 = 18`
- Role: Caches the t fcoord32 value.
- Description: Caches the `T_FCOORD32` value for reuse.
- Value: `18`

#### `public static final int T_FCOORD64 = 19`
- Role: Caches the t fcoord64 value.
- Description: Caches the `T_FCOORD64` value for reuse.
- Value: `19`

#### `public static final int T_FLOAT8 = 21`
- Role: Caches the t float8 value.
- Description: Caches the `T_FLOAT8` value for reuse.
- Value: `21`

#### `public static final int T_FLOAT16 = 22`
- Role: Caches the t float16 value.
- Description: Caches the `T_FLOAT16` value for reuse.
- Value: `22`

#### `public static final int T_SNORM8 = 23`
- Role: Caches the t snorm8 value.
- Description: Caches the `T_SNORM8` value for reuse.
- Value: `23`

#### `public static final int T_UNORM8 = 24`
- Role: Caches the t unorm8 value.
- Description: Caches the `T_UNORM8` value for reuse.
- Value: `24`

#### `public static final int T_MNORM8 = 25`
- Role: Caches the t mnorm8 value.
- Description: Caches the `T_MNORM8` value for reuse.
- Value: `25`

#### `public static final int T_SNORM16 = 26`
- Role: Caches the t snorm16 value.
- Description: Caches the `T_SNORM16` value for reuse.
- Value: `26`

#### `public static final int T_UNORM16 = 27`
- Role: Caches the t unorm16 value.
- Description: Caches the `T_UNORM16` value for reuse.
- Value: `27`

#### `public static final int T_MNORM16 = 28`
- Role: Caches the t mnorm16 value.
- Description: Caches the `T_MNORM16` value for reuse.
- Value: `28`

#### `public static final int T_SNORM32 = 29`
- Role: Caches the t snorm32 value.
- Description: Caches the `T_SNORM32` value for reuse.
- Value: `29`

#### `public static final int T_UNORM32 = 30`
- Role: Caches the t unorm32 value.
- Description: Caches the `T_UNORM32` value for reuse.
- Value: `30`

#### `public static final int T_MNORM32 = 31`
- Role: Caches the t mnorm32 value.
- Description: Caches the `T_MNORM32` value for reuse.
- Value: `31`

#### `public static final int T_MAP = 32`
- Role: Caches the t map value.
- Description: Caches the `T_MAP` value for reuse.
- Value: `32`

#### `public static final int T_LONG = 33`
- Role: Caches the t long value.
- Description: Caches the `T_LONG` value for reuse.
- Value: `33`

#### `public static final int T_RESSPEC = 34`
- Role: Caches the t resspec value.
- Description: Caches the `T_RESSPEC` value for reuse.
- Value: `34`

#### `public static final int T_RESID = 35`
- Role: Caches the t resid value.
- Description: Caches the `T_RESID` value for reuse.
- Value: `35`

#### `public static final Message nil = new Message()`
- Role: Implements the nil operation.
- Description: Implements the message operation.
- Value: `new Message()`

### Fields

#### `private final static byte[] empty = new byte[0]`
- Role: Caches the empty value.
- Description: Caches the `empty` value for reuse.

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`
- Role: Caches the rh value.
- Description: Caches the `rh` value for reuse.

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`
- Role: Caches the rh value.
- Description: Caches the `rh` value for reuse.

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`
- Role: Caches the rh value.
- Description: Caches the `rh` value for reuse.

#### `public int rh = 0, rt = 0, wh = 0, wt = 0`
- Role: Caches the rh value.
- Description: Caches the `rh` value for reuse.

#### `public byte[] rbuf = empty, wbuf = empty`
- Role: Caches the rbuf value.
- Description: Caches the `rbuf` value for reuse.

#### `public byte[] rbuf = empty, wbuf = empty`
- Role: Caches the rbuf value.
- Description: Caches the `rbuf` value for reuse.

#### `public Message msg`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.

### Methods

#### `public BinError(String message)`
- Role: Handles the bin error path.
- Description: Implements the bin error operation.

#### `public BinError(String message, Throwable cause)`
- Role: Handles the bin error path.
- Description: Implements the bin error operation.

#### `public BinError(Throwable cause)`
- Role: Handles the bin error path.
- Description: Implements the bin error operation.

#### `public BinError msg(Message msg)`
- Role: Displays an in-game message.
- Description: Implements the msg operation.

#### `public EOF(String message)`
- Role: Handles the eof path.
- Description: Implements the eof operation.

#### `public FormatError(String message)`
- Role: Handles the format error path.
- Description: Implements the format error operation.

#### `public FormatError(String message, Throwable cause)`
- Role: Handles the format error path.
- Description: Implements the format error operation.

#### `public abstract boolean underflow(int hint)`
- Role: Handles the underflow path.
- Description: Implements the underflow operation.

#### `private void rensure(int len)`
- Role: Handles the rensure path.
- Description: Implements the rensure operation.

#### `private int rget(int len)`
- Role: Handles the rget path.
- Description: Implements the rget operation.

#### `public boolean eom()`
- Role: Handles the eom path.
- Description: Implements the eom operation.

#### `public int int8()`
- Role: Handles the int8 path.
- Description: Implements the int8 operation.

#### `public int uint8()`
- Role: Handles the uint8 path.
- Description: Implements the uint8 operation.

#### `public int int16()`
- Role: Handles the int16 path.
- Description: Implements the int16 operation.

#### `public int uint16()`
- Role: Handles the uint16 path.
- Description: Implements the uint16 operation.

#### `public int int32()`
- Role: Handles the int32 path.
- Description: Implements the int32 operation.

#### `public long uint32()`
- Role: Handles the uint32 path.
- Description: Implements the uint32 operation.

#### `public long int64()`
- Role: Handles the int64 path.
- Description: Implements the int64 operation.

#### `public UID uniqid()`
- Role: Handles the uniqid path.
- Description: Implements the uniqid operation.

#### `public String string()`
- Role: Handles the string path.
- Description: Implements the string operation.

#### `public void skip(int n)`
- Role: Handles the skip path.
- Description: Implements the skip operation.

#### `public void skip()`
- Role: Handles the skip path.
- Description: Implements the skip operation.

#### `public byte[] bytes(int n)`
- Role: Handles the bytes path.
- Description: Implements the bytes operation.

#### `public byte[] bytes()`
- Role: Handles the bytes path.
- Description: Implements the bytes operation.

#### `public void bytes(byte[] b, int off, int len)`
- Role: Handles the bytes path.
- Description: Implements the bytes operation.

#### `public void bytes(byte[] b)`
- Role: Handles the bytes path.
- Description: Implements the bytes operation.

#### `public Coord coord()`
- Role: Handles the coord path.
- Description: Implements the coord operation.

#### `public Color color()`
- Role: Handles the color path.
- Description: Implements the color operation.

#### `public FColor fcolor()`
- Role: Handles the fcolor path.
- Description: Implements the fcolor operation.

#### `public float float8()`
- Role: Handles the float8 path.
- Description: Implements the float8 operation.

#### `public float float16()`
- Role: Handles the float16 path.
- Description: Implements the float16 operation.

#### `public float float32()`
- Role: Handles the float32 path.
- Description: Implements the float32 operation.

#### `public double float64()`
- Role: Handles the float64 path.
- Description: Implements the float64 operation.

#### `public double cpfloat()`
- Role: Handles the cpfloat path.
- Description: Implements the cpfloat operation.

#### `public float snorm8()`
- Role: Handles the snorm8 path.
- Description: Implements the snorm8 operation.

#### `public float unorm8()`
- Role: Handles the unorm8 path.
- Description: Implements the unorm8 operation.

#### `public float mnorm8()`
- Role: Handles the mnorm8 path.
- Description: Implements the mnorm8 operation.

#### `public float snorm16()`
- Role: Handles the snorm16 path.
- Description: Implements the snorm16 operation.

#### `public float unorm16()`
- Role: Handles the unorm16 path.
- Description: Implements the unorm16 operation.

#### `public float mnorm16()`
- Role: Handles the mnorm16 path.
- Description: Implements the mnorm16 operation.

#### `public double snorm32()`
- Role: Handles the snorm32 path.
- Description: Implements the snorm32 operation.

#### `public double unorm32()`
- Role: Handles the unorm32 path.
- Description: Implements the unorm32 operation.

#### `public double mnorm32()`
- Role: Handles the mnorm32 path.
- Description: Implements the mnorm32 operation.

#### `public Object tto0(int type, Function<Object, ? extends Object> mapper)`
- Role: Handles the tto0 path.
- Description: Implements the tto0 operation.

#### `public Object tto(int type, Function<Object, ? extends Object> mapper)`
- Role: Handles the tto path.
- Description: Implements the tto operation.

#### `public Object tto(int type)`
- Role: Handles the tto path.
- Description: Implements the tto operation.

#### `public Object tto(Function<Object, ? extends Object> mapper)`
- Role: Handles the tto path.
- Description: Implements the tto operation.

#### `public Object tto()`
- Role: Handles the tto path.
- Description: Implements the tto operation.

#### `public Object[] list(Function<Object, ? extends Object> mapper)`
- Role: Handles the list path.
- Description: Implements the list operation.

#### `public Object[] list()`
- Role: Handles the list path.
- Description: Implements the list operation.

#### `public Map<Object, Object> map(Function<Object, ? extends Object> mapper)`
- Role: Handles the map path.
- Description: Implements the map operation.

#### `public Map<Object, Object> map()`
- Role: Handles the map path.
- Description: Implements the map operation.

#### `public abstract void overflow(int min)`
- Role: Handles the overflow path.
- Description: Implements the overflow operation.

#### `private void wensure(int len)`
- Role: Handles the wensure path.
- Description: Implements the wensure operation.

#### `private int wget(int len)`
- Role: Handles the wget path.
- Description: Implements the wget operation.

#### `public Message addbytes(byte[] src, int off, int len)`
- Role: Handles the addbytes path.
- Description: Adds the bytes.

#### `public Message addbytes(byte[] src)`
- Role: Handles the addbytes path.
- Description: Adds the bytes.

#### `public Message addint8(byte num)`
- Role: Handles the addint8 path.
- Description: Adds the int8.

#### `public Message adduint8(int num)`
- Role: Handles the adduint8 path.
- Description: Adds the uint8.

#### `public Message addint16(short num)`
- Role: Handles the addint16 path.
- Description: Adds the int16.

#### `public Message adduint16(int num)`
- Role: Handles the adduint16 path.
- Description: Adds the uint16.

#### `public Message addint32(int num)`
- Role: Handles the addint32 path.
- Description: Adds the int32.

#### `public Message adduint32(long num)`
- Role: Handles the adduint32 path.
- Description: Adds the uint32.

#### `public Message addint64(long num)`
- Role: Handles the addint64 path.
- Description: Adds the int64.

#### `public Message adduniqid(UID uid)`
- Role: Handles the adduniqid path.
- Description: Adds the uniqid.

#### `public Message addstring2(String str)`
- Role: Handles the addstring2 path.
- Description: Adds the string2.

#### `public Message addstring(String str)`
- Role: Handles the addstring path.
- Description: Adds the string.

#### `public Message addcoord(Coord c)`
- Role: Handles the addcoord path.
- Description: Adds the coord.

#### `public Message addcolor(Color color)`
- Role: Handles the addcolor path.
- Description: Adds the color.

#### `public Message addfloat8(float num)`
- Role: Handles the addfloat8 path.
- Description: Adds the float8.

#### `public Message addfloat16(float num)`
- Role: Handles the addfloat16 path.
- Description: Adds the float16.

#### `public Message addfloat32(float num)`
- Role: Handles the addfloat32 path.
- Description: Adds the float32.

#### `public Message addfloat64(double num)`
- Role: Handles the addfloat64 path.
- Description: Adds the float64.

#### `public Message addfcolor(FColor color)`
- Role: Handles the addfcolor path.
- Description: Adds the fcolor.

#### `public Message addtto(Object o)`
- Role: Handles the addtto path.
- Description: Adds the tto.

#### `public Message addlist(Object... args)`
- Role: Handles the addlist path.
- Description: Adds the list.

#### `public Message addmap(Map<?, ?> map)`
- Role: Handles the addmap path.
- Description: Adds the map.