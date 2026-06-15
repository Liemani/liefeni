# LWJGLWrap

This file documents the responsibilities and members of `LWJGLWrap`.

## Meta

- Source: [LWJGLWrap.java](../../../../../src/haven/render/lwjgl/LWJGLWrap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Wraps LWJGL-specific rendering.

## Members

### Constants

#### `public static final LWJGLWrap instance = new LWJGLWrap()`

- Description: TODO

### Fields

### Methods

#### `private static ByteBuffer ckbuf(ByteBuffer buf, long size)`

- Description: TODO

#### `private static int[] ckbuf(int[] buf, int size)`

- Description: TODO

#### `private static float[] ckbuf(float[] buf, int size)`

- Description: TODO

#### `private static String[] cksrcbuf(int count, String[] string, int[] lengths)`

- Description: TODO

#### `public void glActiveTexture(int texture)`

- Description: TODO

#### `public void glAttachShader(int program, int shader)`

- Description: TODO

#### `public void glBindAttribLocation(int program, int index, String name)`

- Description: TODO

#### `public void glBindBuffer(int target, int buffer)`

- Description: TODO

#### `public void glBindFragDataLocation(int program, int colornumber, String name)`

- Description: TODO

#### `public void glBindFramebuffer(int target, int buffer)`

- Description: TODO

#### `public void glBindRenderbuffer(int target, int buffer)`

- Description: TODO

#### `public void glBindTexture(int target, int texture)`

- Description: TODO

#### `public void glBindVertexArray(int array)`

- Description: TODO

#### `public void glBlendColor(float red, float green, float blue, float alpha)`

- Description: TODO

#### `public void glBlendEquation(int mode)`

- Description: TODO

#### `public void glBlendEquationSeparate(int cmode, int amode)`

- Description: TODO

#### `public void glBlendFunc(int sfac, int dfac)`

- Description: TODO

#### `public void glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac)`

- Description: TODO

#### `public void glBufferData(int target, long size, ByteBuffer data, int usage)`

- Description: TODO

#### `public void glBufferSubData(int target, long offset, long size, ByteBuffer data)`

- Description: TODO

#### `public int glCheckFramebufferStatus(int target)`

- Description: TODO

#### `public void glClear(int mask)`

- Description: TODO

#### `public void glClearBufferfv(int buffer, int drawbuffer, float[] value)`

- Description: TODO

#### `public void glClearBufferiv(int buffer, int drawbuffer, int[] value)`

- Description: TODO

#### `public void glClearBufferuiv(int buffer, int drawbuffer, int[] value)`

- Description: TODO

#### `public void glClearColor(float r, float g, float b, float a)`

- Description: TODO

#### `public void glClearDepth(double d)`

- Description: TODO

#### `public void glColorMask(boolean r, boolean g, boolean b, boolean a)`

- Description: TODO

#### `public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a)`

- Description: TODO

#### `public void glCompileShader(int shader)`

- Description: TODO

#### `public int glCreateProgram()`

- Description: TODO

#### `public int glCreateShader(int type)`

- Description: TODO

#### `public void glCullFace(int mode)`

- Description: TODO

#### `public void glDeleteBuffers(int count, int[] buffers)`

- Description: TODO

#### `public void glDeleteFramebuffers(int count, int[] buffers)`

- Description: TODO

#### `public void glDeleteShader(int id)`

- Description: TODO

#### `public void glDeleteQueries(int count, int[] buffer)`

- Description: TODO

#### `public void glDeleteProgram(int id)`

- Description: TODO

#### `public void glDeleteRenderbuffers(int count, int[] buffers)`

- Description: TODO

#### `public void glDeleteTextures(int count, int[] buffers)`

- Description: TODO

#### `public void glDeleteVertexArrays(int count, int[] buffers)`

- Description: TODO

#### `public void glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled)`

- Description: TODO

#### `public void glDeleteSync(long id)`

- Description: TODO

#### `public void glDepthFunc(int func)`

- Description: TODO

#### `public void glDepthMask(boolean mask)`

- Description: TODO

#### `public void glDisable(int cap)`

- Description: TODO

#### `public void glDisablei(int cap, int index)`

- Description: TODO

#### `public void glDisableVertexAttribArray(int location)`

- Description: TODO

#### `public void glDrawBuffer(int buf)`

- Description: TODO

#### `public void glDrawBuffers(int n, int[] bufs)`

- Description: TODO

#### `public void glDrawArraysInstanced(int mode, int first, int count, int primcount)`

- Description: TODO

#### `public void glDrawArrays(int mode, int first, int count)`

- Description: TODO

#### `public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount)`

- Description: TODO

#### `public void glDrawElements(int mode, int count, int type, long indices)`

- Description: TODO

#### `public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices)`

- Description: TODO

#### `public void glEnable(int cap)`

- Description: TODO

#### `public void glEnablei(int cap, int index)`

- Description: TODO

#### `public void glEnableVertexAttribArray(int location)`

- Description: TODO

#### `public long glFenceSync(int condition, int flags)`

- Description: TODO

#### `public void glFinish()`

- Description: TODO

#### `public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level)`

- Description: TODO

#### `public void glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer)`

- Description: TODO

#### `public void glGenBuffers(int n, int[] buffer)`

- Description: TODO

#### `public void glGenFramebuffers(int n, int[] buffer)`

- Description: TODO

#### `public void glGenQueries(int n, int[] buffer)`

- Description: TODO

#### `public void glGenTextures(int n, int[] buffer)`

- Description: TODO

#### `public void glGenVertexArrays(int n, int[] buffer)`

- Description: TODO

#### `public void glGetBufferSubData(int target, int offset, int size, ByteBuffer data)`

- Description: TODO

#### `public int glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer)`

- Description: TODO

#### `public int glGetError()`

- Description: TODO

#### `public void glGetFloatv(int pname, float[] data)`

- Description: TODO

#### `public void glGetIntegerv(int pname, int[] data)`

- Description: TODO

#### `public String glGetString(int name)`

- Description: TODO

#### `public String glGetStringi(int name, int index)`

- Description: TODO

#### `public void glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`

- Description: TODO

#### `public void glGetProgramiv(int shader, int pname, int[] buf)`

- Description: TODO

#### `public void glGetQueryObjectiv(int id, int pname, int[] params)`

- Description: TODO

#### `public void glGetQueryObjecti64v(int id, int pname, long[] params)`

- Description: TODO

#### `public void glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`

- Description: TODO

#### `public void glGetShaderiv(int shader, int pname, int[] buf)`

- Description: TODO

#### `public void glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values)`

- Description: TODO

#### `public void glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels)`

- Description: TODO

#### `public void glGetTexImage(int target, int level, int format, int type, long offset)`

- Description: TODO

#### `public int glGetUniformLocation(int program, String name)`

- Description: TODO

#### `public void glLineWidth(float w)`

- Description: TODO

#### `public void glLinkProgram(int program)`

- Description: TODO

#### `public void glObjectLabel(int identifier, int name, int length, byte[] label)`

- Description: TODO

#### `public void glPixelStorei(int pname, int param)`

- Description: TODO

#### `public void glPointSize(float size)`

- Description: TODO

#### `public void glPolygonMode(int face, int mode)`

- Description: TODO

#### `public void glPolygonOffset(float factor, float units)`

- Description: TODO

#### `public void glQueryCounter(int id, int target)`

- Description: TODO

#### `public void glReadBuffer(int buf)`

- Description: TODO

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, long offset)`

- Description: TODO

#### `public void glRenderbufferStorage(int target, int format, int width, int height)`

- Description: TODO

#### `public void glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height)`

- Description: TODO

#### `public void glSampleCoverage(float value, boolean invert)`

- Description: TODO

#### `public void glShaderSource(int shader, int count, String[] string, int[] lengths)`

- Description: TODO

#### `public void glScissor(int x, int y, int w, int h)`

- Description: TODO

#### `public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations)`

- Description: TODO

#### `public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexParameterf(int target, int pname, float param)`

- Description: TODO

#### `public void glTexParameterfv(int target, int pname, float[] param)`

- Description: TODO

#### `public void glTexParameteri(int target, int pname, int param)`

- Description: TODO

#### `public void glUniform1f(int location, float v0)`

- Description: TODO

#### `public void glUniform2f(int location, float v0, float v1)`

- Description: TODO

#### `public void glUniform3f(int location, float v0, float v1, float v2)`

- Description: TODO

#### `public void glUniform3fv(int location, int count, float[] val)`

- Description: TODO

#### `public void glUniform4f(int location, float v0, float v1, float v2, float v3)`

- Description: TODO

#### `public void glUniform4fv(int location, int count, float[] val)`

- Description: TODO

#### `public void glUniform1i(int location, int v0)`

- Description: TODO

#### `public void glUniform2i(int location, int v0, int v1)`

- Description: TODO

#### `public void glUniform3i(int location, int v0, int v1, int v2)`

- Description: TODO

#### `public void glUniform4i(int location, int v0, int v1, int v2, int v3)`

- Description: TODO

#### `public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value)`

- Description: TODO

#### `public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value)`

- Description: TODO

#### `public void glUseProgram(int program)`

- Description: TODO

#### `public void glVertexAttribDivisor(int location, int divisor)`

- Description: TODO

#### `public void glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer)`

- Description: TODO

#### `public void glVertexAttribIPointer(int location, int size, int type, int stride, long pointer)`

- Description: TODO

#### `public void glViewport(int x, int y, int w, int h)`

- Description: TODO
