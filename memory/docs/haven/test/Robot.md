# Robot

This file documents the responsibilities and members of `Robot`.

## Meta

- Source: [Robot.java](../../../../src/haven/test/Robot.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a Haven test helper for robot.

## Members

### Constants

### Fields

#### `public TestClient c`
- Role: Holds the c state.
- Description: Backs the cached state for this file.

### Methods

#### `public Robot(TestClient cl)`
- Role: Creates a new Robot instance.
- Description: Constructs the instance and initializes its default state.

#### `public void destroy()`
- Role: Performs destroy.
- Description: Supports the destroy operation used by the surrounding class.

#### `public void newwdg(int id, Widget w, Object... args)`
- Role: Performs newwdg.
- Description: Supports the newwdg operation used by the surrounding class.

#### `public void dstwdg(int id, Widget w)`
- Role: Performs dstwdg.
- Description: Supports the dstwdg operation used by the surrounding class.

#### `public void uimsg(int id, Widget w, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
