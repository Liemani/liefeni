# Screenshooter

This file documents the responsibilities and members of `Screenshooter`.

## Meta

- Source: [Screenshooter.java](../../../src/haven/Screenshooter.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles screenshot capture.

## Nested Types

### ImageFormat

- Description: TODO

### Shot

- Description: TODO

### UploadError

- Description: TODO

### Uploader

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<URI> screenurl = Config.Services.var("screenurl", "")`

- Description: TODO

#### `public static final ComponentColorModel outcm = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`

- Description: TODO

#### `public static final PUtils.Convolution thumbflt = new PUtils.Lanczos(3)`

- Description: TODO

#### `public static final ImageFormat png = new ImageFormat()`

- Description: TODO

#### `public static final ImageFormat jpeg = new ImageFormat()`

- Description: TODO

### Fields

#### `public final URI tgt`

- Description: TODO

#### `public final Shot shot`

- Description: TODO

#### `private final TextEntry comment`

- Description: TODO

#### `private final CheckBox decobox, pub`

- Description: TODO

#### `private final CheckBox decobox, pub`

- Description: TODO

#### `private Label prog`

- Description: TODO

#### `private Coord btnc`

- Description: TODO

#### `private Button btn`

- Description: TODO

#### `public final BufferedImage map, ui`

- Description: TODO

#### `public final BufferedImage map, ui`

- Description: TODO

#### `public final TexI mapt, uit`

- Description: TODO

#### `public final TexI mapt, uit`

- Description: TODO

#### `public String comment, camera`

- Description: TODO

#### `public String comment, camera`

- Description: TODO

#### `public boolean fsaa, fl, sdw`

- Description: TODO

#### `public boolean fsaa, fl, sdw`

- Description: TODO

#### `public boolean fsaa, fl, sdw`

- Description: TODO

#### `private final BufferedImage img`

- Description: TODO

#### `private final Shot info`

- Description: TODO

#### `private final ImageFormat fmt`

- Description: TODO

#### `private volatile Closeable hackint = null`

- Description: TODO

#### `private boolean cancelled = false`

- Description: TODO

### Methods

#### `public Screenshooter(URI tgt, Shot shot)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public Shot(BufferedImage map, BufferedImage ui)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `public Coord tsz()`

- Description: TODO

#### `public String ctype()`

- Description: TODO

#### `public void write(OutputStream out, BufferedImage img, Shot info) throws IOException`

- Description: TODO

#### `public UploadError(String message)`

- Description: TODO

#### `public Uploader(BufferedImage img, Shot info, ImageFormat fmt)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `private void setstate(String t)`

- Description: TODO

#### `private BufferedImage convert(BufferedImage img)`

- Description: TODO

#### `public void upload(BufferedImage ss, Shot info, ImageFormat fmt) throws IOException`

- Description: TODO

#### `public void interrupt()`

- Description: TODO

#### `public void upload()`

- Description: TODO

#### `public static void take(GameUI gameui, URI tgt)`

- Description: TODO
