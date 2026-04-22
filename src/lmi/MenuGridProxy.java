package lmi;

import haven.*;
import agent.*;
import java.util.*;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class MenuGridProxy {
  public static final String LMI_PREFIX = "lmi_";
  public static final String JOB_PREFIX = "lmi_job_";
  public static final String ACTION_PREFIX = "lmi_action_";
  private static final String DEFAULT_ICON = "paginae/act/landscape";
  private static final String FOLDER_ICON = "paginae/act/bld";
  
  private static final List<Pagina> _customPaginae = new ArrayList<>();
  private static final Map<String, Pagina> _folderMap = new HashMap<>();
  private static Resource _sharedRes;
  private static Resource _folderRes;

  public static boolean isLmi(MenuGrid.Pagina pag) {
    if (pag == null || pag.id == null) return false;
    return (pag.id instanceof String) && ((String)pag.id).startsWith(LMI_PREFIX);
  }

  public static boolean isJob(MenuGrid.Pagina pag) {
    return isLmi(pag) && ((String)pag.id).startsWith(JOB_PREFIX);
  }

  public static boolean isAction(MenuGrid.Pagina pag) {
    return isLmi(pag) && ((String)pag.id).startsWith(ACTION_PREFIX);
  }

  public static void init() {
    MenuGrid mg = AppContext.menuGrid;
    if (mg == null) return;

    try {
      _sharedRes = Resource.remote().loadwait(DEFAULT_ICON);
      _folderRes = Resource.remote().loadwait(FOLDER_ICON);
      _customPaginae.clear();
      _folderMap.clear();

      // 1. Core LMI Agent Root
      Pagina root = _getOrCreateFolder("agent", "Agent", null);

      // 2. Scan 'agent' package structure in JAR
      _scanAgentStructure(root);

      apply();
      System.out.println("LMI MenuGridProxy initialized with standard package hierarchy.");
    } catch (Exception e) {
      System.err.println("Failed to initialize MenuGridProxy: " + e.getMessage());
      e.printStackTrace();
    }
  }

  private static void _scanAgentStructure(Pagina root) {
    try {
      String basePath = "agent";
      java.security.CodeSource cs = MenuGridProxy.class.getProtectionDomain().getCodeSource();
      if (cs == null) return;
      URL location = cs.getLocation();
      if (location == null) return;

      if (location.getProtocol().equals("file") && location.getPath().endsWith(".jar")) {
        File jarFile = new File(location.toURI());
        try (JarFile jar = new JarFile(jarFile)) {
          Enumeration<JarEntry> entries = jar.entries();
          while (entries.hasMoreElements()) {
            JarEntry entry = entries.nextElement();
            String path = entry.getName();
            if (path.startsWith(basePath + "/") && path.endsWith(".class")) {
              String className = path.replace('/', '.').substring(0, path.length() - 6);
              _processClass(className, path, root);
            }
          }
        }
      }
    } catch (Exception e) {
        System.err.println("Error scanning agent structure: " + e.getMessage());
    }
  }

  private static void _processClass(String className, String filePath, Pagina lmiRoot) {
    try {
      Class<?> cls = Class.forName(className);
      
      // Skip base classes
      if (cls == Job.class || cls == Action.class) return;
      
      boolean isJob = Job.class.isAssignableFrom(cls);
      boolean isAction = Action.class.isAssignableFrom(cls);

      if ((isJob || isAction) && !cls.isInterface() && !java.lang.reflect.Modifier.isAbstract(cls.getModifiers())) {
        
        // Determine Hierarchy from file path (e.g., agent/job/MyJob.class)
        String[] parts = filePath.split("/");
        Pagina parent = lmiRoot;
        
        // Skip 'agent' (index 0) and the file name (last index)
        StringBuilder pathBuilder = new StringBuilder("agent");
        for (int i = 1; i < parts.length - 1; i++) {
          String folderName = parts[i];
          pathBuilder.append("_").append(folderName);
          String folderId = "folder_" + pathBuilder.toString();
          String folderTitle = folderName.substring(0, 1).toUpperCase() + folderName.substring(1);
          parent = _getOrCreateFolder(folderId, folderTitle, parent);
        }

        // Add the actual Job/Action
        String simpleName = cls.getSimpleName();
        String prefix = isJob ? JOB_PREFIX : ACTION_PREFIX;
        String id = prefix + simpleName;
        String info = _getInfo(cls);

        _customPaginae.add(new Pagina(id, simpleName, info, parent, _sharedRes));
      }
    } catch (Exception e) { }
  }

  private static Pagina _getOrCreateFolder(String id, String name, Pagina parent) {
    String fullId = LMI_PREFIX + id;
    if (_folderMap.containsKey(fullId)) return _folderMap.get(fullId);

    // Root folder 'Agent' gets \ufffe sorting to go to the end
    Pagina p = new Pagina(fullId, name, name + " Folder", parent, _folderRes);
    _customPaginae.add(p);
    _folderMap.put(fullId, p);
    return p;
  }

  private static String _getInfo(Class<?> cls) {
    try {
      return (String)cls.getMethod("info").invoke(null);
    } catch (Exception e) { return "LMI Item"; }
  }

  public static void apply() {
    MenuGrid mg = AppContext.menuGrid;
    if (mg == null) return;
    synchronized (mg.paginae) {
      for (Pagina p : _customPaginae) mg.paginae.add(p);
    }
    updateLayout(mg);
  }

  public static void updateLayout(MenuGrid mg) {
    try {
      Method upd = mg.getClass().getDeclaredMethod("updlayout");
      upd.setAccessible(true);
      upd.invoke(mg);
    } catch (Exception e) {}
  }

  public static class Pagina extends MenuGrid.Pagina {
    public final String name;
    private final String description;
    private final MenuGrid.Pagina customParent;
    private Button customBtn;
    private final Resource iconRes;

    public Pagina(String id, String name, String description, MenuGrid.Pagina parent, Resource iconRes) {
      super(AppContext.menuGrid, id, iconRes.indir());
      this.name = name;
      this.description = description;
      this.customParent = parent;
      this.iconRes = iconRes;
    }

    @Override public MenuGrid.Pagina parent() { return customParent; }
    @Override public MenuGrid.PagButton button() {
      if (customBtn == null) customBtn = new Button(this);
      return customBtn;
    }

    public class Button extends MenuGrid.PagButton {
      private GSprite myspr;
      public Button(Pagina pag) { super(pag); }
      @Override public String name() { return name; }
      @Override public MenuGrid.Pagina parent() { return customParent; }
      @Override public KeyMatch hotkey() { return KeyMatch.nil; }
      @Override public KeyBinding binding() { return KeyBinding.get("scm/" + id, KeyMatch.nil); }
      
      @Override public String sortkey() { 
          // Root 'Agent' folder (\ufffe) vs others
          return "\ufffe" + pag.id.toString(); 
      }
      
      @Override public List<ItemInfo> info() { 
        List<ItemInfo> infoList = new ArrayList<>();
        if (description != null) infoList.add(new ItemInfo.Pagina(this, description));
        return infoList; 
      }
      
      @Override public GSprite spr() {
        if (myspr == null) myspr = GSprite.create(this, iconRes, Message.nil);
        return myspr;
      }
      
      @Override public void drawmain(GOut g, GSprite spr) {
        if (isJob(pag) || isAction(pag)) {
            g.chcolor(230, 255, 230, 255);
            super.drawmain(g, spr);
            g.chcolor(); 
        } else {
            super.drawmain(g, spr);
        }
      }
    }
  }

  public static void dumpAllIcons() {
    MenuGrid mg = AppContext.menuGrid;
    if (mg == null) return;
    System.out.println("--- Comprehensive MenuGrid Icon Dump ---");
    Set<MenuGrid.Pagina> all = new HashSet<>(mg.paginae);
    try {
      java.lang.reflect.Field pmapField = mg.getClass().getDeclaredField("pmap");
      pmapField.setAccessible(true);
      Map<?, MenuGrid.Pagina> pmap = (Map<?, MenuGrid.Pagina>)pmapField.get(mg);
      all.addAll(pmap.values());
    } catch (Exception e) {}

    List<MenuGrid.Pagina> sorted = new ArrayList<>(all);
    sorted.sort(Comparator.comparing(p -> p.button().sortkey()));
    for (MenuGrid.Pagina p : sorted) {
      Resource r = p.res.get();
      MenuGrid.Pagina parent = null;
      try { parent = p.parent(); } catch (Exception e) {}
      String parentInfo = (parent != null) ? " [Parent: " + parent.button().name() + "]" : " [Root]";
      System.out.printf("ID: %s | Name: %s | SortKey: %s | Path: %s%s\n", p.id, p.button().name(), p.button().sortkey(), r.name, parentInfo);
    }
    System.out.println("----------------------------------------");
  }
}
