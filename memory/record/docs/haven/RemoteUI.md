---
source: [RemoteUI.java](../../../../src/haven/RemoteUI.java)
created: 2026-06-13
updated: 2026-06-14
---

# RemoteUI

Represents the remote ui Haven component.

## Nested Types

### Return

- Role: Represents return within RemoteUI.
- Description: Describes the nested return type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Session sess`
- Role: Caches the sess value.
- Description: Caches the `sess` value for reuse.

#### `public final Session ret`
- Role: Caches the ret value.
- Description: Caches the `ret` value for reuse.

### Methods

#### `public RemoteUI(Session sess)`
- Role: Creates a new RemoteUI instance.
- Description: Constructs the RemoteUI instance from the supplied inputs.

#### `public void rcvmsg(int id, String name, Object... args)`
- Role: Handles the rcvmsg path.
- Description: Implements the rcvmsg operation.

#### `public Return(Session ret)`
- Role: Handles the return path.
- Description: Implements the return operation.

#### `private void sendua(String key, String val)`
- Role: Handles the sendua path.
- Description: Implements the sendua operation.

#### `private void sendua(UI ui)`
- Role: Handles the sendua path.
- Description: Implements the sendua operation.

#### `public void ret(Session sess)`
- Role: Handles the ret path.
- Description: Implements the ret operation.

#### `public UI.Runner run(UI ui) throws InterruptedException`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void init(UI ui)`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public String title()`
- Role: Handles the title path.
- Description: Implements the title operation.