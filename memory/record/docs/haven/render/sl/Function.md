---
source: [Function.java](../../../../../../src/haven/render/sl/Function.java)
created: 2026-06-13
updated: 2026-06-14
---

# Function

Represents the function shader-language AST node.

## Nested Types

### Builtin
Builtin shader-call node that models GLSL built-in functions and predeclares their parameters.

#### Members

##### Constants

#### `public static final Builtin sin = new Builtin(null, new Symbol.Fix("sin"), 1)`
- Role: Defines the `sin` builtin.
- Description: Predeclares a one-argument floating-point function.

#### `public static final Builtin cos = new Builtin(null, new Symbol.Fix("cos"), 1)`
- Role: Defines the `cos` builtin.
- Description: Predeclares a one-argument floating-point function.

#### `public static final Builtin texture = new Builtin(Type.VEC4, new Symbol.Fix("texture"), 2)`
- Role: Defines the `texture` builtin.
- Description: Predeclares the sampler lookup entry point used by texture helpers.

##### Fields

#### `private final Type type`
- Role: Stores the builtin return type.
- Description: `null` means the type is resolved by context or inferred from usage.

##### Methods

#### `public Builtin(Type type, Symbol name, int nargs)`
- Role: Builds a builtin function definition.
- Description: Registers the builtin name and creates its parameter list.

#### `public Type type(Expression... params)`
- Role: Returns the builtin result type.
- Description: Reports the declared return type for the builtin call.

### Call
Call expression node that writes `name(arg1, arg2, ...)`.

#### Members

##### Fields

#### `private final Expression[] params`
- Role: Stores the call arguments.
- Description: Walked and emitted in order.

##### Methods

#### `private Call(Expression... params)`
- Role: Builds a function-call expression.
- Description: Stores the supplied argument list for later emission.

#### `public void walk(Walker w)`
- Role: Visits each call argument.
- Description: Walks the argument expressions in source order.

#### `public void output(Output out)`
- Role: Emits the function-call syntax.
- Description: Writes the function name and comma-separated argument list.

#### `public Function fun()`
- Role: Returns the owning function.
- Description: Lets callers recover the function definition behind the call node.

### Def
User-defined function definition node with a body block and prototype emission support.

#### Members

##### Fields

#### `public final Type type`
- Role: Stores the function return type.
- Description: Used when generating the prototype.

#### `public final Block code`
- Role: Stores the function body.
- Description: Contains the emitted statements for this function.

##### Methods

#### `public Def(Type type, Symbol name)`
- Role: Builds a named function definition.
- Description: Creates an empty body block for later code insertion.

#### `public Def(Type type, String prefix)`
- Role: Builds a function with a generated name.
- Description: Uses the prefix to generate a unique symbol.

#### `public Def(Type type)`
- Role: Builds a function with an anonymous generated name.
- Description: Uses an auto-generated symbol.

#### `protected void cons()`
- Role: Prepares one-time definition data before emission.
- Description: Hook for subclasses to append declarations before emission.

#### `public void define(final Context ctx)`
- Role: Registers the function body into the current context.
- Description: Ensures the prototype and definition are emitted once.

#### `public void prototype(Output out)`
- Role: Emits the function prototype.
- Description: Writes the return type, name, and parameter list.

#### `public Type type(Expression... params)`
- Role: Returns the function result type.
- Description: Reports the declared return type for the definition.

#### `public void code(Statement stmt)`
- Role: Appends a statement to the body.
- Description: Adds one statement to the function block.

#### `public void code(Expression expr)`
- Role: Appends an expression statement to the body.
- Description: Wraps the expression as a statement before adding it.

### Definition
Emits the full function definition as a top-level declaration.

#### Members

##### Methods

#### `public void walk(Walker w)`
- Role: Visits the function body.
- Description: Walks the function block for dependency discovery.

#### `public void output(Output out)`
- Role: Emits the full definition.
- Description: Writes the prototype followed by the body block.

#### `private Def fun()`
- Role: Returns the enclosing definition.
- Description: Lets the enclosing `Def` detect whether this top-level node already exists.

### PDir
Parameter direction enum for function arguments.

### Parameter
Function parameter declaration that records direction, type, and name.

#### Members

##### Fields

#### `public final PDir dir`
- Role: Stores the parameter direction.
- Description: Distinguishes `in`, `out`, and `inout` parameters.

##### Methods

#### `private Parameter(PDir dir, Type type, Symbol name)`
- Role: Builds a function parameter.
- Description: Stores the direction, type, and name for one argument.

## Members

### Constants

#### `public static final Builtin sin = new Builtin(null, new Symbol.Fix("sin"), 1)`
- Role: Defines the shared `sin` builtin.
- Description: Shared builtin function node for the sine call.
- Value: `new Builtin(null, new Symbol.Fix("sin"), 1)`

#### `public static final Builtin cos = new Builtin(null, new Symbol.Fix("cos"), 1)`
- Role: Defines the shared `cos` builtin.
- Description: Shared builtin function node for the cosine call.
- Value: `new Builtin(null, new Symbol.Fix("cos"), 1)`

#### `public static final Builtin tan = new Builtin(null, new Symbol.Fix("tan"), 1)`
- Role: Defines the shared `tan` builtin.
- Description: Shared builtin function node for the tangent call.
- Value: `new Builtin(null, new Symbol.Fix("tan"), 1)`

#### `public static final Builtin asin = new Builtin(null, new Symbol.Fix("asin"), 1)`
- Role: Defines the shared `asin` builtin.
- Description: Shared builtin function node for the arc-sine call.
- Value: `new Builtin(null, new Symbol.Fix("asin"), 1)`

#### `public static final Builtin acos = new Builtin(null, new Symbol.Fix("acos"), 1)`
- Role: Defines the shared `acos` builtin.
- Description: Shared builtin function node for the arc-cosine call.
- Value: `new Builtin(null, new Symbol.Fix("acos"), 1)`

#### `public static final Builtin atan = new Builtin(null, new Symbol.Fix("atan"), 1)`
- Role: Defines the shared `atan` builtin.
- Description: Shared builtin function node for the arc-tangent call.
- Value: `new Builtin(null, new Symbol.Fix("atan"), 1)`

#### `public static final Builtin pow = new Builtin(null, new Symbol.Fix("pow"), 2)`
- Role: Defines the shared `pow` builtin.
- Description: Shared builtin function node for exponentiation.
- Value: `new Builtin(null, new Symbol.Fix("pow"), 2)`

#### `public static final Builtin exp = new Builtin(null, new Symbol.Fix("exp"), 1)`
- Role: Defines the shared `exp` builtin.
- Description: Shared builtin function node for the exponential call.
- Value: `new Builtin(null, new Symbol.Fix("exp"), 1)`

#### `public static final Builtin log = new Builtin(null, new Symbol.Fix("log"), 1)`
- Role: Defines the shared `log` builtin.
- Description: Shared builtin function node for the logarithm call.
- Value: `new Builtin(null, new Symbol.Fix("log"), 1)`

#### `public static final Builtin exp2 = new Builtin(null, new Symbol.Fix("exp2"), 1)`
- Role: Defines the shared `exp2` builtin.
- Description: Shared builtin function node for the base-2 exponential call.
- Value: `new Builtin(null, new Symbol.Fix("exp2"), 1)`

#### `public static final Builtin log2 = new Builtin(null, new Symbol.Fix("log2"), 1)`
- Role: Defines the shared `log2` builtin.
- Description: Shared builtin function node for the base-2 logarithm call.
- Value: `new Builtin(null, new Symbol.Fix("log2"), 1)`

#### `public static final Builtin sqrt = new Builtin(null, new Symbol.Fix("sqrt"), 1)`
- Role: Defines the shared `sqrt` builtin.
- Description: Shared builtin function node for the square-root call.
- Value: `new Builtin(null, new Symbol.Fix("sqrt"), 1)`

#### `public static final Builtin inversesqrt = new Builtin(null, new Symbol.Fix("inversesqrt"), 1)`
- Role: Defines the shared `inversesqrt` builtin.
- Description: Shared builtin function node for the inverse square-root call.
- Value: `new Builtin(null, new Symbol.Fix("inversesqrt"), 1)`

#### `public static final Builtin abs = new Builtin(null, new Symbol.Fix("abs"), 1)`
- Role: Defines the shared `abs` builtin.
- Description: Shared builtin function node for the absolute-value call.
- Value: `new Builtin(null, new Symbol.Fix("abs"), 1)`

#### `public static final Builtin sign = new Builtin(null, new Symbol.Fix("sign"), 1)`
- Role: Defines the shared `sign` builtin.
- Description: Shared builtin function node for the sign call.
- Value: `new Builtin(null, new Symbol.Fix("sign"), 1)`

#### `public static final Builtin floor = new Builtin(null, new Symbol.Fix("floor"), 1)`
- Role: Defines the shared `floor` builtin.
- Description: Shared builtin function node for the floor call.
- Value: `new Builtin(null, new Symbol.Fix("floor"), 1)`

#### `public static final Builtin ceil = new Builtin(null, new Symbol.Fix("ceil"), 1)`
- Role: Defines the shared `ceil` builtin.
- Description: Shared builtin function node for the ceil call.
- Value: `new Builtin(null, new Symbol.Fix("ceil"), 1)`

#### `public static final Builtin fract = new Builtin(null, new Symbol.Fix("fract"), 1)`
- Role: Defines the shared `fract` builtin.
- Description: Shared builtin function node for the fractional-part call.
- Value: `new Builtin(null, new Symbol.Fix("fract"), 1)`

#### `public static final Builtin mod = new Builtin(null, new Symbol.Fix("mod"), 2)`
- Role: Implements the mod operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("mod"), 2)`

#### `public static final Builtin min = new Builtin(null, new Symbol.Fix("min"), 2)`
- Role: Implements the min operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("min"), 2)`

#### `public static final Builtin max = new Builtin(null, new Symbol.Fix("max"), 2)`
- Role: Implements the max operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("max"), 2)`

#### `public static final Builtin clamp = new Builtin(null, new Symbol.Fix("clamp"), 3)`
- Role: Implements the clamp operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("clamp"), 3)`

#### `public static final Builtin mix = new Builtin(null, new Symbol.Fix("mix"), 3)`
- Role: Implements the mix operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("mix"), 3)`

#### `public static final Builtin step = new Builtin(null, new Symbol.Fix("step"), 2)`
- Role: Implements the step operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("step"), 2)`

#### `public static final Builtin smoothstep = new Builtin(null, new Symbol.Fix("smoothstep"), 3)`
- Role: Implements the smoothstep operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("smoothstep"), 3)`

#### `public static final Builtin length = new Builtin(Type.FLOAT, new Symbol.Fix("length"), 1)`
- Role: Implements the length operation.
- Description: Implements the fix operation.
- Value: `new Builtin(Type.FLOAT, new Symbol.Fix("length"), 1)`

#### `public static final Builtin distance = new Builtin(Type.FLOAT, new Symbol.Fix("distance"), 2)`
- Role: Implements the distance operation.
- Description: Implements the fix operation.
- Value: `new Builtin(Type.FLOAT, new Symbol.Fix("distance"), 2)`

#### `public static final Builtin dot = new Builtin(Type.FLOAT, new Symbol.Fix("dot"), 2)`
- Role: Implements the dot operation.
- Description: Implements the fix operation.
- Value: `new Builtin(Type.FLOAT, new Symbol.Fix("dot"), 2)`

#### `public static final Builtin cross = new Builtin(Type.VEC3, new Symbol.Fix("cross"), 2)`
- Role: Implements the cross operation.
- Description: Implements the fix operation.
- Value: `new Builtin(Type.VEC3, new Symbol.Fix("cross"), 2)`

#### `public static final Builtin normalize = new Builtin(null, new Symbol.Fix("normalize"), 1)`
- Role: Implements the normalize operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("normalize"), 1)`

#### `public static final Builtin reflect = new Builtin(null, new Symbol.Fix("reflect"), 2)`
- Role: Implements the reflect operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("reflect"), 2)`

#### `public static final Builtin transpose = new Builtin(null, new Symbol.Fix("transpose"), 1)`
- Role: Implements the transpose operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("transpose"), 1)`

#### `public static final Builtin texture = new Builtin(Type.VEC4, new Symbol.Fix("texture"), 2)`
- Role: Implements the texture operation.
- Description: Implements the fix operation.
- Value: `new Builtin(Type.VEC4, new Symbol.Fix("texture"), 2)`

#### `public static final Builtin texture2D = texture`
- Role: Caches the texture2 d value.
- Description: Caches the `texture2D` value for reuse.
- Value: `texture`

#### `public static final Builtin shadow2D = texture`
- Role: Caches the shadow2 d value.
- Description: Caches the `shadow2D` value for reuse.
- Value: `texture`

#### `public static final Builtin texture3D = texture`
- Role: Caches the texture3 d value.
- Description: Caches the `texture3D` value for reuse.
- Value: `texture`

#### `public static final Builtin textureCube = texture`
- Role: Caches the texture cube value.
- Description: Caches the `textureCube` value for reuse.
- Value: `texture`

#### `public static final Builtin texelFetch = new Builtin(Type.VEC4, new Symbol.Fix("texelFetch"), 3)`
- Role: Implements the texel fetch operation.
- Description: Implements the fix operation.
- Value: `new Builtin(Type.VEC4, new Symbol.Fix("texelFetch"), 3)`

#### `public static final Builtin textureSize = new Builtin(null, new Symbol.Fix("textureSize"), 2)`
- Role: Implements the texture size operation.
- Description: Implements the fix operation.
- Value: `new Builtin(null, new Symbol.Fix("textureSize"), 2)`

### Fields

#### `public final Symbol name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final List<Parameter> pars = new LinkedList<Parameter>()`
- Role: Implements the pars operation.
- Description: Implements the public final list<parameter> pars = new linked list<parameter>() operation.

#### `private final Expression[] params`
- Role: Caches the params value.
- Description: Caches the `params` value for reuse.

#### `public final Type type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

#### `public final Block code`
- Role: Caches the code value.
- Description: Caches the `code` value for reuse.

#### `private boolean fin = false`
- Role: Tracks the fin flag.
- Description: Implements the fin operation for this node.

#### `private final Type type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

#### `public final PDir dir`
- Role: Caches the dir value.
- Description: Caches the `dir` value for reuse.

### Methods

#### `public Function(Symbol name)`
- Role: Creates a new Function instance.
- Description: Constructs the Function instance from the supplied inputs.

#### `private Call(Expression... params)`
- Role: Implements call.
- Description: Implements the call operation for this node.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Implements the walk operation for this node.

#### `public void output(Output out)`
- Role: Implements output.
- Description: Implements the output operation for this node.

#### `public Function fun()`
- Role: Implements fun.
- Description: Implements the fun operation for this node.

#### `public Expression call(Expression... params)`
- Role: Implements call.
- Description: Implements the call operation for this node.

#### `public Def(Type type, Symbol name)`
- Role: Implements def.
- Description: Implements the def operation for this node.

#### `public Def(Type type, String prefix)`
- Role: Implements def.
- Description: Implements the def operation for this node.

#### `public Def(Type type)`
- Role: Implements def.
- Description: Implements the def operation for this node.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Implements the walk operation for this node.

#### `public void output(Output out)`
- Role: Implements output.
- Description: Implements the output operation for this node.

#### `private Def fun()`
- Role: Implements fun.
- Description: Implements the fun operation for this node.

#### `protected void cons()`
- Role: Implements cons.
- Description: Implements the cons operation for this node.

#### `public void define(final Context ctx)`
- Role: Implements define.
- Description: Implements the define operation for this node.

#### `public void prototype(Output out)`
- Role: Implements prototype.
- Description: Implements the prototype operation for this node.

#### `public Type type(Expression... params)`
- Role: Implements type.
- Description: Implements the type operation for this node.

#### `public void code(Statement stmt)`
- Role: Implements code.
- Description: Implements the code operation for this node.

#### `public void code(Expression expr)`
- Role: Implements code.
- Description: Implements the code operation for this node.

#### `public Builtin(Type type, Symbol name, int nargs)`
- Role: Implements builtin.
- Description: Implements the builtin operation for this node.

#### `public Type type(Expression... params)`
- Role: Implements type.
- Description: Implements the type operation for this node.

#### `private Parameter(PDir dir, Type type, Symbol name)`
- Role: Implements parameter.
- Description: Implements the parameter operation for this node.

#### `public Parameter param(PDir dir, Type type, Symbol name)`
- Role: Implements param.
- Description: Implements the param operation for this node.

#### `public Parameter param(PDir dir, Type type, String prefix)`
- Role: Implements param.
- Description: Implements the param operation for this node.

#### `public Parameter param(PDir dir, Type type)`
- Role: Implements param.
- Description: Implements the param operation for this node.

#### `public Function param1(PDir dir, Type type)`
- Role: Implements param1.
- Description: Implements the param1 operation for this node.

#### `void ckparams(Expression... params)`
- Role: Implements ckparams.
- Description: Implements the ckparams operation for this node.

#### `public abstract Type type(Expression... params)`
- Role: Implements type.
- Description: Implements the type operation for this node.