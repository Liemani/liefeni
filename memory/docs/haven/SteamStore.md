# SteamStore

This file documents the responsibilities and members of `SteamStore`.

## Meta

- Source: [SteamStore.java](../../../src/haven/SteamStore.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Integrates with the Steam store.

## Nested Types

### Authorizer

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<URI> steamsvc = Config.Services.var("steamsvc", "")`

- Description: TODO

### Fields

#### `private static Authorizer cb`

- Description: TODO

### Methods

#### `private static void sendauth(long orderid, boolean approved)`

- Description: TODO

#### `public void callback(String id, Object[] args)`

- Description: TODO

#### `public static void launch(Session sess)`

- Description: TODO
