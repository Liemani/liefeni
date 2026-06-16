# RichText

This file documents the responsibilities and members of `RichText`.

## Meta

- Source: [RichText.java](../../../src/haven/RichText.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the rich text Haven component.

## Nested Types

### Document

- Role: Represents document within RichText.
- Description: Describes the nested document type used by the enclosing class.

### FormatException

- Role: Represents format exception within RichText.
- Description: Describes the nested format exception type used by the enclosing class.

### Foundry

- Role: Represents foundry within RichText.
- Description: Describes the nested foundry type used by the enclosing class.

### Image

- Role: Represents image within RichText.
- Description: Describes the nested image type used by the enclosing class.

### ImageSource

- Role: Represents image source within RichText.
- Description: Describes the nested image source type used by the enclosing class.

### Newline

- Role: Represents newline within RichText.
- Description: Describes the nested newline type used by the enclosing class.

### PState

- Role: Represents pstate within RichText.
- Description: Describes the nested pstate type used by the enclosing class.

### Parser

- Role: Represents parser within RichText.
- Description: Describes the nested parser type used by the enclosing class.

### Part

- Role: Represents part within RichText.
- Description: Describes the nested part type used by the enclosing class.

### RState

- Role: Represents rstate within RichText.
- Description: Describes the nested rstate type used by the enclosing class.

### TextPart

- Role: Represents text part within RichText.
- Description: Describes the nested text part type used by the enclosing class.

## Members

### Constants

#### `public static final Attribute IMAGESRC = new Attribute("image-source")`
- Role: Defines the shared imagesrc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Parser std`
- Role: Defines the shared std constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Foundry stdf`
- Role: Defines the shared stdf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ImageSource legacy = new ImageSource()`
- Role: Defines the shared legacy constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Part parts`
- Role: Holds the parts state.
- Description: Backs the cached state for this file.

#### `FontRenderContext frc`
- Role: Stores the frc value.
- Description: Backs the cached state for this file.

#### `public Part next = null`
- Role: Holds the next state.
- Description: Backs the cached state for this file.

#### `public int x, y`
- Role: Stores the y value.
- Description: Backs the cached state for this file.

#### `public int x, y`
- Role: Stores the y value.
- Description: Backs the cached state for this file.

#### `public RState rs`
- Role: Holds the rs state.
- Description: Backs the cached state for this file.

#### `public BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `public int h = -1`
- Role: Stores the h value.
- Description: Backs the cached state for this file.

#### `public double lh = -1, bh = -1`
- Role: Stores the lh value.
- Description: Backs the cached state for this file.

#### `public double lh = -1, bh = -1`
- Role: Stores the lh value.
- Description: Backs the cached state for this file.

#### `public Map<? extends Attribute, ?> attrs`
- Role: Caches attrs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public float imgscale = 1.0f`
- Role: Stores the imgscale value.
- Description: Backs the cached state for this file.

#### `private Coord sz = null`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private Map<? extends Attribute, ?> attrs`
- Role: Caches attrs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private LineMetrics lm`
- Role: Holds the lm state.
- Description: Backs the cached state for this file.

#### `public AttributedString str`
- Role: Stores the str value.
- Description: Backs the cached state for this file.

#### `public int start, end`
- Role: Stores the end value.
- Description: Backs the cached state for this file.

#### `public int start, end`
- Role: Stores the end value.
- Description: Backs the cached state for this file.

#### `private TextMeasurer tm = null`
- Role: Stores the tm value.
- Description: Backs the cached state for this file.

#### `private TextLayout tl = null`
- Role: Stores the tl value.
- Description: Backs the cached state for this file.

#### `public final String text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public final Map<? extends Attribute, ?> attrs`
- Role: Caches attrs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<? extends Attribute, ?> defattrs`
- Role: Caches defattrs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `PeekReader in`
- Role: Holds the in state.
- Description: Backs the cached state for this file.

#### `public boolean aa = false`
- Role: Tracks the aa flag.
- Description: Supports the aa operation used by the surrounding class.

#### `private final Parser parser`
- Role: Holds the parser state.
- Description: Backs the cached state for this file.

#### `private final RState rs`
- Role: Holds the rs state.
- Description: Backs the cached state for this file.

### Methods

#### `private RichText(String text, BufferedImage img, Part parts)`
- Role: Creates a new RichText instance.
- Description: Constructs the instance and initializes its default state.

#### `RState(FontRenderContext frc)`
- Role: Handles the rstate workflow.
- Description: Supports the rstate operation used by the surrounding class.

#### `public FormatException(String msg)`
- Role: Performs format exception.
- Description: Supports the format exception operation used by the surrounding class.

#### `public void append(Part p)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public void prepare(RState rs)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `public int width()`
- Role: Performs width.
- Description: Supports the width operation used by the surrounding class.

#### `public int height()`
- Role: Performs height.
- Description: Supports the height operation used by the surrounding class.

#### `public int baseline()`
- Role: Performs baseline.
- Description: Supports the baseline operation used by the surrounding class.

#### `public void render(Graphics2D g)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public Part split(int w)`
- Role: Performs split.
- Description: Supports the split operation used by the surrounding class.

#### `public Image get(String[] args, int[] ap)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static ImageSource chain(ImageSource... srcs)`
- Role: Performs chain.
- Description: Supports the chain operation used by the surrounding class.

#### `public static ImageSource id(String id, Supplier<? extends Image> img)`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public static ImageSource res(Resource res)`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `public static ImageSource res(Resource.Pool pool)`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `public Image(BufferedImage img)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public Image(Resource.Image img)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public Image(Resource res, int id)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `private LineMetrics lm()`
- Role: Performs lm.
- Description: Supports the lm operation used by the surrounding class.

#### `public void prepare(RState rs)`
- Role: Performs prepare.
- Description: Supports the prepare operation used by the surrounding class.

#### `public int width()`
- Role: Performs width.
- Description: Supports the width operation used by the surrounding class.

#### `public int height()`
- Role: Performs height.
- Description: Supports the height operation used by the surrounding class.

#### `public int baseline()`
- Role: Performs baseline.
- Description: Supports the baseline operation used by the surrounding class.

#### `public void render(Graphics2D g)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public Newline(Map<? extends Attribute, ?> attrs)`
- Role: Performs newline.
- Description: Supports the newline operation used by the surrounding class.

#### `private LineMetrics lm()`
- Role: Performs lm.
- Description: Supports the lm operation used by the surrounding class.

#### `public int height()`
- Role: Performs height.
- Description: Supports the height operation used by the surrounding class.

#### `public int baseline()`
- Role: Performs baseline.
- Description: Supports the baseline operation used by the surrounding class.

#### `public TextPart(AttributedString str, int start, int end)`
- Role: Performs text part.
- Description: Supports the text part operation used by the surrounding class.

#### `public TextPart(String str, Map<? extends Attribute, ?> attrs)`
- Role: Performs text part.
- Description: Supports the text part operation used by the surrounding class.

#### `public TextPart(String str)`
- Role: Performs text part.
- Description: Supports the text part operation used by the surrounding class.

#### `public AttributedCharacterIterator ti()`
- Role: Performs ti.
- Description: Supports the ti operation used by the surrounding class.

#### `public void append(Part p)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public TextMeasurer tm()`
- Role: Performs tm.
- Description: Supports the tm operation used by the surrounding class.

#### `public TextLayout tl()`
- Role: Performs tl.
- Description: Supports the tl operation used by the surrounding class.

#### `public float advance(int from, int to)`
- Role: Performs advance.
- Description: Supports the advance operation used by the surrounding class.

#### `public int width()`
- Role: Performs width.
- Description: Supports the width operation used by the surrounding class.

#### `public int height()`
- Role: Performs height.
- Description: Supports the height operation used by the surrounding class.

#### `public int baseline()`
- Role: Performs baseline.
- Description: Supports the baseline operation used by the surrounding class.

#### `private Part split2(int e1, int s2)`
- Role: Performs split2.
- Description: Supports the split2 operation used by the surrounding class.

#### `public Part split(int w)`
- Role: Performs split.
- Description: Supports the split operation used by the surrounding class.

#### `public void render(Graphics2D g)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public TextHitInfo charat(float x, float y)`
- Role: Performs charat.
- Description: Supports the charat operation used by the surrounding class.

#### `public TextHitInfo charat(Coord c)`
- Role: Performs charat.
- Description: Supports the charat operation used by the surrounding class.

#### `public Part partat(Coord c)`
- Role: Performs partat.
- Description: Supports the partat operation used by the surrounding class.

#### `public AttributedCharacterIterator attrat(Coord c)`
- Role: Performs attrat.
- Description: Supports the attrat operation used by the surrounding class.

#### `public Object attrat(Coord c, Attribute attr)`
- Role: Performs attrat.
- Description: Supports the attrat operation used by the surrounding class.

#### `public static Map<? extends Attribute, ?> fillattrs2(Map<? extends Attribute, ?> def, Object... attrs)`
- Role: Performs fillattrs2.
- Description: Supports the fillattrs2 operation used by the surrounding class.

#### `public static Map<? extends Attribute, ?> fillattrs(Object... attrs)`
- Role: Performs fillattrs.
- Description: Supports the fillattrs operation used by the surrounding class.

#### `public static Map<? extends Attribute, ?> mergeattrs(Map<? extends Attribute, ?>... parts)`
- Role: Performs mergeattrs.
- Description: Supports the mergeattrs operation used by the surrounding class.

#### `public Document(String text, Map<? extends Attribute, ?> attrs)`
- Role: Performs document.
- Description: Supports the document operation used by the surrounding class.

#### `public Document(String text, Object... attrs)`
- Role: Performs document.
- Description: Supports the document operation used by the surrounding class.

#### `public Document(String text)`
- Role: Performs document.
- Description: Supports the document operation used by the surrounding class.

#### `public static Document respag(Indir<Resource> res)`
- Role: Performs respag.
- Description: Supports the respag operation used by the surrounding class.

#### `private static Map<? extends Attribute, ?> fixattrs(Map<? extends Attribute, ?> attrs)`
- Role: Performs fixattrs.
- Description: Supports the fixattrs operation used by the surrounding class.

#### `public Parser(Map<? extends Attribute, ?> defattrs)`
- Role: Performs parser.
- Description: Supports the parser operation used by the surrounding class.

#### `public Parser(Object... attrs)`
- Role: Performs parser.
- Description: Supports the parser operation used by the surrounding class.

#### `PState(PeekReader in)`
- Role: Handles the pstate workflow.
- Description: Supports the pstate operation used by the surrounding class.

#### `private static boolean namechar(char c)`
- Role: Performs namechar.
- Description: Supports the namechar operation used by the surrounding class.

#### `protected String name(PeekReader in) throws IOException`
- Role: Returns the name name.
- Description: Exposes the requested value without mutating state.

#### `protected Color a2col(String[] args)`
- Role: Performs a2col.
- Description: Supports the a2col operation used by the surrounding class.

#### `protected Part tag(PState s, String tn, String[] args, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the tag workflow.
- Description: Supports the tag operation used by the surrounding class.

#### `protected Part tag(PState s, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the tag workflow.
- Description: Supports the tag operation used by the surrounding class.

#### `protected Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the text workflow.
- Description: Supports the text operation used by the surrounding class.

#### `protected Part text(PState s, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the text workflow.
- Description: Supports the text operation used by the surrounding class.

#### `protected Part parse(PState s, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the parse workflow.
- Description: Supports the parse operation used by the surrounding class.

#### `public Part parse(Reader in, Map<? extends Attribute, ?> extra) throws IOException`
- Role: Handles the parse workflow.
- Description: Supports the parse operation used by the surrounding class.

#### `public Part parse(Reader in) throws IOException`
- Role: Handles the parse workflow.
- Description: Supports the parse operation used by the surrounding class.

#### `public Part parse(String text, Map<? extends Attribute, ?> extra)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public Part parse(String text)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public static String quote(String in)`
- Role: Performs quote.
- Description: Supports the quote operation used by the surrounding class.

#### `public static String col2a(Color col)`
- Role: Performs col2a.
- Description: Supports the col2a operation used by the surrounding class.

#### `public Foundry(Parser parser)`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `public Foundry(Map<? extends Attribute, ?> defattrs)`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `public Foundry(Object... attrs)`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `private static Map<? extends Attribute, ?> xlate(Font f, Color defcol)`
- Role: Performs xlate.
- Description: Supports the xlate operation used by the surrounding class.

#### `public Foundry(Font f, Color defcol)`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `public Foundry derive(Map<? extends Attribute, ?> extra)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `public Foundry derive(Object... extra)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `public Foundry aa(boolean aa)`
- Role: Performs aa.
- Description: Supports the aa operation used by the surrounding class.

#### `private static void aline/* Hurrhurr, pun intended*/(List<Part> line, int y)`
- Role: Handles the rich text workflow.
- Description: Supports the  operation used by the surrounding class.

#### `private static Part layout(Part fp, int w)`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.

#### `private static Coord bounds(Part fp)`
- Role: Performs bounds.
- Description: Supports the bounds operation used by the surrounding class.

#### `public RichText render(Document doc, int width)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public RichText render(String text, int width, Map<? extends Attribute, ?> extra)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public RichText render(String text, int width, Object... extra)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public RichText render(String text)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public static RichText render(Document doc, int width)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public static RichText render(String text, int width, Object... extra)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
