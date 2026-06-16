# SteamCreds

This file documents the responsibilities and members of `SteamCreds`.

## Meta

- Source: [SteamCreds.java](../../../src/haven/SteamCreds.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the steam creds Haven component.

## Members

### Constants

### Fields

#### `private final Steam api`
- Role: Holds the api state.
- Description: Backs the cached state for this file.

#### `private final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

### Methods

#### `public SteamCreds() throws IOException`
- Role: Creates a new SteamCreds instance.
- Description: Constructs the instance and initializes its default state.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public String tryauth(AuthClient cl) throws IOException`
- Role: Handles the tryauth workflow.
- Description: Supports the tryauth operation used by the surrounding class.
