# Widget

This file documents the responsibilities and members of `Widget`.

## Meta

- Source: [Widget.java](../../../src/haven/Widget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a Haven UI widget and event target.

## Nested Types

### $ACont

- Role: Represents $acont within Widget.
- Description: Describes the nested $acont type used by the enclosing class.

### $CCont

- Role: Represents $ccont within Widget.
- Description: Describes the nested $ccont type used by the enclosing class.

### $Cont

- Role: Represents $cont within Widget.
- Description: Describes the nested $cont type used by the enclosing class.

### $FCont

- Role: Represents $fcont within Widget.
- Description: Describes the nested $fcont type used by the enclosing class.

### AlignPanel

- Role: Represents align panel within Widget.
- Description: Describes the nested align panel type used by the enclosing class.

### Anim

- Role: Represents anim within Widget.
- Description: Describes the nested anim type used by the enclosing class.

### Children

- Role: Represents children within Widget.
- Description: Describes the nested children type used by the enclosing class.

### CursorQuery

- Role: Represents cursor query within Widget.
- Description: Describes the nested cursor query type used by the enclosing class.

### Event

- Role: Represents event within Widget.
- Description: Describes the nested event type used by the enclosing class.

### FactMaker

- Role: Represents fact maker within Widget.
- Description: Describes the nested fact maker type used by the enclosing class.

### Factory

- Role: Represents factory within Widget.
- Description: Describes the nested factory type used by the enclosing class.

### FocusChangeEvent

- Role: Represents focus change event within Widget.
- Description: Describes the nested focus change event type used by the enclosing class.

### FocusedKeyEvent

- Role: Represents focused key event within Widget.
- Description: Describes the nested focused key event type used by the enclosing class.

### GTickEvent

- Role: Represents gtick event within Widget.
- Description: Describes the nested gtick event type used by the enclosing class.

### GlobKeyEvent

- Role: Represents glob key event within Widget.
- Description: Describes the nested glob key event type used by the enclosing class.

### GotFocusEvent

- Role: Represents got focus event within Widget.
- Description: Describes the nested got focus event type used by the enclosing class.

### Handler

- Role: Represents handler within Widget.
- Description: Describes the nested handler type used by the enclosing class.

### HandlerMaker

- Role: Represents handler maker within Widget.
- Description: Describes the nested handler maker type used by the enclosing class.

### KbdEvent

- Role: Represents kbd event within Widget.
- Description: Describes the nested kbd event type used by the enclosing class.

### KeyDownEvent

- Role: Represents key down event within Widget.
- Description: Describes the nested key down event type used by the enclosing class.

### KeyUpEvent

- Role: Represents key up event within Widget.
- Description: Describes the nested key up event type used by the enclosing class.

### KeyboundTip

- Role: Represents keybound tip within Widget.
- Description: Describes the nested keybound tip type used by the enclosing class.

### LostFocusEvent

- Role: Represents lost focus event within Widget.
- Description: Describes the nested lost focus event type used by the enclosing class.

### MessageEvent

- Role: Represents message event within Widget.
- Description: Describes the nested message event type used by the enclosing class.

### MessageHandler

- Role: Represents message handler within Widget.
- Description: Describes the nested message handler type used by the enclosing class.

### MouseActionEvent

- Role: Represents mouse action event within Widget.
- Description: Describes the nested mouse action event type used by the enclosing class.

### MouseButtonEvent

- Role: Represents mouse button event within Widget.
- Description: Describes the nested mouse button event type used by the enclosing class.

### MouseDownEvent

- Role: Represents mouse down event within Widget.
- Description: Describes the nested mouse down event type used by the enclosing class.

### MouseEvent

- Role: Represents mouse event within Widget.
- Description: Describes the nested mouse event type used by the enclosing class.

### MouseHoverEvent

- Role: Represents mouse hover event within Widget.
- Description: Describes the nested mouse hover event type used by the enclosing class.

### MouseMoveEvent

- Role: Represents mouse move event within Widget.
- Description: Describes the nested mouse move event type used by the enclosing class.

### MouseUpEvent

- Role: Represents mouse up event within Widget.
- Description: Describes the nested mouse up event type used by the enclosing class.

### MouseWheelEvent

- Role: Represents mouse wheel event within Widget.
- Description: Describes the nested mouse wheel event type used by the enclosing class.

### NormAnim

- Role: Represents norm anim within Widget.
- Description: Describes the nested norm anim type used by the enclosing class.

### PaginaTip

- Role: Represents pagina tip within Widget.
- Description: Describes the nested pagina tip type used by the enclosing class.

### PointerEvent

- Role: Represents pointer event within Widget.
- Description: Describes the nested pointer event type used by the enclosing class.

### Position

- Role: Represents position within Widget.
- Description: Describes the nested position type used by the enclosing class.

### QueryEvent

- Role: Represents query event within Widget.
- Description: Describes the nested query event type used by the enclosing class.

### RName

- Role: Represents rname within Widget.
- Description: Describes the nested rname type used by the enclosing class.

### RelposError

- Role: Represents relpos error within Widget.
- Description: Describes the nested relpos error type used by the enclosing class.

### TickEvent

- Role: Represents tick event within Widget.
- Description: Describes the nested tick event type used by the enclosing class.

### TooltipQuery

- Role: Represents tooltip query within Widget.
- Description: Describes the nested tooltip query type used by the enclosing class.

## Members

### Constants

#### `public static final KeyMatch key_act = KeyMatch.forcode(KeyEvent.VK_ENTER, 0)`
- Role: Defines the shared key act constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyMatch key_esc = KeyMatch.forcode(KeyEvent.VK_ESCAPE, 0)`
- Role: Defines the shared key esc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyMatch key_tab = KeyMatch.forcode(KeyEvent.VK_TAB, 0)`
- Role: Defines the shared key tab constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Resource defcurs = Resource.local().loadwait("gfx/hud/curs/arw")`
- Role: Defines the shared defcurs constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Integer, Integer> gkeys = Utils.<Integer, Integer>map().`
- Role: Defines the shared gkeys constant.
- Description: Shared constant used by the rest of the class.

#### `public static final OwnerContext.ClassResolver<Widget> wdgctx = new OwnerContext.ClassResolver<Widget>()`
- Role: Defines the shared wdgctx constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public UI ui`
- Role: Stores the UI value.
- Description: Backs the cached state for this file.

#### `public Coord c, sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public Coord c, sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public int z`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public Widget next, prev, child, lchild, parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public Widget next, prev, child, lchild, parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public Widget next, prev, child, lchild, parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public Widget next, prev, child, lchild, parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public Widget next, prev, child, lchild, parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `public int childseq`
- Role: Stores the childseq value.
- Description: Backs the cached state for this file.

#### `public boolean focustab = false, focusctl = false, hasfocus = false, visible = true`
- Role: Tracks the focustab flag.
- Description: Supports the focustab operation used by the surrounding class.

#### `public boolean focustab = false, focusctl = false, hasfocus = false, visible = true`
- Role: Tracks the focustab flag.
- Description: Supports the focustab operation used by the surrounding class.

#### `public boolean focustab = false, focusctl = false, hasfocus = false, visible = true`
- Role: Tracks the focustab flag.
- Description: Supports the focustab operation used by the surrounding class.

#### `public boolean focustab = false, focusctl = false, hasfocus = false, visible = true`
- Role: Tracks the focustab flag.
- Description: Supports the focustab operation used by the surrounding class.

#### `private boolean attached = false`
- Role: Tracks the attached flag.
- Description: Supports the attached operation used by the surrounding class.

#### `public boolean canfocus = false, autofocus = false`
- Role: Tracks the canfocus flag.
- Description: Supports the canfocus operation used by the surrounding class.

#### `public boolean canfocus = false, autofocus = false`
- Role: Tracks the canfocus flag.
- Description: Supports the canfocus operation used by the surrounding class.

#### `public boolean canactivate = false, cancancel = false`
- Role: Tracks the canactivate flag.
- Description: Supports the canactivate operation used by the surrounding class.

#### `public boolean canactivate = false, cancancel = false`
- Role: Tracks the canactivate flag.
- Description: Supports the canactivate operation used by the surrounding class.

#### `public Widget focused`
- Role: Stores the focused value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> cursor = null`
- Role: Stores the cursor value.
- Description: Backs the cached state for this file.

#### `public Object tooltip = null`
- Role: Holds the tooltip state.
- Description: Backs the cached state for this file.

#### `public KeyMatch gkey`
- Role: Holds the gkey state.
- Description: Backs the cached state for this file.

#### `public KeyBinding kb_gkey`
- Role: Holds the kb gkey state.
- Description: Backs the cached state for this file.

#### `static Map<String, Factory> types = new TreeMap<String, Factory>()`
- Role: Caches types entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private static boolean inited = false`
- Role: Tracks the inited flag.
- Description: Supports the inited operation used by the surrounding class.

#### `public final String spec`
- Role: Stores the spec value.
- Description: Backs the cached state for this file.

#### `public final int pos`
- Role: Stores the pos value.
- Description: Backs the cached state for this file.

#### `public final Stack<Object> stack`
- Role: Holds the stack state.
- Description: Backs the cached state for this file.

#### `public boolean propagate, grabbed`
- Role: Tracks the grabbed flag.
- Description: Supports the grabbed operation used by the surrounding class.

#### `public boolean propagate, grabbed`
- Role: Tracks the grabbed flag.
- Description: Supports the grabbed operation used by the surrounding class.

#### `public Widget handling, target`
- Role: Stores the target value.
- Description: Backs the cached state for this file.

#### `public Widget handling, target`
- Role: Stores the target value.
- Description: Backs the cached state for this file.

#### `private boolean phandled`
- Role: Tracks the phandled flag.
- Description: Supports the phandled operation used by the surrounding class.

#### `private List<EventHandler.Listener<?>> listening = null`
- Role: Caches listening entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final double dt`
- Role: Stores the dt value.
- Description: Backs the cached state for this file.

#### `public final haven.render.Render out`
- Role: Holds the out state.
- Description: Backs the cached state for this file.

#### `public final String msg`
- Role: Stores the msg value.
- Description: Backs the cached state for this file.

#### `public final Object[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `public final Coord c`
- Role: Stores the c value.
- Description: Backs the cached state for this file.

#### `public final int b`
- Role: Stores the b value.
- Description: Backs the cached state for this file.

#### `public final int a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `public final double s`
- Role: Stores the s value.
- Description: Backs the cached state for this file.

#### `public boolean hovering`
- Role: Tracks the hovering flag.
- Description: Supports the hovering operation used by the surrounding class.

#### `public final KeyEvent awt`
- Role: Holds the awt state.
- Description: Backs the cached state for this file.

#### `public final int code, mods`
- Role: Stores the mods value.
- Description: Backs the cached state for this file.

#### `public final int code, mods`
- Role: Stores the mods value.
- Description: Backs the cached state for this file.

#### `public final char c`
- Role: Stores the c value.
- Description: Backs the cached state for this file.

#### `public final QueryEvent<R> root`
- Role: Holds the root state.
- Description: Backs the cached state for this file.

#### `public R ret`
- Role: Holds the ret state.
- Description: Backs the cached state for this file.

#### `public final TooltipQuery root`
- Role: Holds the root state.
- Description: Backs the cached state for this file.

#### `public final Widget last`
- Role: Stores the last value.
- Description: Backs the cached state for this file.

#### `public Object ret`
- Role: Holds the ret state.
- Description: Backs the cached state for this file.

#### `public Widget from`
- Role: Stores the from value.
- Description: Backs the cached state for this file.

#### `public final String title`
- Role: Stores the title value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final boolean tiptitle`
- Role: Tracks the tiptitle flag.
- Description: Supports the tiptitle operation used by the surrounding class.

#### `private Tex rend`
- Role: Stores the rend value.
- Description: Backs the cached state for this file.

#### `private boolean hasrend = false`
- Role: Tracks the hasrend flag.
- Description: Supports the hasrend operation used by the surrounding class.

#### `public final String base`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `public final boolean rich`
- Role: Tracks the rich flag.
- Description: Supports the rich operation used by the surrounding class.

#### `private Tex rend = null`
- Role: Stores the rend value.
- Description: Backs the cached state for this file.

#### `private boolean hrend = false`
- Role: Tracks the hrend flag.
- Description: Supports the hrend operation used by the surrounding class.

#### `private KeyMatch rkey = null`
- Role: Holds the rkey state.
- Description: Backs the cached state for this file.

#### `public final Collection<Anim> anims = new LinkedList<Anim>()`
- Role: Caches anims entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<Anim> nanims = new LinkedList<Anim>()`
- Role: Caches nanims entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private double a = 0.0`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `private final double s`
- Role: Stores the s value.
- Description: Backs the cached state for this file.

### Methods

#### `public String value()`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected abstract Coord getc()`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public <T extends Widget> T add(T child)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void cresize(Widget ch)`
- Role: Performs cresize.
- Description: Supports the cresize operation used by the surrounding class.

#### `public void presize()`
- Role: Performs presize.
- Description: Supports the presize operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public Widget create(UI ui, final Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] par)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public FactMaker()`
- Role: Performs fact maker.
- Description: Supports the fact maker operation used by the surrounding class.

#### `public static void initnames()`
- Role: Performs initnames.
- Description: Supports the initnames operation used by the surrounding class.

#### `public static Factory gettype3(String name)`
- Role: Performs gettype3.
- Description: Supports the gettype3 operation used by the surrounding class.

#### `public static Factory gettype2(String name) throws InterruptedException`
- Role: Returns the type2 value.
- Description: Exposes the requested value without mutating state.

#### `public static Factory gettype(String name)`
- Role: Performs gettype.
- Description: Supports the gettype operation used by the surrounding class.

#### `public Widget(Coord sz)`
- Role: Creates a new Widget instance.
- Description: Constructs the instance and initializes its default state.

#### `public Widget()`
- Role: Creates a new Widget instance.
- Description: Constructs the instance and initializes its default state.

#### `public Widget(UI ui, Coord c, Coord sz)`
- Role: Creates a new Widget instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void attach(UI ui)`
- Role: Performs attach.
- Description: Supports the attach operation used by the surrounding class.

#### `protected void attached()`
- Role: Performs attached.
- Description: Supports the attached operation used by the surrounding class.

#### `private <T extends Widget> T add0(T child)`
- Role: Performs add0.
- Description: Supports the add0 operation used by the surrounding class.

#### `public <T extends Widget> T add(T child)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public <T extends Widget> T add(T child, Coord c)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public <T extends Widget> T add(T child, int x, int y)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public <T extends Widget> T adda(T child, int x, int y, double ax, double ay)`
- Role: Performs adda.
- Description: Supports the adda operation used by the surrounding class.

#### `public <T extends Widget> T adda(T child, Coord c, double ax, double ay)`
- Role: Performs adda.
- Description: Supports the adda operation used by the surrounding class.

#### `public <T extends Widget> T adda(T child, double ax, double ay)`
- Role: Performs adda.
- Description: Supports the adda operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public RelposError(Throwable cause, String spec, int pos, Stack<Object> stack)`
- Role: Performs relpos error.
- Description: Supports the relpos error operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public Coord relpos(String spec, Object self, Object[] args, int off)`
- Role: Performs relpos.
- Description: Supports the relpos operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void link()`
- Role: Performs link.
- Description: Supports the link operation used by the surrounding class.

#### `public void linkfirst()`
- Role: Performs linkfirst.
- Description: Supports the linkfirst operation used by the surrounding class.

#### `public void unlink()`
- Role: Performs unlink.
- Description: Supports the unlink operation used by the surrounding class.

#### `public Coord xlate(Coord c, boolean in)`
- Role: Performs xlate.
- Description: Supports the xlate operation used by the surrounding class.

#### `public Coord parentpos(Widget in)`
- Role: Performs parentpos.
- Description: Supports the parentpos operation used by the surrounding class.

#### `public Coord parentpos(Widget in, Coord c)`
- Role: Performs parentpos.
- Description: Supports the parentpos operation used by the surrounding class.

#### `public Coord rootpos()`
- Role: Performs rootpos.
- Description: Supports the rootpos operation used by the surrounding class.

#### `public Coord rootpos(Coord c)`
- Role: Performs rootpos.
- Description: Supports the rootpos operation used by the surrounding class.

#### `public Coord rootxlate(Coord c)`
- Role: Performs rootxlate.
- Description: Supports the rootxlate operation used by the surrounding class.

#### `public boolean hasparent(Widget w2)`
- Role: Performs hasparent.
- Description: Supports the hasparent operation used by the surrounding class.

#### `public void gotfocus()`
- Role: Performs gotfocus.
- Description: Supports the gotfocus operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void rdispose()`
- Role: Performs rdispose.
- Description: Supports the rdispose operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void reqdestroy()`
- Role: Performs reqdestroy.
- Description: Supports the reqdestroy operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void cdestroy(Widget w)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public int wdgid()`
- Role: Performs wdgid.
- Description: Supports the wdgid operation used by the surrounding class.

#### `public void lostfocus()`
- Role: Performs lostfocus.
- Description: Supports the lostfocus operation used by the surrounding class.

#### `public void setfocus(Widget w)`
- Role: Performs setfocus.
- Description: Supports the setfocus operation used by the surrounding class.

#### `public void setcanfocus(boolean canfocus)`
- Role: Performs setcanfocus.
- Description: Supports the setcanfocus operation used by the surrounding class.

#### `public void newfocusable(Widget w)`
- Role: Performs newfocusable.
- Description: Supports the newfocusable operation used by the surrounding class.

#### `public void delfocusable(Widget w)`
- Role: Performs delfocusable.
- Description: Supports the delfocusable operation used by the surrounding class.

#### `private void findfocus()`
- Role: Performs findfocus.
- Description: Supports the findfocus operation used by the surrounding class.

#### `public void setfocusctl(boolean focusctl)`
- Role: Performs setfocusctl.
- Description: Supports the setfocusctl operation used by the surrounding class.

#### `public void setfocustab(boolean focustab)`
- Role: Performs setfocustab.
- Description: Supports the setfocustab operation used by the surrounding class.

#### `public HandlerMaker()`
- Role: Performs handler maker.
- Description: Supports the handler maker operation used by the surrounding class.

#### `public void handle(Widget tgt, Object... args)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void wdgmsg(String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void tick(TickEvent ev)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(haven.render.Render out)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void gtick(GTickEvent ev)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void draw(GOut g, boolean strict)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public Event()`
- Role: Performs event.
- Description: Supports the event operation used by the surrounding class.

#### `public Event(Event from)`
- Role: Performs event.
- Description: Supports the event operation used by the surrounding class.

#### `public Event grabbed(boolean g)`
- Role: Performs grabbed.
- Description: Supports the grabbed operation used by the surrounding class.

#### `protected abstract boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `public void stop()`
- Role: Stops the current workflow.
- Description: Supports the stop operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public boolean propagate(Widget from)`
- Role: Performs propagate.
- Description: Supports the propagate operation used by the surrounding class.

#### `public boolean fpropagate(Widget from)`
- Role: Performs fpropagate.
- Description: Supports the fpropagate operation used by the surrounding class.

#### `public boolean dispatch(Widget w)`
- Role: Performs dispatch.
- Description: Supports the dispatch operation used by the surrounding class.

#### `public <E> void listen(Class<E> t, EventHandler<? super E> h)`
- Role: Performs listen.
- Description: Supports the listen operation used by the surrounding class.

#### `public boolean deafen(EventHandler<?> h)`
- Role: Performs deafen.
- Description: Supports the deafen operation used by the surrounding class.

#### `public <H extends EventHandler<?>> H listening(Class<H> cl)`
- Role: Performs listening.
- Description: Supports the listening operation used by the surrounding class.

#### `public boolean handle(Event ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public TickEvent(double dt)`
- Role: Performs tick event.
- Description: Supports the tick event operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public GTickEvent(haven.render.Render out)`
- Role: Performs gtick event.
- Description: Supports the gtick event operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public MessageEvent(String msg, Object[] args)`
- Role: Performs message event.
- Description: Supports the message event operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public PointerEvent(Coord c)`
- Role: Performs pointer event.
- Description: Supports the pointer event operation used by the surrounding class.

#### `public PointerEvent(PointerEvent from, Coord c)`
- Role: Performs pointer event.
- Description: Supports the pointer event operation used by the surrounding class.

#### `public abstract PointerEvent derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `public MouseEvent(Coord c)`
- Role: Performs mouse event.
- Description: Supports the mouse event operation used by the surrounding class.

#### `public MouseEvent(MouseEvent from, Coord c)`
- Role: Performs mouse event.
- Description: Supports the mouse event operation used by the surrounding class.

#### `public MouseActionEvent(Coord c)`
- Role: Performs mouse action event.
- Description: Supports the mouse action event operation used by the surrounding class.

#### `public MouseActionEvent(MouseEvent from, Coord c)`
- Role: Performs mouse action event.
- Description: Supports the mouse action event operation used by the surrounding class.

#### `public MouseButtonEvent(Coord c, int b)`
- Role: Performs mouse button event.
- Description: Supports the mouse button event operation used by the surrounding class.

#### `public MouseButtonEvent(MouseButtonEvent from, Coord c)`
- Role: Performs mouse button event.
- Description: Supports the mouse button event operation used by the surrounding class.

#### `public abstract MouseButtonEvent derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `public MouseDownEvent(Coord c, int b)`
- Role: Performs mouse down event.
- Description: Supports the mouse down event operation used by the surrounding class.

#### `public MouseDownEvent(MouseDownEvent from, Coord c)`
- Role: Performs mouse down event.
- Description: Supports the mouse down event operation used by the surrounding class.

#### `public MouseDownEvent derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public MouseUpEvent(Coord c, int b)`
- Role: Performs mouse up event.
- Description: Supports the mouse up event operation used by the surrounding class.

#### `public MouseUpEvent(MouseUpEvent from, Coord c)`
- Role: Performs mouse up event.
- Description: Supports the mouse up event operation used by the surrounding class.

#### `public MouseUpEvent derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public MouseMoveEvent(Coord c)`
- Role: Performs mouse move event.
- Description: Supports the mouse move event operation used by the surrounding class.

#### `public MouseMoveEvent(MouseMoveEvent from, Coord c)`
- Role: Performs mouse move event.
- Description: Supports the mouse move event operation used by the surrounding class.

#### `public MouseMoveEvent derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `public boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public MouseWheelEvent(Coord c, int a, double s)`
- Role: Performs mouse wheel event.
- Description: Supports the mouse wheel event operation used by the surrounding class.

#### `public MouseWheelEvent(MouseWheelEvent from, Coord c)`
- Role: Performs mouse wheel event.
- Description: Supports the mouse wheel event operation used by the surrounding class.

#### `public MouseWheelEvent derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `public boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public MouseHoverEvent(Coord c)`
- Role: Performs mouse hover event.
- Description: Supports the mouse hover event operation used by the surrounding class.

#### `public MouseHoverEvent(MouseHoverEvent from, Coord c)`
- Role: Performs mouse hover event.
- Description: Supports the mouse hover event operation used by the surrounding class.

#### `public MouseHoverEvent derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `public MouseHoverEvent hovering(boolean h)`
- Role: Performs hovering.
- Description: Supports the hovering operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public KbdEvent(KeyEvent awt)`
- Role: Performs kbd event.
- Description: Supports the kbd event operation used by the surrounding class.

#### `public FocusedKeyEvent(KeyEvent awt)`
- Role: Performs focused key event.
- Description: Supports the focused key event operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `public KeyDownEvent(KeyEvent awt)`
- Role: Performs key down event.
- Description: Supports the key down event operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public KeyUpEvent(KeyEvent awt)`
- Role: Performs key up event.
- Description: Supports the key up event operation used by the surrounding class.

#### `public boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public GlobKeyEvent(KeyEvent awt)`
- Role: Performs glob key event.
- Description: Supports the glob key event operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `public QueryEvent(Coord c)`
- Role: Performs query event.
- Description: Supports the query event operation used by the surrounding class.

#### `public QueryEvent(QueryEvent<R> from, Coord c)`
- Role: Performs query event.
- Description: Supports the query event operation used by the surrounding class.

#### `public boolean set(R ret)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `protected R defvalue()`
- Role: Performs defvalue.
- Description: Supports the defvalue operation used by the surrounding class.

#### `public TooltipQuery(Coord c, Widget last)`
- Role: Performs tooltip query.
- Description: Supports the tooltip query operation used by the surrounding class.

#### `public TooltipQuery(TooltipQuery from, Coord c)`
- Role: Performs tooltip query.
- Description: Supports the tooltip query operation used by the surrounding class.

#### `public TooltipQuery derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `public boolean set(Object ret, Widget from)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public CursorQuery(Coord c)`
- Role: Performs cursor query.
- Description: Supports the cursor query operation used by the surrounding class.

#### `public CursorQuery(CursorQuery from, Coord c)`
- Role: Performs cursor query.
- Description: Supports the cursor query operation used by the surrounding class.

#### `public CursorQuery derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `public boolean getcurs(CursorQuery ev)`
- Role: Returns the current cursor state.
- Description: Exposes the requested value without mutating state.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `protected Object defvalue()`
- Role: Performs defvalue.
- Description: Supports the defvalue operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mousehover(MouseHoverEvent ev, boolean hovering)`
- Role: Performs mousehover.
- Description: Supports the mousehover operation used by the surrounding class.

#### `public static KeyMatch gkeymatch(int gkey)`
- Role: Performs gkeymatch.
- Description: Supports the gkeymatch operation used by the surrounding class.

#### `public boolean gkeytype(GlobKeyEvent ev)`
- Role: Performs gkeytype.
- Description: Supports the gkeytype operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public boolean keyup(KeyUpEvent ev)`
- Role: Performs keyup.
- Description: Supports the keyup operation used by the surrounding class.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.

#### `public Widget setgkey(KeyMatch gkey)`
- Role: Performs setgkey.
- Description: Supports the setgkey operation used by the surrounding class.

#### `public Widget setgkey(KeyBinding gkey)`
- Role: Performs setgkey.
- Description: Supports the setgkey operation used by the surrounding class.

#### `public Area area()`
- Role: Performs area.
- Description: Supports the area operation used by the surrounding class.

#### `public Area parentarea(Widget in)`
- Role: Performs parentarea.
- Description: Supports the parentarea operation used by the surrounding class.

#### `public Area rootarea()`
- Role: Performs rootarea.
- Description: Supports the rootarea operation used by the surrounding class.

#### `public Coord contentsz()`
- Role: Performs contentsz.
- Description: Supports the contentsz operation used by the surrounding class.

#### `public void pack()`
- Role: Performs pack.
- Description: Supports the pack operation used by the surrounding class.

#### `public void move(Coord c)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void z(int z)`
- Role: Performs z.
- Description: Supports the z operation used by the surrounding class.

#### `public void move(Area a)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void resize(int x, int y)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void resizew(int w)`
- Role: Performs resizew.
- Description: Supports the resizew operation used by the surrounding class.

#### `public void resizeh(int h)`
- Role: Performs resizeh.
- Description: Supports the resizeh operation used by the surrounding class.

#### `public void cresize(Widget ch)`
- Role: Performs cresize.
- Description: Supports the cresize operation used by the surrounding class.

#### `public void presize()`
- Role: Performs presize.
- Description: Supports the presize operation used by the surrounding class.

#### `public Position(int x, int y)`
- Role: Returns the local player world position.
- Description: Returns the current world-space position of the local player.

#### `public Position(Coord c)`
- Role: Returns the local player world position.
- Description: Returns the current world-space position of the local player.

#### `public Position add(int X, int Y)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Position add(Coord c)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Position adds(int x, int y)`
- Role: Performs adds.
- Description: Supports the adds operation used by the surrounding class.

#### `public Position adds(Coord c)`
- Role: Performs adds.
- Description: Supports the adds operation used by the surrounding class.

#### `public Position sub(int X, int Y)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public Position sub(Coord c)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public Position subs(int x, int y)`
- Role: Performs subs.
- Description: Supports the subs operation used by the surrounding class.

#### `public Position subs(Coord c)`
- Role: Performs subs.
- Description: Supports the subs operation used by the surrounding class.

#### `public Position x(int X)`
- Role: Performs x.
- Description: Supports the x operation used by the surrounding class.

#### `public Position y(int Y)`
- Role: Performs y.
- Description: Supports the y operation used by the surrounding class.

#### `public Position xs(int x)`
- Role: Performs xs.
- Description: Supports the xs operation used by the surrounding class.

#### `public Position ys(int y)`
- Role: Performs ys.
- Description: Supports the ys operation used by the surrounding class.

#### `public Position getpos(String nm)`
- Role: Performs getpos.
- Description: Supports the getpos operation used by the surrounding class.

#### `public Position pos(String nm)`
- Role: Performs pos.
- Description: Supports the pos operation used by the surrounding class.

#### `public Coord addhlp(Coord c, int pad, Widget... children)`
- Role: Performs addhlp.
- Description: Supports the addhlp operation used by the surrounding class.

#### `public int addhlp(Coord c, int pad, int w, Widget... children)`
- Role: Performs addhlp.
- Description: Supports the addhlp operation used by the surrounding class.

#### `public int addhl(Coord c, int w, Widget... children)`
- Role: Performs addhl.
- Description: Supports the addhl operation used by the surrounding class.

#### `public Coord addvlp(Coord c, int pad, Widget... children)`
- Role: Performs addvlp.
- Description: Supports the addvlp operation used by the surrounding class.

#### `public int addvlp(Coord c, int pad, int h, Widget... children)`
- Role: Performs addvlp.
- Description: Supports the addvlp operation used by the surrounding class.

#### `public int addvl(Coord c, int h, Widget... children)`
- Role: Performs addvl.
- Description: Supports the addvl operation used by the surrounding class.

#### `public void raise()`
- Role: Performs raise.
- Description: Supports the raise operation used by the surrounding class.

#### `public void lower()`
- Role: Performs lower.
- Description: Supports the lower operation used by the surrounding class.

#### `public <T> T getchild(Class<T> cl)`
- Role: Performs getchild.
- Description: Supports the getchild operation used by the surrounding class.

#### `public <T extends Widget> T findchild(Class<T> cl)`
- Role: Performs findchild.
- Description: Supports the findchild operation used by the surrounding class.

#### `public Widget rprev()`
- Role: Performs rprev.
- Description: Supports the rprev operation used by the surrounding class.

#### `public Widget rnext()`
- Role: Performs rnext.
- Description: Supports the rnext operation used by the surrounding class.

#### `protected Children()`
- Role: Performs children.
- Description: Supports the children operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public ListIterator<Widget> listIterator(int idx)`
- Role: Performs list iterator.
- Description: Supports the list iterator operation used by the surrounding class.

#### `public List<Widget> children()`
- Role: Performs children.
- Description: Supports the children operation used by the surrounding class.

#### `public <T extends Widget> Set<T> children(final Class<T> cl)`
- Role: Performs children.
- Description: Supports the children operation used by the surrounding class.

#### `public PaginaTip(Indir<Resource> res, String title)`
- Role: Performs pagina tip.
- Description: Supports the pagina tip operation used by the surrounding class.

#### `public PaginaTip(Indir<Resource> res, boolean tiptitle)`
- Role: Performs pagina tip.
- Description: Supports the pagina tip operation used by the surrounding class.

#### `public PaginaTip(Indir<Resource> res)`
- Role: Performs pagina tip.
- Description: Supports the pagina tip operation used by the surrounding class.

#### `public Tex get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public KeyboundTip(String base, boolean rich)`
- Role: Performs keybound tip.
- Description: Supports the keybound tip operation used by the surrounding class.

#### `public KeyboundTip(String base)`
- Role: Performs keybound tip.
- Description: Supports the keybound tip operation used by the surrounding class.

#### `public KeyboundTip()`
- Role: Performs keybound tip.
- Description: Supports the keybound tip operation used by the surrounding class.

#### `public Tex get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public boolean tooltip(TooltipQuery ev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public Widget settip(String text, boolean rich)`
- Role: Performs settip.
- Description: Supports the settip operation used by the surrounding class.

#### `public Widget settip(String text)`
- Role: Performs settip.
- Description: Supports the settip operation used by the surrounding class.

#### `public <T extends Widget> T getparent(Class<T> cl)`
- Role: Performs getparent.
- Description: Supports the getparent operation used by the surrounding class.

#### `public void hide()`
- Role: Performs hide.
- Description: Supports the hide operation used by the surrounding class.

#### `public void show()`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public boolean show(boolean show)`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public boolean visible()`
- Role: Returns whether the widget is visible.
- Description: Controls whether the overlay participates in rendering.

#### `public boolean tvisible()`
- Role: Performs tvisible.
- Description: Supports the tvisible operation used by the surrounding class.

#### `public <T extends Anim> void clearanims(Class<T> type)`
- Role: Performs clearanims.
- Description: Supports the clearanims operation used by the surrounding class.

#### `public Anim()`
- Role: Performs anim.
- Description: Supports the anim operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public abstract boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public NormAnim(double s)`
- Role: Performs norm anim.
- Description: Supports the norm anim operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public abstract void ntick(double a)`
- Role: Performs ntick.
- Description: Supports the ntick operation used by the surrounding class.

#### `public <T extends Widget> T getChildOf(Class<T> c)`
- Role: Returns the child of.
- Description: Exposes the requested value without mutating state.
