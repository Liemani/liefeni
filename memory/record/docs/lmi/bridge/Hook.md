---
source: [Hook.java](../../../../../src/lmi/bridge/Hook.java)
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
- Description: Logs incoming Haven messages and hands them to the bridge-side handlers.

#### `private static void _recursivePrintObject(int indent, Object... args)`
- Role: Recursively prints nested object values for debugging.
- Description: Walks nested arguments so debug output stays readable.

#### `private static void _indent(int indent)`
- Role: Writes indentation for debug output.
- Description: Emits leading spaces for nested debug lines.

#### `public static void willMsgSend(Widget sender, String msg, Object... args)`
- Role: Handles the outgoing message callback.
- Description: Observes outgoing widget messages before Haven sends them.

#### `public static void willQueueMessage(int seq)`
- Role: Handles the queued message callback.
- Description: Records the sequence number of a queued Haven message.

#### `public static void didGetACK(RMessage rMessage)`
- Role: Handles the ACK callback.
- Description: Confirms that Haven acknowledged a queued message.

#### `public static void newWidgetDidAdded(Widget widget)`
- Role: Handles the widget-added callback.
- Description: Detects newly added widgets so LMI can attach bridge state.

#### `public static void flowerMenuDidDestroyed()`
- Role: Handles the flower menu destruction callback.
- Description: Clears flower-menu bridge state when the menu closes.

#### `public static void progressDidAdded(GameUI.Progress widget)`
- Role: Handles the progress widget callback.
- Description: Captures the progress widget when Haven creates it.

#### `public static void progressDidDestroyed()`
- Role: Handles the progress widget destruction callback.
- Description: Clears the stored progress widget when Haven removes it.

#### `public static boolean menuGridWillUse(MenuGrid.PagButton button)`
- Role: Handles the menu grid use callback.
- Description: Intercepts menu-grid usage so LMI actions can run first.

#### `public static boolean willPaginaDropToBelt(MenuGrid.Pagina pag)`
- Role: Handles the pagina drop callback.
- Description: Tracks pagina drops into the belt before Haven handles them.

#### `public static boolean didClicked(Coord2d coord2d, int mouseButton, ClickData clickData)`
- Role: Handles the click callback.
- Description: Captures click coordinates and button state for LMI actions.

#### `public static boolean areaDidSelected(Coord first, Coord second)`
- Role: Handles the area selection callback.
- Description: Reports the selected area corners to downstream actions.

#### `public static void keyDidDown(java.awt.event.KeyEvent keyEvent)`
- Role: Handles the key-down callback.
- Description: Forwards keyboard input to LMI hotkey handling.

#### `public static void remoteUIDidConstructed(RemoteUI remoteUI)`
- Role: Handles the remote UI construction callback.
- Description: Hooks the remote UI once Haven finishes constructing it.

#### `public static void mapViewDidDraw(MapView mapView, GOut g)`
- Role: Handles the map view draw callback.
- Description: Lets LMI overlays render during the map view draw pass.

#### `public static void mapViewGobsDidFinishLoading(MapView mapView)`
- Role: Handles the map view loading callback.
- Description: Signals that map gobs are ready for waypoint or overlay work.

#### `public static void didEnterPortal()`
- Role: Handles the portal-entry callback.
- Description: Marks the portal entry transition for lifecycle handling.

#### `public static void didSpeak(long gobId, String msg)`
- Role: Handles the speech callback.
- Description: Captures gob speech for debug or chat-related hooks.

#### `public static void plobDidPlaced(MapView.Plob plob)`
- Role: Handles the plob placement callback.
- Description: Stores the active placement object for later hook logic.

#### `private static void _captureEnteringPortal(int mouseButton, ClickData clickData)`
- Role: Captures the entering portal from a click event.
- Description: Extracts the portal target from the original click event.

#### `private static String _gobResname(ClickData clickData)`
- Role: Returns the gob resource name from click data.
- Description: Implements the gob resname operation.

#### `private static Coord _gobPosition(ClickData clickData)`
- Role: Returns the gob position from click data.
- Description: Implements the gob position operation.