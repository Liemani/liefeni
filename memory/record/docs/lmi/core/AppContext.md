---
source: [AppContext.java](../../../../../src/lmi/core/AppContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# AppContext

Owns shared LMI application context and service wiring.

## Members

### Constants

### Fields

#### `public static MainFrame mainFrame`
- Role: Caches the main frame value.
- Description: Caches the `mainFrame` value for reuse.

#### `public static Thread mainThread`
- Role: Coordinates asynchronous app context work.
- Description: Stores the UI thread that owns the main Haven event loop.

#### `public static JOGLPanel joglPanel`
- Role: Caches the active OpenGL panel.
- Description: Caches the active OpenGL panel.

#### `public static UIPanel.Dispatcher dispatcher`
- Role: Caches the UI dispatcher that receives Haven events.
- Description: Caches the UI dispatcher that receives Haven events.

#### `public static RemoteUI remoteUI`
- Role: Caches the remote UI bridge for the active session.
- Description: Caches the remote UI bridge for the active session.

#### `public static UI ui`
- Role: Caches the active Haven UI instance.
- Description: Caches the active Haven UI instance.

#### `public static Session session`
- Role: Caches the active network session.
- Description: Caches the active network session.

#### `public static OCache oCache`
- Role: Caches the current object cache.
- Description: Caches the current object cache.

#### `public static RootWidget rootWidget`
- Role: Caches the root widget attached to the active UI.
- Description: Caches the root widget attached to the active UI.

#### `public static GameUI gameUI`
- Role: Caches the in-game UI widget.
- Description: Caches the in-game UI widget.

#### `public static MenuGrid menuGrid`
- Role: Caches the action menu widget.
- Description: Caches the action menu widget.

#### `public static List<IMeter> meterWidgets`
- Role: Caches meter widgets so HUD meters can be resolved quickly.
- Description: Caches meter widgets so HUD meters can be resolved quickly.

#### `public static IMeter hitPointMeter`
- Role: Caches the resolved hit point meter widget.
- Description: Caches the resolved hit point meter widget.

#### `public static IMeter staminaMeter`
- Role: Caches the resolved stamina meter widget.
- Description: Caches the resolved stamina meter widget.

#### `public static IMeter energyMeter`
- Role: Caches the resolved energy meter widget.
- Description: Caches the resolved energy meter widget.

#### `public static Equipory equipory`
- Role: Caches the equipment window for the active UI.
- Description: Caches the equipment window for the active UI.

#### `public static Inventory mainInventory`
- Role: Caches the main inventory widget.
- Description: Caches the main inventory widget.

### Methods

#### `public static void init()`
- Role: Initializes shared app context state.
- Description: Initializes the meter widget cache.

#### `public static void resetWidgetCache()`
- Role: Clears widget cache state.
- Description: Clears cached widget references and meter state.

#### `public static void resetSessionState()`
- Role: Clears session state.
- Description: Clears session, UI, and widget cache state.

#### `public static void setMainFrame(MainFrame val)`
- Role: Sets the main frame.
- Description: Stores the main frame reference.

#### `public static void setMainThread(Thread val)`
- Role: Sets the main thread.
- Description: Stores the main UI thread reference.

#### `public static void setJOGLPanel(JOGLPanel val)`
- Role: Sets the jogl panel.
- Description: Stores the JOGL panel reference.

#### `public static void setDispatcher(UIPanel.Dispatcher val)`
- Role: Sets the dispatcher.
- Description: Stores the UI panel dispatcher reference.

#### `public static void setRemoteUI(RemoteUI val)`
- Role: Sets the remote ui.
- Description: Stores the remote UI reference.

#### `public static void setUI(UI val)`
- Role: Sets the ui.
- Description: Stores the active UI reference.

#### `public static void setRootWidget(RootWidget val)`
- Role: Updates the root widget reference.
- Description: Updates the cached root widget reference.

#### `public static void setGameUI(GameUI val)`
- Role: Updates the game UI reference.
- Description: Updates the cached in-game UI reference.

#### `public static void setMenuGrid(MenuGrid val)`
- Role: Updates the menu grid reference.
- Description: Updates the cached action menu reference.

#### `public static void setSession(Session val)`
- Role: Sets the session.
- Description: Updates the cached active session reference.

#### `public static void setOCache(OCache val)`
- Role: Sets the o cache.
- Description: Updates the cached object cache reference.

#### `public static void setEquipory(Equipory val)`
- Role: Sets the equipory.
- Description: Updates the cached equipment window reference.

#### `public static void setMainInventory(Inventory val)`
- Role: Sets the main inventory.
- Description: Updates the cached main inventory reference.

#### `public static void addMeterWidget(IMeter meter)`
- Role: Adds the meter widget.
- Description: Adds a meter widget unless it is already cached.

#### `private static IMeter findMeterWidget(String resourceSuffix)`
- Role: Finds a meter widget.
- Description: Locates a cached meter widget by resource suffix.

#### `public static IMeter hitPointMeter()`
- Role: Returns the hit point meter.
- Description: Returns the cached hit point meter, loading it on demand.

#### `public static IMeter staminaMeter()`
- Role: Returns the stamina meter.
- Description: Returns the cached stamina meter, loading it on demand.

#### `public static IMeter energyMeter()`
- Role: Returns the energy meter.
- Description: Returns the cached energy meter, loading it on demand.

#### `public static GItem cursorGItem()`
- Role: Returns the cursor item.
- Description: Finds the dragged item currently attached to the GameUI.

#### `public static MenuGrid menuGrid()`
- Role: Returns the menu grid.
- Description: Returns the cached action menu widget.

#### `public static GameUI gameUI()`
- Role: Returns the game UI.
- Description: Returns the cached in-game UI widget.

#### `public static RootWidget rootWidget()`
- Role: Returns the root widget.
- Description: Returns the cached root widget.

#### `public static UI ui()`
- Role: Returns the UI.
- Description: Returns the cached UI instance.

#### `public static Session session()`
- Role: Returns the session.
- Description: Returns the cached active session.

#### `public static OCache oCache()`
- Role: Returns the o cache.
- Description: Returns the cached object cache.

#### `public static Equipory equipory()`
- Role: Returns the equipory.
- Description: Returns the cached equipment window.

#### `public static Inventory mainInventory()`
- Role: Returns the main inventory.
- Description: Returns the cached main inventory widget.

#### `public static Indir<Resource> cursor()`
- Role: Returns the cursor resource.
- Description: Returns the current root-widget cursor resource if one is attached.

#### `public static ChatUI chatUI()`
- Role: Returns the chat UI.
- Description: Returns the ChatUI attached to the current GameUI, if any.

#### `public static Window window()`
- Role: Returns the current window.
- Description: Returns the first window attached to the current GameUI, if any.

#### `public static Button button()`
- Role: Returns the current button.
- Description: Returns the first Button inside the active window, if any.

#### `public static ISBox isbox()`
- Role: Returns the current item stack box.
- Description: Returns the first ISBox inside the active window, if any.

#### `public static Inventory inventory()`
- Role: Returns the current inventory.
- Description: Returns the first Inventory inside the active window, if any.

#### `public static GItem gitem()`
- Role: Returns the current item.
- Description: Returns the first GItem inside the active inventory, if any.

#### `public static WItem witem()`
- Role: Returns the current window item.
- Description: Returns the first WItem inside the active inventory, if any.

#### `static Coord getMouseLocation()`
- Role: Returns the mouse location.
- Description: Returns the current mouse coordinate from the UI.

#### `static void interruptMainThread()`
- Role: Handles the interrupt main thread path.
- Description: Interrupts the thread stored in `mainThread`.

#### `static void closeSession()`
- Role: Closes the session.
- Description: Closes the active Haven session attached to `ui`.