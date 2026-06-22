---
source: [RichText.java](../../../../src/haven/RichText.java)
created: 2026-06-13
updated: 2026-06-14
---

# RichText

Represents the rich text Haven component.

## Nested Types

### Document

- Role: Represents one rich-text document.
- Description: Renderable document wrapper that stores parsed rich-text parts and layout state.

### FormatException

- Role: Signals malformed rich-text markup.
- Description: Runtime exception thrown when the parser encounters invalid rich-text syntax.

### Foundry

- Role: Configures rich-text rendering.
- Description: Builder that parses markup into a Document using a prepared parser setup.

### Image

- Role: Embeds an image inside rich text.
- Description: Inline rich-text part that renders a source image.

### ImageSource

- Role: Supplies images for inline rich text.
- Description: Interface for lazy image providers used by the rich-text parser.

### Newline

- Role: Represents a forced line break.
- Description: Rich-text part that advances the layout to the next line.

### PState

- Role: Tracks parser state.
- Description: Parser state wrapper used while interpreting markup and attributes.

### Parser

- Role: Parses rich-text markup.
- Description: Base parser that turns markup text into a structured rich-text document.

### Part

- Role: Base class for rich-text parts.
- Description: Abstract element in the parsed rich-text tree.

### RState

- Role: Tracks rendering state.
- Description: Render-time state carried while laying out rich-text parts.

### TextPart

- Role: Renders a text run.
- Description: Concrete rich-text part for plain text content and attributes.

## Members

### Constants

#### `public static final Attribute IMAGESRC = new Attribute("image-source")`
- Role: Implements the imagesrc operation.
- Description: Implements the attribute operation.
- Value: `new Attribute("image-source")`

#### `public static final Parser std`
#### `public static final Parser std`
- Role: Caches the std value.
- Description: Caches the `std` value for reuse.

#### `public static final Foundry stdf`
#### `public static final Foundry stdf`
- Role: Caches the stdf value.
- Description: Caches the `stdf` value for reuse.

#### `public static final ImageSource legacy = new ImageSource()`
- Role: Implements the legacy operation.
- Description: Implements the image source operation.
- Value: `new ImageSource()`

### Fields

#### `public final Part parts`
- Role: Caches the parts value.
- Description: Caches the `parts` value for reuse.

#### `FontRenderContext frc`
- Role: Caches the frc value.
- Description: Caches the `frc` value for reuse.

#### `public Part next = null`
- Role: Caches the next value.
- Description: Caches the `next` value for reuse.

#### `public int x, y`
- Role: Caches the y value.
- Description: Caches the `y` value for reuse.

#### `public int x, y`
- Role: Caches the y value.
- Description: Caches the `y` value for reuse.

#### `public RState rs`
- Role: Caches the rs value.
- Description: Caches the `rs` value for reuse.

#### `public BufferedImage img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `public int h = -1`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `public double lh = -1, bh = -1`
- Role: Caches the lh value.
- Description: Caches the `lh` value for reuse.

#### `public double lh = -1, bh = -1`
- Role: Caches the lh value.
- Description: Caches the `lh` value for reuse.

#### `public Map<? extends Attribute, ?> attrs`
- Role: Caches the attrs value.
- Description: Caches the `attrs` value for reuse.

#### `public float imgscale = 1.0f`
- Role: Caches the imgscale value.
- Description: Caches the `imgscale` value for reuse.

#### `private Coord sz = null`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private Map<? extends Attribute, ?> attrs`
- Role: Caches the attrs value.
- Description: Caches the `attrs` value for reuse.

#### `private LineMetrics lm`
- Role: Caches the lm value.
- Description: Caches the `lm` value for reuse.

#### `public AttributedString str`
- Role: Caches the str value.
- Description: Caches the `str` value for reuse.

#### `public int start, end`
- Role: Caches the end value.
- Description: Caches the `end` value for reuse.

#### `public int start, end`
- Role: Caches the end value.
- Description: Caches the `end` value for reuse.

#### `private TextMeasurer tm = null`
- Role: Caches the tm value.
- Description: Caches the `tm` value for reuse.

#### `private TextLayout tl = null`
- Role: Caches the tl value.
- Description: Caches the `tl` value for reuse.

#### `public final String text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `public final Map<? extends Attribute, ?> attrs`
- Role: Caches the attrs value.
- Description: Caches the `attrs` value for reuse.

#### `private final Map<? extends Attribute, ?> defattrs`
- Role: Caches the defattrs value.
- Description: Caches the `defattrs` value for reuse.

#### `PeekReader in`
- Role: Caches the in value.
- Description: Caches the `in` value for reuse.

#### `public boolean aa = false`
- Role: Tracks the aa flag.
- Description: Caches the `aa` value for reuse.

#### `private final Parser parser`
- Role: Caches the parser value.
- Description: Caches the `parser` value for reuse.

#### `private final RState rs`
- Role: Caches the rs value.
- Description: Caches the `rs` value for reuse.

### Methods

#### `private RichText(String text, BufferedImage img, Part parts)`
- Role: Creates a new RichText instance.
- Description: Constructs the RichText instance from the supplied inputs.

#### `RState(FontRenderContext frc)`
- Role: Handles the rstate workflow.
- Description: Implements the r state operation.

#### `public FormatException(String msg)`
- Role: Implements the format exception operation.
- Description: Implements the format exception operation.

#### `public void append(Part p)`
- Role: Implements the append operation.
- Description: Implements the append operation.

#### `public void prepare(RState rs)`
- Role: Implements the prepare operation.
- Description: Implements the prepare operation.

#### `public int width()`
- Role: Implements the width operation.
- Description: Implements the width operation.

#### `public int height()`
- Role: Implements the height operation.
- Description: Implements the height operation.

#### `public int baseline()`
- Role: Implements the baseline operation.
- Description: Implements the baseline operation.

#### `public void render(Graphics2D g)`
- Role: Draws the rendered content.
- Description: Draws the current rich-text part into the target graphics context.

#### `public Part split(int w)`
- Role: Implements the split operation.
- Description: Implements the split operation.

#### `public Image get(String[] args, int[] ap)`
- Role: Returns the cached get.
- Description: Returns the cached get.

#### `public static ImageSource chain(ImageSource... srcs)`
- Role: Implements the chain operation.
- Description: Implements the chain operation.

#### `public static ImageSource id(String id, Supplier<? extends Image> img)`
- Role: Implements the id operation.
- Description: Implements the id operation.

#### `public static ImageSource res(Resource res)`
- Role: Implements the res operation.
- Description: Implements the res operation.

#### `public static ImageSource res(Resource.Pool pool)`
- Role: Implements the res operation.
- Description: Implements the res operation.

#### `public Image(BufferedImage img)`
- Role: Implements the image operation.
- Description: Implements the image operation.

#### `public Image(Resource.Image img)`
- Role: Implements the image operation.
- Description: Implements the image operation.

#### `public Image(Resource res, int id)`
- Role: Implements the image operation.
- Description: Implements the image operation.

#### `private LineMetrics lm()`
- Role: Implements the lm operation.
- Description: Implements the lm operation.

#### `public void prepare(RState rs)`
- Role: Implements the prepare operation.
- Description: Implements the prepare operation.

#### `public int width()`
- Role: Implements the width operation.
- Description: Implements the width operation.

#### `public int height()`
- Role: Implements the height operation.
- Description: Implements the height operation.

#### `public int baseline()`
- Role: Implements the baseline operation.
- Description: Implements the baseline operation.

#### `public void render(Graphics2D g)`
- Role: Draws the rendered content.
- Description: Draws the current rich-text part into the target graphics context.

#### `public Newline(Map<? extends Attribute, ?> attrs)`
- Role: Implements the newline operation.
- Description: Implements the newline operation.

#### `private LineMetrics lm()`
- Role: Implements the lm operation.
- Description: Implements the lm operation.

#### `public int height()`
- Role: Implements the height operation.
- Description: Implements the height operation.

#### `public int baseline()`
- Role: Implements the baseline operation.
- Description: Implements the baseline operation.

#### `public TextPart(AttributedString str, int start, int end)`
- Role: Implements the text part operation.
- Description: Implements the text part operation.

#### `public TextPart(String str, Map<? extends Attribute, ?> attrs)`
- Role: Implements the text part operation.
- Description: Implements the text part operation.

#### `public TextPart(String str)`
- Role: Implements the text part operation.
- Description: Implements the text part operation.

#### `public AttributedCharacterIterator ti()`
- Role: Implements the ti operation.
- Description: Implements the ti operation.

#### `public void append(Part p)`
- Role: Implements the append operation.
- Description: Implements the append operation.

#### `public TextMeasurer tm()`
- Role: Implements the tm operation.
- Description: Implements the tm operation.

#### `public TextLayout tl()`
- Role: Implements the tl operation.
- Description: Implements the tl operation.

#### `public float advance(int from, int to)`
- Role: Implements the advance operation.
- Description: Implements the advance operation.

#### `public int width()`
- Role: Implements the width operation.
- Description: Implements the width operation.

#### `public int height()`
- Role: Implements the height operation.
- Description: Implements the height operation.

#### `public int baseline()`
- Role: Implements the baseline operation.
- Description: Implements the baseline operation.

#### `private Part split2(int e1, int s2)`
- Role: Implements the split2 operation.
- Description: Implements the split2 operation.

#### `public Part split(int w)`
- Role: Implements the split operation.
- Description: Implements the split operation.

#### `public void render(Graphics2D g)`
- Role: Draws the rendered content.
- Description: Draws the current rich-text part into the target graphics context.

#### `public TextHitInfo charat(float x, float y)`
- Role: Implements the charat operation.
- Description: Implements the charat operation.

#### `public TextHitInfo charat(Coord c)`
- Role: Implements the charat operation.
- Description: Implements the charat operation.

#### `public Part partat(Coord c)`
- Role: Implements the partat operation.
- Description: Implements the partat operation.

#### `public AttributedCharacterIterator attrat(Coord c)`
- Role: Implements the attrat operation.
- Description: Implements the attrat operation.

#### `public Object attrat(Coord c, Attribute attr)`
- Role: Implements the attrat operation.
- Description: Implements the attrat operation.

#### `public static Map<? extends Attribute, ?> fillattrs2(Map<? extends Attribute, ?> def, Object... attrs)`
- Role: Implements the fillattrs2 operation.
- Description: Implements the fillattrs2 operation.

#### `public static Map<? extends Attribute, ?> fillattrs(Object... attrs)`
- Role: Implements the fillattrs operation.
- Description: Implements the fillattrs operation.

#### `public static Map<? extends Attribute, ?> mergeattrs(Map<? extends Attribute, ?>... parts)`
- Role: Implements the mergeattrs operation.
- Description: Implements the mergeattrs operation.

#### `public Document(String text, Map<? extends Attribute, ?> attrs)`
- Role: Implements the document operation.
- Description: Implements the document operation.

#### `public Document(String text, Object... attrs)`
- Role: Implements the document operation.
- Description: Implements the document operation.

#### `public Document(String text)`
- Role: Implements the document operation.
- Description: Implements the document operation.

#### `public static Document respag(Indir<Resource> res)`
- Role: Implements the respag operation.
- Description: Implements the respag operation.

#### `private static Map<? extends Attribute, ?> fixattrs(Map<? extends Attribute, ?> attrs)`
- Role: Implements the fixattrs operation.
- Description: Implements the fixattrs operation.

#### `public Parser(Map<? extends Attribute, ?> defattrs)`
- Role: Implements the parser operation.
- Description: Implements the parser operation.

#### `public Parser(Object... attrs)`
- Role: Implements the parser operation.
- Description: Implements the parser operation.

#### `PState(PeekReader in)`
- Role: Handles the pstate workflow.
- Description: Implements the p state operation.

#### `private static boolean namechar(char c)`
- Role: Implements the namechar operation.
- Description: Implements the namechar operation.

#### `protected String name(PeekReader in) throws IOException`
- Role: Returns the name name.
- Description: Implements the name operation.

#### `protected Color a2col(String[] args)`
- Role: Implements the a2col operation.
- Description: Implements the a2col operation.

#### `protected Part tag(PState s, String tn, String[] args, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the tag workflow.
- Description: Implements the tag operation.

#### `protected Part tag(PState s, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the tag workflow.
- Description: Implements the tag operation.

#### `protected Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the text workflow.
- Description: Implements the text operation.

#### `protected Part text(PState s, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the text workflow.
- Description: Implements the text operation.

#### `protected Part parse(PState s, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the parse workflow.
- Description: Implements the parse operation.

#### `public Part parse(Reader in, Map<? extends Attribute, ?> extra) throws IOException`
- Role: Handles the parse workflow.
- Description: Implements the parse operation.

#### `public Part parse(Reader in) throws IOException`
- Role: Handles the parse workflow.
- Description: Implements the parse operation.

#### `public Part parse(String text, Map<? extends Attribute, ?> extra)`
- Role: Implements the parse operation.
- Description: Implements the parse operation.

#### `public Part parse(String text)`
- Role: Implements the parse operation.
- Description: Implements the parse operation.

#### `public static String quote(String in)`
- Role: Implements the quote operation.
- Description: Implements the quote operation.

#### `public static String col2a(Color col)`
- Role: Implements the col2a operation.
- Description: Implements the col2a operation.

#### `public Foundry(Parser parser)`
- Role: Implements the foundry operation.
- Description: Implements the foundry operation.

#### `public Foundry(Map<? extends Attribute, ?> defattrs)`
- Role: Implements the foundry operation.
- Description: Implements the foundry operation.

#### `public Foundry(Object... attrs)`
- Role: Implements the foundry operation.
- Description: Implements the foundry operation.

#### `private static Map<? extends Attribute, ?> xlate(Font f, Color defcol)`
- Role: Implements the xlate operation.
- Description: Implements the xlate operation.

#### `public Foundry(Font f, Color defcol)`
- Role: Implements the foundry operation.
- Description: Implements the foundry operation.

#### `public Foundry derive(Map<? extends Attribute, ?> extra)`
- Role: Implements the derive operation.
- Description: Implements the derive operation.

#### `public Foundry derive(Object... extra)`
- Role: Implements the derive operation.
- Description: Implements the derive operation.

#### `public Foundry aa(boolean aa)`
- Role: Implements the aa operation.
- Description: Implements the aa operation.

#### `private static void aline/* Hurrhurr, pun intended*/(List<Part> line, int y)`
- Role: Handles the rich text workflow.
- Description: Aligns a rendered line so every part shares the same text baseline.

#### `private static Part layout(Part fp, int w)`
- Role: Lays out parts on wrapped lines and aligns their baselines.
- Description: Lays out parts on wrapped lines and aligns their baselines.

#### `private static Coord bounds(Part fp)`
- Role: Computes the rendered bounds of a part chain.
- Description: Computes the rendered bounds of a part chain.

#### `public RichText render(Document doc, int width)`
- Role: Draws the rendered content.
- Description: Draws the current rich-text part into the target graphics context.

#### `public RichText render(String text, int width, Map<? extends Attribute, ?> extra)`
- Role: Draws the rendered content.
- Description: Draws the current rich-text part into the target graphics context.

#### `public RichText render(String text, int width, Object... extra)`
- Role: Draws the rendered content.
- Description: Draws the current rich-text part into the target graphics context.

#### `public RichText render(String text)`
- Role: Draws the rendered content.
- Description: Draws the current rich-text part into the target graphics context.

#### `public static RichText render(Document doc, int width)`
- Role: Draws the rendered content.
- Description: Draws the current rich-text part into the target graphics context.

#### `public static RichText render(String text, int width, Object... extra)`
- Role: Draws the rendered content.
- Description: Draws the current rich-text part into the target graphics context.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.