# RadioGroup

This file documents the responsibilities and members of `RadioGroup`.

## Meta

- Source: [RadioGroup.java](../../../src/haven/RadioGroup.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Manages a radio button group.

## Nested Types

### RadioButton

- Description: TODO

## Members

### Constants

### Fields

#### `private Widget parent`

- Description: TODO

#### `private ArrayList<RadioButton> btns`

- Description: TODO

#### `private HashMap<String, RadioButton> map`

- Description: TODO

#### `private HashMap<RadioButton, String> rmap`

- Description: TODO

#### `private RadioButton checked`

- Description: TODO

### Methods

#### `public RadioGroup(Widget parent)`

- Description: TODO

#### `RadioButton(String lbl)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public void changed(boolean val)`

- Description: TODO

#### `public RadioButton add(String lbl, Coord c)`

- Description: TODO

#### `public void check(int index)`

- Description: TODO

#### `public void check(String lbl)`

- Description: TODO

#### `public void check(RadioButton rb)`

- Description: TODO

#### `public void hide()`

- Description: TODO

#### `public void show()`

- Description: TODO

#### `public void changed(int btn, String lbl)`

- Description: TODO
