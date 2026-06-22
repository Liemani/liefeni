---
source: [Screenshooter.java](../../../../src/haven/Screenshooter.java)
created: 2026-06-13
updated: 2026-06-14
---

# Screenshooter

Represents the screenshooter Haven component.

## Nested Types

### ImageFormat

- Role: Represents image format within Screenshooter.
- Description: Describes the nested image format type used by the enclosing class.

### Shot

- Role: Represents shot within Screenshooter.
- Description: Describes the nested shot type used by the enclosing class.

### UploadError

- Role: Represents upload error within Screenshooter.
- Description: Describes the nested upload error type used by the enclosing class.

### Uploader

- Role: Represents uploader within Screenshooter.
- Description: Describes the nested uploader type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<URI> screenurl = Config.Services.var("screenurl", "")`
- Role: Implements the screenurl operation.
- Description: Implements the var operation.
- Value: `Config.Services.var("screenurl", "")`

#### `public static final ComponentColorModel outcm = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`
- Role: Implements the outcm operation.
- Description: Implements the get instance operation.
- Value: `new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`

#### `public static final PUtils.Convolution thumbflt = new PUtils.Lanczos(3)`
- Role: Implements the thumbflt operation.
- Description: Implements the lanczos operation.
- Value: `new PUtils.Lanczos(3)`

#### `public static final ImageFormat png = new ImageFormat()`
- Role: Implements the png operation.
- Description: Implements the image format operation.
- Value: `new ImageFormat()`

#### `public static final ImageFormat jpeg = new ImageFormat()`
- Role: Implements the jpeg operation.
- Description: Implements the image format operation.
- Value: `new ImageFormat()`

### Fields

#### `public final URI tgt`
- Role: Caches the tgt value.
- Description: Stores the widget that accepted the hover event.

#### `public final Shot shot`
- Role: Caches the shot value.
- Description: Caches the `shot` value for reuse.

#### `private final TextEntry comment`
- Role: Caches the comment value.
- Description: Caches the `comment` value for reuse.

#### `private final CheckBox decobox, pub`
- Role: Caches the pub value.
- Description: Caches the `pub` value for reuse.

#### `private final CheckBox decobox, pub`
- Role: Caches the pub value.
- Description: Caches the `pub` value for reuse.

#### `private Label prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `private Coord btnc`
- Role: Caches the btnc value.
- Description: Caches the `btnc` value for reuse.

#### `private Button btn`
- Role: Caches the btn value.
- Description: Caches the `btn` value for reuse.

#### `public final BufferedImage map, ui`
- Role: Caches the active Haven UI instance.
- Description: Caches the active Haven UI instance.

#### `public final BufferedImage map, ui`
- Role: Caches the active Haven UI instance.
- Description: Caches the active Haven UI instance.

#### `public final TexI mapt, uit`
- Role: Caches the uit value.
- Description: Caches the `uit` value for reuse.

#### `public final TexI mapt, uit`
- Role: Caches the uit value.
- Description: Caches the `uit` value for reuse.

#### `public String comment, camera`
- Role: Caches the camera value.
- Description: Caches the `camera` value for reuse.

#### `public String comment, camera`
- Role: Caches the camera value.
- Description: Caches the `camera` value for reuse.

#### `public boolean fsaa, fl, sdw`
- Role: Tracks the sdw flag.
- Description: Caches the `sdw` value for reuse.

#### `public boolean fsaa, fl, sdw`
- Role: Tracks the sdw flag.
- Description: Caches the `sdw` value for reuse.

#### `public boolean fsaa, fl, sdw`
- Role: Tracks the sdw flag.
- Description: Caches the `sdw` value for reuse.

#### `private final BufferedImage img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `private final Shot info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `private final ImageFormat fmt`
- Role: Caches the fmt value.
- Description: Caches the `fmt` value for reuse.

#### `private volatile Closeable hackint = null`
- Role: Caches the hackint value.
- Description: Caches the `hackint` value for reuse.

#### `private boolean cancelled = false`
- Role: Tracks the cancelled flag.
- Description: Caches the `cancelled` value for reuse.

### Methods

#### `public Screenshooter(URI tgt, Shot shot)`
- Role: Creates a new Screenshooter instance.
- Description: Constructs the Screenshooter instance from the supplied inputs.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.

#### `public Shot(BufferedImage map, BufferedImage ui)`
- Role: Handles the shot path.
- Description: Implements the shot operation.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public Coord tsz()`
- Role: Handles the tsz path.
- Description: Implements the tsz operation.

#### `public String ctype()`
- Role: Handles the ctype path.
- Description: Implements the ctype operation.

#### `public void write(OutputStream out, BufferedImage img, Shot info) throws IOException`
- Role: Writes the target data.
- Description: Implements the write operation.

#### `public UploadError(String message)`
- Role: Handles the upload error path.
- Description: Implements the upload error operation.

#### `public Uploader(BufferedImage img, Shot info, ImageFormat fmt)`
- Role: Handles the uploader path.
- Description: Implements the uploader operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private void setstate(String t)`
- Role: Handles the setstate path.
- Description: Updates the state.

#### `private BufferedImage convert(BufferedImage img)`
- Role: Handles the convert path.
- Description: Implements the convert operation.

#### `public void upload(BufferedImage ss, Shot info, ImageFormat fmt) throws IOException`
- Role: Handles the upload workflow.
- Description: Implements the upload operation.

#### `public void interrupt()`
- Role: Handles the interrupt path.
- Description: Implements the interrupt operation.

#### `public void upload()`
- Role: Handles the upload path.
- Description: Implements the upload operation.

#### `public static void take(GameUI gameui, URI tgt)`
- Role: Handles the take path.
- Description: Implements the take operation.