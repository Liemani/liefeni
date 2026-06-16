# AttributedStringBuffer

This file documents the responsibilities and members of `AttributedStringBuffer`.

## Meta

- Source: [AttributedStringBuffer.java](../../../src/haven/AttributedStringBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the attributed string buffer Haven component.

## Members

### Constants

### Fields

#### `private AttributedString current = new AttributedString("")`
- Role: Stores the current value.
- Description: Backs the cached state for this file.

### Methods

#### `public static String gettext(AttributedCharacterIterator s)`
- Role: Performs gettext.
- Description: Supports the gettext operation used by the surrounding class.

#### `public static void dump(AttributedCharacterIterator s, java.io.PrintStream out)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public static AttributedString concat(AttributedCharacterIterator... strings)`
- Role: Performs concat.
- Description: Supports the concat operation used by the surrounding class.

#### `public static AttributedString concat(AttributedString... strings)`
- Role: Performs concat.
- Description: Supports the concat operation used by the surrounding class.

#### `public void append(AttributedString string)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public void append(String string, Map<? extends Attribute, ?> attrs)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public AttributedString result()`
- Role: Performs result.
- Description: Supports the result operation used by the surrounding class.
