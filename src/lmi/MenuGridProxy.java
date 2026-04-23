package lmi;

import haven.*;
import agent.*;
import java.util.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.io.File;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
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
      Pagina root = _getOrCreateFolder("agent", "agent", null);

      // 2. Scan 'agent' package structure in JAR
      _scanAgentStructure(root);

      apply();
      System.out.println("LMI MenuGridProxy initialized with local assets support.");
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
        try (JarFile jar = new JarFile(new File(location.toURI()))) {
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
      if (cls == Job.class || cls == Action.class) return;
      
      String[] parts = filePath.split("/");
      if (cls.getSimpleName().equalsIgnoreCase(parts[parts.length - 2])) return;

      boolean isJob = Job.class.isAssignableFrom(cls);
      boolean isAction = Action.class.isAssignableFrom(cls);

      if ((isJob || isAction) && !cls.isInterface() && !java.lang.reflect.Modifier.isAbstract(cls.getModifiers())) {
        Pagina parent = lmiRoot;
        StringBuilder pathBuilder = new StringBuilder("agent");
        for (int i = 1; i < parts.length - 1; i++) {
          String folderName = parts[i];
          pathBuilder.append("_").append(folderName);
          parent = _getOrCreateFolder(pathBuilder.toString(), folderName, parent);
        }

        String prefix = isJob ? JOB_PREFIX : ACTION_PREFIX;
        String id = prefix + cls.getSimpleName();
        Pagina p = new Pagina(id, parent, _sharedRes);
        p.setup(cls, cls.getSimpleName());
        _customPaginae.add(p);
      }
    } catch (Exception e) { }
  }

  private static Pagina _getOrCreateFolder(String id, String folderName, Pagina parent) {
    String fullId = LMI_PREFIX + id;
    if (_folderMap.containsKey(fullId)) return _folderMap.get(fullId);

    Pagina p = new Pagina(fullId, parent, _folderRes);
    String pkgBase = id;
    if (pkgBase.startsWith("folder_")) pkgBase = pkgBase.substring(7);
    String pkgName = pkgBase.replace('_', '.');
    try {
        Class<?> markerCls = Class.forName(pkgName + "." + folderName.toLowerCase());
        p.setup(markerCls, folderName.substring(0, 1).toUpperCase() + folderName.substring(1));
    } catch (Exception e) {
        p.setup(null, folderName.substring(0, 1).toUpperCase() + folderName.substring(1));
    }

    _customPaginae.add(p);
    _folderMap.put(fullId, p);
    return p;
  }

  private static String _callStatic(Class<?> cls, String methodName, String def) {
    if (cls == null) return def;
    try {
      Method m = cls.getMethod(methodName);
      Object res = m.invoke(null);
      return (res != null) ? res.toString() : def;
    } catch (Exception e) {
      return def;
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
    public String name;
    public String description;
    public String sortKey;
    public Class<?> sourceCls;
    private final MenuGrid.Pagina customParent;
    private Button customBtn;
    private Resource iconRes;
    private Tex customTex;

    public Pagina(String id, MenuGrid.Pagina parent, Resource defRes) {
      super(AppContext.menuGrid, id, defRes.indir());
      this.customParent = parent;
      this.iconRes = defRes;
    }

    public void setup(Class<?> cls, String defName) {
      this.sourceCls = cls;
      this.name = _callStatic(cls, "name", defName);
      this.description = _callStatic(cls, "info", name);
      this.sortKey = _callStatic(cls, "sortkey", null);
      
      String iconPath = _callStatic(cls, "icon", null);
      if (iconPath != null) {
        if (iconPath.startsWith("assets/")) {
          _loadCustomIcon(iconPath);
        } else {
          try {
            this.iconRes = Resource.remote().loadwait(iconPath);
            this.res = this.iconRes.indir();
            this.customTex = null;
          } catch (Exception e) {}
        }
      }
    }

    private void _loadCustomIcon(String path) {
      try {
        File f = new File(path);
        if (f.exists()) {
          BufferedImage img = ImageIO.read(f);
          if (img != null) {
            this.customTex = new TexI(img);
          }
        }
      } catch (Exception e) {
        System.err.println("Failed to load custom icon: " + path);
      }
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
          if (sortKey != null) return sortKey;
          String priority = (sourceCls != null && (Job.class.isAssignableFrom(sourceCls) || Action.class.isAssignableFrom(sourceCls))) 
                            ? "\ufffe\uffff" : "\ufffe\ufffe";
          return priority + pag.id.toString(); 
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
        if (customTex != null) {
          // Centering the 32x32 icon in the 32x32 button square
          g.image(customTex, Coord.z);
          return;
        }
        
        if (sourceCls != null && (Job.class.isAssignableFrom(sourceCls) || Action.class.isAssignableFrom(sourceCls))) {
            g.chcolor(230, 255, 230, 255);
            super.drawmain(g, spr);
            g.chcolor(); 
        } else {
            super.drawmain(g, spr);
        }
      }
    }
  }
}
