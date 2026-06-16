# MapPrefs

This file documents the responsibilities and members of `MapPrefs`.

## Meta

- Source: [MapPrefs.java](../../../src/haven/MapPrefs.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the map prefs Haven component.

## Members

### Constants

#### `public static final MapPrefs ROOT = new MapPrefs(null, "", Collections.emptyMap())`
- Role: Defines the shared root constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Map<? super String, ? super String> props`
- Role: Caches props entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public MapPrefs(MapPrefs parent, String name, Map<? super String, ? super String> props)`
- Role: Creates a new MapPrefs instance.
- Description: Constructs the instance and initializes its default state.

#### `public MapPrefs(String name, Map<? super String, ? super String> props)`
- Role: Creates a new MapPrefs instance.
- Description: Constructs the instance and initializes its default state.

#### `public String getSpi(String key)`
- Role: Returns the spi.
- Description: Exposes the requested value without mutating state.

#### `public void putSpi(String key, String val)`
- Role: Performs put spi.
- Description: Supports the put spi operation used by the surrounding class.

#### `public void removeSpi(String key)`
- Role: Removes the spi.
- Description: Removes the associated value from the current runtime state.

#### `public String[] keysSpi()`
- Role: Performs keys spi.
- Description: Supports the keys spi operation used by the surrounding class.

#### `public String[] childrenNamesSpi()`
- Role: Performs children names spi.
- Description: Supports the children names spi operation used by the surrounding class.

#### `public AbstractPreferences childSpi(String name)`
- Role: Performs child spi.
- Description: Supports the child spi operation used by the surrounding class.

#### `public void removeNodeSpi()`
- Role: Removes the node spi.
- Description: Removes the associated value from the current runtime state.

#### `public void flushSpi()`
- Role: Performs flush spi.
- Description: Supports the flush spi operation used by the surrounding class.

#### `public void syncSpi()`
- Role: Synchronizes the spi.
- Description: Supports the sync spi operation used by the surrounding class.
