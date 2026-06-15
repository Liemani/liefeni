# Partyview

This file documents the responsibilities and members of `Partyview`.

## Meta

- Source: [Partyview.java](../../../src/haven/Partyview.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays party UI.

## Nested Types

### $_

- Description: TODO

### MemberView

- Description: TODO

## Members

### Constants

#### `public static final int marg = UI.scale(4)`

- Description: TODO

### Fields

#### `public final Party party`

- Description: TODO

#### `public final long ign`

- Description: TODO

#### `private final Button leave`

- Description: TODO

#### `private Map<Member, MemberView> avs = Collections.emptyMap()`

- Description: TODO

#### `private Map<Long, Member> om = null`

- Description: TODO

#### `public final Member m`

- Description: TODO

#### `public Color color = Color.WHITE`

- Description: TODO

#### `private Tex tooltip = null`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `Partyview(Party party, long ign)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public MemberView(Coord sz, Member m)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public void drawframe(GOut g)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `private void update()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

#### `private void updsteam()`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void dispose()`

- Description: TODO
