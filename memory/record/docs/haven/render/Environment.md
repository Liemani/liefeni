---
source: [Environment.java](../../../../../src/haven/render/Environment.java)
created: 2026-06-13
updated: 2026-06-14
---

# Environment

Defines the environment render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public interface Caps`
- Role: Describes render capabilities.
- Description: Exposes the supported environment limits and feature flags.

#### `public Render render()`
- Role: Creates a render back-end.
- Description: Returns the renderer bound to this environment.

#### `public FillBuffer fillbuf(DataBuffer target, int from, int to)`
- Role: Creates a fill buffer view.
- Description: Returns a writable buffer window for the requested data range.

#### `public default FillBuffer fillbuf(DataBuffer target)`
- Role: Creates a full fill buffer.
- Description: Returns a writable view covering the whole target buffer.

#### `public DrawList drawlist()`
- Role: Creates the draw list back-end.
- Description: Returns the draw list implementation supported by this environment.

#### `public void submit(Render cmd)`
- Role: Submits one render command.
- Description: Sends the command to the underlying render environment.

#### `public boolean compatible(DrawList ob)`
- Role: Checks draw-list compatibility.
- Description: Tests whether another draw list can share this environment.

#### `public boolean compatible(Texture ob)`
- Role: Checks texture compatibility.
- Description: Tests whether a texture object can run on this environment.

#### `public boolean compatible(DataBuffer ob)`
- Role: Checks buffer compatibility.
- Description: Tests whether a data buffer can be used by this environment.

#### `public UnavailableException(String msg)`
- Role: Builds an unavailable-environment error.
- Description: Signals that the requested render service is not available.

#### `public UnavailableException(String msg, Throwable cause)`
- Role: Builds an unavailable-environment error.
- Description: Signals that the requested render service is not available and keeps the root cause.

#### `public String vendor()`
- Role: Returns the GPU vendor string.
- Description: Exposes the vendor name reported by the render environment.

#### `public String driver()`
- Role: Returns the driver string.
- Description: Exposes the driver name reported by the render environment.

#### `public String device()`
- Role: Returns the device string.
- Description: Exposes the device name reported by the render environment.

#### `public Caps caps()`
- Role: Returns environment capabilities.
- Description: Exposes the capability set supported by this environment.

#### `public abstract Environment back()`
- Role: Returns the backing environment.
- Description: Exposes the delegate environment when this object wraps another one.

#### `public Render render()`
- Role: Creates the renderer back-end.
- Description: Returns the render interface bound to this environment.

#### `public FillBuffer fillbuf(DataBuffer target, int from, int to)`
- Role: Creates a ranged fill buffer.
- Description: Returns a writable view for a slice of the target buffer.

#### `public DrawList drawlist()`
- Role: Creates the draw-list back-end.
- Description: Returns the draw list implementation supported by the environment.

#### `public void submit(Render cmd)`
- Role: Submits one render command.
- Description: Sends the command to the underlying render implementation.

#### `public void dispose()`
- Role: Disposes the environment.
- Description: Releases the resources owned by this environment wrapper.

#### `public Caps caps()`
- Role: Returns environment capabilities.
- Description: Exposes the capability set supported by this environment.

#### `public boolean compatible(DrawList ob)`
- Role: Checks draw-list compatibility.
- Description: Tests whether another draw list can run on this environment.

#### `public boolean compatible(Texture ob)`
- Role: Checks texture compatibility.
- Description: Tests whether a texture can be used by this environment.

#### `public boolean compatible(DataBuffer ob)`
- Role: Checks buffer compatibility.
- Description: Tests whether a data buffer can be used by this environment.