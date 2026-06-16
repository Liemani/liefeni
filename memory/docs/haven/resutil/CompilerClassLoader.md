# CompilerClassLoader

This file documents the responsibilities and members of `CompilerClassLoader`.

## Meta

- Source: [CompilerClassLoader.java](../../../../src/haven/resutil/CompilerClassLoader.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
