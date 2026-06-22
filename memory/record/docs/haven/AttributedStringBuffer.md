---
source: [AttributedStringBuffer.java](../../../../src/haven/AttributedStringBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# AttributedStringBuffer

Represents the attributed string buffer Haven component.

## Members

### Constants

### Fields

#### `private AttributedString current = new AttributedString("")`
- Role: Implements the current operation.
- Description: Implements the attributed string operation.

### Methods

#### `public static String gettext(AttributedCharacterIterator s)`
- Role: Handles the gettext path.
- Description: Returns the text.

#### `public static void dump(AttributedCharacterIterator s, java.io.PrintStream out)`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public static AttributedString concat(AttributedCharacterIterator... strings)`
- Role: Handles the concat path.
- Description: Implements the concat operation.

#### `public static AttributedString concat(AttributedString... strings)`
- Role: Handles the concat path.
- Description: Implements the concat operation.

#### `public void append(AttributedString string)`
- Role: Handles the append path.
- Description: Implements the append operation.

#### `public void append(String string, Map<? extends Attribute, ?> attrs)`
- Role: Handles the append path.
- Description: Implements the append operation.

#### `public AttributedString result()`
- Role: Handles the result path.
- Description: Implements the result operation.