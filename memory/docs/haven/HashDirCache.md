# HashDirCache

## Meta

- Source: [HashDirCache.java](../../../src/haven/HashDirCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Caches directories by hash.

## Code Members

### Member Index

#### Fields

- [base](#member-1)
- [id](#member-2)
- [idhash](#member-3)
- [current](#member-5)
- [cid](#member-10)
- [name](#member-11)
- [p](#member-17)
- [h](#member-18)
- [f](#member-19)
- [monitors](#member-23)
- [monwarned](#member-24)

#### Methods

- [findbase()](#member-4)
- [get(URI id)](#member-6)
- [mkurn(String id)](#member-7)
- [get(String id)](#member-8)
- [namehash(long h, String name)](#member-9)
- [private Header readhead(DataInput fp) throws IOException](#member-12)
- [private Header readhead(ReadableByteChannel ch) throws IOException](#member-13)
- [private void writehead(DataOutput fp, String name) throws IOException](#member-14)
- [private void writehead(WritableByteChannel ch, String name) throws IOException](#member-15)
- [private static FileChannel open2(Path path, OpenOption... mode) throws IOException](#member-16)
- [CacheFile(Path p, Header h, LockedFile lf) throws IOException](#member-20)
- [acquire()](#member-21)
- [public void close() throws IOException](#member-22)
- [private CacheFile lookup(String name, boolean creat) throws IOException](#member-25)
- [fnfilter(java.util.function.Predicate<String> filter)](#member-26)
- [private Iterator<String> list(boolean filter) throws IOException](#member-27)
- [private Iterator<String> list() throws IOException](#member-28)
- [public OutputStream store(String name) throws IOException](#member-29)
- [public InputStream fetch(String name) throws IOException](#member-30)
- [public void remove(String name) throws IOException](#member-31)
- [toString()](#member-32)
- [create()](#member-33)
- [public static void main(String[] args) throws IOException](#member-34)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `base`

- Description: TODO

<a id="member-2"></a>
##### `id`

- Description: TODO

<a id="member-3"></a>
##### `idhash`

- Description: TODO

<a id="member-5"></a>
##### `current`

- Description: TODO

<a id="member-10"></a>
##### `cid`

- Description: TODO

<a id="member-11"></a>
##### `name`

- Description: TODO

<a id="member-17"></a>
##### `p`

- Description: TODO

<a id="member-18"></a>
##### `h`

- Description: TODO

<a id="member-19"></a>
##### `f`

- Description: TODO

<a id="member-23"></a>
##### `monitors`

- Description: TODO

<a id="member-24"></a>
##### `monwarned`

- Description: TODO

#### Methods

<a id="member-4"></a>
##### `findbase()`

- Description: TODO

<a id="member-6"></a>
##### `get(URI id)`

- Description: TODO

<a id="member-7"></a>
##### `mkurn(String id)`

- Description: TODO

<a id="member-8"></a>
##### `get(String id)`

- Description: TODO

<a id="member-9"></a>
##### `namehash(long h, String name)`

- Description: TODO

<a id="member-12"></a>
##### `private Header readhead(DataInput fp) throws IOException`

- Description: TODO

<a id="member-13"></a>
##### `private Header readhead(ReadableByteChannel ch) throws IOException`

- Description: TODO

<a id="member-14"></a>
##### `private void writehead(DataOutput fp, String name) throws IOException`

- Description: TODO

<a id="member-15"></a>
##### `private void writehead(WritableByteChannel ch, String name) throws IOException`

- Description: TODO

<a id="member-16"></a>
##### `private static FileChannel open2(Path path, OpenOption... mode) throws IOException`

- Description: TODO

<a id="member-20"></a>
##### `CacheFile(Path p, Header h, LockedFile lf) throws IOException`

- Description: TODO

<a id="member-21"></a>
##### `acquire()`

- Description: TODO

<a id="member-22"></a>
##### `public void close() throws IOException`

- Description: TODO

<a id="member-25"></a>
##### `private CacheFile lookup(String name, boolean creat) throws IOException`

- Description: TODO

<a id="member-26"></a>
##### `fnfilter(java.util.function.Predicate<String> filter)`

- Description: TODO

<a id="member-27"></a>
##### `private Iterator<String> list(boolean filter) throws IOException`

- Description: TODO

<a id="member-28"></a>
##### `private Iterator<String> list() throws IOException`

- Description: TODO

<a id="member-29"></a>
##### `public OutputStream store(String name) throws IOException`

- Description: TODO

<a id="member-30"></a>
##### `public InputStream fetch(String name) throws IOException`

- Description: TODO

<a id="member-31"></a>
##### `public void remove(String name) throws IOException`

- Description: TODO

<a id="member-32"></a>
##### `toString()`

- Description: TODO

<a id="member-33"></a>
##### `create()`

- Description: TODO

<a id="member-34"></a>
##### `public static void main(String[] args) throws IOException`

- Description: TODO
