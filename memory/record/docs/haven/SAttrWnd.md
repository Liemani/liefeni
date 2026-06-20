---
source: [SAttrWnd.java](../../../src/haven/SAttrWnd.java)
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
- Role: Caches attrs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Coord studyc`
- Role: Stores the studyc value.
- Description: Backs the cached state for this file.

#### `private CharWnd chr`
- Role: Stores the chr value.
- Description: Backs the cached state for this file.

#### `private int scost`
- Role: Stores the scost value.
- Description: Backs the cached state for this file.

#### `public final Text rnm`
- Role: Stores the rnm value.
- Description: Backs the cached state for this file.

#### `public final Tex img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `public final Color bg`
- Role: Stores the bg value.
- Description: Backs the cached state for this file.

#### `public int tbv, cost`
- Role: Stores the cost value.
- Description: Backs the cached state for this file.

#### `public int tbv, cost`
- Role: Stores the cost value.
- Description: Backs the cached state for this file.

#### `private final IButton add, sub`
- Role: Holds the sub state.
- Description: Backs the cached state for this file.

#### `private final IButton add, sub`
- Role: Holds the sub state.
- Description: Backs the cached state for this file.

#### `private Text ct`
- Role: Stores the ct value.
- Description: Backs the cached state for this file.

#### `private int cbv, ccv`
- Role: Stores the ccv value.
- Description: Backs the cached state for this file.

#### `private int cbv, ccv`
- Role: Stores the ccv value.
- Description: Backs the cached state for this file.

#### `public final Widget study`
- Role: Stores the study value.
- Description: Backs the cached state for this file.

#### `public int texp, tw, tenc`
- Role: Stores the tenc value.
- Description: Backs the cached state for this file.

#### `public int texp, tw, tenc`
- Role: Stores the tenc value.
- Description: Backs the cached state for this file.

#### `public int texp, tw, tenc`
- Role: Stores the tenc value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private SAttr(Glob glob, String attr, Color bg)`
- Role: Performs sattr.
- Description: Supports the sattr operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private void updcost()`
- Role: Performs updcost.
- Description: Supports the updcost operation used by the surrounding class.

#### `public void adj(int a)`
- Role: Performs adj.
- Description: Supports the adj operation used by the surrounding class.

#### `public void reset()`
- Role: Performs reset.
- Description: Supports the reset operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public RLabel<?> explabel()`
- Role: Performs explabel.
- Description: Supports the explabel operation used by the surrounding class.

#### `public RLabel<?> enclabel()`
- Role: Performs enclabel.
- Description: Supports the enclabel operation used by the surrounding class.

#### `protected void attached()`
- Role: Performs attached.
- Description: Supports the attached operation used by the surrounding class.

#### `private StudyInfo(Coord sz, Widget study)`
- Role: Performs study info.
- Description: Supports the study info operation used by the surrounding class.

#### `private void upd()`
- Role: Performs upd.
- Description: Supports the upd operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `private void buy()`
- Role: Performs buy.
- Description: Supports the buy operation used by the surrounding class.

#### `private void reset()`
- Role: Performs reset.
- Description: Supports the reset operation used by the surrounding class.

#### `public SAttrWnd(Glob glob)`
- Role: Creates a new SAttrWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.
