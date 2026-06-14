# Skeleton

## Meta

- Source: [Skeleton.java](../../../src/haven/Skeleton.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents skeleton data.

## Code Members

### Member Index

#### Fields

- [bones](#member-1)
- [blist](#member-2)
- [bindpose](#member-3)
- [name](#member-4)
- [ipos](#member-5)
- [irax](#member-6)
- [irang](#member-7)
- [parent](#member-8)
- [idx](#member-9)
- [lpos](#member-21)
- [gpos](#member-22)
- [lrot](#member-23)
- [grot](#member-24)
- [from](#member-25)
- [seq](#member-26)
- [ref](#member-36)
- [orig](#member-37)
- [tgt](#member-38)
- [cur](#member-39)
- [cseq](#member-40)
- [fmt](#member-44)
- [data](#member-45)
- [model](#member-46)
- [bperm](#member-47)
- [nil](#member-55)
- [owner](#member-56)
- [lpos](#member-57)
- [lrot](#member-58)
- [cbl](#member-59)
- [mods](#member-73)
- [stat](#member-74)
- [def](#member-84)
- [res](#member-86)
- [s](#member-89)
- [tracks](#member-93)
- [effects](#member-94)
- [len](#member-95)
- [mode](#member-96)
- [stat](#member-97)
- [done](#member-98)
- [time](#member-99)
- [scale](#member-100)
- [speedmod](#member-101)
- [nspeed](#member-102)
- [back](#member-103)
- [bone](#member-111)
- [frames](#member-112)
- [time](#member-113)
- [trans](#member-114)
- [rot](#member-115)
- [events](#member-118)
- [time](#member-120)
- [res](#member-124)
- [sdt](#member-125)
- [loc](#member-126)
- [fxid](#member-129)
- [mod](#member-130)
- [ticked](#member-131)
- [id](#member-136)
- [res](#member-137)
- [sdt](#member-138)
- [id](#member-141)
- [id](#member-144)
- [id](#member-149)
- [len](#member-150)
- [tracks](#member-151)
- [effects](#member-152)
- [nspeed](#member-153)
- [defmode](#member-154)
- [refskel](#member-155)
- [nm](#member-167)
- [prog](#member-168)
- [opcodes](#member-169)

#### Methods

- [Bone(String name, Coord3f ipos, Coord3f irax, float irang)](#member-10)
- [rotasq(float[] q, float[] axis, float angle)](#member-11)
- [qqmul(float[] d, float[] a, float[] b)](#member-12)
- [vqrot(float[] d, float[] v, float[] q)](#member-13)
- [vset(float[] d, float[] s)](#member-14)
- [qset(float[] d, float[] s)](#member-15)
- [vinv(float[] d, float[] s)](#member-16)
- [qinv(float[] d, float[] s)](#member-17)
- [vvadd(float[] d, float[] a, float[] b)](#member-18)
- [qqslerp(float[] d, float[] a, float[] b, float t)](#member-19)
- [mkbindpose()](#member-20)
- [Pose()](#member-27)
- [Pose(Pose from)](#member-28)
- [skel()](#member-29)
- [reset()](#member-30)
- [gbuild()](#member-31)
- [blend(Pose o, float d)](#member-32)
- [bonetrans(int bone)](#member-33)
- [eqpoint(String name, Message dat)](#member-34)
- [bonetrans2(int bone)](#member-35)
- [BoneAlign(Coord3f ref, Bone orig, Bone tgt)](#member-41)
- [get()](#member-42)
- [boneoff(int bone, float[] offtrans)](#member-43)
- [Debug()](#member-48)
- [draw(Pipe state, Render g)](#member-49)
- [autogtick(Render g)](#member-50)
- [ticker()](#member-51)
- [added(RenderTree.Slot slot)](#member-52)
- [public double getv();](#member-53)
- [public Collection<Location.Chain> getloc();](#member-54)
- [PoseMod(ModOwner owner)](#member-60)
- [skel()](#member-61)
- [reset()](#member-62)
- [rot(int bone, float ang, float ax, float ay, float az)](#member-63)
- [apply(Pose p)](#member-64)
- [tick(float dt)](#member-65)
- [age()](#member-66)
- [listen(FxTrack.EventListener l)](#member-67)
- [remove(FxTrack.EventListener l)](#member-68)
- [callback(FxTrack.Event ev)](#member-69)
- [public abstract boolean stat();](#member-70)
- [public abstract boolean done();](#member-71)
- [nilmod()](#member-72)
- [CombinedMod(ModOwner owner, PoseMod... mods)](#member-75)
- [apply(Pose p)](#member-76)
- [tick(float dt)](#member-77)
- [age()](#member-78)
- [stat()](#member-79)
- [done()](#member-80)
- [toString()](#member-81)
- [combine(PoseMod... mods)](#member-82)
- [public PoseMod create(Skeleton skel, ModOwner owner, Resource res, Message sdt);](#member-83)
- [mkposemod(ModOwner owner, Resource res, Message sdt)](#member-85)
- [ResourceSkeleton(Collection<Bone> bones, Res info)](#member-87)
- [toString()](#member-88)
- [read(Map<String, Bone> bones, Map<Bone, String> pm, Message buf, int ver)](#member-90)
- [Res(Resource res, Message buf)](#member-91)
- [init()](#member-92)
- [TrackMod(ModOwner owner, Track[] tracks, FxTrack[] effects, float len, WrapMode mode)](#member-104)
- [aupdate(float time)](#member-105)
- [playfx(float ot, float nt)](#member-106)
- [tick(float dt)](#member-107)
- [age()](#member-108)
- [stat()](#member-109)
- [done()](#member-110)
- [Frame(float time, float[] trans, float[] rot)](#member-116)
- [Track(String bone, Frame[] frames)](#member-117)
- [public void event(Event ev);](#member-119)
- [Event(float time)](#member-121)
- [public abstract void trigger(ModOwner owner, PoseMod mod);](#member-122)
- [FxTrack(Event[] events)](#member-123)
- [SpawnSprite(float time, Indir<Resource> res, byte[] sdt, Function<ModOwner, Pipe.Op> loc)](#member-127)
- [trigger(ModOwner owner, PoseMod mod)](#member-128)
- [FxOverlay(Gob gob, PoseMod mod, String id, Indir<Resource> res, Message sdt)](#member-132)
- [tick(double dt)](#member-133)
- [removed()](#member-134)
- [event(FxTrack.Event ev)](#member-135)
- [MkOverlay(float time, String id, Indir<Resource> res, byte[] sdt)](#member-139)
- [trigger(ModOwner owner, PoseMod mod)](#member-140)
- [RmOverlay(float time, String id)](#member-142)
- [trigger(ModOwner owner, PoseMod mod)](#member-143)
- [Trigger(float time, String id)](#member-145)
- [trigger(ModOwner owner, PoseMod mod)](#member-146)
- [Tick(float time)](#member-147)
- [trigger(ModOwner owner, PoseMod mod)](#member-148)
- [parseframes(int fmt, Message buf)](#member-156)
- [parsefx(int fmt, Message buf)](#member-157)
- [ResPose(Resource res, Message buf)](#member-158)
- [iaIaCthulhuFhtagn(Skeleton skel)](#member-159)
- [skelscale(Skeleton from, Skeleton to)](#member-160)
- [ResMod(ModOwner owner, Skeleton skel, WrapMode mode)](#member-161)
- [ResMod(ModOwner owner, Skeleton skel)](#member-162)
- [toString()](#member-163)
- [forskel(ModOwner owner, Skeleton skel, WrapMode mode)](#member-164)
- [layerid()](#member-165)
- [init()](#member-166)
- [BoneOffset(Resource res, Message buf)](#member-170)
- [layerid()](#member-171)
- [init()](#member-172)
- [from(EquipTarget equ)](#member-173)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `bones`

- Description: TODO

<a id="member-2"></a>
##### `blist`

- Description: TODO

<a id="member-3"></a>
##### `bindpose`

- Description: TODO

<a id="member-4"></a>
##### `name`

- Description: TODO

<a id="member-5"></a>
##### `ipos`

- Description: TODO

<a id="member-6"></a>
##### `irax`

- Description: TODO

<a id="member-7"></a>
##### `irang`

- Description: TODO

<a id="member-8"></a>
##### `parent`

- Description: TODO

<a id="member-9"></a>
##### `idx`

- Description: TODO

<a id="member-21"></a>
##### `lpos`

- Description: TODO

<a id="member-22"></a>
##### `gpos`

- Description: TODO

<a id="member-23"></a>
##### `lrot`

- Description: TODO

<a id="member-24"></a>
##### `grot`

- Description: TODO

<a id="member-25"></a>
##### `from`

- Description: TODO

<a id="member-26"></a>
##### `seq`

- Description: TODO

<a id="member-36"></a>
##### `ref`

- Description: TODO

<a id="member-37"></a>
##### `orig`

- Description: TODO

<a id="member-38"></a>
##### `tgt`

- Description: TODO

<a id="member-39"></a>
##### `cur`

- Description: TODO

<a id="member-40"></a>
##### `cseq`

- Description: TODO

<a id="member-44"></a>
##### `fmt`

- Description: TODO

<a id="member-45"></a>
##### `data`

- Description: TODO

<a id="member-46"></a>
##### `model`

- Description: TODO

<a id="member-47"></a>
##### `bperm`

- Description: TODO

<a id="member-55"></a>
##### `nil`

- Description: TODO

<a id="member-56"></a>
##### `owner`

- Description: TODO

<a id="member-57"></a>
##### `lpos`

- Description: TODO

<a id="member-58"></a>
##### `lrot`

- Description: TODO

<a id="member-59"></a>
##### `cbl`

- Description: TODO

<a id="member-73"></a>
##### `mods`

- Description: TODO

<a id="member-74"></a>
##### `stat`

- Description: TODO

<a id="member-84"></a>
##### `def`

- Description: TODO

<a id="member-86"></a>
##### `res`

- Description: TODO

<a id="member-89"></a>
##### `s`

- Description: TODO

<a id="member-93"></a>
##### `tracks`

- Description: TODO

<a id="member-94"></a>
##### `effects`

- Description: TODO

<a id="member-95"></a>
##### `len`

- Description: TODO

<a id="member-96"></a>
##### `mode`

- Description: TODO

<a id="member-97"></a>
##### `stat`

- Description: TODO

<a id="member-98"></a>
##### `done`

- Description: TODO

<a id="member-99"></a>
##### `time`

- Description: TODO

<a id="member-100"></a>
##### `scale`

- Description: TODO

<a id="member-101"></a>
##### `speedmod`

- Description: TODO

<a id="member-102"></a>
##### `nspeed`

- Description: TODO

<a id="member-103"></a>
##### `back`

- Description: TODO

<a id="member-111"></a>
##### `bone`

- Description: TODO

<a id="member-112"></a>
##### `frames`

- Description: TODO

<a id="member-113"></a>
##### `time`

- Description: TODO

<a id="member-114"></a>
##### `trans`

- Description: TODO

<a id="member-115"></a>
##### `rot`

- Description: TODO

<a id="member-118"></a>
##### `events`

- Description: TODO

<a id="member-120"></a>
##### `time`

- Description: TODO

<a id="member-124"></a>
##### `res`

- Description: TODO

<a id="member-125"></a>
##### `sdt`

- Description: TODO

<a id="member-126"></a>
##### `loc`

- Description: TODO

<a id="member-129"></a>
##### `fxid`

- Description: TODO

<a id="member-130"></a>
##### `mod`

- Description: TODO

<a id="member-131"></a>
##### `ticked`

- Description: TODO

<a id="member-136"></a>
##### `id`

- Description: TODO

<a id="member-137"></a>
##### `res`

- Description: TODO

<a id="member-138"></a>
##### `sdt`

- Description: TODO

<a id="member-141"></a>
##### `id`

- Description: TODO

<a id="member-144"></a>
##### `id`

- Description: TODO

<a id="member-149"></a>
##### `id`

- Description: TODO

<a id="member-150"></a>
##### `len`

- Description: TODO

<a id="member-151"></a>
##### `tracks`

- Description: TODO

<a id="member-152"></a>
##### `effects`

- Description: TODO

<a id="member-153"></a>
##### `nspeed`

- Description: TODO

<a id="member-154"></a>
##### `defmode`

- Description: TODO

<a id="member-155"></a>
##### `refskel`

- Description: TODO

<a id="member-167"></a>
##### `nm`

- Description: TODO

<a id="member-168"></a>
##### `prog`

- Description: TODO

<a id="member-169"></a>
##### `opcodes`

- Description: TODO

#### Methods

<a id="member-10"></a>
##### `Bone(String name, Coord3f ipos, Coord3f irax, float irang)`

- Description: TODO

<a id="member-11"></a>
##### `rotasq(float[] q, float[] axis, float angle)`

- Description: TODO

<a id="member-12"></a>
##### `qqmul(float[] d, float[] a, float[] b)`

- Description: TODO

<a id="member-13"></a>
##### `vqrot(float[] d, float[] v, float[] q)`

- Description: TODO

<a id="member-14"></a>
##### `vset(float[] d, float[] s)`

- Description: TODO

<a id="member-15"></a>
##### `qset(float[] d, float[] s)`

- Description: TODO

<a id="member-16"></a>
##### `vinv(float[] d, float[] s)`

- Description: TODO

<a id="member-17"></a>
##### `qinv(float[] d, float[] s)`

- Description: TODO

<a id="member-18"></a>
##### `vvadd(float[] d, float[] a, float[] b)`

- Description: TODO

<a id="member-19"></a>
##### `qqslerp(float[] d, float[] a, float[] b, float t)`

- Description: TODO

<a id="member-20"></a>
##### `mkbindpose()`

- Description: TODO

<a id="member-27"></a>
##### `Pose()`

- Description: TODO

<a id="member-28"></a>
##### `Pose(Pose from)`

- Description: TODO

<a id="member-29"></a>
##### `skel()`

- Description: TODO

<a id="member-30"></a>
##### `reset()`

- Description: TODO

<a id="member-31"></a>
##### `gbuild()`

- Description: TODO

<a id="member-32"></a>
##### `blend(Pose o, float d)`

- Description: TODO

<a id="member-33"></a>
##### `bonetrans(int bone)`

- Description: TODO

<a id="member-34"></a>
##### `eqpoint(String name, Message dat)`

- Description: TODO

<a id="member-35"></a>
##### `bonetrans2(int bone)`

- Description: TODO

<a id="member-41"></a>
##### `BoneAlign(Coord3f ref, Bone orig, Bone tgt)`

- Description: TODO

<a id="member-42"></a>
##### `get()`

- Description: TODO

<a id="member-43"></a>
##### `boneoff(int bone, float[] offtrans)`

- Description: TODO

<a id="member-48"></a>
##### `Debug()`

- Description: TODO

<a id="member-49"></a>
##### `draw(Pipe state, Render g)`

- Description: TODO

<a id="member-50"></a>
##### `autogtick(Render g)`

- Description: TODO

<a id="member-51"></a>
##### `ticker()`

- Description: TODO

<a id="member-52"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-53"></a>
##### `public double getv();`

- Description: TODO

<a id="member-54"></a>
##### `public Collection<Location.Chain> getloc();`

- Description: TODO

<a id="member-60"></a>
##### `PoseMod(ModOwner owner)`

- Description: TODO

<a id="member-61"></a>
##### `skel()`

- Description: TODO

<a id="member-62"></a>
##### `reset()`

- Description: TODO

<a id="member-63"></a>
##### `rot(int bone, float ang, float ax, float ay, float az)`

- Description: TODO

<a id="member-64"></a>
##### `apply(Pose p)`

- Description: TODO

<a id="member-65"></a>
##### `tick(float dt)`

- Description: TODO

<a id="member-66"></a>
##### `age()`

- Description: TODO

<a id="member-67"></a>
##### `listen(FxTrack.EventListener l)`

- Description: TODO

<a id="member-68"></a>
##### `remove(FxTrack.EventListener l)`

- Description: TODO

<a id="member-69"></a>
##### `callback(FxTrack.Event ev)`

- Description: TODO

<a id="member-70"></a>
##### `public abstract boolean stat();`

- Description: TODO

<a id="member-71"></a>
##### `public abstract boolean done();`

- Description: TODO

<a id="member-72"></a>
##### `nilmod()`

- Description: TODO

<a id="member-75"></a>
##### `CombinedMod(ModOwner owner, PoseMod... mods)`

- Description: TODO

<a id="member-76"></a>
##### `apply(Pose p)`

- Description: TODO

<a id="member-77"></a>
##### `tick(float dt)`

- Description: TODO

<a id="member-78"></a>
##### `age()`

- Description: TODO

<a id="member-79"></a>
##### `stat()`

- Description: TODO

<a id="member-80"></a>
##### `done()`

- Description: TODO

<a id="member-81"></a>
##### `toString()`

- Description: TODO

<a id="member-82"></a>
##### `combine(PoseMod... mods)`

- Description: TODO

<a id="member-83"></a>
##### `public PoseMod create(Skeleton skel, ModOwner owner, Resource res, Message sdt);`

- Description: TODO

<a id="member-85"></a>
##### `mkposemod(ModOwner owner, Resource res, Message sdt)`

- Description: TODO

<a id="member-87"></a>
##### `ResourceSkeleton(Collection<Bone> bones, Res info)`

- Description: TODO

<a id="member-88"></a>
##### `toString()`

- Description: TODO

<a id="member-90"></a>
##### `read(Map<String, Bone> bones, Map<Bone, String> pm, Message buf, int ver)`

- Description: TODO

<a id="member-91"></a>
##### `Res(Resource res, Message buf)`

- Description: TODO

<a id="member-92"></a>
##### `init()`

- Description: TODO

<a id="member-104"></a>
##### `TrackMod(ModOwner owner, Track[] tracks, FxTrack[] effects, float len, WrapMode mode)`

- Description: TODO

<a id="member-105"></a>
##### `aupdate(float time)`

- Description: TODO

<a id="member-106"></a>
##### `playfx(float ot, float nt)`

- Description: TODO

<a id="member-107"></a>
##### `tick(float dt)`

- Description: TODO

<a id="member-108"></a>
##### `age()`

- Description: TODO

<a id="member-109"></a>
##### `stat()`

- Description: TODO

<a id="member-110"></a>
##### `done()`

- Description: TODO

<a id="member-116"></a>
##### `Frame(float time, float[] trans, float[] rot)`

- Description: TODO

<a id="member-117"></a>
##### `Track(String bone, Frame[] frames)`

- Description: TODO

<a id="member-119"></a>
##### `public void event(Event ev);`

- Description: TODO

<a id="member-121"></a>
##### `Event(float time)`

- Description: TODO

<a id="member-122"></a>
##### `public abstract void trigger(ModOwner owner, PoseMod mod);`

- Description: TODO

<a id="member-123"></a>
##### `FxTrack(Event[] events)`

- Description: TODO

<a id="member-127"></a>
##### `SpawnSprite(float time, Indir<Resource> res, byte[] sdt, Function<ModOwner, Pipe.Op> loc)`

- Description: TODO

<a id="member-128"></a>
##### `trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

<a id="member-132"></a>
##### `FxOverlay(Gob gob, PoseMod mod, String id, Indir<Resource> res, Message sdt)`

- Description: TODO

<a id="member-133"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-134"></a>
##### `removed()`

- Description: TODO

<a id="member-135"></a>
##### `event(FxTrack.Event ev)`

- Description: TODO

<a id="member-139"></a>
##### `MkOverlay(float time, String id, Indir<Resource> res, byte[] sdt)`

- Description: TODO

<a id="member-140"></a>
##### `trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

<a id="member-142"></a>
##### `RmOverlay(float time, String id)`

- Description: TODO

<a id="member-143"></a>
##### `trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

<a id="member-145"></a>
##### `Trigger(float time, String id)`

- Description: TODO

<a id="member-146"></a>
##### `trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

<a id="member-147"></a>
##### `Tick(float time)`

- Description: TODO

<a id="member-148"></a>
##### `trigger(ModOwner owner, PoseMod mod)`

- Description: TODO

<a id="member-156"></a>
##### `parseframes(int fmt, Message buf)`

- Description: TODO

<a id="member-157"></a>
##### `parsefx(int fmt, Message buf)`

- Description: TODO

<a id="member-158"></a>
##### `ResPose(Resource res, Message buf)`

- Description: TODO

<a id="member-159"></a>
##### `iaIaCthulhuFhtagn(Skeleton skel)`

- Description: TODO

<a id="member-160"></a>
##### `skelscale(Skeleton from, Skeleton to)`

- Description: TODO

<a id="member-161"></a>
##### `ResMod(ModOwner owner, Skeleton skel, WrapMode mode)`

- Description: TODO

<a id="member-162"></a>
##### `ResMod(ModOwner owner, Skeleton skel)`

- Description: TODO

<a id="member-163"></a>
##### `toString()`

- Description: TODO

<a id="member-164"></a>
##### `forskel(ModOwner owner, Skeleton skel, WrapMode mode)`

- Description: TODO

<a id="member-165"></a>
##### `layerid()`

- Description: TODO

<a id="member-166"></a>
##### `init()`

- Description: TODO

<a id="member-170"></a>
##### `BoneOffset(Resource res, Message buf)`

- Description: TODO

<a id="member-171"></a>
##### `layerid()`

- Description: TODO

<a id="member-172"></a>
##### `init()`

- Description: TODO

<a id="member-173"></a>
##### `from(EquipTarget equ)`

- Description: TODO
