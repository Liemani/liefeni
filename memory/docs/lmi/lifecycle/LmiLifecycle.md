# LmiLifecycle

This file documents the responsibilities and members of `LmiLifecycle`.

## Meta

- Source: [LmiLifecycle.java](../../../../src/lmi/lifecycle/LmiLifecycle.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Owns process, session, world, and widget lifecycle entry points.

## Members

### Constants

### Fields

#### `private static boolean isProcessInitialized`

- Description: TODO

#### `private static boolean isWorldEntered`

- Description: TODO

#### `private static boolean isWidgetsEntered`

- Description: TODO

### Methods

#### `private LmiLifecycle()`

- Description: TODO

#### `public static synchronized void initProcess()`

- Description: TODO

#### `public static synchronized void enterSession(Session session)`

- Description: TODO

#### `public static synchronized void leaveSession(Session session)`

- Description: TODO

#### `public static synchronized void setRootWidget(RootWidget rootWidget)`

- Description: TODO

#### `public static synchronized void setGameUI(GameUI gameUI)`

- Description: TODO

#### `public static synchronized void setMenuGrid(haven.MenuGrid menuGrid)`

- Description: TODO

#### `public static synchronized void setMapView(MapView mapView)`

- Description: TODO

#### `public static synchronized void enterWorld(MapView mapView)`

- Description: TODO

#### `public static synchronized void leaveWorld()`

- Description: TODO

#### `public static synchronized void syncWidgets()`

- Description: TODO

#### `public static synchronized void leaveWidgets()`

- Description: TODO

#### `private static boolean _widgetsReady()`

- Description: TODO
