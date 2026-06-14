# SslHelper

## Meta

- Source: [SslHelper.java](../../../src/haven/SslHelper.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides SSL helper routines.

## Code Members

### Member Index

#### Fields

- [creds](#member-1)
- [trusted](#member-2)
- [ctx](#member-3)
- [sfac](#member-4)
- [tserial](#member-5)
- [pw](#member-6)
- [ver](#member-7)

#### Methods

- [ctx()](#member-8)
- [sfac()](#member-9)
- [clear()](#member-10)
- [trust(Certificate cert)](#member-11)
- [public static Certificate loadX509(InputStream in) throws IOException, CertificateException](#member-12)
- [public static Collection<? extends Certificate> loadX509s(InputStream in) throws IOException, CertificateException](#member-13)
- [public void trust(InputStream in) throws IOException, CertificateException](#member-14)
- [public synchronized void loadCredsPkcs12(InputStream in, char[] pw) throws IOException, CertificateException](#member-15)
- [engine(String host, int port)](#member-16)
- [public HttpsURLConnection connect(URL url) throws IOException](#member-17)
- [public HttpsURLConnection connect(String url) throws IOException](#member-18)
- [ignoreName()](#member-19)
- [hasCreds()](#member-20)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `creds`

- Description: TODO

<a id="member-2"></a>
##### `trusted`

- Description: TODO

<a id="member-3"></a>
##### `ctx`

- Description: TODO

<a id="member-4"></a>
##### `sfac`

- Description: TODO

<a id="member-5"></a>
##### `tserial`

- Description: TODO

<a id="member-6"></a>
##### `pw`

- Description: TODO

<a id="member-7"></a>
##### `ver`

- Description: TODO

#### Methods

<a id="member-8"></a>
##### `ctx()`

- Description: TODO

<a id="member-9"></a>
##### `sfac()`

- Description: TODO

<a id="member-10"></a>
##### `clear()`

- Description: TODO

<a id="member-11"></a>
##### `trust(Certificate cert)`

- Description: TODO

<a id="member-12"></a>
##### `public static Certificate loadX509(InputStream in) throws IOException, CertificateException`

- Description: TODO

<a id="member-13"></a>
##### `public static Collection<? extends Certificate> loadX509s(InputStream in) throws IOException, CertificateException`

- Description: TODO

<a id="member-14"></a>
##### `public void trust(InputStream in) throws IOException, CertificateException`

- Description: TODO

<a id="member-15"></a>
##### `public synchronized void loadCredsPkcs12(InputStream in, char[] pw) throws IOException, CertificateException`

- Description: TODO

<a id="member-16"></a>
##### `engine(String host, int port)`

- Description: TODO

<a id="member-17"></a>
##### `public HttpsURLConnection connect(URL url) throws IOException`

- Description: TODO

<a id="member-18"></a>
##### `public HttpsURLConnection connect(String url) throws IOException`

- Description: TODO

<a id="member-19"></a>
##### `ignoreName()`

- Description: TODO

<a id="member-20"></a>
##### `hasCreds()`

- Description: TODO
