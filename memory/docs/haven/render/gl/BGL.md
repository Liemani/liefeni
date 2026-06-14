# BGL

## Meta

- Source: [BGL.java](../../../../../src/haven/render/gl/BGL.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Wraps low-level OpenGL access.

## Code Members

### Member Index

#### Fields

- [cl](#member-1)
- [nm](#member-2)
- [args](#member-3)
- [argn](#member-4)
- [cache](#member-9)
- [buf](#member-15)
- [position](#member-16)
- [limit](#member-17)
- [dump](#member-26)
- [source](#member-131)
- [type](#member-132)
- [severity](#member-133)
- [id](#member-134)
- [text](#member-135)
- [list](#member-140)
- [mark](#member-141)
- [dummies](#member-142)
- [id](#member-143)
- [clnm](#member-144)
- [info](#member-147)
- [varn](#member-150)
- [vars](#member-151)
- [clnm](#member-155)
- [mnm](#member-156)
- [argn](#member-157)
- [args](#member-158)

#### Methods

- [Formatter(Class<T> cl)](#member-5)
- [format(float[] a)](#member-6)
- [format(int[] a)](#member-7)
- [format(T ob)](#member-8)
- [get(Class<T> cl)](#member-10)
- [fmt(T ob)](#member-11)
- [public abstract void run(GL gl);](#member-12)
- [abort()](#member-13)
- [toString()](#member-14)
- [BufState(ByteBuffer buf, int position)](#member-18)
- [BufState(ByteBuffer buf)](#member-19)
- [restore()](#member-20)
- [public int glid();](#member-21)
- [public void run(GL gl);](#member-22)
- [abort()](#member-23)
- [protected abstract void add(Command cmd);](#member-24)
- [protected abstract Iterable<Command> dump();](#member-25)
- [BGLException(BGL buf, Command mark, Throwable cause)](#member-27)
- [bglCheckErr()](#member-28)
- [bglCreate(final GLObject ob)](#member-29)
- [bglDelete(final GLObject ob)](#member-30)
- [bglSubmit(final Request req)](#member-31)
- [bglCallList(final BufferBGL list)](#member-32)
- [bglCopyBufferf(final FloatBuffer dst, final int doff, final FloatBuffer src, final int soff, final int len)](#member-33)
- [bglCopyBufferf(final FloatBuffer dst, final int doff, final float[] src, final int soff, final int len)](#member-34)
- [glActiveTexture(final int texture)](#member-35)
- [glAttachShader(final ID program, final ID shader)](#member-36)
- [glBindAttribLocation(final ID program, final ID index, final String name)](#member-37)
- [glBindBuffer(final int target, final ID buffer)](#member-38)
- [glBindFramebuffer(final int target, final ID buffer)](#member-39)
- [glBindRenderbuffer(final int target, final ID buffer)](#member-40)
- [glBindTexture(final int target, final ID texture)](#member-41)
- [glBindVertexArray(final ID array)](#member-42)
- [glBlendColor(final float red, final float green, final float blue, final float alpha)](#member-43)
- [glBlendEquation(final int mode)](#member-44)
- [glBlendEquationSeparate(final int cmode, final int amode)](#member-45)
- [glBlendFunc(final int sfac, final int dfac)](#member-46)
- [glBlendFuncSeparate(final int csfac, final int cdfac, final int asfac, final int adfac)](#member-47)
- [glBufferData(final int target, final long size, ByteBuffer data, final int usage)](#member-48)
- [glBufferSubData(final int target, final long offset, final long size, ByteBuffer data)](#member-49)
- [glClear(final int mask)](#member-50)
- [glClearBufferfv(final int buffer, final int drawbuffer, final float[] value)](#member-51)
- [glClearBufferiv(final int buffer, final int drawbuffer, final int[] value)](#member-52)
- [glClearBufferuiv(final int buffer, final int drawbuffer, final int[] value)](#member-53)
- [glClearColor(final float r, final float g, final float b, final float a)](#member-54)
- [glClearDepth(final double d)](#member-55)
- [glColorMask(final boolean r, final boolean g, final boolean b, final boolean a)](#member-56)
- [glColorMaski(final int buf, final boolean r, final boolean g, final boolean b, final boolean a)](#member-57)
- [glDeleteBuffers(final int count, final ID[] buffers)](#member-58)
- [glDeleteFramebuffers(final int count, final ID[] buffers)](#member-59)
- [glDeleteShader(final ID id)](#member-60)
- [glDeleteProgram(final ID id)](#member-61)
- [glDeleteRenderbuffers(final int count, final ID[] buffers)](#member-62)
- [glDeleteTextures(final int count, final ID[] buffers)](#member-63)
- [glDeleteVertexArrays(final int count, final ID[] buffers)](#member-64)
- [glCullFace(final int mode)](#member-65)
- [glDepthFunc(final int func)](#member-66)
- [glDepthMask(final boolean mask)](#member-67)
- [glDisable(final int cap)](#member-68)
- [glDisablei(final int cap, final int index)](#member-69)
- [glDisableVertexAttribArray(final ID location)](#member-70)
- [glDisableVertexAttribArray(final ID location, final int offset)](#member-71)
- [glDrawBuffer(final int buf)](#member-72)
- [glDrawBuffers(final int n, final int[] bufs)](#member-73)
- [glDrawArraysInstanced(final int mode, final int first, final int count, final int primcount)](#member-74)
- [glDrawArrays(final int mode, final int first, final int count)](#member-75)
- [glDrawElementsInstanced(final int mode, final int count, final int type, final long indices, final int primcount)](#member-76)
- [glDrawElements(final int mode, final int count, final int type, final long indices)](#member-77)
- [glDrawRangeElements(final int mode, final int start, final int end, final int count, final int type, final long indices)](#member-78)
- [glEnable(final int cap)](#member-79)
- [glEnablei(final int cap, final int index)](#member-80)
- [glEnableVertexAttribArray(final ID location)](#member-81)
- [glEnableVertexAttribArray(final ID location, final int offset)](#member-82)
- [glDeleteSync(final long id)](#member-83)
- [glFramebufferTexture2D(final int target, final int attachment, final int textarget, final ID texture, final int level)](#member-84)
- [glFramebufferRenderbuffer(final int target, final int attachment, final int rbtarget, final ID renderbuffer)](#member-85)
- [glGetTexImage(final int target, final int level, final int format, final int type, ByteBuffer pixels)](#member-86)
- [glGetTexImage(final int target, final int level, final int format, final int type, long offset)](#member-87)
- [glLineWidth(final float w)](#member-88)
- [glLinkProgram(final ID program)](#member-89)
- [glObjectLabel(final int identifier, final ID name, final int length, final byte[] label)](#member-90)
- [glObjectLabel(int identifier, ID name, String label)](#member-91)
- [glPixelStorei(final int pname, final int param)](#member-92)
- [glPointSize(final float size)](#member-93)
- [glPolygonMode(final int face, final int mode)](#member-94)
- [glPolygonOffset(final float factor, final float units)](#member-95)
- [glReadBuffer(final int buf)](#member-96)
- [glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, ByteBuffer data)](#member-97)
- [glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, long offset)](#member-98)
- [glRenderbufferStorage(final int target, final int format, final int width, final int height)](#member-99)
- [glRenderbufferStorageMultisample(final int target, final int samples, final int format, final int width, final int height)](#member-100)
- [glSampleCoverage(final float value, final boolean invert)](#member-101)
- [glScissor(final int x, final int y, final int w, final int h)](#member-102)
- [glTexImage2D(final int target, final int level, final int internalformat, final int width, final int height, final int border, final int format, final int type, ByteBuffer data)](#member-103)
- [glTexSubImage2D(final int target, final int level, final int xoff, final int yoff, final int width, final int height, final int format, final int type, ByteBuffer data)](#member-104)
- [glTexImage2DMultisample(final int target, final int samples, final int internalformat, final int width, final int height, final boolean fixedsamplelocations)](#member-105)
- [glTexImage3D(final int target, final int level, final int internalformat, final int width, final int height, final int depth, final int border, final int format, final int type, ByteBuffer data)](#member-106)
- [glTexSubImage3D(final int target, final int level, final int xoff, final int yoff, final int zoff, final int width, final int height, final int depth, final int format, final int type, ByteBuffer data)](#member-107)
- [glTexParameterf(final int target, final int pname, final float param)](#member-108)
- [glTexParameterfv(final int target, final int pname, final float[] param)](#member-109)
- [glTexParameteri(final int target, final int pname, final int param)](#member-110)
- [glUniform1f(final ID location, final float v0)](#member-111)
- [glUniform2f(final ID location, final float v0, final float v1)](#member-112)
- [glUniform3f(final ID location, final float v0, final float v1, final float v2)](#member-113)
- [glUniform3fv(final ID location, final int count, final float[] val)](#member-114)
- [glUniform4f(final ID location, final float v0, final float v1, final float v2, final float v3)](#member-115)
- [glUniform4fv(final ID location, final int count, final float[] val)](#member-116)
- [glUniform1i(final ID location, final int v0)](#member-117)
- [glUniform2i(final ID location, final int v0, final int v1)](#member-118)
- [glUniform3i(final ID location, final int v0, final int v1, final int v2)](#member-119)
- [glUniform4i(final ID location, final int v0, final int v1, final int v2, final int v3)](#member-120)
- [glUniformMatrix3fv(final ID location, final int count, final boolean transpose, final float[] value)](#member-121)
- [glUniformMatrix4fv(final ID location, final int count, final boolean transpose, final float[] value)](#member-122)
- [glUseProgram(final ID program)](#member-123)
- [glVertexAttribDivisor(final ID location, final int divisor)](#member-124)
- [glVertexAttribDivisor(final ID location, final int offset, final int divisor)](#member-125)
- [glVertexAttribPointer(final ID location, final int size, final int type, final boolean normalized, final int stride, final long pointer)](#member-126)
- [glVertexAttribPointer(final ID location, final int offset, final int size, final int type, final boolean normalized, final int stride, final long pointer)](#member-127)
- [glVertexAttribIPointer(final ID location, final int size, final int type, final int stride, final long pointer)](#member-128)
- [glVertexAttribIPointer(final ID location, final int offset, final int size, final int type, final int stride, final long pointer)](#member-129)
- [glViewport(final int x, final int y, final int w, final int h)](#member-130)
- [DebugMessage(int source, int type, int severity, int id, String text)](#member-136)
- [toString()](#member-137)
- [glDebugMessageControl(final int source, final int type, final int severity, final int[] ids, final boolean enabled)](#member-138)
- [bglGetDebugMessageLog(final Consumer<DebugMessage> cb)](#member-139)
- [Dummy(int id, Object o)](#member-145)
- [toString()](#member-146)
- [InfoDummy(int id, Object o, String info)](#member-148)
- [toString()](#member-149)
- [PopDummy(int id, Object o, Dump d)](#member-152)
- [intern(Object o)](#member-153)
- [mapval(Object o)](#member-154)
- [DCmd(Dump d, Object o)](#member-159)
- [toString()](#member-160)
- [Dump(BGL buf, Command mark)](#member-161)
- [dump(PrintStream out)](#member-162)
- [dump()](#member-163)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `cl`

- Description: TODO

<a id="member-2"></a>
##### `nm`

- Description: TODO

<a id="member-3"></a>
##### `args`

- Description: TODO

<a id="member-4"></a>
##### `argn`

- Description: TODO

<a id="member-9"></a>
##### `cache`

- Description: TODO

<a id="member-15"></a>
##### `buf`

- Description: TODO

<a id="member-16"></a>
##### `position`

- Description: TODO

<a id="member-17"></a>
##### `limit`

- Description: TODO

<a id="member-26"></a>
##### `dump`

- Description: TODO

<a id="member-131"></a>
##### `source`

- Description: TODO

<a id="member-132"></a>
##### `type`

- Description: TODO

<a id="member-133"></a>
##### `severity`

- Description: TODO

<a id="member-134"></a>
##### `id`

- Description: TODO

<a id="member-135"></a>
##### `text`

- Description: TODO

<a id="member-140"></a>
##### `list`

- Description: TODO

<a id="member-141"></a>
##### `mark`

- Description: TODO

<a id="member-142"></a>
##### `dummies`

- Description: TODO

<a id="member-143"></a>
##### `id`

- Description: TODO

<a id="member-144"></a>
##### `clnm`

- Description: TODO

<a id="member-147"></a>
##### `info`

- Description: TODO

<a id="member-150"></a>
##### `varn`

- Description: TODO

<a id="member-151"></a>
##### `vars`

- Description: TODO

<a id="member-155"></a>
##### `clnm`

- Description: TODO

<a id="member-156"></a>
##### `mnm`

- Description: TODO

<a id="member-157"></a>
##### `argn`

- Description: TODO

<a id="member-158"></a>
##### `args`

- Description: TODO

#### Methods

<a id="member-5"></a>
##### `Formatter(Class<T> cl)`

- Description: TODO

<a id="member-6"></a>
##### `format(float[] a)`

- Description: TODO

<a id="member-7"></a>
##### `format(int[] a)`

- Description: TODO

<a id="member-8"></a>
##### `format(T ob)`

- Description: TODO

<a id="member-10"></a>
##### `get(Class<T> cl)`

- Description: TODO

<a id="member-11"></a>
##### `fmt(T ob)`

- Description: TODO

<a id="member-12"></a>
##### `public abstract void run(GL gl);`

- Description: TODO

<a id="member-13"></a>
##### `abort()`

- Description: TODO

<a id="member-14"></a>
##### `toString()`

- Description: TODO

<a id="member-18"></a>
##### `BufState(ByteBuffer buf, int position)`

- Description: TODO

<a id="member-19"></a>
##### `BufState(ByteBuffer buf)`

- Description: TODO

<a id="member-20"></a>
##### `restore()`

- Description: TODO

<a id="member-21"></a>
##### `public int glid();`

- Description: TODO

<a id="member-22"></a>
##### `public void run(GL gl);`

- Description: TODO

<a id="member-23"></a>
##### `abort()`

- Description: TODO

<a id="member-24"></a>
##### `protected abstract void add(Command cmd);`

- Description: TODO

<a id="member-25"></a>
##### `protected abstract Iterable<Command> dump();`

- Description: TODO

<a id="member-27"></a>
##### `BGLException(BGL buf, Command mark, Throwable cause)`

- Description: TODO

<a id="member-28"></a>
##### `bglCheckErr()`

- Description: TODO

<a id="member-29"></a>
##### `bglCreate(final GLObject ob)`

- Description: TODO

<a id="member-30"></a>
##### `bglDelete(final GLObject ob)`

- Description: TODO

<a id="member-31"></a>
##### `bglSubmit(final Request req)`

- Description: TODO

<a id="member-32"></a>
##### `bglCallList(final BufferBGL list)`

- Description: TODO

<a id="member-33"></a>
##### `bglCopyBufferf(final FloatBuffer dst, final int doff, final FloatBuffer src, final int soff, final int len)`

- Description: TODO

<a id="member-34"></a>
##### `bglCopyBufferf(final FloatBuffer dst, final int doff, final float[] src, final int soff, final int len)`

- Description: TODO

<a id="member-35"></a>
##### `glActiveTexture(final int texture)`

- Description: TODO

<a id="member-36"></a>
##### `glAttachShader(final ID program, final ID shader)`

- Description: TODO

<a id="member-37"></a>
##### `glBindAttribLocation(final ID program, final ID index, final String name)`

- Description: TODO

<a id="member-38"></a>
##### `glBindBuffer(final int target, final ID buffer)`

- Description: TODO

<a id="member-39"></a>
##### `glBindFramebuffer(final int target, final ID buffer)`

- Description: TODO

<a id="member-40"></a>
##### `glBindRenderbuffer(final int target, final ID buffer)`

- Description: TODO

<a id="member-41"></a>
##### `glBindTexture(final int target, final ID texture)`

- Description: TODO

<a id="member-42"></a>
##### `glBindVertexArray(final ID array)`

- Description: TODO

<a id="member-43"></a>
##### `glBlendColor(final float red, final float green, final float blue, final float alpha)`

- Description: TODO

<a id="member-44"></a>
##### `glBlendEquation(final int mode)`

- Description: TODO

<a id="member-45"></a>
##### `glBlendEquationSeparate(final int cmode, final int amode)`

- Description: TODO

<a id="member-46"></a>
##### `glBlendFunc(final int sfac, final int dfac)`

- Description: TODO

<a id="member-47"></a>
##### `glBlendFuncSeparate(final int csfac, final int cdfac, final int asfac, final int adfac)`

- Description: TODO

<a id="member-48"></a>
##### `glBufferData(final int target, final long size, ByteBuffer data, final int usage)`

- Description: TODO

<a id="member-49"></a>
##### `glBufferSubData(final int target, final long offset, final long size, ByteBuffer data)`

- Description: TODO

<a id="member-50"></a>
##### `glClear(final int mask)`

- Description: TODO

<a id="member-51"></a>
##### `glClearBufferfv(final int buffer, final int drawbuffer, final float[] value)`

- Description: TODO

<a id="member-52"></a>
##### `glClearBufferiv(final int buffer, final int drawbuffer, final int[] value)`

- Description: TODO

<a id="member-53"></a>
##### `glClearBufferuiv(final int buffer, final int drawbuffer, final int[] value)`

- Description: TODO

<a id="member-54"></a>
##### `glClearColor(final float r, final float g, final float b, final float a)`

- Description: TODO

<a id="member-55"></a>
##### `glClearDepth(final double d)`

- Description: TODO

<a id="member-56"></a>
##### `glColorMask(final boolean r, final boolean g, final boolean b, final boolean a)`

- Description: TODO

<a id="member-57"></a>
##### `glColorMaski(final int buf, final boolean r, final boolean g, final boolean b, final boolean a)`

- Description: TODO

<a id="member-58"></a>
##### `glDeleteBuffers(final int count, final ID[] buffers)`

- Description: TODO

<a id="member-59"></a>
##### `glDeleteFramebuffers(final int count, final ID[] buffers)`

- Description: TODO

<a id="member-60"></a>
##### `glDeleteShader(final ID id)`

- Description: TODO

<a id="member-61"></a>
##### `glDeleteProgram(final ID id)`

- Description: TODO

<a id="member-62"></a>
##### `glDeleteRenderbuffers(final int count, final ID[] buffers)`

- Description: TODO

<a id="member-63"></a>
##### `glDeleteTextures(final int count, final ID[] buffers)`

- Description: TODO

<a id="member-64"></a>
##### `glDeleteVertexArrays(final int count, final ID[] buffers)`

- Description: TODO

<a id="member-65"></a>
##### `glCullFace(final int mode)`

- Description: TODO

<a id="member-66"></a>
##### `glDepthFunc(final int func)`

- Description: TODO

<a id="member-67"></a>
##### `glDepthMask(final boolean mask)`

- Description: TODO

<a id="member-68"></a>
##### `glDisable(final int cap)`

- Description: TODO

<a id="member-69"></a>
##### `glDisablei(final int cap, final int index)`

- Description: TODO

<a id="member-70"></a>
##### `glDisableVertexAttribArray(final ID location)`

- Description: TODO

<a id="member-71"></a>
##### `glDisableVertexAttribArray(final ID location, final int offset)`

- Description: TODO

<a id="member-72"></a>
##### `glDrawBuffer(final int buf)`

- Description: TODO

<a id="member-73"></a>
##### `glDrawBuffers(final int n, final int[] bufs)`

- Description: TODO

<a id="member-74"></a>
##### `glDrawArraysInstanced(final int mode, final int first, final int count, final int primcount)`

- Description: TODO

<a id="member-75"></a>
##### `glDrawArrays(final int mode, final int first, final int count)`

- Description: TODO

<a id="member-76"></a>
##### `glDrawElementsInstanced(final int mode, final int count, final int type, final long indices, final int primcount)`

- Description: TODO

<a id="member-77"></a>
##### `glDrawElements(final int mode, final int count, final int type, final long indices)`

- Description: TODO

<a id="member-78"></a>
##### `glDrawRangeElements(final int mode, final int start, final int end, final int count, final int type, final long indices)`

- Description: TODO

<a id="member-79"></a>
##### `glEnable(final int cap)`

- Description: TODO

<a id="member-80"></a>
##### `glEnablei(final int cap, final int index)`

- Description: TODO

<a id="member-81"></a>
##### `glEnableVertexAttribArray(final ID location)`

- Description: TODO

<a id="member-82"></a>
##### `glEnableVertexAttribArray(final ID location, final int offset)`

- Description: TODO

<a id="member-83"></a>
##### `glDeleteSync(final long id)`

- Description: TODO

<a id="member-84"></a>
##### `glFramebufferTexture2D(final int target, final int attachment, final int textarget, final ID texture, final int level)`

- Description: TODO

<a id="member-85"></a>
##### `glFramebufferRenderbuffer(final int target, final int attachment, final int rbtarget, final ID renderbuffer)`

- Description: TODO

<a id="member-86"></a>
##### `glGetTexImage(final int target, final int level, final int format, final int type, ByteBuffer pixels)`

- Description: TODO

<a id="member-87"></a>
##### `glGetTexImage(final int target, final int level, final int format, final int type, long offset)`

- Description: TODO

<a id="member-88"></a>
##### `glLineWidth(final float w)`

- Description: TODO

<a id="member-89"></a>
##### `glLinkProgram(final ID program)`

- Description: TODO

<a id="member-90"></a>
##### `glObjectLabel(final int identifier, final ID name, final int length, final byte[] label)`

- Description: TODO

<a id="member-91"></a>
##### `glObjectLabel(int identifier, ID name, String label)`

- Description: TODO

<a id="member-92"></a>
##### `glPixelStorei(final int pname, final int param)`

- Description: TODO

<a id="member-93"></a>
##### `glPointSize(final float size)`

- Description: TODO

<a id="member-94"></a>
##### `glPolygonMode(final int face, final int mode)`

- Description: TODO

<a id="member-95"></a>
##### `glPolygonOffset(final float factor, final float units)`

- Description: TODO

<a id="member-96"></a>
##### `glReadBuffer(final int buf)`

- Description: TODO

<a id="member-97"></a>
##### `glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, ByteBuffer data)`

- Description: TODO

<a id="member-98"></a>
##### `glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, long offset)`

- Description: TODO

<a id="member-99"></a>
##### `glRenderbufferStorage(final int target, final int format, final int width, final int height)`

- Description: TODO

<a id="member-100"></a>
##### `glRenderbufferStorageMultisample(final int target, final int samples, final int format, final int width, final int height)`

- Description: TODO

<a id="member-101"></a>
##### `glSampleCoverage(final float value, final boolean invert)`

- Description: TODO

<a id="member-102"></a>
##### `glScissor(final int x, final int y, final int w, final int h)`

- Description: TODO

<a id="member-103"></a>
##### `glTexImage2D(final int target, final int level, final int internalformat, final int width, final int height, final int border, final int format, final int type, ByteBuffer data)`

- Description: TODO

<a id="member-104"></a>
##### `glTexSubImage2D(final int target, final int level, final int xoff, final int yoff, final int width, final int height, final int format, final int type, ByteBuffer data)`

- Description: TODO

<a id="member-105"></a>
##### `glTexImage2DMultisample(final int target, final int samples, final int internalformat, final int width, final int height, final boolean fixedsamplelocations)`

- Description: TODO

<a id="member-106"></a>
##### `glTexImage3D(final int target, final int level, final int internalformat, final int width, final int height, final int depth, final int border, final int format, final int type, ByteBuffer data)`

- Description: TODO

<a id="member-107"></a>
##### `glTexSubImage3D(final int target, final int level, final int xoff, final int yoff, final int zoff, final int width, final int height, final int depth, final int format, final int type, ByteBuffer data)`

- Description: TODO

<a id="member-108"></a>
##### `glTexParameterf(final int target, final int pname, final float param)`

- Description: TODO

<a id="member-109"></a>
##### `glTexParameterfv(final int target, final int pname, final float[] param)`

- Description: TODO

<a id="member-110"></a>
##### `glTexParameteri(final int target, final int pname, final int param)`

- Description: TODO

<a id="member-111"></a>
##### `glUniform1f(final ID location, final float v0)`

- Description: TODO

<a id="member-112"></a>
##### `glUniform2f(final ID location, final float v0, final float v1)`

- Description: TODO

<a id="member-113"></a>
##### `glUniform3f(final ID location, final float v0, final float v1, final float v2)`

- Description: TODO

<a id="member-114"></a>
##### `glUniform3fv(final ID location, final int count, final float[] val)`

- Description: TODO

<a id="member-115"></a>
##### `glUniform4f(final ID location, final float v0, final float v1, final float v2, final float v3)`

- Description: TODO

<a id="member-116"></a>
##### `glUniform4fv(final ID location, final int count, final float[] val)`

- Description: TODO

<a id="member-117"></a>
##### `glUniform1i(final ID location, final int v0)`

- Description: TODO

<a id="member-118"></a>
##### `glUniform2i(final ID location, final int v0, final int v1)`

- Description: TODO

<a id="member-119"></a>
##### `glUniform3i(final ID location, final int v0, final int v1, final int v2)`

- Description: TODO

<a id="member-120"></a>
##### `glUniform4i(final ID location, final int v0, final int v1, final int v2, final int v3)`

- Description: TODO

<a id="member-121"></a>
##### `glUniformMatrix3fv(final ID location, final int count, final boolean transpose, final float[] value)`

- Description: TODO

<a id="member-122"></a>
##### `glUniformMatrix4fv(final ID location, final int count, final boolean transpose, final float[] value)`

- Description: TODO

<a id="member-123"></a>
##### `glUseProgram(final ID program)`

- Description: TODO

<a id="member-124"></a>
##### `glVertexAttribDivisor(final ID location, final int divisor)`

- Description: TODO

<a id="member-125"></a>
##### `glVertexAttribDivisor(final ID location, final int offset, final int divisor)`

- Description: TODO

<a id="member-126"></a>
##### `glVertexAttribPointer(final ID location, final int size, final int type, final boolean normalized, final int stride, final long pointer)`

- Description: TODO

<a id="member-127"></a>
##### `glVertexAttribPointer(final ID location, final int offset, final int size, final int type, final boolean normalized, final int stride, final long pointer)`

- Description: TODO

<a id="member-128"></a>
##### `glVertexAttribIPointer(final ID location, final int size, final int type, final int stride, final long pointer)`

- Description: TODO

<a id="member-129"></a>
##### `glVertexAttribIPointer(final ID location, final int offset, final int size, final int type, final int stride, final long pointer)`

- Description: TODO

<a id="member-130"></a>
##### `glViewport(final int x, final int y, final int w, final int h)`

- Description: TODO

<a id="member-136"></a>
##### `DebugMessage(int source, int type, int severity, int id, String text)`

- Description: TODO

<a id="member-137"></a>
##### `toString()`

- Description: TODO

<a id="member-138"></a>
##### `glDebugMessageControl(final int source, final int type, final int severity, final int[] ids, final boolean enabled)`

- Description: TODO

<a id="member-139"></a>
##### `bglGetDebugMessageLog(final Consumer<DebugMessage> cb)`

- Description: TODO

<a id="member-145"></a>
##### `Dummy(int id, Object o)`

- Description: TODO

<a id="member-146"></a>
##### `toString()`

- Description: TODO

<a id="member-148"></a>
##### `InfoDummy(int id, Object o, String info)`

- Description: TODO

<a id="member-149"></a>
##### `toString()`

- Description: TODO

<a id="member-152"></a>
##### `PopDummy(int id, Object o, Dump d)`

- Description: TODO

<a id="member-153"></a>
##### `intern(Object o)`

- Description: TODO

<a id="member-154"></a>
##### `mapval(Object o)`

- Description: TODO

<a id="member-159"></a>
##### `DCmd(Dump d, Object o)`

- Description: TODO

<a id="member-160"></a>
##### `toString()`

- Description: TODO

<a id="member-161"></a>
##### `Dump(BGL buf, Command mark)`

- Description: TODO

<a id="member-162"></a>
##### `dump(PrintStream out)`

- Description: TODO

<a id="member-163"></a>
##### `dump()`

- Description: TODO
