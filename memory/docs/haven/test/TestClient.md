# TestClient

This file documents the responsibilities and members of `TestClient`.

## Meta

- Source: [TestClient.java](../../../../src/haven/test/TestClient.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a test client harness.

## Nested Types

### TestUI

- Description: TODO

## Members

### Constants

### Fields

#### `public Session sess`

- Description: TODO

#### `public InetSocketAddress addr`

- Description: TODO

#### `public String user`

- Description: TODO

#### `public byte[] cookie`

- Description: TODO

#### `public ThreadGroup tg`

- Description: TODO

#### `public Thread me`

- Description: TODO

#### `public UI ui`

- Description: TODO

#### `public boolean loop = false`

- Description: TODO

#### `public Collection<Robot> robots = new HashSet<Robot>()`

- Description: TODO

#### `private static Object errsync = new Object()`

- Description: TODO

### Methods

#### `public TestClient(String user)`

- Description: TODO

#### `public void connect() throws InterruptedException`

- Description: TODO

#### `public void addbot(Robot bot)`

- Description: TODO

#### `public void rembot(Robot bot)`

- Description: TODO

#### `public void setmousepos(Coord c)`

- Description: TODO

#### `public TestUI(Coord sz, Session sess)`

- Description: TODO

#### `public void newwidgetp(int id, String type, int parent, Object[] pargs, Object... cargs) throws InterruptedException`

- Description: TODO

#### `public void destroy(Widget w)`

- Description: TODO

#### `public void uimsg(int id, String msg, Object... args)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public void start()`

- Description: TODO

#### `public void stop()`

- Description: TODO

#### `public boolean alive()`

- Description: TODO

#### `public void join()`

- Description: TODO

#### `public String toString()`

- Description: TODO
