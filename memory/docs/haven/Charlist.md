# Charlist

This file documents the responsibilities and members of `Charlist`.

## Meta

- Source: [Charlist.java](../../../src/haven/Charlist.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the character selection list.

## Nested Types

### $_

- Description: TODO

### Boxlist

- Description: TODO

### Char

- Description: TODO

### Charbox

- Description: TODO

## Members

### Constants

#### `public static final Coord bsz = UI.scale(289, 96)`

- Description: TODO

#### `public static final Text.Furnace nf = new PUtils.BlurFurn(new PUtils.TexFurn(new Text.Foundry(Text.fraktur, 20).aa(true), Window.ctex), UI.scale(2), UI.scale(2), Color.BLACK)`

- Description: TODO

#### `public static final Text.Furnace df = new PUtils.BlurFurn(Button.tf, UI.scale(2), UI.scale(2), Color.BLACK)`

- Description: TODO

#### `public static final int margin = UI.scale(6)`

- Description: TODO

#### `public static final int btnw = UI.scale(100)`

- Description: TODO

### Fields

#### `public final int height`

- Description: TODO

#### `public final IButton sau, sad`

- Description: TODO

#### `public final IButton sau, sad`

- Description: TODO

#### `public final List<Char> chars = new ArrayList<Char>()`

- Description: TODO

#### `public final Boxlist list`

- Description: TODO

#### `public Avaview avalink`

- Description: TODO

#### `private boolean dirty`

- Description: TODO

#### `private boolean showdisc`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public String disc`

- Description: TODO

#### `public Composited.Desc avadesc`

- Description: TODO

#### `public Resource.Resolver avamap`

- Description: TODO

#### `public Collection<ResData> avaposes`

- Description: TODO

#### `public final Char chr`

- Description: TODO

#### `public final Avaview ava`

- Description: TODO

#### `public final ILabel name, disc`

- Description: TODO

#### `public final ILabel name, disc`

- Description: TODO

#### `private int scrolltgt = -1`

- Description: TODO

#### `private double scrollval = -1`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Charlist(int height)`

- Description: TODO

#### `public Char(String name)`

- Description: TODO

#### `public void ava(Composited.Desc desc, Resource.Resolver resmap, Collection<ResData> poses)`

- Description: TODO

#### `public Charbox(Char chr)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public Boxlist(int h)`

- Description: TODO

#### `protected List<Char> items()`

- Description: TODO

#### `protected Charbox makeitem(Char chr, int idx, Coord sz)`

- Description: TODO

#### `protected void drawslot(GOut g, Char item, int idx, Area area)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `protected boolean unselect(int button)`

- Description: TODO

#### `protected boolean autoscroll()`

- Description: TODO

#### `public void change(Char chr)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `private void checkdisc()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void scroll(int amount)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO
