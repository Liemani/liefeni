# Hook

## Meta

- Source: [Hook.java](../../../../src/lmi/Hook.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Acts as the narrow Haven-to-LMI bridge for concrete event callbacks.

## Code Members

### Member Index

#### Methods

- [didMsgReceive(int id, String msg, Object... args)](#member-1)
- [_recursivePrintObject(int indent, Object... args)](#member-2)
- [_indent(int indent)](#member-3)
- [willMsgSend(Widget sender, String msg, Object... args)](#member-4)
- [willQueueMessage(int seq)](#member-5)
- [didGetACK(RMessage rMessage)](#member-6)
- [newWidgetDidAdded(Widget widget)](#member-7)
- [flowerMenuDidDestroyed()](#member-8)
- [progressDidAdded(GameUI.Progress widget)](#member-9)
- [progressDidDestroyed()](#member-10)
- [menuGridWillUse(MenuGrid.PagButton button)](#member-11)
- [willPaginaDropToBelt(MenuGrid.Pagina pag)](#member-12)
- [didClicked(Coord2d coord2d, int mouseButton, ClickData clickData)](#member-13)
- [areaDidSelected(Coord first, Coord second)](#member-14)
- [keyDidDown(java.awt.event.KeyEvent keyEvent)](#member-15)
- [remoteUIDidConstructed(RemoteUI remoteUI)](#member-16)
- [mapViewDidDraw(MapView mapView, GOut g)](#member-17)
- [mapViewGobsDidFinishLoading(MapView mapView)](#member-18)
- [didEnterPortal()](#member-19)
- [didSpeak(long gobId, String msg)](#member-20)
- [plobDidPlaced(MapView.Plob plob)](#member-21)
- [_captureEnteringPortal(int mouseButton, ClickData clickData)](#member-22)
- [_gobResname(ClickData clickData)](#member-23)
- [_gobPosition(ClickData clickData)](#member-24)

### Member Reference

#### Methods

<a id="member-1"></a>
##### `didMsgReceive(int id, String msg, Object... args)`

- Description: TODO

<a id="member-2"></a>
##### `_recursivePrintObject(int indent, Object... args)`

- Description: TODO

<a id="member-3"></a>
##### `_indent(int indent)`

- Description: TODO

<a id="member-4"></a>
##### `willMsgSend(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-5"></a>
##### `willQueueMessage(int seq)`

- Description: TODO

<a id="member-6"></a>
##### `didGetACK(RMessage rMessage)`

- Description: TODO

<a id="member-7"></a>
##### `newWidgetDidAdded(Widget widget)`

- Description: TODO

<a id="member-8"></a>
##### `flowerMenuDidDestroyed()`

- Description: TODO

<a id="member-9"></a>
##### `progressDidAdded(GameUI.Progress widget)`

- Description: TODO

<a id="member-10"></a>
##### `progressDidDestroyed()`

- Description: TODO

<a id="member-11"></a>
##### `menuGridWillUse(MenuGrid.PagButton button)`

- Description: TODO

<a id="member-12"></a>
##### `willPaginaDropToBelt(MenuGrid.Pagina pag)`

- Description: TODO

<a id="member-13"></a>
##### `didClicked(Coord2d coord2d, int mouseButton, ClickData clickData)`

- Description: TODO

<a id="member-14"></a>
##### `areaDidSelected(Coord first, Coord second)`

- Description: TODO

<a id="member-15"></a>
##### `keyDidDown(java.awt.event.KeyEvent keyEvent)`

- Description: TODO

<a id="member-16"></a>
##### `remoteUIDidConstructed(RemoteUI remoteUI)`

- Description: TODO

<a id="member-17"></a>
##### `mapViewDidDraw(MapView mapView, GOut g)`

- Description: TODO

<a id="member-18"></a>
##### `mapViewGobsDidFinishLoading(MapView mapView)`

- Description: TODO

<a id="member-19"></a>
##### `didEnterPortal()`

- Description: TODO

<a id="member-20"></a>
##### `didSpeak(long gobId, String msg)`

- Description: TODO

<a id="member-21"></a>
##### `plobDidPlaced(MapView.Plob plob)`

- Description: TODO

<a id="member-22"></a>
##### `_captureEnteringPortal(int mouseButton, ClickData clickData)`

- Description: TODO

<a id="member-23"></a>
##### `_gobResname(ClickData clickData)`

- Description: TODO

<a id="member-24"></a>
##### `_gobPosition(ClickData clickData)`

- Description: TODO
