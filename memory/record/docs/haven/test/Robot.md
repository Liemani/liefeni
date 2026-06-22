---
source: [Robot.java](../../../../../src/haven/test/Robot.java)
created: 2026-06-13
updated: 2026-06-14
---

# Robot

Provides a Haven test helper for robot.

## Members

### Constants

### Fields

#### `public TestClient c`
- Role: Caches the c value.
- Description: Caches the `c` value for reuse.

### Methods

#### `public Robot(TestClient cl)`
- Role: Creates a new Robot instance.
- Description: Constructs the Robot instance from the supplied inputs.

#### `public void destroy()`
- Role: Handles the destroy path.
- Description: Implements the destroy operation.

#### `public void newwdg(int id, Widget w, Object... args)`
- Role: Handles the newwdg path.
- Description: Implements the newwdg operation.

#### `public void dstwdg(int id, Widget w)`
- Role: Handles the dstwdg path.
- Description: Implements the dstwdg operation.

#### `public void uimsg(int id, Widget w, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.