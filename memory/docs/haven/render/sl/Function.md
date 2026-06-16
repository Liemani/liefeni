# Function

This file documents the responsibilities and members of `Function`.

## Meta

- Source: [Function.java](../../../../../src/haven/render/sl/Function.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the function shader-language AST node.

## Nested Types

### Builtin

- Role: Represents builtin within Function.
- Description: Describes the nested builtin type used by the enclosing class.

### Call

- Role: Represents call within Function.
- Description: Describes the nested call type used by the enclosing class.

### Def

- Role: Represents def within Function.
- Description: Describes the nested def type used by the enclosing class.

### Definition

- Role: Represents definition within Function.
- Description: Describes the nested definition type used by the enclosing class.

### PDir

- Role: Represents pdir within Function.
- Description: Describes the nested pdir type used by the enclosing class.

### Parameter

- Role: Represents parameter within Function.
- Description: Describes the nested parameter type used by the enclosing class.

## Members

### Constants

#### `public static final Builtin sin = new Builtin(null, new Symbol.Fix("sin"), 1)`
- Role: Defines the shared sin constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin cos = new Builtin(null, new Symbol.Fix("cos"), 1)`
- Role: Defines the shared cos constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin tan = new Builtin(null, new Symbol.Fix("tan"), 1)`
- Role: Defines the shared tan constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin asin = new Builtin(null, new Symbol.Fix("asin"), 1)`
- Role: Defines the shared asin constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin acos = new Builtin(null, new Symbol.Fix("acos"), 1)`
- Role: Defines the shared acos constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin atan = new Builtin(null, new Symbol.Fix("atan"), 1)`
- Role: Defines the shared atan constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin pow = new Builtin(null, new Symbol.Fix("pow"), 2)`
- Role: Defines the shared pow constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin exp = new Builtin(null, new Symbol.Fix("exp"), 1)`
- Role: Defines the shared exp constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin log = new Builtin(null, new Symbol.Fix("log"), 1)`
- Role: Defines the shared log constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin exp2 = new Builtin(null, new Symbol.Fix("exp2"), 1)`
- Role: Defines the shared exp2 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin log2 = new Builtin(null, new Symbol.Fix("log2"), 1)`
- Role: Defines the shared log2 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin sqrt = new Builtin(null, new Symbol.Fix("sqrt"), 1)`
- Role: Defines the shared sqrt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin inversesqrt = new Builtin(null, new Symbol.Fix("inversesqrt"), 1)`
- Role: Defines the shared inversesqrt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin abs = new Builtin(null, new Symbol.Fix("abs"), 1)`
- Role: Defines the shared abs constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin sign = new Builtin(null, new Symbol.Fix("sign"), 1)`
- Role: Defines the shared sign constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin floor = new Builtin(null, new Symbol.Fix("floor"), 1)`
- Role: Defines the shared floor constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin ceil = new Builtin(null, new Symbol.Fix("ceil"), 1)`
- Role: Defines the shared ceil constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin fract = new Builtin(null, new Symbol.Fix("fract"), 1)`
- Role: Defines the shared fract constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin mod = new Builtin(null, new Symbol.Fix("mod"), 2)`
- Role: Defines the shared mod constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin min = new Builtin(null, new Symbol.Fix("min"), 2)`
- Role: Defines the shared min constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin max = new Builtin(null, new Symbol.Fix("max"), 2)`
- Role: Defines the shared max constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin clamp = new Builtin(null, new Symbol.Fix("clamp"), 3)`
- Role: Defines the shared clamp constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin mix = new Builtin(null, new Symbol.Fix("mix"), 3)`
- Role: Defines the shared mix constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin step = new Builtin(null, new Symbol.Fix("step"), 2)`
- Role: Defines the shared step constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin smoothstep = new Builtin(null, new Symbol.Fix("smoothstep"), 3)`
- Role: Defines the shared smoothstep constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin length = new Builtin(Type.FLOAT, new Symbol.Fix("length"), 1)`
- Role: Defines the shared length constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin distance = new Builtin(Type.FLOAT, new Symbol.Fix("distance"), 2)`
- Role: Defines the shared distance constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin dot = new Builtin(Type.FLOAT, new Symbol.Fix("dot"), 2)`
- Role: Defines the shared dot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin cross = new Builtin(Type.VEC3, new Symbol.Fix("cross"), 2)`
- Role: Defines the shared cross constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin normalize = new Builtin(null, new Symbol.Fix("normalize"), 1)`
- Role: Defines the shared normalize constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin reflect = new Builtin(null, new Symbol.Fix("reflect"), 2)`
- Role: Defines the shared reflect constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin transpose = new Builtin(null, new Symbol.Fix("transpose"), 1)`
- Role: Defines the shared transpose constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin texture = new Builtin(Type.VEC4, new Symbol.Fix("texture"), 2)`
- Role: Defines the shared texture constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin texture2D = texture`
- Role: Defines the shared texture2 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin shadow2D = texture`
- Role: Defines the shared shadow2 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin texture3D = texture`
- Role: Defines the shared texture3 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin textureCube = texture`
- Role: Defines the shared texture cube constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin texelFetch = new Builtin(Type.VEC4, new Symbol.Fix("texelFetch"), 3)`
- Role: Defines the shared texel fetch constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Builtin textureSize = new Builtin(null, new Symbol.Fix("textureSize"), 2)`
- Role: Defines the shared texture size constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Symbol name`
- Role: Holds the name state.
- Description: Backs the cached state for this file.

#### `public final List<Parameter> pars = new LinkedList<Parameter>()`
- Role: Caches pars entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Expression[] params`
- Role: Holds the params state.
- Description: Backs the cached state for this file.

#### `public final Type type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final Block code`
- Role: Holds the code state.
- Description: Backs the cached state for this file.

#### `private boolean fin = false`
- Role: Tracks the fin flag.
- Description: Supports the fin operation used by the surrounding class.

#### `private final Type type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final PDir dir`
- Role: Holds the dir state.
- Description: Backs the cached state for this file.

### Methods

#### `public Function(Symbol name)`
- Role: Creates a new Function instance.
- Description: Constructs the instance and initializes its default state.

#### `private Call(Expression... params)`
- Role: Performs call.
- Description: Supports the call operation used by the surrounding class.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public Function fun()`
- Role: Performs fun.
- Description: Supports the fun operation used by the surrounding class.

#### `public Expression call(Expression... params)`
- Role: Performs call.
- Description: Supports the call operation used by the surrounding class.

#### `public Def(Type type, Symbol name)`
- Role: Performs def.
- Description: Supports the def operation used by the surrounding class.

#### `public Def(Type type, String prefix)`
- Role: Performs def.
- Description: Supports the def operation used by the surrounding class.

#### `public Def(Type type)`
- Role: Performs def.
- Description: Supports the def operation used by the surrounding class.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `private Def fun()`
- Role: Performs fun.
- Description: Supports the fun operation used by the surrounding class.

#### `protected void cons()`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void define(final Context ctx)`
- Role: Performs define.
- Description: Supports the define operation used by the surrounding class.

#### `public void prototype(Output out)`
- Role: Performs prototype.
- Description: Supports the prototype operation used by the surrounding class.

#### `public Type type(Expression... params)`
- Role: Performs type.
- Description: Supports the type operation used by the surrounding class.

#### `public void code(Statement stmt)`
- Role: Performs code.
- Description: Supports the code operation used by the surrounding class.

#### `public void code(Expression expr)`
- Role: Performs code.
- Description: Supports the code operation used by the surrounding class.

#### `public Builtin(Type type, Symbol name, int nargs)`
- Role: Performs builtin.
- Description: Supports the builtin operation used by the surrounding class.

#### `public Type type(Expression... params)`
- Role: Performs type.
- Description: Supports the type operation used by the surrounding class.

#### `private Parameter(PDir dir, Type type, Symbol name)`
- Role: Performs parameter.
- Description: Supports the parameter operation used by the surrounding class.

#### `public Parameter param(PDir dir, Type type, Symbol name)`
- Role: Performs param.
- Description: Supports the param operation used by the surrounding class.

#### `public Parameter param(PDir dir, Type type, String prefix)`
- Role: Performs param.
- Description: Supports the param operation used by the surrounding class.

#### `public Parameter param(PDir dir, Type type)`
- Role: Performs param.
- Description: Supports the param operation used by the surrounding class.

#### `public Function param1(PDir dir, Type type)`
- Role: Performs param1.
- Description: Supports the param1 operation used by the surrounding class.

#### `void ckparams(Expression... params)`
- Role: Performs ckparams.
- Description: Supports the ckparams operation used by the surrounding class.

#### `public abstract Type type(Expression... params)`
- Role: Performs type.
- Description: Supports the type operation used by the surrounding class.
