# SListWidget

This file documents the responsibilities and members of `SListWidget`.

## Meta

- Source: [SListWidget.java](../../../src/haven/SListWidget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the slist widget Haven component.

## Nested Types

### FromRes

- Role: Represents from res within SListWidget.
- Description: Describes the nested from res type used by the enclosing class.

### IconText

- Role: Represents icon text within SListWidget.
- Description: Describes the nested icon text type used by the enclosing class.

### ItemFactory

- Role: Represents item factory within SListWidget.
- Description: Describes the nested item factory type used by the enclosing class.

### ItemWidget

- Role: Represents item widget within SListWidget.
- Description: Describes the nested item widget type used by the enclosing class.

### TextItem

- Role: Represents text item within SListWidget.
- Description: Describes the nested text item type used by the enclosing class.

## Members

### Constants

### Fields

#### `public I sel`
- Role: Holds the sel state.
- Description: Backs the cached state for this file.

#### `public final SListWidget<I, ?> list`
- Role: Stores the list value.
- Description: Backs the cached state for this file.

#### `public final I item`
- Role: Holds the item state.
- Description: Backs the cached state for this file.

#### `private Text.Slug text = null`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `private Tex img = null`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `private Text.Slug text = null`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

### Methods

#### `public SListWidget(Coord sz)`
- Role: Creates a new SListWidget instance.
- Description: Constructs the instance and initializes its default state.

#### `protected abstract List<? extends I> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected abstract W makeitem(I item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public W makeitem(I item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public void change(I item)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public ItemWidget(SListWidget<I, ?> list, Coord sz, I item)`
- Role: Performs item widget.
- Description: Supports the item widget operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public TextItem(Coord sz)`
- Role: Performs text item.
- Description: Supports the text item operation used by the surrounding class.

#### `public TextItem(int w)`
- Role: Performs text item.
- Description: Supports the text item operation used by the surrounding class.

#### `protected abstract String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `protected int margin()`
- Role: Performs margin.
- Description: Supports the margin operation used by the surrounding class.

#### `protected Text.Forge foundry()`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `protected boolean valid(String text)`
- Role: Performs valid.
- Description: Supports the valid operation used by the surrounding class.

#### `protected void drawtext(GOut g)`
- Role: Performs drawtext.
- Description: Supports the drawtext operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void invalidate()`
- Role: Performs invalidate.
- Description: Supports the invalidate operation used by the surrounding class.

#### `public static TextItem of(Coord sz, Text.Forge fnd, Supplier<String> text)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static TextItem of(Coord sz, Supplier<String> text)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public IconText(Coord sz)`
- Role: Performs icon text.
- Description: Supports the icon text operation used by the surrounding class.

#### `public IconText(int w)`
- Role: Performs icon text.
- Description: Supports the icon text operation used by the surrounding class.

#### `protected abstract BufferedImage img()`
- Role: Performs img.
- Description: Supports the img operation used by the surrounding class.

#### `protected abstract String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `protected int margin()`
- Role: Performs margin.
- Description: Supports the margin operation used by the surrounding class.

#### `protected Text.Forge foundry()`
- Role: Performs foundry.
- Description: Supports the foundry operation used by the surrounding class.

#### `protected boolean valid(String text)`
- Role: Performs valid.
- Description: Supports the valid operation used by the surrounding class.

#### `protected PUtils.Convolution filter()`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `protected void drawicon(GOut g)`
- Role: Performs drawicon.
- Description: Supports the drawicon operation used by the surrounding class.

#### `protected void drawtext(GOut g)`
- Role: Performs drawtext.
- Description: Supports the drawtext operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void invalidate()`
- Role: Performs invalidate.
- Description: Supports the invalidate operation used by the surrounding class.

#### `public FromRes(Coord sz, Indir<Resource> res)`
- Role: Performs from res.
- Description: Supports the from res operation used by the surrounding class.

#### `public BufferedImage img()`
- Role: Performs img.
- Description: Supports the img operation used by the surrounding class.

#### `public String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public static IconText of(Coord sz, Indir<Resource> res)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static IconText of(Coord sz, Supplier<BufferedImage> img, Supplier<String> text)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.
