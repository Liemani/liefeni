---
source: [ChatUI.java](../../../../src/haven/ChatUI.java)
created: 2026-06-13
updated: 2026-06-14
---

# ChatUI

Owns the chat channels, channel selection, and rich-text parsing for in-game chat.

## Nested Types

### $MChat

- Role: Registers the multi-chat widget resource.
- Description: Factory that creates the chat widget variant for multi-chat mode.

### $PChat

- Role: Registers the party-chat widget resource.
- Description: Factory that creates the chat widget variant for party chat mode.

### $PMChat

- Role: Registers the private-multi chat widget resource.
- Description: Factory that creates the chat widget variant for private multi chat mode.

### $SChan

- Role: Registers the selected-channel widget resource.
- Description: Factory that creates the selector channel widget used in the chat UI.

### Channel

- Role: Models one chat channel.
- Description: Base widget that stores rendered messages, scroll state, and message interaction handling for a channel.

### CharPos

- Role: Tracks a character position within a rendered chat line.
- Description: Helper used for hit testing and text interaction inside chat messages.

### ChatAttribute

- Role: Marks chat-specific rich text attributes.
- Description: Custom attribute container used for chat hyperlink metadata.

### ChatParser

- Role: Parses chat text into rich text with links.
- Description: Rich text parser that detects URLs and applies hyperlink styling.

### DarkChannel

- Role: Renders a dark-styled chat channel.
- Description: Chat channel variant used for dark-themed message presentation.

### EntryChannel

- Role: Renders the channel input entry.
- Description: Chat channel variant for composing outgoing messages.

### InMessage

- Role: Models an incoming chat message.
- Description: Message subtype for text received from the server or other players.

### Log

- Role: Renders a chat log channel.
- Description: Channel variant that keeps a persistent message log.

### Message

- Role: Base class for chat messages.
- Description: Stores timestamp and interaction hooks shared by all message kinds.

### MultiChat

- Role: Renders the multi-chat channel.
- Description: Chat channel variant for mixed multi-user conversation display.

### MyMessage

- Role: Models the local player's outgoing chat message.
- Description: Message subtype for text authored by the current player.

### NamedMessage

- Role: Models a chat message with an explicit speaker name.
- Description: Message subtype that prefixes the rendered text with a name tag.

### Notification

- Role: Models a transient notification message.
- Description: Message subtype used for non-chat notices shown in the chat UI.

### OutMessage

- Role: Models an outgoing chat message.
- Description: Message subtype for text queued to be sent to the server.

### PartyChat

- Role: Renders the party chat channel.
- Description: Chat channel variant for party-only communication.

### PrivChat

- Role: Renders the private chat channel.
- Description: Chat channel variant for private one-to-one conversation.

### QuickLine

- Role: Models the quick chat input line.
- Description: Temporary input widget used for the single-line chat composer.

### Rendered

- Role: Wraps lazily rendered chat text.
- Description: Base message subtype that memoizes the rendered text representation.

### RenderedMessage

- Role: Tracks one rendered chat row.
- Description: UI wrapper that caches rendered text, size, and scroll bookkeeping for a message.

### Selector

- Role: Renders the channel selector sidebar.
- Description: Widget that lets the user switch between available chat channels.

### SimpleChat

- Role: Renders the simple chat channel.
- Description: Chat channel variant that displays plain text messages.

### SimpleMessage

- Role: Models a plain chat message.
- Description: Message subtype that renders simple text with an optional color.

### Spring

- Role: Binds channel selection to a specific spring-backed channel.
- Description: Chat message and channel helper used for spring-specific communication paths.

## Members

### Constants

#### `public static final RichText.Foundry fnd = new RichText.Foundry(new ChatParser(TextAttribute.FONT, Text.dfont.deriveFont(UI.scale(12f)), TextAttribute.FOREGROUND, Color.BLACK)).aa(true)`
- Role: Renders parsed chat text.
- Description: Rich-text foundry used for normal chat message rendering.
- Value: `new RichText.Foundry(new ChatParser(TextAttribute.FONT, Text.dfont.deriveFont(UI.scale(12f)), TextAttribute.FOREGROUND, Color.BLACK)).aa(true)`

#### `public static final Text.Foundry qfnd = new Text.Foundry(Text.dfont, 12, new java.awt.Color(192, 255, 192))`
- Role: Renders quick-chat text.
- Description: Text foundry used by the quick input line.
- Value: `new Text.Foundry(Text.dfont, 12, new java.awt.Color(192, 255, 192))`

#### `public static final int selw = UI.scale(130)`
- Role: Implements the selw operation.
- Description: Implements the scale operation.
- Value: `UI.scale(130)`

#### `public static final Coord marg = UI.scale(new Coord(9, 9))`
- Role: Defines the chat margin.
- Description: Padding used around the chat widget layout.
- Value: `UI.scale(new Coord(9, 9))`

#### `public static final Color[] urgcols = new Color[]`
- Role: Defines urgency colors.
- Description: Color ramp used to highlight urgent chat messages.
- Value: `new Color[]`

#### `public static final Attribute HYPERLINK = new ChatAttribute("hyperlink")`
- Role: Implements the hyperlink operation.
- Description: Implements the chat attribute operation.
- Value: `new ChatAttribute("hyperlink")`

#### `public static final Pattern urlpat = Pattern.compile("\\b((https?://)|(www\\.[a-z0-9_.-]+\\.[a-z0-9_.-]+))[a-z0-9/_.~#%+?&:*=-]*", Pattern.CASE_INSENSITIVE)`
- Role: Implements the urlpat operation.
- Description: Implements the b operation.
- Value: `Pattern.compile("\\b((https?://)|(www\\.[a-z0-9_.-]+\\.[a-z0-9_.-]+))[a-z0-9/_.~#%+?&:*=-]*", Pattern.CASE_INSENSITIVE)`

#### `public static final Map<? extends Attribute, ?> urlstyle = RichText.fillattrs(TextAttribute.FOREGROUND, new Color(64, 64, 255),`
- Role: Implements the urlstyle operation.
- Description: Implements the color operation.
- Value: `RichText.fillattrs(TextAttribute.FOREGROUND, new Color(64, 64, 255),`

#### `private static final Tex chandiv = Resource.loadtex("gfx/hud/chat-cdiv")`
- Role: Implements the chandiv operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chat-cdiv")`

#### `private static final Tex chanseld = Resource.loadtex("gfx/hud/chat-csel")`
- Role: Implements the chanseld operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chat-csel")`

#### `private static final Tex bulc = Resource.loadtex("gfx/hud/chat-lc")`
- Role: Implements the bulc operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chat-lc")`

#### `private static final Tex burc = Resource.loadtex("gfx/hud/chat-rc")`
- Role: Implements the burc operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chat-rc")`

#### `private static final Tex bhb = Resource.loadtex("gfx/hud/chat-hori")`
- Role: Implements the bhb operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chat-hori")`

#### `private static final Tex bvlb = Resource.loadtex("gfx/hud/chat-verti")`
- Role: Implements the bvlb operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chat-verti")`

#### `private static final Tex bvrb = bvlb`
- Role: Caches the bvrb value.
- Description: Caches the `bvrb` value for reuse.
- Value: `bvlb`

#### `private static final Tex bmf = Resource.loadtex("gfx/hud/chat-mid")`
- Role: Implements the bmf operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chat-mid")`

#### `private static final Tex bcbd = Resource.loadtex("gfx/hud/chat-close-g")`
- Role: Implements the bcbd operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/chat-close-g")`

#### `private static final Resource notifsfx = Resource.local().loadwait("sfx/hud/chat")`
- Role: Stores the chat notification sound.
- Description: Resource used when a chat notification should play.
- Value: `Resource.local().loadwait("sfx/hud/chat")`

#### `private static final int minh = 111`
- Role: Caches the minh value.
- Description: Caches the `minh` value for reuse.
- Value: `111`

#### `public static final KeyBinding kb_quick = KeyBinding.get("chat-quick", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, 0))`
- Role: Implements the kb quick operation.
- Description: Implements the forcode operation.
- Value: `KeyBinding.get("chat-quick", KeyMatch.forcode(java.awt.event.KeyEvent.VK_ENTER, 0))`

### Fields

#### `public Channel sel = null`
- Role: Caches the sel value.
- Description: Caches the `sel` value for reuse.

#### `public int urgency = 0`
- Role: Caches the urgency value.
- Description: Caches the `urgency` value for reuse.

#### `private final Selector chansel`
- Role: Caches the chansel value.
- Description: Caches the `chansel` value for reuse.

#### `private Coord base = Coord.z`
- Role: Caches the base value.
- Description: Caches the `base` value for reuse.

#### `private QuickLine qline = null`
- Role: Caches the qline value.
- Description: Caches the `qline` value for reuse.

#### `private final LinkedList<Notification> notifs = new LinkedList<Notification>()`
- Role: Implements the notifs operation.
- Description: Implements the private final linked list<notification> notifs = new linked list<notification>() operation.

#### `private UI.Grab qgrab`
- Role: Caches the qgrab value.
- Description: Caches the `qgrab` value for reuse.

#### `public final List<RenderedMessage> rmsgs = new ArrayList<>()`
- Role: Implements the rmsgs operation.
- Description: Implements the public final list<rendered message> rmsgs = new array list<>() operation.

#### `public int urgency = 0`
- Role: Caches the urgency value.
- Description: Caches the `urgency` value for reuse.

#### `private final Scrollbar sb`
- Role: Caches the sb value.
- Description: Caches the `sb` value for reuse.

#### `private final IButton cb`
- Role: Caches the cb value.
- Description: Caches the `cb` value for reuse.

#### `private double dy`
- Role: Caches the dy value.
- Description: Caches the `dy` value for reuse.

#### `public final double time = Utils.ntime()`
- Role: Implements the time operation.
- Description: Implements the ntime operation.

#### `private RenderedMessage soldest = null, snewest = null`
- Role: Caches the soldest value.
- Description: Caches the `soldest` value for reuse.

#### `private RenderedMessage soldest = null, snewest = null`
- Role: Caches the soldest value.
- Description: Caches the `soldest` value for reuse.

#### `public final Message msg`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.

#### `public final int idx`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `private Indir<Text> data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private Text text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `RenderedMessage snext = null, sprev = null`
- Role: Caches the snext value.
- Description: Caches the `snext` value for reuse.

#### `RenderedMessage snext = null, sprev = null`
- Role: Caches the snext value.
- Description: Caches the `snext` value for reuse.

#### `double lseen = 0`
- Role: Caches the lseen value.
- Description: Caches the `lseen` value for reuse.

#### `int w, y`
- Role: Caches the y value.
- Description: Caches the `y` value for reuse.

#### `int w, y`
- Role: Caches the y value.
- Description: Caches the `y` value for reuse.

#### `private Coord sz = null`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `public final String text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `public final Color col`
- Role: Caches the col value.
- Description: Caches the `col` value for reuse.

#### `public final RenderedMessage rm`
- Role: Caches the rm value.
- Description: Caches the `rm` value for reuse.

#### `public final int pn`
- Role: Caches the pn value.
- Description: Caches the `pn` value for reuse.

#### `public final RichText.TextPart part`
- Role: Caches the part value.
- Description: Caches the `part` value for reuse.

#### `public final TextHitInfo ch`
- Role: Caches the ch value.
- Description: Caches the `ch` value for reuse.

#### `public final Comparator<CharPos> poscmp = new Comparator<CharPos>()`
- Role: Implements the poscmp operation.
- Description: Implements the public final comparator<char pos> poscmp = new comparator<char pos>() operation.

#### `private CharPos selorig, lasthit, selstart, selend`
- Role: Caches the selend value.
- Description: Caches the `selend` value for reuse.

#### `private CharPos selorig, lasthit, selstart, selend`
- Role: Caches the selend value.
- Description: Caches the `selend` value for reuse.

#### `private CharPos selorig, lasthit, selstart, selend`
- Role: Caches the selend value.
- Description: Caches the `selend` value for reuse.

#### `private CharPos selorig, lasthit, selstart, selend`
- Role: Caches the selend value.
- Description: Caches the `selend` value for reuse.

#### `private UI.Grab grab`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

#### `private boolean dragging`
- Role: Tracks the dragging flag.
- Description: Caches the `dragging` value for reuse.

#### `private Indir<Resource> iconres = null`
- Role: Caches the iconres value.
- Description: Caches the `iconres` value for reuse.

#### `private final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `private final TextEntry in`
- Role: Caches the in value.
- Description: Caches the `in` value for reuse.

#### `private List<String> history = new ArrayList<String>()`
- Role: Implements the history operation.
- Description: Implements the private list<string> history = new array list<string>() operation.

#### `private int hpos = 0`
- Role: Caches the hpos value.
- Description: Caches the `hpos` value for reuse.

#### `private String hcurrent`
- Role: Caches the hcurrent value.
- Description: Caches the `hcurrent` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final int urgency`
- Role: Caches the urgency value.
- Description: Caches the `urgency` value for reuse.

#### `private final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `private final Map<Integer, Color> pc = new HashMap<Integer, Color>()`
- Role: Implements the pc operation.
- Description: Implements the private final map<integer, color> pc = new hash map<integer, color>() operation.

#### `private Map<Integer, Boolean> muted = null`
- Role: Tracks the muted flag.
- Description: Caches the `muted` value for reuse.

#### `private Integer mutewait = null`
- Role: Caches the mutewait value.
- Description: Caches the `mutewait` value for reuse.

#### `public final int from`
- Role: Caches the from value.
- Description: Caches the `from` value for reuse.

#### `public final String text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `public final Color col`
- Role: Caches the col value.
- Description: Caches the `col` value for reuse.

#### `public final int w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `public final String nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `private float colseq = 0`
- Role: Caches the colseq value.
- Description: Caches the `colseq` value for reuse.

#### `private final int other`
- Role: Caches the other value.
- Description: Caches the `other` value for reuse.

#### `private boolean muted`
- Role: Tracks the muted flag.
- Description: Caches the `muted` value for reuse.

#### `public final BufferedImage ctex = Resource.loadimg("gfx/hud/chantex")`
- Role: Implements the ctex operation.
- Description: Implements the loadimg operation.

#### `public final Text.Foundry tf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12))).aa(true)`
- Role: Implements the tf operation.
- Description: Implements the aa operation.

#### `public final Color[] uc =`
- Role: Caches the uc value.
- Description: Caches the `uc` value for reuse.

#### `private final List<DarkChannel> chls = new ArrayList<DarkChannel>()`
- Role: Implements the chls operation.
- Description: Implements the private final list<dark channel> chls = new array list<dark channel>() operation.

#### `private final int iconsz = UI.scale(16), ellw = tf.strsize("...").x, maxnmw = selw - iconsz`
- Role: Implements the iconsz operation.
- Description: Implements the strsize operation.

#### `private final int iconsz = UI.scale(16), ellw = tf.strsize("...").x, maxnmw = selw - iconsz`
- Role: Implements the iconsz operation.
- Description: Implements the strsize operation.

#### `private final int iconsz = UI.scale(16), ellw = tf.strsize("...").x, maxnmw = selw - iconsz`
- Role: Implements the iconsz operation.
- Description: Implements the strsize operation.

#### `private final int offset = chandiv.sz().y + chanseld.sz().y`
- Role: Implements the offset operation.
- Description: Implements the sz operation.

#### `private int ts = 0`
- Role: Caches the ts value.
- Description: Caches the `ts` value for reuse.

#### `private double ds = 0`
- Role: Caches the ds value.
- Description: Caches the `ds` value for reuse.

#### `private Channel cstart`
- Role: Caches the cstart value.
- Description: Caches the `cstart` value for reuse.

#### `public final Channel chan`
- Role: Caches the chan value.
- Description: Caches the `chan` value for reuse.

#### `public Text rname`
- Role: Caches the rname value.
- Description: Caches the `rname` value for reuse.

#### `public Tex ricon`
- Role: Caches the ricon value.
- Description: Caches the `ricon` value for reuse.

#### `private int urgency = 0`
- Role: Caches the urgency value.
- Description: Caches the `urgency` value for reuse.

#### `private Resource.Image icon`
- Role: Caches the icon value.
- Description: Caches the `icon` value for reuse.

#### `public final Channel chan`
- Role: Caches the chan value.
- Description: Caches the `chan` value for reuse.

#### `public final Channel.Message msg`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.

#### `public final Text chnm, rmsg`
- Role: Caches the rmsg value.
- Description: Caches the `rmsg` value for reuse.

#### `public final Text chnm, rmsg`
- Role: Caches the rmsg value.
- Description: Caches the `rmsg` value for reuse.

#### `public final double time = Utils.ntime()`
- Role: Implements the time operation.
- Description: Implements the ntime operation.

#### `private Text.Line rqline = null`
- Role: Caches the rqline value.
- Description: Caches the `rqline` value for reuse.

#### `private int rqpre`
- Role: Caches the rqpre value.
- Description: Caches the `rqpre` value for reuse.

#### `final int oy = base.y - c.y, ny`
- Role: Caches the oy value.
- Description: Caches the `oy` value for reuse.

#### `final int oy = base.y - c.y, ny`
- Role: Caches the oy value.
- Description: Caches the `oy` value for reuse.

#### `public boolean targetshow = false`
- Role: Tracks the targetshow flag.
- Description: Caches the `targetshow` value for reuse.

#### `public final ReadLine buf`
- Role: Caches the buf value.
- Description: Caches the `buf` value for reuse.

#### `public final EntryChannel chan`
- Role: Caches the chan value.
- Description: Caches the `chan` value for reuse.

#### `private UI.Grab dm = null`
- Role: Caches the dm value.
- Description: Caches the `dm` value for reuse.

#### `private Coord doff`
- Role: Caches the doff value.
- Description: Caches the `doff` value for reuse.

### Methods

#### `public ChatUI()`
- Role: Creates a new ChatUI instance.
- Description: Constructs the ChatUI instance from the supplied inputs.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `private ChatAttribute(String name)`
- Role: Handles the chat attribute path.
- Description: Implements the chat attribute operation.

#### `public ChatParser(Object... args)`
- Role: Handles the chat parser path.
- Description: Implements the chat parser operation.

#### `protected RichText.Part text(PState s, String text, Map<? extends Attribute, ?> attrs) throws IOException`
- Role: Handles the text workflow.
- Description: Implements the text operation.

#### `public abstract Indir<Text> render(int w)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public boolean valid(Indir<Text> prev)`
- Role: Handles the valid path.
- Description: Implements the valid operation.

#### `public boolean mousedown(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mouseup(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public boolean clicked(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Handles the clicked path.
- Description: Handles ed interaction.

#### `public RenderedMessage(Message msg, int idx, int iw)`
- Role: Handles the rendered message path.
- Description: Implements the rendered message operation.

#### `public Indir<Text> data()`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `private void slink()`
- Role: Handles the slink path.
- Description: Implements the slink operation.

#### `private void sunlink()`
- Role: Handles the sunlink path.
- Description: Implements the sunlink operation.

#### `public Text text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public int h()`
- Role: Handles the h path.
- Description: Implements the h operation.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public void invalidate()`
- Role: Handles the invalidate path.
- Description: Implements the invalidate operation.

#### `public void resize(int w)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public boolean update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `private void trimunseen()`
- Role: Handles the trimunseen path.
- Description: Implements the trimunseen operation.

#### `public SimpleMessage(String text, Color col)`
- Role: Handles the simple message path.
- Description: Implements the simple message operation.

#### `public Indir<Text> render(int w)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public Channel(boolean closable)`
- Role: Handles the channel path.
- Description: Implements the channel operation.

#### `public void append(Message msg, int urgency)`
- Role: Handles the append path.
- Description: Implements the append operation.

#### `public void append(Message msg)`
- Role: Handles the append path.
- Description: Implements the append operation.

#### `public void append(String line, Color col)`
- Role: Handles the append path.
- Description: Implements the append operation.

#### `public int iw()`
- Role: Handles the iw path.
- Description: Implements the iw operation.

#### `public int ih()`
- Role: Handles the ih path.
- Description: Implements the ih operation.

#### `public void updurgency(int urg)`
- Role: Handles the updurgency path.
- Description: Implements the updurgency operation.

#### `public int messageat(int y, boolean nearest)`
- Role: Handles the messageat path.
- Description: Implements the messageat operation.

#### `public RenderedMessage messageat(Coord c, Coord hc)`
- Role: Handles the messageat path.
- Description: Implements the messageat operation.

#### `private void updyseq(int mi)`
- Role: Handles the updyseq path.
- Description: Implements the updyseq operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the ChatUI content.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public CharPos(RenderedMessage rm, RichText.TextPart part, TextHitInfo ch)`
- Role: Handles the char pos path.
- Description: Implements the char pos operation.

#### `private static int partnum(RichText text, RichText.TextPart part)`
- Role: Handles the partnum path.
- Description: Implements the partnum operation.

#### `public boolean equals(Object oo)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this ChatUI for debugging and logging.

#### `public CharPos charat(Coord c)`
- Role: Handles the charat path.
- Description: Implements the charat operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `protected void selected(CharPos start, CharPos end)`
- Role: Handles the selected path.
- Description: Implements the selected operation.

#### `protected boolean clicked(CharPos pos, int btn)`
- Role: Handles the clicked path.
- Description: Handles ed interaction.

#### `public void select()`
- Role: Handles the select path.
- Description: Implements the select operation.

#### `public void display()`
- Role: Handles the display path.
- Description: Implements the display operation.

#### `private void drawsel(GOut g, RenderedMessage rm, int y)`
- Role: Handles the drawsel path.
- Description: Draws the sel.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.

#### `public abstract String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public boolean selmousedown(Coord c, int btn)`
- Role: Handles the selmousedown path.
- Description: Implements the selmousedown operation.

#### `public boolean selmouseup(Coord c, int btn)`
- Role: Handles the selmouseup path.
- Description: Implements the selmouseup operation.

#### `public boolean selclicked(Coord c, int btn)`
- Role: Handles the selclicked path.
- Description: Implements the selclicked operation.

#### `public Channel icon(Indir<Resource> res)`
- Role: Handles the icon path.
- Description: Implements the icon operation.

#### `public Resource.Image icon()`
- Role: Handles the icon path.
- Description: Implements the icon operation.

#### `public Log(String name)`
- Role: Handles the log path.
- Description: Implements the log operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public EntryChannel(boolean closable)`
- Role: Handles the entry channel path.
- Description: Implements the entry channel operation.

#### `public int ih()`
- Role: Handles the ih path.
- Description: Implements the ih operation.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void send(String text)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `public SimpleChat(boolean closable, String name)`
- Role: Handles the simple chat path.
- Description: Implements the simple chat operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public NamedMessage(int from, String text, Color col)`
- Role: Handles the named message path.
- Description: Implements the named message operation.

#### `public Rendered(int w, String nm)`
- Role: Handles the rendered path.
- Description: Implements the rendered operation.

#### `public Text get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `private String nm()`
- Role: Handles the nm path.
- Description: Implements the nm operation.

#### `public Indir<Text> render(int w)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public boolean valid(Indir<Text> data)`
- Role: Handles the valid path.
- Description: Implements the valid operation.

#### `public boolean clicked(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Handles the clicked path.
- Description: Handles ed interaction.

#### `private void mutemenu(int pl, boolean cur)`
- Role: Handles the mutemenu path.
- Description: Implements the mutemenu operation.

#### `public MyMessage(String text)`
- Role: Handles the my message path.
- Description: Implements the my message operation.

#### `public MultiChat(boolean closable, String name, int urgency)`
- Role: Handles the multi chat path.
- Description: Implements the multi chat operation.

#### `private Color nextcol()`
- Role: Handles the nextcol path.
- Description: Implements the nextcol operation.

#### `public Color fromcolor(int from)`
- Role: Handles the fromcolor path.
- Description: Implements the fromcolor operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public PartyChat()`
- Role: Handles the party chat path.
- Description: Implements the party chat operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public PrivChat(boolean closable, int other)`
- Role: Handles the priv chat path.
- Description: Implements the priv chat operation.

#### `private void menu()`
- Role: Handles the menu path.
- Description: Implements the menu operation.

#### `public boolean selclicked(Coord c, int btn)`
- Role: Handles the selclicked path.
- Description: Implements the selclicked operation.

#### `public InMessage(String text)`
- Role: Handles the in message path.
- Description: Implements the in message operation.

#### `public boolean clicked(Channel chan, CharPos pos, Coord c, int btn)`
- Role: Handles the clicked path.
- Description: Handles ed interaction.

#### `public OutMessage(String text)`
- Role: Handles the out message path.
- Description: Implements the out message operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

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
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public <T extends Widget> T add(T w)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void cdestroy(Widget w)`
- Role: Handles the cdestroy path.
- Description: Implements the cdestroy operation.

#### `private Text namedeco(String name, BufferedImage img, Color col)`
- Role: Handles the namedeco path.
- Description: Implements the namedeco operation.

#### `public Text nmrender(String name, Color col)`
- Role: Handles the nmrender path.
- Description: Implements the nmrender operation.

#### `public int chidx(Channel chan)`
- Role: Handles the chidx path.
- Description: Implements the chidx operation.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `private DarkChannel(Channel chan)`
- Role: Handles the dark channel path.
- Description: Implements the dark channel operation.

#### `public Text rname()`
- Role: Handles the rname path.
- Description: Implements the rname operation.

#### `public Tex ricon()`
- Role: Handles the ricon path.
- Description: Implements the ricon operation.

#### `public Selector(Coord sz)`
- Role: Handles the selector path.
- Description: Implements the selector operation.

#### `private void add(Channel chan)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `private void rm(Channel chan)`
- Role: Handles the rm path.
- Description: Implements the rm operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the ChatUI content.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void show(int si)`
- Role: Handles the show path.
- Description: Implements the show operation.

#### `public void show(Channel chan)`
- Role: Handles the show path.
- Description: Implements the show operation.

#### `public boolean up()`
- Role: Handles the up path.
- Description: Implements the up operation.

#### `public boolean down()`
- Role: Handles the down path.
- Description: Implements the down operation.

#### `private Channel bypos(Coord c)`
- Role: Handles the bypos path.
- Description: Implements the bypos operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `private int clips(int s)`
- Role: Handles the clips path.
- Description: Implements the clips operation.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public void select(Channel chan, boolean focus)`
- Role: Handles the select path.
- Description: Implements the select operation.

#### `public void select(Channel chan)`
- Role: Handles the select path.
- Description: Implements the select operation.

#### `private Notification(Channel chan, Channel.Message msg)`
- Role: Handles the notification path.
- Description: Implements the notification operation.

#### `public void drawsmall(GOut g, Coord br, int h)`
- Role: Handles the drawsmall path.
- Description: Draws the small.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the ChatUI content.

#### `public void notify(Channel chan, Channel.Message msg, int urgency)`
- Role: Handles the notify path.
- Description: Implements the notify operation.

#### `Spring(int ny)`
- Role: Handles the spring workflow.
- Description: Implements the spring operation.

#### `public void ntick(double a)`
- Role: Handles the ntick path.
- Description: Implements the ntick operation.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void presize()`
- Role: Handles the presize path.
- Description: Implements the presize operation.

#### `public void sshow(boolean show)`
- Role: Handles the sshow path.
- Description: Implements the sshow operation.

#### `public void hresize(int h)`
- Role: Handles the hresize path.
- Description: Implements the hresize operation.

#### `public void resize(int w)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void move(Coord base)`
- Role: Moves the current state.
- Description: Implements the move operation.

#### `public void expand()`
- Role: Handles the expand path.
- Description: Implements the expand operation.

#### `public void show()`
- Role: Handles the show path.
- Description: Implements the show operation.

#### `public void hide()`
- Role: Handles the hide path.
- Description: Implements the hide operation.

#### `private QuickLine(EntryChannel chan)`
- Role: Handles the quick line path.
- Description: Implements the quick line operation.

#### `private void cancel()`
- Role: Cancels the current waiting registration.
- Description: Cancels the current waiting registration.

#### `public void done(ReadLine buf)`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public boolean key(KbdEvent ev)`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public boolean globtype(GlobKeyEvent ev)`
- Role: Handles a global key event.
- Description: Implements the globtype operation.