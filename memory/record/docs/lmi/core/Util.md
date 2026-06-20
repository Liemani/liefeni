---
source: [Util.java](../../../../src/lmi/core/Util.java)
created: 2026-06-13
updated: 2026-06-14
---

# Util

Provides shared low-level utility helpers for LMI.

## Nested Types

### MemberType
### MemberType
- Role: Represents the member type helper used by Util.

- Role: Classifies reflected members as fields or methods.
- Description: Describes the nested member type type used by the enclosing class.

## Members

### Constants

### Fields

#### `private static Coord _mapViewCenter`
- Role: Stores the map view center value.
- Description: Backs the cached state for this file.

#### `private static double rttStartTime`
- Role: Stores the rtt start time value.
- Description: Backs the cached state for this file.

#### `public static double srtt`
- Role: Stores the srtt value.
- Description: Backs the cached state for this file.

### Methods

#### `public boolean isField()`
- Role: Checks whether the field.
- Description: Returns a boolean result for the described condition.

#### `boolean isMethod()`
- Role: Checks whether the method.
- Description: Returns a boolean result for the described condition.

#### `static boolean fieldHasModifier(Field field, int modifier)`
- Role: Performs field has modifier.
- Description: Supports the field has modifier operation used by the surrounding class.

#### `static boolean methodHasModifier(Method method, int modifier)`
- Role: Performs method has modifier.
- Description: Supports the method has modifier operation used by the surrounding class.

#### `static boolean isClassType(Object object)`
- Role: Checks whether the class type.
- Description: Returns a boolean result for the described condition.

#### `static <T> boolean contains(T array[], T element)`
- Role: Performs contains.
- Description: Supports the contains operation used by the surrounding class.

#### `private static void printPublicFieldList(Class classObject)`
- Role: Logs the public field list.
- Description: Logs the public field list for diagnostics and debugging.

#### `private static void printPublicMethodList(Class classObject)`
- Role: Logs the public method list.
- Description: Logs the public method list for diagnostics and debugging.

#### `static Object getFieldValueFromObjectByNameAsClass(Object object, String name, Class classObject) throws Exception`
- Role: Returns the field value from object by name as class value.
- Description: Exposes the requested value without mutating state.

#### `static Object getMethodValueFromObjectByNameAsClass(Object object, String name, Class<?> classObject) throws Exception`
- Role: Returns the method value from object by name as class value.
- Description: Exposes the requested value without mutating state.

#### `public static void insertIndent(int indentCount)`
- Role: Performs insert indent.
- Description: Supports the insert indent operation used by the surrounding class.

#### `public static String convertToString(byte[] array, int offset)`
- Role: Performs convert to string.
- Description: Supports the convert to string operation used by the surrounding class.

#### `public static int strlen(byte[] array, int stringOffset)`
- Role: Performs strlen.
- Description: Supports the strlen operation used by the surrounding class.

#### `public static int stoi(String string)`
- Role: Performs stoi.
- Description: Supports the stoi operation used by the surrounding class.

#### `public static boolean nameSet_includesResourcePath(String[] nameSet, String resourcePath)`
- Role: Performs name set includes resource path.
- Description: Supports the name set includes resource path operation used by the surrounding class.

#### `public static void debugPrint(Exception e)`
- Role: Logs the print.
- Description: Logs the print for diagnostics and debugging.

#### `public static void debugPrintHeader(String description)`
- Role: Logs the print header.
- Description: Logs the print header for diagnostics and debugging.

#### `private static void _debugPrintHeader(String description, int depth)`
- Role: Performs  debug print header.
- Description: Supports the debug print header operation used by the surrounding class.

#### `private static void _debugPrint(String description)`
- Role: Performs  debug print.
- Description: Supports the debug print operation used by the surrounding class.

#### `private static String _location(StackTraceElement el)`
- Role: Performs  location.
- Description: Supports the location operation used by the surrounding class.

#### `public static void debugPrint(Object object)`
- Role: Logs the print.
- Description: Logs the print for diagnostics and debugging.

#### `public static void debugPrint()`
- Role: Logs the print.
- Description: Logs the print for diagnostics and debugging.

#### `public static void initMapViewCenterByMapView(haven.MapView mapView)`
- Role: Initializes the map view center by map view.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static Set<String> consoleCommands()`
- Role: Performs console commands.
- Description: Supports the console commands operation used by the surrounding class.

#### `public static void startRtt()`
- Role: Performs start rtt.
- Description: Supports the start rtt operation used by the surrounding class.

#### `public static void updateRtt()`
- Role: Updates the rtt.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static boolean isESC(java.awt.event.KeyEvent keyEvent)`
- Role: Checks whether the esc.
- Description: Returns a boolean result for the described condition.
