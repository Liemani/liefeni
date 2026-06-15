# ChatUI

This file documents the responsibilities and members of `ChatUI`.

## Meta

- Source: [ChatUI.java](../../../src/haven/ChatUI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles in-game chat UI composition.

## Nested Types

### $MChat

- Description: TODO

### $PChat

- Description: TODO

### $PMChat

- Description: TODO

### $SChan

- Description: TODO

### Channel

- Description: TODO

### CharPos

- Description: TODO

### ChatAttribute

- Description: TODO

### ChatParser

- Description: TODO

### DarkChannel

- Description: TODO

### EntryChannel

- Description: TODO

### InMessage

- Description: TODO

### Log

- Description: TODO

### Message

- Description: TODO

### MultiChat

- Description: TODO

### MyMessage

- Description: TODO

### NamedMessage

- Description: TODO

### Notification

- Description: TODO

### OutMessage

- Description: TODO

### PartyChat

- Description: TODO

### PrivChat

- Description: TODO

### QuickLine

- Description: TODO

### Rendered

- Description: TODO

### RenderedMessage

- Description: TODO

### Selector

- Description: TODO

### SimpleChat

- Description: TODO

### SimpleMessage

- Description: TODO

### Spring

- Description: TODO

## Members

### Constants

#### `public static final RichText.Foundry fnd = new RichText.Foundry(new ChatParser(TextAttribute.FONT, Text.dfont.deriveFont(UI.scale(12f)), TextAttribute.FOREGROUND, Color.BLACK)).aa(true)`

- Description: TODO

#### `public static final Text.Foundry qfnd = new Text.Foundry(Text.dfont, 12, new java.awt.Color(192, 255, 192))`

- Description: TODO

#### `public static final int selw = UI.scale(130)`

- Description: TODO

#### `public static final Coord marg = UI.scale(new Coord(9, 9))`

- Description: TODO

#### `public static final Color[] urgcols = new Color[]`

- Description: TODO

#### `public static final Attribute HYPERLINK = new ChatAttribute("hyperlink")`

- Description: TODO

#### `public static final Pattern urlpat = Pattern.compile("\\b((https?://)|(www\\.[a-z0-9_.-]+\\.[a-z0-9_.-]+))[a-z0-9/_.~#%+?&:*=-]*", Pattern.CASE_INSENSITIVE)`

- Description: TODO

#### `public static final Map<? extends Attribute, ?> urlstyle = RichText.fillattrs(TextAttribute.FOREGROUND, new Color(64, 64, 255),`

- Description: TODO

#### `private static final Tex chandiv = Resource.loadtex("gfx/hud/chat-cdiv")`

- Description: TODO

#### `private static final Tex chanseld = Resource.loadtex("gfx/hud/chat-csel")`

- Description: TODO

#### `private static final Tex bulc = Resource.loadtex("gfx/hud/chat-lc")`

- Description: TODO

#### `private static final Tex burc = Resource.loadtex("gfx/hud/chat-rc")`

- Description: TODO

#### `private static final Tex bhb = Resource.loadtex("gfx/hud/chat-hori")`

- Description: TODO

#### `private static final Tex bvlb = Resource.loadtex("gfx/hud/chat-verti")`

- Description: TODO

#### `private static final Tex bvrb = bvlb`

- Description: TODO

#### `private static final Tex bmf = Resource.loadtex("gfx/hud/chat-mid")`

- Description: TODO

#### `private static final Tex bcbd = Resource.loadtex("gfx/hud/chat-close-g")`

- Description: TODO

#### `private static final Resource notifsfx = Resource.local().loadwait("sfx/hud/chat")`

- Description: TODO

#### `private static final int minh = 111`

- Description: TODO

#### `public static final KeyBinding kb_quick = KeyBinding.get("chat-quick", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, 0))`

- Description: TODO

### Fields

#### `public Channel sel = null`

- Description: TODO

#### `public int urgency = 0`

- Description: TODO

#### `private final Selector chansel`

- Description: TODO

#### `private Coord base = Coord.z`

- Description: TODO

#### `private QuickLine qline = null`

- Description: TODO

#### `private final LinkedList<Notification> notifs = new LinkedList<Notification>()`

- Description: TODO

#### `private UI.Grab qgrab`

- Description: TODO

#### `public final List<RenderedMessage> rmsgs = new ArrayList<>()`

- Description: TODO

#### `public int urgency = 0`

- Description: TODO

#### `private final Scrollbar sb`

- Description: TODO

#### `private final IButton cb`

- Description: TODO

#### `private double dy`

- Description: TODO

#### `public final double time = Utils.ntime()`

- Description: TODO

#### `private RenderedMessage soldest = null, snewest = null`

- Description: TODO

#### `private RenderedMessage soldest = null, snewest = null`

- Description: TODO

#### `public final Message msg`

- Description: TODO

#### `public final int idx`

- Description: TODO

#### `private Indir<Text> data`

- Description: TODO

#### `private Text text`

- Description: TODO

#### `RenderedMessage snext = null, sprev = null`

- Description: TODO

#### `RenderedMessage snext = null, sprev = null`

- Description: TODO

#### `double lseen = 0`

- Description: TODO

#### `int w, y`

- Description: TODO

#### `int w, y`

- Description: TODO

#### `private Coord sz = null`

- Description: TODO

#### `public final String text`

- Description: TODO

#### `public final Color col`

- Description: TODO

#### `public final RenderedMessage rm`

- Description: TODO

#### `public final int pn`

- Description: TODO

#### `public final RichText.TextPart part`

- Description: TODO

#### `public final TextHitInfo ch`

- Description: TODO

#### `public final Comparator<CharPos> poscmp = new Comparator<CharPos>()`

- Description: TODO

#### `private CharPos selorig, lasthit, selstart, selend`

- Description: TODO

#### `private CharPos selorig, lasthit, selstart, selend`

- Description: TODO

#### `private CharPos selorig, lasthit, selstart, selend`

- Description: TODO

#### `private CharPos selorig, lasthit, selstart, selend`

- Description: TODO

#### `private UI.Grab grab`

- Description: TODO

#### `private boolean dragging`

- Description: TODO

#### `private Indir<Resource> iconres = null`

- Description: TODO

#### `private final String name`

- Description: TODO

#### `private final TextEntry in`

- Description: TODO

#### `private List<String> history = new ArrayList<String>()`

- Description: TODO

#### `private int hpos = 0`

- Description: TODO

#### `private String hcurrent`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final int urgency`

- Description: TODO

#### `private final String name`

- Description: TODO

#### `private final Map<Integer, Color> pc = new HashMap<Integer, Color>()`

- Description: TODO

#### `private Map<Integer, Boolean> muted = null`

- Description: TODO

#### `private Integer mutewait = null`

- Description: TODO

#### `public final int from`

- Description: TODO

#### `public final String text`

- Description: TODO

#### `public final Color col`

- Description: TODO

#### `public final int w`

- Description: TODO

#### `public final String nm`

- Description: TODO

#### `private float colseq = 0`

- Description: TODO

#### `private final int other`

- Description: TODO

#### `private boolean muted`

- Description: TODO

#### `public final BufferedImage ctex = Resource.loadimg("gfx/hud/chantex")`

- Description: TODO

#### `public final Text.Foundry tf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12))).aa(true)`

- Description: TODO

#### `public final Color[] uc =`

- Description: TODO

#### `private final List<DarkChannel> chls = new ArrayList<DarkChannel>()`

- Description: TODO

#### `private final int iconsz = UI.scale(16), ellw = tf.strsize("...").x, maxnmw = selw - iconsz`

- Description: TODO

#### `private final int iconsz = UI.scale(16), ellw = tf.strsize("...").x, maxnmw = selw - iconsz`

- Description: TODO

#### `private final int iconsz = UI.scale(16), ellw = tf.strsize("...").x, maxnmw = selw - iconsz`

- Description: TODO

#### `private final int offset = chandiv.sz().y + chanseld.sz().y`

- Description: TODO

#### `private int ts = 0`

- Description: TODO

#### `private double ds = 0`

- Description: TODO

#### `private Channel cstart`

- Description: TODO

#### `public final Channel chan`

- Description: TODO

#### `public Text rname`

- Description: TODO

#### `public Tex ricon`

- Description: TODO

#### `private int urgency = 0`

- Description: TODO

#### `private Resource.Image icon`

- Description: TODO

#### `public final Channel chan`

- Description: TODO

#### `public final Channel.Message msg`

- Description: TODO

#### `public final Text chnm, rmsg`

- Description: TODO

#### `public final Text chnm, rmsg`

- Description: TODO

#### `public final double time = Utils.ntime()`

- Description: TODO

#### `private Text.Line rqline = null`

- Description: TODO

#### `private int rqpre`

- Description: TODO

#### `final int oy = base.y - c.y, ny`

- Description: TODO

#### `final int oy = base.y - c.y, ny`

- Description: TODO

#### `public boolean targetshow = false`

- Description: TODO

#### `public final ReadLine buf`

- Description: TODO

#### `public final EntryChannel chan`

- Description: TODO

#### `private UI.Grab dm = null`

- Description: TODO

#### `private Coord doff`

- Description: TODO

### Methods

#### `public ChatUI()`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `private ChatAttribute(String name)`

- Description: TODO

#### `public ChatParser(Object... args)`

- Description: TODO

#### `protected RichText.Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException`

- Description: TODO

#### `public abstract Indir<Text> render(int w)`

- Description: TODO

#### `public boolean valid(Indir<Text> prev)`

- Description: TODO

#### `public boolean mousedown(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

#### `public boolean mouseup(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

#### `public boolean clicked(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

#### `public RenderedMessage(Message msg, int idx, int iw)`

- Description: TODO

#### `public Indir<Text> data()`

- Description: TODO

#### `private void slink()`

- Description: TODO

#### `private void sunlink()`

- Description: TODO

#### `public Text text()`

- Description: TODO

#### `public int h()`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public void invalidate()`

- Description: TODO

#### `public void resize(int w)`

- Description: TODO

#### `public boolean update()`

- Description: TODO

#### `private void trimunseen()`

- Description: TODO

#### `public SimpleMessage(String text, Color col)`

- Description: TODO

#### `public Indir<Text> render(int w)`

- Description: TODO

#### `public Channel(boolean closable)`

- Description: TODO

#### `public void append(Message msg, int urgency)`

- Description: TODO

#### `public void append(Message msg)`

- Description: TODO

#### `public void append(String line, Color col)`

- Description: TODO

#### `public int iw()`

- Description: TODO

#### `public int ih()`

- Description: TODO

#### `public void updurgency(int urg)`

- Description: TODO

#### `public int messageat(int y, boolean nearest)`

- Description: TODO

#### `public RenderedMessage messageat(Coord c, Coord hc)`

- Description: TODO

#### `private void updyseq(int mi)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public CharPos(RenderedMessage rm, RichText.TextPart part, TextHitInfo ch)`

- Description: TODO

#### `private static int partnum(RichText text, RichText.TextPart part)`

- Description: TODO

#### `public boolean equals(Object oo)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public CharPos charat(Coord c)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `protected void selected(CharPos start, CharPos end)`

- Description: TODO

#### `protected boolean clicked(CharPos pos, int btn)`

- Description: TODO

#### `public void select()`

- Description: TODO

#### `public void display()`

- Description: TODO

#### `private void drawsel(GOut g, RenderedMessage rm, int y)`

- Description: TODO

#### `public void uimsg(String name, Object... args)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public abstract String name()`

- Description: TODO

#### `public boolean selmousedown(Coord c, int btn)`

- Description: TODO

#### `public boolean selmouseup(Coord c, int btn)`

- Description: TODO

#### `public boolean selclicked(Coord c, int btn)`

- Description: TODO

#### `public Channel icon(Indir<Resource> res)`

- Description: TODO

#### `public Resource.Image icon()`

- Description: TODO

#### `public Log(String name)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public EntryChannel(boolean closable)`

- Description: TODO

#### `public int ih()`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public void send(String text)`

- Description: TODO

#### `public SimpleChat(boolean closable, String name)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public NamedMessage(int from, String text, Color col)`

- Description: TODO

#### `public Rendered(int w, String nm)`

- Description: TODO

#### `public Text get()`

- Description: TODO

#### `private String nm()`

- Description: TODO

#### `public Indir<Text> render(int w)`

- Description: TODO

#### `public boolean valid(Indir<Text> data)`

- Description: TODO

#### `public boolean clicked(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

#### `private void mutemenu(int pl, boolean cur)`

- Description: TODO

#### `public MyMessage(String text)`

- Description: TODO

#### `public MultiChat(boolean closable, String name, int urgency)`

- Description: TODO

#### `private Color nextcol()`

- Description: TODO

#### `public Color fromcolor(int from)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public PartyChat()`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public PrivChat(boolean closable, int other)`

- Description: TODO

#### `private void menu()`

- Description: TODO

#### `public boolean selclicked(Coord c, int btn)`

- Description: TODO

#### `public InMessage(String text)`

- Description: TODO

#### `public boolean clicked(Channel chan, CharPos pos, Coord c, int btn)`

- Description: TODO

#### `public OutMessage(String text)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public <T extends Widget> T add(T w)`

- Description: TODO

#### `public void cdestroy(Widget w)`

- Description: TODO

#### `private Text namedeco(String name, BufferedImage img, Color col)`

- Description: TODO

#### `public Text nmrender(String name, Color col)`

- Description: TODO

#### `public int chidx(Channel chan)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `private DarkChannel(Channel chan)`

- Description: TODO

#### `public Text rname()`

- Description: TODO

#### `public Tex ricon()`

- Description: TODO

#### `public Selector(Coord sz)`

- Description: TODO

#### `private void add(Channel chan)`

- Description: TODO

#### `private void rm(Channel chan)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void show(int si)`

- Description: TODO

#### `public void show(Channel chan)`

- Description: TODO

#### `public boolean up()`

- Description: TODO

#### `public boolean down()`

- Description: TODO

#### `private Channel bypos(Coord c)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `private int clips(int s)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void select(Channel chan, boolean focus)`

- Description: TODO

#### `public void select(Channel chan)`

- Description: TODO

#### `private Notification(Channel chan, Channel.Message msg)`

- Description: TODO

#### `public void drawsmall(GOut g, Coord br, int h)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void notify(Channel chan, Channel.Message msg, int urgency)`

- Description: TODO

#### `Spring(int ny)`

- Description: TODO

#### `public void ntick(double a)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO

#### `public void presize()`

- Description: TODO

#### `public void sshow(boolean show)`

- Description: TODO

#### `public void hresize(int h)`

- Description: TODO

#### `public void resize(int w)`

- Description: TODO

#### `public void move(Coord base)`

- Description: TODO

#### `public void expand()`

- Description: TODO

#### `public void show()`

- Description: TODO

#### `public void hide()`

- Description: TODO

#### `private QuickLine(EntryChannel chan)`

- Description: TODO

#### `private void cancel()`

- Description: TODO

#### `public void done(ReadLine buf)`

- Description: TODO

#### `public boolean key(KbdEvent ev)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `public boolean mouseup(MouseUpEvent ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public boolean globtype(GlobKeyEvent ev)`

- Description: TODO
