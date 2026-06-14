# AppContext

## Meta

- Source: [AppContext.java](../../../../src/lmi/core/AppContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Holds shared references to the current Haven session and UI-level state that is not owned by a specific bridge surface.
- Avoids owning world/map-view references that now live in bridge helpers.

## Code Members

### Member Index

#### Fields

- [mainFrame](#member-1)
- [mainThread](#member-2)
- [joglPanel](#member-3)
- [dispatcher](#member-4)
- [remoteUI](#member-5)
- [ui](#member-6)
- [session](#member-7)
- [oCache](#member-8)
- [rootWidget](#member-9)
- [gameUI](#member-10)
- [menuGrid](#member-11)
- [meterWidgets](#member-12)
- [hitPointMeter](#member-13)
- [staminaMeter](#member-14)
- [energyMeter](#member-15)
- [equipory](#member-16)
- [mainInventory](#member-17)

#### Methods

- [init()](#member-18)
- [resetWidgetCache()](#member-19)
- [resetSessionState()](#member-20)
- [setMainFrame(MainFrame val)](#member-21)
- [setMainThread(Thread val)](#member-22)
- [setJOGLPanel(JOGLPanel val)](#member-23)
- [setDispatcher(UIPanel.Dispatcher val)](#member-24)
- [setRemoteUI(RemoteUI val)](#member-25)
- [setUI(UI val)](#member-26)
- [setRootWidget(RootWidget val)](#member-27)
- [setGameUI(GameUI val)](#member-28)
- [setMenuGrid(MenuGrid val)](#member-29)
- [setSession(Session val)](#member-30)
- [setOCache(OCache val)](#member-31)
- [setEquipory(Equipory val)](#member-32)
- [setMainInventory(Inventory val)](#member-33)
- [addMeterWidget(IMeter meter)](#member-34)
- [findMeterWidget(String resourceSuffix)](#member-35)
- [hitPointMeter()](#member-36)
- [staminaMeter()](#member-37)
- [energyMeter()](#member-38)
- [cursorGItem()](#member-39)
- [menuGrid()](#member-40)
- [gameUI()](#member-41)
- [rootWidget()](#member-42)
- [ui()](#member-43)
- [session()](#member-44)
- [oCache()](#member-45)
- [equipory()](#member-46)
- [mainInventory()](#member-47)
- [cursor()](#member-48)
- [chatUI()](#member-49)
- [window()](#member-50)
- [button()](#member-51)
- [isbox()](#member-52)
- [inventory()](#member-53)
- [gitem()](#member-54)
- [witem()](#member-55)
- [getMouseLocation()](#member-56)
- [interruptMainThread()](#member-57)
- [closeSession()](#member-58)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `mainFrame`

- Description: TODO

<a id="member-2"></a>
##### `mainThread`

- Description: TODO

<a id="member-3"></a>
##### `joglPanel`

- Description: TODO

<a id="member-4"></a>
##### `dispatcher`

- Description: TODO

<a id="member-5"></a>
##### `remoteUI`

- Description: TODO

<a id="member-6"></a>
##### `ui`

- Description: TODO

<a id="member-7"></a>
##### `session`

- Description: TODO

<a id="member-8"></a>
##### `oCache`

- Description: TODO

<a id="member-9"></a>
##### `rootWidget`

- Description: TODO

<a id="member-10"></a>
##### `gameUI`

- Description: TODO

<a id="member-11"></a>
##### `menuGrid`

- Description: TODO

<a id="member-12"></a>
##### `meterWidgets`

- Description: TODO

<a id="member-13"></a>
##### `hitPointMeter`

- Description: TODO

<a id="member-14"></a>
##### `staminaMeter`

- Description: TODO

<a id="member-15"></a>
##### `energyMeter`

- Description: TODO

<a id="member-16"></a>
##### `equipory`

- Description: TODO

<a id="member-17"></a>
##### `mainInventory`

- Description: TODO

#### Methods

<a id="member-18"></a>
##### `init()`

- Description: TODO

<a id="member-19"></a>
##### `resetWidgetCache()`

- Description: TODO

<a id="member-20"></a>
##### `resetSessionState()`

- Description: TODO

<a id="member-21"></a>
##### `setMainFrame(MainFrame val)`

- Description: TODO

<a id="member-22"></a>
##### `setMainThread(Thread val)`

- Description: TODO

<a id="member-23"></a>
##### `setJOGLPanel(JOGLPanel val)`

- Description: TODO

<a id="member-24"></a>
##### `setDispatcher(UIPanel.Dispatcher val)`

- Description: TODO

<a id="member-25"></a>
##### `setRemoteUI(RemoteUI val)`

- Description: TODO

<a id="member-26"></a>
##### `setUI(UI val)`

- Description: TODO

<a id="member-27"></a>
##### `setRootWidget(RootWidget val)`

- Description: TODO

<a id="member-28"></a>
##### `setGameUI(GameUI val)`

- Description: TODO

<a id="member-29"></a>
##### `setMenuGrid(MenuGrid val)`

- Description: TODO

<a id="member-30"></a>
##### `setSession(Session val)`

- Description: TODO

<a id="member-31"></a>
##### `setOCache(OCache val)`

- Description: TODO

<a id="member-32"></a>
##### `setEquipory(Equipory val)`

- Description: TODO

<a id="member-33"></a>
##### `setMainInventory(Inventory val)`

- Description: TODO

<a id="member-34"></a>
##### `addMeterWidget(IMeter meter)`

- Description: TODO

<a id="member-35"></a>
##### `findMeterWidget(String resourceSuffix)`

- Description: TODO

<a id="member-36"></a>
##### `hitPointMeter()`

- Description: TODO

<a id="member-37"></a>
##### `staminaMeter()`

- Description: TODO

<a id="member-38"></a>
##### `energyMeter()`

- Description: TODO

<a id="member-39"></a>
##### `cursorGItem()`

- Description: TODO

<a id="member-40"></a>
##### `menuGrid()`

- Description: TODO

<a id="member-41"></a>
##### `gameUI()`

- Description: TODO

<a id="member-42"></a>
##### `rootWidget()`

- Description: TODO

<a id="member-43"></a>
##### `ui()`

- Description: TODO

<a id="member-44"></a>
##### `session()`

- Description: TODO

<a id="member-45"></a>
##### `oCache()`

- Description: TODO

<a id="member-46"></a>
##### `equipory()`

- Description: TODO

<a id="member-47"></a>
##### `mainInventory()`

- Description: TODO

<a id="member-48"></a>
##### `cursor()`

- Description: TODO

<a id="member-49"></a>
##### `chatUI()`

- Description: TODO

<a id="member-50"></a>
##### `window()`

- Description: TODO

<a id="member-51"></a>
##### `button()`

- Description: TODO

<a id="member-52"></a>
##### `isbox()`

- Description: TODO

<a id="member-53"></a>
##### `inventory()`

- Description: TODO

<a id="member-54"></a>
##### `gitem()`

- Description: TODO

<a id="member-55"></a>
##### `witem()`

- Description: TODO

<a id="member-56"></a>
##### `getMouseLocation()`

- Description: TODO

<a id="member-57"></a>
##### `interruptMainThread()`

- Description: TODO

<a id="member-58"></a>
##### `closeSession()`

- Description: TODO
