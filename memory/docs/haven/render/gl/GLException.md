# GLException

This file documents the responsibilities and members of `GLException`.

## Meta

- Source: [GLException.java](../../../../../src/haven/render/gl/GLException.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for glexception.

## Nested Types

### GLInvalidEnumException

- Role: Represents glinvalid enum exception within GLException.
- Description: Describes the nested glinvalid enum exception type used by the enclosing class.

### GLInvalidOperationException

- Role: Represents glinvalid operation exception within GLException.
- Description: Describes the nested glinvalid operation exception type used by the enclosing class.

### GLInvalidValueException

- Role: Represents glinvalid value exception within GLException.
- Description: Describes the nested glinvalid value exception type used by the enclosing class.

### GLOutOfMemoryException

- Role: Represents glout of memory exception within GLException.
- Description: Describes the nested glout of memory exception type used by the enclosing class.

## Members

### Constants

### Fields

#### `public int code`
- Role: Stores the code value.
- Description: Backs the cached state for this file.

#### `public String str`
- Role: Stores the str value.
- Description: Backs the cached state for this file.

#### `public String memstats = null`
- Role: Stores the memstats value.
- Description: Backs the cached state for this file.

### Methods

#### `public GLException(int code)`
- Role: Creates a new GLException instance.
- Description: Constructs the instance and initializes its default state.

#### `public static String constname(Class<?> cl, int val)`
- Role: Performs constname.
- Description: Supports the constname operation used by the surrounding class.

#### `public static String constname(int val)`
- Role: Performs constname.
- Description: Supports the constname operation used by the surrounding class.

#### `public GLInvalidEnumException()`
- Role: Performs glinvalid enum exception.
- Description: Supports the glinvalid enum exception operation used by the surrounding class.

#### `public GLInvalidValueException()`
- Role: Performs glinvalid value exception.
- Description: Supports the glinvalid value exception operation used by the surrounding class.

#### `public GLInvalidOperationException()`
- Role: Performs glinvalid operation exception.
- Description: Supports the glinvalid operation exception operation used by the surrounding class.

#### `public GLOutOfMemoryException()`
- Role: Performs glout of memory exception.
- Description: Supports the glout of memory exception operation used by the surrounding class.

#### `public void initenv(GLEnvironment env)`
- Role: Performs initenv.
- Description: Supports the initenv operation used by the surrounding class.

#### `public static GLException glexcfor(int code)`
- Role: Performs glexcfor.
- Description: Supports the glexcfor operation used by the surrounding class.

#### `public static void checkfor(GL gl, Throwable cause, GLEnvironment env)`
- Role: Performs checkfor.
- Description: Supports the checkfor operation used by the surrounding class.

#### `public static void checkfor(GL gl, GLEnvironment env)`
- Role: Performs checkfor.
- Description: Supports the checkfor operation used by the surrounding class.

#### `public void initenv(GLEnvironment env)`
- Role: Performs initenv.
- Description: Supports the initenv operation used by the surrounding class.
