# Audio

## Meta

- Source: [Audio.java](../../../src/haven/Audio.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Handles audio device and playback support.

## Code Members

### Member Index

#### Constants

- [UN8](#member-25)
- [SN8](#member-26)
- [SN16](#member-27)
- [SN32](#member-28)

#### Fields

- [outname](#member-1)
- [fmt](#member-2)
- [enabled](#member-3)
- [volume](#member-4)
- [bufsize](#member-5)
- [player](#member-6)
- [clip](#member-12)
- [cont](#member-13)
- [clips](#member-14)
- [clip](#member-29)
- [sch](#member-30)
- [sfmt](#member-31)
- [ssz](#member-32)
- [size](#member-33)
- [dbuf](#member-34)
- [head](#member-35)
- [tail](#member-36)
- [eof](#member-37)
- [clip](#member-46)
- [data](#member-47)
- [dp](#member-48)
- [bk](#member-52)
- [vol](#member-53)
- [bal](#member-54)
- [cvol](#member-55)
- [bk](#member-59)
- [irate](#member-60)
- [orate](#member-61)
- [sp](#member-62)
- [ack](#member-63)
- [lval](#member-64)
- [nval](#member-65)
- [data](#member-66)
- [dp](#member-67)
- [dl](#member-68)
- [bk](#member-74)
- [eof](#member-75)
- [cur](#member-80)
- [bk](#member-83)
- [val](#member-84)
- [n](#member-85)
- [iv](#member-86)
- [stream](#member-90)
- [nch](#member-91)
- [reopen](#member-92)
- [resclips](#member-101)

#### Methods

- [setvolume(double volume)](#member-7)
- [public int get(double[][] buf, int len);](#member-8)
- [public CS stream();](#member-9)
- [layerid()](#member-10)
- [bvol()](#member-11)
- [Mixer(boolean continuous)](#member-15)
- [Mixer()](#member-16)
- [get(double[][] dst, int ns)](#member-17)
- [add(CS clip)](#member-18)
- [stop(CS clip)](#member-19)
- [playing(CS clip)](#member-20)
- [size()](#member-21)
- [empty()](#member-22)
- [current()](#member-23)
- [clear()](#member-24)
- [PCMClip(InputStream clip, int nch, int sfmt)](#member-38)
- [size(int size)](#member-39)
- [read(byte[] buf, int off, int len)](#member-40)
- [get(double[][] dst, int ns)](#member-41)
- [public static CS fromwav(InputStream clip) throws IOException](#member-42)
- [private static int u8(InputStream clip) throws IOException](#member-43)
- [private static int u16(InputStream clip) throws IOException](#member-44)
- [private static int s32(InputStream clip) throws IOException](#member-45)
- [VorbisClip(VorbisStream clip)](#member-49)
- [public VorbisClip(InputStream bs) throws IOException](#member-50)
- [get(double[][] dst, int ns)](#member-51)
- [VolAdjust(CS bk, double vol)](#member-56)
- [VolAdjust(CS bk)](#member-57)
- [get(double[][] dst, int ns)](#member-58)
- [Resampler(CS bk, double irate, double orate)](#member-69)
- [Resampler(CS bk, double irate)](#member-70)
- [Resampler(CS bk)](#member-71)
- [get(double[][] dst, int ns)](#member-72)
- [sp(double sp)](#member-73)
- [Monitor(CS bk)](#member-76)
- [get(double[][] dst, int ns)](#member-77)
- [eof()](#member-78)
- [public void finwait() throws InterruptedException](#member-79)
- [get(double[][] buf, int ns)](#member-81)
- [protected abstract CS cons();](#member-82)
- [LDump(CS bk, int iv)](#member-87)
- [LDump(CS bk)](#member-88)
- [get(double[][] buf, int ns)](#member-89)
- [Player(CS stream)](#member-93)
- [fillbuf(byte[] dst, int off, int len)](#member-94)
- [static SourceDataLine getline() throws LineUnavailableException](#member-95)
- [run()](#member-96)
- [reopen(boolean async)](#member-97)
- [ckpl(boolean creat)](#member-98)
- [play(CS clip)](#member-99)
- [stop(CS clip)](#member-100)
- [resclip(Resource res)](#member-102)
- [fromres(Resource res)](#member-103)
- [play(Resource res)](#member-104)
- [bufsize()](#member-105)
- [bufsize(int nsz, boolean async)](#member-106)
- [public static void main(String[] args) throws Exception](#member-107)

### Member Reference

#### Constants

<a id="member-25"></a>
##### `UN8`

- Description: TODO

<a id="member-26"></a>
##### `SN8`

- Description: TODO

<a id="member-27"></a>
##### `SN16`

- Description: TODO

<a id="member-28"></a>
##### `SN32`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `outname`

- Description: TODO

<a id="member-2"></a>
##### `fmt`

- Description: TODO

<a id="member-3"></a>
##### `enabled`

- Description: TODO

<a id="member-4"></a>
##### `volume`

- Description: TODO

<a id="member-5"></a>
##### `bufsize`

- Description: TODO

<a id="member-6"></a>
##### `player`

- Description: TODO

<a id="member-12"></a>
##### `clip`

- Description: TODO

<a id="member-13"></a>
##### `cont`

- Description: TODO

<a id="member-14"></a>
##### `clips`

- Description: TODO

<a id="member-29"></a>
##### `clip`

- Description: TODO

<a id="member-30"></a>
##### `sch`

- Description: TODO

<a id="member-31"></a>
##### `sfmt`

- Description: TODO

<a id="member-32"></a>
##### `ssz`

- Description: TODO

<a id="member-33"></a>
##### `size`

- Description: TODO

<a id="member-34"></a>
##### `dbuf`

- Description: TODO

<a id="member-35"></a>
##### `head`

- Description: TODO

<a id="member-36"></a>
##### `tail`

- Description: TODO

<a id="member-37"></a>
##### `eof`

- Description: TODO

<a id="member-46"></a>
##### `clip`

- Description: TODO

<a id="member-47"></a>
##### `data`

- Description: TODO

<a id="member-48"></a>
##### `dp`

- Description: TODO

<a id="member-52"></a>
##### `bk`

- Description: TODO

<a id="member-53"></a>
##### `vol`

- Description: TODO

<a id="member-54"></a>
##### `bal`

- Description: TODO

<a id="member-55"></a>
##### `cvol`

- Description: TODO

<a id="member-59"></a>
##### `bk`

- Description: TODO

<a id="member-60"></a>
##### `irate`

- Description: TODO

<a id="member-61"></a>
##### `orate`

- Description: TODO

<a id="member-62"></a>
##### `sp`

- Description: TODO

<a id="member-63"></a>
##### `ack`

- Description: TODO

<a id="member-64"></a>
##### `lval`

- Description: TODO

<a id="member-65"></a>
##### `nval`

- Description: TODO

<a id="member-66"></a>
##### `data`

- Description: TODO

<a id="member-67"></a>
##### `dp`

- Description: TODO

<a id="member-68"></a>
##### `dl`

- Description: TODO

<a id="member-74"></a>
##### `bk`

- Description: TODO

<a id="member-75"></a>
##### `eof`

- Description: TODO

<a id="member-80"></a>
##### `cur`

- Description: TODO

<a id="member-83"></a>
##### `bk`

- Description: TODO

<a id="member-84"></a>
##### `val`

- Description: TODO

<a id="member-85"></a>
##### `n`

- Description: TODO

<a id="member-86"></a>
##### `iv`

- Description: TODO

<a id="member-90"></a>
##### `stream`

- Description: TODO

<a id="member-91"></a>
##### `nch`

- Description: TODO

<a id="member-92"></a>
##### `reopen`

- Description: TODO

<a id="member-101"></a>
##### `resclips`

- Description: TODO

#### Methods

<a id="member-7"></a>
##### `setvolume(double volume)`

- Description: TODO

<a id="member-8"></a>
##### `public int get(double[][] buf, int len);`

- Description: TODO

<a id="member-9"></a>
##### `public CS stream();`

- Description: TODO

<a id="member-10"></a>
##### `layerid()`

- Description: TODO

<a id="member-11"></a>
##### `bvol()`

- Description: TODO

<a id="member-15"></a>
##### `Mixer(boolean continuous)`

- Description: TODO

<a id="member-16"></a>
##### `Mixer()`

- Description: TODO

<a id="member-17"></a>
##### `get(double[][] dst, int ns)`

- Description: TODO

<a id="member-18"></a>
##### `add(CS clip)`

- Description: TODO

<a id="member-19"></a>
##### `stop(CS clip)`

- Description: TODO

<a id="member-20"></a>
##### `playing(CS clip)`

- Description: TODO

<a id="member-21"></a>
##### `size()`

- Description: TODO

<a id="member-22"></a>
##### `empty()`

- Description: TODO

<a id="member-23"></a>
##### `current()`

- Description: TODO

<a id="member-24"></a>
##### `clear()`

- Description: TODO

<a id="member-38"></a>
##### `PCMClip(InputStream clip, int nch, int sfmt)`

- Description: TODO

<a id="member-39"></a>
##### `size(int size)`

- Description: TODO

<a id="member-40"></a>
##### `read(byte[] buf, int off, int len)`

- Description: TODO

<a id="member-41"></a>
##### `get(double[][] dst, int ns)`

- Description: TODO

<a id="member-42"></a>
##### `public static CS fromwav(InputStream clip) throws IOException`

- Description: TODO

<a id="member-43"></a>
##### `private static int u8(InputStream clip) throws IOException`

- Description: TODO

<a id="member-44"></a>
##### `private static int u16(InputStream clip) throws IOException`

- Description: TODO

<a id="member-45"></a>
##### `private static int s32(InputStream clip) throws IOException`

- Description: TODO

<a id="member-49"></a>
##### `VorbisClip(VorbisStream clip)`

- Description: TODO

<a id="member-50"></a>
##### `public VorbisClip(InputStream bs) throws IOException`

- Description: TODO

<a id="member-51"></a>
##### `get(double[][] dst, int ns)`

- Description: TODO

<a id="member-56"></a>
##### `VolAdjust(CS bk, double vol)`

- Description: TODO

<a id="member-57"></a>
##### `VolAdjust(CS bk)`

- Description: TODO

<a id="member-58"></a>
##### `get(double[][] dst, int ns)`

- Description: TODO

<a id="member-69"></a>
##### `Resampler(CS bk, double irate, double orate)`

- Description: TODO

<a id="member-70"></a>
##### `Resampler(CS bk, double irate)`

- Description: TODO

<a id="member-71"></a>
##### `Resampler(CS bk)`

- Description: TODO

<a id="member-72"></a>
##### `get(double[][] dst, int ns)`

- Description: TODO

<a id="member-73"></a>
##### `sp(double sp)`

- Description: TODO

<a id="member-76"></a>
##### `Monitor(CS bk)`

- Description: TODO

<a id="member-77"></a>
##### `get(double[][] dst, int ns)`

- Description: TODO

<a id="member-78"></a>
##### `eof()`

- Description: TODO

<a id="member-79"></a>
##### `public void finwait() throws InterruptedException`

- Description: TODO

<a id="member-81"></a>
##### `get(double[][] buf, int ns)`

- Description: TODO

<a id="member-82"></a>
##### `protected abstract CS cons();`

- Description: TODO

<a id="member-87"></a>
##### `LDump(CS bk, int iv)`

- Description: TODO

<a id="member-88"></a>
##### `LDump(CS bk)`

- Description: TODO

<a id="member-89"></a>
##### `get(double[][] buf, int ns)`

- Description: TODO

<a id="member-93"></a>
##### `Player(CS stream)`

- Description: TODO

<a id="member-94"></a>
##### `fillbuf(byte[] dst, int off, int len)`

- Description: TODO

<a id="member-95"></a>
##### `static SourceDataLine getline() throws LineUnavailableException`

- Description: TODO

<a id="member-96"></a>
##### `run()`

- Description: TODO

<a id="member-97"></a>
##### `reopen(boolean async)`

- Description: TODO

<a id="member-98"></a>
##### `ckpl(boolean creat)`

- Description: TODO

<a id="member-99"></a>
##### `play(CS clip)`

- Description: TODO

<a id="member-100"></a>
##### `stop(CS clip)`

- Description: TODO

<a id="member-102"></a>
##### `resclip(Resource res)`

- Description: TODO

<a id="member-103"></a>
##### `fromres(Resource res)`

- Description: TODO

<a id="member-104"></a>
##### `play(Resource res)`

- Description: TODO

<a id="member-105"></a>
##### `bufsize()`

- Description: TODO

<a id="member-106"></a>
##### `bufsize(int nsz, boolean async)`

- Description: TODO

<a id="member-107"></a>
##### `public static void main(String[] args) throws Exception`

- Description: TODO
