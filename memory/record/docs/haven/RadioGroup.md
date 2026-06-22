---
source: [RadioGroup.java](../../../../src/haven/RadioGroup.java)
created: 2026-06-13
updated: 2026-06-14
---

# RadioGroup

Represents the radio group Haven component.

## Nested Types

### RadioButton

- Role: Implements one mutually exclusive radio option.
- Description: CheckBox subclass that updates the group selection and visual label state.

## Members

### Constants

### Fields

#### `private Widget parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `private ArrayList<RadioButton> btns`
- Role: Caches the btns value.
- Description: Caches the `btns` value for reuse.

#### `private HashMap<String, RadioButton> map`
- Role: Caches the map value.
- Description: Caches the `map` value for reuse.

#### `private HashMap<RadioButton, String> rmap`
- Role: Caches the rmap value.
- Description: Caches the `rmap` value for reuse.

#### `private RadioButton checked`
- Role: Caches the checked value.
- Description: Caches the `checked` value for reuse.

### Methods

#### `public RadioGroup(Widget parent)`
- Role: Creates a new RadioGroup instance.
- Description: Constructs the RadioGroup instance from the supplied inputs.

#### `RadioButton(String lbl)`
- Role: Handles the radio button workflow.
- Description: Implements the radio button operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void changed(boolean val)`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public RadioButton add(String lbl, Coord c)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void check(int index)`
- Role: Handles the check path.
- Description: Implements the check operation.

#### `public void check(String lbl)`
- Role: Handles the check path.
- Description: Implements the check operation.

#### `public void check(RadioButton rb)`
- Role: Handles the check path.
- Description: Implements the check operation.

#### `public void hide()`
- Role: Handles the hide path.
- Description: Implements the hide operation.

#### `public void show()`
- Role: Handles the show path.
- Description: Implements the show operation.

#### `public void changed(int btn, String lbl)`
- Role: Handles the changed path.
- Description: Implements the changed operation.