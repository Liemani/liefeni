---
source: [WebBrowser.java](../../../src/haven/WebBrowser.java)
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
- Role: Holds the self state.
- Description: Backs the cached state for this file.

### Methods

#### `public WebBrowser()`
- Role: Creates a new WebBrowser instance.
- Description: Constructs the instance and initializes its default state.

#### `public abstract void show(URL url)`
- Role: Performs show.
- Description: Supports the show operation used by the surrounding class.

#### `public BrowserException(String msg)`
- Role: Performs browser exception.
- Description: Supports the browser exception operation used by the surrounding class.

#### `public BrowserException(Throwable cause)`
- Role: Performs browser exception.
- Description: Supports the browser exception operation used by the surrounding class.

#### `public static void sshow(URL url)`
- Role: Performs sshow.
- Description: Supports the sshow operation used by the surrounding class.
