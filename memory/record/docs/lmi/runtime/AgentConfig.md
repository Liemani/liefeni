---
source: [AgentConfig.java](../../../../../src/lmi/runtime/AgentConfig.java)
created: 2026-06-13
updated: 2026-06-14
---

# AgentConfig

Carries configuration for a runtime agent.

## Members

### Constants

#### `private static final String FILE_PATH = "data/agent-config.properties"`
- Role: Caches the file path value.
- Description: Caches the `FILE_PATH` value for reuse.

### Fields

#### `private final Properties props = new Properties()`
- Role: Implements the props operation.
- Description: Implements the properties operation.

### Methods

#### `public AgentConfig()`
- Role: Creates a new AgentConfig instance.
- Description: Loads the persisted drive settings from disk.

#### `public void setDrive(String key, boolean on)`
- Role: Stores one agent drive flag.
- Description: Updates the persisted enablement state for the given drive.

#### `public boolean isDriveEnabled(String key)`
- Role: Checks whether the drive enabled.
- Description: Returns true when the requested drive is enabled.

#### `public String getDriveStatus(String key)`
- Role: Returns the drive status.
- Description: Returns the drive status.

#### `public java.util.Set<String> getAllDrives()`
- Role: Returns the all drives.
- Description: Returns the all drives.

#### `private void load()`
- Role: Coordinates load persistence or lookup.
- Description: Reads the drive settings file into memory.

#### `private void save()`
- Role: Coordinates save persistence or lookup.
- Description: Writes the current drive settings back to disk.