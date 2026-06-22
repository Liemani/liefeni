---
source: [DynresWindow.java](../../../../src/haven/DynresWindow.java)
created: 2026-06-13
updated: 2026-06-14
---

# DynresWindow

Represents the dynres window Haven component.

## Nested Types

### $_

- Role: Registers the `dynres` widget factory.
- Description: Creates the dynamic-resource browser window.

### Adder

- Role: Handles palette additions from dynamic resource data.
- Description: Coordinates how new preview images are appended to the window.

### Display

- Role: Shows one dynamic-resource preview entry.
- Description: Renders the preview image and associated metadata.

### Image

- Role: Stores one imported dynamic-resource image.
- Description: Keeps the selected image and its transfer state.

### Owner

- Role: Supplies owner-context access for dynamic resources.
- Description: Resolves the current window and session context for dynamic-resource operations.

### PaletteCopy

- Role: Copies the palette for a dynamic-resource preview.
- Description: Converts the current palette into a transportable form.

### Preview

- Role: Represents one previewable dynamic resource.
- Description: Stores the preview metadata and current image.

### PreviewWindow

- Role: Renders the preview in a separate window.
- Description: Shows one preview resource in an isolated popup.

### Spec

- Role: Describes one dynamic-resource specification.
- Description: Stores the resource id and image transfer data.

### Upload

- Role: Uploads a dynamic-resource image.
- Description: Sends the image data to the configured service.

### View

- Role: Displays one dynamic-resource thumbnail view.
- Description: Renders the preview and handles selection focus.

## Members

### Constants

#### `public static final Config.Variable<URI> service = Config.Services.var("dynresurl", "")`
- Role: Implements the service operation.
- Description: Implements the var operation.
- Value: `Config.Services.var("dynresurl", "")`

#### `public static final Coord itemsz = UI.scale(128, 128)`
- Role: Implements the itemsz operation.
- Description: Implements the scale operation.
- Value: `UI.scale(128, 128)`

#### `public static final UID key = UID.of(1)`
- Role: Implements the key operation.
- Description: Implements the of operation.
- Value: `UID.of(1)`

#### `public static final OwnerContext.ClassResolver<Owner> ctxr = new OwnerContext.ClassResolver<Owner>()`
- Role: Implements the ctxr operation.
- Description: Implements the public static final owner context.class resolver<owner> ctxr = new owner context.class resolver<owner>() operation.
- Value: `new OwnerContext.ClassResolver<Owner>()`

#### `public static final OwnerContext.ClassResolver<View> ctxr = new OwnerContext.ClassResolver<View>()`
- Role: Implements the ctxr operation.
- Description: Implements the public static final owner context.class resolver<view> ctxr = new owner context.class resolver<view>() operation.
- Value: `new OwnerContext.ClassResolver<View>()`

### Fields

#### `public final Future<List<Preview.Spec>> previews = Preview.Spec.fetch()`
- Role: Implements the previews operation.
- Description: Implements the fetch operation.

#### `public final Color[] pal`
- Role: Caches the pal value.
- Description: Caches the `pal` value for reuse.

#### `public final List<Image> imgs = new ArrayList<>()`
- Role: Implements the imgs operation.
- Description: Implements the public final list<image> imgs = new array list<>() operation.

#### `private final Adder adder`
- Role: Caches the adder value.
- Description: Caches the `adder` value for reuse.

#### `public final Color[] pal`
- Role: Caches the pal value.
- Description: Caches the `pal` value for reuse.

#### `private final Map<DataFlavor, Supplier<Object>> types`
- Role: Caches the types value.
- Description: Caches the `types` value for reuse.

#### `private final List<Future<BufferedImage>> processing = new LinkedList<>()`
- Role: Implements the processing operation.
- Description: Implements the private final list<future<buffered image>> processing = new linked list<>() operation.

#### `private SListMenu menu`
- Role: Caches the menu value.
- Description: Caches the `menu` value for reuse.

#### `public final UID id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `private BufferedImage img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `private SListMenu menu`
- Role: Caches the menu value.
- Description: Caches the `menu` value for reuse.

#### `private TexRender tex = null`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public final List<Spec> specs`
- Role: Caches the specs value.
- Description: Caches the `specs` value for reuse.

#### `public View view`
- Role: Caches the view value.
- Description: Caches the `view` value for reuse.

#### `private final Indir<Resource> vres`
- Role: Caches the vres value.
- Description: Caches the `vres` value for reuse.

#### `private final SDropBox<Spec, Widget> list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final byte[] sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

#### `public final int sdtoff`
- Role: Caches the sdtoff value.
- Description: Caches the `sdtoff` value for reuse.

#### `public final Map<Integer, Indir<Resource>> resmap = new HashMap<>()`
- Role: Implements the resmap operation.
- Description: Implements the public final map<integer, indir<resource>> resmap = new hash map<>() operation.

#### `public final Pipe.Op st`
- Role: Caches the st value.
- Description: Caches the `st` value for reuse.

#### `public final Sprite.Owner bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public final Indir<Resource> vres`
- Role: Caches the vres value.
- Description: Caches the `vres` value for reuse.

#### `public final Spec spec`
- Role: Caches the spec value.
- Description: Caches the `spec` value for reuse.

#### `private final Indir<Resource> vres`
- Role: Caches the vres value.
- Description: Caches the `vres` value for reuse.

#### `private Sprite spr`
- Role: Caches the spr value.
- Description: Caches the `spr` value for reuse.

#### `private RenderTree.Slot slot`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

#### `private float field, elev, angl`
- Role: Caches the angl value.
- Description: Caches the `angl` value for reuse.

#### `private float field, elev, angl`
- Role: Caches the angl value.
- Description: Caches the `angl` value for reuse.

#### `private float field, elev, angl`
- Role: Caches the angl value.
- Description: Caches the `angl` value for reuse.

#### `private float tfield = Float.NaN, telev, tangl`
- Role: Caches the tfield value.
- Description: Caches the `tfield` value for reuse.

#### `private float tfield = Float.NaN, telev, tangl`
- Role: Caches the tfield value.
- Description: Caches the `tfield` value for reuse.

#### `private float tfield = Float.NaN, telev, tangl`
- Role: Caches the tfield value.
- Description: Caches the `tfield` value for reuse.

#### `private Coord dragstart`
- Role: Caches the dragstart value.
- Description: Caches the `dragstart` value for reuse.

#### `private UI.Grab grab`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

#### `private float dragelev, dragangl`
- Role: Caches the dragangl value.
- Description: Caches the `dragangl` value for reuse.

#### `private float dragelev, dragangl`
- Role: Caches the dragangl value.
- Description: Caches the `dragangl` value for reuse.

#### `public final BufferedImage img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `public final TexL tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `private final Display display`
- Role: Holds the visible grid slices currently rendered on the minimap.
- Description: Holds the visible grid slices currently rendered on the minimap.

#### `private final Button uploadbtn`
- Role: Caches the uploadbtn value.
- Description: Caches the `uploadbtn` value for reuse.

#### `private Upload upload`
- Role: Caches the upload value.
- Description: Caches the `upload` value for reuse.

#### `private Progress prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `volatile byte[] data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `volatile int off`
- Role: Caches the off value.
- Description: Caches the `off` value for reuse.

#### `Map<String, Object> resp`
- Role: Caches the resp value.
- Description: Caches the `resp` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public DynresWindow(Color[] pal)`
- Role: Creates a new DynresWindow instance.
- Description: Constructs the DynresWindow instance from the supplied inputs.

#### `public static Map<String, Object> ttoresp(HttpURLConnection conn) throws IOException`
- Role: Handles the ttoresp workflow.
- Description: Implements the ttoresp operation.

#### `public static String auth(Session sess)`
- Role: Handles the auth path.
- Description: Implements the auth operation.

#### `public BufferedImage process(BufferedImage in)`
- Role: Handles the process path.
- Description: Implements the process operation.

#### `public PaletteCopy(Color[] pal)`
- Role: Handles the palette copy path.
- Description: Implements the palette copy operation.

#### `private BufferedImage img()`
- Role: Handles the img path.
- Description: Implements the img operation.

#### `private String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public DataFlavor[] getTransferDataFlavors()`
- Role: Returns the transfer data flavors.
- Description: Returns the transfer data flavors.

#### `public boolean isDataFlavorSupported(DataFlavor f)`
- Role: Checks whether the data flavor supported.
- Description: Returns whether the condition is satisfied.

#### `public Object getTransferData(DataFlavor f)`
- Role: Returns the transfer data.
- Description: Returns the transfer data.

#### `public void lostOwnership(Clipboard c, Transferable t)`
- Role: Handles the lost ownership path.
- Description: Implements the lost ownership operation.

#### `public Adder(Coord sz)`
- Role: Handles the adder path.
- Description: Implements the adder operation.

#### `private String mktip()`
- Role: Handles the mktip path.
- Description: Implements the mktip operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the DynresWindow content.

#### `public void create(Supplier<BufferedImage> img)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `private void open(File file)`
- Role: Opens the current resource.
- Description: Opens or creates the requested resource.

#### `private void open()`
- Role: Opens the current resource.
- Description: Opens or creates the requested resource.

#### `private BufferedImage getpaste(Clipboard c) throws IOException`
- Role: Returns the paste.
- Description: Returns the paste.

#### `private void paste()`
- Role: Handles the paste path.
- Description: Implements the paste operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `private void copypal()`
- Role: Handles the copypal path.
- Description: Implements the copypal operation.

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`
- Role: Handles the mousehover path.
- Description: Updates hover state and tooltip selection for minimap content.

#### `public boolean drophover(Coord c, boolean hovering, Object thing)`
- Role: Handles the drophover path.
- Description: Dispatches a hover event through the widget tree.

#### `public boolean dropthing(Coord c, Object thing)`
- Role: Handles the dropthing path.
- Description: Dispatches a drop event through the widget tree.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public Image(Coord sz, UID id)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public Image(UID id)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the DynresWindow content.

#### `private void craft(boolean master)`
- Role: Handles the craft path.
- Description: Implements the craft operation.

#### `private void delete0()`
- Role: Handles the delete0 path.
- Description: Implements the delete0 operation.

#### `private void delete()`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.

#### `private void copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public DataFlavor[] getTransferDataFlavors()`
- Role: Returns the transfer data flavors.
- Description: Returns the transfer data flavors.

#### `public boolean isDataFlavorSupported(DataFlavor f)`
- Role: Checks whether the data flavor supported.
- Description: Returns whether the condition is satisfied.

#### `public BufferedImage getTransferData(DataFlavor f)`
- Role: Returns the transfer data.
- Description: Returns the transfer data.

#### `public void lostOwnership(Clipboard c, Transferable t)`
- Role: Handles the lost ownership path.
- Description: Implements the lost ownership operation.

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`
- Role: Handles the mousehover path.
- Description: Updates hover state and tooltip selection for minimap content.

#### `public void setinfo(int fields, float outline)`
- Role: Handles the setinfo path.
- Description: Updates the info.

#### `public Preview(int minw, List<Spec> specs, TexL tex)`
- Role: Handles the preview path.
- Description: Implements the preview operation.

#### `public static Indir<Resource> consres(TexL tex)`
- Role: Handles the consres path.
- Description: Implements the consres operation.

#### `public void set(Spec spec)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public Spec(Map<String, Object> spec)`
- Role: Handles the spec path.
- Description: Implements the spec operation.

#### `public static Future<List<Spec>> fetch()`
- Role: Fetches the target value.
- Description: Opens the requested cached resource for reading.

#### `public Owner(Sprite.Owner bk, Indir<Resource> vres)`
- Role: Handles the owner path.
- Description: Implements the owner operation.

#### `public Indir<Resource> getres(int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Indir<Resource> dynres(UID uid)`
- Role: Handles the dynres path.
- Description: Implements the dynres operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Sprite create(Sprite.Owner owner, Indir<Resource> vres)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public View(Coord sz, Spec spec, Indir<Resource> vres)`
- Role: Handles the view path.
- Description: Implements the view operation.

#### `private void makeproj()`
- Role: Handles the makeproj path.
- Description: Implements the makeproj operation.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `protected FColor clearcolor()`
- Role: Clears the color.
- Description: Clears the color.

#### `public static Volume3f getbounds(RenderTree.Node spr)`
- Role: Handles the getbounds path.
- Description: Returns the bounds.

#### `private void updatecam(double dt)`
- Role: Handles the updatecam path.
- Description: Updates the cam.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void gtick(Render out)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `@SuppressWarnings("deprecation") public Resource getres()`
- Role: Handles the suppress warnings path.
- Description: Returns the res.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public PreviewWindow(BufferedImage img, List<Preview.Spec> previews)`
- Role: Handles the preview window path.
- Description: Implements the preview window operation.

#### `public Display(Coord sz)`
- Role: Handles the display path.
- Description: Implements the display operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the DynresWindow content.

#### `public void reqclose()`
- Role: Handles the reqclose path.
- Description: Implements the reqclose operation.

#### `void prepare() throws IOException`
- Role: Handles the prepare workflow.
- Description: Implements the prepare operation.

#### `void post() throws IOException`
- Role: Handles the post workflow.
- Description: Implements the post operation.

#### `void handle() throws IOException`
- Role: Implements the handle operation.
- Description: Implements the handle operation.

#### `void restore()`
- Role: Handles the restore path.
- Description: Implements the restore operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `float prog()`
- Role: Handles the prog path.
- Description: Implements the prog operation.

#### `String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public void upload()`
- Role: Handles the upload path.
- Description: Implements the upload operation.

#### `private void arrange()`
- Role: Handles the arrange path.
- Description: Implements the arrange operation.

#### `private Image find(UID id)`
- Role: Handles the find path.
- Description: Finds the requested data.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.