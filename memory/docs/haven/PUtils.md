# PUtils

This file documents the responsibilities and members of `PUtils`.

## Meta

- Source: [PUtils.java](../../../src/haven/PUtils.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides packet or protocol utilities.

## Nested Types

### BlurFurn

- Description: TODO

### Convolution

- Description: TODO

### Hamming

- Description: TODO

### Hanning

- Description: TODO

### Lanczos

- Description: TODO

### TexFurn

- Description: TODO

## Members

### Constants

#### `public static final ComponentColorModel cm_rgb = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`

- Description: TODO

#### `public static final ComponentColorModel cm_rgba = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`

- Description: TODO

#### `public static final Convolution box = new Convolution()`

- Description: TODO

#### `private static final Convolution uifilter = new Lanczos(3)`

- Description: TODO

### Fields

#### `public final int grad, brad`

- Description: TODO

#### `public final int grad, brad`

- Description: TODO

#### `public final Color col`

- Description: TODO

#### `public final BufferedImage tex`

- Description: TODO

#### `private final double sz`

- Description: TODO

#### `private final double sz`

- Description: TODO

#### `private final double sz`

- Description: TODO

### Methods

#### `public static Coord imgsz(BufferedImage img)`

- Description: TODO

#### `public static Coord imgsz(Raster img)`

- Description: TODO

#### `public static WritableRaster byteraster(Coord sz, int bands)`

- Description: TODO

#### `public static WritableRaster alpharaster(Coord sz)`

- Description: TODO

#### `public static WritableRaster imgraster(Coord sz)`

- Description: TODO

#### `public static WritableRaster copy(Raster src)`

- Description: TODO

#### `public static BufferedImage copy(BufferedImage src)`

- Description: TODO

#### `public static BufferedImage rasterimg(WritableRaster img)`

- Description: TODO

#### `public static BufferedImage coercergba(BufferedImage img, boolean copy)`

- Description: TODO

#### `public static BufferedImage coercergba(BufferedImage img)`

- Description: TODO

#### `public static Area alphabounds(Raster img, int thres)`

- Description: TODO

#### `public static Area alphabounds(BufferedImage img, int thres)`

- Description: TODO

#### `public static WritableRaster imggrow(WritableRaster img, int rad)`

- Description: TODO

#### `public static WritableRaster imgblur(WritableRaster img, int rad, double var)`

- Description: TODO

#### `public static WritableRaster alphadraw(WritableRaster dst, Raster alpha, Coord ul, Color col)`

- Description: TODO

#### `public static WritableRaster blit(WritableRaster dst, Raster src, Coord off)`

- Description: TODO

#### `public static WritableRaster gayblit(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff)`

- Description: TODO

#### `public static WritableRaster alphablit(WritableRaster dst, Raster src, Coord off)`

- Description: TODO

#### `public static WritableRaster blendblit(WritableRaster dst, Raster src, Coord off, int a)`

- Description: TODO

#### `public static WritableRaster tilemod(WritableRaster dst, Raster tile, Coord off)`

- Description: TODO

#### `public static WritableRaster colmul(WritableRaster img, Color col)`

- Description: TODO

#### `public static WritableRaster copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff, Coord sz)`

- Description: TODO

#### `public static WritableRaster copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband)`

- Description: TODO

#### `public static WritableRaster copyband(WritableRaster dst, int dband, Raster src, int sband)`

- Description: TODO

#### `public static WritableRaster blurmask(Raster img, int grad, int brad, Color col)`

- Description: TODO

#### `public static WritableRaster blurmask2(Raster img, int grad, int brad, Color col)`

- Description: TODO

#### `public static WritableRaster glowmask(Raster img)`

- Description: TODO

#### `public static BufferedImage glowmask(Raster img, int grad, Color col)`

- Description: TODO

#### `public BlurFurn(Text.Forge bk, int grad, int brad, Color col)`

- Description: TODO

#### `public BlurFurn(Text.Furnace bk, int grad, int brad, Color col)`

- Description: TODO

#### `public BufferedImage proc(Text.Slug text)`

- Description: TODO

#### `public Coord tloff()`

- Description: TODO

#### `public Coord broff()`

- Description: TODO

#### `public TexFurn(Text.Forge bk, BufferedImage tex)`

- Description: TODO

#### `public TexFurn(Text.Furnace bk, BufferedImage tex)`

- Description: TODO

#### `public BufferedImage proc(Text.Slug text)`

- Description: TODO

#### `public Coord tloff()`

- Description: TODO

#### `public Coord broff()`

- Description: TODO

#### `public static void dumpband(Raster img, int band)`

- Description: TODO

#### `public static BufferedImage monochromize(BufferedImage img, Color col)`

- Description: TODO

#### `public double cval(double td)`

- Description: TODO

#### `public double support()`

- Description: TODO

#### `public Hanning(double sz)`

- Description: TODO

#### `public double cval(double td)`

- Description: TODO

#### `public double support()`

- Description: TODO

#### `public Hamming(double sz)`

- Description: TODO

#### `public double cval(double td)`

- Description: TODO

#### `public double support()`

- Description: TODO

#### `public Lanczos(double sz)`

- Description: TODO

#### `public double cval(double td)`

- Description: TODO

#### `public double support()`

- Description: TODO

#### `public static WritableRaster convolvedown(Raster in, Coord tsz, Convolution filter)`

- Description: TODO

#### `public static BufferedImage convolvedown(BufferedImage img, Coord tsz, Convolution filter)`

- Description: TODO

#### `public static WritableRaster convolveup(Raster in, Coord tsz, Convolution filter)`

- Description: TODO

#### `public static BufferedImage convolveup(BufferedImage img, Coord tsz, Convolution filter)`

- Description: TODO

#### `public static WritableRaster convolve(Raster img, Coord tsz, Convolution filter)`

- Description: TODO

#### `public static BufferedImage convolve(BufferedImage img, Coord tsz, Convolution filter)`

- Description: TODO

#### `public static Raster uiscale(Raster img, Coord tsz)`

- Description: TODO

#### `public static BufferedImage uiscale(BufferedImage img, Coord tsz)`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO
