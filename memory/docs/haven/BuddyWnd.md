# BuddyWnd

This file documents the responsibilities and members of `BuddyWnd`.

## Meta

- Source: [BuddyWnd.java](../../../src/haven/BuddyWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays buddy list UI.

## Nested Types

### $_

- Description: TODO

### $grp

- Description: TODO

### Buddy

- Description: TODO

### BuddyInfo

- Description: TODO

### BuddyList

- Description: TODO

### GroupRect

- Description: TODO

### GroupSelector

- Description: TODO

## Members

### Constants

#### `public static final int width = UI.scale(263)`

- Description: TODO

#### `public static final int margin1 = UI.scale(5)`

- Description: TODO

#### `public static final int margin2 = 2 * margin1`

- Description: TODO

#### `public static final int margin3 = 2 * margin2`

- Description: TODO

#### `public static final int offset = UI.scale(35)`

- Description: TODO

#### `public static final Tex online = Resource.loadtex("gfx/hud/online")`

- Description: TODO

#### `public static final Tex offline = Resource.loadtex("gfx/hud/offline")`

- Description: TODO

#### `public static final Color[] gc = new Color[]`

- Description: TODO

### Fields

#### `private List<Buddy> buddies = new ArrayList<Buddy>()`

- Description: TODO

#### `private Map<Integer, Buddy> idmap = new HashMap<Integer, Buddy>()`

- Description: TODO

#### `private BuddyList bl`

- Description: TODO

#### `private TextEntry pname, charpass, opass`

- Description: TODO

#### `private TextEntry pname, charpass, opass`

- Description: TODO

#### `private TextEntry pname, charpass, opass`

- Description: TODO

#### `private FlowerMenu menu`

- Description: TODO

#### `private BuddyInfo info = null`

- Description: TODO

#### `private Widget infof`

- Description: TODO

#### `public int serial = 0`

- Description: TODO

#### `private Comparator<Buddy> bcmp`

- Description: TODO

#### `private Comparator<Buddy> alphacmp = new Comparator<Buddy>()`

- Description: TODO

#### `private Comparator<Buddy> groupcmp = new Comparator<Buddy>()`

- Description: TODO

#### `private Comparator<Buddy> statuscmp = new Comparator<Buddy>()`

- Description: TODO

#### `public int id`

- Description: TODO

#### `public String name`

- Description: TODO

#### `Text rname = null`

- Description: TODO

#### `public int online`

- Description: TODO

#### `public int group`

- Description: TODO

#### `public boolean seen`

- Description: TODO

#### `final private static Coord offset = UI.scale(new Coord(2, 2))`

- Description: TODO

#### `final private static Coord selsz = UI.scale(new Coord(19, 19))`

- Description: TODO

#### `final private static Coord colsz = selsz.sub(offset.mul(2))`

- Description: TODO

#### `final private GroupSelector selector`

- Description: TODO

#### `final private int group`

- Description: TODO

#### `private boolean selected`

- Description: TODO

#### `public int group`

- Description: TODO

#### `public GroupRect[] groups = new GroupRect[gc.length]`

- Description: TODO

#### `private final Buddy buddy`

- Description: TODO

#### `private final Avaview ava`

- Description: TODO

#### `private final TextEntry nick`

- Description: TODO

#### `private final GroupSelector grp`

- Description: TODO

#### `private long atime, utime`

- Description: TODO

#### `private long atime, utime`

- Description: TODO

#### `private Label atimel = null`

- Description: TODO

#### `private Button[] opts =`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Buddy(int id, String name, int online, int group, boolean seen)`

- Description: TODO

#### `public void forget()`

- Description: TODO

#### `public void endkin()`

- Description: TODO

#### `public void chat()`

- Description: TODO

#### `public void invite()`

- Description: TODO

#### `public void describe()`

- Description: TODO

#### `public void chname(String name)`

- Description: TODO

#### `public void chgrp(int grp)`

- Description: TODO

#### `private void chstatus(int status)`

- Description: TODO

#### `public Text rname()`

- Description: TODO

#### `public Map<String, Runnable> opts()`

- Description: TODO

#### `public Iterator<Buddy> iterator()`

- Description: TODO

#### `public Buddy find(int id)`

- Description: TODO

#### `public GroupRect(GroupSelector selector, int group, boolean selected)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void select()`

- Description: TODO

#### `public void unselect()`

- Description: TODO

#### `public GroupSelector(int group)`

- Description: TODO

#### `protected void changed(int group)`

- Description: TODO

#### `public void update(int group)`

- Description: TODO

#### `public void select(int group)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `private BuddyInfo(Coord sz, Buddy buddy)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `private void setatime()`

- Description: TODO

#### `private void setopts()`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void update()`

- Description: TODO

#### `public BuddyList(Coord sz)`

- Description: TODO

#### `public List<Buddy> allitems()`

- Description: TODO

#### `public boolean searchmatch(Buddy b, String txt)`

- Description: TODO

#### `public Widget makeitem(Buddy b, int idx, Coord sz)`

- Description: TODO

#### `protected void drawbg(GOut g)`

- Description: TODO

#### `protected void drawbg(GOut g, Buddy item, int idx, Area area)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void change(Buddy b)`

- Description: TODO

#### `public void opts(final Buddy b, Coord c)`

- Description: TODO

#### `public BuddyWnd()`

- Description: TODO

#### `private String randpwd()`

- Description: TODO

#### `public void setpwd(String pass)`

- Description: TODO

#### `public void setpname(String name)`

- Description: TODO

#### `private void setcmp(Comparator<Buddy> cmp)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void hide()`

- Description: TODO

#### `public void destroy()`

- Description: TODO
