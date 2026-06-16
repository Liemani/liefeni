# FastText

This file documents the responsibilities and members of `FastText`.

## Meta

- Source: [FastText.java](../../../src/haven/FastText.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the fast text Haven component.

## Members

### Constants

#### `public static final VertexArray.Layout vf = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.SINT16), 0, 0, 8),`
- Role: Defines the shared vf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Font font = UI.scale(Text.sans, 10)`
- Role: Defines the shared font constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int h`
- Role: Defines the shared h constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FontMetrics meter`
- Role: Defines the shared meter constant.
- Description: Shared constant used by the rest of the class.

#### `private static final TexI ct`
- Role: Defines the shared ct constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int[] sx = new int[256], cw = new int[256]`
- Role: Defines the shared sx constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int[] sx = new int[256], cw = new int[256]`
- Role: Defines the shared sx constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `private FastText()`
- Role: Creates a new FastText instance.
- Description: Constructs the instance and initializes its default state.

#### `public static int textw(String text)`
- Role: Performs textw.
- Description: Supports the textw operation used by the surrounding class.

#### `public static void aprint(GOut g, Coord c, double ax, double ay, String text)`
- Role: Performs aprint.
- Description: Supports the aprint operation used by the surrounding class.

#### `public static void print(GOut g, Coord c, String text)`
- Role: Performs print.
- Description: Supports the print operation used by the surrounding class.

#### `public static void aprintf(GOut g, Coord c, double ax, double ay, String fmt, Object... args)`
- Role: Performs aprintf.
- Description: Supports the aprintf operation used by the surrounding class.

#### `public static void printf(GOut g, Coord c, String fmt, Object... args)`
- Role: Performs printf.
- Description: Supports the printf operation used by the surrounding class.
