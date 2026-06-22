---
source: [Cons.java](../../../../../../src/haven/render/sl/Cons.java)
created: 2026-06-13
updated: 2026-06-14
---

# Cons

Represents the cons shader-language AST node.

## Members

### Constants

#### `public static final UnaryOperator<Expression> idm = in -> in`
- Role: Identity mapper for expressions.
- Description: Returns the input expression unchanged.
- Value: `in -> in`

### Fields

### Methods

#### `public static Statement stmt(Expression e)`
- Role: Wraps an expression as a statement.
- Description: Returns the statement form of the given expression.

#### `public static LBinOp.Assign ass(LValue l, Expression r)`
- Role: Builds an assignment.
- Description: Creates a simple assignment expression.

#### `public static LBinOp.Assign ass(Variable l, Expression r)`
- Role: Builds an assignment.
- Description: Creates a simple assignment expression for a variable.

#### `public static Add add(Expression... terms)`
- Role: Builds an addition expression.
- Description: Combines expressions with `+`.

#### `public static Mul mul(Expression... terms)`
- Role: Builds a multiplication expression.
- Description: Combines expressions with `*`.

#### `public static BinOp.Sub sub(Expression l, Expression r)`
- Role: Builds a subtraction expression.
- Description: Combines two expressions with `-`.

#### `public static BinOp.Div div(Expression l, Expression r)`
- Role: Builds a division expression.
- Description: Combines two expressions with `/`.

#### `public static LBinOp.AAdd aadd(LValue l, Expression r)`
- Role: Builds an additive assignment.
- Description: Produces `l += r` in the shader AST.

#### `public static LBinOp.ASub asub(LValue l, Expression r)`
- Role: Builds a subtractive assignment.
- Description: Produces `l -= r` in the shader AST.

#### `public static LBinOp.AMul amul(LValue l, Expression r)`
- Role: Builds a multiplicative assignment.
- Description: Produces `l *= r` in the shader AST.

#### `public static LBinOp.ADiv adiv(LValue l, Expression r)`
- Role: Builds a divisive assignment.
- Description: Produces `l /= r` in the shader AST.

#### `public static BinOp.Div inv(Expression op)`
- Role: Builds a reciprocal expression.
- Description: Produces `1.0 / op`.

#### `public static PreOp.Neg neg(Expression op)`
- Role: Builds a unary negation.
- Description: Produces `-op`.

#### `public static LPreOp.Inc incl(LValue op)`
- Role: Builds a prefix increment.
- Description: Produces `++op`.

#### `public static LPreOp.Dec decl(LValue op)`
- Role: Builds a prefix decrement.
- Description: Produces `--op`.

#### `public static LPostOp.Inc linc(LValue op)`
- Role: Builds a postfix increment.
- Description: Produces `op++`.

#### `public static LPostOp.Dec ldec(LValue op)`
- Role: Builds a postfix decrement.
- Description: Produces `op--`.

#### `public static BinOp.Eq eq(Expression l, Expression r)`
- Role: Builds an equality comparison.
- Description: Produces `l == r`.

#### `public static BinOp.Ne ne(Expression l, Expression r)`
- Role: Builds an inequality comparison.
- Description: Produces `l != r`.

#### `public static BinOp.Lt lt(Expression l, Expression r)`
- Role: Builds a less-than comparison.
- Description: Produces `l < r`.

#### `public static BinOp.Gt gt(Expression l, Expression r)`
- Role: Builds a greater-than comparison.
- Description: Produces `l > r`.

#### `public static BinOp.Le le(Expression l, Expression r)`
- Role: Builds a less-than-or-equal comparison.
- Description: Produces `l <= r`.

#### `public static BinOp.Ge ge(Expression l, Expression r)`
- Role: Builds a greater-than-or-equal comparison.
- Description: Produces `l >= r`.

#### `public static BinOp.Or or(Expression l, Expression r)`
- Role: Builds a logical-or expression.
- Description: Produces `l || r`.

#### `public static BinOp.And and(Expression l, Expression r)`
- Role: Builds a logical-and expression.
- Description: Produces `l && r`.

#### `public static BinOp.BitOr bitor(Expression l, Expression r)`
- Role: Builds a bitwise-or expression.
- Description: Produces `l | r`.

#### `public static BinOp.BitAnd bitand(Expression l, Expression r)`
- Role: Builds a bitwise-and expression.
- Description: Produces `l & r`.

#### `public static BinOp.LShift lshift(Expression l, Expression r)`
- Role: Builds a left-shift expression.
- Description: Produces `l << r`.

#### `public static BinOp.RShift rshift(Expression l, Expression r)`
- Role: Builds a right-shift expression.
- Description: Produces `l >> r`.

#### `public static LPick pick(LValue val, String el)`
- Role: Builds a writable field or array selection.
- Description: Produces an lvalue access for the selected element.

#### `public static Pick pick(Expression val, String el)`
- Role: Builds a read-only field or array selection.
- Description: Produces an rvalue access for the selected element.

#### `public static LFieldRef fref(LValue val, String el)`
- Role: Builds a writable field reference.
- Description: Produces a field access that can appear on the left-hand side.

#### `public static FieldRef fref(Expression val, String el)`
- Role: Builds a read-only field reference.
- Description: Produces a field access used as an expression.

#### `public static Index idx(Expression val, Expression idx)`
- Role: Builds an index expression.
- Description: Produces `val[idx]`.

#### `public static IntLiteral l(int val)`
- Role: Builds an integer literal.
- Description: Wraps a Java `int` as a shader integer constant.

#### `public static UIntLiteral ul(int val)`
- Role: Builds an unsigned integer literal.
- Description: Wraps a Java `int` as a shader unsigned constant.

#### `public static FloatLiteral l(double val)`
- Role: Builds a floating-point literal.
- Description: Wraps a Java `double` as a shader float constant.

#### `public static Vec4Cons vec4(Expression... els)`
- Role: Builds a four-component vector constructor.
- Description: Assembles a `vec4(...)` expression.

#### `public static Vec3Cons vec3(Expression... els)`
- Role: Builds a three-component vector constructor.
- Description: Assembles a `vec3(...)` expression.

#### `public static Vec2Cons vec2(Expression... els)`
- Role: Builds a two-component vector constructor.
- Description: Assembles a `vec2(...)` expression.

#### `public static FloatCons floatcons(Expression init)`
- Role: Builds a float constructor.
- Description: Converts a scalar expression into float form.

#### `public static IVec4Cons ivec4(Expression... els)`
- Role: Builds a four-component integer vector constructor.
- Description: Assembles an `ivec4(...)` expression.

#### `public static IVec3Cons ivec3(Expression... els)`
- Role: Builds a three-component integer vector constructor.
- Description: Assembles an `ivec3(...)` expression.

#### `public static IVec2Cons ivec2(Expression... els)`
- Role: Builds a two-component integer vector constructor.
- Description: Assembles an `ivec2(...)` expression.

#### `public static IntCons intcons(Expression init)`
- Role: Builds an int constructor.
- Description: Converts an expression into integer form.

#### `public static UVec4Cons uvec4(Expression... els)`
- Role: Builds a four-component unsigned vector constructor.
- Description: Assembles a `uvec4(...)` expression.

#### `public static UVec3Cons uvec3(Expression... els)`
- Role: Builds a three-component unsigned vector constructor.
- Description: Assembles a `uvec3(...)` expression.

#### `public static UVec2Cons uvec2(Expression... els)`
- Role: Builds a two-component unsigned vector constructor.
- Description: Assembles a `uvec2(...)` expression.

#### `public static UIntCons uintcons(Expression init)`
- Role: Builds a uint constructor.
- Description: Converts an expression into unsigned integer form.

#### `public static Mat3Cons mat3(Expression... els)`
- Role: Builds a 3x3 matrix constructor.
- Description: Assembles a `mat3(...)` expression.

#### `public static Expression sin(Expression x)`
- Role: Builds a sine expression.
- Description: Emits the shader `sin` call.

#### `public static Expression abs(Expression x)`
- Role: Builds an absolute-value expression.
- Description: Emits the shader `abs` call.

#### `public static Expression sign(Expression x)`
- Role: Builds a sign expression.
- Description: Emits the shader `sign` call.

#### `public static Expression floor(Expression x)`
- Role: Builds a floor expression.
- Description: Emits the shader `floor` call.

#### `public static Expression ceil(Expression x)`
- Role: Builds a ceil expression.
- Description: Emits the shader `ceil` call.

#### `public static Expression fract(Expression x)`
- Role: Builds a fractional-part expression.
- Description: Emits the shader `fract` call.

#### `public static Expression mod(Expression x, Expression y)`
- Role: Builds a modulus expression.
- Description: Emits the shader `mod` call.

#### `public static Expression length(Expression x)`
- Role: Builds a length expression.
- Description: Emits the shader `length` call.

#### `public static Expression normalize(Expression x)`
- Role: Builds a normalization expression.
- Description: Emits the shader `normalize` call.

#### `public static Expression distance(Expression x, Expression y)`
- Role: Returns the distance from the local player.
- Description: Measures the distance from the current local player position.

#### `public static Expression dot(Expression x, Expression y)`
- Role: Builds a dot-product expression.
- Description: Emits the shader `dot` call.

#### `public static Expression pow(Expression x, Expression y)`
- Role: Builds an exponentiation expression.
- Description: Emits the shader `pow` call.

#### `public static Expression exp(Expression x)`
- Role: Builds an exponential expression.
- Description: Emits the shader `exp` call.

#### `public static Expression log(Expression x)`
- Role: Builds a natural-log expression.
- Description: Emits the shader `log` call.

#### `public static Expression exp2(Expression x)`
- Role: Builds a base-2 exponential expression.
- Description: Emits the shader `exp2` call.

#### `public static Expression log2(Expression x)`
- Role: Builds a base-2 logarithm expression.
- Description: Emits the shader `log2` call.

#### `public static Expression sqrt(Expression x)`
- Role: Builds a square-root expression.
- Description: Emits the shader `sqrt` call.

#### `public static Expression inversesqrt(Expression x)`
- Role: Builds an inverse-square-root expression.
- Description: Emits the shader `inversesqrt` call.

#### `public static Expression cross(Expression x, Expression y)`
- Role: Builds a cross-product expression.
- Description: Emits the shader `cross` call.

#### `public static Expression reflect(Expression x, Expression y)`
- Role: Builds a reflection-vector expression.
- Description: Emits the shader `reflect` call.

#### `public static Expression texture2D(Expression s, Expression c)`
- Role: Builds a 2D texture lookup expression.
- Description: Emits the shader `texture2D` call.

#### `public static Expression shadow2D(Expression s, Expression c)`
- Role: Builds a 2D shadow lookup expression.
- Description: Emits the shader `shadow2D` call.

#### `public static Expression texture3D(Expression s, Expression c)`
- Role: Builds a 3D texture lookup expression.
- Description: Emits the shader `texture3D` call.

#### `public static Expression textureCube(Expression s, Expression c)`
- Role: Builds a cube-map texture lookup expression.
- Description: Emits the shader `textureCube` call.

#### `public static Expression texelFetch(Expression s, Expression c, Expression l)`
- Role: Builds a texel-fetch expression.
- Description: Emits the shader `texelFetch` call.

#### `public static Expression textureSize(Expression s, Expression lod)`
- Role: Builds a texture-size expression.
- Description: Emits the shader `textureSize` call.

#### `public static Expression mix(Expression x, Expression y, Expression a)`
- Role: Builds a mix expression.
- Description: Emits the shader `mix` call.

#### `public static Expression clamp(Expression x, Expression a, Expression b)`
- Role: Builds a clamp expression.
- Description: Emits the shader `clamp` call.

#### `public static Expression step(Expression edge, Expression x)`
- Role: Builds a step expression.
- Description: Emits the shader `step` call.

#### `public static Expression smoothstep(Expression a, Expression b, Expression x)`
- Role: Builds a smoothstep expression.
- Description: Emits the shader `smoothstep` call.

#### `public static Expression reduce(Function fun, Expression... es)`
- Role: Reduces a variadic expression list.
- Description: Folds the supplied expressions with the given builtin function.

#### `public static Expression min(Expression... es)`
- Role: Builds a minimum expression.
- Description: Emits the shader `min` call across the supplied arguments.

#### `public static Expression max(Expression... es)`
- Role: Builds a maximum expression.
- Description: Emits the shader `max` call across the supplied arguments.

#### `public static Expression col4(java.awt.Color c)`
- Role: Converts an AWT color into a vec4 expression.
- Description: Normalizes RGBA channels into shader float components.

#### `public static Expression col3(java.awt.Color c)`
- Role: Converts an AWT color into a vec3 expression.
- Description: Normalizes RGB channels into shader float components.

#### `public static Expression col4(haven.FColor c)`
- Role: Converts an FColor into a vec4 expression.
- Description: Emits the stored linear RGBA values as shader floats.

#### `public static Expression col3(haven.FColor c)`
- Role: Converts an FColor into a vec3 expression.
- Description: Emits the stored linear RGB values as shader floats.

#### `public static Expression vec2(haven.Coord c)`
- Role: Converts a Coord into a vec2 expression.
- Description: Emits the coordinate's x/y values as shader floats.

#### `public static Expression vec3(haven.Coord3f c)`
- Role: Converts a Coord3f into a vec3 expression.
- Description: Emits the coordinate's x/y/z values as shader floats.

#### `public static Expression vec2(double a, double b)`
- Role: Builds a vec2 expression from doubles.
- Description: Creates a two-component float vector literal.

#### `public static Expression vec3(double a, double b, double c)`
- Role: Builds a vec3 expression from doubles.
- Description: Creates a three-component float vector literal.

#### `public static Expression vec4(double a, double b, double c, double d)`
- Role: Builds a vec4 expression from doubles.
- Description: Creates a four-component float vector literal.

#### `public static Expression ivec2(haven.Coord c)`
- Role: Converts a Coord into an ivec2 expression.
- Description: Emits the coordinate's x/y values as shader integers.

#### `public static Expression ivec2(int a, int b)`
- Role: Builds an ivec2 expression from ints.
- Description: Creates a two-component integer vector literal.

#### `public static Expression ivec3(int a, int b, int c)`
- Role: Builds an ivec3 expression from ints.
- Description: Creates a three-component integer vector literal.

#### `public static Expression ivec4(int a, int b, int c, int d)`
- Role: Builds an ivec4 expression from ints.
- Description: Creates a four-component integer vector literal.

#### `public static Expression uvec2(haven.Coord c)`
- Role: Converts a Coord into a uvec2 expression.
- Description: Emits the coordinate's x/y values as unsigned integers.

#### `public static Expression uvec2(int a, int b)`
- Role: Builds a uvec2 expression from ints.
- Description: Creates a two-component unsigned vector literal.

#### `public static Expression uvec3(int a, int b, int c)`
- Role: Builds a uvec3 expression from ints.
- Description: Creates a three-component unsigned vector literal.

#### `public static Expression uvec4(int a, int b, int c, int d)`
- Role: Builds a uvec4 expression from ints.
- Description: Creates a four-component unsigned vector literal.

#### `public static <T> T id(T a)`
- Role: Returns the input unchanged.
- Description: Identity helper for generic values.
