---
source: [QuestWnd.java](../../../src/haven/QuestWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# QuestWnd

Represents the quest wnd Haven component.

## Nested Types

### $_

- Role: Represents $ within QuestWnd.
- Description: Describes the nested $  type used by the enclosing class.

### $quest

- Role: Represents $quest within QuestWnd.
- Description: Describes the nested $quest type used by the enclosing class.

### Box

- Role: Represents box within QuestWnd.
- Description: Describes the nested box type used by the enclosing class.

### CondWidget

- Role: Represents cond widget within QuestWnd.
- Description: Describes the nested cond widget type used by the enclosing class.

### Condition

- Role: Represents condition within QuestWnd.
- Description: Describes the nested condition type used by the enclosing class.

### DefaultBox

- Role: Represents default box within QuestWnd.
- Description: Describes the nested default box type used by the enclosing class.

### DefaultCond

- Role: Represents default cond within QuestWnd.
- Description: Describes the nested default cond type used by the enclosing class.

### Info

- Role: Represents info within QuestWnd.
- Description: Describes the nested info type used by the enclosing class.

### Item

- Role: Represents item within QuestWnd.
- Description: Describes the nested item type used by the enclosing class.

### QVInfo

- Role: Represents qvinfo within QuestWnd.
- Description: Describes the nested qvinfo type used by the enclosing class.

### QView

- Role: Represents qview within QuestWnd.
- Description: Describes the nested qview type used by the enclosing class.

### Quest

- Role: Represents quest within QuestWnd.
- Description: Describes the nested quest type used by the enclosing class.

### QuestList

- Role: Represents quest list within QuestWnd.
- Description: Describes the nested quest list type used by the enclosing class.

## Members

### Constants

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`
- Role: Defines the shared qst pend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`
- Role: Defines the shared qst pend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`
- Role: Defines the shared qst pend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`
- Role: Defines the shared qst pend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color[] stcol =`
- Role: Defines the shared quest wnd constant.
- Description: Shared constant used by the rest of the class.

#### `public static final char[] stsym =`
- Role: Defines the shared quest wnd constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex qcmp = catf.render("Quest completed").tex()`
- Role: Defines the shared qcmp constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Tex qfail = failf.render("Quest failed").tex()`
- Role: Defines the shared qfail constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Furnace qtfnd = new BlurFurn(new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true), 2, 1, Color.BLACK)`
- Role: Defines the shared qtfnd constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry qcfnd = new Text.Foundry(Text.sans, 12).aa(true)`
- Role: Defines the shared qcfnd constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Widget questbox`
- Role: Stores the questbox value.
- Description: Backs the cached state for this file.

#### `public final QuestList cqst, dqst`
- Role: Caches dqst entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final QuestList cqst, dqst`
- Role: Caches dqst entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Quest.Info quest`
- Role: Holds the quest state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public String title`
- Role: Stores the title value.
- Description: Backs the cached state for this file.

#### `public int done`
- Role: Stores the done value.
- Description: Backs the cached state for this file.

#### `public int mtime`
- Role: Stores the mtime value.
- Description: Backs the cached state for this file.

#### `public final String desc`
- Role: Stores the desc value.
- Description: Backs the cached state for this file.

#### `public int done`
- Role: Stores the done value.
- Description: Backs the cached state for this file.

#### `public String status`
- Role: Stores the status value.
- Description: Backs the cached state for this file.

#### `public Object[] wdata = null`
- Role: Holds the wdata state.
- Description: Backs the cached state for this file.

#### `public final Condition cond`
- Role: Holds the cond state.
- Description: Backs the cached state for this file.

#### `public Text text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final String title`
- Role: Stores the title value.
- Description: Backs the cached state for this file.

#### `public Condition[] cond =`
- Role: Holds the quest wnd state.
- Description: Backs the cached state for this file.

#### `private QView cqv`
- Role: Holds the cqv state.
- Description: Backs the cached state for this file.

#### `private QuestWnd qw = null`
- Role: Holds the qw state.
- Description: Backs the cached state for this file.

#### `public final QVInfo info`
- Role: Holds the info state.
- Description: Backs the cached state for this file.

#### `private Condition[] ccond`
- Role: Holds the ccond state.
- Description: Backs the cached state for this file.

#### `private Tex[] rcond =`
- Role: Holds the quest wnd state.
- Description: Backs the cached state for this file.

#### `private Tex rtitle = null`
- Role: Stores the rtitle value.
- Description: Backs the cached state for this file.

#### `private Tex glow, glowon`
- Role: Stores the glowon value.
- Description: Backs the cached state for this file.

#### `private Tex glow, glowon`
- Role: Stores the glowon value.
- Description: Backs the cached state for this file.

#### `private double glowt = -1`
- Role: Stores the glowt value.
- Description: Backs the cached state for this file.

#### `private Widget current`
- Role: Stores the current value.
- Description: Backs the cached state for this file.

#### `private boolean refresh = true`
- Role: Tracks the refresh flag.
- Description: Supports the refresh operation used by the surrounding class.

#### `public List<Pair<String, String>> options = Collections.emptyList()`
- Role: Caches options entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public CondWidget[] condw =`
- Role: Holds the quest wnd state.
- Description: Backs the cached state for this file.

#### `public List<Quest> quests = new ArrayList<Quest>()`
- Role: Caches quests entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Supports the loading operation used by the surrounding class.

#### `private final Comparator<Quest> comp = new Comparator<Quest>()`
- Role: Holds the comp state.
- Description: Backs the cached state for this file.

#### `public final Quest q`
- Role: Holds the q state.
- Description: Backs the cached state for this file.

#### `private final IconText nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `private Object dres, dtit`
- Role: Holds the dtit state.
- Description: Backs the cached state for this file.

#### `private Object dres, dtit`
- Role: Holds the dtit state.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private Quest(int id, Indir<Resource> res, String title, int done, int mtime)`
- Role: Performs quest.
- Description: Supports the quest operation used by the surrounding class.

#### `public String title()`
- Role: Performs title.
- Description: Supports the title operation used by the surrounding class.

#### `public Condition(String desc, int done, String status)`
- Role: Performs condition.
- Description: Supports the condition operation used by the surrounding class.

#### `public void done(GameUI parent)`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public CondWidget(Condition cond)`
- Role: Performs cond widget.
- Description: Supports the cond widget operation used by the surrounding class.

#### `public boolean update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public DefaultCond(Condition cond)`
- Role: Performs default cond.
- Description: Supports the default cond operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Box(int id, Indir<Resource> res, String title)`
- Role: Performs box.
- Description: Supports the box operation used by the surrounding class.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public String title()`
- Role: Performs title.
- Description: Supports the title operation used by the surrounding class.

#### `public Condition[] conds()`
- Role: Performs conds.
- Description: Supports the conds operation used by the surrounding class.

#### `public int done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public void refresh()`
- Role: Refreshes waypoint manager state.
- Description: Supports the refresh operation used by the surrounding class.

#### `public String rendertext()`
- Role: Performs rendertext.
- Description: Supports the rendertext operation used by the surrounding class.

#### `public Condition findcond(String desc)`
- Role: Performs findcond.
- Description: Supports the findcond operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public int questid()`
- Role: Performs questid.
- Description: Supports the questid operation used by the surrounding class.

#### `public Widget qview()`
- Role: Performs qview.
- Description: Supports the qview operation used by the surrounding class.

#### `public String title()`
- Role: Performs title.
- Description: Supports the title operation used by the surrounding class.

#### `public Condition[] conds()`
- Role: Performs conds.
- Description: Supports the conds operation used by the surrounding class.

#### `public int done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public QView(QVInfo info)`
- Role: Performs qview.
- Description: Supports the qview operation used by the surrounding class.

#### `private void resize()`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `private Text ct(Condition c)`
- Role: Performs ct.
- Description: Supports the ct operation used by the surrounding class.

#### `void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `void update(Condition c)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public DefaultBox(int id, Indir<Resource> res, String title)`
- Role: Performs default box.
- Description: Supports the default box operation used by the surrounding class.

#### `protected void layouth(Widget cont)`
- Role: Performs layouth.
- Description: Supports the layouth operation used by the surrounding class.

#### `protected void layoutc(Widget cont)`
- Role: Performs layoutc.
- Description: Supports the layoutc operation used by the surrounding class.

#### `protected void layouto(Widget cont)`
- Role: Performs layouto.
- Description: Supports the layouto operation used by the surrounding class.

#### `protected void layout(Widget cont)`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void refresh()`
- Role: Refreshes waypoint manager state.
- Description: Supports the refresh operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public int questid()`
- Role: Performs questid.
- Description: Supports the questid operation used by the surrounding class.

#### `public Widget qview()`
- Role: Performs qview.
- Description: Supports the qview operation used by the surrounding class.

#### `public QuestList(Coord sz)`
- Role: Performs quest list.
- Description: Supports the quest list operation used by the surrounding class.

#### `protected List<Quest> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Widget makeitem(Quest q, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public Item(Coord sz, Quest q)`
- Role: Performs item.
- Description: Supports the item operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `protected void drawslot(GOut g, Quest q, int idx, Area area)`
- Role: Performs drawslot.
- Description: Supports the drawslot operation used by the surrounding class.

#### `protected boolean unselect(int button)`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `public Quest get(int id)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void add(Quest q)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Quest remove(int id)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void remove(Quest q)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public QuestWnd()`
- Role: Creates a new QuestWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
