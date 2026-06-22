---
source: [Partyview.java](../../../../src/haven/Partyview.java)
created: 2026-06-13
updated: 2026-06-14
---

# Partyview

Represents the partyview Haven component.

## Nested Types

### $_

- Role: Registers the party-view widget resource.
- Description: Factory that creates a Partyview bound to the current session party.

### MemberView

- Role: Renders one party member tile.
- Description: Frame widget that displays one member avatar, border, and color state.

## Members

### Constants

#### `public static final int marg = UI.scale(4)`
- Role: Implements the marg operation.
- Description: Implements the scale operation.
- Value: `UI.scale(4)`

### Fields

#### `public final Party party`
- Role: Caches the party value.
- Description: Caches the `party` value for reuse.

#### `public final long ign`
- Role: Caches the ign value.
- Description: Caches the `ign` value for reuse.

#### `private final Button leave`
- Role: Caches the leave value.
- Description: Caches the `leave` value for reuse.

#### `private Map<Member, MemberView> avs = Collections.emptyMap()`
- Role: Implements the avs operation.
- Description: Implements the empty map operation.

#### `private Map<Long, Member> om = null`
- Role: Caches the om value.
- Description: Caches the `om` value for reuse.

#### `public final Member m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

#### `public Color color = Color.WHITE`
- Role: Caches the color value.
- Description: Caches the `color` value for reuse.

#### `private Tex tooltip = null`
- Role: Caches the tooltip value.
- Description: Caches the `tooltip` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `Partyview(Party party, long ign)`
- Role: Creates a new Partyview instance.
- Description: Constructs the Partyview instance from the supplied inputs.

#### `protected void added()`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public MemberView(Coord sz, Member m)`
- Role: Handles the member view path.
- Description: Implements the member view operation.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.

#### `public void drawframe(GOut g)`
- Role: Handles the drawframe path.
- Description: Draws the frame.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `private void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.

#### `private void updsteam()`
- Role: Handles the updsteam path.
- Description: Implements the updsteam operation.

#### `public void destroy()`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.