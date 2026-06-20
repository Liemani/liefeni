---
source: [WorkshopLauncher.java](../../../src/haven/WorkshopLauncher.java)
created: 2026-06-13
updated: 2026-06-14
---

# WorkshopLauncher

Represents the workshop launcher Haven component.

## Nested Types

### Chooser

- Role: Represents chooser within WorkshopLauncher.
- Description: Describes the nested chooser type used by the enclosing class.

### ClassUnloader

- Role: Represents class unloader within WorkshopLauncher.
- Description: Describes the nested class unloader type used by the enclosing class.

### Client

- Role: Represents client within WorkshopLauncher.
- Description: Describes the nested client type used by the enclosing class.

### MessageException

- Role: Represents message exception within WorkshopLauncher.
- Description: Describes the nested message exception type used by the enclosing class.

### Updater

- Role: Represents updater within WorkshopLauncher.
- Description: Describes the nested updater type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final UGItem item`
- Role: Holds the item state.
- Description: Backs the cached state for this file.

#### `public final Path path`
- Role: Stores the path value.
- Description: Backs the cached state for this file.

#### `public final Properties props`
- Role: Holds the props state.
- Description: Backs the cached state for this file.

#### `public final URI unload`
- Role: Holds the unload state.
- Description: Backs the cached state for this file.

#### `public final List<Client> clients`
- Role: Caches clients entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private JList clist`
- Role: Caches clist entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private JCheckBox memo`
- Role: Holds the memo state.
- Description: Backs the cached state for this file.

#### `private JButton lbtn`
- Role: Holds the lbtn state.
- Description: Backs the cached state for this file.

#### `public final Iterator<UGItem> items`
- Role: Holds the items state.
- Description: Backs the cached state for this file.

#### `private JProgressBar prog`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

### Methods

#### `public Client(UGItem item, Path path, Properties props)`
- Role: Performs client.
- Description: Supports the client operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public MessageException(String msg)`
- Role: Performs message exception.
- Description: Supports the message exception operation used by the surrounding class.

#### `public static Path findjvm() throws IOException`
- Role: Handles the findjvm workflow.
- Description: Supports the findjvm operation used by the surrounding class.

#### `public static void centerwnd(JFrame wnd)`
- Role: Performs centerwnd.
- Description: Supports the centerwnd operation used by the surrounding class.

#### `public ClassUnloader()`
- Role: Performs class unloader.
- Description: Supports the class unloader operation used by the surrounding class.

#### `private boolean resunloadp(URL url)`
- Role: Performs resunloadp.
- Description: Supports the resunloadp operation used by the surrounding class.

#### `public URL getResource(String name)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Enumeration<URL> getResources(String name) throws IOException`
- Role: Returns the resources value.
- Description: Exposes the requested value without mutating state.

#### `public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException`
- Role: Handles the load class workflow.
- Description: Supports the load class operation used by the surrounding class.

#### `public static boolean launch(Client cl) throws IOException`
- Role: Handles the launch workflow.
- Description: Supports the launch operation used by the surrounding class.

#### `public Chooser(List<Client> clients)`
- Role: Performs chooser.
- Description: Supports the chooser operation used by the surrounding class.

#### `private void save(Client cl)`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `public void claunch(Client cl)`
- Role: Performs claunch.
- Description: Supports the claunch operation used by the surrounding class.

#### `public Updater(Collection<UGItem> items)`
- Role: Performs updater.
- Description: Supports the updater operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public static boolean launchlast(Collection<Client> clients)`
- Role: Performs launchlast.
- Description: Supports the launchlast operation used by the surrounding class.

#### `public static void main2(String[] args)`
- Role: Performs main2.
- Description: Supports the main2 operation used by the surrounding class.

#### `public static void main(final String[] args)`
- Role: Performs main.
- Description: Supports the main operation used by the surrounding class.
