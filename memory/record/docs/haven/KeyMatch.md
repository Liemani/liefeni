---
source: [KeyMatch.java](../../../../src/haven/KeyMatch.java)
created: 2026-06-13
updated: 2026-06-14
---

# KeyMatch

Represents the key match Haven component.

## Nested Types

### Capture

- Role: Represents capture within KeyMatch.
- Description: Describes the nested capture type used by the enclosing class.

### ModCapture

- Role: Represents mod capture within KeyMatch.
- Description: Describes the nested mod capture type used by the enclosing class.

## Members

### Constants

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`
- Role: Caches the s value.
- Description: Caches the `S` value for reuse.
- Value: `1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`
- Role: Caches the s value.
- Description: Caches the `S` value for reuse.
- Value: `1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`
- Role: Caches the s value.
- Description: Caches the `S` value for reuse.
- Value: `1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`
- Role: Caches the s value.
- Description: Caches the `S` value for reuse.
- Value: `1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`
- Role: Caches the s value.
- Description: Caches the `S` value for reuse.
- Value: `1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`

#### `public static final KeyMatch nil = new KeyMatch('\0', false, VK_UNDEFINED, false, "None", 0, 0)`
- Role: Implements the nil operation.
- Description: Implements the key match operation.
- Value: `new KeyMatch('\0', false, VK_UNDEFINED, false, "None", 0, 0)`

### Fields

#### `public char chr`
- Role: Caches the chr value.
- Description: Caches the `chr` value for reuse.

#### `public boolean casematch, extmatch`
- Role: Tracks the extmatch flag.
- Description: Caches the `extmatch` value for reuse.

#### `public boolean casematch, extmatch`
- Role: Tracks the extmatch flag.
- Description: Caches the `extmatch` value for reuse.

#### `public int code`
- Role: Caches the code value.
- Description: Caches the `code` value for reuse.

#### `public String keyname`
- Role: Caches the keyname value.
- Description: Caches the `keyname` value for reuse.

#### `public int modmask, modmatch`
- Role: Caches the modmatch value.
- Description: Caches the `modmatch` value for reuse.

#### `public int modmask, modmatch`
- Role: Caches the modmatch value.
- Description: Caches the `modmatch` value for reuse.

#### `public KeyMatch key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `private UI.Grab grab = null`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

#### `public final int mask`
- Role: Caches the mask value.
- Description: Caches the `mask` value for reuse.

#### `public int match, nmatch`
- Role: Caches the nmatch value.
- Description: Caches the `nmatch` value for reuse.

#### `public int match, nmatch`
- Role: Caches the nmatch value.
- Description: Caches the `nmatch` value for reuse.

#### `private UI.Grab grab = null`
- Role: Caches the grab value.
- Description: Caches the `grab` value for reuse.

### Methods

#### `public KeyMatch(char chr, boolean casematch, int code, boolean extmatch, String keyname, int modmask, int modmatch)`
- Role: Creates a new KeyMatch instance.
- Description: Constructs the KeyMatch instance from the supplied inputs.

#### `public static int mods(KeyEvent ev)`
- Role: Handles the mods path.
- Description: Implements the mods operation.

#### `public boolean match(KeyEvent ev, int modign)`
- Role: Handles the match path.
- Description: Implements the match operation.

#### `public boolean match(KeyEvent ev)`
- Role: Handles the match path.
- Description: Implements the match operation.

#### `public boolean match(Widget.KbdEvent ev)`
- Role: Handles the match path.
- Description: Implements the match operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `private boolean equals(KeyMatch that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static KeyMatch forchar(char chr, int modmask, int modmatch)`
- Role: Handles the forchar path.
- Description: Implements the forchar operation.

#### `public static KeyMatch forchar(char chr, int mods)`
- Role: Handles the forchar path.
- Description: Implements the forchar operation.

#### `public static KeyMatch forcode(int code, int modmask, int modmatch)`
- Role: Handles the forcode path.
- Description: Implements the forcode operation.

#### `public static KeyMatch forcode(int code, int mods)`
- Role: Handles the forcode path.
- Description: Implements the forcode operation.

#### `public static KeyMatch forevent(KeyEvent ev, int modmask)`
- Role: Handles the forevent path.
- Description: Implements the forevent operation.

#### `public String reduce()`
- Role: Handles the reduce path.
- Description: Implements the reduce operation.

#### `public static String reduce(KeyMatch key)`
- Role: Handles the reduce path.
- Description: Implements the reduce operation.

#### `public static KeyMatch restore(String desc)`
- Role: Handles the restore path.
- Description: Implements the restore operation.

#### `private static String namefor(KeyMatch key)`
- Role: Handles the namefor path.
- Description: Implements the namefor operation.

#### `public Capture(int w, KeyMatch key)`
- Role: Handles the capture path.
- Description: Implements the capture operation.

#### `public void set(KeyMatch key)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void click()`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `protected KeyMatch mkmatch(KeyEvent ev)`
- Role: Handles the mkmatch path.
- Description: Implements the mkmatch operation.

#### `protected boolean handle(KeyEvent ev)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public static String modname(int mods)`
- Role: Handles the modname path.
- Description: Implements the modname operation.

#### `public ModCapture(int w, int mask, int match)`
- Role: Handles the mod capture path.
- Description: Implements the mod capture operation.

#### `public ModCapture(int w, int match)`
- Role: Handles the mod capture path.
- Description: Implements the mod capture operation.

#### `public void set(int match)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void click()`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `protected boolean handle(KeyEvent ev)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public boolean keyup(KeyUpEvent ev)`
- Role: Handles the keyup path.
- Description: Implements the keyup operation.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.