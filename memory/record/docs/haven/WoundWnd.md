---
source: [WoundWnd.java](../../../../src/haven/WoundWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# WoundWnd

Represents the wound wnd Haven component.

## Nested Types

### $_

- Role: Represents $ within WoundWnd.
- Description: Describes the nested $  type used by the enclosing class.

### $wound

- Role: Represents $wound within WoundWnd.
- Description: Describes the nested $wound type used by the enclosing class.

### Info

- Role: Represents info within WoundWnd.
- Description: Describes the nested info type used by the enclosing class.

### Item

- Role: Represents item within WoundWnd.
- Description: Describes the nested item type used by the enclosing class.

### QuickInfo

- Role: Represents quick info within WoundWnd.
- Description: Describes the nested quick info type used by the enclosing class.

### Wound

- Role: Represents wound within WoundWnd.
- Description: Describes the nested wound type used by the enclosing class.

### WoundBox

- Role: Represents wound box within WoundWnd.
- Description: Describes the nested wound box type used by the enclosing class.

### WoundList

- Role: Represents wound list within WoundWnd.
- Description: Describes the nested wound list type used by the enclosing class.

### WoundPagina

- Role: Represents wound pagina within WoundWnd.
- Description: Describes the nested wound pagina type used by the enclosing class.

## Members

### Constants

#### `public static final Text.Foundry namef = new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true)`
- Role: Implements the namef operation.
- Description: Implements the aa operation.
- Value: `new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true)`

#### `private static final OwnerContext.ClassResolver<Wound> ctxr = new OwnerContext.ClassResolver<Wound>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<wound> ctxr = new owner context.class resolver<wound>() operation.
- Value: `new OwnerContext.ClassResolver<Wound>()`

### Fields

#### `public final Widget woundbox`
- Role: Caches the woundbox value.
- Description: Caches the `woundbox` value for reuse.

#### `public final WoundList wounds`
- Role: Caches the wounds value.
- Description: Caches the `wounds` value for reuse.

#### `public Wound.Info wound`
- Role: Caches the wound value.
- Description: Caches the `wound` value for reuse.

#### `public final RichText.Document doc`
- Role: Caches the doc value.
- Description: Caches the `doc` value for reuse.

#### `public final Glob glob`
- Role: Caches the glob value.
- Description: Caches the `glob` value for reuse.

#### `public final int id, parentid`
- Role: Caches the parentid value.
- Description: Caches the `parentid` value for reuse.

#### `public final int id, parentid`
- Role: Caches the parentid value.
- Description: Caches the `parentid` value for reuse.

#### `public Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public int level`
- Role: Caches the level value.
- Description: Caches the `level` value for reuse.

#### `public ItemInfo.Raw rawinfo`
- Role: Caches the rawinfo value.
- Description: Caches the `rawinfo` value for reuse.

#### `private String sortkey = "\uffff"`
- Role: Caches the sortkey value.
- Description: Caches the `sortkey` value for reuse.

#### `private List<ItemInfo> info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private List<ItemInfo> info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `public List<Wound> wounds = new ArrayList<Wound>()`
- Role: Implements the wounds operation.
- Description: Implements the public list<wound> wounds = new array list<wound>() operation.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Tracks whether  is currently loading.

#### `private final Comparator<Wound> wcomp = new Comparator<Wound>()`
- Role: Implements the wcomp operation.
- Description: Implements the private final comparator<wound> wcomp = new comparator<wound>() operation.

#### `public final Wound w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `private Widget qd, nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `private Widget qd, nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `private Object dres, dinfo`
- Role: Caches the dinfo value.
- Description: Caches the `dinfo` value for reuse.

#### `private Object dres, dinfo`
- Role: Caches the dinfo value.
- Description: Caches the `dinfo` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public default Widget qwdg(int h)`
- Role: Handles the qwdg path.
- Description: Implements the qwdg operation.

#### `public default String qstr()`
- Role: Handles the qstr path.
- Description: Implements the qstr operation.

#### `public default int qprio()`
- Role: Handles the qprio path.
- Description: Implements the qprio operation.

#### `public WoundPagina(Owner owner, RichText.Document doc)`
- Role: Handles the wound pagina path.
- Description: Implements the wound pagina operation.

#### `public WoundPagina(Owner owner, Resource.Pagina pag)`
- Role: Handles the wound pagina path.
- Description: Implements the wound pagina operation.

#### `public void layout(Layout l)`
- Role: Handles the layout path.
- Description: Lays out parts on wrapped lines and aligns their baselines.

#### `public int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `private Wound(Glob glob, int id, Indir<Resource> res, int parentid)`
- Role: Handles the wound path.
- Description: Implements the wound operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Resource resource()`
- Role: Handles the resource path.
- Description: Implements the resource operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public BufferedImage icon()`
- Role: Handles the icon path.
- Description: Implements the icon operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public int woundid()`
- Role: Handles the woundid path.
- Description: Implements the woundid operation.

#### `public WoundBox(int id)`
- Role: Handles the wound box path.
- Description: Implements the wound box operation.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public Wound wound()`
- Role: Handles the wound path.
- Description: Implements the wound operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `public BufferedImage renderinfo(int width)`
- Role: Handles the renderinfo path.
- Description: Renders the info.

#### `public int woundid()`
- Role: Handles the woundid path.
- Description: Implements the woundid operation.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private WoundList(Coord sz)`
- Role: Handles the wound list path.
- Description: Implements the wound list operation.

#### `protected List<Wound> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Widget makeitem(Wound w, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `private List<Wound> treesort(List<Wound> from, int pid, int level)`
- Role: Handles the treesort path.
- Description: Implements the treesort operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public Item(Coord sz, Wound w)`
- Role: Handles the item path.
- Description: Implements the item operation.

#### `private QuickInfo getqdat(List<ItemInfo> info)`
- Role: Handles the getqdat path.
- Description: Returns the qdat.

#### `private void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Handles the drop path.
- Description: Implements the drop operation.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Handles the iteminteract path.
- Description: Implements the iteminteract operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the WoundWnd content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `protected void drawslot(GOut g, Wound w, int idx, Area area)`
- Role: Handles the drawslot path.
- Description: Draws the slot.

#### `protected boolean unselect(int button)`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `public Wound get(int id)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void add(Wound w)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Wound remove(int id)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public WoundWnd()`
- Role: Creates a new WoundWnd instance.
- Description: Constructs the WoundWnd instance from the supplied inputs.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `private void decwound(Object[] args, int a, int len)`
- Role: Handles the decwound path.
- Description: Implements the decwound operation.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.