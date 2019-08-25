# ForteLang

TODO:

- Evaluatable object equivalence
- Fix closures
- Create standard library
- Impurity checks

# The bug:

```
head (std.map (a:num -> b:num -> a + b) [1, 2, 3]) 45
```

This evaluates to the function b -> a + b

WHICH IT SHOULDN'T.

It should evaluate to the *closure* of (b -> a + b)

Because if it evaluates to the function, all information about `a` is lost

If it evaluates to the closure, it include the information about a

Closure basically is an object consisting of an environment and an expression