# HtmlReporter

This file documents the responsibilities and members of `HtmlReporter`.

## Meta

- Source: [HtmlReporter.java](../../../../src/haven/error/HtmlReporter.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Generates HTML error reports.

## Nested Types

### ErrorIdentity

- Description: TODO

## Members

### Constants

#### `public static final DateFormat dfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")`

- Description: TODO

#### `public static final NumberFormat ifmt = NumberFormat.getInstance()`

- Description: TODO

#### `public static final String[] idxprops =`

- Description: TODO

#### `public static final Class[] boring =`

- Description: TODO

### Fields

#### `public String jarrev`

- Description: TODO

#### `public Throwable t`

- Description: TODO

#### `private Pattern[] ignclass = new Pattern[]`

- Description: TODO

### Methods

#### `private int equals(String a, String b)`

- Description: TODO

#### `public int stcmp(StackTraceElement a, StackTraceElement b)`

- Description: TODO

#### `public int thcmp(Throwable a, Throwable b)`

- Description: TODO

#### `public ErrorIdentity(Report r)`

- Description: TODO

#### `public int compareTo(ErrorIdentity o)`

- Description: TODO

#### `public boolean equals(ErrorIdentity o)`

- Description: TODO

#### `public static String htmlhead(String title)`

- Description: TODO

#### `public static String htmltail()`

- Description: TODO

#### `public static String htmlq(String html)`

- Description: TODO

#### `public static String htmlbt(StackTraceElement[] bt)`

- Description: TODO

#### `public static void makereport(OutputStream outs, Report rep) throws IOException`

- Description: TODO

#### `public static Throwable findrootexc(Throwable t)`

- Description: TODO

#### `public static void makeindex(OutputStream outs, Map<Path, Report> reports, Map<Path, Exception> failed) throws IOException`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO
