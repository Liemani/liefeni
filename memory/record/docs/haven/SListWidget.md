---
source: [SListWidget.java](../../../../src/haven/SListWidget.java)
created: 2026-06-13
updated: 2026-06-14
---

# SListWidget

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
- Role: Caches the sel value.
- Description: Caches the `sel` value for reuse.

#### `public final SListWidget<I, ?> list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `public final I item`
- Role: Caches the item value.
- Description: Caches the `item` value for reuse.

#### `private Text.Slug text = null`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `private Tex img = null`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `private Text.Slug text = null`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

### Methods

#### `public SListWidget(Coord sz)`
- Role: Creates a new SListWidget instance.
- Description: Constructs the SListWidget instance from the supplied inputs.

#### `protected abstract List<? extends I> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected abstract W makeitem(I item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public W makeitem(I item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public void change(I item)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public ItemWidget(SListWidget<I, ?> list, Coord sz, I item)`
- Role: Handles the item widget path.
- Description: Implements the item widget operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public TextItem(Coord sz)`
- Role: Handles the text item path.
- Description: Implements the text item operation.

#### `public TextItem(int w)`
- Role: Handles the text item path.
- Description: Implements the text item operation.

#### `protected abstract String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `protected int margin()`
- Role: Handles the margin path.
- Description: Implements the margin operation.

#### `protected Text.Forge foundry()`
- Role: Handles the foundry path.
- Description: Implements the foundry operation.

#### `protected boolean valid(String text)`
- Role: Handles the valid path.
- Description: Implements the valid operation.

#### `protected void drawtext(GOut g)`
- Role: Handles the drawtext path.
- Description: Draws the text.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the SListWidget content.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void invalidate()`
- Role: Handles the invalidate path.
- Description: Implements the invalidate operation.

#### `public static TextItem of(Coord sz, Text.Forge fnd, Supplier<String> text)`
- Role: Builds a SListWidget value from the supplied components.
- Description: Builds a SListWidget value from the supplied components.

#### `public static TextItem of(Coord sz, Supplier<String> text)`
- Role: Builds a SListWidget value from the supplied components.
- Description: Builds a SListWidget value from the supplied components.

#### `public IconText(Coord sz)`
- Role: Handles the icon text path.
- Description: Implements the icon text operation.

#### `public IconText(int w)`
- Role: Handles the icon text path.
- Description: Implements the icon text operation.

#### `protected abstract BufferedImage img()`
- Role: Handles the img path.
- Description: Implements the img operation.

#### `protected abstract String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `protected int margin()`
- Role: Handles the margin path.
- Description: Implements the margin operation.

#### `protected Text.Forge foundry()`
- Role: Handles the foundry path.
- Description: Implements the foundry operation.

#### `protected boolean valid(String text)`
- Role: Handles the valid path.
- Description: Implements the valid operation.

#### `protected PUtils.Convolution filter()`
- Role: Handles the filter path.
- Description: Implements the filter operation.

#### `protected void drawicon(GOut g)`
- Role: Handles the drawicon path.
- Description: Draws the icon.

#### `protected void drawtext(GOut g)`
- Role: Handles the drawtext path.
- Description: Draws the text.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the SListWidget content.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void invalidate()`
- Role: Handles the invalidate path.
- Description: Implements the invalidate operation.

#### `public FromRes(Coord sz, Indir<Resource> res)`
- Role: Handles the from resource path.
- Description: Implements the from res operation.

#### `public BufferedImage img()`
- Role: Handles the img path.
- Description: Implements the img operation.

#### `public String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public static IconText of(Coord sz, Indir<Resource> res)`
- Role: Builds a SListWidget value from the supplied components.
- Description: Builds a SListWidget value from the supplied components.

#### `public static IconText of(Coord sz, Supplier<BufferedImage> img, Supplier<String> text)`
- Role: Builds a SListWidget value from the supplied components.
- Description: Builds a SListWidget value from the supplied components.