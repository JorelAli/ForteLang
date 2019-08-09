# ForteLang

- Functional
- Pure

## Syntax

The syntax for ForteLang is as follows:

#### Lambdas

Lambdas are declared with the `->` operator which indicates a binding from left to right. Lambdas are also curried, meaning that the following:

```
x -> y -> x + y
```

can be represented as:

```
x -> (y -> x + y)
```

####Function calls

Function calls are performed by stating the name of the function, followed by its parameters:

```
myFunction 2 4
```

#### Local function declaration

Function declaration is handled using the `include ... in` structure. Declarations must by stated within a pair of curly brackets, include an `=` symbol after the function name and end with a `;` to finalize its declaration. Function names cannot consist of only capital letters.

```
include {
    add = x -> y -> x + y;
} in add 2 4
```

#### List declaration

Lists use square brackets, with elements separated by commas:

```
myList = [2, 3, (x -> y -> x + y), "hello"]
```

#### Strings

Strings are denoted by double quotes:

```
"hello"
```

They are also multi-line compatible:

```
"hello
this is a
multi-lined
string"
```

To enter a double quote in a string, it must be escaped with a backslash:

```
"String with a \"quote\" inside it"
```