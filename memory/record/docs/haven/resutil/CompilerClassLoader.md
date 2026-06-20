---
source: [CompilerClassLoader.java](../../../../src/haven/resutil/CompilerClassLoader.java)
created: 2026-06-13
updated: 2026-06-14
---

# CompilerClassLoader

Provides resource helper logic for compiler class loader.

## Members

### Constants

### Fields

#### `private Indir<Resource>[] useres`
- Role: Stores the useres value.
- Description: Backs the cached state for this file.

### Methods

#### `public CompilerClassLoader(ClassLoader parent)`
- Role: Creates a new CompilerClassLoader instance.
- Description: Constructs the instance and initializes its default state.

#### `public Class<?> findClass(String name) throws ClassNotFoundException`
- Role: Handles the find class workflow.
- Description: Supports the find class operation used by the surrounding class.
