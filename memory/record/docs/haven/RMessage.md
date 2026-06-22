---
source: [RMessage.java](../../../../src/haven/RMessage.java)
created: 2026-06-13
updated: 2026-06-14
---

# RMessage

Represents the rmessage Haven component.

## Members

### Constants

#### `public static final int RMSG_NEWWDG = 0`
- Role: Caches the rmsg newwdg value.
- Description: Caches the `RMSG_NEWWDG` value for reuse.
- Value: `0`

#### `public static final int RMSG_WDGMSG = 1`
- Role: Caches the rmsg wdgmsg value.
- Description: Caches the `RMSG_WDGMSG` value for reuse.
- Value: `1`

#### `public static final int RMSG_DSTWDG = 2`
- Role: Caches the rmsg dstwdg value.
- Description: Caches the `RMSG_DSTWDG` value for reuse.
- Value: `2`

#### `public static final int RMSG_MAPIV = 3`
- Role: Caches the rmsg mapiv value.
- Description: Caches the `RMSG_MAPIV` value for reuse.
- Value: `3`

#### `public static final int RMSG_GLOBLOB = 4`
- Role: Caches the rmsg globlob value.
- Description: Caches the `RMSG_GLOBLOB` value for reuse.
- Value: `4`

#### `public static final int RMSG_RESID = 6`
- Role: Caches the rmsg resid value.
- Description: Caches the `RMSG_RESID` value for reuse.
- Value: `6`

#### `public static final int RMSG_SESSKEY = 13`
- Role: Caches the rmsg sesskey value.
- Description: Caches the `RMSG_SESSKEY` value for reuse.
- Value: `13`

#### `public static final int RMSG_FRAGMENT = 14`
- Role: Caches the rmsg fragment value.
- Description: Caches the `RMSG_FRAGMENT` value for reuse.
- Value: `14`

#### `public static final int RMSG_ADDWDG = 15`
- Role: Caches the rmsg addwdg value.
- Description: Caches the `RMSG_ADDWDG` value for reuse.
- Value: `15`

#### `public static final int RMSG_WDGBAR = 16`
- Role: Caches the rmsg wdgbar value.
- Description: Caches the `RMSG_WDGBAR` value for reuse.
- Value: `16`

#### `public static final int RMSG_USERAGENT = 17`
- Role: Caches the rmsg useragent value.
- Description: Caches the `RMSG_USERAGENT` value for reuse.
- Value: `17`

### Fields

#### `public double first = 0, last = 0`
- Role: Caches the first value.
- Description: Caches the `first` value for reuse.

#### `public double first = 0, last = 0`
- Role: Caches the first value.
- Description: Caches the `first` value for reuse.

#### `public int retx = 0`
- Role: Caches the retx value.
- Description: Caches the `retx` value for reuse.

#### `public int seq`
- Role: Caches the seq value.
- Description: Caches the `seq` value for reuse.

### Methods

#### `public RMessage(int type, byte[] blob, int off, int len)`
- Role: Creates a new RMessage instance.
- Description: Constructs the RMessage instance from the supplied inputs.

#### `public RMessage(int type, byte[] blob)`
- Role: Creates a new RMessage instance.
- Description: Constructs the RMessage instance from the supplied inputs.

#### `public RMessage(int type)`
- Role: Creates a new RMessage instance.
- Description: Constructs the RMessage instance from the supplied inputs.

#### `public RMessage(PMessage msg)`
- Role: Creates a new RMessage instance.
- Description: Constructs the RMessage instance from the supplied inputs.