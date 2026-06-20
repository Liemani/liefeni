---
source: [HtmlReporter.java](../../../../src/haven/error/HtmlReporter.java)
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
- Role: Defines the shared dfmt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final NumberFormat ifmt = NumberFormat.getInstance()`
- Role: Defines the shared ifmt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final String[] idxprops =`
- Role: Defines the shared html reporter constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Class[] boring =`
- Role: Defines the shared html reporter constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public String jarrev`
- Role: Stores the jarrev value.
- Description: Backs the cached state for this file.

#### `public Throwable t`
- Role: Holds the t state.
- Description: Backs the cached state for this file.

#### `private Pattern[] ignclass = new Pattern[]`
- Role: Holds the ignclass state.
- Description: Backs the cached state for this file.

### Methods

#### `private int equals(String a, String b)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int stcmp(StackTraceElement a, StackTraceElement b)`
- Role: Performs stcmp.
- Description: Supports the stcmp operation used by the surrounding class.

#### `public int thcmp(Throwable a, Throwable b)`
- Role: Performs thcmp.
- Description: Supports the thcmp operation used by the surrounding class.

#### `public ErrorIdentity(Report r)`
- Role: Performs error identity.
- Description: Supports the error identity operation used by the surrounding class.

#### `public int compareTo(ErrorIdentity o)`
- Role: Performs compare to.
- Description: Supports the compare to operation used by the surrounding class.

#### `public boolean equals(ErrorIdentity o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static String htmlhead(String title)`
- Role: Performs htmlhead.
- Description: Supports the htmlhead operation used by the surrounding class.

#### `public static String htmltail()`
- Role: Performs htmltail.
- Description: Supports the htmltail operation used by the surrounding class.

#### `public static String htmlq(String html)`
- Role: Performs htmlq.
- Description: Supports the htmlq operation used by the surrounding class.

#### `public static String htmlbt(StackTraceElement[] bt)`
- Role: Performs htmlbt.
- Description: Supports the htmlbt operation used by the surrounding class.

#### `public static void makereport(OutputStream outs, Report rep) throws IOException`
- Role: Handles the makereport workflow.
- Description: Supports the makereport operation used by the surrounding class.

#### `public static Throwable findrootexc(Throwable t)`
- Role: Performs findrootexc.
- Description: Supports the findrootexc operation used by the surrounding class.

#### `public static void makeindex(OutputStream outs, Map<Path, Report> reports, Map<Path, Exception> failed) throws IOException`
- Role: Handles the makeindex workflow.
- Description: Supports the makeindex operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
