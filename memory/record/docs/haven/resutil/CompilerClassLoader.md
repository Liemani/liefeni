---
source: [CompilerClassLoader.java](../../../../../src/haven/resutil/CompilerClassLoader.java)
created: 2026-06-13
updated: 2026-06-20
---

# CompilerClassLoader

Loads compiled classes from resources listed in the `haven.resutil.classloader.useres` property.

## Members

### Fields

#### `private Indir<Resource>[] useres`
- Role: Stores the resources searched for compiled classes.
- Description: Each entry is resolved lazily before its `CodeEntry` loader is queried.

### Methods

#### `public CompilerClassLoader(ClassLoader parent)`
- Role: Builds a resource-backed class loader.
- Description: Reads the resource list from the client property and stores each handle for later lookup.

#### `public Class<?> findClass(String name) throws ClassNotFoundException`
- Role: Resolves a class from the configured resources.
- Description: Tries each resource loader in order and returns the first matching class definition.