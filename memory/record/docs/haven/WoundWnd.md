---
source: [WoundWnd.java](../../../src/haven/WoundWnd.java)
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
- Role: Defines the shared namef constant.
- Description: Shared constant used by the rest of the class.

#### `private static final OwnerContext.ClassResolver<Wound> ctxr = new OwnerContext.ClassResolver<Wound>()`
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Widget woundbox`
- Role: Stores the woundbox value.
- Description: Backs the cached state for this file.

#### `public final WoundList wounds`
- Role: Caches wounds entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Wound.Info wound`
- Role: Holds the wound state.
- Description: Backs the cached state for this file.

#### `public final RichText.Document doc`
- Role: Stores the doc value.
- Description: Backs the cached state for this file.

#### `public final Glob glob`
- Role: Stores the glob value.
- Description: Backs the cached state for this file.

#### `public final int id, parentid`
- Role: Stores the parentid value.
- Description: Backs the cached state for this file.

#### `public final int id, parentid`
- Role: Stores the parentid value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public int level`
- Role: Stores the level value.
- Description: Backs the cached state for this file.

#### `public ItemInfo.Raw rawinfo`
- Role: Holds the rawinfo state.
- Description: Backs the cached state for this file.

#### `private String sortkey = "\uffff"`
- Role: Stores the sortkey value.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private List<ItemInfo> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<Wound> wounds = new ArrayList<Wound>()`
- Role: Caches wounds entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Supports the loading operation used by the surrounding class.

#### `private final Comparator<Wound> wcomp = new Comparator<Wound>()`
- Role: Holds the wcomp state.
- Description: Backs the cached state for this file.

#### `public final Wound w`
- Role: Holds the w state.
- Description: Backs the cached state for this file.

#### `private Widget qd, nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `private Widget qd, nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `private Object dres, dinfo`
- Role: Holds the dinfo state.
- Description: Backs the cached state for this file.

#### `private Object dres, dinfo`
- Role: Holds the dinfo state.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public default Widget qwdg(int h)`
- Role: Performs qwdg.
- Description: Supports the qwdg operation used by the surrounding class.

#### `public default String qstr()`
- Role: Performs qstr.
- Description: Supports the qstr operation used by the surrounding class.

#### `public default int qprio()`
- Role: Performs qprio.
- Description: Supports the qprio operation used by the surrounding class.

#### `public WoundPagina(Owner owner, RichText.Document doc)`
- Role: Performs wound pagina.
- Description: Supports the wound pagina operation used by the surrounding class.

#### `public WoundPagina(Owner owner, Resource.Pagina pag)`
- Role: Performs wound pagina.
- Description: Supports the wound pagina operation used by the surrounding class.

#### `public void layout(Layout l)`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `private Wound(Glob glob, int id, Indir<Resource> res, int parentid)`
- Role: Performs wound.
- Description: Supports the wound operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Resource resource()`
- Role: Performs resource.
- Description: Supports the resource operation used by the surrounding class.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public BufferedImage icon()`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public int woundid()`
- Role: Performs woundid.
- Description: Supports the woundid operation used by the surrounding class.

#### `public WoundBox(int id)`
- Role: Performs wound box.
- Description: Supports the wound box operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public Wound wound()`
- Role: Performs wound.
- Description: Supports the wound operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `public BufferedImage renderinfo(int width)`
- Role: Performs renderinfo.
- Description: Supports the renderinfo operation used by the surrounding class.

#### `public int woundid()`
- Role: Performs woundid.
- Description: Supports the woundid operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private WoundList(Coord sz)`
- Role: Performs wound list.
- Description: Supports the wound list operation used by the surrounding class.

#### `protected List<Wound> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Widget makeitem(Wound w, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `private List<Wound> treesort(List<Wound> from, int pid, int level)`
- Role: Performs treesort.
- Description: Supports the treesort operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public Item(Coord sz, Wound w)`
- Role: Performs item.
- Description: Supports the item operation used by the surrounding class.

#### `private QuickInfo getqdat(List<ItemInfo> info)`
- Role: Performs getqdat.
- Description: Supports the getqdat operation used by the surrounding class.

#### `private void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public boolean drop(Coord cc, Coord ul)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public boolean iteminteract(Coord cc, Coord ul)`
- Role: Performs iteminteract.
- Description: Supports the iteminteract operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `protected void drawslot(GOut g, Wound w, int idx, Area area)`
- Role: Performs drawslot.
- Description: Supports the drawslot operation used by the surrounding class.

#### `protected boolean unselect(int button)`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `public Wound get(int id)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void add(Wound w)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Wound remove(int id)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public WoundWnd()`
- Role: Creates a new WoundWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `private void decwound(Object[] args, int a, int len)`
- Role: Performs decwound.
- Description: Supports the decwound operation used by the surrounding class.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
