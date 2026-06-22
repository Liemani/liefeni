---
source: [KeyBinding.java](../../../../src/haven/KeyBinding.java)
created: 2026-06-13
updated: 2026-06-14
---

# KeyBinding

Represents the key binding Haven component.

## Nested Types

### Bindable

- Role: Marks a widget or object that can expose key bindings.
- Description: Lets the key-binding system query or derive bindings from UI elements.

## Members

### Constants

#### `private static final Map<String, KeyBinding> bindings = new HashMap<>()`
- Role: Implements the bindings operation.
- Description: Implements the private static final map<string, key binding> bindings = new hash map<>() operation.
- Value: `new HashMap<>()`

### Fields

#### `public final String id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final KeyMatch defkey`
- Role: Caches the defkey value.
- Description: Caches the `defkey` value for reuse.

#### `public final int modign`
- Role: Caches the modign value.
- Description: Caches the `modign` value for reuse.

#### `public KeyMatch key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

### Methods

#### `private KeyBinding(String id, KeyMatch defkey, int modign)`
- Role: Creates a new KeyBinding instance.
- Description: Constructs the KeyBinding instance from the supplied inputs.

#### `public void set(KeyMatch key)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public boolean set()`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public KeyMatch key()`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `public static KeyBinding get(String id, KeyMatch defkey, int modign)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public static KeyBinding get(String id, KeyMatch defkey)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public static KeyBinding get(String id)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public KeyBinding getbinding(Coord cc)`
- Role: Handles the getbinding path.
- Description: Returns the binding.

#### `public BindingQuery(Coord c)`
- Role: Handles the binding query path.
- Description: Implements the binding query operation.

#### `public BindingQuery(BindingQuery from, Coord c)`
- Role: Handles the binding query path.
- Description: Implements the binding query operation.

#### `public BindingQuery derive(Coord c)`
- Role: Handles the derive path.
- Description: Implements the derive operation.

#### `protected boolean shandle(Widget w)`
- Role: Handles the shandle path.
- Description: Lets a matching widget consume the event.

#### `public static KeyBinding getbinding(Widget wdg, Coord c)`
- Role: Handles the getbinding path.
- Description: Returns the binding.