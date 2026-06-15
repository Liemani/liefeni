# ACheckBox

This file documents the responsibilities and members of `ACheckBox`.

## Meta

- Source: [ACheckBox.java](../../../src/haven/ACheckBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines a check box widget variant.

## Members

### Constants

### Fields

#### `public boolean a = false`

- Description: TODO

#### `public Supplier<Boolean> state = () -> this.a`

- Description: TODO

#### `public Consumer<Boolean> changed = a ->`

- Description: TODO

#### `public Consumer<Boolean> set = a ->`

- Description: TODO

#### `public Runnable click = () -> set(!state())`

- Description: TODO

### Methods

#### `public ACheckBox()`

- Description: TODO

#### `public ACheckBox(Coord sz)`

- Description: TODO

#### `public ACheckBox state(Supplier<Boolean> state)`

- Description: TODO

#### `public boolean state()`

- Description: TODO

#### `public ACheckBox changed(Consumer<Boolean> changed)`

- Description: TODO

#### `public void changed(boolean val)`

- Description: TODO

#### `public ACheckBox set(Consumer<Boolean> set)`

- Description: TODO

#### `public void set(boolean a)`

- Description: TODO

#### `public ACheckBox click(Runnable click)`

- Description: TODO

#### `public void click()`

- Description: TODO

#### `public boolean gkeytype(GlobKeyEvent ev)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO
