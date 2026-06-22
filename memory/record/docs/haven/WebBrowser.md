---
source: [WebBrowser.java](../../../../src/haven/WebBrowser.java)
created: 2026-06-13
updated: 2026-06-14
---

# WebBrowser

Represents the web browser Haven component.

## Nested Types

### BrowserException

- Role: Represents browser exception within WebBrowser.
- Description: Describes the nested browser exception type used by the enclosing class.

## Members

### Constants

### Fields

#### `public static WebBrowser self`
- Role: Caches the self value.
- Description: Caches the `self` value for reuse.

### Methods

#### `public WebBrowser()`
- Role: Creates a new WebBrowser instance.
- Description: Constructs the WebBrowser instance from the supplied inputs.

#### `public abstract void show(URL url)`
- Role: Handles the show path.
- Description: Implements the show operation.

#### `public BrowserException(String msg)`
- Role: Handles the browser exception path.
- Description: Implements the browser exception operation.

#### `public BrowserException(Throwable cause)`
- Role: Handles the browser exception path.
- Description: Implements the browser exception operation.

#### `public static void sshow(URL url)`
- Role: Handles the sshow path.
- Description: Implements the sshow operation.