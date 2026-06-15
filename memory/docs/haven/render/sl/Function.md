# Function

This file documents the responsibilities and members of `Function`.

## Meta

- Source: [Function.java](../../../../../src/haven/render/sl/Function.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a shader function.

## Nested Types

### Builtin

- Description: TODO

### Call

- Description: TODO

### Def

- Description: TODO

### Definition

- Description: TODO

### PDir

- Description: TODO

### Parameter

- Description: TODO

## Members

### Constants

#### `public static final Builtin sin = new Builtin(null, new Symbol.Fix("sin"), 1)`

- Description: TODO

#### `public static final Builtin cos = new Builtin(null, new Symbol.Fix("cos"), 1)`

- Description: TODO

#### `public static final Builtin tan = new Builtin(null, new Symbol.Fix("tan"), 1)`

- Description: TODO

#### `public static final Builtin asin = new Builtin(null, new Symbol.Fix("asin"), 1)`

- Description: TODO

#### `public static final Builtin acos = new Builtin(null, new Symbol.Fix("acos"), 1)`

- Description: TODO

#### `public static final Builtin atan = new Builtin(null, new Symbol.Fix("atan"), 1)`

- Description: TODO

#### `public static final Builtin pow = new Builtin(null, new Symbol.Fix("pow"), 2)`

- Description: TODO

#### `public static final Builtin exp = new Builtin(null, new Symbol.Fix("exp"), 1)`

- Description: TODO

#### `public static final Builtin log = new Builtin(null, new Symbol.Fix("log"), 1)`

- Description: TODO

#### `public static final Builtin exp2 = new Builtin(null, new Symbol.Fix("exp2"), 1)`

- Description: TODO

#### `public static final Builtin log2 = new Builtin(null, new Symbol.Fix("log2"), 1)`

- Description: TODO

#### `public static final Builtin sqrt = new Builtin(null, new Symbol.Fix("sqrt"), 1)`

- Description: TODO

#### `public static final Builtin inversesqrt = new Builtin(null, new Symbol.Fix("inversesqrt"), 1)`

- Description: TODO

#### `public static final Builtin abs = new Builtin(null, new Symbol.Fix("abs"), 1)`

- Description: TODO

#### `public static final Builtin sign = new Builtin(null, new Symbol.Fix("sign"), 1)`

- Description: TODO

#### `public static final Builtin floor = new Builtin(null, new Symbol.Fix("floor"), 1)`

- Description: TODO

#### `public static final Builtin ceil = new Builtin(null, new Symbol.Fix("ceil"), 1)`

- Description: TODO

#### `public static final Builtin fract = new Builtin(null, new Symbol.Fix("fract"), 1)`

- Description: TODO

#### `public static final Builtin mod = new Builtin(null, new Symbol.Fix("mod"), 2)`

- Description: TODO

#### `public static final Builtin min = new Builtin(null, new Symbol.Fix("min"), 2)`

- Description: TODO

#### `public static final Builtin max = new Builtin(null, new Symbol.Fix("max"), 2)`

- Description: TODO

#### `public static final Builtin clamp = new Builtin(null, new Symbol.Fix("clamp"), 3)`

- Description: TODO

#### `public static final Builtin mix = new Builtin(null, new Symbol.Fix("mix"), 3)`

- Description: TODO

#### `public static final Builtin step = new Builtin(null, new Symbol.Fix("step"), 2)`

- Description: TODO

#### `public static final Builtin smoothstep = new Builtin(null, new Symbol.Fix("smoothstep"), 3)`

- Description: TODO

#### `public static final Builtin length = new Builtin(Type.FLOAT, new Symbol.Fix("length"), 1)`

- Description: TODO

#### `public static final Builtin distance = new Builtin(Type.FLOAT, new Symbol.Fix("distance"), 2)`

- Description: TODO

#### `public static final Builtin dot = new Builtin(Type.FLOAT, new Symbol.Fix("dot"), 2)`

- Description: TODO

#### `public static final Builtin cross = new Builtin(Type.VEC3, new Symbol.Fix("cross"), 2)`

- Description: TODO

#### `public static final Builtin normalize = new Builtin(null, new Symbol.Fix("normalize"), 1)`

- Description: TODO

#### `public static final Builtin reflect = new Builtin(null, new Symbol.Fix("reflect"), 2)`

- Description: TODO

#### `public static final Builtin transpose = new Builtin(null, new Symbol.Fix("transpose"), 1)`

- Description: TODO

#### `public static final Builtin texture = new Builtin(Type.VEC4, new Symbol.Fix("texture"), 2)`

- Description: TODO

#### `public static final Builtin texture2D = texture`

- Description: TODO

#### `public static final Builtin shadow2D = texture`

- Description: TODO

#### `public static final Builtin texture3D = texture`

- Description: TODO

#### `public static final Builtin textureCube = texture`

- Description: TODO

#### `public static final Builtin texelFetch = new Builtin(Type.VEC4, new Symbol.Fix("texelFetch"), 3)`

- Description: TODO

#### `public static final Builtin textureSize = new Builtin(null, new Symbol.Fix("textureSize"), 2)`

- Description: TODO

### Fields

#### `public final Symbol name`

- Description: TODO

#### `public final List<Parameter> pars = new LinkedList<Parameter>()`

- Description: TODO

#### `private final Expression[] params`

- Description: TODO

#### `public final Type type`

- Description: TODO

#### `public final Block code`

- Description: TODO

#### `private boolean fin = false`

- Description: TODO

#### `private final Type type`

- Description: TODO

#### `public final PDir dir`

- Description: TODO

### Methods

#### `public Function(Symbol name)`

- Description: TODO

#### `private Call(Expression... params)`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO

#### `public Function fun()`

- Description: TODO

#### `public Expression call(Expression... params)`

- Description: TODO

#### `public Def(Type type, Symbol name)`

- Description: TODO

#### `public Def(Type type, String prefix)`

- Description: TODO

#### `public Def(Type type)`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO

#### `private Def fun()`

- Description: TODO

#### `protected void cons()`

- Description: TODO

#### `public void define(final Context ctx)`

- Description: TODO

#### `public void prototype(Output out)`

- Description: TODO

#### `public Type type(Expression... params)`

- Description: TODO

#### `public void code(Statement stmt)`

- Description: TODO

#### `public void code(Expression expr)`

- Description: TODO

#### `public Builtin(Type type, Symbol name, int nargs)`

- Description: TODO

#### `public Type type(Expression... params)`

- Description: TODO

#### `private Parameter(PDir dir, Type type, Symbol name)`

- Description: TODO

#### `public Parameter param(PDir dir, Type type, Symbol name)`

- Description: TODO

#### `public Parameter param(PDir dir, Type type, String prefix)`

- Description: TODO

#### `public Parameter param(PDir dir, Type type)`

- Description: TODO

#### `public Function param1(PDir dir, Type type)`

- Description: TODO

#### `void ckparams(Expression... params)`

- Description: TODO

#### `public abstract Type type(Expression... params)`

- Description: TODO
