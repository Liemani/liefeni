# Polity

This file documents the responsibilities and members of `Polity`.

## Meta

- Source: [Polity.java](../../../src/haven/Polity.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the polity Haven component.

## Nested Types

### AuthMeter

- Role: Represents auth meter within Polity.
- Description: Describes the nested auth meter type used by the enclosing class.

### Member

- Role: Represents member within Polity.
- Description: Describes the nested member type used by the enclosing class.

### MemberList

- Role: Represents member list within Polity.
- Description: Describes the nested member list type used by the enclosing class.

### MemberWidget

- Role: Represents member widget within Polity.
- Description: Describes the nested member widget type used by the enclosing class.

## Members

### Constants

#### `public static final Text unk = Text.render("???")`
- Role: Defines the shared unk constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text self = Text.render("You", new Color(192, 192, 255))`
- Role: Defines the shared self constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry nmf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(14))).aa(true)`
- Role: Defines the shared nmf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry membf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12))).aa(true)`
- Role: Defines the shared membf constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final String cap, name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final String cap, name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public int auth, acap, adrain, aseq`
- Role: Stores the aseq value.
- Description: Backs the cached state for this file.

#### `public int auth, acap, adrain, aseq`
- Role: Stores the aseq value.
- Description: Backs the cached state for this file.

#### `public int auth, acap, adrain, aseq`
- Role: Stores the aseq value.
- Description: Backs the cached state for this file.

#### `public int auth, acap, adrain, aseq`
- Role: Stores the aseq value.
- Description: Backs the cached state for this file.

#### `public boolean offline`
- Role: Tracks the offline flag.
- Description: Supports the offline operation used by the surrounding class.

#### `public final List<Member> memb = new ArrayList<Member>()`
- Role: Caches memb entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Map<Integer, Member> idmap = new HashMap<Integer, Member>()`
- Role: Caches idmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected Widget mw`
- Role: Stores the mw value.
- Description: Backs the cached state for this file.

#### `public final Integer id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Integer id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private int aseq = -1`
- Role: Stores the aseq value.
- Description: Backs the cached state for this file.

#### `private Tex rauth = null`
- Role: Stores the rauth value.
- Description: Backs the cached state for this file.

### Methods

#### `public Member(Integer id)`
- Role: Performs member.
- Description: Supports the member operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public MemberList(Coord sz)`
- Role: Performs member list.
- Description: Supports the member list operation used by the surrounding class.

#### `public MemberList(int w, int h)`
- Role: Performs member list.
- Description: Supports the member list operation used by the surrounding class.

#### `public List<Member> allitems()`
- Role: Performs allitems.
- Description: Supports the allitems operation used by the surrounding class.

#### `public String itemname(Member m)`
- Role: Performs itemname.
- Description: Supports the itemname operation used by the surrounding class.

#### `public boolean searchmatch(Member m, String txt)`
- Role: Performs searchmatch.
- Description: Supports the searchmatch operation used by the surrounding class.

#### `protected Widget makeitem(Member m, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `protected void drawbg(GOut g)`
- Role: Performs drawbg.
- Description: Supports the drawbg operation used by the surrounding class.

#### `protected void drawslot(GOut g, Member m, int idx, Area area)`
- Role: Performs drawslot.
- Description: Supports the drawslot operation used by the surrounding class.

#### `public void change(Member pm)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public MemberWidget(Coord sz, Integer id)`
- Role: Performs member widget.
- Description: Supports the member widget operation used by the surrounding class.

#### `public Polity(String cap, String name)`
- Role: Creates a new Polity instance.
- Description: Constructs the instance and initializes its default state.

#### `public AuthMeter(Coord sz)`
- Role: Performs auth meter.
- Description: Supports the auth meter operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `protected Member parsememb(Object[] args)`
- Role: Performs parsememb.
- Description: Supports the parsememb operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void cdestroy(Widget w)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.
