# Gob

## Meta

- Source: [Gob.java](../../../src/haven/Gob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents an object in the world.

## Code Members

### Member Index

#### Fields

- [rc](#member-1)
- [a](#member-2)
- [virtual](#member-3)
- [clprio](#member-4)
- [id](#member-5)
- [removed](#member-6)
- [glob](#member-7)
- [attr](#member-8)
- [ols](#member-9)
- [slots](#member-10)
- [updateseq](#member-11)
- [lastolid](#member-12)
- [setupmods](#member-13)
- [deferred](#member-14)
- [deferral](#member-15)
- [id](#member-16)
- [gob](#member-17)
- [sm](#member-18)
- [spr](#member-19)
- [delign](#member-20)
- [old](#member-21)
- [slots](#member-22)
- [added](#member-23)
- [ctxr](#member-37)
- [map](#member-45)
- [surf](#member-46)
- [obst](#member-52)
- [cc](#member-53)
- [ca](#member-54)
- [seq](#member-55)
- [z](#member-56)
- [max](#member-62)
- [min](#member-63)
- [k](#member-64)
- [c](#member-65)
- [r](#member-66)
- [seq](#member-67)
- [cc](#member-68)
- [ca](#member-69)
- [points](#member-77)
- [c](#member-78)
- [r](#member-79)
- [seq](#member-80)
- [cc](#member-81)
- [ca](#member-82)
- [gob](#member-117)
- [mods](#member-122)
- [curstate](#member-127)
- [updwait](#member-132)
- [gob](#member-135)
- [updseq](#member-136)
- [ctxr](#member-140)
- [slots](#member-144)
- [cur](#member-145)
- [flw](#member-147)
- [tilestate](#member-148)
- [mods](#member-149)
- [oc](#member-150)
- [rc](#member-151)
- [rot](#member-152)
- [gndst](#member-156)
- [placed](#member-166)

#### Methods

- [Overlay(Gob gob, int id, Sprite.Mill<?> sm)](#member-24)
- [Overlay(Gob gob, Sprite.Mill<?> sm)](#member-25)
- [Overlay(Gob gob, int id, Indir<Resource> res, Message sdt)](#member-26)
- [Overlay(Gob gob, Sprite spr)](#member-27)
- [init()](#member-28)
- [add0()](#member-29)
- [remove0()](#member-30)
- [remove(boolean async)](#member-31)
- [remove()](#member-32)
- [removed()](#member-33)
- [tick(double dt)](#member-34)
- [added(RenderTree.Slot slot)](#member-35)
- [removed(RenderTree.Slot slot)](#member-36)
- [context(Class<T> cl)](#member-38)
- [mkrandoom()](#member-39)
- [gobstate()](#member-40)
- [placestate()](#member-41)
- [public Coord3f getc(Coord2d rc, double ra);](#member-42)
- [public Matrix4f getr(Coord2d rc, double ra);](#member-43)
- [public Placer placer();](#member-44)
- [DefaultPlace(MCache map, MCache.SurfaceID surf)](#member-47)
- [getc(Coord2d rc, double ra)](#member-48)
- [getr(Coord2d rc, double ra)](#member-49)
- [InclinePlace(MCache map, MCache.SurfaceID surf)](#member-50)
- [getr(Coord2d rc, double ra)](#member-51)
- [BasePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] obst)](#member-57)
- [BasePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)](#member-58)
- [BasePlace(MCache map, MCache.SurfaceID surf, Resource res)](#member-59)
- [getz(Coord2d rc, double ra)](#member-60)
- [getc(Coord2d rc, double ra)](#member-61)
- [LinePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points, Coord2d k)](#member-70)
- [LinePlace(MCache map, MCache.SurfaceID surf, Resource res, String id, Coord2d k)](#member-71)
- [LinePlace(MCache map, MCache.SurfaceID surf, Resource res, Coord2d k)](#member-72)
- [recalc(Coord2d rc, double ra)](#member-73)
- [check(Coord2d rc, double ra)](#member-74)
- [getc(Coord2d rc, double ra)](#member-75)
- [getr(Coord2d rc, double ra)](#member-76)
- [flatten(Coord2d[][] points)](#member-83)
- [PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[] points)](#member-84)
- [PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points)](#member-85)
- [PlanePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)](#member-86)
- [PlanePlace(MCache map, MCache.SurfaceID surf, Resource res)](#member-87)
- [recalc(Coord2d rc, double ra)](#member-88)
- [check(Coord2d rc, double ra)](#member-89)
- [getc(Coord2d rc, double ra)](#member-90)
- [getr(Coord2d rc, double ra)](#member-91)
- [ctick(double dt)](#member-92)
- [gtick(Render g)](#member-93)
- [removed()](#member-94)
- [deferred()](#member-95)
- [defer(Runnable task)](#member-96)
- [olidcmp(int a, int b)](#member-97)
- [addol(Overlay ol, boolean async)](#member-98)
- [addol(Overlay ol)](#member-99)
- [addol(Sprite ol)](#member-100)
- [addol(Indir<Resource> res, Message sdt)](#member-101)
- [addol(Sprite.Mill<?> ol)](#member-102)
- [addolsync(Sprite.Mill<S> sm)](#member-103)
- [findol(int id)](#member-104)
- [dispose()](#member-105)
- [move(Coord2d c, double a)](#member-106)
- [placer()](#member-107)
- [getc()](#member-108)
- [getrc()](#member-109)
- [getmapstate(Coord3f pc)](#member-110)
- [attrclass(Class<? extends GAttrib> cl)](#member-111)
- [getattr(Class<C> c)](#member-112)
- [setattr(Class<? extends GAttrib> ac, GAttrib a)](#member-113)
- [setattr(GAttrib a)](#member-114)
- [delattr(Class<? extends GAttrib> c)](#member-115)
- [eqpoint(String nm, Message dat)](#member-116)
- [GobClick(Gob gob)](#member-118)
- [clickargs(ClickData cd)](#member-119)
- [toString()](#member-120)
- [obstate(Pipe buf)](#member-121)
- [GobState()](#member-123)
- [apply(Pipe buf)](#member-124)
- [equals(GobState that)](#member-125)
- [equals(Object o)](#member-126)
- [curstate()](#member-128)
- [updstate()](#member-129)
- [added(RenderTree.Slot slot)](#member-130)
- [removed(RenderTree.Slot slot)](#member-131)
- [updated()](#member-133)
- [updwait(Runnable callback, Consumer<Waitable.Waiting> reg)](#member-134)
- [DataLoading(Gob gob, String message)](#member-137)
- [waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)](#member-138)
- [mkrandoom()](#member-139)
- [context(Class<T> cl)](#member-141)
- [getv()](#member-142)
- [getloc()](#member-143)
- [Placed()](#member-146)
- [Placement()](#member-153)
- [equals(Placement that)](#member-154)
- [equals(Object o)](#member-155)
- [apply(Pipe buf)](#member-157)
- [placement()](#member-158)
- [autotick(double dt)](#member-159)
- [update(Placement np)](#member-160)
- [added(RenderTree.Slot slot)](#member-161)
- [removed(RenderTree.Slot slot)](#member-162)
- [curplace()](#member-163)
- [getc()](#member-164)
- [ticker()](#member-165)
- [toString()](#member-167)
- [position()](#member-168)
- [velocity()](#member-169)
- [id()](#member-170)
- [isDirectingEast()](#member-171)
- [isDirectingSouth()](#member-172)
- [isDirectingWest()](#member-173)
- [isDirectingNorth()](#member-174)
- [attributeMap()](#member-175)
- [resource()](#member-176)
- [resourceName()](#member-177)
- [resourceBasename()](#member-178)
- [isResourceNameEndsWith(String suffix)](#member-179)
- [buddyName()](#member-180)
- [buddyGroup()](#member-181)
- [isAt(Coord coord)](#member-182)
- [isAt(Coord2d coord)](#member-183)
- [isMoving()](#member-184)
- [isStop()](#member-185)
- [distance(Coord coord)](#member-186)
- [distance(Gob gob)](#member-187)
- [baseResName()](#member-188)
- [poseResNames()](#member-189)
- [equResNames()](#member-190)
- [modResNames()](#member-191)
- [resNames()](#member-192)
- [poseNames()](#member-193)
- [hasPose(String pose)](#member-194)
- [followingTarget()](#member-195)
- [isFollowing(Gob gob)](#member-196)
- [isLifting()](#member-197)
- [isLifting(Gob gob)](#member-198)
- [waitMove(Coord destination)](#member-199)
- [waitMove()](#member-200)
- [waitBuild()](#member-201)
- [waitLift(Gob gob)](#member-202)
- [waitPut()](#member-203)
- [isLog()](#member-204)
- [isTrunk()](#member-205)
- [isContainer()](#member-206)
- [debugDescription()](#member-207)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `rc`

- Description: TODO

<a id="member-2"></a>
##### `a`

- Description: TODO

<a id="member-3"></a>
##### `virtual`

- Description: TODO

<a id="member-4"></a>
##### `clprio`

- Description: TODO

<a id="member-5"></a>
##### `id`

- Description: TODO

<a id="member-6"></a>
##### `removed`

- Description: TODO

<a id="member-7"></a>
##### `glob`

- Description: TODO

<a id="member-8"></a>
##### `attr`

- Description: TODO

<a id="member-9"></a>
##### `ols`

- Description: TODO

<a id="member-10"></a>
##### `slots`

- Description: TODO

<a id="member-11"></a>
##### `updateseq`

- Description: TODO

<a id="member-12"></a>
##### `lastolid`

- Description: TODO

<a id="member-13"></a>
##### `setupmods`

- Description: TODO

<a id="member-14"></a>
##### `deferred`

- Description: TODO

<a id="member-15"></a>
##### `deferral`

- Description: TODO

<a id="member-16"></a>
##### `id`

- Description: TODO

<a id="member-17"></a>
##### `gob`

- Description: TODO

<a id="member-18"></a>
##### `sm`

- Description: TODO

<a id="member-19"></a>
##### `spr`

- Description: TODO

<a id="member-20"></a>
##### `delign`

- Description: TODO

<a id="member-21"></a>
##### `old`

- Description: TODO

<a id="member-22"></a>
##### `slots`

- Description: TODO

<a id="member-23"></a>
##### `added`

- Description: TODO

<a id="member-37"></a>
##### `ctxr`

- Description: TODO

<a id="member-45"></a>
##### `map`

- Description: TODO

<a id="member-46"></a>
##### `surf`

- Description: TODO

<a id="member-52"></a>
##### `obst`

- Description: TODO

<a id="member-53"></a>
##### `cc`

- Description: TODO

<a id="member-54"></a>
##### `ca`

- Description: TODO

<a id="member-55"></a>
##### `seq`

- Description: TODO

<a id="member-56"></a>
##### `z`

- Description: TODO

<a id="member-62"></a>
##### `max`

- Description: TODO

<a id="member-63"></a>
##### `min`

- Description: TODO

<a id="member-64"></a>
##### `k`

- Description: TODO

<a id="member-65"></a>
##### `c`

- Description: TODO

<a id="member-66"></a>
##### `r`

- Description: TODO

<a id="member-67"></a>
##### `seq`

- Description: TODO

<a id="member-68"></a>
##### `cc`

- Description: TODO

<a id="member-69"></a>
##### `ca`

- Description: TODO

<a id="member-77"></a>
##### `points`

- Description: TODO

<a id="member-78"></a>
##### `c`

- Description: TODO

<a id="member-79"></a>
##### `r`

- Description: TODO

<a id="member-80"></a>
##### `seq`

- Description: TODO

<a id="member-81"></a>
##### `cc`

- Description: TODO

<a id="member-82"></a>
##### `ca`

- Description: TODO

<a id="member-117"></a>
##### `gob`

- Description: TODO

<a id="member-122"></a>
##### `mods`

- Description: TODO

<a id="member-127"></a>
##### `curstate`

- Description: TODO

<a id="member-132"></a>
##### `updwait`

- Description: TODO

<a id="member-135"></a>
##### `gob`

- Description: TODO

<a id="member-136"></a>
##### `updseq`

- Description: TODO

<a id="member-140"></a>
##### `ctxr`

- Description: TODO

<a id="member-144"></a>
##### `slots`

- Description: TODO

<a id="member-145"></a>
##### `cur`

- Description: TODO

<a id="member-147"></a>
##### `flw`

- Description: TODO

<a id="member-148"></a>
##### `tilestate`

- Description: TODO

<a id="member-149"></a>
##### `mods`

- Description: TODO

<a id="member-150"></a>
##### `oc`

- Description: TODO

<a id="member-151"></a>
##### `rc`

- Description: TODO

<a id="member-152"></a>
##### `rot`

- Description: TODO

<a id="member-156"></a>
##### `gndst`

- Description: TODO

<a id="member-166"></a>
##### `placed`

- Description: TODO

#### Methods

<a id="member-24"></a>
##### `Overlay(Gob gob, int id, Sprite.Mill<?> sm)`

- Description: TODO

<a id="member-25"></a>
##### `Overlay(Gob gob, Sprite.Mill<?> sm)`

- Description: TODO

<a id="member-26"></a>
##### `Overlay(Gob gob, int id, Indir<Resource> res, Message sdt)`

- Description: TODO

<a id="member-27"></a>
##### `Overlay(Gob gob, Sprite spr)`

- Description: TODO

<a id="member-28"></a>
##### `init()`

- Description: TODO

<a id="member-29"></a>
##### `add0()`

- Description: TODO

<a id="member-30"></a>
##### `remove0()`

- Description: TODO

<a id="member-31"></a>
##### `remove(boolean async)`

- Description: TODO

<a id="member-32"></a>
##### `remove()`

- Description: TODO

<a id="member-33"></a>
##### `removed()`

- Description: TODO

<a id="member-34"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-35"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-36"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-38"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-39"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-40"></a>
##### `gobstate()`

- Description: TODO

<a id="member-41"></a>
##### `placestate()`

- Description: TODO

<a id="member-42"></a>
##### `public Coord3f getc(Coord2d rc, double ra);`

- Description: TODO

<a id="member-43"></a>
##### `public Matrix4f getr(Coord2d rc, double ra);`

- Description: TODO

<a id="member-44"></a>
##### `public Placer placer();`

- Description: TODO

<a id="member-47"></a>
##### `DefaultPlace(MCache map, MCache.SurfaceID surf)`

- Description: TODO

<a id="member-48"></a>
##### `getc(Coord2d rc, double ra)`

- Description: TODO

<a id="member-49"></a>
##### `getr(Coord2d rc, double ra)`

- Description: TODO

<a id="member-50"></a>
##### `InclinePlace(MCache map, MCache.SurfaceID surf)`

- Description: TODO

<a id="member-51"></a>
##### `getr(Coord2d rc, double ra)`

- Description: TODO

<a id="member-57"></a>
##### `BasePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] obst)`

- Description: TODO

<a id="member-58"></a>
##### `BasePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)`

- Description: TODO

<a id="member-59"></a>
##### `BasePlace(MCache map, MCache.SurfaceID surf, Resource res)`

- Description: TODO

<a id="member-60"></a>
##### `getz(Coord2d rc, double ra)`

- Description: TODO

<a id="member-61"></a>
##### `getc(Coord2d rc, double ra)`

- Description: TODO

<a id="member-70"></a>
##### `LinePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points, Coord2d k)`

- Description: TODO

<a id="member-71"></a>
##### `LinePlace(MCache map, MCache.SurfaceID surf, Resource res, String id, Coord2d k)`

- Description: TODO

<a id="member-72"></a>
##### `LinePlace(MCache map, MCache.SurfaceID surf, Resource res, Coord2d k)`

- Description: TODO

<a id="member-73"></a>
##### `recalc(Coord2d rc, double ra)`

- Description: TODO

<a id="member-74"></a>
##### `check(Coord2d rc, double ra)`

- Description: TODO

<a id="member-75"></a>
##### `getc(Coord2d rc, double ra)`

- Description: TODO

<a id="member-76"></a>
##### `getr(Coord2d rc, double ra)`

- Description: TODO

<a id="member-83"></a>
##### `flatten(Coord2d[][] points)`

- Description: TODO

<a id="member-84"></a>
##### `PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[] points)`

- Description: TODO

<a id="member-85"></a>
##### `PlanePlace(MCache map, MCache.SurfaceID surf, Coord2d[][] points)`

- Description: TODO

<a id="member-86"></a>
##### `PlanePlace(MCache map, MCache.SurfaceID surf, Resource res, String id)`

- Description: TODO

<a id="member-87"></a>
##### `PlanePlace(MCache map, MCache.SurfaceID surf, Resource res)`

- Description: TODO

<a id="member-88"></a>
##### `recalc(Coord2d rc, double ra)`

- Description: TODO

<a id="member-89"></a>
##### `check(Coord2d rc, double ra)`

- Description: TODO

<a id="member-90"></a>
##### `getc(Coord2d rc, double ra)`

- Description: TODO

<a id="member-91"></a>
##### `getr(Coord2d rc, double ra)`

- Description: TODO

<a id="member-92"></a>
##### `ctick(double dt)`

- Description: TODO

<a id="member-93"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-94"></a>
##### `removed()`

- Description: TODO

<a id="member-95"></a>
##### `deferred()`

- Description: TODO

<a id="member-96"></a>
##### `defer(Runnable task)`

- Description: TODO

<a id="member-97"></a>
##### `olidcmp(int a, int b)`

- Description: TODO

<a id="member-98"></a>
##### `addol(Overlay ol, boolean async)`

- Description: TODO

<a id="member-99"></a>
##### `addol(Overlay ol)`

- Description: TODO

<a id="member-100"></a>
##### `addol(Sprite ol)`

- Description: TODO

<a id="member-101"></a>
##### `addol(Indir<Resource> res, Message sdt)`

- Description: TODO

<a id="member-102"></a>
##### `addol(Sprite.Mill<?> ol)`

- Description: TODO

<a id="member-103"></a>
##### `addolsync(Sprite.Mill<S> sm)`

- Description: TODO

<a id="member-104"></a>
##### `findol(int id)`

- Description: TODO

<a id="member-105"></a>
##### `dispose()`

- Description: TODO

<a id="member-106"></a>
##### `move(Coord2d c, double a)`

- Description: TODO

<a id="member-107"></a>
##### `placer()`

- Description: TODO

<a id="member-108"></a>
##### `getc()`

- Description: TODO

<a id="member-109"></a>
##### `getrc()`

- Description: TODO

<a id="member-110"></a>
##### `getmapstate(Coord3f pc)`

- Description: TODO

<a id="member-111"></a>
##### `attrclass(Class<? extends GAttrib> cl)`

- Description: TODO

<a id="member-112"></a>
##### `getattr(Class<C> c)`

- Description: TODO

<a id="member-113"></a>
##### `setattr(Class<? extends GAttrib> ac, GAttrib a)`

- Description: TODO

<a id="member-114"></a>
##### `setattr(GAttrib a)`

- Description: TODO

<a id="member-115"></a>
##### `delattr(Class<? extends GAttrib> c)`

- Description: TODO

<a id="member-116"></a>
##### `eqpoint(String nm, Message dat)`

- Description: TODO

<a id="member-118"></a>
##### `GobClick(Gob gob)`

- Description: TODO

<a id="member-119"></a>
##### `clickargs(ClickData cd)`

- Description: TODO

<a id="member-120"></a>
##### `toString()`

- Description: TODO

<a id="member-121"></a>
##### `obstate(Pipe buf)`

- Description: TODO

<a id="member-123"></a>
##### `GobState()`

- Description: TODO

<a id="member-124"></a>
##### `apply(Pipe buf)`

- Description: TODO

<a id="member-125"></a>
##### `equals(GobState that)`

- Description: TODO

<a id="member-126"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-128"></a>
##### `curstate()`

- Description: TODO

<a id="member-129"></a>
##### `updstate()`

- Description: TODO

<a id="member-130"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-131"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-133"></a>
##### `updated()`

- Description: TODO

<a id="member-134"></a>
##### `updwait(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

<a id="member-137"></a>
##### `DataLoading(Gob gob, String message)`

- Description: TODO

<a id="member-138"></a>
##### `waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

<a id="member-139"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-141"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-142"></a>
##### `getv()`

- Description: TODO

<a id="member-143"></a>
##### `getloc()`

- Description: TODO

<a id="member-146"></a>
##### `Placed()`

- Description: TODO

<a id="member-153"></a>
##### `Placement()`

- Description: TODO

<a id="member-154"></a>
##### `equals(Placement that)`

- Description: TODO

<a id="member-155"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-157"></a>
##### `apply(Pipe buf)`

- Description: TODO

<a id="member-158"></a>
##### `placement()`

- Description: TODO

<a id="member-159"></a>
##### `autotick(double dt)`

- Description: TODO

<a id="member-160"></a>
##### `update(Placement np)`

- Description: TODO

<a id="member-161"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-162"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-163"></a>
##### `curplace()`

- Description: TODO

<a id="member-164"></a>
##### `getc()`

- Description: TODO

<a id="member-165"></a>
##### `ticker()`

- Description: TODO

<a id="member-167"></a>
##### `toString()`

- Description: TODO

<a id="member-168"></a>
##### `position()`

- Description: TODO

<a id="member-169"></a>
##### `velocity()`

- Description: TODO

<a id="member-170"></a>
##### `id()`

- Description: TODO

<a id="member-171"></a>
##### `isDirectingEast()`

- Description: TODO

<a id="member-172"></a>
##### `isDirectingSouth()`

- Description: TODO

<a id="member-173"></a>
##### `isDirectingWest()`

- Description: TODO

<a id="member-174"></a>
##### `isDirectingNorth()`

- Description: TODO

<a id="member-175"></a>
##### `attributeMap()`

- Description: TODO

<a id="member-176"></a>
##### `resource()`

- Description: TODO

<a id="member-177"></a>
##### `resourceName()`

- Description: TODO

<a id="member-178"></a>
##### `resourceBasename()`

- Description: TODO

<a id="member-179"></a>
##### `isResourceNameEndsWith(String suffix)`

- Description: TODO

<a id="member-180"></a>
##### `buddyName()`

- Description: TODO

<a id="member-181"></a>
##### `buddyGroup()`

- Description: TODO

<a id="member-182"></a>
##### `isAt(Coord coord)`

- Description: TODO

<a id="member-183"></a>
##### `isAt(Coord2d coord)`

- Description: TODO

<a id="member-184"></a>
##### `isMoving()`

- Description: TODO

<a id="member-185"></a>
##### `isStop()`

- Description: TODO

<a id="member-186"></a>
##### `distance(Coord coord)`

- Description: TODO

<a id="member-187"></a>
##### `distance(Gob gob)`

- Description: TODO

<a id="member-188"></a>
##### `baseResName()`

- Description: TODO

<a id="member-189"></a>
##### `poseResNames()`

- Description: TODO

<a id="member-190"></a>
##### `equResNames()`

- Description: TODO

<a id="member-191"></a>
##### `modResNames()`

- Description: TODO

<a id="member-192"></a>
##### `resNames()`

- Description: TODO

<a id="member-193"></a>
##### `poseNames()`

- Description: TODO

<a id="member-194"></a>
##### `hasPose(String pose)`

- Description: TODO

<a id="member-195"></a>
##### `followingTarget()`

- Description: TODO

<a id="member-196"></a>
##### `isFollowing(Gob gob)`

- Description: TODO

<a id="member-197"></a>
##### `isLifting()`

- Description: TODO

<a id="member-198"></a>
##### `isLifting(Gob gob)`

- Description: TODO

<a id="member-199"></a>
##### `waitMove(Coord destination)`

- Description: TODO

<a id="member-200"></a>
##### `waitMove()`

- Description: TODO

<a id="member-201"></a>
##### `waitBuild()`

- Description: TODO

<a id="member-202"></a>
##### `waitLift(Gob gob)`

- Description: TODO

<a id="member-203"></a>
##### `waitPut()`

- Description: TODO

<a id="member-204"></a>
##### `isLog()`

- Description: TODO

<a id="member-205"></a>
##### `isTrunk()`

- Description: TODO

<a id="member-206"></a>
##### `isContainer()`

- Description: TODO

<a id="member-207"></a>
##### `debugDescription()`

- Description: TODO
