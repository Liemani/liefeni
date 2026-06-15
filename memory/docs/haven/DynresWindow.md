# DynresWindow

This file documents the responsibilities and members of `DynresWindow`.

## Meta

- Source: [DynresWindow.java](../../../src/haven/DynresWindow.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays dynamic resource upload state.

## Nested Types

### $_

- Description: TODO

### Adder

- Description: TODO

### Display

- Description: TODO

### Image

- Description: TODO

### Owner

- Description: TODO

### PaletteCopy

- Description: TODO

### Preview

- Description: TODO

### PreviewWindow

- Description: TODO

### Spec

- Description: TODO

### Upload

- Description: TODO

### View

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<URI> service = Config.Services.var("dynresurl", "")`

- Description: TODO

#### `public static final Coord itemsz = UI.scale(128, 128)`

- Description: TODO

#### `public static final UID key = UID.of(1)`

- Description: TODO

#### `public static final OwnerContext.ClassResolver<Owner> ctxr = new OwnerContext.ClassResolver<Owner>()`

- Description: TODO

#### `public static final OwnerContext.ClassResolver<View> ctxr = new OwnerContext.ClassResolver<View>()`

- Description: TODO

### Fields

#### `public final Future<List<Preview.Spec>> previews = Preview.Spec.fetch()`

- Description: TODO

#### `public final Color[] pal`

- Description: TODO

#### `public final List<Image> imgs = new ArrayList<>()`

- Description: TODO

#### `private final Adder adder`

- Description: TODO

#### `public final Color[] pal`

- Description: TODO

#### `private final Map<DataFlavor, Supplier<Object>> types`

- Description: TODO

#### `private final List<Future<BufferedImage>> processing = new LinkedList<>()`

- Description: TODO

#### `private SListMenu menu`

- Description: TODO

#### `public final UID id`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `private BufferedImage img`

- Description: TODO

#### `private SListMenu menu`

- Description: TODO

#### `private TexRender tex = null`

- Description: TODO

#### `public final List<Spec> specs`

- Description: TODO

#### `public View view`

- Description: TODO

#### `private final Indir<Resource> vres`

- Description: TODO

#### `private final SDropBox<Spec, Widget> list`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final byte[] sdt`

- Description: TODO

#### `public final int sdtoff`

- Description: TODO

#### `public final Map<Integer, Indir<Resource>> resmap = new HashMap<>()`

- Description: TODO

#### `public final Pipe.Op st`

- Description: TODO

#### `public final Sprite.Owner bk`

- Description: TODO

#### `public final Indir<Resource> vres`

- Description: TODO

#### `public final Spec spec`

- Description: TODO

#### `private final Indir<Resource> vres`

- Description: TODO

#### `private Sprite spr`

- Description: TODO

#### `private RenderTree.Slot slot`

- Description: TODO

#### `private float field, elev, angl`

- Description: TODO

#### `private float field, elev, angl`

- Description: TODO

#### `private float field, elev, angl`

- Description: TODO

#### `private float tfield = Float.NaN, telev, tangl`

- Description: TODO

#### `private float tfield = Float.NaN, telev, tangl`

- Description: TODO

#### `private float tfield = Float.NaN, telev, tangl`

- Description: TODO

#### `private Coord dragstart`

- Description: TODO

#### `private UI.Grab grab`

- Description: TODO

#### `private float dragelev, dragangl`

- Description: TODO

#### `private float dragelev, dragangl`

- Description: TODO

#### `public final BufferedImage img`

- Description: TODO

#### `public final TexL tex`

- Description: TODO

#### `private final Display display`

- Description: TODO

#### `private final Button uploadbtn`

- Description: TODO

#### `private Upload upload`

- Description: TODO

#### `private Progress prog`

- Description: TODO

#### `volatile byte[] data`

- Description: TODO

#### `volatile int off`

- Description: TODO

#### `Map<String, Object> resp`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public DynresWindow(Color[] pal)`

- Description: TODO

#### `public static Map<String, Object> ttoresp(HttpURLConnection conn) throws IOException`

- Description: TODO

#### `public static String auth(Session sess)`

- Description: TODO

#### `public BufferedImage process(BufferedImage in)`

- Description: TODO

#### `public PaletteCopy(Color[] pal)`

- Description: TODO

#### `private BufferedImage img()`

- Description: TODO

#### `private String text()`

- Description: TODO

#### `public DataFlavor[] getTransferDataFlavors()`

- Description: TODO

#### `public boolean isDataFlavorSupported(DataFlavor f)`

- Description: TODO

#### `public Object getTransferData(DataFlavor f)`

- Description: TODO

#### `public void lostOwnership(Clipboard c, Transferable t)`

- Description: TODO

#### `public Adder(Coord sz)`

- Description: TODO

#### `private String mktip()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void create(Supplier<BufferedImage> img)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `private void open(File file)`

- Description: TODO

#### `private void open()`

- Description: TODO

#### `private BufferedImage getpaste(Clipboard c) throws IOException`

- Description: TODO

#### `private void paste()`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `private void copypal()`

- Description: TODO

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

#### `public boolean drophover(Coord c, boolean hovering, Object thing)`

- Description: TODO

#### `public boolean dropthing(Coord c, Object thing)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public Image(Coord sz, UID id)`

- Description: TODO

#### `public Image(UID id)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `private void craft(boolean master)`

- Description: TODO

#### `private void delete0()`

- Description: TODO

#### `private void delete()`

- Description: TODO

#### `private void copy()`

- Description: TODO

#### `public DataFlavor[] getTransferDataFlavors()`

- Description: TODO

#### `public boolean isDataFlavorSupported(DataFlavor f)`

- Description: TODO

#### `public BufferedImage getTransferData(DataFlavor f)`

- Description: TODO

#### `public void lostOwnership(Clipboard c, Transferable t)`

- Description: TODO

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

#### `public void setinfo(int fields, float outline)`

- Description: TODO

#### `public Preview(int minw, List<Spec> specs, TexL tex)`

- Description: TODO

#### `public static Indir<Resource> consres(TexL tex)`

- Description: TODO

#### `public void set(Spec spec)`

- Description: TODO

#### `public Spec(Map<String, Object> spec)`

- Description: TODO

#### `public static Future<List<Spec>> fetch()`

- Description: TODO

#### `public Owner(Sprite.Owner bk, Indir<Resource> vres)`

- Description: TODO

#### `public Indir<Resource> getres(int id)`

- Description: TODO

#### `public Indir<Resource> dynres(UID uid)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public Sprite create(Sprite.Owner owner, Indir<Resource> vres)`

- Description: TODO

#### `public View(Coord sz, Spec spec, Indir<Resource> vres)`

- Description: TODO

#### `private void makeproj()`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `protected FColor clearcolor()`

- Description: TODO

#### `public static Volume3f getbounds(RenderTree.Node spr)`

- Description: TODO

#### `private void updatecam(double dt)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void gtick(Render out)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `@SuppressWarnings("deprecation") public Resource getres()`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public PreviewWindow(BufferedImage img, List<Preview.Spec> previews)`

- Description: TODO

#### `public Display(Coord sz)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void reqclose()`

- Description: TODO

#### `void prepare() throws IOException`

- Description: TODO

#### `void post() throws IOException`

- Description: TODO

#### `void handle() throws IOException`

- Description: TODO

#### `void restore()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `float prog()`

- Description: TODO

#### `String text()`

- Description: TODO

#### `public void upload()`

- Description: TODO

#### `private void arrange()`

- Description: TODO

#### `private Image find(UID id)`

- Description: TODO

#### `public void uimsg(String nm, Object... args)`

- Description: TODO
