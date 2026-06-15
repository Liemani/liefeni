# Cons

This file documents the responsibilities and members of `Cons`.

## Meta

- Source: [Cons.java](../../../../../src/haven/render/sl/Cons.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a shader constructor expression.

## Members

### Constants

#### `public static final UnaryOperator<Expression> idm = in -> in`

- Description: TODO

### Fields

### Methods

#### `public static Statement stmt(Expression e)`

- Description: TODO

#### `public static LBinOp.Assign ass(LValue l, Expression r)`

- Description: TODO

#### `public static LBinOp.Assign ass(Variable l, Expression r)`

- Description: TODO

#### `public static Add add(Expression... terms)`

- Description: TODO

#### `public static Mul mul(Expression... terms)`

- Description: TODO

#### `public static BinOp.Sub sub(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.Div div(Expression l, Expression r)`

- Description: TODO

#### `public static LBinOp.AAdd aadd(LValue l, Expression r)`

- Description: TODO

#### `public static LBinOp.ASub asub(LValue l, Expression r)`

- Description: TODO

#### `public static LBinOp.AMul amul(LValue l, Expression r)`

- Description: TODO

#### `public static LBinOp.ADiv adiv(LValue l, Expression r)`

- Description: TODO

#### `public static BinOp.Div inv(Expression op)`

- Description: TODO

#### `public static PreOp.Neg neg(Expression op)`

- Description: TODO

#### `public static LPreOp.Inc incl(LValue op)`

- Description: TODO

#### `public static LPreOp.Dec decl(LValue op)`

- Description: TODO

#### `public static LPostOp.Inc linc(LValue op)`

- Description: TODO

#### `public static LPostOp.Dec ldec(LValue op)`

- Description: TODO

#### `public static BinOp.Eq eq(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.Ne ne(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.Lt lt(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.Gt gt(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.Le le(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.Ge ge(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.Or or(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.And and(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.BitOr bitor(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.BitAnd bitand(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.LShift lshift(Expression l, Expression r)`

- Description: TODO

#### `public static BinOp.RShift rshift(Expression l, Expression r)`

- Description: TODO

#### `public static LPick pick(LValue val, String el)`

- Description: TODO

#### `public static Pick pick(Expression val, String el)`

- Description: TODO

#### `public static LFieldRef fref(LValue val, String el)`

- Description: TODO

#### `public static FieldRef fref(Expression val, String el)`

- Description: TODO

#### `public static Index idx(Expression val, Expression idx)`

- Description: TODO

#### `public static IntLiteral l(int val)`

- Description: TODO

#### `public static UIntLiteral ul(int val)`

- Description: TODO

#### `public static FloatLiteral l(double val)`

- Description: TODO

#### `public static Vec4Cons vec4(Expression... els)`

- Description: TODO

#### `public static Vec3Cons vec3(Expression... els)`

- Description: TODO

#### `public static Vec2Cons vec2(Expression... els)`

- Description: TODO

#### `public static FloatCons floatcons(Expression init)`

- Description: TODO

#### `public static IVec4Cons ivec4(Expression... els)`

- Description: TODO

#### `public static IVec3Cons ivec3(Expression... els)`

- Description: TODO

#### `public static IVec2Cons ivec2(Expression... els)`

- Description: TODO

#### `public static IntCons intcons(Expression init)`

- Description: TODO

#### `public static UVec4Cons uvec4(Expression... els)`

- Description: TODO

#### `public static UVec3Cons uvec3(Expression... els)`

- Description: TODO

#### `public static UVec2Cons uvec2(Expression... els)`

- Description: TODO

#### `public static UIntCons uintcons(Expression init)`

- Description: TODO

#### `public static Mat3Cons mat3(Expression... els)`

- Description: TODO

#### `public static Expression sin(Expression x)`

- Description: TODO

#### `public static Expression abs(Expression x)`

- Description: TODO

#### `public static Expression sign(Expression x)`

- Description: TODO

#### `public static Expression floor(Expression x)`

- Description: TODO

#### `public static Expression ceil(Expression x)`

- Description: TODO

#### `public static Expression fract(Expression x)`

- Description: TODO

#### `public static Expression mod(Expression x, Expression y)`

- Description: TODO

#### `public static Expression length(Expression x)`

- Description: TODO

#### `public static Expression normalize(Expression x)`

- Description: TODO

#### `public static Expression distance(Expression x, Expression y)`

- Description: TODO

#### `public static Expression dot(Expression x, Expression y)`

- Description: TODO

#### `public static Expression pow(Expression x, Expression y)`

- Description: TODO

#### `public static Expression exp(Expression x)`

- Description: TODO

#### `public static Expression log(Expression x)`

- Description: TODO

#### `public static Expression exp2(Expression x)`

- Description: TODO

#### `public static Expression log2(Expression x)`

- Description: TODO

#### `public static Expression sqrt(Expression x)`

- Description: TODO

#### `public static Expression inversesqrt(Expression x)`

- Description: TODO

#### `public static Expression cross(Expression x, Expression y)`

- Description: TODO

#### `public static Expression reflect(Expression x, Expression y)`

- Description: TODO

#### `public static Expression texture2D(Expression s, Expression c)`

- Description: TODO

#### `public static Expression shadow2D(Expression s, Expression c)`

- Description: TODO

#### `public static Expression texture3D(Expression s, Expression c)`

- Description: TODO

#### `public static Expression textureCube(Expression s, Expression c)`

- Description: TODO

#### `public static Expression texelFetch(Expression s, Expression c, Expression l)`

- Description: TODO

#### `public static Expression textureSize(Expression s, Expression lod)`

- Description: TODO

#### `public static Expression mix(Expression x, Expression y, Expression a)`

- Description: TODO

#### `public static Expression clamp(Expression x, Expression a, Expression b)`

- Description: TODO

#### `public static Expression step(Expression edge, Expression x)`

- Description: TODO

#### `public static Expression smoothstep(Expression a, Expression b, Expression x)`

- Description: TODO

#### `public static Expression reduce(Function fun, Expression... es)`

- Description: TODO

#### `public static Expression min(Expression... es)`

- Description: TODO

#### `public static Expression max(Expression... es)`

- Description: TODO

#### `public static Expression col4(java.awt.Color c)`

- Description: TODO

#### `public static Expression col3(java.awt.Color c)`

- Description: TODO

#### `public static Expression col4(haven.FColor c)`

- Description: TODO

#### `public static Expression col3(haven.FColor c)`

- Description: TODO

#### `public static Expression vec2(haven.Coord c)`

- Description: TODO

#### `public static Expression vec3(haven.Coord3f c)`

- Description: TODO

#### `public static Expression vec2(double a, double b)`

- Description: TODO

#### `public static Expression vec3(double a, double b, double c)`

- Description: TODO

#### `public static Expression vec4(double a, double b, double c, double d)`

- Description: TODO

#### `public static Expression ivec2(haven.Coord c)`

- Description: TODO

#### `public static Expression ivec2(int a, int b)`

- Description: TODO

#### `public static Expression ivec3(int a, int b, int c)`

- Description: TODO

#### `public static Expression ivec4(int a, int b, int c, int d)`

- Description: TODO

#### `public static Expression uvec2(haven.Coord c)`

- Description: TODO

#### `public static Expression uvec2(int a, int b)`

- Description: TODO

#### `public static Expression uvec3(int a, int b, int c)`

- Description: TODO

#### `public static Expression uvec4(int a, int b, int c, int d)`

- Description: TODO

#### `public static <T> T id(T a)`

- Description: TODO
