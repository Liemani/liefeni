# KeyMatch

This file documents the responsibilities and members of `KeyMatch`.

## Meta

- Source: [KeyMatch.java](../../../src/haven/KeyMatch.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Matches key input against bindings.

## Nested Types

### Capture

- Description: TODO

### ModCapture

- Description: TODO

## Members

### Constants

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

- Description: TODO

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

- Description: TODO

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

- Description: TODO

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

- Description: TODO

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

- Description: TODO

#### `public static final KeyMatch nil = new KeyMatch('\0', false, VK_UNDEFINED, false, "None", 0, 0)`

- Description: TODO

### Fields

#### `public char chr`

- Description: TODO

#### `public boolean casematch, extmatch`

- Description: TODO

#### `public boolean casematch, extmatch`

- Description: TODO

#### `public int code`

- Description: TODO

#### `public String keyname`

- Description: TODO

#### `public int modmask, modmatch`

- Description: TODO

#### `public int modmask, modmatch`

- Description: TODO

#### `public KeyMatch key`

- Description: TODO

#### `private UI.Grab grab = null`

- Description: TODO

#### `public final int mask`

- Description: TODO

#### `public int match, nmatch`

- Description: TODO

#### `public int match, nmatch`

- Description: TODO

#### `private UI.Grab grab = null`

- Description: TODO

### Methods

#### `public KeyMatch(char chr, boolean casematch, int code, boolean extmatch, String keyname, int modmask, int modmatch)`

- Description: TODO

#### `public static int mods(KeyEvent ev)`

- Description: TODO

#### `public boolean match(KeyEvent ev, int modign)`

- Description: TODO

#### `public boolean match(KeyEvent ev)`

- Description: TODO

#### `public boolean match(Widget.KbdEvent ev)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `private boolean equals(KeyMatch that)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public static KeyMatch forchar(char chr, int modmask, int modmatch)`

- Description: TODO

#### `public static KeyMatch forchar(char chr, int mods)`

- Description: TODO

#### `public static KeyMatch forcode(int code, int modmask, int modmatch)`

- Description: TODO

#### `public static KeyMatch forcode(int code, int mods)`

- Description: TODO

#### `public static KeyMatch forevent(KeyEvent ev, int modmask)`

- Description: TODO

#### `public String reduce()`

- Description: TODO

#### `public static String reduce(KeyMatch key)`

- Description: TODO

#### `public static KeyMatch restore(String desc)`

- Description: TODO

#### `private static String namefor(KeyMatch key)`

- Description: TODO

#### `public Capture(int w, KeyMatch key)`

- Description: TODO

#### `public void set(KeyMatch key)`

- Description: TODO

#### `public void click()`

- Description: TODO

#### `protected KeyMatch mkmatch(KeyEvent ev)`

- Description: TODO

#### `protected boolean handle(KeyEvent ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public static String modname(int mods)`

- Description: TODO

#### `public ModCapture(int w, int mask, int match)`

- Description: TODO

#### `public ModCapture(int w, int match)`

- Description: TODO

#### `public void set(int match)`

- Description: TODO

#### `public void click()`

- Description: TODO

#### `protected boolean handle(KeyEvent ev)`

- Description: TODO

#### `public boolean keyup(KeyUpEvent ev)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO
