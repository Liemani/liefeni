# AgentConfig

This file documents the responsibilities and members of `AgentConfig`.

## Meta

- Source: [AgentConfig.java](../../../../src/lmi/runtime/AgentConfig.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Holds agent-level configuration and tunables.

## Members

### Constants

#### `private static final String FILE_PATH = "data/agent-config.properties"`

- Description: TODO

### Fields

#### `private final Properties props = new Properties()`

- Description: TODO

### Methods

#### `public AgentConfig()`

- Description: TODO

#### `public void setDrive(String key, boolean on)`

- Description: TODO

#### `public boolean isDriveEnabled(String key)`

- Description: TODO

#### `public String getDriveStatus(String key)`

- Description: TODO

#### `public java.util.Set<String> getAllDrives()`

- Description: TODO

#### `private void load()`

- Description: TODO

#### `private void save()`

- Description: TODO
