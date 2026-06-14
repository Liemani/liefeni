# Resource

## Meta

- Source: [Resource.java](../../../src/haven/Resource.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a loaded resource.

## Code Members

### Member Index

#### Constants

- [OVERRIDE_ALL](#member-281)
- [RESOURCE_SIG](#member-341)

#### Fields

- [resurl](#member-1)
- [resdir](#member-2)
- [prscache](#member-3)
- [loadergroup](#member-4)
- [ltypes](#member-5)
- [imgc](#member-6)
- [negc](#member-7)
- [props](#member-8)
- [obst](#member-9)
- [animc](#member-10)
- [pagina](#member-11)
- [action](#member-12)
- [audio](#member-13)
- [tooltip](#member-14)
- [name](#member-15)
- [ver](#member-16)
- [source](#member-17)
- [pool](#member-18)
- [layers](#member-19)
- [used](#member-20)
- [name](#member-21)
- [ver](#member-22)
- [pool](#member-27)
- [pool](#member-32)
- [prio](#member-33)
- [wver](#member-34)
- [verr](#member-35)
- [loaded](#member-36)
- [rr](#member-43)
- [bk](#member-48)
- [map](#member-49)
- [back](#member-63)
- [cache](#member-68)
- [cachedesc](#member-69)
- [wintraps](#member-73)
- [windows](#member-74)
- [winsafe](#member-75)
- [base](#member-76)
- [base](#member-82)
- [base](#member-86)
- [res](#member-91)
- [name](#member-96)
- [ver](#member-97)
- [curver](#member-105)
- [cursrc](#member-106)
- [nloaders](#member-109)
- [loaders](#member-110)
- [sources](#member-111)
- [cache](#member-112)
- [queue](#member-113)
- [queued](#member-114)
- [parent](#member-115)
- [rdep](#member-119)
- [wq](#member-120)
- [prio](#member-121)
- [awaiting](#member-122)
- [done](#member-123)
- [res](#member-124)
- [error](#member-125)
- [found](#member-126)
- [added](#member-141)
- [loadwaited](#member-147)
- [_local](#member-154)
- [_remote](#member-156)
- [res](#member-159)
- [src](#member-160)
- [prev](#member-161)
- [thing](#member-165)
- [found](#member-166)
- [res](#member-169)
- [pool](#member-173)
- [cl](#member-181)
- [cons](#member-182)
- [supported](#member-190)
- [img](#member-193)
- [scaled](#member-194)
- [tex](#member-195)
- [rawtex](#member-196)
- [z](#member-197)
- [subz](#member-198)
- [nooff](#member-199)
- [id](#member-200)
- [info](#member-201)
- [scale](#member-202)
- [sz](#member-203)
- [o](#member-204)
- [so](#member-205)
- [tsz](#member-206)
- [ssz](#member-207)
- [stsz](#member-208)
- [t](#member-216)
- [cc](#member-219)
- [ep](#member-220)
- [props](#member-223)
- [id](#member-227)
- [p](#member-228)
- [ids](#member-232)
- [id](#member-233)
- [d](#member-234)
- [f](#member-235)
- [text](#member-238)
- [name](#member-241)
- [parent](#member-242)
- [hk](#member-243)
- [ad](#member-244)
- [Instancer.class](#member-249)
- [type](#member-252)
- [type](#member-255)
- [name](#member-256)
- [rtype](#member-257)
- [args](#member-258)
- [maker](#member-259)
- [type](#member-262)
- [rtype](#member-263)
- [args](#member-264)
- [maker](#member-265)
- [type](#member-268)
- [sub](#member-269)
- [simple](#member-273)
- [instancers](#member-274)
- [name](#member-277)
- [data](#member-278)
- [entry](#member-282)
- [classpath](#member-290)
- [clname](#member-293)
- [res](#member-294)
- [builtinents](#member-296)
- [clmap](#member-297)
- [pe](#member-298)
- [pa](#member-299)
- [classpath](#member-300)
- [loader](#member-301)
- [lpe](#member-302)
- [ipe](#member-303)
- [coded](#member-314)
- [id](#member-315)
- [info](#member-316)
- [bvol](#member-317)
- [seq](#member-324)
- [font](#member-327)
- [indir](#member-343)

#### Methods

- [Named(String name, int ver)](#member-23)
- [equals(Object other)](#member-24)
- [hashCode()](#member-25)
- [toString()](#member-26)
- [Spec(Pool pool, String name, int ver)](#member-28)
- [Spec(Pool pool, String name)](#member-29)
- [get(int prio)](#member-30)
- [get()](#member-31)
- [Saved(Pool pool, String name, int ver)](#member-37)
- [get(int prio)](#member-38)
- [get()](#member-39)
- [savever()](#member-40)
- [public Indir<Resource> getres(int id);](#member-41)
- [dynres(UID uid)](#member-42)
- [Descriptor(R rr)](#member-44)
- [opt(Object desc)](#member-45)
- [desc()](#member-46)
- [getresv(Object desc)](#member-47)
- [ResourceMap(Resource.Resolver bk, Map<Integer, ? extends Object> map)](#member-50)
- [ResourceMap(Resource.Resolver bk, Message data)](#member-51)
- [ResourceMap(Resource.Resolver bk, Object[] args)](#member-52)
- [decode(Message sdt)](#member-53)
- [decode(Object[] args)](#member-54)
- [getres(int id)](#member-55)
- [dynres(UID uid)](#member-56)
- [toString()](#member-57)
- [Virtual(Pool pool, String name, int ver)](#member-58)
- [add(Layer layer)](#member-59)
- [setcache(ResCache cache)](#member-60)
- [basename()](#member-61)
- [public InputStream get(String name) throws IOException;](#member-62)
- [TeeSource(ResSource back)](#member-64)
- [public InputStream get(String name) throws IOException](#member-65)
- [public abstract OutputStream fork(String name) throws IOException;](#member-66)
- [toString()](#member-67)
- [CacheSource(ResCache cache)](#member-70)
- [public InputStream get(String name) throws IOException](#member-71)
- [toString()](#member-72)
- [winsafechar(char c)](#member-77)
- [FileSource(Path base)](#member-78)
- [private static String checkpart(String part, String whole) throws FileNotFoundException](#member-79)
- [public InputStream get(String name) throws IOException](#member-80)
- [toString()](#member-81)
- [JarSource(String base)](#member-83)
- [public InputStream get(String name) throws FileNotFoundException](#member-84)
- [toString()](#member-85)
- [HttpSource(URI base)](#member-87)
- [private URI encodeuri(URI raw) throws IOException](#member-88)
- [public InputStream get(String name) throws IOException](#member-89)
- [toString()](#member-90)
- [Loading(Pool.Queued res)](#member-92)
- [toString()](#member-93)
- [waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)](#member-94)
- [boostprio(int prio)](#member-95)
- [BadResourceException(String name, int ver, String message, Throwable cause)](#member-98)
- [BadResourceException(String name, int ver, String message)](#member-99)
- [BadResourceException(String name, int ver, Throwable cause)](#member-100)
- [BadResourceException(String name, int ver)](#member-101)
- [LoadFailedException(String name, int ver, LoadException cause)](#member-102)
- [getMessage()](#member-103)
- [NoSuchResourceException(String name, int ver, LoadException cause)](#member-104)
- [BadVersionException(String name, int ver, int curver, ResSource cursrc)](#member-107)
- [getMessage()](#member-108)
- [Pool(Pool parent, ResSource... sources)](#member-116)
- [Pool(ResSource... sources)](#member-117)
- [add(ResSource src)](#member-118)
- [Queued(String name, int ver, int prio)](#member-127)
- [priority()](#member-128)
- [boostprio(int prio)](#member-129)
- [get()](#member-130)
- [done()](#member-131)
- [prior(Queued prior)](#member-132)
- [toString()](#member-133)
- [handle(Queued res)](#member-134)
- [load(String name, int ver, int prio)](#member-135)
- [load(String name, int ver)](#member-136)
- [load(String name)](#member-137)
- [dynres(long id)](#member-138)
- [dynres(UID id)](#member-139)
- [ckld()](#member-140)
- [run()](#member-142)
- [qdepth()](#member-143)
- [numloaded()](#member-144)
- [cached()](#member-145)
- [used()](#member-146)
- [loadwaited()](#member-148)
- [loadwaited(Resource res)](#member-149)
- [public Resource loadwaitint(String name, int ver) throws InterruptedException](#member-150)
- [public Resource loadwaitint(String name) throws InterruptedException](#member-151)
- [loadwait(String name, int ver)](#member-152)
- [loadwait(String name)](#member-153)
- [local()](#member-155)
- [remote()](#member-157)
- [addurl(URI uri)](#member-158)
- [LoadException(String msg, Resource res)](#member-162)
- [LoadException(String msg, Throwable cause, Resource res)](#member-163)
- [LoadException(Throwable cause, Resource res)](#member-164)
- [UnknownFormatException(Resource res, String thing, Object found)](#member-167)
- [getMessage()](#member-168)
- [LoadWarning(Resource res, String msg)](#member-170)
- [LoadWarning(Resource res, String msg, Object... args)](#member-171)
- [cdec(Message buf)](#member-172)
- [PoolMapper(Pool pool)](#member-174)
- [apply(Object obj)](#member-175)
- [public abstract void init();](#member-176)
- [getres()](#member-177)
- [toString()](#member-178)
- [resmapper()](#member-179)
- [public T cons(Resource res, Message buf);](#member-180)
- [LayerConstructor(Class<T> cl)](#member-183)
- [cons(Resource res, Message buf)](#member-184)
- [addltype(String name, LayerFactory<?> cons)](#member-185)
- [addltype(String name, Class<T> cl)](#member-186)
- [public String value();](#member-187)
- [public Map<?, ?> info();](#member-188)
- [public T layerid();](#member-189)
- [ImageReadException()](#member-191)
- [public static BufferedImage readimage(InputStream fp) throws IOException](#member-192)
- [Image(Message buf)](#member-209)
- [scaled()](#member-210)
- [rawtex()](#member-211)
- [tex()](#member-212)
- [layerid()](#member-213)
- [info()](#member-214)
- [init()](#member-215)
- [Tooltip(Message buf)](#member-217)
- [init()](#member-218)
- [Neg(Message buf)](#member-221)
- [init()](#member-222)
- [Props(Message buf)](#member-224)
- [get(String nm)](#member-225)
- [init()](#member-226)
- [Obstacle(Message buf)](#member-229)
- [init()](#member-230)
- [layerid()](#member-231)
- [Anim(Message buf)](#member-236)
- [init()](#member-237)
- [Pagina(Message buf)](#member-239)
- [init()](#member-240)
- [AButton(Message buf)](#member-245)
- [init()](#member-246)
- [String name();](#member-247)
- [Class<? extends Instancer> instancer() default Instancer.class;](#member-248)
- [public I make(Class<?> cl, Resource res, Object... args);](#member-250)
- [stdmake(Class<T> type, Class<U> cl, Resource ires, Object[] args)](#member-251)
- [Direct(Class<I> type)](#member-253)
- [make(Class<?> cl, Resource res, Object... args)](#member-254)
- [StaticCall(Class<I> type, String name, Class<R> rtype, Class<?>[] args, Function<Function<Object[], R>, I> maker)](#member-260)
- [make(Class <?> cl, Resource res, Object... args)](#member-261)
- [Construct(Class<I> type, Class<R> rtype, Class<?>[] args, Function<Function<Object[], ? extends R>, I> maker)](#member-266)
- [make(Class <?> cl, Resource res, Object... args)](#member-267)
- [Chain(Class<I> type)](#member-270)
- [add(Instancer<? extends I> el)](#member-271)
- [make(Class<?> cl, Resource res, Object... args)](#member-272)
- [public Class<?> type();](#member-275)
- [public String name();](#member-276)
- [Code(Message buf)](#member-279)
- [init()](#member-280)
- [ResClassLoader(ClassLoader parent, CodeEntry entry)](#member-283)
- [findcode(String name)](#member-284)
- [public Class<?> findClass(String name) throws ClassNotFoundException](#member-285)
- [getsource(Class<?> cl)](#member-286)
- [public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException](#member-287)
- [getres()](#member-288)
- [toString()](#member-289)
- [LibClassLoader(ClassLoader parent, Collection<ClassLoader> classpath)](#member-291)
- [public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException](#member-292)
- [ResourceClassNotFoundException(String clname, Resource res)](#member-295)
- [CodeEntry(Message buf)](#member-304)
- [init()](#member-305)
- [loader()](#member-306)
- [getentry(Class<?> cl, boolean fail)](#member-307)
- [getcl(Class<T> cl, boolean fail)](#member-308)
- [getcl(Class<T> cl)](#member-309)
- [get(Class<T> cl, boolean fail)](#member-310)
- [get(Class<T> cl)](#member-311)
- [classres(final Class<?> cl)](#member-312)
- [getcode(Class<T> cl, boolean fail)](#member-313)
- [Audio(Message buf)](#member-318)
- [init()](#member-319)
- [stream()](#member-320)
- [layerid()](#member-321)
- [info()](#member-322)
- [bvol()](#member-323)
- [Music(Message buf)](#member-325)
- [init()](#member-326)
- [Font(Message buf)](#member-328)
- [init()](#member-329)
- [private void readall(InputStream in, byte[] buf) throws IOException](#member-330)
- [layers(final Class<L> cl)](#member-331)
- [NoSuchLayerException(String message)](#member-332)
- [layer(Class<L> cl)](#member-333)
- [flayer(Class<L> cl)](#member-334)
- [layers(Class<L> cl, Predicate<? super L> sel)](#member-335)
- [layer(Class<L> cl, Predicate<? super L> sel)](#member-336)
- [flayer(Class<L> cl, Predicate<? super L> sel)](#member-337)
- [layer(Class<L> cl, I id)](#member-338)
- [flayer(Class<L> cl, I id)](#member-339)
- [equals(Object other)](#member-340)
- [load(Message in)](#member-342)
- [indir()](#member-344)
- [loadrimg(String name)](#member-345)
- [loadimg(String name)](#member-346)
- [loadsimg(String name)](#member-347)
- [loadtex(String name)](#member-348)
- [toString()](#member-349)
- [public static void loadlist(Pool pool, InputStream list, int prio) throws IOException](#member-350)
- [dumplist(Collection<Resource> list, Writer dest)](#member-351)
- [public static void updateloadlist(Path file, Path resdir) throws Exception](#member-352)
- [usage_getcode(PrintStream out)](#member-353)
- [cmd_getcode(String[] args)](#member-354)
- [usage_findupdates(PrintStream out)](#member-355)
- [cmd_findupdates(String[] args)](#member-356)
- [public static void main(String[] args) throws Exception](#member-357)

### Member Reference

#### Constants

<a id="member-281"></a>
##### `OVERRIDE_ALL`

- Description: TODO

<a id="member-341"></a>
##### `RESOURCE_SIG`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `resurl`

- Description: TODO

<a id="member-2"></a>
##### `resdir`

- Description: TODO

<a id="member-3"></a>
##### `prscache`

- Description: TODO

<a id="member-4"></a>
##### `loadergroup`

- Description: TODO

<a id="member-5"></a>
##### `ltypes`

- Description: TODO

<a id="member-6"></a>
##### `imgc`

- Description: TODO

<a id="member-7"></a>
##### `negc`

- Description: TODO

<a id="member-8"></a>
##### `props`

- Description: TODO

<a id="member-9"></a>
##### `obst`

- Description: TODO

<a id="member-10"></a>
##### `animc`

- Description: TODO

<a id="member-11"></a>
##### `pagina`

- Description: TODO

<a id="member-12"></a>
##### `action`

- Description: TODO

<a id="member-13"></a>
##### `audio`

- Description: TODO

<a id="member-14"></a>
##### `tooltip`

- Description: TODO

<a id="member-15"></a>
##### `name`

- Description: TODO

<a id="member-16"></a>
##### `ver`

- Description: TODO

<a id="member-17"></a>
##### `source`

- Description: TODO

<a id="member-18"></a>
##### `pool`

- Description: TODO

<a id="member-19"></a>
##### `layers`

- Description: TODO

<a id="member-20"></a>
##### `used`

- Description: TODO

<a id="member-21"></a>
##### `name`

- Description: TODO

<a id="member-22"></a>
##### `ver`

- Description: TODO

<a id="member-27"></a>
##### `pool`

- Description: TODO

<a id="member-32"></a>
##### `pool`

- Description: TODO

<a id="member-33"></a>
##### `prio`

- Description: TODO

<a id="member-34"></a>
##### `wver`

- Description: TODO

<a id="member-35"></a>
##### `verr`

- Description: TODO

<a id="member-36"></a>
##### `loaded`

- Description: TODO

<a id="member-43"></a>
##### `rr`

- Description: TODO

<a id="member-48"></a>
##### `bk`

- Description: TODO

<a id="member-49"></a>
##### `map`

- Description: TODO

<a id="member-63"></a>
##### `back`

- Description: TODO

<a id="member-68"></a>
##### `cache`

- Description: TODO

<a id="member-69"></a>
##### `cachedesc`

- Description: TODO

<a id="member-73"></a>
##### `wintraps`

- Description: TODO

<a id="member-74"></a>
##### `windows`

- Description: TODO

<a id="member-75"></a>
##### `winsafe`

- Description: TODO

<a id="member-76"></a>
##### `base`

- Description: TODO

<a id="member-82"></a>
##### `base`

- Description: TODO

<a id="member-86"></a>
##### `base`

- Description: TODO

<a id="member-91"></a>
##### `res`

- Description: TODO

<a id="member-96"></a>
##### `name`

- Description: TODO

<a id="member-97"></a>
##### `ver`

- Description: TODO

<a id="member-105"></a>
##### `curver`

- Description: TODO

<a id="member-106"></a>
##### `cursrc`

- Description: TODO

<a id="member-109"></a>
##### `nloaders`

- Description: TODO

<a id="member-110"></a>
##### `loaders`

- Description: TODO

<a id="member-111"></a>
##### `sources`

- Description: TODO

<a id="member-112"></a>
##### `cache`

- Description: TODO

<a id="member-113"></a>
##### `queue`

- Description: TODO

<a id="member-114"></a>
##### `queued`

- Description: TODO

<a id="member-115"></a>
##### `parent`

- Description: TODO

<a id="member-119"></a>
##### `rdep`

- Description: TODO

<a id="member-120"></a>
##### `wq`

- Description: TODO

<a id="member-121"></a>
##### `prio`

- Description: TODO

<a id="member-122"></a>
##### `awaiting`

- Description: TODO

<a id="member-123"></a>
##### `done`

- Description: TODO

<a id="member-124"></a>
##### `res`

- Description: TODO

<a id="member-125"></a>
##### `error`

- Description: TODO

<a id="member-126"></a>
##### `found`

- Description: TODO

<a id="member-141"></a>
##### `added`

- Description: TODO

<a id="member-147"></a>
##### `loadwaited`

- Description: TODO

<a id="member-154"></a>
##### `_local`

- Description: TODO

<a id="member-156"></a>
##### `_remote`

- Description: TODO

<a id="member-159"></a>
##### `res`

- Description: TODO

<a id="member-160"></a>
##### `src`

- Description: TODO

<a id="member-161"></a>
##### `prev`

- Description: TODO

<a id="member-165"></a>
##### `thing`

- Description: TODO

<a id="member-166"></a>
##### `found`

- Description: TODO

<a id="member-169"></a>
##### `res`

- Description: TODO

<a id="member-173"></a>
##### `pool`

- Description: TODO

<a id="member-181"></a>
##### `cl`

- Description: TODO

<a id="member-182"></a>
##### `cons`

- Description: TODO

<a id="member-190"></a>
##### `supported`

- Description: TODO

<a id="member-193"></a>
##### `img`

- Description: TODO

<a id="member-194"></a>
##### `scaled`

- Description: TODO

<a id="member-195"></a>
##### `tex`

- Description: TODO

<a id="member-196"></a>
##### `rawtex`

- Description: TODO

<a id="member-197"></a>
##### `z`

- Description: TODO

<a id="member-198"></a>
##### `subz`

- Description: TODO

<a id="member-199"></a>
##### `nooff`

- Description: TODO

<a id="member-200"></a>
##### `id`

- Description: TODO

<a id="member-201"></a>
##### `info`

- Description: TODO

<a id="member-202"></a>
##### `scale`

- Description: TODO

<a id="member-203"></a>
##### `sz`

- Description: TODO

<a id="member-204"></a>
##### `o`

- Description: TODO

<a id="member-205"></a>
##### `so`

- Description: TODO

<a id="member-206"></a>
##### `tsz`

- Description: TODO

<a id="member-207"></a>
##### `ssz`

- Description: TODO

<a id="member-208"></a>
##### `stsz`

- Description: TODO

<a id="member-216"></a>
##### `t`

- Description: TODO

<a id="member-219"></a>
##### `cc`

- Description: TODO

<a id="member-220"></a>
##### `ep`

- Description: TODO

<a id="member-223"></a>
##### `props`

- Description: TODO

<a id="member-227"></a>
##### `id`

- Description: TODO

<a id="member-228"></a>
##### `p`

- Description: TODO

<a id="member-232"></a>
##### `ids`

- Description: TODO

<a id="member-233"></a>
##### `id`

- Description: TODO

<a id="member-234"></a>
##### `d`

- Description: TODO

<a id="member-235"></a>
##### `f`

- Description: TODO

<a id="member-238"></a>
##### `text`

- Description: TODO

<a id="member-241"></a>
##### `name`

- Description: TODO

<a id="member-242"></a>
##### `parent`

- Description: TODO

<a id="member-243"></a>
##### `hk`

- Description: TODO

<a id="member-244"></a>
##### `ad`

- Description: TODO

<a id="member-249"></a>
##### `Instancer.class`

- Description: TODO

<a id="member-252"></a>
##### `type`

- Description: TODO

<a id="member-255"></a>
##### `type`

- Description: TODO

<a id="member-256"></a>
##### `name`

- Description: TODO

<a id="member-257"></a>
##### `rtype`

- Description: TODO

<a id="member-258"></a>
##### `args`

- Description: TODO

<a id="member-259"></a>
##### `maker`

- Description: TODO

<a id="member-262"></a>
##### `type`

- Description: TODO

<a id="member-263"></a>
##### `rtype`

- Description: TODO

<a id="member-264"></a>
##### `args`

- Description: TODO

<a id="member-265"></a>
##### `maker`

- Description: TODO

<a id="member-268"></a>
##### `type`

- Description: TODO

<a id="member-269"></a>
##### `sub`

- Description: TODO

<a id="member-273"></a>
##### `simple`

- Description: TODO

<a id="member-274"></a>
##### `instancers`

- Description: TODO

<a id="member-277"></a>
##### `name`

- Description: TODO

<a id="member-278"></a>
##### `data`

- Description: TODO

<a id="member-282"></a>
##### `entry`

- Description: TODO

<a id="member-290"></a>
##### `classpath`

- Description: TODO

<a id="member-293"></a>
##### `clname`

- Description: TODO

<a id="member-294"></a>
##### `res`

- Description: TODO

<a id="member-296"></a>
##### `builtinents`

- Description: TODO

<a id="member-297"></a>
##### `clmap`

- Description: TODO

<a id="member-298"></a>
##### `pe`

- Description: TODO

<a id="member-299"></a>
##### `pa`

- Description: TODO

<a id="member-300"></a>
##### `classpath`

- Description: TODO

<a id="member-301"></a>
##### `loader`

- Description: TODO

<a id="member-302"></a>
##### `lpe`

- Description: TODO

<a id="member-303"></a>
##### `ipe`

- Description: TODO

<a id="member-314"></a>
##### `coded`

- Description: TODO

<a id="member-315"></a>
##### `id`

- Description: TODO

<a id="member-316"></a>
##### `info`

- Description: TODO

<a id="member-317"></a>
##### `bvol`

- Description: TODO

<a id="member-324"></a>
##### `seq`

- Description: TODO

<a id="member-327"></a>
##### `font`

- Description: TODO

<a id="member-343"></a>
##### `indir`

- Description: TODO

#### Methods

<a id="member-23"></a>
##### `Named(String name, int ver)`

- Description: TODO

<a id="member-24"></a>
##### `equals(Object other)`

- Description: TODO

<a id="member-25"></a>
##### `hashCode()`

- Description: TODO

<a id="member-26"></a>
##### `toString()`

- Description: TODO

<a id="member-28"></a>
##### `Spec(Pool pool, String name, int ver)`

- Description: TODO

<a id="member-29"></a>
##### `Spec(Pool pool, String name)`

- Description: TODO

<a id="member-30"></a>
##### `get(int prio)`

- Description: TODO

<a id="member-31"></a>
##### `get()`

- Description: TODO

<a id="member-37"></a>
##### `Saved(Pool pool, String name, int ver)`

- Description: TODO

<a id="member-38"></a>
##### `get(int prio)`

- Description: TODO

<a id="member-39"></a>
##### `get()`

- Description: TODO

<a id="member-40"></a>
##### `savever()`

- Description: TODO

<a id="member-41"></a>
##### `public Indir<Resource> getres(int id);`

- Description: TODO

<a id="member-42"></a>
##### `dynres(UID uid)`

- Description: TODO

<a id="member-44"></a>
##### `Descriptor(R rr)`

- Description: TODO

<a id="member-45"></a>
##### `opt(Object desc)`

- Description: TODO

<a id="member-46"></a>
##### `desc()`

- Description: TODO

<a id="member-47"></a>
##### `getresv(Object desc)`

- Description: TODO

<a id="member-50"></a>
##### `ResourceMap(Resource.Resolver bk, Map<Integer, ? extends Object> map)`

- Description: TODO

<a id="member-51"></a>
##### `ResourceMap(Resource.Resolver bk, Message data)`

- Description: TODO

<a id="member-52"></a>
##### `ResourceMap(Resource.Resolver bk, Object[] args)`

- Description: TODO

<a id="member-53"></a>
##### `decode(Message sdt)`

- Description: TODO

<a id="member-54"></a>
##### `decode(Object[] args)`

- Description: TODO

<a id="member-55"></a>
##### `getres(int id)`

- Description: TODO

<a id="member-56"></a>
##### `dynres(UID uid)`

- Description: TODO

<a id="member-57"></a>
##### `toString()`

- Description: TODO

<a id="member-58"></a>
##### `Virtual(Pool pool, String name, int ver)`

- Description: TODO

<a id="member-59"></a>
##### `add(Layer layer)`

- Description: TODO

<a id="member-60"></a>
##### `setcache(ResCache cache)`

- Description: TODO

<a id="member-61"></a>
##### `basename()`

- Description: TODO

<a id="member-62"></a>
##### `public InputStream get(String name) throws IOException;`

- Description: TODO

<a id="member-64"></a>
##### `TeeSource(ResSource back)`

- Description: TODO

<a id="member-65"></a>
##### `public InputStream get(String name) throws IOException`

- Description: TODO

<a id="member-66"></a>
##### `public abstract OutputStream fork(String name) throws IOException;`

- Description: TODO

<a id="member-67"></a>
##### `toString()`

- Description: TODO

<a id="member-70"></a>
##### `CacheSource(ResCache cache)`

- Description: TODO

<a id="member-71"></a>
##### `public InputStream get(String name) throws IOException`

- Description: TODO

<a id="member-72"></a>
##### `toString()`

- Description: TODO

<a id="member-77"></a>
##### `winsafechar(char c)`

- Description: TODO

<a id="member-78"></a>
##### `FileSource(Path base)`

- Description: TODO

<a id="member-79"></a>
##### `private static String checkpart(String part, String whole) throws FileNotFoundException`

- Description: TODO

<a id="member-80"></a>
##### `public InputStream get(String name) throws IOException`

- Description: TODO

<a id="member-81"></a>
##### `toString()`

- Description: TODO

<a id="member-83"></a>
##### `JarSource(String base)`

- Description: TODO

<a id="member-84"></a>
##### `public InputStream get(String name) throws FileNotFoundException`

- Description: TODO

<a id="member-85"></a>
##### `toString()`

- Description: TODO

<a id="member-87"></a>
##### `HttpSource(URI base)`

- Description: TODO

<a id="member-88"></a>
##### `private URI encodeuri(URI raw) throws IOException`

- Description: TODO

<a id="member-89"></a>
##### `public InputStream get(String name) throws IOException`

- Description: TODO

<a id="member-90"></a>
##### `toString()`

- Description: TODO

<a id="member-92"></a>
##### `Loading(Pool.Queued res)`

- Description: TODO

<a id="member-93"></a>
##### `toString()`

- Description: TODO

<a id="member-94"></a>
##### `waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

<a id="member-95"></a>
##### `boostprio(int prio)`

- Description: TODO

<a id="member-98"></a>
##### `BadResourceException(String name, int ver, String message, Throwable cause)`

- Description: TODO

<a id="member-99"></a>
##### `BadResourceException(String name, int ver, String message)`

- Description: TODO

<a id="member-100"></a>
##### `BadResourceException(String name, int ver, Throwable cause)`

- Description: TODO

<a id="member-101"></a>
##### `BadResourceException(String name, int ver)`

- Description: TODO

<a id="member-102"></a>
##### `LoadFailedException(String name, int ver, LoadException cause)`

- Description: TODO

<a id="member-103"></a>
##### `getMessage()`

- Description: TODO

<a id="member-104"></a>
##### `NoSuchResourceException(String name, int ver, LoadException cause)`

- Description: TODO

<a id="member-107"></a>
##### `BadVersionException(String name, int ver, int curver, ResSource cursrc)`

- Description: TODO

<a id="member-108"></a>
##### `getMessage()`

- Description: TODO

<a id="member-116"></a>
##### `Pool(Pool parent, ResSource... sources)`

- Description: TODO

<a id="member-117"></a>
##### `Pool(ResSource... sources)`

- Description: TODO

<a id="member-118"></a>
##### `add(ResSource src)`

- Description: TODO

<a id="member-127"></a>
##### `Queued(String name, int ver, int prio)`

- Description: TODO

<a id="member-128"></a>
##### `priority()`

- Description: TODO

<a id="member-129"></a>
##### `boostprio(int prio)`

- Description: TODO

<a id="member-130"></a>
##### `get()`

- Description: TODO

<a id="member-131"></a>
##### `done()`

- Description: TODO

<a id="member-132"></a>
##### `prior(Queued prior)`

- Description: TODO

<a id="member-133"></a>
##### `toString()`

- Description: TODO

<a id="member-134"></a>
##### `handle(Queued res)`

- Description: TODO

<a id="member-135"></a>
##### `load(String name, int ver, int prio)`

- Description: TODO

<a id="member-136"></a>
##### `load(String name, int ver)`

- Description: TODO

<a id="member-137"></a>
##### `load(String name)`

- Description: TODO

<a id="member-138"></a>
##### `dynres(long id)`

- Description: TODO

<a id="member-139"></a>
##### `dynres(UID id)`

- Description: TODO

<a id="member-140"></a>
##### `ckld()`

- Description: TODO

<a id="member-142"></a>
##### `run()`

- Description: TODO

<a id="member-143"></a>
##### `qdepth()`

- Description: TODO

<a id="member-144"></a>
##### `numloaded()`

- Description: TODO

<a id="member-145"></a>
##### `cached()`

- Description: TODO

<a id="member-146"></a>
##### `used()`

- Description: TODO

<a id="member-148"></a>
##### `loadwaited()`

- Description: TODO

<a id="member-149"></a>
##### `loadwaited(Resource res)`

- Description: TODO

<a id="member-150"></a>
##### `public Resource loadwaitint(String name, int ver) throws InterruptedException`

- Description: TODO

<a id="member-151"></a>
##### `public Resource loadwaitint(String name) throws InterruptedException`

- Description: TODO

<a id="member-152"></a>
##### `loadwait(String name, int ver)`

- Description: TODO

<a id="member-153"></a>
##### `loadwait(String name)`

- Description: TODO

<a id="member-155"></a>
##### `local()`

- Description: TODO

<a id="member-157"></a>
##### `remote()`

- Description: TODO

<a id="member-158"></a>
##### `addurl(URI uri)`

- Description: TODO

<a id="member-162"></a>
##### `LoadException(String msg, Resource res)`

- Description: TODO

<a id="member-163"></a>
##### `LoadException(String msg, Throwable cause, Resource res)`

- Description: TODO

<a id="member-164"></a>
##### `LoadException(Throwable cause, Resource res)`

- Description: TODO

<a id="member-167"></a>
##### `UnknownFormatException(Resource res, String thing, Object found)`

- Description: TODO

<a id="member-168"></a>
##### `getMessage()`

- Description: TODO

<a id="member-170"></a>
##### `LoadWarning(Resource res, String msg)`

- Description: TODO

<a id="member-171"></a>
##### `LoadWarning(Resource res, String msg, Object... args)`

- Description: TODO

<a id="member-172"></a>
##### `cdec(Message buf)`

- Description: TODO

<a id="member-174"></a>
##### `PoolMapper(Pool pool)`

- Description: TODO

<a id="member-175"></a>
##### `apply(Object obj)`

- Description: TODO

<a id="member-176"></a>
##### `public abstract void init();`

- Description: TODO

<a id="member-177"></a>
##### `getres()`

- Description: TODO

<a id="member-178"></a>
##### `toString()`

- Description: TODO

<a id="member-179"></a>
##### `resmapper()`

- Description: TODO

<a id="member-180"></a>
##### `public T cons(Resource res, Message buf);`

- Description: TODO

<a id="member-183"></a>
##### `LayerConstructor(Class<T> cl)`

- Description: TODO

<a id="member-184"></a>
##### `cons(Resource res, Message buf)`

- Description: TODO

<a id="member-185"></a>
##### `addltype(String name, LayerFactory<?> cons)`

- Description: TODO

<a id="member-186"></a>
##### `addltype(String name, Class<T> cl)`

- Description: TODO

<a id="member-187"></a>
##### `public String value();`

- Description: TODO

<a id="member-188"></a>
##### `public Map<?, ?> info();`

- Description: TODO

<a id="member-189"></a>
##### `public T layerid();`

- Description: TODO

<a id="member-191"></a>
##### `ImageReadException()`

- Description: TODO

<a id="member-192"></a>
##### `public static BufferedImage readimage(InputStream fp) throws IOException`

- Description: TODO

<a id="member-209"></a>
##### `Image(Message buf)`

- Description: TODO

<a id="member-210"></a>
##### `scaled()`

- Description: TODO

<a id="member-211"></a>
##### `rawtex()`

- Description: TODO

<a id="member-212"></a>
##### `tex()`

- Description: TODO

<a id="member-213"></a>
##### `layerid()`

- Description: TODO

<a id="member-214"></a>
##### `info()`

- Description: TODO

<a id="member-215"></a>
##### `init()`

- Description: TODO

<a id="member-217"></a>
##### `Tooltip(Message buf)`

- Description: TODO

<a id="member-218"></a>
##### `init()`

- Description: TODO

<a id="member-221"></a>
##### `Neg(Message buf)`

- Description: TODO

<a id="member-222"></a>
##### `init()`

- Description: TODO

<a id="member-224"></a>
##### `Props(Message buf)`

- Description: TODO

<a id="member-225"></a>
##### `get(String nm)`

- Description: TODO

<a id="member-226"></a>
##### `init()`

- Description: TODO

<a id="member-229"></a>
##### `Obstacle(Message buf)`

- Description: TODO

<a id="member-230"></a>
##### `init()`

- Description: TODO

<a id="member-231"></a>
##### `layerid()`

- Description: TODO

<a id="member-236"></a>
##### `Anim(Message buf)`

- Description: TODO

<a id="member-237"></a>
##### `init()`

- Description: TODO

<a id="member-239"></a>
##### `Pagina(Message buf)`

- Description: TODO

<a id="member-240"></a>
##### `init()`

- Description: TODO

<a id="member-245"></a>
##### `AButton(Message buf)`

- Description: TODO

<a id="member-246"></a>
##### `init()`

- Description: TODO

<a id="member-247"></a>
##### `String name();`

- Description: TODO

<a id="member-248"></a>
##### `Class<? extends Instancer> instancer() default Instancer.class;`

- Description: TODO

<a id="member-250"></a>
##### `public I make(Class<?> cl, Resource res, Object... args);`

- Description: TODO

<a id="member-251"></a>
##### `stdmake(Class<T> type, Class<U> cl, Resource ires, Object[] args)`

- Description: TODO

<a id="member-253"></a>
##### `Direct(Class<I> type)`

- Description: TODO

<a id="member-254"></a>
##### `make(Class<?> cl, Resource res, Object... args)`

- Description: TODO

<a id="member-260"></a>
##### `StaticCall(Class<I> type, String name, Class<R> rtype, Class<?>[] args, Function<Function<Object[], R>, I> maker)`

- Description: TODO

<a id="member-261"></a>
##### `make(Class <?> cl, Resource res, Object... args)`

- Description: TODO

<a id="member-266"></a>
##### `Construct(Class<I> type, Class<R> rtype, Class<?>[] args, Function<Function<Object[], ? extends R>, I> maker)`

- Description: TODO

<a id="member-267"></a>
##### `make(Class <?> cl, Resource res, Object... args)`

- Description: TODO

<a id="member-270"></a>
##### `Chain(Class<I> type)`

- Description: TODO

<a id="member-271"></a>
##### `add(Instancer<? extends I> el)`

- Description: TODO

<a id="member-272"></a>
##### `make(Class<?> cl, Resource res, Object... args)`

- Description: TODO

<a id="member-275"></a>
##### `public Class<?> type();`

- Description: TODO

<a id="member-276"></a>
##### `public String name();`

- Description: TODO

<a id="member-279"></a>
##### `Code(Message buf)`

- Description: TODO

<a id="member-280"></a>
##### `init()`

- Description: TODO

<a id="member-283"></a>
##### `ResClassLoader(ClassLoader parent, CodeEntry entry)`

- Description: TODO

<a id="member-284"></a>
##### `findcode(String name)`

- Description: TODO

<a id="member-285"></a>
##### `public Class<?> findClass(String name) throws ClassNotFoundException`

- Description: TODO

<a id="member-286"></a>
##### `getsource(Class<?> cl)`

- Description: TODO

<a id="member-287"></a>
##### `public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException`

- Description: TODO

<a id="member-288"></a>
##### `getres()`

- Description: TODO

<a id="member-289"></a>
##### `toString()`

- Description: TODO

<a id="member-291"></a>
##### `LibClassLoader(ClassLoader parent, Collection<ClassLoader> classpath)`

- Description: TODO

<a id="member-292"></a>
##### `public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException`

- Description: TODO

<a id="member-295"></a>
##### `ResourceClassNotFoundException(String clname, Resource res)`

- Description: TODO

<a id="member-304"></a>
##### `CodeEntry(Message buf)`

- Description: TODO

<a id="member-305"></a>
##### `init()`

- Description: TODO

<a id="member-306"></a>
##### `loader()`

- Description: TODO

<a id="member-307"></a>
##### `getentry(Class<?> cl, boolean fail)`

- Description: TODO

<a id="member-308"></a>
##### `getcl(Class<T> cl, boolean fail)`

- Description: TODO

<a id="member-309"></a>
##### `getcl(Class<T> cl)`

- Description: TODO

<a id="member-310"></a>
##### `get(Class<T> cl, boolean fail)`

- Description: TODO

<a id="member-311"></a>
##### `get(Class<T> cl)`

- Description: TODO

<a id="member-312"></a>
##### `classres(final Class<?> cl)`

- Description: TODO

<a id="member-313"></a>
##### `getcode(Class<T> cl, boolean fail)`

- Description: TODO

<a id="member-318"></a>
##### `Audio(Message buf)`

- Description: TODO

<a id="member-319"></a>
##### `init()`

- Description: TODO

<a id="member-320"></a>
##### `stream()`

- Description: TODO

<a id="member-321"></a>
##### `layerid()`

- Description: TODO

<a id="member-322"></a>
##### `info()`

- Description: TODO

<a id="member-323"></a>
##### `bvol()`

- Description: TODO

<a id="member-325"></a>
##### `Music(Message buf)`

- Description: TODO

<a id="member-326"></a>
##### `init()`

- Description: TODO

<a id="member-328"></a>
##### `Font(Message buf)`

- Description: TODO

<a id="member-329"></a>
##### `init()`

- Description: TODO

<a id="member-330"></a>
##### `private void readall(InputStream in, byte[] buf) throws IOException`

- Description: TODO

<a id="member-331"></a>
##### `layers(final Class<L> cl)`

- Description: TODO

<a id="member-332"></a>
##### `NoSuchLayerException(String message)`

- Description: TODO

<a id="member-333"></a>
##### `layer(Class<L> cl)`

- Description: TODO

<a id="member-334"></a>
##### `flayer(Class<L> cl)`

- Description: TODO

<a id="member-335"></a>
##### `layers(Class<L> cl, Predicate<? super L> sel)`

- Description: TODO

<a id="member-336"></a>
##### `layer(Class<L> cl, Predicate<? super L> sel)`

- Description: TODO

<a id="member-337"></a>
##### `flayer(Class<L> cl, Predicate<? super L> sel)`

- Description: TODO

<a id="member-338"></a>
##### `layer(Class<L> cl, I id)`

- Description: TODO

<a id="member-339"></a>
##### `flayer(Class<L> cl, I id)`

- Description: TODO

<a id="member-340"></a>
##### `equals(Object other)`

- Description: TODO

<a id="member-342"></a>
##### `load(Message in)`

- Description: TODO

<a id="member-344"></a>
##### `indir()`

- Description: TODO

<a id="member-345"></a>
##### `loadrimg(String name)`

- Description: TODO

<a id="member-346"></a>
##### `loadimg(String name)`

- Description: TODO

<a id="member-347"></a>
##### `loadsimg(String name)`

- Description: TODO

<a id="member-348"></a>
##### `loadtex(String name)`

- Description: TODO

<a id="member-349"></a>
##### `toString()`

- Description: TODO

<a id="member-350"></a>
##### `public static void loadlist(Pool pool, InputStream list, int prio) throws IOException`

- Description: TODO

<a id="member-351"></a>
##### `dumplist(Collection<Resource> list, Writer dest)`

- Description: TODO

<a id="member-352"></a>
##### `public static void updateloadlist(Path file, Path resdir) throws Exception`

- Description: TODO

<a id="member-353"></a>
##### `usage_getcode(PrintStream out)`

- Description: TODO

<a id="member-354"></a>
##### `cmd_getcode(String[] args)`

- Description: TODO

<a id="member-355"></a>
##### `usage_findupdates(PrintStream out)`

- Description: TODO

<a id="member-356"></a>
##### `cmd_findupdates(String[] args)`

- Description: TODO

<a id="member-357"></a>
##### `public static void main(String[] args) throws Exception`

- Description: TODO
