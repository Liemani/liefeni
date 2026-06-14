# GOut

## Meta

- Source: [GOut.java](../../../src/haven/GOut.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a graphics output surface.

## Code Members

### Member Index

#### Fields

- [vf_pos](#member-1)
- [vf_tex](#member-2)
- [out](#member-3)
- [ul](#member-4)
- [br](#member-5)
- [tx](#member-6)
- [root](#member-7)
- [def2d](#member-8)
- [cur2d](#member-9)

#### Methods

- [root()](#member-10)
- [sz()](#member-11)
- [basicstate()](#member-12)
- [state()](#member-13)
- [image(BufferedImage img, Coord c)](#member-14)
- [image(Resource.Image img, Coord c)](#member-15)
- [image(Tex tex, Coord c)](#member-16)
- [image(Indir<Tex> tex, Coord c)](#member-17)
- [aimage(Tex tex, Coord c, double ax, double ay)](#member-18)
- [aimage(Tex tex, Coord c, double ax, double ay, Coord sz)](#member-19)
- [image(Tex tex, Coord c, Coord sz)](#member-20)
- [image(Tex tex, Coord c, Coord ul, Coord br)](#member-21)
- [image(Tex tex, Coord c, Coord ul, Coord br, Coord sz)](#member-22)
- [rimagev(Tex tex, Coord c, int h)](#member-23)
- [rimageh(Tex tex, Coord c, int w)](#member-24)
- [rimage(Tex tex, Coord c, Coord sz)](#member-25)
- [rotimage(Tex tex, Coord c, Coord rcc, double a)](#member-26)
- [image(Tex tex, Coord c, State s)](#member-27)
- [atext(String text, Coord c, double ax, double ay)](#member-28)
- [text(String text, Coord c)](#member-29)
- [drawp(Model.Mode mode, float[] data, int n)](#member-30)
- [drawp(Model.Mode mode, float[] data)](#member-31)
- [drawt(Model.Mode mode, float[] data, int n)](#member-32)
- [drawt(Model.Mode mode, float[] data)](#member-33)
- [line(Coord c1, Coord c2, double w)](#member-34)
- [frect2(Coord ul, Coord br)](#member-35)
- [frect(Coord ul, Coord sz)](#member-36)
- [fellipse(Coord c, Coord r, double a1, double a2)](#member-37)
- [fellipse(Coord c, Coord r)](#member-38)
- [rect2(Coord ul, Coord br)](#member-39)
- [rect(Coord ul, Coord sz)](#member-40)
- [prect(Coord c, Coord ul, Coord br, double a)](#member-41)
- [curstate(State.Slot<T> slot)](#member-42)
- [usestate(State st)](#member-43)
- [usestate(Pipe.Op st)](#member-44)
- [usestate(State.Slot<? super T> slot)](#member-45)
- [defstate()](#member-46)
- [chcolor(Color c)](#member-47)
- [chcolor(int r, int g, int b, int a)](#member-48)
- [chcolor()](#member-49)
- [getcolor()](#member-50)
- [reclip2(Coord ul, Coord br)](#member-51)
- [reclip(Coord ul, Coord sz)](#member-52)
- [reclipl2(Coord ul, Coord br)](#member-53)
- [reclipl(Coord ul, Coord sz)](#member-54)
- [getpixel(Render g, Pipe state, FragData buf, Coord c, Consumer<Color> cb)](#member-55)
- [getpixel(Coord c, Consumer<Color> cb)](#member-56)
- [flipimage(VectorFormat fmt, int w, ByteBuffer data)](#member-57)
- [filltorgb(ByteBuffer src, VectorFormat fmt)](#member-58)
- [debugimage(ByteBuffer data, Coord sz, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)](#member-59)
- [debugimage(Render g, Pipe state, FragData buf, Area area, VectorFormat fmt, Consumer<BufferedImage> cb)](#member-60)
- [getimage(Render g, Pipe state, FragData buf, Area area, Consumer<BufferedImage> cb)](#member-61)
- [getimage(Coord ul, Coord sz, Consumer<BufferedImage> cb)](#member-62)
- [getimage(Consumer<BufferedImage> cb)](#member-63)
- [debugimage(Render g, Texture.Image<?> img, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)](#member-64)
- [debugimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)](#member-65)
- [getimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)](#member-66)
- [getimage(Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)](#member-67)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `vf_pos`

- Description: TODO

<a id="member-2"></a>
##### `vf_tex`

- Description: TODO

<a id="member-3"></a>
##### `out`

- Description: TODO

<a id="member-4"></a>
##### `ul`

- Description: TODO

<a id="member-5"></a>
##### `br`

- Description: TODO

<a id="member-6"></a>
##### `tx`

- Description: TODO

<a id="member-7"></a>
##### `root`

- Description: TODO

<a id="member-8"></a>
##### `def2d`

- Description: TODO

<a id="member-9"></a>
##### `cur2d`

- Description: TODO

#### Methods

<a id="member-10"></a>
##### `root()`

- Description: TODO

<a id="member-11"></a>
##### `sz()`

- Description: TODO

<a id="member-12"></a>
##### `basicstate()`

- Description: TODO

<a id="member-13"></a>
##### `state()`

- Description: TODO

<a id="member-14"></a>
##### `image(BufferedImage img, Coord c)`

- Description: TODO

<a id="member-15"></a>
##### `image(Resource.Image img, Coord c)`

- Description: TODO

<a id="member-16"></a>
##### `image(Tex tex, Coord c)`

- Description: TODO

<a id="member-17"></a>
##### `image(Indir<Tex> tex, Coord c)`

- Description: TODO

<a id="member-18"></a>
##### `aimage(Tex tex, Coord c, double ax, double ay)`

- Description: TODO

<a id="member-19"></a>
##### `aimage(Tex tex, Coord c, double ax, double ay, Coord sz)`

- Description: TODO

<a id="member-20"></a>
##### `image(Tex tex, Coord c, Coord sz)`

- Description: TODO

<a id="member-21"></a>
##### `image(Tex tex, Coord c, Coord ul, Coord br)`

- Description: TODO

<a id="member-22"></a>
##### `image(Tex tex, Coord c, Coord ul, Coord br, Coord sz)`

- Description: TODO

<a id="member-23"></a>
##### `rimagev(Tex tex, Coord c, int h)`

- Description: TODO

<a id="member-24"></a>
##### `rimageh(Tex tex, Coord c, int w)`

- Description: TODO

<a id="member-25"></a>
##### `rimage(Tex tex, Coord c, Coord sz)`

- Description: TODO

<a id="member-26"></a>
##### `rotimage(Tex tex, Coord c, Coord rcc, double a)`

- Description: TODO

<a id="member-27"></a>
##### `image(Tex tex, Coord c, State s)`

- Description: TODO

<a id="member-28"></a>
##### `atext(String text, Coord c, double ax, double ay)`

- Description: TODO

<a id="member-29"></a>
##### `text(String text, Coord c)`

- Description: TODO

<a id="member-30"></a>
##### `drawp(Model.Mode mode, float[] data, int n)`

- Description: TODO

<a id="member-31"></a>
##### `drawp(Model.Mode mode, float[] data)`

- Description: TODO

<a id="member-32"></a>
##### `drawt(Model.Mode mode, float[] data, int n)`

- Description: TODO

<a id="member-33"></a>
##### `drawt(Model.Mode mode, float[] data)`

- Description: TODO

<a id="member-34"></a>
##### `line(Coord c1, Coord c2, double w)`

- Description: TODO

<a id="member-35"></a>
##### `frect2(Coord ul, Coord br)`

- Description: TODO

<a id="member-36"></a>
##### `frect(Coord ul, Coord sz)`

- Description: TODO

<a id="member-37"></a>
##### `fellipse(Coord c, Coord r, double a1, double a2)`

- Description: TODO

<a id="member-38"></a>
##### `fellipse(Coord c, Coord r)`

- Description: TODO

<a id="member-39"></a>
##### `rect2(Coord ul, Coord br)`

- Description: TODO

<a id="member-40"></a>
##### `rect(Coord ul, Coord sz)`

- Description: TODO

<a id="member-41"></a>
##### `prect(Coord c, Coord ul, Coord br, double a)`

- Description: TODO

<a id="member-42"></a>
##### `curstate(State.Slot<T> slot)`

- Description: TODO

<a id="member-43"></a>
##### `usestate(State st)`

- Description: TODO

<a id="member-44"></a>
##### `usestate(Pipe.Op st)`

- Description: TODO

<a id="member-45"></a>
##### `usestate(State.Slot<? super T> slot)`

- Description: TODO

<a id="member-46"></a>
##### `defstate()`

- Description: TODO

<a id="member-47"></a>
##### `chcolor(Color c)`

- Description: TODO

<a id="member-48"></a>
##### `chcolor(int r, int g, int b, int a)`

- Description: TODO

<a id="member-49"></a>
##### `chcolor()`

- Description: TODO

<a id="member-50"></a>
##### `getcolor()`

- Description: TODO

<a id="member-51"></a>
##### `reclip2(Coord ul, Coord br)`

- Description: TODO

<a id="member-52"></a>
##### `reclip(Coord ul, Coord sz)`

- Description: TODO

<a id="member-53"></a>
##### `reclipl2(Coord ul, Coord br)`

- Description: TODO

<a id="member-54"></a>
##### `reclipl(Coord ul, Coord sz)`

- Description: TODO

<a id="member-55"></a>
##### `getpixel(Render g, Pipe state, FragData buf, Coord c, Consumer<Color> cb)`

- Description: TODO

<a id="member-56"></a>
##### `getpixel(Coord c, Consumer<Color> cb)`

- Description: TODO

<a id="member-57"></a>
##### `flipimage(VectorFormat fmt, int w, ByteBuffer data)`

- Description: TODO

<a id="member-58"></a>
##### `filltorgb(ByteBuffer src, VectorFormat fmt)`

- Description: TODO

<a id="member-59"></a>
##### `debugimage(ByteBuffer data, Coord sz, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO

<a id="member-60"></a>
##### `debugimage(Render g, Pipe state, FragData buf, Area area, VectorFormat fmt, Consumer<BufferedImage> cb)`

- Description: TODO

<a id="member-61"></a>
##### `getimage(Render g, Pipe state, FragData buf, Area area, Consumer<BufferedImage> cb)`

- Description: TODO

<a id="member-62"></a>
##### `getimage(Coord ul, Coord sz, Consumer<BufferedImage> cb)`

- Description: TODO

<a id="member-63"></a>
##### `getimage(Consumer<BufferedImage> cb)`

- Description: TODO

<a id="member-64"></a>
##### `debugimage(Render g, Texture.Image<?> img, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO

<a id="member-65"></a>
##### `debugimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO

<a id="member-66"></a>
##### `getimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO

<a id="member-67"></a>
##### `getimage(Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO
