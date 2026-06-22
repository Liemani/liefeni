---
source: [Text.java](../../../../src/haven/Text.java)
created: 2026-06-13
updated: 2026-06-14
---

# Text

Represents the text Haven component.

## Nested Types

### Forge

- Role: Base text renderer abstraction.
- Description: Exposes rendering, sizing, and height operations for text-producing helpers.

### Foundry

- Role: Font-backed text renderer.
- Description: Builds single-line text, wrapped text, and size metrics from a configured font.

### Furnace

- Role: Minimal renderer facade that returns `Text`.
- Description: Wraps a string rendering implementation that does not expose line metrics.

### Line

- Role: Represents one rendered line of text.
- Description: Stores the bitmap and font metrics needed to measure and place the line.

### OSlug

- Role: Represents an offset-aware rendered slug.
- Description: Renders text with an x-offset while preserving line-metric behavior.

### OffsetForge

- Role: Builds a text renderer that can shift glyph output horizontally.
- Description: Produces `OSlug` instances instead of plain `Line` output.

### Slug

- Role: Abstract rendered text with measurement support.
- Description: Extends `Text` with baseline, advance, and hit-testing operations.

### UText

- Role: Lazy text provider.
- Description: Holds a value supplier and exposes it as an `Indir<Text>`.

## Members

### Constants

#### `public static final Font serif = new Font("Serif", Font.PLAIN, 10)`
- Role: Implements the serif operation.
- Description: Implements the font operation.
- Value: `new Font("Serif", Font.PLAIN, 10)`

#### `public static final Font sans = new Font("Sans", Font.PLAIN, 10)`
- Role: Implements the sans operation.
- Description: Implements the font operation.
- Value: `new Font("Sans", Font.PLAIN, 10)`

#### `public static final Font mono = new Font("Monospaced", Font.PLAIN, 10)`
- Role: Implements the mono operation.
- Description: Implements the font operation.
- Value: `new Font("Monospaced", Font.PLAIN, 10)`

#### `public static final Font fraktur = Resource.local().loadwait("ui/fraktur").flayer(Resource.Font.class).font`
- Role: Implements the fraktur operation.
- Description: Implements the flayer operation.
- Value: `Resource.local().loadwait("ui/fraktur").flayer(Resource.Font.class).font`

#### `public static final Font dfont = sans`
- Role: Caches the dfont value.
- Description: Caches the `dfont` value for reuse.
- Value: `sans`

#### `public static final Foundry std`
#### `public static final Foundry std`
- Role: Caches the std value.
- Description: Caches the `std` value for reuse.

#### `public static final Color black = Color.BLACK`
- Role: Caches the black value.
- Description: Caches the `black` value for reuse.
- Value: `Color.BLACK`

#### `public static final Color white = Color.WHITE`
- Role: Caches the white value.
- Description: Caches the `white` value for reuse.
- Value: `Color.WHITE`

### Fields

#### `public final BufferedImage img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `public final String text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `private Tex tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `private final FontMetrics m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

#### `private FontMetrics m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

#### `public final Font font`
- Role: Caches the font value.
- Description: Caches the `font` value for reuse.

#### `public final Color defcol`
- Role: Caches the defcol value.
- Description: Caches the `defcol` value for reuse.

#### `public boolean aa = false`
- Role: Tracks the aa flag.
- Description: Caches the `aa` value for reuse.

#### `private RichText.Foundry wfnd = null`
- Role: Caches the wfnd value.
- Description: Caches the `wfnd` value for reuse.

#### `public final Forge back`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

#### `public final Slug bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public final Furnace fnd`
- Role: Caches the fnd value.
- Description: Caches the `fnd` value for reuse.

#### `private Text cur = null`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `private T cv = null`
- Role: Caches the cv value.
- Description: Caches the `cv` value for reuse.

### Methods

#### `public Slug(String text, BufferedImage img)`
- Role: Handles the slug path.
- Description: Implements the slug operation.

#### `public abstract int baseline()`
- Role: Handles the baseline path.
- Description: Implements the baseline operation.

#### `public abstract int advance(int pos)`
- Role: Handles the advance path.
- Description: Implements the advance operation.

#### `public abstract int charat(int x)`
- Role: Handles the charat path.
- Description: Implements the charat operation.

#### `private Line(String text, BufferedImage img, FontMetrics m)`
- Role: Handles the line path.
- Description: Implements the line operation.

#### `public Coord base()`
- Role: Handles the base path.
- Description: Implements the base operation.

#### `public int baseline()`
- Role: Handles the baseline path.
- Description: Implements the baseline operation.

#### `public int advance(int pos)`
- Role: Handles the advance path.
- Description: Implements the advance operation.

#### `public int charat(int x)`
- Role: Handles the charat path.
- Description: Implements the charat operation.

#### `public static int[] findspaces(String text)`
- Role: Handles the findspaces path.
- Description: Finds the spaces.

#### `public abstract Text render(String text)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public Text renderf(String fmt, Object... args)`
- Role: Handles the renderf path.
- Description: Renders the f.

#### `public abstract Slug render(String text)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public abstract int height()`
- Role: Handles the height path.
- Description: Implements the height operation.

#### `public abstract Coord strsize(String text)`
- Role: Handles the strsize path.
- Description: Implements the strsize operation.

#### `public Foundry(Font f, Color defcol)`
- Role: Handles the foundry path.
- Description: Implements the foundry operation.

#### `public Foundry(Font f)`
- Role: Handles the foundry path.
- Description: Implements the foundry operation.

#### `public Foundry(Font font, int psz, Color defcol)`
- Role: Handles the foundry path.
- Description: Implements the foundry operation.

#### `public Foundry(Font font, int psz)`
- Role: Handles the foundry path.
- Description: Implements the foundry operation.

#### `public Foundry aa(boolean aa)`
- Role: Handles the aa path.
- Description: Implements the aa operation.

#### `public int height()`
- Role: Handles the height path.
- Description: Implements the height operation.

#### `public Coord strsize(String text)`
- Role: Handles the strsize path.
- Description: Implements the strsize operation.

#### `public Text renderwrap(String text, Color c, int width)`
- Role: Handles the renderwrap path.
- Description: Renders the wrap.

#### `public Text renderwrap(String text, int width)`
- Role: Handles the renderwrap path.
- Description: Renders the wrap.

#### `public Line render(String text, Color c)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public Line render(String text)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public Line ellipsize(String text, int w, String e)`
- Role: Handles the ellipsize path.
- Description: Implements the ellipsize operation.

#### `public Line ellipsize(String text, int w)`
- Role: Handles the ellipsize path.
- Description: Implements the ellipsize operation.

#### `public static Font fontpxsz(Font font, int pxsz)`
- Role: Handles the fontpxsz path.
- Description: Implements the fontpxsz operation.

#### `public OffsetForge(Forge back)`
- Role: Handles the offset forge path.
- Description: Implements the offset forge operation.

#### `protected abstract BufferedImage proc(Slug text)`
- Role: Handles the proc path.
- Description: Implements the proc operation.

#### `protected abstract Coord tloff()`
- Role: Handles the tloff path.
- Description: Implements the tloff operation.

#### `protected abstract Coord broff()`
- Role: Handles the broff path.
- Description: Implements the broff operation.

#### `private OSlug(Slug bk, BufferedImage img)`
- Role: Handles the oslug path.
- Description: Implements the o slug operation.

#### `public int baseline()`
- Role: Handles the baseline path.
- Description: Implements the baseline operation.

#### `public int advance(int pos)`
- Role: Handles the advance path.
- Description: Implements the advance operation.

#### `public int charat(int x)`
- Role: Handles the charat path.
- Description: Implements the charat operation.

#### `public Slug render(String text)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public int height()`
- Role: Handles the height path.
- Description: Implements the height operation.

#### `public Coord strsize(String text)`
- Role: Handles the strsize path.
- Description: Implements the strsize operation.

#### `public static OffsetForge of(Forge back, Coord tloff, Coord broff, Function<? super Slug, ? extends BufferedImage> prod)`
- Role: Builds a Text value from the supplied components.
- Description: Builds a Text value from the supplied components.

#### `public UText(Furnace fnd)`
- Role: Handles the utext path.
- Description: Implements the u text operation.

#### `protected Text render(String text)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `protected String text(T value)`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `protected abstract T value()`
- Role: Handles the value path.
- Description: Implements the value operation.

#### `public Text get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Indir<Tex> tex()`
- Role: Handles the texture path.
- Description: Implements the tex operation.

#### `public static UText forfield(Furnace fnd, final Object obj, String fn)`
- Role: Handles the forfield path.
- Description: Implements the forfield operation.

#### `public static UText forfield(Object obj, String fn)`
- Role: Handles the forfield path.
- Description: Implements the forfield operation.

#### `public static <T> UText<T> of(Furnace fnd, Supplier<? extends T> val, Function<? super T, String> fmt)`
- Role: Builds a Text value from the supplied components.
- Description: Builds a Text value from the supplied components.

#### `public static <T> UText<T> of(Furnace fnd, Supplier<T> val)`
- Role: Builds a Text value from the supplied components.
- Description: Builds a Text value from the supplied components.

#### `protected Text(String text, BufferedImage img)`
- Role: Creates a new Text instance.
- Description: Constructs the Text instance from the supplied inputs.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public static Line render(String text, Color c)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public static Line renderf(Color c, String text, Object... args)`
- Role: Handles the renderf path.
- Description: Renders the f.

#### `public static Line render(String text)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public Tex tex()`
- Role: Handles the texture path.
- Description: Implements the tex operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.