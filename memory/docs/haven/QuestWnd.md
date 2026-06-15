# QuestWnd

This file documents the responsibilities and members of `QuestWnd`.

## Meta

- Source: [QuestWnd.java](../../../src/haven/QuestWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the quest window.

## Nested Types

### $_

- Description: TODO

### $quest

- Description: TODO

### Box

- Description: TODO

### CondWidget

- Description: TODO

### Condition

- Description: TODO

### DefaultBox

- Description: TODO

### DefaultCond

- Description: TODO

### Info

- Description: TODO

### Item

- Description: TODO

### QVInfo

- Description: TODO

### QView

- Description: TODO

### Quest

- Description: TODO

### QuestList

- Description: TODO

## Members

### Constants

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`

- Description: TODO

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`

- Description: TODO

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`

- Description: TODO

#### `public static final int QST_PEND = 0, QST_DONE = 1, QST_FAIL = 2, QST_DISABLED = 3`

- Description: TODO

#### `public static final Color[] stcol =`

- Description: TODO

#### `public static final char[] stsym =`

- Description: TODO

#### `private static final Tex qcmp = catf.render("Quest completed").tex()`

- Description: TODO

#### `private static final Tex qfail = failf.render("Quest failed").tex()`

- Description: TODO

#### `public static final Text.Furnace qtfnd = new BlurFurn(new Text.Foundry(Text.serif.deriveFont(java.awt.Font.BOLD), 16).aa(true), 2, 1, Color.BLACK)`

- Description: TODO

#### `public static final Text.Foundry qcfnd = new Text.Foundry(Text.sans, 12).aa(true)`

- Description: TODO

### Fields

#### `public final Widget questbox`

- Description: TODO

#### `public final QuestList cqst, dqst`

- Description: TODO

#### `public final QuestList cqst, dqst`

- Description: TODO

#### `public Quest.Info quest`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public Indir<Resource> res`

- Description: TODO

#### `public String title`

- Description: TODO

#### `public int done`

- Description: TODO

#### `public int mtime`

- Description: TODO

#### `public final String desc`

- Description: TODO

#### `public int done`

- Description: TODO

#### `public String status`

- Description: TODO

#### `public Object[] wdata = null`

- Description: TODO

#### `public final Condition cond`

- Description: TODO

#### `public Text text`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final String title`

- Description: TODO

#### `public Condition[] cond =`

- Description: TODO

#### `private QView cqv`

- Description: TODO

#### `private QuestWnd qw = null`

- Description: TODO

#### `public final QVInfo info`

- Description: TODO

#### `private Condition[] ccond`

- Description: TODO

#### `private Tex[] rcond =`

- Description: TODO

#### `private Tex rtitle = null`

- Description: TODO

#### `private Tex glow, glowon`

- Description: TODO

#### `private Tex glow, glowon`

- Description: TODO

#### `private double glowt = -1`

- Description: TODO

#### `private Widget current`

- Description: TODO

#### `private boolean refresh = true`

- Description: TODO

#### `public List<Pair<String, String>> options = Collections.emptyList()`

- Description: TODO

#### `public CondWidget[] condw =`

- Description: TODO

#### `public List<Quest> quests = new ArrayList<Quest>()`

- Description: TODO

#### `private boolean loading = false`

- Description: TODO

#### `private final Comparator<Quest> comp = new Comparator<Quest>()`

- Description: TODO

#### `public final Quest q`

- Description: TODO

#### `private final IconText nm`

- Description: TODO

#### `private Object dres, dtit`

- Description: TODO

#### `private Object dres, dtit`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `private Quest(int id, Indir<Resource> res, String title, int done, int mtime)`

- Description: TODO

#### `public String title()`

- Description: TODO

#### `public Condition(String desc, int done, String status)`

- Description: TODO

#### `public void done(GameUI parent)`

- Description: TODO

#### `public CondWidget(Condition cond)`

- Description: TODO

#### `public boolean update()`

- Description: TODO

#### `public DefaultCond(Condition cond)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public Box(int id, Indir<Resource> res, String title)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public String title()`

- Description: TODO

#### `public Condition[] conds()`

- Description: TODO

#### `public int done()`

- Description: TODO

#### `public void refresh()`

- Description: TODO

#### `public String rendertext()`

- Description: TODO

#### `public Condition findcond(String desc)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `public int questid()`

- Description: TODO

#### `public Widget qview()`

- Description: TODO

#### `public String title()`

- Description: TODO

#### `public Condition[] conds()`

- Description: TODO

#### `public int done()`

- Description: TODO

#### `public QView(QVInfo info)`

- Description: TODO

#### `private void resize()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `private Text ct(Condition c)`

- Description: TODO

#### `void update()`

- Description: TODO

#### `void update(Condition c)`

- Description: TODO

#### `public DefaultBox(int id, Indir<Resource> res, String title)`

- Description: TODO

#### `protected void layouth(Widget cont)`

- Description: TODO

#### `protected void layoutc(Widget cont)`

- Description: TODO

#### `protected void layouto(Widget cont)`

- Description: TODO

#### `protected void layout(Widget cont)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void refresh()`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public int questid()`

- Description: TODO

#### `public Widget qview()`

- Description: TODO

#### `public QuestList(Coord sz)`

- Description: TODO

#### `protected List<Quest> items()`

- Description: TODO

#### `protected Widget makeitem(Quest q, int idx, Coord sz)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public Item(Coord sz, Quest q)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `protected void drawslot(GOut g, Quest q, int idx, Area area)`

- Description: TODO

#### `protected boolean unselect(int button)`

- Description: TODO

#### `public Quest get(int id)`

- Description: TODO

#### `public void add(Quest q)`

- Description: TODO

#### `public Quest remove(int id)`

- Description: TODO

#### `public void remove(Quest q)`

- Description: TODO

#### `public QuestWnd()`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public void uimsg(String nm, Object... args)`

- Description: TODO
