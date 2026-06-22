---
source: [BuddyWnd.java](../../../../src/haven/BuddyWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# BuddyWnd

Represents the buddy wnd Haven component.

## Nested Types

### $_

- Role: Registers the `buddy` widget factory.
- Description: Creates the buddy list window from the resource system.

### $grp

- Role: Registers the buddy group factory.
- Description: Creates a group selector widget for buddy grouping.

### Buddy

- Role: Stores one buddy entry.
- Description: Holds the buddy id, name, status, group, and seen flag.

### BuddyInfo

- Role: Shows detailed information about one buddy.
- Description: Renders the selected buddy's profile and status controls.

### BuddyList

- Role: Displays the buddy list.
- Description: Sorts buddies and renders the scrollable list.

### GroupRect

- Role: Draws one buddy-group selection rectangle.
- Description: Represents the color-coded group indicator in the selector.

### GroupSelector

- Role: Selects the active buddy group.
- Description: Renders the group grid and forwards selection clicks.

## Members

### Constants

#### `public static final int width = UI.scale(263)`
- Role: Implements the width operation.
- Description: Implements the scale operation.
- Value: `UI.scale(263)`

#### `public static final int margin1 = UI.scale(5)`
- Role: Implements the margin1 operation.
- Description: Implements the scale operation.
- Value: `UI.scale(5)`

#### `public static final int margin2 = 2 * margin1`
- Role: Caches the margin2 value.
- Description: Caches the `margin2` value for reuse.
- Value: `2 * margin1`

#### `public static final int margin3 = 2 * margin2`
- Role: Caches the margin3 value.
- Description: Caches the `margin3` value for reuse.
- Value: `2 * margin2`

#### `public static final int offset = UI.scale(35)`
- Role: Implements the offset operation.
- Description: Implements the scale operation.
- Value: `UI.scale(35)`

#### `public static final Tex online = Resource.loadtex("gfx/hud/online")`
- Role: Implements the online operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/online")`

#### `public static final Tex offline = Resource.loadtex("gfx/hud/offline")`
- Role: Implements the offline operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/offline")`

#### `public static final Color[] gc = new Color[]`
- Role: Caches the gc value.
- Description: Caches the `gc` value for reuse.
- Value: `new Color[]`

### Fields

#### `private List<Buddy> buddies = new ArrayList<Buddy>()`
- Role: Implements the buddies operation.
- Description: Implements the private list<buddy> buddies = new array list<buddy>() operation.

#### `private Map<Integer, Buddy> idmap = new HashMap<Integer, Buddy>()`
- Role: Implements the idmap operation.
- Description: Implements the private map<integer, buddy> idmap = new hash map<integer, buddy>() operation.

#### `private BuddyList bl`
- Role: Caches the bl value.
- Description: Caches the `bl` value for reuse.

#### `private TextEntry pname, charpass, opass`
- Role: Caches the opass value.
- Description: Caches the `opass` value for reuse.

#### `private TextEntry pname, charpass, opass`
- Role: Caches the opass value.
- Description: Caches the `opass` value for reuse.

#### `private TextEntry pname, charpass, opass`
- Role: Caches the opass value.
- Description: Caches the `opass` value for reuse.

#### `private FlowerMenu menu`
- Role: Caches the menu value.
- Description: Caches the `menu` value for reuse.

#### `private BuddyInfo info = null`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `private Widget infof`
- Role: Caches the infof value.
- Description: Caches the `infof` value for reuse.

#### `public int serial = 0`
- Role: Caches the serial value.
- Description: Caches the `serial` value for reuse.

#### `private Comparator<Buddy> bcmp`
- Role: Caches the bcmp value.
- Description: Caches the `bcmp` value for reuse.

#### `private Comparator<Buddy> alphacmp = new Comparator<Buddy>()`
- Role: Implements the alphacmp operation.
- Description: Implements the private comparator<buddy> alphacmp = new comparator<buddy>() operation.

#### `private Comparator<Buddy> groupcmp = new Comparator<Buddy>()`
- Role: Implements the groupcmp operation.
- Description: Implements the private comparator<buddy> groupcmp = new comparator<buddy>() operation.

#### `private Comparator<Buddy> statuscmp = new Comparator<Buddy>()`
- Role: Implements the statuscmp operation.
- Description: Implements the private comparator<buddy> statuscmp = new comparator<buddy>() operation.

#### `public int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `Text rname = null`
- Role: Caches the rname value.
- Description: Caches the `rname` value for reuse.

#### `public int online`
- Role: Caches the online value.
- Description: Caches the `online` value for reuse.

#### `public int group`
- Role: Caches the group value.
- Description: Caches the `group` value for reuse.

#### `public boolean seen`
- Role: Tracks the seen flag.
- Description: Caches the `seen` value for reuse.

#### `final private static Coord offset = UI.scale(new Coord(2, 2))`
- Role: Implements the offset operation.
- Description: Implements the coord operation.

#### `final private static Coord selsz = UI.scale(new Coord(19, 19))`
- Role: Implements the selsz operation.
- Description: Implements the coord operation.

#### `final private static Coord colsz = selsz.sub(offset.mul(2))`
- Role: Implements the colsz operation.
- Description: Implements the mul operation.

#### `final private GroupSelector selector`
- Role: Caches the selector value.
- Description: Caches the `selector` value for reuse.

#### `final private int group`
- Role: Caches the group value.
- Description: Caches the `group` value for reuse.

#### `private boolean selected`
- Role: Tracks whether selected is selected.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public int group`
- Role: Caches the group value.
- Description: Caches the `group` value for reuse.

#### `public GroupRect[] groups = new GroupRect[gc.length]`
- Role: Caches the groups value.
- Description: Caches the `groups` value for reuse.

#### `private final Buddy buddy`
- Role: Caches the buddy value.
- Description: Caches the `buddy` value for reuse.

#### `private final Avaview ava`
- Role: Caches the ava value.
- Description: Caches the `ava` value for reuse.

#### `private final TextEntry nick`
- Role: Caches the nick value.
- Description: Caches the `nick` value for reuse.

#### `private final GroupSelector grp`
- Role: Caches the grp value.
- Description: Caches the `grp` value for reuse.

#### `private long atime, utime`
- Role: Caches the utime value.
- Description: Caches the `utime` value for reuse.

#### `private long atime, utime`
- Role: Caches the utime value.
- Description: Caches the `utime` value for reuse.

#### `private Label atimel = null`
- Role: Caches the atimel value.
- Description: Caches the `atimel` value for reuse.

#### `private Button[] opts =`
- Role: Caches the opts value.
- Description: Caches the `opts` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Buddy(int id, String name, int online, int group, boolean seen)`
- Role: Handles the buddy path.
- Description: Implements the buddy operation.

#### `public void forget()`
- Role: Handles the forget path.
- Description: Implements the forget operation.

#### `public void endkin()`
- Role: Handles the endkin path.
- Description: Ends kin.

#### `public void chat()`
- Role: Handles the chat path.
- Description: Implements the chat operation.

#### `public void invite()`
- Role: Handles the invite path.
- Description: Implements the invite operation.

#### `public void describe()`
- Role: Handles the describe path.
- Description: Implements the describe operation.

#### `public void chname(String name)`
- Role: Handles the chname path.
- Description: Implements the chname operation.

#### `public void chgrp(int grp)`
- Role: Handles the chgrp path.
- Description: Implements the chgrp operation.

#### `private void chstatus(int status)`
- Role: Handles the chstatus path.
- Description: Implements the chstatus operation.

#### `public Text rname()`
- Role: Handles the rname path.
- Description: Implements the rname operation.

#### `public Map<String, Runnable> opts()`
- Role: Handles the opts path.
- Description: Implements the opts operation.

#### `public Iterator<Buddy> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public Buddy find(int id)`
- Role: Handles the find path.
- Description: Finds the requested data.

#### `public GroupRect(GroupSelector selector, int group, boolean selected)`
- Role: Handles the group rect path.
- Description: Implements the group rect operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the BuddyWnd content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void select()`
- Role: Handles the select path.
- Description: Implements the select operation.

#### `public void unselect()`
- Role: Handles the unselect path.
- Description: Implements the unselect operation.

#### `public GroupSelector(int group)`
- Role: Handles the group selector path.
- Description: Implements the group selector operation.

#### `protected void changed(int group)`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public void update(int group)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void select(int group)`
- Role: Handles the select path.
- Description: Implements the select operation.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private BuddyInfo(Coord sz, Buddy buddy)`
- Role: Handles the buddy info path.
- Description: Implements the buddy info operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the BuddyWnd content.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `private void setatime()`
- Role: Handles the setatime path.
- Description: Updates the atime.

#### `private void setopts()`
- Role: Handles the setopts path.
- Description: Updates the opts.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public BuddyList(Coord sz)`
- Role: Handles the buddy list path.
- Description: Implements the buddy list operation.

#### `public List<Buddy> allitems()`
- Role: Handles the allitems path.
- Description: Implements the allitems operation.

#### `public boolean searchmatch(Buddy b, String txt)`
- Role: Handles the searchmatch path.
- Description: Implements the searchmatch operation.

#### `public Widget makeitem(Buddy b, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `protected void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `protected void drawbg(GOut g, Buddy item, int idx, Area area)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the BuddyWnd content.

#### `public void change(Buddy b)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public void opts(final Buddy b, Coord c)`
- Role: Handles the opts path.
- Description: Implements the opts operation.

#### `public BuddyWnd()`
- Role: Creates a new BuddyWnd instance.
- Description: Constructs the BuddyWnd instance from the supplied inputs.

#### `private String randpwd()`
- Role: Handles the randpwd path.
- Description: Implements the randpwd operation.

#### `public void setpwd(String pass)`
- Role: Handles the setpwd path.
- Description: Updates the pwd.

#### `public void setpname(String name)`
- Role: Handles the setpname path.
- Description: Updates the pname.

#### `private void setcmp(Comparator<Buddy> cmp)`
- Role: Handles the setcmp path.
- Description: Updates the cmp.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void hide()`
- Role: Handles the hide path.
- Description: Implements the hide operation.

#### `public void destroy()`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.