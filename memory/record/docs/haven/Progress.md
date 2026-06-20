---
source: [Progress.java](../../../src/haven/Progress.java)
created: 2026-06-13
updated: 2026-06-14
---

# Progress

Represents the progress Haven component.

## Nested Types

### $_

- Role: Represents $ within Progress.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final int defh = UI.scale(20)`
- Role: Defines the shared defh constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int m = UI.scale(1)`
- Role: Defines the shared m constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public float a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `private Supplier<Float> val`
- Role: Stores the val value.
- Description: Backs the cached state for this file.

#### `private Function<? super Float, ?> text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `private Function<?, String> fmt`
- Role: Stores the fmt value.
- Description: Backs the cached state for this file.

#### `private Function<?, Color> col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

#### `private Tex rt = null`
- Role: Stores the rt value.
- Description: Backs the cached state for this file.

#### `private Object pt`
- Role: Holds the pt state.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Progress(Coord sz)`
- Role: Creates a new Progress instance.
- Description: Constructs the instance and initializes its default state.

#### `public Progress(int w)`
- Role: Creates a new Progress instance.
- Description: Constructs the instance and initializes its default state.

#### `public Progress val(Supplier<Float> val)`
- Role: Performs val.
- Description: Supports the val operation used by the surrounding class.

#### `public <V> Progress text(Function<? super Float, V> text, Function<? super V, String> fmt, Function<? super V, Color> col)`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public <V> Progress text(Supplier<V> text, Function<? super V, String> fmt, Function<? super V, Color> col)`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public <V> Progress text(Function<? super Float, V> text, Function<? super V, String> fmt)`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public <V> Progress text(Supplier<V> text, Function<? super V, String> fmt)`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public Progress text(Function<? super Float, ?> text)`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public Progress text(Supplier<?> text)`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public Progress percent()`
- Role: Performs percent.
- Description: Supports the percent operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
