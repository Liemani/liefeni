---
source: [DumpBot.java](../../../../../src/haven/test/DumpBot.java)
created: 2026-06-13
updated: 2026-06-14
---

# DumpBot

Provides a Haven test helper for dump bot.

## Members

### Constants

### Fields

### Methods

#### `public DumpBot(TestClient c)`
- Role: Creates a new DumpBot instance.
- Description: Constructs the DumpBot instance from the supplied inputs.

#### `public void newwdg(int id, Widget w, Object... args)`
- Role: Handles the newwdg path.
- Description: Implements the newwdg operation.

#### `public void dstwdg(int id, Widget w)`
- Role: Handles the dstwdg path.
- Description: Implements the dstwdg operation.

#### `public void uimsg(int id, Widget w, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.