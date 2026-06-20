---
source: [Hook.java](../../../../src/lmi/bridge/Hook.java)
created: 2026-06-13
updated: 2026-06-14
---

# Hook

Receives Haven callbacks and forwards them into LMI bridge actions.

## Members

### Constants

### Fields

### Methods

#### `public static void didMsgReceive(int id, String msg, Object... args)`
- Role: Handles the received message callback.
- Description: Supports the did msg receive operation used by the surrounding class.

#### `private static void _recursivePrintObject(int indent, Object... args)`
- Role: Recursively prints nested object values for debugging.
- Description: Supports the recursive print object operation used by the surrounding class.

#### `private static void _indent(int indent)`
- Role: Writes indentation for debug output.
- Description: Supports the indent operation used by the surrounding class.

#### `public static void willMsgSend(Widget sender, String msg, Object... args)`
- Role: Handles the outgoing message callback.
- Description: Supports the will msg send operation used by the surrounding class.

#### `public static void willQueueMessage(int seq)`
- Role: Handles the queued message callback.
- Description: Supports the will queue message operation used by the surrounding class.

#### `public static void didGetACK(RMessage rMessage)`
- Role: Handles the ACK callback.
- Description: Supports the did get ack operation used by the surrounding class.

#### `public static void newWidgetDidAdded(Widget widget)`
- Role: Handles the widget-added callback.
- Description: Supports the new widget did added operation used by the surrounding class.

#### `public static void flowerMenuDidDestroyed()`
- Role: Handles the flower menu destruction callback.
- Description: Supports the flower menu did destroyed operation used by the surrounding class.

#### `public static void progressDidAdded(GameUI.Progress widget)`
- Role: Handles the progress widget callback.
- Description: Supports the progress did added operation used by the surrounding class.

#### `public static void progressDidDestroyed()`
- Role: Handles the progress widget destruction callback.
- Description: Supports the progress did destroyed operation used by the surrounding class.

#### `public static boolean menuGridWillUse(MenuGrid.PagButton button)`
- Role: Handles the menu grid use callback.
- Description: Supports the menu grid will use operation used by the surrounding class.

#### `public static boolean willPaginaDropToBelt(MenuGrid.Pagina pag)`
- Role: Handles the pagina drop callback.
- Description: Supports the will pagina drop to belt operation used by the surrounding class.

#### `public static boolean didClicked(Coord2d coord2d, int mouseButton, ClickData clickData)`
- Role: Handles the click callback.
- Description: Supports the did clicked operation used by the surrounding class.

#### `public static boolean areaDidSelected(Coord first, Coord second)`
- Role: Handles the area selection callback.
- Description: Supports the area did selected operation used by the surrounding class.

#### `public static void keyDidDown(java.awt.event.KeyEvent keyEvent)`
- Role: Handles the key-down callback.
- Description: Supports the key did down operation used by the surrounding class.

#### `public static void remoteUIDidConstructed(RemoteUI remoteUI)`
- Role: Handles the remote UI construction callback.
- Description: Supports the remote uidid constructed operation used by the surrounding class.

#### `public static void mapViewDidDraw(MapView mapView, GOut g)`
- Role: Handles the map view draw callback.
- Description: Supports the map view did draw operation used by the surrounding class.

#### `public static void mapViewGobsDidFinishLoading(MapView mapView)`
- Role: Handles the map view loading callback.
- Description: Supports the map view gobs did finish loading operation used by the surrounding class.

#### `public static void didEnterPortal()`
- Role: Handles the portal-entry callback.
- Description: Supports the did enter portal operation used by the surrounding class.

#### `public static void didSpeak(long gobId, String msg)`
- Role: Handles the speech callback.
- Description: Supports the did speak operation used by the surrounding class.

#### `public static void plobDidPlaced(MapView.Plob plob)`
- Role: Handles the plob placement callback.
- Description: Supports the plob did placed operation used by the surrounding class.

#### `private static void _captureEnteringPortal(int mouseButton, ClickData clickData)`
- Role: Captures the entering portal from a click event.
- Description: Supports the capture entering portal operation used by the surrounding class.

#### `private static String _gobResname(ClickData clickData)`
- Role: Returns the gob resource name from click data.
- Description: Exposes the requested value without mutating state.

#### `private static Coord _gobPosition(ClickData clickData)`
- Role: Returns the gob position from click data.
- Description: Exposes the requested value without mutating state.
