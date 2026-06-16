# Environment

This file documents the responsibilities and members of `Environment`.

## Meta

- Source: [Environment.java](../../../../src/haven/render/Environment.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the environment render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public Render render()`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public FillBuffer fillbuf(DataBuffer target, int from, int to)`
- Role: Performs fillbuf.
- Description: Supports the fillbuf operation used by the surrounding class.

#### `public default FillBuffer fillbuf(DataBuffer target)`
- Role: Performs fillbuf.
- Description: Supports the fillbuf operation used by the surrounding class.

#### `public DrawList drawlist()`
- Role: Performs drawlist.
- Description: Supports the drawlist operation used by the surrounding class.

#### `public void submit(Render cmd)`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `public boolean compatible(DrawList ob)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.

#### `public boolean compatible(Texture ob)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.

#### `public boolean compatible(DataBuffer ob)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.

#### `public UnavailableException(String msg)`
- Role: Performs unavailable exception.
- Description: Supports the unavailable exception operation used by the surrounding class.

#### `public UnavailableException(String msg, Throwable cause)`
- Role: Performs unavailable exception.
- Description: Supports the unavailable exception operation used by the surrounding class.

#### `public String vendor()`
- Role: Performs vendor.
- Description: Supports the vendor operation used by the surrounding class.

#### `public String driver()`
- Role: Performs driver.
- Description: Supports the driver operation used by the surrounding class.

#### `public String device()`
- Role: Performs device.
- Description: Supports the device operation used by the surrounding class.

#### `public Caps caps()`
- Role: Performs caps.
- Description: Supports the caps operation used by the surrounding class.

#### `public abstract Environment back()`
- Role: Performs back.
- Description: Supports the back operation used by the surrounding class.

#### `public Render render()`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public FillBuffer fillbuf(DataBuffer target, int from, int to)`
- Role: Performs fillbuf.
- Description: Supports the fillbuf operation used by the surrounding class.

#### `public DrawList drawlist()`
- Role: Performs drawlist.
- Description: Supports the drawlist operation used by the surrounding class.

#### `public void submit(Render cmd)`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public Caps caps()`
- Role: Performs caps.
- Description: Supports the caps operation used by the surrounding class.

#### `public boolean compatible(DrawList ob)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.

#### `public boolean compatible(Texture ob)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.

#### `public boolean compatible(DataBuffer ob)`
- Role: Performs compatible.
- Description: Supports the compatible operation used by the surrounding class.
