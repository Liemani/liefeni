# Partyview

This file documents the responsibilities and members of `Partyview`.

## Meta

- Source: [Partyview.java](../../../src/haven/Partyview.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the partyview Haven component.

## Nested Types

### $_

- Role: Represents $ within Partyview.
- Description: Describes the nested $  type used by the enclosing class.

### MemberView

- Role: Represents member view within Partyview.
- Description: Describes the nested member view type used by the enclosing class.

## Members

### Constants

#### `public static final int marg = UI.scale(4)`
- Role: Defines the shared marg constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Party party`
- Role: Holds the party state.
- Description: Backs the cached state for this file.

#### `public final long ign`
- Role: Stores the ign value.
- Description: Backs the cached state for this file.

#### `private final Button leave`
- Role: Holds the leave state.
- Description: Backs the cached state for this file.

#### `private Map<Member, MemberView> avs = Collections.emptyMap()`
- Role: Caches avs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Map<Long, Member> om = null`
- Role: Caches om entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Member m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `public Color color = Color.WHITE`
- Role: Stores the color value.
- Description: Backs the cached state for this file.

#### `private Tex tooltip = null`
- Role: Stores the tooltip value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `Partyview(Party party, long ign)`
- Role: Creates a new Partyview instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public MemberView(Coord sz, Member m)`
- Role: Performs member view.
- Description: Supports the member view operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `public void drawframe(GOut g)`
- Role: Performs drawframe.
- Description: Supports the drawframe operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `private void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.

#### `private void updsteam()`
- Role: Performs updsteam.
- Description: Supports the updsteam operation used by the surrounding class.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
