---
source: [Utils.java](../../../src/haven/Utils.java)
created: 2026-06-13
updated: 2026-06-14
---

# Utils

Represents the utils Haven component.

## Nested Types

### AddressFormatException

- Role: Represents address format exception within Utils.
- Description: Describes the nested address format exception type used by the enclosing class.

### Base64

- Role: Represents base64 within Utils.
- Description: Describes the nested base64 type used by the enclosing class.

### BinAscii

- Role: Represents bin ascii within Utils.
- Description: Describes the nested bin ascii type used by the enclosing class.

### IOFunction

- Role: Represents iofunction within Utils.
- Description: Describes the nested iofunction type used by the enclosing class.

### MapBuilder

- Role: Represents map builder within Utils.
- Description: Describes the nested map builder type used by the enclosing class.

### Range

- Role: Represents range within Utils.
- Description: Describes the nested range type used by the enclosing class.

## Members

### Constants

#### `public static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8")`
- Role: Defines the shared utf8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final java.nio.charset.Charset ascii = java.nio.charset.Charset.forName("US-ASCII")`
- Role: Defines the shared ascii constant.
- Description: Shared constant used by the rest of the class.

#### `public static final java.awt.image.ColorModel rgbm = java.awt.image.ColorModel.getRGBdefault()`
- Role: Defines the shared rgbm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<String> prefspec = Config.Variable.prop("haven.prefspec", "hafen")`
- Role: Defines the shared prefspec constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BinAscii hex = new BinAscii()`
- Role: Defines the shared hex constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BinAscii bprint = new BinAscii()`
- Role: Defines the shared bprint constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Base64 b64 = new Base64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=')`
- Role: Defines the shared b64 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Base64 b64np = new Base64(b64.set, '\0')`
- Role: Defines the shared b64np constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Base64 ub64 = new Base64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '\0')`
- Role: Defines the shared ub64 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color[] vgapal`
- Role: Defines the shared vgapal constant.
- Description: Shared constant used by the rest of the class.

#### `private static final long rtimeoff = System.nanoTime()`
- Role: Defines the shared rtimeoff constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Comparator<Object> idcmp = new Comparator<Object>()`
- Role: Defines the shared idcmp constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static Preferences prefs = null`
- Role: Holds the prefs state.
- Description: Backs the cached state for this file.

#### `public final String set`
- Role: Stores the set value.
- Description: Backs the cached state for this file.

#### `public final char pad`
- Role: Stores the pad value.
- Description: Backs the cached state for this file.

#### `private final byte[] rev`
- Role: Stores the rev value.
- Description: Backs the cached state for this file.

#### `private final Map<K, V> bk`
- Role: Caches bk entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int min, max, step`
- Role: Stores the step value.
- Description: Backs the cached state for this file.

#### `public final int min, max, step`
- Role: Stores the step value.
- Description: Backs the cached state for this file.

#### `public final int min, max, step`
- Role: Stores the step value.
- Description: Backs the cached state for this file.

#### `public final String addr, type`
- Role: Stores the type value.
- Description: Backs the cached state for this file.

#### `public final String addr, type`
- Role: Stores the type value.
- Description: Backs the cached state for this file.

### Methods

#### `static Coord imgsz(BufferedImage img)`
- Role: Performs imgsz.
- Description: Supports the imgsz operation used by the surrounding class.

#### `public static boolean checkhit(BufferedImage img, Coord c, int thres)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public static boolean checkhit(BufferedImage img, Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public static void defer(final Runnable r)`
- Role: Performs defer.
- Description: Supports the defer operation used by the surrounding class.

#### `public static URI uri(String uri)`
- Role: Performs uri.
- Description: Supports the uri operation used by the surrounding class.

#### `public static URL url(URI uri)`
- Role: Performs url.
- Description: Supports the url operation used by the surrounding class.

#### `public static URL url(String url)`
- Role: Performs url.
- Description: Supports the url operation used by the surrounding class.

#### `public static Path path(String path)`
- Role: Performs path.
- Description: Supports the path operation used by the surrounding class.

#### `public static Path pj(Path base, String... els)`
- Role: Performs pj.
- Description: Supports the pj operation used by the surrounding class.

#### `public static Path srcpath(Class<?> cl)`
- Role: Performs srcpath.
- Description: Supports the srcpath operation used by the surrounding class.

#### `public static SocketChannel connect(String host, int port) throws IOException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.

#### `public static SocketChannel connect(NamedSocketAddress addr) throws IOException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.

#### `public static int drawtext(Graphics g, String text, Coord c)`
- Role: Performs drawtext.
- Description: Supports the drawtext operation used by the surrounding class.

#### `static Coord textsz(Graphics g, String text)`
- Role: Performs textsz.
- Description: Supports the textsz operation used by the surrounding class.

#### `static void aligntext(Graphics g, String text, Coord c, double ax, double ay)`
- Role: Performs aligntext.
- Description: Supports the aligntext operation used by the surrounding class.

#### `public static String fpformat(int num, int div, int dec)`
- Role: Performs fpformat.
- Description: Supports the fpformat operation used by the surrounding class.

#### `public static String thformat(long num)`
- Role: Performs thformat.
- Description: Supports the thformat operation used by the surrounding class.

#### `public static String odformat(double num, int md)`
- Role: Performs odformat.
- Description: Supports the odformat operation used by the surrounding class.

#### `public static String odformat2(double num, int md)`
- Role: Performs odformat2.
- Description: Supports the odformat2 operation used by the surrounding class.

#### `static void line(Graphics g, Coord c1, Coord c2)`
- Role: Performs line.
- Description: Supports the line operation used by the surrounding class.

#### `static void AA(Graphics g)`
- Role: Performs aa.
- Description: Supports the aa operation used by the surrounding class.

#### `public static Random mkrandoom(long seed)`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public static double fgrandoom(Random rnd)`
- Role: Performs fgrandoom.
- Description: Supports the fgrandoom operation used by the surrounding class.

#### `private static Map<Object, Object> sysprefs()`
- Role: Performs sysprefs.
- Description: Supports the sysprefs operation used by the surrounding class.

#### `public static Preferences prefs()`
- Role: Performs prefs.
- Description: Supports the prefs operation used by the surrounding class.

#### `public static String getpref(String prefname, String def)`
- Role: Performs getpref.
- Description: Supports the getpref operation used by the surrounding class.

#### `public static void setpref(String prefname, String val)`
- Role: Performs setpref.
- Description: Supports the setpref operation used by the surrounding class.

#### `public static int getprefi(String prefname, int def)`
- Role: Performs getprefi.
- Description: Supports the getprefi operation used by the surrounding class.

#### `public static void setprefi(String prefname, int val)`
- Role: Performs setprefi.
- Description: Supports the setprefi operation used by the surrounding class.

#### `public static double getprefd(String prefname, double def)`
- Role: Performs getprefd.
- Description: Supports the getprefd operation used by the surrounding class.

#### `public static void setprefd(String prefname, double val)`
- Role: Performs setprefd.
- Description: Supports the setprefd operation used by the surrounding class.

#### `public static boolean getprefb(String prefname, boolean def)`
- Role: Performs getprefb.
- Description: Supports the getprefb operation used by the surrounding class.

#### `public static void setprefb(String prefname, boolean val)`
- Role: Performs setprefb.
- Description: Supports the setprefb operation used by the surrounding class.

#### `public static Coord getprefc(String prefname, Coord def)`
- Role: Performs getprefc.
- Description: Supports the getprefc operation used by the surrounding class.

#### `public static void setprefc(String prefname, Coord val)`
- Role: Performs setprefc.
- Description: Supports the setprefc operation used by the surrounding class.

#### `public static byte[] getprefb(String prefname, byte[] def)`
- Role: Performs getprefb.
- Description: Supports the getprefb operation used by the surrounding class.

#### `public static void setprefb(String prefname, byte[] val)`
- Role: Performs setprefb.
- Description: Supports the setprefb operation used by the surrounding class.

#### `public static List<String> getprefsl(String prefname, String[] def)`
- Role: Performs getprefsl.
- Description: Supports the getprefsl operation used by the surrounding class.

#### `public static void setprefsl(String prefname, Iterable<? extends CharSequence> val)`
- Role: Performs setprefsl.
- Description: Supports the setprefsl operation used by the surrounding class.

#### `public static String getprop(String propname, String def)`
- Role: Performs getprop.
- Description: Supports the getprop operation used by the surrounding class.

#### `public static String sv(Object arg)`
- Role: Performs sv.
- Description: Supports the sv operation used by the surrounding class.

#### `public static List<?> olv(Object arg)`
- Role: Performs olv.
- Description: Supports the olv operation used by the surrounding class.

#### `public static Object[] oav(Object arg)`
- Role: Performs oav.
- Description: Supports the oav operation used by the surrounding class.

#### `public static int iv(Object arg)`
- Role: Performs iv.
- Description: Supports the iv operation used by the surrounding class.

#### `public static long uiv(Object arg)`
- Role: Performs uiv.
- Description: Supports the uiv operation used by the surrounding class.

#### `public static float fv(Object arg)`
- Role: Performs fv.
- Description: Supports the fv operation used by the surrounding class.

#### `public static double dv(Object arg)`
- Role: Performs dv.
- Description: Supports the dv operation used by the surrounding class.

#### `public static boolean bv(Object arg)`
- Role: Performs bv.
- Description: Supports the bv operation used by the surrounding class.

#### `public static Indir<Resource> irv(Object arg)`
- Role: Performs irv.
- Description: Supports the irv operation used by the surrounding class.

#### `public static Resource resv(Object arg)`
- Role: Performs resv.
- Description: Supports the resv operation used by the surrounding class.

#### `public static <K, V> Map<K, V> mapdecn(Object ob, Class<K> kt, Class<V> vt)`
- Role: Performs mapdecn.
- Description: Supports the mapdecn operation used by the surrounding class.

#### `public static Map<Object, Object> mapdecn(Object ob)`
- Role: Performs mapdecn.
- Description: Supports the mapdecn operation used by the surrounding class.

#### `public static Object mapencn(Map<?, ?> map)`
- Role: Performs mapencn.
- Description: Supports the mapencn operation used by the surrounding class.

#### `public static <K, V> Map<K, V> mapdecf(Object ob, Class<K> kt, Class<V> vt)`
- Role: Performs mapdecf.
- Description: Supports the mapdecf operation used by the surrounding class.

#### `public static Map<Object, Object> mapdecf(Object ob)`
- Role: Performs mapdecf.
- Description: Supports the mapdecf operation used by the surrounding class.

#### `public static Object mapencf(Map<?, ?> map)`
- Role: Performs mapencf.
- Description: Supports the mapencf operation used by the surrounding class.

#### `public static int sb(int n, int b)`
- Role: Performs sb.
- Description: Supports the sb operation used by the surrounding class.

#### `public static long sb(long n, int b)`
- Role: Performs sb.
- Description: Supports the sb operation used by the surrounding class.

#### `public static int ub(byte b)`
- Role: Performs ub.
- Description: Supports the ub operation used by the surrounding class.

#### `public static byte sb(int b)`
- Role: Performs sb.
- Description: Supports the sb operation used by the surrounding class.

#### `public static byte f2s8(float v)`
- Role: Performs f2s8.
- Description: Supports the f2s8 operation used by the surrounding class.

#### `public static byte f2u8(float v)`
- Role: Performs f2u8.
- Description: Supports the f2u8 operation used by the surrounding class.

#### `public static long uint32(int n)`
- Role: Performs uint32.
- Description: Supports the uint32 operation used by the surrounding class.

#### `public static int uint16d(byte[] buf, int off)`
- Role: Performs uint16d.
- Description: Supports the uint16d operation used by the surrounding class.

#### `public static int int16d(byte[] buf, int off)`
- Role: Performs int16d.
- Description: Supports the int16d operation used by the surrounding class.

#### `public static long uint32d(byte[] buf, int off)`
- Role: Performs uint32d.
- Description: Supports the uint32d operation used by the surrounding class.

#### `public static void uint32e(long num, byte[] buf, int off)`
- Role: Performs uint32e.
- Description: Supports the uint32e operation used by the surrounding class.

#### `public static int int32d(byte[] buf, int off)`
- Role: Performs int32d.
- Description: Supports the int32d operation used by the surrounding class.

#### `public static long int64d(byte[] buf, int off)`
- Role: Performs int64d.
- Description: Supports the int64d operation used by the surrounding class.

#### `public static int intvard(byte[] buf, int off)`
- Role: Performs intvard.
- Description: Supports the intvard operation used by the surrounding class.

#### `public static void int64e(long num, byte[] buf, int off)`
- Role: Performs int64e.
- Description: Supports the int64e operation used by the surrounding class.

#### `public static void int32e(int num, byte[] buf, int off)`
- Role: Performs int32e.
- Description: Supports the int32e operation used by the surrounding class.

#### `public static void uint16e(int num, byte[] buf, int off)`
- Role: Performs uint16e.
- Description: Supports the uint16e operation used by the surrounding class.

#### `public static void int16e(short num, byte[] buf, int off)`
- Role: Performs int16e.
- Description: Supports the int16e operation used by the surrounding class.

#### `public static String strd(byte[] buf, int[] off)`
- Role: Performs strd.
- Description: Supports the strd operation used by the surrounding class.

#### `public static double floatd(byte[] buf, int off)`
- Role: Performs floatd.
- Description: Supports the floatd operation used by the surrounding class.

#### `public static float float32d(byte[] buf, int off)`
- Role: Performs float32d.
- Description: Supports the float32d operation used by the surrounding class.

#### `public static double float64d(byte[] buf, int off)`
- Role: Performs float64d.
- Description: Supports the float64d operation used by the surrounding class.

#### `public static void float32e(float num, byte[] buf, int off)`
- Role: Performs float32e.
- Description: Supports the float32e operation used by the surrounding class.

#### `public static void float64e(double num, byte[] buf, int off)`
- Role: Performs float64e.
- Description: Supports the float64e operation used by the surrounding class.

#### `public static void float9995d(int word, float[] ret)`
- Role: Performs float9995d.
- Description: Supports the float9995d operation used by the surrounding class.

#### `public static float hfdec(short bits)`
- Role: Performs hfdec.
- Description: Supports the hfdec operation used by the surrounding class.

#### `public static short hfenc(float f)`
- Role: Performs hfenc.
- Description: Supports the hfenc operation used by the surrounding class.

#### `public static float mfdec(byte bits)`
- Role: Performs mfdec.
- Description: Supports the mfdec operation used by the surrounding class.

#### `public static byte mfenc(float f)`
- Role: Performs mfenc.
- Description: Supports the mfenc operation used by the surrounding class.

#### `public static void uvec2oct(float[] buf, float x, float y, float z)`
- Role: Performs uvec2oct.
- Description: Supports the uvec2oct operation used by the surrounding class.

#### `public static void oct2uvec(float[] buf, float x, float y)`
- Role: Performs oct2uvec.
- Description: Supports the oct2uvec operation used by the surrounding class.

#### `public static Coord3f oct2uvec(float x, float y)`
- Role: Performs oct2uvec.
- Description: Supports the oct2uvec operation used by the surrounding class.

#### `public String enc(byte[] data)`
- Role: Performs enc.
- Description: Supports the enc operation used by the surrounding class.

#### `public byte[] dec(String data)`
- Role: Performs dec.
- Description: Supports the dec operation used by the surrounding class.

#### `public static char num2hex(int num, boolean upper)`
- Role: Performs num2hex.
- Description: Supports the num2hex operation used by the surrounding class.

#### `public static int hex2num(char hex)`
- Role: Performs hex2num.
- Description: Supports the hex2num operation used by the surrounding class.

#### `public Base64(String set, char pad)`
- Role: Performs base64.
- Description: Supports the base64 operation used by the surrounding class.

#### `public String enc(byte[] in)`
- Role: Performs enc.
- Description: Supports the enc operation used by the surrounding class.

#### `public byte[] dec(String in)`
- Role: Performs dec.
- Description: Supports the dec operation used by the surrounding class.

#### `public static String[] splitwords(String text)`
- Role: Performs splitwords.
- Description: Supports the splitwords operation used by the surrounding class.

#### `public static String[] splitlines(String text)`
- Role: Performs splitlines.
- Description: Supports the splitlines operation used by the surrounding class.

#### `static int atoi(String a)`
- Role: Performs atoi.
- Description: Supports the atoi operation used by the surrounding class.

#### `static void readtileof(InputStream in) throws IOException`
- Role: Handles the readtileof workflow.
- Description: Supports the readtileof operation used by the surrounding class.

#### `public static byte[] readall(InputStream in) throws IOException`
- Role: Handles the readall workflow.
- Description: Supports the readall operation used by the surrounding class.

#### `public T run() throws IOException`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public static <T> T ioretry(IOFunction<? extends T> task) throws IOException`
- Role: Handles the ioretry workflow.
- Description: Supports the ioretry operation used by the surrounding class.

#### `private static void dumptg(ThreadGroup tg, PrintWriter out, int indent)`
- Role: Performs dumptg.
- Description: Supports the dumptg operation used by the surrounding class.

#### `public static void dumptg(ThreadGroup tg, PrintWriter out)`
- Role: Performs dumptg.
- Description: Supports the dumptg operation used by the surrounding class.

#### `public static void dumparr(Object[] arr, PrintStream out, boolean term)`
- Role: Performs dumparr.
- Description: Supports the dumparr operation used by the surrounding class.

#### `public static void dumparr(double[] arr, PrintStream out, boolean term)`
- Role: Performs dumparr.
- Description: Supports the dumparr operation used by the surrounding class.

#### `public static void dumparr(float[] arr, PrintStream out, boolean term)`
- Role: Performs dumparr.
- Description: Supports the dumparr operation used by the surrounding class.

#### `public static void dumparr(long[] arr, PrintStream out, boolean term)`
- Role: Performs dumparr.
- Description: Supports the dumparr operation used by the surrounding class.

#### `public static void dumparr(int[] arr, PrintStream out, boolean term)`
- Role: Performs dumparr.
- Description: Supports the dumparr operation used by the surrounding class.

#### `public static void dumparr(short[] arr, PrintStream out, boolean term)`
- Role: Performs dumparr.
- Description: Supports the dumparr operation used by the surrounding class.

#### `public static void hexdump(byte[] arr, PrintStream out, int width)`
- Role: Performs hexdump.
- Description: Supports the hexdump operation used by the surrounding class.

#### `public static void hexdump(ByteBuffer arr, PrintStream out, int width)`
- Role: Performs hexdump.
- Description: Supports the hexdump operation used by the surrounding class.

#### `public static String titlecase(String str)`
- Role: Performs titlecase.
- Description: Supports the titlecase operation used by the surrounding class.

#### `public static Color contrast(Color col)`
- Role: Performs contrast.
- Description: Supports the contrast operation used by the surrounding class.

#### `public static Color clipcol(int r, int g, int b, int a)`
- Role: Performs clipcol.
- Description: Supports the clipcol operation used by the surrounding class.

#### `public static Color col16(int col)`
- Role: Performs col16.
- Description: Supports the col16 operation used by the surrounding class.

#### `public static BufferedImage outline(BufferedImage img, Color col)`
- Role: Performs outline.
- Description: Supports the outline operation used by the surrounding class.

#### `public static BufferedImage outline2(BufferedImage img, Color col)`
- Role: Performs outline2.
- Description: Supports the outline2 operation used by the surrounding class.

#### `public static int floordiv(int a, int b)`
- Role: Performs floordiv.
- Description: Supports the floordiv operation used by the surrounding class.

#### `public static int floormod(int a, int b)`
- Role: Performs floormod.
- Description: Supports the floormod operation used by the surrounding class.

#### `public static int floordiv(float a, float b)`
- Role: Performs floordiv.
- Description: Supports the floordiv operation used by the surrounding class.

#### `public static int floordiv(double a, double b)`
- Role: Performs floordiv.
- Description: Supports the floordiv operation used by the surrounding class.

#### `public static float floormod(float a, float b)`
- Role: Performs floormod.
- Description: Supports the floormod operation used by the surrounding class.

#### `public static double floormod(double a, double b)`
- Role: Performs floormod.
- Description: Supports the floormod operation used by the surrounding class.

#### `public static double cangle(double a)`
- Role: Performs cangle.
- Description: Supports the cangle operation used by the surrounding class.

#### `public static double cangle2(double a)`
- Role: Performs cangle2.
- Description: Supports the cangle2 operation used by the surrounding class.

#### `public static double clip(double d, double min, double max)`
- Role: Performs clip.
- Description: Supports the clip operation used by the surrounding class.

#### `public static float clip(float d, float min, float max)`
- Role: Performs clip.
- Description: Supports the clip operation used by the surrounding class.

#### `public static int clip(int i, int min, int max)`
- Role: Performs clip.
- Description: Supports the clip operation used by the surrounding class.

#### `public static double clipnorm(double d, double min, double max)`
- Role: Performs clipnorm.
- Description: Supports the clipnorm operation used by the surrounding class.

#### `public static <E, O extends Comparable<? super O>> E max(Collection<E> from, Function<? super E, O> key)`
- Role: Performs max.
- Description: Supports the max operation used by the surrounding class.

#### `public static <E, O extends Comparable<? super O>> E min(Collection<E> from, Function<? super E, O> key)`
- Role: Performs min.
- Description: Supports the min operation used by the surrounding class.

#### `public static <E extends Comparable<? super E>> E max(Collection<E> from)`
- Role: Performs max.
- Description: Supports the max operation used by the surrounding class.

#### `public static <E extends Comparable<? super E>> E min(Collection<E> from)`
- Role: Performs min.
- Description: Supports the min operation used by the surrounding class.

#### `public static float gcd(float x, float y, float E)`
- Role: Performs gcd.
- Description: Supports the gcd operation used by the surrounding class.

#### `public static float smoothstep(float d)`
- Role: Performs smoothstep.
- Description: Supports the smoothstep operation used by the surrounding class.

#### `public static double smoothstep(double d)`
- Role: Performs smoothstep.
- Description: Supports the smoothstep operation used by the surrounding class.

#### `public static Color blendcol(Color in, Color bl)`
- Role: Performs blendcol.
- Description: Supports the blendcol operation used by the surrounding class.

#### `public static Color blendcol(Color x, Color y, double a)`
- Role: Performs blendcol.
- Description: Supports the blendcol operation used by the surrounding class.

#### `public static Color colmul(Color a, Color b)`
- Role: Performs colmul.
- Description: Supports the colmul operation used by the surrounding class.

#### `public static Color preblend(Color c1, Color c2)`
- Role: Performs preblend.
- Description: Supports the preblend operation used by the surrounding class.

#### `public static void serialize(Object obj, OutputStream out) throws IOException`
- Role: Handles the serialize workflow.
- Description: Supports the serialize operation used by the surrounding class.

#### `public static byte[] serialize(Object obj)`
- Role: Performs serialize.
- Description: Supports the serialize operation used by the surrounding class.

#### `public static Object deserialize(InputStream in) throws IOException`
- Role: Handles the deserialize workflow.
- Description: Supports the deserialize operation used by the surrounding class.

#### `public static Object deserialize(byte[] buf)`
- Role: Performs deserialize.
- Description: Supports the deserialize operation used by the surrounding class.

#### `public static boolean parsebool(String s)`
- Role: Performs parsebool.
- Description: Supports the parsebool operation used by the surrounding class.

#### `public static boolean eq(Object a, Object b)`
- Role: Performs eq.
- Description: Supports the eq operation used by the surrounding class.

#### `public static boolean parsebool(String s, boolean def)`
- Role: Performs parsebool.
- Description: Supports the parsebool operation used by the surrounding class.

#### `public static FloatBuffer bufcp(float[] a)`
- Role: Performs bufcp.
- Description: Supports the bufcp operation used by the surrounding class.

#### `public static ShortBuffer bufcp(short[] a)`
- Role: Performs bufcp.
- Description: Supports the bufcp operation used by the surrounding class.

#### `public static FloatBuffer bufcp(FloatBuffer a)`
- Role: Performs bufcp.
- Description: Supports the bufcp operation used by the surrounding class.

#### `public static IntBuffer bufcp(IntBuffer a)`
- Role: Performs bufcp.
- Description: Supports the bufcp operation used by the surrounding class.

#### `public static ByteBuffer mkbbuf(int n)`
- Role: Performs mkbbuf.
- Description: Supports the mkbbuf operation used by the surrounding class.

#### `public static FloatBuffer mkfbuf(int n)`
- Role: Performs mkfbuf.
- Description: Supports the mkfbuf operation used by the surrounding class.

#### `public static ShortBuffer mksbuf(int n)`
- Role: Performs mksbuf.
- Description: Supports the mksbuf operation used by the surrounding class.

#### `public static IntBuffer mkibuf(int n)`
- Role: Performs mkibuf.
- Description: Supports the mkibuf operation used by the surrounding class.

#### `public static ByteBuffer wbbuf(int n)`
- Role: Performs wbbuf.
- Description: Supports the wbbuf operation used by the surrounding class.

#### `public static IntBuffer wibuf(int n)`
- Role: Performs wibuf.
- Description: Supports the wibuf operation used by the surrounding class.

#### `public static FloatBuffer wfbuf(int n)`
- Role: Performs wfbuf.
- Description: Supports the wfbuf operation used by the surrounding class.

#### `public static ShortBuffer wsbuf(int n)`
- Role: Performs wsbuf.
- Description: Supports the wsbuf operation used by the surrounding class.

#### `public static FloatBuffer wbufcp(FloatBuffer a)`
- Role: Performs wbufcp.
- Description: Supports the wbufcp operation used by the surrounding class.

#### `public static IntBuffer wbufcp(IntBuffer a)`
- Role: Performs wbufcp.
- Description: Supports the wbufcp operation used by the surrounding class.

#### `public static ByteBuffer growbuf(ByteBuffer buf, int req)`
- Role: Performs growbuf.
- Description: Supports the growbuf operation used by the surrounding class.

#### `public static float[] c2fa(Color c)`
- Role: Performs c2fa.
- Description: Supports the c2fa operation used by the surrounding class.

#### `public static <T> T[] mkarray(Class<T> cl, int len)`
- Role: Performs mkarray.
- Description: Supports the mkarray operation used by the surrounding class.

#### `public static <T> T[] splice(T[] src, int off, int len)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static <T> T[] splice(T[] src, int off)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static byte[] splice(byte[] src, int off, int len)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static byte[] splice(byte[] src, int off)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static float[] splice(float[] src, int off, int len)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static float[] splice(float[] src, int off)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static double[] splice(double[] src, int off, int len)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static double[] splice(double[] src, int off)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static int[] splice(int[] src, int off, int len)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static int[] splice(int[] src, int off)`
- Role: Performs splice.
- Description: Supports the splice operation used by the surrounding class.

#### `public static <T> T[] cast(Object[] a, Class<T> cl)`
- Role: Performs cast.
- Description: Supports the cast operation used by the surrounding class.

#### `public static <T> T[] extend(T[] src, int off, int nl)`
- Role: Performs extend.
- Description: Supports the extend operation used by the surrounding class.

#### `public static <T> T[] extend(T[] src, int nl)`
- Role: Performs extend.
- Description: Supports the extend operation used by the surrounding class.

#### `public static <T, E extends T> T[] extend(T[] src, E ne)`
- Role: Performs extend.
- Description: Supports the extend operation used by the surrounding class.

#### `public static <T, E extends T> T[] extend(T[] src, E[] ne)`
- Role: Performs extend.
- Description: Supports the extend operation used by the surrounding class.

#### `public static int[] extend(int[] src, int nl)`
- Role: Performs extend.
- Description: Supports the extend operation used by the surrounding class.

#### `public static double[] extend(double[] src, int nl)`
- Role: Performs extend.
- Description: Supports the extend operation used by the surrounding class.

#### `public static float[] extend(float[] src, int nl)`
- Role: Performs extend.
- Description: Supports the extend operation used by the surrounding class.

#### `public static short[] extend(short[] src, int nl)`
- Role: Performs extend.
- Description: Supports the extend operation used by the surrounding class.

#### `public static byte[] concat(byte[]... parts)`
- Role: Performs concat.
- Description: Supports the concat operation used by the surrounding class.

#### `public static <T> T el(Iterable<T> c)`
- Role: Performs el.
- Description: Supports the el operation used by the surrounding class.

#### `public static <T> T take(Iterable<T> c)`
- Role: Performs take.
- Description: Supports the take operation used by the surrounding class.

#### `public static <K, V> V pop(Map<K, V> map, K key, V def)`
- Role: Applies avatar description updates.
- Description: Supports the pop operation used by the surrounding class.

#### `public static <E> Set<E> union(Set<? extends E> a, Set<? extends E> b)`
- Role: Performs union.
- Description: Supports the union operation used by the surrounding class.

#### `public static <E> Set<E> isect(Set<? extends E> a, Set<?> b)`
- Role: Performs isect.
- Description: Supports the isect operation used by the surrounding class.

#### `public static <E> Set<E> setdiff(Set<? extends E> a, Set<?> b)`
- Role: Performs setdiff.
- Description: Supports the setdiff operation used by the surrounding class.

#### `public static <E> Set<E> symdiff(Set<? extends E> a, Set<? extends E> b)`
- Role: Performs symdiff.
- Description: Supports the symdiff operation used by the surrounding class.

#### `public static <T> List<T> reversed(List<T> ls)`
- Role: Performs reversed.
- Description: Supports the reversed operation used by the surrounding class.

#### `public static <T> int index(T[] arr, T el)`
- Role: Performs index.
- Description: Supports the index operation used by the surrounding class.

#### `public static boolean strcheck(String str, IntPredicate p)`
- Role: Performs strcheck.
- Description: Supports the strcheck operation used by the surrounding class.

#### `public static <T> T find(Iterable<? extends T> in, Predicate<? super T> p)`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `public static <T> T or(Supplier<T>... vals)`
- Role: Performs or.
- Description: Supports the or operation used by the surrounding class.

#### `public static <T> void clean(Collection<T> c, Consumer<? super T> clean)`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public static <T> T construct(Constructor<T> cons, Object... args)`
- Role: Performs construct.
- Description: Supports the construct operation used by the surrounding class.

#### `public static <T> T construct(Class<T> cl)`
- Role: Performs construct.
- Description: Supports the construct operation used by the surrounding class.

#### `public static Object invoke(Method mth, Object ob, Object... args)`
- Role: Performs invoke.
- Description: Supports the invoke operation used by the surrounding class.

#### `public static <R> Function<Object[], R> consfun(Class<R> cl, Class<?>... args) throws NoSuchMethodException`
- Role: Handles the consfun workflow.
- Description: Supports the consfun operation used by the surrounding class.

#### `public static <R> Function<Object[], R> smthfun(Class<?> cl, String name, Class<R> rtype, Class<?>...args) throws NoSuchMethodException`
- Role: Handles the smthfun workflow.
- Description: Supports the smthfun operation used by the surrounding class.

#### `public static String urlencode(String in)`
- Role: Performs urlencode.
- Description: Supports the urlencode operation used by the surrounding class.

#### `public static URI uriparam(URI base, Object... pars)`
- Role: Performs uriparam.
- Description: Supports the uriparam operation used by the surrounding class.

#### `public static <C> C hascause(Throwable t, Class<C> c)`
- Role: Performs hascause.
- Description: Supports the hascause operation used by the surrounding class.

#### `public static double ntime()`
- Role: Performs ntime.
- Description: Supports the ntime operation used by the surrounding class.

#### `public static double rtime()`
- Role: Performs rtime.
- Description: Supports the rtime operation used by the surrounding class.

#### `public MapBuilder(Map<K, V> bk)`
- Role: Performs map builder.
- Description: Supports the map builder operation used by the surrounding class.

#### `public MapBuilder<K, V> put(K k, V v)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public Map<K, V> map()`
- Role: Performs map.
- Description: Supports the map operation used by the surrounding class.

#### `public static <K, V> MapBuilder<K, V> map()`
- Role: Performs map.
- Description: Supports the map operation used by the surrounding class.

#### `public static <K, V> Map<K, V> index(Collection<? extends V> values, Function<? super V, ? extends K> key)`
- Role: Performs index.
- Description: Supports the index operation used by the surrounding class.

#### `public Range(int min, int max, int step)`
- Role: Performs range.
- Description: Supports the range operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public Integer get(int idx)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static List<Integer> range(int min, int max, int step)`
- Role: Performs range.
- Description: Supports the range operation used by the surrounding class.

#### `public static List<Integer> range(int min, int max)`
- Role: Performs range.
- Description: Supports the range operation used by the surrounding class.

#### `public static List<Integer> range(int max)`
- Role: Performs range.
- Description: Supports the range operation used by the surrounding class.

#### `public static <T> Indir<T> cache(Indir<T> src)`
- Role: Performs cache.
- Description: Supports the cache operation used by the surrounding class.

#### `public static <V, R> Indir<R> transform(Supplier<? extends V> val, Function<? super V, ? extends R> xf)`
- Role: Performs transform.
- Description: Supports the transform operation used by the surrounding class.

#### `public static <F, T> Iterator<T> map(Iterator<F> from, Function<? super F, ? extends T> fn)`
- Role: Performs map.
- Description: Supports the map operation used by the surrounding class.

#### `public static <E> Iterator<E> filter(Iterator<E> from, Predicate<? super E> filter)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public static void checkirq() throws InterruptedException`
- Role: Handles the checkirq workflow.
- Description: Supports the checkirq operation used by the surrounding class.

#### `public static <T, F> Iterator<T> filter(Iterator<F> from, Class<T> filter)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public static <E, T extends Collection<E>> T merge(T dst, Iterable<? extends E> a, Iterable<? extends E> b, Comparator<? super E> cmp)`
- Role: Performs merge.
- Description: Supports the merge operation used by the surrounding class.

#### `public static <T> Optional<T> ocast(Object x, Class<T> cl)`
- Role: Performs ocast.
- Description: Supports the ocast operation used by the surrounding class.

#### `public static int sidcmp(Object a, Object b)`
- Role: Performs sidcmp.
- Description: Supports the sidcmp operation used by the surrounding class.

#### `public static Object formatter(String fmt, Object... args)`
- Role: Performs formatter.
- Description: Supports the formatter operation used by the surrounding class.

#### `public static Object formatter(Supplier<String> str)`
- Role: Performs formatter.
- Description: Supports the formatter operation used by the surrounding class.

#### `public AddressFormatException(String message, CharSequence addr, String type)`
- Role: Performs address format exception.
- Description: Supports the address format exception operation used by the surrounding class.

#### `public AddressFormatException(String message, CharSequence addr, String type, Throwable cause)`
- Role: Performs address format exception.
- Description: Supports the address format exception operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public static Inet4Address in4_pton(CharSequence as)`
- Role: Performs in4 pton.
- Description: Supports the in4 pton operation used by the surrounding class.

#### `public static InetAddress in6_pton(CharSequence as)`
- Role: Performs in6 pton.
- Description: Supports the in6 pton operation used by the surrounding class.

#### `public static InetAddress inet_pton(CharSequence as)`
- Role: Performs inet pton.
- Description: Supports the inet pton operation used by the surrounding class.

#### `public static int compare(Object[] a, Object[] b)`
- Role: Performs compare.
- Description: Supports the compare operation used by the surrounding class.
