# SListMenu

## Meta

- Source: [SListMenu.java](../../../src/haven/SListMenu.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays a styled list menu widget.

## Code Members

### Member Index

#### Fields

- [bigf](#member-1)
- [smallf](#member-2)
- [bg](#member-3)
- [obox](#member-4)
- [box](#member-5)
- [grab](#member-6)
- [mg](#member-7)
- [kg](#member-8)
- [mc](#member-13)
- [inited](#member-21)
- [fnd](#member-30)
- [fnd](#member-41)

#### Methods

- [protected abstract List<? extends I> items();](#member-9)
- [protected abstract W makeitem(I item, int idx, Coord sz);](#member-10)
- [protected abstract void choice(I item);](#member-11)
- [Item(I item, W child)](#member-12)
- [InnerList(Coord sz, int itemh)](#member-14)
- [items()](#member-15)
- [makeitem(I item, int idx, Coord sz)](#member-16)
- [change(I item)](#member-17)
- [mousemove(MouseMoveEvent ev)](#member-18)
- [drawbg(GOut g, I item, int idx, Area area)](#member-19)
- [aresize(Coord f, Coord t)](#member-20)
- [tick(double dt)](#member-22)
- [draw(GOut g)](#member-23)
- [mousedown(MouseDownEvent ev)](#member-24)
- [keydown(KeyDownEvent ev)](#member-25)
- [added()](#member-26)
- [destroy()](#member-27)
- [addat(Widget wdg, Coord c)](#member-28)
- [nograb()](#member-29)
- [TextMenu(Coord sz, Text.Foundry fnd)](#member-31)
- [TextMenu(Coord sz)](#member-32)
- [protected abstract String nameof(I item);](#member-33)
- [makeitem(I item, int idx, Coord sz)](#member-34)
- [of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action, Runnable cancel)](#member-35)
- [of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action)](#member-36)
- [public String name();](#member-37)
- [of(String name, Runnable fun)](#member-38)
- [of(Coord sz, Text.Foundry fnd, List<? extends Action> actions, Runnable cancel)](#member-39)
- [of(Coord sz, Text.Foundry fnd, List<? extends Action> actions)](#member-40)
- [IconMenu(Coord sz, Text.Foundry fnd)](#member-42)
- [IconMenu(Coord sz)](#member-43)
- [protected abstract String nameof(I item);](#member-44)
- [protected abstract BufferedImage iconof(I item);](#member-45)
- [makeitem(I item, int idx, Coord sz)](#member-46)
- [of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action, Runnable cancel)](#member-47)
- [of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action)](#member-48)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `bigf`

- Description: TODO

<a id="member-2"></a>
##### `smallf`

- Description: TODO

<a id="member-3"></a>
##### `bg`

- Description: TODO

<a id="member-4"></a>
##### `obox`

- Description: TODO

<a id="member-5"></a>
##### `box`

- Description: TODO

<a id="member-6"></a>
##### `grab`

- Description: TODO

<a id="member-7"></a>
##### `mg`

- Description: TODO

<a id="member-8"></a>
##### `kg`

- Description: TODO

<a id="member-13"></a>
##### `mc`

- Description: TODO

<a id="member-21"></a>
##### `inited`

- Description: TODO

<a id="member-30"></a>
##### `fnd`

- Description: TODO

<a id="member-41"></a>
##### `fnd`

- Description: TODO

#### Methods

<a id="member-9"></a>
##### `protected abstract List<? extends I> items();`

- Description: TODO

<a id="member-10"></a>
##### `protected abstract W makeitem(I item, int idx, Coord sz);`

- Description: TODO

<a id="member-11"></a>
##### `protected abstract void choice(I item);`

- Description: TODO

<a id="member-12"></a>
##### `Item(I item, W child)`

- Description: TODO

<a id="member-14"></a>
##### `InnerList(Coord sz, int itemh)`

- Description: TODO

<a id="member-15"></a>
##### `items()`

- Description: TODO

<a id="member-16"></a>
##### `makeitem(I item, int idx, Coord sz)`

- Description: TODO

<a id="member-17"></a>
##### `change(I item)`

- Description: TODO

<a id="member-18"></a>
##### `mousemove(MouseMoveEvent ev)`

- Description: TODO

<a id="member-19"></a>
##### `drawbg(GOut g, I item, int idx, Area area)`

- Description: TODO

<a id="member-20"></a>
##### `aresize(Coord f, Coord t)`

- Description: TODO

<a id="member-22"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-23"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-24"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-25"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-26"></a>
##### `added()`

- Description: TODO

<a id="member-27"></a>
##### `destroy()`

- Description: TODO

<a id="member-28"></a>
##### `addat(Widget wdg, Coord c)`

- Description: TODO

<a id="member-29"></a>
##### `nograb()`

- Description: TODO

<a id="member-31"></a>
##### `TextMenu(Coord sz, Text.Foundry fnd)`

- Description: TODO

<a id="member-32"></a>
##### `TextMenu(Coord sz)`

- Description: TODO

<a id="member-33"></a>
##### `protected abstract String nameof(I item);`

- Description: TODO

<a id="member-34"></a>
##### `makeitem(I item, int idx, Coord sz)`

- Description: TODO

<a id="member-35"></a>
##### `of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action, Runnable cancel)`

- Description: TODO

<a id="member-36"></a>
##### `of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Consumer<? super I> action)`

- Description: TODO

<a id="member-37"></a>
##### `public String name();`

- Description: TODO

<a id="member-38"></a>
##### `of(String name, Runnable fun)`

- Description: TODO

<a id="member-39"></a>
##### `of(Coord sz, Text.Foundry fnd, List<? extends Action> actions, Runnable cancel)`

- Description: TODO

<a id="member-40"></a>
##### `of(Coord sz, Text.Foundry fnd, List<? extends Action> actions)`

- Description: TODO

<a id="member-42"></a>
##### `IconMenu(Coord sz, Text.Foundry fnd)`

- Description: TODO

<a id="member-43"></a>
##### `IconMenu(Coord sz)`

- Description: TODO

<a id="member-44"></a>
##### `protected abstract String nameof(I item);`

- Description: TODO

<a id="member-45"></a>
##### `protected abstract BufferedImage iconof(I item);`

- Description: TODO

<a id="member-46"></a>
##### `makeitem(I item, int idx, Coord sz)`

- Description: TODO

<a id="member-47"></a>
##### `of(Coord sz, Text.Foundry fnd, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action, Runnable cancel)`

- Description: TODO

<a id="member-48"></a>
##### `of(Coord sz, List<? extends I> items, Function<? super I, String> nmf, Function<? super I, BufferedImage> imgf, Consumer<? super I> action)`

- Description: TODO
