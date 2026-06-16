# RemoteUI

This file documents the responsibilities and members of `RemoteUI`.

## Meta

- Source: [RemoteUI.java](../../../src/haven/RemoteUI.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the remote ui Haven component.

## Nested Types

### Return

- Role: Represents return within RemoteUI.
- Description: Describes the nested return type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Session sess`
- Role: Stores the sess value.
- Description: Backs the cached state for this file.

#### `public final Session ret`
- Role: Stores the ret value.
- Description: Backs the cached state for this file.

### Methods

#### `public RemoteUI(Session sess)`
- Role: Creates a new RemoteUI instance.
- Description: Constructs the instance and initializes its default state.

#### `public void rcvmsg(int id, String name, Object... args)`
- Role: Performs rcvmsg.
- Description: Supports the rcvmsg operation used by the surrounding class.

#### `public Return(Session ret)`
- Role: Performs return.
- Description: Supports the return operation used by the surrounding class.

#### `private void sendua(String key, String val)`
- Role: Performs sendua.
- Description: Supports the sendua operation used by the surrounding class.

#### `private void sendua(UI ui)`
- Role: Performs sendua.
- Description: Supports the sendua operation used by the surrounding class.

#### `public void ret(Session sess)`
- Role: Performs ret.
- Description: Supports the ret operation used by the surrounding class.

#### `public UI.Runner run(UI ui) throws InterruptedException`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void init(UI ui)`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public String title()`
- Role: Performs title.
- Description: Supports the title operation used by the surrounding class.
