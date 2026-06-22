---
source: [GOut.java](../../../../src/haven/GOut.java)
created: 2026-06-13
updated: 2026-06-14
---

# GOut

Represents the gout Haven component.

## Members

### Constants

#### `public static final VertexArray.Layout vf_pos = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 8))`
- Role: Implements the vf pos operation.
- Description: Implements the vector format operation.
- Value: `new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 8))`

#### `public static final VertexArray.Layout vf_tex = new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`
- Role: Implements the vf tex operation.
- Description: Implements the vector format operation.
- Value: `new VertexArray.Layout(new VertexArray.Layout.Input(Ortho2D.pos, new VectorFormat(2, NumberFormat.FLOAT32), 0, 0, 16),`

### Fields

#### `public final Render out`
- Role: Caches the out value.
- Description: Caches the `out` value for reuse.

#### `public Coord ul, br, tx`
- Role: Caches the tx value.
- Description: Caches the `tx` value for reuse.

#### `public Coord ul, br, tx`
- Role: Caches the tx value.
- Description: Caches the `tx` value for reuse.

#### `public Coord ul, br, tx`
- Role: Caches the tx value.
- Description: Caches the `tx` value for reuse.

#### `private final GOut root`
- Role: Caches the root value.
- Description: Keeps the root event so acceptance can be reported back.

#### `private final Pipe def2d, cur2d`
- Role: Caches the cur2d value.
- Description: Caches the `cur2d` value for reuse.

#### `private final Pipe def2d, cur2d`
- Role: Caches the cur2d value.
- Description: Caches the `cur2d` value for reuse.

### Methods

#### `protected GOut(GOut o)`
- Role: Creates a new GOut instance.
- Description: Constructs the GOut instance from the supplied inputs.

#### `public GOut(Render out, Pipe def2d, Coord sz)`
- Role: Creates a new GOut instance.
- Description: Constructs the GOut instance from the supplied inputs.

#### `public GOut root()`
- Role: Handles the root widget path.
- Description: Implements the root operation.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public Pipe basicstate()`
- Role: Handles the basicstate path.
- Description: Implements the basicstate operation.

#### `public Pipe state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public void image(BufferedImage img, Coord c)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void image(Resource.Image img, Coord c)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void image(Tex tex, Coord c)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void image(Indir<Tex> tex, Coord c)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void aimage(Tex tex, Coord c, double ax, double ay)`
- Role: Handles the aimage path.
- Description: Implements the aimage operation.

#### `public void aimage(Tex tex, Coord c, double ax, double ay, Coord sz)`
- Role: Handles the aimage path.
- Description: Implements the aimage operation.

#### `public void image(Tex tex, Coord c, Coord sz)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void image(Tex tex, Coord c, Coord ul, Coord br)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void image(Tex tex, Coord c, Coord ul, Coord br, Coord sz)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void rimagev(Tex tex, Coord c, int h)`
- Role: Handles the rimagev path.
- Description: Implements the rimagev operation.

#### `public void rimageh(Tex tex, Coord c, int w)`
- Role: Handles the rimageh path.
- Description: Implements the rimageh operation.

#### `public void rimage(Tex tex, Coord c, Coord sz)`
- Role: Handles the rimage path.
- Description: Implements the rimage operation.

#### `public void rotimage(Tex tex, Coord c, Coord rcc, double a)`
- Role: Handles the rotimage path.
- Description: Implements the rotimage operation.

#### `public void image(Tex tex, Coord c, State s)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void atext(String text, Coord c, double ax, double ay)`
- Role: Handles the atext path.
- Description: Implements the atext operation.

#### `public void text(String text, Coord c)`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public void drawp(Model.Mode mode, float[] data, int n)`
- Role: Handles the drawp path.
- Description: Draws the p.

#### `public void drawp(Model.Mode mode, float[] data)`
- Role: Handles the drawp path.
- Description: Draws the p.

#### `public void drawt(Model.Mode mode, float[] data, int n)`
- Role: Handles the drawt path.
- Description: Draws the t.

#### `public void drawt(Model.Mode mode, float[] data)`
- Role: Handles the drawt path.
- Description: Draws the t.

#### `public void line(Coord c1, Coord c2, double w)`
- Role: Handles the line path.
- Description: Implements the line operation.

#### `public void frect2(Coord ul, Coord br)`
- Role: Handles the frect2 path.
- Description: Implements the frect2 operation.

#### `public void frect(Coord ul, Coord sz)`
- Role: Handles the frect path.
- Description: Implements the frect operation.

#### `public void fellipse(Coord c, Coord r, double a1, double a2)`
- Role: Handles the fellipse path.
- Description: Implements the fellipse operation.

#### `public void fellipse(Coord c, Coord r)`
- Role: Handles the fellipse path.
- Description: Implements the fellipse operation.

#### `public void rect2(Coord ul, Coord br)`
- Role: Handles the rect2 path.
- Description: Implements the rect2 operation.

#### `public void rect(Coord ul, Coord sz)`
- Role: Handles the rect path.
- Description: Implements the rect operation.

#### `public void prect(Coord c, Coord ul, Coord br, double a)`
- Role: Handles the prect path.
- Description: Implements the prect operation.

#### `public <T extends State> T curstate(State.Slot<T> slot)`
- Role: Handles the curstate path.
- Description: Implements the curstate operation.

#### `public void usestate(State st)`
- Role: Handles the usestate path.
- Description: Implements the usestate operation.

#### `public void usestate(Pipe.Op st)`
- Role: Handles the usestate path.
- Description: Implements the usestate operation.

#### `public <T extends State> void usestate(State.Slot<? super T> slot)`
- Role: Handles the usestate path.
- Description: Implements the usestate operation.

#### `public void defstate()`
- Role: Handles the defstate path.
- Description: Implements the defstate operation.

#### `public void chcolor(Color c)`
- Role: Handles the chcolor path.
- Description: Implements the chcolor operation.

#### `public void chcolor(int r, int g, int b, int a)`
- Role: Handles the chcolor path.
- Description: Implements the chcolor operation.

#### `public void chcolor()`
- Role: Handles the chcolor path.
- Description: Implements the chcolor operation.

#### `public Color getcolor()`
- Role: Handles the getcolor path.
- Description: Returns the color.

#### `public GOut reclip2(Coord ul, Coord br)`
- Role: Handles the reclip2 path.
- Description: Implements the reclip2 operation.

#### `public GOut reclip(Coord ul, Coord sz)`
- Role: Handles the reclip path.
- Description: Implements the reclip operation.

#### `public GOut reclipl2(Coord ul, Coord br)`
- Role: Handles the reclipl2 path.
- Description: Implements the reclipl2 operation.

#### `public GOut reclipl(Coord ul, Coord sz)`
- Role: Handles the reclipl path.
- Description: Implements the reclipl operation.

#### `public static void getpixel(Render g, Pipe state, FragData buf, Coord c, Consumer<Color> cb)`
- Role: Handles the getpixel path.
- Description: Returns the pixel.

#### `public void getpixel(Coord c, Consumer<Color> cb)`
- Role: Handles the getpixel path.
- Description: Returns the pixel.

#### `public static ByteBuffer flipimage(VectorFormat fmt, int w, ByteBuffer data)`
- Role: Handles the flipimage path.
- Description: Implements the flipimage operation.

#### `private static ByteBuffer filltorgb(ByteBuffer src, VectorFormat fmt)`
- Role: Handles the filltorgb path.
- Description: Implements the filltorgb operation.

#### `private static void debugimage(ByteBuffer data, Coord sz, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)`
- Role: Handles the debugimage path.
- Description: Implements the debugimage operation.

#### `public static void debugimage(Render g, Pipe state, FragData buf, Area area, VectorFormat fmt, Consumer<BufferedImage> cb)`
- Role: Handles the debugimage path.
- Description: Implements the debugimage operation.

#### `public static void getimage(Render g, Pipe state, FragData buf, Area area, Consumer<BufferedImage> cb)`
- Role: Handles the getimage path.
- Description: Returns the image.

#### `public void getimage(Coord ul, Coord sz, Consumer<BufferedImage> cb)`
- Role: Handles the getimage path.
- Description: Returns the image.

#### `public void getimage(Consumer<BufferedImage> cb)`
- Role: Handles the getimage path.
- Description: Returns the image.

#### `public static void debugimage(Render g, Texture.Image<?> img, VectorFormat fmt, boolean flip, Consumer<BufferedImage> cb)`
- Role: Handles the debugimage path.
- Description: Implements the debugimage operation.

#### `public static void debugimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`
- Role: Handles the debugimage path.
- Description: Implements the debugimage operation.

#### `public static void getimage(Render g, Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`
- Role: Handles the getimage path.
- Description: Returns the image.

#### `public void getimage(Texture.Image<?> img, boolean flip, Consumer<BufferedImage> cb)`
- Role: Handles the getimage path.
- Description: Returns the image.