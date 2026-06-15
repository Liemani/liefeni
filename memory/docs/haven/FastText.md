# FastText

This file documents the responsibilities and members of `FastText`.

## Meta

- Source: [FastText.java](../../../src/haven/FastText.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides fast text rendering support.

## Members

### Constants

#### `public static final VertexArray.Layout vf = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.SINT16), 0, 0, 8),`

- Description: TODO

#### `public static final Font font = UI.scale(Text.sans, 10)`

- Description: TODO

#### `public static final int h`

- Description: TODO

#### `public static final FontMetrics meter`

- Description: TODO

#### `private static final TexI ct`

- Description: TODO

#### `private static final int[] sx = new int[256], cw = new int[256]`

- Description: TODO

#### `private static final int[] sx = new int[256], cw = new int[256]`

- Description: TODO

### Fields

### Methods

#### `private FastText()`

- Description: TODO

#### `public static int textw(String text)`

- Description: TODO

#### `public static void aprint(GOut g, Coord c, double ax, double ay, String text)`

- Description: TODO

#### `public static void print(GOut g, Coord c, String text)`

- Description: TODO

#### `public static void aprintf(GOut g, Coord c, double ax, double ay, String fmt, Object... args)`

- Description: TODO

#### `public static void printf(GOut g, Coord c, String fmt, Object... args)`

- Description: TODO
