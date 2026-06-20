---
source: [DumpBot.java](../../../../src/haven/test/DumpBot.java)
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
- Description: Constructs the instance and initializes its default state.

#### `public void newwdg(int id, Widget w, Object... args)`
- Role: Performs newwdg.
- Description: Supports the newwdg operation used by the surrounding class.

#### `public void dstwdg(int id, Widget w)`
- Role: Performs dstwdg.
- Description: Supports the dstwdg operation used by the surrounding class.

#### `public void uimsg(int id, Widget w, String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
