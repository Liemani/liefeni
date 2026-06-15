# SListMenu

This file documents the responsibilities and members of `SListMenu`.

## Meta

- Source: [SListMenu.java](../../../src/haven/SListMenu.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a styled list menu widget.

## Nested Types

### Action

- Description: TODO

### IconMenu

- Description: TODO

### InnerList

- Description: TODO

### Item

- Description: TODO

### TextMenu

- Description: TODO

## Members

### Constants

#### `public static final Text.Foundry bigf = CharWnd.attrf`

- Description: TODO

#### `public static final Text.Foundry smallf = new Text.Foundry(Text.fraktur, 14).aa(true)`

- Description: TODO

#### `public static final Tex bg = Window.bg`

- Description: TODO

#### `public static final IBox obox = Window.wbox`

- Description: TODO

### Fields

#### `public final InnerList box`

- Description: TODO

#### `public boolean grab = true`

- Description: TODO

#### `private UI.Grab mg, kg`

- Description: TODO

#### `private UI.Grab mg, kg`

- Description: TODO

#### `private Coord mc = Coord.of(-1, -1)`

- Description: TODO

#### `private boolean inited = false`

- Description: TODO

#### `public final Text.Foundry fnd`

- Description: TODO

#### `public final Text.Foundry fnd`

- Description: TODO

### Methods

#### `protected abstract List<? extends I> items()`

- Description: TODO

#### `protected abstract W makeitem(I item, int idx, Coord sz)`

- Description: TODO

#### `protected abstract void choice(I item)`

- Description: TODO

#### `public SListMenu(Coord sz, int itemh)`

- Description: TODO

#### `private Item(I item, W child)`

- Description: TODO

#### `private InnerList(Coord sz, int itemh)`

- Description: TODO

#### `protected List<? extends I> items()`

- Description: TODO

#### `protected Item makeitem(I item, int idx, Coord sz)`

- Description: TODO

#### `public void change(I item)`

- Description: TODO

#### `public void mousemove(MouseMoveEvent ev)`

- Description: TODO

#### `protected void drawbg(GOut g, I item, int idx, Area area)`

- Description: TODO

#### `private void aresize(Coord f, Coord t)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `protected void added()`

- Description: TODO

#### `public void destroy()`

- Description: TODO

#### `public SListMenu<I, W> addat(Widget wdg, Coord c)`

- Description: TODO

#### `public SListMenu nograb()`

- Description: TODO

#### `public TextMenu(Coord sz, Text.Foundry fnd)`

- Description: TODO

#### `public TextMenu(Coord sz)`

- Description: TODO

#### `protected abstract String nameof(I item)`

- Description: TODO

#### `protected Widget makeitem(I item, int idx, Coord sz)`

- Description: TODO

#### `public static <I> SListMenu<I, Widget> of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action, Runnable cancel)`

- Description: TODO

#### `public static <I> SListMenu<I, Widget> of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public static Action of(String name, Runnable fun)`

- Description: TODO

#### `public static SListMenu<Action, Widget> of(Coord sz, Text.Foundry fnd, List<? extends Action> actions, Runnable cancel)`

- Description: TODO

#### `public static SListMenu<Action, Widget> of(Coord sz, Text.Foundry fnd, List<? extends Action> actions)`

- Description: TODO

#### `public IconMenu(Coord sz, Text.Foundry fnd)`

- Description: TODO

#### `public IconMenu(Coord sz)`

- Description: TODO

#### `protected abstract String nameof(I item)`

- Description: TODO

#### `protected abstract BufferedImage iconof(I item)`

- Description: TODO

#### `protected Widget makeitem(I item, int idx, Coord sz)`

- Description: TODO

#### `public static <I> SListMenu<I, Widget> of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action, Runnable cancel)`

- Description: TODO

#### `public static <I> SListMenu<I, Widget> of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action)`

- Description: TODO
