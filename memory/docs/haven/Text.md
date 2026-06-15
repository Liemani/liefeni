# Text

This file documents the responsibilities and members of `Text`.

## Meta

- Source: [Text.java](../../../src/haven/Text.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Builds and renders text.

## Nested Types

### Forge

- Description: TODO

### Foundry

- Description: TODO

### Furnace

- Description: TODO

### Line

- Description: TODO

### OSlug

- Description: TODO

### OffsetForge

- Description: TODO

### Slug

- Description: TODO

### UText

- Description: TODO

## Members

### Constants

#### `public static final Font serif = new Font("Serif", Font.PLAIN, 10)`

- Description: TODO

#### `public static final Font sans = new Font("Sans", Font.PLAIN, 10)`

- Description: TODO

#### `public static final Font mono = new Font("Monospaced", Font.PLAIN, 10)`

- Description: TODO

#### `public static final Font fraktur = Resource.local().loadwait("ui/fraktur").flayer(Resource.Font.class).font`

- Description: TODO

#### `public static final Font dfont = sans`

- Description: TODO

#### `public static final Foundry std`

- Description: TODO

#### `public static final Color black = Color.BLACK`

- Description: TODO

#### `public static final Color white = Color.WHITE`

- Description: TODO

### Fields

#### `public final BufferedImage img`

- Description: TODO

#### `public final String text`

- Description: TODO

#### `private Tex tex`

- Description: TODO

#### `private final FontMetrics m`

- Description: TODO

#### `private FontMetrics m`

- Description: TODO

#### `public final Font font`

- Description: TODO

#### `public final Color defcol`

- Description: TODO

#### `public boolean aa = false`

- Description: TODO

#### `private RichText.Foundry wfnd = null`

- Description: TODO

#### `public final Forge back`

- Description: TODO

#### `public final Slug bk`

- Description: TODO

#### `public final Furnace fnd`

- Description: TODO

#### `private Text cur = null`

- Description: TODO

#### `private T cv = null`

- Description: TODO

### Methods

#### `public Slug(String text, BufferedImage img)`

- Description: TODO

#### `public abstract int baseline()`

- Description: TODO

#### `public abstract int advance(int pos)`

- Description: TODO

#### `public abstract int charat(int x)`

- Description: TODO

#### `private Line(String text, BufferedImage img, FontMetrics m)`

- Description: TODO

#### `public Coord base()`

- Description: TODO

#### `public int baseline()`

- Description: TODO

#### `public int advance(int pos)`

- Description: TODO

#### `public int charat(int x)`

- Description: TODO

#### `public static int[] findspaces(String text)`

- Description: TODO

#### `public abstract Text render(String text)`

- Description: TODO

#### `public Text renderf(String fmt, Object... args)`

- Description: TODO

#### `public abstract Slug render(String text)`

- Description: TODO

#### `public abstract int height()`

- Description: TODO

#### `public abstract Coord strsize(String text)`

- Description: TODO

#### `public Foundry(Font f, Color defcol)`

- Description: TODO

#### `public Foundry(Font f)`

- Description: TODO

#### `public Foundry(Font font, int psz, Color defcol)`

- Description: TODO

#### `public Foundry(Font font, int psz)`

- Description: TODO

#### `public Foundry aa(boolean aa)`

- Description: TODO

#### `public int height()`

- Description: TODO

#### `public Coord strsize(String text)`

- Description: TODO

#### `public Text renderwrap(String text, Color c, int width)`

- Description: TODO

#### `public Text renderwrap(String text, int width)`

- Description: TODO

#### `public Line render(String text, Color c)`

- Description: TODO

#### `public Line render(String text)`

- Description: TODO

#### `public Line ellipsize(String text, int w, String e)`

- Description: TODO

#### `public Line ellipsize(String text, int w)`

- Description: TODO

#### `public static Font fontpxsz(Font font, int pxsz)`

- Description: TODO

#### `public OffsetForge(Forge back)`

- Description: TODO

#### `protected abstract BufferedImage proc(Slug text)`

- Description: TODO

#### `protected abstract Coord tloff()`

- Description: TODO

#### `protected abstract Coord broff()`

- Description: TODO

#### `private OSlug(Slug bk, BufferedImage img)`

- Description: TODO

#### `public int baseline()`

- Description: TODO

#### `public int advance(int pos)`

- Description: TODO

#### `public int charat(int x)`

- Description: TODO

#### `public Slug render(String text)`

- Description: TODO

#### `public int height()`

- Description: TODO

#### `public Coord strsize(String text)`

- Description: TODO

#### `public static OffsetForge of(Forge back, Coord tloff, Coord broff, Function<? super Slug, ? extends BufferedImage> prod)`

- Description: TODO

#### `public UText(Furnace fnd)`

- Description: TODO

#### `protected Text render(String text)`

- Description: TODO

#### `protected String text(T value)`

- Description: TODO

#### `protected abstract T value()`

- Description: TODO

#### `public Text get()`

- Description: TODO

#### `public Indir<Tex> tex()`

- Description: TODO

#### `public static UText forfield(Furnace fnd, final Object obj, String fn)`

- Description: TODO

#### `public static UText forfield(Object obj, String fn)`

- Description: TODO

#### `public static <T> UText<T> of(Furnace fnd, Supplier<? extends T> val, Function<? super T, String> fmt)`

- Description: TODO

#### `public static <T> UText<T> of(Furnace fnd, Supplier<T> val)`

- Description: TODO

#### `protected Text(String text, BufferedImage img)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `public static Line render(String text, Color c)`

- Description: TODO

#### `public static Line renderf(Color c, String text, Object... args)`

- Description: TODO

#### `public static Line render(String text)`

- Description: TODO

#### `public Tex tex()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO
