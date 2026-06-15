# Progress

This file documents the responsibilities and members of `Progress`.

## Meta

- Source: [Progress.java](../../../src/haven/Progress.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays a progress widget.

## Nested Types

### $_

- Description: TODO

## Members

### Constants

#### `public static final int defh = UI.scale(20)`

- Description: TODO

#### `private static final int m = UI.scale(1)`

- Description: TODO

### Fields

#### `public float a`

- Description: TODO

#### `private Supplier<Float> val`

- Description: TODO

#### `private Function<? super Float, ?> text`

- Description: TODO

#### `private Function<?, String> fmt`

- Description: TODO

#### `private Function<?, Color> col`

- Description: TODO

#### `private Tex rt = null`

- Description: TODO

#### `private Object pt`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Progress(Coord sz)`

- Description: TODO

#### `public Progress(int w)`

- Description: TODO

#### `public Progress val(Supplier<Float> val)`

- Description: TODO

#### `public <V> Progress text(Function<? super Float, V> text, Function<? super V, String> fmt, Function<? super V, Color> col)`

- Description: TODO

#### `public <V> Progress text(Supplier<V> text, Function<? super V, String> fmt, Function<? super V, Color> col)`

- Description: TODO

#### `public <V> Progress text(Function<? super Float, V> text, Function<? super V, String> fmt)`

- Description: TODO

#### `public <V> Progress text(Supplier<V> text, Function<? super V, String> fmt)`

- Description: TODO

#### `public Progress text(Function<? super Float, ?> text)`

- Description: TODO

#### `public Progress text(Supplier<?> text)`

- Description: TODO

#### `public Progress percent()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO
