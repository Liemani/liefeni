# RMessage

This file documents the responsibilities and members of `RMessage`.

## Meta

- Source: [RMessage.java](../../../src/haven/RMessage.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a received network message.

## Members

### Constants

#### `public static final int RMSG_NEWWDG = 0`

- Description: TODO

#### `public static final int RMSG_WDGMSG = 1`

- Description: TODO

#### `public static final int RMSG_DSTWDG = 2`

- Description: TODO

#### `public static final int RMSG_MAPIV = 3`

- Description: TODO

#### `public static final int RMSG_GLOBLOB = 4`

- Description: TODO

#### `public static final int RMSG_RESID = 6`

- Description: TODO

#### `public static final int RMSG_SESSKEY = 13`

- Description: TODO

#### `public static final int RMSG_FRAGMENT = 14`

- Description: TODO

#### `public static final int RMSG_ADDWDG = 15`

- Description: TODO

#### `public static final int RMSG_WDGBAR = 16`

- Description: TODO

#### `public static final int RMSG_USERAGENT = 17`

- Description: TODO

### Fields

#### `public double first = 0, last = 0`

- Description: TODO

#### `public double first = 0, last = 0`

- Description: TODO

#### `public int retx = 0`

- Description: TODO

#### `public int seq`

- Description: TODO

### Methods

#### `public RMessage(int type, byte[] blob, int off, int len)`

- Description: TODO

#### `public RMessage(int type, byte[] blob)`

- Description: TODO

#### `public RMessage(int type)`

- Description: TODO

#### `public RMessage(PMessage msg)`

- Description: TODO
