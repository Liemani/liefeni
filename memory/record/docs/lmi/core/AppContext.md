---
source: [AppContext.java](../../../../src/lmi/core/AppContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# AppContext

Owns shared LMI application context and service wiring.

## Members

### Constants

### Fields

#### `public static MainFrame mainFrame`
- Role: Holds the main frame state.
- Description: Backs the cached state for this file.

#### `public static Thread mainThread`
- Role: Coordinates asynchronous app context work.
- Description: Supports the main thread operation used by the surrounding class.

#### `public static JOGLPanel joglPanel`
- Role: Holds the jogl panel state.
- Description: Backs the cached state for this file.

#### `public static UIPanel.Dispatcher dispatcher`
- Role: Stores the dispatcher value.
- Description: Backs the cached state for this file.

#### `public static RemoteUI remoteUI`
- Role: Stores the remote UI value.
- Description: Backs the cached state for this file.

#### `public static UI ui`
- Role: Stores the UI value.
- Description: Backs the cached state for this file.

#### `public static Session session`
- Role: Stores the session value.
- Description: Backs the cached state for this file.

#### `public static OCache oCache`
- Role: Caches o cache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public static RootWidget rootWidget`
- Role: Stores the root widget value.
- Description: Backs the cached state for this file.

#### `public static GameUI gameUI`
- Role: Stores the game UI value.
- Description: Backs the cached state for this file.

#### `public static MenuGrid menuGrid`
- Role: Stores the menu grid value.
- Description: Backs the cached state for this file.

#### `public static List<IMeter> meterWidgets`
- Role: Caches meter widgets entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public static IMeter hitPointMeter`
- Role: Stores the hit point meter value.
- Description: Backs the cached state for this file.

#### `public static IMeter staminaMeter`
- Role: Stores the stamina meter value.
- Description: Backs the cached state for this file.

#### `public static IMeter energyMeter`
- Role: Stores the energy meter value.
- Description: Backs the cached state for this file.

#### `public static Equipory equipory`
- Role: Stores the equipory value.
- Description: Backs the cached state for this file.

#### `public static Inventory mainInventory`
- Role: Holds the main inventory state.
- Description: Backs the cached state for this file.

### Methods

#### `public static void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public static void resetWidgetCache()`
- Role: Performs reset widget cache.
- Description: Supports the reset widget cache operation used by the surrounding class.

#### `public static void resetSessionState()`
- Role: Performs reset session state.
- Description: Supports the reset session state operation used by the surrounding class.

#### `public static void setMainFrame(MainFrame val)`
- Role: Sets the main frame.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setMainThread(Thread val)`
- Role: Sets the main thread.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setJOGLPanel(JOGLPanel val)`
- Role: Sets the jogl panel.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setDispatcher(UIPanel.Dispatcher val)`
- Role: Sets the dispatcher.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setRemoteUI(RemoteUI val)`
- Role: Sets the remote ui.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setUI(UI val)`
- Role: Sets the ui.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setRootWidget(RootWidget val)`
- Role: Updates the root widget reference.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setGameUI(GameUI val)`
- Role: Updates the game UI reference.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setMenuGrid(MenuGrid val)`
- Role: Updates the menu grid reference.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setSession(Session val)`
- Role: Sets the session.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setOCache(OCache val)`
- Role: Sets the o cache.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setEquipory(Equipory val)`
- Role: Sets the equipory.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void setMainInventory(Inventory val)`
- Role: Sets the main inventory.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void addMeterWidget(IMeter meter)`
- Role: Adds the meter widget.
- Description: Adds the meter widget to the current collection or state.

#### `private static IMeter findMeterWidget(String resourceSuffix)`
- Role: Returns the meter widget.
- Description: Exposes the requested value without mutating state.

#### `public static IMeter hitPointMeter()`
- Role: Performs hit point meter.
- Description: Supports the hit point meter operation used by the surrounding class.

#### `public static IMeter staminaMeter()`
- Role: Performs stamina meter.
- Description: Supports the stamina meter operation used by the surrounding class.

#### `public static IMeter energyMeter()`
- Role: Performs energy meter.
- Description: Supports the energy meter operation used by the surrounding class.

#### `public static GItem cursorGItem()`
- Role: Performs cursor gitem.
- Description: Supports the cursor gitem operation used by the surrounding class.

#### `public static MenuGrid menuGrid()`
- Role: Performs menu grid.
- Description: Supports the menu grid operation used by the surrounding class.

#### `public static GameUI gameUI()`
- Role: Performs game ui.
- Description: Supports the game ui operation used by the surrounding class.

#### `public static RootWidget rootWidget()`
- Role: Performs root widget.
- Description: Supports the root widget operation used by the surrounding class.

#### `public static UI ui()`
- Role: Performs ui.
- Description: Supports the ui operation used by the surrounding class.

#### `public static Session session()`
- Role: Performs session.
- Description: Supports the session operation used by the surrounding class.

#### `public static OCache oCache()`
- Role: Performs o cache.
- Description: Supports the o cache operation used by the surrounding class.

#### `public static Equipory equipory()`
- Role: Performs equipory.
- Description: Supports the equipory operation used by the surrounding class.

#### `public static Inventory mainInventory()`
- Role: Performs main inventory.
- Description: Supports the main inventory operation used by the surrounding class.

#### `public static Indir<Resource> cursor()`
- Role: Performs cursor.
- Description: Supports the cursor operation used by the surrounding class.

#### `public static ChatUI chatUI()`
- Role: Performs chat ui.
- Description: Supports the chat ui operation used by the surrounding class.

#### `public static Window window()`
- Role: Performs window.
- Description: Supports the window operation used by the surrounding class.

#### `public static Button button()`
- Role: Performs button.
- Description: Supports the button operation used by the surrounding class.

#### `public static ISBox isbox()`
- Role: Performs isbox.
- Description: Supports the isbox operation used by the surrounding class.

#### `public static Inventory inventory()`
- Role: Performs inventory.
- Description: Supports the inventory operation used by the surrounding class.

#### `public static GItem gitem()`
- Role: Performs gitem.
- Description: Supports the gitem operation used by the surrounding class.

#### `public static WItem witem()`
- Role: Performs witem.
- Description: Supports the witem operation used by the surrounding class.

#### `static Coord getMouseLocation()`
- Role: Returns the mouse location.
- Description: Exposes the requested value without mutating state.

#### `static void interruptMainThread()`
- Role: Performs interrupt main thread.
- Description: Supports the interrupt main thread operation used by the surrounding class.

#### `static void closeSession()`
- Role: Closes the session.
- Description: Supports the close session operation used by the surrounding class.
