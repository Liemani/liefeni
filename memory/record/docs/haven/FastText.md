---
source: [FastText.java](../../../../src/haven/FastText.java)
created: 2026-06-13
updated: 2026-06-14
---

# FastText

Represents the fast text Haven component.

## Members

### Constants

#### `public static final VertexArray.Layout vf = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.SINT16), 0, 0, 8),`
- Role: Implements the vf operation.
- Description: Implements the vector format operation.
- Value: `new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.SINT16), 0, 0, 8),`

#### `public static final Font font = UI.scale(Text.sans, 10)`
- Role: Implements the font operation.
- Description: Implements the scale operation.
- Value: `UI.scale(Text.sans, 10)`

#### `public static final int h`
#### `public static final int h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `public static final FontMetrics meter`
#### `public static final FontMetrics meter`
- Role: Caches the meter value.
- Description: Caches the `meter` value for reuse.

#### `private static final TexI ct`
#### `private static final TexI ct`
- Role: Caches the ct value.
- Description: Caches the `ct` value for reuse.

#### `private static final int[] sx = new int[256], cw = new int[256]`
- Role: Caches the sx value.
- Description: Caches the `sx` value for reuse.
- Value: `new int[256], cw = new int[256]`

#### `private static final int[] sx = new int[256], cw = new int[256]`
- Role: Caches the sx value.
- Description: Caches the `sx` value for reuse.
- Value: `new int[256], cw = new int[256]`

### Fields

### Methods

#### `private FastText()`
- Role: Creates a new FastText instance.
- Description: Constructs the FastText instance from the supplied inputs.

#### `public static int textw(String text)`
- Role: Handles the textw path.
- Description: Implements the textw operation.

#### `public static void aprint(GOut g, Coord c, double ax, double ay, String text)`
- Role: Handles the aprint path.
- Description: Implements the aprint operation.

#### `public static void print(GOut g, Coord c, String text)`
- Role: Handles the print path.
- Description: Implements the print operation.

#### `public static void aprintf(GOut g, Coord c, double ax, double ay, String fmt, Object... args)`
- Role: Handles the aprintf path.
- Description: Implements the aprintf operation.

#### `public static void printf(GOut g, Coord c, String fmt, Object... args)`
- Role: Handles the printf path.
- Description: Implements the printf operation.