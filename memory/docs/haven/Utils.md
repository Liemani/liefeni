# Utils

## Meta

- Source: [Utils.java](../../../src/haven/Utils.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides broad Haven utility helpers.

## Code Members

### Member Index

#### Fields

- [utf8](#member-1)
- [ascii](#member-2)
- [rgbm](#member-3)
- [prefs](#member-4)
- [prefspec](#member-29)
- [hex](#member-98)
- [bprint](#member-99)
- [set](#member-100)
- [pad](#member-101)
- [rev](#member-102)
- [b64](#member-106)
- [b64np](#member-107)
- [ub64](#member-108)
- [vgapal](#member-127)
- [rtimeoff](#member-222)
- [bk](#member-224)
- [min](#member-230)
- [max](#member-231)
- [step](#member-232)
- [addr](#member-250)
- [type](#member-251)
- [idcmp](#member-259)

#### Methods

- [imgsz(BufferedImage img)](#member-5)
- [checkhit(BufferedImage img, Coord c, int thres)](#member-6)
- [checkhit(BufferedImage img, Coord c)](#member-7)
- [defer(final Runnable r)](#member-8)
- [uri(String uri)](#member-9)
- [url(URI uri)](#member-10)
- [url(String url)](#member-11)
- [path(String path)](#member-12)
- [pj(Path base, String... els)](#member-13)
- [srcpath(Class<?> cl)](#member-14)
- [public static SocketChannel connect(String host, int port) throws IOException](#member-15)
- [public static SocketChannel connect(NamedSocketAddress addr) throws IOException](#member-16)
- [drawtext(Graphics g, String text, Coord c)](#member-17)
- [textsz(Graphics g, String text)](#member-18)
- [aligntext(Graphics g, String text, Coord c, double ax, double ay)](#member-19)
- [fpformat(int num, int div, int dec)](#member-20)
- [thformat(long num)](#member-21)
- [odformat(double num, int md)](#member-22)
- [odformat2(double num, int md)](#member-23)
- [line(Graphics g, Coord c1, Coord c2)](#member-24)
- [AA(Graphics g)](#member-25)
- [mkrandoom(long seed)](#member-26)
- [fgrandoom(Random rnd)](#member-27)
- [sysprefs()](#member-28)
- [prefs()](#member-30)
- [getpref(String prefname, String def)](#member-31)
- [setpref(String prefname, String val)](#member-32)
- [getprefi(String prefname, int def)](#member-33)
- [setprefi(String prefname, int val)](#member-34)
- [getprefd(String prefname, double def)](#member-35)
- [setprefd(String prefname, double val)](#member-36)
- [getprefb(String prefname, boolean def)](#member-37)
- [setprefb(String prefname, boolean val)](#member-38)
- [getprefc(String prefname, Coord def)](#member-39)
- [setprefc(String prefname, Coord val)](#member-40)
- [getprefb(String prefname, byte[] def)](#member-41)
- [setprefb(String prefname, byte[] val)](#member-42)
- [getprefsl(String prefname, String[] def)](#member-43)
- [setprefsl(String prefname, Iterable<? extends CharSequence> val)](#member-44)
- [getprop(String propname, String def)](#member-45)
- [sv(Object arg)](#member-46)
- [olv(Object arg)](#member-47)
- [oav(Object arg)](#member-48)
- [iv(Object arg)](#member-49)
- [uiv(Object arg)](#member-50)
- [fv(Object arg)](#member-51)
- [dv(Object arg)](#member-52)
- [bv(Object arg)](#member-53)
- [irv(Object arg)](#member-54)
- [resv(Object arg)](#member-55)
- [mapdecn(Object ob, Class<K> kt, Class<V> vt)](#member-56)
- [mapdecn(Object ob)](#member-57)
- [mapencn(Map<?, ?> map)](#member-58)
- [mapdecf(Object ob, Class<K> kt, Class<V> vt)](#member-59)
- [mapdecf(Object ob)](#member-60)
- [mapencf(Map<?, ?> map)](#member-61)
- [sb(int n, int b)](#member-62)
- [sb(long n, int b)](#member-63)
- [ub(byte b)](#member-64)
- [sb(int b)](#member-65)
- [f2s8(float v)](#member-66)
- [f2u8(float v)](#member-67)
- [uint32(int n)](#member-68)
- [uint16d(byte[] buf, int off)](#member-69)
- [int16d(byte[] buf, int off)](#member-70)
- [uint32d(byte[] buf, int off)](#member-71)
- [uint32e(long num, byte[] buf, int off)](#member-72)
- [int32d(byte[] buf, int off)](#member-73)
- [int64d(byte[] buf, int off)](#member-74)
- [intvard(byte[] buf, int off)](#member-75)
- [int64e(long num, byte[] buf, int off)](#member-76)
- [int32e(int num, byte[] buf, int off)](#member-77)
- [uint16e(int num, byte[] buf, int off)](#member-78)
- [int16e(short num, byte[] buf, int off)](#member-79)
- [strd(byte[] buf, int[] off)](#member-80)
- [floatd(byte[] buf, int off)](#member-81)
- [float32d(byte[] buf, int off)](#member-82)
- [float64d(byte[] buf, int off)](#member-83)
- [float32e(float num, byte[] buf, int off)](#member-84)
- [float64e(double num, byte[] buf, int off)](#member-85)
- [float9995d(int word, float[] ret)](#member-86)
- [hfdec(short bits)](#member-87)
- [hfenc(float f)](#member-88)
- [mfdec(byte bits)](#member-89)
- [mfenc(float f)](#member-90)
- [uvec2oct(float[] buf, float x, float y, float z)](#member-91)
- [oct2uvec(float[] buf, float x, float y)](#member-92)
- [oct2uvec(float x, float y)](#member-93)
- [public String enc(byte[] data);](#member-94)
- [public byte[] dec(String data);](#member-95)
- [num2hex(int num, boolean upper)](#member-96)
- [hex2num(char hex)](#member-97)
- [Base64(String set, char pad)](#member-103)
- [enc(byte[] in)](#member-104)
- [dec(String in)](#member-105)
- [splitwords(String text)](#member-109)
- [splitlines(String text)](#member-110)
- [atoi(String a)](#member-111)
- [static void readtileof(InputStream in) throws IOException](#member-112)
- [public static byte[] readall(InputStream in) throws IOException](#member-113)
- [public T run() throws IOException;](#member-114)
- [public static <T> T ioretry(IOFunction<? extends T> task) throws IOException](#member-115)
- [dumptg(ThreadGroup tg, PrintWriter out, int indent)](#member-116)
- [dumptg(ThreadGroup tg, PrintWriter out)](#member-117)
- [dumparr(Object[] arr, PrintStream out, boolean term)](#member-118)
- [dumparr(double[] arr, PrintStream out, boolean term)](#member-119)
- [dumparr(float[] arr, PrintStream out, boolean term)](#member-120)
- [dumparr(long[] arr, PrintStream out, boolean term)](#member-121)
- [dumparr(int[] arr, PrintStream out, boolean term)](#member-122)
- [dumparr(short[] arr, PrintStream out, boolean term)](#member-123)
- [hexdump(byte[] arr, PrintStream out, int width)](#member-124)
- [hexdump(ByteBuffer arr, PrintStream out, int width)](#member-125)
- [titlecase(String str)](#member-126)
- [contrast(Color col)](#member-128)
- [clipcol(int r, int g, int b, int a)](#member-129)
- [col16(int col)](#member-130)
- [outline(BufferedImage img, Color col)](#member-131)
- [outline2(BufferedImage img, Color col)](#member-132)
- [floordiv(int a, int b)](#member-133)
- [floormod(int a, int b)](#member-134)
- [floordiv(float a, float b)](#member-135)
- [floordiv(double a, double b)](#member-136)
- [floormod(float a, float b)](#member-137)
- [floormod(double a, double b)](#member-138)
- [cangle(double a)](#member-139)
- [cangle2(double a)](#member-140)
- [clip(double d, double min, double max)](#member-141)
- [clip(float d, float min, float max)](#member-142)
- [clip(int i, int min, int max)](#member-143)
- [clipnorm(double d, double min, double max)](#member-144)
- [max(Collection<E> from, Function<? super E, O> key)](#member-145)
- [min(Collection<E> from, Function<? super E, O> key)](#member-146)
- [max(Collection<E> from)](#member-147)
- [min(Collection<E> from)](#member-148)
- [gcd(float x, float y, float E)](#member-149)
- [smoothstep(float d)](#member-150)
- [smoothstep(double d)](#member-151)
- [blendcol(Color in, Color bl)](#member-152)
- [blendcol(Color x, Color y, double a)](#member-153)
- [colmul(Color a, Color b)](#member-154)
- [preblend(Color c1, Color c2)](#member-155)
- [public static void serialize(Object obj, OutputStream out) throws IOException](#member-156)
- [serialize(Object obj)](#member-157)
- [public static Object deserialize(InputStream in) throws IOException](#member-158)
- [deserialize(byte[] buf)](#member-159)
- [parsebool(String s)](#member-160)
- [eq(Object a, Object b)](#member-161)
- [parsebool(String s, boolean def)](#member-162)
- [bufcp(float[] a)](#member-163)
- [bufcp(short[] a)](#member-164)
- [bufcp(FloatBuffer a)](#member-165)
- [bufcp(IntBuffer a)](#member-166)
- [mkbbuf(int n)](#member-167)
- [mkfbuf(int n)](#member-168)
- [mksbuf(int n)](#member-169)
- [mkibuf(int n)](#member-170)
- [wbbuf(int n)](#member-171)
- [wibuf(int n)](#member-172)
- [wfbuf(int n)](#member-173)
- [wsbuf(int n)](#member-174)
- [wbufcp(FloatBuffer a)](#member-175)
- [wbufcp(IntBuffer a)](#member-176)
- [growbuf(ByteBuffer buf, int req)](#member-177)
- [c2fa(Color c)](#member-178)
- [mkarray(Class<T> cl, int len)](#member-179)
- [splice(T[] src, int off, int len)](#member-180)
- [splice(T[] src, int off)](#member-181)
- [splice(byte[] src, int off, int len)](#member-182)
- [splice(byte[] src, int off)](#member-183)
- [splice(float[] src, int off, int len)](#member-184)
- [splice(float[] src, int off)](#member-185)
- [splice(double[] src, int off, int len)](#member-186)
- [splice(double[] src, int off)](#member-187)
- [splice(int[] src, int off, int len)](#member-188)
- [splice(int[] src, int off)](#member-189)
- [cast(Object[] a, Class<T> cl)](#member-190)
- [extend(T[] src, int off, int nl)](#member-191)
- [extend(T[] src, int nl)](#member-192)
- [extend(T[] src, E ne)](#member-193)
- [extend(T[] src, E[] ne)](#member-194)
- [extend(int[] src, int nl)](#member-195)
- [extend(double[] src, int nl)](#member-196)
- [extend(float[] src, int nl)](#member-197)
- [extend(short[] src, int nl)](#member-198)
- [concat(byte[]... parts)](#member-199)
- [el(Iterable<T> c)](#member-200)
- [take(Iterable<T> c)](#member-201)
- [pop(Map<K, V> map, K key, V def)](#member-202)
- [union(Set<? extends E> a, Set<? extends E> b)](#member-203)
- [isect(Set<? extends E> a, Set<?> b)](#member-204)
- [setdiff(Set<? extends E> a, Set<?> b)](#member-205)
- [symdiff(Set<? extends E> a, Set<? extends E> b)](#member-206)
- [reversed(List<T> ls)](#member-207)
- [index(T[] arr, T el)](#member-208)
- [strcheck(String str, IntPredicate p)](#member-209)
- [find(Iterable<? extends T> in, Predicate<? super T> p)](#member-210)
- [or(Supplier<T>... vals)](#member-211)
- [clean(Collection<T> c, Consumer<? super T> clean)](#member-212)
- [construct(Constructor<T> cons, Object... args)](#member-213)
- [construct(Class<T> cl)](#member-214)
- [invoke(Method mth, Object ob, Object... args)](#member-215)
- [public static <R> Function<Object[], R> consfun(Class<R> cl, Class<?>... args) throws NoSuchMethodException](#member-216)
- [public static <R> Function<Object[], R> smthfun(Class<?> cl, String name, Class<R> rtype, Class<?>...args) throws NoSuchMethodException](#member-217)
- [urlencode(String in)](#member-218)
- [uriparam(URI base, Object... pars)](#member-219)
- [hascause(Throwable t, Class<C> c)](#member-220)
- [ntime()](#member-221)
- [rtime()](#member-223)
- [MapBuilder(Map<K, V> bk)](#member-225)
- [put(K k, V v)](#member-226)
- [map()](#member-227)
- [map()](#member-228)
- [index(Collection<? extends V> values, Function<? super V, ? extends K> key)](#member-229)
- [Range(int min, int max, int step)](#member-233)
- [size()](#member-234)
- [get(int idx)](#member-235)
- [range(int min, int max, int step)](#member-236)
- [range(int min, int max)](#member-237)
- [range(int max)](#member-238)
- [cache(Indir<T> src)](#member-239)
- [transform(Supplier<? extends V> val, Function<? super V, ? extends R> xf)](#member-240)
- [map(Iterator<F> from, Function<? super F, ? extends T> fn)](#member-241)
- [filter(Iterator<E> from, Predicate<? super E> filter)](#member-242)
- [public static void checkirq() throws InterruptedException](#member-243)
- [filter(Iterator<F> from, Class<T> filter)](#member-244)
- [merge(T dst, Iterable<? extends E> a, Iterable<? extends E> b, Comparator<? super E> cmp)](#member-245)
- [ocast(Object x, Class<T> cl)](#member-246)
- [sidcmp(Object a, Object b)](#member-247)
- [formatter(String fmt, Object... args)](#member-248)
- [formatter(Supplier<String> str)](#member-249)
- [AddressFormatException(String message, CharSequence addr, String type)](#member-252)
- [AddressFormatException(String message, CharSequence addr, String type, Throwable cause)](#member-253)
- [getMessage()](#member-254)
- [in4_pton(CharSequence as)](#member-255)
- [in6_pton(CharSequence as)](#member-256)
- [inet_pton(CharSequence as)](#member-257)
- [compare(Object[] a, Object[] b)](#member-258)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `utf8`

- Description: TODO

<a id="member-2"></a>
##### `ascii`

- Description: TODO

<a id="member-3"></a>
##### `rgbm`

- Description: TODO

<a id="member-4"></a>
##### `prefs`

- Description: TODO

<a id="member-29"></a>
##### `prefspec`

- Description: TODO

<a id="member-98"></a>
##### `hex`

- Description: TODO

<a id="member-99"></a>
##### `bprint`

- Description: TODO

<a id="member-100"></a>
##### `set`

- Description: TODO

<a id="member-101"></a>
##### `pad`

- Description: TODO

<a id="member-102"></a>
##### `rev`

- Description: TODO

<a id="member-106"></a>
##### `b64`

- Description: TODO

<a id="member-107"></a>
##### `b64np`

- Description: TODO

<a id="member-108"></a>
##### `ub64`

- Description: TODO

<a id="member-127"></a>
##### `vgapal`

- Description: TODO

<a id="member-222"></a>
##### `rtimeoff`

- Description: TODO

<a id="member-224"></a>
##### `bk`

- Description: TODO

<a id="member-230"></a>
##### `min`

- Description: TODO

<a id="member-231"></a>
##### `max`

- Description: TODO

<a id="member-232"></a>
##### `step`

- Description: TODO

<a id="member-250"></a>
##### `addr`

- Description: TODO

<a id="member-251"></a>
##### `type`

- Description: TODO

<a id="member-259"></a>
##### `idcmp`

- Description: TODO

#### Methods

<a id="member-5"></a>
##### `imgsz(BufferedImage img)`

- Description: TODO

<a id="member-6"></a>
##### `checkhit(BufferedImage img, Coord c, int thres)`

- Description: TODO

<a id="member-7"></a>
##### `checkhit(BufferedImage img, Coord c)`

- Description: TODO

<a id="member-8"></a>
##### `defer(final Runnable r)`

- Description: TODO

<a id="member-9"></a>
##### `uri(String uri)`

- Description: TODO

<a id="member-10"></a>
##### `url(URI uri)`

- Description: TODO

<a id="member-11"></a>
##### `url(String url)`

- Description: TODO

<a id="member-12"></a>
##### `path(String path)`

- Description: TODO

<a id="member-13"></a>
##### `pj(Path base, String... els)`

- Description: TODO

<a id="member-14"></a>
##### `srcpath(Class<?> cl)`

- Description: TODO

<a id="member-15"></a>
##### `public static SocketChannel connect(String host, int port) throws IOException`

- Description: TODO

<a id="member-16"></a>
##### `public static SocketChannel connect(NamedSocketAddress addr) throws IOException`

- Description: TODO

<a id="member-17"></a>
##### `drawtext(Graphics g, String text, Coord c)`

- Description: TODO

<a id="member-18"></a>
##### `textsz(Graphics g, String text)`

- Description: TODO

<a id="member-19"></a>
##### `aligntext(Graphics g, String text, Coord c, double ax, double ay)`

- Description: TODO

<a id="member-20"></a>
##### `fpformat(int num, int div, int dec)`

- Description: TODO

<a id="member-21"></a>
##### `thformat(long num)`

- Description: TODO

<a id="member-22"></a>
##### `odformat(double num, int md)`

- Description: TODO

<a id="member-23"></a>
##### `odformat2(double num, int md)`

- Description: TODO

<a id="member-24"></a>
##### `line(Graphics g, Coord c1, Coord c2)`

- Description: TODO

<a id="member-25"></a>
##### `AA(Graphics g)`

- Description: TODO

<a id="member-26"></a>
##### `mkrandoom(long seed)`

- Description: TODO

<a id="member-27"></a>
##### `fgrandoom(Random rnd)`

- Description: TODO

<a id="member-28"></a>
##### `sysprefs()`

- Description: TODO

<a id="member-30"></a>
##### `prefs()`

- Description: TODO

<a id="member-31"></a>
##### `getpref(String prefname, String def)`

- Description: TODO

<a id="member-32"></a>
##### `setpref(String prefname, String val)`

- Description: TODO

<a id="member-33"></a>
##### `getprefi(String prefname, int def)`

- Description: TODO

<a id="member-34"></a>
##### `setprefi(String prefname, int val)`

- Description: TODO

<a id="member-35"></a>
##### `getprefd(String prefname, double def)`

- Description: TODO

<a id="member-36"></a>
##### `setprefd(String prefname, double val)`

- Description: TODO

<a id="member-37"></a>
##### `getprefb(String prefname, boolean def)`

- Description: TODO

<a id="member-38"></a>
##### `setprefb(String prefname, boolean val)`

- Description: TODO

<a id="member-39"></a>
##### `getprefc(String prefname, Coord def)`

- Description: TODO

<a id="member-40"></a>
##### `setprefc(String prefname, Coord val)`

- Description: TODO

<a id="member-41"></a>
##### `getprefb(String prefname, byte[] def)`

- Description: TODO

<a id="member-42"></a>
##### `setprefb(String prefname, byte[] val)`

- Description: TODO

<a id="member-43"></a>
##### `getprefsl(String prefname, String[] def)`

- Description: TODO

<a id="member-44"></a>
##### `setprefsl(String prefname, Iterable<? extends CharSequence> val)`

- Description: TODO

<a id="member-45"></a>
##### `getprop(String propname, String def)`

- Description: TODO

<a id="member-46"></a>
##### `sv(Object arg)`

- Description: TODO

<a id="member-47"></a>
##### `olv(Object arg)`

- Description: TODO

<a id="member-48"></a>
##### `oav(Object arg)`

- Description: TODO

<a id="member-49"></a>
##### `iv(Object arg)`

- Description: TODO

<a id="member-50"></a>
##### `uiv(Object arg)`

- Description: TODO

<a id="member-51"></a>
##### `fv(Object arg)`

- Description: TODO

<a id="member-52"></a>
##### `dv(Object arg)`

- Description: TODO

<a id="member-53"></a>
##### `bv(Object arg)`

- Description: TODO

<a id="member-54"></a>
##### `irv(Object arg)`

- Description: TODO

<a id="member-55"></a>
##### `resv(Object arg)`

- Description: TODO

<a id="member-56"></a>
##### `mapdecn(Object ob, Class<K> kt, Class<V> vt)`

- Description: TODO

<a id="member-57"></a>
##### `mapdecn(Object ob)`

- Description: TODO

<a id="member-58"></a>
##### `mapencn(Map<?, ?> map)`

- Description: TODO

<a id="member-59"></a>
##### `mapdecf(Object ob, Class<K> kt, Class<V> vt)`

- Description: TODO

<a id="member-60"></a>
##### `mapdecf(Object ob)`

- Description: TODO

<a id="member-61"></a>
##### `mapencf(Map<?, ?> map)`

- Description: TODO

<a id="member-62"></a>
##### `sb(int n, int b)`

- Description: TODO

<a id="member-63"></a>
##### `sb(long n, int b)`

- Description: TODO

<a id="member-64"></a>
##### `ub(byte b)`

- Description: TODO

<a id="member-65"></a>
##### `sb(int b)`

- Description: TODO

<a id="member-66"></a>
##### `f2s8(float v)`

- Description: TODO

<a id="member-67"></a>
##### `f2u8(float v)`

- Description: TODO

<a id="member-68"></a>
##### `uint32(int n)`

- Description: TODO

<a id="member-69"></a>
##### `uint16d(byte[] buf, int off)`

- Description: TODO

<a id="member-70"></a>
##### `int16d(byte[] buf, int off)`

- Description: TODO

<a id="member-71"></a>
##### `uint32d(byte[] buf, int off)`

- Description: TODO

<a id="member-72"></a>
##### `uint32e(long num, byte[] buf, int off)`

- Description: TODO

<a id="member-73"></a>
##### `int32d(byte[] buf, int off)`

- Description: TODO

<a id="member-74"></a>
##### `int64d(byte[] buf, int off)`

- Description: TODO

<a id="member-75"></a>
##### `intvard(byte[] buf, int off)`

- Description: TODO

<a id="member-76"></a>
##### `int64e(long num, byte[] buf, int off)`

- Description: TODO

<a id="member-77"></a>
##### `int32e(int num, byte[] buf, int off)`

- Description: TODO

<a id="member-78"></a>
##### `uint16e(int num, byte[] buf, int off)`

- Description: TODO

<a id="member-79"></a>
##### `int16e(short num, byte[] buf, int off)`

- Description: TODO

<a id="member-80"></a>
##### `strd(byte[] buf, int[] off)`

- Description: TODO

<a id="member-81"></a>
##### `floatd(byte[] buf, int off)`

- Description: TODO

<a id="member-82"></a>
##### `float32d(byte[] buf, int off)`

- Description: TODO

<a id="member-83"></a>
##### `float64d(byte[] buf, int off)`

- Description: TODO

<a id="member-84"></a>
##### `float32e(float num, byte[] buf, int off)`

- Description: TODO

<a id="member-85"></a>
##### `float64e(double num, byte[] buf, int off)`

- Description: TODO

<a id="member-86"></a>
##### `float9995d(int word, float[] ret)`

- Description: TODO

<a id="member-87"></a>
##### `hfdec(short bits)`

- Description: TODO

<a id="member-88"></a>
##### `hfenc(float f)`

- Description: TODO

<a id="member-89"></a>
##### `mfdec(byte bits)`

- Description: TODO

<a id="member-90"></a>
##### `mfenc(float f)`

- Description: TODO

<a id="member-91"></a>
##### `uvec2oct(float[] buf, float x, float y, float z)`

- Description: TODO

<a id="member-92"></a>
##### `oct2uvec(float[] buf, float x, float y)`

- Description: TODO

<a id="member-93"></a>
##### `oct2uvec(float x, float y)`

- Description: TODO

<a id="member-94"></a>
##### `public String enc(byte[] data);`

- Description: TODO

<a id="member-95"></a>
##### `public byte[] dec(String data);`

- Description: TODO

<a id="member-96"></a>
##### `num2hex(int num, boolean upper)`

- Description: TODO

<a id="member-97"></a>
##### `hex2num(char hex)`

- Description: TODO

<a id="member-103"></a>
##### `Base64(String set, char pad)`

- Description: TODO

<a id="member-104"></a>
##### `enc(byte[] in)`

- Description: TODO

<a id="member-105"></a>
##### `dec(String in)`

- Description: TODO

<a id="member-109"></a>
##### `splitwords(String text)`

- Description: TODO

<a id="member-110"></a>
##### `splitlines(String text)`

- Description: TODO

<a id="member-111"></a>
##### `atoi(String a)`

- Description: TODO

<a id="member-112"></a>
##### `static void readtileof(InputStream in) throws IOException`

- Description: TODO

<a id="member-113"></a>
##### `public static byte[] readall(InputStream in) throws IOException`

- Description: TODO

<a id="member-114"></a>
##### `public T run() throws IOException;`

- Description: TODO

<a id="member-115"></a>
##### `public static <T> T ioretry(IOFunction<? extends T> task) throws IOException`

- Description: TODO

<a id="member-116"></a>
##### `dumptg(ThreadGroup tg, PrintWriter out, int indent)`

- Description: TODO

<a id="member-117"></a>
##### `dumptg(ThreadGroup tg, PrintWriter out)`

- Description: TODO

<a id="member-118"></a>
##### `dumparr(Object[] arr, PrintStream out, boolean term)`

- Description: TODO

<a id="member-119"></a>
##### `dumparr(double[] arr, PrintStream out, boolean term)`

- Description: TODO

<a id="member-120"></a>
##### `dumparr(float[] arr, PrintStream out, boolean term)`

- Description: TODO

<a id="member-121"></a>
##### `dumparr(long[] arr, PrintStream out, boolean term)`

- Description: TODO

<a id="member-122"></a>
##### `dumparr(int[] arr, PrintStream out, boolean term)`

- Description: TODO

<a id="member-123"></a>
##### `dumparr(short[] arr, PrintStream out, boolean term)`

- Description: TODO

<a id="member-124"></a>
##### `hexdump(byte[] arr, PrintStream out, int width)`

- Description: TODO

<a id="member-125"></a>
##### `hexdump(ByteBuffer arr, PrintStream out, int width)`

- Description: TODO

<a id="member-126"></a>
##### `titlecase(String str)`

- Description: TODO

<a id="member-128"></a>
##### `contrast(Color col)`

- Description: TODO

<a id="member-129"></a>
##### `clipcol(int r, int g, int b, int a)`

- Description: TODO

<a id="member-130"></a>
##### `col16(int col)`

- Description: TODO

<a id="member-131"></a>
##### `outline(BufferedImage img, Color col)`

- Description: TODO

<a id="member-132"></a>
##### `outline2(BufferedImage img, Color col)`

- Description: TODO

<a id="member-133"></a>
##### `floordiv(int a, int b)`

- Description: TODO

<a id="member-134"></a>
##### `floormod(int a, int b)`

- Description: TODO

<a id="member-135"></a>
##### `floordiv(float a, float b)`

- Description: TODO

<a id="member-136"></a>
##### `floordiv(double a, double b)`

- Description: TODO

<a id="member-137"></a>
##### `floormod(float a, float b)`

- Description: TODO

<a id="member-138"></a>
##### `floormod(double a, double b)`

- Description: TODO

<a id="member-139"></a>
##### `cangle(double a)`

- Description: TODO

<a id="member-140"></a>
##### `cangle2(double a)`

- Description: TODO

<a id="member-141"></a>
##### `clip(double d, double min, double max)`

- Description: TODO

<a id="member-142"></a>
##### `clip(float d, float min, float max)`

- Description: TODO

<a id="member-143"></a>
##### `clip(int i, int min, int max)`

- Description: TODO

<a id="member-144"></a>
##### `clipnorm(double d, double min, double max)`

- Description: TODO

<a id="member-145"></a>
##### `max(Collection<E> from, Function<? super E, O> key)`

- Description: TODO

<a id="member-146"></a>
##### `min(Collection<E> from, Function<? super E, O> key)`

- Description: TODO

<a id="member-147"></a>
##### `max(Collection<E> from)`

- Description: TODO

<a id="member-148"></a>
##### `min(Collection<E> from)`

- Description: TODO

<a id="member-149"></a>
##### `gcd(float x, float y, float E)`

- Description: TODO

<a id="member-150"></a>
##### `smoothstep(float d)`

- Description: TODO

<a id="member-151"></a>
##### `smoothstep(double d)`

- Description: TODO

<a id="member-152"></a>
##### `blendcol(Color in, Color bl)`

- Description: TODO

<a id="member-153"></a>
##### `blendcol(Color x, Color y, double a)`

- Description: TODO

<a id="member-154"></a>
##### `colmul(Color a, Color b)`

- Description: TODO

<a id="member-155"></a>
##### `preblend(Color c1, Color c2)`

- Description: TODO

<a id="member-156"></a>
##### `public static void serialize(Object obj, OutputStream out) throws IOException`

- Description: TODO

<a id="member-157"></a>
##### `serialize(Object obj)`

- Description: TODO

<a id="member-158"></a>
##### `public static Object deserialize(InputStream in) throws IOException`

- Description: TODO

<a id="member-159"></a>
##### `deserialize(byte[] buf)`

- Description: TODO

<a id="member-160"></a>
##### `parsebool(String s)`

- Description: TODO

<a id="member-161"></a>
##### `eq(Object a, Object b)`

- Description: TODO

<a id="member-162"></a>
##### `parsebool(String s, boolean def)`

- Description: TODO

<a id="member-163"></a>
##### `bufcp(float[] a)`

- Description: TODO

<a id="member-164"></a>
##### `bufcp(short[] a)`

- Description: TODO

<a id="member-165"></a>
##### `bufcp(FloatBuffer a)`

- Description: TODO

<a id="member-166"></a>
##### `bufcp(IntBuffer a)`

- Description: TODO

<a id="member-167"></a>
##### `mkbbuf(int n)`

- Description: TODO

<a id="member-168"></a>
##### `mkfbuf(int n)`

- Description: TODO

<a id="member-169"></a>
##### `mksbuf(int n)`

- Description: TODO

<a id="member-170"></a>
##### `mkibuf(int n)`

- Description: TODO

<a id="member-171"></a>
##### `wbbuf(int n)`

- Description: TODO

<a id="member-172"></a>
##### `wibuf(int n)`

- Description: TODO

<a id="member-173"></a>
##### `wfbuf(int n)`

- Description: TODO

<a id="member-174"></a>
##### `wsbuf(int n)`

- Description: TODO

<a id="member-175"></a>
##### `wbufcp(FloatBuffer a)`

- Description: TODO

<a id="member-176"></a>
##### `wbufcp(IntBuffer a)`

- Description: TODO

<a id="member-177"></a>
##### `growbuf(ByteBuffer buf, int req)`

- Description: TODO

<a id="member-178"></a>
##### `c2fa(Color c)`

- Description: TODO

<a id="member-179"></a>
##### `mkarray(Class<T> cl, int len)`

- Description: TODO

<a id="member-180"></a>
##### `splice(T[] src, int off, int len)`

- Description: TODO

<a id="member-181"></a>
##### `splice(T[] src, int off)`

- Description: TODO

<a id="member-182"></a>
##### `splice(byte[] src, int off, int len)`

- Description: TODO

<a id="member-183"></a>
##### `splice(byte[] src, int off)`

- Description: TODO

<a id="member-184"></a>
##### `splice(float[] src, int off, int len)`

- Description: TODO

<a id="member-185"></a>
##### `splice(float[] src, int off)`

- Description: TODO

<a id="member-186"></a>
##### `splice(double[] src, int off, int len)`

- Description: TODO

<a id="member-187"></a>
##### `splice(double[] src, int off)`

- Description: TODO

<a id="member-188"></a>
##### `splice(int[] src, int off, int len)`

- Description: TODO

<a id="member-189"></a>
##### `splice(int[] src, int off)`

- Description: TODO

<a id="member-190"></a>
##### `cast(Object[] a, Class<T> cl)`

- Description: TODO

<a id="member-191"></a>
##### `extend(T[] src, int off, int nl)`

- Description: TODO

<a id="member-192"></a>
##### `extend(T[] src, int nl)`

- Description: TODO

<a id="member-193"></a>
##### `extend(T[] src, E ne)`

- Description: TODO

<a id="member-194"></a>
##### `extend(T[] src, E[] ne)`

- Description: TODO

<a id="member-195"></a>
##### `extend(int[] src, int nl)`

- Description: TODO

<a id="member-196"></a>
##### `extend(double[] src, int nl)`

- Description: TODO

<a id="member-197"></a>
##### `extend(float[] src, int nl)`

- Description: TODO

<a id="member-198"></a>
##### `extend(short[] src, int nl)`

- Description: TODO

<a id="member-199"></a>
##### `concat(byte[]... parts)`

- Description: TODO

<a id="member-200"></a>
##### `el(Iterable<T> c)`

- Description: TODO

<a id="member-201"></a>
##### `take(Iterable<T> c)`

- Description: TODO

<a id="member-202"></a>
##### `pop(Map<K, V> map, K key, V def)`

- Description: TODO

<a id="member-203"></a>
##### `union(Set<? extends E> a, Set<? extends E> b)`

- Description: TODO

<a id="member-204"></a>
##### `isect(Set<? extends E> a, Set<?> b)`

- Description: TODO

<a id="member-205"></a>
##### `setdiff(Set<? extends E> a, Set<?> b)`

- Description: TODO

<a id="member-206"></a>
##### `symdiff(Set<? extends E> a, Set<? extends E> b)`

- Description: TODO

<a id="member-207"></a>
##### `reversed(List<T> ls)`

- Description: TODO

<a id="member-208"></a>
##### `index(T[] arr, T el)`

- Description: TODO

<a id="member-209"></a>
##### `strcheck(String str, IntPredicate p)`

- Description: TODO

<a id="member-210"></a>
##### `find(Iterable<? extends T> in, Predicate<? super T> p)`

- Description: TODO

<a id="member-211"></a>
##### `or(Supplier<T>... vals)`

- Description: TODO

<a id="member-212"></a>
##### `clean(Collection<T> c, Consumer<? super T> clean)`

- Description: TODO

<a id="member-213"></a>
##### `construct(Constructor<T> cons, Object... args)`

- Description: TODO

<a id="member-214"></a>
##### `construct(Class<T> cl)`

- Description: TODO

<a id="member-215"></a>
##### `invoke(Method mth, Object ob, Object... args)`

- Description: TODO

<a id="member-216"></a>
##### `public static <R> Function<Object[], R> consfun(Class<R> cl, Class<?>... args) throws NoSuchMethodException`

- Description: TODO

<a id="member-217"></a>
##### `public static <R> Function<Object[], R> smthfun(Class<?> cl, String name, Class<R> rtype, Class<?>...args) throws NoSuchMethodException`

- Description: TODO

<a id="member-218"></a>
##### `urlencode(String in)`

- Description: TODO

<a id="member-219"></a>
##### `uriparam(URI base, Object... pars)`

- Description: TODO

<a id="member-220"></a>
##### `hascause(Throwable t, Class<C> c)`

- Description: TODO

<a id="member-221"></a>
##### `ntime()`

- Description: TODO

<a id="member-223"></a>
##### `rtime()`

- Description: TODO

<a id="member-225"></a>
##### `MapBuilder(Map<K, V> bk)`

- Description: TODO

<a id="member-226"></a>
##### `put(K k, V v)`

- Description: TODO

<a id="member-227"></a>
##### `map()`

- Description: TODO

<a id="member-228"></a>
##### `map()`

- Description: TODO

<a id="member-229"></a>
##### `index(Collection<? extends V> values, Function<? super V, ? extends K> key)`

- Description: TODO

<a id="member-233"></a>
##### `Range(int min, int max, int step)`

- Description: TODO

<a id="member-234"></a>
##### `size()`

- Description: TODO

<a id="member-235"></a>
##### `get(int idx)`

- Description: TODO

<a id="member-236"></a>
##### `range(int min, int max, int step)`

- Description: TODO

<a id="member-237"></a>
##### `range(int min, int max)`

- Description: TODO

<a id="member-238"></a>
##### `range(int max)`

- Description: TODO

<a id="member-239"></a>
##### `cache(Indir<T> src)`

- Description: TODO

<a id="member-240"></a>
##### `transform(Supplier<? extends V> val, Function<? super V, ? extends R> xf)`

- Description: TODO

<a id="member-241"></a>
##### `map(Iterator<F> from, Function<? super F, ? extends T> fn)`

- Description: TODO

<a id="member-242"></a>
##### `filter(Iterator<E> from, Predicate<? super E> filter)`

- Description: TODO

<a id="member-243"></a>
##### `public static void checkirq() throws InterruptedException`

- Description: TODO

<a id="member-244"></a>
##### `filter(Iterator<F> from, Class<T> filter)`

- Description: TODO

<a id="member-245"></a>
##### `merge(T dst, Iterable<? extends E> a, Iterable<? extends E> b, Comparator<? super E> cmp)`

- Description: TODO

<a id="member-246"></a>
##### `ocast(Object x, Class<T> cl)`

- Description: TODO

<a id="member-247"></a>
##### `sidcmp(Object a, Object b)`

- Description: TODO

<a id="member-248"></a>
##### `formatter(String fmt, Object... args)`

- Description: TODO

<a id="member-249"></a>
##### `formatter(Supplier<String> str)`

- Description: TODO

<a id="member-252"></a>
##### `AddressFormatException(String message, CharSequence addr, String type)`

- Description: TODO

<a id="member-253"></a>
##### `AddressFormatException(String message, CharSequence addr, String type, Throwable cause)`

- Description: TODO

<a id="member-254"></a>
##### `getMessage()`

- Description: TODO

<a id="member-255"></a>
##### `in4_pton(CharSequence as)`

- Description: TODO

<a id="member-256"></a>
##### `in6_pton(CharSequence as)`

- Description: TODO

<a id="member-257"></a>
##### `inet_pton(CharSequence as)`

- Description: TODO

<a id="member-258"></a>
##### `compare(Object[] a, Object[] b)`

- Description: TODO
