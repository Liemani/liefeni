# LWJGLWrap

## Meta

- Source: [LWJGLWrap.java](../../../../../src/haven/render/lwjgl/LWJGLWrap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Wraps LWJGL-specific rendering.

## Code Members

### Member Index

#### Fields

- [instance](#member-1)

#### Methods

- [ckbuf(ByteBuffer buf, long size)](#member-2)
- [ckbuf(int[] buf, int size)](#member-3)
- [ckbuf(float[] buf, int size)](#member-4)
- [cksrcbuf(int count, String[] string, int[] lengths)](#member-5)
- [glActiveTexture(int texture)](#member-6)
- [glAttachShader(int program, int shader)](#member-7)
- [glBindAttribLocation(int program, int index, String name)](#member-8)
- [glBindBuffer(int target, int buffer)](#member-9)
- [glBindFragDataLocation(int program, int colornumber, String name)](#member-10)
- [glBindFramebuffer(int target, int buffer)](#member-11)
- [glBindRenderbuffer(int target, int buffer)](#member-12)
- [glBindTexture(int target, int texture)](#member-13)
- [glBindVertexArray(int array)](#member-14)
- [glBlendColor(float red, float green, float blue, float alpha)](#member-15)
- [glBlendEquation(int mode)](#member-16)
- [glBlendEquationSeparate(int cmode, int amode)](#member-17)
- [glBlendFunc(int sfac, int dfac)](#member-18)
- [glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac)](#member-19)
- [glBufferData(int target, long size, ByteBuffer data, int usage)](#member-20)
- [glBufferSubData(int target, long offset, long size, ByteBuffer data)](#member-21)
- [glCheckFramebufferStatus(int target)](#member-22)
- [glClear(int mask)](#member-23)
- [glClearBufferfv(int buffer, int drawbuffer, float[] value)](#member-24)
- [glClearBufferiv(int buffer, int drawbuffer, int[] value)](#member-25)
- [glClearBufferuiv(int buffer, int drawbuffer, int[] value)](#member-26)
- [glClearColor(float r, float g, float b, float a)](#member-27)
- [glClearDepth(double d)](#member-28)
- [glColorMask(boolean r, boolean g, boolean b, boolean a)](#member-29)
- [glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a)](#member-30)
- [glCompileShader(int shader)](#member-31)
- [glCreateProgram()](#member-32)
- [glCreateShader(int type)](#member-33)
- [glCullFace(int mode)](#member-34)
- [glDeleteBuffers(int count, int[] buffers)](#member-35)
- [glDeleteFramebuffers(int count, int[] buffers)](#member-36)
- [glDeleteShader(int id)](#member-37)
- [glDeleteQueries(int count, int[] buffer)](#member-38)
- [glDeleteProgram(int id)](#member-39)
- [glDeleteRenderbuffers(int count, int[] buffers)](#member-40)
- [glDeleteTextures(int count, int[] buffers)](#member-41)
- [glDeleteVertexArrays(int count, int[] buffers)](#member-42)
- [glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled)](#member-43)
- [glDeleteSync(long id)](#member-44)
- [glDepthFunc(int func)](#member-45)
- [glDepthMask(boolean mask)](#member-46)
- [glDisable(int cap)](#member-47)
- [glDisablei(int cap, int index)](#member-48)
- [glDisableVertexAttribArray(int location)](#member-49)
- [glDrawBuffer(int buf)](#member-50)
- [glDrawBuffers(int n, int[] bufs)](#member-51)
- [glDrawArraysInstanced(int mode, int first, int count, int primcount)](#member-52)
- [glDrawArrays(int mode, int first, int count)](#member-53)
- [glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount)](#member-54)
- [glDrawElements(int mode, int count, int type, long indices)](#member-55)
- [glDrawRangeElements(int mode, int start, int end, int count, int type, long indices)](#member-56)
- [glEnable(int cap)](#member-57)
- [glEnablei(int cap, int index)](#member-58)
- [glEnableVertexAttribArray(int location)](#member-59)
- [glFenceSync(int condition, int flags)](#member-60)
- [glFinish()](#member-61)
- [glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level)](#member-62)
- [glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer)](#member-63)
- [glGenBuffers(int n, int[] buffer)](#member-64)
- [glGenFramebuffers(int n, int[] buffer)](#member-65)
- [glGenQueries(int n, int[] buffer)](#member-66)
- [glGenTextures(int n, int[] buffer)](#member-67)
- [glGenVertexArrays(int n, int[] buffer)](#member-68)
- [glGetBufferSubData(int target, int offset, int size, ByteBuffer data)](#member-69)
- [glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer)](#member-70)
- [glGetError()](#member-71)
- [glGetFloatv(int pname, float[] data)](#member-72)
- [glGetIntegerv(int pname, int[] data)](#member-73)
- [glGetString(int name)](#member-74)
- [glGetStringi(int name, int index)](#member-75)
- [glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog)](#member-76)
- [glGetProgramiv(int shader, int pname, int[] buf)](#member-77)
- [glGetQueryObjectiv(int id, int pname, int[] params)](#member-78)
- [glGetQueryObjecti64v(int id, int pname, long[] params)](#member-79)
- [glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog)](#member-80)
- [glGetShaderiv(int shader, int pname, int[] buf)](#member-81)
- [glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values)](#member-82)
- [glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels)](#member-83)
- [glGetTexImage(int target, int level, int format, int type, long offset)](#member-84)
- [glGetUniformLocation(int program, String name)](#member-85)
- [glLineWidth(float w)](#member-86)
- [glLinkProgram(int program)](#member-87)
- [glObjectLabel(int identifier, int name, int length, byte[] label)](#member-88)
- [glPixelStorei(int pname, int param)](#member-89)
- [glPointSize(float size)](#member-90)
- [glPolygonMode(int face, int mode)](#member-91)
- [glPolygonOffset(float factor, float units)](#member-92)
- [glQueryCounter(int id, int target)](#member-93)
- [glReadBuffer(int buf)](#member-94)
- [glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data)](#member-95)
- [glReadPixels(int x, int y, int width, int height, int format, int type, long offset)](#member-96)
- [glRenderbufferStorage(int target, int format, int width, int height)](#member-97)
- [glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height)](#member-98)
- [glSampleCoverage(float value, boolean invert)](#member-99)
- [glShaderSource(int shader, int count, String[] string, int[] lengths)](#member-100)
- [glScissor(int x, int y, int w, int h)](#member-101)
- [glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data)](#member-102)
- [glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data)](#member-103)
- [glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations)](#member-104)
- [glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data)](#member-105)
- [glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data)](#member-106)
- [glTexParameterf(int target, int pname, float param)](#member-107)
- [glTexParameterfv(int target, int pname, float[] param)](#member-108)
- [glTexParameteri(int target, int pname, int param)](#member-109)
- [glUniform1f(int location, float v0)](#member-110)
- [glUniform2f(int location, float v0, float v1)](#member-111)
- [glUniform3f(int location, float v0, float v1, float v2)](#member-112)
- [glUniform3fv(int location, int count, float[] val)](#member-113)
- [glUniform4f(int location, float v0, float v1, float v2, float v3)](#member-114)
- [glUniform4fv(int location, int count, float[] val)](#member-115)
- [glUniform1i(int location, int v0)](#member-116)
- [glUniform2i(int location, int v0, int v1)](#member-117)
- [glUniform3i(int location, int v0, int v1, int v2)](#member-118)
- [glUniform4i(int location, int v0, int v1, int v2, int v3)](#member-119)
- [glUniformMatrix3fv(int location, int count, boolean transpose, float[] value)](#member-120)
- [glUniformMatrix4fv(int location, int count, boolean transpose, float[] value)](#member-121)
- [glUseProgram(int program)](#member-122)
- [glVertexAttribDivisor(int location, int divisor)](#member-123)
- [glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer)](#member-124)
- [glVertexAttribIPointer(int location, int size, int type, int stride, long pointer)](#member-125)
- [glViewport(int x, int y, int w, int h)](#member-126)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `instance`

- Description: TODO

#### Methods

<a id="member-2"></a>
##### `ckbuf(ByteBuffer buf, long size)`

- Description: TODO

<a id="member-3"></a>
##### `ckbuf(int[] buf, int size)`

- Description: TODO

<a id="member-4"></a>
##### `ckbuf(float[] buf, int size)`

- Description: TODO

<a id="member-5"></a>
##### `cksrcbuf(int count, String[] string, int[] lengths)`

- Description: TODO

<a id="member-6"></a>
##### `glActiveTexture(int texture)`

- Description: TODO

<a id="member-7"></a>
##### `glAttachShader(int program, int shader)`

- Description: TODO

<a id="member-8"></a>
##### `glBindAttribLocation(int program, int index, String name)`

- Description: TODO

<a id="member-9"></a>
##### `glBindBuffer(int target, int buffer)`

- Description: TODO

<a id="member-10"></a>
##### `glBindFragDataLocation(int program, int colornumber, String name)`

- Description: TODO

<a id="member-11"></a>
##### `glBindFramebuffer(int target, int buffer)`

- Description: TODO

<a id="member-12"></a>
##### `glBindRenderbuffer(int target, int buffer)`

- Description: TODO

<a id="member-13"></a>
##### `glBindTexture(int target, int texture)`

- Description: TODO

<a id="member-14"></a>
##### `glBindVertexArray(int array)`

- Description: TODO

<a id="member-15"></a>
##### `glBlendColor(float red, float green, float blue, float alpha)`

- Description: TODO

<a id="member-16"></a>
##### `glBlendEquation(int mode)`

- Description: TODO

<a id="member-17"></a>
##### `glBlendEquationSeparate(int cmode, int amode)`

- Description: TODO

<a id="member-18"></a>
##### `glBlendFunc(int sfac, int dfac)`

- Description: TODO

<a id="member-19"></a>
##### `glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac)`

- Description: TODO

<a id="member-20"></a>
##### `glBufferData(int target, long size, ByteBuffer data, int usage)`

- Description: TODO

<a id="member-21"></a>
##### `glBufferSubData(int target, long offset, long size, ByteBuffer data)`

- Description: TODO

<a id="member-22"></a>
##### `glCheckFramebufferStatus(int target)`

- Description: TODO

<a id="member-23"></a>
##### `glClear(int mask)`

- Description: TODO

<a id="member-24"></a>
##### `glClearBufferfv(int buffer, int drawbuffer, float[] value)`

- Description: TODO

<a id="member-25"></a>
##### `glClearBufferiv(int buffer, int drawbuffer, int[] value)`

- Description: TODO

<a id="member-26"></a>
##### `glClearBufferuiv(int buffer, int drawbuffer, int[] value)`

- Description: TODO

<a id="member-27"></a>
##### `glClearColor(float r, float g, float b, float a)`

- Description: TODO

<a id="member-28"></a>
##### `glClearDepth(double d)`

- Description: TODO

<a id="member-29"></a>
##### `glColorMask(boolean r, boolean g, boolean b, boolean a)`

- Description: TODO

<a id="member-30"></a>
##### `glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a)`

- Description: TODO

<a id="member-31"></a>
##### `glCompileShader(int shader)`

- Description: TODO

<a id="member-32"></a>
##### `glCreateProgram()`

- Description: TODO

<a id="member-33"></a>
##### `glCreateShader(int type)`

- Description: TODO

<a id="member-34"></a>
##### `glCullFace(int mode)`

- Description: TODO

<a id="member-35"></a>
##### `glDeleteBuffers(int count, int[] buffers)`

- Description: TODO

<a id="member-36"></a>
##### `glDeleteFramebuffers(int count, int[] buffers)`

- Description: TODO

<a id="member-37"></a>
##### `glDeleteShader(int id)`

- Description: TODO

<a id="member-38"></a>
##### `glDeleteQueries(int count, int[] buffer)`

- Description: TODO

<a id="member-39"></a>
##### `glDeleteProgram(int id)`

- Description: TODO

<a id="member-40"></a>
##### `glDeleteRenderbuffers(int count, int[] buffers)`

- Description: TODO

<a id="member-41"></a>
##### `glDeleteTextures(int count, int[] buffers)`

- Description: TODO

<a id="member-42"></a>
##### `glDeleteVertexArrays(int count, int[] buffers)`

- Description: TODO

<a id="member-43"></a>
##### `glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled)`

- Description: TODO

<a id="member-44"></a>
##### `glDeleteSync(long id)`

- Description: TODO

<a id="member-45"></a>
##### `glDepthFunc(int func)`

- Description: TODO

<a id="member-46"></a>
##### `glDepthMask(boolean mask)`

- Description: TODO

<a id="member-47"></a>
##### `glDisable(int cap)`

- Description: TODO

<a id="member-48"></a>
##### `glDisablei(int cap, int index)`

- Description: TODO

<a id="member-49"></a>
##### `glDisableVertexAttribArray(int location)`

- Description: TODO

<a id="member-50"></a>
##### `glDrawBuffer(int buf)`

- Description: TODO

<a id="member-51"></a>
##### `glDrawBuffers(int n, int[] bufs)`

- Description: TODO

<a id="member-52"></a>
##### `glDrawArraysInstanced(int mode, int first, int count, int primcount)`

- Description: TODO

<a id="member-53"></a>
##### `glDrawArrays(int mode, int first, int count)`

- Description: TODO

<a id="member-54"></a>
##### `glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount)`

- Description: TODO

<a id="member-55"></a>
##### `glDrawElements(int mode, int count, int type, long indices)`

- Description: TODO

<a id="member-56"></a>
##### `glDrawRangeElements(int mode, int start, int end, int count, int type, long indices)`

- Description: TODO

<a id="member-57"></a>
##### `glEnable(int cap)`

- Description: TODO

<a id="member-58"></a>
##### `glEnablei(int cap, int index)`

- Description: TODO

<a id="member-59"></a>
##### `glEnableVertexAttribArray(int location)`

- Description: TODO

<a id="member-60"></a>
##### `glFenceSync(int condition, int flags)`

- Description: TODO

<a id="member-61"></a>
##### `glFinish()`

- Description: TODO

<a id="member-62"></a>
##### `glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level)`

- Description: TODO

<a id="member-63"></a>
##### `glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer)`

- Description: TODO

<a id="member-64"></a>
##### `glGenBuffers(int n, int[] buffer)`

- Description: TODO

<a id="member-65"></a>
##### `glGenFramebuffers(int n, int[] buffer)`

- Description: TODO

<a id="member-66"></a>
##### `glGenQueries(int n, int[] buffer)`

- Description: TODO

<a id="member-67"></a>
##### `glGenTextures(int n, int[] buffer)`

- Description: TODO

<a id="member-68"></a>
##### `glGenVertexArrays(int n, int[] buffer)`

- Description: TODO

<a id="member-69"></a>
##### `glGetBufferSubData(int target, int offset, int size, ByteBuffer data)`

- Description: TODO

<a id="member-70"></a>
##### `glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer)`

- Description: TODO

<a id="member-71"></a>
##### `glGetError()`

- Description: TODO

<a id="member-72"></a>
##### `glGetFloatv(int pname, float[] data)`

- Description: TODO

<a id="member-73"></a>
##### `glGetIntegerv(int pname, int[] data)`

- Description: TODO

<a id="member-74"></a>
##### `glGetString(int name)`

- Description: TODO

<a id="member-75"></a>
##### `glGetStringi(int name, int index)`

- Description: TODO

<a id="member-76"></a>
##### `glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`

- Description: TODO

<a id="member-77"></a>
##### `glGetProgramiv(int shader, int pname, int[] buf)`

- Description: TODO

<a id="member-78"></a>
##### `glGetQueryObjectiv(int id, int pname, int[] params)`

- Description: TODO

<a id="member-79"></a>
##### `glGetQueryObjecti64v(int id, int pname, long[] params)`

- Description: TODO

<a id="member-80"></a>
##### `glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`

- Description: TODO

<a id="member-81"></a>
##### `glGetShaderiv(int shader, int pname, int[] buf)`

- Description: TODO

<a id="member-82"></a>
##### `glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values)`

- Description: TODO

<a id="member-83"></a>
##### `glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels)`

- Description: TODO

<a id="member-84"></a>
##### `glGetTexImage(int target, int level, int format, int type, long offset)`

- Description: TODO

<a id="member-85"></a>
##### `glGetUniformLocation(int program, String name)`

- Description: TODO

<a id="member-86"></a>
##### `glLineWidth(float w)`

- Description: TODO

<a id="member-87"></a>
##### `glLinkProgram(int program)`

- Description: TODO

<a id="member-88"></a>
##### `glObjectLabel(int identifier, int name, int length, byte[] label)`

- Description: TODO

<a id="member-89"></a>
##### `glPixelStorei(int pname, int param)`

- Description: TODO

<a id="member-90"></a>
##### `glPointSize(float size)`

- Description: TODO

<a id="member-91"></a>
##### `glPolygonMode(int face, int mode)`

- Description: TODO

<a id="member-92"></a>
##### `glPolygonOffset(float factor, float units)`

- Description: TODO

<a id="member-93"></a>
##### `glQueryCounter(int id, int target)`

- Description: TODO

<a id="member-94"></a>
##### `glReadBuffer(int buf)`

- Description: TODO

<a id="member-95"></a>
##### `glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-96"></a>
##### `glReadPixels(int x, int y, int width, int height, int format, int type, long offset)`

- Description: TODO

<a id="member-97"></a>
##### `glRenderbufferStorage(int target, int format, int width, int height)`

- Description: TODO

<a id="member-98"></a>
##### `glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height)`

- Description: TODO

<a id="member-99"></a>
##### `glSampleCoverage(float value, boolean invert)`

- Description: TODO

<a id="member-100"></a>
##### `glShaderSource(int shader, int count, String[] string, int[] lengths)`

- Description: TODO

<a id="member-101"></a>
##### `glScissor(int x, int y, int w, int h)`

- Description: TODO

<a id="member-102"></a>
##### `glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-103"></a>
##### `glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-104"></a>
##### `glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations)`

- Description: TODO

<a id="member-105"></a>
##### `glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-106"></a>
##### `glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-107"></a>
##### `glTexParameterf(int target, int pname, float param)`

- Description: TODO

<a id="member-108"></a>
##### `glTexParameterfv(int target, int pname, float[] param)`

- Description: TODO

<a id="member-109"></a>
##### `glTexParameteri(int target, int pname, int param)`

- Description: TODO

<a id="member-110"></a>
##### `glUniform1f(int location, float v0)`

- Description: TODO

<a id="member-111"></a>
##### `glUniform2f(int location, float v0, float v1)`

- Description: TODO

<a id="member-112"></a>
##### `glUniform3f(int location, float v0, float v1, float v2)`

- Description: TODO

<a id="member-113"></a>
##### `glUniform3fv(int location, int count, float[] val)`

- Description: TODO

<a id="member-114"></a>
##### `glUniform4f(int location, float v0, float v1, float v2, float v3)`

- Description: TODO

<a id="member-115"></a>
##### `glUniform4fv(int location, int count, float[] val)`

- Description: TODO

<a id="member-116"></a>
##### `glUniform1i(int location, int v0)`

- Description: TODO

<a id="member-117"></a>
##### `glUniform2i(int location, int v0, int v1)`

- Description: TODO

<a id="member-118"></a>
##### `glUniform3i(int location, int v0, int v1, int v2)`

- Description: TODO

<a id="member-119"></a>
##### `glUniform4i(int location, int v0, int v1, int v2, int v3)`

- Description: TODO

<a id="member-120"></a>
##### `glUniformMatrix3fv(int location, int count, boolean transpose, float[] value)`

- Description: TODO

<a id="member-121"></a>
##### `glUniformMatrix4fv(int location, int count, boolean transpose, float[] value)`

- Description: TODO

<a id="member-122"></a>
##### `glUseProgram(int program)`

- Description: TODO

<a id="member-123"></a>
##### `glVertexAttribDivisor(int location, int divisor)`

- Description: TODO

<a id="member-124"></a>
##### `glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer)`

- Description: TODO

<a id="member-125"></a>
##### `glVertexAttribIPointer(int location, int size, int type, int stride, long pointer)`

- Description: TODO

<a id="member-126"></a>
##### `glViewport(int x, int y, int w, int h)`

- Description: TODO
