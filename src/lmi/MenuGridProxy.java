package lmi;

import haven.*;
import agent.*;
import java.util.*;
import java.lang.reflect.Method;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class MenuGridProxy {
  public static final String LMI_PREFIX = "lmi_";
  public static final String JOB_PREFIX = "lmi_job_";
  public static final String EFFECT_PREFIX = "lmi_effect_";
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

  public static boolean isEffect(MenuGrid.Pagina pag) {
    return isLmi(pag) && ((String)pag.id).startsWith(EFFECT_PREFIX);
  }

  public static void init() {
    MenuGrid mg = AppContext.menuGrid();
    if (mg == null) return;

    try {
      _sharedRes = Resource.remote().loadwait(DEFAULT_ICON);
      _folderRes = Resource.remote().loadwait(FOLDER_ICON);
      _customPaginae.clear();
      _folderMap.clear();

      // 1. Core LMI Agent Root
      Pagina root = _getOrCreateFolder("agent", null);

      // 2. Build menu from shared registry
      _buildFromRegistry(root);

      apply();
      System.out.println("LMI MenuGridProxy initialized with local assets support.");
    } catch (Exception e) {
      System.err.println("Failed to initialize MenuGridProxy: " + e.getMessage());
      e.printStackTrace();
    }
  }

  private static void _buildFromRegistry(Pagina root) {
    for (AgentRegistry.Entry entry : AgentRegistry.executableEntries()) {
      Pagina parent = _ensureFolderPath(entry.packageName(), root);
      String prefix = (entry.kind() == AgentRegistry.Entry.Kind.JOB) ? JOB_PREFIX : EFFECT_PREFIX;
      String commandName = entry.commandName();
      Pagina p = new Pagina(prefix + commandName, parent, _sharedRes);
      p.setup(entry.cls(), commandName);
      _customPaginae.add(p);
    }
  }

  private static Pagina _ensureFolderPath(String packageName, Pagina root) {
    if ("agent".equals(packageName)) return root;

    Pagina parent = root;
    String[] parts = packageName.split("\\.");
    StringBuilder currentPackage = new StringBuilder("agent");
    for (int i = 1; i < parts.length; i++) {
      currentPackage.append('.').append(parts[i]);
      parent = _getOrCreateFolder(currentPackage.toString(), parent);
    }
    return parent;
  }

  private static Pagina _getOrCreateFolder(String packageName, Pagina parent) {
    String fullId = LMI_PREFIX + packageName.replace('.', '_');
    if (_folderMap.containsKey(fullId)) return _folderMap.get(fullId);

    Pagina p = new Pagina(fullId, parent, _folderRes);
    String folderName = packageName.substring(packageName.lastIndexOf('.') + 1);
    Class<?> markerCls = AgentRegistry.folderMetadataClass(packageName);
    try {
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
    MenuGrid mg = AppContext.menuGrid();
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

  public static void dumpAllIcons() {
    MenuGrid mg = AppContext.menuGrid();
    if (mg == null) {
      System.out.println("MenuGrid is not available.");
      return;
    }

    synchronized (mg.paginae) {
      for (MenuGrid.Pagina pagina : mg.paginae) {
        String id = String.valueOf(pagina.id);
        String parentId = (pagina.parent() != null) ? String.valueOf(pagina.parent().id) : "null";
        String resource = "null";
        try {
          Resource res = pagina.res();
          if (res != null)
            resource = res.name;
        } catch (Exception ignored) {
        }
        System.out.println(String.format("id=%s parent=%s resource=%s", id, parentId, resource));
      }
    }
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
      super(AppContext.menuGrid(), id, defRes.indir());
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
          return pag.id.toString();
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
        
        super.drawmain(g, spr);
      }
    }
  }
}
