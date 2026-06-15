# WorkshopLauncher

This file documents the responsibilities and members of `WorkshopLauncher`.

## Meta

- Source: [WorkshopLauncher.java](../../../src/haven/WorkshopLauncher.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Launches workshop-related UI.

## Nested Types

### Chooser

- Description: TODO

### ClassUnloader

- Description: TODO

### Client

- Description: TODO

### MessageException

- Description: TODO

### Updater

- Description: TODO

## Members

### Constants

### Fields

#### `public final UGItem item`

- Description: TODO

#### `public final Path path`

- Description: TODO

#### `public final Properties props`

- Description: TODO

#### `public final URI unload`

- Description: TODO

#### `public final List<Client> clients`

- Description: TODO

#### `private JList clist`

- Description: TODO

#### `private JCheckBox memo`

- Description: TODO

#### `private JButton lbtn`

- Description: TODO

#### `public final Iterator<UGItem> items`

- Description: TODO

#### `private JProgressBar prog`

- Description: TODO

### Methods

#### `public Client(UGItem item, Path path, Properties props)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public MessageException(String msg)`

- Description: TODO

#### `public static Path findjvm() throws IOException`

- Description: TODO

#### `public static void centerwnd(JFrame wnd)`

- Description: TODO

#### `public ClassUnloader()`

- Description: TODO

#### `private boolean resunloadp(URL url)`

- Description: TODO

#### `public URL getResource(String name)`

- Description: TODO

#### `public Enumeration<URL> getResources(String name) throws IOException`

- Description: TODO

#### `public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException`

- Description: TODO

#### `public static boolean launch(Client cl) throws IOException`

- Description: TODO

#### `public Chooser(List<Client> clients)`

- Description: TODO

#### `private void save(Client cl)`

- Description: TODO

#### `public void claunch(Client cl)`

- Description: TODO

#### `public Updater(Collection<UGItem> items)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public static boolean launchlast(Collection<Client> clients)`

- Description: TODO

#### `public static void main2(String[] args)`

- Description: TODO

#### `public static void main(final String[] args)`

- Description: TODO
