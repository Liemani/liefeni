---
source: [Cons.java](../../../../../src/haven/render/sl/Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# Cons

Represents the cons shader-language AST node.

## Members

### Constants

#### `public static final UnaryOperator<Expression> idm = in -> in`
- Role: Defines the shared idm constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public static Statement stmt(Expression e)`
- Role: Performs stmt.
- Description: Supports the stmt operation used by the surrounding class.

#### `public static LBinOp.Assign ass(LValue l, Expression r)`
- Role: Performs ass.
- Description: Supports the ass operation used by the surrounding class.

#### `public static LBinOp.Assign ass(Variable l, Expression r)`
- Role: Performs ass.
- Description: Supports the ass operation used by the surrounding class.

#### `public static Add add(Expression... terms)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public static Mul mul(Expression... terms)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public static BinOp.Sub sub(Expression l, Expression r)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public static BinOp.Div div(Expression l, Expression r)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public static LBinOp.AAdd aadd(LValue l, Expression r)`
- Role: Performs aadd.
- Description: Supports the aadd operation used by the surrounding class.

#### `public static LBinOp.ASub asub(LValue l, Expression r)`
- Role: Performs asub.
- Description: Supports the asub operation used by the surrounding class.

#### `public static LBinOp.AMul amul(LValue l, Expression r)`
- Role: Performs amul.
- Description: Supports the amul operation used by the surrounding class.

#### `public static LBinOp.ADiv adiv(LValue l, Expression r)`
- Role: Performs adiv.
- Description: Supports the adiv operation used by the surrounding class.

#### `public static BinOp.Div inv(Expression op)`
- Role: Performs inv.
- Description: Supports the inv operation used by the surrounding class.

#### `public static PreOp.Neg neg(Expression op)`
- Role: Performs neg.
- Description: Supports the neg operation used by the surrounding class.

#### `public static LPreOp.Inc incl(LValue op)`
- Role: Performs incl.
- Description: Supports the incl operation used by the surrounding class.

#### `public static LPreOp.Dec decl(LValue op)`
- Role: Performs decl.
- Description: Supports the decl operation used by the surrounding class.

#### `public static LPostOp.Inc linc(LValue op)`
- Role: Performs linc.
- Description: Supports the linc operation used by the surrounding class.

#### `public static LPostOp.Dec ldec(LValue op)`
- Role: Performs ldec.
- Description: Supports the ldec operation used by the surrounding class.

#### `public static BinOp.Eq eq(Expression l, Expression r)`
- Role: Performs eq.
- Description: Supports the eq operation used by the surrounding class.

#### `public static BinOp.Ne ne(Expression l, Expression r)`
- Role: Performs ne.
- Description: Supports the ne operation used by the surrounding class.

#### `public static BinOp.Lt lt(Expression l, Expression r)`
- Role: Performs lt.
- Description: Supports the lt operation used by the surrounding class.

#### `public static BinOp.Gt gt(Expression l, Expression r)`
- Role: Performs gt.
- Description: Supports the gt operation used by the surrounding class.

#### `public static BinOp.Le le(Expression l, Expression r)`
- Role: Performs le.
- Description: Supports the le operation used by the surrounding class.

#### `public static BinOp.Ge ge(Expression l, Expression r)`
- Role: Performs ge.
- Description: Supports the ge operation used by the surrounding class.

#### `public static BinOp.Or or(Expression l, Expression r)`
- Role: Performs or.
- Description: Supports the or operation used by the surrounding class.

#### `public static BinOp.And and(Expression l, Expression r)`
- Role: Performs and.
- Description: Supports the and operation used by the surrounding class.

#### `public static BinOp.BitOr bitor(Expression l, Expression r)`
- Role: Performs bitor.
- Description: Supports the bitor operation used by the surrounding class.

#### `public static BinOp.BitAnd bitand(Expression l, Expression r)`
- Role: Performs bitand.
- Description: Supports the bitand operation used by the surrounding class.

#### `public static BinOp.LShift lshift(Expression l, Expression r)`
- Role: Performs lshift.
- Description: Supports the lshift operation used by the surrounding class.

#### `public static BinOp.RShift rshift(Expression l, Expression r)`
- Role: Performs rshift.
- Description: Supports the rshift operation used by the surrounding class.

#### `public static LPick pick(LValue val, String el)`
- Role: Performs pick.
- Description: Supports the pick operation used by the surrounding class.

#### `public static Pick pick(Expression val, String el)`
- Role: Performs pick.
- Description: Supports the pick operation used by the surrounding class.

#### `public static LFieldRef fref(LValue val, String el)`
- Role: Performs fref.
- Description: Supports the fref operation used by the surrounding class.

#### `public static FieldRef fref(Expression val, String el)`
- Role: Performs fref.
- Description: Supports the fref operation used by the surrounding class.

#### `public static Index idx(Expression val, Expression idx)`
- Role: Performs idx.
- Description: Supports the idx operation used by the surrounding class.

#### `public static IntLiteral l(int val)`
- Role: Performs l.
- Description: Supports the l operation used by the surrounding class.

#### `public static UIntLiteral ul(int val)`
- Role: Performs ul.
- Description: Supports the ul operation used by the surrounding class.

#### `public static FloatLiteral l(double val)`
- Role: Performs l.
- Description: Supports the l operation used by the surrounding class.

#### `public static Vec4Cons vec4(Expression... els)`
- Role: Performs vec4.
- Description: Supports the vec4 operation used by the surrounding class.

#### `public static Vec3Cons vec3(Expression... els)`
- Role: Performs vec3.
- Description: Supports the vec3 operation used by the surrounding class.

#### `public static Vec2Cons vec2(Expression... els)`
- Role: Performs vec2.
- Description: Supports the vec2 operation used by the surrounding class.

#### `public static FloatCons floatcons(Expression init)`
- Role: Performs floatcons.
- Description: Supports the floatcons operation used by the surrounding class.

#### `public static IVec4Cons ivec4(Expression... els)`
- Role: Performs ivec4.
- Description: Supports the ivec4 operation used by the surrounding class.

#### `public static IVec3Cons ivec3(Expression... els)`
- Role: Performs ivec3.
- Description: Supports the ivec3 operation used by the surrounding class.

#### `public static IVec2Cons ivec2(Expression... els)`
- Role: Performs ivec2.
- Description: Supports the ivec2 operation used by the surrounding class.

#### `public static IntCons intcons(Expression init)`
- Role: Performs intcons.
- Description: Supports the intcons operation used by the surrounding class.

#### `public static UVec4Cons uvec4(Expression... els)`
- Role: Performs uvec4.
- Description: Supports the uvec4 operation used by the surrounding class.

#### `public static UVec3Cons uvec3(Expression... els)`
- Role: Performs uvec3.
- Description: Supports the uvec3 operation used by the surrounding class.

#### `public static UVec2Cons uvec2(Expression... els)`
- Role: Performs uvec2.
- Description: Supports the uvec2 operation used by the surrounding class.

#### `public static UIntCons uintcons(Expression init)`
- Role: Performs uintcons.
- Description: Supports the uintcons operation used by the surrounding class.

#### `public static Mat3Cons mat3(Expression... els)`
- Role: Performs mat3.
- Description: Supports the mat3 operation used by the surrounding class.

#### `public static Expression sin(Expression x)`
- Role: Performs sin.
- Description: Supports the sin operation used by the surrounding class.

#### `public static Expression abs(Expression x)`
- Role: Performs abs.
- Description: Supports the abs operation used by the surrounding class.

#### `public static Expression sign(Expression x)`
- Role: Performs sign.
- Description: Supports the sign operation used by the surrounding class.

#### `public static Expression floor(Expression x)`
- Role: Performs floor.
- Description: Supports the floor operation used by the surrounding class.

#### `public static Expression ceil(Expression x)`
- Role: Performs ceil.
- Description: Supports the ceil operation used by the surrounding class.

#### `public static Expression fract(Expression x)`
- Role: Performs fract.
- Description: Supports the fract operation used by the surrounding class.

#### `public static Expression mod(Expression x, Expression y)`
- Role: Performs mod.
- Description: Supports the mod operation used by the surrounding class.

#### `public static Expression length(Expression x)`
- Role: Performs length.
- Description: Supports the length operation used by the surrounding class.

#### `public static Expression normalize(Expression x)`
- Role: Performs normalize.
- Description: Supports the normalize operation used by the surrounding class.

#### `public static Expression distance(Expression x, Expression y)`
- Role: Returns the distance from the local player.
- Description: Measures the distance from the current local player position.

#### `public static Expression dot(Expression x, Expression y)`
- Role: Performs dot.
- Description: Supports the dot operation used by the surrounding class.

#### `public static Expression pow(Expression x, Expression y)`
- Role: Performs pow.
- Description: Supports the pow operation used by the surrounding class.

#### `public static Expression exp(Expression x)`
- Role: Performs exp.
- Description: Supports the exp operation used by the surrounding class.

#### `public static Expression log(Expression x)`
- Role: Performs log.
- Description: Supports the log operation used by the surrounding class.

#### `public static Expression exp2(Expression x)`
- Role: Performs exp2.
- Description: Supports the exp2 operation used by the surrounding class.

#### `public static Expression log2(Expression x)`
- Role: Performs log2.
- Description: Supports the log2 operation used by the surrounding class.

#### `public static Expression sqrt(Expression x)`
- Role: Performs sqrt.
- Description: Supports the sqrt operation used by the surrounding class.

#### `public static Expression inversesqrt(Expression x)`
- Role: Performs inversesqrt.
- Description: Supports the inversesqrt operation used by the surrounding class.

#### `public static Expression cross(Expression x, Expression y)`
- Role: Performs cross.
- Description: Supports the cross operation used by the surrounding class.

#### `public static Expression reflect(Expression x, Expression y)`
- Role: Performs reflect.
- Description: Supports the reflect operation used by the surrounding class.

#### `public static Expression texture2D(Expression s, Expression c)`
- Role: Performs texture2 d.
- Description: Supports the texture2 d operation used by the surrounding class.

#### `public static Expression shadow2D(Expression s, Expression c)`
- Role: Performs shadow2 d.
- Description: Supports the shadow2 d operation used by the surrounding class.

#### `public static Expression texture3D(Expression s, Expression c)`
- Role: Performs texture3 d.
- Description: Supports the texture3 d operation used by the surrounding class.

#### `public static Expression textureCube(Expression s, Expression c)`
- Role: Performs texture cube.
- Description: Supports the texture cube operation used by the surrounding class.

#### `public static Expression texelFetch(Expression s, Expression c, Expression l)`
- Role: Performs texel fetch.
- Description: Supports the texel fetch operation used by the surrounding class.

#### `public static Expression textureSize(Expression s, Expression lod)`
- Role: Performs texture size.
- Description: Supports the texture size operation used by the surrounding class.

#### `public static Expression mix(Expression x, Expression y, Expression a)`
- Role: Performs mix.
- Description: Supports the mix operation used by the surrounding class.

#### `public static Expression clamp(Expression x, Expression a, Expression b)`
- Role: Performs clamp.
- Description: Supports the clamp operation used by the surrounding class.

#### `public static Expression step(Expression edge, Expression x)`
- Role: Performs step.
- Description: Supports the step operation used by the surrounding class.

#### `public static Expression smoothstep(Expression a, Expression b, Expression x)`
- Role: Performs smoothstep.
- Description: Supports the smoothstep operation used by the surrounding class.

#### `public static Expression reduce(Function fun, Expression... es)`
- Role: Performs reduce.
- Description: Supports the reduce operation used by the surrounding class.

#### `public static Expression min(Expression... es)`
- Role: Performs min.
- Description: Supports the min operation used by the surrounding class.

#### `public static Expression max(Expression... es)`
- Role: Performs max.
- Description: Supports the max operation used by the surrounding class.

#### `public static Expression col4(java.awt.Color c)`
- Role: Performs col4.
- Description: Supports the col4 operation used by the surrounding class.

#### `public static Expression col3(java.awt.Color c)`
- Role: Performs col3.
- Description: Supports the col3 operation used by the surrounding class.

#### `public static Expression col4(haven.FColor c)`
- Role: Performs col4.
- Description: Supports the col4 operation used by the surrounding class.

#### `public static Expression col3(haven.FColor c)`
- Role: Performs col3.
- Description: Supports the col3 operation used by the surrounding class.

#### `public static Expression vec2(haven.Coord c)`
- Role: Performs vec2.
- Description: Supports the vec2 operation used by the surrounding class.

#### `public static Expression vec3(haven.Coord3f c)`
- Role: Performs vec3.
- Description: Supports the vec3 operation used by the surrounding class.

#### `public static Expression vec2(double a, double b)`
- Role: Performs vec2.
- Description: Supports the vec2 operation used by the surrounding class.

#### `public static Expression vec3(double a, double b, double c)`
- Role: Performs vec3.
- Description: Supports the vec3 operation used by the surrounding class.

#### `public static Expression vec4(double a, double b, double c, double d)`
- Role: Performs vec4.
- Description: Supports the vec4 operation used by the surrounding class.

#### `public static Expression ivec2(haven.Coord c)`
- Role: Performs ivec2.
- Description: Supports the ivec2 operation used by the surrounding class.

#### `public static Expression ivec2(int a, int b)`
- Role: Performs ivec2.
- Description: Supports the ivec2 operation used by the surrounding class.

#### `public static Expression ivec3(int a, int b, int c)`
- Role: Performs ivec3.
- Description: Supports the ivec3 operation used by the surrounding class.

#### `public static Expression ivec4(int a, int b, int c, int d)`
- Role: Performs ivec4.
- Description: Supports the ivec4 operation used by the surrounding class.

#### `public static Expression uvec2(haven.Coord c)`
- Role: Performs uvec2.
- Description: Supports the uvec2 operation used by the surrounding class.

#### `public static Expression uvec2(int a, int b)`
- Role: Performs uvec2.
- Description: Supports the uvec2 operation used by the surrounding class.

#### `public static Expression uvec3(int a, int b, int c)`
- Role: Performs uvec3.
- Description: Supports the uvec3 operation used by the surrounding class.

#### `public static Expression uvec4(int a, int b, int c, int d)`
- Role: Performs uvec4.
- Description: Supports the uvec4 operation used by the surrounding class.

#### `public static <T> T id(T a)`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.
