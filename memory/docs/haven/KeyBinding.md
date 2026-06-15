# KeyBinding

This file documents the responsibilities and members of `KeyBinding`.

## Meta

- Source: [KeyBinding.java](../../../src/haven/KeyBinding.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines a key binding.

## Nested Types

### Bindable

- Description: TODO

## Members

### Constants

#### `private static final Map<String, KeyBinding> bindings = new HashMap<>()`

- Description: TODO

### Fields

#### `public final String id`

- Description: TODO

#### `public final KeyMatch defkey`

- Description: TODO

#### `public final int modign`

- Description: TODO

#### `public KeyMatch key`

- Description: TODO

### Methods

#### `private KeyBinding(String id, KeyMatch defkey, int modign)`

- Description: TODO

#### `public void set(KeyMatch key)`

- Description: TODO

#### `public boolean set()`

- Description: TODO

#### `public KeyMatch key()`

- Description: TODO

#### `public static KeyBinding get(String id, KeyMatch defkey, int modign)`

- Description: TODO

#### `public static KeyBinding get(String id, KeyMatch defkey)`

- Description: TODO

#### `public static KeyBinding get(String id)`

- Description: TODO

#### `public KeyBinding getbinding(Coord cc)`

- Description: TODO

#### `public BindingQuery(Coord c)`

- Description: TODO

#### `public BindingQuery(BindingQuery from, Coord c)`

- Description: TODO

#### `public BindingQuery derive(Coord c)`

- Description: TODO

#### `protected boolean shandle(Widget w)`

- Description: TODO

#### `public static KeyBinding getbinding(Widget wdg, Coord c)`

- Description: TODO
