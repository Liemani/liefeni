---
source: [HtmlReporter.java](../../../../../src/haven/error/HtmlReporter.java)
created: 2026-06-13
updated: 2026-06-14
---

# HtmlReporter

Handles Haven error reporting for html reporter.

## Nested Types

### ErrorIdentity

- Role: Represents error identity within HtmlReporter.
- Description: Describes the nested error identity type used by the enclosing class.

## Members

### Constants

#### `public static final DateFormat dfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")`
- Role: Implements the dfmt operation.
- Description: Implements the simple date format operation.
- Value: `new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")`

#### `public static final NumberFormat ifmt = NumberFormat.getInstance()`
- Role: Implements the ifmt operation.
- Description: Implements the get instance operation.
- Value: `NumberFormat.getInstance()`

#### `public static final String[] idxprops =`
- Role: Caches the idxprops value.
- Description: Caches the `idxprops` value for reuse.
- Value: ``

#### `public static final Class[] boring =`
- Role: Caches the boring value.
- Description: Caches the `boring` value for reuse.
- Value: ``

### Fields

#### `public String jarrev`
- Role: Caches the jarrev value.
- Description: Caches the `jarrev` value for reuse.

#### `public Throwable t`
- Role: Caches the t value.
- Description: Caches the `t` value for reuse.

#### `private Pattern[] ignclass = new Pattern[]`
- Role: Caches the ignclass value.
- Description: Caches the `ignclass` value for reuse.

### Methods

#### `private int equals(String a, String b)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int stcmp(StackTraceElement a, StackTraceElement b)`
- Role: Handles the stcmp path.
- Description: Implements the stcmp operation.

#### `public int thcmp(Throwable a, Throwable b)`
- Role: Handles the thcmp path.
- Description: Implements the thcmp operation.

#### `public ErrorIdentity(Report r)`
- Role: Handles the error identity path.
- Description: Implements the error identity operation.

#### `public int compareTo(ErrorIdentity o)`
- Role: Handles the compare to path.
- Description: Implements the compare to operation.

#### `public boolean equals(ErrorIdentity o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static String htmlhead(String title)`
- Role: Handles the htmlhead path.
- Description: Implements the htmlhead operation.

#### `public static String htmltail()`
- Role: Handles the htmltail path.
- Description: Implements the htmltail operation.

#### `public static String htmlq(String html)`
- Role: Handles the htmlq path.
- Description: Implements the htmlq operation.

#### `public static String htmlbt(StackTraceElement[] bt)`
- Role: Handles the htmlbt path.
- Description: Implements the htmlbt operation.

#### `public static void makereport(OutputStream outs, Report rep) throws IOException`
- Role: Handles the makereport workflow.
- Description: Implements the makereport operation.

#### `public static Throwable findrootexc(Throwable t)`
- Role: Handles the findrootexc path.
- Description: Finds the rootexc.

#### `public static void makeindex(OutputStream outs, Map<Path, Report> reports, Map<Path, Exception> failed) throws IOException`
- Role: Handles the makeindex workflow.
- Description: Implements the makeindex operation.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.