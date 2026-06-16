# BuddyWnd

This file documents the responsibilities and members of `BuddyWnd`.

## Meta

- Source: [BuddyWnd.java](../../../src/haven/BuddyWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the buddy wnd Haven component.

## Nested Types

### $_

- Role: Represents $ within BuddyWnd.
- Description: Describes the nested $  type used by the enclosing class.

### $grp

- Role: Represents $grp within BuddyWnd.
- Description: Describes the nested $grp type used by the enclosing class.

### Buddy

- Role: Represents buddy within BuddyWnd.
- Description: Describes the nested buddy type used by the enclosing class.

### BuddyInfo

- Role: Represents buddy info within BuddyWnd.
- Description: Describes the nested buddy info type used by the enclosing class.

### BuddyList

- Role: Represents buddy list within BuddyWnd.
- Description: Describes the nested buddy list type used by the enclosing class.

### GroupRect

- Role: Represents group rect within BuddyWnd.
- Description: Describes the nested group rect type used by the enclosing class.

### GroupSelector

- Role: Represents group selector within BuddyWnd.
- Description: Describes the nested group selector type used by the enclosing class.

## Members

### Constants

#### `public static final int width = UI.scale(263)`
- Role: Defines the shared width constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int margin1 = UI.scale(5)`
- Role: Defines the shared margin1 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int margin2 = 2 * margin1`
- Role: Defines the shared margin2 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int margin3 = 2 * margin2`
- Role: Defines the shared margin3 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int offset = UI.scale(35)`
- Role: Defines the shared offset constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex online = Resource.loadtex("gfx/hud/online")`
- Role: Defines the shared online constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex offline = Resource.loadtex("gfx/hud/offline")`
- Role: Defines the shared offline constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color[] gc = new Color[]`
- Role: Defines the shared gc constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private List<Buddy> buddies = new ArrayList<Buddy>()`
- Role: Caches buddies entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Map<Integer, Buddy> idmap = new HashMap<Integer, Buddy>()`
- Role: Caches idmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private BuddyList bl`
- Role: Caches bl entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private TextEntry pname, charpass, opass`
- Role: Stores the opass value.
- Description: Backs the cached state for this file.

#### `private TextEntry pname, charpass, opass`
- Role: Stores the opass value.
- Description: Backs the cached state for this file.

#### `private TextEntry pname, charpass, opass`
- Role: Stores the opass value.
- Description: Backs the cached state for this file.

#### `private FlowerMenu menu`
- Role: Holds the menu state.
- Description: Backs the cached state for this file.

#### `private BuddyInfo info = null`
- Role: Holds the info state.
- Description: Backs the cached state for this file.

#### `private Widget infof`
- Role: Stores the infof value.
- Description: Backs the cached state for this file.

#### `public int serial = 0`
- Role: Stores the serial value.
- Description: Backs the cached state for this file.

#### `private Comparator<Buddy> bcmp`
- Role: Holds the bcmp state.
- Description: Backs the cached state for this file.

#### `private Comparator<Buddy> alphacmp = new Comparator<Buddy>()`
- Role: Holds the alphacmp state.
- Description: Backs the cached state for this file.

#### `private Comparator<Buddy> groupcmp = new Comparator<Buddy>()`
- Role: Holds the groupcmp state.
- Description: Backs the cached state for this file.

#### `private Comparator<Buddy> statuscmp = new Comparator<Buddy>()`
- Role: Holds the statuscmp state.
- Description: Backs the cached state for this file.

#### `public int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `Text rname = null`
- Role: Stores the rname value.
- Description: Backs the cached state for this file.

#### `public int online`
- Role: Stores the online value.
- Description: Backs the cached state for this file.

#### `public int group`
- Role: Stores the group value.
- Description: Backs the cached state for this file.

#### `public boolean seen`
- Role: Tracks the seen flag.
- Description: Supports the seen operation used by the surrounding class.

#### `final private static Coord offset = UI.scale(new Coord(2, 2))`
- Role: Stores the offset value.
- Description: Backs the cached state for this file.

#### `final private static Coord selsz = UI.scale(new Coord(19, 19))`
- Role: Stores the selsz value.
- Description: Backs the cached state for this file.

#### `final private static Coord colsz = selsz.sub(offset.mul(2))`
- Role: Stores the colsz value.
- Description: Backs the cached state for this file.

#### `final private GroupSelector selector`
- Role: Holds the selector state.
- Description: Backs the cached state for this file.

#### `final private int group`
- Role: Stores the group value.
- Description: Backs the cached state for this file.

#### `private boolean selected`
- Role: Tracks whether selected is selected.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public int group`
- Role: Stores the group value.
- Description: Backs the cached state for this file.

#### `public GroupRect[] groups = new GroupRect[gc.length]`
- Role: Stores the groups value.
- Description: Backs the cached state for this file.

#### `private final Buddy buddy`
- Role: Holds the buddy state.
- Description: Backs the cached state for this file.

#### `private final Avaview ava`
- Role: Holds the ava state.
- Description: Backs the cached state for this file.

#### `private final TextEntry nick`
- Role: Stores the nick value.
- Description: Backs the cached state for this file.

#### `private final GroupSelector grp`
- Role: Holds the grp state.
- Description: Backs the cached state for this file.

#### `private long atime, utime`
- Role: Stores the utime value.
- Description: Backs the cached state for this file.

#### `private long atime, utime`
- Role: Stores the utime value.
- Description: Backs the cached state for this file.

#### `private Label atimel = null`
- Role: Stores the atimel value.
- Description: Backs the cached state for this file.

#### `private Button[] opts =`
- Role: Holds the buddy wnd state.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Buddy(int id, String name, int online, int group, boolean seen)`
- Role: Performs buddy.
- Description: Supports the buddy operation used by the surrounding class.

#### `public void forget()`
- Role: Performs forget.
- Description: Supports the forget operation used by the surrounding class.

#### `public void endkin()`
- Role: Performs endkin.
- Description: Supports the endkin operation used by the surrounding class.

#### `public void chat()`
- Role: Performs chat.
- Description: Supports the chat operation used by the surrounding class.

#### `public void invite()`
- Role: Performs invite.
- Description: Supports the invite operation used by the surrounding class.

#### `public void describe()`
- Role: Performs describe.
- Description: Supports the describe operation used by the surrounding class.

#### `public void chname(String name)`
- Role: Performs chname.
- Description: Supports the chname operation used by the surrounding class.

#### `public void chgrp(int grp)`
- Role: Performs chgrp.
- Description: Supports the chgrp operation used by the surrounding class.

#### `private void chstatus(int status)`
- Role: Performs chstatus.
- Description: Supports the chstatus operation used by the surrounding class.

#### `public Text rname()`
- Role: Performs rname.
- Description: Supports the rname operation used by the surrounding class.

#### `public Map<String, Runnable> opts()`
- Role: Performs opts.
- Description: Supports the opts operation used by the surrounding class.

#### `public Iterator<Buddy> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.

#### `public Buddy find(int id)`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `public GroupRect(GroupSelector selector, int group, boolean selected)`
- Role: Performs group rect.
- Description: Supports the group rect operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void select()`
- Role: Performs select.
- Description: Supports the select operation used by the surrounding class.

#### `public void unselect()`
- Role: Performs unselect.
- Description: Supports the unselect operation used by the surrounding class.

#### `public GroupSelector(int group)`
- Role: Performs group selector.
- Description: Supports the group selector operation used by the surrounding class.

#### `protected void changed(int group)`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public void update(int group)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void select(int group)`
- Role: Performs select.
- Description: Supports the select operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private BuddyInfo(Coord sz, Buddy buddy)`
- Role: Performs buddy info.
- Description: Supports the buddy info operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `private void setatime()`
- Role: Performs setatime.
- Description: Supports the setatime operation used by the surrounding class.

#### `private void setopts()`
- Role: Performs setopts.
- Description: Supports the setopts operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public BuddyList(Coord sz)`
- Role: Performs buddy list.
- Description: Supports the buddy list operation used by the surrounding class.

#### `public List<Buddy> allitems()`
- Role: Performs allitems.
- Description: Supports the allitems operation used by the surrounding class.

#### `public boolean searchmatch(Buddy b, String txt)`
- Role: Performs searchmatch.
- Description: Supports the searchmatch operation used by the surrounding class.

#### `public Widget makeitem(Buddy b, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `protected void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `protected void drawbg(GOut g, Buddy item, int idx, Area area)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void change(Buddy b)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public void opts(final Buddy b, Coord c)`
- Role: Performs opts.
- Description: Supports the opts operation used by the surrounding class.

#### `public BuddyWnd()`
- Role: Creates a new BuddyWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `private String randpwd()`
- Role: Performs randpwd.
- Description: Supports the randpwd operation used by the surrounding class.

#### `public void setpwd(String pass)`
- Role: Performs setpwd.
- Description: Supports the setpwd operation used by the surrounding class.

#### `public void setpname(String name)`
- Role: Performs setpname.
- Description: Supports the setpname operation used by the surrounding class.

#### `private void setcmp(Comparator<Buddy> cmp)`
- Role: Performs setcmp.
- Description: Supports the setcmp operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void hide()`
- Role: Performs hide.
- Description: Supports the hide operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.
