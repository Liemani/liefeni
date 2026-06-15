# Polity

This file documents the responsibilities and members of `Polity`.

## Meta

- Source: [Polity.java](../../../src/haven/Polity.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents polity or faction state.

## Nested Types

### AuthMeter

- Description: TODO

### Member

- Description: TODO

### MemberList

- Description: TODO

### MemberWidget

- Description: TODO

## Members

### Constants

#### `public static final Text unk = Text.render("???")`

- Description: TODO

#### `public static final Text self = Text.render("You", new Color(192, 192, 255))`

- Description: TODO

#### `public static final Text.Foundry nmf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(14))).aa(true)`

- Description: TODO

#### `public static final Text.Foundry membf = new Text.Foundry(Text.serif.deriveFont(Font.BOLD, UI.scale(12))).aa(true)`

- Description: TODO

### Fields

#### `public final String cap, name`

- Description: TODO

#### `public final String cap, name`

- Description: TODO

#### `public int auth, acap, adrain, aseq`

- Description: TODO

#### `public int auth, acap, adrain, aseq`

- Description: TODO

#### `public int auth, acap, adrain, aseq`

- Description: TODO

#### `public int auth, acap, adrain, aseq`

- Description: TODO

#### `public boolean offline`

- Description: TODO

#### `public final List<Member> memb = new ArrayList<Member>()`

- Description: TODO

#### `public final Map<Integer, Member> idmap = new HashMap<Integer, Member>()`

- Description: TODO

#### `protected Widget mw`

- Description: TODO

#### `public final Integer id`

- Description: TODO

#### `public final Integer id`

- Description: TODO

#### `private int aseq = -1`

- Description: TODO

#### `private Tex rauth = null`

- Description: TODO

### Methods

#### `public Member(Integer id)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public MemberList(Coord sz)`

- Description: TODO

#### `public MemberList(int w, int h)`

- Description: TODO

#### `public List<Member> allitems()`

- Description: TODO

#### `public String itemname(Member m)`

- Description: TODO

#### `public boolean searchmatch(Member m, String txt)`

- Description: TODO

#### `protected Widget makeitem(Member m, int idx, Coord sz)`

- Description: TODO

#### `protected void drawbg(GOut g)`

- Description: TODO

#### `protected void drawslot(GOut g, Member m, int idx, Area area)`

- Description: TODO

#### `public void change(Member pm)`

- Description: TODO

#### `public MemberWidget(Coord sz, Integer id)`

- Description: TODO

#### `public Polity(String cap, String name)`

- Description: TODO

#### `public AuthMeter(Coord sz)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `protected Member parsememb(Object[] args)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public void cdestroy(Widget w)`

- Description: TODO
