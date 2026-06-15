# GOut

This file documents the responsibilities and members of `GOut`.

## Meta

- Source: [GOut.java](../../../src/haven/GOut.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a graphics output surface.

## Members

### Constants

#### `public static final VertexArray.Layout vf_pos = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 8))`

- Description: TODO

#### `public static final VertexArray.Layout vf_tex = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`

- Description: TODO

### Fields

#### `public final Render out`

- Description: TODO

#### `public Coord ul, br, tx`

- Description: TODO

#### `public Coord ul, br, tx`

- Description: TODO

#### `public Coord ul, br, tx`

- Description: TODO

#### `private final GOut root`

- Description: TODO

#### `private final Pipe def2d, cur2d`

- Description: TODO

#### `private final Pipe def2d, cur2d`

- Description: TODO

### Methods

#### `protected GOut(GOut o)`

- Description: TODO

#### `public GOut(Render out, Pipe def2d, Coord sz)`

- Description: TODO

#### `public GOut root()`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `public Pipe basicstate()`

- Description: TODO

#### `public Pipe state()`

- Description: TODO

#### `public void image(BufferedImage img, Coord c)`

- Description: TODO

#### `public void image(Resource.Image img, Coord c)`

- Description: TODO

#### `public void image(Tex tex, Coord c)`

- Description: TODO

#### `public void image(Indir<Tex> tex, Coord c)`

- Description: TODO

#### `public void aimage(Tex tex, Coord c, double ax, double ay)`

- Description: TODO

#### `public void aimage(Tex tex, Coord c, double ax, double ay, Coord sz)`

- Description: TODO

#### `public void image(Tex tex, Coord c, Coord sz)`

- Description: TODO

#### `public void image(Tex tex, Coord c, Coord ul, Coord br)`

- Description: TODO

#### `public void image(Tex tex, Coord c, Coord ul, Coord br, Coord sz)`

- Description: TODO

#### `public void rimagev(Tex tex, Coord c, int h)`

- Description: TODO

#### `public void rimageh(Tex tex, Coord c, int w)`

- Description: TODO

#### `public void rimage(Tex tex, Coord c, Coord sz)`

- Description: TODO

#### `public void rotimage(Tex tex, Coord c, Coord rcc, double a)`

- Description: TODO

#### `public void image(Tex tex, Coord c, State s)`

- Description: TODO

#### `public void atext(String text, Coord c, double ax, double ay)`

- Description: TODO

#### `public void text(String text, Coord c)`

- Description: TODO

#### `public void drawp(Model.Mode mode, float[] data, int n)`

- Description: TODO

#### `public void drawp(Model.Mode mode, float[] data)`

- Description: TODO

#### `public void drawt(Model.Mode mode, float[] data, int n)`

- Description: TODO

#### `public void drawt(Model.Mode mode, float[] data)`

- Description: TODO

#### `public void line(Coord c1, Coord c2, double w)`

- Description: TODO

#### `public void frect2(Coord ul, Coord br)`

- Description: TODO

#### `public void frect(Coord ul, Coord sz)`

- Description: TODO

#### `public void fellipse(Coord c, Coord r, double a1, double a2)`

- Description: TODO

#### `public void fellipse(Coord c, Coord r)`

- Description: TODO

#### `public void rect2(Coord ul, Coord br)`

- Description: TODO

#### `public void rect(Coord ul, Coord sz)`

- Description: TODO

#### `public void prect(Coord c, Coord ul, Coord br, double a)`

- Description: TODO

#### `public <T extends State> T curstate(State.Slot<T> slot)`

- Description: TODO

#### `public void usestate(State st)`

- Description: TODO

#### `public void usestate(Pipe.Op st)`

- Description: TODO

#### `public <T extends State> void usestate(State.Slot<? super T> slot)`

- Description: TODO

#### `public void defstate()`

- Description: TODO

#### `public void chcolor(Color c)`

- Description: TODO

#### `public void chcolor(int r, int g, int b, int a)`

- Description: TODO

#### `public void chcolor()`

- Description: TODO

#### `public Color getcolor()`

- Description: TODO

#### `public GOut reclip2(Coord ul, Coord br)`

- Description: TODO

#### `public GOut reclip(Coord ul, Coord sz)`

- Description: TODO

#### `public GOut reclipl2(Coord ul, Coord br)`

- Description: TODO

#### `public GOut reclipl(Coord ul, Coord sz)`

- Description: TODO

#### `public static void getpixel(Render g, Pipe state, FragData buf, Coord c, Consumer<Color> cb)`

- Description: TODO

#### `public void getpixel(Coord c, Consumer<Color> cb)`

- Description: TODO

#### `public static ByteBuffer flipimage(VectorFormat fmt, int w, ByteBuffer data)`

- Description: TODO

#### `private static ByteBuffer filltorgb(ByteBuffer src, VectorFormat fmt)`

- Description: TODO

#### `private static void debugimage(ByteBuffer data, Coord sz, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO

#### `public static void debugimage(Render g, Pipe state, FragData buf, Area area, VectorFormat fmt, Consumer<BufferedImage> cb)`

- Description: TODO

#### `public static void getimage(Render g, Pipe state, FragData buf, Area area, Consumer<BufferedImage> cb)`

- Description: TODO

#### `public void getimage(Coord ul, Coord sz, Consumer<BufferedImage> cb)`

- Description: TODO

#### `public void getimage(Consumer<BufferedImage> cb)`

- Description: TODO

#### `public static void debugimage(Render g, Texture.Image<?> img, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO

#### `public static void debugimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO

#### `public static void getimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO

#### `public void getimage(Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`

- Description: TODO
