---
source: [JOGLWrap.java](../../../../../../src/haven/render/jogl/JOGLWrap.java)
created: 2026-06-13
updated: 2026-06-14
---

# JOGLWrap

Adapts the render backend to JOGL for joglwrap.

## Members

### Constants

#### `private static final Pattern joglerrp = Pattern.compile("GL-Error 0x([0-9a-fA-F]+)\\s")`
- Role: Implements the joglerrp operation.
- Description: Implements the x operation.
- Value: `Pattern.compile("GL-Error 0x([0-9a-fA-F]+)\\s")`

### Fields

#### `public final GL3 back`
- Role: Caches the back value.
- Description: Caches the `back` value for reuse.

### Methods

#### `public JOGLWrap(GL3 back)`
- Role: Creates a new JOGLWrap instance.
- Description: Constructs the JOGLWrap instance from the supplied inputs.

#### `public com.jogamp.opengl.GL getGL()`
- Role: Returns the gl.
- Description: Returns the gl.

#### `public void glActiveTexture(int texture)`
- Role: Handles the gl active texture path.
- Description: Implements the gl active texture operation.

#### `public void glAttachShader(int program, int shader)`
- Role: Handles the gl attach shader path.
- Description: Implements the gl attach shader operation.

#### `public void glBindAttribLocation(int program, int index, String name)`
- Role: Handles the gl bind attrib location path.
- Description: Implements the gl bind attrib location operation.

#### `public void glBindBuffer(int target, int buffer)`
- Role: Handles the gl bind buffer path.
- Description: Implements the gl bind buffer operation.

#### `public void glBindFragDataLocation(int program, int colornumber, String name)`
- Role: Handles the gl bind frag data location path.
- Description: Implements the gl bind frag data location operation.

#### `public void glBindFramebuffer(int target, int buffer)`
- Role: Handles the gl bind framebuffer path.
- Description: Implements the gl bind framebuffer operation.

#### `public void glBindRenderbuffer(int target, int buffer)`
- Role: Handles the gl bind renderbuffer path.
- Description: Implements the gl bind renderbuffer operation.

#### `public void glBindTexture(int target, int texture)`
- Role: Handles the gl bind texture path.
- Description: Implements the gl bind texture operation.

#### `public void glBindVertexArray(int array)`
- Role: Handles the gl bind vertex array path.
- Description: Implements the gl bind vertex array operation.

#### `public void glBlendColor(float red, float green, float blue, float alpha)`
- Role: Handles the gl blend color path.
- Description: Implements the gl blend color operation.

#### `public void glBlendEquation(int mode)`
- Role: Handles the gl blend equation path.
- Description: Implements the gl blend equation operation.

#### `public void glBlendEquationSeparate(int cmode, int amode)`
- Role: Handles the gl blend equation separate path.
- Description: Implements the gl blend equation separate operation.

#### `public void glBlendFunc(int sfac, int dfac)`
- Role: Handles the gl blend func path.
- Description: Implements the gl blend func operation.

#### `public void glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac)`
- Role: Handles the gl blend func separate path.
- Description: Implements the gl blend func separate operation.

#### `public void glBufferData(int target, long size, ByteBuffer data, int usage)`
- Role: Handles the gl buffer data path.
- Description: Implements the gl buffer data operation.

#### `public void glBufferSubData(int target, long offset, long size, ByteBuffer data)`
- Role: Handles the gl buffer sub data path.
- Description: Implements the gl buffer sub data operation.

#### `public int glCheckFramebufferStatus(int target)`
- Role: Handles the gl check framebuffer status path.
- Description: Implements the gl check framebuffer status operation.

#### `public void glClear(int mask)`
- Role: Handles the gl clear path.
- Description: Implements the gl clear operation.

#### `public void glClearBufferfv(int buffer, int drawbuffer, float[] value)`
- Role: Handles the gl clear bufferfv path.
- Description: Implements the gl clear bufferfv operation.

#### `public void glClearBufferiv(int buffer, int drawbuffer, int[] value)`
- Role: Handles the gl clear bufferiv path.
- Description: Implements the gl clear bufferiv operation.

#### `public void glClearBufferuiv(int buffer, int drawbuffer, int[] value)`
- Role: Handles the gl clear bufferuiv path.
- Description: Implements the gl clear bufferuiv operation.

#### `public void glClearColor(float r, float g, float b, float a)`
- Role: Handles the gl clear color path.
- Description: Implements the gl clear color operation.

#### `public void glClearDepth(double d)`
- Role: Handles the gl clear depth texture path.
- Description: Implements the gl clear depth operation.

#### `public void glColorMask(boolean r, boolean g, boolean b, boolean a)`
- Role: Handles the gl color mask path.
- Description: Implements the gl color mask operation.

#### `public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a)`
- Role: Handles the gl color maski path.
- Description: Implements the gl color maski operation.

#### `public void glCompileShader(int shader)`
- Role: Handles the gl compile shader path.
- Description: Implements the gl compile shader operation.

#### `public int glCreateProgram()`
- Role: Handles the gl create program path.
- Description: Implements the gl create program operation.

#### `public int glCreateShader(int type)`
- Role: Handles the gl create shader path.
- Description: Implements the gl create shader operation.

#### `public void glCullFace(int mode)`
- Role: Handles the gl cull face path.
- Description: Implements the gl cull face operation.

#### `public void glDeleteBuffers(int count, int[] buffers)`
- Role: Handles the gl delete buffers path.
- Description: Implements the gl delete buffers operation.

#### `public void glDeleteFramebuffers(int count, int[] buffers)`
- Role: Handles the gl delete framebuffers path.
- Description: Implements the gl delete framebuffers operation.

#### `public void glDeleteShader(int id)`
- Role: Handles the gl delete shader path.
- Description: Implements the gl delete shader operation.

#### `public void glDeleteQueries(int count, int[] buffer)`
- Role: Handles the gl delete queries path.
- Description: Implements the gl delete queries operation.

#### `public void glDeleteProgram(int id)`
- Role: Handles the gl delete program path.
- Description: Implements the gl delete program operation.

#### `public void glDeleteRenderbuffers(int count, int[] buffers)`
- Role: Handles the gl delete renderbuffers path.
- Description: Implements the gl delete renderbuffers operation.

#### `public void glDeleteTextures(int count, int[] buffers)`
- Role: Handles the gl delete textures path.
- Description: Implements the gl delete textures operation.

#### `public void glDeleteVertexArrays(int count, int[] buffers)`
- Role: Handles the gl delete vertex arrays path.
- Description: Implements the gl delete vertex arrays operation.

#### `public void glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled)`
- Role: Handles the gl debug message control path.
- Description: Implements the gl debug message control operation.

#### `public void glDeleteSync(long id)`
- Role: Handles the gl delete sync path.
- Description: Implements the gl delete sync operation.

#### `public void glDepthFunc(int func)`
- Role: Handles the gl depth texture func path.
- Description: Implements the gl depth func operation.

#### `public void glDepthMask(boolean mask)`
- Role: Handles the gl depth texture mask path.
- Description: Implements the gl depth mask operation.

#### `public void glDisable(int cap)`
- Role: Handles the gl disable path.
- Description: Implements the gl disable operation.

#### `public void glDisablei(int cap, int index)`
- Role: Handles the gl disablei path.
- Description: Implements the gl disablei operation.

#### `public void glDisableVertexAttribArray(int location)`
- Role: Handles the gl disable vertex attrib array path.
- Description: Implements the gl disable vertex attrib array operation.

#### `public void glDrawBuffer(int buf)`
- Role: Handles the gl draw buffer path.
- Description: Implements the gl draw buffer operation.

#### `public void glDrawBuffers(int n, int[] bufs)`
- Role: Handles the gl draw buffers path.
- Description: Implements the gl draw buffers operation.

#### `public void glDrawArraysInstanced(int mode, int first, int count, int primcount)`
- Role: Handles the gl draw arrays instanced path.
- Description: Implements the gl draw arrays instanced operation.

#### `public void glDrawArrays(int mode, int first, int count)`
- Role: Handles the gl draw arrays path.
- Description: Implements the gl draw arrays operation.

#### `public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount)`
- Role: Handles the gl draw elements instanced path.
- Description: Implements the gl draw elements instanced operation.

#### `public void glDrawElements(int mode, int count, int type, long indices)`
- Role: Handles the gl draw elements path.
- Description: Implements the gl draw elements operation.

#### `public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices)`
- Role: Handles the gl draw range elements path.
- Description: Implements the gl draw range elements operation.

#### `public void glEnable(int cap)`
- Role: Handles the gl enable path.
- Description: Implements the gl enable operation.

#### `public void glEnablei(int cap, int index)`
- Role: Handles the gl enablei path.
- Description: Implements the gl enablei operation.

#### `public void glEnableVertexAttribArray(int location)`
- Role: Handles the gl enable vertex attrib array path.
- Description: Implements the gl enable vertex attrib array operation.

#### `public long glFenceSync(int condition, int flags)`
- Role: Handles the gl fence sync path.
- Description: Implements the gl fence sync operation.

#### `public void glFinish()`
- Role: Handles the gl finish path.
- Description: Implements the gl finish operation.

#### `public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level)`
- Role: Handles the gl framebuffer texture2 d path.
- Description: Implements the gl framebuffer texture2 d operation.

#### `public void glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer)`
- Role: Handles the gl framebuffer renderbuffer path.
- Description: Implements the gl framebuffer renderbuffer operation.

#### `public void glGenBuffers(int n, int[] buffer)`
- Role: Handles the gl gen buffers path.
- Description: Implements the gl gen buffers operation.

#### `public void glGenFramebuffers(int n, int[] buffer)`
- Role: Handles the gl gen framebuffers path.
- Description: Implements the gl gen framebuffers operation.

#### `public void glGenQueries(int n, int[] buffer)`
- Role: Handles the gl gen queries path.
- Description: Implements the gl gen queries operation.

#### `public void glGenTextures(int n, int[] buffer)`
- Role: Handles the gl gen textures path.
- Description: Implements the gl gen textures operation.

#### `public void glGenVertexArrays(int n, int[] buffer)`
- Role: Handles the gl gen vertex arrays path.
- Description: Implements the gl gen vertex arrays operation.

#### `public void glGetBufferSubData(int target, int offset, int size, ByteBuffer data)`
- Role: Handles the gl get buffer sub data path.
- Description: Implements the gl get buffer sub data operation.

#### `public int glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer)`
- Role: Handles the gl get debug message log path.
- Description: Implements the gl get debug message log operation.

#### `public int glGetError()`
- Role: Handles the gl get error path.
- Description: Implements the gl get error operation.

#### `public void glGetFloatv(int pname, float[] data)`
- Role: Handles the gl get floatv path.
- Description: Implements the gl get floatv operation.

#### `public void glGetIntegerv(int pname, int[] data)`
- Role: Handles the gl get integerv path.
- Description: Implements the gl get integerv operation.

#### `public String glGetString(int name)`
- Role: Handles the gl get string path.
- Description: Implements the gl get string operation.

#### `public String glGetStringi(int name, int index)`
- Role: Handles the gl get stringi path.
- Description: Implements the gl get stringi operation.

#### `public void glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`
- Role: Handles the gl get program info log path.
- Description: Implements the gl get program info log operation.

#### `public void glGetProgramiv(int shader, int pname, int[] buf)`
- Role: Handles the gl get programiv path.
- Description: Implements the gl get programiv operation.

#### `public void glGetQueryObjectiv(int id, int pname, int[] params)`
- Role: Handles the gl get query objectiv path.
- Description: Implements the gl get query objectiv operation.

#### `public void glGetQueryObjecti64v(int id, int pname, long[] params)`
- Role: Handles the gl get query objecti64v path.
- Description: Implements the gl get query objecti64v operation.

#### `public void glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`
- Role: Handles the gl get shader info log path.
- Description: Implements the gl get shader info log operation.

#### `public void glGetShaderiv(int shader, int pname, int[] buf)`
- Role: Handles the gl get shaderiv path.
- Description: Implements the gl get shaderiv operation.

#### `public void glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values)`
- Role: Handles the gl get synciv path.
- Description: Implements the gl get synciv operation.

#### `public void glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels)`
- Role: Handles the gl get texture image path.
- Description: Implements the gl get tex image operation.

#### `public void glGetTexImage(int target, int level, int format, int type, long offset)`
- Role: Handles the gl get texture image path.
- Description: Implements the gl get tex image operation.

#### `public int glGetUniformLocation(int program, String name)`
- Role: Handles the gl get uniform location path.
- Description: Implements the gl get uniform location operation.

#### `public void glLineWidth(float w)`
- Role: Handles the gl line width path.
- Description: Implements the gl line width operation.

#### `public void glLinkProgram(int program)`
- Role: Handles the gl link program path.
- Description: Implements the gl link program operation.

#### `public void glObjectLabel(int identifier, int name, int length, byte[] label)`
- Role: Handles the gl object label path.
- Description: Implements the gl object label operation.

#### `public void glPixelStorei(int pname, int param)`
- Role: Handles the gl pixel storei path.
- Description: Implements the gl pixel storei operation.

#### `public void glPointSize(float size)`
- Role: Handles the gl point size path.
- Description: Implements the gl point size operation.

#### `public void glPolygonMode(int face, int mode)`
- Role: Handles the gl polygon mode path.
- Description: Implements the gl polygon mode operation.

#### `public void glPolygonOffset(float factor, float units)`
- Role: Handles the gl polygon offset path.
- Description: Implements the gl polygon offset operation.

#### `public void glQueryCounter(int id, int target)`
- Role: Handles the gl query counter path.
- Description: Implements the gl query counter operation.

#### `public void glReadBuffer(int buf)`
- Role: Handles the gl read buffer path.
- Description: Implements the gl read buffer operation.

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data)`
- Role: Handles the gl read pixels path.
- Description: Implements the gl read pixels operation.

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, long offset)`
- Role: Handles the gl read pixels path.
- Description: Implements the gl read pixels operation.

#### `public void glRenderbufferStorage(int target, int format, int width, int height)`
- Role: Handles the gl renderbuffer storage path.
- Description: Implements the gl renderbuffer storage operation.

#### `public void glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height)`
- Role: Handles the gl renderbuffer storage multisample path.
- Description: Implements the gl renderbuffer storage multisample operation.

#### `public void glSampleCoverage(float value, boolean invert)`
- Role: Handles the gl sample coverage path.
- Description: Implements the gl sample coverage operation.

#### `public void glShaderSource(int shader, int count, String[] string, int[] lengths)`
- Role: Handles the gl shader source path.
- Description: Implements the gl shader source operation.

#### `public void glScissor(int x, int y, int w, int h)`
- Role: Handles the gl scissor path.
- Description: Implements the gl scissor operation.

#### `public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data)`
- Role: Handles the gl texture image2 d path.
- Description: Implements the gl tex image2 d operation.

#### `public void glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data)`
- Role: Handles the gl texture sub image2 d path.
- Description: Implements the gl tex sub image2 d operation.

#### `public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations)`
- Role: Handles the gl texture image2 dmultisample path.
- Description: Implements the gl tex image2 d multisample operation.

#### `public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data)`
- Role: Handles the gl texture image3 d path.
- Description: Implements the gl tex image3 d operation.

#### `public void glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data)`
- Role: Handles the gl texture sub image3 d path.
- Description: Implements the gl tex sub image3 d operation.

#### `public void glTexParameterf(int target, int pname, float param)`
- Role: Handles the gl texture parameterf path.
- Description: Implements the gl tex parameterf operation.

#### `public void glTexParameterfv(int target, int pname, float[] param)`
- Role: Handles the gl texture parameterfv path.
- Description: Implements the gl tex parameterfv operation.

#### `public void glTexParameteri(int target, int pname, int param)`
- Role: Handles the gl texture parameteri path.
- Description: Implements the gl tex parameteri operation.

#### `public void glUniform1f(int location, float v0)`
- Role: Handles the gl uniform1f path.
- Description: Implements the gl uniform1f operation.

#### `public void glUniform2f(int location, float v0, float v1)`
- Role: Handles the gl uniform2f path.
- Description: Implements the gl uniform2f operation.

#### `public void glUniform3f(int location, float v0, float v1, float v2)`
- Role: Handles the gl uniform3f path.
- Description: Implements the gl uniform3f operation.

#### `public void glUniform3fv(int location, int count, float[] val)`
- Role: Handles the gl uniform3fv path.
- Description: Implements the gl uniform3fv operation.

#### `public void glUniform4f(int location, float v0, float v1, float v2, float v3)`
- Role: Handles the gl uniform4f path.
- Description: Implements the gl uniform4f operation.

#### `public void glUniform4fv(int location, int count, float[] val)`
- Role: Handles the gl uniform4fv path.
- Description: Implements the gl uniform4fv operation.

#### `public void glUniform1i(int location, int v0)`
- Role: Handles the gl uniform1i path.
- Description: Implements the gl uniform1i operation.

#### `public void glUniform2i(int location, int v0, int v1)`
- Role: Handles the gl uniform2i path.
- Description: Implements the gl uniform2i operation.

#### `public void glUniform3i(int location, int v0, int v1, int v2)`
- Role: Handles the gl uniform3i path.
- Description: Implements the gl uniform3i operation.

#### `public void glUniform4i(int location, int v0, int v1, int v2, int v3)`
- Role: Handles the gl uniform4i path.
- Description: Implements the gl uniform4i operation.

#### `public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value)`
- Role: Handles the gl uniform matrix3fv path.
- Description: Implements the gl uniform matrix3fv operation.

#### `public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value)`
- Role: Handles the gl uniform matrix4fv path.
- Description: Implements the gl uniform matrix4fv operation.

#### `public void glUseProgram(int program)`
- Role: Handles the gl use program path.
- Description: Implements the gl use program operation.

#### `public void glVertexAttribDivisor(int location, int divisor)`
- Role: Handles the gl vertex attrib divisor path.
- Description: Implements the gl vertex attrib divisor operation.

#### `public void glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer)`
- Role: Handles the gl vertex attrib pointer path.
- Description: Implements the gl vertex attrib pointer operation.

#### `public void glVertexAttribIPointer(int location, int size, int type, int stride, long pointer)`
- Role: Handles the gl vertex attrib ipointer path.
- Description: Implements the gl vertex attrib i pointer operation.

#### `public void glViewport(int x, int y, int w, int h)`
- Role: Handles the gl viewport path.
- Description: Implements the gl viewport operation.

#### `public static void xlatejoglexc(RuntimeException exc)`
- Role: Handles the xlatejoglexc path.
- Description: Implements the xlatejoglexc operation.

#### `public void xlateexc(RuntimeException exc)`
- Role: Handles the xlateexc path.
- Description: Implements the xlateexc operation.