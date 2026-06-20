---
source: [DynresWindow.java](../../../src/haven/DynresWindow.java)
created: 2026-06-13
updated: 2026-06-14
---

# DynresWindow

Represents the dynres window Haven component.

## Nested Types

### $_

- Role: Represents $ within DynresWindow.
- Description: Describes the nested $  type used by the enclosing class.

### Adder

- Role: Represents adder within DynresWindow.
- Description: Describes the nested adder type used by the enclosing class.

### Display

- Role: Represents display within DynresWindow.
- Description: Describes the nested display type used by the enclosing class.

### Image

- Role: Represents image within DynresWindow.
- Description: Describes the nested image type used by the enclosing class.

### Owner

- Role: Represents owner within DynresWindow.
- Description: Describes the nested owner type used by the enclosing class.

### PaletteCopy

- Role: Represents palette copy within DynresWindow.
- Description: Describes the nested palette copy type used by the enclosing class.

### Preview

- Role: Represents preview within DynresWindow.
- Description: Describes the nested preview type used by the enclosing class.

### PreviewWindow

- Role: Represents preview window within DynresWindow.
- Description: Describes the nested preview window type used by the enclosing class.

### Spec

- Role: Represents spec within DynresWindow.
- Description: Describes the nested spec type used by the enclosing class.

### Upload

- Role: Represents upload within DynresWindow.
- Description: Describes the nested upload type used by the enclosing class.

### View

- Role: Represents view within DynresWindow.
- Description: Describes the nested view type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<URI> service = Config.Services.var("dynresurl", "")`
- Role: Defines the shared service constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord itemsz = UI.scale(128, 128)`
- Role: Defines the shared itemsz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final UID key = UID.of(1)`
- Role: Defines the shared key constant.
- Description: Shared constant used by the rest of the class.

#### `public static final OwnerContext.ClassResolver<Owner> ctxr = new OwnerContext.ClassResolver<Owner>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final OwnerContext.ClassResolver<View> ctxr = new OwnerContext.ClassResolver<View>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Future<List<Preview.Spec>> previews = Preview.Spec.fetch()`
- Role: Caches previews entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Color[] pal`
- Role: Stores the pal value.
- Description: Backs the cached state for this file.

#### `public final List<Image> imgs = new ArrayList<>()`
- Role: Caches imgs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Adder adder`
- Role: Holds the adder state.
- Description: Backs the cached state for this file.

#### `public final Color[] pal`
- Role: Stores the pal value.
- Description: Backs the cached state for this file.

#### `private final Map<DataFlavor, Supplier<Object>> types`
- Role: Caches types entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final List<Future<BufferedImage>> processing = new LinkedList<>()`
- Role: Caches processing entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private SListMenu menu`
- Role: Holds the menu state.
- Description: Backs the cached state for this file.

#### `public final UID id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `private BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `private SListMenu menu`
- Role: Holds the menu state.
- Description: Backs the cached state for this file.

#### `private TexRender tex = null`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `public final List<Spec> specs`
- Role: Caches specs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public View view`
- Role: Holds the view state.
- Description: Backs the cached state for this file.

#### `private final Indir<Resource> vres`
- Role: Stores the vres value.
- Description: Backs the cached state for this file.

#### `private final SDropBox<Spec, Widget> list`
- Role: Stores the list value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final byte[] sdt`
- Role: Stores the sdt value.
- Description: Backs the cached state for this file.

#### `public final int sdtoff`
- Role: Stores the sdtoff value.
- Description: Backs the cached state for this file.

#### `public final Map<Integer, Indir<Resource>> resmap = new HashMap<>()`
- Role: Caches resmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Pipe.Op st`
- Role: Holds the st state.
- Description: Backs the cached state for this file.

#### `public final Sprite.Owner bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> vres`
- Role: Stores the vres value.
- Description: Backs the cached state for this file.

#### `public final Spec spec`
- Role: Holds the spec state.
- Description: Backs the cached state for this file.

#### `private final Indir<Resource> vres`
- Role: Stores the vres value.
- Description: Backs the cached state for this file.

#### `private Sprite spr`
- Role: Holds the spr state.
- Description: Backs the cached state for this file.

#### `private RenderTree.Slot slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

#### `private float field, elev, angl`
- Role: Stores the angl value.
- Description: Backs the cached state for this file.

#### `private float field, elev, angl`
- Role: Stores the angl value.
- Description: Backs the cached state for this file.

#### `private float field, elev, angl`
- Role: Stores the angl value.
- Description: Backs the cached state for this file.

#### `private float tfield = Float.NaN, telev, tangl`
- Role: Stores the tfield value.
- Description: Backs the cached state for this file.

#### `private float tfield = Float.NaN, telev, tangl`
- Role: Stores the tfield value.
- Description: Backs the cached state for this file.

#### `private float tfield = Float.NaN, telev, tangl`
- Role: Stores the tfield value.
- Description: Backs the cached state for this file.

#### `private Coord dragstart`
- Role: Stores the dragstart value.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

#### `private float dragelev, dragangl`
- Role: Stores the dragangl value.
- Description: Backs the cached state for this file.

#### `private float dragelev, dragangl`
- Role: Stores the dragangl value.
- Description: Backs the cached state for this file.

#### `public final BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `public final TexL tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `private final Display display`
- Role: Holds the display state.
- Description: Backs the cached state for this file.

#### `private final Button uploadbtn`
- Role: Holds the uploadbtn state.
- Description: Backs the cached state for this file.

#### `private Upload upload`
- Role: Holds the upload state.
- Description: Backs the cached state for this file.

#### `private Progress prog`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

#### `volatile byte[] data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `volatile int off`
- Role: Stores the off value.
- Description: Backs the cached state for this file.

#### `Map<String, Object> resp`
- Role: Caches resp entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public DynresWindow(Color[] pal)`
- Role: Creates a new DynresWindow instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Map<String, Object> ttoresp(HttpURLConnection conn) throws IOException`
- Role: Handles the ttoresp workflow.
- Description: Supports the ttoresp operation used by the surrounding class.

#### `public static String auth(Session sess)`
- Role: Performs auth.
- Description: Supports the auth operation used by the surrounding class.

#### `public BufferedImage process(BufferedImage in)`
- Role: Performs process.
- Description: Supports the process operation used by the surrounding class.

#### `public PaletteCopy(Color[] pal)`
- Role: Performs palette copy.
- Description: Supports the palette copy operation used by the surrounding class.

#### `private BufferedImage img()`
- Role: Performs img.
- Description: Supports the img operation used by the surrounding class.

#### `private String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public DataFlavor[] getTransferDataFlavors()`
- Role: Returns the transfer data flavors.
- Description: Exposes the requested value without mutating state.

#### `public boolean isDataFlavorSupported(DataFlavor f)`
- Role: Checks whether the data flavor supported.
- Description: Returns a boolean result for the described condition.

#### `public Object getTransferData(DataFlavor f)`
- Role: Returns the transfer data.
- Description: Exposes the requested value without mutating state.

#### `public void lostOwnership(Clipboard c, Transferable t)`
- Role: Performs lost ownership.
- Description: Supports the lost ownership operation used by the surrounding class.

#### `public Adder(Coord sz)`
- Role: Performs adder.
- Description: Supports the adder operation used by the surrounding class.

#### `private String mktip()`
- Role: Performs mktip.
- Description: Supports the mktip operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void create(Supplier<BufferedImage> img)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `private void open(File file)`
- Role: Opens the current resource.
- Description: Supports the open operation used by the surrounding class.

#### `private void open()`
- Role: Opens the current resource.
- Description: Supports the open operation used by the surrounding class.

#### `private BufferedImage getpaste(Clipboard c) throws IOException`
- Role: Returns the paste value.
- Description: Exposes the requested value without mutating state.

#### `private void paste()`
- Role: Performs paste.
- Description: Supports the paste operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `private void copypal()`
- Role: Performs copypal.
- Description: Supports the copypal operation used by the surrounding class.

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`
- Role: Performs mousehover.
- Description: Supports the mousehover operation used by the surrounding class.

#### `public boolean drophover(Coord c, boolean hovering, Object thing)`
- Role: Performs drophover.
- Description: Supports the drophover operation used by the surrounding class.

#### `public boolean dropthing(Coord c, Object thing)`
- Role: Performs dropthing.
- Description: Supports the dropthing operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public Image(Coord sz, UID id)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public Image(UID id)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private void craft(boolean master)`
- Role: Performs craft.
- Description: Supports the craft operation used by the surrounding class.

#### `private void delete0()`
- Role: Performs delete0.
- Description: Supports the delete0 operation used by the surrounding class.

#### `private void delete()`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `private void copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public DataFlavor[] getTransferDataFlavors()`
- Role: Returns the transfer data flavors.
- Description: Exposes the requested value without mutating state.

#### `public boolean isDataFlavorSupported(DataFlavor f)`
- Role: Checks whether the data flavor supported.
- Description: Returns a boolean result for the described condition.

#### `public BufferedImage getTransferData(DataFlavor f)`
- Role: Returns the transfer data.
- Description: Exposes the requested value without mutating state.

#### `public void lostOwnership(Clipboard c, Transferable t)`
- Role: Performs lost ownership.
- Description: Supports the lost ownership operation used by the surrounding class.

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`
- Role: Performs mousehover.
- Description: Supports the mousehover operation used by the surrounding class.

#### `public void setinfo(int fields, float outline)`
- Role: Performs setinfo.
- Description: Supports the setinfo operation used by the surrounding class.

#### `public Preview(int minw, List<Spec> specs, TexL tex)`
- Role: Performs preview.
- Description: Supports the preview operation used by the surrounding class.

#### `public static Indir<Resource> consres(TexL tex)`
- Role: Performs consres.
- Description: Supports the consres operation used by the surrounding class.

#### `public void set(Spec spec)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public Spec(Map<String, Object> spec)`
- Role: Performs spec.
- Description: Supports the spec operation used by the surrounding class.

#### `public static Future<List<Spec>> fetch()`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public Owner(Sprite.Owner bk, Indir<Resource> vres)`
- Role: Performs owner.
- Description: Supports the owner operation used by the surrounding class.

#### `public Indir<Resource> getres(int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Indir<Resource> dynres(UID uid)`
- Role: Performs dynres.
- Description: Supports the dynres operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Sprite create(Sprite.Owner owner, Indir<Resource> vres)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public View(Coord sz, Spec spec, Indir<Resource> vres)`
- Role: Performs view.
- Description: Supports the view operation used by the surrounding class.

#### `private void makeproj()`
- Role: Performs makeproj.
- Description: Supports the makeproj operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `protected FColor clearcolor()`
- Role: Returns the clear color value.
- Description: Exposes the requested value without mutating state.

#### `public static Volume3f getbounds(RenderTree.Node spr)`
- Role: Performs getbounds.
- Description: Supports the getbounds operation used by the surrounding class.

#### `private void updatecam(double dt)`
- Role: Performs updatecam.
- Description: Supports the updatecam operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render out)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `@SuppressWarnings("deprecation") public Resource getres()`
- Role: Performs suppress warnings.
- Description: Supports the suppress warnings operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public PreviewWindow(BufferedImage img, List<Preview.Spec> previews)`
- Role: Performs preview window.
- Description: Supports the preview window operation used by the surrounding class.

#### `public Display(Coord sz)`
- Role: Performs display.
- Description: Supports the display operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void reqclose()`
- Role: Performs reqclose.
- Description: Supports the reqclose operation used by the surrounding class.

#### `void prepare() throws IOException`
- Role: Handles the prepare workflow.
- Description: Supports the prepare operation used by the surrounding class.

#### `void post() throws IOException`
- Role: Handles the post workflow.
- Description: Supports the post operation used by the surrounding class.

#### `void handle() throws IOException`
- Role: Handles the current event.
- Description: Supports the handle operation used by the surrounding class.

#### `void restore()`
- Role: Performs restore.
- Description: Supports the restore operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `float prog()`
- Role: Performs prog.
- Description: Supports the prog operation used by the surrounding class.

#### `String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public void upload()`
- Role: Performs upload.
- Description: Supports the upload operation used by the surrounding class.

#### `private void arrange()`
- Role: Performs arrange.
- Description: Supports the arrange operation used by the surrounding class.

#### `private Image find(UID id)`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
