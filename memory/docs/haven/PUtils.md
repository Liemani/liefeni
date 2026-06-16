# PUtils

This file documents the responsibilities and members of `PUtils`.

## Meta

- Source: [PUtils.java](../../../src/haven/PUtils.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the putils Haven component.

## Nested Types

### BlurFurn

- Role: Represents blur furn within PUtils.
- Description: Describes the nested blur furn type used by the enclosing class.

### Convolution

- Role: Represents convolution within PUtils.
- Description: Describes the nested convolution type used by the enclosing class.

### Hamming

- Role: Represents hamming within PUtils.
- Description: Describes the nested hamming type used by the enclosing class.

### Hanning

- Role: Represents hanning within PUtils.
- Description: Describes the nested hanning type used by the enclosing class.

### Lanczos

- Role: Represents lanczos within PUtils.
- Description: Describes the nested lanczos type used by the enclosing class.

### TexFurn

- Role: Represents tex furn within PUtils.
- Description: Describes the nested tex furn type used by the enclosing class.

## Members

### Constants

#### `public static final ComponentColorModel cm_rgb = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`
- Role: Defines the shared cm rgb constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ComponentColorModel cm_rgba = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`
- Role: Defines the shared cm rgba constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Convolution box = new Convolution()`
- Role: Defines the shared box constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Convolution uifilter = new Lanczos(3)`
- Role: Defines the shared uifilter constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int grad, brad`
- Role: Stores the brad value.
- Description: Backs the cached state for this file.

#### `public final int grad, brad`
- Role: Stores the brad value.
- Description: Backs the cached state for this file.

#### `public final Color col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

#### `public final BufferedImage tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `private final double sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private final double sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private final double sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

### Methods

#### `public static Coord imgsz(BufferedImage img)`
- Role: Performs imgsz.
- Description: Supports the imgsz operation used by the surrounding class.

#### `public static Coord imgsz(Raster img)`
- Role: Performs imgsz.
- Description: Supports the imgsz operation used by the surrounding class.

#### `public static WritableRaster byteraster(Coord sz, int bands)`
- Role: Performs byteraster.
- Description: Supports the byteraster operation used by the surrounding class.

#### `public static WritableRaster alpharaster(Coord sz)`
- Role: Performs alpharaster.
- Description: Supports the alpharaster operation used by the surrounding class.

#### `public static WritableRaster imgraster(Coord sz)`
- Role: Performs imgraster.
- Description: Supports the imgraster operation used by the surrounding class.

#### `public static WritableRaster copy(Raster src)`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public static BufferedImage copy(BufferedImage src)`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public static BufferedImage rasterimg(WritableRaster img)`
- Role: Performs rasterimg.
- Description: Supports the rasterimg operation used by the surrounding class.

#### `public static BufferedImage coercergba(BufferedImage img, boolean copy)`
- Role: Performs coercergba.
- Description: Supports the coercergba operation used by the surrounding class.

#### `public static BufferedImage coercergba(BufferedImage img)`
- Role: Performs coercergba.
- Description: Supports the coercergba operation used by the surrounding class.

#### `public static Area alphabounds(Raster img, int thres)`
- Role: Performs alphabounds.
- Description: Supports the alphabounds operation used by the surrounding class.

#### `public static Area alphabounds(BufferedImage img, int thres)`
- Role: Performs alphabounds.
- Description: Supports the alphabounds operation used by the surrounding class.

#### `public static WritableRaster imggrow(WritableRaster img, int rad)`
- Role: Performs imggrow.
- Description: Supports the imggrow operation used by the surrounding class.

#### `public static WritableRaster imgblur(WritableRaster img, int rad, double var)`
- Role: Performs imgblur.
- Description: Supports the imgblur operation used by the surrounding class.

#### `public static WritableRaster alphadraw(WritableRaster dst, Raster alpha, Coord ul, Color col)`
- Role: Performs alphadraw.
- Description: Supports the alphadraw operation used by the surrounding class.

#### `public static WritableRaster blit(WritableRaster dst, Raster src, Coord off)`
- Role: Performs blit.
- Description: Supports the blit operation used by the surrounding class.

#### `public static WritableRaster gayblit(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff)`
- Role: Performs gayblit.
- Description: Supports the gayblit operation used by the surrounding class.

#### `public static WritableRaster alphablit(WritableRaster dst, Raster src, Coord off)`
- Role: Performs alphablit.
- Description: Supports the alphablit operation used by the surrounding class.

#### `public static WritableRaster blendblit(WritableRaster dst, Raster src, Coord off, int a)`
- Role: Performs blendblit.
- Description: Supports the blendblit operation used by the surrounding class.

#### `public static WritableRaster tilemod(WritableRaster dst, Raster tile, Coord off)`
- Role: Performs tilemod.
- Description: Supports the tilemod operation used by the surrounding class.

#### `public static WritableRaster colmul(WritableRaster img, Color col)`
- Role: Performs colmul.
- Description: Supports the colmul operation used by the surrounding class.

#### `public static WritableRaster copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff, Coord sz)`
- Role: Performs copyband.
- Description: Supports the copyband operation used by the surrounding class.

#### `public static WritableRaster copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband)`
- Role: Performs copyband.
- Description: Supports the copyband operation used by the surrounding class.

#### `public static WritableRaster copyband(WritableRaster dst, int dband, Raster src, int sband)`
- Role: Performs copyband.
- Description: Supports the copyband operation used by the surrounding class.

#### `public static WritableRaster blurmask(Raster img, int grad, int brad, Color col)`
- Role: Performs blurmask.
- Description: Supports the blurmask operation used by the surrounding class.

#### `public static WritableRaster blurmask2(Raster img, int grad, int brad, Color col)`
- Role: Performs blurmask2.
- Description: Supports the blurmask2 operation used by the surrounding class.

#### `public static WritableRaster glowmask(Raster img)`
- Role: Performs glowmask.
- Description: Supports the glowmask operation used by the surrounding class.

#### `public static BufferedImage glowmask(Raster img, int grad, Color col)`
- Role: Performs glowmask.
- Description: Supports the glowmask operation used by the surrounding class.

#### `public BlurFurn(Text.Forge bk, int grad, int brad, Color col)`
- Role: Performs blur furn.
- Description: Supports the blur furn operation used by the surrounding class.

#### `public BlurFurn(Text.Furnace bk, int grad, int brad, Color col)`
- Role: Performs blur furn.
- Description: Supports the blur furn operation used by the surrounding class.

#### `public BufferedImage proc(Text.Slug text)`
- Role: Performs proc.
- Description: Supports the proc operation used by the surrounding class.

#### `public Coord tloff()`
- Role: Performs tloff.
- Description: Supports the tloff operation used by the surrounding class.

#### `public Coord broff()`
- Role: Performs broff.
- Description: Supports the broff operation used by the surrounding class.

#### `public TexFurn(Text.Forge bk, BufferedImage tex)`
- Role: Performs tex furn.
- Description: Supports the tex furn operation used by the surrounding class.

#### `public TexFurn(Text.Furnace bk, BufferedImage tex)`
- Role: Performs tex furn.
- Description: Supports the tex furn operation used by the surrounding class.

#### `public BufferedImage proc(Text.Slug text)`
- Role: Performs proc.
- Description: Supports the proc operation used by the surrounding class.

#### `public Coord tloff()`
- Role: Performs tloff.
- Description: Supports the tloff operation used by the surrounding class.

#### `public Coord broff()`
- Role: Performs broff.
- Description: Supports the broff operation used by the surrounding class.

#### `public static void dumpband(Raster img, int band)`
- Role: Performs dumpband.
- Description: Supports the dumpband operation used by the surrounding class.

#### `public static BufferedImage monochromize(BufferedImage img, Color col)`
- Role: Performs monochromize.
- Description: Supports the monochromize operation used by the surrounding class.

#### `public double cval(double td)`
- Role: Performs cval.
- Description: Supports the cval operation used by the surrounding class.

#### `public double support()`
- Role: Performs support.
- Description: Supports the support operation used by the surrounding class.

#### `public Hanning(double sz)`
- Role: Performs hanning.
- Description: Supports the hanning operation used by the surrounding class.

#### `public double cval(double td)`
- Role: Performs cval.
- Description: Supports the cval operation used by the surrounding class.

#### `public double support()`
- Role: Performs support.
- Description: Supports the support operation used by the surrounding class.

#### `public Hamming(double sz)`
- Role: Performs hamming.
- Description: Supports the hamming operation used by the surrounding class.

#### `public double cval(double td)`
- Role: Performs cval.
- Description: Supports the cval operation used by the surrounding class.

#### `public double support()`
- Role: Performs support.
- Description: Supports the support operation used by the surrounding class.

#### `public Lanczos(double sz)`
- Role: Performs lanczos.
- Description: Supports the lanczos operation used by the surrounding class.

#### `public double cval(double td)`
- Role: Performs cval.
- Description: Supports the cval operation used by the surrounding class.

#### `public double support()`
- Role: Performs support.
- Description: Supports the support operation used by the surrounding class.

#### `public static WritableRaster convolvedown(Raster in, Coord tsz, Convolution filter)`
- Role: Performs convolvedown.
- Description: Supports the convolvedown operation used by the surrounding class.

#### `public static BufferedImage convolvedown(BufferedImage img, Coord tsz, Convolution filter)`
- Role: Performs convolvedown.
- Description: Supports the convolvedown operation used by the surrounding class.

#### `public static WritableRaster convolveup(Raster in, Coord tsz, Convolution filter)`
- Role: Performs convolveup.
- Description: Supports the convolveup operation used by the surrounding class.

#### `public static BufferedImage convolveup(BufferedImage img, Coord tsz, Convolution filter)`
- Role: Performs convolveup.
- Description: Supports the convolveup operation used by the surrounding class.

#### `public static WritableRaster convolve(Raster img, Coord tsz, Convolution filter)`
- Role: Performs convolve.
- Description: Supports the convolve operation used by the surrounding class.

#### `public static BufferedImage convolve(BufferedImage img, Coord tsz, Convolution filter)`
- Role: Performs convolve.
- Description: Supports the convolve operation used by the surrounding class.

#### `public static Raster uiscale(Raster img, Coord tsz)`
- Role: Performs uiscale.
- Description: Supports the uiscale operation used by the surrounding class.

#### `public static BufferedImage uiscale(BufferedImage img, Coord tsz)`
- Role: Performs uiscale.
- Description: Supports the uiscale operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
