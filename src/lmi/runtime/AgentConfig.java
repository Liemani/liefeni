package lmi.runtime;

import java.io.*;
import java.util.Properties;

public class AgentConfig {
  private static final String FILE_PATH = "data/agent-config.properties";
  private final Properties props = new Properties();

  public AgentConfig() {
    load();
  }

  public void setDrive(String key, boolean on) {
    props.setProperty("drive." + key, String.valueOf(on));
    save();
  }

  public boolean isDriveEnabled(String key) {
    return Boolean.parseBoolean(props.getProperty("drive." + key, "false"));
  }

  public String getDriveStatus(String key) {
    return isDriveEnabled(key) ? "on" : "off";
  }

  public java.util.Set<String> getAllDrives() {
    java.util.Set<String> drives = new java.util.HashSet<>();
    for (Object key : props.keySet()) {
      String sKey = (String)key;
      if (sKey.startsWith("drive.")) {
        drives.add(sKey.substring(6));
      }
    }
    return drives;
  }

  private void load() {
    File file = new File(FILE_PATH);
    if (!file.exists()) return;
    try (InputStream in = new FileInputStream(file)) {
      props.load(in);
    } catch (IOException e) { e.printStackTrace(); }
  }

  private void save() {
    try (OutputStream out = new FileOutputStream(FILE_PATH)) {
      props.store(out, "LMI Agent Configurations");
    } catch (IOException e) { e.printStackTrace(); }
  }
}
