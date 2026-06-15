# SListWidget

This file documents the responsibilities and members of `SListWidget`.

## Meta

- Source: [SListWidget.java](../../../src/haven/SListWidget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a styled list widget base.

## Nested Types

### FromRes

- Description: TODO

### IconText

- Description: TODO

### ItemFactory

- Description: TODO

### ItemWidget

- Description: TODO

### TextItem

- Description: TODO

## Members

### Constants

### Fields

#### `public I sel`

- Description: TODO

#### `public final SListWidget<I, ?> list`

- Description: TODO

#### `public final I item`

- Description: TODO

#### `private Text.Slug text = null`

- Description: TODO

#### `private Tex img = null`

- Description: TODO

#### `private Text.Slug text = null`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

### Methods

#### `public SListWidget(Coord sz)`

- Description: TODO

#### `protected abstract List<? extends I> items()`

- Description: TODO

#### `protected abstract W makeitem(I item, int idx, Coord sz)`

- Description: TODO

#### `public W makeitem(I item, int idx, Coord sz)`

- Description: TODO

#### `public void change(I item)`

- Description: TODO

#### `public ItemWidget(SListWidget<I, ?> list, Coord sz, I item)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public TextItem(Coord sz)`

- Description: TODO

#### `public TextItem(int w)`

- Description: TODO

#### `protected abstract String text()`

- Description: TODO

#### `protected int margin()`

- Description: TODO

#### `protected Text.Forge foundry()`

- Description: TODO

#### `protected boolean valid(String text)`

- Description: TODO

#### `protected void drawtext(GOut g)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public void invalidate()`

- Description: TODO

#### `public static TextItem of(Coord sz, Text.Forge fnd, Supplier<String> text)`

- Description: TODO

#### `public static TextItem of(Coord sz, Supplier<String> text)`

- Description: TODO

#### `public IconText(Coord sz)`

- Description: TODO

#### `public IconText(int w)`

- Description: TODO

#### `protected abstract BufferedImage img()`

- Description: TODO

#### `protected abstract String text()`

- Description: TODO

#### `protected int margin()`

- Description: TODO

#### `protected Text.Forge foundry()`

- Description: TODO

#### `protected boolean valid(String text)`

- Description: TODO

#### `protected PUtils.Convolution filter()`

- Description: TODO

#### `protected void drawicon(GOut g)`

- Description: TODO

#### `protected void drawtext(GOut g)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public void invalidate()`

- Description: TODO

#### `public FromRes(Coord sz, Indir<Resource> res)`

- Description: TODO

#### `public BufferedImage img()`

- Description: TODO

#### `public String text()`

- Description: TODO

#### `public static IconText of(Coord sz, Indir<Resource> res)`

- Description: TODO

#### `public static IconText of(Coord sz, Supplier<BufferedImage> img, Supplier<String> text)`

- Description: TODO
