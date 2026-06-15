# MapPrefs

This file documents the responsibilities and members of `MapPrefs`.

## Meta

- Source: [MapPrefs.java](../../../src/haven/MapPrefs.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Holds map preferences.

## Members

### Constants

#### `public static final MapPrefs ROOT = new MapPrefs(null, "", Collections.emptyMap())`

- Description: TODO

### Fields

#### `private final Map<? super String, ? super String> props`

- Description: TODO

### Methods

#### `public MapPrefs(MapPrefs parent, String name, Map<? super String, ? super String> props)`

- Description: TODO

#### `public MapPrefs(String name, Map<? super String, ? super String> props)`

- Description: TODO

#### `public String getSpi(String key)`

- Description: TODO

#### `public void putSpi(String key, String val)`

- Description: TODO

#### `public void removeSpi(String key)`

- Description: TODO

#### `public String[] keysSpi()`

- Description: TODO

#### `public String[] childrenNamesSpi()`

- Description: TODO

#### `public AbstractPreferences childSpi(String name)`

- Description: TODO

#### `public void removeNodeSpi()`

- Description: TODO

#### `public void flushSpi()`

- Description: TODO

#### `public void syncSpi()`

- Description: TODO
