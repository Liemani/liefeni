---
source: [Progress.java](../../../../src/haven/Progress.java)
created: 2026-06-13
updated: 2026-06-14
---

# Progress

Represents the progress Haven component.

## Nested Types

### $_

- Role: Registers the progress widget resource.
- Description: Factory that creates a progress widget from its UI arguments.

## Members

### Constants

#### `public static final int defh = UI.scale(20)`
- Role: Implements the defh operation.
- Description: Implements the scale operation.
- Value: `UI.scale(20)`

#### `private static final int m = UI.scale(1)`
- Role: Implements the m operation.
- Description: Implements the scale operation.
- Value: `UI.scale(1)`

### Fields

#### `public float a`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `private Supplier<Float> val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `private Function<? super Float, ?> text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `private Function<?, String> fmt`
- Role: Caches the fmt value.
- Description: Caches the `fmt` value for reuse.

#### `private Function<?, Color> col`
- Role: Caches the col value.
- Description: Caches the `col` value for reuse.

#### `private Tex rt = null`
- Role: Caches the rt value.
- Description: Caches the `rt` value for reuse.

#### `private Object pt`
- Role: Caches the pt value.
- Description: Caches the `pt` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Progress(Coord sz)`
- Role: Creates a new Progress instance.
- Description: Constructs the Progress instance from the supplied inputs.

#### `public Progress(int w)`
- Role: Creates a new Progress instance.
- Description: Constructs the Progress instance from the supplied inputs.

#### `public Progress val(Supplier<Float> val)`
- Role: Handles the val path.
- Description: Implements the val operation.

#### `public <V> Progress text(Function<? super Float, V> text, Function<? super V, String> fmt, Function<? super V, Color> col)`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public <V> Progress text(Supplier<V> text, Function<? super V, String> fmt, Function<? super V, Color> col)`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public <V> Progress text(Function<? super Float, V> text, Function<? super V, String> fmt)`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public <V> Progress text(Supplier<V> text, Function<? super V, String> fmt)`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public Progress text(Function<? super Float, ?> text)`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public Progress text(Supplier<?> text)`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public Progress percent()`
- Role: Handles the percent path.
- Description: Implements the percent operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Progress content.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.