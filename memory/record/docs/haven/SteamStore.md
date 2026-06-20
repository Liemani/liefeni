---
source: [SteamStore.java](../../../src/haven/SteamStore.java)
created: 2026-06-13
updated: 2026-06-14
---

# SteamStore

Represents the steam store Haven component.

## Nested Types

### Authorizer

- Role: Represents authorizer within SteamStore.
- Description: Describes the nested authorizer type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<URI> steamsvc = Config.Services.var("steamsvc", "")`
- Role: Defines the shared steamsvc constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static Authorizer cb`
- Role: Holds the cb state.
- Description: Backs the cached state for this file.

### Methods

#### `private static void sendauth(long orderid, boolean approved)`
- Role: Performs sendauth.
- Description: Supports the sendauth operation used by the surrounding class.

#### `public void callback(String id, Object[] args)`
- Role: Performs callback.
- Description: Supports the callback operation used by the surrounding class.

#### `public static void launch(Session sess)`
- Role: Performs launch.
- Description: Supports the launch operation used by the surrounding class.
