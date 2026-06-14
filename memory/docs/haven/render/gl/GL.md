# GL

## Meta

- Source: [GL.java](../../../../../src/haven/render/gl/GL.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents GL capability access.

## Code Members

### Member Index

#### Constants

- [GL_ALIASED_LINE_WIDTH_RANGE](#member-1)
- [GL_ARRAY_BUFFER](#member-2)
- [GL_BACK](#member-3)
- [GL_BLEND](#member-4)
- [GL_BUFFER](#member-5)
- [GL_COLOR_ATTACHMENT0](#member-6)
- [GL_COLOR_BUFFER_BIT](#member-7)
- [GL_COMPILE_STATUS](#member-8)
- [GL_CONSTANT_ALPHA](#member-9)
- [GL_CONSTANT_COLOR](#member-10)
- [GL_CONTEXT_FLAGS](#member-11)
- [GL_CONTEXT_PROFILE_MASK](#member-12)
- [GL_CONTEXT_CORE_PROFILE_BIT](#member-13)
- [GL_CONTEXT_COMPATIBILITY_PROFILE_BIT](#member-14)
- [GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH](#member-15)
- [GL_DEBUG_OUTPUT](#member-16)
- [GL_DEPTH_ATTACHMENT](#member-17)
- [GL_DEPTH_BUFFER_BIT](#member-18)
- [GL_DONT_CARE](#member-19)
- [GL_DST_ALPHA](#member-20)
- [GL_DST_COLOR](#member-21)
- [GL_DYNAMIC_DRAW](#member-22)
- [GL_ELEMENT_ARRAY_BUFFER](#member-23)
- [GL_EXTENSIONS](#member-24)
- [GL_FRAGMENT_SHADER](#member-25)
- [GL_FRAMEBUFFER](#member-26)
- [GL_FRAMEBUFFER_COMPLETE](#member-27)
- [GL_FUNC_ADD](#member-28)
- [GL_FUNC_REVERSE_SUBTRACT](#member-29)
- [GL_FUNC_SUBTRACT](#member-30)
- [GL_INFO_LOG_LENGTH](#member-31)
- [GL_INVALID_ENUM](#member-32)
- [GL_INVALID_VALUE](#member-33)
- [GL_INVALID_OPERATION](#member-34)
- [GL_LINK_STATUS](#member-35)
- [GL_MAJOR_VERSION](#member-36)
- [GL_MAX](#member-37)
- [GL_MAX_COLOR_ATTACHMENTS](#member-38)
- [GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT](#member-39)
- [GL_MIN](#member-40)
- [GL_MINOR_VERSION](#member-41)
- [GL_NONE](#member-42)
- [GL_NUM_EXTENSIONS](#member-43)
- [GL_ONE](#member-44)
- [GL_ONE_MINUS_CONSTANT_ALPHA](#member-45)
- [GL_ONE_MINUS_CONSTANT_COLOR](#member-46)
- [GL_ONE_MINUS_DST_ALPHA](#member-47)
- [GL_ONE_MINUS_DST_COLOR](#member-48)
- [GL_ONE_MINUS_SRC_ALPHA](#member-49)
- [GL_ONE_MINUS_SRC_COLOR](#member-50)
- [GL_OUT_OF_MEMORY](#member-51)
- [GL_PACK_ALIGNMENT](#member-52)
- [GL_PIXEL_PACK_BUFFER](#member-53)
- [GL_PROGRAM_POINT_SIZE](#member-54)
- [GL_QUERY_RESULT](#member-55)
- [GL_QUERY_RESULT_AVAILABLE](#member-56)
- [GL_RENDERER](#member-57)
- [GL_SHADING_LANGUAGE_VERSION](#member-58)
- [GL_SIGNALED](#member-59)
- [GL_SRC_ALPHA](#member-60)
- [GL_SRC_COLOR](#member-61)
- [GL_STATIC_DRAW](#member-62)
- [GL_STREAM_DRAW](#member-63)
- [GL_STREAM_READ](#member-64)
- [GL_SYNC_GPU_COMMANDS_COMPLETE](#member-65)
- [GL_SYNC_STATUS](#member-66)
- [GL_TEXTURE](#member-67)
- [GL_TEXTURE0](#member-68)
- [GL_TEXTURE_1D](#member-69)
- [GL_TEXTURE_1D_ARRAY](#member-70)
- [GL_TEXTURE_2D](#member-71)
- [GL_TEXTURE_2D_ARRAY](#member-72)
- [GL_TEXTURE_2D_MULTISAMPLE](#member-73)
- [GL_TEXTURE_2D_MULTISAMPLE_ARRAY](#member-74)
- [GL_TEXTURE_3D](#member-75)
- [GL_TEXTURE_BORDER_COLOR](#member-76)
- [GL_TEXTURE_CUBE_MAP](#member-77)
- [GL_TEXTURE_CUBE_MAP_ARRAY](#member-78)
- [GL_TEXTURE_MIN_FILTER](#member-79)
- [GL_TEXTURE_MAG_FILTER](#member-80)
- [GL_TEXTURE_MAX_ANISOTROPY_EXT](#member-81)
- [GL_TEXTURE_WRAP_S](#member-82)
- [GL_TEXTURE_WRAP_T](#member-83)
- [GL_TEXTURE_WRAP_R](#member-84)
- [GL_TIMESTAMP](#member-85)
- [GL_VENDOR](#member-86)
- [GL_VERSION](#member-87)
- [GL_VERTEX_ARRAY](#member-88)
- [GL_VERTEX_SHADER](#member-89)
- [GL_ZERO](#member-90)
- [GL_NEAREST](#member-91)
- [GL_LINEAR](#member-92)
- [GL_NEAREST_MIPMAP_NEAREST](#member-93)
- [GL_NEAREST_MIPMAP_LINEAR](#member-94)
- [GL_LINEAR_MIPMAP_NEAREST](#member-95)
- [GL_LINEAR_MIPMAP_LINEAR](#member-96)
- [GL_REPEAT](#member-97)
- [GL_MIRRORED_REPEAT](#member-98)
- [GL_CLAMP_TO_EDGE](#member-99)
- [GL_CLAMP_TO_BORDER](#member-100)
- [GL_R8](#member-101)
- [GL_R8_SNORM](#member-102)
- [GL_R16](#member-103)
- [GL_R16_SNORM](#member-104)
- [GL_R16F](#member-105)
- [GL_R32F](#member-106)
- [GL_R8I](#member-107)
- [GL_R8UI](#member-108)
- [GL_R16I](#member-109)
- [GL_R16UI](#member-110)
- [GL_R32I](#member-111)
- [GL_R32UI](#member-112)
- [GL_DEPTH_COMPONENT](#member-113)
- [GL_RG8](#member-114)
- [GL_RG8_SNORM](#member-115)
- [GL_RG16](#member-116)
- [GL_RG16_SNORM](#member-117)
- [GL_RG8I](#member-118)
- [GL_RG8UI](#member-119)
- [GL_RG16I](#member-120)
- [GL_RG16UI](#member-121)
- [GL_RG16F](#member-122)
- [GL_RG32F](#member-123)
- [GL_RG32I](#member-124)
- [GL_RG32UI](#member-125)
- [GL_RGB8](#member-126)
- [GL_RGB8_SNORM](#member-127)
- [GL_RGB16](#member-128)
- [GL_RGB16_SNORM](#member-129)
- [GL_RGB8I](#member-130)
- [GL_RGB8UI](#member-131)
- [GL_RGB16I](#member-132)
- [GL_RGB16UI](#member-133)
- [GL_RGB32I](#member-134)
- [GL_RGB32UI](#member-135)
- [GL_RGB16F](#member-136)
- [GL_RGB32F](#member-137)
- [GL_RGBA8](#member-138)
- [GL_RGBA8_SNORM](#member-139)
- [GL_RGBA16](#member-140)
- [GL_RGBA16_SNORM](#member-141)
- [GL_RGBA8I](#member-142)
- [GL_RGBA8UI](#member-143)
- [GL_RGBA16I](#member-144)
- [GL_RGBA16UI](#member-145)
- [GL_RGBA32I](#member-146)
- [GL_RGBA32UI](#member-147)
- [GL_RGBA16F](#member-148)
- [GL_RGBA32F](#member-149)
- [GL_SRGB8](#member-150)
- [GL_SRGB8_ALPHA8](#member-151)
- [GL_RED](#member-152)
- [GL_RG](#member-153)
- [GL_RGB](#member-154)
- [GL_RGBA](#member-155)
- [GL_RED_INTEGER](#member-156)
- [GL_RG_INTEGER](#member-157)
- [GL_RGB_INTEGER](#member-158)
- [GL_RGBA_INTEGER](#member-159)
- [GL_BGR](#member-160)
- [GL_BGRA](#member-161)
- [GL_BYTE](#member-162)
- [GL_SHORT](#member-163)
- [GL_INT](#member-164)
- [GL_UNSIGNED_BYTE](#member-165)
- [GL_UNSIGNED_SHORT](#member-166)
- [GL_UNSIGNED_INT](#member-167)
- [GL_FLOAT](#member-168)
- [GL_HALF_FLOAT](#member-169)
- [GL_TEXTURE_CUBE_MAP_POSITIVE_X](#member-170)
- [GL_TEXTURE_CUBE_MAP_POSITIVE_Y](#member-171)
- [GL_TEXTURE_CUBE_MAP_POSITIVE_Z](#member-172)
- [GL_TEXTURE_CUBE_MAP_NEGATIVE_X](#member-173)
- [GL_TEXTURE_CUBE_MAP_NEGATIVE_Y](#member-174)
- [GL_TEXTURE_CUBE_MAP_NEGATIVE_Z](#member-175)
- [GL_SCISSOR_TEST](#member-176)
- [GL_FRONT](#member-177)
- [GL_FRONT_AND_BACK](#member-178)
- [GL_CULL_FACE](#member-179)
- [GL_NEVER](#member-180)
- [GL_ALWAYS](#member-181)
- [GL_EQUAL](#member-182)
- [GL_NOTEQUAL](#member-183)
- [GL_LESS](#member-184)
- [GL_LEQUAL](#member-185)
- [GL_GREATER](#member-186)
- [GL_GEQUAL](#member-187)
- [GL_DEPTH_TEST](#member-188)
- [GL_POLYGON_OFFSET_FILL](#member-189)
- [GL_POINTS](#member-190)
- [GL_LINES](#member-191)
- [GL_LINE_STRIP](#member-192)
- [GL_TRIANGLES](#member-193)
- [GL_TRIANGLE_STRIP](#member-194)
- [GL_TRIANGLE_FAN](#member-195)

#### Methods

- [public void glActiveTexture(int texture);](#member-196)
- [public void glAttachShader(int program, int shader);](#member-197)
- [public void glBindAttribLocation(int program, int index, String name);](#member-198)
- [public void glBindBuffer(int target, int buffer);](#member-199)
- [public void glBindFragDataLocation(int program, int colornumber, String name);](#member-200)
- [public void glBindFramebuffer(int target, int buffer);](#member-201)
- [public void glBindRenderbuffer(int target, int buffer);](#member-202)
- [public void glBindTexture(int target, int texture);](#member-203)
- [public void glBindVertexArray(int array);](#member-204)
- [public void glBlendColor(float red, float green, float blue, float alpha);](#member-205)
- [public void glBlendEquation(int mode);](#member-206)
- [public void glBlendEquationSeparate(int cmode, int amode);](#member-207)
- [public void glBlendFunc(int sfac, int dfac);](#member-208)
- [public void glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac);](#member-209)
- [public void glBufferData(int target, long size, ByteBuffer data, int usage);](#member-210)
- [public void glBufferSubData(int target, long offset, long size, ByteBuffer data);](#member-211)
- [public int glCheckFramebufferStatus(int target);](#member-212)
- [public void glClear(int mask);](#member-213)
- [public void glClearBufferfv(int buffer, int drawbuffer, float[] value);](#member-214)
- [public void glClearBufferiv(int buffer, int drawbuffer, int[] value);](#member-215)
- [public void glClearBufferuiv(int buffer, int drawbuffer, int[] value);](#member-216)
- [public void glClearColor(float r, float g, float b, float a);](#member-217)
- [public void glClearDepth(double d);](#member-218)
- [public void glColorMask(boolean r, boolean g, boolean b, boolean a);](#member-219)
- [public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a);](#member-220)
- [public void glCompileShader(int shader);](#member-221)
- [public int glCreateProgram();](#member-222)
- [public int glCreateShader(int type);](#member-223)
- [public void glDeleteBuffers(int count, int[] buffers);](#member-224)
- [public void glDeleteFramebuffers(int count, int[] buffers);](#member-225)
- [public void glDeleteShader(int id);](#member-226)
- [public void glDeleteProgram(int id);](#member-227)
- [public void glDeleteQueries(int count, int[] buffer);](#member-228)
- [public void glDeleteRenderbuffers(int count, int[] buffers);](#member-229)
- [public void glDeleteSync(long id);](#member-230)
- [public void glDeleteTextures(int count, int[] buffers);](#member-231)
- [public void glDeleteVertexArrays(int count, int[] buffers);](#member-232)
- [public void glCullFace(int mode);](#member-233)
- [public void glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled);](#member-234)
- [public void glDepthFunc(int func);](#member-235)
- [public void glDepthMask(boolean mask);](#member-236)
- [public void glDisable(int cap);](#member-237)
- [public void glDisablei(int cap, int index);](#member-238)
- [public void glDisableVertexAttribArray(int location);](#member-239)
- [public void glDrawBuffer(int buf);](#member-240)
- [public void glDrawBuffers(int n, int[] bufs);](#member-241)
- [public void glDrawArraysInstanced(int mode, int first, int count, int primcount);](#member-242)
- [public void glDrawArrays(int mode, int first, int count);](#member-243)
- [public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount);](#member-244)
- [public void glDrawElements(int mode, int count, int type, long indices);](#member-245)
- [public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices);](#member-246)
- [public void glEnable(int cap);](#member-247)
- [public void glEnablei(int cap, int index);](#member-248)
- [public void glEnableVertexAttribArray(int location);](#member-249)
- [public long glFenceSync(int condition, int flags);](#member-250)
- [public void glFinish();](#member-251)
- [public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);](#member-252)
- [public void glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer);](#member-253)
- [public void glGenBuffers(int n, int[] buffer);](#member-254)
- [public void glGenFramebuffers(int n, int[] buffer);](#member-255)
- [public void glGenQueries(int n, int[] buffer);](#member-256)
- [public void glGenTextures(int n, int[] buffer);](#member-257)
- [public void glGenVertexArrays(int n, int[] buffer);](#member-258)
- [public void glGetBufferSubData(int target, int offset, int size, ByteBuffer data);](#member-259)
- [public int glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer);](#member-260)
- [public int glGetError();](#member-261)
- [public void glGetFloatv(int pname, float[] data);](#member-262)
- [public void glGetIntegerv(int pname, int[] data);](#member-263)
- [public String glGetString(int name);](#member-264)
- [public String glGetStringi(int name, int index);](#member-265)
- [public void glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog);](#member-266)
- [public void glGetProgramiv(int shader, int pname, int[] buf);](#member-267)
- [public void glGetQueryObjectiv(int id, int pname, int[] params);](#member-268)
- [public void glGetQueryObjecti64v(int id, int pname, long[] params);](#member-269)
- [public void glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog);](#member-270)
- [public void glGetShaderiv(int shader, int pname, int[] buf);](#member-271)
- [public void glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values);](#member-272)
- [public void glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels);](#member-273)
- [public void glGetTexImage(int target, int level, int format, int type, long offset);](#member-274)
- [public int glGetUniformLocation(int program, String name);](#member-275)
- [public void glLineWidth(float w);](#member-276)
- [public void glLinkProgram(int program);](#member-277)
- [public void glObjectLabel(int identifier, int name, int length, byte[] label);](#member-278)
- [public void glPixelStorei(int pname, int param);](#member-279)
- [public void glPointSize(float size);](#member-280)
- [public void glPolygonMode(int face, int mode);](#member-281)
- [public void glPolygonOffset(float factor, float units);](#member-282)
- [public void glQueryCounter(int id, int target);](#member-283)
- [public void glReadBuffer(int buf);](#member-284)
- [public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data);](#member-285)
- [public void glReadPixels(int x, int y, int width, int height, int format, int type, long offset);](#member-286)
- [public void glRenderbufferStorage(int target, int format, int width, int height);](#member-287)
- [public void glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height);](#member-288)
- [public void glSampleCoverage(float value, boolean invert);](#member-289)
- [public void glScissor(int x, int y, int w, int h);](#member-290)
- [public void glShaderSource(int shader, int count, String[] string, int[] lengths);](#member-291)
- [public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data);](#member-292)
- [public void glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data);](#member-293)
- [public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);](#member-294)
- [public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data);](#member-295)
- [public void glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data);](#member-296)
- [public void glTexParameterf(int target, int pname, float param);](#member-297)
- [public void glTexParameterfv(int target, int pname, float[] param);](#member-298)
- [public void glTexParameteri(int target, int pname, int param);](#member-299)
- [public void glUniform1f(int location, float v0);](#member-300)
- [public void glUniform2f(int location, float v0, float v1);](#member-301)
- [public void glUniform3f(int location, float v0, float v1, float v2);](#member-302)
- [public void glUniform3fv(int location, int count, float[] val);](#member-303)
- [public void glUniform4f(int location, float v0, float v1, float v2, float v3);](#member-304)
- [public void glUniform4fv(int location, int count, float[] val);](#member-305)
- [public void glUniform1i(int location, int v0);](#member-306)
- [public void glUniform2i(int location, int v0, int v1);](#member-307)
- [public void glUniform3i(int location, int v0, int v1, int v2);](#member-308)
- [public void glUniform4i(int location, int v0, int v1, int v2, int v3);](#member-309)
- [public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value);](#member-310)
- [public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value);](#member-311)
- [public void glUseProgram(int program);](#member-312)
- [public void glVertexAttribDivisor(int location, int divisor);](#member-313)
- [public void glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer);](#member-314)
- [public void glVertexAttribIPointer(int location, int size, int type, int stride, long pointer);](#member-315)
- [public void glViewport(int x, int y, int w, int h);](#member-316)
- [xlateexc(RuntimeException exc)](#member-317)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `GL_ALIASED_LINE_WIDTH_RANGE`

- Description: TODO

<a id="member-2"></a>
##### `GL_ARRAY_BUFFER`

- Description: TODO

<a id="member-3"></a>
##### `GL_BACK`

- Description: TODO

<a id="member-4"></a>
##### `GL_BLEND`

- Description: TODO

<a id="member-5"></a>
##### `GL_BUFFER`

- Description: TODO

<a id="member-6"></a>
##### `GL_COLOR_ATTACHMENT0`

- Description: TODO

<a id="member-7"></a>
##### `GL_COLOR_BUFFER_BIT`

- Description: TODO

<a id="member-8"></a>
##### `GL_COMPILE_STATUS`

- Description: TODO

<a id="member-9"></a>
##### `GL_CONSTANT_ALPHA`

- Description: TODO

<a id="member-10"></a>
##### `GL_CONSTANT_COLOR`

- Description: TODO

<a id="member-11"></a>
##### `GL_CONTEXT_FLAGS`

- Description: TODO

<a id="member-12"></a>
##### `GL_CONTEXT_PROFILE_MASK`

- Description: TODO

<a id="member-13"></a>
##### `GL_CONTEXT_CORE_PROFILE_BIT`

- Description: TODO

<a id="member-14"></a>
##### `GL_CONTEXT_COMPATIBILITY_PROFILE_BIT`

- Description: TODO

<a id="member-15"></a>
##### `GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH`

- Description: TODO

<a id="member-16"></a>
##### `GL_DEBUG_OUTPUT`

- Description: TODO

<a id="member-17"></a>
##### `GL_DEPTH_ATTACHMENT`

- Description: TODO

<a id="member-18"></a>
##### `GL_DEPTH_BUFFER_BIT`

- Description: TODO

<a id="member-19"></a>
##### `GL_DONT_CARE`

- Description: TODO

<a id="member-20"></a>
##### `GL_DST_ALPHA`

- Description: TODO

<a id="member-21"></a>
##### `GL_DST_COLOR`

- Description: TODO

<a id="member-22"></a>
##### `GL_DYNAMIC_DRAW`

- Description: TODO

<a id="member-23"></a>
##### `GL_ELEMENT_ARRAY_BUFFER`

- Description: TODO

<a id="member-24"></a>
##### `GL_EXTENSIONS`

- Description: TODO

<a id="member-25"></a>
##### `GL_FRAGMENT_SHADER`

- Description: TODO

<a id="member-26"></a>
##### `GL_FRAMEBUFFER`

- Description: TODO

<a id="member-27"></a>
##### `GL_FRAMEBUFFER_COMPLETE`

- Description: TODO

<a id="member-28"></a>
##### `GL_FUNC_ADD`

- Description: TODO

<a id="member-29"></a>
##### `GL_FUNC_REVERSE_SUBTRACT`

- Description: TODO

<a id="member-30"></a>
##### `GL_FUNC_SUBTRACT`

- Description: TODO

<a id="member-31"></a>
##### `GL_INFO_LOG_LENGTH`

- Description: TODO

<a id="member-32"></a>
##### `GL_INVALID_ENUM`

- Description: TODO

<a id="member-33"></a>
##### `GL_INVALID_VALUE`

- Description: TODO

<a id="member-34"></a>
##### `GL_INVALID_OPERATION`

- Description: TODO

<a id="member-35"></a>
##### `GL_LINK_STATUS`

- Description: TODO

<a id="member-36"></a>
##### `GL_MAJOR_VERSION`

- Description: TODO

<a id="member-37"></a>
##### `GL_MAX`

- Description: TODO

<a id="member-38"></a>
##### `GL_MAX_COLOR_ATTACHMENTS`

- Description: TODO

<a id="member-39"></a>
##### `GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT`

- Description: TODO

<a id="member-40"></a>
##### `GL_MIN`

- Description: TODO

<a id="member-41"></a>
##### `GL_MINOR_VERSION`

- Description: TODO

<a id="member-42"></a>
##### `GL_NONE`

- Description: TODO

<a id="member-43"></a>
##### `GL_NUM_EXTENSIONS`

- Description: TODO

<a id="member-44"></a>
##### `GL_ONE`

- Description: TODO

<a id="member-45"></a>
##### `GL_ONE_MINUS_CONSTANT_ALPHA`

- Description: TODO

<a id="member-46"></a>
##### `GL_ONE_MINUS_CONSTANT_COLOR`

- Description: TODO

<a id="member-47"></a>
##### `GL_ONE_MINUS_DST_ALPHA`

- Description: TODO

<a id="member-48"></a>
##### `GL_ONE_MINUS_DST_COLOR`

- Description: TODO

<a id="member-49"></a>
##### `GL_ONE_MINUS_SRC_ALPHA`

- Description: TODO

<a id="member-50"></a>
##### `GL_ONE_MINUS_SRC_COLOR`

- Description: TODO

<a id="member-51"></a>
##### `GL_OUT_OF_MEMORY`

- Description: TODO

<a id="member-52"></a>
##### `GL_PACK_ALIGNMENT`

- Description: TODO

<a id="member-53"></a>
##### `GL_PIXEL_PACK_BUFFER`

- Description: TODO

<a id="member-54"></a>
##### `GL_PROGRAM_POINT_SIZE`

- Description: TODO

<a id="member-55"></a>
##### `GL_QUERY_RESULT`

- Description: TODO

<a id="member-56"></a>
##### `GL_QUERY_RESULT_AVAILABLE`

- Description: TODO

<a id="member-57"></a>
##### `GL_RENDERER`

- Description: TODO

<a id="member-58"></a>
##### `GL_SHADING_LANGUAGE_VERSION`

- Description: TODO

<a id="member-59"></a>
##### `GL_SIGNALED`

- Description: TODO

<a id="member-60"></a>
##### `GL_SRC_ALPHA`

- Description: TODO

<a id="member-61"></a>
##### `GL_SRC_COLOR`

- Description: TODO

<a id="member-62"></a>
##### `GL_STATIC_DRAW`

- Description: TODO

<a id="member-63"></a>
##### `GL_STREAM_DRAW`

- Description: TODO

<a id="member-64"></a>
##### `GL_STREAM_READ`

- Description: TODO

<a id="member-65"></a>
##### `GL_SYNC_GPU_COMMANDS_COMPLETE`

- Description: TODO

<a id="member-66"></a>
##### `GL_SYNC_STATUS`

- Description: TODO

<a id="member-67"></a>
##### `GL_TEXTURE`

- Description: TODO

<a id="member-68"></a>
##### `GL_TEXTURE0`

- Description: TODO

<a id="member-69"></a>
##### `GL_TEXTURE_1D`

- Description: TODO

<a id="member-70"></a>
##### `GL_TEXTURE_1D_ARRAY`

- Description: TODO

<a id="member-71"></a>
##### `GL_TEXTURE_2D`

- Description: TODO

<a id="member-72"></a>
##### `GL_TEXTURE_2D_ARRAY`

- Description: TODO

<a id="member-73"></a>
##### `GL_TEXTURE_2D_MULTISAMPLE`

- Description: TODO

<a id="member-74"></a>
##### `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`

- Description: TODO

<a id="member-75"></a>
##### `GL_TEXTURE_3D`

- Description: TODO

<a id="member-76"></a>
##### `GL_TEXTURE_BORDER_COLOR`

- Description: TODO

<a id="member-77"></a>
##### `GL_TEXTURE_CUBE_MAP`

- Description: TODO

<a id="member-78"></a>
##### `GL_TEXTURE_CUBE_MAP_ARRAY`

- Description: TODO

<a id="member-79"></a>
##### `GL_TEXTURE_MIN_FILTER`

- Description: TODO

<a id="member-80"></a>
##### `GL_TEXTURE_MAG_FILTER`

- Description: TODO

<a id="member-81"></a>
##### `GL_TEXTURE_MAX_ANISOTROPY_EXT`

- Description: TODO

<a id="member-82"></a>
##### `GL_TEXTURE_WRAP_S`

- Description: TODO

<a id="member-83"></a>
##### `GL_TEXTURE_WRAP_T`

- Description: TODO

<a id="member-84"></a>
##### `GL_TEXTURE_WRAP_R`

- Description: TODO

<a id="member-85"></a>
##### `GL_TIMESTAMP`

- Description: TODO

<a id="member-86"></a>
##### `GL_VENDOR`

- Description: TODO

<a id="member-87"></a>
##### `GL_VERSION`

- Description: TODO

<a id="member-88"></a>
##### `GL_VERTEX_ARRAY`

- Description: TODO

<a id="member-89"></a>
##### `GL_VERTEX_SHADER`

- Description: TODO

<a id="member-90"></a>
##### `GL_ZERO`

- Description: TODO

<a id="member-91"></a>
##### `GL_NEAREST`

- Description: TODO

<a id="member-92"></a>
##### `GL_LINEAR`

- Description: TODO

<a id="member-93"></a>
##### `GL_NEAREST_MIPMAP_NEAREST`

- Description: TODO

<a id="member-94"></a>
##### `GL_NEAREST_MIPMAP_LINEAR`

- Description: TODO

<a id="member-95"></a>
##### `GL_LINEAR_MIPMAP_NEAREST`

- Description: TODO

<a id="member-96"></a>
##### `GL_LINEAR_MIPMAP_LINEAR`

- Description: TODO

<a id="member-97"></a>
##### `GL_REPEAT`

- Description: TODO

<a id="member-98"></a>
##### `GL_MIRRORED_REPEAT`

- Description: TODO

<a id="member-99"></a>
##### `GL_CLAMP_TO_EDGE`

- Description: TODO

<a id="member-100"></a>
##### `GL_CLAMP_TO_BORDER`

- Description: TODO

<a id="member-101"></a>
##### `GL_R8`

- Description: TODO

<a id="member-102"></a>
##### `GL_R8_SNORM`

- Description: TODO

<a id="member-103"></a>
##### `GL_R16`

- Description: TODO

<a id="member-104"></a>
##### `GL_R16_SNORM`

- Description: TODO

<a id="member-105"></a>
##### `GL_R16F`

- Description: TODO

<a id="member-106"></a>
##### `GL_R32F`

- Description: TODO

<a id="member-107"></a>
##### `GL_R8I`

- Description: TODO

<a id="member-108"></a>
##### `GL_R8UI`

- Description: TODO

<a id="member-109"></a>
##### `GL_R16I`

- Description: TODO

<a id="member-110"></a>
##### `GL_R16UI`

- Description: TODO

<a id="member-111"></a>
##### `GL_R32I`

- Description: TODO

<a id="member-112"></a>
##### `GL_R32UI`

- Description: TODO

<a id="member-113"></a>
##### `GL_DEPTH_COMPONENT`

- Description: TODO

<a id="member-114"></a>
##### `GL_RG8`

- Description: TODO

<a id="member-115"></a>
##### `GL_RG8_SNORM`

- Description: TODO

<a id="member-116"></a>
##### `GL_RG16`

- Description: TODO

<a id="member-117"></a>
##### `GL_RG16_SNORM`

- Description: TODO

<a id="member-118"></a>
##### `GL_RG8I`

- Description: TODO

<a id="member-119"></a>
##### `GL_RG8UI`

- Description: TODO

<a id="member-120"></a>
##### `GL_RG16I`

- Description: TODO

<a id="member-121"></a>
##### `GL_RG16UI`

- Description: TODO

<a id="member-122"></a>
##### `GL_RG16F`

- Description: TODO

<a id="member-123"></a>
##### `GL_RG32F`

- Description: TODO

<a id="member-124"></a>
##### `GL_RG32I`

- Description: TODO

<a id="member-125"></a>
##### `GL_RG32UI`

- Description: TODO

<a id="member-126"></a>
##### `GL_RGB8`

- Description: TODO

<a id="member-127"></a>
##### `GL_RGB8_SNORM`

- Description: TODO

<a id="member-128"></a>
##### `GL_RGB16`

- Description: TODO

<a id="member-129"></a>
##### `GL_RGB16_SNORM`

- Description: TODO

<a id="member-130"></a>
##### `GL_RGB8I`

- Description: TODO

<a id="member-131"></a>
##### `GL_RGB8UI`

- Description: TODO

<a id="member-132"></a>
##### `GL_RGB16I`

- Description: TODO

<a id="member-133"></a>
##### `GL_RGB16UI`

- Description: TODO

<a id="member-134"></a>
##### `GL_RGB32I`

- Description: TODO

<a id="member-135"></a>
##### `GL_RGB32UI`

- Description: TODO

<a id="member-136"></a>
##### `GL_RGB16F`

- Description: TODO

<a id="member-137"></a>
##### `GL_RGB32F`

- Description: TODO

<a id="member-138"></a>
##### `GL_RGBA8`

- Description: TODO

<a id="member-139"></a>
##### `GL_RGBA8_SNORM`

- Description: TODO

<a id="member-140"></a>
##### `GL_RGBA16`

- Description: TODO

<a id="member-141"></a>
##### `GL_RGBA16_SNORM`

- Description: TODO

<a id="member-142"></a>
##### `GL_RGBA8I`

- Description: TODO

<a id="member-143"></a>
##### `GL_RGBA8UI`

- Description: TODO

<a id="member-144"></a>
##### `GL_RGBA16I`

- Description: TODO

<a id="member-145"></a>
##### `GL_RGBA16UI`

- Description: TODO

<a id="member-146"></a>
##### `GL_RGBA32I`

- Description: TODO

<a id="member-147"></a>
##### `GL_RGBA32UI`

- Description: TODO

<a id="member-148"></a>
##### `GL_RGBA16F`

- Description: TODO

<a id="member-149"></a>
##### `GL_RGBA32F`

- Description: TODO

<a id="member-150"></a>
##### `GL_SRGB8`

- Description: TODO

<a id="member-151"></a>
##### `GL_SRGB8_ALPHA8`

- Description: TODO

<a id="member-152"></a>
##### `GL_RED`

- Description: TODO

<a id="member-153"></a>
##### `GL_RG`

- Description: TODO

<a id="member-154"></a>
##### `GL_RGB`

- Description: TODO

<a id="member-155"></a>
##### `GL_RGBA`

- Description: TODO

<a id="member-156"></a>
##### `GL_RED_INTEGER`

- Description: TODO

<a id="member-157"></a>
##### `GL_RG_INTEGER`

- Description: TODO

<a id="member-158"></a>
##### `GL_RGB_INTEGER`

- Description: TODO

<a id="member-159"></a>
##### `GL_RGBA_INTEGER`

- Description: TODO

<a id="member-160"></a>
##### `GL_BGR`

- Description: TODO

<a id="member-161"></a>
##### `GL_BGRA`

- Description: TODO

<a id="member-162"></a>
##### `GL_BYTE`

- Description: TODO

<a id="member-163"></a>
##### `GL_SHORT`

- Description: TODO

<a id="member-164"></a>
##### `GL_INT`

- Description: TODO

<a id="member-165"></a>
##### `GL_UNSIGNED_BYTE`

- Description: TODO

<a id="member-166"></a>
##### `GL_UNSIGNED_SHORT`

- Description: TODO

<a id="member-167"></a>
##### `GL_UNSIGNED_INT`

- Description: TODO

<a id="member-168"></a>
##### `GL_FLOAT`

- Description: TODO

<a id="member-169"></a>
##### `GL_HALF_FLOAT`

- Description: TODO

<a id="member-170"></a>
##### `GL_TEXTURE_CUBE_MAP_POSITIVE_X`

- Description: TODO

<a id="member-171"></a>
##### `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`

- Description: TODO

<a id="member-172"></a>
##### `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`

- Description: TODO

<a id="member-173"></a>
##### `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`

- Description: TODO

<a id="member-174"></a>
##### `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`

- Description: TODO

<a id="member-175"></a>
##### `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`

- Description: TODO

<a id="member-176"></a>
##### `GL_SCISSOR_TEST`

- Description: TODO

<a id="member-177"></a>
##### `GL_FRONT`

- Description: TODO

<a id="member-178"></a>
##### `GL_FRONT_AND_BACK`

- Description: TODO

<a id="member-179"></a>
##### `GL_CULL_FACE`

- Description: TODO

<a id="member-180"></a>
##### `GL_NEVER`

- Description: TODO

<a id="member-181"></a>
##### `GL_ALWAYS`

- Description: TODO

<a id="member-182"></a>
##### `GL_EQUAL`

- Description: TODO

<a id="member-183"></a>
##### `GL_NOTEQUAL`

- Description: TODO

<a id="member-184"></a>
##### `GL_LESS`

- Description: TODO

<a id="member-185"></a>
##### `GL_LEQUAL`

- Description: TODO

<a id="member-186"></a>
##### `GL_GREATER`

- Description: TODO

<a id="member-187"></a>
##### `GL_GEQUAL`

- Description: TODO

<a id="member-188"></a>
##### `GL_DEPTH_TEST`

- Description: TODO

<a id="member-189"></a>
##### `GL_POLYGON_OFFSET_FILL`

- Description: TODO

<a id="member-190"></a>
##### `GL_POINTS`

- Description: TODO

<a id="member-191"></a>
##### `GL_LINES`

- Description: TODO

<a id="member-192"></a>
##### `GL_LINE_STRIP`

- Description: TODO

<a id="member-193"></a>
##### `GL_TRIANGLES`

- Description: TODO

<a id="member-194"></a>
##### `GL_TRIANGLE_STRIP`

- Description: TODO

<a id="member-195"></a>
##### `GL_TRIANGLE_FAN`

- Description: TODO

#### Methods

<a id="member-196"></a>
##### `public void glActiveTexture(int texture);`

- Description: TODO

<a id="member-197"></a>
##### `public void glAttachShader(int program, int shader);`

- Description: TODO

<a id="member-198"></a>
##### `public void glBindAttribLocation(int program, int index, String name);`

- Description: TODO

<a id="member-199"></a>
##### `public void glBindBuffer(int target, int buffer);`

- Description: TODO

<a id="member-200"></a>
##### `public void glBindFragDataLocation(int program, int colornumber, String name);`

- Description: TODO

<a id="member-201"></a>
##### `public void glBindFramebuffer(int target, int buffer);`

- Description: TODO

<a id="member-202"></a>
##### `public void glBindRenderbuffer(int target, int buffer);`

- Description: TODO

<a id="member-203"></a>
##### `public void glBindTexture(int target, int texture);`

- Description: TODO

<a id="member-204"></a>
##### `public void glBindVertexArray(int array);`

- Description: TODO

<a id="member-205"></a>
##### `public void glBlendColor(float red, float green, float blue, float alpha);`

- Description: TODO

<a id="member-206"></a>
##### `public void glBlendEquation(int mode);`

- Description: TODO

<a id="member-207"></a>
##### `public void glBlendEquationSeparate(int cmode, int amode);`

- Description: TODO

<a id="member-208"></a>
##### `public void glBlendFunc(int sfac, int dfac);`

- Description: TODO

<a id="member-209"></a>
##### `public void glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac);`

- Description: TODO

<a id="member-210"></a>
##### `public void glBufferData(int target, long size, ByteBuffer data, int usage);`

- Description: TODO

<a id="member-211"></a>
##### `public void glBufferSubData(int target, long offset, long size, ByteBuffer data);`

- Description: TODO

<a id="member-212"></a>
##### `public int glCheckFramebufferStatus(int target);`

- Description: TODO

<a id="member-213"></a>
##### `public void glClear(int mask);`

- Description: TODO

<a id="member-214"></a>
##### `public void glClearBufferfv(int buffer, int drawbuffer, float[] value);`

- Description: TODO

<a id="member-215"></a>
##### `public void glClearBufferiv(int buffer, int drawbuffer, int[] value);`

- Description: TODO

<a id="member-216"></a>
##### `public void glClearBufferuiv(int buffer, int drawbuffer, int[] value);`

- Description: TODO

<a id="member-217"></a>
##### `public void glClearColor(float r, float g, float b, float a);`

- Description: TODO

<a id="member-218"></a>
##### `public void glClearDepth(double d);`

- Description: TODO

<a id="member-219"></a>
##### `public void glColorMask(boolean r, boolean g, boolean b, boolean a);`

- Description: TODO

<a id="member-220"></a>
##### `public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a);`

- Description: TODO

<a id="member-221"></a>
##### `public void glCompileShader(int shader);`

- Description: TODO

<a id="member-222"></a>
##### `public int glCreateProgram();`

- Description: TODO

<a id="member-223"></a>
##### `public int glCreateShader(int type);`

- Description: TODO

<a id="member-224"></a>
##### `public void glDeleteBuffers(int count, int[] buffers);`

- Description: TODO

<a id="member-225"></a>
##### `public void glDeleteFramebuffers(int count, int[] buffers);`

- Description: TODO

<a id="member-226"></a>
##### `public void glDeleteShader(int id);`

- Description: TODO

<a id="member-227"></a>
##### `public void glDeleteProgram(int id);`

- Description: TODO

<a id="member-228"></a>
##### `public void glDeleteQueries(int count, int[] buffer);`

- Description: TODO

<a id="member-229"></a>
##### `public void glDeleteRenderbuffers(int count, int[] buffers);`

- Description: TODO

<a id="member-230"></a>
##### `public void glDeleteSync(long id);`

- Description: TODO

<a id="member-231"></a>
##### `public void glDeleteTextures(int count, int[] buffers);`

- Description: TODO

<a id="member-232"></a>
##### `public void glDeleteVertexArrays(int count, int[] buffers);`

- Description: TODO

<a id="member-233"></a>
##### `public void glCullFace(int mode);`

- Description: TODO

<a id="member-234"></a>
##### `public void glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled);`

- Description: TODO

<a id="member-235"></a>
##### `public void glDepthFunc(int func);`

- Description: TODO

<a id="member-236"></a>
##### `public void glDepthMask(boolean mask);`

- Description: TODO

<a id="member-237"></a>
##### `public void glDisable(int cap);`

- Description: TODO

<a id="member-238"></a>
##### `public void glDisablei(int cap, int index);`

- Description: TODO

<a id="member-239"></a>
##### `public void glDisableVertexAttribArray(int location);`

- Description: TODO

<a id="member-240"></a>
##### `public void glDrawBuffer(int buf);`

- Description: TODO

<a id="member-241"></a>
##### `public void glDrawBuffers(int n, int[] bufs);`

- Description: TODO

<a id="member-242"></a>
##### `public void glDrawArraysInstanced(int mode, int first, int count, int primcount);`

- Description: TODO

<a id="member-243"></a>
##### `public void glDrawArrays(int mode, int first, int count);`

- Description: TODO

<a id="member-244"></a>
##### `public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount);`

- Description: TODO

<a id="member-245"></a>
##### `public void glDrawElements(int mode, int count, int type, long indices);`

- Description: TODO

<a id="member-246"></a>
##### `public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices);`

- Description: TODO

<a id="member-247"></a>
##### `public void glEnable(int cap);`

- Description: TODO

<a id="member-248"></a>
##### `public void glEnablei(int cap, int index);`

- Description: TODO

<a id="member-249"></a>
##### `public void glEnableVertexAttribArray(int location);`

- Description: TODO

<a id="member-250"></a>
##### `public long glFenceSync(int condition, int flags);`

- Description: TODO

<a id="member-251"></a>
##### `public void glFinish();`

- Description: TODO

<a id="member-252"></a>
##### `public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);`

- Description: TODO

<a id="member-253"></a>
##### `public void glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer);`

- Description: TODO

<a id="member-254"></a>
##### `public void glGenBuffers(int n, int[] buffer);`

- Description: TODO

<a id="member-255"></a>
##### `public void glGenFramebuffers(int n, int[] buffer);`

- Description: TODO

<a id="member-256"></a>
##### `public void glGenQueries(int n, int[] buffer);`

- Description: TODO

<a id="member-257"></a>
##### `public void glGenTextures(int n, int[] buffer);`

- Description: TODO

<a id="member-258"></a>
##### `public void glGenVertexArrays(int n, int[] buffer);`

- Description: TODO

<a id="member-259"></a>
##### `public void glGetBufferSubData(int target, int offset, int size, ByteBuffer data);`

- Description: TODO

<a id="member-260"></a>
##### `public int glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer);`

- Description: TODO

<a id="member-261"></a>
##### `public int glGetError();`

- Description: TODO

<a id="member-262"></a>
##### `public void glGetFloatv(int pname, float[] data);`

- Description: TODO

<a id="member-263"></a>
##### `public void glGetIntegerv(int pname, int[] data);`

- Description: TODO

<a id="member-264"></a>
##### `public String glGetString(int name);`

- Description: TODO

<a id="member-265"></a>
##### `public String glGetStringi(int name, int index);`

- Description: TODO

<a id="member-266"></a>
##### `public void glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog);`

- Description: TODO

<a id="member-267"></a>
##### `public void glGetProgramiv(int shader, int pname, int[] buf);`

- Description: TODO

<a id="member-268"></a>
##### `public void glGetQueryObjectiv(int id, int pname, int[] params);`

- Description: TODO

<a id="member-269"></a>
##### `public void glGetQueryObjecti64v(int id, int pname, long[] params);`

- Description: TODO

<a id="member-270"></a>
##### `public void glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog);`

- Description: TODO

<a id="member-271"></a>
##### `public void glGetShaderiv(int shader, int pname, int[] buf);`

- Description: TODO

<a id="member-272"></a>
##### `public void glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values);`

- Description: TODO

<a id="member-273"></a>
##### `public void glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels);`

- Description: TODO

<a id="member-274"></a>
##### `public void glGetTexImage(int target, int level, int format, int type, long offset);`

- Description: TODO

<a id="member-275"></a>
##### `public int glGetUniformLocation(int program, String name);`

- Description: TODO

<a id="member-276"></a>
##### `public void glLineWidth(float w);`

- Description: TODO

<a id="member-277"></a>
##### `public void glLinkProgram(int program);`

- Description: TODO

<a id="member-278"></a>
##### `public void glObjectLabel(int identifier, int name, int length, byte[] label);`

- Description: TODO

<a id="member-279"></a>
##### `public void glPixelStorei(int pname, int param);`

- Description: TODO

<a id="member-280"></a>
##### `public void glPointSize(float size);`

- Description: TODO

<a id="member-281"></a>
##### `public void glPolygonMode(int face, int mode);`

- Description: TODO

<a id="member-282"></a>
##### `public void glPolygonOffset(float factor, float units);`

- Description: TODO

<a id="member-283"></a>
##### `public void glQueryCounter(int id, int target);`

- Description: TODO

<a id="member-284"></a>
##### `public void glReadBuffer(int buf);`

- Description: TODO

<a id="member-285"></a>
##### `public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data);`

- Description: TODO

<a id="member-286"></a>
##### `public void glReadPixels(int x, int y, int width, int height, int format, int type, long offset);`

- Description: TODO

<a id="member-287"></a>
##### `public void glRenderbufferStorage(int target, int format, int width, int height);`

- Description: TODO

<a id="member-288"></a>
##### `public void glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height);`

- Description: TODO

<a id="member-289"></a>
##### `public void glSampleCoverage(float value, boolean invert);`

- Description: TODO

<a id="member-290"></a>
##### `public void glScissor(int x, int y, int w, int h);`

- Description: TODO

<a id="member-291"></a>
##### `public void glShaderSource(int shader, int count, String[] string, int[] lengths);`

- Description: TODO

<a id="member-292"></a>
##### `public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data);`

- Description: TODO

<a id="member-293"></a>
##### `public void glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data);`

- Description: TODO

<a id="member-294"></a>
##### `public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);`

- Description: TODO

<a id="member-295"></a>
##### `public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data);`

- Description: TODO

<a id="member-296"></a>
##### `public void glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data);`

- Description: TODO

<a id="member-297"></a>
##### `public void glTexParameterf(int target, int pname, float param);`

- Description: TODO

<a id="member-298"></a>
##### `public void glTexParameterfv(int target, int pname, float[] param);`

- Description: TODO

<a id="member-299"></a>
##### `public void glTexParameteri(int target, int pname, int param);`

- Description: TODO

<a id="member-300"></a>
##### `public void glUniform1f(int location, float v0);`

- Description: TODO

<a id="member-301"></a>
##### `public void glUniform2f(int location, float v0, float v1);`

- Description: TODO

<a id="member-302"></a>
##### `public void glUniform3f(int location, float v0, float v1, float v2);`

- Description: TODO

<a id="member-303"></a>
##### `public void glUniform3fv(int location, int count, float[] val);`

- Description: TODO

<a id="member-304"></a>
##### `public void glUniform4f(int location, float v0, float v1, float v2, float v3);`

- Description: TODO

<a id="member-305"></a>
##### `public void glUniform4fv(int location, int count, float[] val);`

- Description: TODO

<a id="member-306"></a>
##### `public void glUniform1i(int location, int v0);`

- Description: TODO

<a id="member-307"></a>
##### `public void glUniform2i(int location, int v0, int v1);`

- Description: TODO

<a id="member-308"></a>
##### `public void glUniform3i(int location, int v0, int v1, int v2);`

- Description: TODO

<a id="member-309"></a>
##### `public void glUniform4i(int location, int v0, int v1, int v2, int v3);`

- Description: TODO

<a id="member-310"></a>
##### `public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value);`

- Description: TODO

<a id="member-311"></a>
##### `public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value);`

- Description: TODO

<a id="member-312"></a>
##### `public void glUseProgram(int program);`

- Description: TODO

<a id="member-313"></a>
##### `public void glVertexAttribDivisor(int location, int divisor);`

- Description: TODO

<a id="member-314"></a>
##### `public void glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer);`

- Description: TODO

<a id="member-315"></a>
##### `public void glVertexAttribIPointer(int location, int size, int type, int stride, long pointer);`

- Description: TODO

<a id="member-316"></a>
##### `public void glViewport(int x, int y, int w, int h);`

- Description: TODO

<a id="member-317"></a>
##### `xlateexc(RuntimeException exc)`

- Description: TODO
