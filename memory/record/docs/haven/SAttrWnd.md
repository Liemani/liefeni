---
source: [SAttrWnd.java](../../../../src/haven/SAttrWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# SAttrWnd

Represents the sattr wnd Haven component.

## Nested Types

### $_

- Role: Represents $ within SAttrWnd.
- Description: Describes the nested $  type used by the enclosing class.

### SAttr

- Role: Represents sattr within SAttrWnd.
- Description: Describes the nested sattr type used by the enclosing class.

### StudyInfo

- Role: Represents study info within SAttrWnd.
- Description: Describes the nested study info type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Collection<SAttr> attrs`
- Role: Caches the attrs value.
- Description: Caches the `attrs` value for reuse.

#### `private final Coord studyc`
- Role: Caches the studyc value.
- Description: Caches the `studyc` value for reuse.

#### `private CharWnd chr`
- Role: Caches the chr value.
- Description: Caches the `chr` value for reuse.

#### `private int scost`
- Role: Caches the scost value.
- Description: Caches the `scost` value for reuse.

#### `public final Text rnm`
- Role: Caches the rnm value.
- Description: Caches the `rnm` value for reuse.

#### `public final Tex img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `public final Color bg`
- Role: Caches the bg value.
- Description: Caches the `bg` value for reuse.

#### `public int tbv, cost`
- Role: Caches the cost value.
- Description: Caches the `cost` value for reuse.

#### `public int tbv, cost`
- Role: Caches the cost value.
- Description: Caches the `cost` value for reuse.

#### `private final IButton add, sub`
- Role: Caches the sub value.
- Description: Caches the `sub` value for reuse.

#### `private final IButton add, sub`
- Role: Caches the sub value.
- Description: Caches the `sub` value for reuse.

#### `private Text ct`
- Role: Caches the ct value.
- Description: Caches the `ct` value for reuse.

#### `private int cbv, ccv`
- Role: Caches the ccv value.
- Description: Caches the `ccv` value for reuse.

#### `private int cbv, ccv`
- Role: Caches the ccv value.
- Description: Caches the `ccv` value for reuse.

#### `public final Widget study`
- Role: Caches the study value.
- Description: Caches the `study` value for reuse.

#### `public int texp, tw, tenc`
- Role: Caches the tenc value.
- Description: Caches the `tenc` value for reuse.

#### `public int texp, tw, tenc`
- Role: Caches the tenc value.
- Description: Caches the `tenc` value for reuse.

#### `public int texp, tw, tenc`
- Role: Caches the tenc value.
- Description: Caches the `tenc` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private SAttr(Glob glob, String attr, Color bg)`
- Role: Handles the sattr path.
- Description: Implements the s attr operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the SAttrWnd content.

#### `private void updcost()`
- Role: Handles the updcost path.
- Description: Implements the updcost operation.

#### `public void adj(int a)`
- Role: Handles the adj path.
- Description: Implements the adj operation.

#### `public void reset()`
- Role: Resets the stream if mark/reset is supported.
- Description: Resets the stream if mark/reset is supported.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public RLabel<?> explabel()`
- Role: Handles the explabel path.
- Description: Implements the explabel operation.

#### `public RLabel<?> enclabel()`
- Role: Handles the enclabel path.
- Description: Implements the enclabel operation.

#### `protected void attached()`
- Role: Handles the attached path.
- Description: Implements the attached operation.

#### `private StudyInfo(Coord sz, Widget study)`
- Role: Handles the study info path.
- Description: Implements the study info operation.

#### `private void upd()`
- Role: Handles the upd path.
- Description: Implements the upd operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `private void buy()`
- Role: Handles the buy path.
- Description: Implements the buy operation.

#### `private void reset()`
- Role: Resets the stream if mark/reset is supported.
- Description: Resets the stream if mark/reset is supported.

#### `public SAttrWnd(Glob glob)`
- Role: Creates a new SAttrWnd instance.
- Description: Constructs the SAttrWnd instance from the supplied inputs.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.