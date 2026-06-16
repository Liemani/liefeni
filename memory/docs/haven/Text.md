# Text

This file documents the responsibilities and members of `Text`.

## Meta

- Source: [Text.java](../../../src/haven/Text.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the text Haven component.

## Nested Types

### Forge

- Role: Represents forge within Text.
- Description: Describes the nested forge type used by the enclosing class.

### Foundry

- Role: Represents foundry within Text.
- Description: Describes the nested foundry type used by the enclosing class.

### Furnace

- Role: Represents furnace within Text.
- Description: Describes the nested furnace type used by the enclosing class.

### Line

- Role: Represents line within Text.
- Description: Describes the nested line type used by the enclosing class.

### OSlug

- Role: Represents oslug within Text.
- Description: Describes the nested oslug type used by the enclosing class.

### OffsetForge

- Role: Represents offset forge within Text.
- Description: Describes the nested offset forge type used by the enclosing class.

### Slug

- Role: Represents slug within Text.
- Description: Describes the nested slug type used by the enclosing class.

### UText

- Role: Represents utext within Text.
- Description: Describes the nested utext type used by the enclosing class.

## Members

### Constants

#### `public static final Font serif = new Font("Serif", Font.PLAIN, 10)`
- Role: Defines the shared serif constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Font sans = new Font("Sans", Font.PLAIN, 10)`
- Role: Defines the shared sans constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Font mono = new Font("Monospaced", Font.PLAIN, 10)`
- Role: Defines the shared mono constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Font fraktur = Resource.local().loadwait("ui/fraktur").flayer(Resource.Font.class).font`
- Role: Defines the shared fraktur constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Font dfont = sans`
- Role: Defines the shared dfont constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Foundry std`
- Role: Defines the shared std constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color black = Color.BLACK`
- Role: Defines the shared black constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color white = Color.WHITE`
- Role: Defines the shared white constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `public final String text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `private Tex tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `private final FontMetrics m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `private FontMetrics m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `public final Font font`
- Role: Holds the font state.
- Description: Backs the cached state for this file.

#### `public final Color defcol`
- Role: Stores the defcol value.
- Description: Backs the cached state for this file.

#### `public boolean aa = false`
- Role: Tracks the aa flag.
- Description: Supports the aa operation used by the surrounding class.

#### `private RichText.Foundry wfnd = null`
- Role: Stores the wfnd value.
- Description: Backs the cached state for this file.

#### `public final Forge back`
- Role: Holds the back state.
- Description: Backs the cached state for this file.

#### `public final Slug bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public final Furnace fnd`
- Role: Holds the fnd state.
- Description: Backs the cached state for this file.

#### `private Text cur = null`
- Role: Stores the cur value.
- Description: Backs the cached state for this file.

#### `private T cv = null`
- Role: Holds the cv state.
- Description: Backs the cached state for this file.

### Methods

#### `public Slug(String text, BufferedImage img)`
- Role: Performs slug.
- Description: Supports the slug operation used by the surrounding class.

#### `public abstract int baseline()`
- Role: Performs baseline.
- Description: Supports the baseline operation used by the surrounding class.

#### `public abstract int advance(int pos)`
- Role: Performs advance.
- Description: Supports the advance operation used by the surrounding class.

#### `public abstract int charat(int x)`
- Role: Performs charat.
- Description: Supports the charat operation used by the surrounding class.

#### `private Line(String text, BufferedImage img, FontMetrics m)`
- Role: Performs line.
- Description: Supports the line operation used by the surrounding class.

#### `public Coord base()`
- Role: Performs base.
- Description: Supports the base operation used by the surrounding class.

#### `public int baseline()`
- Role: Performs baseline.
- Description: Supports the baseline operation used by the surrounding class.

#### `public int advance(int pos)`
- Role: Performs advance.
- Description: Supports the advance operation used by the surrounding class.

#### `public int charat(int x)`
- Role: Performs charat.
- Description: Supports the charat operation used by the surrounding class.

#### `public static int[] findspaces(String text)`
- Role: Performs findspaces.
- Description: Supports the findspaces operation used by the surrounding class.

#### `public abstract Text render(String text)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public Text renderf(String fmt, Object... args)`
- Role: Performs renderf.
- Description: Supports the renderf operation used by the surrounding class.

#### `public abstract Slug render(String text)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public abstract int height()`
- Role: Performs height.
- Description: Supports the height operation used by the surrounding class.

#### `public abstract Coord strsize(String text)`
- Role: Performs strsize.
- Description: Supports the strsize operation used by the surrounding class.

#### `public Foundry(Font f, Color defcol)`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `public Foundry(Font f)`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `public Foundry(Font font, int psz, Color defcol)`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `public Foundry(Font font, int psz)`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `public Foundry aa(boolean aa)`
- Role: Performs aa.
- Description: Supports the aa operation used by the surrounding class.

#### `public int height()`
- Role: Performs height.
- Description: Supports the height operation used by the surrounding class.

#### `public Coord strsize(String text)`
- Role: Performs strsize.
- Description: Supports the strsize operation used by the surrounding class.

#### `public Text renderwrap(String text, Color c, int width)`
- Role: Performs renderwrap.
- Description: Supports the renderwrap operation used by the surrounding class.

#### `public Text renderwrap(String text, int width)`
- Role: Performs renderwrap.
- Description: Supports the renderwrap operation used by the surrounding class.

#### `public Line render(String text, Color c)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public Line render(String text)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public Line ellipsize(String text, int w, String e)`
- Role: Performs ellipsize.
- Description: Supports the ellipsize operation used by the surrounding class.

#### `public Line ellipsize(String text, int w)`
- Role: Performs ellipsize.
- Description: Supports the ellipsize operation used by the surrounding class.

#### `public static Font fontpxsz(Font font, int pxsz)`
- Role: Performs fontpxsz.
- Description: Supports the fontpxsz operation used by the surrounding class.

#### `public OffsetForge(Forge back)`
- Role: Performs offset forge.
- Description: Supports the offset forge operation used by the surrounding class.

#### `protected abstract BufferedImage proc(Slug text)`
- Role: Performs proc.
- Description: Supports the proc operation used by the surrounding class.

#### `protected abstract Coord tloff()`
- Role: Performs tloff.
- Description: Supports the tloff operation used by the surrounding class.

#### `protected abstract Coord broff()`
- Role: Performs broff.
- Description: Supports the broff operation used by the surrounding class.

#### `private OSlug(Slug bk, BufferedImage img)`
- Role: Performs oslug.
- Description: Supports the oslug operation used by the surrounding class.

#### `public int baseline()`
- Role: Performs baseline.
- Description: Supports the baseline operation used by the surrounding class.

#### `public int advance(int pos)`
- Role: Performs advance.
- Description: Supports the advance operation used by the surrounding class.

#### `public int charat(int x)`
- Role: Performs charat.
- Description: Supports the charat operation used by the surrounding class.

#### `public Slug render(String text)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public int height()`
- Role: Performs height.
- Description: Supports the height operation used by the surrounding class.

#### `public Coord strsize(String text)`
- Role: Performs strsize.
- Description: Supports the strsize operation used by the surrounding class.

#### `public static OffsetForge of(Forge back, Coord tloff, Coord broff, Function<? super Slug, ? extends BufferedImage> prod)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public UText(Furnace fnd)`
- Role: Performs utext.
- Description: Supports the utext operation used by the surrounding class.

#### `protected Text render(String text)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `protected String text(T value)`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `protected abstract T value()`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public Text get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Indir<Tex> tex()`
- Role: Performs tex.
- Description: Supports the tex operation used by the surrounding class.

#### `public static UText forfield(Furnace fnd, final Object obj, String fn)`
- Role: Performs forfield.
- Description: Supports the forfield operation used by the surrounding class.

#### `public static UText forfield(Object obj, String fn)`
- Role: Performs forfield.
- Description: Supports the forfield operation used by the surrounding class.

#### `public static <T> UText<T> of(Furnace fnd, Supplier<? extends T> val, Function<? super T, String> fmt)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static <T> UText<T> of(Furnace fnd, Supplier<T> val)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `protected Text(String text, BufferedImage img)`
- Role: Creates a new Text instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public static Line render(String text, Color c)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public static Line renderf(Color c, String text, Object... args)`
- Role: Performs renderf.
- Description: Supports the renderf operation used by the surrounding class.

#### `public static Line render(String text)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public Tex tex()`
- Role: Performs tex.
- Description: Supports the tex operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
