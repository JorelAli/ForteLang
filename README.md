# ForteLang

ForteLang is a functionally pure dynamically typed programming language. It's based off of the Nix programming language, with inspirations from Haskell's guards and pattern matching capabilities. You can read about its creation in my [blog post](https://www.jorelsblog.co.uk/Making-A-Programming-Language/).

## Etymology

ForteLang's name _(pronounced fort)_, despite being similar to Fortran, is based off of two things:

- FL Studio, the music production suite. Microsoft's Visual Studio as a similar program, VS Code. Hence, ForteLang (FL), produces FL Code _(hence the file type, `.fl`)_.
- The Japanese name for a character from one of my favourite childhood games is called Forte.

## Recommended font

ForteLang was designed for use of the [Fira Code font](https://github.com/tonsky/FiraCode), with its elegant ligatures. I'd recommend using ForteLang with Fira Code to help with code readability.

## Usage

To evaluate a ForteLang program, run `java ForteLang <file>`

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

#### Function calls

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

#### Guards (conditional statements)

ForteLang doesn't have `if ... else` statements, instead it has guards, which begin with the `|>` operator. Each statement is composed of the guard symbol `|`, a predicate (boolean result) followed by the double arrow `->>` and a resulting expression.

```
max = x -> y -> |>
	| x > y ->> x
	| ->> y;
```

This is equivalent to the pseudocode:

```
max = x -> y -> 
	if (x > y):
		return x;
	else:
		return y;
```

#### Comments

ForteLang has single line comments:

```
max = x -> y ->
	| x > y ->> x
	| ->> y; # Note this semicolon which is the end of a function declaration
```

And block comments:

```
### max :: int -> int -> int
This function determines which 
of two parameters is the largest
number ###

max = x -> y -> 
	| x > y ->> x
	| ->> y;
```

#### Matching (Basic pattern matching)

ForteLang can do basic pattern matching using the `match` keyword

```
isTrue = x -> match x
	| true ->> true
	| ->> false
```

Pattern matching allows you to match any expression to any other expression, for example with lists:

```
isEmpty = list -> match list
	| [] ->> true
	| ->> false
```

Pattern matching also allows for regex (Regular Expressions) which can be pattern matched for strings. Regular expressions must be encased in single quotes, as shown:

```
isNumber = str -> match str
	| '[0-9]+' ->> true
	| ->> false
```

#### Sets

Sets are where functions can be declared. Sets can be declared as pure, meaning that all elements within the sets perform pure operations, or impure, where one or more elements perform an impure operation. Sets are declared with curly brackets.

Regular pure sets use regular syntax, as follows:

```
mySet = {
    five = 5;
    mul2 = x -> 2 * x;
    mathLibrary = import "./math.fl";
}
```

Impure sets require the `impure` keyword:

```
myImpureSet = impure {
    @impureOperation = @print "hello"
}
```

Impure set attributes names (such as `@impureOperation` in the example above) must be preceded with the `@` symbol to indicate that the function is impure. A function is impure if it calls any impure operations.

#### Set accessing

Set elements can be accessed using the `.` operator:

```
mySet = {
    exampleItem = 5;
}."exampleItem"
```

The `.` operator has the strongest binding of the order of operations, and will ignore brackets when used consecutively. For example:

```
{ 
	item1 = {
		item2 = {
			item3 = "hello";
        };
    };
}."item1".("item2"."item3")
```

returns `"hello"`, as if you had done `"item1"."item2"."item3"`. It is strongly recommended _not_ to use brackets.

Set accessing needs not have quoted strings, for example, the following is permitted and returns `2`:

```
{ a = 2; }.a
```

In addition, lambdas may also be used:

```
{ a = 2; }.((x -> x ++ "a") "")
```

Any function calls will not be evaluated, for example:

```
include {
	myFunc = "hello";
} in { hello = 2; }.myFunc
```

#### The `?` operator

The `?` operator lets you check if an element exists within a set or a list:

```
[1, 2, 3] ? 2
```

This would return true. To check for items in a set, you must use a string to identify a given key within a set:

```
{ a = 1; b = 2; } ? "a"
```

#### Importing other files

Other files can be imported using the `@import` function, which requires a String parameter:

```
someFile = @import "./blah.fl";
```

This will evaluate the imported `fl` file and assign it to an element of a set where it was declared.

For example, if we have the following file `file1.fl`:

```
5 + (@import "file2.fl")
```

And the file `file2.fl`:

```
10
```

This will evaluate to 15.

## Match vs Guards

Match and guards are both capable of performing the same task. Take the following example below which checks if a parameter `x` is empty (an empty list, set or String).

```
isEmpty = x -> match x
    | {} ->> true
    | [] ->> true
    | "" ->> true
    | ->> false;

isEmpty' = x -> |>
    | x == {} || x == [] || x == "" ->> true
    | ->> false;
```

In the first example, it uses the `match` keyword, whereas the second example uses guards. In this case, the match expression is _much_ faster than the guard statement as it has to parse each `||` operator and perform the Boolean OR, whereas the match expression is like a jump table.