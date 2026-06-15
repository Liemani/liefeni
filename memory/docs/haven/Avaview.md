# Avaview

This file documents the responsibilities and members of `Avaview`.

## Meta

- Source: [Avaview.java](../../../src/haven/Avaview.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays an avatar widget.

## Nested Types

### $_

- Description: TODO

### AvaOwner

- Description: TODO

## Members

### Constants

#### `public static final Tex missing = Resource.loadtex("gfx/hud/equip/missing")`

- Description: TODO

#### `public static final Coord dasz = missing.sz()`

- Description: TODO

#### `private static final OwnerContext.ClassResolver<Avaview> ctxr = new OwnerContext.ClassResolver<Avaview>()`

- Description: TODO

### Fields

#### `public FColor clearcolor = FColor.BLACK`

- Description: TODO

#### `public long avagob`

- Description: TODO

#### `public Desc avadesc`

- Description: TODO

#### `public Resource.Resolver resmap = null`

- Description: TODO

#### `private Composited comp`

- Description: TODO

#### `private RenderTree.Slot compslot`

- Description: TODO

#### `private List<Composited.MD> cmod = null`

- Description: TODO

#### `private List<Composited.ED> cequ = null`

- Description: TODO

#### `private final String camnm`

- Description: TODO

#### `private Collection<ResData> nposes = null, lposes = null`

- Description: TODO

#### `private Collection<ResData> nposes = null, lposes = null`

- Description: TODO

#### `private boolean nposesold`

- Description: TODO

#### `private final AvaOwner avaowner = new AvaOwner()`

- Description: TODO

#### `private Indir<Resource> lbase = null`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Avaview(Coord sz, long avagob, String camnm)`

- Description: TODO

#### `protected void makeproj()`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void pop(Desc ava, Resource.Resolver resmap)`

- Description: TODO

#### `public void pop(Desc ava)`

- Description: TODO

#### `public void chposes(Collection<ResData> poses, boolean interp)`

- Description: TODO

#### `private void updposes()`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Collection<Location.Chain> getloc()`

- Description: TODO

#### `public double getv()`

- Description: TODO

#### `private void initcomp(Composite gc)`

- Description: TODO

#### `private static Camera makecam(Resource base, Composited comp, String camnm)`

- Description: TODO

#### `private Composite getgcomp()`

- Description: TODO

#### `private static List<MD> copy1(List<MD> in)`

- Description: TODO

#### `private static List<ED> copy2(List<ED> in)`

- Description: TODO

#### `public void updcomp()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `protected FColor clearcolor()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO
