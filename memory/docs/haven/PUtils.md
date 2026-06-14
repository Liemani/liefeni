# PUtils

## Meta

- Source: [PUtils.java](../../../src/haven/PUtils.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides packet or protocol utilities.

## Code Members

### Member Index

#### Fields

- [cm_rgb](#member-1)
- [cm_rgba](#member-2)
- [grad](#member-31)
- [brad](#member-32)
- [col](#member-33)
- [tex](#member-39)
- [box](#member-49)
- [sz](#member-50)
- [sz](#member-54)
- [sz](#member-58)
- [uifilter](#member-68)

#### Methods

- [imgsz(BufferedImage img)](#member-3)
- [imgsz(Raster img)](#member-4)
- [byteraster(Coord sz, int bands)](#member-5)
- [alpharaster(Coord sz)](#member-6)
- [imgraster(Coord sz)](#member-7)
- [copy(Raster src)](#member-8)
- [copy(BufferedImage src)](#member-9)
- [rasterimg(WritableRaster img)](#member-10)
- [coercergba(BufferedImage img, boolean copy)](#member-11)
- [coercergba(BufferedImage img)](#member-12)
- [alphabounds(Raster img, int thres)](#member-13)
- [alphabounds(BufferedImage img, int thres)](#member-14)
- [imggrow(WritableRaster img, int rad)](#member-15)
- [imgblur(WritableRaster img, int rad, double var)](#member-16)
- [alphadraw(WritableRaster dst, Raster alpha, Coord ul, Color col)](#member-17)
- [blit(WritableRaster dst, Raster src, Coord off)](#member-18)
- [gayblit(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff)](#member-19)
- [alphablit(WritableRaster dst, Raster src, Coord off)](#member-20)
- [blendblit(WritableRaster dst, Raster src, Coord off, int a)](#member-21)
- [tilemod(WritableRaster dst, Raster tile, Coord off)](#member-22)
- [colmul(WritableRaster img, Color col)](#member-23)
- [copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff, Coord sz)](#member-24)
- [copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband)](#member-25)
- [copyband(WritableRaster dst, int dband, Raster src, int sband)](#member-26)
- [blurmask(Raster img, int grad, int brad, Color col)](#member-27)
- [blurmask2(Raster img, int grad, int brad, Color col)](#member-28)
- [glowmask(Raster img)](#member-29)
- [glowmask(Raster img, int grad, Color col)](#member-30)
- [BlurFurn(Text.Forge bk, int grad, int brad, Color col)](#member-34)
- [BlurFurn(Text.Furnace bk, int grad, int brad, Color col)](#member-35)
- [proc(Text.Slug text)](#member-36)
- [tloff()](#member-37)
- [broff()](#member-38)
- [TexFurn(Text.Forge bk, BufferedImage tex)](#member-40)
- [TexFurn(Text.Furnace bk, BufferedImage tex)](#member-41)
- [proc(Text.Slug text)](#member-42)
- [tloff()](#member-43)
- [broff()](#member-44)
- [dumpband(Raster img, int band)](#member-45)
- [monochromize(BufferedImage img, Color col)](#member-46)
- [public double cval(double td);](#member-47)
- [public double support();](#member-48)
- [Hanning(double sz)](#member-51)
- [cval(double td)](#member-52)
- [support()](#member-53)
- [Hamming(double sz)](#member-55)
- [cval(double td)](#member-56)
- [support()](#member-57)
- [Lanczos(double sz)](#member-59)
- [cval(double td)](#member-60)
- [support()](#member-61)
- [convolvedown(Raster in, Coord tsz, Convolution filter)](#member-62)
- [convolvedown(BufferedImage img, Coord tsz, Convolution filter)](#member-63)
- [convolveup(Raster in, Coord tsz, Convolution filter)](#member-64)
- [convolveup(BufferedImage img, Coord tsz, Convolution filter)](#member-65)
- [convolve(Raster img, Coord tsz, Convolution filter)](#member-66)
- [convolve(BufferedImage img, Coord tsz, Convolution filter)](#member-67)
- [uiscale(Raster img, Coord tsz)](#member-69)
- [uiscale(BufferedImage img, Coord tsz)](#member-70)
- [public static void main(String[] args) throws Exception](#member-71)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `cm_rgb`

- Description: TODO

<a id="member-2"></a>
##### `cm_rgba`

- Description: TODO

<a id="member-31"></a>
##### `grad`

- Description: TODO

<a id="member-32"></a>
##### `brad`

- Description: TODO

<a id="member-33"></a>
##### `col`

- Description: TODO

<a id="member-39"></a>
##### `tex`

- Description: TODO

<a id="member-49"></a>
##### `box`

- Description: TODO

<a id="member-50"></a>
##### `sz`

- Description: TODO

<a id="member-54"></a>
##### `sz`

- Description: TODO

<a id="member-58"></a>
##### `sz`

- Description: TODO

<a id="member-68"></a>
##### `uifilter`

- Description: TODO

#### Methods

<a id="member-3"></a>
##### `imgsz(BufferedImage img)`

- Description: TODO

<a id="member-4"></a>
##### `imgsz(Raster img)`

- Description: TODO

<a id="member-5"></a>
##### `byteraster(Coord sz, int bands)`

- Description: TODO

<a id="member-6"></a>
##### `alpharaster(Coord sz)`

- Description: TODO

<a id="member-7"></a>
##### `imgraster(Coord sz)`

- Description: TODO

<a id="member-8"></a>
##### `copy(Raster src)`

- Description: TODO

<a id="member-9"></a>
##### `copy(BufferedImage src)`

- Description: TODO

<a id="member-10"></a>
##### `rasterimg(WritableRaster img)`

- Description: TODO

<a id="member-11"></a>
##### `coercergba(BufferedImage img, boolean copy)`

- Description: TODO

<a id="member-12"></a>
##### `coercergba(BufferedImage img)`

- Description: TODO

<a id="member-13"></a>
##### `alphabounds(Raster img, int thres)`

- Description: TODO

<a id="member-14"></a>
##### `alphabounds(BufferedImage img, int thres)`

- Description: TODO

<a id="member-15"></a>
##### `imggrow(WritableRaster img, int rad)`

- Description: TODO

<a id="member-16"></a>
##### `imgblur(WritableRaster img, int rad, double var)`

- Description: TODO

<a id="member-17"></a>
##### `alphadraw(WritableRaster dst, Raster alpha, Coord ul, Color col)`

- Description: TODO

<a id="member-18"></a>
##### `blit(WritableRaster dst, Raster src, Coord off)`

- Description: TODO

<a id="member-19"></a>
##### `gayblit(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff)`

- Description: TODO

<a id="member-20"></a>
##### `alphablit(WritableRaster dst, Raster src, Coord off)`

- Description: TODO

<a id="member-21"></a>
##### `blendblit(WritableRaster dst, Raster src, Coord off, int a)`

- Description: TODO

<a id="member-22"></a>
##### `tilemod(WritableRaster dst, Raster tile, Coord off)`

- Description: TODO

<a id="member-23"></a>
##### `colmul(WritableRaster img, Color col)`

- Description: TODO

<a id="member-24"></a>
##### `copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff, Coord sz)`

- Description: TODO

<a id="member-25"></a>
##### `copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband)`

- Description: TODO

<a id="member-26"></a>
##### `copyband(WritableRaster dst, int dband, Raster src, int sband)`

- Description: TODO

<a id="member-27"></a>
##### `blurmask(Raster img, int grad, int brad, Color col)`

- Description: TODO

<a id="member-28"></a>
##### `blurmask2(Raster img, int grad, int brad, Color col)`

- Description: TODO

<a id="member-29"></a>
##### `glowmask(Raster img)`

- Description: TODO

<a id="member-30"></a>
##### `glowmask(Raster img, int grad, Color col)`

- Description: TODO

<a id="member-34"></a>
##### `BlurFurn(Text.Forge bk, int grad, int brad, Color col)`

- Description: TODO

<a id="member-35"></a>
##### `BlurFurn(Text.Furnace bk, int grad, int brad, Color col)`

- Description: TODO

<a id="member-36"></a>
##### `proc(Text.Slug text)`

- Description: TODO

<a id="member-37"></a>
##### `tloff()`

- Description: TODO

<a id="member-38"></a>
##### `broff()`

- Description: TODO

<a id="member-40"></a>
##### `TexFurn(Text.Forge bk, BufferedImage tex)`

- Description: TODO

<a id="member-41"></a>
##### `TexFurn(Text.Furnace bk, BufferedImage tex)`

- Description: TODO

<a id="member-42"></a>
##### `proc(Text.Slug text)`

- Description: TODO

<a id="member-43"></a>
##### `tloff()`

- Description: TODO

<a id="member-44"></a>
##### `broff()`

- Description: TODO

<a id="member-45"></a>
##### `dumpband(Raster img, int band)`

- Description: TODO

<a id="member-46"></a>
##### `monochromize(BufferedImage img, Color col)`

- Description: TODO

<a id="member-47"></a>
##### `public double cval(double td);`

- Description: TODO

<a id="member-48"></a>
##### `public double support();`

- Description: TODO

<a id="member-51"></a>
##### `Hanning(double sz)`

- Description: TODO

<a id="member-52"></a>
##### `cval(double td)`

- Description: TODO

<a id="member-53"></a>
##### `support()`

- Description: TODO

<a id="member-55"></a>
##### `Hamming(double sz)`

- Description: TODO

<a id="member-56"></a>
##### `cval(double td)`

- Description: TODO

<a id="member-57"></a>
##### `support()`

- Description: TODO

<a id="member-59"></a>
##### `Lanczos(double sz)`

- Description: TODO

<a id="member-60"></a>
##### `cval(double td)`

- Description: TODO

<a id="member-61"></a>
##### `support()`

- Description: TODO

<a id="member-62"></a>
##### `convolvedown(Raster in, Coord tsz, Convolution filter)`

- Description: TODO

<a id="member-63"></a>
##### `convolvedown(BufferedImage img, Coord tsz, Convolution filter)`

- Description: TODO

<a id="member-64"></a>
##### `convolveup(Raster in, Coord tsz, Convolution filter)`

- Description: TODO

<a id="member-65"></a>
##### `convolveup(BufferedImage img, Coord tsz, Convolution filter)`

- Description: TODO

<a id="member-66"></a>
##### `convolve(Raster img, Coord tsz, Convolution filter)`

- Description: TODO

<a id="member-67"></a>
##### `convolve(BufferedImage img, Coord tsz, Convolution filter)`

- Description: TODO

<a id="member-69"></a>
##### `uiscale(Raster img, Coord tsz)`

- Description: TODO

<a id="member-70"></a>
##### `uiscale(BufferedImage img, Coord tsz)`

- Description: TODO

<a id="member-71"></a>
##### `public static void main(String[] args) throws Exception`

- Description: TODO
