---
source: [SteamCreds.java](../../../../src/haven/SteamCreds.java)
created: 2026-06-13
updated: 2026-06-14
---

# SteamCreds

Represents the steam creds Haven component.

## Members

### Constants

### Fields

#### `private final Steam api`
- Role: Caches the api value.
- Description: Caches the `api` value for reuse.

#### `private final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

### Methods

#### `public SteamCreds() throws IOException`
- Role: Creates a new SteamCreds instance.
- Description: Constructs the SteamCreds instance from the supplied inputs.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public String tryauth(AuthClient cl) throws IOException`
- Role: Handles the tryauth workflow.
- Description: Implements the tryauth operation.