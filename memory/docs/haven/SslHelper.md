# SslHelper

This file documents the responsibilities and members of `SslHelper`.

## Meta

- Source: [SslHelper.java](../../../src/haven/SslHelper.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the ssl helper Haven component.

## Members

### Constants

### Fields

#### `private KeyStore creds, trusted`
- Role: Stores the trusted value.
- Description: Backs the cached state for this file.

#### `private KeyStore creds, trusted`
- Role: Stores the trusted value.
- Description: Backs the cached state for this file.

#### `private SSLContext ctx = null`
- Role: Stores the ctx value.
- Description: Backs the cached state for this file.

#### `private SSLSocketFactory sfac = null`
- Role: Holds the sfac state.
- Description: Backs the cached state for this file.

#### `private int tserial = 0`
- Role: Stores the tserial value.
- Description: Backs the cached state for this file.

#### `private char[] pw`
- Role: Stores the pw value.
- Description: Backs the cached state for this file.

#### `private HostnameVerifier ver = null`
- Role: Holds the ver state.
- Description: Backs the cached state for this file.

### Methods

#### `public SslHelper()`
- Role: Creates a new SslHelper instance.
- Description: Constructs the instance and initializes its default state.

#### `private synchronized SSLContext ctx()`
- Role: Performs ctx.
- Description: Supports the ctx operation used by the surrounding class.

#### `private synchronized SSLSocketFactory sfac()`
- Role: Performs sfac.
- Description: Supports the sfac operation used by the surrounding class.

#### `private void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public synchronized void trust(Certificate cert)`
- Role: Performs trust.
- Description: Supports the trust operation used by the surrounding class.

#### `public static Certificate loadX509(InputStream in) throws IOException, CertificateException`
- Role: Handles the load x509 workflow.
- Description: Supports the load x509 operation used by the surrounding class.

#### `public static Collection<? extends Certificate> loadX509s(InputStream in) throws IOException, CertificateException`
- Role: Handles the load x509s workflow.
- Description: Supports the load x509s operation used by the surrounding class.

#### `public void trust(InputStream in) throws IOException, CertificateException`
- Role: Handles the trust workflow.
- Description: Supports the trust operation used by the surrounding class.

#### `public synchronized void loadCredsPkcs12(InputStream in, char[] pw) throws IOException, CertificateException`
- Role: Handles the load creds pkcs12 workflow.
- Description: Supports the load creds pkcs12 operation used by the surrounding class.

#### `public SSLEngine engine(String host, int port)`
- Role: Performs engine.
- Description: Supports the engine operation used by the surrounding class.

#### `public HttpsURLConnection connect(URL url) throws IOException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.

#### `public HttpsURLConnection connect(String url) throws IOException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.

#### `public void ignoreName()`
- Role: Performs ignore name.
- Description: Supports the ignore name operation used by the surrounding class.

#### `public boolean hasCreds()`
- Role: Checks whether the creds.
- Description: Returns a boolean result for the described condition.
