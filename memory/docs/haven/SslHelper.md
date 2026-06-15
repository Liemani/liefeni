# SslHelper

This file documents the responsibilities and members of `SslHelper`.

## Meta

- Source: [SslHelper.java](../../../src/haven/SslHelper.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides SSL helper routines.

## Members

### Constants

### Fields

#### `private KeyStore creds, trusted`

- Description: TODO

#### `private KeyStore creds, trusted`

- Description: TODO

#### `private SSLContext ctx = null`

- Description: TODO

#### `private SSLSocketFactory sfac = null`

- Description: TODO

#### `private int tserial = 0`

- Description: TODO

#### `private char[] pw`

- Description: TODO

#### `private HostnameVerifier ver = null`

- Description: TODO

### Methods

#### `public SslHelper()`

- Description: TODO

#### `private synchronized SSLContext ctx()`

- Description: TODO

#### `private synchronized SSLSocketFactory sfac()`

- Description: TODO

#### `private void clear()`

- Description: TODO

#### `public synchronized void trust(Certificate cert)`

- Description: TODO

#### `public static Certificate loadX509(InputStream in) throws IOException, CertificateException`

- Description: TODO

#### `public static Collection<? extends Certificate> loadX509s(InputStream in) throws IOException, CertificateException`

- Description: TODO

#### `public void trust(InputStream in) throws IOException, CertificateException`

- Description: TODO

#### `public synchronized void loadCredsPkcs12(InputStream in, char[] pw) throws IOException, CertificateException`

- Description: TODO

#### `public SSLEngine engine(String host, int port)`

- Description: TODO

#### `public HttpsURLConnection connect(URL url) throws IOException`

- Description: TODO

#### `public HttpsURLConnection connect(String url) throws IOException`

- Description: TODO

#### `public void ignoreName()`

- Description: TODO

#### `public boolean hasCreds()`

- Description: TODO
