# Utils

This file documents the responsibilities and members of `Utils`.

## Meta

- Source: [Utils.java](../../../src/haven/Utils.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides broad Haven utility helpers.

## Nested Types

### AddressFormatException

- Description: TODO

### Base64

- Description: TODO

### BinAscii

- Description: TODO

### IOFunction

- Description: TODO

### MapBuilder

- Description: TODO

### Range

- Description: TODO

## Members

### Constants

#### `public static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8")`

- Description: TODO

#### `public static final java.nio.charset.Charset ascii = java.nio.charset.Charset.forName("US-ASCII")`

- Description: TODO

#### `public static final java.awt.image.ColorModel rgbm = java.awt.image.ColorModel.getRGBdefault()`

- Description: TODO

#### `public static final Config.Variable<String> prefspec = Config.Variable.prop("haven.prefspec", "hafen")`

- Description: TODO

#### `public static final BinAscii hex = new BinAscii()`

- Description: TODO

#### `public static final BinAscii bprint = new BinAscii()`

- Description: TODO

#### `public static final Base64 b64 = new Base64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=')`

- Description: TODO

#### `public static final Base64 b64np = new Base64(b64.set, '\0')`

- Description: TODO

#### `public static final Base64 ub64 = new Base64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '\0')`

- Description: TODO

#### `public static final Color[] vgapal`

- Description: TODO

#### `private static final long rtimeoff = System.nanoTime()`

- Description: TODO

#### `public static final Comparator<Object> idcmp = new Comparator<Object>()`

- Description: TODO

### Fields

#### `private static Preferences prefs = null`

- Description: TODO

#### `public final String set`

- Description: TODO

#### `public final char pad`

- Description: TODO

#### `private final byte[] rev`

- Description: TODO

#### `private final Map<K, V> bk`

- Description: TODO

#### `public final int min, max, step`

- Description: TODO

#### `public final int min, max, step`

- Description: TODO

#### `public final int min, max, step`

- Description: TODO

#### `public final String addr, type`

- Description: TODO

#### `public final String addr, type`

- Description: TODO

### Methods

#### `static Coord imgsz(BufferedImage img)`

- Description: TODO

#### `public static boolean checkhit(BufferedImage img, Coord c, int thres)`

- Description: TODO

#### `public static boolean checkhit(BufferedImage img, Coord c)`

- Description: TODO

#### `public static void defer(final Runnable r)`

- Description: TODO

#### `public static URI uri(String uri)`

- Description: TODO

#### `public static URL url(URI uri)`

- Description: TODO

#### `public static URL url(String url)`

- Description: TODO

#### `public static Path path(String path)`

- Description: TODO

#### `public static Path pj(Path base, String... els)`

- Description: TODO

#### `public static Path srcpath(Class<?> cl)`

- Description: TODO

#### `public static SocketChannel connect(String host, int port) throws IOException`

- Description: TODO

#### `public static SocketChannel connect(NamedSocketAddress addr) throws IOException`

- Description: TODO

#### `public static int drawtext(Graphics g, String text, Coord c)`

- Description: TODO

#### `static Coord textsz(Graphics g, String text)`

- Description: TODO

#### `static void aligntext(Graphics g, String text, Coord c, double ax, double ay)`

- Description: TODO

#### `public static String fpformat(int num, int div, int dec)`

- Description: TODO

#### `public static String thformat(long num)`

- Description: TODO

#### `public static String odformat(double num, int md)`

- Description: TODO

#### `public static String odformat2(double num, int md)`

- Description: TODO

#### `static void line(Graphics g, Coord c1, Coord c2)`

- Description: TODO

#### `static void AA(Graphics g)`

- Description: TODO

#### `public static Random mkrandoom(long seed)`

- Description: TODO

#### `public static double fgrandoom(Random rnd)`

- Description: TODO

#### `private static Map<Object, Object> sysprefs()`

- Description: TODO

#### `public static Preferences prefs()`

- Description: TODO

#### `public static String getpref(String prefname, String def)`

- Description: TODO

#### `public static void setpref(String prefname, String val)`

- Description: TODO

#### `public static int getprefi(String prefname, int def)`

- Description: TODO

#### `public static void setprefi(String prefname, int val)`

- Description: TODO

#### `public static double getprefd(String prefname, double def)`

- Description: TODO

#### `public static void setprefd(String prefname, double val)`

- Description: TODO

#### `public static boolean getprefb(String prefname, boolean def)`

- Description: TODO

#### `public static void setprefb(String prefname, boolean val)`

- Description: TODO

#### `public static Coord getprefc(String prefname, Coord def)`

- Description: TODO

#### `public static void setprefc(String prefname, Coord val)`

- Description: TODO

#### `public static byte[] getprefb(String prefname, byte[] def)`

- Description: TODO

#### `public static void setprefb(String prefname, byte[] val)`

- Description: TODO

#### `public static List<String> getprefsl(String prefname, String[] def)`

- Description: TODO

#### `public static void setprefsl(String prefname, Iterable<? extends CharSequence> val)`

- Description: TODO

#### `public static String getprop(String propname, String def)`

- Description: TODO

#### `public static String sv(Object arg)`

- Description: TODO

#### `public static List<?> olv(Object arg)`

- Description: TODO

#### `public static Object[] oav(Object arg)`

- Description: TODO

#### `public static int iv(Object arg)`

- Description: TODO

#### `public static long uiv(Object arg)`

- Description: TODO

#### `public static float fv(Object arg)`

- Description: TODO

#### `public static double dv(Object arg)`

- Description: TODO

#### `public static boolean bv(Object arg)`

- Description: TODO

#### `public static Indir<Resource> irv(Object arg)`

- Description: TODO

#### `public static Resource resv(Object arg)`

- Description: TODO

#### `public static <K, V> Map<K, V> mapdecn(Object ob, Class<K> kt, Class<V> vt)`

- Description: TODO

#### `public static Map<Object, Object> mapdecn(Object ob)`

- Description: TODO

#### `public static Object mapencn(Map<?, ?> map)`

- Description: TODO

#### `public static <K, V> Map<K, V> mapdecf(Object ob, Class<K> kt, Class<V> vt)`

- Description: TODO

#### `public static Map<Object, Object> mapdecf(Object ob)`

- Description: TODO

#### `public static Object mapencf(Map<?, ?> map)`

- Description: TODO

#### `public static int sb(int n, int b)`

- Description: TODO

#### `public static long sb(long n, int b)`

- Description: TODO

#### `public static int ub(byte b)`

- Description: TODO

#### `public static byte sb(int b)`

- Description: TODO

#### `public static byte f2s8(float v)`

- Description: TODO

#### `public static byte f2u8(float v)`

- Description: TODO

#### `public static long uint32(int n)`

- Description: TODO

#### `public static int uint16d(byte[] buf, int off)`

- Description: TODO

#### `public static int int16d(byte[] buf, int off)`

- Description: TODO

#### `public static long uint32d(byte[] buf, int off)`

- Description: TODO

#### `public static void uint32e(long num, byte[] buf, int off)`

- Description: TODO

#### `public static int int32d(byte[] buf, int off)`

- Description: TODO

#### `public static long int64d(byte[] buf, int off)`

- Description: TODO

#### `public static int intvard(byte[] buf, int off)`

- Description: TODO

#### `public static void int64e(long num, byte[] buf, int off)`

- Description: TODO

#### `public static void int32e(int num, byte[] buf, int off)`

- Description: TODO

#### `public static void uint16e(int num, byte[] buf, int off)`

- Description: TODO

#### `public static void int16e(short num, byte[] buf, int off)`

- Description: TODO

#### `public static String strd(byte[] buf, int[] off)`

- Description: TODO

#### `public static double floatd(byte[] buf, int off)`

- Description: TODO

#### `public static float float32d(byte[] buf, int off)`

- Description: TODO

#### `public static double float64d(byte[] buf, int off)`

- Description: TODO

#### `public static void float32e(float num, byte[] buf, int off)`

- Description: TODO

#### `public static void float64e(double num, byte[] buf, int off)`

- Description: TODO

#### `public static void float9995d(int word, float[] ret)`

- Description: TODO

#### `public static float hfdec(short bits)`

- Description: TODO

#### `public static short hfenc(float f)`

- Description: TODO

#### `public static float mfdec(byte bits)`

- Description: TODO

#### `public static byte mfenc(float f)`

- Description: TODO

#### `public static void uvec2oct(float[] buf, float x, float y, float z)`

- Description: TODO

#### `public static void oct2uvec(float[] buf, float x, float y)`

- Description: TODO

#### `public static Coord3f oct2uvec(float x, float y)`

- Description: TODO

#### `public String enc(byte[] data)`

- Description: TODO

#### `public byte[] dec(String data)`

- Description: TODO

#### `public static char num2hex(int num, boolean upper)`

- Description: TODO

#### `public static int hex2num(char hex)`

- Description: TODO

#### `public Base64(String set, char pad)`

- Description: TODO

#### `public String enc(byte[] in)`

- Description: TODO

#### `public byte[] dec(String in)`

- Description: TODO

#### `public static String[] splitwords(String text)`

- Description: TODO

#### `public static String[] splitlines(String text)`

- Description: TODO

#### `static int atoi(String a)`

- Description: TODO

#### `static void readtileof(InputStream in) throws IOException`

- Description: TODO

#### `public static byte[] readall(InputStream in) throws IOException`

- Description: TODO

#### `public T run() throws IOException`

- Description: TODO

#### `public static <T> T ioretry(IOFunction<? extends T> task) throws IOException`

- Description: TODO

#### `private static void dumptg(ThreadGroup tg, PrintWriter out, int indent)`

- Description: TODO

#### `public static void dumptg(ThreadGroup tg, PrintWriter out)`

- Description: TODO

#### `public static void dumparr(Object[] arr, PrintStream out, boolean term)`

- Description: TODO

#### `public static void dumparr(double[] arr, PrintStream out, boolean term)`

- Description: TODO

#### `public static void dumparr(float[] arr, PrintStream out, boolean term)`

- Description: TODO

#### `public static void dumparr(long[] arr, PrintStream out, boolean term)`

- Description: TODO

#### `public static void dumparr(int[] arr, PrintStream out, boolean term)`

- Description: TODO

#### `public static void dumparr(short[] arr, PrintStream out, boolean term)`

- Description: TODO

#### `public static void hexdump(byte[] arr, PrintStream out, int width)`

- Description: TODO

#### `public static void hexdump(ByteBuffer arr, PrintStream out, int width)`

- Description: TODO

#### `public static String titlecase(String str)`

- Description: TODO

#### `public static Color contrast(Color col)`

- Description: TODO

#### `public static Color clipcol(int r, int g, int b, int a)`

- Description: TODO

#### `public static Color col16(int col)`

- Description: TODO

#### `public static BufferedImage outline(BufferedImage img, Color col)`

- Description: TODO

#### `public static BufferedImage outline2(BufferedImage img, Color col)`

- Description: TODO

#### `public static int floordiv(int a, int b)`

- Description: TODO

#### `public static int floormod(int a, int b)`

- Description: TODO

#### `public static int floordiv(float a, float b)`

- Description: TODO

#### `public static int floordiv(double a, double b)`

- Description: TODO

#### `public static float floormod(float a, float b)`

- Description: TODO

#### `public static double floormod(double a, double b)`

- Description: TODO

#### `public static double cangle(double a)`

- Description: TODO

#### `public static double cangle2(double a)`

- Description: TODO

#### `public static double clip(double d, double min, double max)`

- Description: TODO

#### `public static float clip(float d, float min, float max)`

- Description: TODO

#### `public static int clip(int i, int min, int max)`

- Description: TODO

#### `public static double clipnorm(double d, double min, double max)`

- Description: TODO

#### `public static <E, O extends Comparable<? super O>> E max(Collection<E> from, Function<? super E, O> key)`

- Description: TODO

#### `public static <E, O extends Comparable<? super O>> E min(Collection<E> from, Function<? super E, O> key)`

- Description: TODO

#### `public static <E extends Comparable<? super E>> E max(Collection<E> from)`

- Description: TODO

#### `public static <E extends Comparable<? super E>> E min(Collection<E> from)`

- Description: TODO

#### `public static float gcd(float x, float y, float E)`

- Description: TODO

#### `public static float smoothstep(float d)`

- Description: TODO

#### `public static double smoothstep(double d)`

- Description: TODO

#### `public static Color blendcol(Color in, Color bl)`

- Description: TODO

#### `public static Color blendcol(Color x, Color y, double a)`

- Description: TODO

#### `public static Color colmul(Color a, Color b)`

- Description: TODO

#### `public static Color preblend(Color c1, Color c2)`

- Description: TODO

#### `public static void serialize(Object obj, OutputStream out) throws IOException`

- Description: TODO

#### `public static byte[] serialize(Object obj)`

- Description: TODO

#### `public static Object deserialize(InputStream in) throws IOException`

- Description: TODO

#### `public static Object deserialize(byte[] buf)`

- Description: TODO

#### `public static boolean parsebool(String s)`

- Description: TODO

#### `public static boolean eq(Object a, Object b)`

- Description: TODO

#### `public static boolean parsebool(String s, boolean def)`

- Description: TODO

#### `public static FloatBuffer bufcp(float[] a)`

- Description: TODO

#### `public static ShortBuffer bufcp(short[] a)`

- Description: TODO

#### `public static FloatBuffer bufcp(FloatBuffer a)`

- Description: TODO

#### `public static IntBuffer bufcp(IntBuffer a)`

- Description: TODO

#### `public static ByteBuffer mkbbuf(int n)`

- Description: TODO

#### `public static FloatBuffer mkfbuf(int n)`

- Description: TODO

#### `public static ShortBuffer mksbuf(int n)`

- Description: TODO

#### `public static IntBuffer mkibuf(int n)`

- Description: TODO

#### `public static ByteBuffer wbbuf(int n)`

- Description: TODO

#### `public static IntBuffer wibuf(int n)`

- Description: TODO

#### `public static FloatBuffer wfbuf(int n)`

- Description: TODO

#### `public static ShortBuffer wsbuf(int n)`

- Description: TODO

#### `public static FloatBuffer wbufcp(FloatBuffer a)`

- Description: TODO

#### `public static IntBuffer wbufcp(IntBuffer a)`

- Description: TODO

#### `public static ByteBuffer growbuf(ByteBuffer buf, int req)`

- Description: TODO

#### `public static float[] c2fa(Color c)`

- Description: TODO

#### `public static <T> T[] mkarray(Class<T> cl, int len)`

- Description: TODO

#### `public static <T> T[] splice(T[] src, int off, int len)`

- Description: TODO

#### `public static <T> T[] splice(T[] src, int off)`

- Description: TODO

#### `public static byte[] splice(byte[] src, int off, int len)`

- Description: TODO

#### `public static byte[] splice(byte[] src, int off)`

- Description: TODO

#### `public static float[] splice(float[] src, int off, int len)`

- Description: TODO

#### `public static float[] splice(float[] src, int off)`

- Description: TODO

#### `public static double[] splice(double[] src, int off, int len)`

- Description: TODO

#### `public static double[] splice(double[] src, int off)`

- Description: TODO

#### `public static int[] splice(int[] src, int off, int len)`

- Description: TODO

#### `public static int[] splice(int[] src, int off)`

- Description: TODO

#### `public static <T> T[] cast(Object[] a, Class<T> cl)`

- Description: TODO

#### `public static <T> T[] extend(T[] src, int off, int nl)`

- Description: TODO

#### `public static <T> T[] extend(T[] src, int nl)`

- Description: TODO

#### `public static <T, E extends T> T[] extend(T[] src, E ne)`

- Description: TODO

#### `public static <T, E extends T> T[] extend(T[] src, E[] ne)`

- Description: TODO

#### `public static int[] extend(int[] src, int nl)`

- Description: TODO

#### `public static double[] extend(double[] src, int nl)`

- Description: TODO

#### `public static float[] extend(float[] src, int nl)`

- Description: TODO

#### `public static short[] extend(short[] src, int nl)`

- Description: TODO

#### `public static byte[] concat(byte[]... parts)`

- Description: TODO

#### `public static <T> T el(Iterable<T> c)`

- Description: TODO

#### `public static <T> T take(Iterable<T> c)`

- Description: TODO

#### `public static <K, V> V pop(Map<K, V> map, K key, V def)`

- Description: TODO

#### `public static <E> Set<E> union(Set<? extends E> a, Set<? extends E> b)`

- Description: TODO

#### `public static <E> Set<E> isect(Set<? extends E> a, Set<?> b)`

- Description: TODO

#### `public static <E> Set<E> setdiff(Set<? extends E> a, Set<?> b)`

- Description: TODO

#### `public static <E> Set<E> symdiff(Set<? extends E> a, Set<? extends E> b)`

- Description: TODO

#### `public static <T> List<T> reversed(List<T> ls)`

- Description: TODO

#### `public static <T> int index(T[] arr, T el)`

- Description: TODO

#### `public static boolean strcheck(String str, IntPredicate p)`

- Description: TODO

#### `public static <T> T find(Iterable<? extends T> in, Predicate<? super T> p)`

- Description: TODO

#### `public static <T> T or(Supplier<T>... vals)`

- Description: TODO

#### `public static <T> void clean(Collection<T> c, Consumer<? super T> clean)`

- Description: TODO

#### `public static <T> T construct(Constructor<T> cons, Object... args)`

- Description: TODO

#### `public static <T> T construct(Class<T> cl)`

- Description: TODO

#### `public static Object invoke(Method mth, Object ob, Object... args)`

- Description: TODO

#### `public static <R> Function<Object[], R> consfun(Class<R> cl, Class<?>... args) throws NoSuchMethodException`

- Description: TODO

#### `public static <R> Function<Object[], R> smthfun(Class<?> cl, String name, Class<R> rtype, Class<?>...args) throws NoSuchMethodException`

- Description: TODO

#### `public static String urlencode(String in)`

- Description: TODO

#### `public static URI uriparam(URI base, Object... pars)`

- Description: TODO

#### `public static <C> C hascause(Throwable t, Class<C> c)`

- Description: TODO

#### `public static double ntime()`

- Description: TODO

#### `public static double rtime()`

- Description: TODO

#### `public MapBuilder(Map<K, V> bk)`

- Description: TODO

#### `public MapBuilder<K, V> put(K k, V v)`

- Description: TODO

#### `public Map<K, V> map()`

- Description: TODO

#### `public static <K, V> MapBuilder<K, V> map()`

- Description: TODO

#### `public static <K, V> Map<K, V> index(Collection<? extends V> values, Function<? super V, ? extends K> key)`

- Description: TODO

#### `public Range(int min, int max, int step)`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public Integer get(int idx)`

- Description: TODO

#### `public static List<Integer> range(int min, int max, int step)`

- Description: TODO

#### `public static List<Integer> range(int min, int max)`

- Description: TODO

#### `public static List<Integer> range(int max)`

- Description: TODO

#### `public static <T> Indir<T> cache(Indir<T> src)`

- Description: TODO

#### `public static <V, R> Indir<R> transform(Supplier<? extends V> val, Function<? super V, ? extends R> xf)`

- Description: TODO

#### `public static <F, T> Iterator<T> map(Iterator<F> from, Function<? super F, ? extends T> fn)`

- Description: TODO

#### `public static <E> Iterator<E> filter(Iterator<E> from, Predicate<? super E> filter)`

- Description: TODO

#### `public static void checkirq() throws InterruptedException`

- Description: TODO

#### `public static <T, F> Iterator<T> filter(Iterator<F> from, Class<T> filter)`

- Description: TODO

#### `public static <E, T extends Collection<E>> T merge(T dst, Iterable<? extends E> a, Iterable<? extends E> b, Comparator<? super E> cmp)`

- Description: TODO

#### `public static <T> Optional<T> ocast(Object x, Class<T> cl)`

- Description: TODO

#### `public static int sidcmp(Object a, Object b)`

- Description: TODO

#### `public static Object formatter(String fmt, Object... args)`

- Description: TODO

#### `public static Object formatter(Supplier<String> str)`

- Description: TODO

#### `public AddressFormatException(String message, CharSequence addr, String type)`

- Description: TODO

#### `public AddressFormatException(String message, CharSequence addr, String type, Throwable cause)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `public static Inet4Address in4_pton(CharSequence as)`

- Description: TODO

#### `public static InetAddress in6_pton(CharSequence as)`

- Description: TODO

#### `public static InetAddress inet_pton(CharSequence as)`

- Description: TODO

#### `public static int compare(Object[] a, Object[] b)`

- Description: TODO
