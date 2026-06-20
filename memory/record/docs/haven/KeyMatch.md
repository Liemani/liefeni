---
source: [KeyMatch.java](../../../src/haven/KeyMatch.java)
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
- Role: Defines the shared s constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`
- Role: Defines the shared s constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`
- Role: Defines the shared s constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`
- Role: Defines the shared s constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int S = 1, C = 2, M = 4, SUPER = 8, MODS = S | C | M`
- Role: Defines the shared s constant.
- Description: Shared constant used by the rest of the class.

#### `public static final KeyMatch nil = new KeyMatch('\0', false, VK_UNDEFINED, false, "None", 0, 0)`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public char chr`
- Role: Stores the chr value.
- Description: Backs the cached state for this file.

#### `public boolean casematch, extmatch`
- Role: Tracks the extmatch flag.
- Description: Supports the extmatch operation used by the surrounding class.

#### `public boolean casematch, extmatch`
- Role: Tracks the extmatch flag.
- Description: Supports the extmatch operation used by the surrounding class.

#### `public int code`
- Role: Stores the code value.
- Description: Backs the cached state for this file.

#### `public String keyname`
- Role: Stores the keyname value.
- Description: Backs the cached state for this file.

#### `public int modmask, modmatch`
- Role: Stores the modmatch value.
- Description: Backs the cached state for this file.

#### `public int modmask, modmatch`
- Role: Stores the modmatch value.
- Description: Backs the cached state for this file.

#### `public KeyMatch key`
- Role: Holds the key state.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab = null`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

#### `public final int mask`
- Role: Stores the mask value.
- Description: Backs the cached state for this file.

#### `public int match, nmatch`
- Role: Stores the nmatch value.
- Description: Backs the cached state for this file.

#### `public int match, nmatch`
- Role: Stores the nmatch value.
- Description: Backs the cached state for this file.

#### `private UI.Grab grab = null`
- Role: Stores the grab value.
- Description: Backs the cached state for this file.

### Methods

#### `public KeyMatch(char chr, boolean casematch, int code, boolean extmatch, String keyname, int modmask, int modmatch)`
- Role: Creates a new KeyMatch instance.
- Description: Constructs the instance and initializes its default state.

#### `public static int mods(KeyEvent ev)`
- Role: Performs mods.
- Description: Supports the mods operation used by the surrounding class.

#### `public boolean match(KeyEvent ev, int modign)`
- Role: Performs match.
- Description: Supports the match operation used by the surrounding class.

#### `public boolean match(KeyEvent ev)`
- Role: Performs match.
- Description: Supports the match operation used by the surrounding class.

#### `public boolean match(Widget.KbdEvent ev)`
- Role: Performs match.
- Description: Supports the match operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `private boolean equals(KeyMatch that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static KeyMatch forchar(char chr, int modmask, int modmatch)`
- Role: Performs forchar.
- Description: Supports the forchar operation used by the surrounding class.

#### `public static KeyMatch forchar(char chr, int mods)`
- Role: Performs forchar.
- Description: Supports the forchar operation used by the surrounding class.

#### `public static KeyMatch forcode(int code, int modmask, int modmatch)`
- Role: Performs forcode.
- Description: Supports the forcode operation used by the surrounding class.

#### `public static KeyMatch forcode(int code, int mods)`
- Role: Performs forcode.
- Description: Supports the forcode operation used by the surrounding class.

#### `public static KeyMatch forevent(KeyEvent ev, int modmask)`
- Role: Performs forevent.
- Description: Supports the forevent operation used by the surrounding class.

#### `public String reduce()`
- Role: Performs reduce.
- Description: Supports the reduce operation used by the surrounding class.

#### `public static String reduce(KeyMatch key)`
- Role: Performs reduce.
- Description: Supports the reduce operation used by the surrounding class.

#### `public static KeyMatch restore(String desc)`
- Role: Performs restore.
- Description: Supports the restore operation used by the surrounding class.

#### `private static String namefor(KeyMatch key)`
- Role: Performs namefor.
- Description: Supports the namefor operation used by the surrounding class.

#### `public Capture(int w, KeyMatch key)`
- Role: Performs capture.
- Description: Supports the capture operation used by the surrounding class.

#### `public void set(KeyMatch key)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `protected KeyMatch mkmatch(KeyEvent ev)`
- Role: Performs mkmatch.
- Description: Supports the mkmatch operation used by the surrounding class.

#### `protected boolean handle(KeyEvent ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public static String modname(int mods)`
- Role: Performs modname.
- Description: Supports the modname operation used by the surrounding class.

#### `public ModCapture(int w, int mask, int match)`
- Role: Performs mod capture.
- Description: Supports the mod capture operation used by the surrounding class.

#### `public ModCapture(int w, int match)`
- Role: Performs mod capture.
- Description: Supports the mod capture operation used by the surrounding class.

#### `public void set(int match)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `protected boolean handle(KeyEvent ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public boolean keyup(KeyUpEvent ev)`
- Role: Performs keyup.
- Description: Supports the keyup operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.
