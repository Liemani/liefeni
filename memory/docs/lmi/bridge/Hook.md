# Hook

This file documents the responsibilities and members of `Hook`.

## Meta

- Source: [Hook.java](../../../../src/lmi/bridge/Hook.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Acts as the narrow Haven-to-LMI bridge for concrete event callbacks.

## Members

### Constants

### Fields

### Methods

#### `public static void didMsgReceive(int id, String msg, Object... args)`

- Description: TODO

#### `private static void _recursivePrintObject(int indent, Object... args)`

- Description: TODO

#### `private static void _indent(int indent)`

- Description: TODO

#### `public static void willMsgSend(Widget sender, String msg, Object... args)`

- Description: TODO

#### `public static void willQueueMessage(int seq)`

- Description: TODO

#### `public static void didGetACK(RMessage rMessage)`

- Description: TODO

#### `public static void newWidgetDidAdded(Widget widget)`

- Description: TODO

#### `public static void flowerMenuDidDestroyed()`

- Description: TODO

#### `public static void progressDidAdded(GameUI.Progress widget)`

- Description: TODO

#### `public static void progressDidDestroyed()`

- Description: TODO

#### `public static boolean menuGridWillUse(MenuGrid.PagButton button)`

- Description: TODO

#### `public static boolean willPaginaDropToBelt(MenuGrid.Pagina pag)`

- Description: TODO

#### `public static boolean didClicked(Coord2d coord2d, int mouseButton, ClickData clickData)`

- Description: TODO

#### `public static boolean areaDidSelected(Coord first, Coord second)`

- Description: TODO

#### `public static void keyDidDown(java.awt.event.KeyEvent keyEvent)`

- Description: TODO

#### `public static void remoteUIDidConstructed(RemoteUI remoteUI)`

- Description: TODO

#### `public static void mapViewDidDraw(MapView mapView, GOut g)`

- Description: TODO

#### `public static void mapViewGobsDidFinishLoading(MapView mapView)`

- Description: TODO

#### `public static void didEnterPortal()`

- Description: TODO

#### `public static void didSpeak(long gobId, String msg)`

- Description: TODO

#### `public static void plobDidPlaced(MapView.Plob plob)`

- Description: TODO

#### `private static void _captureEnteringPortal(int mouseButton, ClickData clickData)`

- Description: TODO

#### `private static String _gobResname(ClickData clickData)`

- Description: TODO

#### `private static Coord _gobPosition(ClickData clickData)`

- Description: TODO
