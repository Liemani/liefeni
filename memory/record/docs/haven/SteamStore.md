---
source: [SteamStore.java](../../../../src/haven/SteamStore.java)
created: 2026-06-13
updated: 2026-06-14
---

# SteamStore

Represents the steam store Haven component.

## Nested Types

### Authorizer

- Role: Receives Steam authorization callbacks.
- Description: Forwards approval or rejection to the stored callback handler.

## Members

### Constants

#### `public static final Config.Variable<URI> steamsvc = Config.Services.var("steamsvc", "")`
- Role: Implements the steamsvc operation.
- Description: Implements the var operation.
- Value: `Config.Services.var("steamsvc", "")`

### Fields

#### `private static Authorizer cb`
- Role: Caches the cb value.
- Description: Caches the `cb` value for reuse.

### Methods

#### `private static void sendauth(long orderid, boolean approved)`
- Role: Handles the sendauth path.
- Description: Implements the sendauth operation.

#### `public void callback(String id, Object[] args)`
- Role: Handles the callback path.
- Description: Implements the callback operation.

#### `public static void launch(Session sess)`
- Role: Handles the launch path.
- Description: Implements the launch operation.