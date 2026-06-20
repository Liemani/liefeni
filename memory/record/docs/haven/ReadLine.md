---
source: [ReadLine.java](../../../src/haven/ReadLine.java)
created: 2026-06-13
updated: 2026-06-14
---

# ReadLine

Represents the read line Haven component.

## Nested Types

### UndoState

- Role: Represents undo state within ReadLine.
- Description: Describes the nested undo state type used by the enclosing class.

## Members

### Constants

#### `public static final Owner nil = new Owner()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Owner owner`
- Role: Holds the owner state.
- Description: Backs the cached state for this file.

#### `public char[] buf = new char[16]`
- Role: Stores the buf value.
- Description: Backs the cached state for this file.

#### `public int length = 0`
- Role: Stores the length value.
- Description: Backs the cached state for this file.

#### `public int point = 0`
- Role: Stores the point value.
- Description: Backs the cached state for this file.

#### `public int seq = 0`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `public double mtime`
- Role: Stores the mtime value.
- Description: Backs the cached state for this file.

#### `private Text tcache = null`
- Role: Stores the tcache value.
- Description: Backs the cached state for this file.

#### `public int mark = -1`
- Role: Stores the mark value.
- Description: Backs the cached state for this file.

#### `private int mark, yankpos, undopos`
- Role: Stores the undopos value.
- Description: Backs the cached state for this file.

#### `private int mark, yankpos, undopos`
- Role: Stores the undopos value.
- Description: Backs the cached state for this file.

#### `private int mark, yankpos, undopos`
- Role: Stores the undopos value.
- Description: Backs the cached state for this file.

#### `private boolean tmm`
- Role: Tracks the tmm flag.
- Description: Supports the tmm operation used by the surrounding class.

#### `private String last = ""`
- Role: Stores the last value.
- Description: Backs the cached state for this file.

#### `private List<String> yanklist = new ArrayList<String>()`
- Role: Caches yanklist entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<UndoState> undolist = new ArrayList<UndoState>()`
- Role: Caches undolist entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private String line`
- Role: Stores the line value.
- Description: Backs the cached state for this file.

#### `private int point`
- Role: Stores the point value.
- Description: Backs the cached state for this file.

#### `private String lastsel = "", lastclip = ""`
- Role: Stores the lastsel value.
- Description: Backs the cached state for this file.

#### `private String lastsel = "", lastclip = ""`
- Role: Stores the lastsel value.
- Description: Backs the cached state for this file.

### Methods

#### `public char[] buffer()`
- Role: Performs buffer.
- Description: Supports the buffer operation used by the surrounding class.

#### `public int length()`
- Role: Performs length.
- Description: Supports the length operation used by the surrounding class.

#### `public int point()`
- Role: Performs point.
- Description: Supports the point operation used by the surrounding class.

#### `public void point(int p)`
- Role: Performs point.
- Description: Supports the point operation used by the surrounding class.

#### `public int mark()`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `public void mark(int m)`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `public void setline(String line)`
- Role: Performs setline.
- Description: Supports the setline operation used by the surrounding class.

#### `public boolean key(char c, KeyEvent ev, int mod)`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `public double mtime()`
- Role: Performs mtime.
- Description: Supports the mtime operation used by the surrounding class.

#### `public default boolean empty()`
- Role: Performs empty.
- Description: Supports the empty operation used by the surrounding class.

#### `public default String line()`
- Role: Performs line.
- Description: Supports the line operation used by the surrounding class.

#### `public default Text render(Text.Foundry f)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public default void select(int from, int to)`
- Role: Performs select.
- Description: Supports the select operation used by the surrounding class.

#### `public default boolean lneq(String ln)`
- Role: Performs lneq.
- Description: Supports the lneq operation used by the surrounding class.

#### `public default boolean key(KeyEvent ev)`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `public default void changed(ReadLine buf)`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public default void done(ReadLine buf)`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public Base(Owner owner, String init)`
- Role: Performs base.
- Description: Supports the base operation used by the surrounding class.

#### `public String line(int off, int len)`
- Role: Performs line.
- Description: Supports the line operation used by the surrounding class.

#### `public void line(String ln)`
- Role: Performs line.
- Description: Supports the line operation used by the surrounding class.

#### `public char[] remove(int off, int len)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public char[] ensure(int off, int len)`
- Role: Ensures the target value exists.
- Description: Supports the ensure operation used by the surrounding class.

#### `public static boolean wordchar(char c)`
- Role: Performs wordchar.
- Description: Supports the wordchar operation used by the surrounding class.

#### `public int wordstart(int from)`
- Role: Performs wordstart.
- Description: Supports the wordstart operation used by the surrounding class.

#### `public int wordend(int from)`
- Role: Performs wordend.
- Description: Supports the wordend operation used by the surrounding class.

#### `protected abstract boolean key2(char c, KeyEvent ev, int mod)`
- Role: Performs key2.
- Description: Supports the key2 operation used by the surrounding class.

#### `public boolean key(char c, KeyEvent ev, int mod)`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `public char[] buffer()`
- Role: Performs buffer.
- Description: Supports the buffer operation used by the surrounding class.

#### `public int length()`
- Role: Performs length.
- Description: Supports the length operation used by the surrounding class.

#### `public int point()`
- Role: Performs point.
- Description: Supports the point operation used by the surrounding class.

#### `public void point(int p)`
- Role: Performs point.
- Description: Supports the point operation used by the surrounding class.

#### `public double mtime()`
- Role: Performs mtime.
- Description: Supports the mtime operation used by the surrounding class.

#### `public void setline(String line)`
- Role: Performs setline.
- Description: Supports the setline operation used by the surrounding class.

#### `public Text render(Text.Foundry f)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public PCLine(Owner owner, String init)`
- Role: Performs pcline.
- Description: Supports the pcline operation used by the surrounding class.

#### `public void clipset(Clipboard c)`
- Role: Performs clipset.
- Description: Supports the clipset operation used by the surrounding class.

#### `public String cliptext()`
- Role: Performs cliptext.
- Description: Supports the cliptext operation used by the surrounding class.

#### `public int mark()`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `public void mark(int mark)`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `public void setline(String line)`
- Role: Performs setline.
- Description: Supports the setline operation used by the surrounding class.

#### `public void rmsel()`
- Role: Performs rmsel.
- Description: Supports the rmsel operation used by the surrounding class.

#### `private void cksel()`
- Role: Performs cksel.
- Description: Supports the cksel operation used by the surrounding class.

#### `public boolean key2(char c, KeyEvent ev, int mod)`
- Role: Performs key2.
- Description: Supports the key2 operation used by the surrounding class.

#### `public EmacsLine(Owner owner, String init)`
- Role: Performs emacs line.
- Description: Supports the emacs line operation used by the surrounding class.

#### `private UndoState()`
- Role: Performs undo state.
- Description: Supports the undo state operation used by the surrounding class.

#### `private void save()`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `private void mode(String mode)`
- Role: Performs mode.
- Description: Supports the mode operation used by the surrounding class.

#### `private void killclipboard()`
- Role: Performs killclipboard.
- Description: Supports the killclipboard operation used by the surrounding class.

#### `private void kill(String text)`
- Role: Performs kill.
- Description: Supports the kill operation used by the surrounding class.

#### `private String cliptext(Clipboard c)`
- Role: Performs cliptext.
- Description: Supports the cliptext operation used by the surrounding class.

#### `public int mark()`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `public void mark(int m)`
- Role: Performs mark.
- Description: Supports the mark operation used by the surrounding class.

#### `public void rmsel()`
- Role: Performs rmsel.
- Description: Supports the rmsel operation used by the surrounding class.

#### `public boolean key2(char c, KeyEvent ev, int mod)`
- Role: Performs key2.
- Description: Supports the key2 operation used by the surrounding class.

#### `public static ReadLine make(Owner owner, String init)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.
