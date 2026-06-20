---
source: [KeyBinding.java](../../../src/haven/KeyBinding.java)
created: 2026-06-13
updated: 2026-06-14
---

# KeyBinding

Represents the key binding Haven component.

## Nested Types

### Bindable

- Role: Represents bindable within KeyBinding.
- Description: Describes the nested bindable type used by the enclosing class.

## Members

### Constants

#### `private static final Map<String, KeyBinding> bindings = new HashMap<>()`
- Role: Defines the shared bindings constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final KeyMatch defkey`
- Role: Holds the defkey state.
- Description: Backs the cached state for this file.

#### `public final int modign`
- Role: Stores the modign value.
- Description: Backs the cached state for this file.

#### `public KeyMatch key`
- Role: Holds the key state.
- Description: Backs the cached state for this file.

### Methods

#### `private KeyBinding(String id, KeyMatch defkey, int modign)`
- Role: Creates a new KeyBinding instance.
- Description: Constructs the instance and initializes its default state.

#### `public void set(KeyMatch key)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public boolean set()`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public KeyMatch key()`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `public static KeyBinding get(String id, KeyMatch defkey, int modign)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static KeyBinding get(String id, KeyMatch defkey)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static KeyBinding get(String id)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public KeyBinding getbinding(Coord cc)`
- Role: Performs getbinding.
- Description: Supports the getbinding operation used by the surrounding class.

#### `public BindingQuery(Coord c)`
- Role: Performs binding query.
- Description: Supports the binding query operation used by the surrounding class.

#### `public BindingQuery(BindingQuery from, Coord c)`
- Role: Performs binding query.
- Description: Supports the binding query operation used by the surrounding class.

#### `public BindingQuery derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public static KeyBinding getbinding(Widget wdg, Coord c)`
- Role: Performs getbinding.
- Description: Supports the getbinding operation used by the surrounding class.
