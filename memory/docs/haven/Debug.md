# Debug

This file documents the responsibilities and members of `Debug`.

## Meta

- Source: [Debug.java](../../../src/haven/Debug.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides debug utilities.

## Nested Types

### DataException

- Description: TODO

### DumpGL

- Description: TODO

## Members

### Constants

#### `public static final int FRAME_DEBUG_KEY = java.awt.event.KeyEvent.VK_PAUSE`

- Description: TODO

### Fields

#### `public static boolean kf1, kf2, kf3, kf4`

- Description: TODO

#### `public static boolean kf1, kf2, kf3, kf4`

- Description: TODO

#### `public static boolean kf1, kf2, kf3, kf4`

- Description: TODO

#### `public static boolean kf1, kf2, kf3, kf4`

- Description: TODO

#### `public static boolean pk1, pk2, pk3, pk4`

- Description: TODO

#### `public static boolean pk1, pk2, pk3, pk4`

- Description: TODO

#### `public static boolean pk1, pk2, pk3, pk4`

- Description: TODO

#### `public static boolean pk1, pk2, pk3, pk4`

- Description: TODO

#### `public static boolean fdk, pfdk, ff`

- Description: TODO

#### `public static boolean fdk, pfdk, ff`

- Description: TODO

#### `public static boolean fdk, pfdk, ff`

- Description: TODO

#### `public static PrintWriter log = new PrintWriter(System.err)`

- Description: TODO

#### `public static List<Object> framestats = new ArrayList<>()`

- Description: TODO

#### `public final ByteArrayOutputStream buf`

- Description: TODO

#### `static int dumpseq = 0`

- Description: TODO

#### `public final Serializable data`

- Description: TODO

### Methods

#### `public static void cycle(int modflags)`

- Description: TODO

#### `public static void dumpimage(BufferedImage img, Path path)`

- Description: TODO

#### `public static void dumpimage(BufferedImage img, String fn)`

- Description: TODO

#### `public static void dumpimage(BufferedImage img)`

- Description: TODO

#### `public static Path somedir(String basename)`

- Description: TODO

#### `private static void dump_r(Object... stuff)`

- Description: TODO

#### `public static void dump(Object... stuff)`

- Description: TODO

#### `public static <T> T dump1(T thing, boolean cond)`

- Description: TODO

#### `public static <T> T dump1(T thing, Function<? super T, ?> fmt)`

- Description: TODO

#### `public static <T> T dump1(T thing)`

- Description: TODO

#### `public static void dumpstack(Object... msg)`

- Description: TODO

#### `public static <T> T time(Supplier<T> task)`

- Description: TODO

#### `public static <T> T statprint(T line, boolean cond)`

- Description: TODO

#### `public static void sleep(double t)`

- Description: TODO

#### `private DumpGL(GL4bc bk, ByteArrayOutputStream buf)`

- Description: TODO

#### `public DumpGL(GL4bc bk)`

- Description: TODO

#### `public void reset()`

- Description: TODO

#### `public void dump(String fn)`

- Description: TODO

#### `public static PrintWriter getdump()`

- Description: TODO

#### `public DataException(String msg, Throwable cause, Serializable data)`

- Description: TODO

#### `public DataException(String msg, Serializable data)`

- Description: TODO
