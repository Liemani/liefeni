# Screenshooter

This file documents the responsibilities and members of `Screenshooter`.

## Meta

- Source: [Screenshooter.java](../../../src/haven/Screenshooter.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Role: Defines the shared screenurl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ComponentColorModel outcm = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]`
- Role: Defines the shared outcm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PUtils.Convolution thumbflt = new PUtils.Lanczos(3)`
- Role: Defines the shared thumbflt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ImageFormat png = new ImageFormat()`
- Role: Defines the shared png constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ImageFormat jpeg = new ImageFormat()`
- Role: Defines the shared jpeg constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final URI tgt`
- Role: Holds the tgt state.
- Description: Backs the cached state for this file.

#### `public final Shot shot`
- Role: Holds the shot state.
- Description: Backs the cached state for this file.

#### `private final TextEntry comment`
- Role: Stores the comment value.
- Description: Backs the cached state for this file.

#### `private final CheckBox decobox, pub`
- Role: Holds the pub state.
- Description: Backs the cached state for this file.

#### `private final CheckBox decobox, pub`
- Role: Holds the pub state.
- Description: Backs the cached state for this file.

#### `private Label prog`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

#### `private Coord btnc`
- Role: Stores the btnc value.
- Description: Backs the cached state for this file.

#### `private Button btn`
- Role: Holds the btn state.
- Description: Backs the cached state for this file.

#### `public final BufferedImage map, ui`
- Role: Stores the UI value.
- Description: Backs the cached state for this file.

#### `public final BufferedImage map, ui`
- Role: Stores the UI value.
- Description: Backs the cached state for this file.

#### `public final TexI mapt, uit`
- Role: Stores the uit value.
- Description: Backs the cached state for this file.

#### `public final TexI mapt, uit`
- Role: Stores the uit value.
- Description: Backs the cached state for this file.

#### `public String comment, camera`
- Role: Stores the camera value.
- Description: Backs the cached state for this file.

#### `public String comment, camera`
- Role: Stores the camera value.
- Description: Backs the cached state for this file.

#### `public boolean fsaa, fl, sdw`
- Role: Tracks the sdw flag.
- Description: Supports the sdw operation used by the surrounding class.

#### `public boolean fsaa, fl, sdw`
- Role: Tracks the sdw flag.
- Description: Supports the sdw operation used by the surrounding class.

#### `public boolean fsaa, fl, sdw`
- Role: Tracks the sdw flag.
- Description: Supports the sdw operation used by the surrounding class.

#### `private final BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `private final Shot info`
- Role: Holds the info state.
- Description: Backs the cached state for this file.

#### `private final ImageFormat fmt`
- Role: Stores the fmt value.
- Description: Backs the cached state for this file.

#### `private volatile Closeable hackint = null`
- Role: Holds the hackint state.
- Description: Backs the cached state for this file.

#### `private boolean cancelled = false`
- Role: Tracks the cancelled flag.
- Description: Supports the cancelled operation used by the surrounding class.

### Methods

#### `public Screenshooter(URI tgt, Shot shot)`
- Role: Creates a new Screenshooter instance.
- Description: Constructs the instance and initializes its default state.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public Shot(BufferedImage map, BufferedImage ui)`
- Role: Performs shot.
- Description: Supports the shot operation used by the surrounding class.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public Coord tsz()`
- Role: Performs tsz.
- Description: Supports the tsz operation used by the surrounding class.

#### `public String ctype()`
- Role: Performs ctype.
- Description: Supports the ctype operation used by the surrounding class.

#### `public void write(OutputStream out, BufferedImage img, Shot info) throws IOException`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public UploadError(String message)`
- Role: Performs upload error.
- Description: Supports the upload error operation used by the surrounding class.

#### `public Uploader(BufferedImage img, Shot info, ImageFormat fmt)`
- Role: Performs uploader.
- Description: Supports the uploader operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void setstate(String t)`
- Role: Performs setstate.
- Description: Supports the setstate operation used by the surrounding class.

#### `private BufferedImage convert(BufferedImage img)`
- Role: Performs convert.
- Description: Supports the convert operation used by the surrounding class.

#### `public void upload(BufferedImage ss, Shot info, ImageFormat fmt) throws IOException`
- Role: Handles the upload workflow.
- Description: Supports the upload operation used by the surrounding class.

#### `public void interrupt()`
- Role: Performs interrupt.
- Description: Supports the interrupt operation used by the surrounding class.

#### `public void upload()`
- Role: Performs upload.
- Description: Supports the upload operation used by the surrounding class.

#### `public static void take(GameUI gameui, URI tgt)`
- Role: Performs take.
- Description: Supports the take operation used by the surrounding class.
