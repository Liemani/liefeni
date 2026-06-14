# PView

## Meta

- Source: [PView.java](../../../src/haven/PView.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a player view or projection surface.

## Code Members

### Member Index

#### Fields

- [tree](#member-1)
- [conf](#member-2)
- [basic](#member-3)
- [fragcol](#member-4)
- [depth](#member-5)
- [lights](#member-6)
- [env](#member-7)
- [instancer](#member-8)
- [back](#member-9)
- [rsz](#member-10)
- [basicstates](#member-11)
- [audio](#member-12)
- [list2d](#member-13)
- [ticklist](#member-14)
- [fragsamp](#member-15)
- [tonemap](#member-16)
- [wdg](#member-17)
- [ctxr](#member-20)
- [ctx](#member-26)
- [curconf](#member-28)
- [curprefs](#member-30)
- [isz](#member-40)
- [osz](#member-41)
- [scale](#member-45)
- [pp_resamp](#member-49)
- [id_fb](#member-60)
- [id_view](#member-61)
- [id_misc](#member-62)
- [cur](#member-67)

#### Methods

- [WidgetContext(PView wdg)](#member-18)
- [widget()](#member-19)
- [context(Class<T> cl)](#member-21)
- [basic(Object id)](#member-22)
- [basic(Object id, Pipe.Op state)](#member-23)
- [toString()](#member-24)
- [rendersz()](#member-25)
- [conf()](#member-27)
- [curconf()](#member-29)
- [gprefs()](#member-31)
- [frame()](#member-32)
- [reconf()](#member-33)
- [resize(Coord sz)](#member-34)
- [basic(Object id)](#member-35)
- [basic(Object id, Pipe.Op state)](#member-36)
- [clearcolor()](#member-37)
- [uglyJavaCWorkAround(RenderList.Slot<?> slot)](#member-38)
- [tick(double dt)](#member-39)
- [Resampler(Coord isz, Coord osz)](#member-42)
- [LinResampler(Coord isz, Coord osz)](#member-43)
- [run(GOut g, Texture2D.Sampler2D in)](#member-44)
- [IntResampler(Coord isz, Coord osz, int scale)](#member-46)
- [run(GOut g, Texture2D.Sampler2D in)](#member-47)
- [resolveout(GOut def, FrameFormat fmt, PostProcessor next)](#member-48)
- [resolve(GOut g)](#member-50)
- [add(PostProcessor post)](#member-51)
- [remove(PostProcessor post)](#member-52)
- [tonemap(PostProcessor tonemap)](#member-53)
- [envsetup()](#member-54)
- [envdispose()](#member-55)
- [maindraw(Render out)](#member-56)
- [gtick(Render out)](#member-57)
- [draw(GOut g)](#member-58)
- [dispose()](#member-59)
- [basic()](#member-63)
- [attached()](#member-64)
- [lights()](#member-65)
- [public void draw(GOut g, Pipe state);](#member-66)
- [draw(GOut g)](#member-68)
- [add(Slot<? extends Render2D> slot)](#member-69)
- [remove(Slot<? extends Render2D> slot)](#member-70)
- [update(Slot<? extends Render2D> slot)](#member-71)
- [update(Pipe group, int[] statemask)](#member-72)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `tree`

- Description: TODO

<a id="member-2"></a>
##### `conf`

- Description: TODO

<a id="member-3"></a>
##### `basic`

- Description: TODO

<a id="member-4"></a>
##### `fragcol`

- Description: TODO

<a id="member-5"></a>
##### `depth`

- Description: TODO

<a id="member-6"></a>
##### `lights`

- Description: TODO

<a id="member-7"></a>
##### `env`

- Description: TODO

<a id="member-8"></a>
##### `instancer`

- Description: TODO

<a id="member-9"></a>
##### `back`

- Description: TODO

<a id="member-10"></a>
##### `rsz`

- Description: TODO

<a id="member-11"></a>
##### `basicstates`

- Description: TODO

<a id="member-12"></a>
##### `audio`

- Description: TODO

<a id="member-13"></a>
##### `list2d`

- Description: TODO

<a id="member-14"></a>
##### `ticklist`

- Description: TODO

<a id="member-15"></a>
##### `fragsamp`

- Description: TODO

<a id="member-16"></a>
##### `tonemap`

- Description: TODO

<a id="member-17"></a>
##### `wdg`

- Description: TODO

<a id="member-20"></a>
##### `ctxr`

- Description: TODO

<a id="member-26"></a>
##### `ctx`

- Description: TODO

<a id="member-28"></a>
##### `curconf`

- Description: TODO

<a id="member-30"></a>
##### `curprefs`

- Description: TODO

<a id="member-40"></a>
##### `isz`

- Description: TODO

<a id="member-41"></a>
##### `osz`

- Description: TODO

<a id="member-45"></a>
##### `scale`

- Description: TODO

<a id="member-49"></a>
##### `pp_resamp`

- Description: TODO

<a id="member-60"></a>
##### `id_fb`

- Description: TODO

<a id="member-61"></a>
##### `id_view`

- Description: TODO

<a id="member-62"></a>
##### `id_misc`

- Description: TODO

<a id="member-67"></a>
##### `cur`

- Description: TODO

#### Methods

<a id="member-18"></a>
##### `WidgetContext(PView wdg)`

- Description: TODO

<a id="member-19"></a>
##### `widget()`

- Description: TODO

<a id="member-21"></a>
##### `context(Class<T> cl)`

- Description: TODO

<a id="member-22"></a>
##### `basic(Object id)`

- Description: TODO

<a id="member-23"></a>
##### `basic(Object id, Pipe.Op state)`

- Description: TODO

<a id="member-24"></a>
##### `toString()`

- Description: TODO

<a id="member-25"></a>
##### `rendersz()`

- Description: TODO

<a id="member-27"></a>
##### `conf()`

- Description: TODO

<a id="member-29"></a>
##### `curconf()`

- Description: TODO

<a id="member-31"></a>
##### `gprefs()`

- Description: TODO

<a id="member-32"></a>
##### `frame()`

- Description: TODO

<a id="member-33"></a>
##### `reconf()`

- Description: TODO

<a id="member-34"></a>
##### `resize(Coord sz)`

- Description: TODO

<a id="member-35"></a>
##### `basic(Object id)`

- Description: TODO

<a id="member-36"></a>
##### `basic(Object id, Pipe.Op state)`

- Description: TODO

<a id="member-37"></a>
##### `clearcolor()`

- Description: TODO

<a id="member-38"></a>
##### `uglyJavaCWorkAround(RenderList.Slot<?> slot)`

- Description: TODO

<a id="member-39"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-42"></a>
##### `Resampler(Coord isz, Coord osz)`

- Description: TODO

<a id="member-43"></a>
##### `LinResampler(Coord isz, Coord osz)`

- Description: TODO

<a id="member-44"></a>
##### `run(GOut g, Texture2D.Sampler2D in)`

- Description: TODO

<a id="member-46"></a>
##### `IntResampler(Coord isz, Coord osz, int scale)`

- Description: TODO

<a id="member-47"></a>
##### `run(GOut g, Texture2D.Sampler2D in)`

- Description: TODO

<a id="member-48"></a>
##### `resolveout(GOut def, FrameFormat fmt, PostProcessor next)`

- Description: TODO

<a id="member-50"></a>
##### `resolve(GOut g)`

- Description: TODO

<a id="member-51"></a>
##### `add(PostProcessor post)`

- Description: TODO

<a id="member-52"></a>
##### `remove(PostProcessor post)`

- Description: TODO

<a id="member-53"></a>
##### `tonemap(PostProcessor tonemap)`

- Description: TODO

<a id="member-54"></a>
##### `envsetup()`

- Description: TODO

<a id="member-55"></a>
##### `envdispose()`

- Description: TODO

<a id="member-56"></a>
##### `maindraw(Render out)`

- Description: TODO

<a id="member-57"></a>
##### `gtick(Render out)`

- Description: TODO

<a id="member-58"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-59"></a>
##### `dispose()`

- Description: TODO

<a id="member-63"></a>
##### `basic()`

- Description: TODO

<a id="member-64"></a>
##### `attached()`

- Description: TODO

<a id="member-65"></a>
##### `lights()`

- Description: TODO

<a id="member-66"></a>
##### `public void draw(GOut g, Pipe state);`

- Description: TODO

<a id="member-68"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-69"></a>
##### `add(Slot<? extends Render2D> slot)`

- Description: TODO

<a id="member-70"></a>
##### `remove(Slot<? extends Render2D> slot)`

- Description: TODO

<a id="member-71"></a>
##### `update(Slot<? extends Render2D> slot)`

- Description: TODO

<a id="member-72"></a>
##### `update(Pipe group, int[] statemask)`

- Description: TODO
