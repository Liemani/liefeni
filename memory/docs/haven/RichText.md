# RichText

This file documents the responsibilities and members of `RichText`.

## Meta

- Source: [RichText.java](../../../src/haven/RichText.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Parses and renders rich text.

## Nested Types

### Document

- Description: TODO

### FormatException

- Description: TODO

### Foundry

- Description: TODO

### Image

- Description: TODO

### ImageSource

- Description: TODO

### Newline

- Description: TODO

### PState

- Description: TODO

### Parser

- Description: TODO

### Part

- Description: TODO

### RState

- Description: TODO

### TextPart

- Description: TODO

## Members

### Constants

#### `public static final Attribute IMAGESRC = new Attribute("image-source")`

- Description: TODO

#### `public static final Parser std`

- Description: TODO

#### `public static final Foundry stdf`

- Description: TODO

#### `public static final ImageSource legacy = new ImageSource()`

- Description: TODO

### Fields

#### `public final Part parts`

- Description: TODO

#### `FontRenderContext frc`

- Description: TODO

#### `public Part next = null`

- Description: TODO

#### `public int x, y`

- Description: TODO

#### `public int x, y`

- Description: TODO

#### `public RState rs`

- Description: TODO

#### `public BufferedImage img`

- Description: TODO

#### `public int h = -1`

- Description: TODO

#### `public double lh = -1, bh = -1`

- Description: TODO

#### `public double lh = -1, bh = -1`

- Description: TODO

#### `public Map<? extends Attribute, ?> attrs`

- Description: TODO

#### `public float imgscale = 1.0f`

- Description: TODO

#### `private Coord sz = null`

- Description: TODO

#### `private Map<? extends Attribute, ?> attrs`

- Description: TODO

#### `private LineMetrics lm`

- Description: TODO

#### `public AttributedString str`

- Description: TODO

#### `public int start, end`

- Description: TODO

#### `public int start, end`

- Description: TODO

#### `private TextMeasurer tm = null`

- Description: TODO

#### `private TextLayout tl = null`

- Description: TODO

#### `public final String text`

- Description: TODO

#### `public final Map<? extends Attribute, ?> attrs`

- Description: TODO

#### `private final Map<? extends Attribute, ?> defattrs`

- Description: TODO

#### `PeekReader in`

- Description: TODO

#### `public boolean aa = false`

- Description: TODO

#### `private final Parser parser`

- Description: TODO

#### `private final RState rs`

- Description: TODO

### Methods

#### `private RichText(String text, BufferedImage img, Part parts)`

- Description: TODO

#### `RState(FontRenderContext frc)`

- Description: TODO

#### `public FormatException(String msg)`

- Description: TODO

#### `public void append(Part p)`

- Description: TODO

#### `public void prepare(RState rs)`

- Description: TODO

#### `public int width()`

- Description: TODO

#### `public int height()`

- Description: TODO

#### `public int baseline()`

- Description: TODO

#### `public void render(Graphics2D g)`

- Description: TODO

#### `public Part split(int w)`

- Description: TODO

#### `public Image get(String[] args, int[] ap)`

- Description: TODO

#### `public static ImageSource chain(ImageSource... srcs)`

- Description: TODO

#### `public static ImageSource id(String id, Supplier<? extends Image> img)`

- Description: TODO

#### `public static ImageSource res(Resource res)`

- Description: TODO

#### `public static ImageSource res(Resource.Pool pool)`

- Description: TODO

#### `public Image(BufferedImage img)`

- Description: TODO

#### `public Image(Resource.Image img)`

- Description: TODO

#### `public Image(Resource res, int id)`

- Description: TODO

#### `private LineMetrics lm()`

- Description: TODO

#### `public void prepare(RState rs)`

- Description: TODO

#### `public int width()`

- Description: TODO

#### `public int height()`

- Description: TODO

#### `public int baseline()`

- Description: TODO

#### `public void render(Graphics2D g)`

- Description: TODO

#### `public Newline(Map<? extends Attribute, ?> attrs)`

- Description: TODO

#### `private LineMetrics lm()`

- Description: TODO

#### `public int height()`

- Description: TODO

#### `public int baseline()`

- Description: TODO

#### `public TextPart(AttributedString str, int start, int end)`

- Description: TODO

#### `public TextPart(String str, Map<? extends Attribute, ?> attrs)`

- Description: TODO

#### `public TextPart(String str)`

- Description: TODO

#### `public AttributedCharacterIterator ti()`

- Description: TODO

#### `public void append(Part p)`

- Description: TODO

#### `public TextMeasurer tm()`

- Description: TODO

#### `public TextLayout tl()`

- Description: TODO

#### `public float advance(int from, int to)`

- Description: TODO

#### `public int width()`

- Description: TODO

#### `public int height()`

- Description: TODO

#### `public int baseline()`

- Description: TODO

#### `private Part split2(int e1, int s2)`

- Description: TODO

#### `public Part split(int w)`

- Description: TODO

#### `public void render(Graphics2D g)`

- Description: TODO

#### `public TextHitInfo charat(float x, float y)`

- Description: TODO

#### `public TextHitInfo charat(Coord c)`

- Description: TODO

#### `public Part partat(Coord c)`

- Description: TODO

#### `public AttributedCharacterIterator attrat(Coord c)`

- Description: TODO

#### `public Object attrat(Coord c, Attribute attr)`

- Description: TODO

#### `public static Map<? extends Attribute, ?> fillattrs2(Map<? extends Attribute, ?> def, Object... attrs)`

- Description: TODO

#### `public static Map<? extends Attribute, ?> fillattrs(Object... attrs)`

- Description: TODO

#### `public static Map<? extends Attribute, ?> mergeattrs(Map<? extends Attribute, ?>... parts)`

- Description: TODO

#### `public Document(String text, Map<? extends Attribute, ?> attrs)`

- Description: TODO

#### `public Document(String text, Object... attrs)`

- Description: TODO

#### `public Document(String text)`

- Description: TODO

#### `public static Document respag(Indir<Resource> res)`

- Description: TODO

#### `private static Map<? extends Attribute, ?> fixattrs(Map<? extends Attribute, ?> attrs)`

- Description: TODO

#### `public Parser(Map<? extends Attribute, ?> defattrs)`

- Description: TODO

#### `public Parser(Object... attrs)`

- Description: TODO

#### `PState(PeekReader in)`

- Description: TODO

#### `private static boolean namechar(char c)`

- Description: TODO

#### `protected String name(PeekReader in) throws IOException`

- Description: TODO

#### `protected Color a2col(String[] args)`

- Description: TODO

#### `protected Part tag(PState s, String tn, String[] args, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

#### `protected Part tag(PState s, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

#### `protected Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

#### `protected Part text(PState s, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

#### `protected Part parse(PState s, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

#### `public Part parse(Reader in, Map<? extends Attribute, ?> extra) throws IOException`

- Description: TODO

#### `public Part parse(Reader in) throws IOException`

- Description: TODO

#### `public Part parse(String text, Map<? extends Attribute, ?> extra)`

- Description: TODO

#### `public Part parse(String text)`

- Description: TODO

#### `public static String quote(String in)`

- Description: TODO

#### `public static String col2a(Color col)`

- Description: TODO

#### `public Foundry(Parser parser)`

- Description: TODO

#### `public Foundry(Map<? extends Attribute, ?> defattrs)`

- Description: TODO

#### `public Foundry(Object... attrs)`

- Description: TODO

#### `private static Map<? extends Attribute, ?> xlate(Font f, Color defcol)`

- Description: TODO

#### `public Foundry(Font f, Color defcol)`

- Description: TODO

#### `public Foundry derive(Map<? extends Attribute, ?> extra)`

- Description: TODO

#### `public Foundry derive(Object... extra)`

- Description: TODO

#### `public Foundry aa(boolean aa)`

- Description: TODO

#### `private static void aline/* Hurrhurr, pun intended*/(List<Part> line, int y)`

- Description: TODO

#### `private static Part layout(Part fp, int w)`

- Description: TODO

#### `private static Coord bounds(Part fp)`

- Description: TODO

#### `public RichText render(Document doc, int width)`

- Description: TODO

#### `public RichText render(String text, int width, Map<? extends Attribute, ?> extra)`

- Description: TODO

#### `public RichText render(String text, int width, Object... extra)`

- Description: TODO

#### `public RichText render(String text)`

- Description: TODO

#### `public static RichText render(Document doc, int width)`

- Description: TODO

#### `public static RichText render(String text, int width, Object... extra)`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO
