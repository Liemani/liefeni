---
source: [ChatUI.java](../../../src/haven/ChatUI.java)
created: 2026-06-13
updated: 2026-06-14
---

# ChatUI

Represents the chat ui Haven component.

## Nested Types

### $MChat

- Role: Represents $mchat within ChatUI.
- Description: Describes the nested $mchat type used by the enclosing class.

### $PChat

- Role: Represents $pchat within ChatUI.
- Description: Describes the nested $pchat type used by the enclosing class.

### $PMChat

- Role: Represents $pmchat within ChatUI.
- Description: Describes the nested $pmchat type used by the enclosing class.

### $SChan

- Role: Represents $schan within ChatUI.
- Description: Describes the nested $schan type used by the enclosing class.

### Channel

- Role: Represents channel within ChatUI.
- Description: Describes the nested channel type used by the enclosing class.

### CharPos

- Role: Represents char pos within ChatUI.
- Description: Describes the nested char pos type used by the enclosing class.

### ChatAttribute

- Role: Represents chat attribute within ChatUI.
- Description: Describes the nested chat attribute type used by the enclosing class.

### ChatParser

- Role: Represents chat parser within ChatUI.
- Description: Describes the nested chat parser type used by the enclosing class.

### DarkChannel

- Role: Represents dark channel within ChatUI.
- Description: Describes the nested dark channel type used by the enclosing class.

### EntryChannel

- Role: Represents entry channel within ChatUI.
- Description: Describes the nested entry channel type used by the enclosing class.

### InMessage

- Role: Represents in message within ChatUI.
- Description: Describes the nested in message type used by the enclosing class.

### Log

- Role: Represents log within ChatUI.
- Description: Describes the nested log type used by the enclosing class.

### Message

- Role: Represents message within ChatUI.
- Description: Describes the nested message type used by the enclosing class.

### MultiChat

- Role: Represents multi chat within ChatUI.
- Description: Describes the nested multi chat type used by the enclosing class.

### MyMessage

- Role: Represents my message within ChatUI.
- Description: Describes the nested my message type used by the enclosing class.

### NamedMessage

- Role: Represents named message within ChatUI.
- Description: Describes the nested named message type used by the enclosing class.

### Notification

- Role: Represents notification within ChatUI.
- Description: Describes the nested notification type used by the enclosing class.

### OutMessage

- Role: Represents out message within ChatUI.
- Description: Describes the nested out message type used by the enclosing class.

### PartyChat

- Role: Represents party chat within ChatUI.
- Description: Describes the nested party chat type used by the enclosing class.

### PrivChat

- Role: Represents priv chat within ChatUI.
- Description: Describes the nested priv chat type used by the enclosing class.

### QuickLine

- Role: Represents quick line within ChatUI.
- Description: Describes the nested quick line type used by the enclosing class.

### Rendered

- Role: Represents rendered within ChatUI.
- Description: Describes the nested rendered type used by the enclosing class.

### RenderedMessage

- Role: Represents rendered message within ChatUI.
- Description: Describes the nested rendered message type used by the enclosing class.

### Selector

- Role: Represents selector within ChatUI.
- Description: Describes the nested selector type used by the enclosing class.

### SimpleChat

- Role: Represents simple chat within ChatUI.
- Description: Describes the nested simple chat type used by the enclosing class.

### SimpleMessage

- Role: Represents simple message within ChatUI.
- Description: Describes the nested simple message type used by the enclosing class.

### Spring

- Role: Represents spring within ChatUI.
- Description: Describes the nested spring type used by the enclosing class.

## Members

### Constants

#### `public static final RichText.Foundry fnd = new RichText.Foundry(new ChatParser(TextAttribute.FONT, Text.dfont.deriveFont(UI.scale(12f)), TextAttribute.FOREGROUND, Color.BLACK)).aa(true)`
- Role: Defines the shared fnd constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry qfnd = new Text.Foundry(Text.dfont, 12, new java.awt.Color(192, 255, 192))`
- Role: Defines the shared qfnd constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int selw = UI.scale(130)`
- Role: Defines the shared selw constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord marg = UI.scale(new Coord(9, 9))`
- Role: Defines the shared marg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color[] urgcols = new Color[]`
- Role: Defines the shared urgcols constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute HYPERLINK = new ChatAttribute("hyperlink")`
- Role: Defines the shared hyperlink constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pattern urlpat = Pattern.compile("\\b((https?://)|(www\\.[a-z0-9_.-]+\\.[a-z0-9_.-]+))[a-z0-9/_.~#%+?&:*=-]*", Pattern.CASE_INSENSITIVE)`
- Role: Defines the shared urlpat constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Map<? extends Attribute, ?> urlstyle = RichText.fillattrs(TextAttribute.FOREGROUND, new Color(64, 64, 255),`
- Role: Defines the shared urlstyle constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex chandiv = Resource.loadtex("gfx/hud/chat-cdiv")`
- Role: Defines the shared chandiv constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex chanseld = Resource.loadtex("gfx/hud/chat-csel")`
- Role: Defines the shared chanseld constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex bulc = Resource.loadtex("gfx/hud/chat-lc")`
- Role: Defines the shared bulc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex burc = Resource.loadtex("gfx/hud/chat-rc")`
- Role: Defines the shared burc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex bhb = Resource.loadtex("gfx/hud/chat-hori")`
- Role: Defines the shared bhb constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex bvlb = Resource.loadtex("gfx/hud/chat-verti")`
- Role: Defines the shared bvlb constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex bvrb = bvlb`
- Role: Defines the shared bvrb constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex bmf = Resource.loadtex("gfx/hud/chat-mid")`
- Role: Defines the shared bmf constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex bcbd = Resource.loadtex("gfx/hud/chat-close-g")`
- Role: Defines the shared bcbd constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Resource notifsfx = Resource.local().loadwait("sfx/hud/chat")`
- Role: Defines the shared notifsfx constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int minh = 111`
- Role: Defines the shared minh constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyBinding kb_quick = KeyBinding.get("chat-quick", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, 0))`
- Role: Defines the shared kb quick constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Channel sel = null`
- Role: Holds the sel state.
- Description: Backs the cached state for this file.

#### `public int urgency = 0`
- Role: Stores the urgency value.
- Description: Backs the cached state for this file.

#### `private final Selector chansel`
- Role: Holds the chansel state.
- Description: Backs the cached state for this file.

#### `private Coord base = Coord.z`
- Role: Stores the base value.
- Description: Backs the cached state for this file.

#### `private QuickLine qline = null`
- Role: Stores the qline value.
- Description: Backs the cached state for this file.

#### `private final LinkedList<Notification> notifs = new LinkedList<Notification>()`
- Role: Caches notifs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private UI.Grab qgrab`
- Role: Stores the qgrab value.
- Description: Backs the cached state for this file.

#### `public final List<RenderedMessage> rmsgs = new ArrayList<>()`
- Role: Caches rmsgs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int urgency = 0`
- Role: Stores the urgency value.
- Description: Backs the cached state for this file.

#### `private final Scrollbar sb`
- Role: Holds the sb state.
- Description: Backs the cached state for this file.

#### `private final IButton cb`
- Role: Holds the cb state.
- Description: Backs the cached state for this file.

#### `private double dy`
- Role: Stores the dy value.
- Description: Backs the cached state for this file.

#### `public final double time = Utils.ntime()`
- Role: Stores the time value.
- Description: Backs the cached state for this file.

#### `private RenderedMessage soldest = null, snewest = null`
- Role: Holds the soldest state.
- Description: Backs the cached state for this file.

#### `private RenderedMessage soldest = null, snewest = null`
- Role: Holds the soldest state.
- Description: Backs the cached state for this file.

#### `public final Message msg`
- Role: Holds the msg state.
- Description: Backs the cached state for this file.

#### `public final int idx`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `private Indir<Text> data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `private Text text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `RenderedMessage snext = null, sprev = null`
- Role: Holds the snext state.
- Description: Backs the cached state for this file.

#### `RenderedMessage snext = null, sprev = null`
- Role: Holds the snext state.
- Description: Backs the cached state for this file.

#### `double lseen = 0`
- Role: Stores the lseen value.
- Description: Backs the cached state for this file.

#### `int w, y`
- Role: Stores the y value.
- Description: Backs the cached state for this file.

#### `int w, y`
- Role: Stores the y value.
- Description: Backs the cached state for this file.

#### `private Coord sz = null`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public final String text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public final Color col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

#### `public final RenderedMessage rm`
- Role: Holds the rm state.
- Description: Backs the cached state for this file.

#### `public final int pn`
- Role: Stores the pn value.
- Description: Backs the cached state for this file.

#### `public final RichText.TextPart part`
- Role: Stores the part value.
- Description: Backs the cached state for this file.

#### `public final TextHitInfo ch`
- Role: Stores the ch value.
- Description: Backs the cached state for this file.

#### `public final Comparator<CharPos> poscmp = new Comparator<CharPos>()`
- Role: Stores the poscmp value.
- Description: Backs the cached state for this file.

#### `private CharPos selorig, lasthit, selstart, selend`
- Role: Stores the selend value.
- Description: Backs the cached state for this file.

#### `private CharPos selorig, lasthit, selstart, selend`
- Role: Stores the selend value.
- Description: Backs the cached state for this file.

#### `private CharPos selorig, lasthit, selstart, selend`
- Role: Stores the selend value.
- Description: Backs the cached state for this file.

#### `private CharPos selorig, lasthit, selstart, selend`
- Role: Stores the selend value.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

#### `private boolean dragging`
- Role: Tracks the dragging flag.
- Description: Supports the dragging operation used by the surrounding class.

#### `private Indir<Resource> iconres = null`
- Role: Stores the iconres value.
- Description: Backs the cached state for this file.

#### `private final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `private final TextEntry in`
- Role: Stores the in value.
- Description: Backs the cached state for this file.

#### `private List<String> history = new ArrayList<String>()`
- Role: Caches history entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int hpos = 0`
- Role: Stores the hpos value.
- Description: Backs the cached state for this file.

#### `private String hcurrent`
- Role: Stores the hcurrent value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final int urgency`
- Role: Stores the urgency value.
- Description: Backs the cached state for this file.

#### `private final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `private final Map<Integer, Color> pc = new HashMap<Integer, Color>()`
- Role: Caches pc entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Map<Integer, Boolean> muted = null`
- Role: Tracks the muted flag.
- Description: Supports the muted operation used by the surrounding class.

#### `private Integer mutewait = null`
- Role: Stores the mutewait value.
- Description: Backs the cached state for this file.

#### `public final int from`
- Role: Stores the from value.
- Description: Backs the cached state for this file.

#### `public final String text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public final Color col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

#### `public final int w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `public final String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `private float colseq = 0`
- Role: Stores the colseq value.
- Description: Backs the cached state for this file.

#### `private final int other`
- Role: Stores the other value.
- Description: Backs the cached state for this file.

#### `private boolean muted`
- Role: Tracks the muted flag.
- Description: Supports the muted operation used by the surrounding class.

#### `public final BufferedImage ctex = Resource.loadimg("gfx/hud/chantex")`
- Role: Stores the ctex value.
- Description: Backs the cached state for this file.

#### `public final Text.Foundry tf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12))).aa(true)`
- Role: Stores the tf value.
- Description: Backs the cached state for this file.

#### `public final Color[] uc =`
- Role: Holds the chat ui state.
- Description: Backs the cached state for this file.

#### `private final List<DarkChannel> chls = new ArrayList<DarkChannel>()`
- Role: Caches chls entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final int iconsz = UI.scale(16), ellw = tf.strsize("...").x, maxnmw = selw - iconsz`
- Role: Stores the iconsz value.
- Description: Backs the cached state for this file.

#### `private final int iconsz = UI.scale(16), ellw = tf.strsize("...").x, maxnmw = selw - iconsz`
- Role: Stores the iconsz value.
- Description: Backs the cached state for this file.

#### `private final int iconsz = UI.scale(16), ellw = tf.strsize("...").x, maxnmw = selw - iconsz`
- Role: Stores the iconsz value.
- Description: Backs the cached state for this file.

#### `private final int offset = chandiv.sz().y + chanseld.sz().y`
- Role: Stores the offset value.
- Description: Backs the cached state for this file.

#### `private int ts = 0`
- Role: Stores the ts value.
- Description: Backs the cached state for this file.

#### `private double ds = 0`
- Role: Stores the ds value.
- Description: Backs the cached state for this file.

#### `private Channel cstart`
- Role: Holds the cstart state.
- Description: Backs the cached state for this file.

#### `public final Channel chan`
- Role: Holds the chan state.
- Description: Backs the cached state for this file.

#### `public Text rname`
- Role: Stores the rname value.
- Description: Backs the cached state for this file.

#### `public Tex ricon`
- Role: Stores the ricon value.
- Description: Backs the cached state for this file.

#### `private int urgency = 0`
- Role: Stores the urgency value.
- Description: Backs the cached state for this file.

#### `private Resource.Image icon`
- Role: Stores the icon value.
- Description: Backs the cached state for this file.

#### `public final Channel chan`
- Role: Holds the chan state.
- Description: Backs the cached state for this file.

#### `public final Channel.Message msg`
- Role: Holds the msg state.
- Description: Backs the cached state for this file.

#### `public final Text chnm, rmsg`
- Role: Stores the rmsg value.
- Description: Backs the cached state for this file.

#### `public final Text chnm, rmsg`
- Role: Stores the rmsg value.
- Description: Backs the cached state for this file.

#### `public final double time = Utils.ntime()`
- Role: Stores the time value.
- Description: Backs the cached state for this file.

#### `private Text.Line rqline = null`
- Role: Stores the rqline value.
- Description: Backs the cached state for this file.

#### `private int rqpre`
- Role: Stores the rqpre value.
- Description: Backs the cached state for this file.

#### `final int oy = base.y - c.y, ny`
- Role: Stores the oy value.
- Description: Backs the cached state for this file.

#### `final int oy = base.y - c.y, ny`
- Role: Stores the oy value.
- Description: Backs the cached state for this file.

#### `public boolean targetshow = false`
- Role: Tracks the targetshow flag.
- Description: Supports the targetshow operation used by the surrounding class.

#### `public final ReadLine buf`
- Role: Holds the buf state.
- Description: Backs the cached state for this file.

#### `public final EntryChannel chan`
- Role: Holds the chan state.
- Description: Backs the cached state for this file.

#### `private UI.Grab dm = null`
- Role: Stores the dm value.
- Description: Backs the cached state for this file.

#### `private Coord doff`
- Role: Stores the doff value.
- Description: Backs the cached state for this file.

### Methods

#### `public ChatUI()`
- Role: Creates a new ChatUI instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `private ChatAttribute(String name)`
- Role: Performs chat attribute.
- Description: Supports the chat attribute operation used by the surrounding class.

#### `public ChatParser(Object... args)`
- Role: Performs chat parser.
- Description: Supports the chat parser operation used by the surrounding class.

#### `protected RichText.Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the text workflow.
- Description: Supports the text operation used by the surrounding class.

#### `public abstract Indir<Text> render(int w)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public boolean valid(Indir<Text> prev)`
- Role: Performs valid.
- Description: Supports the valid operation used by the surrounding class.

#### `public boolean mousedown(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public boolean clicked(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Performs clicked.
- Description: Supports the clicked operation used by the surrounding class.

#### `public RenderedMessage(Message msg, int idx, int iw)`
- Role: Performs rendered message.
- Description: Supports the rendered message operation used by the surrounding class.

#### `public Indir<Text> data()`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `private void slink()`
- Role: Performs slink.
- Description: Supports the slink operation used by the surrounding class.

#### `private void sunlink()`
- Role: Performs sunlink.
- Description: Supports the sunlink operation used by the surrounding class.

#### `public Text text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public int h()`
- Role: Performs h.
- Description: Supports the h operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public void invalidate()`
- Role: Performs invalidate.
- Description: Supports the invalidate operation used by the surrounding class.

#### `public void resize(int w)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public boolean update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `private void trimunseen()`
- Role: Performs trimunseen.
- Description: Supports the trimunseen operation used by the surrounding class.

#### `public SimpleMessage(String text, Color col)`
- Role: Performs simple message.
- Description: Supports the simple message operation used by the surrounding class.

#### `public Indir<Text> render(int w)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public Channel(boolean closable)`
- Role: Performs channel.
- Description: Supports the channel operation used by the surrounding class.

#### `public void append(Message msg, int urgency)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public void append(Message msg)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public void append(String line, Color col)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public int iw()`
- Role: Performs iw.
- Description: Supports the iw operation used by the surrounding class.

#### `public int ih()`
- Role: Performs ih.
- Description: Supports the ih operation used by the surrounding class.

#### `public void updurgency(int urg)`
- Role: Performs updurgency.
- Description: Supports the updurgency operation used by the surrounding class.

#### `public int messageat(int y, boolean nearest)`
- Role: Performs messageat.
- Description: Supports the messageat operation used by the surrounding class.

#### `public RenderedMessage messageat(Coord c, Coord hc)`
- Role: Performs messageat.
- Description: Supports the messageat operation used by the surrounding class.

#### `private void updyseq(int mi)`
- Role: Performs updyseq.
- Description: Supports the updyseq operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public CharPos(RenderedMessage rm, RichText.TextPart part, TextHitInfo ch)`
- Role: Performs char pos.
- Description: Supports the char pos operation used by the surrounding class.

#### `private static int partnum(RichText text, RichText.TextPart part)`
- Role: Performs partnum.
- Description: Supports the partnum operation used by the surrounding class.

#### `public boolean equals(Object oo)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public CharPos charat(Coord c)`
- Role: Performs charat.
- Description: Supports the charat operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `protected void selected(CharPos start, CharPos end)`
- Role: Performs selected.
- Description: Supports the selected operation used by the surrounding class.

#### `protected boolean clicked(CharPos pos, int btn)`
- Role: Performs clicked.
- Description: Supports the clicked operation used by the surrounding class.

#### `public void select()`
- Role: Performs select.
- Description: Supports the select operation used by the surrounding class.

#### `public void display()`
- Role: Performs display.
- Description: Supports the display operation used by the surrounding class.

#### `private void drawsel(GOut g, RenderedMessage rm, int y)`
- Role: Performs drawsel.
- Description: Supports the drawsel operation used by the surrounding class.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public abstract String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public boolean selmousedown(Coord c, int btn)`
- Role: Performs selmousedown.
- Description: Supports the selmousedown operation used by the surrounding class.

#### `public boolean selmouseup(Coord c, int btn)`
- Role: Performs selmouseup.
- Description: Supports the selmouseup operation used by the surrounding class.

#### `public boolean selclicked(Coord c, int btn)`
- Role: Performs selclicked.
- Description: Supports the selclicked operation used by the surrounding class.

#### `public Channel icon(Indir<Resource> res)`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public Resource.Image icon()`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public Log(String name)`
- Role: Performs log.
- Description: Supports the log operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public EntryChannel(boolean closable)`
- Role: Performs entry channel.
- Description: Supports the entry channel operation used by the surrounding class.

#### `public int ih()`
- Role: Performs ih.
- Description: Supports the ih operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void send(String text)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `public SimpleChat(boolean closable, String name)`
- Role: Performs simple chat.
- Description: Supports the simple chat operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public NamedMessage(int from, String text, Color col)`
- Role: Performs named message.
- Description: Supports the named message operation used by the surrounding class.

#### `public Rendered(int w, String nm)`
- Role: Performs rendered.
- Description: Supports the rendered operation used by the surrounding class.

#### `public Text get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private String nm()`
- Role: Performs nm.
- Description: Supports the nm operation used by the surrounding class.

#### `public Indir<Text> render(int w)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public boolean valid(Indir<Text> data)`
- Role: Performs valid.
- Description: Supports the valid operation used by the surrounding class.

#### `public boolean clicked(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Performs clicked.
- Description: Supports the clicked operation used by the surrounding class.

#### `private void mutemenu(int pl, boolean cur)`
- Role: Performs mutemenu.
- Description: Supports the mutemenu operation used by the surrounding class.

#### `public MyMessage(String text)`
- Role: Performs my message.
- Description: Supports the my message operation used by the surrounding class.

#### `public MultiChat(boolean closable, String name, int urgency)`
- Role: Performs multi chat.
- Description: Supports the multi chat operation used by the surrounding class.

#### `private Color nextcol()`
- Role: Performs nextcol.
- Description: Supports the nextcol operation used by the surrounding class.

#### `public Color fromcolor(int from)`
- Role: Performs fromcolor.
- Description: Supports the fromcolor operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public PartyChat()`
- Role: Performs party chat.
- Description: Supports the party chat operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public PrivChat(boolean closable, int other)`
- Role: Performs priv chat.
- Description: Supports the priv chat operation used by the surrounding class.

#### `private void menu()`
- Role: Performs menu.
- Description: Supports the menu operation used by the surrounding class.

#### `public boolean selclicked(Coord c, int btn)`
- Role: Performs selclicked.
- Description: Supports the selclicked operation used by the surrounding class.

#### `public InMessage(String text)`
- Role: Performs in message.
- Description: Supports the in message operation used by the surrounding class.

#### `public boolean clicked(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Performs clicked.
- Description: Supports the clicked operation used by the surrounding class.

#### `public OutMessage(String text)`
- Role: Performs out message.
- Description: Supports the out message operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public <T extends Widget> T add(T w)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void cdestroy(Widget w)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `private Text namedeco(String name, BufferedImage img, Color col)`
- Role: Performs namedeco.
- Description: Supports the namedeco operation used by the surrounding class.

#### `public Text nmrender(String name, Color col)`
- Role: Performs nmrender.
- Description: Supports the nmrender operation used by the surrounding class.

#### `public int chidx(Channel chan)`
- Role: Performs chidx.
- Description: Supports the chidx operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `private DarkChannel(Channel chan)`
- Role: Performs dark channel.
- Description: Supports the dark channel operation used by the surrounding class.

#### `public Text rname()`
- Role: Performs rname.
- Description: Supports the rname operation used by the surrounding class.

#### `public Tex ricon()`
- Role: Performs ricon.
- Description: Supports the ricon operation used by the surrounding class.

#### `public Selector(Coord sz)`
- Role: Performs selector.
- Description: Supports the selector operation used by the surrounding class.

#### `private void add(Channel chan)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `private void rm(Channel chan)`
- Role: Performs rm.
- Description: Supports the rm operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void show(int si)`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public void show(Channel chan)`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public boolean up()`
- Role: Performs up.
- Description: Supports the up operation used by the surrounding class.

#### `public boolean down()`
- Role: Performs down.
- Description: Supports the down operation used by the surrounding class.

#### `private Channel bypos(Coord c)`
- Role: Performs bypos.
- Description: Supports the bypos operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `private int clips(int s)`
- Role: Performs clips.
- Description: Supports the clips operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public void select(Channel chan, boolean focus)`
- Role: Performs select.
- Description: Supports the select operation used by the surrounding class.

#### `public void select(Channel chan)`
- Role: Performs select.
- Description: Supports the select operation used by the surrounding class.

#### `private Notification(Channel chan, Channel.Message msg)`
- Role: Performs notification.
- Description: Supports the notification operation used by the surrounding class.

#### `public void drawsmall(GOut g, Coord br, int h)`
- Role: Performs drawsmall.
- Description: Supports the drawsmall operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void notify(Channel chan, Channel.Message msg, int urgency)`
- Role: Performs notify.
- Description: Supports the notify operation used by the surrounding class.

#### `Spring(int ny)`
- Role: Handles the spring workflow.
- Description: Supports the spring operation used by the surrounding class.

#### `public void ntick(double a)`
- Role: Performs ntick.
- Description: Supports the ntick operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void presize()`
- Role: Performs presize.
- Description: Supports the presize operation used by the surrounding class.

#### `public void sshow(boolean show)`
- Role: Performs sshow.
- Description: Supports the sshow operation used by the surrounding class.

#### `public void hresize(int h)`
- Role: Performs hresize.
- Description: Supports the hresize operation used by the surrounding class.

#### `public void resize(int w)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void move(Coord base)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void expand()`
- Role: Performs expand.
- Description: Supports the expand operation used by the surrounding class.

#### `public void show()`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public void hide()`
- Role: Performs hide.
- Description: Supports the hide operation used by the surrounding class.

#### `private QuickLine(EntryChannel chan)`
- Role: Performs quick line.
- Description: Supports the quick line operation used by the surrounding class.

#### `private void cancel()`
- Role: Performs cancel.
- Description: Supports the cancel operation used by the surrounding class.

#### `public void done(ReadLine buf)`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public boolean key(KbdEvent ev)`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Supports the globtype operation used by the surrounding class.
