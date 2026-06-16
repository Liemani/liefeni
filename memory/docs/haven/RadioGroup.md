# RadioGroup

This file documents the responsibilities and members of `RadioGroup`.

## Meta

- Source: [RadioGroup.java](../../../src/haven/RadioGroup.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the radio group Haven component.

## Nested Types

### RadioButton

- Role: Represents radio button within RadioGroup.
- Description: Describes the nested radio button type used by the enclosing class.

## Members

### Constants

### Fields

#### `private Widget parent`
- Role: Stores the parent value.
- Description: Backs the cached state for this file.

#### `private ArrayList<RadioButton> btns`
- Role: Caches btns entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private HashMap<String, RadioButton> map`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private HashMap<RadioButton, String> rmap`
- Role: Caches rmap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private RadioButton checked`
- Role: Holds the checked state.
- Description: Backs the cached state for this file.

### Methods

#### `public RadioGroup(Widget parent)`
- Role: Creates a new RadioGroup instance.
- Description: Constructs the instance and initializes its default state.

#### `RadioButton(String lbl)`
- Role: Handles the radio button workflow.
- Description: Supports the radio button operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void changed(boolean val)`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public RadioButton add(String lbl, Coord c)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void check(int index)`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public void check(String lbl)`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public void check(RadioButton rb)`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public void hide()`
- Role: Performs hide.
- Description: Supports the hide operation used by the surrounding class.

#### `public void show()`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public void changed(int btn, String lbl)`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.
