# GLException

This file documents the responsibilities and members of `GLException`.

## Meta

- Source: [GLException.java](../../../../../src/haven/render/gl/GLException.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a GL exception.

## Nested Types

### GLInvalidEnumException

- Description: TODO

### GLInvalidOperationException

- Description: TODO

### GLInvalidValueException

- Description: TODO

### GLOutOfMemoryException

- Description: TODO

## Members

### Constants

### Fields

#### `public int code`

- Description: TODO

#### `public String str`

- Description: TODO

#### `public String memstats = null`

- Description: TODO

### Methods

#### `public GLException(int code)`

- Description: TODO

#### `public static String constname(Class<?> cl, int val)`

- Description: TODO

#### `public static String constname(int val)`

- Description: TODO

#### `public GLInvalidEnumException()`

- Description: TODO

#### `public GLInvalidValueException()`

- Description: TODO

#### `public GLInvalidOperationException()`

- Description: TODO

#### `public GLOutOfMemoryException()`

- Description: TODO

#### `public void initenv(GLEnvironment env)`

- Description: TODO

#### `public static GLException glexcfor(int code)`

- Description: TODO

#### `public static void checkfor(GL gl, Throwable cause, GLEnvironment env)`

- Description: TODO

#### `public static void checkfor(GL gl, GLEnvironment env)`

- Description: TODO

#### `public void initenv(GLEnvironment env)`

- Description: TODO
