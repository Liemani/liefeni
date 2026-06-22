---
source: [BGL.java](../../../../../../src/haven/render/gl/BGL.java)
created: 2026-06-13
updated: 2026-06-14
---

# BGL

Provides GL backend support for bgl.

## Nested Types

### BGLException

- Role: Represents bglexception within BGL.
- Description: Describes the nested bglexception type used by the enclosing class.

### BufState

- Role: Represents buf state within BGL.
- Description: Describes the nested buf state type used by the enclosing class.

### Command

- Role: Represents command within BGL.
- Description: Describes the nested command type used by the enclosing class.

### DCmd

- Role: Represents dcmd within BGL.
- Description: Describes the nested dcmd type used by the enclosing class.

### DebugMessage

- Role: Represents debug message within BGL.
- Description: Describes the nested debug message type used by the enclosing class.

### Dummy

- Role: Represents dummy within BGL.
- Description: Describes the nested dummy type used by the enclosing class.

### Dump

- Role: Represents dump within BGL.
- Description: Describes the nested dump type used by the enclosing class.

### Formatter

- Role: Represents formatter within BGL.
- Description: Describes the nested formatter type used by the enclosing class.

### ID

- Role: Represents id within BGL.
- Description: Describes the nested id type used by the enclosing class.

### InfoDummy

- Role: Represents info dummy within BGL.
- Description: Describes the nested info dummy type used by the enclosing class.

### PopDummy

- Role: Represents pop dummy within BGL.
- Description: Describes the nested pop dummy type used by the enclosing class.

### Request

- Role: Represents request within BGL.
- Description: Describes the nested request type used by the enclosing class.

## Members

### Constants

#### `static final Map<Class<?>, Formatter<?>> cache = new HashMap<>()`
- Role: Implements the cache operation.
- Description: Implements the static final map<class<?>, formatter<?>> cache = new hash map<>() operation.
- Value: `new HashMap<>()`

### Fields

#### `final Class<T> cl`
- Role: Caches the cl value.
- Description: Caches the `cl` value for reuse.

#### `final String nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `final Field[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

#### `final String[] argn`
- Role: Caches the argn value.
- Description: Caches the `argn` value for reuse.

#### `ByteBuffer buf`
- Role: Caches the buf value.
- Description: Caches the `buf` value for reuse.

#### `int position, limit`
- Role: Caches the limit value.
- Description: Caches the `limit` value for reuse.

#### `int position, limit`
- Role: Caches the limit value.
- Description: Caches the `limit` value for reuse.

#### `public final Dump dump`
- Role: Caches the dump value.
- Description: Caches the `dump` value for reuse.

#### `public final int source, type, severity, id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final int source, type, severity, id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final int source, type, severity, id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final int source, type, severity, id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final String text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `public final List<DCmd> list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `public final DCmd mark`
- Role: Caches the mark value.
- Description: Caches the `mark` value for reuse.

#### `private final transient Map<Object, Dummy> dummies = new IdentityHashMap<Object, Dummy>()`
- Role: Implements the dummies operation.
- Description: Implements the private final transient map<object, dummy> dummies = new identity hash map<object, dummy>() operation.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final String clnm`
- Role: Caches the clnm value.
- Description: Caches the `clnm` value for reuse.

#### `public final String info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `public final String[] varn`
- Role: Caches the varn value.
- Description: Caches the `varn` value for reuse.

#### `public final Object[] vars`
- Role: Caches the vars value.
- Description: Caches the `vars` value for reuse.

#### `public final String clnm, mnm`
- Role: Caches the mnm value.
- Description: Caches the `mnm` value for reuse.

#### `public final String clnm, mnm`
- Role: Caches the mnm value.
- Description: Caches the `mnm` value for reuse.

#### `public final String[] argn`
- Role: Caches the argn value.
- Description: Caches the `argn` value for reuse.

#### `public final Object[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

### Methods

#### `Formatter(Class<T> cl)`
- Role: Handles the formatter workflow.
- Description: Implements the formatter operation.

#### `public static String format(float[] a)`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `public static String format(int[] a)`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `public String format(T ob)`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `static <T> Formatter<T> get(Class<T> cl)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public static <T> String fmt(T ob)`
- Role: Handles the fmt path.
- Description: Implements the fmt operation.

#### `public abstract void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void abort()`
- Role: Handles the abort path.
- Description: Implements the abort operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this BGL for debugging and logging.

#### `BufState(ByteBuffer buf, int position)`
- Role: Handles the buf state workflow.
- Description: Implements the buf state operation.

#### `BufState(ByteBuffer buf)`
- Role: Handles the buf state workflow.
- Description: Implements the buf state operation.

#### `void restore()`
- Role: Handles the restore path.
- Description: Implements the restore operation.

#### `public int glid()`
- Role: Handles the glid path.
- Description: Implements the glid operation.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public default void abort()`
- Role: Handles the abort path.
- Description: Implements the abort operation.

#### `protected abstract void add(Command cmd)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `protected abstract Iterable<Command> dump()`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public BGLException(BGL buf, Command mark, Throwable cause)`
- Role: Handles the bglexception path.
- Description: Implements the bgl exception operation.

#### `public void bglCheckErr()`
- Role: Handles the bgl check err path.
- Description: Implements the bgl check err operation.

#### `public void bglCreate(final GLObject ob)`
- Role: Handles the bgl create path.
- Description: Implements the bgl create operation.

#### `public void bglDelete(final GLObject ob)`
- Role: Handles the bgl delete path.
- Description: Implements the bgl delete operation.

#### `public void bglSubmit(final Request req)`
- Role: Handles the bgl submit path.
- Description: Implements the bgl submit operation.

#### `public void bglCallList(final BufferBGL list)`
- Role: Handles the bgl call list path.
- Description: Implements the bgl call list operation.

#### `public void bglCopyBufferf(final FloatBuffer dst, final int doff, final FloatBuffer src, final int soff, final int len)`
- Role: Handles the bgl copy bufferf path.
- Description: Implements the bgl copy bufferf operation.

#### `public void bglCopyBufferf(final FloatBuffer dst, final int doff, final float[] src, final int soff, final int len)`
- Role: Handles the bgl copy bufferf path.
- Description: Implements the bgl copy bufferf operation.

#### `public void glActiveTexture(final int texture)`
- Role: Handles the gl active texture path.
- Description: Implements the gl active texture operation.

#### `public void glAttachShader(final ID program, final ID shader)`
- Role: Handles the gl attach shader path.
- Description: Implements the gl attach shader operation.

#### `public void glBindAttribLocation(final ID program, final ID index, final String name)`
- Role: Handles the gl bind attrib location path.
- Description: Implements the gl bind attrib location operation.

#### `public void glBindBuffer(final int target, final ID buffer)`
- Role: Handles the gl bind buffer path.
- Description: Implements the gl bind buffer operation.

#### `public void glBindFramebuffer(final int target, final ID buffer)`
- Role: Handles the gl bind framebuffer path.
- Description: Implements the gl bind framebuffer operation.

#### `public void glBindRenderbuffer(final int target, final ID buffer)`
- Role: Handles the gl bind renderbuffer path.
- Description: Implements the gl bind renderbuffer operation.

#### `public void glBindTexture(final int target, final ID texture)`
- Role: Handles the gl bind texture path.
- Description: Implements the gl bind texture operation.

#### `public void glBindVertexArray(final ID array)`
- Role: Handles the gl bind vertex array path.
- Description: Implements the gl bind vertex array operation.

#### `public void glBlendColor(final float red, final float green, final float blue, final float alpha)`
- Role: Handles the gl blend color path.
- Description: Implements the gl blend color operation.

#### `public void glBlendEquation(final int mode)`
- Role: Handles the gl blend equation path.
- Description: Implements the gl blend equation operation.

#### `public void glBlendEquationSeparate(final int cmode, final int amode)`
- Role: Handles the gl blend equation separate path.
- Description: Implements the gl blend equation separate operation.

#### `public void glBlendFunc(final int sfac, final int dfac)`
- Role: Handles the gl blend func path.
- Description: Implements the gl blend func operation.

#### `public void glBlendFuncSeparate(final int csfac, final int cdfac, final int asfac, final int adfac)`
- Role: Handles the gl blend func separate path.
- Description: Implements the gl blend func separate operation.

#### `public void glBufferData(final int target, final long size, ByteBuffer data, final int usage)`
- Role: Handles the gl buffer data path.
- Description: Implements the gl buffer data operation.

#### `public void glBufferSubData(final int target, final long offset, final long size, ByteBuffer data)`
- Role: Handles the gl buffer sub data path.
- Description: Implements the gl buffer sub data operation.

#### `public void glClear(final int mask)`
- Role: Handles the gl clear path.
- Description: Implements the gl clear operation.

#### `public void glClearBufferfv(final int buffer, final int drawbuffer, final float[] value)`
- Role: Handles the gl clear bufferfv path.
- Description: Implements the gl clear bufferfv operation.

#### `public void glClearBufferiv(final int buffer, final int drawbuffer, final int[] value)`
- Role: Handles the gl clear bufferiv path.
- Description: Implements the gl clear bufferiv operation.

#### `public void glClearBufferuiv(final int buffer, final int drawbuffer, final int[] value)`
- Role: Handles the gl clear bufferuiv path.
- Description: Implements the gl clear bufferuiv operation.

#### `public void glClearColor(final float r, final float g, final float b, final float a)`
- Role: Handles the gl clear color path.
- Description: Implements the gl clear color operation.

#### `public void glClearDepth(final double d)`
- Role: Handles the gl clear depth texture path.
- Description: Implements the gl clear depth operation.

#### `public void glColorMask(final boolean r, final boolean g, final boolean b, final boolean a)`
- Role: Handles the gl color mask path.
- Description: Implements the gl color mask operation.

#### `public void glColorMaski(final int buf, final boolean r, final boolean g, final boolean b, final boolean a)`
- Role: Handles the gl color maski path.
- Description: Implements the gl color maski operation.

#### `public void glDeleteBuffers(final int count, final ID[] buffers)`
- Role: Handles the gl delete buffers path.
- Description: Implements the gl delete buffers operation.

#### `public void glDeleteFramebuffers(final int count, final ID[] buffers)`
- Role: Handles the gl delete framebuffers path.
- Description: Implements the gl delete framebuffers operation.

#### `public void glDeleteShader(final ID id)`
- Role: Handles the gl delete shader path.
- Description: Implements the gl delete shader operation.

#### `public void glDeleteProgram(final ID id)`
- Role: Handles the gl delete program path.
- Description: Implements the gl delete program operation.

#### `public void glDeleteRenderbuffers(final int count, final ID[] buffers)`
- Role: Handles the gl delete renderbuffers path.
- Description: Implements the gl delete renderbuffers operation.

#### `public void glDeleteTextures(final int count, final ID[] buffers)`
- Role: Handles the gl delete textures path.
- Description: Implements the gl delete textures operation.

#### `public void glDeleteVertexArrays(final int count, final ID[] buffers)`
- Role: Handles the gl delete vertex arrays path.
- Description: Implements the gl delete vertex arrays operation.

#### `public void glCullFace(final int mode)`
- Role: Handles the gl cull face path.
- Description: Implements the gl cull face operation.

#### `public void glDepthFunc(final int func)`
- Role: Handles the gl depth texture func path.
- Description: Implements the gl depth func operation.

#### `public void glDepthMask(final boolean mask)`
- Role: Handles the gl depth texture mask path.
- Description: Implements the gl depth mask operation.

#### `public void glDisable(final int cap)`
- Role: Handles the gl disable path.
- Description: Implements the gl disable operation.

#### `public void glDisablei(final int cap, final int index)`
- Role: Handles the gl disablei path.
- Description: Implements the gl disablei operation.

#### `public void glDisableVertexAttribArray(final ID location)`
- Role: Handles the gl disable vertex attrib array path.
- Description: Implements the gl disable vertex attrib array operation.

#### `public void glDisableVertexAttribArray(final ID location, final int offset)`
- Role: Handles the gl disable vertex attrib array path.
- Description: Implements the gl disable vertex attrib array operation.

#### `public void glDrawBuffer(final int buf)`
- Role: Handles the gl draw buffer path.
- Description: Implements the gl draw buffer operation.

#### `public void glDrawBuffers(final int n, final int[] bufs)`
- Role: Handles the gl draw buffers path.
- Description: Implements the gl draw buffers operation.

#### `public void glDrawArraysInstanced(final int mode, final int first, final int count, final int primcount)`
- Role: Handles the gl draw arrays instanced path.
- Description: Implements the gl draw arrays instanced operation.

#### `public void glDrawArrays(final int mode, final int first, final int count)`
- Role: Handles the gl draw arrays path.
- Description: Implements the gl draw arrays operation.

#### `public void glDrawElementsInstanced(final int mode, final int count, final int type, final long indices, final int primcount)`
- Role: Handles the gl draw elements instanced path.
- Description: Implements the gl draw elements instanced operation.

#### `public void glDrawElements(final int mode, final int count, final int type, final long indices)`
- Role: Handles the gl draw elements path.
- Description: Implements the gl draw elements operation.

#### `public void glDrawRangeElements(final int mode, final int start, final int end, final int count, final int type, final long indices)`
- Role: Handles the gl draw range elements path.
- Description: Implements the gl draw range elements operation.

#### `public void glEnable(final int cap)`
- Role: Handles the gl enable path.
- Description: Implements the gl enable operation.

#### `public void glEnablei(final int cap, final int index)`
- Role: Handles the gl enablei path.
- Description: Implements the gl enablei operation.

#### `public void glEnableVertexAttribArray(final ID location)`
- Role: Handles the gl enable vertex attrib array path.
- Description: Implements the gl enable vertex attrib array operation.

#### `public void glEnableVertexAttribArray(final ID location, final int offset)`
- Role: Handles the gl enable vertex attrib array path.
- Description: Implements the gl enable vertex attrib array operation.

#### `public void glDeleteSync(final long id)`
- Role: Handles the gl delete sync path.
- Description: Implements the gl delete sync operation.

#### `public void glFramebufferTexture2D(final int target, final int attachment, final int textarget, final ID texture, final int level)`
- Role: Handles the gl framebuffer texture2 d path.
- Description: Implements the gl framebuffer texture2 d operation.

#### `public void glFramebufferRenderbuffer(final int target, final int attachment, final int rbtarget, final ID renderbuffer)`
- Role: Handles the gl framebuffer renderbuffer path.
- Description: Implements the gl framebuffer renderbuffer operation.

#### `public void glGetTexImage(final int target, final int level, final int format, final int type, ByteBuffer pixels)`
- Role: Handles the gl get texture image path.
- Description: Implements the gl get tex image operation.

#### `public void glGetTexImage(final int target, final int level, final int format, final int type, long offset)`
- Role: Handles the gl get texture image path.
- Description: Implements the gl get tex image operation.

#### `public void glLineWidth(final float w)`
- Role: Handles the gl line width path.
- Description: Implements the gl line width operation.

#### `public void glLinkProgram(final ID program)`
- Role: Handles the gl link program path.
- Description: Implements the gl link program operation.

#### `public void glObjectLabel(final int identifier, final ID name, final int length, final byte[] label)`
- Role: Handles the gl object label path.
- Description: Implements the gl object label operation.

#### `public void glObjectLabel(int identifier, ID name, String label)`
- Role: Handles the gl object label path.
- Description: Implements the gl object label operation.

#### `public void glPixelStorei(final int pname, final int param)`
- Role: Handles the gl pixel storei path.
- Description: Implements the gl pixel storei operation.

#### `public void glPointSize(final float size)`
- Role: Handles the gl point size path.
- Description: Implements the gl point size operation.

#### `public void glPolygonMode(final int face, final int mode)`
- Role: Handles the gl polygon mode path.
- Description: Implements the gl polygon mode operation.

#### `public void glPolygonOffset(final float factor, final float units)`
- Role: Handles the gl polygon offset path.
- Description: Implements the gl polygon offset operation.

#### `public void glReadBuffer(final int buf)`
- Role: Handles the gl read buffer path.
- Description: Implements the gl read buffer operation.

#### `public void glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, ByteBuffer data)`
- Role: Handles the gl read pixels path.
- Description: Implements the gl read pixels operation.

#### `public void glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, long offset)`
- Role: Handles the gl read pixels path.
- Description: Implements the gl read pixels operation.

#### `public void glRenderbufferStorage(final int target, final int format, final int width, final int height)`
- Role: Handles the gl renderbuffer storage path.
- Description: Implements the gl renderbuffer storage operation.

#### `public void glRenderbufferStorageMultisample(final int target, final int samples, final int format, final int width, final int height)`
- Role: Handles the gl renderbuffer storage multisample path.
- Description: Implements the gl renderbuffer storage multisample operation.

#### `public void glSampleCoverage(final float value, final boolean invert)`
- Role: Handles the gl sample coverage path.
- Description: Implements the gl sample coverage operation.

#### `public void glScissor(final int x, final int y, final int w, final int h)`
- Role: Handles the gl scissor path.
- Description: Implements the gl scissor operation.

#### `public void glTexImage2D(final int target, final int level, final int internalformat, final int width, final int height, final int border, final int format, final int type, ByteBuffer data)`
- Role: Handles the gl texture image2 d path.
- Description: Implements the gl tex image2 d operation.

#### `public void glTexSubImage2D(final int target, final int level, final int xoff, final int yoff, final int width, final int height, final int format, final int type, ByteBuffer data)`
- Role: Handles the gl texture sub image2 d path.
- Description: Implements the gl tex sub image2 d operation.

#### `public void glTexImage2DMultisample(final int target, final int samples, final int internalformat, final int width, final int height, final boolean fixedsamplelocations)`
- Role: Handles the gl texture image2 dmultisample path.
- Description: Implements the gl tex image2 d multisample operation.

#### `public void glTexImage3D(final int target, final int level, final int internalformat, final int width, final int height, final int depth, final int border, final int format, final int type, ByteBuffer data)`
- Role: Handles the gl texture image3 d path.
- Description: Implements the gl tex image3 d operation.

#### `public void glTexSubImage3D(final int target, final int level, final int xoff, final int yoff, final int zoff, final int width, final int height, final int depth, final int format, final int type, ByteBuffer data)`
- Role: Handles the gl texture sub image3 d path.
- Description: Implements the gl tex sub image3 d operation.

#### `public void glTexParameterf(final int target, final int pname, final float param)`
- Role: Handles the gl texture parameterf path.
- Description: Implements the gl tex parameterf operation.

#### `public void glTexParameterfv(final int target, final int pname, final float[] param)`
- Role: Handles the gl texture parameterfv path.
- Description: Implements the gl tex parameterfv operation.

#### `public void glTexParameteri(final int target, final int pname, final int param)`
- Role: Handles the gl texture parameteri path.
- Description: Implements the gl tex parameteri operation.

#### `public void glUniform1f(final ID location, final float v0)`
- Role: Handles the gl uniform1f path.
- Description: Implements the gl uniform1f operation.

#### `public void glUniform2f(final ID location, final float v0, final float v1)`
- Role: Handles the gl uniform2f path.
- Description: Implements the gl uniform2f operation.

#### `public void glUniform3f(final ID location, final float v0, final float v1, final float v2)`
- Role: Handles the gl uniform3f path.
- Description: Implements the gl uniform3f operation.

#### `public void glUniform3fv(final ID location, final int count, final float[] val)`
- Role: Handles the gl uniform3fv path.
- Description: Implements the gl uniform3fv operation.

#### `public void glUniform4f(final ID location, final float v0, final float v1, final float v2, final float v3)`
- Role: Handles the gl uniform4f path.
- Description: Implements the gl uniform4f operation.

#### `public void glUniform4fv(final ID location, final int count, final float[] val)`
- Role: Handles the gl uniform4fv path.
- Description: Implements the gl uniform4fv operation.

#### `public void glUniform1i(final ID location, final int v0)`
- Role: Handles the gl uniform1i path.
- Description: Implements the gl uniform1i operation.

#### `public void glUniform2i(final ID location, final int v0, final int v1)`
- Role: Handles the gl uniform2i path.
- Description: Implements the gl uniform2i operation.

#### `public void glUniform3i(final ID location, final int v0, final int v1, final int v2)`
- Role: Handles the gl uniform3i path.
- Description: Implements the gl uniform3i operation.

#### `public void glUniform4i(final ID location, final int v0, final int v1, final int v2, final int v3)`
- Role: Handles the gl uniform4i path.
- Description: Implements the gl uniform4i operation.

#### `public void glUniformMatrix3fv(final ID location, final int count, final boolean transpose, final float[] value)`
- Role: Handles the gl uniform matrix3fv path.
- Description: Implements the gl uniform matrix3fv operation.

#### `public void glUniformMatrix4fv(final ID location, final int count, final boolean transpose, final float[] value)`
- Role: Handles the gl uniform matrix4fv path.
- Description: Implements the gl uniform matrix4fv operation.

#### `public void glUseProgram(final ID program)`
- Role: Handles the gl use program path.
- Description: Implements the gl use program operation.

#### `public void glVertexAttribDivisor(final ID location, final int divisor)`
- Role: Handles the gl vertex attrib divisor path.
- Description: Implements the gl vertex attrib divisor operation.

#### `public void glVertexAttribDivisor(final ID location, final int offset, final int divisor)`
- Role: Handles the gl vertex attrib divisor path.
- Description: Implements the gl vertex attrib divisor operation.

#### `public void glVertexAttribPointer(final ID location, final int size, final int type, final boolean normalized, final int stride, final long pointer)`
- Role: Handles the gl vertex attrib pointer path.
- Description: Implements the gl vertex attrib pointer operation.

#### `public void glVertexAttribPointer(final ID location, final int offset, final int size, final int type, final boolean normalized, final int stride, final long pointer)`
- Role: Handles the gl vertex attrib pointer path.
- Description: Implements the gl vertex attrib pointer operation.

#### `public void glVertexAttribIPointer(final ID location, final int size, final int type, final int stride, final long pointer)`
- Role: Handles the gl vertex attrib ipointer path.
- Description: Implements the gl vertex attrib i pointer operation.

#### `public void glVertexAttribIPointer(final ID location, final int offset, final int size, final int type, final int stride, final long pointer)`
- Role: Handles the gl vertex attrib ipointer path.
- Description: Implements the gl vertex attrib i pointer operation.

#### `public void glViewport(final int x, final int y, final int w, final int h)`
- Role: Handles the gl viewport path.
- Description: Implements the gl viewport operation.

#### `public DebugMessage(int source, int type, int severity, int id, String text)`
- Role: Handles the debug message path.
- Description: Implements the debug message operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this BGL for debugging and logging.

#### `public void glDebugMessageControl(final int source, final int type, final int severity, final int[] ids, final boolean enabled)`
- Role: Handles the gl debug message control path.
- Description: Implements the gl debug message control operation.

#### `public void bglGetDebugMessageLog(final Consumer<DebugMessage> cb)`
- Role: Handles the bgl get debug message log path.
- Description: Implements the bgl get debug message log operation.

#### `public Dummy(int id, Object o)`
- Role: Handles the dummy path.
- Description: Implements the dummy operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this BGL for debugging and logging.

#### `public InfoDummy(int id, Object o, String info)`
- Role: Handles the info dummy path.
- Description: Implements the info dummy operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this BGL for debugging and logging.

#### `public PopDummy(int id, Object o, Dump d)`
- Role: Handles the pop dummy path.
- Description: Implements the pop dummy operation.

#### `private Dummy intern(Object o)`
- Role: Handles the intern path.
- Description: Implements the intern operation.

#### `private Object mapval(Object o)`
- Role: Handles the mapval path.
- Description: Implements the mapval operation.

#### `public DCmd(Dump d, Object o)`
- Role: Handles the dcmd path.
- Description: Implements the d cmd operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this BGL for debugging and logging.

#### `public Dump(BGL buf, Command mark)`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public void dump(PrintStream out)`
- Role: Handles the dump path.
- Description: Implements the dump operation.

#### `public void dump()`
- Role: Handles the dump path.
- Description: Implements the dump operation.