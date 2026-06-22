---
source: [Polity.java](../../../../src/haven/Polity.java)
created: 2026-06-13
updated: 2026-06-14
---

# Polity

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
- Role: Implements the unk operation.
- Description: Renders the current state into an image or image-like object.
- Value: `Text.render("???")`

#### `public static final Text self = Text.render("You", new Color(192, 192, 255))`
- Role: Implements the self operation.
- Description: Implements the color operation.
- Value: `Text.render("You", new Color(192, 192, 255))`

#### `public static final Text.Foundry nmf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(14))).aa(true)`
- Role: Implements the nmf operation.
- Description: Implements the aa operation.
- Value: `new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(14))).aa(true)`

#### `public static final Text.Foundry membf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12))).aa(true)`
- Role: Implements the membf operation.
- Description: Implements the aa operation.
- Value: `new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12))).aa(true)`

### Fields

#### `public final String cap, name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final String cap, name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public int auth, acap, adrain, aseq`
- Role: Caches the aseq value.
- Description: Caches the `aseq` value for reuse.

#### `public int auth, acap, adrain, aseq`
- Role: Caches the aseq value.
- Description: Caches the `aseq` value for reuse.

#### `public int auth, acap, adrain, aseq`
- Role: Caches the aseq value.
- Description: Caches the `aseq` value for reuse.

#### `public int auth, acap, adrain, aseq`
- Role: Caches the aseq value.
- Description: Caches the `aseq` value for reuse.

#### `public boolean offline`
- Role: Tracks the offline flag.
- Description: Caches the `offline` value for reuse.

#### `public final List<Member> memb = new ArrayList<Member>()`
- Role: Implements the memb operation.
- Description: Implements the public final list<member> memb = new array list<member>() operation.

#### `public final Map<Integer, Member> idmap = new HashMap<Integer, Member>()`
- Role: Implements the idmap operation.
- Description: Implements the public final map<integer, member> idmap = new hash map<integer, member>() operation.

#### `protected Widget mw`
- Role: Caches the mw value.
- Description: Caches the `mw` value for reuse.

#### `public final Integer id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Integer id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private int aseq = -1`
- Role: Caches the aseq value.
- Description: Caches the `aseq` value for reuse.

#### `private Tex rauth = null`
- Role: Caches the rauth value.
- Description: Caches the `rauth` value for reuse.

### Methods

#### `public Member(Integer id)`
- Role: Handles the member path.
- Description: Implements the member operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Polity content.

#### `public MemberList(Coord sz)`
- Role: Handles the member list path.
- Description: Implements the member list operation.

#### `public MemberList(int w, int h)`
- Role: Handles the member list path.
- Description: Implements the member list operation.

#### `public List<Member> allitems()`
- Role: Handles the allitems path.
- Description: Implements the allitems operation.

#### `public String itemname(Member m)`
- Role: Handles the itemname path.
- Description: Implements the itemname operation.

#### `public boolean searchmatch(Member m, String txt)`
- Role: Handles the searchmatch path.
- Description: Implements the searchmatch operation.

#### `protected Widget makeitem(Member m, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `protected void drawbg(GOut g)`
- Role: Handles the drawbg path.
- Description: Draws the bg.

#### `protected void drawslot(GOut g, Member m, int idx, Area area)`
- Role: Handles the drawslot path.
- Description: Draws the slot.

#### `public void change(Member pm)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public MemberWidget(Coord sz, Integer id)`
- Role: Handles the member widget path.
- Description: Implements the member widget operation.

#### `public Polity(String cap, String name)`
- Role: Creates a new Polity instance.
- Description: Constructs the Polity instance from the supplied inputs.

#### `public AuthMeter(Coord sz)`
- Role: Handles the auth meter path.
- Description: Implements the auth meter operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Polity content.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `protected Member parsememb(Object[] args)`
- Role: Handles the parsememb path.
- Description: Implements the parsememb operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public void cdestroy(Widget w)`
- Role: Handles the cdestroy path.
- Description: Implements the cdestroy operation.