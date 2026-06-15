# AppContext

This file documents the responsibilities and members of `AppContext`.

## Meta

- Source: [AppContext.java](../../../../src/lmi/core/AppContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Holds shared references to the current Haven session and UI-level state that is not owned by a specific bridge surface.
Avoids owning world/map-view references that now live in bridge helpers.

## Members

### Constants

### Fields

#### `public static MainFrame mainFrame`

- Description: TODO

#### `public static Thread mainThread`

- Description: TODO

#### `public static JOGLPanel joglPanel`

- Description: TODO

#### `public static UIPanel.Dispatcher dispatcher`

- Description: TODO

#### `public static RemoteUI remoteUI`

- Description: TODO

#### `public static UI ui`

- Description: TODO

#### `public static Session session`

- Description: TODO

#### `public static OCache oCache`

- Description: TODO

#### `public static RootWidget rootWidget`

- Description: TODO

#### `public static GameUI gameUI`

- Description: TODO

#### `public static MenuGrid menuGrid`

- Description: TODO

#### `public static List<IMeter> meterWidgets`

- Description: TODO

#### `public static IMeter hitPointMeter`

- Description: TODO

#### `public static IMeter staminaMeter`

- Description: TODO

#### `public static IMeter energyMeter`

- Description: TODO

#### `public static Equipory equipory`

- Description: TODO

#### `public static Inventory mainInventory`

- Description: TODO

### Methods

#### `public static void init()`

- Description: TODO

#### `public static void resetWidgetCache()`

- Description: TODO

#### `public static void resetSessionState()`

- Description: TODO

#### `public static void setMainFrame(MainFrame val)`

- Description: TODO

#### `public static void setMainThread(Thread val)`

- Description: TODO

#### `public static void setJOGLPanel(JOGLPanel val)`

- Description: TODO

#### `public static void setDispatcher(UIPanel.Dispatcher val)`

- Description: TODO

#### `public static void setRemoteUI(RemoteUI val)`

- Description: TODO

#### `public static void setUI(UI val)`

- Description: TODO

#### `public static void setRootWidget(RootWidget val)`

- Description: TODO

#### `public static void setGameUI(GameUI val)`

- Description: TODO

#### `public static void setMenuGrid(MenuGrid val)`

- Description: TODO

#### `public static void setSession(Session val)`

- Description: TODO

#### `public static void setOCache(OCache val)`

- Description: TODO

#### `public static void setEquipory(Equipory val)`

- Description: TODO

#### `public static void setMainInventory(Inventory val)`

- Description: TODO

#### `public static void addMeterWidget(IMeter meter)`

- Description: TODO

#### `private static IMeter findMeterWidget(String resourceSuffix)`

- Description: TODO

#### `public static IMeter hitPointMeter()`

- Description: TODO

#### `public static IMeter staminaMeter()`

- Description: TODO

#### `public static IMeter energyMeter()`

- Description: TODO

#### `public static GItem cursorGItem()`

- Description: TODO

#### `public static MenuGrid menuGrid()`

- Description: TODO

#### `public static GameUI gameUI()`

- Description: TODO

#### `public static RootWidget rootWidget()`

- Description: TODO

#### `public static UI ui()`

- Description: TODO

#### `public static Session session()`

- Description: TODO

#### `public static OCache oCache()`

- Description: TODO

#### `public static Equipory equipory()`

- Description: TODO

#### `public static Inventory mainInventory()`

- Description: TODO

#### `public static Indir<Resource> cursor()`

- Description: TODO

#### `public static ChatUI chatUI()`

- Description: TODO

#### `public static Window window()`

- Description: TODO

#### `public static Button button()`

- Description: TODO

#### `public static ISBox isbox()`

- Description: TODO

#### `public static Inventory inventory()`

- Description: TODO

#### `public static GItem gitem()`

- Description: TODO

#### `public static WItem witem()`

- Description: TODO

#### `static Coord getMouseLocation()`

- Description: TODO

#### `static void interruptMainThread()`

- Description: TODO

#### `static void closeSession()`

- Description: TODO
