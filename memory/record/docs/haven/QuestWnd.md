---
source: [QuestWnd.java](../../../../src/haven/QuestWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# QuestWnd

Manages the quest list, quest box, and quest completion popups.

## Nested Types

### $_

- Role: Registers the `quests` widget factory.
- Description: Creates the quest window from the resource system.

### $quest

- Role: Registers one quest box resource factory.
- Description: Builds a `DefaultBox` for quest resources sent from the server.

### Box

- Role: Represents one quest detail widget.
- Description: Stores the quest resource, title, conditions, and quest-view adapter.

### CondWidget

- Role: Base widget for a quest condition line.
- Description: Lets condition-specific widgets update themselves before reuse.

### Condition

- Role: Stores one quest condition state entry.
- Description: Keeps the description, completion state, optional status text, and widget data.

### DefaultBox

- Role: Renders a quest box with text and condition widgets.
- Description: Lays out the quest description, options, and condition widgets inside a scrollport.

### DefaultCond

- Role: Renders one default quest condition line.
- Description: Formats the condition text with the state color and symbol.

### Info

- Role: Exposes the quest-box contract used by `QView`.
- Description: Supplies quest id and quest-view widget access.

### Item

- Role: Renders one quest list row.
- Description: Draws the quest title/icon and forwards selection clicks to the quest window.

### QVInfo

- Role: Supplies quest-view data for `QView`.
- Description: Exposes title, conditions, and completion state to the hover popup.

### QView

- Role: Renders the compact hover quest view.
- Description: Draws the quest title and conditions, highlights changed conditions, and links back to the quest tab.

### Quest

- Role: Stores one quest row from the server.
- Description: Keeps the id, resource, title, state, and modification time for sorting and display.

### QuestList

- Role: Renders and manages the quest list.
- Description: Sorts quests by modification time and handles selection and deselection.

## Members

### Constants

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`
- Role: Defines quest status codes.
- Description: Encodes pending, done, failed, and disabled quest states.
- Value: `0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`
- Role: Caches the qst pend value.
- Description: Caches the `QST_PEND` value for reuse.
- Value: `0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`
- Role: Caches the qst pend value.
- Description: Caches the `QST_PEND` value for reuse.
- Value: `0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`
- Role: Caches the qst pend value.
- Description: Caches the `QST_PEND` value for reuse.
- Value: `0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`

#### `public static final Color[] stcol =`
- Role: Maps quest status to colors.
- Description: Holds the status colors used when rendering quest conditions.
- Value: ``

#### `public static final char[] stsym =`
- Role: Maps quest status to symbols.
- Description: Holds the status glyphs shown in quest condition text.
- Value: ``

#### `private static final Tex qcmp = catf.render("Quest completed").tex()`
- Role: Stores the quest-complete message texture.
- Description: Renders the completion toast text once and reuses it.
- Value: `catf.render("Quest completed").tex()`

#### `private static final Tex qfail = failf.render("Quest failed").tex()`
- Role: Stores the quest-failed message texture.
- Description: Renders the failure toast text once and reuses it.
- Value: `failf.render("Quest failed").tex()`

#### `public static final Text.Furnace qtfnd = new BlurFurn(new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true), 2, 1, Color.BLACK)`
- Role: Builds the quest-title text furnace.
- Description: Styles the bold serif title used in quest popups.
- Value: `new BlurFurn(new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true), 2, 1, Color.BLACK)`

#### `public static final Text.Foundry qcfnd = new Text.Foundry(Text.sans, 12).aa(true)`
- Role: Builds the quest-condition text foundry.
- Description: Styles the smaller sans-serif text used for conditions.
- Value: `new Text.Foundry(Text.sans, 12).aa(true)`

### Fields

#### `public final Widget questbox`
- Role: Hosts the active quest detail widget.
- Description: Contains the quest box currently displayed by the window.

#### `public final QuestList cqst, dqst`
- Role: Stores the active and done quest lists.
- Description: Splits quests into current and completed views.

#### `public final QuestList cqst, dqst`
- Role: Caches the dqst value.
- Description: Caches the `dqst` value for reuse.

#### `public Quest.Info quest`
- Role: Tracks the selected quest info.
- Description: Points at the quest currently shown in the detail pane.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public String title`
- Role: Caches the title value.
- Description: Caches the `title` value for reuse.

#### `public int done`
- Role: Caches the done value.
- Description: Caches the `done` value for reuse.

#### `public int mtime`
- Role: Caches the mtime value.
- Description: Caches the `mtime` value for reuse.

#### `public final String desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `public int done`
- Role: Caches the done value.
- Description: Caches the `done` value for reuse.

#### `public String status`
- Role: Caches the status value.
- Description: Caches the `status` value for reuse.

#### `public Object[] wdata = null`
- Role: Caches the wdata value.
- Description: Caches the `wdata` value for reuse.

#### `public final Condition cond`
- Role: Caches the cond value.
- Description: Caches the `cond` value for reuse.

#### `public Text text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final String title`
- Role: Caches the title value.
- Description: Caches the `title` value for reuse.

#### `public Condition[] cond =`
- Role: Caches the cond value.
- Description: Caches the `cond` value for reuse.

#### `private QView cqv`
- Role: Caches the cqv value.
- Description: Caches the `cqv` value for reuse.

#### `private QuestWnd qw = null`
- Role: Caches the qw value.
- Description: Caches the `qw` value for reuse.

#### `public final QVInfo info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `private Condition[] ccond`
- Role: Caches the ccond value.
- Description: Caches the `ccond` value for reuse.

#### `private Tex[] rcond =`
- Role: Caches the rcond value.
- Description: Caches the `rcond` value for reuse.

#### `private Tex rtitle = null`
- Role: Caches the rtitle value.
- Description: Caches the `rtitle` value for reuse.

#### `private Tex glow, glowon`
- Role: Caches the glowon value.
- Description: Caches the `glowon` value for reuse.

#### `private Tex glow, glowon`
- Role: Caches the glowon value.
- Description: Caches the `glowon` value for reuse.

#### `private double glowt = -1`
- Role: Caches the glowt value.
- Description: Caches the `glowt` value for reuse.

#### `private Widget current`
- Role: Tracks the current .
- Description: Tracks the current .

#### `private boolean refresh = true`
- Role: Tracks the refresh flag.
- Description: Caches the `refresh` value for reuse.

#### `public List<Pair<String, String>> options = Collections.emptyList()`
- Role: Implements the options operation.
- Description: Implements the empty list operation.

#### `public CondWidget[] condw =`
- Role: Caches the condw value.
- Description: Caches the `condw` value for reuse.

#### `public List<Quest> quests = new ArrayList<Quest>()`
- Role: Implements the quests operation.
- Description: Implements the public list<quest> quests = new array list<quest>() operation.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Tracks whether  is currently loading.

#### `private final Comparator<Quest> comp = new Comparator<Quest>()`
- Role: Implements the comp operation.
- Description: Implements the private final comparator<quest> comp = new comparator<quest>() operation.

#### `public final Quest q`
- Role: Caches the q value.
- Description: Caches the `q` value for reuse.

#### `private final IconText nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `private Object dres, dtit`
- Role: Caches the dtit value.
- Description: Caches the `dtit` value for reuse.

#### `private Object dres, dtit`
- Role: Caches the dtit value.
- Description: Caches the `dtit` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private Quest(int id, Indir<Resource> res, String title, int done, int mtime)`
- Role: Handles the quest path.
- Description: Implements the quest operation.

#### `public String title()`
- Role: Handles the title path.
- Description: Implements the title operation.

#### `public Condition(String desc, int done, String status)`
- Role: Handles the condition path.
- Description: Implements the condition operation.

#### `public void done(GameUI parent)`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public CondWidget(Condition cond)`
- Role: Handles the cond widget path.
- Description: Implements the cond widget operation.

#### `public boolean update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public DefaultCond(Condition cond)`
- Role: Handles the default cond path.
- Description: Implements the default cond operation.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the QuestWnd content.

#### `public Box(int id, Indir<Resource> res, String title)`
- Role: Handles the box path.
- Description: Implements the box operation.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public String title()`
- Role: Handles the title path.
- Description: Implements the title operation.

#### `public Condition[] conds()`
- Role: Handles the conds path.
- Description: Implements the conds operation.

#### `public int done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public void refresh()`
- Role: Refreshes waypoint manager state.
- Description: Implements the refresh operation.

#### `public String rendertext()`
- Role: Handles the rendertext path.
- Description: Renders the text.

#### `public Condition findcond(String desc)`
- Role: Handles the findcond path.
- Description: Finds the cond.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void destroy()`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.

#### `public int questid()`
- Role: Handles the questid path.
- Description: Implements the questid operation.

#### `public Widget qview()`
- Role: Handles the qview path.
- Description: Implements the qview operation.

#### `public String title()`
- Role: Handles the title path.
- Description: Implements the title operation.

#### `public Condition[] conds()`
- Role: Handles the conds path.
- Description: Implements the conds operation.

#### `public int done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public QView(QVInfo info)`
- Role: Handles the qview path.
- Description: Implements the q view operation.

#### `private void resize()`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the QuestWnd content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `private Text ct(Condition c)`
- Role: Handles the ct path.
- Description: Implements the ct operation.

#### `void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `void update(Condition c)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public DefaultBox(int id, Indir<Resource> res, String title)`
- Role: Handles the default box path.
- Description: Implements the default box operation.

#### `protected void layouth(Widget cont)`
- Role: Handles the layouth path.
- Description: Implements the layouth operation.

#### `protected void layoutc(Widget cont)`
- Role: Handles the layoutc path.
- Description: Implements the layoutc operation.

#### `protected void layouto(Widget cont)`
- Role: Handles the layouto path.
- Description: Implements the layouto operation.

#### `protected void layout(Widget cont)`
- Role: Handles the layout path.
- Description: Lays out parts on wrapped lines and aligns their baselines.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the QuestWnd content.

#### `public void refresh()`
- Role: Refreshes waypoint manager state.
- Description: Implements the refresh operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public int questid()`
- Role: Handles the questid path.
- Description: Implements the questid operation.

#### `public Widget qview()`
- Role: Handles the qview path.
- Description: Implements the qview operation.

#### `public QuestList(Coord sz)`
- Role: Handles the quest list path.
- Description: Implements the quest list operation.

#### `protected List<Quest> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Widget makeitem(Quest q, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public Item(Coord sz, Quest q)`
- Role: Handles the item path.
- Description: Implements the item operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the QuestWnd content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `protected void drawslot(GOut g, Quest q, int idx, Area area)`
- Role: Handles the drawslot path.
- Description: Draws the slot.

#### `protected boolean unselect(int button)`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `public Quest get(int id)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void add(Quest q)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Quest remove(int id)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void remove(Quest q)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public QuestWnd()`
- Role: Creates a new QuestWnd instance.
- Description: Constructs the QuestWnd instance from the supplied inputs.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.
