# Debug

This file documents the responsibilities and members of `Debug`.

## Meta

- Source: [Debug.java](../../../src/haven/Debug.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the debug Haven component.

## Nested Types

### DataException

- Role: Represents data exception within Debug.
- Description: Describes the nested data exception type used by the enclosing class.

### DumpGL

- Role: Represents dump gl within Debug.
- Description: Describes the nested dump gl type used by the enclosing class.

## Members

### Constants

#### `public static final int FRAME_DEBUG_KEY = java.awt.event.KeyEvent.VK_PAUSE`
- Role: Defines the shared frame debug key constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public static boolean kf1, kf2, kf3, kf4`
- Role: Tracks the kf4 flag.
- Description: Supports the kf4 operation used by the surrounding class.

#### `public static boolean kf1, kf2, kf3, kf4`
- Role: Tracks the kf4 flag.
- Description: Supports the kf4 operation used by the surrounding class.

#### `public static boolean kf1, kf2, kf3, kf4`
- Role: Tracks the kf4 flag.
- Description: Supports the kf4 operation used by the surrounding class.

#### `public static boolean kf1, kf2, kf3, kf4`
- Role: Tracks the kf4 flag.
- Description: Supports the kf4 operation used by the surrounding class.

#### `public static boolean pk1, pk2, pk3, pk4`
- Role: Tracks the pk4 flag.
- Description: Supports the pk4 operation used by the surrounding class.

#### `public static boolean pk1, pk2, pk3, pk4`
- Role: Tracks the pk4 flag.
- Description: Supports the pk4 operation used by the surrounding class.

#### `public static boolean pk1, pk2, pk3, pk4`
- Role: Tracks the pk4 flag.
- Description: Supports the pk4 operation used by the surrounding class.

#### `public static boolean pk1, pk2, pk3, pk4`
- Role: Tracks the pk4 flag.
- Description: Supports the pk4 operation used by the surrounding class.

#### `public static boolean fdk, pfdk, ff`
- Role: Tracks the ff flag.
- Description: Supports the ff operation used by the surrounding class.

#### `public static boolean fdk, pfdk, ff`
- Role: Tracks the ff flag.
- Description: Supports the ff operation used by the surrounding class.

#### `public static boolean fdk, pfdk, ff`
- Role: Tracks the ff flag.
- Description: Supports the ff operation used by the surrounding class.

#### `public static PrintWriter log = new PrintWriter(System.err)`
- Role: Stores the log value.
- Description: Backs the cached state for this file.

#### `public static List<Object> framestats = new ArrayList<>()`
- Role: Caches framestats entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final ByteArrayOutputStream buf`
- Role: Stores the buf value.
- Description: Backs the cached state for this file.

#### `static int dumpseq = 0`
- Role: Stores the dumpseq value.
- Description: Backs the cached state for this file.

#### `public final Serializable data`
- Role: Holds the data state.
- Description: Backs the cached state for this file.

### Methods

#### `public static void cycle(int modflags)`
- Role: Performs cycle.
- Description: Supports the cycle operation used by the surrounding class.

#### `public static void dumpimage(BufferedImage img, Path path)`
- Role: Performs dumpimage.
- Description: Supports the dumpimage operation used by the surrounding class.

#### `public static void dumpimage(BufferedImage img, String fn)`
- Role: Performs dumpimage.
- Description: Supports the dumpimage operation used by the surrounding class.

#### `public static void dumpimage(BufferedImage img)`
- Role: Performs dumpimage.
- Description: Supports the dumpimage operation used by the surrounding class.

#### `public static Path somedir(String basename)`
- Role: Performs somedir.
- Description: Supports the somedir operation used by the surrounding class.

#### `private static void dump_r(Object... stuff)`
- Role: Performs dump r.
- Description: Supports the dump r operation used by the surrounding class.

#### `public static void dump(Object... stuff)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public static <T> T dump1(T thing, boolean cond)`
- Role: Performs dump1.
- Description: Supports the dump1 operation used by the surrounding class.

#### `public static <T> T dump1(T thing, Function<? super T, ?> fmt)`
- Role: Performs dump1.
- Description: Supports the dump1 operation used by the surrounding class.

#### `public static <T> T dump1(T thing)`
- Role: Performs dump1.
- Description: Supports the dump1 operation used by the surrounding class.

#### `public static void dumpstack(Object... msg)`
- Role: Performs dumpstack.
- Description: Supports the dumpstack operation used by the surrounding class.

#### `public static <T> T time(Supplier<T> task)`
- Role: Performs time.
- Description: Supports the time operation used by the surrounding class.

#### `public static <T> T statprint(T line, boolean cond)`
- Role: Performs statprint.
- Description: Supports the statprint operation used by the surrounding class.

#### `public static void sleep(double t)`
- Role: Performs sleep.
- Description: Supports the sleep operation used by the surrounding class.

#### `private DumpGL(GL4bc bk, ByteArrayOutputStream buf)`
- Role: Performs dump gl.
- Description: Supports the dump gl operation used by the surrounding class.

#### `public DumpGL(GL4bc bk)`
- Role: Performs dump gl.
- Description: Supports the dump gl operation used by the surrounding class.

#### `public void reset()`
- Role: Performs reset.
- Description: Supports the reset operation used by the surrounding class.

#### `public void dump(String fn)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public static PrintWriter getdump()`
- Role: Performs getdump.
- Description: Supports the getdump operation used by the surrounding class.

#### `public DataException(String msg, Throwable cause, Serializable data)`
- Role: Performs data exception.
- Description: Supports the data exception operation used by the surrounding class.

#### `public DataException(String msg, Serializable data)`
- Role: Performs data exception.
- Description: Supports the data exception operation used by the surrounding class.
