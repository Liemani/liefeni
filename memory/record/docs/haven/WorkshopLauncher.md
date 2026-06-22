---
source: [WorkshopLauncher.java](../../../../src/haven/WorkshopLauncher.java)
created: 2026-06-13
updated: 2026-06-14
---

# WorkshopLauncher

Represents the workshop launcher Haven component.

## Nested Types

### Chooser

- Role: Presents the workshop client chooser.
- Description: Swing dialog that lets the user pick one workshop client entry.

### ClassUnloader

- Role: Filters workshop classes during class loading.
- Description: Custom class loader that hides unloaded workshop resources from lookup.

### Client

- Role: Stores one workshop client entry.
- Description: Launch metadata for a discovered workshop client.

### MessageException

- Role: Signals a launch message failure.
- Description: Runtime exception used when launcher message exchange fails.

### Updater

- Role: Downloads or refreshes workshop clients.
- Description: Background worker that updates local workshop content before launch.

## Members

### Constants

### Fields

#### `public final UGItem item`
- Role: Caches the item value.
- Description: Caches the `item` value for reuse.

#### `public final Path path`
- Role: Caches the path value.
- Description: Caches the `path` value for reuse.

#### `public final Properties props`
- Role: Caches the props value.
- Description: Caches the `props` value for reuse.

#### `public final URI unload`
- Role: Caches the unload value.
- Description: Caches the `unload` value for reuse.

#### `public final List<Client> clients`
- Role: Caches the clients value.
- Description: Caches the `clients` value for reuse.

#### `private JList clist`
- Role: Caches the clist value.
- Description: Caches the `clist` value for reuse.

#### `private JCheckBox memo`
- Role: Caches the memo value.
- Description: Caches the `memo` value for reuse.

#### `private JButton lbtn`
- Role: Caches the lbtn value.
- Description: Caches the `lbtn` value for reuse.

#### `public final Iterator<UGItem> items`
- Role: Caches the items value.
- Description: Caches the `items` value for reuse.

#### `private JProgressBar prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

### Methods

#### `public Client(UGItem item, Path path, Properties props)`
- Role: Handles the client path.
- Description: Implements the client operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public MessageException(String msg)`
- Role: Handles the message exception path.
- Description: Implements the message exception operation.

#### `public static Path findjvm() throws IOException`
- Role: Handles the findjvm workflow.
- Description: Finds the jvm.

#### `public static void centerwnd(JFrame wnd)`
- Role: Handles the centerwnd path.
- Description: Centers the wnd.

#### `public ClassUnloader()`
- Role: Handles the class unloader path.
- Description: Implements the class unloader operation.

#### `private boolean resunloadp(URL url)`
- Role: Handles the resunloadp path.
- Description: Implements the resunloadp operation.

#### `public URL getResource(String name)`
- Role: Returns the resource.
- Description: Returns the resource.

#### `public Enumeration<URL> getResources(String name) throws IOException`
- Role: Returns the resources.
- Description: Returns the resources.

#### `public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException`
- Role: Handles the load class workflow.
- Description: Loads the class.

#### `public static boolean launch(Client cl) throws IOException`
- Role: Handles the launch workflow.
- Description: Implements the launch operation.

#### `public Chooser(List<Client> clients)`
- Role: Handles the chooser path.
- Description: Implements the chooser operation.

#### `private void save(Client cl)`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public void claunch(Client cl)`
- Role: Handles the claunch path.
- Description: Implements the claunch operation.

#### `public Updater(Collection<UGItem> items)`
- Role: Handles the updater path.
- Description: Implements the updater operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public static boolean launchlast(Collection<Client> clients)`
- Role: Handles the launchlast path.
- Description: Implements the launchlast operation.

#### `public static void main2(String[] args)`
- Role: Handles the main2 path.
- Description: Implements the main2 operation.

#### `public static void main(final String[] args)`
- Role: Handles the main path.
- Description: Runs the client entry point.