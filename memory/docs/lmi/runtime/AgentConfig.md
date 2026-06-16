# AgentConfig

This file documents the responsibilities and members of `AgentConfig`.

## Meta

- Source: [AgentConfig.java](../../../../src/lmi/runtime/AgentConfig.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Carries configuration for a runtime agent.

## Members

### Constants

#### `private static final String FILE_PATH = "data/agent-config.properties"`
- Role: Defines the shared file path constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Properties props = new Properties()`
- Role: Holds the props state.
- Description: Backs the cached state for this file.

### Methods

#### `public AgentConfig()`
- Role: Creates a new AgentConfig instance.
- Description: Constructs the instance and initializes its default state.

#### `public void setDrive(String key, boolean on)`
- Role: Sets the drive.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public boolean isDriveEnabled(String key)`
- Role: Checks whether the drive enabled.
- Description: Returns a boolean result for the described condition.

#### `public String getDriveStatus(String key)`
- Role: Returns the drive status.
- Description: Exposes the requested value without mutating state.

#### `public java.util.Set<String> getAllDrives()`
- Role: Returns the all drives.
- Description: Exposes the requested value without mutating state.

#### `private void load()`
- Role: Coordinates load persistence or lookup.
- Description: Supports the load operation used by the surrounding class.

#### `private void save()`
- Role: Coordinates save persistence or lookup.
- Description: Supports the save operation used by the surrounding class.
