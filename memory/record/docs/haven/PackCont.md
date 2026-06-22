---
source: [PackCont.java](../../../../src/haven/PackCont.java)
created: 2026-06-13
updated: 2026-06-14
---

# PackCont

Represents the pack cont Haven component.

## Nested Types

### $linpack

- Role: Represents $linpack within PackCont.
- Description: Describes the nested $linpack type used by the enclosing class.

### HPack

- Role: Represents hpack within PackCont.
- Description: Describes the nested hpack type used by the enclosing class.

### LinPack

- Role: Represents lin pack within PackCont.
- Description: Describes the nested lin pack type used by the enclosing class.

### VPack

- Role: Represents vpack within PackCont.
- Description: Describes the nested vpack type used by the enclosing class.

## Members

### Constants

### Fields

#### `public boolean packpar`
- Role: Tracks the packpar flag.
- Description: Caches the `packpar` value for reuse.

#### `private boolean packed = false`
- Role: Tracks the packed flag.
- Description: Caches the `packed` value for reuse.

#### `public final List<Widget> order = new ArrayList<>()`
- Role: Implements the order operation.
- Description: Implements the public final list<widget> order = new array list<>() operation.

#### `public int margin = 0`
- Role: Caches the margin value.
- Description: Caches the `margin` value for reuse.

### Methods

#### `public PackCont()`
- Role: Creates a new PackCont instance.
- Description: Constructs the PackCont instance from the supplied inputs.

#### `public PackCont packpar(boolean packpar)`
- Role: Handles the packpar path.
- Description: Implements the packpar operation.

#### `public <T extends Widget> T add(T child)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void cdestroy(Widget ch)`
- Role: Handles the cdestroy path.
- Description: Implements the cdestroy operation.

#### `public void cresize(Widget ch)`
- Role: Handles the cresize path.
- Description: Implements the cresize operation.

#### `public void pack()`
- Role: Handles the pack path.
- Description: Implements the pack operation.

#### `private void repack0()`
- Role: Handles the repack0 path.
- Description: Implements the repack0 operation.

#### `protected abstract void repack()`
- Role: Handles the repack path.
- Description: Implements the repack operation.

#### `public LinPack margin(int margin)`
- Role: Handles the margin path.
- Description: Implements the margin operation.

#### `protected abstract Coord pad(int p)`
- Role: Handles the pad path.
- Description: Implements the pad operation.

#### `public <T extends Widget> T last(T child, int pad)`
- Role: Handles the last path.
- Description: Implements the last operation.

#### `public <T extends Widget> T insert(T child, int p, int pad)`
- Role: Handles the insert path.
- Description: Implements the insert operation.

#### `public <T extends Widget> T after(T child, Widget after, int pad)`
- Role: Handles the after path.
- Description: Implements the after operation.

#### `public <T extends Widget> T before(T child, Widget after, int pad)`
- Role: Handles the before path.
- Description: Implements the before operation.

#### `public void cdestroy(Widget ch)`
- Role: Handles the cdestroy path.
- Description: Implements the cdestroy operation.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `protected Coord pad(int p)`
- Role: Handles the pad path.
- Description: Implements the pad operation.

#### `protected void repack()`
- Role: Handles the repack path.
- Description: Implements the repack operation.

#### `protected Coord pad(int p)`
- Role: Handles the pad path.
- Description: Implements the pad operation.

#### `protected void repack()`
- Role: Handles the repack path.
- Description: Implements the repack operation.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.