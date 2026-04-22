package lmi;

import haven.*;
import java.util.*;
import java.lang.reflect.Method;

public class MenuGridProxy {
  public static final String LMI_PREFIX = "lmi_";
  public static final String JOB_PREFIX = "lmi_job_";
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

  private static Pagina addAction(String id, String name, String desc, Pagina parent) {
    return addFolder(id, name, desc, parent, null);
  }

  public static boolean isLmi(MenuGrid.Pagina pag) {
    if (pag == null || pag.id == null) return false;
    return (pag.id instanceof String) && ((String)pag.id).startsWith(LMI_PREFIX);
  }

  public static boolean isJob(MenuGrid.Pagina pag) {
    return isLmi(pag) && ((String)pag.id).startsWith(JOB_PREFIX);
  }

  public static void init() {
    MenuGrid mg = AppContext.menuGrid;
    if (mg == null) return;

    try {
      _sharedRes = Resource.remote().loadwait(DEFAULT_ICON);
      Resource folderRes = Resource.remote().loadwait("paginae/act/bld");
      _customPaginae.clear();

      // 1. Root Folder
      Pagina agent = addFolder("lmi_z_agent", "Agent", "LMI Agent Control Center", null);
      
      // 2. Sub Folders
      Pagina jobsFolder = addFolder("lmi_1_job", "Job", "Manage automated jobs.", agent);
      Pagina settingsFolder = addFolder("lmi_2_settings", "Settings", "Configure behavior.", agent);
      Pagina debugFolder = addFolder("lmi_3_debug", "Debug", "Debugging tools.", agent, folderRes);
      Pagina testFolder = addFolder("lmi_4_test", "Test", "Testing scripts.", agent, folderRes);
      Pagina devFolder = addFolder("lmi_5_dev", "Dev", "Development scripts.", agent, folderRes);

      // 3. Automatic Job Registration
      Map<String, Class<? extends lmi.Job>> jobMap = AgentManager.getJobMap();
      for (Map.Entry<String, Class<? extends lmi.Job>> entry : jobMap.entrySet()) {
        String jobName = entry.getKey();
        Class<? extends lmi.Job> jobClass = entry.getValue();
        String packageName = jobClass.getPackage().getName();

        Pagina targetFolder = jobsFolder;
        if (packageName.equals("lmi.debug")) targetFolder = debugFolder;
        else if (packageName.equals("lmi.test")) targetFolder = testFolder;
        else if (packageName.equals("lmi.dev")) targetFolder = devFolder;

        String description = "No description available.";
        try {
          Method infoMethod = jobClass.getMethod("info");
          description = (String)infoMethod.invoke(null);
        } catch (Exception e) { }

        addAction(JOB_PREFIX + jobName, jobName, description, targetFolder);
      }

      apply();
      System.out.println("LMI MenuGridProxy initialized (Field 'name' unified).");
    } catch (Exception e) {
      System.err.println("Failed to initialize MenuGridProxy: " + e.getMessage());
      e.printStackTrace();
    }
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
    private final String name;
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
      
      @Override public void drawmain(GOut g, GSprite spr) {
        if (isJob(pag)) {
            // Apply a subtle green tint (R:230, G:255, B:230) at 100% opacity
            g.chcolor(230, 255, 230, 255);
            super.drawmain(g, spr);
            g.chcolor(); 
        } else {
            super.drawmain(g, spr);
        }
      }
      
      @Override public String sortkey() { 
      // Using \ufffe ensures LMI icons stay at the very end of any sorted list
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
      System.out.printf("ID: %s | Name: %s | SortKey: %s | Path: %s%s\n", 
          p.id, p.button().name(), p.button().sortkey(), r.name, parentInfo);
    }
    System.out.println("----------------------------------------");
  }
}
