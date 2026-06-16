# LWJGLWrap

This file documents the responsibilities and members of `LWJGLWrap`.

## Meta

- Source: [LWJGLWrap.java](../../../../../src/haven/render/lwjgl/LWJGLWrap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Adapts the render backend to LWJGL for lwjglwrap.

## Members

### Constants

#### `public static final LWJGLWrap instance = new LWJGLWrap()`
- Role: Defines the shared instance constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `private static ByteBuffer ckbuf(ByteBuffer buf, long size)`
- Role: Performs ckbuf.
- Description: Supports the ckbuf operation used by the surrounding class.

#### `private static int[] ckbuf(int[] buf, int size)`
- Role: Performs ckbuf.
- Description: Supports the ckbuf operation used by the surrounding class.

#### `private static float[] ckbuf(float[] buf, int size)`
- Role: Performs ckbuf.
- Description: Supports the ckbuf operation used by the surrounding class.

#### `private static String[] cksrcbuf(int count, String[] string, int[] lengths)`
- Role: Performs cksrcbuf.
- Description: Supports the cksrcbuf operation used by the surrounding class.

#### `public void glActiveTexture(int texture)`
- Role: Performs gl active texture.
- Description: Supports the gl active texture operation used by the surrounding class.

#### `public void glAttachShader(int program, int shader)`
- Role: Performs gl attach shader.
- Description: Supports the gl attach shader operation used by the surrounding class.

#### `public void glBindAttribLocation(int program, int index, String name)`
- Role: Performs gl bind attrib location.
- Description: Supports the gl bind attrib location operation used by the surrounding class.

#### `public void glBindBuffer(int target, int buffer)`
- Role: Performs gl bind buffer.
- Description: Supports the gl bind buffer operation used by the surrounding class.

#### `public void glBindFragDataLocation(int program, int colornumber, String name)`
- Role: Performs gl bind frag data location.
- Description: Supports the gl bind frag data location operation used by the surrounding class.

#### `public void glBindFramebuffer(int target, int buffer)`
- Role: Performs gl bind framebuffer.
- Description: Supports the gl bind framebuffer operation used by the surrounding class.

#### `public void glBindRenderbuffer(int target, int buffer)`
- Role: Performs gl bind renderbuffer.
- Description: Supports the gl bind renderbuffer operation used by the surrounding class.

#### `public void glBindTexture(int target, int texture)`
- Role: Performs gl bind texture.
- Description: Supports the gl bind texture operation used by the surrounding class.

#### `public void glBindVertexArray(int array)`
- Role: Performs gl bind vertex array.
- Description: Supports the gl bind vertex array operation used by the surrounding class.

#### `public void glBlendColor(float red, float green, float blue, float alpha)`
- Role: Performs gl blend color.
- Description: Supports the gl blend color operation used by the surrounding class.

#### `public void glBlendEquation(int mode)`
- Role: Performs gl blend equation.
- Description: Supports the gl blend equation operation used by the surrounding class.

#### `public void glBlendEquationSeparate(int cmode, int amode)`
- Role: Performs gl blend equation separate.
- Description: Supports the gl blend equation separate operation used by the surrounding class.

#### `public void glBlendFunc(int sfac, int dfac)`
- Role: Performs gl blend func.
- Description: Supports the gl blend func operation used by the surrounding class.

#### `public void glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac)`
- Role: Performs gl blend func separate.
- Description: Supports the gl blend func separate operation used by the surrounding class.

#### `public void glBufferData(int target, long size, ByteBuffer data, int usage)`
- Role: Performs gl buffer data.
- Description: Supports the gl buffer data operation used by the surrounding class.

#### `public void glBufferSubData(int target, long offset, long size, ByteBuffer data)`
- Role: Performs gl buffer sub data.
- Description: Supports the gl buffer sub data operation used by the surrounding class.

#### `public int glCheckFramebufferStatus(int target)`
- Role: Performs gl check framebuffer status.
- Description: Supports the gl check framebuffer status operation used by the surrounding class.

#### `public void glClear(int mask)`
- Role: Performs gl clear.
- Description: Supports the gl clear operation used by the surrounding class.

#### `public void glClearBufferfv(int buffer, int drawbuffer, float[] value)`
- Role: Performs gl clear bufferfv.
- Description: Supports the gl clear bufferfv operation used by the surrounding class.

#### `public void glClearBufferiv(int buffer, int drawbuffer, int[] value)`
- Role: Performs gl clear bufferiv.
- Description: Supports the gl clear bufferiv operation used by the surrounding class.

#### `public void glClearBufferuiv(int buffer, int drawbuffer, int[] value)`
- Role: Performs gl clear bufferuiv.
- Description: Supports the gl clear bufferuiv operation used by the surrounding class.

#### `public void glClearColor(float r, float g, float b, float a)`
- Role: Performs gl clear color.
- Description: Supports the gl clear color operation used by the surrounding class.

#### `public void glClearDepth(double d)`
- Role: Performs gl clear depth.
- Description: Supports the gl clear depth operation used by the surrounding class.

#### `public void glColorMask(boolean r, boolean g, boolean b, boolean a)`
- Role: Performs gl color mask.
- Description: Supports the gl color mask operation used by the surrounding class.

#### `public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a)`
- Role: Performs gl color maski.
- Description: Supports the gl color maski operation used by the surrounding class.

#### `public void glCompileShader(int shader)`
- Role: Performs gl compile shader.
- Description: Supports the gl compile shader operation used by the surrounding class.

#### `public int glCreateProgram()`
- Role: Performs gl create program.
- Description: Supports the gl create program operation used by the surrounding class.

#### `public int glCreateShader(int type)`
- Role: Performs gl create shader.
- Description: Supports the gl create shader operation used by the surrounding class.

#### `public void glCullFace(int mode)`
- Role: Performs gl cull face.
- Description: Supports the gl cull face operation used by the surrounding class.

#### `public void glDeleteBuffers(int count, int[] buffers)`
- Role: Performs gl delete buffers.
- Description: Supports the gl delete buffers operation used by the surrounding class.

#### `public void glDeleteFramebuffers(int count, int[] buffers)`
- Role: Performs gl delete framebuffers.
- Description: Supports the gl delete framebuffers operation used by the surrounding class.

#### `public void glDeleteShader(int id)`
- Role: Performs gl delete shader.
- Description: Supports the gl delete shader operation used by the surrounding class.

#### `public void glDeleteQueries(int count, int[] buffer)`
- Role: Performs gl delete queries.
- Description: Supports the gl delete queries operation used by the surrounding class.

#### `public void glDeleteProgram(int id)`
- Role: Performs gl delete program.
- Description: Supports the gl delete program operation used by the surrounding class.

#### `public void glDeleteRenderbuffers(int count, int[] buffers)`
- Role: Performs gl delete renderbuffers.
- Description: Supports the gl delete renderbuffers operation used by the surrounding class.

#### `public void glDeleteTextures(int count, int[] buffers)`
- Role: Performs gl delete textures.
- Description: Supports the gl delete textures operation used by the surrounding class.

#### `public void glDeleteVertexArrays(int count, int[] buffers)`
- Role: Performs gl delete vertex arrays.
- Description: Supports the gl delete vertex arrays operation used by the surrounding class.

#### `public void glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled)`
- Role: Performs gl debug message control.
- Description: Supports the gl debug message control operation used by the surrounding class.

#### `public void glDeleteSync(long id)`
- Role: Performs gl delete sync.
- Description: Supports the gl delete sync operation used by the surrounding class.

#### `public void glDepthFunc(int func)`
- Role: Performs gl depth func.
- Description: Supports the gl depth func operation used by the surrounding class.

#### `public void glDepthMask(boolean mask)`
- Role: Performs gl depth mask.
- Description: Supports the gl depth mask operation used by the surrounding class.

#### `public void glDisable(int cap)`
- Role: Performs gl disable.
- Description: Supports the gl disable operation used by the surrounding class.

#### `public void glDisablei(int cap, int index)`
- Role: Performs gl disablei.
- Description: Supports the gl disablei operation used by the surrounding class.

#### `public void glDisableVertexAttribArray(int location)`
- Role: Performs gl disable vertex attrib array.
- Description: Supports the gl disable vertex attrib array operation used by the surrounding class.

#### `public void glDrawBuffer(int buf)`
- Role: Performs gl draw buffer.
- Description: Supports the gl draw buffer operation used by the surrounding class.

#### `public void glDrawBuffers(int n, int[] bufs)`
- Role: Performs gl draw buffers.
- Description: Supports the gl draw buffers operation used by the surrounding class.

#### `public void glDrawArraysInstanced(int mode, int first, int count, int primcount)`
- Role: Performs gl draw arrays instanced.
- Description: Supports the gl draw arrays instanced operation used by the surrounding class.

#### `public void glDrawArrays(int mode, int first, int count)`
- Role: Performs gl draw arrays.
- Description: Supports the gl draw arrays operation used by the surrounding class.

#### `public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount)`
- Role: Performs gl draw elements instanced.
- Description: Supports the gl draw elements instanced operation used by the surrounding class.

#### `public void glDrawElements(int mode, int count, int type, long indices)`
- Role: Performs gl draw elements.
- Description: Supports the gl draw elements operation used by the surrounding class.

#### `public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices)`
- Role: Performs gl draw range elements.
- Description: Supports the gl draw range elements operation used by the surrounding class.

#### `public void glEnable(int cap)`
- Role: Performs gl enable.
- Description: Supports the gl enable operation used by the surrounding class.

#### `public void glEnablei(int cap, int index)`
- Role: Performs gl enablei.
- Description: Supports the gl enablei operation used by the surrounding class.

#### `public void glEnableVertexAttribArray(int location)`
- Role: Performs gl enable vertex attrib array.
- Description: Supports the gl enable vertex attrib array operation used by the surrounding class.

#### `public long glFenceSync(int condition, int flags)`
- Role: Performs gl fence sync.
- Description: Supports the gl fence sync operation used by the surrounding class.

#### `public void glFinish()`
- Role: Performs gl finish.
- Description: Supports the gl finish operation used by the surrounding class.

#### `public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level)`
- Role: Performs gl framebuffer texture2 d.
- Description: Supports the gl framebuffer texture2 d operation used by the surrounding class.

#### `public void glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer)`
- Role: Performs gl framebuffer renderbuffer.
- Description: Supports the gl framebuffer renderbuffer operation used by the surrounding class.

#### `public void glGenBuffers(int n, int[] buffer)`
- Role: Performs gl gen buffers.
- Description: Supports the gl gen buffers operation used by the surrounding class.

#### `public void glGenFramebuffers(int n, int[] buffer)`
- Role: Performs gl gen framebuffers.
- Description: Supports the gl gen framebuffers operation used by the surrounding class.

#### `public void glGenQueries(int n, int[] buffer)`
- Role: Performs gl gen queries.
- Description: Supports the gl gen queries operation used by the surrounding class.

#### `public void glGenTextures(int n, int[] buffer)`
- Role: Performs gl gen textures.
- Description: Supports the gl gen textures operation used by the surrounding class.

#### `public void glGenVertexArrays(int n, int[] buffer)`
- Role: Performs gl gen vertex arrays.
- Description: Supports the gl gen vertex arrays operation used by the surrounding class.

#### `public void glGetBufferSubData(int target, int offset, int size, ByteBuffer data)`
- Role: Performs gl get buffer sub data.
- Description: Supports the gl get buffer sub data operation used by the surrounding class.

#### `public int glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer)`
- Role: Performs gl get debug message log.
- Description: Supports the gl get debug message log operation used by the surrounding class.

#### `public int glGetError()`
- Role: Performs gl get error.
- Description: Supports the gl get error operation used by the surrounding class.

#### `public void glGetFloatv(int pname, float[] data)`
- Role: Performs gl get floatv.
- Description: Supports the gl get floatv operation used by the surrounding class.

#### `public void glGetIntegerv(int pname, int[] data)`
- Role: Performs gl get integerv.
- Description: Supports the gl get integerv operation used by the surrounding class.

#### `public String glGetString(int name)`
- Role: Performs gl get string.
- Description: Supports the gl get string operation used by the surrounding class.

#### `public String glGetStringi(int name, int index)`
- Role: Performs gl get stringi.
- Description: Supports the gl get stringi operation used by the surrounding class.

#### `public void glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`
- Role: Performs gl get program info log.
- Description: Supports the gl get program info log operation used by the surrounding class.

#### `public void glGetProgramiv(int shader, int pname, int[] buf)`
- Role: Performs gl get programiv.
- Description: Supports the gl get programiv operation used by the surrounding class.

#### `public void glGetQueryObjectiv(int id, int pname, int[] params)`
- Role: Performs gl get query objectiv.
- Description: Supports the gl get query objectiv operation used by the surrounding class.

#### `public void glGetQueryObjecti64v(int id, int pname, long[] params)`
- Role: Performs gl get query objecti64v.
- Description: Supports the gl get query objecti64v operation used by the surrounding class.

#### `public void glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`
- Role: Performs gl get shader info log.
- Description: Supports the gl get shader info log operation used by the surrounding class.

#### `public void glGetShaderiv(int shader, int pname, int[] buf)`
- Role: Performs gl get shaderiv.
- Description: Supports the gl get shaderiv operation used by the surrounding class.

#### `public void glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values)`
- Role: Performs gl get synciv.
- Description: Supports the gl get synciv operation used by the surrounding class.

#### `public void glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels)`
- Role: Performs gl get tex image.
- Description: Supports the gl get tex image operation used by the surrounding class.

#### `public void glGetTexImage(int target, int level, int format, int type, long offset)`
- Role: Performs gl get tex image.
- Description: Supports the gl get tex image operation used by the surrounding class.

#### `public int glGetUniformLocation(int program, String name)`
- Role: Performs gl get uniform location.
- Description: Supports the gl get uniform location operation used by the surrounding class.

#### `public void glLineWidth(float w)`
- Role: Performs gl line width.
- Description: Supports the gl line width operation used by the surrounding class.

#### `public void glLinkProgram(int program)`
- Role: Performs gl link program.
- Description: Supports the gl link program operation used by the surrounding class.

#### `public void glObjectLabel(int identifier, int name, int length, byte[] label)`
- Role: Performs gl object label.
- Description: Supports the gl object label operation used by the surrounding class.

#### `public void glPixelStorei(int pname, int param)`
- Role: Performs gl pixel storei.
- Description: Supports the gl pixel storei operation used by the surrounding class.

#### `public void glPointSize(float size)`
- Role: Performs gl point size.
- Description: Supports the gl point size operation used by the surrounding class.

#### `public void glPolygonMode(int face, int mode)`
- Role: Performs gl polygon mode.
- Description: Supports the gl polygon mode operation used by the surrounding class.

#### `public void glPolygonOffset(float factor, float units)`
- Role: Performs gl polygon offset.
- Description: Supports the gl polygon offset operation used by the surrounding class.

#### `public void glQueryCounter(int id, int target)`
- Role: Performs gl query counter.
- Description: Supports the gl query counter operation used by the surrounding class.

#### `public void glReadBuffer(int buf)`
- Role: Performs gl read buffer.
- Description: Supports the gl read buffer operation used by the surrounding class.

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data)`
- Role: Performs gl read pixels.
- Description: Supports the gl read pixels operation used by the surrounding class.

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, long offset)`
- Role: Performs gl read pixels.
- Description: Supports the gl read pixels operation used by the surrounding class.

#### `public void glRenderbufferStorage(int target, int format, int width, int height)`
- Role: Performs gl renderbuffer storage.
- Description: Supports the gl renderbuffer storage operation used by the surrounding class.

#### `public void glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height)`
- Role: Performs gl renderbuffer storage multisample.
- Description: Supports the gl renderbuffer storage multisample operation used by the surrounding class.

#### `public void glSampleCoverage(float value, boolean invert)`
- Role: Performs gl sample coverage.
- Description: Supports the gl sample coverage operation used by the surrounding class.

#### `public void glShaderSource(int shader, int count, String[] string, int[] lengths)`
- Role: Performs gl shader source.
- Description: Supports the gl shader source operation used by the surrounding class.

#### `public void glScissor(int x, int y, int w, int h)`
- Role: Performs gl scissor.
- Description: Supports the gl scissor operation used by the surrounding class.

#### `public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data)`
- Role: Performs gl tex image2 d.
- Description: Supports the gl tex image2 d operation used by the surrounding class.

#### `public void glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data)`
- Role: Performs gl tex sub image2 d.
- Description: Supports the gl tex sub image2 d operation used by the surrounding class.

#### `public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations)`
- Role: Performs gl tex image2 dmultisample.
- Description: Supports the gl tex image2 dmultisample operation used by the surrounding class.

#### `public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data)`
- Role: Performs gl tex image3 d.
- Description: Supports the gl tex image3 d operation used by the surrounding class.

#### `public void glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data)`
- Role: Performs gl tex sub image3 d.
- Description: Supports the gl tex sub image3 d operation used by the surrounding class.

#### `public void glTexParameterf(int target, int pname, float param)`
- Role: Performs gl tex parameterf.
- Description: Supports the gl tex parameterf operation used by the surrounding class.

#### `public void glTexParameterfv(int target, int pname, float[] param)`
- Role: Performs gl tex parameterfv.
- Description: Supports the gl tex parameterfv operation used by the surrounding class.

#### `public void glTexParameteri(int target, int pname, int param)`
- Role: Performs gl tex parameteri.
- Description: Supports the gl tex parameteri operation used by the surrounding class.

#### `public void glUniform1f(int location, float v0)`
- Role: Performs gl uniform1f.
- Description: Supports the gl uniform1f operation used by the surrounding class.

#### `public void glUniform2f(int location, float v0, float v1)`
- Role: Performs gl uniform2f.
- Description: Supports the gl uniform2f operation used by the surrounding class.

#### `public void glUniform3f(int location, float v0, float v1, float v2)`
- Role: Performs gl uniform3f.
- Description: Supports the gl uniform3f operation used by the surrounding class.

#### `public void glUniform3fv(int location, int count, float[] val)`
- Role: Performs gl uniform3fv.
- Description: Supports the gl uniform3fv operation used by the surrounding class.

#### `public void glUniform4f(int location, float v0, float v1, float v2, float v3)`
- Role: Performs gl uniform4f.
- Description: Supports the gl uniform4f operation used by the surrounding class.

#### `public void glUniform4fv(int location, int count, float[] val)`
- Role: Performs gl uniform4fv.
- Description: Supports the gl uniform4fv operation used by the surrounding class.

#### `public void glUniform1i(int location, int v0)`
- Role: Performs gl uniform1i.
- Description: Supports the gl uniform1i operation used by the surrounding class.

#### `public void glUniform2i(int location, int v0, int v1)`
- Role: Performs gl uniform2i.
- Description: Supports the gl uniform2i operation used by the surrounding class.

#### `public void glUniform3i(int location, int v0, int v1, int v2)`
- Role: Performs gl uniform3i.
- Description: Supports the gl uniform3i operation used by the surrounding class.

#### `public void glUniform4i(int location, int v0, int v1, int v2, int v3)`
- Role: Performs gl uniform4i.
- Description: Supports the gl uniform4i operation used by the surrounding class.

#### `public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value)`
- Role: Performs gl uniform matrix3fv.
- Description: Supports the gl uniform matrix3fv operation used by the surrounding class.

#### `public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value)`
- Role: Performs gl uniform matrix4fv.
- Description: Supports the gl uniform matrix4fv operation used by the surrounding class.

#### `public void glUseProgram(int program)`
- Role: Performs gl use program.
- Description: Supports the gl use program operation used by the surrounding class.

#### `public void glVertexAttribDivisor(int location, int divisor)`
- Role: Performs gl vertex attrib divisor.
- Description: Supports the gl vertex attrib divisor operation used by the surrounding class.

#### `public void glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer)`
- Role: Performs gl vertex attrib pointer.
- Description: Supports the gl vertex attrib pointer operation used by the surrounding class.

#### `public void glVertexAttribIPointer(int location, int size, int type, int stride, long pointer)`
- Role: Performs gl vertex attrib ipointer.
- Description: Supports the gl vertex attrib ipointer operation used by the surrounding class.

#### `public void glViewport(int x, int y, int w, int h)`
- Role: Performs gl viewport.
- Description: Supports the gl viewport operation used by the surrounding class.
