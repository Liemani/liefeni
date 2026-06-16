# GOut

This file documents the responsibilities and members of `GOut`.

## Meta

- Source: [GOut.java](../../../src/haven/GOut.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the gout Haven component.

## Members

### Constants

#### `public static final VertexArray.Layout vf_pos = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 8))`
- Role: Defines the shared vf pos constant.
- Description: Shared constant used by the rest of the class.

#### `public static final VertexArray.Layout vf_tex = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`
- Role: Defines the shared vf tex constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Render out`
- Role: Holds the out state.
- Description: Backs the cached state for this file.

#### `public Coord ul, br, tx`
- Role: Stores the tx value.
- Description: Backs the cached state for this file.

#### `public Coord ul, br, tx`
- Role: Stores the tx value.
- Description: Backs the cached state for this file.

#### `public Coord ul, br, tx`
- Role: Stores the tx value.
- Description: Backs the cached state for this file.

#### `private final GOut root`
- Role: Holds the root state.
- Description: Backs the cached state for this file.

#### `private final Pipe def2d, cur2d`
- Role: Holds the cur2d state.
- Description: Backs the cached state for this file.

#### `private final Pipe def2d, cur2d`
- Role: Holds the cur2d state.
- Description: Backs the cached state for this file.

### Methods

#### `protected GOut(GOut o)`
- Role: Creates a new GOut instance.
- Description: Constructs the instance and initializes its default state.

#### `public GOut(Render out, Pipe def2d, Coord sz)`
- Role: Creates a new GOut instance.
- Description: Constructs the instance and initializes its default state.

#### `public GOut root()`
- Role: Performs root.
- Description: Supports the root operation used by the surrounding class.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public Pipe basicstate()`
- Role: Performs basicstate.
- Description: Supports the basicstate operation used by the surrounding class.

#### `public Pipe state()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public void image(BufferedImage img, Coord c)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void image(Resource.Image img, Coord c)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void image(Tex tex, Coord c)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void image(Indir<Tex> tex, Coord c)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void aimage(Tex tex, Coord c, double ax, double ay)`
- Role: Performs aimage.
- Description: Supports the aimage operation used by the surrounding class.

#### `public void aimage(Tex tex, Coord c, double ax, double ay, Coord sz)`
- Role: Performs aimage.
- Description: Supports the aimage operation used by the surrounding class.

#### `public void image(Tex tex, Coord c, Coord sz)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void image(Tex tex, Coord c, Coord ul, Coord br)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void image(Tex tex, Coord c, Coord ul, Coord br, Coord sz)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void rimagev(Tex tex, Coord c, int h)`
- Role: Performs rimagev.
- Description: Supports the rimagev operation used by the surrounding class.

#### `public void rimageh(Tex tex, Coord c, int w)`
- Role: Performs rimageh.
- Description: Supports the rimageh operation used by the surrounding class.

#### `public void rimage(Tex tex, Coord c, Coord sz)`
- Role: Performs rimage.
- Description: Supports the rimage operation used by the surrounding class.

#### `public void rotimage(Tex tex, Coord c, Coord rcc, double a)`
- Role: Performs rotimage.
- Description: Supports the rotimage operation used by the surrounding class.

#### `public void image(Tex tex, Coord c, State s)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void atext(String text, Coord c, double ax, double ay)`
- Role: Performs atext.
- Description: Supports the atext operation used by the surrounding class.

#### `public void text(String text, Coord c)`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public void drawp(Model.Mode mode, float[] data, int n)`
- Role: Performs drawp.
- Description: Supports the drawp operation used by the surrounding class.

#### `public void drawp(Model.Mode mode, float[] data)`
- Role: Performs drawp.
- Description: Supports the drawp operation used by the surrounding class.

#### `public void drawt(Model.Mode mode, float[] data, int n)`
- Role: Performs drawt.
- Description: Supports the drawt operation used by the surrounding class.

#### `public void drawt(Model.Mode mode, float[] data)`
- Role: Performs drawt.
- Description: Supports the drawt operation used by the surrounding class.

#### `public void line(Coord c1, Coord c2, double w)`
- Role: Performs line.
- Description: Supports the line operation used by the surrounding class.

#### `public void frect2(Coord ul, Coord br)`
- Role: Performs frect2.
- Description: Supports the frect2 operation used by the surrounding class.

#### `public void frect(Coord ul, Coord sz)`
- Role: Performs frect.
- Description: Supports the frect operation used by the surrounding class.

#### `public void fellipse(Coord c, Coord r, double a1, double a2)`
- Role: Performs fellipse.
- Description: Supports the fellipse operation used by the surrounding class.

#### `public void fellipse(Coord c, Coord r)`
- Role: Performs fellipse.
- Description: Supports the fellipse operation used by the surrounding class.

#### `public void rect2(Coord ul, Coord br)`
- Role: Performs rect2.
- Description: Supports the rect2 operation used by the surrounding class.

#### `public void rect(Coord ul, Coord sz)`
- Role: Performs rect.
- Description: Supports the rect operation used by the surrounding class.

#### `public void prect(Coord c, Coord ul, Coord br, double a)`
- Role: Performs prect.
- Description: Supports the prect operation used by the surrounding class.

#### `public <T extends State> T curstate(State.Slot<T> slot)`
- Role: Performs curstate.
- Description: Supports the curstate operation used by the surrounding class.

#### `public void usestate(State st)`
- Role: Performs usestate.
- Description: Supports the usestate operation used by the surrounding class.

#### `public void usestate(Pipe.Op st)`
- Role: Performs usestate.
- Description: Supports the usestate operation used by the surrounding class.

#### `public <T extends State> void usestate(State.Slot<? super T> slot)`
- Role: Performs usestate.
- Description: Supports the usestate operation used by the surrounding class.

#### `public void defstate()`
- Role: Performs defstate.
- Description: Supports the defstate operation used by the surrounding class.

#### `public void chcolor(Color c)`
- Role: Performs chcolor.
- Description: Supports the chcolor operation used by the surrounding class.

#### `public void chcolor(int r, int g, int b, int a)`
- Role: Performs chcolor.
- Description: Supports the chcolor operation used by the surrounding class.

#### `public void chcolor()`
- Role: Performs chcolor.
- Description: Supports the chcolor operation used by the surrounding class.

#### `public Color getcolor()`
- Role: Performs getcolor.
- Description: Supports the getcolor operation used by the surrounding class.

#### `public GOut reclip2(Coord ul, Coord br)`
- Role: Performs reclip2.
- Description: Supports the reclip2 operation used by the surrounding class.

#### `public GOut reclip(Coord ul, Coord sz)`
- Role: Performs reclip.
- Description: Supports the reclip operation used by the surrounding class.

#### `public GOut reclipl2(Coord ul, Coord br)`
- Role: Performs reclipl2.
- Description: Supports the reclipl2 operation used by the surrounding class.

#### `public GOut reclipl(Coord ul, Coord sz)`
- Role: Performs reclipl.
- Description: Supports the reclipl operation used by the surrounding class.

#### `public static void getpixel(Render g, Pipe state, FragData buf, Coord c, Consumer<Color> cb)`
- Role: Performs getpixel.
- Description: Supports the getpixel operation used by the surrounding class.

#### `public void getpixel(Coord c, Consumer<Color> cb)`
- Role: Performs getpixel.
- Description: Supports the getpixel operation used by the surrounding class.

#### `public static ByteBuffer flipimage(VectorFormat fmt, int w, ByteBuffer data)`
- Role: Performs flipimage.
- Description: Supports the flipimage operation used by the surrounding class.

#### `private static ByteBuffer filltorgb(ByteBuffer src, VectorFormat fmt)`
- Role: Performs filltorgb.
- Description: Supports the filltorgb operation used by the surrounding class.

#### `private static void debugimage(ByteBuffer data, Coord sz, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)`
- Role: Performs debugimage.
- Description: Supports the debugimage operation used by the surrounding class.

#### `public static void debugimage(Render g, Pipe state, FragData buf, Area area, VectorFormat fmt, Consumer<BufferedImage> cb)`
- Role: Performs debugimage.
- Description: Supports the debugimage operation used by the surrounding class.

#### `public static void getimage(Render g, Pipe state, FragData buf, Area area, Consumer<BufferedImage> cb)`
- Role: Performs getimage.
- Description: Supports the getimage operation used by the surrounding class.

#### `public void getimage(Coord ul, Coord sz, Consumer<BufferedImage> cb)`
- Role: Performs getimage.
- Description: Supports the getimage operation used by the surrounding class.

#### `public void getimage(Consumer<BufferedImage> cb)`
- Role: Performs getimage.
- Description: Supports the getimage operation used by the surrounding class.

#### `public static void debugimage(Render g, Texture.Image<?> img, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)`
- Role: Performs debugimage.
- Description: Supports the debugimage operation used by the surrounding class.

#### `public static void debugimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`
- Role: Performs debugimage.
- Description: Supports the debugimage operation used by the surrounding class.

#### `public static void getimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`
- Role: Performs getimage.
- Description: Supports the getimage operation used by the surrounding class.

#### `public void getimage(Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`
- Role: Performs getimage.
- Description: Supports the getimage operation used by the surrounding class.
