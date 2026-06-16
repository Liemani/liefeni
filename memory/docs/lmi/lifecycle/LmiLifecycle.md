# LmiLifecycle

This file documents the responsibilities and members of `LmiLifecycle`.

## Meta

- Source: [LmiLifecycle.java](../../../../src/lmi/lifecycle/LmiLifecycle.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Owns lifecycle transitions across session, world, and widget events.

## Members

### Constants

### Fields

#### `private static boolean isProcessInitialized`
- Role: Tracks whether the process initialized is initialized.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static boolean isWorldEntered`
- Role: Tracks whether the world entered is entered.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static boolean isWidgetsEntered`
- Role: Tracks whether the widgets entered is entered.
- Description: Boolean flag used to guard the surrounding lifecycle state.

### Methods

#### `private LmiLifecycle()`
- Role: Creates a new LmiLifecycle instance.
- Description: Constructs the instance and initializes its default state.

#### `public static synchronized void initProcess()`
- Role: Initializes the LMI process lifecycle.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static synchronized void enterSession(Session session)`
- Role: Enters the current session.
- Description: Enters the current session and updates lifecycle state accordingly.

#### `public static synchronized void leaveSession(Session session)`
- Role: Leaves the current session.
- Description: Leaves the current session and updates lifecycle state accordingly.

#### `public static synchronized void setRootWidget(RootWidget rootWidget)`
- Role: Updates the root widget reference.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static synchronized void setGameUI(GameUI gameUI)`
- Role: Updates the game UI reference.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static synchronized void setMenuGrid(haven.MenuGrid menuGrid)`
- Role: Updates the menu grid reference.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static synchronized void setMapView(MapView mapView)`
- Role: Updates the map view reference.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static synchronized void enterWorld(MapView mapView)`
- Role: Enters the current world.
- Description: Enters the current world and updates lifecycle state accordingly.

#### `public static synchronized void leaveWorld()`
- Role: Leaves the current world.
- Description: Leaves the current world and updates lifecycle state accordingly.

#### `public static synchronized void syncWidgets()`
- Role: Synchronizes widget state.
- Description: Supports the sync widgets operation used by the surrounding class.

#### `public static synchronized void leaveWidgets()`
- Role: Leaves the widget tree.
- Description: Leaves the widget tree and updates lifecycle state accordingly.

#### `private static boolean _widgetsReady()`
- Role: Checks whether the widget tree is ready.
- Description: Returns a boolean result for the described condition.
