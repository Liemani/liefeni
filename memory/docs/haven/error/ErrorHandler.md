# ErrorHandler

This file documents the responsibilities and members of `ErrorHandler`.

## Meta

- Source: [ErrorHandler.java](../../../../src/haven/error/ErrorHandler.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles runtime errors.

## Nested Types

### Reporter

- Description: TODO

## Members

### Constants

#### `private static final String[] sysprops =`

- Description: TODO

### Fields

#### `private final URL errordest`

- Description: TODO

#### `private final ThreadGroup initial`

- Description: TODO

#### `private Map<String, Object> props = new HashMap<String, Object>()`

- Description: TODO

#### `private Reporter reporter`

- Description: TODO

#### `private Queue<Report> errors = new LinkedList<Report>()`

- Description: TODO

#### `private ErrorStatus status`

- Description: TODO

### Methods

#### `public static ErrorHandler find()`

- Description: TODO

#### `public static void setprop(String key, Object val)`

- Description: TODO

#### `public void lsetprop(String key, Object val)`

- Description: TODO

#### `public Reporter(ErrorStatus status)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `private void doreport(Report r) throws IOException`

- Description: TODO

#### `public void report(Thread th, Throwable t)`

- Description: TODO

#### `private void defprops()`

- Description: TODO

#### `public ErrorHandler(ErrorStatus ui, URL errordest)`

- Description: TODO

#### `public ErrorHandler(URL errordest)`

- Description: TODO

#### `public void sethandler(ErrorStatus handler)`

- Description: TODO

#### `public void uncaughtException(Thread t, Throwable e)`

- Description: TODO
