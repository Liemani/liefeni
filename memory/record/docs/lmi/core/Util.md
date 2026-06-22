---
source: [Util.java](../../../../../src/lmi/core/Util.java)
created: 2026-06-13
updated: 2026-06-14
---

# Util

Provides shared low-level utility helpers for LMI.

## Nested Types

### MemberType
Classifies reflected members as fields or methods.

#### Members

##### Methods

#### `public boolean isField()`
- Role: Checks whether the field.
- Description: Returns true when this enum value is `FIELD`.

#### `boolean isMethod()`
- Role: Checks whether the method.
- Description: Returns true when this enum value is `METHOD`.

## Members

### Constants

### Fields

#### `private static Coord _mapViewCenter`
- Role: Caches the map view center value.
- Description: Caches the `_mapViewCenter` value for reuse.

#### `private static double rttStartTime`
- Role: Caches the rtt start time value.
- Description: Caches the `rttStartTime` value for reuse.

#### `public static double srtt`
- Role: Caches the srtt value.
- Description: Caches the `srtt` value for reuse.

### Methods

#### `public boolean isField()`
- Role: Checks whether the field.
- Description: Returns true when this enum value is `FIELD`.

#### `boolean isMethod()`
- Role: Checks whether the method.
- Description: Returns true when this enum value is `METHOD`.

#### `static boolean fieldHasModifier(Field field, int modifier)`
- Role: Checks a field modifier.
- Description: Returns whether the reflected field contains the requested modifier bit.

#### `static boolean methodHasModifier(Method method, int modifier)`
- Role: Checks a method modifier.
- Description: Returns whether the reflected method contains the requested modifier bit.

#### `static boolean isClassType(Object object)`
- Role: Checks whether the class type.
- Description: Returns true when the object is a `Class` instance.

#### `static <T> boolean contains(T array[], T element)`
- Role: Checks whether the array contains an element.
- Description: Compares array entries by identity and stops on the first match.

#### `private static void printPublicFieldList(Class classObject)`
- Role: Prints public fields.
- Description: Prints every public field declared on the class and its superclasses.

#### `private static void printPublicMethodList(Class classObject)`
- Role: Prints public methods.
- Description: Prints every public zero-argument method declared on the class and its superclasses.

#### `static Object getFieldValueFromObjectByNameAsClass(Object object, String name, Class classObject) throws Exception`
- Role: Reads a reflected field value.
- Description: Walks the class hierarchy until it finds the named field and reads its value.

#### `static Object getMethodValueFromObjectByNameAsClass(Object object, String name, Class<?> classObject) throws Exception`
- Role: Reads a reflected method value.
- Description: Walks the class hierarchy until it finds the named zero-arg method and invokes it on the object.

#### `public static void insertIndent(int indentCount)`
- Role: Writes indentation.
- Description: Prints the requested number of two-space indents.

#### `public static String convertToString(byte[] array, int offset)`
- Role: Converts a byte array slice into a string.
- Description: Decodes a zero-terminated byte string starting at the given offset.

#### `public static int strlen(byte[] array, int stringOffset)`
- Role: Measures string length.
- Description: Counts bytes until the first zero terminator from the given offset.

#### `public static int stoi(String string)`
- Role: Parses a decimal string.
- Description: Parses an integer from a string.

#### `public static boolean nameSet_includesResourcePath(String[] nameSet, String resourcePath)`
- Role: Checks whether a resource path is present.
- Description: Returns true when the resource path ends with any supplied name.

#### `public static void debugPrint(Exception e)`
- Role: Prints a debug exception.
- Description: Prints the exception, its stack trace, and the call site that triggered it.

#### `public static void debugPrintHeader(String description)`
- Role: Prints a debug header.
- Description: Prints a one-line debug header that includes the current call site.

#### `private static void _debugPrintHeader(String description, int depth)`
- Role: Prints an internal debug header.
- Description: Formats a debug header using the requested stack depth offset.

#### `private static void _debugPrint(String description)`
- Role: Prints an internal debug line.
- Description: Prints the description and then emits a stack trace for diagnostics.

#### `private static String _location(StackTraceElement el)`
- Role: Formats a stack-trace location.
- Description: Formats class and method data into a location string.

#### `public static void debugPrint(Object object)`
- Role: Prints a debug value.
- Description: Prints the object text together with a diagnostic stack trace.

#### `public static void debugPrint()`
- Role: Prints a blank debug line.
- Description: Prints a blank diagnostic line for the current call site.

#### `public static void initMapViewCenterByMapView(haven.MapView mapView)`
- Role: Stores the map view center.
- Description: Caches the current MapView center coordinate for later debug use.

#### `public static Set<String> consoleCommands()`
- Role: Returns console commands.
- Description: Returns the command names currently exposed by the UI console.

#### `public static void startRtt()`
- Role: Starts RTT measurement.
- Description: Captures the start time used for RTT sampling.

#### `public static void updateRtt()`
- Role: Updates RTT.
- Description: Updates the smoothed RTT estimate from the most recent sample.

#### `public static boolean isESC(java.awt.event.KeyEvent keyEvent)`
- Role: Checks whether the ESC key was pressed.
- Description: Returns whether the key event corresponds to Escape.