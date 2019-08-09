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

#### Guards (conditional statements)

ForteLang doesn't have `if ... else` statements, instead it has guards:

```
max = x -> y ->
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

#### Enums

```
myEnum = {| ENUM_ITEM, OTHER_ENUM_ITEM |};

matchExample = x -> match x
	| myEnum.ENUM_ITEM ->> true
	| myEnum.OTHER_ENUM_ITEM ->> false
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
}.exampleItem
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

