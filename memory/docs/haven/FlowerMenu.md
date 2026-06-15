# FlowerMenu

This file documents the responsibilities and members of `FlowerMenu`.

## Meta

- Source: [FlowerMenu.java](../../../src/haven/FlowerMenu.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the flower menu interaction widget.

## Nested Types

### $_

- Description: TODO

### Cancel

- Description: TODO

### Chosen

- Description: TODO

### Opening

- Description: TODO

### Petal

- Description: TODO

## Members

### Constants

#### `public static final Color pink = new Color(255, 0, 128)`

- Description: TODO

#### `public static final Color ptc = Color.YELLOW`

- Description: TODO

#### `public static final Text.Foundry ptf = new Text.Foundry(Text.dfont, 12)`

- Description: TODO

#### `public static final IBox pbox = Window.wbox`

- Description: TODO

#### `public static final Tex pbg = Window.bg`

- Description: TODO

#### `public static final int ph = UI.scale(30), ppl = 8`

- Description: TODO

#### `public static final int ph = UI.scale(30), ppl = 8`

- Description: TODO

### Fields

#### `public Petal[] opts`

- Description: TODO

#### `private UI.Grab mg, kg`

- Description: TODO

#### `private UI.Grab mg, kg`

- Description: TODO

#### `public String name`

- Description: TODO

#### `public double ta, tr`

- Description: TODO

#### `public double ta, tr`

- Description: TODO

#### `public int num`

- Description: TODO

#### `private Text text`

- Description: TODO

#### `private double a = 1`

- Description: TODO

#### `Petal chosen`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Petal(String name)`

- Description: TODO

#### `public void move(Coord c)`

- Description: TODO

#### `public void move(double a, double r)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public Area ta(Coord tc)`

- Description: TODO

#### `public Area ta(double a, double r)`

- Description: TODO

#### `private static double nxf(double a)`

- Description: TODO

#### `Opening()`

- Description: TODO

#### `public void ntick(double s)`

- Description: TODO

#### `Chosen(Petal c)`

- Description: TODO

#### `public void ntick(double s)`

- Description: TODO

#### `Cancel()`

- Description: TODO

#### `public void ntick(double s)`

- Description: TODO

#### `private void organize(Petal[] opts)`

- Description: TODO

#### `public FlowerMenu(String... options)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public void choose(Petal option)`

- Description: TODO
