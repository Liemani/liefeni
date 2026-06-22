---
source: [SslHelper.java](../../../../src/haven/SslHelper.java)
created: 2026-06-13
updated: 2026-06-14
---

# SslHelper

Represents the ssl helper Haven component.

## Members

### Constants

### Fields

#### `private KeyStore creds, trusted`
- Role: Caches the trusted value.
- Description: Caches the `trusted` value for reuse.

#### `private KeyStore creds, trusted`
- Role: Caches the trusted value.
- Description: Caches the `trusted` value for reuse.

#### `private SSLContext ctx = null`
- Role: Caches the ctx value.
- Description: Caches the `ctx` value for reuse.

#### `private SSLSocketFactory sfac = null`
- Role: Caches the sfac value.
- Description: Caches the `sfac` value for reuse.

#### `private int tserial = 0`
- Role: Caches the tserial value.
- Description: Caches the `tserial` value for reuse.

#### `private char[] pw`
- Role: Caches the pw value.
- Description: Caches the `pw` value for reuse.

#### `private HostnameVerifier ver = null`
- Role: Caches the ver value.
- Description: Caches the `ver` value for reuse.

### Methods

#### `public SslHelper()`
- Role: Creates a new SslHelper instance.
- Description: Constructs the SslHelper instance from the supplied inputs.

#### `private synchronized SSLContext ctx()`
- Role: Handles the context path.
- Description: Implements the ctx operation.

#### `private synchronized SSLSocketFactory sfac()`
- Role: Handles the sfac path.
- Description: Implements the sfac operation.

#### `private void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public synchronized void trust(Certificate cert)`
- Role: Handles the trust path.
- Description: Implements the trust operation.

#### `public static Certificate loadX509(InputStream in) throws IOException, CertificateException`
- Role: Handles the load x509 workflow.
- Description: Loads the x509.

#### `public static Collection<? extends Certificate> loadX509s(InputStream in) throws IOException, CertificateException`
- Role: Handles the load x509s workflow.
- Description: Loads the x509s.

#### `public void trust(InputStream in) throws IOException, CertificateException`
- Role: Handles the trust workflow.
- Description: Implements the trust operation.

#### `public synchronized void loadCredsPkcs12(InputStream in, char[] pw) throws IOException, CertificateException`
- Role: Handles the load creds pkcs12 workflow.
- Description: Loads the creds pkcs12.

#### `public SSLEngine engine(String host, int port)`
- Role: Handles the engine path.
- Description: Implements the engine operation.

#### `public HttpsURLConnection connect(URL url) throws IOException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.

#### `public HttpsURLConnection connect(String url) throws IOException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.

#### `public void ignoreName()`
- Role: Handles the ignore name path.
- Description: Implements the ignore name operation.

#### `public boolean hasCreds()`
- Role: Checks whether the creds.
- Description: Returns whether the condition is satisfied.