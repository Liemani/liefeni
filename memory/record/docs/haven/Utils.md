---
source: [Utils.java](../../../../src/haven/Utils.java)
created: 2026-06-13
updated: 2026-06-14
---

# Utils

Represents the utils Haven component.

## Nested Types

### AddressFormatException

- Role: Signals an invalid address encoding.
- Description: Runtime exception thrown when address parsing fails.

### Base64

- Role: Encodes and decodes base64 data.
- Description: Base64 codec helper with configurable alphabet and padding.

### BinAscii

- Role: Encodes binary data as ASCII text.
- Description: Binary-to-ASCII codec helper used for compact textual representations.

### IOFunction

- Role: Represents an IO-capable function.
- Description: Functional interface that can throw checked IO errors.

### MapBuilder

- Role: Builds maps fluently.
- Description: Convenience builder used to construct map instances.

### Range

- Role: Represents an integer range.
- Description: Iterable helper that emits a contiguous range of integers.

## Members

### Constants

#### `public static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8")`
- Role: Implements the utf8 operation.
- Description: Implements the for name operation.
- Value: `java.nio.charset.Charset.forName("UTF-8")`

#### `public static final java.nio.charset.Charset ascii = java.nio.charset.Charset.forName("US-ASCII")`
- Role: Implements the ascii operation.
- Description: Implements the for name operation.
- Value: `java.nio.charset.Charset.forName("US-ASCII")`

#### `public static final java.awt.image.ColorModel rgbm = java.awt.image.ColorModel.getRGBdefault()`
- Role: Implements the rgbm operation.
- Description: Implements the get rg bdefault operation.
- Value: `java.awt.image.ColorModel.getRGBdefault()`

#### `public static final Config.Variable<String> prefspec = Config.Variable.prop("haven.prefspec", "hafen")`
- Role: Implements the prefspec operation.
- Description: Implements the prop operation.
- Value: `Config.Variable.prop("haven.prefspec", "hafen")`

#### `public static final BinAscii hex = new BinAscii()`
- Role: Implements the hex operation.
- Description: Implements the bin ascii operation.
- Value: `new BinAscii()`

#### `public static final BinAscii bprint = new BinAscii()`
- Role: Implements the bprint operation.
- Description: Implements the bin ascii operation.
- Value: `new BinAscii()`

#### `public static final Base64 b64 = new Base64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=')`
- Role: Implements the b64 operation.
- Description: Implements the base64 operation.
- Value: `new Base64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=')`

#### `public static final Base64 b64np = new Base64(b64.set, '\0')`
- Role: Implements the b64np operation.
- Description: Implements the base64 operation.
- Value: `new Base64(b64.set, '\0')`

#### `public static final Base64 ub64 = new Base64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '\0')`
- Role: Implements the ub64 operation.
- Description: Implements the base64 operation.
- Value: `new Base64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '\0')`

#### `public static final Color[] vgapal`
#### `public static final Color[] vgapal`
- Role: Caches the vgapal value.
- Description: Caches the `vgapal` value for reuse.

#### `private static final long rtimeoff = System.nanoTime()`
- Role: Implements the rtimeoff operation.
- Description: Implements the nano time operation.
- Value: `System.nanoTime()`

#### `public static final Comparator<Object> idcmp = new Comparator<Object>()`
- Role: Implements the idcmp operation.
- Description: Implements the public static final comparator<object> idcmp = new comparator<object>() operation.
- Value: `new Comparator<Object>()`

### Fields

#### `private static Preferences prefs = null`
- Role: Caches the prefs value.
- Description: Caches the `prefs` value for reuse.

#### `public final String set`
- Role: Caches the set value.
- Description: Caches the `set` value for reuse.

#### `public final char pad`
- Role: Caches the pad value.
- Description: Caches the `pad` value for reuse.

#### `private final byte[] rev`
- Role: Caches the rev value.
- Description: Caches the `rev` value for reuse.

#### `private final Map<K, V> bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public final int min, max, step`
- Role: Caches the step value.
- Description: Caches the `step` value for reuse.

#### `public final int min, max, step`
- Role: Caches the step value.
- Description: Caches the `step` value for reuse.

#### `public final int min, max, step`
- Role: Caches the step value.
- Description: Caches the `step` value for reuse.

#### `public final String addr, type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

#### `public final String addr, type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

### Methods

#### `static Coord imgsz(BufferedImage img)`
- Role: Implements the imgsz operation.
- Description: Implements the imgsz operation.

#### `public static boolean checkhit(BufferedImage img, Coord c, int thres)`
- Role: Implements the checkhit operation.
- Description: Implements the checkhit operation.

#### `public static boolean checkhit(BufferedImage img, Coord c)`
- Role: Implements the checkhit operation.
- Description: Implements the checkhit operation.

#### `public static void defer(final Runnable r)`
- Role: Implements the defer operation.
- Description: Implements the defer operation.

#### `public static URI uri(String uri)`
- Role: Implements the uri operation.
- Description: Implements the uri operation.

#### `public static URL url(URI uri)`
- Role: Implements the url operation.
- Description: Implements the url operation.

#### `public static URL url(String url)`
- Role: Implements the url operation.
- Description: Implements the url operation.

#### `public static Path path(String path)`
- Role: Implements the path operation.
- Description: Implements the path operation.

#### `public static Path pj(Path base, String... els)`
- Role: Implements the pj operation.
- Description: Implements the pj operation.

#### `public static Path srcpath(Class<?> cl)`
- Role: Implements the srcpath operation.
- Description: Implements the srcpath operation.

#### `public static SocketChannel connect(String host, int port) throws IOException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.

#### `public static SocketChannel connect(NamedSocketAddress addr) throws IOException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.

#### `public static int drawtext(Graphics g, String text, Coord c)`
- Role: Draws the text.
- Description: Draws the text.

#### `static Coord textsz(Graphics g, String text)`
- Role: Implements the textsz operation.
- Description: Implements the textsz operation.

#### `static void aligntext(Graphics g, String text, Coord c, double ax, double ay)`
- Role: Implements the aligntext operation.
- Description: Implements the aligntext operation.

#### `public static String fpformat(int num, int div, int dec)`
- Role: Implements the fpformat operation.
- Description: Implements the fpformat operation.

#### `public static String thformat(long num)`
- Role: Implements the thformat operation.
- Description: Implements the thformat operation.

#### `public static String odformat(double num, int md)`
- Role: Implements the odformat operation.
- Description: Implements the odformat operation.

#### `public static String odformat2(double num, int md)`
- Role: Implements the odformat2 operation.
- Description: Implements the odformat2 operation.

#### `static void line(Graphics g, Coord c1, Coord c2)`
- Role: Implements the line operation.
- Description: Implements the line operation.

#### `static void AA(Graphics g)`
- Role: Implements the aa operation.
- Description: Implements the aa operation.

#### `public static Random mkrandoom(long seed)`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public static double fgrandoom(Random rnd)`
- Role: Implements the fgrandoom operation.
- Description: Implements the fgrandoom operation.

#### `private static Map<Object, Object> sysprefs()`
- Role: Implements the sysprefs operation.
- Description: Implements the sysprefs operation.

#### `public static Preferences prefs()`
- Role: Implements the prefs operation.
- Description: Implements the prefs operation.

#### `public static String getpref(String prefname, String def)`
- Role: Returns the pref.
- Description: Returns the pref.

#### `public static void setpref(String prefname, String val)`
- Role: Updates the pref.
- Description: Updates the pref.

#### `public static int getprefi(String prefname, int def)`
- Role: Returns the prefi.
- Description: Returns the prefi.

#### `public static void setprefi(String prefname, int val)`
- Role: Updates the prefi.
- Description: Updates the prefi.

#### `public static double getprefd(String prefname, double def)`
- Role: Returns the prefd.
- Description: Returns the prefd.

#### `public static void setprefd(String prefname, double val)`
- Role: Updates the prefd.
- Description: Updates the prefd.

#### `public static boolean getprefb(String prefname, boolean def)`
- Role: Returns the prefb.
- Description: Returns the prefb.

#### `public static void setprefb(String prefname, boolean val)`
- Role: Updates the prefb.
- Description: Updates the prefb.

#### `public static Coord getprefc(String prefname, Coord def)`
- Role: Returns the prefc.
- Description: Returns the prefc.

#### `public static void setprefc(String prefname, Coord val)`
- Role: Updates the prefc.
- Description: Updates the prefc.

#### `public static byte[] getprefb(String prefname, byte[] def)`
- Role: Returns the prefb.
- Description: Returns the prefb.

#### `public static void setprefb(String prefname, byte[] val)`
- Role: Updates the prefb.
- Description: Updates the prefb.

#### `public static List<String> getprefsl(String prefname, String[] def)`
- Role: Returns the prefsl.
- Description: Returns the prefsl.

#### `public static void setprefsl(String prefname, Iterable<? extends CharSequence> val)`
- Role: Updates the prefsl.
- Description: Updates the prefsl.

#### `public static String getprop(String propname, String def)`
- Role: Returns the prop.
- Description: Returns the prop.

#### `public static String sv(Object arg)`
- Role: Implements the sv operation.
- Description: Implements the sv operation.

#### `public static List<?> olv(Object arg)`
- Role: Implements the olv operation.
- Description: Implements the olv operation.

#### `public static Object[] oav(Object arg)`
- Role: Implements the oav operation.
- Description: Implements the oav operation.

#### `public static int iv(Object arg)`
- Role: Implements the iv operation.
- Description: Implements the iv operation.

#### `public static long uiv(Object arg)`
- Role: Implements the uiv operation.
- Description: Implements the uiv operation.

#### `public static float fv(Object arg)`
- Role: Implements the fv operation.
- Description: Implements the fv operation.

#### `public static double dv(Object arg)`
- Role: Implements the dv operation.
- Description: Implements the dv operation.

#### `public static boolean bv(Object arg)`
- Role: Implements the bv operation.
- Description: Implements the bv operation.

#### `public static Indir<Resource> irv(Object arg)`
- Role: Implements the irv operation.
- Description: Implements the irv operation.

#### `public static Resource resv(Object arg)`
- Role: Implements the resv operation.
- Description: Implements the resv operation.

#### `public static <K, V> Map<K, V> mapdecn(Object ob, Class<K> kt, Class<V> vt)`
- Role: Implements the mapdecn operation.
- Description: Implements the mapdecn operation.

#### `public static Map<Object, Object> mapdecn(Object ob)`
- Role: Implements the mapdecn operation.
- Description: Implements the mapdecn operation.

#### `public static Object mapencn(Map<?, ?> map)`
- Role: Implements the mapencn operation.
- Description: Implements the mapencn operation.

#### `public static <K, V> Map<K, V> mapdecf(Object ob, Class<K> kt, Class<V> vt)`
- Role: Implements the mapdecf operation.
- Description: Implements the mapdecf operation.

#### `public static Map<Object, Object> mapdecf(Object ob)`
- Role: Implements the mapdecf operation.
- Description: Implements the mapdecf operation.

#### `public static Object mapencf(Map<?, ?> map)`
- Role: Implements the mapencf operation.
- Description: Implements the mapencf operation.

#### `public static int sb(int n, int b)`
- Role: Implements the sb operation.
- Description: Implements the sb operation.

#### `public static long sb(long n, int b)`
- Role: Implements the sb operation.
- Description: Implements the sb operation.

#### `public static int ub(byte b)`
- Role: Implements the ub operation.
- Description: Implements the ub operation.

#### `public static byte sb(int b)`
- Role: Implements the sb operation.
- Description: Implements the sb operation.

#### `public static byte f2s8(float v)`
- Role: Implements the f2s8 operation.
- Description: Implements the f2s8 operation.

#### `public static byte f2u8(float v)`
- Role: Implements the f2u8 operation.
- Description: Implements the f2u8 operation.

#### `public static long uint32(int n)`
- Role: Implements the uint32 operation.
- Description: Implements the uint32 operation.

#### `public static int uint16d(byte[] buf, int off)`
- Role: Implements the uint16d operation.
- Description: Implements the uint16d operation.

#### `public static int int16d(byte[] buf, int off)`
- Role: Implements the int16d operation.
- Description: Implements the int16d operation.

#### `public static long uint32d(byte[] buf, int off)`
- Role: Implements the uint32d operation.
- Description: Implements the uint32d operation.

#### `public static void uint32e(long num, byte[] buf, int off)`
- Role: Implements the uint32e operation.
- Description: Implements the uint32e operation.

#### `public static int int32d(byte[] buf, int off)`
- Role: Implements the int32d operation.
- Description: Implements the int32d operation.

#### `public static long int64d(byte[] buf, int off)`
- Role: Implements the int64d operation.
- Description: Implements the int64d operation.

#### `public static int intvard(byte[] buf, int off)`
- Role: Implements the intvard operation.
- Description: Implements the intvard operation.

#### `public static void int64e(long num, byte[] buf, int off)`
- Role: Implements the int64e operation.
- Description: Implements the int64e operation.

#### `public static void int32e(int num, byte[] buf, int off)`
- Role: Implements the int32e operation.
- Description: Implements the int32e operation.

#### `public static void uint16e(int num, byte[] buf, int off)`
- Role: Implements the uint16e operation.
- Description: Implements the uint16e operation.

#### `public static void int16e(short num, byte[] buf, int off)`
- Role: Implements the int16e operation.
- Description: Implements the int16e operation.

#### `public static String strd(byte[] buf, int[] off)`
- Role: Implements the strd operation.
- Description: Implements the strd operation.

#### `public static double floatd(byte[] buf, int off)`
- Role: Implements the floatd operation.
- Description: Implements the floatd operation.

#### `public static float float32d(byte[] buf, int off)`
- Role: Implements the float32d operation.
- Description: Implements the float32d operation.

#### `public static double float64d(byte[] buf, int off)`
- Role: Implements the float64d operation.
- Description: Implements the float64d operation.

#### `public static void float32e(float num, byte[] buf, int off)`
- Role: Implements the float32e operation.
- Description: Implements the float32e operation.

#### `public static void float64e(double num, byte[] buf, int off)`
- Role: Implements the float64e operation.
- Description: Implements the float64e operation.

#### `public static void float9995d(int word, float[] ret)`
- Role: Implements the float9995d operation.
- Description: Implements the float9995d operation.

#### `public static float hfdec(short bits)`
- Role: Implements the hfdec operation.
- Description: Implements the hfdec operation.

#### `public static short hfenc(float f)`
- Role: Implements the hfenc operation.
- Description: Implements the hfenc operation.

#### `public static float mfdec(byte bits)`
- Role: Implements the mfdec operation.
- Description: Implements the mfdec operation.

#### `public static byte mfenc(float f)`
- Role: Implements the mfenc operation.
- Description: Implements the mfenc operation.

#### `public static void uvec2oct(float[] buf, float x, float y, float z)`
- Role: Implements the uvec2oct operation.
- Description: Implements the uvec2oct operation.

#### `public static void oct2uvec(float[] buf, float x, float y)`
- Role: Implements the oct2uvec operation.
- Description: Implements the oct2uvec operation.

#### `public static Coord3f oct2uvec(float x, float y)`
- Role: Implements the oct2uvec operation.
- Description: Implements the oct2uvec operation.

#### `public String enc(byte[] data)`
- Role: Implements the enc operation.
- Description: Implements the enc operation.

#### `public byte[] dec(String data)`
- Role: Implements the dec operation.
- Description: Implements the dec operation.

#### `public static char num2hex(int num, boolean upper)`
- Role: Implements the num2hex operation.
- Description: Implements the num2hex operation.

#### `public static int hex2num(char hex)`
- Role: Implements the hex2num operation.
- Description: Implements the hex2num operation.

#### `public Base64(String set, char pad)`
- Role: Implements the base64 operation.
- Description: Implements the base64 operation.

#### `public String enc(byte[] in)`
- Role: Implements the enc operation.
- Description: Implements the enc operation.

#### `public byte[] dec(String in)`
- Role: Implements the dec operation.
- Description: Implements the dec operation.

#### `public static String[] splitwords(String text)`
- Role: Implements the splitwords operation.
- Description: Implements the splitwords operation.

#### `public static String[] splitlines(String text)`
- Role: Implements the splitlines operation.
- Description: Implements the splitlines operation.

#### `static int atoi(String a)`
- Role: Implements the atoi operation.
- Description: Implements the atoi operation.

#### `static void readtileof(InputStream in) throws IOException`
- Role: Handles the readtileof workflow.
- Description: Implements the readtileof operation.

#### `public static byte[] readall(InputStream in) throws IOException`
- Role: Handles the readall workflow.
- Description: Implements the readall operation.

#### `public T run() throws IOException`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public static <T> T ioretry(IOFunction<? extends T> task) throws IOException`
- Role: Handles the ioretry workflow.
- Description: Implements the ioretry operation.

#### `private static void dumptg(ThreadGroup tg, PrintWriter out, int indent)`
- Role: Implements the dumptg operation.
- Description: Implements the dumptg operation.

#### `public static void dumptg(ThreadGroup tg, PrintWriter out)`
- Role: Implements the dumptg operation.
- Description: Implements the dumptg operation.

#### `public static void dumparr(Object[] arr, PrintStream out, boolean term)`
- Role: Implements the dumparr operation.
- Description: Implements the dumparr operation.

#### `public static void dumparr(double[] arr, PrintStream out, boolean term)`
- Role: Implements the dumparr operation.
- Description: Implements the dumparr operation.

#### `public static void dumparr(float[] arr, PrintStream out, boolean term)`
- Role: Implements the dumparr operation.
- Description: Implements the dumparr operation.

#### `public static void dumparr(long[] arr, PrintStream out, boolean term)`
- Role: Implements the dumparr operation.
- Description: Implements the dumparr operation.

#### `public static void dumparr(int[] arr, PrintStream out, boolean term)`
- Role: Implements the dumparr operation.
- Description: Implements the dumparr operation.

#### `public static void dumparr(short[] arr, PrintStream out, boolean term)`
- Role: Implements the dumparr operation.
- Description: Implements the dumparr operation.

#### `public static void hexdump(byte[] arr, PrintStream out, int width)`
- Role: Implements the hexdump operation.
- Description: Implements the hexdump operation.

#### `public static void hexdump(ByteBuffer arr, PrintStream out, int width)`
- Role: Implements the hexdump operation.
- Description: Implements the hexdump operation.

#### `public static String titlecase(String str)`
- Role: Implements the titlecase operation.
- Description: Implements the titlecase operation.

#### `public static Color contrast(Color col)`
- Role: Implements the contrast operation.
- Description: Implements the contrast operation.

#### `public static Color clipcol(int r, int g, int b, int a)`
- Role: Implements the clipcol operation.
- Description: Implements the clipcol operation.

#### `public static Color col16(int col)`
- Role: Implements the col16 operation.
- Description: Implements the col16 operation.

#### `public static BufferedImage outline(BufferedImage img, Color col)`
- Role: Implements the outline operation.
- Description: Implements the outline operation.

#### `public static BufferedImage outline2(BufferedImage img, Color col)`
- Role: Implements the outline2 operation.
- Description: Implements the outline2 operation.

#### `public static int floordiv(int a, int b)`
- Role: Implements the floordiv operation.
- Description: Implements the floordiv operation.

#### `public static int floormod(int a, int b)`
- Role: Implements the floormod operation.
- Description: Implements the floormod operation.

#### `public static int floordiv(float a, float b)`
- Role: Implements the floordiv operation.
- Description: Implements the floordiv operation.

#### `public static int floordiv(double a, double b)`
- Role: Implements the floordiv operation.
- Description: Implements the floordiv operation.

#### `public static float floormod(float a, float b)`
- Role: Implements the floormod operation.
- Description: Implements the floormod operation.

#### `public static double floormod(double a, double b)`
- Role: Implements the floormod operation.
- Description: Implements the floormod operation.

#### `public static double cangle(double a)`
- Role: Implements the cangle operation.
- Description: Implements the cangle operation.

#### `public static double cangle2(double a)`
- Role: Implements the cangle2 operation.
- Description: Implements the cangle2 operation.

#### `public static double clip(double d, double min, double max)`
- Role: Implements the clip operation.
- Description: Implements the clip operation.

#### `public static float clip(float d, float min, float max)`
- Role: Implements the clip operation.
- Description: Implements the clip operation.

#### `public static int clip(int i, int min, int max)`
- Role: Implements the clip operation.
- Description: Implements the clip operation.

#### `public static double clipnorm(double d, double min, double max)`
- Role: Implements the clipnorm operation.
- Description: Implements the clipnorm operation.

#### `public static <E, O extends Comparable<? super O>> E max(Collection<E> from, Function<? super E, O> key)`
- Role: Implements the max operation.
- Description: Implements the max operation.

#### `public static <E, O extends Comparable<? super O>> E min(Collection<E> from, Function<? super E, O> key)`
- Role: Implements the min operation.
- Description: Implements the min operation.

#### `public static <E extends Comparable<? super E>> E max(Collection<E> from)`
- Role: Implements the max operation.
- Description: Implements the max operation.

#### `public static <E extends Comparable<? super E>> E min(Collection<E> from)`
- Role: Implements the min operation.
- Description: Implements the min operation.

#### `public static float gcd(float x, float y, float E)`
- Role: Implements the gcd operation.
- Description: Implements the gcd operation.

#### `public static float smoothstep(float d)`
- Role: Implements the smoothstep operation.
- Description: Implements the smoothstep operation.

#### `public static double smoothstep(double d)`
- Role: Implements the smoothstep operation.
- Description: Implements the smoothstep operation.

#### `public static Color blendcol(Color in, Color bl)`
- Role: Implements the blendcol operation.
- Description: Implements the blendcol operation.

#### `public static Color blendcol(Color x, Color y, double a)`
- Role: Implements the blendcol operation.
- Description: Implements the blendcol operation.

#### `public static Color colmul(Color a, Color b)`
- Role: Implements the colmul operation.
- Description: Implements the colmul operation.

#### `public static Color preblend(Color c1, Color c2)`
- Role: Implements the preblend operation.
- Description: Implements the preblend operation.

#### `public static void serialize(Object obj, OutputStream out) throws IOException`
- Role: Handles the serialize workflow.
- Description: Implements the serialize operation.

#### `public static byte[] serialize(Object obj)`
- Role: Implements the serialize operation.
- Description: Implements the serialize operation.

#### `public static Object deserialize(InputStream in) throws IOException`
- Role: Handles the deserialize workflow.
- Description: Implements the deserialize operation.

#### `public static Object deserialize(byte[] buf)`
- Role: Implements the deserialize operation.
- Description: Implements the deserialize operation.

#### `public static boolean parsebool(String s)`
- Role: Implements the parsebool operation.
- Description: Implements the parsebool operation.

#### `public static boolean eq(Object a, Object b)`
- Role: Implements the eq operation.
- Description: Implements the eq operation.

#### `public static boolean parsebool(String s, boolean def)`
- Role: Implements the parsebool operation.
- Description: Implements the parsebool operation.

#### `public static FloatBuffer bufcp(float[] a)`
- Role: Implements the bufcp operation.
- Description: Implements the bufcp operation.

#### `public static ShortBuffer bufcp(short[] a)`
- Role: Implements the bufcp operation.
- Description: Implements the bufcp operation.

#### `public static FloatBuffer bufcp(FloatBuffer a)`
- Role: Implements the bufcp operation.
- Description: Implements the bufcp operation.

#### `public static IntBuffer bufcp(IntBuffer a)`
- Role: Implements the bufcp operation.
- Description: Implements the bufcp operation.

#### `public static ByteBuffer mkbbuf(int n)`
- Role: Implements the mkbbuf operation.
- Description: Implements the mkbbuf operation.

#### `public static FloatBuffer mkfbuf(int n)`
- Role: Implements the mkfbuf operation.
- Description: Implements the mkfbuf operation.

#### `public static ShortBuffer mksbuf(int n)`
- Role: Implements the mksbuf operation.
- Description: Implements the mksbuf operation.

#### `public static IntBuffer mkibuf(int n)`
- Role: Implements the mkibuf operation.
- Description: Implements the mkibuf operation.

#### `public static ByteBuffer wbbuf(int n)`
- Role: Implements the wbbuf operation.
- Description: Implements the wbbuf operation.

#### `public static IntBuffer wibuf(int n)`
- Role: Implements the wibuf operation.
- Description: Implements the wibuf operation.

#### `public static FloatBuffer wfbuf(int n)`
- Role: Implements the wfbuf operation.
- Description: Implements the wfbuf operation.

#### `public static ShortBuffer wsbuf(int n)`
- Role: Implements the wsbuf operation.
- Description: Implements the wsbuf operation.

#### `public static FloatBuffer wbufcp(FloatBuffer a)`
- Role: Implements the wbufcp operation.
- Description: Implements the wbufcp operation.

#### `public static IntBuffer wbufcp(IntBuffer a)`
- Role: Implements the wbufcp operation.
- Description: Implements the wbufcp operation.

#### `public static ByteBuffer growbuf(ByteBuffer buf, int req)`
- Role: Implements the growbuf operation.
- Description: Implements the growbuf operation.

#### `public static float[] c2fa(Color c)`
- Role: Implements the c2fa operation.
- Description: Implements the c2fa operation.

#### `public static <T> T[] mkarray(Class<T> cl, int len)`
- Role: Implements the mkarray operation.
- Description: Implements the mkarray operation.

#### `public static <T> T[] splice(T[] src, int off, int len)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static <T> T[] splice(T[] src, int off)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static byte[] splice(byte[] src, int off, int len)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static byte[] splice(byte[] src, int off)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static float[] splice(float[] src, int off, int len)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static float[] splice(float[] src, int off)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static double[] splice(double[] src, int off, int len)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static double[] splice(double[] src, int off)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static int[] splice(int[] src, int off, int len)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static int[] splice(int[] src, int off)`
- Role: Implements the splice operation.
- Description: Implements the splice operation.

#### `public static <T> T[] cast(Object[] a, Class<T> cl)`
- Role: Implements the cast operation.
- Description: Implements the cast operation.

#### `public static <T> T[] extend(T[] src, int off, int nl)`
- Role: Implements the extend operation.
- Description: Implements the extend operation.

#### `public static <T> T[] extend(T[] src, int nl)`
- Role: Implements the extend operation.
- Description: Implements the extend operation.

#### `public static <T, E extends T> T[] extend(T[] src, E ne)`
- Role: Implements the extend operation.
- Description: Implements the extend operation.

#### `public static <T, E extends T> T[] extend(T[] src, E[] ne)`
- Role: Implements the extend operation.
- Description: Implements the extend operation.

#### `public static int[] extend(int[] src, int nl)`
- Role: Implements the extend operation.
- Description: Implements the extend operation.

#### `public static double[] extend(double[] src, int nl)`
- Role: Implements the extend operation.
- Description: Implements the extend operation.

#### `public static float[] extend(float[] src, int nl)`
- Role: Implements the extend operation.
- Description: Implements the extend operation.

#### `public static short[] extend(short[] src, int nl)`
- Role: Implements the extend operation.
- Description: Implements the extend operation.

#### `public static byte[] concat(byte[]... parts)`
- Role: Implements the concat operation.
- Description: Implements the concat operation.

#### `public static <T> T el(Iterable<T> c)`
- Role: Implements the el operation.
- Description: Implements the el operation.

#### `public static <T> T take(Iterable<T> c)`
- Role: Implements the take operation.
- Description: Implements the take operation.

#### `public static <K, V> V pop(Map<K, V> map, K key, V def)`
- Role: Applies avatar description updates.
- Description: Implements the pop operation.

#### `public static <E> Set<E> union(Set<? extends E> a, Set<? extends E> b)`
- Role: Implements the union operation.
- Description: Implements the union operation.

#### `public static <E> Set<E> isect(Set<? extends E> a, Set<?> b)`
- Role: Returns whether the ect is true.
- Description: Returns whether the ect is true.

#### `public static <E> Set<E> setdiff(Set<? extends E> a, Set<?> b)`
- Role: Updates the diff.
- Description: Updates the diff.

#### `public static <E> Set<E> symdiff(Set<? extends E> a, Set<? extends E> b)`
- Role: Implements the symdiff operation.
- Description: Implements the symdiff operation.

#### `public static <T> List<T> reversed(List<T> ls)`
- Role: Implements the reversed operation.
- Description: Implements the reversed operation.

#### `public static <T> int index(T[] arr, T el)`
- Role: Implements the index operation.
- Description: Implements the index operation.

#### `public static boolean strcheck(String str, IntPredicate p)`
- Role: Implements the strcheck operation.
- Description: Implements the strcheck operation.

#### `public static <T> T find(Iterable<? extends T> in, Predicate<? super T> p)`
- Role: Implements the find operation.
- Description: Finds the requested data.

#### `public static <T> T or(Supplier<T>... vals)`
- Role: Registers a callback that fires when any supplied waitable becomes ready.
- Description: Registers a callback that fires when any supplied waitable becomes ready.

#### `public static <T> void clean(Collection<T> c, Consumer<? super T> clean)`
- Role: Implements the clean operation.
- Description: Implements the clean operation.

#### `public static <T> T construct(Constructor<T> cons, Object... args)`
- Role: Implements the construct operation.
- Description: Implements the construct operation.

#### `public static <T> T construct(Class<T> cl)`
- Role: Implements the construct operation.
- Description: Implements the construct operation.

#### `public static Object invoke(Method mth, Object ob, Object... args)`
- Role: Implements the invoke operation.
- Description: Implements the invoke operation.

#### `public static <R> Function<Object[], R> consfun(Class<R> cl, Class<?>... args) throws NoSuchMethodException`
- Role: Handles the consfun workflow.
- Description: Implements the consfun operation.

#### `public static <R> Function<Object[], R> smthfun(Class<?> cl, String name, Class<R> rtype, Class<?>...args) throws NoSuchMethodException`
- Role: Handles the smthfun workflow.
- Description: Implements the smthfun operation.

#### `public static String urlencode(String in)`
- Role: Implements the urlencode operation.
- Description: Implements the urlencode operation.

#### `public static URI uriparam(URI base, Object... pars)`
- Role: Implements the uriparam operation.
- Description: Implements the uriparam operation.

#### `public static <C> C hascause(Throwable t, Class<C> c)`
- Role: Returns whether the cause is present.
- Description: Returns whether the cause is present.

#### `public static double ntime()`
- Role: Implements the ntime operation.
- Description: Implements the ntime operation.

#### `public static double rtime()`
- Role: Implements the rtime operation.
- Description: Implements the rtime operation.

#### `public MapBuilder(Map<K, V> bk)`
- Role: Implements the map builder operation.
- Description: Implements the map builder operation.

#### `public MapBuilder<K, V> put(K k, V v)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public Map<K, V> map()`
- Role: Implements the map operation.
- Description: Implements the map operation.

#### `public static <K, V> MapBuilder<K, V> map()`
- Role: Implements the map operation.
- Description: Implements the map operation.

#### `public static <K, V> Map<K, V> index(Collection<? extends V> values, Function<? super V, ? extends K> key)`
- Role: Implements the index operation.
- Description: Implements the index operation.

#### `public Range(int min, int max, int step)`
- Role: Implements the range operation.
- Description: Implements the range operation.

#### `public int size()`
- Role: Implements the size operation.
- Description: Implements the size operation.

#### `public Integer get(int idx)`
- Role: Returns the cached get.
- Description: Returns the cached get.

#### `public static List<Integer> range(int min, int max, int step)`
- Role: Implements the range operation.
- Description: Implements the range operation.

#### `public static List<Integer> range(int min, int max)`
- Role: Implements the range operation.
- Description: Implements the range operation.

#### `public static List<Integer> range(int max)`
- Role: Implements the range operation.
- Description: Implements the range operation.

#### `public static <T> Indir<T> cache(Indir<T> src)`
- Role: Implements the cache operation.
- Description: Implements the cache operation.

#### `public static <V, R> Indir<R> transform(Supplier<? extends V> val, Function<? super V, ? extends R> xf)`
- Role: Implements the transform operation.
- Description: Implements the transform operation.

#### `public static <F, T> Iterator<T> map(Iterator<F> from, Function<? super F, ? extends T> fn)`
- Role: Implements the map operation.
- Description: Implements the map operation.

#### `public static <E> Iterator<E> filter(Iterator<E> from, Predicate<? super E> filter)`
- Role: Implements the filter operation.
- Description: Implements the filter operation.

#### `public static void checkirq() throws InterruptedException`
- Role: Handles the checkirq workflow.
- Description: Implements the checkirq operation.

#### `public static <T, F> Iterator<T> filter(Iterator<F> from, Class<T> filter)`
- Role: Implements the filter operation.
- Description: Implements the filter operation.

#### `public static <E, T extends Collection<E>> T merge(T dst, Iterable<? extends E> a, Iterable<? extends E> b, Comparator<? super E> cmp)`
- Role: Implements the merge operation.
- Description: Implements the merge operation.

#### `public static <T> Optional<T> ocast(Object x, Class<T> cl)`
- Role: Implements the ocast operation.
- Description: Implements the ocast operation.

#### `public static int sidcmp(Object a, Object b)`
- Role: Implements the sidcmp operation.
- Description: Implements the sidcmp operation.

#### `public static Object formatter(String fmt, Object... args)`
- Role: Implements the formatter operation.
- Description: Implements the formatter operation.

#### `public static Object formatter(Supplier<String> str)`
- Role: Implements the formatter operation.
- Description: Implements the formatter operation.

#### `public AddressFormatException(String message, CharSequence addr, String type)`
- Role: Implements the address format exception operation.
- Description: Implements the address format exception operation.

#### `public AddressFormatException(String message, CharSequence addr, String type, Throwable cause)`
- Role: Implements the address format exception operation.
- Description: Implements the address format exception operation.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Returns the message.

#### `public static Inet4Address in4_pton(CharSequence as)`
- Role: Implements the in4 pton operation.
- Description: Implements the in4 pton operation.

#### `public static InetAddress in6_pton(CharSequence as)`
- Role: Implements the in6 pton operation.
- Description: Implements the in6 pton operation.

#### `public static InetAddress inet_pton(CharSequence as)`
- Role: Implements the inet pton operation.
- Description: Implements the inet pton operation.

#### `public static int compare(Object[] a, Object[] b)`
- Role: Implements the compare operation.
- Description: Implements the compare operation.