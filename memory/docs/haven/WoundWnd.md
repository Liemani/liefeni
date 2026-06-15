# WoundWnd

This file documents the responsibilities and members of `WoundWnd`.

## Meta

- Source: [WoundWnd.java](../../../src/haven/WoundWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the wound window.

## Nested Types

### $_

- Description: TODO

### $wound

- Description: TODO

### Info

- Description: TODO

### Item

- Description: TODO

### QuickInfo

- Description: TODO

### Wound

- Description: TODO

### WoundBox

- Description: TODO

### WoundList

- Description: TODO

### WoundPagina

- Description: TODO

## Members

### Constants

#### `public static final Text.Foundry namef = new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true)`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<Wound> ctxr = new OwnerContext.ClassResolver<Wound>()`

- Description: TODO

### Fields

#### `public final Widget woundbox`

- Description: TODO

#### `public final WoundList wounds`

- Description: TODO

#### `public Wound.Info wound`

- Description: TODO

#### `public final RichText.Document doc`

- Description: TODO

#### `public final Glob glob`

- Description: TODO

#### `public final int id, parentid`

- Description: TODO

#### `public final int id, parentid`

- Description: TODO

#### `public Indir<Resource> res`

- Description: TODO

#### `public int level`

- Description: TODO

#### `public ItemInfo.Raw rawinfo`

- Description: TODO

#### `private String sortkey = "\uffff"`

- Description: TODO

#### `private List<ItemInfo> info`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `private List<ItemInfo> info`

- Description: TODO

#### `public List<Wound> wounds = new ArrayList<Wound>()`

- Description: TODO

#### `private boolean loading = false`

- Description: TODO

#### `private final Comparator<Wound> wcomp = new Comparator<Wound>()`

- Description: TODO

#### `public final Wound w`

- Description: TODO

#### `private Widget qd, nm`

- Description: TODO

#### `private Widget qd, nm`

- Description: TODO

#### `private Object dres, dinfo`

- Description: TODO

#### `private Object dres, dinfo`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public default Widget qwdg(int h)`

- Description: TODO

#### `public default String qstr()`

- Description: TODO

#### `public default int qprio()`

- Description: TODO

#### `public WoundPagina(Owner owner, RichText.Document doc)`

- Description: TODO

#### `public WoundPagina(Owner owner, Resource.Pagina pag)`

- Description: TODO

#### `public void layout(Layout l)`

- Description: TODO

#### `public int order()`

- Description: TODO

#### `private Wound(Glob glob, int id, Indir<Resource> res, int parentid)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Resource resource()`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public BufferedImage icon()`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public int woundid()`

- Description: TODO

#### `public WoundBox(int id)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public Wound wound()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void drawbg(GOut g)`

- Description: TODO

#### `public BufferedImage renderinfo(int width)`

- Description: TODO

#### `public int woundid()`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `private WoundList(Coord sz)`

- Description: TODO

#### `protected List<Wound> items()`

- Description: TODO

#### `protected Widget makeitem(Wound w, int idx, Coord sz)`

- Description: TODO

#### `private List<Wound> treesort(List<Wound> from, int pid, int level)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public Item(Coord sz, Wound w)`

- Description: TODO

#### `private QuickInfo getqdat(List<ItemInfo> info)`

- Description: TODO

#### `private void update()`

- Description: TODO

#### `public boolean drop(Coord cc, Coord ul)`

- Description: TODO

#### `public boolean iteminteract(Coord cc, Coord ul)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `protected void drawslot(GOut g, Wound w, int idx, Area area)`

- Description: TODO

#### `protected boolean unselect(int button)`

- Description: TODO

#### `public Wound get(int id)`

- Description: TODO

#### `public void add(Wound w)`

- Description: TODO

#### `public Wound remove(int id)`

- Description: TODO

#### `public WoundWnd()`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `private void decwound(Object[] args, int a, int len)`

- Description: TODO

#### `public void uimsg(String nm, Object... args)`

- Description: TODO
