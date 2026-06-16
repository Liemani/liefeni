# RMessage

This file documents the responsibilities and members of `RMessage`.

## Meta

- Source: [RMessage.java](../../../src/haven/RMessage.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the rmessage Haven component.

## Members

### Constants

#### `public static final int RMSG_NEWWDG = 0`
- Role: Defines the shared rmsg newwdg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_WDGMSG = 1`
- Role: Defines the shared rmsg wdgmsg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_DSTWDG = 2`
- Role: Defines the shared rmsg dstwdg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_MAPIV = 3`
- Role: Defines the shared rmsg mapiv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_GLOBLOB = 4`
- Role: Defines the shared rmsg globlob constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_RESID = 6`
- Role: Defines the shared rmsg resid constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_SESSKEY = 13`
- Role: Defines the shared rmsg sesskey constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_FRAGMENT = 14`
- Role: Defines the shared rmsg fragment constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_ADDWDG = 15`
- Role: Defines the shared rmsg addwdg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_WDGBAR = 16`
- Role: Defines the shared rmsg wdgbar constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int RMSG_USERAGENT = 17`
- Role: Defines the shared rmsg useragent constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public double first = 0, last = 0`
- Role: Stores the first value.
- Description: Backs the cached state for this file.

#### `public double first = 0, last = 0`
- Role: Stores the first value.
- Description: Backs the cached state for this file.

#### `public int retx = 0`
- Role: Stores the retx value.
- Description: Backs the cached state for this file.

#### `public int seq`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

### Methods

#### `public RMessage(int type, byte[] blob, int off, int len)`
- Role: Creates a new RMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public RMessage(int type, byte[] blob)`
- Role: Creates a new RMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public RMessage(int type)`
- Role: Creates a new RMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public RMessage(PMessage msg)`
- Role: Creates a new RMessage instance.
- Description: Constructs the instance and initializes its default state.
