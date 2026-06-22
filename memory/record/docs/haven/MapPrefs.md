---
source: [MapPrefs.java](../../../../src/haven/MapPrefs.java)
created: 2026-06-13
updated: 2026-06-14
---

# MapPrefs

Represents the map prefs Haven component.

## Members

### Constants

#### `public static final MapPrefs ROOT = new MapPrefs(null, "", Collections.emptyMap())`
- Role: Implements the root operation.
- Description: Implements the empty map operation.
- Value: `new MapPrefs(null, "", Collections.emptyMap())`

### Fields

#### `private final Map<? super String, ? super String> props`
- Role: Caches the props value.
- Description: Caches the `props` value for reuse.

### Methods

#### `public MapPrefs(MapPrefs parent, String name, Map<? super String, ? super String> props)`
- Role: Creates a new MapPrefs instance.
- Description: Constructs the MapPrefs instance from the supplied inputs.

#### `public MapPrefs(String name, Map<? super String, ? super String> props)`
- Role: Creates a new MapPrefs instance.
- Description: Constructs the MapPrefs instance from the supplied inputs.

#### `public String getSpi(String key)`
- Role: Returns the spi.
- Description: Returns the spi.

#### `public void putSpi(String key, String val)`
- Role: Handles the put spi path.
- Description: Implements the put spi operation.

#### `public void removeSpi(String key)`
- Role: Removes the spi.
- Description: Removes the spi.

#### `public String[] keysSpi()`
- Role: Handles the keys spi path.
- Description: Implements the keys spi operation.

#### `public String[] childrenNamesSpi()`
- Role: Handles the children names spi path.
- Description: Implements the children names spi operation.

#### `public AbstractPreferences childSpi(String name)`
- Role: Handles the child spi path.
- Description: Implements the child spi operation.

#### `public void removeNodeSpi()`
- Role: Removes the node spi.
- Description: Removes the node spi.

#### `public void flushSpi()`
- Role: Handles the flush spi path.
- Description: Implements the flush spi operation.

#### `public void syncSpi()`
- Role: Synchronizes the spi.
- Description: Implements the sync spi operation.