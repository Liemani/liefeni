# Util

This file documents the responsibilities and members of `Util`.

## Meta

- Source: [Util.java](../../../../src/lmi/core/Util.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Collects shared helper functions.

## Nested Types

### MemberType

- Description: TODO

## Members

### Constants

### Fields

#### `private static Coord _mapViewCenter`

- Description: TODO

#### `private static double rttStartTime`

- Description: TODO

#### `public static double srtt`

- Description: TODO

### Methods

#### `public boolean isField()`

- Description: TODO

#### `boolean isMethod()`

- Description: TODO

#### `static boolean fieldHasModifier(Field field, int modifier)`

- Description: TODO

#### `static boolean methodHasModifier(Method method, int modifier)`

- Description: TODO

#### `static boolean isClassType(Object object)`

- Description: TODO

#### `static <T> boolean contains(T array[], T element)`

- Description: TODO

#### `private static void printPublicFieldList(Class classObject)`

- Description: TODO

#### `private static void printPublicMethodList(Class classObject)`

- Description: TODO

#### `static Object getFieldValueFromObjectByNameAsClass(Object object, String name, Class classObject) throws Exception`

- Description: TODO

#### `static Object getMethodValueFromObjectByNameAsClass(Object object, String name, Class<?> classObject) throws Exception`

- Description: TODO

#### `public static void insertIndent(int indentCount)`

- Description: TODO

#### `public static String convertToString(byte[] array, int offset)`

- Description: TODO

#### `public static int strlen(byte[] array, int stringOffset)`

- Description: TODO

#### `public static int stoi(String string)`

- Description: TODO

#### `public static boolean nameSet_includesResourcePath(String[] nameSet, String resourcePath)`

- Description: TODO

#### `public static void debugPrint(Exception e)`

- Description: TODO

#### `public static void debugPrintHeader(String description)`

- Description: TODO

#### `private static void _debugPrintHeader(String description, int depth)`

- Description: TODO

#### `private static void _debugPrint(String description)`

- Description: TODO

#### `private static String _location(StackTraceElement el)`

- Description: TODO

#### `public static void debugPrint(Object object)`

- Description: TODO

#### `public static void debugPrint()`

- Description: TODO

#### `public static void initMapViewCenterByMapView(haven.MapView mapView)`

- Description: TODO

#### `public static Set<String> consoleCommands()`

- Description: TODO

#### `public static void startRtt()`

- Description: TODO

#### `public static void updateRtt()`

- Description: TODO

#### `public static boolean isESC(java.awt.event.KeyEvent keyEvent)`

- Description: TODO
