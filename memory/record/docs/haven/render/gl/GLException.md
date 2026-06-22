---
source: [GLException.java](../../../../../../src/haven/render/gl/GLException.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLException

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
- Role: Caches the code value.
- Description: Caches the `code` value for reuse.

#### `public String str`
- Role: Caches the str value.
- Description: Caches the `str` value for reuse.

#### `public String memstats = null`
- Role: Caches the memstats value.
- Description: Caches the `memstats` value for reuse.

### Methods

#### `public GLException(int code)`
- Role: Creates a new GLException instance.
- Description: Constructs the GLException instance from the supplied inputs.

#### `public static String constname(Class<?> cl, int val)`
- Role: Handles the constname path.
- Description: Implements the constname operation.

#### `public static String constname(int val)`
- Role: Handles the constname path.
- Description: Implements the constname operation.

#### `public GLInvalidEnumException()`
- Role: Handles the glinvalid enum exception path.
- Description: Implements the gl invalid enum exception operation.

#### `public GLInvalidValueException()`
- Role: Handles the glinvalid value exception path.
- Description: Implements the gl invalid value exception operation.

#### `public GLInvalidOperationException()`
- Role: Handles the glinvalid operation exception path.
- Description: Implements the gl invalid operation exception operation.

#### `public GLOutOfMemoryException()`
- Role: Handles the glout of memory exception path.
- Description: Implements the gl out of memory exception operation.

#### `public void initenv(GLEnvironment env)`
- Role: Handles the initenv path.
- Description: Implements the initenv operation.

#### `public static GLException glexcfor(int code)`
- Role: Handles the glexcfor path.
- Description: Implements the glexcfor operation.

#### `public static void checkfor(GL gl, Throwable cause, GLEnvironment env)`
- Role: Handles the checkfor path.
- Description: Implements the checkfor operation.

#### `public static void checkfor(GL gl, GLEnvironment env)`
- Role: Handles the checkfor path.
- Description: Implements the checkfor operation.

#### `public void initenv(GLEnvironment env)`
- Role: Handles the initenv path.
- Description: Implements the initenv operation.