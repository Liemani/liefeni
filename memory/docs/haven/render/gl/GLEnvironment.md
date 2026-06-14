# GLEnvironment

## Meta

- Source: [GLEnvironment.java](../../../../../src/haven/render/gl/GLEnvironment.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a GL environment.

## Code Members

### Member Index

#### Fields

- [debuglog](#member-1)
- [labels](#member-2)
- [caps](#member-3)
- [nilfbo_id](#member-4)
- [nilfbo_db](#member-5)
- [drawmon](#member-6)
- [prepmon](#member-7)
- [disposed](#member-8)
- [queries](#member-9)
- [callbacks](#member-10)
- [cbthread](#member-11)
- [submitted](#member-12)
- [wnd](#member-13)
- [prep](#member-14)
- [curstate](#member-15)
- [invalid](#member-16)
- [caps](#member-17)
- [slvp](#member-19)
- [vendor](#member-20)
- [version](#member-21)
- [renderer](#member-22)
- [major](#member-23)
- [minor](#member-24)
- [glslver](#member-25)
- [exts](#member-26)
- [maxtargets](#member-27)
- [anisotropy](#member-28)
- [linemin](#member-29)
- [linemax](#member-30)
- [stats_obj](#member-40)
- [stats_mem](#member-41)
- [src](#member-53)
- [type](#member-54)
- [id](#member-55)
- [sev](#member-56)
- [msg](#member-57)
- [bk](#member-89)
- [d](#member-90)
- [tempvao](#member-93)
- [tempvertex](#member-94)
- [tempindex](#member-95)
- [hash](#member-96)
- [shaders](#member-97)
- [prog](#member-98)
- [next](#member-99)
- [used](#member-100)
- [pmon](#member-102)
- [ptab](#member-103)
- [nprog](#member-104)
- [lastpclean](#member-114)
- [seqmon](#member-116)
- [sequse](#member-117)
- [seqhead](#member-118)
- [seqtail](#member-119)
- [no](#member-124)
- [clean](#member-125)
- [desc](#member-126)
- [cleaned](#member-127)

#### Methods

- [HardwareException(String msg, Caps caps)](#member-18)
- [glgeti(GL gl, int param)](#member-31)
- [glcondi(GL gl, int param, int def)](#member-32)
- [glgetf(GL gl, int param)](#member-33)
- [glconds(GL gl, int param)](#member-34)
- [Caps(GL gl)](#member-35)
- [checkreq()](#member-36)
- [vendor()](#member-37)
- [driver()](#member-38)
- [device()](#member-39)
- [protected abstract Caps mkcaps(GL initgl);](#member-42)
- [initialize(GL gl)](#member-43)
- [render()](#member-44)
- [drawlist()](#member-45)
- [reshape(Area wnd)](#member-46)
- [shape()](#member-47)
- [ckcbt()](#member-48)
- [cbloop()](#member-49)
- [callback(Runnable cb)](#member-50)
- [public void synccallbacks() throws InterruptedException](#member-51)
- [checkqueries(GL gl)](#member-52)
- [DebugMessage(int src, int type, int id, int sev, String msg)](#member-58)
- [getdebuglog(GL gl)](#member-59)
- [checkdebuglog(GL gl)](#member-60)
- [process(GL gl)](#member-61)
- [public void finish(GL gl) throws InterruptedException](#member-62)
- [submit(Render cmd)](#member-63)
- [public void submitwait() throws InterruptedException](#member-64)
- [disposeall()](#member-65)
- [public abstract SysBuffer malloc(int sz);](#member-66)
- [public abstract SysBuffer subsume(ByteBuffer data, int sz);](#member-67)
- [fillbuf(DataBuffer tgt, int from, int to)](#member-68)
- [fillbuf(DataBuffer target)](#member-69)
- [prepare()](#member-70)
- [prepare(GLObject obj)](#member-71)
- [prepare(BGL.Request req)](#member-72)
- [prepare(Consumer<GLRender> func)](#member-73)
- [prepare(Model.Indices buf)](#member-74)
- [prepare(VertexArray.Buffer buf)](#member-75)
- [prepare(Model mod, GLProgram prog)](#member-76)
- [prepare(Texture2D tex)](#member-77)
- [prepare(Texture2D.Sampler2D smp)](#member-78)
- [prepare(Texture3D tex)](#member-79)
- [prepare(Texture3D.Sampler3D smp)](#member-80)
- [prepare(Texture2DArray tex)](#member-81)
- [prepare(Texture2DArray.Sampler2DArray smp)](#member-82)
- [prepare(Texture2DMS tex)](#member-83)
- [prepare(Texture2DMS.Sampler2DMS smp)](#member-84)
- [prepare(TextureCube tex)](#member-85)
- [prepare(TextureCube.SamplerCube smp)](#member-86)
- [prepuval(Object val)](#member-87)
- [prepfval(Object val)](#member-88)
- [TempData(Supplier<T> bk)](#member-91)
- [get()](#member-92)
- [SavedProg(int hash, ShaderMacro[] shaders, GLProgram prog)](#member-101)
- [findprog(int hash, ShaderMacro[] shaders)](#member-105)
- [rehash(int nlen)](#member-106)
- [putprog(int hash, ShaderMacro[] shaders, GLProgram prog)](#member-107)
- [getprog(int hash, ShaderMacro[] shaders)](#member-108)
- [cleanprogs()](#member-109)
- [progdump()](#member-110)
- [compatible(DrawList ob)](#member-111)
- [compatible(Texture ob)](#member-112)
- [compatible(DataBuffer ob)](#member-113)
- [clean()](#member-115)
- [seqresize(int nsz)](#member-120)
- [seqreg()](#member-121)
- [sequnreg(int seq)](#member-122)
- [dispseq()](#member-123)
- [Sequence(Object owner)](#member-128)
- [disposed()](#member-129)
- [dispose()](#member-130)
- [numprogs()](#member-131)
- [caps()](#member-132)
- [memstats()](#member-133)
- [dispose()](#member-134)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `debuglog`

- Description: TODO

<a id="member-2"></a>
##### `labels`

- Description: TODO

<a id="member-3"></a>
##### `caps`

- Description: TODO

<a id="member-4"></a>
##### `nilfbo_id`

- Description: TODO

<a id="member-5"></a>
##### `nilfbo_db`

- Description: TODO

<a id="member-6"></a>
##### `drawmon`

- Description: TODO

<a id="member-7"></a>
##### `prepmon`

- Description: TODO

<a id="member-8"></a>
##### `disposed`

- Description: TODO

<a id="member-9"></a>
##### `queries`

- Description: TODO

<a id="member-10"></a>
##### `callbacks`

- Description: TODO

<a id="member-11"></a>
##### `cbthread`

- Description: TODO

<a id="member-12"></a>
##### `submitted`

- Description: TODO

<a id="member-13"></a>
##### `wnd`

- Description: TODO

<a id="member-14"></a>
##### `prep`

- Description: TODO

<a id="member-15"></a>
##### `curstate`

- Description: TODO

<a id="member-16"></a>
##### `invalid`

- Description: TODO

<a id="member-17"></a>
##### `caps`

- Description: TODO

<a id="member-19"></a>
##### `slvp`

- Description: TODO

<a id="member-20"></a>
##### `vendor`

- Description: TODO

<a id="member-21"></a>
##### `version`

- Description: TODO

<a id="member-22"></a>
##### `renderer`

- Description: TODO

<a id="member-23"></a>
##### `major`

- Description: TODO

<a id="member-24"></a>
##### `minor`

- Description: TODO

<a id="member-25"></a>
##### `glslver`

- Description: TODO

<a id="member-26"></a>
##### `exts`

- Description: TODO

<a id="member-27"></a>
##### `maxtargets`

- Description: TODO

<a id="member-28"></a>
##### `anisotropy`

- Description: TODO

<a id="member-29"></a>
##### `linemin`

- Description: TODO

<a id="member-30"></a>
##### `linemax`

- Description: TODO

<a id="member-40"></a>
##### `stats_obj`

- Description: TODO

<a id="member-41"></a>
##### `stats_mem`

- Description: TODO

<a id="member-53"></a>
##### `src`

- Description: TODO

<a id="member-54"></a>
##### `type`

- Description: TODO

<a id="member-55"></a>
##### `id`

- Description: TODO

<a id="member-56"></a>
##### `sev`

- Description: TODO

<a id="member-57"></a>
##### `msg`

- Description: TODO

<a id="member-89"></a>
##### `bk`

- Description: TODO

<a id="member-90"></a>
##### `d`

- Description: TODO

<a id="member-93"></a>
##### `tempvao`

- Description: TODO

<a id="member-94"></a>
##### `tempvertex`

- Description: TODO

<a id="member-95"></a>
##### `tempindex`

- Description: TODO

<a id="member-96"></a>
##### `hash`

- Description: TODO

<a id="member-97"></a>
##### `shaders`

- Description: TODO

<a id="member-98"></a>
##### `prog`

- Description: TODO

<a id="member-99"></a>
##### `next`

- Description: TODO

<a id="member-100"></a>
##### `used`

- Description: TODO

<a id="member-102"></a>
##### `pmon`

- Description: TODO

<a id="member-103"></a>
##### `ptab`

- Description: TODO

<a id="member-104"></a>
##### `nprog`

- Description: TODO

<a id="member-114"></a>
##### `lastpclean`

- Description: TODO

<a id="member-116"></a>
##### `seqmon`

- Description: TODO

<a id="member-117"></a>
##### `sequse`

- Description: TODO

<a id="member-118"></a>
##### `seqhead`

- Description: TODO

<a id="member-119"></a>
##### `seqtail`

- Description: TODO

<a id="member-124"></a>
##### `no`

- Description: TODO

<a id="member-125"></a>
##### `clean`

- Description: TODO

<a id="member-126"></a>
##### `desc`

- Description: TODO

<a id="member-127"></a>
##### `cleaned`

- Description: TODO

#### Methods

<a id="member-18"></a>
##### `HardwareException(String msg, Caps caps)`

- Description: TODO

<a id="member-31"></a>
##### `glgeti(GL gl, int param)`

- Description: TODO

<a id="member-32"></a>
##### `glcondi(GL gl, int param, int def)`

- Description: TODO

<a id="member-33"></a>
##### `glgetf(GL gl, int param)`

- Description: TODO

<a id="member-34"></a>
##### `glconds(GL gl, int param)`

- Description: TODO

<a id="member-35"></a>
##### `Caps(GL gl)`

- Description: TODO

<a id="member-36"></a>
##### `checkreq()`

- Description: TODO

<a id="member-37"></a>
##### `vendor()`

- Description: TODO

<a id="member-38"></a>
##### `driver()`

- Description: TODO

<a id="member-39"></a>
##### `device()`

- Description: TODO

<a id="member-42"></a>
##### `protected abstract Caps mkcaps(GL initgl);`

- Description: TODO

<a id="member-43"></a>
##### `initialize(GL gl)`

- Description: TODO

<a id="member-44"></a>
##### `render()`

- Description: TODO

<a id="member-45"></a>
##### `drawlist()`

- Description: TODO

<a id="member-46"></a>
##### `reshape(Area wnd)`

- Description: TODO

<a id="member-47"></a>
##### `shape()`

- Description: TODO

<a id="member-48"></a>
##### `ckcbt()`

- Description: TODO

<a id="member-49"></a>
##### `cbloop()`

- Description: TODO

<a id="member-50"></a>
##### `callback(Runnable cb)`

- Description: TODO

<a id="member-51"></a>
##### `public void synccallbacks() throws InterruptedException`

- Description: TODO

<a id="member-52"></a>
##### `checkqueries(GL gl)`

- Description: TODO

<a id="member-58"></a>
##### `DebugMessage(int src, int type, int id, int sev, String msg)`

- Description: TODO

<a id="member-59"></a>
##### `getdebuglog(GL gl)`

- Description: TODO

<a id="member-60"></a>
##### `checkdebuglog(GL gl)`

- Description: TODO

<a id="member-61"></a>
##### `process(GL gl)`

- Description: TODO

<a id="member-62"></a>
##### `public void finish(GL gl) throws InterruptedException`

- Description: TODO

<a id="member-63"></a>
##### `submit(Render cmd)`

- Description: TODO

<a id="member-64"></a>
##### `public void submitwait() throws InterruptedException`

- Description: TODO

<a id="member-65"></a>
##### `disposeall()`

- Description: TODO

<a id="member-66"></a>
##### `public abstract SysBuffer malloc(int sz);`

- Description: TODO

<a id="member-67"></a>
##### `public abstract SysBuffer subsume(ByteBuffer data, int sz);`

- Description: TODO

<a id="member-68"></a>
##### `fillbuf(DataBuffer tgt, int from, int to)`

- Description: TODO

<a id="member-69"></a>
##### `fillbuf(DataBuffer target)`

- Description: TODO

<a id="member-70"></a>
##### `prepare()`

- Description: TODO

<a id="member-71"></a>
##### `prepare(GLObject obj)`

- Description: TODO

<a id="member-72"></a>
##### `prepare(BGL.Request req)`

- Description: TODO

<a id="member-73"></a>
##### `prepare(Consumer<GLRender> func)`

- Description: TODO

<a id="member-74"></a>
##### `prepare(Model.Indices buf)`

- Description: TODO

<a id="member-75"></a>
##### `prepare(VertexArray.Buffer buf)`

- Description: TODO

<a id="member-76"></a>
##### `prepare(Model mod, GLProgram prog)`

- Description: TODO

<a id="member-77"></a>
##### `prepare(Texture2D tex)`

- Description: TODO

<a id="member-78"></a>
##### `prepare(Texture2D.Sampler2D smp)`

- Description: TODO

<a id="member-79"></a>
##### `prepare(Texture3D tex)`

- Description: TODO

<a id="member-80"></a>
##### `prepare(Texture3D.Sampler3D smp)`

- Description: TODO

<a id="member-81"></a>
##### `prepare(Texture2DArray tex)`

- Description: TODO

<a id="member-82"></a>
##### `prepare(Texture2DArray.Sampler2DArray smp)`

- Description: TODO

<a id="member-83"></a>
##### `prepare(Texture2DMS tex)`

- Description: TODO

<a id="member-84"></a>
##### `prepare(Texture2DMS.Sampler2DMS smp)`

- Description: TODO

<a id="member-85"></a>
##### `prepare(TextureCube tex)`

- Description: TODO

<a id="member-86"></a>
##### `prepare(TextureCube.SamplerCube smp)`

- Description: TODO

<a id="member-87"></a>
##### `prepuval(Object val)`

- Description: TODO

<a id="member-88"></a>
##### `prepfval(Object val)`

- Description: TODO

<a id="member-91"></a>
##### `TempData(Supplier<T> bk)`

- Description: TODO

<a id="member-92"></a>
##### `get()`

- Description: TODO

<a id="member-101"></a>
##### `SavedProg(int hash, ShaderMacro[] shaders, GLProgram prog)`

- Description: TODO

<a id="member-105"></a>
##### `findprog(int hash, ShaderMacro[] shaders)`

- Description: TODO

<a id="member-106"></a>
##### `rehash(int nlen)`

- Description: TODO

<a id="member-107"></a>
##### `putprog(int hash, ShaderMacro[] shaders, GLProgram prog)`

- Description: TODO

<a id="member-108"></a>
##### `getprog(int hash, ShaderMacro[] shaders)`

- Description: TODO

<a id="member-109"></a>
##### `cleanprogs()`

- Description: TODO

<a id="member-110"></a>
##### `progdump()`

- Description: TODO

<a id="member-111"></a>
##### `compatible(DrawList ob)`

- Description: TODO

<a id="member-112"></a>
##### `compatible(Texture ob)`

- Description: TODO

<a id="member-113"></a>
##### `compatible(DataBuffer ob)`

- Description: TODO

<a id="member-115"></a>
##### `clean()`

- Description: TODO

<a id="member-120"></a>
##### `seqresize(int nsz)`

- Description: TODO

<a id="member-121"></a>
##### `seqreg()`

- Description: TODO

<a id="member-122"></a>
##### `sequnreg(int seq)`

- Description: TODO

<a id="member-123"></a>
##### `dispseq()`

- Description: TODO

<a id="member-128"></a>
##### `Sequence(Object owner)`

- Description: TODO

<a id="member-129"></a>
##### `disposed()`

- Description: TODO

<a id="member-130"></a>
##### `dispose()`

- Description: TODO

<a id="member-131"></a>
##### `numprogs()`

- Description: TODO

<a id="member-132"></a>
##### `caps()`

- Description: TODO

<a id="member-133"></a>
##### `memstats()`

- Description: TODO

<a id="member-134"></a>
##### `dispose()`

- Description: TODO
