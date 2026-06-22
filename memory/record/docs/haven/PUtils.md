---
source: [PUtils.java](../../../../src/haven/PUtils.java)
created: 2026-06-13
updated: 2026-06-14
---

# PUtils

Represents the putils Haven component.

## Nested Types

### BlurFurn

- Role: Wraps a text foundry with blur rendering.
- Description: Adds a blur filter around the rendered text image.

### Convolution

- Role: Defines a blur kernel.
- Description: Applies a weighted neighborhood filter to image data.

### Hamming

- Role: Implements a Hamming blur kernel.
- Description: Uses a Hamming window to generate smoothed pixels.

### Hanning

- Role: Implements a Hanning blur kernel.
- Description: Uses a Hanning window to generate smoothed pixels.

### Lanczos

- Role: Implements a Lanczos blur kernel.
- Description: Uses the Lanczos filter for sharper resampling.

### TexFurn

- Role: Renders text into a texture-backed image.
- Description: Wraps a `Text.Foundry` so text can be drawn as textured UI output.

## Members

### Constants

#### `public static final ComponentColorModel cm_rgb = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`
- Role: Implements the cm rgb operation.
- Description: Implements the get instance operation.
- Value: `new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`

#### `public static final ComponentColorModel cm_rgba = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`
- Role: Implements the cm rgba operation.
- Description: Implements the get instance operation.
- Value: `new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`

#### `public static final Convolution box = new Convolution()`
- Role: Implements the box operation.
- Description: Implements the convolution operation.
- Value: `new Convolution()`

#### `private static final Convolution uifilter = new Lanczos(3)`
- Role: Implements the uifilter operation.
- Description: Implements the lanczos operation.
- Value: `new Lanczos(3)`

### Fields

#### `public final int grad, brad`
- Role: Caches the brad value.
- Description: Caches the `brad` value for reuse.

#### `public final int grad, brad`
- Role: Caches the brad value.
- Description: Caches the `brad` value for reuse.

#### `public final Color col`
- Role: Caches the col value.
- Description: Caches the `col` value for reuse.

#### `public final BufferedImage tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `private final double sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private final double sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private final double sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

### Methods

#### `public static Coord imgsz(BufferedImage img)`
- Role: Handles the imgsz path.
- Description: Implements the imgsz operation.

#### `public static Coord imgsz(Raster img)`
- Role: Handles the imgsz path.
- Description: Implements the imgsz operation.

#### `public static WritableRaster byteraster(Coord sz, int bands)`
- Role: Handles the byteraster path.
- Description: Implements the byteraster operation.

#### `public static WritableRaster alpharaster(Coord sz)`
- Role: Handles the alpharaster path.
- Description: Implements the alpharaster operation.

#### `public static WritableRaster imgraster(Coord sz)`
- Role: Handles the imgraster path.
- Description: Implements the imgraster operation.

#### `public static WritableRaster copy(Raster src)`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public static BufferedImage copy(BufferedImage src)`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public static BufferedImage rasterimg(WritableRaster img)`
- Role: Handles the rasterimg path.
- Description: Implements the rasterimg operation.

#### `public static BufferedImage coercergba(BufferedImage img, boolean copy)`
- Role: Handles the coercergba path.
- Description: Implements the coercergba operation.

#### `public static BufferedImage coercergba(BufferedImage img)`
- Role: Handles the coercergba path.
- Description: Implements the coercergba operation.

#### `public static Area alphabounds(Raster img, int thres)`
- Role: Handles the alphabounds path.
- Description: Implements the alphabounds operation.

#### `public static Area alphabounds(BufferedImage img, int thres)`
- Role: Handles the alphabounds path.
- Description: Implements the alphabounds operation.

#### `public static WritableRaster imggrow(WritableRaster img, int rad)`
- Role: Handles the imggrow path.
- Description: Implements the imggrow operation.

#### `public static WritableRaster imgblur(WritableRaster img, int rad, double var)`
- Role: Handles the imgblur path.
- Description: Implements the imgblur operation.

#### `public static WritableRaster alphadraw(WritableRaster dst, Raster alpha, Coord ul, Color col)`
- Role: Handles the alphadraw path.
- Description: Implements the alphadraw operation.

#### `public static WritableRaster blit(WritableRaster dst, Raster src, Coord off)`
- Role: Handles the blit path.
- Description: Implements the blit operation.

#### `public static WritableRaster gayblit(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff)`
- Role: Handles the gayblit path.
- Description: Implements the gayblit operation.

#### `public static WritableRaster alphablit(WritableRaster dst, Raster src, Coord off)`
- Role: Handles the alphablit path.
- Description: Implements the alphablit operation.

#### `public static WritableRaster blendblit(WritableRaster dst, Raster src, Coord off, int a)`
- Role: Handles the blendblit path.
- Description: Implements the blendblit operation.

#### `public static WritableRaster tilemod(WritableRaster dst, Raster tile, Coord off)`
- Role: Handles the tilemod path.
- Description: Implements the tilemod operation.

#### `public static WritableRaster colmul(WritableRaster img, Color col)`
- Role: Handles the colmul path.
- Description: Implements the colmul operation.

#### `public static WritableRaster copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband, Coord soff, Coord sz)`
- Role: Handles the copyband path.
- Description: Implements the copyband operation.

#### `public static WritableRaster copyband(WritableRaster dst, int dband, Coord doff, Raster src, int sband)`
- Role: Handles the copyband path.
- Description: Implements the copyband operation.

#### `public static WritableRaster copyband(WritableRaster dst, int dband, Raster src, int sband)`
- Role: Handles the copyband path.
- Description: Implements the copyband operation.

#### `public static WritableRaster blurmask(Raster img, int grad, int brad, Color col)`
- Role: Handles the blurmask path.
- Description: Implements the blurmask operation.

#### `public static WritableRaster blurmask2(Raster img, int grad, int brad, Color col)`
- Role: Handles the blurmask2 path.
- Description: Implements the blurmask2 operation.

#### `public static WritableRaster glowmask(Raster img)`
- Role: Handles the glowmask path.
- Description: Implements the glowmask operation.

#### `public static BufferedImage glowmask(Raster img, int grad, Color col)`
- Role: Handles the glowmask path.
- Description: Implements the glowmask operation.

#### `public BlurFurn(Text.Forge bk, int grad, int brad, Color col)`
- Role: Handles the blur furn path.
- Description: Implements the blur furn operation.

#### `public BlurFurn(Text.Furnace bk, int grad, int brad, Color col)`
- Role: Handles the blur furn path.
- Description: Implements the blur furn operation.

#### `public BufferedImage proc(Text.Slug text)`
- Role: Handles the proc path.
- Description: Implements the proc operation.

#### `public Coord tloff()`
- Role: Handles the tloff path.
- Description: Implements the tloff operation.

#### `public Coord broff()`
- Role: Handles the broff path.
- Description: Implements the broff operation.

#### `public TexFurn(Text.Forge bk, BufferedImage tex)`
- Role: Handles the texture furn path.
- Description: Implements the tex furn operation.

#### `public TexFurn(Text.Furnace bk, BufferedImage tex)`
- Role: Handles the texture furn path.
- Description: Implements the tex furn operation.

#### `public BufferedImage proc(Text.Slug text)`
- Role: Handles the proc path.
- Description: Implements the proc operation.

#### `public Coord tloff()`
- Role: Handles the tloff path.
- Description: Implements the tloff operation.

#### `public Coord broff()`
- Role: Handles the broff path.
- Description: Implements the broff operation.

#### `public static void dumpband(Raster img, int band)`
- Role: Handles the dumpband path.
- Description: Implements the dumpband operation.

#### `public static BufferedImage monochromize(BufferedImage img, Color col)`
- Role: Handles the monochromize path.
- Description: Implements the monochromize operation.

#### `public double cval(double td)`
- Role: Handles the cval path.
- Description: Implements the cval operation.

#### `public double support()`
- Role: Handles the support path.
- Description: Implements the support operation.

#### `public Hanning(double sz)`
- Role: Handles the hanning path.
- Description: Implements the hanning operation.

#### `public double cval(double td)`
- Role: Handles the cval path.
- Description: Implements the cval operation.

#### `public double support()`
- Role: Handles the support path.
- Description: Implements the support operation.

#### `public Hamming(double sz)`
- Role: Handles the hamming path.
- Description: Implements the hamming operation.

#### `public double cval(double td)`
- Role: Handles the cval path.
- Description: Implements the cval operation.

#### `public double support()`
- Role: Handles the support path.
- Description: Implements the support operation.

#### `public Lanczos(double sz)`
- Role: Handles the lanczos path.
- Description: Implements the lanczos operation.

#### `public double cval(double td)`
- Role: Handles the cval path.
- Description: Implements the cval operation.

#### `public double support()`
- Role: Handles the support path.
- Description: Implements the support operation.

#### `public static WritableRaster convolvedown(Raster in, Coord tsz, Convolution filter)`
- Role: Handles the convolvedown path.
- Description: Implements the convolvedown operation.

#### `public static BufferedImage convolvedown(BufferedImage img, Coord tsz, Convolution filter)`
- Role: Handles the convolvedown path.
- Description: Implements the convolvedown operation.

#### `public static WritableRaster convolveup(Raster in, Coord tsz, Convolution filter)`
- Role: Handles the convolveup path.
- Description: Implements the convolveup operation.

#### `public static BufferedImage convolveup(BufferedImage img, Coord tsz, Convolution filter)`
- Role: Handles the convolveup path.
- Description: Implements the convolveup operation.

#### `public static WritableRaster convolve(Raster img, Coord tsz, Convolution filter)`
- Role: Handles the convolve path.
- Description: Implements the convolve operation.

#### `public static BufferedImage convolve(BufferedImage img, Coord tsz, Convolution filter)`
- Role: Handles the convolve path.
- Description: Implements the convolve operation.

#### `public static Raster uiscale(Raster img, Coord tsz)`
- Role: Handles the uiscale path.
- Description: Implements the uiscale operation.

#### `public static BufferedImage uiscale(BufferedImage img, Coord tsz)`
- Role: Handles the uiscale path.
- Description: Implements the uiscale operation.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.