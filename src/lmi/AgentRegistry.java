package lmi;

import agent.Action;
import agent.Job;

import java.io.File;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

final class AgentRegistry {
  private static final String BASE_PACKAGE = "agent";
  private static final String BASE_PATH = "agent/";

  private static final Map<String, Class<? extends Job>> jobMap = new TreeMap<>();
  private static final Map<String, Class<? extends Action>> actionMap = new TreeMap<>();
  private static final Map<String, Class<?>> folderMetadataMap = new HashMap<>();
  private static final List<Entry> executableEntries = new ArrayList<>();

  private static boolean initialized = false;

  static synchronized void init() {
    if (initialized) return;

    jobMap.clear();
    actionMap.clear();
    folderMetadataMap.clear();
    executableEntries.clear();

    _scanAgentPackage();
    executableEntries.sort(Comparator.comparing(Entry::className));
    initialized = true;
  }

  static Map<String, Class<? extends Job>> jobMap() {
    init();
    return Collections.unmodifiableMap(jobMap);
  }

  static Class<? extends Job> jobClass(String name) {
    init();
    return jobMap.get(name);
  }

  static Class<? extends Action> actionClass(String name) {
    init();
    return actionMap.get(name);
  }

  static Class<?> folderMetadataClass(String packageName) {
    init();
    return folderMetadataMap.get(packageName);
  }

  static List<Entry> executableEntries() {
    init();
    return Collections.unmodifiableList(executableEntries);
  }

  private static void _scanAgentPackage() {
    try {
      CodeSource cs = AgentRegistry.class.getProtectionDomain().getCodeSource();
      if (cs == null) return;
      URL location = cs.getLocation();
      if (location == null) return;
      if (!location.getProtocol().equals("file") || !location.getPath().endsWith(".jar")) return;

      try (JarFile jar = new JarFile(new File(location.toURI()))) {
        Enumeration<JarEntry> entries = jar.entries();
        while (entries.hasMoreElements()) {
          JarEntry entry = entries.nextElement();
          String path = entry.getName();
          if (!path.startsWith(BASE_PATH) || !path.endsWith(".class")) continue;
          _registerClass(path);
        }
      }
    } catch (Exception e) {
      System.err.println("Error scanning agent package: " + e.getMessage());
    }
  }

  @SuppressWarnings("unchecked")
  private static void _registerClass(String path) {
    String className = path.replace('/', '.').substring(0, path.length() - 6);

    try {
      Class<?> cls = Class.forName(className);
      if (cls == Job.class || cls == Action.class) return;

      if (_isFolderMetadataClass(cls)) {
        folderMetadataMap.put(cls.getPackage().getName(), cls);
        return;
      }

      if (_isConcreteJobClass(cls)) {
        Class<? extends Job> jobClass = (Class<? extends Job>) cls;
        String commandName = _jobCommandName(jobClass);
        jobMap.put(commandName, jobClass);
        executableEntries.add(Entry.job(jobClass));
        return;
      }

      if (_isConcreteActionClass(cls)) {
        Class<? extends Action> actionClass = (Class<? extends Action>) cls;
        actionMap.put(actionClass.getSimpleName(), actionClass);
        executableEntries.add(Entry.action(actionClass));
      }
    } catch (ClassNotFoundException e) {
      // Ignore classes that cannot be loaded
    }
  }

  private static boolean _isFolderMetadataClass(Class<?> cls) {
    Package pkg = cls.getPackage();
    if (pkg == null) return false;
    String packageName = pkg.getName();
    if (!packageName.startsWith(BASE_PACKAGE)) return false;

    String leaf = packageName.substring(packageName.lastIndexOf('.') + 1);
    return cls.getSimpleName().equalsIgnoreCase(leaf)
      && !Job.class.isAssignableFrom(cls)
      && !Action.class.isAssignableFrom(cls);
  }

  private static boolean _isConcreteJobClass(Class<?> cls) {
    return Job.class.isAssignableFrom(cls)
      && !cls.isInterface()
      && !java.lang.reflect.Modifier.isAbstract(cls.getModifiers());
  }

  private static boolean _isConcreteActionClass(Class<?> cls) {
    return Action.class.isAssignableFrom(cls)
      && !cls.isInterface()
      && !java.lang.reflect.Modifier.isAbstract(cls.getModifiers());
  }

  private static String _jobCommandName(Class<? extends Job> cls) {
    String simpleName = cls.getSimpleName();
    if (simpleName.endsWith("Job"))
      return simpleName.substring(0, simpleName.length() - 3);
    return simpleName;
  }

  static final class Entry {
    enum Kind {
      JOB,
      ACTION
    }

    private final Kind kind;
    private final Class<?> cls;

    private Entry(Kind kind, Class<?> cls) {
      this.kind = kind;
      this.cls = cls;
    }

    static Entry job(Class<? extends Job> cls) {
      return new Entry(Kind.JOB, cls);
    }

    static Entry action(Class<? extends Action> cls) {
      return new Entry(Kind.ACTION, cls);
    }

    Kind kind() { return kind; }
    Class<?> cls() { return cls; }
    String className() { return cls.getName(); }
    String simpleName() { return cls.getSimpleName(); }
    String packageName() { return cls.getPackage().getName(); }
  }
}
