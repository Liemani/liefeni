# Widget

This file documents the responsibilities and members of `Widget`.

## Meta

- Source: [Widget.java](../../../src/haven/Widget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the base UI widget.

## Nested Types

### $ACont

- Description: TODO

### $CCont

- Description: TODO

### $Cont

- Description: TODO

### $FCont

- Description: TODO

### AlignPanel

- Description: TODO

### Anim

- Description: TODO

### Children

- Description: TODO

### CursorQuery

- Description: TODO

### Event

- Description: TODO

### FactMaker

- Description: TODO

### Factory

- Description: TODO

### FocusChangeEvent

- Description: TODO

### FocusedKeyEvent

- Description: TODO

### GTickEvent

- Description: TODO

### GlobKeyEvent

- Description: TODO

### GotFocusEvent

- Description: TODO

### Handler

- Description: TODO

### HandlerMaker

- Description: TODO

### KbdEvent

- Description: TODO

### KeyDownEvent

- Description: TODO

### KeyUpEvent

- Description: TODO

### KeyboundTip

- Description: TODO

### LostFocusEvent

- Description: TODO

### MessageEvent

- Description: TODO

### MessageHandler

- Description: TODO

### MouseActionEvent

- Description: TODO

### MouseButtonEvent

- Description: TODO

### MouseDownEvent

- Description: TODO

### MouseEvent

- Description: TODO

### MouseHoverEvent

- Description: TODO

### MouseMoveEvent

- Description: TODO

### MouseUpEvent

- Description: TODO

### MouseWheelEvent

- Description: TODO

### NormAnim

- Description: TODO

### PaginaTip

- Description: TODO

### PointerEvent

- Description: TODO

### Position

- Description: TODO

### QueryEvent

- Description: TODO

### RName

- Description: TODO

### RelposError

- Description: TODO

### TickEvent

- Description: TODO

### TooltipQuery

- Description: TODO

## Members

### Constants

#### `public static final KeyMatch key_act = KeyMatch.forcode(KeyEvent.VK_ENTER, 0)`

- Description: TODO

#### `public static final KeyMatch key_esc = KeyMatch.forcode(KeyEvent.VK_ESCAPE, 0)`

- Description: TODO

#### `public static final KeyMatch key_tab = KeyMatch.forcode(KeyEvent.VK_TAB, 0)`

- Description: TODO

#### `public static final Resource defcurs = Resource.local().loadwait("gfx/hud/curs/arw")`

- Description: TODO

#### `private static final Map<Integer, Integer> gkeys = Utils.<Integer, Integer>map().`

- Description: TODO

#### `public static final OwnerContext.ClassResolver<Widget> wdgctx = new OwnerContext.ClassResolver<Widget>()`

- Description: TODO

### Fields

#### `public UI ui`

- Description: TODO

#### `public Coord c, sz`

- Description: TODO

#### `public Coord c, sz`

- Description: TODO

#### `public int z`

- Description: TODO

#### `public Widget next, prev, child, lchild, parent`

- Description: TODO

#### `public Widget next, prev, child, lchild, parent`

- Description: TODO

#### `public Widget next, prev, child, lchild, parent`

- Description: TODO

#### `public Widget next, prev, child, lchild, parent`

- Description: TODO

#### `public Widget next, prev, child, lchild, parent`

- Description: TODO

#### `public int childseq`

- Description: TODO

#### `public boolean focustab = false, focusctl = false, hasfocus = false, visible = true`

- Description: TODO

#### `public boolean focustab = false, focusctl = false, hasfocus = false, visible = true`

- Description: TODO

#### `public boolean focustab = false, focusctl = false, hasfocus = false, visible = true`

- Description: TODO

#### `public boolean focustab = false, focusctl = false, hasfocus = false, visible = true`

- Description: TODO

#### `private boolean attached = false`

- Description: TODO

#### `public boolean canfocus = false, autofocus = false`

- Description: TODO

#### `public boolean canfocus = false, autofocus = false`

- Description: TODO

#### `public boolean canactivate = false, cancancel = false`

- Description: TODO

#### `public boolean canactivate = false, cancancel = false`

- Description: TODO

#### `public Widget focused`

- Description: TODO

#### `public Indir<Resource> cursor = null`

- Description: TODO

#### `public Object tooltip = null`

- Description: TODO

#### `public KeyMatch gkey`

- Description: TODO

#### `public KeyBinding kb_gkey`

- Description: TODO

#### `static Map<String, Factory> types = new TreeMap<String, Factory>()`

- Description: TODO

#### `private static boolean inited = false`

- Description: TODO

#### `public final String spec`

- Description: TODO

#### `public final int pos`

- Description: TODO

#### `public final Stack<Object> stack`

- Description: TODO

#### `public boolean propagate, grabbed`

- Description: TODO

#### `public boolean propagate, grabbed`

- Description: TODO

#### `public Widget handling, target`

- Description: TODO

#### `public Widget handling, target`

- Description: TODO

#### `private boolean phandled`

- Description: TODO

#### `private List<EventHandler.Listener<?>> listening = null`

- Description: TODO

#### `public final double dt`

- Description: TODO

#### `public final haven.render.Render out`

- Description: TODO

#### `public final String msg`

- Description: TODO

#### `public final Object[] args`

- Description: TODO

#### `public final Coord c`

- Description: TODO

#### `public final int b`

- Description: TODO

#### `public final int a`

- Description: TODO

#### `public final double s`

- Description: TODO

#### `public boolean hovering`

- Description: TODO

#### `public final KeyEvent awt`

- Description: TODO

#### `public final int code, mods`

- Description: TODO

#### `public final int code, mods`

- Description: TODO

#### `public final char c`

- Description: TODO

#### `public final QueryEvent<R> root`

- Description: TODO

#### `public R ret`

- Description: TODO

#### `public final TooltipQuery root`

- Description: TODO

#### `public final Widget last`

- Description: TODO

#### `public Object ret`

- Description: TODO

#### `public Widget from`

- Description: TODO

#### `public final String title`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final boolean tiptitle`

- Description: TODO

#### `private Tex rend`

- Description: TODO

#### `private boolean hasrend = false`

- Description: TODO

#### `public final String base`

- Description: TODO

#### `public final boolean rich`

- Description: TODO

#### `private Tex rend = null`

- Description: TODO

#### `private boolean hrend = false`

- Description: TODO

#### `private KeyMatch rkey = null`

- Description: TODO

#### `public final Collection<Anim> anims = new LinkedList<Anim>()`

- Description: TODO

#### `public final Collection<Anim> nanims = new LinkedList<Anim>()`

- Description: TODO

#### `private double a = 0.0`

- Description: TODO

#### `private final double s`

- Description: TODO

### Methods

#### `public String value()`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `protected abstract Coord getc()`

- Description: TODO

#### `public <T extends Widget> T add(T child)`

- Description: TODO

#### `public void cresize(Widget ch)`

- Description: TODO

#### `public void presize()`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public Widget create(UI ui, final Object[] args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] par)`

- Description: TODO

#### `public FactMaker()`

- Description: TODO

#### `public static void initnames()`

- Description: TODO

#### `public static Factory gettype3(String name)`

- Description: TODO

#### `public static Factory gettype2(String name) throws InterruptedException`

- Description: TODO

#### `public static Factory gettype(String name)`

- Description: TODO

#### `public Widget(Coord sz)`

- Description: TODO

#### `public Widget()`

- Description: TODO

#### `public Widget(UI ui, Coord c, Coord sz)`

- Description: TODO

#### `protected void attach(UI ui)`

- Description: TODO

#### `protected void attached()`

- Description: TODO

#### `private <T extends Widget> T add0(T child)`

- Description: TODO

#### `public <T extends Widget> T add(T child)`

- Description: TODO

#### `public <T extends Widget> T add(T child, Coord c)`

- Description: TODO

#### `public <T extends Widget> T add(T child, int x, int y)`

- Description: TODO

#### `public <T extends Widget> T adda(T child, int x, int y, double ax, double ay)`

- Description: TODO

#### `public <T extends Widget> T adda(T child, Coord c, double ax, double ay)`

- Description: TODO

#### `public <T extends Widget> T adda(T child, double ax, double ay)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public RelposError(Throwable cause, String spec, int pos, Stack<Object> stack)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `public Coord relpos(String spec, Object self, Object[] args, int off)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public void link()`

- Description: TODO

#### `public void linkfirst()`

- Description: TODO

#### `public void unlink()`

- Description: TODO

#### `public Coord xlate(Coord c, boolean in)`

- Description: TODO

#### `public Coord parentpos(Widget in)`

- Description: TODO

#### `public Coord parentpos(Widget in, Coord c)`

- Description: TODO

#### `public Coord rootpos()`

- Description: TODO

#### `public Coord rootpos(Coord c)`

- Description: TODO

#### `public Coord rootxlate(Coord c)`

- Description: TODO

#### `public boolean hasparent(Widget w2)`

- Description: TODO

#### `public void gotfocus()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public void rdispose()`

- Description: TODO

#### `public void remove()`

- Description: TODO

#### `public void reqdestroy()`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `public void cdestroy(Widget w)`

- Description: TODO

#### `public int wdgid()`

- Description: TODO

#### `public void lostfocus()`

- Description: TODO

#### `public void setfocus(Widget w)`

- Description: TODO

#### `public void setcanfocus(boolean canfocus)`

- Description: TODO

#### `public void newfocusable(Widget w)`

- Description: TODO

#### `public void delfocusable(Widget w)`

- Description: TODO

#### `private void findfocus()`

- Description: TODO

#### `public void setfocusctl(boolean focusctl)`

- Description: TODO

#### `public void setfocustab(boolean focustab)`

- Description: TODO

#### `public HandlerMaker()`

- Description: TODO

#### `public void handle(Widget tgt, Object... args)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void wdgmsg(String msg, Object... args)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void tick(TickEvent ev)`

- Description: TODO

#### `public void gtick(haven.render.Render out)`

- Description: TODO

#### `public void gtick(GTickEvent ev)`

- Description: TODO

#### `public void draw(GOut g, boolean strict)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean checkhit(Coord c)`

- Description: TODO

#### `public Event()`

- Description: TODO

#### `public Event(Event from)`

- Description: TODO

#### `public Event grabbed(boolean g)`

- Description: TODO

#### `protected abstract boolean propagation(Widget from)`

- Description: TODO

#### `public void stop()`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public boolean propagate(Widget from)`

- Description: TODO

#### `public boolean fpropagate(Widget from)`

- Description: TODO

#### `public boolean dispatch(Widget w)`

- Description: TODO

#### `public <E> void listen(Class<E> t, EventHandler<? super E> h)`

- Description: TODO

#### `public boolean deafen(EventHandler<?> h)`

- Description: TODO

#### `public <H extends EventHandler<?>> H listening(Class<H> cl)`

- Description: TODO

#### `public boolean handle(Event ev)`

- Description: TODO

#### `public TickEvent(double dt)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public GTickEvent(haven.render.Render out)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public MessageEvent(String msg, Object[] args)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public PointerEvent(Coord c)`

- Description: TODO

#### `public PointerEvent(PointerEvent from, Coord c)`

- Description: TODO

#### `public abstract PointerEvent derive(Coord c)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `public MouseEvent(Coord c)`

- Description: TODO

#### `public MouseEvent(MouseEvent from, Coord c)`

- Description: TODO

#### `public MouseActionEvent(Coord c)`

- Description: TODO

#### `public MouseActionEvent(MouseEvent from, Coord c)`

- Description: TODO

#### `public MouseButtonEvent(Coord c, int b)`

- Description: TODO

#### `public MouseButtonEvent(MouseButtonEvent from, Coord c)`

- Description: TODO

#### `public abstract MouseButtonEvent derive(Coord c)`

- Description: TODO

#### `public MouseDownEvent(Coord c, int b)`

- Description: TODO

#### `public MouseDownEvent(MouseDownEvent from, Coord c)`

- Description: TODO

#### `public MouseDownEvent derive(Coord c)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public MouseUpEvent(Coord c, int b)`

- Description: TODO

#### `public MouseUpEvent(MouseUpEvent from, Coord c)`

- Description: TODO

#### `public MouseUpEvent derive(Coord c)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public MouseMoveEvent(Coord c)`

- Description: TODO

#### `public MouseMoveEvent(MouseMoveEvent from, Coord c)`

- Description: TODO

#### `public MouseMoveEvent derive(Coord c)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `public boolean shandle(Widget w)`

- Description: TODO

#### `public MouseWheelEvent(Coord c, int a, double s)`

- Description: TODO

#### `public MouseWheelEvent(MouseWheelEvent from, Coord c)`

- Description: TODO

#### `public MouseWheelEvent derive(Coord c)`

- Description: TODO

#### `public boolean shandle(Widget w)`

- Description: TODO

#### `public MouseHoverEvent(Coord c)`

- Description: TODO

#### `public MouseHoverEvent(MouseHoverEvent from, Coord c)`

- Description: TODO

#### `public MouseHoverEvent derive(Coord c)`

- Description: TODO

#### `public MouseHoverEvent hovering(boolean h)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public KbdEvent(KeyEvent awt)`

- Description: TODO

#### `public FocusedKeyEvent(KeyEvent awt)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `public KeyDownEvent(KeyEvent awt)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public KeyUpEvent(KeyEvent awt)`

- Description: TODO

#### `public boolean shandle(Widget w)`

- Description: TODO

#### `public GlobKeyEvent(KeyEvent awt)`

- Description: TODO

#### `protected boolean propagation(Widget from)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public boolean propagation(Widget from)`

- Description: TODO

#### `public QueryEvent(Coord c)`

- Description: TODO

#### `public QueryEvent(QueryEvent<R> from, Coord c)`

- Description: TODO

#### `public boolean set(R ret)`

- Description: TODO

#### `protected R defvalue()`

- Description: TODO

#### `public TooltipQuery(Coord c, Widget last)`

- Description: TODO

#### `public TooltipQuery(TooltipQuery from, Coord c)`

- Description: TODO

#### `public TooltipQuery derive(Coord c)`

- Description: TODO

#### `public boolean set(Object ret, Widget from)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public CursorQuery(Coord c)`

- Description: TODO

#### `public CursorQuery(CursorQuery from, Coord c)`

- Description: TODO

#### `public CursorQuery derive(Coord c)`

- Description: TODO

#### `public boolean getcurs(CursorQuery ev)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `protected Object defvalue()`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`

- Description: TODO

#### `public static KeyMatch gkeymatch(int gkey)`

- Description: TODO

#### `public boolean gkeytype(GlobKeyEvent ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public boolean keyup(KeyUpEvent ev)`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO

#### `public Widget setgkey(KeyMatch gkey)`

- Description: TODO

#### `public Widget setgkey(KeyBinding gkey)`

- Description: TODO

#### `public Area area()`

- Description: TODO

#### `public Area parentarea(Widget in)`

- Description: TODO

#### `public Area rootarea()`

- Description: TODO

#### `public Coord contentsz()`

- Description: TODO

#### `public void pack()`

- Description: TODO

#### `public void move(Coord c)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public void z(int z)`

- Description: TODO

#### `public void move(Area a)`

- Description: TODO

#### `public void resize(int x, int y)`

- Description: TODO

#### `public void resizew(int w)`

- Description: TODO

#### `public void resizeh(int h)`

- Description: TODO

#### `public void cresize(Widget ch)`

- Description: TODO

#### `public void presize()`

- Description: TODO

#### `public Position(int x, int y)`

- Description: TODO

#### `public Position(Coord c)`

- Description: TODO

#### `public Position add(int X, int Y)`

- Description: TODO

#### `public Position add(Coord c)`

- Description: TODO

#### `public Position adds(int x, int y)`

- Description: TODO

#### `public Position adds(Coord c)`

- Description: TODO

#### `public Position sub(int X, int Y)`

- Description: TODO

#### `public Position sub(Coord c)`

- Description: TODO

#### `public Position subs(int x, int y)`

- Description: TODO

#### `public Position subs(Coord c)`

- Description: TODO

#### `public Position x(int X)`

- Description: TODO

#### `public Position y(int Y)`

- Description: TODO

#### `public Position xs(int x)`

- Description: TODO

#### `public Position ys(int y)`

- Description: TODO

#### `public Position getpos(String nm)`

- Description: TODO

#### `public Position pos(String nm)`

- Description: TODO

#### `public Coord addhlp(Coord c, int pad, Widget... children)`

- Description: TODO

#### `public int addhlp(Coord c, int pad, int w, Widget... children)`

- Description: TODO

#### `public int addhl(Coord c, int w, Widget... children)`

- Description: TODO

#### `public Coord addvlp(Coord c, int pad, Widget... children)`

- Description: TODO

#### `public int addvlp(Coord c, int pad, int h, Widget... children)`

- Description: TODO

#### `public int addvl(Coord c, int h, Widget... children)`

- Description: TODO

#### `public void raise()`

- Description: TODO

#### `public void lower()`

- Description: TODO

#### `public <T> T getchild(Class<T> cl)`

- Description: TODO

#### `public <T extends Widget> T findchild(Class<T> cl)`

- Description: TODO

#### `public Widget rprev()`

- Description: TODO

#### `public Widget rnext()`

- Description: TODO

#### `protected Children()`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public ListIterator<Widget> listIterator(int idx)`

- Description: TODO

#### `public List<Widget> children()`

- Description: TODO

#### `public <T extends Widget> Set<T> children(final Class<T> cl)`

- Description: TODO

#### `public PaginaTip(Indir<Resource> res, String title)`

- Description: TODO

#### `public PaginaTip(Indir<Resource> res, boolean tiptitle)`

- Description: TODO

#### `public PaginaTip(Indir<Resource> res)`

- Description: TODO

#### `public Tex get()`

- Description: TODO

#### `public KeyboundTip(String base, boolean rich)`

- Description: TODO

#### `public KeyboundTip(String base)`

- Description: TODO

#### `public KeyboundTip()`

- Description: TODO

#### `public Tex get()`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public boolean tooltip(TooltipQuery ev)`

- Description: TODO

#### `public Widget settip(String text, boolean rich)`

- Description: TODO

#### `public Widget settip(String text)`

- Description: TODO

#### `public <T extends Widget> T getparent(Class<T> cl)`

- Description: TODO

#### `public void hide()`

- Description: TODO

#### `public void show()`

- Description: TODO

#### `public boolean show(boolean show)`

- Description: TODO

#### `public boolean visible()`

- Description: TODO

#### `public boolean tvisible()`

- Description: TODO

#### `public <T extends Anim> void clearanims(Class<T> type)`

- Description: TODO

#### `public Anim()`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public abstract boolean tick(double dt)`

- Description: TODO

#### `public NormAnim(double s)`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public abstract void ntick(double a)`

- Description: TODO

#### `public <T extends Widget> T getChildOf(Class<T> c)`

- Description: TODO
