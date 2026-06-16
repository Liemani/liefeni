# PackCont

This file documents the responsibilities and members of `PackCont`.

## Meta

- Source: [PackCont.java](../../../src/haven/PackCont.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Description: Supports the packpar operation used by the surrounding class.

#### `private boolean packed = false`
- Role: Tracks the packed flag.
- Description: Supports the packed operation used by the surrounding class.

#### `public final List<Widget> order = new ArrayList<>()`
- Role: Caches order entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int margin = 0`
- Role: Stores the margin value.
- Description: Backs the cached state for this file.

### Methods

#### `public PackCont()`
- Role: Creates a new PackCont instance.
- Description: Constructs the instance and initializes its default state.

#### `public PackCont packpar(boolean packpar)`
- Role: Performs packpar.
- Description: Supports the packpar operation used by the surrounding class.

#### `public <T extends Widget> T add(T child)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void cdestroy(Widget ch)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public void cresize(Widget ch)`
- Role: Performs cresize.
- Description: Supports the cresize operation used by the surrounding class.

#### `public void pack()`
- Role: Performs pack.
- Description: Supports the pack operation used by the surrounding class.

#### `private void repack0()`
- Role: Performs repack0.
- Description: Supports the repack0 operation used by the surrounding class.

#### `protected abstract void repack()`
- Role: Performs repack.
- Description: Supports the repack operation used by the surrounding class.

#### `public LinPack margin(int margin)`
- Role: Performs margin.
- Description: Supports the margin operation used by the surrounding class.

#### `protected abstract Coord pad(int p)`
- Role: Performs pad.
- Description: Supports the pad operation used by the surrounding class.

#### `public <T extends Widget> T last(T child, int pad)`
- Role: Performs last.
- Description: Supports the last operation used by the surrounding class.

#### `public <T extends Widget> T insert(T child, int p, int pad)`
- Role: Performs insert.
- Description: Supports the insert operation used by the surrounding class.

#### `public <T extends Widget> T after(T child, Widget after, int pad)`
- Role: Performs after.
- Description: Supports the after operation used by the surrounding class.

#### `public <T extends Widget> T before(T child, Widget after, int pad)`
- Role: Performs before.
- Description: Supports the before operation used by the surrounding class.

#### `public void cdestroy(Widget ch)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `protected Coord pad(int p)`
- Role: Performs pad.
- Description: Supports the pad operation used by the surrounding class.

#### `protected void repack()`
- Role: Performs repack.
- Description: Supports the repack operation used by the surrounding class.

#### `protected Coord pad(int p)`
- Role: Performs pad.
- Description: Supports the pad operation used by the surrounding class.

#### `protected void repack()`
- Role: Performs repack.
- Description: Supports the repack operation used by the surrounding class.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.
