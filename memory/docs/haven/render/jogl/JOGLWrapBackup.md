# JOGLWrapBackup

## Meta

- Source: [JOGLWrapBackup.java](../../../../../src/haven/render/jogl/JOGLWrapBackup.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides a JOGL wrap backup implementation.

## Code Members

### Member Index

#### Fields

- [back](#member-1)

#### Methods

- [getGL()](#member-2)
- [glActiveTexture(int texture)](#member-3)
- [glAttachShader(int program, int shader)](#member-4)
- [glBindAttribLocation(int program, int index, String name)](#member-5)
- [glBindBuffer(int target, int buffer)](#member-6)
- [glBindFragDataLocation(int program, int colornumber, String name)](#member-7)
- [glBindFramebuffer(int target, int buffer)](#member-8)
- [glBindRenderbuffer(int target, int buffer)](#member-9)
- [glBindTexture(int target, int texture)](#member-10)
- [glBindVertexArray(int array)](#member-11)
- [glBlendColor(float red, float green, float blue, float alpha)](#member-12)
- [glBlendEquation(int mode)](#member-13)
- [glBlendEquationSeparate(int cmode, int amode)](#member-14)
- [glBlendFunc(int sfac, int dfac)](#member-15)
- [glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac)](#member-16)
- [glBufferData(int target, long size, ByteBuffer data, int usage)](#member-17)
- [glBufferSubData(int target, long offset, long size, ByteBuffer data)](#member-18)
- [glCheckFramebufferStatus(int target)](#member-19)
- [glClear(int mask)](#member-20)
- [glClearBufferfv(int buffer, int drawbuffer, float[] value)](#member-21)
- [glClearBufferiv(int buffer, int drawbuffer, int[] value)](#member-22)
- [glClearBufferuiv(int buffer, int drawbuffer, int[] value)](#member-23)
- [glClearColor(float r, float g, float b, float a)](#member-24)
- [glClearDepth(double d)](#member-25)
- [glColorMask(boolean r, boolean g, boolean b, boolean a)](#member-26)
- [glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a)](#member-27)
- [glCompileShader(int shader)](#member-28)
- [glCreateProgram()](#member-29)
- [glCreateShader(int type)](#member-30)
- [glCullFace(int mode)](#member-31)
- [glDeleteBuffers(int count, int[] buffers)](#member-32)
- [glDeleteFramebuffers(int count, int[] buffers)](#member-33)
- [glDeleteShader(int id)](#member-34)
- [glDeleteQueries(int count, int[] buffer)](#member-35)
- [glDeleteProgram(int id)](#member-36)
- [glDeleteRenderbuffers(int count, int[] buffers)](#member-37)
- [glDeleteTextures(int count, int[] buffers)](#member-38)
- [glDeleteVertexArrays(int count, int[] buffers)](#member-39)
- [glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled)](#member-40)
- [glDeleteSync(long id)](#member-41)
- [glDepthFunc(int func)](#member-42)
- [glDepthMask(boolean mask)](#member-43)
- [glDisable(int cap)](#member-44)
- [glDisablei(int cap, int index)](#member-45)
- [glDisableVertexAttribArray(int location)](#member-46)
- [glDrawBuffer(int buf)](#member-47)
- [glDrawBuffers(int n, int[] bufs)](#member-48)
- [glDrawArraysInstanced(int mode, int first, int count, int primcount)](#member-49)
- [glDrawArrays(int mode, int first, int count)](#member-50)
- [glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount)](#member-51)
- [glDrawElements(int mode, int count, int type, long indices)](#member-52)
- [glDrawRangeElements(int mode, int start, int end, int count, int type, long indices)](#member-53)
- [glEnable(int cap)](#member-54)
- [glEnablei(int cap, int index)](#member-55)
- [glEnableVertexAttribArray(int location)](#member-56)
- [glFenceSync(int condition, int flags)](#member-57)
- [glFinish()](#member-58)
- [glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level)](#member-59)
- [glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer)](#member-60)
- [glGenBuffers(int n, int[] buffer)](#member-61)
- [glGenFramebuffers(int n, int[] buffer)](#member-62)
- [glGenQueries(int n, int[] buffer)](#member-63)
- [glGenTextures(int n, int[] buffer)](#member-64)
- [glGenVertexArrays(int n, int[] buffer)](#member-65)
- [glGetBufferSubData(int target, int offset, int size, ByteBuffer data)](#member-66)
- [glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer)](#member-67)
- [glGetError()](#member-68)
- [glGetFloatv(int pname, float[] data)](#member-69)
- [glGetIntegerv(int pname, int[] data)](#member-70)
- [glGetString(int name)](#member-71)
- [glGetStringi(int name, int index)](#member-72)
- [glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog)](#member-73)
- [glGetProgramiv(int shader, int pname, int[] buf)](#member-74)
- [glGetQueryObjectiv(int id, int pname, int[] params)](#member-75)
- [glGetQueryObjecti64v(int id, int pname, long[] params)](#member-76)
- [glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog)](#member-77)
- [glGetShaderiv(int shader, int pname, int[] buf)](#member-78)
- [glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values)](#member-79)
- [glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels)](#member-80)
- [glGetTexImage(int target, int level, int format, int type, long offset)](#member-81)
- [glGetUniformLocation(int program, String name)](#member-82)
- [glLineWidth(float w)](#member-83)
- [glLinkProgram(int program)](#member-84)
- [glObjectLabel(int identifier, int name, int length, byte[] label)](#member-85)
- [glPixelStorei(int pname, int param)](#member-86)
- [glPointSize(float size)](#member-87)
- [glPolygonMode(int face, int mode)](#member-88)
- [glPolygonOffset(float factor, float units)](#member-89)
- [glQueryCounter(int id, int target)](#member-90)
- [glReadBuffer(int buf)](#member-91)
- [glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data)](#member-92)
- [glReadPixels(int x, int y, int width, int height, int format, int type, long offset)](#member-93)
- [glRenderbufferStorage(int target, int format, int width, int height)](#member-94)
- [glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height)](#member-95)
- [glSampleCoverage(float value, boolean invert)](#member-96)
- [glShaderSource(int shader, int count, String[] string, int[] lengths)](#member-97)
- [glScissor(int x, int y, int w, int h)](#member-98)
- [glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data)](#member-99)
- [glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data)](#member-100)
- [glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations)](#member-101)
- [glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data)](#member-102)
- [glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data)](#member-103)
- [glTexParameterf(int target, int pname, float param)](#member-104)
- [glTexParameterfv(int target, int pname, float[] param)](#member-105)
- [glTexParameteri(int target, int pname, int param)](#member-106)
- [glUniform1f(int location, float v0)](#member-107)
- [glUniform2f(int location, float v0, float v1)](#member-108)
- [glUniform3f(int location, float v0, float v1, float v2)](#member-109)
- [glUniform3fv(int location, int count, float[] val)](#member-110)
- [glUniform4f(int location, float v0, float v1, float v2, float v3)](#member-111)
- [glUniform4fv(int location, int count, float[] val)](#member-112)
- [glUniform1i(int location, int v0)](#member-113)
- [glUniform2i(int location, int v0, int v1)](#member-114)
- [glUniform3i(int location, int v0, int v1, int v2)](#member-115)
- [glUniform4i(int location, int v0, int v1, int v2, int v3)](#member-116)
- [glUniformMatrix3fv(int location, int count, boolean transpose, float[] value)](#member-117)
- [glUniformMatrix4fv(int location, int count, boolean transpose, float[] value)](#member-118)
- [glUseProgram(int program)](#member-119)
- [glVertexAttribDivisor(int location, int divisor)](#member-120)
- [glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer)](#member-121)
- [glVertexAttribIPointer(int location, int size, int type, int stride, long pointer)](#member-122)
- [glViewport(int x, int y, int w, int h)](#member-123)
- [xlateexc(RuntimeException exc)](#member-124)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `back`

- Description: TODO

#### Methods

<a id="member-2"></a>
##### `getGL()`

- Description: TODO

<a id="member-3"></a>
##### `glActiveTexture(int texture)`

- Description: TODO

<a id="member-4"></a>
##### `glAttachShader(int program, int shader)`

- Description: TODO

<a id="member-5"></a>
##### `glBindAttribLocation(int program, int index, String name)`

- Description: TODO

<a id="member-6"></a>
##### `glBindBuffer(int target, int buffer)`

- Description: TODO

<a id="member-7"></a>
##### `glBindFragDataLocation(int program, int colornumber, String name)`

- Description: TODO

<a id="member-8"></a>
##### `glBindFramebuffer(int target, int buffer)`

- Description: TODO

<a id="member-9"></a>
##### `glBindRenderbuffer(int target, int buffer)`

- Description: TODO

<a id="member-10"></a>
##### `glBindTexture(int target, int texture)`

- Description: TODO

<a id="member-11"></a>
##### `glBindVertexArray(int array)`

- Description: TODO

<a id="member-12"></a>
##### `glBlendColor(float red, float green, float blue, float alpha)`

- Description: TODO

<a id="member-13"></a>
##### `glBlendEquation(int mode)`

- Description: TODO

<a id="member-14"></a>
##### `glBlendEquationSeparate(int cmode, int amode)`

- Description: TODO

<a id="member-15"></a>
##### `glBlendFunc(int sfac, int dfac)`

- Description: TODO

<a id="member-16"></a>
##### `glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac)`

- Description: TODO

<a id="member-17"></a>
##### `glBufferData(int target, long size, ByteBuffer data, int usage)`

- Description: TODO

<a id="member-18"></a>
##### `glBufferSubData(int target, long offset, long size, ByteBuffer data)`

- Description: TODO

<a id="member-19"></a>
##### `glCheckFramebufferStatus(int target)`

- Description: TODO

<a id="member-20"></a>
##### `glClear(int mask)`

- Description: TODO

<a id="member-21"></a>
##### `glClearBufferfv(int buffer, int drawbuffer, float[] value)`

- Description: TODO

<a id="member-22"></a>
##### `glClearBufferiv(int buffer, int drawbuffer, int[] value)`

- Description: TODO

<a id="member-23"></a>
##### `glClearBufferuiv(int buffer, int drawbuffer, int[] value)`

- Description: TODO

<a id="member-24"></a>
##### `glClearColor(float r, float g, float b, float a)`

- Description: TODO

<a id="member-25"></a>
##### `glClearDepth(double d)`

- Description: TODO

<a id="member-26"></a>
##### `glColorMask(boolean r, boolean g, boolean b, boolean a)`

- Description: TODO

<a id="member-27"></a>
##### `glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a)`

- Description: TODO

<a id="member-28"></a>
##### `glCompileShader(int shader)`

- Description: TODO

<a id="member-29"></a>
##### `glCreateProgram()`

- Description: TODO

<a id="member-30"></a>
##### `glCreateShader(int type)`

- Description: TODO

<a id="member-31"></a>
##### `glCullFace(int mode)`

- Description: TODO

<a id="member-32"></a>
##### `glDeleteBuffers(int count, int[] buffers)`

- Description: TODO

<a id="member-33"></a>
##### `glDeleteFramebuffers(int count, int[] buffers)`

- Description: TODO

<a id="member-34"></a>
##### `glDeleteShader(int id)`

- Description: TODO

<a id="member-35"></a>
##### `glDeleteQueries(int count, int[] buffer)`

- Description: TODO

<a id="member-36"></a>
##### `glDeleteProgram(int id)`

- Description: TODO

<a id="member-37"></a>
##### `glDeleteRenderbuffers(int count, int[] buffers)`

- Description: TODO

<a id="member-38"></a>
##### `glDeleteTextures(int count, int[] buffers)`

- Description: TODO

<a id="member-39"></a>
##### `glDeleteVertexArrays(int count, int[] buffers)`

- Description: TODO

<a id="member-40"></a>
##### `glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled)`

- Description: TODO

<a id="member-41"></a>
##### `glDeleteSync(long id)`

- Description: TODO

<a id="member-42"></a>
##### `glDepthFunc(int func)`

- Description: TODO

<a id="member-43"></a>
##### `glDepthMask(boolean mask)`

- Description: TODO

<a id="member-44"></a>
##### `glDisable(int cap)`

- Description: TODO

<a id="member-45"></a>
##### `glDisablei(int cap, int index)`

- Description: TODO

<a id="member-46"></a>
##### `glDisableVertexAttribArray(int location)`

- Description: TODO

<a id="member-47"></a>
##### `glDrawBuffer(int buf)`

- Description: TODO

<a id="member-48"></a>
##### `glDrawBuffers(int n, int[] bufs)`

- Description: TODO

<a id="member-49"></a>
##### `glDrawArraysInstanced(int mode, int first, int count, int primcount)`

- Description: TODO

<a id="member-50"></a>
##### `glDrawArrays(int mode, int first, int count)`

- Description: TODO

<a id="member-51"></a>
##### `glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount)`

- Description: TODO

<a id="member-52"></a>
##### `glDrawElements(int mode, int count, int type, long indices)`

- Description: TODO

<a id="member-53"></a>
##### `glDrawRangeElements(int mode, int start, int end, int count, int type, long indices)`

- Description: TODO

<a id="member-54"></a>
##### `glEnable(int cap)`

- Description: TODO

<a id="member-55"></a>
##### `glEnablei(int cap, int index)`

- Description: TODO

<a id="member-56"></a>
##### `glEnableVertexAttribArray(int location)`

- Description: TODO

<a id="member-57"></a>
##### `glFenceSync(int condition, int flags)`

- Description: TODO

<a id="member-58"></a>
##### `glFinish()`

- Description: TODO

<a id="member-59"></a>
##### `glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level)`

- Description: TODO

<a id="member-60"></a>
##### `glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer)`

- Description: TODO

<a id="member-61"></a>
##### `glGenBuffers(int n, int[] buffer)`

- Description: TODO

<a id="member-62"></a>
##### `glGenFramebuffers(int n, int[] buffer)`

- Description: TODO

<a id="member-63"></a>
##### `glGenQueries(int n, int[] buffer)`

- Description: TODO

<a id="member-64"></a>
##### `glGenTextures(int n, int[] buffer)`

- Description: TODO

<a id="member-65"></a>
##### `glGenVertexArrays(int n, int[] buffer)`

- Description: TODO

<a id="member-66"></a>
##### `glGetBufferSubData(int target, int offset, int size, ByteBuffer data)`

- Description: TODO

<a id="member-67"></a>
##### `glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer)`

- Description: TODO

<a id="member-68"></a>
##### `glGetError()`

- Description: TODO

<a id="member-69"></a>
##### `glGetFloatv(int pname, float[] data)`

- Description: TODO

<a id="member-70"></a>
##### `glGetIntegerv(int pname, int[] data)`

- Description: TODO

<a id="member-71"></a>
##### `glGetString(int name)`

- Description: TODO

<a id="member-72"></a>
##### `glGetStringi(int name, int index)`

- Description: TODO

<a id="member-73"></a>
##### `glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`

- Description: TODO

<a id="member-74"></a>
##### `glGetProgramiv(int shader, int pname, int[] buf)`

- Description: TODO

<a id="member-75"></a>
##### `glGetQueryObjectiv(int id, int pname, int[] params)`

- Description: TODO

<a id="member-76"></a>
##### `glGetQueryObjecti64v(int id, int pname, long[] params)`

- Description: TODO

<a id="member-77"></a>
##### `glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`

- Description: TODO

<a id="member-78"></a>
##### `glGetShaderiv(int shader, int pname, int[] buf)`

- Description: TODO

<a id="member-79"></a>
##### `glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values)`

- Description: TODO

<a id="member-80"></a>
##### `glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels)`

- Description: TODO

<a id="member-81"></a>
##### `glGetTexImage(int target, int level, int format, int type, long offset)`

- Description: TODO

<a id="member-82"></a>
##### `glGetUniformLocation(int program, String name)`

- Description: TODO

<a id="member-83"></a>
##### `glLineWidth(float w)`

- Description: TODO

<a id="member-84"></a>
##### `glLinkProgram(int program)`

- Description: TODO

<a id="member-85"></a>
##### `glObjectLabel(int identifier, int name, int length, byte[] label)`

- Description: TODO

<a id="member-86"></a>
##### `glPixelStorei(int pname, int param)`

- Description: TODO

<a id="member-87"></a>
##### `glPointSize(float size)`

- Description: TODO

<a id="member-88"></a>
##### `glPolygonMode(int face, int mode)`

- Description: TODO

<a id="member-89"></a>
##### `glPolygonOffset(float factor, float units)`

- Description: TODO

<a id="member-90"></a>
##### `glQueryCounter(int id, int target)`

- Description: TODO

<a id="member-91"></a>
##### `glReadBuffer(int buf)`

- Description: TODO

<a id="member-92"></a>
##### `glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-93"></a>
##### `glReadPixels(int x, int y, int width, int height, int format, int type, long offset)`

- Description: TODO

<a id="member-94"></a>
##### `glRenderbufferStorage(int target, int format, int width, int height)`

- Description: TODO

<a id="member-95"></a>
##### `glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height)`

- Description: TODO

<a id="member-96"></a>
##### `glSampleCoverage(float value, boolean invert)`

- Description: TODO

<a id="member-97"></a>
##### `glShaderSource(int shader, int count, String[] string, int[] lengths)`

- Description: TODO

<a id="member-98"></a>
##### `glScissor(int x, int y, int w, int h)`

- Description: TODO

<a id="member-99"></a>
##### `glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-100"></a>
##### `glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-101"></a>
##### `glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations)`

- Description: TODO

<a id="member-102"></a>
##### `glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-103"></a>
##### `glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data)`

- Description: TODO

<a id="member-104"></a>
##### `glTexParameterf(int target, int pname, float param)`

- Description: TODO

<a id="member-105"></a>
##### `glTexParameterfv(int target, int pname, float[] param)`

- Description: TODO

<a id="member-106"></a>
##### `glTexParameteri(int target, int pname, int param)`

- Description: TODO

<a id="member-107"></a>
##### `glUniform1f(int location, float v0)`

- Description: TODO

<a id="member-108"></a>
##### `glUniform2f(int location, float v0, float v1)`

- Description: TODO

<a id="member-109"></a>
##### `glUniform3f(int location, float v0, float v1, float v2)`

- Description: TODO

<a id="member-110"></a>
##### `glUniform3fv(int location, int count, float[] val)`

- Description: TODO

<a id="member-111"></a>
##### `glUniform4f(int location, float v0, float v1, float v2, float v3)`

- Description: TODO

<a id="member-112"></a>
##### `glUniform4fv(int location, int count, float[] val)`

- Description: TODO

<a id="member-113"></a>
##### `glUniform1i(int location, int v0)`

- Description: TODO

<a id="member-114"></a>
##### `glUniform2i(int location, int v0, int v1)`

- Description: TODO

<a id="member-115"></a>
##### `glUniform3i(int location, int v0, int v1, int v2)`

- Description: TODO

<a id="member-116"></a>
##### `glUniform4i(int location, int v0, int v1, int v2, int v3)`

- Description: TODO

<a id="member-117"></a>
##### `glUniformMatrix3fv(int location, int count, boolean transpose, float[] value)`

- Description: TODO

<a id="member-118"></a>
##### `glUniformMatrix4fv(int location, int count, boolean transpose, float[] value)`

- Description: TODO

<a id="member-119"></a>
##### `glUseProgram(int program)`

- Description: TODO

<a id="member-120"></a>
##### `glVertexAttribDivisor(int location, int divisor)`

- Description: TODO

<a id="member-121"></a>
##### `glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer)`

- Description: TODO

<a id="member-122"></a>
##### `glVertexAttribIPointer(int location, int size, int type, int stride, long pointer)`

- Description: TODO

<a id="member-123"></a>
##### `glViewport(int x, int y, int w, int h)`

- Description: TODO

<a id="member-124"></a>
##### `xlateexc(RuntimeException exc)`

- Description: TODO
