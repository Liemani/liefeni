---
source: [Debug.java](../../../../src/haven/Debug.java)
created: 2026-06-13
updated: 2026-06-14
---

# Debug

Represents the debug Haven component.

## Nested Types

### DataException

- Role: Captures an exception together with serialized debug data.
- Description: Stores extra payload for later inspection or dump output.

### DumpGL

- Role: Wraps a traced OpenGL backend for debug dumping.
- Description: Records GL calls into an in-memory buffer and can write the trace to disk.

## Members

### Constants

#### `public static final int FRAME_DEBUG_KEY = java.awt.event.KeyEvent.VK_PAUSE`
- Role: Caches the frame debug key value.
- Description: Caches the `FRAME_DEBUG_KEY` value for reuse.
- Value: `java.awt.event.KeyEvent.VK_PAUSE`

### Fields

#### `public static boolean kf1, kf2, kf3, kf4`
- Role: Tracks the kf4 flag.
- Description: Caches the `kf4` value for reuse.

#### `public static boolean kf1, kf2, kf3, kf4`
- Role: Tracks the kf4 flag.
- Description: Caches the `kf4` value for reuse.

#### `public static boolean kf1, kf2, kf3, kf4`
- Role: Tracks the kf4 flag.
- Description: Caches the `kf4` value for reuse.

#### `public static boolean kf1, kf2, kf3, kf4`
- Role: Tracks the kf4 flag.
- Description: Caches the `kf4` value for reuse.

#### `public static boolean pk1, pk2, pk3, pk4`
- Role: Tracks the pk4 flag.
- Description: Caches the `pk4` value for reuse.

#### `public static boolean pk1, pk2, pk3, pk4`
- Role: Tracks the pk4 flag.
- Description: Caches the `pk4` value for reuse.

#### `public static boolean pk1, pk2, pk3, pk4`
- Role: Tracks the pk4 flag.
- Description: Caches the `pk4` value for reuse.

#### `public static boolean pk1, pk2, pk3, pk4`
- Role: Tracks the pk4 flag.
- Description: Caches the `pk4` value for reuse.

#### `public static boolean fdk, pfdk, ff`
- Role: Tracks the ff flag.
- Description: Caches the `ff` value for reuse.

#### `public static boolean fdk, pfdk, ff`
- Role: Tracks the ff flag.
- Description: Caches the `ff` value for reuse.

#### `public static boolean fdk, pfdk, ff`
- Role: Tracks the ff flag.
- Description: Caches the `ff` value for reuse.

#### `public static PrintWriter log = new PrintWriter(System.err)`
- Role: Implements the log operation.
- Description: Implements the print writer operation.

#### `public static List<Object> framestats = new ArrayList<>()`
- Role: Implements the framestats operation.
- Description: Implements the public static list<object> framestats = new array list<>() operation.

#### `public final ByteArrayOutputStream buf`
- Role: Caches the buf value.
- Description: Caches the `buf` value for reuse.

#### `static int dumpseq = 0`
- Role: Caches the dumpseq value.
- Description: Caches the `dumpseq` value for reuse.

#### `public final Serializable data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

### Methods

#### `public static void cycle(int modflags)`
- Role: Handles the cycle path.
- Description: Implements the cycle operation.

#### `public static void dumpimage(BufferedImage img, Path path)`
- Role: Handles the dumpimage path.
- Description: Implements the dumpimage operation.

#### `public static void dumpimage(BufferedImage img, String fn)`
- Role: Handles the dumpimage path.
- Description: Implements the dumpimage operation.

#### `public static void dumpimage(BufferedImage img)`
- Role: Handles the dumpimage path.
- Description: Implements the dumpimage operation.

#### `public static Path somedir(String basename)`
- Role: Handles the somedir path.
- Description: Implements the somedir operation.

#### `private static void dump_r(Object... stuff)`
- Role: Handles the dump r path.
- Description: Implements the dump r operation.

#### `public static void dump(Object... stuff)`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public static <T> T dump1(T thing, boolean cond)`
- Role: Handles the dump1 path.
- Description: Implements the dump1 operation.

#### `public static <T> T dump1(T thing, Function<? super T, ?> fmt)`
- Role: Handles the dump1 path.
- Description: Implements the dump1 operation.

#### `public static <T> T dump1(T thing)`
- Role: Handles the dump1 path.
- Description: Implements the dump1 operation.

#### `public static void dumpstack(Object... msg)`
- Role: Handles the dumpstack path.
- Description: Implements the dumpstack operation.

#### `public static <T> T time(Supplier<T> task)`
- Role: Handles the time path.
- Description: Implements the time operation.

#### `public static <T> T statprint(T line, boolean cond)`
- Role: Handles the statprint path.
- Description: Implements the statprint operation.

#### `public static void sleep(double t)`
- Role: Handles the sleep path.
- Description: Implements the sleep operation.

#### `private DumpGL(GL4bc bk, ByteArrayOutputStream buf)`
- Role: Handles the dump gl path.
- Description: Implements the dump gl operation.

#### `public DumpGL(GL4bc bk)`
- Role: Handles the dump gl path.
- Description: Implements the dump gl operation.

#### `public void reset()`
- Role: Resets the stream if mark/reset is supported.
- Description: Resets the stream if mark/reset is supported.

#### `public void dump(String fn)`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public static PrintWriter getdump()`
- Role: Handles the getdump path.
- Description: Returns the dump.

#### `public DataException(String msg, Throwable cause, Serializable data)`
- Role: Handles the data exception path.
- Description: Implements the data exception operation.

#### `public DataException(String msg, Serializable data)`
- Role: Handles the data exception path.
- Description: Implements the data exception operation.