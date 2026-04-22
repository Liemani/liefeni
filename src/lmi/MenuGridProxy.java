package lmi;

import haven.*;
import java.util.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.net.JarURLConnection;

public class MenuGridProxy {
  public static final String LMI_PREFIX = "lmi_";
  public static final String JOB_PREFIX = "lmi_job_";
  public static final String ACTION_PREFIX = "lmi_action_";
  private static final String DEFAULT_ICON = "paginae/act/landscape";
  private static final List<Pagina> _customPaginae = new ArrayList<>();
  private static Resource _sharedRes;

  private static Pagina addFolder(String id, String name, String desc, Pagina parent, Resource res) {
    Pagina p = new Pagina(id, name, desc, parent, (res != null) ? res : _sharedRes);
    _customPaginae.add(p);
    return p;
  }

  private static Pagina addFolder(String id, String name, String desc, Pagina parent) {
    return addFolder(id, name, desc, parent, null);
  }

  private static Pagina addActionItem(String id, String name, String desc, Pagina parent) {
    return addFolder(id, name, desc, parent, null);
  }

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
      Resource folderRes = Resource.remote().loadwait("paginae/act/bld");
      _customPaginae.clear();

      // 1. Root Folders
      Pagina agent = addFolder("lmi_z_agent", "Agent", "LMI Agent Control Center", null);
      Pagina jobsFolder = addFolder("lmi_1_job", "Job", "Manage automated jobs.", agent);
      Pagina debugFolder = addFolder("lmi_2_debug", "Debug", "Debugging tools.", agent, folderRes);
      Pagina devFolder = addFolder("lmi_3_dev", "Dev", "Development scripts.", agent, folderRes);
      Pagina settingsFolder = addFolder("lmi_settings_folder", "Settings", "Configure behavior.", agent);

      // 2. Register Jobs from AgentManager
      Map<String, Class<? extends Job>> jobMap = AgentManager.getJobMap();
      for (Map.Entry<String, Class<? extends Job>> entry : jobMap.entrySet()) {
        Class<? extends Job> cls = entry.getValue();
        Pagina target = _getTargetFolder(cls, jobsFolder, debugFolder, devFolder);
        addActionItem(JOB_PREFIX + entry.getKey(), entry.getKey(), _getInfo(cls), target);
      }

      // 3. Register Actions from dev/debug/test packages
      _scanAndRegisterActions(debugFolder, devFolder);

      apply();
      System.out.println("LMI MenuGridProxy initialized (Jobs & Actions registered).");
    } catch (Exception e) {
      System.err.println("Failed to initialize MenuGridProxy: " + e.getMessage());
      e.printStackTrace();
    }
  }

  private static Pagina _getTargetFolder(Class<?> cls, Pagina jobs, Pagina debug, Pagina dev) {
    String pkg = cls.getPackage().getName();
    if (pkg.equals("lmi.debug")) return debug;
    if (pkg.equals("lmi.dev")) return dev;
    return jobs;
  }

  private static String _getInfo(Class<?> cls) {
    try {
      return (String)cls.getMethod("info").invoke(null);
    } catch (Exception e) { return "LMI Item"; }
  }

  private static void _scanAndRegisterActions(Pagina debug, Pagina dev) {
    String[] packages = {"lmi.debug", "lmi.test", "lmi.dev"};
    for (String pkg : packages) {
      try {
        String path = pkg.replace('.', '/');
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Enumeration<URL> resources = loader.getResources(path);
        while (resources.hasMoreElements()) {
          URL resource = resources.nextElement();
          if (resource.getProtocol().equals("jar")) {
            JarURLConnection conn = (JarURLConnection) resource.openConnection();
            try (JarFile jar = conn.getJarFile()) {
              Enumeration<JarEntry> entries = jar.entries();
              while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();
                if (name.startsWith(path + "/") && name.endsWith(".class")) {
                  String className = name.replace('/', '.').substring(0, name.length() - 6);
                  _registerAction(className, debug, dev);
                }
              }
            }
          }
        }
      } catch (Exception e) { }
    }
  }

  private static void _registerAction(String className, Pagina debug, Pagina dev) {
    try {
      Class<?> cls = Class.forName(className);
      if (Action.class.isAssignableFrom(cls) && !cls.isInterface() && !java.lang.reflect.Modifier.isAbstract(cls.getModifiers())) {
        String name = cls.getSimpleName();
        Pagina target = _getTargetFolder(cls, null, debug, dev);
        if (target != null) {
            addActionItem(ACTION_PREFIX + name, name, _getInfo(cls), target);
            System.out.println("Registered Action: " + name + " [" + className + "]");
        }
      }
    } catch (Exception e) { }
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
      @Override public String sortkey() { return "\ufffe" + pag.id.toString(); }
      
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
